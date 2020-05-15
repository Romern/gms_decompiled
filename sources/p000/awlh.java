package p000;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.wallet.firstparty.p080pm.SecurePaymentsPayload;

/* renamed from: awlh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awlh extends awjx {
    public awlh(Context context) {
        super(context, "com.google.android.gms.wallet.firstparty.ACTION_PURCHASE_MANAGER", "flow_pm");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo52189a(Intent intent) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        SecurePaymentsPayload securePaymentsPayload = (SecurePaymentsPayload) this.f94574a.getParcelableExtra("com.google.android.gms.wallet.firstparty.SECURE_PAYMENTS_PAYLOAD");
        byte[] byteArrayExtra = this.f94574a.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS");
        boolean z5 = true;
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
        if (securePaymentsPayload != null) {
            z3 = true;
        } else {
            z3 = z || z2;
        }
        sdo.m34975b(z3, "One of SecurePaymentsPayload, encrypted parameters, or unencrypted parameters required");
        if (securePaymentsPayload != null) {
            byte[] bArr = securePaymentsPayload.f110176a;
            if (bArr == null || bArr.length == 0) {
                z4 = false;
            } else {
                z4 = true;
            }
            sdo.m34975b(z4, "SecurePaymentsPayload requires an opaque token");
            if (z) {
                z5 = false;
            } else if (z2) {
                z5 = false;
            }
            sdo.m34975b(z5, "Can't have both SecurePaymentsPayload and either encrypted or unencrypted parameters");
        }
    }

    /* renamed from: a */
    public final void mo52235a(SecurePaymentsPayload securePaymentsPayload) {
        this.f94574a.putExtra("com.google.android.gms.wallet.firstparty.SECURE_PAYMENTS_PAYLOAD", securePaymentsPayload);
    }
}
