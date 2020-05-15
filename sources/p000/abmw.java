package p000;

import java.util.concurrent.TimeoutException;

/* renamed from: abmw */
final /* synthetic */ class abmw implements aubt {

    /* renamed from: a */
    private final bxvd f57714a;

    public abmw(bxvd bxvd) {
        this.f57714a = bxvd;
    }

    /* renamed from: a */
    public final void mo10476a(Exception exc) {
        String str;
        bxvd bxvd = this.f57714a;
        eoa.m10824a("Herrevad", "Error on ActivityRecognition", exc);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bosu bosu = (bosu) bxvd.f164949b;
        bosu bosu2 = bosu.f134668af;
        bosu.f134672C = null;
        bosu.f134696a &= -536870913;
        aylp a = abnd.m47941a();
        if (!(exc instanceof TimeoutException)) {
            str = "error";
        } else {
            str = "timeout";
        }
        a.mo54075a(str);
    }
}
