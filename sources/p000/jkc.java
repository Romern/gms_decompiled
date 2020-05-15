package p000;

import java.lang.ref.WeakReference;

/* renamed from: jkc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class jkc implements bluo {

    /* renamed from: a */
    public final String f22672a;

    /* renamed from: b */
    public final Runnable f22673b;

    /* renamed from: c */
    public final boolean f22674c;

    /* renamed from: d */
    public final qxo f22675d;

    /* renamed from: e */
    private final WeakReference f22676e;

    public jkc(jke jke, String str, Runnable runnable, boolean z, qxo qxo) {
        this.f22676e = new WeakReference(jke);
        this.f22672a = str;
        this.f22673b = runnable;
        this.f22674c = z;
        this.f22675d = qxo;
    }

    /* renamed from: a */
    public final void mo13812a(bluu bluu) {
        jke jke = (jke) this.f22676e.get();
        if (jke == null) {
            jke.f22679a.mo25418e("Channel was destroyed before socket write finished; cannot proceed.", new Object[0]);
        } else {
            jke.f22682d.execute(new jkb(this, jke, bluu));
        }
    }
}
