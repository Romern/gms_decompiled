package p000;

import android.net.Uri;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
import com.google.android.gms.fido.fido2.api.common.BrowserRequestOptions;
import com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension;
import com.google.android.gms.fido.fido2.api.common.RequestOptions;
import java.util.concurrent.Callable;

/* renamed from: xbe */
public final /* synthetic */ class xbe implements Callable {

    /* renamed from: a */
    private final xbf f51861a;

    /* renamed from: b */
    private final RequestOptions f51862b;

    /* renamed from: c */
    private final String f51863c;

    public xbe(xbf xbf, RequestOptions requestOptions, String str) {
        this.f51861a = xbf;
        this.f51862b = requestOptions;
        this.f51863c = str;
    }

    public final Object call() {
        bmxv bmxv;
        xbc xbc;
        FidoAppIdExtension fidoAppIdExtension;
        xbf xbf = this.f51861a;
        RequestOptions requestOptions = this.f51862b;
        String str = this.f51863c;
        bmxv a = xbf.f51866c.mo29606a(requestOptions, str);
        if (!a.mo66813a()) {
            return bmvz.f131120a;
        }
        AuthenticationExtensions e = requestOptions.mo18686e();
        if (e == null || (fidoAppIdExtension = e.f31715a) == null) {
            bmxv = bmvz.f131120a;
        } else {
            bmxv = bmxv.m108566b(Uri.parse(fidoAppIdExtension.f31756a.trim()));
        }
        if (!bmxv.mo66813a()) {
            return a;
        }
        Uri uri = (Uri) bmxv.mo66814b();
        if (!xez.m42800a(requestOptions)) {
            if (xez.m42802c(requestOptions)) {
                Uri parse = Uri.parse(((BrowserRequestOptions) requestOptions).mo18688f().toString());
                String scheme = parse.getScheme();
                String authority = parse.getAuthority();
                StringBuilder sb = new StringBuilder(String.valueOf(scheme).length() + 3 + String.valueOf(authority).length());
                sb.append(scheme);
                sb.append("://");
                sb.append(authority);
                xbc = xbf.f51867d.mo29604a(sb.toString(), str);
            } else {
                xbc = xbd.m42595a(str);
            }
            if (xbc == null) {
                throw adbe.m50106a(34010);
            } else if (xbf.f51865b.mo29596a(xbf.f51864a, bnpf.m110050a(uri), xbc, xbf.f51868e).mo66813a()) {
                return a;
            } else {
                return bmvz.f131120a;
            }
        } else {
            throw adbe.m50108a("FIDO_APPID extension is only valid for assertion request.", 34000);
        }
    }
}
