package p000;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: asjy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asjy {

    /* renamed from: e */
    static final long f89100e = TimeUnit.DAYS.toSeconds(1);

    /* renamed from: f */
    static final long f89101f = TimeUnit.HOURS.toSeconds(6);

    /* renamed from: g */
    private static final srn f89102g = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: a */
    public final boolean f89103a;

    /* renamed from: b */
    public final long f89104b;

    /* renamed from: c */
    public final long f89105c;

    /* renamed from: d */
    public final int f89106d;

    public asjy(boolean z, long j, long j2, int i) {
        this.f89103a = z;
        this.f89104b = j;
        this.f89105c = j2;
        this.f89106d = i;
    }

    /* renamed from: a */
    private static asjy m74261a() {
        return new asjy(true, f89100e, f89101f, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return TextUtils.equals(toString(), ((asjy) obj).toString());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f89103a), Long.valueOf(this.f89104b), Long.valueOf(this.f89105c), Integer.valueOf(this.f89106d)});
    }

    public final String toString() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("requiresCharging", this.f89103a);
            jSONObject.put("periodSeconds", this.f89104b);
            jSONObject.put("flexSeconds", this.f89105c);
            jSONObject.put("requiredNetworkState", this.f89106d);
            return jSONObject.toString();
        } catch (JSONException e) {
            bnsl bnsl = (bnsl) f89102g.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("asjy", "toString", 113, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("unable to serialize json");
            return "JSON Parsing Error";
        }
    }

    /* renamed from: a */
    public static asjy m74262a(String str) {
        boolean z;
        long j;
        long j2;
        int i;
        if (TextUtils.isEmpty(str)) {
            return m74261a();
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("requiresCharging")) {
                z = jSONObject.getBoolean("requiresCharging");
            } else {
                z = true;
            }
            if (jSONObject.has("periodSeconds")) {
                j = jSONObject.getLong("periodSeconds");
            } else {
                j = f89100e;
            }
            if (jSONObject.has("flexSeconds")) {
                j2 = jSONObject.getLong("flexSeconds");
            } else {
                j2 = f89101f;
            }
            if (jSONObject.has("requiredNetworkState")) {
                i = jSONObject.getInt("requiredNetworkState");
            } else {
                i = 0;
            }
            return new asjy(z, j, j2, i);
        } catch (JSONException e) {
            bnsl bnsl = (bnsl) f89102g.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("asjy", "a", 98, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Unable to parse json: %s", str);
            return m74261a();
        }
    }
}
