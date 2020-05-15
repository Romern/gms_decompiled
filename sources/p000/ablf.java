package p000;

import android.content.Context;
import android.os.Build;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.config.ModuleManager;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ablf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ablf {
    static {
        sgj sgj = sgj.UNKNOWN;
    }

    /* renamed from: a */
    public static String m47850a(Context context) {
        int i;
        ModuleManager moduleManager = ModuleManager.get(context);
        sdo.m34959a(moduleManager);
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject put = jSONObject.put("os", "Android").put("osVersion", String.valueOf(Build.VERSION.SDK_INT)).put("app", "com.google.android.gms");
            try {
                i = moduleManager.getCurrentModule().moduleVersion;
            } catch (Exception e) {
                i = 0;
            }
            put.put("appVersion", String.valueOf(i));
            int i2 = Build.VERSION.SDK_INT;
            jSONObject.put("isDarkTheme", context.getResources().getBoolean(C0126R.bool.dark_mode_enabled));
            if (ceka.f182818a.mo6606a().mo79204b()) {
                int i3 = Build.VERSION.SDK_INT;
                jSONObject.put("isAndroidGo", context.getPackageManager().hasSystemFeature("android.hardware.ram.low"));
            }
        } catch (JSONException e2) {
        }
        String replaceAll = jSONObject.toString().replaceAll("\\(|\\)", "_");
        return String.format(Locale.US, "GdsIdWebView (%s)", replaceAll);
    }
}
