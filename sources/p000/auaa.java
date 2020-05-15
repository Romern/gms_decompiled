package p000;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Message;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;

/* renamed from: auaa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auaa {

    /* renamed from: a */
    public static final Uri f91306a = Uri.parse("wear://*/tapandpay/proxy");

    /* renamed from: b */
    public static final bmxe f91307b = new atzy();

    /* renamed from: c */
    public static final bmxe f91308c = new atzz();

    /* renamed from: d */
    private static final srn f91309d = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: a */
    public static Bundle m76623a() {
        Bundle bundle = new Bundle();
        bundle.putString("type", "stopProxyRequest");
        return bundle;
    }

    /* renamed from: b */
    public static Bundle m76634b() {
        Bundle bundle = new Bundle();
        bundle.putString("type", "errorDismiss");
        return bundle;
    }

    /* renamed from: c */
    public static Bundle m76636c() {
        Bundle bundle = new Bundle();
        bundle.putString("type", "proxyApiVersionResponse");
        bundle.putInt("phoneProxyVersion", 7);
        bundle.putInt("phoneOsType", 2);
        return bundle;
    }

    /* renamed from: a */
    public static Bundle m76624a(int i) {
        Bundle bundle = new Bundle();
        bundle.putString("type", "errorResponse");
        bundle.putInt("selectedButtonType", i);
        return bundle;
    }

    /* renamed from: b */
    public static Bundle m76635b(int i, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putString("type", "apiResponse");
        bundle2.putInt("requestId", i);
        bundle2.putBundle("data", bundle);
        return bundle2;
    }

    /* renamed from: c */
    public static Bundle m76637c(int i, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putString("type", "serviceResponse");
        bundle2.putInt("what", i);
        bundle2.putBundle("data", bundle);
        return bundle2;
    }

    /* renamed from: a */
    public static Bundle m76625a(int i, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putString("type", "proxyResponse");
        bundle2.putInt("resultCode", i);
        bundle2.putBundle("data", bundle);
        return bundle2;
    }

    /* renamed from: a */
    public static Bundle m76626a(int i, AccountInfo accountInfo, String str, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putString("type", "crossbarRequest");
        bundle.putInt("requestId", i);
        bundle.putString("method", str);
        bundle.putByteArray("message", bArr);
        bundle.putParcelable("accountInfo", accountInfo);
        return bundle;
    }

    /* renamed from: a */
    public static Bundle m76627a(int i, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("type", "crossbarResponse");
        bundle.putInt("requestId", i);
        bundle.putString("error", str);
        return bundle;
    }

    /* renamed from: a */
    public static Bundle m76628a(int i, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putString("type", "crossbarResponse");
        bundle.putInt("requestId", i);
        bundle.putByteArray("message", bArr);
        return bundle;
    }

    /* renamed from: a */
    public static Bundle m76629a(Message message) {
        Bundle bundle = new Bundle();
        bundle.putString("type", "serviceRequest");
        bundle.putInt("what", message.what);
        bundle.putBundle("data", message.peekData());
        return bundle;
    }

    /* renamed from: a */
    public static Bundle m76630a(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("type", "proxyApiVersionRequest");
        bundle.putInt("version", 7);
        bundle.putString("nodeId", str);
        return bundle;
    }

    /* renamed from: a */
    public static Bundle m76631a(String str, int i, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putString("type", "apiRequest");
        bundle2.putString("method", str);
        bundle2.putInt("requestId", i);
        bundle2.putBundle("data", bundle);
        return bundle2;
    }

    /* renamed from: a */
    public static Bundle m76632a(String str, String str2, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putString("type", "errorRequest");
        bundle.putString("errorTitle", str);
        bundle.putString("errorText", str2);
        bundle.putBoolean("errorIsRetryable", z);
        return bundle;
    }

    /* renamed from: a */
    public static void m76633a(Context context, String str, Bundle bundle, boolean z) {
        Intent startIntent = IntentOperation.getStartIntent(context, "com.google.android.gms.tapandpay.wear.WearProxyMessageIntentOperation", "com.google.android.gms.tapandpay.wear.SEND_MESSAGE");
        if (startIntent == null) {
            bnsl bnsl = (bnsl) f91309d.mo68387b();
            bnsl.mo68432a("auaa", "a", 347, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("getStartIntent returned null");
            return;
        }
        startIntent.putExtra("nodeId", str);
        startIntent.putExtra("data", bundle);
        startIntent.putExtra("shouldCompressRpcs", z);
        context.startService(startIntent);
    }
}
