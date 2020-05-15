package p000;

import android.content.Context;
import android.graphics.BitmapFactory;
import com.google.android.gms.auth.firstparty.dataservice.AccountSignInRequest;
import com.google.android.gms.auth.firstparty.shared.CaptchaChallenge;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;

/* renamed from: gnc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gnc {

    /* renamed from: a */
    public static final sek f18659a = ght.m13171a("AddAccountOperation");

    /* renamed from: b */
    public final Context f18660b;

    /* renamed from: c */
    public final lsp f18661c;

    /* renamed from: d */
    public final goa f18662d;

    /* renamed from: e */
    public final glw f18663e;

    /* renamed from: f */
    public final AccountSignInRequest f18664f;

    /* renamed from: g */
    public final gko f18665g;

    public gnc(Context context, AccountSignInRequest accountSignInRequest) {
        rtg rtg = new rtg(context);
        lsp lsp = new lsp(context);
        goa goa = (goa) goa.f18759a.mo13145b();
        glw glw = new glw(context);
        gko gko = (gko) gko.f18416b.mo13145b();
        glq glq = new glq(context);
        sdo.m34959a(context);
        this.f18660b = context;
        sdo.m34959a(rtg);
        sdo.m34959a(lsp);
        this.f18661c = lsp;
        sdo.m34959a(goa);
        this.f18662d = goa;
        sdo.m34959a(glw);
        this.f18663e = glw;
        sdo.m34959a(accountSignInRequest);
        this.f18664f = accountSignInRequest;
        sdo.m34959a(gko);
        this.f18665g = gko;
        sdo.m34959a(glq);
    }

    /* renamed from: a */
    public static CaptchaChallenge m13478a(Context context, String str, String str2) {
        if (!str2.startsWith("http")) {
            String valueOf = String.valueOf(str2);
            str2 = valueOf.length() == 0 ? new String("https://www.google.com/accounts/") : "https://www.google.com/accounts/".concat(valueOf);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        rqv.m34278a(context, linkedHashMap, context.getPackageName());
        try {
            jhq jhq = (jhq) jhq.f22499a.mo13145b();
            HttpGet httpGet = new HttpGet(str2);
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                httpGet.addHeader((String) entry.getKey(), (String) entry.getValue());
            }
            abop.m48014a((HttpRequest) httpGet);
            byte[] a = m13479a(jhq.mo13753a(httpGet));
            return new CaptchaChallenge(izj.SUCCESS, str, BitmapFactory.decodeByteArray(a, 0, a.length));
        } catch (IOException e) {
            return new CaptchaChallenge(izj.NETWORK_ERROR, null, null);
        }
    }

    /* renamed from: a */
    public static byte[] m13479a(HttpResponse httpResponse) {
        try {
            return gmv.m13466a(httpResponse);
        } catch (IOException e) {
            throw new rqy(izj.INTNERNAL_ERROR, "Error when parsing the response.", e);
        }
    }
}
