package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.C0387d;
import com.google.android.gms.ads.internal.client.C0334a;
import com.google.android.gms.ads.internal.config.C0371o;
import com.google.android.gms.ads.internal.util.client.C0633h;

/* renamed from: com.google.android.gms.ads.internal.overlay.d */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0526d {
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
    public static final void m5520a(Context context, AdOverlayInfoParcel adOverlayInfoParcel) {
        if (adOverlayInfoParcel.f8555k == 4 && adOverlayInfoParcel.f8547c == null) {
            C0334a aVar = adOverlayInfoParcel.f8546b;
            if (aVar != null) {
                aVar.mo6580a();
            }
            C0518a aVar2 = C0387d.f8300a.f8301b;
            AdLauncherIntentInfoParcel adLauncherIntentInfoParcel = adOverlayInfoParcel.f8545a;
            C0529g gVar = adOverlayInfoParcel.f8553i;
            if (adLauncherIntentInfoParcel != null) {
                C0371o.m5339a(context);
                Intent intent = adLauncherIntentInfoParcel.f8544h;
                if (intent != null) {
                    C0518a.m5516a(context, intent, gVar);
                    return;
                }
                Intent intent2 = new Intent();
                if (TextUtils.isEmpty(adLauncherIntentInfoParcel.f8538b)) {
                    C0633h.m5672d("Open GMSG did not contain a URL.");
                    return;
                }
                if (!TextUtils.isEmpty(adLauncherIntentInfoParcel.f8539c)) {
                    intent2.setDataAndType(Uri.parse(adLauncherIntentInfoParcel.f8538b), adLauncherIntentInfoParcel.f8539c);
                } else {
                    intent2.setData(Uri.parse(adLauncherIntentInfoParcel.f8538b));
                }
                intent2.setAction("android.intent.action.VIEW");
                if (!TextUtils.isEmpty(adLauncherIntentInfoParcel.f8540d)) {
                    intent2.setPackage(adLauncherIntentInfoParcel.f8540d);
                }
                int i = 0;
                if (!TextUtils.isEmpty(adLauncherIntentInfoParcel.f8541e)) {
                    String[] split = adLauncherIntentInfoParcel.f8541e.split("/", 2);
                    if (split.length < 2) {
                        String valueOf = String.valueOf(adLauncherIntentInfoParcel.f8541e);
                        C0633h.m5672d(valueOf.length() == 0 ? new String("Could not parse component name from open GMSG: ") : "Could not parse component name from open GMSG: ".concat(valueOf));
                        return;
                    }
                    intent2.setClassName(split[0], split[1]);
                }
                String str = adLauncherIntentInfoParcel.f8542f;
                if (!TextUtils.isEmpty(str)) {
                    try {
                        i = Integer.parseInt(str);
                    } catch (NumberFormatException e) {
                        C0633h.m5672d("Could not parse intent flags.");
                    }
                    intent2.addFlags(i);
                }
                if (((Boolean) C0371o.f8235am.mo6604a()).booleanValue()) {
                    intent2.addFlags(268435456);
                    intent2.putExtra("android.support.customtabs.extra.user_opt_out", true);
                } else if (((Boolean) C0371o.f8234al.mo6604a()).booleanValue()) {
                    C0387d.m5363a();
                    int i2 = Build.VERSION.SDK_INT;
                    Bundle bundle = intent2.getExtras() == null ? new Bundle() : intent2.getExtras();
                    bundle.putBinder("android.support.customtabs.extra.SESSION", null);
                    bundle.putString("com.android.browser.application_id", context.getPackageName());
                    intent2.putExtras(bundle);
                }
                C0518a.m5516a(context, intent2, gVar);
                return;
            }
            C0633h.m5672d("No intent data for launcher overlay.");
            return;
        }
        Intent intent3 = new Intent();
        intent3.setClassName(context, "com.google.android.gms.ads.AdActivity");
        intent3.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", adOverlayInfoParcel.f8557m.f8952d);
        intent3.putExtra("shouldCallOnOverlayOpened", true);
        Bundle bundle2 = new Bundle(1);
        bundle2.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", adOverlayInfoParcel);
        intent3.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle2);
        int i3 = Build.VERSION.SDK_INT;
        if (!(context instanceof Activity)) {
            intent3.addFlags(268435456);
        }
        C0387d.m5363a().mo6850a(context, intent3);
    }
}
