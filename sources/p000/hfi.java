package p000;

import android.content.Context;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;

/* renamed from: hfi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hfi extends hvx implements aaai {

    /* renamed from: a */
    public static final Logger f19649a = ght.m13172b("CredentialSavingServiceImpl");

    /* renamed from: b */
    private final Context f19650b;

    /* renamed from: c */
    private final aaag f19651c;

    /* renamed from: d */
    private final String f19652d;

    /* renamed from: e */
    private final String f19653e;

    /* renamed from: f */
    private final qws f19654f;

    /* renamed from: g */
    private final huw f19655g;

    /* renamed from: h */
    private final bmxv f19656h;

    public hfi(Context context, aaag aaag, qws qws, String str, String str2, huw huw, bmxv bmxv) {
        this.f19650b = context;
        this.f19651c = aaag;
        this.f19652d = str;
        this.f19653e = str2;
        this.f19655g = huw;
        this.f19654f = qws;
        this.f19656h = bmxv;
    }

    /* renamed from: a */
    public final void mo12450a(hwp hwp, SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest) {
        ((hjj) hjj.f19891a.mo33309a()).f19892b.put(new hji(saveAccountLinkingTokenRequest.f10243e, this.f19653e), saveAccountLinkingTokenRequest);
        String d = ccco.f178754a.mo6606a().mo75772d();
        String str = this.f19653e;
        hew a = hex.m14288a(new hpm(str, d, new hfj(this.f19650b, str, saveAccountLinkingTokenRequest.f10243e, saveAccountLinkingTokenRequest)), 223, "SaveAccountLinkingToken", saveAccountLinkingTokenRequest.f10243e);
        this.f19651c.mo16658a(a);
        bqga.m112781a(a.f19623a, new hfg(hwp), bqfb.INSTANCE);
    }

    /* renamed from: a */
    public final void mo12451a(hwq hwq, SavePasswordRequest savePasswordRequest) {
        String c = ccco.f178754a.mo6606a().mo75771c();
        String str = (String) bmxu.m108565a(savePasswordRequest.f10246b, this.f19655g.f20462a);
        hfl hfl = new hfl(this.f19650b, savePasswordRequest, this.f19652d, str, this.f19654f, this.f19656h, this.f19653e);
        hwq.getClass();
        hff hff = new hff(hwq);
        hew a = hex.m14288a(new hpm(this.f19653e, c, hfl), 223, "SavePassword", str);
        this.f19651c.mo16658a(a);
        bqga.m112781a(a.f19623a, new hfh(hff), bqfb.INSTANCE);
    }
}
