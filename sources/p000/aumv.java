package p000;

import android.content.ContentValues;
import android.os.Bundle;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: aumv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aumv extends auml {

    /* renamed from: a */
    public static final aumy[] f92106a;

    /* renamed from: b */
    public static final aumm f92107b = new aumu();

    /* renamed from: c */
    public static final aumy f92108c = new aumy("trustlet_name", "");

    /* renamed from: f */
    public static final aumy f92109f = new aumy("is_trusted", (Boolean) null);

    /* renamed from: g */
    public static final aumy f92110g = new aumy("current_status_trigger", "unknown");

    /* renamed from: h */
    public static final aumy f92111h = new aumy("extra_trigger_info", "");

    /* renamed from: i */
    public static final aumy f92112i = new aumy("is_started", (Boolean) null);

    /* renamed from: j */
    public static final aumy f92113j = new aumy("is_configured", (Boolean) null);

    /* renamed from: k */
    public static final aumy f92114k = new aumy("can_provide_trust", (Boolean) null);

    /* renamed from: l */
    public static final aumy f92115l = new aumy("is_supported", (Boolean) null);

    /* renamed from: m */
    public static final aumy f92116m = new aumy("is_enabled_by_device_policy", (Boolean) null);

    /* renamed from: n */
    public static final aumy f92117n = new aumy("is_enabled_by_shared_pref", (Boolean) null);

    /* renamed from: o */
    public static final aumy f92118o;

    static {
        aumy aumy = new aumy("status_timestamp", "");
        f92118o = aumy;
        f92106a = new aumy[]{f92108c, f92109f, f92110g, f92111h, f92112i, f92113j, f92114k, f92115l, f92116m, f92117n, aumy};
    }

    public aumv(String str, ContentValues contentValues) {
        super(str, contentValues);
    }

    /* renamed from: a */
    public static aumv m77337a(Bundle bundle) {
        String string = bundle.getString("key_trustlet_status_model_id");
        String string2 = bundle.getString("key_trustlet_status_model_name");
        boolean z = bundle.getBoolean("key_trustlet_is_trusted");
        String string3 = bundle.getString("key_trustlet_status_trigger");
        String string4 = bundle.getString("key_trustlet_extra_trigger_info");
        boolean z2 = bundle.getBoolean("key_trustlet_is_auth_started");
        boolean z3 = bundle.getBoolean("key_trustlet_is_configured");
        boolean z4 = bundle.getBoolean("key_trustlet_can_provide_truste");
        boolean z5 = bundle.getBoolean("key_trustlet_is_suppored");
        boolean z6 = bundle.getBoolean("key_trustlet_is_enabled_by_device_policy");
        boolean z7 = bundle.getBoolean("key_trustlet_is_enabled_by_shared_preference");
        Long valueOf = Long.valueOf(bundle.getLong("key_trustlet_timestamp"));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS z");
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(valueOf.longValue());
        return new aumv(string, string2, z, string3, string4, z2, z3, z4, z5, z6, z7, simpleDateFormat.format(instance.getTime()));
    }

    /* renamed from: b */
    public final String mo50681b() {
        String str = (String) mo50671a(f92108c);
        return str == null ? "" : str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aumv) {
            aumv aumv = (aumv) obj;
            if (this.f92085d.equals(aumv.f92085d)) {
                aumy[] aumyArr = f92106a;
                int length = aumyArr.length;
                for (int i = 0; i < 11; i++) {
                    aumy aumy = aumyArr[i];
                    Object a = mo50671a(aumy);
                    if (a == null) {
                        if (aumv.mo50671a(aumy) != null) {
                            return false;
                        }
                    } else if (!a.equals(aumv.mo50671a(aumy))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        String str = (String) mo50671a(f92108c);
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        Boolean bool = (Boolean) mo50671a(f92109f);
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        Boolean valueOf = Boolean.valueOf(z);
        String str3 = (String) mo50671a(f92110g);
        if (str3 == null) {
            str3 = str2;
        }
        String str4 = (String) mo50671a(f92111h);
        if (str4 == null) {
            str4 = str2;
        }
        Boolean bool2 = (Boolean) mo50671a(f92112i);
        if (bool2 != null) {
            z2 = bool2.booleanValue();
        } else {
            z2 = false;
        }
        Boolean valueOf2 = Boolean.valueOf(z2);
        Boolean bool3 = (Boolean) mo50671a(f92113j);
        if (bool3 != null) {
            z3 = bool3.booleanValue();
        } else {
            z3 = false;
        }
        Boolean valueOf3 = Boolean.valueOf(z3);
        Boolean bool4 = (Boolean) mo50671a(f92114k);
        if (bool4 != null) {
            z4 = bool4.booleanValue();
        } else {
            z4 = false;
        }
        Boolean valueOf4 = Boolean.valueOf(z4);
        Boolean bool5 = (Boolean) mo50671a(f92115l);
        if (bool5 != null) {
            z5 = bool5.booleanValue();
        } else {
            z5 = false;
        }
        Boolean valueOf5 = Boolean.valueOf(z5);
        Boolean bool6 = (Boolean) mo50671a(f92116m);
        if (bool6 != null) {
            z6 = bool6.booleanValue();
        } else {
            z6 = false;
        }
        Boolean valueOf6 = Boolean.valueOf(z6);
        Boolean bool7 = (Boolean) mo50671a(f92117n);
        if (bool7 != null) {
            z7 = bool7.booleanValue();
        } else {
            z7 = false;
        }
        Boolean valueOf7 = Boolean.valueOf(z7);
        String str5 = (String) mo50671a(f92118o);
        if (str5 != null) {
            str2 = str5;
        }
        return Arrays.hashCode(new Object[]{str, valueOf, str3, str4, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, str2});
    }

    public aumv(String str, String str2) {
        super(str);
        mo50672a(f92108c, str2);
    }

    private aumv(String str, String str2, boolean z, String str3, String str4, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, String str5) {
        super(str);
        mo50672a(f92108c, str2);
        mo50672a(f92109f, Boolean.valueOf(z));
        mo50672a(f92110g, str3);
        mo50672a(f92111h, str4);
        mo50672a(f92112i, Boolean.valueOf(z2));
        mo50672a(f92113j, Boolean.valueOf(z3));
        mo50672a(f92114k, Boolean.valueOf(z4));
        mo50672a(f92115l, Boolean.valueOf(z5));
        mo50672a(f92116m, Boolean.valueOf(z6));
        mo50672a(f92117n, Boolean.valueOf(z7));
        mo50672a(f92118o, str5);
    }

    /* renamed from: a */
    public static Map m77338a(String str) {
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
            return hashMap;
        } catch (JSONException e) {
            return hashMap;
        }
    }

    /* renamed from: a */
    public static JSONObject m77339a(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put(str, str2);
        return m77341a(hashMap);
    }

    /* renamed from: a */
    public static JSONObject m77340a(String str, String str2, String str3, String str4) {
        HashMap hashMap = new HashMap();
        hashMap.put(str, str2);
        hashMap.put(str3, str4);
        return m77341a(hashMap);
    }

    /* renamed from: a */
    public static JSONObject m77341a(Map map) {
        return new JSONObject(map);
    }
}
