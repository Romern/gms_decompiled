package p000;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p002v7.widget.ActionBarContainer;
import android.support.p002v7.widget.ActionBarContextView;
import android.support.p002v7.widget.ActionBarOverlayLayout;
import android.support.p002v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import com.felicanetworks.mfc.C0126R;
import java.util.ArrayList;

/* renamed from: tt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1389tt extends C1341rz implements C1475wy {

    /* renamed from: s */
    private static final Interpolator f27161s = new AccelerateInterpolator();

    /* renamed from: t */
    private static final Interpolator f27162t = new DecelerateInterpolator();

    /* renamed from: A */
    private boolean f27163A = true;

    /* renamed from: B */
    private boolean f27164B;

    /* renamed from: a */
    Context f27165a;

    /* renamed from: b */
    ActionBarOverlayLayout f27166b;

    /* renamed from: c */
    public ActionBarContainer f27167c;

    /* renamed from: d */
    C1526yv f27168d;

    /* renamed from: e */
    ActionBarContextView f27169e;

    /* renamed from: f */
    View f27170f;

    /* renamed from: g */
    C1388ts f27171g;

    /* renamed from: h */
    C1414ur f27172h;

    /* renamed from: i */
    C1413uq f27173i;

    /* renamed from: j */
    public int f27174j = 0;

    /* renamed from: k */
    public boolean f27175k = true;

    /* renamed from: l */
    boolean f27176l;

    /* renamed from: m */
    public boolean f27177m;

    /* renamed from: n */
    public C1425vb f27178n;

    /* renamed from: o */
    boolean f27179o;

    /* renamed from: p */
    final C1286py f27180p = new C1385tp(this);

    /* renamed from: q */
    final C1286py f27181q = new C1386tq(this);

    /* renamed from: r */
    final C1387tr f27182r = new C1387tr(this);

    /* renamed from: u */
    private Context f27183u;

    /* renamed from: v */
    private boolean f27184v;

    /* renamed from: w */
    private boolean f27185w;

    /* renamed from: x */
    private final ArrayList f27186x = new ArrayList();

    /* renamed from: y */
    private boolean f27187y;

    /* renamed from: z */
    private boolean f27188z;

    public C1389tt(Activity activity, boolean z) {
        new ArrayList();
        View decorView = activity.getWindow().getDecorView();
        m20418b(decorView);
        if (!z) {
            this.f27170f = decorView.findViewById(16908290);
        }
    }

    /* renamed from: a */
    static boolean m20417a(boolean z, boolean z2, boolean z3) {
        if (!z3) {
            return !z && !z2;
        }
        return true;
    }

    /* renamed from: b */
    private final void m20418b(View view) {
        C1526yv yvVar;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(C0126R.C0129id.decor_content_parent);
        this.f27166b = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.f1143g = this;
            if (actionBarOverlayLayout.getWindowToken() != null) {
                ((C1389tt) actionBarOverlayLayout.f1143g).f27174j = actionBarOverlayLayout.f1137a;
                int i = actionBarOverlayLayout.f1142f;
                if (i != 0) {
                    actionBarOverlayLayout.onWindowSystemUiVisibilityChanged(i);
                    C1280ps.m19937s(actionBarOverlayLayout);
                }
            }
        }
        View findViewById = view.findViewById(C0126R.C0129id.action_bar);
        if (findViewById instanceof C1526yv) {
            yvVar = (C1526yv) findViewById;
        } else if (findViewById instanceof Toolbar) {
            yvVar = ((Toolbar) findViewById).mo1715q();
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Can't make a decor toolbar out of ");
            sb.append(findViewById != null ? findViewById.getClass().getSimpleName() : "null");
            throw new IllegalStateException(sb.toString());
        }
        this.f27168d = yvVar;
        this.f27169e = (ActionBarContextView) view.findViewById(C0126R.C0129id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(C0126R.C0129id.action_bar_container);
        this.f27167c = actionBarContainer;
        C1526yv yvVar2 = this.f27168d;
        if (yvVar2 == null || this.f27169e == null || actionBarContainer == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f27165a = yvVar2.mo495b();
        if ((this.f27168d.mo515o() & 4) != 0) {
            this.f27184v = true;
        }
        C1412up a = C1412up.m20487a(this.f27165a);
        int i2 = a.f27271a.getApplicationInfo().targetSdkVersion;
        mo15877p();
        m20419i(a.mo16090b());
        TypedArray obtainStyledAttributes = this.f27165a.obtainStyledAttributes(null, C1390tu.f27192a, C0126R.attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f27166b;
            if (actionBarOverlayLayout2.f1139c) {
                this.f27179o = true;
                actionBarOverlayLayout2.mo1260a(true);
            } else {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            mo15839a((float) dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: i */
    private final void m20419i(boolean z) {
        boolean z2;
        this.f27187y = z;
        if (z) {
            this.f27168d.mo518r();
        } else {
            this.f27168d.mo518r();
        }
        int p = this.f27168d.mo516p();
        C1526yv yvVar = this.f27168d;
        boolean z3 = true;
        if (this.f27187y) {
            z2 = false;
        } else {
            z2 = p == 2;
        }
        yvVar.mo494a(z2);
        ActionBarOverlayLayout actionBarOverlayLayout = this.f27166b;
        if (this.f27187y || p != 2) {
            z3 = false;
        }
        actionBarOverlayLayout.f1140d = z3;
    }

    /* renamed from: c */
    public final int mo15854c() {
        return this.f27168d.mo515o();
    }

    /* renamed from: d */
    public final void mo15859d() {
        if (this.f27176l) {
            this.f27176l = false;
            mo16036g(false);
        }
    }

    /* renamed from: e */
    public final void mo15862e() {
        if (!this.f27176l) {
            this.f27176l = true;
            mo16036g(false);
        }
    }

    /* renamed from: f */
    public final void mo15865f(int i) {
        this.f27168d.mo503d(i);
    }

    /* renamed from: g */
    public final Context mo15868g() {
        if (this.f27183u == null) {
            TypedValue typedValue = new TypedValue();
            this.f27165a.getTheme().resolveAttribute(C0126R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f27183u = new ContextThemeWrapper(this.f27165a, i);
            } else {
                this.f27183u = this.f27165a;
            }
        }
        return this.f27183u;
    }

    /* renamed from: h */
    public final float mo15869h() {
        return C1280ps.m19933o(this.f27167c);
    }

    /* renamed from: l */
    public final boolean mo15873l() {
        C1526yv yvVar = this.f27168d;
        if (yvVar == null || !yvVar.mo501c()) {
            return false;
        }
        this.f27168d.mo502d();
        return true;
    }

    /* renamed from: n */
    public final void mo15875n() {
        m20419i(C1412up.m20487a(this.f27165a).mo16090b());
    }

    /* renamed from: o */
    public final void mo15876o() {
        mo15841a(16, 16);
    }

    /* renamed from: p */
    public final void mo15877p() {
        this.f27168d.mo519s();
    }

    /* renamed from: a */
    public final View mo15837a() {
        return this.f27168d.mo517q();
    }

    /* renamed from: c */
    public final void mo15855c(int i) {
        mo15845a(this.f27165a.getString(i));
    }

    /* renamed from: d */
    public final void mo15860d(int i) {
        if ((i & 4) != 0) {
            this.f27184v = true;
        }
        this.f27168d.mo496b(i);
    }

    /* renamed from: e */
    public final void mo15863e(int i) {
        this.f27168d.mo499c(i);
    }

    /* renamed from: f */
    public final void mo15866f(boolean z) {
        if (z != this.f27185w) {
            this.f27185w = z;
            int size = this.f27186x.size();
            for (int i = 0; i < size; i++) {
                ((C1340ry) this.f27186x.get(i)).mo15836a();
            }
        }
    }

    /* renamed from: h */
    public final void mo16037h(boolean z) {
        C1285px pxVar;
        C1285px pxVar2;
        long j;
        if (!z) {
            if (this.f27188z) {
                this.f27188z = false;
                mo16036g(false);
            }
        } else if (!this.f27188z) {
            this.f27188z = true;
            mo16036g(false);
        }
        if (C1280ps.m19868C(this.f27167c)) {
            if (!z) {
                pxVar = this.f27168d.mo487a(0, 200);
                pxVar2 = this.f27169e.mo16448a(8, 100);
            } else {
                pxVar2 = this.f27168d.mo487a(4, 100);
                pxVar = this.f27169e.mo16448a(0, 200);
            }
            C1425vb vbVar = new C1425vb();
            vbVar.f27336a.add(pxVar2);
            View view = (View) pxVar2.f26845a.get();
            if (view != null) {
                j = view.animate().getDuration();
            } else {
                j = 0;
            }
            View view2 = (View) pxVar.f26845a.get();
            if (view2 != null) {
                view2.animate().setStartDelay(j);
            }
            vbVar.f27336a.add(pxVar);
            vbVar.mo16125a();
        } else if (!z) {
            this.f27168d.mo505e(0);
            this.f27169e.setVisibility(8);
        } else {
            this.f27168d.mo505e(4);
            this.f27169e.setVisibility(0);
        }
    }

    /* renamed from: a */
    public final C1414ur mo15838a(C1413uq uqVar) {
        C1388ts tsVar = this.f27171g;
        if (tsVar != null) {
            tsVar.mo16030c();
        }
        this.f27166b.mo1260a(false);
        this.f27169e.mo1240a();
        C1388ts tsVar2 = new C1388ts(this, this.f27169e.getContext(), uqVar);
        tsVar2.f27156a.mo16252e();
        try {
            if (!tsVar2.f27157b.mo15961a(tsVar2, tsVar2.f27156a)) {
                return null;
            }
            this.f27171g = tsVar2;
            tsVar2.mo16031d();
            this.f27169e.mo1244a(tsVar2);
            mo16037h(true);
            this.f27169e.sendAccessibilityEvent(32);
            return tsVar2;
        } finally {
            tsVar2.f27156a.mo16253f();
        }
    }

    /* renamed from: c */
    public final void mo15856c(Drawable drawable) {
        this.f27168d.mo497b(drawable);
    }

    /* renamed from: d */
    public final void mo15861d(boolean z) {
        if (!this.f27184v) {
            mo15853b(z);
        }
    }

    /* renamed from: e */
    public final void mo15864e(boolean z) {
        C1425vb vbVar;
        this.f27164B = z;
        if (!z && (vbVar = this.f27178n) != null) {
            vbVar.mo16129b();
        }
    }

    /* renamed from: g */
    public final void mo16036g(boolean z) {
        View view;
        View view2;
        View view3;
        if (m20417a(this.f27176l, this.f27177m, this.f27188z)) {
            if (!this.f27163A) {
                this.f27163A = true;
                C1425vb vbVar = this.f27178n;
                if (vbVar != null) {
                    vbVar.mo16129b();
                }
                this.f27167c.setVisibility(0);
                if (this.f27174j == 0 && (this.f27164B || z)) {
                    this.f27167c.setTranslationY(0.0f);
                    float f = (float) (-this.f27167c.getHeight());
                    if (z) {
                        int[] iArr = {0, 0};
                        this.f27167c.getLocationInWindow(iArr);
                        f -= (float) iArr[1];
                    }
                    this.f27167c.setTranslationY(f);
                    C1425vb vbVar2 = new C1425vb();
                    C1285px m = C1280ps.m19931m(this.f27167c);
                    m.mo15716d(0.0f);
                    m.mo15712a(this.f27182r);
                    vbVar2.mo16127a(m);
                    if (this.f27175k && (view3 = this.f27170f) != null) {
                        view3.setTranslationY(f);
                        C1285px m2 = C1280ps.m19931m(this.f27170f);
                        m2.mo15716d(0.0f);
                        vbVar2.mo16127a(m2);
                    }
                    vbVar2.mo16126a(f27162t);
                    vbVar2.mo16130c();
                    vbVar2.mo16128a(this.f27181q);
                    this.f27178n = vbVar2;
                    vbVar2.mo16125a();
                } else {
                    this.f27167c.setAlpha(1.0f);
                    this.f27167c.setTranslationY(0.0f);
                    if (this.f27175k && (view2 = this.f27170f) != null) {
                        view2.setTranslationY(0.0f);
                    }
                    this.f27181q.mo484a(null);
                }
                ActionBarOverlayLayout actionBarOverlayLayout = this.f27166b;
                if (actionBarOverlayLayout != null) {
                    C1280ps.m19937s(actionBarOverlayLayout);
                }
            }
        } else if (this.f27163A) {
            this.f27163A = false;
            C1425vb vbVar3 = this.f27178n;
            if (vbVar3 != null) {
                vbVar3.mo16129b();
            }
            if (this.f27174j == 0 && (this.f27164B || z)) {
                this.f27167c.setAlpha(1.0f);
                this.f27167c.mo1227a(true);
                C1425vb vbVar4 = new C1425vb();
                float f2 = (float) (-this.f27167c.getHeight());
                if (z) {
                    int[] iArr2 = {0, 0};
                    this.f27167c.getLocationInWindow(iArr2);
                    f2 -= (float) iArr2[1];
                }
                C1285px m3 = C1280ps.m19931m(this.f27167c);
                m3.mo15716d(f2);
                m3.mo15712a(this.f27182r);
                vbVar4.mo16127a(m3);
                if (this.f27175k && (view = this.f27170f) != null) {
                    C1285px m4 = C1280ps.m19931m(view);
                    m4.mo15716d(f2);
                    vbVar4.mo16127a(m4);
                }
                vbVar4.mo16126a(f27161s);
                vbVar4.mo16130c();
                vbVar4.mo16128a(this.f27180p);
                this.f27178n = vbVar4;
                vbVar4.mo16125a();
                return;
            }
            this.f27180p.mo484a(null);
        }
    }

    /* renamed from: c */
    public final void mo15857c(CharSequence charSequence) {
        this.f27168d.mo493a(charSequence);
    }

    /* renamed from: f */
    public final boolean mo15867f() {
        int height = this.f27167c.getHeight();
        if (!this.f27163A || (height != 0 && this.f27166b.mo1261b() >= height)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final void mo15858c(boolean z) {
        mo15841a(!z ? 0 : 8, 8);
    }

    public C1389tt(Dialog dialog) {
        new ArrayList();
        m20418b(dialog.getWindow().getDecorView());
    }

    /* renamed from: a */
    public final void mo15839a(float f) {
        C1280ps.m19918f(this.f27167c, f);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [int, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final void mo15840a(int i) {
        mo15843a(LayoutInflater.from(mo15868g()).inflate(i, this.f27168d.mo486a(), false));
    }

    /* renamed from: a */
    public final void mo15841a(int i, int i2) {
        int o = this.f27168d.mo515o();
        if ((i2 & 4) != 0) {
            this.f27184v = true;
        }
        this.f27168d.mo496b((i & i2) | ((i2 ^ -1) & o));
    }

    /* renamed from: a */
    public final void mo15842a(Drawable drawable) {
        this.f27168d.mo489a(drawable);
    }

    /* renamed from: a */
    public final void mo15843a(View view) {
        this.f27168d.mo491a(view);
    }

    /* renamed from: a */
    public final void mo15844a(View view, C1339rx rxVar) {
        view.setLayoutParams(rxVar);
        this.f27168d.mo491a(view);
    }

    /* renamed from: a */
    public final void mo15845a(CharSequence charSequence) {
        this.f27168d.mo498b(charSequence);
    }

    /* renamed from: a */
    public final void mo15846a(boolean z) {
        mo15841a(!z ? 0 : 2, 2);
    }

    /* renamed from: a */
    public final boolean mo15847a(int i, KeyEvent keyEvent) {
        C1443vt vtVar;
        int i2;
        C1388ts tsVar = this.f27171g;
        if (tsVar == null || (vtVar = tsVar.f27156a) == null) {
            return false;
        }
        if (keyEvent != null) {
            i2 = keyEvent.getDeviceId();
        } else {
            i2 = -1;
        }
        boolean z = true;
        if (KeyCharacterMap.load(i2).getKeyboardType() == 1) {
            z = false;
        }
        vtVar.setQwertyMode(z);
        return vtVar.performShortcut(i, keyEvent, 0);
    }

    /* renamed from: b */
    public final CharSequence mo15849b() {
        return this.f27168d.mo504e();
    }

    /* renamed from: b */
    public final void mo15850b(int i) {
        this.f27168d.mo488a(i);
    }

    /* renamed from: b */
    public final void mo15851b(Drawable drawable) {
        ActionBarContainer actionBarContainer = this.f27167c;
        Drawable drawable2 = actionBarContainer.f1115b;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            actionBarContainer.unscheduleDrawable(actionBarContainer.f1115b);
        }
        actionBarContainer.f1115b = drawable;
        drawable.setCallback(actionBarContainer);
        View view = actionBarContainer.f1114a;
        if (view != null) {
            actionBarContainer.f1115b.setBounds(view.getLeft(), actionBarContainer.f1114a.getTop(), actionBarContainer.f1114a.getRight(), actionBarContainer.f1114a.getBottom());
        }
        boolean z = true;
        if (actionBarContainer.f1118e ? actionBarContainer.f1117d != null : !(actionBarContainer.f1115b == null && actionBarContainer.f1116c == null)) {
            z = false;
        }
        actionBarContainer.setWillNotDraw(z);
        actionBarContainer.invalidate();
        int i = Build.VERSION.SDK_INT;
        actionBarContainer.invalidateOutline();
    }

    /* renamed from: b */
    public final void mo15852b(CharSequence charSequence) {
        this.f27168d.mo500c(charSequence);
    }

    /* renamed from: b */
    public final void mo15853b(boolean z) {
        mo15841a(!z ? 0 : 4, 4);
    }
}
