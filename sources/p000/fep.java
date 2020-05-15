package p000;

import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.Collections;

/* renamed from: fep */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fep {

    /* renamed from: a */
    public final fcg f16405a;

    /* renamed from: b */
    public final feh f16406b;

    /* renamed from: c */
    public final feo f16407c;

    /* renamed from: d */
    public final fdp f16408d;

    public fep(fcg fcg, feh feh, feo feo, fdp fdp) {
        this.f16405a = fcg;
        this.f16406b = feh;
        this.f16407c = feo;
        this.f16408d = fdp;
    }

    /* renamed from: a */
    public final void mo10758a() {
        this.f16406b.mo10749a(feg.BACK);
    }

    /* renamed from: b */
    public final void mo10761b() {
        this.f16406b.mo10747a();
    }

    /* renamed from: c */
    public final ffk mo10763c() {
        return this.f16405a.mo10683b();
    }

    /* renamed from: d */
    public final esr mo10764d() {
        return this.f16405a.f16265c;
    }

    /* renamed from: e */
    public final void mo10765e() {
        this.f16405a.mo10679a();
    }

    /* renamed from: a */
    public final void mo10759a(bsxn bsxn) {
        this.f16405a.mo10680a(bsxn);
    }

    /* renamed from: b */
    public final void mo10762b(bsxn bsxn, bsxn bsxn2) {
        ffv a = this.f16408d.mo10739a();
        bxvd da = bsps.f146574k.mo74144da();
        int i = bsxn.f147589b;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bsps bsps = (bsps) da.f164949b;
        int i2 = bsps.f146576a | 1;
        bsps.f146576a = i2;
        bsps.f146577b = i;
        int i3 = bsxn2.f147589b;
        bsps.f146576a = i2 | 2;
        bsps.f146578c = i3;
        int c = a.mo10790c();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bsps bsps2 = (bsps) da.f164949b;
        bsps2.f146585j = c - 1;
        bsps2.f146576a |= 1024;
        int a2 = epu.m10944a(Collections.unmodifiableMap(bsxn.f147590c));
        if (a2 != 0) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bsps bsps3 = (bsps) da.f164949b;
            bsps3.f146576a |= 64;
            bsps3.f146581f = a2;
        }
        int a3 = epu.m10944a(Collections.unmodifiableMap(bsxn2.f147590c));
        if (a3 != 0) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bsps bsps4 = (bsps) da.f164949b;
            bsps4.f146576a |= 128;
            bsps4.f146582g = a3;
        }
        int b = epu.m10945b(Collections.unmodifiableMap(bsxn.f147590c));
        if (b != -1) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bsps bsps5 = (bsps) da.f164949b;
            bsps5.f146576a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            bsps5.f146583h = b;
        }
        int b2 = epu.m10945b(Collections.unmodifiableMap(bsxn2.f147590c));
        if (b2 != -1) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bsps bsps6 = (bsps) da.f164949b;
            bsps6.f146576a |= 512;
            bsps6.f146584i = b2;
        }
        bxvd da2 = bspq.f146567d.mo74144da();
        bxvd da3 = bspm.f146525d.mo74144da();
        bxvd da4 = bspk.f146511f.mo74144da();
        if (da4.f164950c) {
            da4.mo74035c();
            da4.f164950c = false;
        }
        bspk bspk = (bspk) da4.f164949b;
        bspk.f146514b = 3;
        bspk.f146513a |= 1;
        bsps bsps7 = (bsps) da.mo74062i();
        bsps7.getClass();
        bspk.f146516d = bsps7;
        bspk.f146513a |= 4;
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        bspm bspm = (bspm) da3.f164949b;
        bspk bspk2 = (bspk) da4.mo74062i();
        bspk2.getClass();
        bspm.f146528b = bspk2;
        bspm.f146527a |= 8;
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bspq bspq = (bspq) da2.f164949b;
        bspm bspm2 = (bspm) da3.mo74062i();
        bspm2.getClass();
        bspq.f146571c = bspm2;
        bspq.f146569a |= 8;
        a.mo10788a((bspq) da2.mo74062i());
    }

    /* renamed from: a */
    public final void mo10760a(bsxn bsxn, bsxn bsxn2) {
        ffv a = this.f16408d.mo10739a();
        bxvd da = bsoz.f146452h.mo74144da();
        int i = bsxn.f147589b;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bsoz bsoz = (bsoz) da.f164949b;
        int i2 = bsoz.f146454a | 1;
        bsoz.f146454a = i2;
        bsoz.f146455b = i;
        int i3 = bsxn2.f147589b;
        bsoz.f146454a = i2 | 2;
        bsoz.f146456c = i3;
        int a2 = epu.m10944a(Collections.unmodifiableMap(bsxn.f147590c));
        if (a2 != 0) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bsoz bsoz2 = (bsoz) da.f164949b;
            bsoz2.f146454a |= 16;
            bsoz2.f146457d = a2;
        }
        int a3 = epu.m10944a(Collections.unmodifiableMap(bsxn2.f147590c));
        if (a3 != 0) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bsoz bsoz3 = (bsoz) da.f164949b;
            bsoz3.f146454a |= 32;
            bsoz3.f146458e = a3;
        }
        int b = epu.m10945b(Collections.unmodifiableMap(bsxn.f147590c));
        if (b != -1) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bsoz bsoz4 = (bsoz) da.f164949b;
            bsoz4.f146454a |= 64;
            bsoz4.f146459f = b;
        }
        int b2 = epu.m10945b(Collections.unmodifiableMap(bsxn2.f147590c));
        if (b2 != -1) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bsoz bsoz5 = (bsoz) da.f164949b;
            bsoz5.f146454a |= 128;
            bsoz5.f146460g = b2;
        }
        bxvd da2 = bspq.f146567d.mo74144da();
        bxvf bxvf = (bxvf) bspp.f146553l.mo74144da();
        bxvd da3 = bsog.f146371f.mo74144da();
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        bsog bsog = (bsog) da3.f164949b;
        bsoz bsoz6 = (bsoz) da.mo74062i();
        bsoz6.getClass();
        bsog.f146375c = bsoz6;
        bsog.f146373a |= 2;
        if (bxvf.f164950c) {
            bxvf.mo74035c();
            bxvf.f164950c = false;
        }
        bspp bspp = (bspp) bxvf.f164949b;
        bsog bsog2 = (bsog) da3.mo74062i();
        bsog2.getClass();
        bspp.f146565k = bsog2;
        bspp.f146555a |= 2048;
        bsof a4 = a.mo10784a();
        if (bxvf.f164950c) {
            bxvf.mo74035c();
            bxvf.f164950c = false;
        }
        bspp bspp2 = (bspp) bxvf.f164949b;
        a4.getClass();
        bspp2.f146562h = a4;
        bspp2.f146555a |= 64;
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bspq bspq = (bspq) da2.f164949b;
        bspp bspp3 = (bspp) bxvf.mo74062i();
        bspp3.getClass();
        bspq.f146570b = bspp3;
        bspq.f146569a |= 1;
        a.mo10788a((bspq) da2.mo74062i());
    }
}
