package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p002v7.widget.ActionMenuView;
import android.support.p002v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: aeb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aeb implements C1526yv {

    /* renamed from: a */
    public final Toolbar f310a;

    /* renamed from: b */
    public int f311b;

    /* renamed from: c */
    public View f312c;

    /* renamed from: d */
    CharSequence f313d;

    /* renamed from: e */
    public Window.Callback f314e;

    /* renamed from: f */
    boolean f315f;

    /* renamed from: g */
    private Drawable f316g;

    /* renamed from: h */
    private Drawable f317h;

    /* renamed from: i */
    private Drawable f318i;

    /* renamed from: j */
    private boolean f319j;

    /* renamed from: k */
    private CharSequence f320k;

    /* renamed from: l */
    private CharSequence f321l;

    /* renamed from: m */
    private C1485xh f322m;

    /* renamed from: n */
    private int f323n = 0;

    /* renamed from: o */
    private Drawable f324o;

    /* renamed from: d */
    private final void m556d(CharSequence charSequence) {
        this.f313d = charSequence;
        if ((this.f311b & 8) != 0) {
            this.f310a.mo1679a(charSequence);
        }
    }

    /* renamed from: t */
    private final void m557t() {
        Drawable drawable;
        int i = this.f311b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0) {
            drawable = this.f316g;
        } else {
            drawable = this.f317h;
            if (drawable == null) {
                drawable = this.f316g;
            }
        }
        this.f310a.mo1677a(drawable);
    }

    /* renamed from: u */
    private final void m558u() {
        if ((this.f311b & 4) != 0) {
            Toolbar toolbar = this.f310a;
            Drawable drawable = this.f318i;
            if (drawable == null) {
                drawable = this.f324o;
            }
            toolbar.mo1681b(drawable);
            return;
        }
        this.f310a.mo1681b((Drawable) null);
    }

    /* renamed from: v */
    private final void m559v() {
        if ((this.f311b & 4) == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.f321l)) {
            this.f310a.mo1684c(this.f323n);
        } else {
            this.f310a.mo1685c(this.f321l);
        }
    }

    /* renamed from: a */
    public final ViewGroup mo486a() {
        return this.f310a;
    }

    /* renamed from: a */
    public final void mo492a(Window.Callback callback) {
        this.f314e = callback;
    }

    /* renamed from: b */
    public final Context mo495b() {
        return this.f310a.getContext();
    }

    /* renamed from: c */
    public final void mo499c(int i) {
        mo497b(C1391tv.m20459b(mo495b(), i));
    }

    /* renamed from: c */
    public final boolean mo501c() {
        adv adv = this.f310a.f1353s;
        return (adv == null || adv.f296b == null) ? false : true;
    }

    /* renamed from: e */
    public final CharSequence mo504e() {
        return this.f310a.mo1693f();
    }

    /* renamed from: f */
    public final void mo506f() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    /* renamed from: g */
    public final void mo507g() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    /* renamed from: h */
    public final boolean mo508h() {
        ActionMenuView actionMenuView;
        Toolbar toolbar = this.f310a;
        return toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f1335a) != null && actionMenuView.f1164b;
    }

    /* renamed from: i */
    public final boolean mo509i() {
        return this.f310a.mo1687cA();
    }

    /* renamed from: j */
    public final boolean mo510j() {
        C1485xh xhVar;
        ActionMenuView actionMenuView = this.f310a.f1335a;
        if (actionMenuView == null || (xhVar = actionMenuView.f1165c) == null) {
            return false;
        }
        return xhVar.f27570n != null || xhVar.mo16472e();
    }

    /* renamed from: k */
    public final boolean mo511k() {
        return this.f310a.mo1683b();
    }

    /* renamed from: l */
    public final boolean mo512l() {
        return this.f310a.mo1686c();
    }

    /* renamed from: m */
    public final void mo513m() {
        this.f315f = true;
    }

    /* renamed from: n */
    public final void mo514n() {
        this.f310a.mo1689d();
    }

    /* renamed from: o */
    public final int mo515o() {
        return this.f311b;
    }

    /* renamed from: p */
    public final int mo516p() {
        return 0;
    }

    /* renamed from: q */
    public final View mo517q() {
        return this.f312c;
    }

    /* renamed from: r */
    public final void mo518r() {
    }

    /* renamed from: s */
    public final void mo519s() {
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [int, android.support.v7.widget.Toolbar, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public aeb(Toolbar toolbar, boolean z) {
        Drawable drawable;
        this.f310a = toolbar;
        this.f313d = toolbar.mo1693f();
        this.f320k = toolbar.mo1694g();
        this.f319j = this.f313d != null;
        this.f318i = toolbar.mo1699i();
        adr a = adr.m523a(toolbar.getContext(), null, C1390tu.f27192a, C0126R.attr.actionBarStyle, 0);
        int i = 15;
        this.f324o = a.mo449a(15);
        if (z) {
            CharSequence c = a.mo455c(27);
            if (!TextUtils.isEmpty(c)) {
                mo498b(c);
            }
            CharSequence c2 = a.mo455c(25);
            if (!TextUtils.isEmpty(c2)) {
                mo500c(c2);
            }
            Drawable a2 = a.mo449a(20);
            if (a2 != null) {
                this.f317h = a2;
                m557t();
            }
            Drawable a3 = a.mo449a(17);
            if (a3 != null) {
                mo489a(a3);
            }
            if (this.f318i == null && (drawable = this.f324o) != null) {
                mo497b(drawable);
            }
            mo496b(a.mo448a(10, 0));
            int f = a.mo460f(9, 0);
            if (f != 0) {
                mo491a(LayoutInflater.from(this.f310a.getContext()).inflate(f, (ViewGroup) this.f310a, false));
                mo496b(this.f311b | 16);
            }
            int e = a.mo458e(13, 0);
            if (e > 0) {
                ViewGroup.LayoutParams layoutParams = this.f310a.getLayoutParams();
                layoutParams.height = e;
                this.f310a.setLayoutParams(layoutParams);
            }
            int c3 = a.mo454c(7, -1);
            int c4 = a.mo454c(3, -1);
            if (c3 >= 0 || c4 >= 0) {
                Toolbar toolbar2 = this.f310a;
                int max = Math.max(c3, 0);
                int max2 = Math.max(c4, 0);
                toolbar2.mo1716r();
                toolbar2.f1349o.mo402a(max, max2);
            }
            int f2 = a.mo460f(28, 0);
            if (f2 != 0) {
                Toolbar toolbar3 = this.f310a;
                toolbar3.mo1675a(toolbar3.getContext(), f2);
            }
            int f3 = a.mo460f(26, 0);
            if (f3 != 0) {
                Toolbar toolbar4 = this.f310a;
                Context context = toolbar4.getContext();
                toolbar4.f1343i = f3;
                TextView textView = toolbar4.f1336b;
                if (textView != null) {
                    textView.setTextAppearance(context, f3);
                }
            }
            int f4 = a.mo460f(22, 0);
            if (f4 != 0) {
                this.f310a.mo1674a(f4);
            }
        } else {
            if (this.f310a.mo1699i() != null) {
                this.f324o = this.f310a.mo1699i();
            } else {
                i = 11;
            }
            this.f311b = i;
        }
        a.mo450a();
        if (this.f323n != C0126R.string.abc_action_bar_up_description) {
            this.f323n = C0126R.string.abc_action_bar_up_description;
            if (TextUtils.isEmpty(this.f310a.mo1698h())) {
                mo503d(this.f323n);
            }
        }
        this.f321l = this.f310a.mo1698h();
        this.f310a.mo1678a(new adz(this));
    }

    /* renamed from: a */
    public final C1285px mo487a(int i, long j) {
        C1285px m = C1280ps.m19931m(this.f310a);
        m.mo15708a(i == 0 ? 1.0f : 0.0f);
        m.mo15709a(j);
        m.mo15711a(new aea(this, i));
        return m;
    }

    /* renamed from: b */
    public final void mo496b(int i) {
        View view;
        int i2 = this.f311b ^ i;
        this.f311b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    m559v();
                }
                m558u();
            }
            if ((i2 & 3) != 0) {
                m557t();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.f310a.mo1679a(this.f313d);
                    this.f310a.mo1682b(this.f320k);
                } else {
                    this.f310a.mo1679a((CharSequence) null);
                    this.f310a.mo1682b((CharSequence) null);
                }
            }
            if ((i2 & 16) != 0 && (view = this.f312c) != null) {
                if ((i & 16) == 0) {
                    this.f310a.removeView(view);
                } else {
                    this.f310a.addView(view);
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo500c(CharSequence charSequence) {
        this.f320k = charSequence;
        if ((this.f311b & 8) != 0) {
            this.f310a.mo1682b(charSequence);
        }
    }

    /* renamed from: d */
    public final void mo502d() {
        this.f310a.mo1691e();
    }

    /* renamed from: e */
    public final void mo505e(int i) {
        this.f310a.setVisibility(i);
    }

    /* renamed from: a */
    public final void mo488a(int i) {
        mo489a(C1391tv.m20459b(mo495b(), i));
    }

    /* renamed from: d */
    public final void mo503d(int i) {
        String str;
        if (i != 0) {
            str = mo495b().getString(i);
        } else {
            str = null;
        }
        this.f321l = str;
        m559v();
    }

    /* renamed from: a */
    public final void mo489a(Drawable drawable) {
        this.f316g = drawable;
        m557t();
    }

    /* renamed from: a */
    public final void mo490a(Menu menu, C1457wg wgVar) {
        C1485xh xhVar = this.f322m;
        if (xhVar == null) {
            xhVar = new C1485xh(this.f310a.getContext());
            this.f322m = xhVar;
            xhVar.f27367g = C0126R.C0129id.action_menu_presenter;
        }
        xhVar.f27365e = wgVar;
        Toolbar toolbar = this.f310a;
        if (menu != null || toolbar.f1335a != null) {
            toolbar.mo1702l();
            C1443vt vtVar = toolbar.f1335a.f1163a;
            if (vtVar != menu) {
                if (vtVar != null) {
                    vtVar.mo16241b(toolbar.f1352r);
                    vtVar.mo16241b(toolbar.f1353s);
                }
                if (toolbar.f1353s == null) {
                    toolbar.f1353s = new adv(toolbar);
                }
                xhVar.mo16474h();
                if (menu != null) {
                    C1443vt vtVar2 = (C1443vt) menu;
                    vtVar2.mo16225a(xhVar, toolbar.f1341g);
                    vtVar2.mo16225a(toolbar.f1353s, toolbar.f1341g);
                } else {
                    xhVar.mo466a(toolbar.f1341g, (C1443vt) null);
                    toolbar.f1353s.mo466a(toolbar.f1341g, (C1443vt) null);
                    xhVar.mo470a(true);
                    toolbar.f1353s.mo470a(true);
                }
                toolbar.f1335a.mo1298a(toolbar.f1342h);
                toolbar.f1335a.mo1300a(xhVar);
                toolbar.f1352r = xhVar;
            }
        }
    }

    /* renamed from: b */
    public final void mo497b(Drawable drawable) {
        this.f318i = drawable;
        m558u();
    }

    /* renamed from: b */
    public final void mo498b(CharSequence charSequence) {
        this.f319j = true;
        m556d(charSequence);
    }

    /* renamed from: a */
    public final void mo491a(View view) {
        View view2 = this.f312c;
        if (!(view2 == null || (this.f311b & 16) == 0)) {
            this.f310a.removeView(view2);
        }
        this.f312c = view;
        if (view != null && (this.f311b & 16) != 0) {
            this.f310a.addView(view);
        }
    }

    /* renamed from: a */
    public final void mo493a(CharSequence charSequence) {
        if (!this.f319j) {
            m556d(charSequence);
        }
    }

    /* renamed from: a */
    public final void mo494a(boolean z) {
        Toolbar toolbar = this.f310a;
        toolbar.f1356v = z;
        toolbar.requestLayout();
    }
}
