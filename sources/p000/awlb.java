package p000;

import android.content.Context;
import android.content.Intent;

/* renamed from: awlb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awlb extends awjx {
    public awlb(Context context) {
        super(context, "com.google.android.gms.wallet.firstparty.ACTION_VERIFY_IDENTITY", "flow_id_credit");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo52189a(Intent intent) {
        byte[] byteArrayExtra = this.f94574a.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS");
        byte[] byteArrayExtra2 = this.f94574a.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN");
        boolean z = true;
        if ((byteArrayExtra == null || byteArrayExtra.length <= 0) && (byteArrayExtra2 == null || byteArrayExtra2.length <= 0)) {
            z = false;
        }
        sdo.m34975b(z, "Either encrypted parameters or initialization token is required");
    }

    /* renamed from: b */
    public final void mo52232b(byte[] bArr) {
        this.f94574a.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN", bArr);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: awjx.<init>(java.lang.String, java.lang.String, boolean, android.content.Intent):void
     arg types: [java.lang.String, java.lang.String, int, android.content.Intent]
     candidates:
      awjx.<init>(android.content.Context, java.lang.String, java.lang.String, boolean):void
      awjx.<init>(java.lang.String, java.lang.String, boolean, android.content.Intent):void */
    public awlb(Intent intent) {
        super("com.google.android.gms.wallet.firstparty.ACTION_VERIFY_IDENTITY", "flow_id_credit", true, intent);
    }

    /* renamed from: a */
    public final void mo52231a(byte[] bArr) {
        this.f94574a.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS", bArr);
    }
}
