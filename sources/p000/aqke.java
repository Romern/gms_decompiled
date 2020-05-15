package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.felicanetworks.mfc.C0126R;
import java.util.Locale;

/* renamed from: aqke */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqke {

    /* renamed from: a */
    public final sru f86270a;

    public aqke(Context context, aqka aqka, Bundle bundle) {
        String str;
        int i;
        this.f86270a = new sru(context);
        if (bundle == null || !bundle.getBoolean("savedWebView")) {
            ContentResolver contentResolver = context.getContentResolver();
            ContentResolver contentResolver2 = context.getContentResolver();
            String str2 = aqka.f86266m;
            if (str2 != null) {
                str = aymn.m84264a(contentResolver2, str2);
            } else {
                str = null;
            }
            str = TextUtils.isEmpty(str) ? aqka.f86267n : str;
            str = TextUtils.isEmpty(str) ? aqka.f86268o : str;
            str = TextUtils.isEmpty(str) ? "" : str;
            if (str.contains("%m")) {
                try {
                    Configuration configuration = new Configuration();
                    Settings.System.getConfiguration(contentResolver, configuration);
                    if (configuration.mcc != 0) {
                        str = str.replace("%m", Integer.toString(configuration.mcc));
                    }
                } catch (Exception e) {
                }
                str = str.replace("%m", "%s");
            }
            if (str.contains("%s")) {
                Locale locale = Locale.getDefault();
                String language = locale.getLanguage();
                String lowerCase = locale.getCountry().toLowerCase(Locale.US);
                StringBuilder sb = new StringBuilder(String.valueOf(language).length() + 1 + String.valueOf(lowerCase).length());
                sb.append(language);
                sb.append("_");
                sb.append(lowerCase);
                str = str.replace("%s", sb.toString());
            }
            str = str.contains("%y") ? str.replace("%y", Locale.getDefault().getLanguage()) : str;
            if (str.contains("%z")) {
                try {
                    TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                    Configuration configuration2 = new Configuration();
                    Settings.System.getConfiguration(contentResolver, configuration2);
                    if (telephonyManager != null) {
                        if (configuration2.mcc != 0) {
                            String simCountryIso = telephonyManager.getSimCountryIso();
                            if (TextUtils.isEmpty(simCountryIso)) {
                                simCountryIso = "us";
                            }
                            str = str.replace("%z", simCountryIso);
                        }
                    }
                } catch (Exception e2) {
                }
                str = str.replace("%z", Locale.getDefault().getCountry().toLowerCase(Locale.US));
            }
            sru sru = this.f86270a;
            sru.mo26029a(str, str);
            if (!stn.m36304a("ro.carrier", "").equals("wifi-only")) {
                i = C0126R.string.common_url_load_unsuccessful_message;
            } else {
                i = C0126R.string.common_url_load_unsuccessful_message_wifi_only;
            }
            sru.mo26028a(context.getString(i));
            sru.mo26032b();
            WebView a = mo47932a();
            if (a != null) {
                int i2 = Build.VERSION.SDK_INT;
                a.getSettings().setDisabledActionModeMenuItems(7);
                return;
            }
            return;
        }
        WebView a2 = mo47932a();
        if (a2 != null) {
            a2.restoreState(bundle);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final WebView mo47932a() {
        ViewGroup a = this.f86270a.mo26027a();
        for (int i = 0; i < a.getChildCount(); i++) {
            View childAt = a.getChildAt(i);
            if (childAt instanceof WebView) {
                return (WebView) childAt;
            }
        }
        return null;
    }
}
