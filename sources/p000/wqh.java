package p000;

import android.content.Context;
import com.android.volley.VolleyError;
import com.google.android.gms.common.internal.ClientContext;

/* renamed from: wqh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wqh extends whz {

    /* renamed from: b */
    private final String f51146b;

    public wqh(Context context, String str) {
        super(context);
        this.f51146b = str;
    }

    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        bxvd da = bslp.f144931f.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bslp bslp = (bslp) da.f164949b;
        "me".getClass();
        int i = 1;
        int i2 = bslp.f144933a | 1;
        bslp.f144933a = i2;
        bslp.f144934b = "me";
        bslp.f144937e = 0;
        bslp.f144933a = i2 | 8;
        bslp bslp2 = (bslp) da.mo74062i();
        try {
            wgo.m41929b();
            wgf a = wgo.m41928a();
            wgo.m41929b();
            ClientContext a2 = wgo.m41927a(this.f51146b);
            sgv sgv = a.f50616a;
            StringBuilder sb = new StringBuilder();
            String a3 = shd.m35267a(bslp2.f144934b);
            StringBuilder sb2 = new StringBuilder(String.valueOf(a3).length() + 26);
            sb2.append("/users/");
            sb2.append(a3);
            sb2.append("/settings?alt=proto");
            sb.append(sb2.toString());
            if (!(bslp2 == null || bslp2.f144935c.length() == 0)) {
                sb.append("&versionInfo=");
                sb.append(shd.m35267a(bslp2.f144935c));
            }
            if (!(bslp2 == null || bslp2.f144936d.length() == 0)) {
                sb.append("&continueUrl=");
                sb.append(shd.m35267a(bslp2.f144936d));
            }
            if (bslp2 != null) {
                int a4 = bslo.m115943a(bslp2.f144937e);
                if (a4 != 0) {
                    if (a4 != 1) {
                        sb.append("&delegationType=");
                        int a5 = bslo.m115943a(bslp2.f144937e);
                        if (a5 != 0) {
                            i = a5;
                        }
                        sb.append(i - 1);
                    }
                }
            }
            return (bslt) sgv.mo25513a(a2, 0, sb.toString(), (byte[]) null, bslt.f144950d);
        } catch (VolleyError | gid e) {
            return null;
        }
    }
}
