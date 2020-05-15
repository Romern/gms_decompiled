package p000;

import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.wallet.service.orchestration.GcoreTapAndPayConsumerVerificationServerResponse;
import java.util.List;

/* renamed from: axcm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class axcm extends awpc {

    /* renamed from: a */
    final /* synthetic */ axcn f95776a;

    public axcm(axcn axcn) {
        this.f95776a = axcn;
    }

    /* renamed from: a */
    public final void mo51894a() {
        axcn axcn = this.f95776a;
        String string = axcn.getString(C0126R.string.wallet_uic_network_error_title);
        String string2 = this.f95776a.getString(C0126R.string.wallet_uic_network_error_message);
        int i = axcn.f95777c;
        axcn.mo66085a(1, string, string2);
    }

    /* renamed from: b */
    public final void mo51897b() {
        axcn axcn = this.f95776a;
        int i = axcn.f95777c;
        axcn.mo66084a(2);
    }

    /* renamed from: a */
    public final void mo52443a(GcoreTapAndPayConsumerVerificationServerResponse gcoreTapAndPayConsumerVerificationServerResponse) {
        axcn axcn = this.f95776a;
        int i = axcn.f95777c;
        int i2 = gcoreTapAndPayConsumerVerificationServerResponse.f152324b;
        if (i2 == 0) {
            axcn.f124431i = 5;
            axcn.f124429g = gcoreTapAndPayConsumerVerificationServerResponse.f152323a;
            axcn.mo66088z();
        } else if (i2 != 1) {
            int i3 = 0;
            if (i2 != 2) {
                if (!axcn.f124434l.isEmpty()) {
                    axcn.f124431i = 0;
                    List list = axcn.f124434l;
                    int size = list.size();
                    while (i3 < size) {
                        axcn.f124196aK.mo65590a((bjwj) list.get(i3));
                        i3++;
                    }
                    return;
                }
                axcn.mo66084a(2);
            } else if (!axcn.f124433k.isEmpty()) {
                axcn.f124431i = 0;
                List list2 = axcn.f124433k;
                int size2 = list2.size();
                while (i3 < size2) {
                    axcn.f124196aK.mo65590a((bjwj) list2.get(i3));
                    i3++;
                }
            } else {
                axcn.mo66085a(2, axcn.getString(C0126R.string.wallet_uic_title_possibly_recoverable_error_dialog), axcn.getString(C0126R.string.wallet_uic_google_pay_card_unusable_simplified));
            }
        } else {
            axcn.f124431i = 3;
            axcn.mo66088z();
        }
    }
}
