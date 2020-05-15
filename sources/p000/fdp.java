package p000;

import android.content.Context;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.Collections;
import java.util.HashMap;

/* renamed from: fdp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fdp {

    /* renamed from: a */
    private final fcg f16333a;

    /* renamed from: b */
    private final HashMap f16334b = new HashMap();

    /* renamed from: c */
    private final fdo f16335c;

    public fdp(Context context, fcg fcg) {
        fdo fdo = new fdo(context);
        this.f16333a = fcg;
        this.f16335c = fdo;
    }

    /* renamed from: a */
    public final ffv mo10739a() {
        ffk b = this.f16333a.mo10683b();
        if (this.f16334b.containsKey(b)) {
            return (ffv) this.f16334b.get(b);
        }
        ffv a = ffv.m11622a(this.f16335c.f16332a, b);
        this.f16334b.put(b, a);
        return a;
    }

    /* renamed from: a */
    public final void mo10740a(int i, int i2, int i3) {
        ffv a = mo10739a();
        bxvd da = bspq.f146567d.mo74144da();
        bxvf bxvf = (bxvf) bspp.f146553l.mo74144da();
        bxvd da2 = bsog.f146371f.mo74144da();
        bxvd da3 = bspg.f146478k.mo74144da();
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        bspg bspg = (bspg) da3.f164949b;
        bspg.f146481b = i3 - 1;
        int i4 = bspg.f146480a | 1;
        bspg.f146480a = i4;
        int i5 = i4 | 2;
        bspg.f146480a = i5;
        bspg.f146482c = i;
        bspg.f146480a = i5 | 4;
        bspg.f146483d = i2;
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bsog bsog = (bsog) da2.f164949b;
        bspg bspg2 = (bspg) da3.mo74062i();
        bspg2.getClass();
        bsog.f146377e = bspg2;
        bsog.f146373a |= 8;
        if (bxvf.f164950c) {
            bxvf.mo74035c();
            bxvf.f164950c = false;
        }
        bspp bspp = (bspp) bxvf.f164949b;
        bsog bsog2 = (bsog) da2.mo74062i();
        bsog2.getClass();
        bspp.f146565k = bsog2;
        bspp.f146555a |= 2048;
        bsof a2 = a.mo10784a();
        if (bxvf.f164950c) {
            bxvf.mo74035c();
            bxvf.f164950c = false;
        }
        bspp bspp2 = (bspp) bxvf.f164949b;
        a2.getClass();
        bspp2.f146562h = a2;
        bspp2.f146555a |= 64;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bspq bspq = (bspq) da.f164949b;
        bspp bspp3 = (bspp) bxvf.mo74062i();
        bspp3.getClass();
        bspq.f146570b = bspp3;
        bspq.f146569a |= 1;
        bxvd da4 = bspm.f146525d.mo74144da();
        bxvd da5 = bspk.f146511f.mo74144da();
        if (da5.f164950c) {
            da5.mo74035c();
            da5.f164950c = false;
        }
        bspk bspk = (bspk) da5.f164949b;
        bspk.f146514b = 3;
        bspk.f146513a |= 1;
        if (da4.f164950c) {
            da4.mo74035c();
            da4.f164950c = false;
        }
        bspm bspm = (bspm) da4.f164949b;
        bspk bspk2 = (bspk) da5.mo74062i();
        bspk2.getClass();
        bspm.f146528b = bspk2;
        bspm.f146527a |= 8;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bspq bspq2 = (bspq) da.f164949b;
        bspm bspm2 = (bspm) da4.mo74062i();
        bspm2.getClass();
        bspq2.f146571c = bspm2;
        bspq2.f146569a |= 8;
        a.mo10788a((bspq) da.mo74062i());
    }

    /* renamed from: a */
    public final void mo10741a(int i, int i2, int i3, int i4) {
        ffv a = mo10739a();
        bxvd da = bspq.f146567d.mo74144da();
        bxvd da2 = bspm.f146525d.mo74144da();
        bxvd da3 = bspk.f146511f.mo74144da();
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        bspk bspk = (bspk) da3.f164949b;
        bspk.f146514b = 3;
        bspk.f146513a |= 1;
        bxvd da4 = bsps.f146574k.mo74144da();
        if (da4.f164950c) {
            da4.mo74035c();
            da4.f164950c = false;
        }
        bsps bsps = (bsps) da4.f164949b;
        int i5 = bsps.f146576a | 1;
        bsps.f146576a = i5;
        bsps.f146577b = i;
        int i6 = i5 | 2;
        bsps.f146576a = i6;
        bsps.f146578c = i2;
        int i7 = i6 | 4;
        bsps.f146576a = i7;
        bsps.f146579d = i3;
        bsps.f146576a = i7 | 8;
        bsps.f146580e = i4;
        int c = a.mo10790c();
        if (da4.f164950c) {
            da4.mo74035c();
            da4.f164950c = false;
        }
        bsps bsps2 = (bsps) da4.f164949b;
        bsps2.f146585j = c - 1;
        bsps2.f146576a |= 1024;
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        bspk bspk2 = (bspk) da3.f164949b;
        bsps bsps3 = (bsps) da4.mo74062i();
        bsps3.getClass();
        bspk2.f146516d = bsps3;
        bspk2.f146513a |= 4;
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bspm bspm = (bspm) da2.f164949b;
        bspk bspk3 = (bspk) da3.mo74062i();
        bspk3.getClass();
        bspm.f146528b = bspk3;
        bspm.f146527a |= 8;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bspq bspq = (bspq) da.f164949b;
        bspm bspm2 = (bspm) da2.mo74062i();
        bspm2.getClass();
        bspq.f146571c = bspm2;
        bspq.f146569a |= 8;
        a.mo10788a((bspq) da.mo74062i());
    }

    /* renamed from: a */
    public final void mo10742a(int i, int i2, int i3, int i4, int i5) {
        ffv a = mo10739a();
        bxvd da = bspq.f146567d.mo74144da();
        bxvf bxvf = (bxvf) bspp.f146553l.mo74144da();
        bxvd da2 = bsog.f146371f.mo74144da();
        bxvd da3 = bspg.f146478k.mo74144da();
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        bspg bspg = (bspg) da3.f164949b;
        bspg.f146481b = i5 - 1;
        int i6 = bspg.f146480a | 1;
        bspg.f146480a = i6;
        int i7 = i6 | 2;
        bspg.f146480a = i7;
        bspg.f146482c = i;
        int i8 = i7 | 4;
        bspg.f146480a = i8;
        bspg.f146483d = i2;
        int i9 = i8 | 8;
        bspg.f146480a = i9;
        bspg.f146484e = i3;
        bspg.f146480a = i9 | 16;
        bspg.f146485f = i4;
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bsog bsog = (bsog) da2.f164949b;
        bspg bspg2 = (bspg) da3.mo74062i();
        bspg2.getClass();
        bsog.f146377e = bspg2;
        bsog.f146373a |= 8;
        if (bxvf.f164950c) {
            bxvf.mo74035c();
            bxvf.f164950c = false;
        }
        bspp bspp = (bspp) bxvf.f164949b;
        bsog bsog2 = (bsog) da2.mo74062i();
        bsog2.getClass();
        bspp.f146565k = bsog2;
        bspp.f146555a |= 2048;
        bsof a2 = a.mo10784a();
        if (bxvf.f164950c) {
            bxvf.mo74035c();
            bxvf.f164950c = false;
        }
        bspp bspp2 = (bspp) bxvf.f164949b;
        a2.getClass();
        bspp2.f146562h = a2;
        bspp2.f146555a |= 64;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bspq bspq = (bspq) da.f164949b;
        bspp bspp3 = (bspp) bxvf.mo74062i();
        bspp3.getClass();
        bspq.f146570b = bspp3;
        bspq.f146569a |= 1;
        bxvd da4 = bspm.f146525d.mo74144da();
        bxvd da5 = bspk.f146511f.mo74144da();
        if (da5.f164950c) {
            da5.mo74035c();
            da5.f164950c = false;
        }
        bspk bspk = (bspk) da5.f164949b;
        bspk.f146514b = 3;
        bspk.f146513a |= 1;
        bxvd da6 = bspn.f146530j.mo74144da();
        if (da6.f164950c) {
            da6.mo74035c();
            da6.f164950c = false;
        }
        bspn bspn = (bspn) da6.f164949b;
        int i10 = bspn.f146532a | 1;
        bspn.f146532a = i10;
        bspn.f146533b = i;
        int i11 = i10 | 2;
        bspn.f146532a = i11;
        bspn.f146534c = i2;
        int i12 = i11 | 4;
        bspn.f146532a = i12;
        bspn.f146535d = i3;
        bspn.f146532a = i12 | 8;
        bspn.f146536e = i4;
        if (da5.f164950c) {
            da5.mo74035c();
            da5.f164950c = false;
        }
        bspk bspk2 = (bspk) da5.f164949b;
        bspn bspn2 = (bspn) da6.mo74062i();
        bspn2.getClass();
        bspk2.f146515c = bspn2;
        bspk2.f146513a |= 2;
        if (da4.f164950c) {
            da4.mo74035c();
            da4.f164950c = false;
        }
        bspm bspm = (bspm) da4.f164949b;
        bspk bspk3 = (bspk) da5.mo74062i();
        bspk3.getClass();
        bspm.f146528b = bspk3;
        bspm.f146527a |= 8;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bspq bspq2 = (bspq) da.f164949b;
        bspm bspm2 = (bspm) da4.mo74062i();
        bspm2.getClass();
        bspq2.f146571c = bspm2;
        bspq2.f146569a |= 8;
        a.mo10788a((bspq) da.mo74062i());
    }

    /* renamed from: a */
    public final void mo10743a(bsxn bsxn, bsxn bsxn2, int i) {
        ffv a = mo10739a();
        bxvd da = bspg.f146478k.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bspg bspg = (bspg) da.f164949b;
        bspg.f146481b = i - 1;
        int i2 = bspg.f146480a | 1;
        bspg.f146480a = i2;
        int i3 = bsxn.f147589b;
        int i4 = i2 | 2;
        bspg.f146480a = i4;
        bspg.f146482c = i3;
        int i5 = bsxn2.f147589b;
        bspg.f146480a = i4 | 4;
        bspg.f146483d = i5;
        bxvd da2 = bspn.f146530j.mo74144da();
        int i6 = bsxn.f147589b;
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bspn bspn = (bspn) da2.f164949b;
        int i7 = bspn.f146532a | 1;
        bspn.f146532a = i7;
        bspn.f146533b = i6;
        int i8 = bsxn2.f147589b;
        bspn.f146532a = i7 | 2;
        bspn.f146534c = i8;
        int a2 = epu.m10944a(Collections.unmodifiableMap(bsxn.f147590c));
        if (a2 != 0) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bspg bspg2 = (bspg) da.f164949b;
            bspg2.f146480a |= 128;
            bspg2.f146486g = a2;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bspn bspn2 = (bspn) da2.f164949b;
            bspn2.f146532a |= 64;
            bspn2.f146537f = a2;
        }
        int a3 = epu.m10944a(Collections.unmodifiableMap(bsxn2.f147590c));
        if (a3 != 0) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bspg bspg3 = (bspg) da.f164949b;
            bspg3.f146480a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            bspg3.f146487h = a3;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bspn bspn3 = (bspn) da2.f164949b;
            bspn3.f146532a |= 128;
            bspn3.f146538g = a3;
        }
        int b = epu.m10945b(Collections.unmodifiableMap(bsxn.f147590c));
        if (b != -1) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bspg bspg4 = (bspg) da.f164949b;
            bspg4.f146480a |= 512;
            bspg4.f146488i = b;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bspn bspn4 = (bspn) da2.f164949b;
            bspn4.f146532a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            bspn4.f146539h = b;
        }
        int b2 = epu.m10945b(Collections.unmodifiableMap(bsxn2.f147590c));
        if (b2 != -1) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bspg bspg5 = (bspg) da.f164949b;
            bspg5.f146480a |= 1024;
            bspg5.f146489j = b2;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bspn bspn5 = (bspn) da2.f164949b;
            bspn5.f146532a |= 512;
            bspn5.f146540i = b2;
        }
        bxvd da3 = bspq.f146567d.mo74144da();
        bxvf bxvf = (bxvf) bspp.f146553l.mo74144da();
        bxvd da4 = bsog.f146371f.mo74144da();
        if (da4.f164950c) {
            da4.mo74035c();
            da4.f164950c = false;
        }
        bsog bsog = (bsog) da4.f164949b;
        bspg bspg6 = (bspg) da.mo74062i();
        bspg6.getClass();
        bsog.f146377e = bspg6;
        bsog.f146373a |= 8;
        if (bxvf.f164950c) {
            bxvf.mo74035c();
            bxvf.f164950c = false;
        }
        bspp bspp = (bspp) bxvf.f164949b;
        bsog bsog2 = (bsog) da4.mo74062i();
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
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        bspq bspq = (bspq) da3.f164949b;
        bspp bspp3 = (bspp) bxvf.mo74062i();
        bspp3.getClass();
        bspq.f146570b = bspp3;
        bspq.f146569a |= 1;
        bxvd da5 = bspm.f146525d.mo74144da();
        bxvd da6 = bspk.f146511f.mo74144da();
        if (da6.f164950c) {
            da6.mo74035c();
            da6.f164950c = false;
        }
        bspk bspk = (bspk) da6.f164949b;
        bspk.f146514b = 3;
        bspk.f146513a |= 1;
        bspn bspn6 = (bspn) da2.mo74062i();
        bspn6.getClass();
        bspk.f146515c = bspn6;
        bspk.f146513a |= 2;
        if (da5.f164950c) {
            da5.mo74035c();
            da5.f164950c = false;
        }
        bspm bspm = (bspm) da5.f164949b;
        bspk bspk2 = (bspk) da6.mo74062i();
        bspk2.getClass();
        bspm.f146528b = bspk2;
        bspm.f146527a |= 8;
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        bspq bspq2 = (bspq) da3.f164949b;
        bspm bspm2 = (bspm) da5.mo74062i();
        bspm2.getClass();
        bspq2.f146571c = bspm2;
        bspq2.f146569a |= 8;
        a.mo10788a((bspq) da3.mo74062i());
    }
}
