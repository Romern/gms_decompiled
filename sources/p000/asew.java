package p000;

import java.lang.ref.WeakReference;

/* renamed from: asew */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class asew implements Runnable {

    /* renamed from: a */
    final /* synthetic */ WeakReference f88795a;

    public asew(WeakReference weakReference) {
        this.f88795a = weakReference;
    }

    public final void run() {
        asfa asfa = (asfa) this.f88795a.get();
        if (asfa != null) {
            asfb asfb = asfa.f88802c;
            asez asez = asfb.f88804n;
            synchronized (asfb.f88807a) {
                if (asfa.f88800a) {
                    asfb asfb2 = asfa.f88802c;
                    if (!asfb2.f88810d || asfb2.f88808b == 1) {
                        asfb2.f88813g = true;
                    }
                }
                asfa.mo49109a();
            }
        }
    }
}
