package p000;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.cast.CastDevice;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: pkr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class pkr extends ptb {

    /* renamed from: a */
    private final String f39521a;

    /* renamed from: b */
    final int f39522b;

    /* renamed from: c */
    private final String f39523c;

    /* renamed from: d */
    private final String f39524d;

    /* renamed from: e */
    private final int f39525e;

    public pkr(Context context, String str, String str2, CastDevice castDevice) {
        super(qau.f40832a, "ConnectionControlChannel", str2);
        int i = 0;
        int i2 = 1;
        this.f39521a = String.format(Locale.ROOT, "Android CastSDK,%d,%s,%s,%s", Integer.valueOf(spn.m35881e(context)), Build.MODEL, Build.PRODUCT, Build.VERSION.RELEASE);
        this.f39524d = Integer.toString(spn.m35881e(context));
        this.f39523c = str;
        this.f39525e = !castDevice.mo17500e() ? 2 : i2;
        this.f39522b = cdad.f180372a.mo6606a().mo77161a() ? 3 : i;
    }

    /* renamed from: a */
    public final JSONObject mo23343a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", "CONNECT");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("package", this.f39523c);
            jSONObject.put("origin", jSONObject2);
            jSONObject.put("userAgent", this.f39521a);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("sdkType", 1);
            jSONObject3.put("version", this.f39524d);
            jSONObject3.put("platform", 1);
            jSONObject3.put("systemVersion", Build.VERSION.RELEASE);
            jSONObject3.put("model", Build.MODEL);
            jSONObject3.put("connectionType", this.f39525e);
            jSONObject.put("senderInfo", jSONObject3);
            jSONObject.put("protocolVersion", this.f39522b);
        } catch (JSONException e) {
            this.f40173s.mo23675c("Error while creating creating the connect payload: %s", e.getMessage());
        }
        return jSONObject;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo23225a(blsw blsw) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
        if (r7 == 2) goto L_0x0036;
     */
    /* renamed from: b */
    public final void mo23345b(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("type");
            char c = 65535;
            if (string.hashCode() == -2087582999 && string.equals("CONNECTED")) {
                c = 0;
            }
            if (c == 0) {
                if (jSONObject.has("protocolVersion")) {
                    int i = jSONObject.getInt("protocolVersion");
                    if (i == 1) {
                    }
                    this.f40173s.mo23670a("Negotiated protocol version is %d, which is unsupported. Using fallback version", Integer.valueOf(i));
                    i = 0;
                    if (i >= 0) {
                        int i2 = this.f39522b;
                        if (i <= i2) {
                            blsw a = blsw.m107539a(Math.min(i, i2));
                            if (a == null) {
                                a = blsw.CASTV2_1_0;
                            }
                            mo23225a(a);
                            return;
                        }
                    }
                    this.f40173s.mo23675c("Negotiated protocol version is %d, which is out of supported range [0, %d]", Integer.valueOf(i), Integer.valueOf(this.f39522b));
                }
            }
        } catch (JSONException e) {
            this.f40173s.mo23675c("Error when processing CONNECTED payload", new Object[0]);
        }
    }

    /* renamed from: a */
    public final void mo23344a(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", "CLOSE");
        } catch (JSONException e) {
            this.f40173s.mo23675c("Error while creating a disconnect message: %s", e.getMessage());
        }
        mo23632b(jSONObject.toString(), 0, str);
    }
}
