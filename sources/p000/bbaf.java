package p000;

import java.io.IOException;

/* renamed from: bbaf */
final /* synthetic */ class bbaf implements bqeh {

    /* renamed from: a */
    private final bbav f102205a;

    /* renamed from: b */
    private final bavr f102206b;

    public bbaf(bbav bbav, bavr bavr) {
        this.f102205a = bbav;
        this.f102206b = bavr;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        bbav bbav = this.f102205a;
        bavr bavr = this.f102206b;
        if (((Boolean) obj).booleanValue()) {
            return bqga.m112775a((Object) null);
        }
        bbev.m87910b("%s: Failed to remove pending version for group: '%s'; account: '%s'", "FileGroupManager", bavr.f101919b, bavr.f101921d);
        bbav.f102245b.mo34988b(1036);
        String valueOf = String.valueOf(bavr.f101919b);
        return bqga.m112777a((Throwable) new IOException(valueOf.length() == 0 ? new String("Failed to remove pending group: ") : "Failed to remove pending group: ".concat(valueOf)));
    }
}
