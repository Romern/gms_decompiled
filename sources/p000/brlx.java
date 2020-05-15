package p000;

import com.google.android.gms.auth.api.proxy.ProxyRequest;
import com.google.android.gms.auth.api.proxy.ProxyResponse;
import java.io.UnsupportedEncodingException;

/* renamed from: brlx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brlx implements aubg {

    /* renamed from: a */
    final /* synthetic */ ProxyRequest f142946a;

    /* renamed from: b */
    final /* synthetic */ bxxk f142947b;

    public brlx(ProxyRequest proxyRequest, bxxk bxxk) {
        this.f142946a = proxyRequest;
        this.f142947b = bxxk;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo7031a(aucb aucb) {
        bxxc bxxc;
        if (aucb.mo50384b()) {
            ProxyResponse proxyResponse = (ProxyResponse) aucb.mo50386d();
            if (proxyResponse == null) {
                return aucu.m76777a((Exception) new brmg("Invalid proxy response."));
            }
            byte[] bArr = proxyResponse.f10313f;
            if (bArr != null) {
                int i = proxyResponse.f10311d;
                if (i == 3000 || i == 3001 || i == 3002 || i == 3003) {
                    ProxyRequest proxyRequest = this.f142946a;
                    String str = "Error parsing backend api error response.";
                    if (proxyRequest.f10303b.contains(cdxz.m135249d()) || proxyRequest.f10303b.contains(cdxz.m135248c())) {
                        try {
                            str = new String(proxyResponse.f10313f, "UTF-8");
                        } catch (UnsupportedEncodingException e) {
                        }
                    } else {
                        try {
                            str = ((bkko) ((bxxk) bkko.f124592b.mo74142c(7)).mo73657a(proxyResponse.f10313f)).f124594a;
                        } catch (bxwf e2) {
                        }
                    }
                    return aucu.m76777a((Exception) new brmg(str));
                }
                bxxk bxxk = this.f142947b;
                if (bxxk != null) {
                    try {
                        bxxc = (bxxc) bxxk.mo73655a(bxuc.m123419a(bArr), bxus.m123744c());
                    } catch (Exception e3) {
                        throw new brmg("Error parsing backend api response.");
                    }
                } else {
                    bxxc = null;
                }
                return aucu.m76778a(bxxc);
            } else if (proxyResponse.f10309b != 7) {
                return aucu.m76777a((Exception) new brmg("Internal error."));
            } else {
                return aucu.m76777a((Exception) new brmg("<<Network Error>>"));
            }
        } else if (!(aucb.mo50387e() instanceof rjp)) {
            return aucu.m76777a((Exception) new brmg(aucb.mo50387e().getMessage()));
        } else {
            return aucu.m76777a((Exception) new brmg("<<Network Error>>"));
        }
    }
}
