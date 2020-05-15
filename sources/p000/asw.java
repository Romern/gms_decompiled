package p000;

import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;

/* renamed from: asw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asw {

    /* renamed from: a */
    public final ViewGroup f2142a;

    /* renamed from: b */
    public Runnable f2143b;

    public asw(ViewGroup viewGroup) {
        this.f2142a = viewGroup;
    }

    /* renamed from: a */
    public static asw m1978a(ViewGroup viewGroup) {
        return (asw) viewGroup.getTag(C0126R.C0129id.transition_current_scene);
    }

    /* renamed from: b */
    public final void mo2439b() {
        Runnable runnable = this.f2143b;
        if (runnable != null) {
            runnable.run();
        }
        m1979a(this.f2142a, this);
    }

    /* renamed from: a */
    static void m1979a(ViewGroup viewGroup, asw asw) {
        viewGroup.setTag(C0126R.C0129id.transition_current_scene, asw);
    }

    /* renamed from: a */
    public final void mo2438a() {
        m1978a(this.f2142a);
    }
}
