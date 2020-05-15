package p000;

import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.concurrent.TimeoutException;

/* renamed from: abns */
final /* synthetic */ class abns implements aubt {

    /* renamed from: a */
    private final bxvd f57748a;

    public abns(bxvd bxvd) {
        this.f57748a = bxvd;
    }

    /* renamed from: a */
    public final void mo10476a(Exception exc) {
        String str;
        bxvd bxvd = this.f57748a;
        int i = eoa.f15378a;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bosu bosu = (bosu) bxvd.f164949b;
        bosu bosu2 = bosu.f134668af;
        bosu.f134684O = 7;
        bosu.f134702b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
        aylp a = abnd.m47941a();
        if (!(exc instanceof TimeoutException)) {
            str = "error";
        } else {
            str = "timeout";
        }
        a.mo54078b(str);
    }
}
