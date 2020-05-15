package p000;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import com.felicanetworks.mfc.C0126R;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.SnackbarContentLayout;
import java.util.List;

/* renamed from: bhnd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bhnd {

    /* renamed from: a */
    static final Handler f119105a = new Handler(Looper.getMainLooper(), new bhmp());

    /* renamed from: b */
    public static final String f119106b = bhnd.class.getSimpleName();

    /* renamed from: n */
    private static final int[] f119107n = {C0126R.attr.snackbarStyle};

    /* renamed from: c */
    public final ViewGroup f119108c;

    /* renamed from: d */
    public final Context f119109d;

    /* renamed from: e */
    public final bhnc f119110e;

    /* renamed from: f */
    public int f119111f;

    /* renamed from: g */
    public int f119112g;

    /* renamed from: h */
    public int f119113h;

    /* renamed from: i */
    public int f119114i;

    /* renamed from: j */
    public int f119115j;

    /* renamed from: k */
    public List f119116k;

    /* renamed from: l */
    public final SnackbarContentLayout f119117l;

    /* renamed from: m */
    public final bhmt f119118m = new bhmt(this);

    /* renamed from: o */
    private final Runnable f119119o = new bhmq(this);

    /* renamed from: p */
    private Rect f119120p;

    /* renamed from: q */
    private final AccessibilityManager f119121q;

    static {
        int i = Build.VERSION.SDK_INT;
        int i2 = Build.VERSION.SDK_INT;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [int, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ps.f(android.view.View, int):void
     arg types: [bhnc, int]
     candidates:
      ps.f(android.view.View, float):void
      ps.f(android.view.View, int):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ps.b(android.view.View, int):void
     arg types: [bhnc, int]
     candidates:
      ps.b(android.view.View, qh):qh
      ps.b(android.view.View, float):void
      ps.b(android.view.View, boolean):void
      ps.b(android.view.View, int):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ps.b(android.view.View, boolean):void
     arg types: [bhnc, int]
     candidates:
      ps.b(android.view.View, qh):qh
      ps.b(android.view.View, float):void
      ps.b(android.view.View, int):void
      ps.b(android.view.View, boolean):void */
    protected bhnd(ViewGroup viewGroup, View view, SnackbarContentLayout snackbarContentLayout) {
        if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        } else if (snackbarContentLayout != null) {
            this.f119108c = viewGroup;
            this.f119117l = snackbarContentLayout;
            Context context = viewGroup.getContext();
            this.f119109d = context;
            bhki.m101053a(context);
            LayoutInflater from = LayoutInflater.from(this.f119109d);
            TypedArray obtainStyledAttributes = this.f119109d.obtainStyledAttributes(f119107n);
            int resourceId = obtainStyledAttributes.getResourceId(0, -1);
            obtainStyledAttributes.recycle();
            bhnc bhnc = (bhnc) from.inflate(resourceId != -1 ? C0126R.C0128layout.mtrl_layout_snackbar : C0126R.C0128layout.design_layout_snackbar, this.f119108c, false);
            this.f119110e = bhnc;
            float f = bhnc.f119099b;
            if (f != 1.0f) {
                SnackbarContentLayout snackbarContentLayout2 = (SnackbarContentLayout) view;
                snackbarContentLayout2.f151226b.setTextColor(bhgk.m100859a(bhkx.m101073a(view, (int) C0126R.attr.colorSurface), snackbarContentLayout2.f151226b.getCurrentTextColor(), f));
            }
            this.f119110e.addView(view);
            ViewGroup.LayoutParams layoutParams = this.f119110e.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                this.f119120p = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            }
            C1280ps.m19919f((View) this.f119110e, 1);
            C1280ps.m19906b((View) this.f119110e, 1);
            C1280ps.m19907b((View) this.f119110e, true);
            C1280ps.m19895a(this.f119110e, new bhmr(this));
            C1280ps.m19894a(this.f119110e, new bhms(this));
            this.f119121q = (AccessibilityManager) this.f119109d.getSystemService("accessibility");
        } else {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
    }

    /* renamed from: a */
    public final ValueAnimator mo64016a(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(bhdl.f118327a);
        ofFloat.addUpdateListener(new bhmj(this));
        return ofFloat;
    }

    /* renamed from: b */
    public int mo64019b() {
        throw null;
    }

    /* renamed from: c */
    public final void mo64020c() {
        bhnk a = bhnk.m101210a();
        int b = mo64019b();
        bhmt bhmt = this.f119118m;
        synchronized (a.f119134a) {
            if (a.mo64042c(bhmt)) {
                bhnj bhnj = a.f119136c;
                bhnj.f119131b = b;
                a.f119135b.removeCallbacksAndMessages(bhnj);
                a.mo64038a(a.f119136c);
                return;
            }
            if (!a.mo64043d(bhmt)) {
                a.f119137d = new bhnj(b, bhmt);
            } else {
                a.f119137d.f119131b = b;
            }
            bhnj bhnj2 = a.f119136c;
            if (bhnj2 != null) {
                if (a.mo64039a(bhnj2, 4)) {
                    return;
                }
            }
            a.f119136c = null;
            a.mo64040b();
        }
    }

    /* renamed from: d */
    public final void mo64021d() {
        mo64018a(3);
    }

    /* renamed from: e */
    public final boolean mo64022e() {
        boolean c;
        bhnk a = bhnk.m101210a();
        bhmt bhmt = this.f119118m;
        synchronized (a.f119134a) {
            c = a.mo64042c(bhmt);
        }
        return c;
    }

    /* renamed from: f */
    public final boolean mo64023f() {
        boolean z;
        bhnk a = bhnk.m101210a();
        bhmt bhmt = this.f119118m;
        synchronized (a.f119134a) {
            z = true;
            if (!a.mo64042c(bhmt) && !a.mo64043d(bhmt)) {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: g */
    public final void mo64024g() {
        if (!mo64027j()) {
            this.f119110e.setVisibility(0);
            mo64026i();
            return;
        }
        this.f119110e.post(new bhmy(this));
    }

    /* renamed from: h */
    public final int mo64025h() {
        int height = this.f119110e.getHeight();
        ViewGroup.LayoutParams layoutParams = this.f119110e.getLayoutParams();
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? height + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : height;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo64026i() {
        bhnk a = bhnk.m101210a();
        bhmt bhmt = this.f119118m;
        synchronized (a.f119134a) {
            if (a.mo64042c(bhmt)) {
                a.mo64038a(a.f119136c);
            }
        }
        List list = this.f119116k;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((bhmz) this.f119116k.get(size)).mo64006b(this);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final boolean mo64027j() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = this.f119121q.getEnabledAccessibilityServiceList(1);
        return enabledAccessibilityServiceList != null && enabledAccessibilityServiceList.isEmpty();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final void mo64028k() {
        bhnk a = bhnk.m101210a();
        bhmt bhmt = this.f119118m;
        synchronized (a.f119134a) {
            if (a.mo64042c(bhmt)) {
                a.f119136c = null;
                if (a.f119137d != null) {
                    a.mo64040b();
                }
            }
        }
        List list = this.f119116k;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((bhmz) this.f119116k.get(size)).mo10804a(this);
            }
        }
        ViewParent parent = this.f119110e.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f119110e);
        }
    }

    /* renamed from: a */
    public final void mo64017a() {
        Rect rect;
        ViewGroup.LayoutParams layoutParams = this.f119110e.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (rect = this.f119120p) != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.bottomMargin = rect.bottom + this.f119112g;
            marginLayoutParams.leftMargin = this.f119120p.left + this.f119113h;
            marginLayoutParams.rightMargin = this.f119120p.right + this.f119114i;
            this.f119110e.requestLayout();
            int i = Build.VERSION.SDK_INT;
            if (this.f119115j > 0) {
                ViewGroup.LayoutParams layoutParams2 = this.f119110e.getLayoutParams();
                if ((layoutParams2 instanceof aip) && (((aip) layoutParams2).f596a instanceof SwipeDismissBehavior)) {
                    this.f119110e.removeCallbacks(this.f119119o);
                    this.f119110e.post(this.f119119o);
                    return;
                }
                return;
            }
            return;
        }
        Log.w(f119106b, "Unable to update margins because layout params are not MarginLayoutParams");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo64018a(int i) {
        bhnk a = bhnk.m101210a();
        bhmt bhmt = this.f119118m;
        synchronized (a.f119134a) {
            if (a.mo64042c(bhmt)) {
                a.mo64039a(a.f119136c, i);
            } else if (a.mo64043d(bhmt)) {
                a.mo64039a(a.f119137d, i);
            }
        }
    }
}
