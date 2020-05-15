package p000;

import java.nio.ByteBuffer;
import java.util.concurrent.Semaphore;

/* renamed from: nxj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nxj {

    /* renamed from: a */
    public static final bnsn f36866a = odk.m28481a("CAR.AUDIO");

    /* renamed from: b */
    public final int f36867b;

    /* renamed from: c */
    public final int f36868c;

    /* renamed from: d */
    public final int f36869d;

    /* renamed from: e */
    public final boolean f36870e;

    /* renamed from: f */
    public final Semaphore f36871f = new Semaphore(0);

    /* renamed from: g */
    public ByteBuffer f36872g;

    /* renamed from: h */
    public final Semaphore f36873h = new Semaphore(0);

    /* renamed from: i */
    public final nwz f36874i;

    /* renamed from: j */
    public final nxi f36875j = new nxi(this);

    /* renamed from: k */
    public nxh f36876k;

    /* renamed from: l */
    public boolean f36877l = false;

    public nxj(int i, int i2, nwz nwz, boolean z) {
        this.f36867b = i;
        this.f36868c = 16;
        this.f36869d = i2;
        this.f36870e = z;
        this.f36874i = nwz;
    }

    /* renamed from: a */
    public final synchronized ByteBuffer mo21793a() {
        if (this.f36872g != null) {
            try {
                this.f36871f.acquire();
                ByteBuffer byteBuffer = this.f36872g;
                this.f36872g = null;
                return byteBuffer;
            } catch (InterruptedException e) {
                return null;
            }
        }
    }

    /* renamed from: b */
    public final void mo21795b() {
        if (this.f36877l) {
            this.f36872g = null;
            nxh nxh = this.f36876k;
            if (nxh != null) {
                nxh.mo22034h();
                this.f36876k = null;
            }
            this.f36877l = false;
        }
    }

    /* renamed from: a */
    public final byte[] mo21794a(int i) {
        int i2 = i + 7;
        return new byte[]{-1, -7, (byte) (((this.f36867b == 16000 ? 8 : 3) << 2) + 64), (byte) ((this.f36869d << 6) + (i2 >> 11)), (byte) ((i2 & 2047) >> 3), (byte) (((i2 & 7) << 5) + 31), -4};
    }
}
