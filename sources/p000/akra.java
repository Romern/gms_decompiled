package p000;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: akra */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class akra implements akpm {

    /* renamed from: a */
    public final AtomicBoolean f72475a = new AtomicBoolean();

    /* renamed from: b */
    final /* synthetic */ akrj f72476b;

    /* renamed from: c */
    private final boolean f72477c;

    public akra(akrj akrj, boolean z) {
        this.f72476b = akrj;
        this.f72477c = z;
    }

    /* renamed from: a */
    public final void mo39665a() {
        if (!this.f72477c) {
            mo39666b();
        }
    }

    /* renamed from: b */
    public final void mo39666b() {
        if (this.f72475a.compareAndSet(false, true)) {
            akrj akrj = this.f72476b;
            int i = akrj.f72485t;
            akrj.f72488d.post(new akqz(this));
        }
    }
}
