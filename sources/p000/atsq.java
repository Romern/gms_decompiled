package p000;

import android.view.View;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import com.google.android.gms.tapandpay.firstparty.CardInfo;

/* renamed from: atsq */
final /* synthetic */ class atsq implements View.OnClickListener {

    /* renamed from: a */
    private final atsr f90788a;

    /* renamed from: b */
    private final CardInfo f90789b;

    public atsq(atsr atsr, CardInfo cardInfo) {
        this.f90788a = atsr;
        this.f90789b = cardInfo;
    }

    public void onClick(View view) {
        atsr atsr = this.f90788a;
        CardInfo cardInfo = this.f90789b;
        atrp.m76257a(atsr.getContext(), new AccountInfo(atsr.f90791c, atsr.f90792d), cardInfo);
        atsr.getActivity().finish();
    }
}
