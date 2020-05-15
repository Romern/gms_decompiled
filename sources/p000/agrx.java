package p000;

import android.content.Context;

/* renamed from: agrx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agrx implements AutoCloseable {

    /* renamed from: a */
    private final shl f66336a;

    public agrx(agry agry) {
        Context context = agry.f66343e;
        shl shl = new shl(context, agry.f66340b, agry.f66342d, context.getApplicationInfo().uid, 24833);
        this.f66336a = shl;
        shl.mo25556a("X-Goog-Api-Key", agry.f66341c);
    }

    /* renamed from: a */
    public final agqf mo36038a() {
        return new agqf(this.f66336a);
    }

    public final void close() {
        shl shl = this.f66336a;
        if (shl != null) {
            shl.mo25561g();
        }
    }
}
