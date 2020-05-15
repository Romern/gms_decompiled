package p000;

import java.lang.ref.WeakReference;

/* renamed from: fgj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fgj extends bhng {

    /* renamed from: a */
    final /* synthetic */ fgk f16508a;

    public fgj(fgk fgk) {
        this.f16508a = fgk;
    }

    /* renamed from: a */
    public final void mo10803a(bhnh bhnh) {
        synchronized (fgk.f16509e) {
            WeakReference weakReference = this.f16508a.f16511b;
            if (weakReference != null && weakReference.get() == bhnh) {
                this.f16508a.f16511b.clear();
                WeakReference weakReference2 = this.f16508a.f16512c;
                if (weakReference2 != null) {
                    weakReference2.clear();
                }
            }
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo10804a(Object obj) {
        mo10804a((bhnh) obj);
    }
}
