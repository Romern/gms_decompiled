package p000;

/* renamed from: bclv */
final /* synthetic */ class bclv implements bmxj {

    /* renamed from: a */
    private final bcoh f104449a;

    /* renamed from: b */
    private final String f104450b;

    /* renamed from: c */
    private final bcnt f104451c;

    public bclv(bcoh bcoh, String str, bcnt bcnt) {
        this.f104449a = bcoh;
        this.f104450b = str;
        this.f104451c = bcnt;
    }

    public final Object apply(Object obj) {
        int i;
        bzrt bzrt;
        bzrt bzrt2;
        cbgj cbgj;
        bcoh bcoh = this.f104449a;
        String str = this.f104450b;
        bcnt bcnt = this.f104451c;
        cbgi cbgi = (cbgi) obj;
        bcul bcul = bcul.UNKNOWN;
        bcug bcug = bcug.UNKNOWN;
        int i2 = 4;
        int i3 = 0;
        switch (cbgi.f177039c) {
            case 0:
                i = 2;
                break;
            case 1:
                i = 3;
                break;
            case 2:
                i = 4;
                break;
            case 3:
                i = 5;
                break;
            case 4:
                i = 6;
                break;
            case 5:
                i = 7;
                break;
            case 6:
                i = 8;
                break;
            case 7:
                i = 9;
                break;
            case 8:
                i = 10;
                break;
            case 9:
                i = 11;
                break;
            case 10:
                i = 12;
                break;
            case 11:
                i = 13;
                break;
            default:
                i = 0;
                break;
        }
        if (i == 0) {
            i = 1;
        }
        switch (i - 2) {
            case 1:
                return bcuj.m90018o();
            case 2:
                return bcuj.m90019p();
            case 3:
                return bcuj.m90020q();
            case 4:
                return bcuj.m90021r();
            case 5:
                return bcuj.m90022s();
            case 6:
                return bcuj.m90023t();
            case 7:
                if (cbgi.f177037a == 8) {
                    bzrt = (bzrt) cbgi.f177038b;
                } else {
                    bzrt = bzrt.f171195e;
                }
                return bcra.m89670a(bclc.m89223a(bzrt));
            case 8:
                if (cbgi.f177037a == 9) {
                    bzrt2 = (bzrt) cbgi.f177038b;
                } else {
                    bzrt2 = bzrt.f171195e;
                }
                return bcra.m89672b(bclc.m89223a(bzrt2));
            case 9:
                if (cbgi.f177037a == 10) {
                    i3 = ((Integer) cbgi.f177038b).intValue();
                }
                return bcra.m89673c(i3);
            case 10:
                if (cbgi.f177037a == 11) {
                    cbgj = (cbgj) cbgi.f177038b;
                } else {
                    cbgj = cbgj.f177040b;
                }
                return bcra.m89671a(bbow.m88301a(cbgj.f177042a, new bclx(bcoh, str, bcnt)));
            case 11:
                if (cbgi.f177037a == 12) {
                    int intValue = ((Integer) cbgi.f177038b).intValue();
                    if (intValue == 0) {
                        i2 = 2;
                    } else if (intValue == 1) {
                        i2 = 3;
                    } else if (intValue != 2) {
                        i2 = 0;
                    }
                    if (i2 == 0) {
                        i2 = 1;
                    }
                } else {
                    i2 = 2;
                }
                int i4 = i2 - 2;
                if (i4 == 1) {
                    i3 = 1;
                } else if (i4 == 2) {
                    i3 = 2;
                }
                return bcra.m89674d(i3);
            default:
                bcnr q = bcns.m89409q();
                q.mo57011b(24);
                q.mo57012b(bcoh.mo57058b().mo57074e());
                q.mo57010a(bcoh.mo57059c().mo73781l());
                q.mo57013b(str);
                q.mo57003a(116);
                bcnt.mo56753a(q.mo57002a());
                return bcuj.m90017n();
        }
    }
}
