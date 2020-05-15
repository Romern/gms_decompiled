package p000;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: nlg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nlg extends nzu {

    /* renamed from: a */
    public static final bnsn f35946a = odk.m28481a("CAR.DIAGNOSTICS");

    /* renamed from: b */
    public final WeakReference f35947b;

    /* renamed from: c */
    private final oln f35948c;

    /* renamed from: d */
    private final nzt f35949d = new nzt(new nle(this));

    /* renamed from: e */
    private final nzt f35950e = new nzt(new nlf(this));

    public nlg(Context context, oln oln) {
        this.f35947b = new WeakReference(context);
        this.f35948c = oln;
    }

    /* renamed from: a */
    public final List mo21033a() {
        return this.f35948c.mo22278b();
    }

    /* renamed from: b */
    public final void mo21035b(nzw nzw) {
        this.f35950e.mo21877a(nzw);
    }

    @Deprecated
    /* renamed from: b */
    public final synchronized boolean mo21036b() {
        return false;
    }

    /* renamed from: a */
    public final void mo21034a(nzw nzw) {
        this.f35949d.mo21877a(nzw);
    }
}
