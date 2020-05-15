package p000;

import android.content.Context;
import android.os.Build;
import com.google.android.chimera.config.ModuleManager;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: akzx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akzx {

    /* renamed from: a */
    private static final Logger f73195a = akzt.m60725a("UserAgentHelper");

    /* renamed from: a */
    public static String m60730a(Context context, ModuleManager moduleManager) {
        int i;
        sdo.m34959a(moduleManager);
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject put = jSONObject.put("os", "Android").put("osVersion", String.valueOf(Build.VERSION.SDK_INT)).put("app", "com.google.android.gms");
            try {
                i = moduleManager.getCurrentModule().moduleVersion;
            } catch (Exception e) {
                f73195a.mo25408a("Unable to determine module version.", e, "");
                i = 0;
            }
            put.put("appVersion", String.valueOf(i)).put("style", 2);
            sre.m36087g(context);
            if (cbro.m128201e()) {
                jSONObject.put("isDarkTheme", adyf.m51386a(akvo.f72966a));
            }
        } catch (JSONException e2) {
        }
        String replaceAll = jSONObject.toString().replaceAll("\\(|\\)", "_");
        return String.format(Locale.US, "OcIdWebView (%s)", replaceAll);
    }
}
