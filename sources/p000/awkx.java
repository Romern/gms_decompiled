package p000;

import android.content.Context;
import android.content.Intent;

/* renamed from: awkx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awkx extends awjx {
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: awjx.<init>(android.content.Context, java.lang.String, java.lang.String, boolean):void
     arg types: [android.content.Context, java.lang.String, java.lang.String, int]
     candidates:
      awjx.<init>(java.lang.String, java.lang.String, boolean, android.content.Intent):void
      awjx.<init>(android.content.Context, java.lang.String, java.lang.String, boolean):void */
    public awkx(Context context) {
        super(context, "com.google.android.gms.wallet.ACTION_CHECKOUT", "flow_checkout", false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo52189a(Intent intent) {
        boolean z = true;
        if (this.f94574a.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS") == null && this.f94574a.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN") == null) {
            z = false;
        }
        sdo.m34975b(z, "Either buyflow params or initialization token is required");
    }

    /* renamed from: b */
    public final void mo52227b(byte[] bArr) {
        this.f94574a.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN", bArr);
    }

    /* renamed from: c */
    public final void mo52228c(byte[] bArr) {
        this.f94574a.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_UNENCRYPTED_PARAMS", bArr);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: awjx.<init>(java.lang.String, java.lang.String, boolean, android.content.Intent):void
     arg types: [java.lang.String, java.lang.String, int, android.content.Intent]
     candidates:
      awjx.<init>(android.content.Context, java.lang.String, java.lang.String, boolean):void
      awjx.<init>(java.lang.String, java.lang.String, boolean, android.content.Intent):void */
    public awkx(Intent intent) {
        super("com.google.android.gms.wallet.ACTION_CHECKOUT", "flow_checkout", false, intent);
    }

    /* renamed from: a */
    public final void mo52226a(byte[] bArr) {
        this.f94574a.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS", bArr);
    }
}
