package p000;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import com.google.android.gms.tapandpay.firstparty.CardInfo;

/* renamed from: atrp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atrp {

    /* renamed from: a */
    public static final bngx f90732a = bngx.m109365a(btoa.VISA_BUNDLE, btoa.MASTERCARD_BUNDLE, btoa.AMEX_BUNDLE, btoa.AMEX_V2_BUNDLE, btoa.DISCOVER_BUNDLE, btoa.CANONICAL_INTERAC_BUNDLE, btoa.CANONICAL_DISCOVER_BUNDLE, btoa.CANONICAL_EFTPOS_BUNDLE, btoa.CANONICAL_MASTERCARD_BUNDLE, btoa.CANONICAL_ELO_BUNDLE);

    /* renamed from: b */
    public static final bngx f90733b = bngx.m109357a(btoa.CANONICAL_FELICA_QUICPAY_BUNDLE, btoa.CANONICAL_FELICA_ID_BUNDLE);

    /* renamed from: c */
    public static final bngx f90734c = bngx.m109357a(btoa.CANONICAL_FELICA_QUICPAY_APTEST_BUNDLE, btoa.CANONICAL_FELICA_ID_APTEST_BUNDLE);

    /* renamed from: d */
    public static final bngx f90735d = bngx.m109366a(btof.AMEX_TSP, btof.VISA_TSP, btof.MASTERCARD_TSP, btof.DISCOVER_TSP, btof.INTERAC_TSP, btof.EFTPOS_TSP, btof.PAYPAL_TSP, btof.OBERTHUR_TSP, btof.ELO_TSP, btof.JCB_TSP, btof.GEMALTO_TSP);

    /* renamed from: a */
    public static int m76256a(int i) {
        int i2 = i - 1;
        int i3 = 2;
        if (i2 != 2) {
            i3 = 3;
            if (i2 != 3) {
                return i2 != 4 ? 0 : -1;
            }
        }
        return i3;
    }

    /* renamed from: a */
    public static void m76257a(Context context, AccountInfo accountInfo, CardInfo cardInfo) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("extra_account_info", accountInfo);
        bundle.putParcelable("extra_card_info", cardInfo);
        aebi aebi = new aebi();
        aebi.f63097i = "com.google.android.gms.tapandpay.gcmtask.TapAndPayGcmTaskService";
        aebi.f63099k = "tokenization.dypNotification";
        aebi.mo34023a(0);
        aebi.mo34027b(1);
        aebi.f63107s = bundle;
        aebi.mo34004a(cgwz.m147425b(), cgwz.m147425b() + 1);
        aeat.m51532a(context).mo33984a(aebi.mo33974b());
    }
}
