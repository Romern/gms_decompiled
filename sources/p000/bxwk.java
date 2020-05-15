package p000;

/* renamed from: bxwk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bxwk {

    /* renamed from: a */
    protected volatile bxxc f164995a;

    /* renamed from: b */
    public volatile bxtx f164996b;

    static {
        bxus.m123743b();
    }

    /* renamed from: a */
    public final bxtx mo74186a() {
        if (this.f164996b != null) {
            return this.f164996b;
        }
        synchronized (this) {
            if (this.f164996b != null) {
                bxtx bxtx = this.f164996b;
                return bxtx;
            }
            if (this.f164995a != null) {
                this.f164996b = this.f164995a.mo73639aL();
            } else {
                this.f164996b = bxtx.f164797b;
            }
            bxtx bxtx2 = this.f164996b;
            return bxtx2;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bxwk)) {
            return false;
        }
        bxwk bxwk = (bxwk) obj;
        bxxc bxxc = this.f164995a;
        bxxc bxxc2 = bxwk.f164995a;
        if (bxxc == null && bxxc2 == null) {
            return mo74186a().equals(bxwk.mo74186a());
        }
        if (bxxc != null && bxxc2 != null) {
            return bxxc.equals(bxxc2);
        }
        if (bxxc == null) {
            return mo74187a(bxxc2.mo74067j()).equals(bxxc2);
        }
        return bxxc.equals(bxwk.mo74187a(bxxc.mo74067j()));
    }

    public int hashCode() {
        return 1;
    }

    /* renamed from: a */
    public final bxxc mo74187a(bxxc bxxc) {
        if (this.f164995a == null) {
            synchronized (this) {
                if (this.f164995a == null) {
                    try {
                        this.f164995a = bxxc;
                        this.f164996b = bxtx.f164797b;
                    } catch (bxwf e) {
                        this.f164995a = bxxc;
                        this.f164996b = bxtx.f164797b;
                    }
                }
            }
        }
        return this.f164995a;
    }
}
