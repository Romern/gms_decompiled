package p000;

import java.util.concurrent.Executor;

/* renamed from: cicb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cicb implements Executor {

    /* renamed from: a */
    final /* synthetic */ cicv f189758a;

    public cicb(cicv cicv) {
        this.f189758a = cicv;
    }

    public final void execute(Runnable runnable) {
        this.f189758a.f189835j.mo85924a().execute(runnable);
    }
}
