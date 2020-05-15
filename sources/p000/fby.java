package p000;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Fragment;
import java.lang.ref.WeakReference;

/* renamed from: fby */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class fby extends fbv {

    /* renamed from: a */
    private boolean f16241a;

    /* renamed from: m */
    public long f16242m;

    /* renamed from: a */
    private static boolean m11413a(Fragment fragment) {
        if (fragment.isRemoving()) {
            return true;
        }
        if (fragment.getParentFragment() != null) {
            return m11413a(fragment.getParentFragment());
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo10638a(long j) {
    }

    /* renamed from: a */
    public abstract void mo10557a(fem fem);

    /* renamed from: a */
    public abstract boolean mo10558a(epq epq);

    /* renamed from: aU */
    public abstract bsxn mo10584aU();

    /* access modifiers changed from: protected */
    /* renamed from: aV */
    public abstract View mo10640aV();

    /* renamed from: b */
    public final void mo10660b(long j) {
        this.f16241a = true;
        this.f16242m = j;
    }

    /* renamed from: c */
    public abstract fek mo10624c();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final boolean mo10661e() {
        return cbro.f178167a.mo6606a().mo75290j() && this.f16241a;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ps.b(android.view.View, int):void
     arg types: [bhnc, int]
     candidates:
      ps.b(android.view.View, qh):qh
      ps.b(android.view.View, float):void
      ps.b(android.view.View, boolean):void
      ps.b(android.view.View, int):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ps.f(android.view.View, int):void
     arg types: [bhnc, int]
     candidates:
      ps.f(android.view.View, float):void
      ps.f(android.view.View, int):void */
    /* renamed from: f */
    public final void mo10662f() {
        fgk fgk = new fgk(mo10640aV());
        View view = (View) fgk.f16510a.get();
        if (view != null) {
            bhnh a = bhnh.m101201a(view, (int) C0126R.string.as_offline_snackbar, 0);
            TextView textView = (TextView) a.f119110e.findViewById(C0126R.C0129id.snackbar_text);
            if (textView != null) {
                a.mo64034c(adyg.m51405b(view.getContext(), C0126R.attr.colorOnBackground, C0126R.color.google_grey900));
                textView.setTextColor(adyg.m51405b(view.getContext(), 16842801, C0126R.color.google_white));
            }
            a.mo64031a(new fgj(fgk));
            synchronized (fgk.f16509e) {
                fgk.f16511b = new WeakReference(a);
                C1280ps.m19906b((View) a.f119110e, 1);
                C1280ps.m19919f((View) a.f119110e, 1);
                WeakReference weakReference = fgk.f16512c;
                if (weakReference != null) {
                    if (weakReference.get() != null) {
                        fgk.f16513d.removeCallbacks((Runnable) fgk.f16512c.get());
                    }
                }
                a.getClass();
                fgk.f16512c = new WeakReference(new fgi(a));
                fgk.f16513d.postDelayed((Runnable) fgk.f16512c.get(), 500);
            }
        }
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        if (z || getParentFragment() == null || !m11413a(getParentFragment())) {
            return super.onCreateAnimation(i, z, i2);
        }
        return AnimationUtils.loadAnimation(getContext(), C0126R.anim.as_stay_put);
    }

    public final void onResume() {
        super.onResume();
        if (mo10661e()) {
            this.f16241a = false;
            View view = getView();
            view.addOnLayoutChangeListener(new fbx(this, view));
            view.requestLayout();
        }
    }
}
