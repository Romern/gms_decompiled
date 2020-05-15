package p000;

import com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: xqk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xqk implements xhm {

    /* renamed from: a */
    private final String f52927a;

    /* renamed from: b */
    private final Integer f52928b;

    /* renamed from: c */
    private final AuthenticatorResponse f52929c;

    public xqk(xql xql, Integer num, AuthenticatorResponse authenticatorResponse) {
        String str = xql.f52934d;
        sdo.m34959a((Object) str);
        this.f52927a = str;
        sdo.m34959a(num);
        this.f52928b = num;
        sdo.m34959a(authenticatorResponse);
        this.f52929c = authenticatorResponse;
    }

    /* renamed from: a */
    public final JSONObject mo18664a() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("responseType", this.f52927a);
            jSONObject.put("requestId", this.f52928b.intValue());
            jSONObject.put("authenticatorResponse", this.f52929c.mo18664a());
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException("Error encoding ResponseMessage to JSON object", e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xqk) {
            xqk xqk = (xqk) obj;
            if (!sdg.m34949a(this.f52927a, xqk.f52927a) || !sdg.m34949a(this.f52928b, xqk.f52928b) || !sdg.m34949a(this.f52929c, xqk.f52929c)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f52927a, this.f52928b, this.f52929c});
    }

    public final String toString() {
        return mo18664a().toString();
    }
}
