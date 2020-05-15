package p000;

import android.content.ContentValues;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: aumt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aumt extends auml {

    /* renamed from: a */
    public static final aumy[] f92095a;

    /* renamed from: b */
    public static final aumm f92096b = new aums();

    /* renamed from: c */
    public static final aumy f92097c = new aumy("status_change_trigger", "unknown");

    /* renamed from: f */
    public static final aumy f92098f = new aumy("trigger_source", "");

    /* renamed from: g */
    public static final aumy f92099g = new aumy("is_trusted", (Boolean) null);

    /* renamed from: h */
    public static final aumy f92100h = new aumy("is_configured", (Boolean) null);

    /* renamed from: i */
    public static final aumy f92101i = new aumy("can_provide_trust", (Boolean) null);

    /* renamed from: j */
    public static final aumy f92102j = new aumy("is_device_idle", (Boolean) null);

    /* renamed from: k */
    public static final aumy f92103k = new aumy("require_user_auth", (Boolean) null);

    /* renamed from: l */
    public static final aumy f92104l = new aumy("trusted_trustlets", "");

    /* renamed from: m */
    public static final aumy f92105m;

    static {
        aumy aumy = new aumy("status_timestamp", "");
        f92105m = aumy;
        f92095a = new aumy[]{f92097c, f92098f, f92099g, f92100h, f92101i, f92102j, f92103k, f92104l, aumy};
    }

    public aumt(String str) {
        super(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aumt) {
            aumt aumt = (aumt) obj;
            if (this.f92085d.equals(aumt.f92085d)) {
                aumy[] aumyArr = f92095a;
                int length = aumyArr.length;
                for (int i = 0; i < 9; i++) {
                    aumy aumy = aumyArr[i];
                    Object a = mo50671a(aumy);
                    if (a == null) {
                        if (aumt.mo50671a(aumy) != null) {
                            return false;
                        }
                    } else if (!a.equals(aumt.mo50671a(aumy))) {
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
        String str = (String) mo50671a(f92097c);
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        String str3 = (String) mo50671a(f92098f);
        if (str3 == null) {
            str3 = str2;
        }
        Boolean bool = (Boolean) mo50671a(f92099g);
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        Boolean valueOf = Boolean.valueOf(z);
        Boolean bool2 = (Boolean) mo50671a(f92100h);
        if (bool2 != null) {
            z2 = bool2.booleanValue();
        } else {
            z2 = false;
        }
        Boolean valueOf2 = Boolean.valueOf(z2);
        Boolean bool3 = (Boolean) mo50671a(f92101i);
        if (bool3 != null) {
            z3 = bool3.booleanValue();
        } else {
            z3 = false;
        }
        Boolean valueOf3 = Boolean.valueOf(z3);
        Boolean bool4 = (Boolean) mo50671a(f92102j);
        if (bool4 != null) {
            z4 = bool4.booleanValue();
        } else {
            z4 = false;
        }
        Boolean valueOf4 = Boolean.valueOf(z4);
        Boolean bool5 = (Boolean) mo50671a(f92103k);
        if (bool5 != null) {
            z5 = bool5.booleanValue();
        } else {
            z5 = false;
        }
        Boolean valueOf5 = Boolean.valueOf(z5);
        String str4 = (String) mo50671a(f92104l);
        if (str4 == null) {
            str4 = str2;
        }
        String str5 = (String) mo50671a(f92105m);
        if (str5 != null) {
            str2 = str5;
        }
        return Arrays.hashCode(new Object[]{str, str3, valueOf, valueOf2, valueOf3, valueOf4, valueOf5, str4, str2});
    }

    public aumt(String str, ContentValues contentValues) {
        super(str, contentValues);
    }

    public aumt(String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, List list, Long l) {
        super(str);
        String str4;
        mo50672a(f92097c, str2);
        mo50672a(f92098f, str3);
        mo50672a(f92099g, Boolean.valueOf(z));
        mo50672a(f92100h, Boolean.valueOf(z2));
        mo50672a(f92101i, Boolean.valueOf(z3));
        mo50672a(f92102j, Boolean.valueOf(z4));
        mo50672a(f92103k, Boolean.valueOf(z5));
        aumy aumy = f92104l;
        Collections.sort(list);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("Trusted Trustlets", new JSONArray((Collection) list));
            str4 = jSONObject.toString();
        } catch (JSONException e) {
            str4 = "";
        }
        mo50672a(aumy, str4);
        aumy aumy2 = f92105m;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS z");
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(l.longValue());
        mo50672a(aumy2, simpleDateFormat.format(instance.getTime()));
    }
}
