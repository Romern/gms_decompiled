package p000;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.walletp2p.internal.zeroparty.ClaimMoneyResponse;
import com.google.android.gms.walletp2p.internal.zeroparty.ErrorDetails;

/* renamed from: axer */
final /* synthetic */ class axer implements aubw {

    /* renamed from: a */
    private final axet f95866a;

    /* renamed from: b */
    private final axfh f95867b;

    public axer(axet axet, axfh axfh) {
        this.f95866a = axet;
        this.f95867b = axfh;
    }

    /* renamed from: a */
    public final void mo10462a(Object obj) {
        axet axet = this.f95866a;
        axfh axfh = this.f95867b;
        axng axng = (axng) obj;
        ErrorDetails errorDetails = null;
        if (axng.f96199a.mo17710c()) {
            Status status = axng.f96199a;
            int i = status.f30115i;
            if (i != 0) {
                switch (i) {
                    case -16505:
                        ErrorDetails errorDetails2 = axng.f96200b.f110799a;
                        axfh.mo53099a(5, errorDetails2.f110804a, errorDetails2.f110805b, errorDetails2.f110808e, errorDetails2.f110809f);
                        return;
                    case -16504:
                        ErrorDetails errorDetails3 = axng.f96200b.f110799a;
                        axfh.mo53099a(4, errorDetails3.f110804a, errorDetails3.f110805b, null, null);
                        return;
                    case -16503:
                        ErrorDetails errorDetails4 = axng.f96200b.f110799a;
                        axfh.mo53099a(3, errorDetails4.f110804a, errorDetails4.f110805b, null, null);
                        return;
                    case -16502:
                        ErrorDetails errorDetails5 = axng.f96200b.f110799a;
                        axfh.mo53099a(2, errorDetails5.f110804a, errorDetails5.f110805b, null, null);
                        return;
                    case -16501:
                        ErrorDetails errorDetails6 = axng.f96200b.f110799a;
                        axfh.mo53099a(1, errorDetails6.f110804a, errorDetails6.f110805b, null, null);
                        return;
                    default:
                        ClaimMoneyResponse claimMoneyResponse = axng.f96200b;
                        if (claimMoneyResponse != null) {
                            errorDetails = claimMoneyResponse.f110799a;
                        }
                        axfh.mo53101a(status, errorDetails);
                        return;
                }
            } else {
                Bundle bundle = new Bundle();
                bundle.putString("transaction_token", axet.mo53107s());
                axfh.mo53100a(bundle, axng.f96200b.f110800b);
            }
        } else {
            axfh.mo53101a(axng.f96199a, (ErrorDetails) null);
        }
    }
}
