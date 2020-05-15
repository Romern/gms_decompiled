package p000;

import android.util.Base64;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.u2f.api.common.KeyHandle;
import com.google.android.gms.fido.u2f.api.common.ProtocolVersion;
import com.google.android.gms.fido.u2f.api.common.RegisteredKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
/* renamed from: yah */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yah implements yab {

    /* renamed from: a */
    public final Integer f53527a;

    /* renamed from: b */
    public final Double f53528b;

    /* renamed from: c */
    public final String f53529c;

    /* renamed from: d */
    public final byte[] f53530d;

    /* renamed from: e */
    public final List f53531e;

    public yah(Integer num, Double d, String str, byte[] bArr, List list) {
        boolean z;
        boolean z2;
        this.f53527a = num;
        this.f53528b = d;
        this.f53529c = str;
        this.f53530d = bArr;
        sdo.m34975b(!list.isEmpty(), "Server provided empty list of registered keys");
        this.f53531e = list;
        HashSet hashSet = new HashSet();
        String str2 = this.f53529c;
        if (str2 != null) {
            hashSet.add(str2);
        }
        List list2 = this.f53531e;
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            RegisteredKey registeredKey = (RegisteredKey) list2.get(i);
            if (registeredKey.f31935b == null && this.f53529c == null) {
                z = false;
            } else {
                z = true;
            }
            sdo.m34975b(z, "Server provided request with null appId and no request appId");
            if (registeredKey.f31936c == null && this.f53530d == null) {
                z2 = false;
            } else {
                z2 = true;
            }
            sdo.m34975b(z2, "Server provided request with null challenge and no default challenge");
            String str3 = registeredKey.f31935b;
            if (str3 != null) {
                hashSet.add(str3);
            }
        }
    }

    /* renamed from: a */
    private static List m43721a(JSONArray jSONArray) {
        String str;
        String str2;
        List list;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < jSONArray.length()) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            String str3 = null;
            if (jSONObject.has("challenge")) {
                str = jSONObject.getString("challenge");
            } else {
                str = null;
            }
            if (jSONObject.has("version")) {
                str2 = jSONObject.getString("version");
            } else {
                str2 = null;
            }
            try {
                ProtocolVersion a = ProtocolVersion.m23585a(str2);
                try {
                    byte[] decode = Base64.decode(jSONObject.getString("keyHandle"), 8);
                    if (jSONObject.has("transports")) {
                        list = Transport.m23430a(jSONObject.getJSONArray("transports"));
                    } else {
                        list = null;
                    }
                    KeyHandle keyHandle = new KeyHandle(decode, a, list);
                    if (jSONObject.has("appId")) {
                        str3 = jSONObject.getString("appId");
                    }
                    arrayList.add(new RegisteredKey(keyHandle, str, str3));
                    i++;
                } catch (IllegalArgumentException e) {
                    throw new JSONException(e.toString());
                }
            } catch (xyg e2) {
                throw new JSONException(e2.toString());
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final JSONObject mo18664a() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof yah) {
            yah yah = (yah) obj;
            return sdg.m34949a(this.f53527a, yah.f53527a) && sdg.m34949a(this.f53528b, yah.f53528b) && sdg.m34949a(this.f53529c, yah.f53529c) && Arrays.equals(this.f53530d, yah.f53530d) && sdg.m34949a(this.f53531e, yah.f53531e);
        }
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.f53530d) * 31) + Arrays.hashCode(new Object[]{this.f53527a, this.f53528b, this.f53529c, this.f53531e});
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", yad.SIGN.f53516c);
            Integer num = this.f53527a;
            if (num != null) {
                jSONObject.put("requestId", num);
            }
            Double d = this.f53528b;
            if (d != null) {
                jSONObject.put("timeoutSeconds", d);
            }
            String str = this.f53529c;
            if (str != null) {
                jSONObject.put("appId", str);
            }
            byte[] bArr = this.f53530d;
            if (bArr != null) {
                jSONObject.put("challenge", Base64.encodeToString(bArr, 11));
            }
            JSONArray jSONArray = new JSONArray();
            for (RegisteredKey registeredKey : this.f53531e) {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    String str2 = registeredKey.f31936c;
                    if (str2 != null) {
                        jSONObject2.put("challenge", str2);
                    }
                    KeyHandle keyHandle = registeredKey.f31934a;
                    JSONObject jSONObject3 = new JSONObject();
                    byte[] bArr2 = keyHandle.f31911b;
                    if (bArr2 != null) {
                        jSONObject3.put("keyHandle", Base64.encodeToString(bArr2, 11));
                    }
                    ProtocolVersion protocolVersion = keyHandle.f31912c;
                    if (protocolVersion != null) {
                        jSONObject3.put("version", protocolVersion.f31918d);
                    }
                    if (keyHandle.f31913d != null) {
                        JSONArray jSONArray2 = new JSONArray();
                        for (Transport transport : keyHandle.f31913d) {
                            jSONArray2.put(transport.f31675g);
                        }
                        jSONObject3.put("transports", jSONArray2);
                    }
                    Iterator<String> keys = jSONObject3.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        jSONObject2.put(next, jSONObject3.get(next));
                    }
                    String str3 = registeredKey.f31935b;
                    if (str3 != null) {
                        jSONObject2.put("appId", str3);
                    }
                    jSONArray.put(jSONObject2);
                } catch (JSONException e) {
                    throw new RuntimeException(e);
                } catch (JSONException e2) {
                    throw new RuntimeException(e2);
                }
            }
            jSONObject.put("registeredKeys", jSONArray);
            return jSONObject.toString();
        } catch (JSONException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* renamed from: a */
    public static yah m43722a(JSONObject jSONObject) {
        Integer num;
        Double d;
        String str;
        byte[] bArr;
        List list;
        if (jSONObject.has("requestId")) {
            num = Integer.valueOf(jSONObject.getInt("requestId"));
        } else {
            num = null;
        }
        if (jSONObject.has("timeoutSeconds")) {
            d = Double.valueOf(jSONObject.getDouble("timeoutSeconds"));
        } else {
            d = null;
        }
        if (jSONObject.has("appId")) {
            str = jSONObject.getString("appId");
        } else {
            str = null;
        }
        if (jSONObject.has("challenge")) {
            bArr = Base64.decode(jSONObject.getString("challenge"), 11);
        } else {
            bArr = null;
        }
        if (jSONObject.has("registeredKeys")) {
            list = m43721a(jSONObject.getJSONArray("registeredKeys"));
        } else if (jSONObject.has("signRequests")) {
            list = m43721a(jSONObject.getJSONArray("signRequests"));
        } else {
            throw new JSONException("Server provided no list of registered keys");
        }
        try {
            return new yah(num, d, str, bArr, list);
        } catch (IllegalArgumentException e) {
            throw new JSONException(e.getMessage());
        }
    }
}
