package p000;

import android.media.AudioTrack;

/* renamed from: gdb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class gdb implements Runnable {

    /* renamed from: a */
    final /* synthetic */ gdd f17912a;

    /* renamed from: b */
    private final AudioTrack f17913b;

    /* renamed from: c */
    private final int f17914c;

    /* renamed from: d */
    private final byte[] f17915d;

    /* renamed from: e */
    private final byte[] f17916e;

    /* renamed from: f */
    private final Runnable f17917f;

    /* renamed from: g */
    private final adzt f17918g;

    /* renamed from: h */
    private int f17919h;

    /* renamed from: i */
    private final int f17920i;

    public gdb(gdd gdd, AudioTrack audioTrack, int i, byte[] bArr, byte[] bArr2, Runnable runnable, adzt adzt, int i2) {
        this.f17912a = gdd;
        this.f17913b = audioTrack;
        this.f17914c = i;
        this.f17915d = bArr;
        this.f17916e = bArr2;
        this.f17917f = runnable;
        this.f17918g = adzt;
        this.f17919h = gdd.m12964d(audioTrack.getSampleRate()) / 2;
        if (audioTrack.getAudioFormat() == 2) {
            int i3 = this.f17919h;
            if (i3 % 2 != 0) {
                this.f17919h = i3 + 1;
            }
        }
        this.f17920i = i2;
    }

    public final void run() {
        try {
            if (this.f17913b.getPlayState() != 3) {
                this.f17913b.flush();
                this.f17913b.play();
            }
            byte[] bArr = this.f17915d;
            int i = this.f17919h;
            int i2 = this.f17920i;
            int i3 = 0;
            boolean z = false;
            while (!this.f17912a.f17928h[this.f17914c]) {
                int length = bArr.length;
                int min = Math.min(i, length - i3);
                this.f17913b.write(bArr, i3, min);
                i3 += min;
                if (i3 >= length) {
                    if (z) {
                        if (i2 > 0) {
                            i2--;
                        }
                        if (i2 == 0) {
                            break;
                        }
                    } else {
                        bArr = this.f17916e;
                        z = true;
                    }
                    i3 = 0;
                }
                i -= min;
                if (i == 0) {
                    i = this.f17919h;
                }
            }
            this.f17913b.pause();
        } finally {
            this.f17918g.post(this.f17917f);
        }
    }
}
