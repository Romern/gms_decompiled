package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.support.p002v7.view.menu.ActionMenuItemView;
import android.support.p002v7.widget.ActionMenuPresenter$SavedState;
import android.support.p002v7.widget.ActionMenuView;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import java.util.ArrayList;

/* renamed from: xh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1485xh extends C1430vg {

    /* renamed from: h */
    public C1481xd f27564h;

    /* renamed from: i */
    public Drawable f27565i;

    /* renamed from: j */
    public boolean f27566j;

    /* renamed from: k */
    public int f27567k;

    /* renamed from: l */
    C1482xe f27568l;

    /* renamed from: m */
    public C1478xa f27569m;

    /* renamed from: n */
    C1479xb f27570n;

    /* renamed from: o */
    final C1483xf f27571o = new C1483xf(this);

    /* renamed from: p */
    int f27572p;

    /* renamed from: q */
    private boolean f27573q;

    /* renamed from: r */
    private boolean f27574r;

    /* renamed from: s */
    private int f27575s;

    /* renamed from: t */
    private int f27576t;

    /* renamed from: u */
    private boolean f27577u;

    /* renamed from: v */
    private final SparseBooleanArray f27578v = new SparseBooleanArray();

    /* renamed from: w */
    private C1429vf f27579w;

    public C1485xh(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void mo16469a(ActionMenuView actionMenuView) {
        this.f27366f = actionMenuView;
        actionMenuView.f1163a = this.f27363c;
    }

    /* renamed from: c */
    public final boolean mo16470c() {
        C1443vt vtVar;
        if (!this.f27573q || mo16472e() || (vtVar = this.f27363c) == null || this.f27366f == null || this.f27570n != null || vtVar.mo16259i().isEmpty()) {
            return false;
        }
        this.f27570n = new C1479xb(this, new C1482xe(this, this.f27362b, this.f27363c, this.f27564h));
        ((View) this.f27366f).post(this.f27570n);
        super.mo473a((C1466wp) null);
        return true;
    }

    /* renamed from: d */
    public final boolean mo16471d() {
        C1460wj wjVar;
        C1479xb xbVar = this.f27570n;
        if (xbVar == null || (wjVar = this.f27366f) == null) {
            C1482xe xeVar = this.f27568l;
            if (xeVar == null) {
                return false;
            }
            xeVar.mo16397d();
            return true;
        }
        ((View) wjVar).removeCallbacks(xbVar);
        this.f27570n = null;
        return true;
    }

    /* renamed from: e */
    public final boolean mo16472e() {
        C1482xe xeVar = this.f27568l;
        return xeVar != null && xeVar.mo16399f();
    }

    /* renamed from: f */
    public final Parcelable mo476f() {
        ActionMenuPresenter$SavedState actionMenuPresenter$SavedState = new ActionMenuPresenter$SavedState();
        actionMenuPresenter$SavedState.f1162a = this.f27572p;
        return actionMenuPresenter$SavedState;
    }

    /* renamed from: g */
    public final void mo16473g() {
        mo16471d();
        mo16476j();
    }

    /* renamed from: h */
    public final void mo16474h() {
        this.f27577u = true;
    }

    /* renamed from: i */
    public final void mo16475i() {
        this.f27573q = true;
        this.f27574r = true;
    }

    /* renamed from: j */
    public final void mo16476j() {
        C1478xa xaVar = this.f27569m;
        if (xaVar != null) {
            xaVar.mo16397d();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final View mo16182a(C1446vw vwVar, View view, ViewGroup viewGroup) {
        C1459wi wiVar;
        View actionView = vwVar.getActionView();
        int i = 0;
        if (actionView == null || vwVar.mo16306i()) {
            if (view instanceof C1459wi) {
                wiVar = (C1459wi) view;
            } else {
                wiVar = (C1459wi) this.f27364d.inflate((int) C0126R.C0128layout.abc_action_menu_item_layout, viewGroup, false);
            }
            wiVar.mo1209a(vwVar);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) wiVar;
            actionMenuItemView.f1086c = (ActionMenuView) this.f27366f;
            if (this.f27579w == null) {
                this.f27579w = new C1429vf(this);
            }
            actionMenuItemView.f1087d = this.f27579w;
            actionView = (View) wiVar;
        }
        if (vwVar.f27468o) {
            i = 8;
        }
        actionView.setVisibility(i);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!(layoutParams instanceof C1488xk)) {
            actionView.setLayoutParams(ActionMenuView.m1285b(layoutParams));
        }
        return actionView;
    }

    /* renamed from: a */
    public final void mo466a(Context context, C1443vt vtVar) {
        this.f27362b = context;
        LayoutInflater.from(this.f27362b);
        this.f27363c = vtVar;
        Resources resources = context.getResources();
        C1412up a = C1412up.m20487a(context);
        if (!this.f27574r) {
            int i = Build.VERSION.SDK_INT;
            this.f27573q = true;
        }
        this.f27575s = a.f27271a.getResources().getDisplayMetrics().widthPixels / 2;
        this.f27567k = a.mo16089a();
        int i2 = this.f27575s;
        if (!this.f27573q) {
            this.f27564h = null;
        } else {
            if (this.f27564h == null) {
                C1481xd xdVar = new C1481xd(this, this.f27361a);
                this.f27564h = xdVar;
                if (this.f27566j) {
                    xdVar.setImageDrawable(this.f27565i);
                    this.f27565i = null;
                    this.f27566j = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f27564h.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i2 -= this.f27564h.getMeasuredWidth();
        }
        this.f27576t = i2;
        float f = resources.getDisplayMetrics().density;
    }

    /* renamed from: a */
    public final void mo467a(Parcelable parcelable) {
        int i;
        MenuItem findItem;
        if ((parcelable instanceof ActionMenuPresenter$SavedState) && (i = ((ActionMenuPresenter$SavedState) parcelable).f1162a) > 0 && (findItem = this.f27363c.findItem(i)) != null) {
            mo473a((C1466wp) findItem.getSubMenu());
        }
    }

    /* renamed from: a */
    public final void mo468a(C1443vt vtVar, boolean z) {
        mo16473g();
        C1457wg wgVar = this.f27365e;
        if (wgVar != null) {
            wgVar.mo15958a(vtVar, z);
        }
    }

    /* renamed from: a */
    public final void mo470a(boolean z) {
        C1460wj wjVar;
        int size;
        int i;
        C1446vw vwVar;
        ViewGroup viewGroup = (ViewGroup) this.f27366f;
        ArrayList arrayList = null;
        if (viewGroup != null) {
            C1443vt vtVar = this.f27363c;
            if (vtVar != null) {
                vtVar.mo16257h();
                ArrayList g = this.f27363c.mo16255g();
                int size2 = g.size();
                i = 0;
                for (int i2 = 0; i2 < size2; i2++) {
                    C1446vw vwVar2 = (C1446vw) g.get(i2);
                    if (vwVar2.mo16290f()) {
                        View childAt = viewGroup.getChildAt(i);
                        if (childAt instanceof C1459wi) {
                            vwVar = ((C1459wi) childAt).mo1208a();
                        } else {
                            vwVar = null;
                        }
                        View a = mo16182a(vwVar2, childAt, viewGroup);
                        if (vwVar2 != vwVar) {
                            a.setPressed(false);
                            a.jumpDrawablesToCurrentState();
                        }
                        if (a != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) a.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(a);
                            }
                            ((ViewGroup) this.f27366f).addView(a, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.f27564h) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.f27366f).requestLayout();
        C1443vt vtVar2 = this.f27363c;
        if (vtVar2 != null) {
            vtVar2.mo16257h();
            ArrayList arrayList2 = vtVar2.f27426d;
            int size3 = arrayList2.size();
            for (int i3 = 0; i3 < size3; i3++) {
                C1446vw vwVar3 = (C1446vw) arrayList2.get(i3);
            }
        }
        C1443vt vtVar3 = this.f27363c;
        if (vtVar3 != null) {
            arrayList = vtVar3.mo16259i();
        }
        if (this.f27573q && arrayList != null && ((size = arrayList.size()) != 1 ? size > 0 : !((C1446vw) arrayList.get(0)).f27468o)) {
            if (this.f27564h == null) {
                this.f27564h = new C1481xd(this, this.f27361a);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f27564h.getParent();
            if (viewGroup3 != this.f27366f) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f27564h);
                }
                C1481xd xdVar = this.f27564h;
                C1488xk d = ActionMenuView.m1286d();
                d.f27580a = true;
                ((ActionMenuView) this.f27366f).addView(xdVar, d);
            }
        } else {
            C1481xd xdVar2 = this.f27564h;
            if (xdVar2 != null && xdVar2.getParent() == (wjVar = this.f27366f)) {
                ((ViewGroup) wjVar).removeView(this.f27564h);
            }
        }
        ((ActionMenuView) this.f27366f).f1164b = this.f27573q;
    }

    /* renamed from: a */
    public final boolean mo471a() {
        int i;
        ArrayList arrayList;
        boolean z;
        boolean z2;
        boolean z3;
        C1443vt vtVar = this.f27363c;
        View view = null;
        if (vtVar != null) {
            arrayList = vtVar.mo16255g();
            i = arrayList.size();
        } else {
            arrayList = null;
            i = 0;
        }
        int i2 = this.f27567k;
        int i3 = this.f27576t;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.f27366f;
        int i4 = 0;
        boolean z4 = false;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            z = true;
            if (i4 >= i) {
                break;
            }
            C1446vw vwVar = (C1446vw) arrayList.get(i4);
            if (vwVar.mo16304h()) {
                i5++;
            } else if (vwVar.mo16291g()) {
                i6++;
            } else {
                z4 = true;
            }
            if (this.f27577u && vwVar.f27468o) {
                i2 = 0;
            }
            i4++;
        }
        if (this.f27573q && (z4 || i6 + i5 > i2)) {
            i2--;
        }
        int i7 = i2 - i5;
        SparseBooleanArray sparseBooleanArray = this.f27578v;
        sparseBooleanArray.clear();
        int i8 = 0;
        int i9 = 0;
        while (i8 < i) {
            C1446vw vwVar2 = (C1446vw) arrayList.get(i8);
            if (vwVar2.mo16304h()) {
                View a = mo16182a(vwVar2, view, viewGroup);
                a.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = a.getMeasuredWidth();
                i3 -= measuredWidth;
                if (i9 == 0) {
                    i9 = measuredWidth;
                }
                int i10 = vwVar2.f27455b;
                if (i10 != 0) {
                    sparseBooleanArray.put(i10, z);
                }
                vwVar2.mo16286d(z);
            } else if (vwVar2.mo16291g()) {
                int i11 = vwVar2.f27455b;
                boolean z5 = sparseBooleanArray.get(i11);
                boolean z6 = (i7 > 0 || z5) ? i3 > 0 : false;
                if (z6) {
                    View a2 = mo16182a(vwVar2, view, viewGroup);
                    a2.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = a2.getMeasuredWidth();
                    i3 -= measuredWidth2;
                    if (i9 == 0) {
                        i9 = measuredWidth2;
                    }
                    if (i3 + i9 > 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    z2 = z3;
                } else {
                    z2 = z6;
                }
                if (z2 && i11 != 0) {
                    sparseBooleanArray.put(i11, z);
                } else if (z5) {
                    sparseBooleanArray.put(i11, false);
                    for (int i12 = 0; i12 < i8; i12++) {
                        C1446vw vwVar3 = (C1446vw) arrayList.get(i12);
                        if (vwVar3.f27455b == i11) {
                            if (vwVar3.mo16290f()) {
                                i7++;
                            }
                            vwVar3.mo16286d(false);
                        }
                    }
                }
                if (z2) {
                    i7--;
                }
                vwVar2.mo16286d(z2);
            } else {
                vwVar2.mo16286d(false);
            }
            i8++;
            view = null;
            z = true;
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo473a(C1466wp wpVar) {
        boolean z = false;
        if (!wpVar.hasVisibleItems()) {
            return false;
        }
        C1466wp wpVar2 = wpVar;
        while (true) {
            C1443vt vtVar = wpVar2.f27526j;
            if (vtVar == this.f27363c) {
                break;
            }
            wpVar2 = (C1466wp) vtVar;
        }
        C1446vw vwVar = wpVar2.f27527k;
        ViewGroup viewGroup = (ViewGroup) this.f27366f;
        View view = null;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    break;
                }
                View childAt = viewGroup.getChildAt(i);
                if ((childAt instanceof C1459wi) && ((C1459wi) childAt).mo1208a() == vwVar) {
                    view = childAt;
                    break;
                }
                i++;
            }
        }
        if (view == null) {
            return false;
        }
        this.f27572p = wpVar.f27527k.f27454a;
        int size = wpVar.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            MenuItem item = wpVar.getItem(i2);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
            i2++;
        }
        C1478xa xaVar = new C1478xa(this, this.f27362b, wpVar, view);
        this.f27569m = xaVar;
        xaVar.mo16394a(z);
        this.f27569m.mo16391a();
        super.mo473a(wpVar);
        return true;
    }
}
