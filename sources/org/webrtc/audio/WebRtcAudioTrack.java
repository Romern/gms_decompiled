package org.webrtc.audio;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Build;
import java.nio.ByteBuffer;
import java.util.Timer;
import org.webrtc.Logging;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class WebRtcAudioTrack {

    /* renamed from: g */
    public static final /* synthetic */ int f192118g = 0;

    /* renamed from: a */
    public long f192119a;

    /* renamed from: b */
    public final Context f192120b;

    /* renamed from: c */
    public final AudioManager f192121c;

    /* renamed from: d */
    public ByteBuffer f192122d;

    /* renamed from: e */
    public AudioTrack f192123e;

    /* renamed from: f */
    public volatile boolean f192124f;

    /* renamed from: h */
    private final ciuq f192125h;

    /* renamed from: i */
    private civb f192126i;

    /* renamed from: j */
    private final ciux f192127j;

    WebRtcAudioTrack(Context context, AudioManager audioManager) {
        this(context, audioManager, null);
    }

    private int GetPlayoutUnderrunCount() {
        int i = Build.VERSION.SDK_INT;
        AudioTrack audioTrack = this.f192123e;
        if (audioTrack != null) {
            return audioTrack.getUnderrunCount();
        }
        return -1;
    }

    /* renamed from: a */
    private final void m151207a() {
        Logging.m151178a("WebRtcAudioTrackExternal", "releaseAudioResources");
        AudioTrack audioTrack = this.f192123e;
        if (audioTrack != null) {
            audioTrack.release();
            this.f192123e = null;
        }
    }

    private int getStreamMaxVolume() {
        this.f192125h.mo86583a();
        Logging.m151178a("WebRtcAudioTrackExternal", "getStreamMaxVolume");
        return this.f192121c.getStreamMaxVolume(0);
    }

    private int getStreamVolume() {
        this.f192125h.mo86583a();
        Logging.m151178a("WebRtcAudioTrackExternal", "getStreamVolume");
        return this.f192121c.getStreamVolume(0);
    }

    private boolean initPlayout(int i, int i2, double d) {
        this.f192125h.mo86583a();
        StringBuilder sb = new StringBuilder(100);
        sb.append("initPlayout(sampleRate=");
        sb.append(i);
        sb.append(", channels=");
        sb.append(i2);
        sb.append(", bufferSizeFactor=");
        sb.append(d);
        sb.append(")");
        Logging.m151178a("WebRtcAudioTrackExternal", sb.toString());
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect((i2 + i2) * (i / 100));
        this.f192122d = allocateDirect;
        int capacity = allocateDirect.capacity();
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append("byteBuffer.capacity: ");
        sb2.append(capacity);
        Logging.m151178a("WebRtcAudioTrackExternal", sb2.toString());
        byte[] bArr = new byte[this.f192122d.capacity()];
        nativeCacheDirectBufferAddress(this.f192119a, this.f192122d);
        int i3 = i2 == 1 ? 4 : 12;
        double minBufferSize = (double) AudioTrack.getMinBufferSize(i, i3, 2);
        Double.isNaN(minBufferSize);
        int i4 = (int) (minBufferSize * d);
        StringBuilder sb3 = new StringBuilder(33);
        sb3.append("minBufferSizeInBytes: ");
        sb3.append(i4);
        Logging.m151178a("WebRtcAudioTrackExternal", sb3.toString());
        if (i4 < this.f192122d.capacity()) {
            m151209a("AudioTrack.getMinBufferSize returns an invalid value.");
            return false;
        } else if (this.f192123e == null) {
            try {
                int i5 = Build.VERSION.SDK_INT;
                Logging.m151178a("WebRtcAudioTrackExternal", "createAudioTrackOnLollipopOrHigher");
                int nativeOutputSampleRate = AudioTrack.getNativeOutputSampleRate(0);
                StringBuilder sb4 = new StringBuilder(35);
                sb4.append("nativeOutputSampleRate: ");
                sb4.append(nativeOutputSampleRate);
                Logging.m151178a("WebRtcAudioTrackExternal", sb4.toString());
                if (i != nativeOutputSampleRate) {
                    Logging.m151181c("WebRtcAudioTrackExternal", "Unable to use fast mode since requested sample rate is not native");
                }
                AudioTrack audioTrack = new AudioTrack(new AudioAttributes.Builder().setUsage(2).setContentType(1).build(), new AudioFormat.Builder().setEncoding(2).setSampleRate(i).setChannelMask(i3).build(), i4, 1, 0);
                this.f192123e = audioTrack;
                if (audioTrack.getState() == 1) {
                    int audioSessionId = this.f192123e.getAudioSessionId();
                    int channelCount = this.f192123e.getChannelCount();
                    int sampleRate = this.f192123e.getSampleRate();
                    float maxVolume = AudioTrack.getMaxVolume();
                    StringBuilder sb5 = new StringBuilder(111);
                    sb5.append("AudioTrack: session ID: ");
                    sb5.append(audioSessionId);
                    sb5.append(", channels: ");
                    sb5.append(channelCount);
                    sb5.append(", sample rate: ");
                    sb5.append(sampleRate);
                    sb5.append(", max gain: ");
                    sb5.append(maxVolume);
                    Logging.m151178a("WebRtcAudioTrackExternal", sb5.toString());
                    int i6 = Build.VERSION.SDK_INT;
                    int bufferSizeInFrames = this.f192123e.getBufferSizeInFrames();
                    StringBuilder sb6 = new StringBuilder(46);
                    sb6.append("AudioTrack: buffer size in frames: ");
                    sb6.append(bufferSizeInFrames);
                    Logging.m151178a("WebRtcAudioTrackExternal", sb6.toString());
                    int i7 = Build.VERSION.SDK_INT;
                    int bufferCapacityInFrames = this.f192123e.getBufferCapacityInFrames();
                    StringBuilder sb7 = new StringBuilder(50);
                    sb7.append("AudioTrack: buffer capacity in frames: ");
                    sb7.append(bufferCapacityInFrames);
                    Logging.m151178a("WebRtcAudioTrackExternal", sb7.toString());
                    return true;
                }
                m151209a("Initialization of audio track failed.");
                m151207a();
                return false;
            } catch (IllegalArgumentException e) {
                m151209a(e.getMessage());
                m151207a();
                return false;
            }
        } else {
            m151209a("Conflict with existing AudioTrack.");
            return false;
        }
    }

    private static native void nativeCacheDirectBufferAddress(long j, ByteBuffer byteBuffer);

    public static native void nativeGetPlayoutData(long j, int i);

    private boolean setStreamVolume(int i) {
        this.f192125h.mo86583a();
        StringBuilder sb = new StringBuilder(28);
        sb.append("setStreamVolume(");
        sb.append(i);
        sb.append(")");
        Logging.m151178a("WebRtcAudioTrackExternal", sb.toString());
        int i2 = Build.VERSION.SDK_INT;
        if (!this.f192121c.isVolumeFixed()) {
            this.f192121c.setStreamVolume(0, i, 0);
            return true;
        }
        Logging.m151180b("WebRtcAudioTrackExternal", "The device implements a fixed volume policy.");
        return false;
    }

    private boolean startPlayout() {
        boolean z;
        boolean z2;
        this.f192125h.mo86583a();
        ciux ciux = this.f192127j;
        String valueOf = String.valueOf(civc.m151037a());
        Logging.m151178a("VolumeLogger", valueOf.length() == 0 ? new String("start") : "start".concat(valueOf));
        if (ciux.f191512b == null) {
            String d = civc.m151042d(ciux.f191511a.getMode());
            Logging.m151178a("VolumeLogger", d.length() == 0 ? new String("audio mode is: ") : "audio mode is: ".concat(d));
            ciux.f191512b = new Timer("WebRtcVolumeLevelLoggerThread");
            ciux.f191512b.schedule(new ciuw(ciux, ciux.f191511a.getStreamMaxVolume(2), ciux.f191511a.getStreamMaxVolume(0)), 0, 30000);
        }
        Logging.m151178a("WebRtcAudioTrackExternal", "startPlayout");
        if (this.f192123e != null) {
            z = true;
        } else {
            z = false;
        }
        m151210a(z);
        if (this.f192126i == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        m151210a(z2);
        try {
            this.f192123e.play();
            if (this.f192123e.getPlayState() != 3) {
                int playState = this.f192123e.getPlayState();
                StringBuilder sb = new StringBuilder(53);
                sb.append("AudioTrack.play failed - incorrect state :");
                sb.append(playState);
                m151208a(2, sb.toString());
                m151207a();
                return false;
            }
            civb civb = new civb(this, "AudioTrackJavaThread");
            this.f192126i = civb;
            civb.start();
            return true;
        } catch (IllegalStateException e) {
            String valueOf2 = String.valueOf(e.getMessage());
            m151208a(1, valueOf2.length() == 0 ? new String("AudioTrack.play failed: ") : "AudioTrack.play failed: ".concat(valueOf2));
            m151207a();
            return false;
        }
    }

    private boolean stopPlayout() {
        boolean z;
        this.f192125h.mo86583a();
        ciux ciux = this.f192127j;
        String valueOf = String.valueOf(civc.m151037a());
        Logging.m151178a("VolumeLogger", valueOf.length() == 0 ? new String("stop") : "stop".concat(valueOf));
        Timer timer = ciux.f191512b;
        if (timer != null) {
            timer.cancel();
            ciux.f191512b = null;
        }
        Logging.m151178a("WebRtcAudioTrackExternal", "stopPlayout");
        if (this.f192126i != null) {
            z = true;
        } else {
            z = false;
        }
        m151210a(z);
        int i = Build.VERSION.SDK_INT;
        int underrunCount = this.f192123e.getUnderrunCount();
        StringBuilder sb = new StringBuilder(27);
        sb.append("underrun count: ");
        sb.append(underrunCount);
        Logging.m151178a("WebRtcAudioTrackExternal", sb.toString());
        civb civb = this.f192126i;
        Logging.m151178a("WebRtcAudioTrackExternal", "stopThread");
        civb.f191523a = false;
        Logging.m151178a("WebRtcAudioTrackExternal", "Stopping the AudioTrackThread...");
        this.f192126i.interrupt();
        if (!ciur.m151032a(this.f192126i)) {
            Logging.m151180b("WebRtcAudioTrackExternal", "Join of AudioTrackThread timed out.");
            civc.m151039a("WebRtcAudioTrackExternal", this.f192120b, this.f192121c);
        }
        Logging.m151178a("WebRtcAudioTrackExternal", "AudioTrackThread has now been stopped.");
        this.f192126i = null;
        if (this.f192123e != null) {
            Logging.m151178a("WebRtcAudioTrackExternal", "Calling AudioTrack.stop...");
            try {
                this.f192123e.stop();
                Logging.m151178a("WebRtcAudioTrackExternal", "AudioTrack.stop is done.");
                mo86980a(1);
            } catch (IllegalStateException e) {
                String valueOf2 = String.valueOf(e.getMessage());
                Logging.m151180b("WebRtcAudioTrackExternal", valueOf2.length() == 0 ? new String("AudioTrack.stop failed: ") : "AudioTrack.stop failed: ".concat(valueOf2));
            }
        }
        m151207a();
        return true;
    }

    public void setNativeAudioTrack(long j) {
        this.f192119a = j;
    }

    static {
        int i = Build.VERSION.SDK_INT;
    }

    public WebRtcAudioTrack(Context context, AudioManager audioManager, byte[] bArr) {
        ciuq ciuq = new ciuq();
        this.f192125h = ciuq;
        ciuq.f191501a = null;
        this.f192120b = context;
        this.f192121c = audioManager;
        this.f192127j = new ciux(audioManager);
        String valueOf = String.valueOf(civc.m151037a());
        Logging.m151178a("WebRtcAudioTrackExternal", valueOf.length() == 0 ? new String("ctor") : "ctor".concat(valueOf));
    }

    /* renamed from: a */
    private final void m151208a(int i, String str) {
        String str2 = i != 1 ? "AUDIO_TRACK_START_STATE_MISMATCH" : "AUDIO_TRACK_START_EXCEPTION";
        StringBuilder sb = new StringBuilder(str2.length() + 23 + String.valueOf(str).length());
        sb.append("Start playout error: ");
        sb.append(str2);
        sb.append(". ");
        sb.append(str);
        Logging.m151180b("WebRtcAudioTrackExternal", sb.toString());
        civc.m151039a("WebRtcAudioTrackExternal", this.f192120b, this.f192121c);
    }

    /* renamed from: a */
    private final void m151209a(String str) {
        String valueOf = String.valueOf(str);
        Logging.m151180b("WebRtcAudioTrackExternal", valueOf.length() == 0 ? new String("Init playout error: ") : "Init playout error: ".concat(valueOf));
        civc.m151039a("WebRtcAudioTrackExternal", this.f192120b, this.f192121c);
    }

    /* renamed from: a */
    public static void m151210a(boolean z) {
        if (!z) {
            throw new AssertionError("Expected condition to be true");
        }
    }

    /* renamed from: a */
    public final void mo86980a(int i) {
        StringBuilder sb = new StringBuilder(38);
        sb.append("doAudioTrackStateCallback: ");
        sb.append(i);
        Logging.m151178a("WebRtcAudioTrackExternal", sb.toString());
    }
}
