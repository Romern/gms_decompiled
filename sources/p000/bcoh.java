package p000;

import android.os.Build;
import java.io.Serializable;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bcoh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bcoh implements Serializable {
    /* renamed from: a */
    public static bmxv m89461a(JSONObject jSONObject) {
        bmxv bmxv;
        try {
            bcoe f = m89462f();
            f.mo57052a(jSONObject.getLong("REGISTRATION_ID"));
            JSONObject jSONObject2 = jSONObject.getJSONObject("ACCOUNT_USERS");
            try {
                bcok g = bcol.m89477g();
                if (jSONObject2.has("GAIA_EMAIL")) {
                    g.mo57067b(jSONObject2.getString("GAIA_EMAIL"));
                }
                if (jSONObject2.has("DEVICE_ID")) {
                    g.mo57065a(jSONObject2.getString("DEVICE_ID"));
                }
                HashSet hashSet = new HashSet();
                JSONArray jSONArray = jSONObject2.getJSONArray("PHONE_NUMBERS");
                for (int i = 0; i < jSONArray.length(); i++) {
                    hashSet.add(jSONArray.getString(i));
                }
                g.mo57066a(hashSet);
                g.mo57068c(jSONObject2.getString("TACHYON_APP_NAME"));
                bmxv = bmxv.m108566b(g.mo57063a());
            } catch (JSONException e) {
                bbos.m88294d("AccountUsers", "failed to convert JSONObject to AccountUsers");
                bmxv = bmvz.f131120a;
            }
            if (bmxv.mo66813a()) {
                f.mo57055a((bcol) bmxv.mo66814b());
            }
            String string = jSONObject.getString("SERVER_REGISTRATION_ID");
            int i2 = Build.VERSION.SDK_INT;
            f.mo57056a(ByteString.m123259a(string, StandardCharsets.UTF_8));
            f.mo57053a(bcog.m89460a(jSONObject.getInt("SERVER_REGISTRATION_STATUS")));
            return bmxv.m108566b(f.mo57051a());
        } catch (JSONException e2) {
            bbos.m88294d("AccountContext", "failed to convert JSONObject to AccountContext");
            return bmvz.f131120a;
        }
    }

    /* renamed from: f */
    public static bcoe m89462f() {
        bcoe bcoe = new bcoe();
        bcoe.mo57052a(-1);
        return bcoe;
    }

    /* renamed from: a */
    public abstract long mo57057a();

    /* renamed from: b */
    public abstract bcol mo57058b();

    /* renamed from: c */
    public abstract ByteString mo57059c();

    /* renamed from: d */
    public abstract bcog mo57060d();

    /* renamed from: e */
    public final String mo57061e() {
        return mo57058b().mo57073d();
    }

    /* renamed from: g */
    public final bmxv mo57062g() {
        bmxv bmxv;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("REGISTRATION_ID", mo57057a());
            bcol b = mo57058b();
            try {
                JSONObject jSONObject2 = new JSONObject();
                bmxv a = b.mo57069a();
                if (a.mo66813a()) {
                    jSONObject2.put("GAIA_EMAIL", a.mo66814b());
                }
                if (b.mo57072c().mo66813a()) {
                    jSONObject2.put("DEVICE_ID", b.mo57072c().mo66814b());
                }
                jSONObject2.put("PHONE_NUMBERS", new JSONArray((Collection) b.mo57071b()));
                jSONObject2.put("TACHYON_APP_NAME", b.mo57073d());
                bngx<Object> f = b.mo57075f();
                bmxj bmxj = bcoj.f104620a;
                JSONArray jSONArray = new JSONArray();
                for (Object obj : f) {
                    bmxv bmxv2 = (bmxv) bmxj.apply(obj);
                    if (bmxv2.mo66813a()) {
                        jSONArray.put(bmxv2.mo66814b());
                    }
                }
                jSONObject2.put("ALL", jSONArray);
                bmxv = bmxv.m108566b(jSONObject2);
            } catch (JSONException e) {
                bbos.m88294d("AccountUsers", "failed to convert AccountUsers to JSONObject");
                bmxv = bmvz.f131120a;
            }
            if (!bmxv.mo66813a()) {
                return bmvz.f131120a;
            }
            jSONObject.put("ACCOUNT_USERS", bmxv.mo66814b());
            ByteString c = mo57059c();
            int i = Build.VERSION.SDK_INT;
            jSONObject.put("SERVER_REGISTRATION_ID", c.mo73773b(StandardCharsets.UTF_8));
            jSONObject.put("SERVER_REGISTRATION_STATUS", mo57060d().f104618c);
            return bmxv.m108566b(jSONObject);
        } catch (JSONException e2) {
            bbos.m88294d("AccountContext", "failed to convert AccountContext to JSONObject");
            return bmvz.f131120a;
        }
    }
}
