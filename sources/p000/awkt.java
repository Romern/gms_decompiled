package p000;

import android.content.Intent;

/* renamed from: awkt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awkt extends awjx {
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: awjx.<init>(java.lang.String, java.lang.String, boolean, android.content.Intent):void
     arg types: [java.lang.String, java.lang.String, int, android.content.Intent]
     candidates:
      awjx.<init>(android.content.Context, java.lang.String, java.lang.String, boolean):void
      awjx.<init>(java.lang.String, java.lang.String, boolean, android.content.Intent):void */
    public awkt(Intent intent) {
        super("com.google.android.gms.wallet.firstparty.ACTION_ADD_INSTRUMENT_WIDGET", "flow_add_instrument", true, intent);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo52189a(Intent intent) {
        byte[] byteArrayExtra = this.f94574a.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS");
        boolean z = false;
        if (byteArrayExtra != null && byteArrayExtra.length > 0) {
            z = true;
        }
        sdo.m34975b(z, "add instrument parameters must be provided.");
    }

    /* renamed from: a */
    public final void mo52220a(byte[] bArr) {
        this.f94574a.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS", bArr);
    }
}
