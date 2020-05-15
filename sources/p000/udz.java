package p000;

import android.content.Context;
import java.util.EnumSet;
import java.util.Set;

/* renamed from: udz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class udz extends ucg {

    /* renamed from: f */
    private final utr f47334f;

    public udz(ubk ubk, utr utr, uto uto) {
        super("RemoveQueryResultListenerOperation", ubk, uto, 53);
        this.f47334f = utr;
    }

    /* renamed from: a */
    public final Set mo27229a() {
        return EnumSet.of(twt.f46774c, twt.f46772a, twt.f46773b);
    }

    /* renamed from: b */
    public final void mo27230b(Context context) {
        aaal.m21020a(this.f47334f, "Invalid RemoveQueryResultListenerRequest: no callback");
        this.f47237a.f47151l.mo27817a(this.f47334f);
        this.f47238b.mo27971a();
    }
}
