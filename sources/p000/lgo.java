package p000;

import com.google.android.gms.autofill.fill.FillField;
import java.util.function.Predicate;

/* renamed from: lgo */
final /* synthetic */ class lgo implements Predicate {

    /* renamed from: a */
    static final Predicate f26046a = new lgo();

    private lgo() {
    }

    public final boolean test(Object obj) {
        FillField fillField = (FillField) obj;
        int i = lgr.f26050c;
        return fillField.mo7943a(kpb.OTP_FULL) || fillField.mo7943a(kpb.OTP_1) || fillField.mo7943a(kpb.OTP_2) || fillField.mo7943a(kpb.OTP_3) || fillField.mo7943a(kpb.OTP_4) || fillField.mo7943a(kpb.OTP_5) || fillField.mo7943a(kpb.OTP_6) || fillField.mo7943a(kpb.OTP_7) || fillField.mo7943a(kpb.OTP_8);
    }
}
