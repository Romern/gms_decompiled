package p000;

import java.util.concurrent.Executor;

/* renamed from: ahw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ahw {

    /* renamed from: a */
    static final ahw f570a = new ahw(null, null);

    /* renamed from: b */
    final Runnable f571b;

    /* renamed from: c */
    final Executor f572c;
    ahw next;

    public ahw(Runnable runnable, Executor executor) {
        this.f571b = runnable;
        this.f572c = executor;
    }
}
