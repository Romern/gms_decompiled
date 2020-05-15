package p000;

import java.io.IOException;

/* renamed from: bbai */
final /* synthetic */ class bbai implements bqeh {

    /* renamed from: a */
    private final bbav f102214a;

    /* renamed from: b */
    private final bavr f102215b;

    /* renamed from: c */
    private final bavd f102216c;

    public bbai(bbav bbav, bavr bavr, bavd bavd) {
        this.f102214a = bbav;
        this.f102215b = bavr;
        this.f102216c = bavd;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        bbav bbav = this.f102214a;
        bavr bavr = this.f102215b;
        bavd bavd = this.f102216c;
        if (!((Boolean) obj).booleanValue()) {
            bbev.m87910b("%s: Failed to remove the downloaded version for group: '%s'; account: '%s'", "FileGroupManager", bavr.f101919b, bavr.f101921d);
            bbav.f102245b.mo34988b(1036);
            String valueOf = String.valueOf(bavr.f101919b);
            return bqga.m112777a((Throwable) new IOException(valueOf.length() == 0 ? new String("Failed to remove downloaded group: ") : "Failed to remove downloaded group: ".concat(valueOf)));
        } else if (bbav.f102247d.mo56053a(bavd)) {
            return bqga.m112775a((Object) null);
        } else {
            bbev.m87910b("%s: Failed to add to stale for group: '%s'; account: '%s'", "FileGroupManager", bavr.f101919b, bavr.f101921d);
            bbav.f102245b.mo34988b(1036);
            String valueOf2 = String.valueOf(bavr.f101919b);
            return bqga.m112777a((Throwable) new IOException(valueOf2.length() == 0 ? new String("Failed to add downloaded group to stale: ") : "Failed to add downloaded group to stale: ".concat(valueOf2)));
        }
    }
}
