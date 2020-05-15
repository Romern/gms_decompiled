package p000;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Fragment;
import com.google.android.gms.udc.p077ui.AuthenticatingWebViewChimeraActivity;
import java.lang.ref.WeakReference;
import java.util.regex.Pattern;

/* renamed from: avin */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avin {

    /* renamed from: a */
    private final WeakReference f93235a;

    /* renamed from: b */
    private final String f93236b;

    /* renamed from: c */
    private final avil f93237c;

    public avin(Context context, avil avil) {
        this.f93235a = new WeakReference(context);
        this.f93236b = context.getPackageName();
        this.f93237c = avil;
    }

    /* renamed from: a */
    public static Intent m78589a(String str, String str2, String str3) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        if (!TextUtils.isEmpty(str2)) {
            intent.setData(avji.m78610a(str2, str));
        }
        intent.setFlags(131076);
        intent.putExtra("com.android.browser.application_id", str3);
        return intent;
    }

    public avin(Fragment fragment) {
        this(fragment.getActivity(), new avik(fragment));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.Intent.putExtra(java.lang.String, int):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, int[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Bundle):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.io.Serializable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent} */
    /* renamed from: a */
    public final avim mo51273a(String str, String str2) {
        boolean z;
        Intent intent;
        if (TextUtils.isEmpty(str)) {
            return new avim(false, bsoy.LINK_OPENED_IN_BROWSER);
        }
        Pattern g = AuthenticatingWebViewChimeraActivity.m93670g();
        if (g == null || !g.matcher(str).matches()) {
            z = false;
        } else {
            z = true;
        }
        bsoy bsoy = !z ? bsoy.LINK_OPENED_IN_BROWSER : bsoy.LINK_OPENED_IN_WEBVIEW;
        if (z) {
            sdo.m34974b(!TextUtils.isEmpty(str));
            intent = new Intent("android.intent.action.VIEW", Uri.parse(str)).setClassName(rpr.m34216b(), "com.google.android.gms.udc.ui.AuthenticatingWebViewActivity").putExtra("AuthWebviewHomeAsUpEnabled", true).putExtra("AuthWebviewShowProgressBar", true).putExtra("AuthWebviewTitle", (CharSequence) null).putExtra("AuthWebviewAccountName", str2);
        } else {
            intent = m78589a(str, str2, this.f93236b);
        }
        try {
            return new avim(this.f93237c.mo51272a(intent), bsoy);
        } catch (ActivityNotFoundException e) {
            Context context = (Context) this.f93235a.get();
            if (context != null) {
                Toast.makeText(context, (int) C0126R.string.udc_unable_open_url, 1).show();
            }
            return new avim(false, bsoy);
        }
    }
}
