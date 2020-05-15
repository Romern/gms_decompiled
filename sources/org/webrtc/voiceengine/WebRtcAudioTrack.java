package org.webrtc.voiceengine;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import java.nio.ByteBuffer;
import org.webrtc.ContextUtils;
import org.webrtc.Logging;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class WebRtcAudioTrack {
    private static final long AUDIO_TRACK_THREAD_JOIN_TIMEOUT_MS = 2000;
    private static final int BITS_PER_SAMPLE = 16;
    private static final int BUFFERS_PER_SECOND = 100;
    private static final int CALLBACK_BUFFER_SIZE_MS = 10;
    private static final boolean DEBUG = false;
    private static final int DEFAULT_USAGE = 2;
    private static final String TAG = "WebRtcAudioTrack";
    private static ErrorCallback errorCallback;
    private static WebRtcAudioTrackErrorCallback errorCallbackOld;
    /* access modifiers changed from: private */
    public static volatile boolean speakerMute;
    private static int usageAttribute = 2;
    private final AudioManager audioManager;
    private AudioTrackThread audioThread;
    /* access modifiers changed from: private */
    public AudioTrack audioTrack;
    /* access modifiers changed from: private */
    public ByteBuffer byteBuffer;
    /* access modifiers changed from: private */
    public byte[] emptyBytes;
    /* access modifiers changed from: private */
    public final long nativeAudioTrack;
    private final ciuq threadChecker;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public enum AudioTrackStartErrorCode {
        AUDIO_TRACK_START_EXCEPTION,
        AUDIO_TRACK_START_STATE_MISMATCH
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    class AudioTrackThread extends Thread {
        private volatile boolean keepAlive = true;

        public AudioTrackThread(String str) {
            super(str);
        }

        private int writeBytes(AudioTrack audioTrack, ByteBuffer byteBuffer, int i) {
            int i2 = Build.VERSION.SDK_INT;
            return audioTrack.write(byteBuffer, i, 0);
        }

        public void run() {
            boolean z;
            boolean z2;
            Process.setThreadPriority(-19);
            String valueOf = String.valueOf(WebRtcAudioUtils.getThreadInfo());
            Logging.m151178a(WebRtcAudioTrack.TAG, valueOf.length() == 0 ? new String("AudioTrackThread") : "AudioTrackThread".concat(valueOf));
            if (WebRtcAudioTrack.this.audioTrack.getPlayState() == 3) {
                z = true;
            } else {
                z = false;
            }
            WebRtcAudioTrack.assertTrue(z);
            int capacity = WebRtcAudioTrack.this.byteBuffer.capacity();
            while (this.keepAlive) {
                WebRtcAudioTrack webRtcAudioTrack = WebRtcAudioTrack.this;
                webRtcAudioTrack.nativeGetPlayoutData(capacity, webRtcAudioTrack.nativeAudioTrack);
                if (capacity <= WebRtcAudioTrack.this.byteBuffer.remaining()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                WebRtcAudioTrack.assertTrue(z2);
                if (WebRtcAudioTrack.speakerMute) {
                    WebRtcAudioTrack.this.byteBuffer.clear();
                    WebRtcAudioTrack.this.byteBuffer.put(WebRtcAudioTrack.this.emptyBytes);
                    WebRtcAudioTrack.this.byteBuffer.position(0);
                }
                int writeBytes = writeBytes(WebRtcAudioTrack.this.audioTrack, WebRtcAudioTrack.this.byteBuffer, capacity);
                if (writeBytes != capacity) {
                    StringBuilder sb = new StringBuilder(60);
                    sb.append("AudioTrack.write played invalid number of bytes: ");
                    sb.append(writeBytes);
                    Logging.m151180b(WebRtcAudioTrack.TAG, sb.toString());
                    if (writeBytes < 0) {
                        this.keepAlive = false;
                        WebRtcAudioTrack webRtcAudioTrack2 = WebRtcAudioTrack.this;
                        StringBuilder sb2 = new StringBuilder(36);
                        sb2.append("AudioTrack.write failed: ");
                        sb2.append(writeBytes);
                        webRtcAudioTrack2.reportWebRtcAudioTrackError(sb2.toString());
                    }
                }
                WebRtcAudioTrack.this.byteBuffer.rewind();
            }
            if (WebRtcAudioTrack.this.audioTrack != null) {
                Logging.m151178a(WebRtcAudioTrack.TAG, "Calling AudioTrack.stop...");
                try {
                    WebRtcAudioTrack.this.audioTrack.stop();
                    Logging.m151178a(WebRtcAudioTrack.TAG, "AudioTrack.stop is done.");
                } catch (IllegalStateException e) {
                    String valueOf2 = String.valueOf(e.getMessage());
                    Logging.m151180b(WebRtcAudioTrack.TAG, valueOf2.length() == 0 ? new String("AudioTrack.stop failed: ") : "AudioTrack.stop failed: ".concat(valueOf2));
                }
            }
        }

        public void stopThread() {
            Logging.m151178a(WebRtcAudioTrack.TAG, "stopThread");
            this.keepAlive = false;
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public interface ErrorCallback {
        void onWebRtcAudioTrackError(String str);

        void onWebRtcAudioTrackInitError(String str);

        void onWebRtcAudioTrackStartError(AudioTrackStartErrorCode audioTrackStartErrorCode, String str);
    }

    @Deprecated
    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public interface WebRtcAudioTrackErrorCallback {
        void onWebRtcAudioTrackError(String str);

        void onWebRtcAudioTrackInitError(String str);

        void onWebRtcAudioTrackStartError(String str);
    }

    static {
        getDefaultUsageAttribute();
    }

    WebRtcAudioTrack(long j) {
        ciuq ciuq = new ciuq();
        this.threadChecker = ciuq;
        ciuq.mo86583a();
        String valueOf = String.valueOf(WebRtcAudioUtils.getThreadInfo());
        Logging.m151178a(TAG, valueOf.length() == 0 ? new String("ctor") : "ctor".concat(valueOf));
        this.nativeAudioTrack = j;
        this.audioManager = (AudioManager) ContextUtils.getApplicationContext().getSystemService("audio");
    }

    /* access modifiers changed from: private */
    public static void assertTrue(boolean z) {
        if (!z) {
            throw new AssertionError("Expected condition to be true");
        }
    }

    private int channelCountToConfiguration(int i) {
        return i == 1 ? 4 : 12;
    }

    private static AudioTrack createAudioTrackOnLollipopOrHigher(int i, int i2, int i3) {
        Logging.m151178a(TAG, "createAudioTrackOnLollipopOrHigher");
        int nativeOutputSampleRate = AudioTrack.getNativeOutputSampleRate(0);
        StringBuilder sb = new StringBuilder(35);
        sb.append("nativeOutputSampleRate: ");
        sb.append(nativeOutputSampleRate);
        Logging.m151178a(TAG, sb.toString());
        if (i != nativeOutputSampleRate) {
            Logging.m151181c(TAG, "Unable to use fast mode since requested sample rate is not native");
        }
        int i4 = usageAttribute;
        if (i4 != DEFAULT_USAGE) {
            StringBuilder sb2 = new StringBuilder(50);
            sb2.append("A non default usage attribute is used: ");
            sb2.append(i4);
            Logging.m151181c(TAG, sb2.toString());
        }
        return new AudioTrack(new AudioAttributes.Builder().setUsage(usageAttribute).setContentType(1).build(), new AudioFormat.Builder().setEncoding(2).setSampleRate(i).setChannelMask(i2).build(), i3, 1, 0);
    }

    private static AudioTrack createAudioTrackOnLowerThanLollipop(int i, int i2, int i3) {
        return new AudioTrack(0, i, i2, 2, i3, 1);
    }

    private static int getDefaultUsageAttribute() {
        int i = Build.VERSION.SDK_INT;
        return 2;
    }

    private int getStreamMaxVolume() {
        this.threadChecker.mo86583a();
        Logging.m151178a(TAG, "getStreamMaxVolume");
        assertTrue(this.audioManager != null);
        return this.audioManager.getStreamMaxVolume(0);
    }

    private int getStreamVolume() {
        this.threadChecker.mo86583a();
        Logging.m151178a(TAG, "getStreamVolume");
        assertTrue(this.audioManager != null);
        return this.audioManager.getStreamVolume(0);
    }

    private boolean initPlayout(int i, int i2, double d) {
        this.threadChecker.mo86583a();
        StringBuilder sb = new StringBuilder(100);
        sb.append("initPlayout(sampleRate=");
        sb.append(i);
        sb.append(", channels=");
        sb.append(i2);
        sb.append(", bufferSizeFactor=");
        sb.append(d);
        sb.append(")");
        Logging.m151178a(TAG, sb.toString());
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect((i2 + i2) * (i / 100));
        this.byteBuffer = allocateDirect;
        int capacity = allocateDirect.capacity();
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append("byteBuffer.capacity: ");
        sb2.append(capacity);
        Logging.m151178a(TAG, sb2.toString());
        this.emptyBytes = new byte[this.byteBuffer.capacity()];
        nativeCacheDirectBufferAddress(this.byteBuffer, this.nativeAudioTrack);
        int channelCountToConfiguration = channelCountToConfiguration(i2);
        double minBufferSize = (double) AudioTrack.getMinBufferSize(i, channelCountToConfiguration, 2);
        Double.isNaN(minBufferSize);
        int i3 = (int) (minBufferSize * d);
        StringBuilder sb3 = new StringBuilder(33);
        sb3.append("minBufferSizeInBytes: ");
        sb3.append(i3);
        Logging.m151178a(TAG, sb3.toString());
        if (i3 < this.byteBuffer.capacity()) {
            reportWebRtcAudioTrackInitError("AudioTrack.getMinBufferSize returns an invalid value.");
            return false;
        } else if (this.audioTrack == null) {
            try {
                int i4 = Build.VERSION.SDK_INT;
                AudioTrack createAudioTrackOnLollipopOrHigher = createAudioTrackOnLollipopOrHigher(i, channelCountToConfiguration, i3);
                this.audioTrack = createAudioTrackOnLollipopOrHigher;
                if (createAudioTrackOnLollipopOrHigher != null && createAudioTrackOnLollipopOrHigher.getState() == 1) {
                    logMainParameters();
                    logMainParametersExtended();
                    return true;
                }
                reportWebRtcAudioTrackInitError("Initialization of audio track failed.");
                releaseAudioResources();
                return false;
            } catch (IllegalArgumentException e) {
                reportWebRtcAudioTrackInitError(e.getMessage());
                releaseAudioResources();
                return false;
            }
        } else {
            reportWebRtcAudioTrackInitError("Conflict with existing AudioTrack.");
            return false;
        }
    }

    private boolean isVolumeFixed() {
        int i = Build.VERSION.SDK_INT;
        return this.audioManager.isVolumeFixed();
    }

    private void logBufferCapacityInFrames() {
        int i = Build.VERSION.SDK_INT;
        int bufferCapacityInFrames = this.audioTrack.getBufferCapacityInFrames();
        StringBuilder sb = new StringBuilder(50);
        sb.append("AudioTrack: buffer capacity in frames: ");
        sb.append(bufferCapacityInFrames);
        Logging.m151178a(TAG, sb.toString());
    }

    private void logBufferSizeInFrames() {
        int i = Build.VERSION.SDK_INT;
        int bufferSizeInFrames = this.audioTrack.getBufferSizeInFrames();
        StringBuilder sb = new StringBuilder(46);
        sb.append("AudioTrack: buffer size in frames: ");
        sb.append(bufferSizeInFrames);
        Logging.m151178a(TAG, sb.toString());
    }

    private void logMainParameters() {
        int audioSessionId = this.audioTrack.getAudioSessionId();
        int channelCount = this.audioTrack.getChannelCount();
        int sampleRate = this.audioTrack.getSampleRate();
        float maxVolume = AudioTrack.getMaxVolume();
        StringBuilder sb = new StringBuilder(111);
        sb.append("AudioTrack: session ID: ");
        sb.append(audioSessionId);
        sb.append(", channels: ");
        sb.append(channelCount);
        sb.append(", sample rate: ");
        sb.append(sampleRate);
        sb.append(", max gain: ");
        sb.append(maxVolume);
        Logging.m151178a(TAG, sb.toString());
    }

    private void logMainParametersExtended() {
        logBufferSizeInFrames();
        logBufferCapacityInFrames();
    }

    private void logUnderrunCount() {
        int i = Build.VERSION.SDK_INT;
        int underrunCount = this.audioTrack.getUnderrunCount();
        StringBuilder sb = new StringBuilder(27);
        sb.append("underrun count: ");
        sb.append(underrunCount);
        Logging.m151178a(TAG, sb.toString());
    }

    private native void nativeCacheDirectBufferAddress(ByteBuffer byteBuffer2, long j);

    /* access modifiers changed from: private */
    public native void nativeGetPlayoutData(int i, long j);

    private void releaseAudioResources() {
        Logging.m151178a(TAG, "releaseAudioResources");
        AudioTrack audioTrack2 = this.audioTrack;
        if (audioTrack2 != null) {
            audioTrack2.release();
            this.audioTrack = null;
        }
    }

    /* access modifiers changed from: private */
    public void reportWebRtcAudioTrackError(String str) {
        String valueOf = String.valueOf(str);
        Logging.m151180b(TAG, valueOf.length() == 0 ? new String("Run-time playback error: ") : "Run-time playback error: ".concat(valueOf));
        WebRtcAudioUtils.logAudioState(TAG);
        WebRtcAudioTrackErrorCallback webRtcAudioTrackErrorCallback = errorCallbackOld;
        if (webRtcAudioTrackErrorCallback != null) {
            webRtcAudioTrackErrorCallback.onWebRtcAudioTrackError(str);
        }
        ErrorCallback errorCallback2 = errorCallback;
        if (errorCallback2 != null) {
            errorCallback2.onWebRtcAudioTrackError(str);
        }
    }

    private void reportWebRtcAudioTrackInitError(String str) {
        String valueOf = String.valueOf(str);
        Logging.m151180b(TAG, valueOf.length() == 0 ? new String("Init playout error: ") : "Init playout error: ".concat(valueOf));
        WebRtcAudioUtils.logAudioState(TAG);
        WebRtcAudioTrackErrorCallback webRtcAudioTrackErrorCallback = errorCallbackOld;
        if (webRtcAudioTrackErrorCallback != null) {
            webRtcAudioTrackErrorCallback.onWebRtcAudioTrackInitError(str);
        }
        ErrorCallback errorCallback2 = errorCallback;
        if (errorCallback2 != null) {
            errorCallback2.onWebRtcAudioTrackInitError(str);
        }
    }

    private void reportWebRtcAudioTrackStartError(AudioTrackStartErrorCode audioTrackStartErrorCode, String str) {
        String valueOf = String.valueOf(audioTrackStartErrorCode);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23 + String.valueOf(str).length());
        sb.append("Start playout error: ");
        sb.append(valueOf);
        sb.append(". ");
        sb.append(str);
        Logging.m151180b(TAG, sb.toString());
        WebRtcAudioUtils.logAudioState(TAG);
        WebRtcAudioTrackErrorCallback webRtcAudioTrackErrorCallback = errorCallbackOld;
        if (webRtcAudioTrackErrorCallback != null) {
            webRtcAudioTrackErrorCallback.onWebRtcAudioTrackStartError(str);
        }
        ErrorCallback errorCallback2 = errorCallback;
        if (errorCallback2 != null) {
            errorCallback2.onWebRtcAudioTrackStartError(audioTrackStartErrorCode, str);
        }
    }

    public static synchronized void setAudioTrackUsageAttribute(int i) {
        synchronized (WebRtcAudioTrack.class) {
            int i2 = DEFAULT_USAGE;
            StringBuilder sb = new StringBuilder(67);
            sb.append("Default usage attribute is changed from: ");
            sb.append(i2);
            sb.append(" to ");
            sb.append(i);
            Logging.m151181c(TAG, sb.toString());
            usageAttribute = i;
        }
    }

    public static void setErrorCallback(ErrorCallback errorCallback2) {
        Logging.m151178a(TAG, "Set extended error callback");
        errorCallback = errorCallback2;
    }

    public static void setSpeakerMute(boolean z) {
        StringBuilder sb = new StringBuilder(21);
        sb.append("setSpeakerMute(");
        sb.append(z);
        sb.append(")");
        Logging.m151181c(TAG, sb.toString());
        speakerMute = z;
    }

    private boolean setStreamVolume(int i) {
        boolean z;
        this.threadChecker.mo86583a();
        StringBuilder sb = new StringBuilder(28);
        sb.append("setStreamVolume(");
        sb.append(i);
        sb.append(")");
        Logging.m151178a(TAG, sb.toString());
        if (this.audioManager != null) {
            z = true;
        } else {
            z = false;
        }
        assertTrue(z);
        if (isVolumeFixed()) {
            Logging.m151180b(TAG, "The device implements a fixed volume policy.");
            return false;
        }
        this.audioManager.setStreamVolume(0, i, 0);
        return true;
    }

    private boolean startPlayout() {
        boolean z;
        boolean z2;
        this.threadChecker.mo86583a();
        Logging.m151178a(TAG, "startPlayout");
        if (this.audioTrack != null) {
            z = true;
        } else {
            z = false;
        }
        assertTrue(z);
        if (this.audioThread == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        assertTrue(z2);
        try {
            this.audioTrack.play();
            if (this.audioTrack.getPlayState() != 3) {
                AudioTrackStartErrorCode audioTrackStartErrorCode = AudioTrackStartErrorCode.AUDIO_TRACK_START_STATE_MISMATCH;
                int playState = this.audioTrack.getPlayState();
                StringBuilder sb = new StringBuilder(53);
                sb.append("AudioTrack.play failed - incorrect state :");
                sb.append(playState);
                reportWebRtcAudioTrackStartError(audioTrackStartErrorCode, sb.toString());
                releaseAudioResources();
                return false;
            }
            AudioTrackThread audioTrackThread = new AudioTrackThread("AudioTrackJavaThread");
            this.audioThread = audioTrackThread;
            audioTrackThread.start();
            return true;
        } catch (IllegalStateException e) {
            AudioTrackStartErrorCode audioTrackStartErrorCode2 = AudioTrackStartErrorCode.AUDIO_TRACK_START_EXCEPTION;
            String valueOf = String.valueOf(e.getMessage());
            reportWebRtcAudioTrackStartError(audioTrackStartErrorCode2, valueOf.length() == 0 ? new String("AudioTrack.play failed: ") : "AudioTrack.play failed: ".concat(valueOf));
            releaseAudioResources();
            return false;
        }
    }

    private boolean stopPlayout() {
        boolean z;
        this.threadChecker.mo86583a();
        Logging.m151178a(TAG, "stopPlayout");
        if (this.audioThread != null) {
            z = true;
        } else {
            z = false;
        }
        assertTrue(z);
        logUnderrunCount();
        this.audioThread.stopThread();
        Logging.m151178a(TAG, "Stopping the AudioTrackThread...");
        this.audioThread.interrupt();
        if (!ciur.m151032a(this.audioThread)) {
            Logging.m151180b(TAG, "Join of AudioTrackThread timed out.");
            WebRtcAudioUtils.logAudioState(TAG);
        }
        Logging.m151178a(TAG, "AudioTrackThread has now been stopped.");
        this.audioThread = null;
        releaseAudioResources();
        return true;
    }

    @Deprecated
    public static void setErrorCallback(WebRtcAudioTrackErrorCallback webRtcAudioTrackErrorCallback) {
        Logging.m151178a(TAG, "Set error callback (deprecated");
        errorCallbackOld = webRtcAudioTrackErrorCallback;
    }
}
