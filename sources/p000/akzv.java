package p000;

import java.lang.ref.WeakReference;

/* renamed from: akzv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class akzv extends bhng {

    /* renamed from: a */
    final /* synthetic */ akzw f73191a;

    public akzv(akzw akzw) {
        this.f73191a = akzw;
    }

    /* renamed from: a */
    public final void mo10803a(bhnh bhnh) {
        synchronized (akzw.f73192b) {
            WeakReference weakReference = this.f73191a.f73193a;
            if (weakReference != null && weakReference.get() == bhnh) {
                this.f73191a.f73193a.clear();
            }
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo10804a(Object obj) {
        mo10804a((bhnh) obj);
    }
}
