package p000;

import android.content.Context;
import android.content.Intent;

/* renamed from: awky */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awky extends awjx {
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: awjx.<init>(android.content.Context, java.lang.String, java.lang.String, boolean):void
     arg types: [android.content.Context, java.lang.String, ?[OBJECT, ARRAY], int]
     candidates:
      awjx.<init>(java.lang.String, java.lang.String, boolean, android.content.Intent):void
      awjx.<init>(android.content.Context, java.lang.String, java.lang.String, boolean):void */
    public awky(Context context) {
        super(context, "com.google.android.gms.wallet.firstparty.ACTION_SELECT_CUSTOMER", (String) null, true);
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
        sdo.m34975b(z, "Either parameters or initialization token is required");
    }
}
