package org.webrtc.voiceengine;

import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.AudioTrack;
import android.os.Build;
import java.util.Timer;
import java.util.TimerTask;
import org.webrtc.ContextUtils;
import org.webrtc.Logging;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class WebRtcAudioManager {
    private static final int BITS_PER_SAMPLE = 16;
    private static final boolean DEBUG = false;
    private static final int DEFAULT_FRAME_PER_BUFFER = 256;
    private static final String TAG = "WebRtcAudioManager";
    private static final boolean blacklistDeviceForAAudioUsage = true;
    private static boolean blacklistDeviceForOpenSLESUsage;
    private static boolean blacklistDeviceForOpenSLESUsageIsOverridden;
    private static boolean useStereoInput;
    private static boolean useStereoOutput;
    private boolean aAudio;
    private final AudioManager audioManager;
    private boolean hardwareAEC;
    private boolean hardwareAGC;
    private boolean hardwareNS;
    private boolean initialized;
    private int inputBufferSize;
    private int inputChannels;
    private boolean lowLatencyInput;
    private boolean lowLatencyOutput;
    private final long nativeAudioManager;
    private int nativeChannels;
    private int nativeSampleRate;
    private int outputBufferSize;
    private int outputChannels;
    private boolean proAudio;
    private int sampleRate;
    private final VolumeLogger volumeLogger;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    class VolumeLogger {
        private static final String THREAD_NAME = "WebRtcVolumeLevelLoggerThread";
        private static final int TIMER_PERIOD_IN_SECONDS = 30;
        /* access modifiers changed from: private */
        public final AudioManager audioManager;
        private Timer timer;

        /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
        class LogVolumeTask extends TimerTask {
            private final int maxRingVolume;
            private final int maxVoiceCallVolume;

            public LogVolumeTask(int i, int i2) {
                this.maxRingVolume = i;
                this.maxVoiceCallVolume = i2;
            }

            public void run() {
                int mode = VolumeLogger.this.audioManager.getMode();
                if (mode == 1) {
                    int streamVolume = VolumeLogger.this.audioManager.getStreamVolume(2);
                    int i = this.maxRingVolume;
                    StringBuilder sb = new StringBuilder(56);
                    sb.append("STREAM_RING stream volume: ");
                    sb.append(streamVolume);
                    sb.append(" (max=");
                    sb.append(i);
                    sb.append(")");
                    Logging.m151178a(WebRtcAudioManager.TAG, sb.toString());
                } else if (mode == 3) {
                    int streamVolume2 = VolumeLogger.this.audioManager.getStreamVolume(0);
                    int i2 = this.maxVoiceCallVolume;
                    StringBuilder sb2 = new StringBuilder(55);
                    sb2.append("VOICE_CALL stream volume: ");
                    sb2.append(streamVolume2);
                    sb2.append(" (max=");
                    sb2.append(i2);
                    sb2.append(")");
                    Logging.m151178a(WebRtcAudioManager.TAG, sb2.toString());
                }
            }
        }

        public VolumeLogger(AudioManager audioManager2) {
            this.audioManager = audioManager2;
        }

        /* access modifiers changed from: private */
        public void stop() {
            Timer timer2 = this.timer;
            if (timer2 != null) {
                timer2.cancel();
                this.timer = null;
            }
        }

        public void start() {
            Timer timer2 = new Timer(THREAD_NAME);
            this.timer = timer2;
            timer2.schedule(new LogVolumeTask(this.audioManager.getStreamMaxVolume(2), this.audioManager.getStreamMaxVolume(0)), 0, 30000);
        }
    }

    WebRtcAudioManager(long j) {
        String valueOf = String.valueOf(WebRtcAudioUtils.getThreadInfo());
        Logging.m151178a(TAG, valueOf.length() == 0 ? new String("ctor") : "ctor".concat(valueOf));
        this.nativeAudioManager = j;
        this.audioManager = (AudioManager) ContextUtils.getApplicationContext().getSystemService("audio");
        this.volumeLogger = new VolumeLogger(this.audioManager);
        storeAudioParameters();
        nativeCacheAudioParameters(this.sampleRate, this.outputChannels, this.inputChannels, this.hardwareAEC, this.hardwareAGC, this.hardwareNS, this.lowLatencyOutput, this.lowLatencyInput, this.proAudio, this.aAudio, this.outputBufferSize, this.inputBufferSize, j);
        WebRtcAudioUtils.logAudioState(TAG);
    }

    private static void assertTrue(boolean z) {
        if (!z) {
            throw new AssertionError("Expected condition to be true");
        }
    }

    private void dispose() {
        String valueOf = String.valueOf(WebRtcAudioUtils.getThreadInfo());
        Logging.m151178a(TAG, valueOf.length() == 0 ? new String("dispose") : "dispose".concat(valueOf));
        if (this.initialized) {
            this.volumeLogger.stop();
        }
    }

    private int getLowLatencyInputFramesPerBuffer() {
        assertTrue(isLowLatencyInputSupported());
        return getLowLatencyOutputFramesPerBuffer();
    }

    private int getLowLatencyOutputFramesPerBuffer() {
        assertTrue(isLowLatencyOutputSupported());
        int i = Build.VERSION.SDK_INT;
        String property = this.audioManager.getProperty("android.media.property.OUTPUT_FRAMES_PER_BUFFER");
        if (property != null) {
            return Integer.parseInt(property);
        }
        return 256;
    }

    private static int getMinInputFrameSize(int i, int i2) {
        return AudioRecord.getMinBufferSize(i, i2 == 1 ? 16 : 12, 2) / (i2 + i2);
    }

    private static int getMinOutputFrameSize(int i, int i2) {
        return AudioTrack.getMinBufferSize(i, i2 == 1 ? 4 : 12, 2) / (i2 + i2);
    }

    private int getNativeOutputSampleRate() {
        if (WebRtcAudioUtils.runningOnEmulator()) {
            Logging.m151178a(TAG, "Running emulator, overriding sample rate to 8 kHz.");
            return 8000;
        } else if (WebRtcAudioUtils.isDefaultSampleRateOverridden()) {
            int defaultSampleRateHz = WebRtcAudioUtils.getDefaultSampleRateHz();
            StringBuilder sb = new StringBuilder(50);
            sb.append("Default sample rate is overriden to ");
            sb.append(defaultSampleRateHz);
            sb.append(" Hz");
            Logging.m151178a(TAG, sb.toString());
            return WebRtcAudioUtils.getDefaultSampleRateHz();
        } else {
            int sampleRateForApiLevel = getSampleRateForApiLevel();
            StringBuilder sb2 = new StringBuilder(36);
            sb2.append("Sample rate is set to ");
            sb2.append(sampleRateForApiLevel);
            sb2.append(" Hz");
            Logging.m151178a(TAG, sb2.toString());
            return sampleRateForApiLevel;
        }
    }

    private int getSampleRateForApiLevel() {
        int i = Build.VERSION.SDK_INT;
        String property = this.audioManager.getProperty("android.media.property.OUTPUT_SAMPLE_RATE");
        return property == null ? WebRtcAudioUtils.getDefaultSampleRateHz() : Integer.parseInt(property);
    }

    public static synchronized boolean getStereoInput() {
        boolean z;
        synchronized (WebRtcAudioManager.class) {
            z = useStereoInput;
        }
        return z;
    }

    public static synchronized boolean getStereoOutput() {
        boolean z;
        synchronized (WebRtcAudioManager.class) {
            z = useStereoOutput;
        }
        return z;
    }

    private boolean hasEarpiece() {
        return ContextUtils.getApplicationContext().getPackageManager().hasSystemFeature("android.hardware.telephony");
    }

    private boolean init() {
        String valueOf = String.valueOf(WebRtcAudioUtils.getThreadInfo());
        Logging.m151178a(TAG, valueOf.length() == 0 ? new String("init") : "init".concat(valueOf));
        if (this.initialized) {
            return blacklistDeviceForAAudioUsage;
        }
        String modeToString = WebRtcAudioUtils.modeToString(this.audioManager.getMode());
        Logging.m151178a(TAG, modeToString.length() == 0 ? new String("audio mode is: ") : "audio mode is: ".concat(modeToString));
        this.initialized = blacklistDeviceForAAudioUsage;
        this.volumeLogger.start();
        return blacklistDeviceForAAudioUsage;
    }

    private boolean isAAudioSupported() {
        Logging.m151181c(TAG, "AAudio support is currently disabled on all devices!");
        return false;
    }

    private static boolean isAcousticEchoCancelerSupported() {
        return WebRtcAudioEffects.canUseAcousticEchoCanceler();
    }

    private boolean isCommunicationModeEnabled() {
        if (this.audioManager.getMode() == 3) {
            return blacklistDeviceForAAudioUsage;
        }
        return false;
    }

    private boolean isDeviceBlacklistedForOpenSLESUsage() {
        boolean deviceIsBlacklistedForOpenSLESUsage = blacklistDeviceForOpenSLESUsageIsOverridden ? blacklistDeviceForOpenSLESUsage : WebRtcAudioUtils.deviceIsBlacklistedForOpenSLESUsage();
        if (deviceIsBlacklistedForOpenSLESUsage) {
            Logging.m151178a(TAG, String.valueOf(Build.MODEL).concat(" is blacklisted for OpenSL ES usage!"));
        }
        return deviceIsBlacklistedForOpenSLESUsage;
    }

    private boolean isLowLatencyOutputSupported() {
        return ContextUtils.getApplicationContext().getPackageManager().hasSystemFeature("android.hardware.audio.low_latency");
    }

    private static boolean isNoiseSuppressorSupported() {
        return WebRtcAudioEffects.canUseNoiseSuppressor();
    }

    private boolean isProAudioSupported() {
        int i = Build.VERSION.SDK_INT;
        if (ContextUtils.getApplicationContext().getPackageManager().hasSystemFeature("android.hardware.audio.pro")) {
            return blacklistDeviceForAAudioUsage;
        }
        return false;
    }

    private native void nativeCacheAudioParameters(int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i4, int i5, long j);

    public static synchronized void setBlacklistDeviceForOpenSLESUsage(boolean z) {
        synchronized (WebRtcAudioManager.class) {
            blacklistDeviceForOpenSLESUsageIsOverridden = blacklistDeviceForAAudioUsage;
            blacklistDeviceForOpenSLESUsage = z;
        }
    }

    public static synchronized void setStereoInput(boolean z) {
        synchronized (WebRtcAudioManager.class) {
            StringBuilder sb = new StringBuilder(56);
            sb.append("Overriding default input behavior: setStereoInput(");
            sb.append(z);
            sb.append(')');
            Logging.m151181c(TAG, sb.toString());
            useStereoInput = z;
        }
    }

    public static synchronized void setStereoOutput(boolean z) {
        synchronized (WebRtcAudioManager.class) {
            StringBuilder sb = new StringBuilder(58);
            sb.append("Overriding default output behavior: setStereoOutput(");
            sb.append(z);
            sb.append(')');
            Logging.m151181c(TAG, sb.toString());
            useStereoOutput = z;
        }
    }

    private void storeAudioParameters() {
        int i;
        int i2;
        int i3 = 1;
        if (!getStereoOutput()) {
            i = 1;
        } else {
            i = 2;
        }
        this.outputChannels = i;
        if (getStereoInput()) {
            i3 = 2;
        }
        this.inputChannels = i3;
        this.sampleRate = getNativeOutputSampleRate();
        this.hardwareAEC = isAcousticEchoCancelerSupported();
        this.hardwareAGC = false;
        this.hardwareNS = isNoiseSuppressorSupported();
        this.lowLatencyOutput = isLowLatencyOutputSupported();
        this.lowLatencyInput = isLowLatencyInputSupported();
        this.proAudio = isProAudioSupported();
        isAAudioSupported();
        this.aAudio = false;
        this.outputBufferSize = this.lowLatencyOutput ? getLowLatencyOutputFramesPerBuffer() : getMinOutputFrameSize(this.sampleRate, this.outputChannels);
        if (!this.lowLatencyInput) {
            i2 = getMinInputFrameSize(this.sampleRate, this.inputChannels);
        } else {
            i2 = getLowLatencyInputFramesPerBuffer();
        }
        this.inputBufferSize = i2;
    }

    public boolean isLowLatencyInputSupported() {
        int i = Build.VERSION.SDK_INT;
        if (isLowLatencyOutputSupported()) {
            return blacklistDeviceForAAudioUsage;
        }
        return false;
    }
}
