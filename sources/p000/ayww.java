package p000;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.felicanetworks.mfc.C0126R;
import java.util.List;

/* renamed from: ayww */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayww implements View.OnAttachStateChangeListener, View.OnLayoutChangeListener, ayxi {

    /* renamed from: j */
    public static final /* synthetic */ int f98658j = 0;

    /* renamed from: a */
    public final View f98659a;

    /* renamed from: b */
    public final aywp f98660b;

    /* renamed from: c */
    public final ayxj f98661c;

    /* renamed from: d */
    public aywp f98662d;

    /* renamed from: e */
    public List f98663e;

    /* renamed from: f */
    public boolean f98664f = false;

    /* renamed from: g */
    public boolean f98665g = false;

    /* renamed from: h */
    public boolean f98666h = false;

    /* renamed from: i */
    public aywp f98667i = null;

    /* renamed from: k */
    private ViewGroup f98668k;

    /* renamed from: l */
    private int f98669l = 2;

    public ayww(View view, aywp aywp) {
        this.f98659a = view;
        this.f98660b = aywp;
        this.f98661c = aywp.f98636a;
    }

    /* renamed from: a */
    public static View m84999a(Activity activity) {
        return activity.findViewById(16908290);
    }

    /* renamed from: b */
    public static boolean m85002b(View view) {
        return view.getId() == 16908290;
    }

    /* renamed from: c */
    public final void mo54493c() {
        this.f98659a.setTag(C0126R.C0129id.ve_tag, this.f98660b);
        if (this.f98661c.mo54512a()) {
            this.f98659a.addOnAttachStateChangeListener(this);
            if (C1280ps.m19871F(this.f98659a)) {
                onViewAttachedToWindow(this.f98659a);
            }
        }
    }

    /* renamed from: d */
    public final void mo54494d() {
        if (this.f98664f && !this.f98665g) {
            this.f98665g = true;
            this.f98669l = mo54499i();
            this.f98661c.mo54511a(this.f98660b);
            List list = this.f98663e;
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ((aywp) list.get(i)).f98637b.mo54494d();
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo54495e() {
        if (this.f98665g) {
            this.f98665g = false;
            List list = this.f98663e;
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ((aywp) list.get(i)).f98637b.mo54495e();
                }
            }
            this.f98661c.mo54513b(this.f98660b);
            this.f98667i = null;
        }
    }

    /* renamed from: f */
    public final void mo54496f() {
        bmxy.m108600b(this.f98664f);
        if (this.f98666h) {
            ViewGroup viewGroup = (ViewGroup) this.f98659a.getRootView().findViewById(16908290);
            bmxy.m108581a(viewGroup);
            this.f98668k = viewGroup;
        } else {
            this.f98668k = (ViewGroup) this.f98659a.getParent();
        }
        ViewGroup viewGroup2 = this.f98668k;
        if (viewGroup2 == null) {
            this.f98659a.addOnLayoutChangeListener(this);
        } else {
            viewGroup2.addOnLayoutChangeListener(this);
        }
    }

    /* renamed from: g */
    public final void mo54497g() {
        ViewGroup viewGroup = this.f98668k;
        if (viewGroup != null) {
            viewGroup.removeOnLayoutChangeListener(this);
            this.f98668k = null;
            return;
        }
        this.f98659a.removeOnLayoutChangeListener(this);
    }

    /* renamed from: i */
    public final int mo54499i() {
        if (this.f98666h) {
            if (!this.f98659a.isShown()) {
                return 2;
            }
            return 1;
        } else if (this.f98659a.getVisibility() == 0) {
            return 1;
        } else {
            return 2;
        }
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        boolean z;
        if (view == this.f98659a) {
            if (this.f98668k == null) {
                z = true;
            } else {
                z = false;
            }
            bmxy.m108600b(z);
            ViewGroup viewGroup = (ViewGroup) this.f98659a.getParent();
            this.f98668k = viewGroup;
            viewGroup.addOnLayoutChangeListener(this);
            this.f98659a.removeOnLayoutChangeListener(this);
        }
        int i9 = mo54499i();
        if (i9 != this.f98669l) {
            this.f98669l = i9;
            ayxj ayxj = this.f98661c;
            aywp aywp = this.f98660b;
            if (!ayxj.f98680a.isEmpty()) {
                for (ayxh ayxh : ayxj.f98680a) {
                    ayxh.mo54508a(aywp, i9);
                }
            }
        }
    }

    public final void onViewAttachedToWindow(View view) {
        bmxy.m108600b(!this.f98664f);
        this.f98664f = true;
        mo54496f();
        mo54494d();
    }

    public final void onViewDetachedFromWindow(View view) {
        bmxy.m108600b(this.f98664f);
        this.f98664f = false;
        mo54497g();
        aywp aywp = this.f98662d;
        if (aywp != null) {
            aywp.f98637b.mo54490a(this.f98660b);
            bmxy.m108601b(!this.f98665g, "View was child of detached parent.");
            return;
        }
        mo54495e();
    }

    /* renamed from: a */
    public static aywp m85000a(View view) {
        return (aywp) view.getTag(C0126R.C0129id.ve_tag);
    }

    /* renamed from: b */
    public final void mo54492b() {
        boolean z;
        if (this.f98662d != null) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108601b(z, "No parent override to unset");
        this.f98662d = null;
        if (this.f98664f) {
            mo54494d();
        }
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ Object mo54498h() {
        if (mo54491a() || this.f98666h) {
            return null;
        }
        aywp aywp = this.f98662d;
        if (aywp != null || (aywp = this.f98667i) != null) {
            return aywp;
        }
        ViewParent parent = this.f98659a.getParent();
        while (parent != null && (parent instanceof View)) {
            View view = (View) parent;
            aywp a = m85000a(view);
            if (a != null) {
                if (!this.f98664f) {
                    return a;
                }
                this.f98667i = a;
                return a;
            } else if (m85002b(view)) {
                return null;
            } else {
                parent = parent.getParent();
            }
        }
        return null;
    }

    /* renamed from: a */
    public static void m85001a(View view, ayxr ayxr) {
        aywp a = m85000a(view);
        if (a != null) {
            ayxi ayxi = a.f98637b;
            if (ayxi instanceof ayww) {
                ayww ayww = (ayww) ayxi;
                if (ayww.f98662d != null || ayww.f98666h) {
                    return;
                }
            }
            ayxr.mo54518a(a);
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                m85001a(viewGroup.getChildAt(i), ayxr);
            }
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo54490a(Object obj) {
        bmxy.m108588a(this.f98663e.remove(obj));
        ayxi ayxi = ((aywp) obj).f98637b;
        if (this.f98664f) {
            ayxi.mo54495e();
        }
        ayxi.mo54492b();
    }

    /* renamed from: a */
    public final boolean mo54491a() {
        return (this.f98662d == null && m85002b(this.f98659a)) || this.f98666h;
    }
}
