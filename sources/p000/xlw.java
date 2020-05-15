package p000;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: xlw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xlw implements xhm {

    /* renamed from: g */
    private static final sek f52703g = new sek(new String[]{"CollectedClientData"}, (short[]) null);

    /* renamed from: a */
    private final xlv f52704a;

    /* renamed from: b */
    private final String f52705b;

    /* renamed from: c */
    private final String f52706c;

    /* renamed from: d */
    private final JSONObject f52707d;

    /* renamed from: e */
    private final String f52708e;

    /* renamed from: f */
    private final MessageDigest f52709f = xid.m42997a();

    public xlw(xlv xlv, String str, String str2, String str3, JSONObject jSONObject) {
        bmxy.m108581a(xlv);
        this.f52704a = xlv;
        bmxy.m108581a(str);
        this.f52705b = str;
        bmxy.m108581a(str2);
        this.f52706c = str2;
        bmxy.m108581a(str3);
        this.f52708e = str3;
        this.f52707d = jSONObject;
    }

    /* renamed from: a */
    public final JSONObject mo18664a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", this.f52704a);
            jSONObject.put("challenge", this.f52705b);
            jSONObject.put("origin", this.f52706c);
            jSONObject.put("androidPackageName", this.f52708e);
            JSONObject jSONObject2 = this.f52707d;
            if (jSONObject2 != null) {
                jSONObject.put("tokenBinding", jSONObject2);
            }
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    public final byte[] mo29926b() {
        try {
            return mo18664a().toString().getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            f52703g.mo25418e("UTF-8 encoding is not supported", new Object[0]);
            throw new RuntimeException(e);
        }
    }

    /* renamed from: c */
    public final byte[] mo29927c() {
        this.f52709f.update(mo29926b());
        return this.f52709f.digest();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xlw) {
            xlw xlw = (xlw) obj;
            if (this.f52705b.equals(xlw.f52705b) && this.f52706c.equals(xlw.f52706c) && this.f52708e.equals(xlw.f52708e)) {
                JSONObject jSONObject = this.f52707d;
                JSONObject jSONObject2 = xlw.f52707d;
                if (jSONObject == jSONObject2) {
                    return true;
                }
                if (jSONObject == null || jSONObject2 == null) {
                    return false;
                }
                return bsgy.m115761a(jSONObject.toString()).equals(bsgy.m115761a(xlw.f52707d.toString()));
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer num;
        Object[] objArr = new Object[4];
        objArr[0] = this.f52705b;
        objArr[1] = this.f52706c;
        objArr[2] = this.f52708e;
        JSONObject jSONObject = this.f52707d;
        if (jSONObject != null) {
            num = Integer.valueOf(bsgy.m115761a(jSONObject.toString()).hashCode());
        } else {
            num = null;
        }
        objArr[3] = num;
        return Arrays.hashCode(objArr);
    }
}
