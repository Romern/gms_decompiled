package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import com.google.android.gms.auth.firstparty.shared.CaptchaChallenge;
import org.apache.http.entity.StringEntity;
import org.json.JSONObject;

/* renamed from: glp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class glp {

    /* renamed from: a */
    public static final sek f18562a = new sek("Auth", "BackendStub");

    /* renamed from: b */
    public final Context f18563b;

    /* renamed from: c */
    public final String f18564c;

    /* renamed from: d */
    public final String f18565d;

    public glp(Context context) {
        String aF = gnv.m13524aF();
        this.f18563b = context;
        this.f18565d = String.valueOf(aF).concat("/ratepw");
        this.f18564c = String.valueOf(aF).concat("/checkavail");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002b, code lost:
        if (android.text.TextUtils.isEmpty(r4) == false) goto L_0x002f;
     */
    /* renamed from: a */
    public static CaptchaChallenge m13396a(JSONObject jSONObject) {
        String str;
        String str2;
        String str3 = glo.CAPTCHA_DATA.f18561aF;
        if (jSONObject.has(str3)) {
            str = jSONObject.getString(str3);
        } else {
            str = null;
        }
        if (jSONObject.has(glo.CAPTCHA_TOKEN.f18561aF)) {
            str2 = jSONObject.get(glo.CAPTCHA_TOKEN.f18561aF).toString();
        }
        str2 = null;
        if (str != null) {
            byte[] decode = Base64.decode(str, 0);
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
            if (decodeByteArray != null) {
                return new CaptchaChallenge(izj.SUCCESS, str2, decodeByteArray);
            }
            f18562a.mo25418e("Failed to read bitmap", new Object[0]);
            return null;
        }
        f18562a.mo25418e("**** NO CAPTCHA DATA ***", new Object[0]);
        return null;
    }

    /* renamed from: a */
    public final String mo12020a(String str, String str2, String str3) {
        return gmv.m13467b(gmv.m13464a(str, str3, new StringEntity(str2, "UTF-8"), this.f18563b));
    }
}
