package p000;

import android.util.SparseArray;

/* renamed from: dpo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dpo {

    /* renamed from: a */
    public int f13777a;

    /* renamed from: b */
    public int f13778b;

    /* renamed from: c */
    public int f13779c;

    /* renamed from: d */
    public int f13780d;

    /* renamed from: e */
    public final egl f13781e = new egl();

    /* renamed from: f */
    public final egl f13782f = new egl();

    /* renamed from: g */
    public final SparseArray f13783g = new SparseArray();

    public dpo() {
        mo9402a();
    }

    /* renamed from: a */
    public final dpn mo9401a(bxco bxco) {
        dpn dpn = (dpn) this.f13783g.get(bxco.f162973bD);
        if (dpn != null) {
            return dpn;
        }
        dpn dpn2 = new dpn(bxco);
        this.f13783g.put(bxco.f162973bD, dpn2);
        return dpn2;
    }

    /* renamed from: a */
    public final void mo9402a() {
        this.f13777a = 0;
        this.f13778b = 0;
        this.f13779c = 0;
        this.f13780d = 0;
        this.f13781e.mo10091a();
        this.f13782f.mo10091a();
        this.f13783g.clear();
    }

    /* renamed from: a */
    public final boolean mo9403a(bxco bxco, int i) {
        boolean z;
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                dpn a = mo9401a(bxco);
                if (bxco == a.f13765a) {
                    z = true;
                } else {
                    z = false;
                }
                sdo.m34974b(z);
                switch (i) {
                    case 5:
                        a.f13766b++;
                        break;
                    case 6:
                        a.f13767c++;
                        break;
                    case 7:
                        a.f13770f++;
                        break;
                    case 8:
                        a.f13771g++;
                        break;
                    case 9:
                        a.f13773i++;
                        break;
                    case 10:
                        a.f13772h++;
                        break;
                    case 11:
                        a.f13768d++;
                        break;
                    case 12:
                        a.f13769e++;
                        break;
                    default:
                        bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
                        bnsl.mo68432a("dpn", "a", 251, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl.mo68409a("[GcmSyncStatisticsImpl] Context recd stats incorrect mode %d", i);
                        return false;
                }
                return true;
            default:
                bnsl bnsl2 = (bnsl) dss.f13961a.mo68387b();
                bnsl2.mo68432a("dpo", "a", 136, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68409a("[GcmSyncStatisticsImpl] Context recd stats incorrect mode %d", i);
                return false;
        }
    }
}
