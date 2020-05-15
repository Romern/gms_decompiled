package p000;

import java.util.concurrent.Callable;

/* renamed from: rfk */
final /* synthetic */ class rfk implements Callable {

    /* renamed from: a */
    private final boolean f42873a;

    /* renamed from: b */
    private final String f42874b;

    /* renamed from: c */
    private final rfl f42875c;

    public rfk(boolean z, String str, rfl rfl) {
        this.f42873a = z;
        this.f42874b = str;
        this.f42875c = rfl;
    }

    public final Object call() {
        boolean z = this.f42873a;
        String str = this.f42874b;
        rfl rfl = this.f42875c;
        boolean z2 = true;
        if (z || !rfr.m33524b(str, rfl, true, false).f42886b) {
            z2 = false;
        }
        return rfu.m33526a(str, rfl, z, z2);
    }
}
