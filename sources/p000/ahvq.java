package p000;

import android.content.Context;

/* renamed from: ahvq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahvq extends ahvo {

    /* renamed from: a */
    private final ayqh f68178a;

    public ahvq(Context context, ahsu ahsu, ayqh ayqh) {
        super(context, ahsu);
        this.f68178a = ayqh;
    }

    /* renamed from: a */
    public final bvjc mo37144a() {
        return bvjc.REMOTE_PAIR_START;
    }

    /* renamed from: b */
    public final bvjc mo37150b() {
        return bvjc.REMOTE_PAIR_END;
    }

    /* renamed from: a */
    public final void mo37148a(Throwable th) {
        super.mo37148a(th);
        this.f68178a.mo37372a(3, th.getMessage());
    }

    /* renamed from: b */
    public final void mo37151b(String str) {
        super.mo37151b(str);
        this.f68178a.mo37372a(2, "");
    }
}
