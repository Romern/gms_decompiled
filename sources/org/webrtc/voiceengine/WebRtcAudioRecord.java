package org.webrtc.voiceengine;

import android.media.AudioRecord;
import android.os.Build;
import android.os.Process;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.webrtc.Logging;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class WebRtcAudioRecord {
    private static final long AUDIO_RECORD_THREAD_JOIN_TIMEOUT_MS = 2000;
    private static final int BITS_PER_SAMPLE = 16;
    private static final int BUFFERS_PER_SECOND = 100;
    private static final int BUFFER_SIZE_FACTOR = 2;
    private static final int CALLBACK_BUFFER_SIZE_MS = 10;
    private static final boolean DEBUG = false;
    private static final int DEFAULT_AUDIO_SOURCE = 7;
    private static final String TAG = "WebRtcAudioRecord";
    /* access modifiers changed from: private */
    public static WebRtcAudioRecordSamplesReadyCallback audioSamplesReadyCallback;
    private static int audioSource = 7;
    private static WebRtcAudioRecordErrorCallback errorCallback;
    /* access modifiers changed from: private */
    public static volatile boolean microphoneMute;
    /* access modifiers changed from: private */
    public AudioRecord audioRecord;
    private AudioRecordThread audioThread;
    /* access modifiers changed from: private */
    public ByteBuffer byteBuffer;
    private WebRtcAudioEffects effects;
    /* access modifiers changed from: private */
    public byte[] emptyBytes;
    /* access modifiers changed from: private */
    public final long nativeAudioRecord;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public enum AudioRecordStartErrorCode {
        AUDIO_RECORD_START_EXCEPTION,
        AUDIO_RECORD_START_STATE_MISMATCH
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    class AudioRecordThread extends Thread {
        private volatile boolean keepAlive = true;

        public AudioRecordThread(String str) {
            super(str);
        }

        public void run() {
            boolean z;
            Process.setThreadPriority(-19);
            String valueOf = String.valueOf(WebRtcAudioUtils.getThreadInfo());
            Logging.m151178a(WebRtcAudioRecord.TAG, valueOf.length() == 0 ? new String("AudioRecordThread") : "AudioRecordThread".concat(valueOf));
            if (WebRtcAudioRecord.this.audioRecord.getRecordingState() == 3) {
                z = true;
            } else {
                z = false;
            }
            WebRtcAudioRecord.assertTrue(z);
            System.nanoTime();
            while (this.keepAlive) {
                int read = WebRtcAudioRecord.this.audioRecord.read(WebRtcAudioRecord.this.byteBuffer, WebRtcAudioRecord.this.byteBuffer.capacity());
                if (read == WebRtcAudioRecord.this.byteBuffer.capacity()) {
                    if (WebRtcAudioRecord.microphoneMute) {
                        WebRtcAudioRecord.this.byteBuffer.clear();
                        WebRtcAudioRecord.this.byteBuffer.put(WebRtcAudioRecord.this.emptyBytes);
                    }
                    if (this.keepAlive) {
                        WebRtcAudioRecord webRtcAudioRecord = WebRtcAudioRecord.this;
                        webRtcAudioRecord.nativeDataIsRecorded(read, webRtcAudioRecord.nativeAudioRecord);
                    }
                    if (WebRtcAudioRecord.audioSamplesReadyCallback != null) {
                        WebRtcAudioRecord.audioSamplesReadyCallback.onWebRtcAudioRecordSamplesReady(new AudioSamples(WebRtcAudioRecord.this.audioRecord, Arrays.copyOf(WebRtcAudioRecord.this.byteBuffer.array(), WebRtcAudioRecord.this.byteBuffer.capacity())));
                    }
                } else {
                    StringBuilder sb = new StringBuilder(36);
                    sb.append("AudioRecord.read failed: ");
                    sb.append(read);
                    String sb2 = sb.toString();
                    Logging.m151180b(WebRtcAudioRecord.TAG, sb2);
                    if (read == -3) {
                        this.keepAlive = false;
                        WebRtcAudioRecord.this.reportWebRtcAudioRecordError(sb2);
                    }
                }
            }
            try {
                if (WebRtcAudioRecord.this.audioRecord != null) {
                    WebRtcAudioRecord.this.audioRecord.stop();
                }
            } catch (IllegalStateException e) {
                String valueOf2 = String.valueOf(e.getMessage());
                Logging.m151180b(WebRtcAudioRecord.TAG, valueOf2.length() == 0 ? new String("AudioRecord.stop failed: ") : "AudioRecord.stop failed: ".concat(valueOf2));
            }
        }

        public void stopThread() {
            Logging.m151178a(WebRtcAudioRecord.TAG, "stopThread");
            this.keepAlive = false;
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class AudioSamples {
        private final int audioFormat;
        private final int channelCount;
        private final byte[] data;
        private final int sampleRate;

        private AudioSamples(AudioRecord audioRecord, byte[] bArr) {
            this.audioFormat = audioRecord.getAudioFormat();
            this.channelCount = audioRecord.getChannelCount();
            this.sampleRate = audioRecord.getSampleRate();
            this.data = bArr;
        }

        public int getAudioFormat() {
            return this.audioFormat;
        }

        public int getChannelCount() {
            return this.channelCount;
        }

        public byte[] getData() {
            return this.data;
        }

        public int getSampleRate() {
            return this.sampleRate;
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public interface WebRtcAudioRecordErrorCallback {
        void onWebRtcAudioRecordError(String str);

        void onWebRtcAudioRecordInitError(String str);

        void onWebRtcAudioRecordStartError(AudioRecordStartErrorCode audioRecordStartErrorCode, String str);
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public interface WebRtcAudioRecordSamplesReadyCallback {
        void onWebRtcAudioRecordSamplesReady(AudioSamples audioSamples);
    }

    WebRtcAudioRecord(long j) {
        String valueOf = String.valueOf(WebRtcAudioUtils.getThreadInfo());
        Logging.m151178a(TAG, valueOf.length() == 0 ? new String("ctor") : "ctor".concat(valueOf));
        this.nativeAudioRecord = j;
        this.effects = WebRtcAudioEffects.create();
    }

    /* access modifiers changed from: private */
    public static void assertTrue(boolean z) {
        if (!z) {
            throw new AssertionError("Expected condition to be true");
        }
    }

    private int channelCountToConfiguration(int i) {
        return i == 1 ? 16 : 12;
    }

    private boolean enableBuiltInAEC(boolean z) {
        StringBuilder sb = new StringBuilder(23);
        sb.append("enableBuiltInAEC(");
        sb.append(z);
        sb.append(')');
        Logging.m151178a(TAG, sb.toString());
        WebRtcAudioEffects webRtcAudioEffects = this.effects;
        if (webRtcAudioEffects != null) {
            return webRtcAudioEffects.setAEC(z);
        }
        Logging.m151180b(TAG, "Built-in AEC is not supported on this platform");
        return false;
    }

    private boolean enableBuiltInNS(boolean z) {
        StringBuilder sb = new StringBuilder(22);
        sb.append("enableBuiltInNS(");
        sb.append(z);
        sb.append(')');
        Logging.m151178a(TAG, sb.toString());
        WebRtcAudioEffects webRtcAudioEffects = this.effects;
        if (webRtcAudioEffects != null) {
            return webRtcAudioEffects.setNS(z);
        }
        Logging.m151180b(TAG, "Built-in NS is not supported on this platform");
        return false;
    }

    private static int getDefaultAudioSource() {
        return 7;
    }

    private int initRecording(int i, int i2) {
        StringBuilder sb = new StringBuilder(59);
        sb.append("initRecording(sampleRate=");
        sb.append(i);
        sb.append(", channels=");
        sb.append(i2);
        sb.append(")");
        Logging.m151178a(TAG, sb.toString());
        if (this.audioRecord != null) {
            reportWebRtcAudioRecordInitError("InitRecording called twice without StopRecording.");
            return -1;
        }
        int i3 = i / 100;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect((i2 + i2) * i3);
        this.byteBuffer = allocateDirect;
        int capacity = allocateDirect.capacity();
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append("byteBuffer.capacity: ");
        sb2.append(capacity);
        Logging.m151178a(TAG, sb2.toString());
        this.emptyBytes = new byte[this.byteBuffer.capacity()];
        nativeCacheDirectBufferAddress(this.byteBuffer, this.nativeAudioRecord);
        int channelCountToConfiguration = channelCountToConfiguration(i2);
        int minBufferSize = AudioRecord.getMinBufferSize(i, channelCountToConfiguration, 2);
        if (minBufferSize == -1 || minBufferSize == -2) {
            StringBuilder sb3 = new StringBuilder(48);
            sb3.append("AudioRecord.getMinBufferSize failed: ");
            sb3.append(minBufferSize);
            reportWebRtcAudioRecordInitError(sb3.toString());
            return -1;
        }
        StringBuilder sb4 = new StringBuilder(41);
        sb4.append("AudioRecord.getMinBufferSize: ");
        sb4.append(minBufferSize);
        Logging.m151178a(TAG, sb4.toString());
        int max = Math.max(minBufferSize + minBufferSize, this.byteBuffer.capacity());
        StringBuilder sb5 = new StringBuilder(30);
        sb5.append("bufferSizeInBytes: ");
        sb5.append(max);
        Logging.m151178a(TAG, sb5.toString());
        try {
            AudioRecord audioRecord2 = new AudioRecord(audioSource, i, channelCountToConfiguration, 2, max);
            this.audioRecord = audioRecord2;
            if (audioRecord2.getState() == 1) {
                WebRtcAudioEffects webRtcAudioEffects = this.effects;
                if (webRtcAudioEffects != null) {
                    webRtcAudioEffects.enable(this.audioRecord.getAudioSessionId());
                }
                logMainParameters();
                logMainParametersExtended();
                return i3;
            }
            reportWebRtcAudioRecordInitError("Failed to create a new AudioRecord instance");
            releaseAudioResources();
            return -1;
        } catch (IllegalArgumentException e) {
            String valueOf = String.valueOf(e.getMessage());
            reportWebRtcAudioRecordInitError(valueOf.length() == 0 ? new String("AudioRecord ctor error: ") : "AudioRecord ctor error: ".concat(valueOf));
            releaseAudioResources();
            return -1;
        }
    }

    private void logMainParameters() {
        int audioSessionId = this.audioRecord.getAudioSessionId();
        int channelCount = this.audioRecord.getChannelCount();
        int sampleRate = this.audioRecord.getSampleRate();
        StringBuilder sb = new StringBuilder(85);
        sb.append("AudioRecord: session ID: ");
        sb.append(audioSessionId);
        sb.append(", channels: ");
        sb.append(channelCount);
        sb.append(", sample rate: ");
        sb.append(sampleRate);
        Logging.m151178a(TAG, sb.toString());
    }

    private void logMainParametersExtended() {
        int i = Build.VERSION.SDK_INT;
        int bufferSizeInFrames = this.audioRecord.getBufferSizeInFrames();
        StringBuilder sb = new StringBuilder(47);
        sb.append("AudioRecord: buffer size in frames: ");
        sb.append(bufferSizeInFrames);
        Logging.m151178a(TAG, sb.toString());
    }

    private native void nativeCacheDirectBufferAddress(ByteBuffer byteBuffer2, long j);

    /* access modifiers changed from: private */
    public native void nativeDataIsRecorded(int i, long j);

    private void releaseAudioResources() {
        Logging.m151178a(TAG, "releaseAudioResources");
        AudioRecord audioRecord2 = this.audioRecord;
        if (audioRecord2 != null) {
            audioRecord2.release();
            this.audioRecord = null;
        }
    }

    /* access modifiers changed from: private */
    public void reportWebRtcAudioRecordError(String str) {
        String valueOf = String.valueOf(str);
        Logging.m151180b(TAG, valueOf.length() == 0 ? new String("Run-time recording error: ") : "Run-time recording error: ".concat(valueOf));
        WebRtcAudioUtils.logAudioState(TAG);
        WebRtcAudioRecordErrorCallback webRtcAudioRecordErrorCallback = errorCallback;
        if (webRtcAudioRecordErrorCallback != null) {
            webRtcAudioRecordErrorCallback.onWebRtcAudioRecordError(str);
        }
    }

    private void reportWebRtcAudioRecordInitError(String str) {
        String valueOf = String.valueOf(str);
        Logging.m151180b(TAG, valueOf.length() == 0 ? new String("Init recording error: ") : "Init recording error: ".concat(valueOf));
        WebRtcAudioUtils.logAudioState(TAG);
        WebRtcAudioRecordErrorCallback webRtcAudioRecordErrorCallback = errorCallback;
        if (webRtcAudioRecordErrorCallback != null) {
            webRtcAudioRecordErrorCallback.onWebRtcAudioRecordInitError(str);
        }
    }

    private void reportWebRtcAudioRecordStartError(AudioRecordStartErrorCode audioRecordStartErrorCode, String str) {
        String valueOf = String.valueOf(audioRecordStartErrorCode);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25 + String.valueOf(str).length());
        sb.append("Start recording error: ");
        sb.append(valueOf);
        sb.append(". ");
        sb.append(str);
        Logging.m151180b(TAG, sb.toString());
        WebRtcAudioUtils.logAudioState(TAG);
        WebRtcAudioRecordErrorCallback webRtcAudioRecordErrorCallback = errorCallback;
        if (webRtcAudioRecordErrorCallback != null) {
            webRtcAudioRecordErrorCallback.onWebRtcAudioRecordStartError(audioRecordStartErrorCode, str);
        }
    }

    public static synchronized void setAudioSource(int i) {
        synchronized (WebRtcAudioRecord.class) {
            int i2 = audioSource;
            StringBuilder sb = new StringBuilder(56);
            sb.append("Audio source is changed from: ");
            sb.append(i2);
            sb.append(" to ");
            sb.append(i);
            Logging.m151181c(TAG, sb.toString());
            audioSource = i;
        }
    }

    public static void setErrorCallback(WebRtcAudioRecordErrorCallback webRtcAudioRecordErrorCallback) {
        Logging.m151178a(TAG, "Set error callback");
        errorCallback = webRtcAudioRecordErrorCallback;
    }

    public static void setMicrophoneMute(boolean z) {
        StringBuilder sb = new StringBuilder(24);
        sb.append("setMicrophoneMute(");
        sb.append(z);
        sb.append(")");
        Logging.m151181c(TAG, sb.toString());
        microphoneMute = z;
    }

    public static void setOnAudioSamplesReady(WebRtcAudioRecordSamplesReadyCallback webRtcAudioRecordSamplesReadyCallback) {
        audioSamplesReadyCallback = webRtcAudioRecordSamplesReadyCallback;
    }

    private boolean startRecording() {
        boolean z;
        boolean z2;
        Logging.m151178a(TAG, "startRecording");
        if (this.audioRecord != null) {
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
            this.audioRecord.startRecording();
            if (this.audioRecord.getRecordingState() != 3) {
                AudioRecordStartErrorCode audioRecordStartErrorCode = AudioRecordStartErrorCode.AUDIO_RECORD_START_STATE_MISMATCH;
                int recordingState = this.audioRecord.getRecordingState();
                StringBuilder sb = new StringBuilder(64);
                sb.append("AudioRecord.startRecording failed - incorrect state :");
                sb.append(recordingState);
                reportWebRtcAudioRecordStartError(audioRecordStartErrorCode, sb.toString());
                return false;
            }
            AudioRecordThread audioRecordThread = new AudioRecordThread("AudioRecordJavaThread");
            this.audioThread = audioRecordThread;
            audioRecordThread.start();
            return true;
        } catch (IllegalStateException e) {
            AudioRecordStartErrorCode audioRecordStartErrorCode2 = AudioRecordStartErrorCode.AUDIO_RECORD_START_EXCEPTION;
            String valueOf = String.valueOf(e.getMessage());
            reportWebRtcAudioRecordStartError(audioRecordStartErrorCode2, valueOf.length() == 0 ? new String("AudioRecord.startRecording failed: ") : "AudioRecord.startRecording failed: ".concat(valueOf));
            return false;
        }
    }

    private boolean stopRecording() {
        boolean z;
        Logging.m151178a(TAG, "stopRecording");
        if (this.audioThread != null) {
            z = true;
        } else {
            z = false;
        }
        assertTrue(z);
        this.audioThread.stopThread();
        if (!ciur.m151032a(this.audioThread)) {
            Logging.m151180b(TAG, "Join of AudioRecordJavaThread timed out");
            WebRtcAudioUtils.logAudioState(TAG);
        }
        this.audioThread = null;
        WebRtcAudioEffects webRtcAudioEffects = this.effects;
        if (webRtcAudioEffects != null) {
            webRtcAudioEffects.release();
        }
        releaseAudioResources();
        return true;
    }
}
