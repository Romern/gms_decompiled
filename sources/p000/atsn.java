package p000;

import com.google.android.gms.tapandpay.firstparty.CardInfo;
import com.google.android.gms.tapandpay.firstparty.TokenStatus;

/* renamed from: atsn */
final /* synthetic */ class atsn implements bmxz {

    /* renamed from: a */
    static final bmxz f90775a = new atsn();

    private atsn() {
    }

    /* renamed from: a */
    public final boolean mo6527a(Object obj) {
        srn srn = atso.f90776b;
        TokenStatus tokenStatus = ((CardInfo) obj).f108345f;
        return tokenStatus != null && tokenStatus.f108459b == 3;
    }
}
