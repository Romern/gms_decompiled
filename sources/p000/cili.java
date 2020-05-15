package p000;

import android.os.Build;
import android.os.Handler;
import com.felicanetworks.cmnctrl.net.DataParser;
import java.nio.charset.Charset;
import java.util.HashMap;

/* renamed from: cili */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cili implements Runnable {

    /* renamed from: a */
    private final brhc f190622a;

    /* renamed from: b */
    private final brep f190623b;

    /* renamed from: c */
    private final Handler f190624c;

    /* renamed from: d */
    private final Runnable f190625d;

    /* renamed from: e */
    private final String f190626e;

    /* renamed from: f */
    private final String f190627f;

    /* renamed from: g */
    private final String f190628g;

    /* renamed from: h */
    private final breo f190629h;

    /* renamed from: i */
    private final brgl f190630i;

    /* renamed from: j */
    private final brgz f190631j;

    public cili(String str, String str2, String str3, brhc brhc, brgl brgl, brgz brgz, brep brep, Handler handler, Runnable runnable, breo breo) {
        this.f190622a = brhc;
        this.f190630i = brgl;
        this.f190631j = brgz;
        this.f190623b = brep;
        this.f190624c = handler;
        this.f190626e = str;
        this.f190627f = str2;
        this.f190628g = str3;
        this.f190625d = runnable;
        this.f190629h = breo;
    }

    public final void run() {
        String str;
        String str2 = this.f190626e;
        String str3 = this.f190627f;
        String str4 = this.f190628g;
        HashMap hashMap = new HashMap();
        hashMap.put("ver", "2.0");
        if (str2 == null) {
            str2 = "";
        }
        hashMap.put("idm", str2);
        if (str3 == null) {
            str3 = "";
        }
        hashMap.put("iccode", str3);
        if (str4 == null) {
            str4 = "";
        }
        hashMap.put("container", str4);
        hashMap.put("scode", "02");
        HashMap hashMap2 = new HashMap();
        String str5 = Build.MODEL;
        String str6 = "DoCoMo/9.0 Android(c100;TJ;)";
        if (str5 != null && !str5.isEmpty()) {
            str6 = str6.replace("Android", str5.replaceAll("-", ""));
        }
        hashMap2.put(DataParser.USER_AGENT_KEY, str6);
        hashMap2.put("Content-Type", DataParser.CONTENT_TYPE_VALUE);
        if (this.f190629h.f142688a != 2) {
            str = "https://ve.m.idbrand.smt.docomo.ne.jp/idapbrand/kensho/proxy/AreaDelete";
        } else {
            str = "https://idbrand.smt.docomo.ne.jp/idapbrand/real/proxy/AreaDelete";
        }
        Charset.forName("utf8");
        this.f190631j.mo69530a(brgq.m114009a(str, hashMap2, new brgr(null, hashMap)), new cild(this.f190630i, this.f190623b, this.f190624c, this.f190625d));
    }
}
