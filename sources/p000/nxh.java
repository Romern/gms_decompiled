package p000;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Process;
import android.view.Surface;
import java.nio.ByteBuffer;

/* renamed from: nxh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nxh extends odt {

    /* renamed from: a */
    public static final bnsn f36860a = odk.m28481a("CAR.AUDIO");

    /* renamed from: b */
    public final int f36861b;

    /* renamed from: c */
    public final int f36862c;

    /* renamed from: d */
    public final int f36863d;

    /* renamed from: e */
    public ByteBuffer[] f36864e;

    public nxh(int i, int i2, int i3) {
        super(null);
        this.f36861b = i;
        this.f36862c = i2;
        this.f36863d = i3;
    }

    /* renamed from: a */
    public final int mo21782a(nwy nwy) {
        nwy nwy2 = nwy;
        long j = (long) (1000000 / ((this.f36861b * this.f36863d) * (this.f36862c / 8)));
        if (this.f36864e == null) {
            this.f36864e = this.f37307k.f36450a.getInputBuffers();
        }
        int b = nwy.mo21773b();
        int a = nwy.mo21772a();
        long j2 = nwy2.f36851a;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= b) {
                break;
            }
            try {
                int a2 = this.f37307k.mo21566a(500000);
                if (a2 < 0) {
                    bnsi b2 = f36860a.mo68387b();
                    b2.mo68432a("nxh", "a", 101, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    b2.mo68405a("Encoder input buffer unavailable. Dropping audio data");
                    break;
                }
                this.f36864e[a2].clear();
                int min = Math.min(b - i, this.f36864e[a2].limit());
                this.f36864e[a2].put(nwy2.f36852b.array(), a + i, min);
                int i3 = min;
                this.f37307k.mo21567a(a2, min, j2, 0);
                i += i3;
                if (j2 != 0) {
                    j2 += ((long) i3) * j;
                }
                i2++;
                nwy2 = nwy;
            } catch (IllegalStateException e) {
                bnsi c = f36860a.mo68388c();
                c.mo68437a(e);
                c.mo68432a("nxh", "a", 124, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                c.mo68405a("mediacodec failed, already stopped?");
            }
        }
        return i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo21784a(MediaCodec.BufferInfo bufferInfo, ByteBuffer byteBuffer) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo21785b() {
        int a = this.f37307k.mo21566a(-1);
        if (a >= 0) {
            this.f37307k.mo21567a(a, 0, 0, 4);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo21786c() {
        Process.setThreadPriority(-19);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final String mo21787d() {
        return "Audio EncodingThread";
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo21788e() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final nto mo21783a() {
        MediaFormat createAudioFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", this.f36861b, this.f36863d);
        createAudioFormat.setInteger("aac-profile", 2);
        createAudioFormat.setInteger("bitrate", Math.min(((this.f36861b * this.f36863d) * 16) / 2, 512000));
        MediaCodec createEncoderByType = MediaCodec.createEncoderByType("audio/mp4a-latm");
        createEncoderByType.configure(createAudioFormat, (Surface) null, (MediaCrypto) null, 1);
        createEncoderByType.start();
        return new nto(createEncoderByType);
    }
}
