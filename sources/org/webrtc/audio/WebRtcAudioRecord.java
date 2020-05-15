package org.webrtc.audio;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.AudioRecordingConfiguration;
import android.media.audiofx.AcousticEchoCanceler;
import android.media.audiofx.NoiseSuppressor;
import android.os.Build;
import com.felicanetworks.mfc.BuildConfig;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.webrtc.Logging;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class WebRtcAudioRecord {

    /* renamed from: a */
    public final Context f192101a;

    /* renamed from: b */
    public final AudioManager f192102b;

    /* renamed from: c */
    public long f192103c;

    /* renamed from: d */
    public ByteBuffer f192104d;

    /* renamed from: e */
    public AudioRecord f192105e;

    /* renamed from: f */
    public volatile boolean f192106f;

    /* renamed from: g */
    public final ciuv f192107g;

    /* renamed from: h */
    private final int f192108h;

    /* renamed from: i */
    private final int f192109i;

    /* renamed from: j */
    private final ciuy f192110j;

    /* renamed from: k */
    private civa f192111k;

    /* renamed from: l */
    private ScheduledExecutorService f192112l;

    /* renamed from: m */
    private ScheduledFuture f192113m;

    /* renamed from: n */
    private boolean f192114n;

    /* renamed from: o */
    private boolean f192115o;

    /* renamed from: p */
    private final boolean f192116p;

    /* renamed from: q */
    private final boolean f192117q;

    WebRtcAudioRecord(Context context, AudioManager audioManager) {
        this(context, audioManager, ciuy.m151034a(), ciuy.m151036b());
    }

    /* renamed from: a */
    private final void m151201a() {
        Logging.m151178a("WebRtcAudioRecordExternal", "releaseAudioResources");
        AudioRecord audioRecord = this.f192105e;
        if (audioRecord != null) {
            audioRecord.release();
            this.f192105e = null;
        }
    }

    /* renamed from: b */
    public static void m151205b(boolean z) {
        if (!z) {
            throw new AssertionError("Expected condition to be true");
        }
    }

    private boolean enableBuiltInAEC(boolean z) {
        StringBuilder sb = new StringBuilder(23);
        sb.append("enableBuiltInAEC(");
        sb.append(z);
        sb.append(")");
        Logging.m151178a("WebRtcAudioRecordExternal", sb.toString());
        ciuy ciuy = this.f192110j;
        StringBuilder sb2 = new StringBuilder(13);
        sb2.append("setAEC(");
        sb2.append(z);
        sb2.append(")");
        Logging.m151178a("WebRtcAudioEffectsExternal", sb2.toString());
        if (!ciuy.m151034a()) {
            Logging.m151181c("WebRtcAudioEffectsExternal", "Platform AEC is not supported");
            ciuy.f191518c = false;
            return false;
        } else if (ciuy.f191516a == null || z == ciuy.f191518c) {
            ciuy.f191518c = z;
            return true;
        } else {
            Logging.m151180b("WebRtcAudioEffectsExternal", "Platform AEC state can't be modified while recording");
            return false;
        }
    }

    private boolean enableBuiltInNS(boolean z) {
        StringBuilder sb = new StringBuilder(22);
        sb.append("enableBuiltInNS(");
        sb.append(z);
        sb.append(")");
        Logging.m151178a("WebRtcAudioRecordExternal", sb.toString());
        ciuy ciuy = this.f192110j;
        StringBuilder sb2 = new StringBuilder(12);
        sb2.append("setNS(");
        sb2.append(z);
        sb2.append(")");
        Logging.m151178a("WebRtcAudioEffectsExternal", sb2.toString());
        if (!ciuy.m151036b()) {
            Logging.m151181c("WebRtcAudioEffectsExternal", "Platform NS is not supported");
            ciuy.f191519d = false;
            return false;
        } else if (ciuy.f191517b == null || z == ciuy.f191519d) {
            ciuy.f191519d = z;
            return true;
        } else {
            Logging.m151180b("WebRtcAudioEffectsExternal", "Platform NS state can't be modified while recording");
            return false;
        }
    }

    private int initRecording(int i, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        String str;
        boolean z4;
        String str2;
        String str3;
        int i3 = i;
        int i4 = i2;
        StringBuilder sb = new StringBuilder(59);
        sb.append("initRecording(sampleRate=");
        sb.append(i3);
        sb.append(", channels=");
        sb.append(i4);
        sb.append(")");
        Logging.m151178a("WebRtcAudioRecordExternal", sb.toString());
        if (this.f192105e == null) {
            int i5 = i3 / 100;
            int i6 = this.f192109i;
            if (i6 == 1 || i6 == 2) {
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect((i4 + i4) * i5);
                this.f192104d = allocateDirect;
                if (!allocateDirect.hasArray()) {
                    m151204a("ByteBuffer does not have backing array.");
                    return -1;
                }
                int capacity = this.f192104d.capacity();
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append("byteBuffer.capacity: ");
                sb2.append(capacity);
                Logging.m151178a("WebRtcAudioRecordExternal", sb2.toString());
                byte[] bArr = new byte[this.f192104d.capacity()];
                nativeCacheDirectBufferAddress(this.f192103c, this.f192104d);
                int i7 = i4 == 1 ? 16 : 12;
                int minBufferSize = AudioRecord.getMinBufferSize(i3, i7, this.f192109i);
                if (minBufferSize == -1 || minBufferSize == -2) {
                    StringBuilder sb3 = new StringBuilder(48);
                    sb3.append("AudioRecord.getMinBufferSize failed: ");
                    sb3.append(minBufferSize);
                    m151204a(sb3.toString());
                    return -1;
                }
                StringBuilder sb4 = new StringBuilder(41);
                sb4.append("AudioRecord.getMinBufferSize: ");
                sb4.append(minBufferSize);
                Logging.m151178a("WebRtcAudioRecordExternal", sb4.toString());
                int max = Math.max(minBufferSize + minBufferSize, this.f192104d.capacity());
                StringBuilder sb5 = new StringBuilder(30);
                sb5.append("bufferSizeInBytes: ");
                sb5.append(max);
                Logging.m151178a("WebRtcAudioRecordExternal", sb5.toString());
                try {
                    int i8 = Build.VERSION.SDK_INT;
                    int i9 = this.f192108h;
                    int i10 = this.f192109i;
                    Logging.m151178a("WebRtcAudioRecordExternal", "createAudioRecordOnMOrHigher");
                    AudioRecord build = new AudioRecord.Builder().setAudioSource(i9).setAudioFormat(new AudioFormat.Builder().setEncoding(i10).setSampleRate(i3).setChannelMask(i7).build()).setBufferSizeInBytes(max).build();
                    this.f192105e = build;
                    if (build != null && build.getState() == 1) {
                        ciuy ciuy = this.f192110j;
                        int audioSessionId = this.f192105e.getAudioSessionId();
                        StringBuilder sb6 = new StringBuilder(32);
                        sb6.append("enable(audioSession=");
                        sb6.append(audioSessionId);
                        sb6.append(")");
                        Logging.m151178a("WebRtcAudioEffectsExternal", sb6.toString());
                        if (ciuy.f191516a == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        ciuy.m151033a(z);
                        if (ciuy.f191517b == null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        ciuy.m151033a(z2);
                        String str4 = "disabled";
                        if (ciuy.m151034a()) {
                            ciuy.f191516a = AcousticEchoCanceler.create(audioSessionId);
                            AcousticEchoCanceler acousticEchoCanceler = ciuy.f191516a;
                            if (acousticEchoCanceler != null) {
                                boolean enabled = acousticEchoCanceler.getEnabled();
                                if (!ciuy.f191518c || !ciuy.m151034a()) {
                                    z4 = false;
                                } else {
                                    z4 = true;
                                }
                                if (ciuy.f191516a.setEnabled(z4) != 0) {
                                    Logging.m151180b("WebRtcAudioEffectsExternal", "Failed to set the AcousticEchoCanceler state");
                                }
                                if (!enabled) {
                                    str2 = str4;
                                } else {
                                    str2 = "enabled";
                                }
                                if (!ciuy.f191516a.getEnabled()) {
                                    str3 = str4;
                                } else {
                                    str3 = "enabled";
                                }
                                StringBuilder sb7 = new StringBuilder(str2.length() + 51 + str3.length());
                                sb7.append("AcousticEchoCanceler: was ");
                                sb7.append(str2);
                                sb7.append(", enable: ");
                                sb7.append(z4);
                                sb7.append(", is now: ");
                                sb7.append(str3);
                                Logging.m151178a("WebRtcAudioEffectsExternal", sb7.toString());
                            } else {
                                Logging.m151180b("WebRtcAudioEffectsExternal", "Failed to create the AcousticEchoCanceler instance");
                            }
                        }
                        if (ciuy.m151036b()) {
                            ciuy.f191517b = NoiseSuppressor.create(audioSessionId);
                            NoiseSuppressor noiseSuppressor = ciuy.f191517b;
                            if (noiseSuppressor != null) {
                                boolean enabled2 = noiseSuppressor.getEnabled();
                                if (!ciuy.f191519d || !ciuy.m151036b()) {
                                    z3 = false;
                                } else {
                                    z3 = true;
                                }
                                if (ciuy.f191517b.setEnabled(z3) != 0) {
                                    Logging.m151180b("WebRtcAudioEffectsExternal", "Failed to set the NoiseSuppressor state");
                                }
                                if (!enabled2) {
                                    str = str4;
                                } else {
                                    str = "enabled";
                                }
                                if (ciuy.f191517b.getEnabled()) {
                                    str4 = "enabled";
                                }
                                StringBuilder sb8 = new StringBuilder(str.length() + 46 + str4.length());
                                sb8.append("NoiseSuppressor: was ");
                                sb8.append(str);
                                sb8.append(", enable: ");
                                sb8.append(z3);
                                sb8.append(", is now: ");
                                sb8.append(str4);
                                Logging.m151178a("WebRtcAudioEffectsExternal", sb8.toString());
                            } else {
                                Logging.m151180b("WebRtcAudioEffectsExternal", "Failed to create the NoiseSuppressor instance");
                            }
                        }
                        int audioSessionId2 = this.f192105e.getAudioSessionId();
                        int channelCount = this.f192105e.getChannelCount();
                        int sampleRate = this.f192105e.getSampleRate();
                        StringBuilder sb9 = new StringBuilder(85);
                        sb9.append("AudioRecord: session ID: ");
                        sb9.append(audioSessionId2);
                        sb9.append(", channels: ");
                        sb9.append(channelCount);
                        sb9.append(", sample rate: ");
                        sb9.append(sampleRate);
                        Logging.m151178a("WebRtcAudioRecordExternal", sb9.toString());
                        int i11 = Build.VERSION.SDK_INT;
                        int bufferSizeInFrames = this.f192105e.getBufferSizeInFrames();
                        StringBuilder sb10 = new StringBuilder(47);
                        sb10.append("AudioRecord: buffer size in frames: ");
                        sb10.append(bufferSizeInFrames);
                        Logging.m151178a("WebRtcAudioRecordExternal", sb10.toString());
                        int a = mo86973a(false);
                        if (a != 0) {
                            StringBuilder sb11 = new StringBuilder(59);
                            sb11.append("Potential microphone conflict. Active sessions: ");
                            sb11.append(a);
                            Logging.m151181c("WebRtcAudioRecordExternal", sb11.toString());
                        }
                        return i5;
                    }
                    m151204a("Creation or initialization of audio recorder failed.");
                    m151201a();
                    return -1;
                } catch (IllegalArgumentException | UnsupportedOperationException e) {
                    m151204a(e.getMessage());
                    m151201a();
                    return -1;
                }
            } else {
                StringBuilder sb12 = new StringBuilder(28);
                sb12.append("Bad audio format ");
                sb12.append(i6);
                throw new IllegalArgumentException(sb12.toString());
            }
        } else {
            m151204a("InitRecording called twice without StopRecording.");
            return -1;
        }
    }

    private native void nativeCacheDirectBufferAddress(long j, ByteBuffer byteBuffer);

    private boolean startRecording() {
        Logging.m151178a("WebRtcAudioRecordExternal", "startRecording");
        m151205b(this.f192105e != null);
        m151205b(this.f192111k == null);
        try {
            this.f192105e.startRecording();
            if (this.f192105e.getRecordingState() != 3) {
                int recordingState = this.f192105e.getRecordingState();
                StringBuilder sb = new StringBuilder(64);
                sb.append("AudioRecord.startRecording failed - incorrect state: ");
                sb.append(recordingState);
                m151203a(2, sb.toString());
                return false;
            }
            civa civa = new civa(this, "AudioRecordJavaThread");
            this.f192111k = civa;
            civa.start();
            Logging.m151178a("WebRtcAudioRecordExternal", "scheduleLogRecordingConfigurationsTask");
            int i = Build.VERSION.SDK_INT;
            ScheduledExecutorService scheduledExecutorService = this.f192112l;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdownNow();
            }
            this.f192112l = Executors.newSingleThreadScheduledExecutor();
            ciuz ciuz = new ciuz(this);
            ScheduledFuture scheduledFuture = this.f192113m;
            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                this.f192113m.cancel(true);
            }
            this.f192113m = this.f192112l.schedule(ciuz, 100, TimeUnit.MILLISECONDS);
            return true;
        } catch (IllegalStateException e) {
            String valueOf = String.valueOf(e.getMessage());
            m151203a(1, valueOf.length() == 0 ? new String("AudioRecord.startRecording failed: ") : "AudioRecord.startRecording failed: ".concat(valueOf));
            return false;
        }
    }

    private boolean stopRecording() {
        boolean z;
        Logging.m151178a("WebRtcAudioRecordExternal", "stopRecording");
        if (this.f192111k != null) {
            z = true;
        } else {
            z = false;
        }
        m151205b(z);
        ScheduledFuture scheduledFuture = this.f192113m;
        if (scheduledFuture != null) {
            if (!scheduledFuture.isDone()) {
                this.f192113m.cancel(true);
            }
            this.f192113m = null;
        }
        ScheduledExecutorService scheduledExecutorService = this.f192112l;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
            this.f192112l = null;
        }
        civa civa = this.f192111k;
        Logging.m151178a("WebRtcAudioRecordExternal", "stopThread");
        civa.f191521a = false;
        if (!ciur.m151032a(this.f192111k)) {
            Logging.m151180b("WebRtcAudioRecordExternal", "Join of AudioRecordJavaThread timed out");
            civc.m151039a("WebRtcAudioRecordExternal", this.f192101a, this.f192102b);
        }
        this.f192111k = null;
        ciuy ciuy = this.f192110j;
        Logging.m151178a("WebRtcAudioEffectsExternal", BuildConfig.BUILD_TYPE);
        AcousticEchoCanceler acousticEchoCanceler = ciuy.f191516a;
        if (acousticEchoCanceler != null) {
            acousticEchoCanceler.release();
            ciuy.f191516a = null;
        }
        NoiseSuppressor noiseSuppressor = ciuy.f191517b;
        if (noiseSuppressor != null) {
            noiseSuppressor.release();
            ciuy.f191517b = null;
        }
        m151201a();
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean isAcousticEchoCancelerSupported() {
        return this.f192116p;
    }

    /* access modifiers changed from: package-private */
    public boolean isAudioConfigVerified() {
        return this.f192115o;
    }

    /* access modifiers changed from: package-private */
    public boolean isAudioSourceMatchingRecordingSession() {
        if (this.f192115o) {
            return this.f192114n;
        }
        Logging.m151181c("WebRtcAudioRecordExternal", "Audio configuration has not yet been verified");
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean isNoiseSuppressorSupported() {
        return this.f192117q;
    }

    public native void nativeDataIsRecorded(long j, int i);

    public void setNativeAudioRecord(long j) {
        this.f192103c = j;
    }

    public WebRtcAudioRecord(Context context, AudioManager audioManager, boolean z, boolean z2) {
        this.f192110j = new ciuy();
        if (z && !ciuy.m151034a()) {
            throw new IllegalArgumentException("HW AEC not supported");
        } else if (z2 && !ciuy.m151036b()) {
            throw new IllegalArgumentException("HW NS not supported");
        } else {
            this.f192101a = context;
            this.f192102b = audioManager;
            this.f192108h = 7;
            this.f192109i = 2;
            this.f192107g = null;
            this.f192116p = z;
            this.f192117q = z2;
            String valueOf = String.valueOf(civc.m151037a());
            Logging.m151178a("WebRtcAudioRecordExternal", valueOf.length() == 0 ? new String("ctor") : "ctor".concat(valueOf));
        }
    }

    /* renamed from: a */
    public static final void m151202a(int i) {
        String str = i != 0 ? "STOP" : "START";
        Logging.m151178a("WebRtcAudioRecordExternal", str.length() == 0 ? new String("doAudioRecordStateCallback: ") : "doAudioRecordStateCallback: ".concat(str));
    }

    /* renamed from: a */
    private final void m151203a(int i, String str) {
        String str2 = i != 1 ? "AUDIO_RECORD_START_STATE_MISMATCH" : "AUDIO_RECORD_START_EXCEPTION";
        StringBuilder sb = new StringBuilder(str2.length() + 25 + String.valueOf(str).length());
        sb.append("Start recording error: ");
        sb.append(str2);
        sb.append(". ");
        sb.append(str);
        Logging.m151180b("WebRtcAudioRecordExternal", sb.toString());
        civc.m151039a("WebRtcAudioRecordExternal", this.f192101a, this.f192102b);
        mo86973a(false);
    }

    /* renamed from: a */
    private final void m151204a(String str) {
        String valueOf = String.valueOf(str);
        Logging.m151180b("WebRtcAudioRecordExternal", valueOf.length() == 0 ? new String("Init recording error: ") : "Init recording error: ".concat(valueOf));
        civc.m151039a("WebRtcAudioRecordExternal", this.f192101a, this.f192102b);
        mo86973a(false);
    }

    /* renamed from: a */
    public final int mo86973a(boolean z) {
        boolean z2;
        String str;
        int i = Build.VERSION.SDK_INT;
        if (this.f192105e == null) {
            return 0;
        }
        List<AudioRecordingConfiguration> activeRecordingConfigurations = this.f192102b.getActiveRecordingConfigurations();
        int size = activeRecordingConfigurations.size();
        StringBuilder sb = new StringBuilder(48);
        sb.append("Number of active recording sessions: ");
        sb.append(size);
        Logging.m151178a("WebRtcAudioRecordExternal", sb.toString());
        if (size > 0) {
            int audioSessionId = this.f192105e.getAudioSessionId();
            m151205b(!activeRecordingConfigurations.isEmpty());
            Logging.m151178a("WebRtcAudioRecordExternal", "AudioRecordingConfigurations: ");
            for (AudioRecordingConfiguration audioRecordingConfiguration : activeRecordingConfigurations) {
                StringBuilder sb2 = new StringBuilder();
                int clientAudioSource = audioRecordingConfiguration.getClientAudioSource();
                sb2.append("  client audio source=");
                switch (clientAudioSource) {
                    case 0:
                        str = "DEFAULT";
                        break;
                    case 1:
                        str = "MIC";
                        break;
                    case 2:
                        str = "VOICE_UPLINK";
                        break;
                    case 3:
                        str = "VOICE_DOWNLINK";
                        break;
                    case 4:
                        str = "VOICE_CALL";
                        break;
                    case 5:
                        str = "CAMCORDER";
                        break;
                    case 6:
                        str = "VOICE_RECOGNITION";
                        break;
                    case 7:
                        str = "VOICE_COMMUNICATION";
                        break;
                    case 8:
                    default:
                        str = "INVALID";
                        break;
                    case 9:
                        str = "UNPROCESSED";
                        break;
                    case 10:
                        str = "VOICE_PERFORMANCE";
                        break;
                }
                sb2.append(str);
                sb2.append(", client session id=");
                sb2.append(audioRecordingConfiguration.getClientAudioSessionId());
                sb2.append(" (");
                sb2.append(audioSessionId);
                sb2.append(")\n");
                AudioFormat format = audioRecordingConfiguration.getFormat();
                sb2.append("  Device AudioFormat: channel count=");
                sb2.append(format.getChannelCount());
                sb2.append(", channel index mask=");
                sb2.append(format.getChannelIndexMask());
                sb2.append(", channel mask=");
                sb2.append(civc.m151040b(format.getChannelMask()));
                sb2.append(", encoding=");
                sb2.append(civc.m151041c(format.getEncoding()));
                sb2.append(", sample rate=");
                sb2.append(format.getSampleRate());
                sb2.append("\n");
                AudioFormat clientFormat = audioRecordingConfiguration.getClientFormat();
                sb2.append("  Client AudioFormat: channel count=");
                sb2.append(clientFormat.getChannelCount());
                sb2.append(", channel index mask=");
                sb2.append(clientFormat.getChannelIndexMask());
                sb2.append(", channel mask=");
                sb2.append(civc.m151040b(clientFormat.getChannelMask()));
                sb2.append(", encoding=");
                sb2.append(civc.m151041c(clientFormat.getEncoding()));
                sb2.append(", sample rate=");
                sb2.append(clientFormat.getSampleRate());
                sb2.append("\n");
                AudioDeviceInfo audioDevice = audioRecordingConfiguration.getAudioDevice();
                if (audioDevice != null) {
                    m151205b(audioDevice.isSource());
                    sb2.append("  AudioDevice: type=");
                    sb2.append(civc.m151038a(audioDevice.getType()));
                    sb2.append(", id=");
                    sb2.append(audioDevice.getId());
                }
                Logging.m151178a("WebRtcAudioRecordExternal", sb2.toString());
            }
            if (z) {
                int audioSource = this.f192105e.getAudioSource();
                int audioSessionId2 = this.f192105e.getAudioSessionId();
                AudioFormat format2 = this.f192105e.getFormat();
                AudioDeviceInfo routedDevice = this.f192105e.getRoutedDevice();
                m151205b(!activeRecordingConfigurations.isEmpty());
                Iterator<AudioRecordingConfiguration> it = activeRecordingConfigurations.iterator();
                while (true) {
                    if (it.hasNext()) {
                        AudioRecordingConfiguration next = it.next();
                        AudioDeviceInfo audioDevice2 = next.getAudioDevice();
                        if (audioDevice2 != null && next.getClientAudioSource() == audioSource && next.getClientAudioSessionId() == audioSessionId2 && next.getClientFormat().getEncoding() == format2.getEncoding() && next.getClientFormat().getSampleRate() == format2.getSampleRate() && next.getClientFormat().getChannelMask() == format2.getChannelMask() && next.getClientFormat().getChannelIndexMask() == format2.getChannelIndexMask() && next.getFormat().getEncoding() != 0 && next.getFormat().getSampleRate() > 0) {
                            if (!(next.getFormat().getChannelMask() == 0 && next.getFormat().getChannelIndexMask() == 0) && audioDevice2.getId() == routedDevice.getId() && audioDevice2.getType() == routedDevice.getType()) {
                                Logging.m151178a("WebRtcAudioRecordExternal", "verifyAudioConfig: PASS");
                                z2 = true;
                            }
                        }
                    } else {
                        Logging.m151180b("WebRtcAudioRecordExternal", "verifyAudioConfig: FAILED");
                        z2 = false;
                    }
                }
                this.f192114n = z2;
                this.f192115o = true;
                return size;
            }
        }
        return size;
    }
}
