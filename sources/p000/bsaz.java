package p000;

import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* renamed from: bsaz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsaz {

    /* renamed from: b */
    private static final bsay[] f143919b = new bsay[168];

    /* renamed from: a */
    public final bsbh f143920a;

    static {
        int i = 0;
        for (int i2 = 0; i2 <= 7; i2++) {
            int i3 = 16;
            while (i3 < 37) {
                f143919b[i] = new bsay((i2 << 8) + i3, null);
                i3++;
                i++;
            }
        }
    }

    public bsaz() {
        this.f143920a = new bsbh();
    }

    /* renamed from: a */
    public final int mo70144a(int i) {
        bsay bsay = (bsay) this.f143920a.mo70166a(i);
        if (bsay != null) {
            return bsay.f143917a & 255;
        }
        return 16;
    }

    /* renamed from: b */
    public final Object mo70147b(int i) {
        bsay bsay = (bsay) this.f143920a.mo70166a(i);
        if (bsay != null) {
            return bsay.f143918b;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bsaz) {
            return this.f143920a.equals(((bsaz) obj).f143920a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f143920a.hashCode();
    }

    public bsaz(int i) {
        this.f143920a = new bsbh(i + 1);
    }

    /* renamed from: a */
    public final void mo70145a(int i, int i2, Object obj) {
        bsay bsay;
        bsbh bsbh = this.f143920a;
        if (obj == null) {
            bsay = f143919b[(((i >> 8) & 255) * 21) + ((i & 255) - 16)];
        } else {
            bsay = new bsay(i, obj);
        }
        bsbh.mo70167a(i2, bsay);
    }

    /* renamed from: a */
    public final boolean mo70146a(bsax bsax) {
        int i;
        bsbg a = this.f143920a.mo70165a();
        while (a.mo70163a()) {
            int b = a.mo70164b();
            bsay bsay = (bsay) this.f143920a.mo70166a(b);
            if (bsay != null) {
                i = bsay.f143917a & 65280;
            } else {
                i = 1536;
            }
            if ((i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 && !bsax.mo70137i(b)) {
                return false;
            }
            int j = bsax.mo70138j(b);
            if ((i & 1024) == 0 && j > 1) {
                return false;
            }
            if (mo70144a(b) == 27 && (mo70147b(b) instanceof bsaz)) {
                bsaz bsaz = (bsaz) mo70147b(b);
                if (bsaz != null) {
                    int i2 = 0;
                    while (i2 < j) {
                        if (bsaz.mo70146a(bsax.mo70131f(b, i2))) {
                            i2++;
                        }
                    }
                    continue;
                }
                return false;
            }
        }
        return true;
    }
}
