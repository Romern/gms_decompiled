package p000;

import android.content.ContentProviderClient;
import android.content.Context;

/* renamed from: ashs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ashs {

    /* renamed from: a */
    public final ContentProviderClient f88988a;

    /* renamed from: b */
    public final Context f88989b;

    /* renamed from: c */
    public final camr f88990c;

    /* renamed from: d */
    public final String f88991d;

    /* renamed from: e */
    public final camp f88992e;

    /* renamed from: f */
    private final String f88993f;

    public ashs(Context context, String str, ContentProviderClient contentProviderClient, String str2, camp camp) {
        this.f88989b = context;
        this.f88991d = str;
        this.f88992e = camp;
        this.f88988a = contentProviderClient;
        this.f88993f = str2;
        camr camr = new camr(null);
        this.f88990c = camr;
        camr.mo74667a("max-results", "300");
        this.f88990c.mo74667a("routinginfo", str2);
    }

    /* renamed from: a */
    public final camz mo49161a(String str, String str2, String str3, long j) {
        camz camz = new camz();
        camy camy = new camy(str3, str, "fake_auth_token");
        if (str2 != null) {
            camz.f175312a = str2.length() == 0 ? new String("https://android.clients.google.com/gsync/sub/") : "https://android.clients.google.com/gsync/sub/".concat(str2);
            camz.f175314c = camz.f175312a;
        }
        camz.f175333o = this.f88993f;
        camz.f175332n = camy;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21);
        sb.append(str);
        sb.append("_");
        sb.append(j);
        camz.f175334p = sb.toString();
        return camz;
    }
}
