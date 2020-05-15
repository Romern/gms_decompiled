package p000;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.felicanetworks.mfc.C0126R;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: oyi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class oyi {

    /* renamed from: a */
    private static final oxy[] f38614a = {new oxy(0, "com.google.android.projection.gearhead", C0126R.string.car_app_name, "Google LLC", C0126R.C0127drawable.car_app_android_auto), new oxy(1, "com.google.android.googlequicksearchbox", C0126R.string.car_frx_app_google_app, "Google LLC", C0126R.C0127drawable.car_app_google), new oxy(2, "com.google.android.music", C0126R.string.car_frx_app_play_music, "Google LLC", C0126R.C0127drawable.car_app_music), new oxy(3, "com.google.android.apps.maps", C0126R.string.car_frx_app_google_maps, "Google LLC", C0126R.C0127drawable.car_app_gmm), new oxy(4, "com.google.android.tts", C0126R.string.car_frx_app_tts, "Google LLC", C0126R.C0127drawable.car_app_tts), new oxy(3, "com.locnall.KimGiSa", C0126R.string.car_frx_app_kakaomap, "Kakao Mobility Corp.", C0126R.C0127drawable.car_app_kakaomap), new oxy(3, "com.waze", C0126R.string.car_frx_app_waze, "Waze", C0126R.C0127drawable.car_app_waze)};

    /* renamed from: a */
    public static Intent m29994a(Context context, String str, String str2) {
        PackageManager packageManager = context.getPackageManager();
        String str3 = str.length() == 0 ? new String("market://details?id=") : "market://details?id=".concat(str);
        if (str2 != null) {
            String valueOf = String.valueOf(str3);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 10 + str2.length());
            sb.append(valueOf);
            sb.append("&referrer=");
            sb.append(str2);
            str3 = sb.toString();
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str3));
        intent.setPackage("com.android.vending");
        if (intent.resolveActivity(packageManager) == null) {
            return null;
        }
        return intent;
    }

    /* renamed from: b */
    public static Intent m29998b(Context context, String str, String str2) {
        Intent a = m29994a(context, str, str2);
        if (a != null) {
            return a;
        }
        return new Intent("android.intent.action.VIEW", Uri.parse(str.length() == 0 ? new String("https://play.google.com/store/apps/details?id=") : "https://play.google.com/store/apps/details?id=".concat(str)));
    }

    /* renamed from: a */
    public static Intent m29995a(String str) {
        Intent intent = new Intent("com.android.vending.billing.PURCHASE");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.setPackage("com.android.vending");
        intent.putExtra("backend", 3);
        intent.putExtra("document_type", 1);
        intent.putExtra("full_docid", str);
        intent.putExtra("backend_docid", str);
        intent.putExtra("offer_type", 1);
        return intent;
    }

    /* renamed from: b */
    public static oxy m29999b(String str) {
        oxy[] oxyArr = f38614a;
        for (int i = 0; i < 7; i++) {
            oxy oxy = oxyArr[i];
            if (oxy.f38589b.equals(str)) {
                return oxy;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static CharSequence m29996a(Context context, oye oye) {
        ArrayList arrayList = new ArrayList();
        if (oye == null) {
            return "";
        }
        for (Map.Entry entry : oye.f38608a.entrySet()) {
            oyd oyd = (oyd) entry.getValue();
            oxy b = m29999b((String) entry.getKey());
            if (b != null) {
                int i = b.f38590c;
                if (i != 0) {
                    arrayList.add(context.getString(i));
                } else if (!TextUtils.isEmpty(b.f38592e)) {
                    arrayList.add(b.f38592e);
                }
            } else if (!TextUtils.isEmpty(oyd.f38607c)) {
                arrayList.add(oyd.f38607c);
            }
        }
        return bmxr.m108544a(", ").mo66874a((Iterable) arrayList);
    }

    /* renamed from: a */
    public static boolean m29997a(Intent intent) {
        String stringExtra = intent.getStringExtra("full_docid");
        bmxy.m108581a(stringExtra);
        return stringExtra.equals("com.google.android.projection.gearhead");
    }
}
