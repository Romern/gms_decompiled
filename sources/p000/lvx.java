package p000;

import android.util.Base64;
import java.security.MessageDigest;

/* renamed from: lvx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lvx {

    /* renamed from: a */
    private static final lvn f33089a = new lvn("ScottyTransferFactory");

    /* renamed from: b */
    private final bzsy f33090b;

    public lvx(bzsy bzsy) {
        this.f33090b = bzsy;
    }

    /* renamed from: a */
    private static bzsa m24512a(String str) {
        bzsa bzsa = new bzsa();
        String valueOf = String.valueOf(str);
        bzsa.mo74559a("authorization", valueOf.length() == 0 ? new String("GoogleLogin auth=") : "GoogleLogin auth=".concat(valueOf));
        bzsa.mo74559a("content-type", "application/octet-stream");
        return bzsa;
    }

    /* renamed from: a */
    private final bzsq m24513a(lth lth, bzsa bzsa, MessageDigest messageDigest, bzrx bzrx) {
        bzsv a = bzsw.m126179a();
        if (messageDigest != null) {
            a.f171298b = messageDigest;
        }
        a.f171299c = true;
        f33089a.mo25412b("Creating transfer to %s", ccnf.m130737f());
        return this.f33090b.mo74581a(ccnf.m130737f(), "PUT", bzsa, bzrx, Base64.encodeToString(lth.serializeToBytes(), 2), a.mo74579a());
    }

    /* renamed from: a */
    public final bzsq mo19687a(lth lth, String str, MessageDigest messageDigest, bzrx bzrx) {
        bzsa a = m24512a(lth.f32920e);
        a.mo74559a("X-goog-diff-content-encoding", str);
        return m24513a(lth, a, messageDigest, bzrx);
    }

    /* renamed from: a */
    public final bzsq mo19688a(lth lth, MessageDigest messageDigest, bzrx bzrx) {
        return m24513a(lth, m24512a(lth.f32920e), messageDigest, bzrx);
    }
}
