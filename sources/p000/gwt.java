package p000;

import android.content.Context;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;

/* renamed from: gwt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gwt extends hwr implements aaai {

    /* renamed from: a */
    public static final Logger f19132a = ght.m13172b("AssistedSignInServiceImpl");

    /* renamed from: b */
    private final Context f19133b;

    /* renamed from: c */
    private final aaag f19134c;

    /* renamed from: d */
    private final String f19135d;

    /* renamed from: e */
    private final qws f19136e;

    /* renamed from: f */
    private final hvo f19137f;

    public gwt(Context context, aaag aaag, qws qws, String str, hvo hvo) {
        this.f19133b = context;
        this.f19134c = aaag;
        this.f19135d = str;
        this.f19137f = hvo;
        this.f19136e = qws;
    }

    /* renamed from: a */
    private final void m14050a(String str, hep hep, String str2, gwu gwu, String str3) {
        hew a = hex.m14288a(new hpm(this.f19135d, str, hep), BaseMfiEventCallback.TYPE_EXIST_UNKNOWN_CARD, str2, str3);
        this.f19134c.mo16658a(a);
        bqga.m112781a(a.f19623a, new gws(gwu), bqfb.INSTANCE);
    }

    /* renamed from: a */
    public final void mo12287a(hvt hvt, BeginSignInRequest beginSignInRequest) {
        String b = ccco.m129250b();
        String str = (String) bmxu.m108565a(beginSignInRequest.f10214c, this.f19137f.f20474a);
        gww gww = new gww(this.f19133b, this.f19135d, str, beginSignInRequest, this.f19136e);
        hvt.getClass();
        m14050a(b, gww, "BeginSignIn", new gwp(hvt), str);
    }

    /* renamed from: a */
    public final void mo12288a(hwf hwf, GetSignInIntentRequest getSignInIntentRequest) {
        String e = ccco.f178754a.mo6606a().mo75773e();
        gwx gwx = new gwx(this.f19133b, getSignInIntentRequest, this.f19136e, getSignInIntentRequest.f10226c, this.f19135d);
        hwf.getClass();
        m14050a(e, gwx, "GetSignInIntent", new gwr(hwf), getSignInIntentRequest.f10226c);
    }

    /* renamed from: a */
    public final void mo12289a(rnt rnt, String str) {
        String b = ccco.m129250b();
        String str2 = (String) bmxu.m108565a(str, this.f19137f.f20474a);
        m14050a(b, new gwy(this.f19133b, this.f19135d, this.f19136e, str2), "SignOut", new gwq(rnt), str2);
    }
}
