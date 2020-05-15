package p000;

/* renamed from: dpn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dpn {

    /* renamed from: a */
    public final bxco f13765a;

    /* renamed from: b */
    public int f13766b;

    /* renamed from: c */
    public int f13767c;

    /* renamed from: d */
    public int f13768d;

    /* renamed from: e */
    public int f13769e;

    /* renamed from: f */
    public int f13770f;

    /* renamed from: g */
    public int f13771g;

    /* renamed from: h */
    public int f13772h;

    /* renamed from: i */
    public int f13773i;

    /* renamed from: j */
    public int f13774j;

    /* renamed from: k */
    public int f13775k;

    /* renamed from: l */
    public int f13776l;

    public dpn(bxco bxco) {
        this.f13765a = bxco;
        mo9398a();
    }

    /* renamed from: a */
    public final void mo9398a() {
        this.f13766b = 0;
        this.f13767c = 0;
        this.f13768d = 0;
        this.f13769e = 0;
        this.f13770f = 0;
        this.f13771g = 0;
        this.f13772h = 0;
        this.f13773i = 0;
        this.f13774j = 0;
        this.f13775k = 0;
        this.f13776l = 0;
    }

    /* renamed from: a */
    public final boolean mo9399a(bxco bxco, int i) {
        boolean z;
        if (bxco == this.f13765a) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34974b(z);
        switch (i) {
            case 5:
                this.f13766b++;
                break;
            case 6:
                this.f13767c++;
                break;
            case 7:
                this.f13770f++;
                break;
            case 8:
                this.f13771g++;
                break;
            case 9:
                this.f13773i++;
                break;
            case 10:
                this.f13772h++;
                break;
            case 11:
                this.f13768d++;
                break;
            case 12:
                this.f13769e++;
                break;
            default:
                bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
                bnsl.mo68432a("dpn", "a", 251, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68409a("[GcmSyncStatisticsImpl] Context recd stats incorrect mode %d", i);
                return false;
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo9400a(bxco bxco, int i, int i2) {
        boolean z;
        boolean z2;
        if (bxco == this.f13765a) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34974b(z);
        if (i2 >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        sdo.m34974b(z2);
        if (i == 7) {
            this.f13775k += i2;
        } else if (i == 8) {
            this.f13776l += i2;
        } else if (i != 13) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
            bnsl.mo68432a("dpn", "a", 274, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68409a("[GcmSyncStatisticsImpl] Context recd stats incorrect mode %d", i);
            return false;
        } else {
            this.f13774j += i2;
        }
        return true;
    }
}
