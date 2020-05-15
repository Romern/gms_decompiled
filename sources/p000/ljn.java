package p000;

import java.util.concurrent.TimeUnit;

/* renamed from: ljn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ljn implements lis {

    /* renamed from: a */
    final /* synthetic */ ljq f26200a;

    public ljn(ljq ljq) {
        this.f26200a = ljq;
    }

    /* renamed from: a */
    public final Object mo15181a() {
        return "WHITELIST_FUTURE";
    }

    /* renamed from: b */
    public final bqgg mo15182b() {
        ljq ljq = this.f26200a;
        kbs kbs = ljq.f26207i;
        return bqga.m112773a(bqdx.m112674a(kbs.f23713b.mo15162a(ljq.f26204f.f23817a, kbs.f23712a), new kbr(ljq.f26205g), bqfb.INSTANCE), 500, TimeUnit.MILLISECONDS, adzl.f62962b.mo25877a(1, 2));
    }
}
