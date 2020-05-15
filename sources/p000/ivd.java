package p000;

import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import org.json.JSONObject;

/* renamed from: ivd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ivd {

    /* renamed from: a */
    private final byte[] f21855a;

    public ivd(byte[] bArr) {
        this.f21855a = (byte[]) sdo.m34959a(bArr);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ivd) {
            return Arrays.equals(this.f21855a, ((ivd) obj).f21855a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f21855a});
    }

    /* renamed from: a */
    public final byte[] mo13362a() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "decrypt_response");
            jSONObject.put("data", Base64.encodeToString(this.f21855a, 10));
            return jSONObject.toString().getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
}
