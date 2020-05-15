package p000;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: wo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1465wo extends C1454wd implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, View.OnKeyListener, C1458wh {

    /* renamed from: a */
    final aas f27507a;

    /* renamed from: b */
    final ViewTreeObserver.OnGlobalLayoutListener f27508b = new C1463wm(this);

    /* renamed from: c */
    View f27509c;

    /* renamed from: d */
    ViewTreeObserver f27510d;

    /* renamed from: e */
    private final Context f27511e;

    /* renamed from: f */
    private final C1443vt f27512f;

    /* renamed from: h */
    private final C1440vq f27513h;

    /* renamed from: i */
    private final boolean f27514i;

    /* renamed from: j */
    private final int f27515j;

    /* renamed from: k */
    private final int f27516k;

    /* renamed from: l */
    private final View.OnAttachStateChangeListener f27517l = new C1464wn(this);

    /* renamed from: m */
    private PopupWindow.OnDismissListener f27518m;

    /* renamed from: n */
    private View f27519n;

    /* renamed from: o */
    private C1457wg f27520o;

    /* renamed from: p */
    private boolean f27521p;

    /* renamed from: q */
    private boolean f27522q;

    /* renamed from: r */
    private int f27523r;

    /* renamed from: s */
    private int f27524s = 0;

    /* renamed from: t */
    private boolean f27525t;

    public C1465wo(Context context, C1443vt vtVar, View view, int i, boolean z) {
        this.f27511e = context;
        this.f27512f = vtVar;
        this.f27514i = z;
        this.f27513h = new C1440vq(vtVar, LayoutInflater.from(context), this.f27514i, C0126R.C0128layout.abc_popup_menu_item_layout);
        this.f27516k = i;
        Resources resources = context.getResources();
        this.f27515j = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C0126R.dimen.abc_config_prefDialogWidth));
        this.f27519n = view;
        this.f27507a = new aas(this.f27511e, this.f27516k);
        vtVar.mo16225a(this, context);
    }

    /* renamed from: a */
    public final void mo16190a(int i) {
        this.f27524s = i;
    }

    /* renamed from: a */
    public final void mo467a(Parcelable parcelable) {
    }

    /* renamed from: a */
    public final void mo16191a(View view) {
        this.f27519n = view;
    }

    /* renamed from: a */
    public final void mo16192a(PopupWindow.OnDismissListener onDismissListener) {
        this.f27518m = onDismissListener;
    }

    /* renamed from: a */
    public final void mo16193a(C1443vt vtVar) {
    }

    /* renamed from: a */
    public final void mo469a(C1457wg wgVar) {
        this.f27520o = wgVar;
    }

    /* renamed from: a */
    public final boolean mo471a() {
        return false;
    }

    /* renamed from: b */
    public final void mo16194b(int i) {
        this.f27507a.f62g = i;
    }

    /* renamed from: b */
    public final void mo16195b(boolean z) {
        this.f27513h.f27417b = z;
    }

    /* renamed from: c */
    public final void mo16196c(int i) {
        this.f27507a.mo96a(i);
    }

    /* renamed from: c */
    public final void mo16197c(boolean z) {
        this.f27525t = z;
    }

    /* renamed from: d */
    public final void mo105d() {
        if (mo107e()) {
            this.f27507a.mo105d();
        }
    }

    /* renamed from: e */
    public final boolean mo107e() {
        return !this.f27521p && this.f27507a.mo107e();
    }

    /* renamed from: f */
    public final Parcelable mo476f() {
        return null;
    }

    /* renamed from: g */
    public final ListView mo109g() {
        return this.f27507a.f60e;
    }

    public final void onDismiss() {
        this.f27521p = true;
        this.f27512f.close();
        ViewTreeObserver viewTreeObserver = this.f27510d;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f27510d = this.f27509c.getViewTreeObserver();
            }
            this.f27510d.removeGlobalOnLayoutListener(this.f27508b);
            this.f27510d = null;
        }
        this.f27509c.removeOnAttachStateChangeListener(this.f27517l);
        PopupWindow.OnDismissListener onDismissListener = this.f27518m;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        mo105d();
        return true;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, zl, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: aI */
    public final void mo101aI() {
        View view;
        if (mo107e()) {
            return;
        }
        if (this.f27521p || (view = this.f27519n) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f27509c = view;
        this.f27507a.mo100a(this);
        aas aas = this.f27507a;
        aas.f68m = this;
        aas.mo114m();
        View view2 = this.f27509c;
        ViewTreeObserver viewTreeObserver = this.f27510d;
        ViewTreeObserver viewTreeObserver2 = view2.getViewTreeObserver();
        this.f27510d = viewTreeObserver2;
        if (viewTreeObserver == null) {
            viewTreeObserver2.addOnGlobalLayoutListener(this.f27508b);
        }
        view2.addOnAttachStateChangeListener(this.f27517l);
        aas aas2 = this.f27507a;
        aas2.f67l = view2;
        aas2.f65j = this.f27524s;
        if (!this.f27522q) {
            this.f27523r = m20678a(this.f27513h, this.f27511e, this.f27515j);
            this.f27522q = true;
        }
        this.f27507a.mo106d(this.f27523r);
        this.f27507a.mo113l();
        this.f27507a.mo97a(this.f27491g);
        this.f27507a.mo101aI();
        C1543zl zlVar = this.f27507a.f60e;
        zlVar.setOnKeyListener(this);
        if (this.f27525t && this.f27512f.f27427e != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f27511e).inflate((int) C0126R.C0128layout.abc_popup_menu_header_item_layout, (ViewGroup) zlVar, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            if (textView != null) {
                textView.setText(this.f27512f.f27427e);
            }
            frameLayout.setEnabled(false);
            zlVar.addHeaderView(frameLayout, null, false);
        }
        this.f27507a.mo99a(this.f27513h);
        this.f27507a.mo101aI();
    }

    /* renamed from: a */
    public final void mo468a(C1443vt vtVar, boolean z) {
        if (vtVar == this.f27512f) {
            mo105d();
            C1457wg wgVar = this.f27520o;
            if (wgVar != null) {
                wgVar.mo15958a(vtVar, z);
            }
        }
    }

    /* renamed from: a */
    public final void mo470a(boolean z) {
        this.f27522q = false;
        C1440vq vqVar = this.f27513h;
        if (vqVar != null) {
            vqVar.notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public final boolean mo473a(C1466wp wpVar) {
        if (wpVar.hasVisibleItems()) {
            C1456wf wfVar = new C1456wf(this.f27511e, wpVar, this.f27509c, this.f27514i, this.f27516k);
            wfVar.mo16393a(this.f27520o);
            wfVar.mo16394a(C1454wd.m20680b(wpVar));
            wfVar.f27494b = this.f27518m;
            this.f27518m = null;
            this.f27512f.mo16226a(false);
            aas aas = this.f27507a;
            int i = aas.f62g;
            int c = aas.mo104c();
            if ((Gravity.getAbsoluteGravity(this.f27524s, C1280ps.m19923h(this.f27519n)) & 7) == 5) {
                i += this.f27519n.getWidth();
            }
            if (!wfVar.mo16399f()) {
                if (wfVar.f27493a != null) {
                    wfVar.mo16392a(i, c, true, true);
                }
            }
            C1457wg wgVar = this.f27520o;
            if (wgVar != null) {
                wgVar.mo15959a(wpVar);
            }
            return true;
        }
        return false;
    }
}
