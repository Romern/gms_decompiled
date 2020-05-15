package p000;

import android.animation.LayoutTransition;
import android.os.Build;
import android.view.ViewGroup;

/* renamed from: aqun */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class aqun {

    /* renamed from: c */
    public ViewGroup f86844c;

    public aqun() {
    }

    /* renamed from: a */
    public abstract void mo48136a();

    /* renamed from: a */
    public final void mo48164a(String str) {
        this.f86844c.setOnLongClickListener(new aqum(this, str));
    }

    /* renamed from: b */
    public abstract void mo48137b();

    /* renamed from: c */
    public abstract boolean mo48138c();

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo48166f() {
        this.f86844c.setLayoutTransition(null);
    }

    public aqun(ViewGroup viewGroup) {
        this.f86844c = viewGroup;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo48165e() {
        int i = Build.VERSION.SDK_INT;
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.enableTransitionType(4);
        this.f86844c.setLayoutTransition(layoutTransition);
    }
}
