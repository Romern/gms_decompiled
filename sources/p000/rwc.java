package p000;

import java.util.concurrent.Callable;

/* renamed from: rwc */
final /* synthetic */ class rwc implements Callable {

    /* renamed from: a */
    private final rwe f43787a;

    public rwc(rwe rwe) {
        this.f43787a = rwe;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sfc.a(android.content.Context, boolean):sfb
     arg types: [android.content.Context, int]
     candidates:
      sfc.a(android.content.Context, java.lang.String):java.util.List
      sfb.a(android.content.Context, java.lang.String):java.util.List
      sfc.a(android.content.Context, boolean):sfb */
    public final Object call() {
        rwe rwe = this.f43787a;
        sfb a = sfc.m35143a(rwe.f43789a, true);
        if (!a.mo25464b()) {
            return bngx.m109376e();
        }
        return a.mo25461a(rwe.f43789a);
    }
}
