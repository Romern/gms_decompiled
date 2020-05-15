package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.InternalSignInCredentialWrapper;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import com.google.android.gms.common.api.Status;
import java.util.List;

/* renamed from: hju */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hju extends hwh implements aaai {

    /* renamed from: a */
    public static final Logger f19915a = ght.m13172b("IdentityGisInternalServiceImpl");

    /* renamed from: b */
    private final Context f19916b;

    /* renamed from: c */
    private final het f19917c = ((het) het.f19617a.mo33309a());

    /* renamed from: d */
    private final hvc f19918d;

    public hju(Context context, hvc hvc) {
        this.f19916b = context;
        this.f19918d = hvc;
    }

    /* renamed from: a */
    private final void m14537a(hep hep, rnt rnt, String str) {
        bqga.m112781a(this.f19917c.mo12446a(hep, str), new hjt(rnt), bqfb.INSTANCE);
    }

    /* renamed from: b */
    public final void mo12589b(rnt rnt, String str, String str2) {
        m14537a(new hkt(str2), rnt, str);
    }

    /* renamed from: b */
    public final void mo12590b(rnt rnt, String str, String str2, Account account) {
        m14537a(new hkx(this.f19916b, str2, account), rnt, str);
    }

    /* renamed from: a */
    public final void mo12580a(hvw hvw, String str, BeginSignInRequest beginSignInRequest, InternalSignInCredentialWrapper internalSignInCredentialWrapper) {
        bqga.m112781a(this.f19917c.mo12446a(new hjn(this.f19916b, str, beginSignInRequest, internalSignInCredentialWrapper), (String) bmxu.m108565a(beginSignInRequest.f10214c, this.f19918d.f20472a)), new hjq(hvw), bqfb.INSTANCE);
    }

    /* renamed from: a */
    public final void mo12581a(hwb hwb, String str, String str2) {
        try {
            hwb.mo12780a(Status.f30107a, (SaveAccountLinkingTokenRequest) ((hjj) hjj.f19891a.mo33309a()).f19892b.get(new hji(str, str2)));
        } catch (RemoteException e) {
            f19915a.mo25417e("Unable to return the success result to the caller", e, new Object[0]);
        }
    }

    /* renamed from: a */
    public final void mo12582a(hwe hwe, String str, String str2) {
        bqga.m112781a(this.f19917c.mo12446a(new hjo(this.f19916b, str2), str), new hjs(hwe), bqfb.INSTANCE);
    }

    /* renamed from: a */
    public final void mo12583a(hwl hwl, String str, BeginSignInRequest beginSignInRequest) {
        bqga.m112781a(this.f19917c.mo12446a(new hkh(this.f19916b, str, beginSignInRequest), (String) bmxu.m108565a(beginSignInRequest.f10214c, this.f19918d.f20472a)), new hjp(hwl), bqfb.INSTANCE);
    }

    /* renamed from: a */
    public final void mo12584a(hwo hwo, SavePasswordRequest savePasswordRequest, String str) {
        bqga.m112781a(this.f19917c.mo12446a(new hkq(this.f19916b, str, savePasswordRequest), (String) bmxu.m108565a(savePasswordRequest.f10246b, this.f19918d.f20472a)), new hjr(hwo), bqfb.INSTANCE);
    }

    /* renamed from: a */
    public final void mo12585a(rnt rnt, SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest, String str, Account account, String str2) {
        m14537a(new hjm(this.f19916b, str2, account, saveAccountLinkingTokenRequest, str), rnt, saveAccountLinkingTokenRequest.f10243e);
    }

    /* renamed from: a */
    public final void mo12586a(rnt rnt, SavePasswordRequest savePasswordRequest, List list, String str) {
        m14537a(new hkw(this.f19916b, list, savePasswordRequest, str), rnt, (String) bmxu.m108565a(savePasswordRequest.f10246b, this.f19918d.f20472a));
    }

    /* renamed from: a */
    public final void mo12587a(rnt rnt, String str, String str2) {
        m14537a(new hkr(str2), rnt, str);
    }

    /* renamed from: a */
    public final void mo12588a(rnt rnt, String str, String str2, Account account) {
        m14537a(new hks(this.f19916b, str2, account), rnt, str);
    }
}
