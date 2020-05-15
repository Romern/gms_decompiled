package p000;

import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
/* renamed from: yaf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yaf implements xhm {

    /* renamed from: a */
    private final String f53520a;

    /* renamed from: b */
    private final Integer f53521b;

    /* renamed from: c */
    private final JSONObject f53522c;

    public yaf(String str, Integer num, JSONObject jSONObject) {
        this.f53520a = str;
        this.f53521b = num;
        this.f53522c = jSONObject;
    }

    /* renamed from: a */
    public final JSONObject mo18664a() {
        try {
            JSONObject jSONObject = new JSONObject();
            String str = this.f53520a;
            if (str != null) {
                jSONObject.put("type", str);
            }
            Integer num = this.f53521b;
            if (num != null) {
                int intValue = num.intValue();
                long intValue2 = (long) this.f53521b.intValue();
                if (intValue < 0) {
                    intValue2 = ((long) intValue) + 4294967296L;
                }
                jSONObject.put("requestId", intValue2);
            }
            JSONObject jSONObject2 = this.f53522c;
            if (jSONObject2 != null) {
                jSONObject.put("responseData", jSONObject2);
            }
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof yaf) {
            yaf yaf = (yaf) obj;
            if (sdg.m34949a(this.f53520a, yaf.f53520a) && sdg.m34949a(this.f53521b, yaf.f53521b)) {
                JSONObject jSONObject = this.f53522c;
                if (jSONObject == null) {
                    return yaf.f53522c == null;
                }
                if (yaf.f53522c != null) {
                    return jSONObject.toString().equals(yaf.f53522c.toString());
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f53520a, this.f53521b, this.f53522c});
    }

    public final String toString() {
        return mo18664a().toString();
    }
}
