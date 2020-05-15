package p000;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: aztz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class aztz {
    /* renamed from: a */
    public static bmxv m86250a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            azty azty = new azty();
            String string = jSONObject.getString("callToken");
            if (string != null) {
                azty.f100033a = string;
                String string2 = jSONObject.getString("methodName");
                if (string2 != null) {
                    azty.f100034b = string2;
                    ArrayList arrayList = new ArrayList();
                    if (jSONObject.has("arguments")) {
                        JSONArray jSONArray = jSONObject.getJSONArray("arguments");
                        for (int i = 0; i < jSONArray.length(); i++) {
                            arrayList.add(!jSONArray.isNull(i) ? jSONArray.get(i) : null);
                        }
                    }
                    azty.f100035c = arrayList;
                    String str2 = "";
                    if (azty.f100033a == null) {
                        str2 = " callToken";
                    }
                    if (azty.f100034b == null) {
                        str2 = str2.concat(" methodName");
                    }
                    if (azty.f100035c == null) {
                        str2 = String.valueOf(str2).concat(" arguments");
                    }
                    if (str2.isEmpty()) {
                        return bmxv.m108566b(new azqo(azty.f100033a, azty.f100034b, azty.f100035c));
                    }
                    String valueOf = String.valueOf(str2);
                    throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
                }
                throw new NullPointerException("Null methodName");
            }
            throw new NullPointerException("Null callToken");
        } catch (JSONException e) {
            return bmvz.f131120a;
        }
    }

    /* renamed from: a */
    public abstract String mo55228a();

    /* renamed from: b */
    public abstract String mo55229b();

    /* renamed from: c */
    public abstract List mo55230c();
}
