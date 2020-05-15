package p000;

import android.content.Context;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;
import java.util.concurrent.ExecutionException;

/* renamed from: xfi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xfi {

    /* renamed from: a */
    private final xwj f52115a;

    /* renamed from: b */
    private final xjb f52116b;

    /* renamed from: c */
    private final xlw f52117c;

    /* renamed from: d */
    private final PublicKeyCredentialRequestOptions f52118d;

    /* renamed from: e */
    private final String f52119e;

    /* renamed from: f */
    private final String f52120f;

    /* renamed from: g */
    private final xwn f52121g;

    private xfi(xwj xwj, xjb xjb, xlw xlw, PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions, String str, String str2, xwn xwn) {
        this.f52115a = xwj;
        this.f52116b = xjb;
        this.f52117c = xlw;
        this.f52118d = publicKeyCredentialRequestOptions;
        this.f52119e = str;
        this.f52120f = str2;
        this.f52121g = xwn;
    }

    /* renamed from: a */
    public static xfi m42812a(Context context, xwj xwj, xjb xjb, xlw xlw, PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions, String str, String str2) {
        return new xfi(xwj, xjb, xlw, publicKeyCredentialRequestOptions, str, str2, xwm.m43526a(context));
    }

    /* renamed from: a */
    public final PublicKeyCredential mo29691a() {
        xkg xkg;
        Object obj;
        if (this.f52116b.mo29828a()) {
            try {
                xfg xfg = new xfg(this.f52116b);
                if (xfg.f52112a.mo29828a()) {
                    xkg = (xkg) xfg.f52112a.mo29826a(new xko()).get();
                    if (xkg.f52499a != xkj.CTAP1_ERR_SUCCESS) {
                        xfj xfj = new xfj(this.f52115a, (xfp) new xfe(this.f52119e, this.f52120f).mo66855c(this.f52118d), this.f52116b, this.f52121g.mo30188a());
                        if (xfj.f52124c.mo29828a()) {
                            try {
                                obj = xfu.m42833a(xfj.f52122a, xfj.f52124c, xfj.f52125d).mo29708a(xfj.f52123b);
                            } catch (xfv e) {
                                obj = e.mo29712a();
                            }
                            return (PublicKeyCredential) new xff().mo66855c(obj);
                        }
                        throw adbe.m50108a("Channel is not open.", 8);
                    }
                    xku xku = (xku) xkg.f52500b;
                    if (xku != null) {
                        boolean z = xku.f52619h;
                        boolean z2 = xku.f52618g;
                        xfh xfh = new xfh(this.f52116b, (xkn) new xfa(this.f52117c, z, z2).mo66855c(this.f52118d));
                        if (xfh.f52113a.mo29828a()) {
                            try {
                                return (PublicKeyCredential) new xfb(this.f52117c).mo66855c((xkg) xfh.f52113a.mo29826a(xfh.f52114b).get());
                            } catch (InterruptedException e2) {
                                adbd a = adbe.m50105a();
                                a.f61233b = e2;
                                a.f61234c = 8;
                                throw a.mo33301a();
                            } catch (ExecutionException e3) {
                                throw adbe.m50109a(e3);
                            }
                        } else {
                            throw adbe.m50108a("Channel is not open.", 8);
                        }
                    } else {
                        adbd a2 = adbe.m50105a();
                        a2.f61234c = 13;
                        a2.f61232a = "authenticatorGetInfoResponseData is null.";
                        throw a2.mo33301a();
                    }
                } else {
                    throw adbe.m50108a("Channel is not open.", 8);
                }
            } catch (InterruptedException e4) {
                adbd a3 = adbe.m50105a();
                a3.f61233b = e4;
                a3.f61234c = 8;
                throw a3.mo33301a();
            } catch (ExecutionException e5) {
                throw adbe.m50109a(e5);
            } catch (adbe e6) {
                if (e6.f61236a == 34006) {
                    xkg = new xkg(xkj.CTAP1_ERR_INVALID_COMMAND, null);
                } else {
                    throw e6;
                }
            }
        } else {
            throw adbe.m50108a("Channel is not open.", 8);
        }
    }
}
