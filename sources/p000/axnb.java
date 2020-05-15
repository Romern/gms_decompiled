package p000;

import android.os.IInterface;
import com.google.android.gms.walletp2p.internal.firstparty.CheckEligibilityRequest;
import com.google.android.gms.walletp2p.internal.firstparty.CheckRecipientEligibilityRequest;
import com.google.android.gms.walletp2p.internal.firstparty.ConfirmTransactionRequest;
import com.google.android.gms.walletp2p.internal.firstparty.GetTransactionDetailsRequest;

/* renamed from: axnb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface axnb extends IInterface {
    /* renamed from: a */
    void mo53258a(CheckEligibilityRequest checkEligibilityRequest, axnc axnc);

    /* renamed from: a */
    void mo53259a(CheckRecipientEligibilityRequest checkRecipientEligibilityRequest, axnc axnc);

    /* renamed from: a */
    void mo53260a(ConfirmTransactionRequest confirmTransactionRequest, axnc axnc);

    /* renamed from: a */
    void mo53261a(GetTransactionDetailsRequest getTransactionDetailsRequest, axnc axnc);
}
