package p000;

import android.content.Context;
import android.content.Intent;

/* renamed from: awlg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awlg extends awjx {
    public awlg(Context context) {
        super(context, "com.google.android.gms.wallet.firstparty.ACTION_PAYMENT_METHODS", "flow_payment_methods");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo52189a(Intent intent) {
        boolean z;
        boolean z2;
        byte[] byteArrayExtra = this.f94574a.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS");
        boolean z3 = true;
        if (byteArrayExtra == null || byteArrayExtra.length <= 0) {
            z = false;
        } else {
            z = true;
        }
        byte[] byteArrayExtra2 = this.f94574a.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_UNENCRYPTED_PARAMS");
        if (byteArrayExtra2 == null || byteArrayExtra2.length <= 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z && !z2) {
            z3 = false;
        }
        sdo.m34975b(z3, "PaymentMethods requires either just unencrypted params or encrypted params");
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: awjx.<init>(java.lang.String, java.lang.String, boolean, android.content.Intent):void
     arg types: [java.lang.String, java.lang.String, int, android.content.Intent]
     candidates:
      awjx.<init>(android.content.Context, java.lang.String, java.lang.String, boolean):void
      awjx.<init>(java.lang.String, java.lang.String, boolean, android.content.Intent):void */
    public awlg(Intent intent) {
        super("com.google.android.gms.wallet.firstparty.ACTION_PAYMENT_METHODS", "flow_payment_methods", true, intent);
    }
}
