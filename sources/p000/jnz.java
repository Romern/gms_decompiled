package p000;

import android.text.TextUtils;
import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: jnz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jnz {

    /* renamed from: a */
    public final byte[] f22915a;

    /* renamed from: b */
    public final String f22916b;

    /* renamed from: c */
    private final String f22917c;

    public jnz(String str, byte[] bArr, String str2) {
        this.f22917c = str;
        this.f22915a = (byte[]) sdo.m34959a(bArr);
        sdo.m34959a((Object) str2);
        this.f22916b = str2;
    }

    /* renamed from: a */
    public static jnz m17005a(String str) {
        try {
            return m17006a(new JSONObject(str), 2);
        } catch (IOException e) {
            throw new RuntimeException("Failed to parse WireMessage from JSONObject.", e);
        }
    }

    /* renamed from: b */
    public final String mo13925b() {
        try {
            return m17007a(2).toString();
        } catch (JSONException e) {
            throw new RuntimeException("Did not expect serialization to fail: ", e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jnz) {
            jnz jnz = (jnz) obj;
            return TextUtils.equals(this.f22917c, jnz.f22917c) && Arrays.equals(this.f22915a, jnz.f22915a) && TextUtils.equals(this.f22916b, jnz.f22916b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f22917c, this.f22915a, this.f22916b});
    }

    public final String toString() {
        return String.format("{'%s':'%s','%s':'%s','%s':'%s'}", "permit_id", this.f22917c, "payload", Arrays.toString(this.f22915a), "feature", this.f22916b);
    }

    public jnz(byte[] bArr, String str) {
        this.f22917c = null;
        this.f22915a = (byte[]) sdo.m34959a(bArr);
        sdo.m34959a((Object) str);
        this.f22916b = str;
    }

    /* renamed from: a */
    public static jnz m17006a(JSONObject jSONObject, int i) {
        String str;
        String str2;
        String str3;
        if (i != 1) {
            str = "pe";
            str3 = "pa";
            str2 = "f";
        } else {
            str = "permit_id";
            str3 = "payload";
            str2 = "feature";
        }
        try {
            return new jnz(jSONObject.has(str) ? jSONObject.getString(str) : null, Base64.decode(jSONObject.getString(str3), 8), !jSONObject.has(str2) ? "easy_unlock" : jSONObject.getString(str2));
        } catch (JSONException e) {
            throw new IOException("Error when parsing JSON message.", e);
        } catch (IllegalArgumentException e2) {
            throw new IOException("Failed to decode the message.", e2);
        } catch (NullPointerException e3) {
            throw new IOException("Mandatory field is missing in the message.", e3);
        }
    }

    /* renamed from: a */
    private final JSONObject m17007a(int i) {
        String str;
        String str2;
        String str3;
        JSONObject jSONObject = new JSONObject();
        if (i != 1) {
            str = "pe";
            str3 = "pa";
            str2 = "f";
        } else {
            str = "permit_id";
            str3 = "payload";
            str2 = "feature";
        }
        String str4 = this.f22917c;
        if (str4 != null) {
            jSONObject.put(str, str4);
        }
        jSONObject.put(str3, Base64.encodeToString(this.f22915a, 10));
        jSONObject.put(str2, this.f22916b);
        return jSONObject;
    }

    /* renamed from: a */
    public final byte[] mo13924a() {
        try {
            byte[] bytes = m17007a(1).toString().getBytes("UTF-8");
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.write(3);
            dataOutputStream.writeShort(bytes.length);
            dataOutputStream.write(bytes);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException | JSONException e) {
            throw new RuntimeException("Did not expect serialization to fail: ", e);
        }
    }
}
