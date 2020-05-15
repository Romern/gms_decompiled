package p000;

import android.text.TextUtils;
import com.google.android.gms.pay.PayIntentArgs;
import com.google.android.gms.pay.TransactionDetailIntentArgs;

/* renamed from: alhv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alhv extends alhs {

    /* renamed from: a */
    public final algv f73521a = new algv();

    public alhv() {
        super("com.google.android.gms.pay.transactions.VIEW_TRANSACTION");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo40352a(alfq alfq) {
        alfq.f73507a.f81554c = this.f73521a.f73512a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo40354a(PayIntentArgs payIntentArgs) {
        boolean z;
        boolean z2 = false;
        if (payIntentArgs.f81552a != null) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34975b(z, "account required");
        TransactionDetailIntentArgs transactionDetailIntentArgs = payIntentArgs.f81554c;
        sdo.m34959a(transactionDetailIntentArgs);
        if (transactionDetailIntentArgs.f81619c != null || !TextUtils.isEmpty(transactionDetailIntentArgs.f81617a) || !TextUtils.isEmpty(transactionDetailIntentArgs.f81618b)) {
            z2 = true;
        }
        sdo.m34975b(z2, "at least one of deviceTransactionId, cloudTransactionId, Transaction is required");
    }
}
