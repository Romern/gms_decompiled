package p000;

import android.content.res.Configuration;
import android.os.AsyncTask;
import android.provider.Settings;
import android.text.TextUtils;
import com.google.android.gms.auth.firstparty.shared.LatencyTracker;
import com.google.android.gms.auth.login.BrowserChimeraActivity;
import java.net.URLEncoder;
import java.util.Locale;

/* renamed from: jeo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jeo extends AsyncTask {

    /* renamed from: a */
    final /* synthetic */ BrowserChimeraActivity f22298a;

    public jeo(BrowserChimeraActivity browserChimeraActivity) {
        this.f22298a = browserChimeraActivity;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        String str;
        Void[] voidArr = (Void[]) objArr;
        BrowserChimeraActivity browserChimeraActivity = this.f22298a;
        String str2 = browserChimeraActivity.f10974a;
        String str3 = browserChimeraActivity.f10975m;
        String a = ryv.m34681a(browserChimeraActivity, "device_country", null);
        String valueOf = String.valueOf(browserChimeraActivity.f10976n);
        String valueOf2 = String.valueOf(valueOf.length() == 0 ? new String("&lang=") : "&lang=".concat(valueOf));
        String str4 = browserChimeraActivity.f10976n;
        String lowerCase = browserChimeraActivity.f10977o.toLowerCase(Locale.US);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 14 + String.valueOf(str4).length() + String.valueOf(lowerCase).length());
        sb.append(valueOf2);
        sb.append("&langCountry=");
        sb.append(str4);
        sb.append("_");
        sb.append(lowerCase);
        String sb2 = sb.toString();
        Configuration configuration = new Configuration();
        Settings.System.getConfiguration(browserChimeraActivity.getContentResolver(), configuration);
        if (configuration.mcc != 0) {
            String valueOf3 = String.valueOf(sb2);
            String num = Integer.toString(configuration.mcc);
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 5 + String.valueOf(num).length());
            sb3.append(valueOf3);
            sb3.append("&mcc=");
            sb3.append(num);
            sb2 = sb3.toString();
        }
        String concat = String.valueOf(sb2).concat("&xoauth_display_name=Android%20Phone");
        if (a != null) {
            String valueOf4 = String.valueOf(concat);
            StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf4).length() + 4 + a.length());
            sb4.append(valueOf4);
            sb4.append("&cc=");
            sb4.append(a);
            concat = sb4.toString();
        }
        if (str3 == null) {
            str3 = "https://accounts.google.com/o/android/auth?";
        }
        StringBuilder sb5 = new StringBuilder(str3.length() + 15 + String.valueOf(concat).length());
        sb5.append(str3);
        sb5.append("&source=android");
        sb5.append(concat);
        String sb6 = sb5.toString();
        if (str2 != null) {
            String valueOf5 = String.valueOf(sb6);
            String encode = URLEncoder.encode(str2);
            StringBuilder sb7 = new StringBuilder(String.valueOf(valueOf5).length() + 7 + String.valueOf(encode).length());
            sb7.append(valueOf5);
            sb7.append("&Email=");
            sb7.append(encode);
            str = String.valueOf(sb7.toString()).concat("&tmpl=reauth");
        } else {
            str = String.valueOf(sb6).concat("&tmpl=new_account");
        }
        if (browserChimeraActivity.f22281d) {
            str = String.valueOf(str).concat("&is_setup_wizard=1");
        }
        if (browserChimeraActivity.f22282e) {
            str = String.valueOf(str).concat("&use_immersive_mode=1");
        }
        if (browserChimeraActivity.f10981s != null) {
            String valueOf6 = String.valueOf(str);
            String str5 = browserChimeraActivity.f10981s;
            StringBuilder sb8 = new StringBuilder(String.valueOf(valueOf6).length() + 8 + String.valueOf(str5).length());
            sb8.append(valueOf6);
            sb8.append("&pEmail=");
            sb8.append(str5);
            str = sb8.toString();
        }
        if (browserChimeraActivity.f10982t != null) {
            String valueOf7 = String.valueOf(str);
            String str6 = browserChimeraActivity.f10982t;
            StringBuilder sb9 = new StringBuilder(String.valueOf(valueOf7).length() + 7 + String.valueOf(str6).length());
            sb9.append(valueOf7);
            sb9.append("&pName=");
            sb9.append(str6);
            str = sb9.toString();
        }
        String S = gnv.m13509S();
        if (!TextUtils.isEmpty(S)) {
            String valueOf8 = String.valueOf(str);
            StringBuilder sb10 = new StringBuilder(String.valueOf(valueOf8).length() + 3 + String.valueOf(S).length());
            sb10.append(valueOf8);
            sb10.append("&d=");
            sb10.append(S);
            str = sb10.toString();
        }
        String U = gnv.m13511U();
        if (TextUtils.isEmpty(U)) {
            return str;
        }
        String valueOf9 = String.valueOf(str);
        StringBuilder sb11 = new StringBuilder(String.valueOf(valueOf9).length() + 5 + String.valueOf(U).length());
        sb11.append(valueOf9);
        sb11.append("&gae=");
        sb11.append(U);
        return sb11.toString();
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        this.f22298a.f10980r.removeAllCookie();
        BrowserChimeraActivity browserChimeraActivity = this.f22298a;
        LatencyTracker latencyTracker = browserChimeraActivity.f22280c;
        browserChimeraActivity.f10979q.loadUrl((String) obj, browserChimeraActivity.f10978p);
    }
}
