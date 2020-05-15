package p000;

import android.net.Uri;
import com.google.android.gms.fido.u2f.api.common.BrowserRegisterRequestParams;
import com.google.android.gms.fido.u2f.api.common.BrowserRequestParams;
import com.google.android.gms.fido.u2f.api.common.BrowserSignRequestParams;
import com.google.android.gms.fido.u2f.api.common.RegisterRequestParams;
import com.google.android.gms.fido.u2f.api.common.ResponseData;
import com.google.android.gms.fido.u2f.api.common.SignRequestParams;

@Deprecated
/* renamed from: yai */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yai {

    /* renamed from: a */
    private final yab f53532a;

    public yai(yab yab) {
        sdo.m34959a(yab);
        boolean z = true;
        if (!(yad.SIGN == yad.REGISTER || yad.SIGN == yad.SIGN)) {
            z = false;
        }
        String valueOf = String.valueOf(yad.SIGN);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
        sb.append("Unsupported request type ");
        sb.append(valueOf);
        sdo.m34975b(z, sb.toString());
        this.f53532a = yab;
    }

    /* renamed from: a */
    public final BrowserRequestParams mo30309a(Uri uri) {
        sdo.m34959a(uri);
        yad yad = yad.REGISTER;
        int ordinal = yad.SIGN.ordinal();
        Uri uri2 = null;
        if (ordinal == 0) {
            yaa yaa = (yaa) this.f53532a;
            throw null;
        } else if (ordinal == 1) {
            yab yab = this.f53532a;
            xym xym = new xym();
            yah yah = (yah) yab;
            String str = yah.f53529c;
            if (str != null) {
                uri2 = Uri.parse(str);
            }
            xym.f53369c = uri2;
            xym.f53370d = yah.f53530d;
            xym.f53371e = yah.f53531e;
            xym.f53368b = yah.f53528b;
            xym.f53367a = yah.f53527a;
            SignRequestParams a = xym.mo30267a();
            int ordinal2 = yad.SIGN.ordinal();
            if (ordinal2 == 0) {
                xxt xxt = new xxt();
                xxt.f53351a = (RegisterRequestParams) a;
                xxt.f53352b = uri;
                return new BrowserRegisterRequestParams(xxt.f53351a, xxt.f53352b);
            } else if (ordinal2 == 1) {
                xxv xxv = new xxv();
                xxv.f53353a = a;
                xxv.f53354b = uri;
                return new BrowserSignRequestParams(xxv.f53353a, xxv.f53354b);
            } else {
                String valueOf = String.valueOf(yad.SIGN);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
                sb.append("Unsupported request type ");
                sb.append(valueOf);
                throw new RuntimeException(sb.toString());
            }
        } else {
            String valueOf2 = String.valueOf(yad.SIGN);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 25);
            sb2.append("Unsupported request type ");
            sb2.append(valueOf2);
            throw new RuntimeException(sb2.toString());
        }
    }

    /* renamed from: a */
    public final yaf mo30310a(ResponseData responseData) {
        String str;
        yad yad = yad.SIGN;
        yae yae = new yae();
        if (yad != null) {
            try {
                str = yag.m43720a(yad).f53526c;
            } catch (yac e) {
                str = yad.f53516c;
            }
        } else {
            str = null;
        }
        yae.f53517a = str;
        yae.f53518b = ((yah) this.f53532a).f53527a;
        yae.mo30300a(responseData);
        return yae.mo30301b();
    }
}
