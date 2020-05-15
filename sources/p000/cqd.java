package p000;

import android.graphics.drawable.Animatable;
import android.widget.ImageView;

/* renamed from: cqd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class cqd extends cqi {

    /* renamed from: c */
    private Animatable f11840c;

    public cqd(ImageView imageView) {
        super(imageView);
    }

    /* renamed from: b */
    private final void m7332b(Object obj) {
        mo8130a(obj);
        if (obj instanceof Animatable) {
            Animatable animatable = (Animatable) obj;
            this.f11840c = animatable;
            animatable.start();
            return;
        }
        this.f11840c = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo8130a(Object obj);

    /* renamed from: c */
    public final void mo3687c() {
        Animatable animatable = this.f11840c;
        if (animatable != null) {
            animatable.start();
        }
    }

    /* renamed from: d */
    public final void mo3688d() {
        Animatable animatable = this.f11840c;
        if (animatable != null) {
            animatable.stop();
        }
    }

    /* renamed from: f */
    public final void mo8126f() {
        m7332b((Object) null);
        mo8134h();
    }

    /* renamed from: g */
    public final void mo8127g() {
        m7332b((Object) null);
        mo8134h();
    }

    /* renamed from: h */
    public final void mo8134h() {
        ((ImageView) this.f11846a).setImageDrawable(null);
    }

    /* renamed from: k */
    public final void mo8133k(Object obj) {
        m7332b(obj);
    }

    /* renamed from: b */
    public final void mo8125b() {
        this.f11847b.mo8136a();
        Animatable animatable = this.f11840c;
        if (animatable != null) {
            animatable.stop();
        }
        m7332b((Object) null);
        mo8134h();
    }
}
