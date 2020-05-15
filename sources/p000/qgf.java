package p000;

import java.util.concurrent.TimeUnit;

/* renamed from: qgf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qgf {

    /* renamed from: a */
    public final bmza f41161a;

    /* renamed from: b */
    public final bmza f41162b;

    /* renamed from: c */
    public final bxvd f41163c = qge.f41150j.mo74144da();

    public qgf(bmzq bmzq) {
        this.f41161a = bmza.m108657a(bmzq);
        this.f41162b = bmza.m108657a(bmzq);
    }

    /* renamed from: a */
    public final qge mo24027a() {
        bmza bmza = this.f41162b;
        if (bmza.f131251a) {
            bxvd bxvd = this.f41163c;
            long a = bmza.mo66928a(TimeUnit.MILLISECONDS);
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            qge qge = (qge) bxvd.f164949b;
            qge qge2 = qge.f41150j;
            qge.f41152a |= 64;
            qge.f41159h = a;
            this.f41162b.mo66931e();
        }
        bxvd bxvd2 = this.f41163c;
        long a2 = this.f41161a.mo66928a(TimeUnit.MILLISECONDS);
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        qge qge3 = (qge) bxvd2.f164949b;
        qge qge4 = qge.f41150j;
        qge3.f41152a |= 2;
        qge3.f41154c = a2;
        this.f41161a.mo66931e();
        bxvd bxvd3 = this.f41163c;
        if ((((qge) bxvd3.f164949b).f41152a & 1) == 0) {
            bxvd da = qgd.f41146c.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            qgd qgd = (qgd) da.f164949b;
            "".getClass();
            qgd.f41148a |= 1;
            qgd.f41149b = "";
            if (bxvd3.f164950c) {
                bxvd3.mo74035c();
                bxvd3.f164950c = false;
            }
            qge qge5 = (qge) bxvd3.f164949b;
            qgd qgd2 = (qgd) da.mo74062i();
            qgd2.getClass();
            qge5.f41153b = qgd2;
            qge5.f41152a |= 1;
        }
        bxvd bxvd4 = this.f41163c;
        if ((((qge) bxvd4.f164949b).f41152a & 4) == 0) {
            if (bxvd4.f164950c) {
                bxvd4.mo74035c();
                bxvd4.f164950c = false;
            }
            qge qge6 = (qge) bxvd4.f164949b;
            qge6.f41152a |= 4;
            qge6.f41155d = 0;
        }
        bxvd bxvd5 = this.f41163c;
        if ((((qge) bxvd5.f164949b).f41152a & 8) == 0) {
            if (bxvd5.f164950c) {
                bxvd5.mo74035c();
                bxvd5.f164950c = false;
            }
            qge qge7 = (qge) bxvd5.f164949b;
            qge7.f41152a |= 8;
            qge7.f41156e = false;
        }
        bxvd bxvd6 = this.f41163c;
        if ((((qge) bxvd6.f164949b).f41152a & 128) == 0) {
            if (bxvd6.f164950c) {
                bxvd6.mo74035c();
                bxvd6.f164950c = false;
            }
            qge qge8 = (qge) bxvd6.f164949b;
            qge8.f41152a |= 128;
            qge8.f41160i = 1;
        }
        bxvd bxvd7 = this.f41163c;
        if ((((qge) bxvd7.f164949b).f41152a & 32) == 0) {
            if (bxvd7.f164950c) {
                bxvd7.mo74035c();
                bxvd7.f164950c = false;
            }
            qge qge9 = (qge) bxvd7.f164949b;
            qge9.f41152a |= 32;
            qge9.f41158g = false;
        }
        bxvd bxvd8 = this.f41163c;
        if ((((qge) bxvd8.f164949b).f41152a & 16) == 0) {
            if (bxvd8.f164950c) {
                bxvd8.mo74035c();
                bxvd8.f164950c = false;
            }
            qge qge10 = (qge) bxvd8.f164949b;
            qge10.f41152a |= 16;
            qge10.f41157f = false;
        }
        return (qge) this.f41163c.mo74062i();
    }

    /* renamed from: b */
    public final void mo24028b() {
        this.f41162b.mo66931e();
        bxvd bxvd = this.f41163c;
        long a = this.f41162b.mo66928a(TimeUnit.MILLISECONDS);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        qge qge = (qge) bxvd.f164949b;
        qge qge2 = qge.f41150j;
        qge.f41152a |= 64;
        qge.f41159h = a;
    }
}
