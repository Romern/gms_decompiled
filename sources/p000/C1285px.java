package p000;

import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* renamed from: px */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1285px {

    /* renamed from: a */
    public final WeakReference f26845a;

    public C1285px(View view) {
        this.f26845a = new WeakReference(view);
    }

    /* renamed from: a */
    public final void mo15707a() {
        View view = (View) this.f26845a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* renamed from: b */
    public final void mo15713b() {
        View view = (View) this.f26845a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    /* renamed from: c */
    public final void mo15715c(float f) {
        View view = (View) this.f26845a.get();
        if (view != null) {
            view.animate().scaleY(f);
        }
    }

    /* renamed from: d */
    public final void mo15716d(float f) {
        View view = (View) this.f26845a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
    }

    /* renamed from: a */
    public final void mo15708a(float f) {
        View view = (View) this.f26845a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
    }

    /* renamed from: b */
    public final void mo15714b(float f) {
        View view = (View) this.f26845a.get();
        if (view != null) {
            view.animate().scaleX(f);
        }
    }

    /* renamed from: a */
    public final void mo15709a(long j) {
        View view = (View) this.f26845a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
    }

    /* renamed from: a */
    public final void mo15710a(Interpolator interpolator) {
        View view = (View) this.f26845a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
    }

    /* renamed from: a */
    public final void mo15711a(C1286py pyVar) {
        View view = (View) this.f26845a.get();
        if (view != null) {
            int i = Build.VERSION.SDK_INT;
            if (pyVar != null) {
                view.animate().setListener(new C1283pv(pyVar, view));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    /* renamed from: a */
    public final void mo15712a(C1387tr trVar) {
        C1284pw pwVar;
        View view = (View) this.f26845a.get();
        if (view != null) {
            int i = Build.VERSION.SDK_INT;
            if (trVar != null) {
                pwVar = new C1284pw(trVar);
            } else {
                pwVar = null;
            }
            view.animate().setUpdateListener(pwVar);
        }
    }
}
