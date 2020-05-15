package p000;

import android.content.Context;
import com.google.android.libraries.matchstick.api.MatchstickApiChimeraService;

/* renamed from: azap */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azap extends fzu implements aaai {

    /* renamed from: a */
    private final MatchstickApiChimeraService f98863a;

    /* renamed from: b */
    private final aaag f98864b;

    /* renamed from: c */
    private final String f98865c;

    /* renamed from: d */
    private final azph f98866d;

    public azap(MatchstickApiChimeraService matchstickApiChimeraService, String str, aaag aaag, Context context) {
        this.f98863a = matchstickApiChimeraService;
        this.f98865c = str;
        this.f98864b = aaag;
        this.f98866d = azph.m85998a(context);
    }

    /* renamed from: a */
    public final void mo11568a(fzt fzt, String str) {
        this.f98866d.mo55147a(422, this.f98865c);
        this.f98864b.mo16659a(this.f98863a, new azaq(fzt, this.f98865c, str, this.f98866d));
    }

    /* renamed from: b */
    public final void mo11569b(fzt fzt, String str) {
        this.f98866d.mo55147a(425, this.f98865c);
        this.f98864b.mo16659a(this.f98863a, new azao(fzt, this.f98865c, str, this.f98866d));
    }
}
