package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.google.android.gms.wallet.firstparty.bootstrap.PaymentMethodsWidgetOptions;
import java.util.Locale;

/* renamed from: awkv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awkv extends awjx {
    public awkv(Context context) {
        super(context, "com.google.android.gms.wallet.firstparty.ACTION_BOOTSTRAP_WIDGET", "flow_bootstrap_widget");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo52189a(Intent intent) {
        boolean z;
        boolean z2;
        boolean z3;
        byte[] byteArrayExtra = this.f94574a.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS");
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
        byte[] byteArrayExtra3 = this.f94574a.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN");
        if (byteArrayExtra3 == null || byteArrayExtra3.length <= 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        sdo.m34975b(z ? true : z2 || z3, "Either encrypted parameters, unencrypted parameters, or an initialize token are required");
        if (this.f94574a.getIntExtra("com.google.android.gms.wallet.firstparty.EXTRA_WIDGET_TYPE", 0) == 0) {
            this.f94574a.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_WIDGET_TYPE", 1000);
        }
        Intent intent2 = this.f94574a;
        int intExtra = intent2.getIntExtra("com.google.android.gms.wallet.firstparty.EXTRA_WIDGET_TYPE", 0);
        Parcelable parcelableExtra = intent2.getParcelableExtra("com.google.android.gms.wallet.firstparty.EXTRA_WIDGET_OPTIONS");
        if ((parcelableExtra instanceof PaymentMethodsWidgetOptions) && intExtra != 10) {
            throw new IllegalArgumentException(String.format(Locale.US, "WidgetType %d doesn't match with widgetOptions class %s", Integer.valueOf(intExtra), parcelableExtra.getClass().toString()));
        }
    }

    /* renamed from: b */
    public final void mo52222b(byte[] bArr) {
        this.f94574a.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS", bArr);
    }

    /* renamed from: c */
    public final void mo52223c(int i) {
        this.f94574a.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_WIDGET_TYPE", i);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: awjx.<init>(java.lang.String, java.lang.String, boolean, android.content.Intent):void
     arg types: [java.lang.String, java.lang.String, int, android.content.Intent]
     candidates:
      awjx.<init>(android.content.Context, java.lang.String, java.lang.String, boolean):void
      awjx.<init>(java.lang.String, java.lang.String, boolean, android.content.Intent):void */
    public awkv(Intent intent) {
        super("com.google.android.gms.wallet.firstparty.ACTION_BOOTSTRAP_WIDGET", "flow_bootstrap_widget", true, intent);
    }

    /* renamed from: a */
    public final void mo52221a(byte[] bArr) {
        this.f94574a.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN", bArr);
    }
}
