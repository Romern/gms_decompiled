package android.support.p002v7.widget;

import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* renamed from: android.support.v7.widget.ActionBarOverlayLayout */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ActionBarOverlayLayout extends ViewGroup implements C1525yu, C1267pf, C1268pg {

    /* renamed from: j */
    static final int[] f1134j = {C0126R.attr.actionBarSize, 16842841};

    /* renamed from: A */
    private final Runnable f1135A;

    /* renamed from: B */
    private final C1269ph f1136B;

    /* renamed from: a */
    public int f1137a;

    /* renamed from: b */
    public ActionBarContainer f1138b;

    /* renamed from: c */
    public boolean f1139c;

    /* renamed from: d */
    public boolean f1140d;

    /* renamed from: e */
    public boolean f1141e;

    /* renamed from: f */
    public int f1142f;

    /* renamed from: g */
    public C1475wy f1143g;

    /* renamed from: h */
    public ViewPropertyAnimator f1144h;

    /* renamed from: i */
    public final AnimatorListenerAdapter f1145i;

    /* renamed from: k */
    private int f1146k;

    /* renamed from: l */
    private ContentFrameLayout f1147l;

    /* renamed from: m */
    private C1526yv f1148m;

    /* renamed from: n */
    private Drawable f1149n;

    /* renamed from: o */
    private boolean f1150o;

    /* renamed from: p */
    private boolean f1151p;

    /* renamed from: q */
    private int f1152q;

    /* renamed from: r */
    private final Rect f1153r;

    /* renamed from: s */
    private final Rect f1154s;

    /* renamed from: t */
    private final Rect f1155t;

    /* renamed from: u */
    private C1296qh f1156u;

    /* renamed from: v */
    private C1296qh f1157v;

    /* renamed from: w */
    private C1296qh f1158w;

    /* renamed from: x */
    private C1296qh f1159x;

    /* renamed from: y */
    private OverScroller f1160y;

    /* renamed from: z */
    private final Runnable f1161z;

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private final void m1261a(Context context) {
        boolean z;
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f1134j);
        boolean z2 = false;
        this.f1146k = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f1149n = drawable;
        if (drawable == null) {
            z = true;
        } else {
            z = false;
        }
        setWillNotDraw(z);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z2 = true;
        }
        this.f1150o = z2;
        this.f1160y = new OverScroller(context);
    }

    /* renamed from: a */
    public final void mo1133a(View view, int i, int i2, int[] iArr, int i3) {
    }

    /* renamed from: b */
    public final int mo1261b() {
        ActionBarContainer actionBarContainer = this.f1138b;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    /* renamed from: c */
    public final void mo1263c() {
        removeCallbacks(this.f1161z);
        removeCallbacks(this.f1135A);
        ViewPropertyAnimator viewPropertyAnimator = this.f1144h;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    /* access modifiers changed from: protected */
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1476wz;
    }

    /* renamed from: d */
    public final boolean mo1265d() {
        mo1255a();
        return this.f1148m.mo508h();
    }

    public final void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.f1149n != null && !this.f1150o) {
            if (this.f1138b.getVisibility() == 0) {
                i = (int) (((float) this.f1138b.getBottom()) + this.f1138b.getTranslationY() + 0.5f);
            } else {
                i = 0;
            }
            this.f1149n.setBounds(0, i, getWidth(), this.f1149n.getIntrinsicHeight() + i);
            this.f1149n.draw(canvas);
        }
    }

    /* renamed from: e */
    public final boolean mo1267e() {
        mo1255a();
        return this.f1148m.mo509i();
    }

    /* renamed from: f */
    public final boolean mo1268f() {
        mo1255a();
        return this.f1148m.mo510j();
    }

    /* access modifiers changed from: protected */
    public final boolean fitSystemWindows(Rect rect) {
        int i = Build.VERSION.SDK_INT;
        return super.fitSystemWindows(rect);
    }

    /* renamed from: g */
    public final boolean mo1270g() {
        mo1255a();
        return this.f1148m.mo511k();
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C1476wz();
    }

    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C1476wz(getContext(), attributeSet);
    }

    public final int getNestedScrollAxes() {
        return this.f1136B.mo15689a();
    }

    /* renamed from: h */
    public final boolean mo1275h() {
        mo1255a();
        return this.f1148m.mo512l();
    }

    /* renamed from: i */
    public final void mo1276i() {
        mo1255a();
        this.f1148m.mo513m();
    }

    /* renamed from: j */
    public final void mo1277j() {
        mo1255a();
        this.f1148m.mo514n();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0065, code lost:
        if (r0 != false) goto L_0x0067;
     */
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        mo1255a();
        C1296qh a = C1296qh.m19996a(windowInsets);
        boolean a2 = m1262a(this.f1138b, new Rect(a.mo15731a(), a.mo15733b(), a.mo15735c(), a.mo15736d()), false);
        this.f1153r.setEmpty();
        C1280ps.m19897a(this, this.f1156u, this.f1153r);
        C1296qh b = a.mo15734b(this.f1153r.left, this.f1153r.top, this.f1153r.right, this.f1153r.bottom);
        this.f1156u = b;
        if (!this.f1157v.equals(b)) {
            this.f1157v = this.f1156u;
            a2 = true;
        }
        if (!this.f1154s.equals(this.f1153r)) {
            this.f1154s.set(this.f1153r);
        }
        requestLayout();
        return a.mo15743i().mo15740g().mo15741h().mo15746l();
    }

    /* access modifiers changed from: protected */
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m1261a(getContext());
        C1280ps.m19937s(this);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo1263c();
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C1476wz wzVar = (C1476wz) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = wzVar.leftMargin + paddingLeft;
                int i7 = wzVar.topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        mo1255a();
        measureChildWithMargins(this.f1138b, i, 0, i2, 0);
        C1476wz wzVar = (C1476wz) this.f1138b.getLayoutParams();
        int max = Math.max(0, this.f1138b.getMeasuredWidth() + wzVar.leftMargin + wzVar.rightMargin);
        int max2 = Math.max(0, this.f1138b.getMeasuredHeight() + wzVar.topMargin + wzVar.bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f1138b.getMeasuredState());
        int r = C1280ps.m19936r(this) & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        int measuredHeight = r == 0 ? this.f1138b.getVisibility() != 8 ? this.f1138b.getMeasuredHeight() : 0 : this.f1146k;
        this.f1155t.set(this.f1153r);
        int i3 = Build.VERSION.SDK_INT;
        this.f1158w = this.f1156u;
        if (!this.f1139c && r == 0) {
            this.f1155t.top += measuredHeight;
            Rect rect = this.f1155t;
            rect.bottom = rect.bottom;
            int i4 = Build.VERSION.SDK_INT;
            this.f1158w = this.f1158w.mo15734b(0, measuredHeight, 0, 0);
        } else {
            int i5 = Build.VERSION.SDK_INT;
            C1166ln a = C1166ln.m19401a(this.f1158w.mo15731a(), this.f1158w.mo15733b() + measuredHeight, this.f1158w.mo15735c(), this.f1158w.mo15736d());
            C1289qa qaVar = new C1289qa(this.f1158w);
            qaVar.mo15718a(a);
            this.f1158w = qaVar.mo15717a();
        }
        m1262a(this.f1147l, this.f1155t, true);
        int i6 = Build.VERSION.SDK_INT;
        if (!this.f1159x.equals(this.f1158w)) {
            C1296qh qhVar = this.f1158w;
            this.f1159x = qhVar;
            C1280ps.m19904b(this.f1147l, qhVar);
        } else {
            int i7 = Build.VERSION.SDK_INT;
        }
        measureChildWithMargins(this.f1147l, i, 0, i2, 0);
        C1476wz wzVar2 = (C1476wz) this.f1147l.getLayoutParams();
        int max3 = Math.max(max, this.f1147l.getMeasuredWidth() + wzVar2.leftMargin + wzVar2.rightMargin);
        int max4 = Math.max(max2, this.f1147l.getMeasuredHeight() + wzVar2.topMargin + wzVar2.bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f1147l.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
    }

    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.f1151p || !z) {
            return false;
        }
        this.f1160y.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f1160y.getFinalY() > this.f1138b.getHeight()) {
            mo1263c();
            this.f1135A.run();
        } else {
            mo1263c();
            this.f1161z.run();
        }
        this.f1141e = true;
        return true;
    }

    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.f1152q + i2;
        this.f1152q = i5;
        mo1256a(i5);
    }

    public final void onNestedScrollAccepted(View view, View view2, int i) {
        C1389tt ttVar;
        C1425vb vbVar;
        this.f1136B.mo15692b(i);
        this.f1152q = mo1261b();
        mo1263c();
        C1475wy wyVar = this.f1143g;
        if (wyVar != null && (vbVar = (ttVar = (C1389tt) wyVar).f27178n) != null) {
            vbVar.mo16129b();
            ttVar.f27178n = null;
        }
    }

    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f1138b.getVisibility() != 0) {
            return false;
        }
        return this.f1151p;
    }

    public final void onStopNestedScroll(View view) {
        if (this.f1151p && !this.f1141e) {
            if (this.f1152q <= this.f1138b.getHeight()) {
                mo1263c();
                postDelayed(this.f1161z, 600);
            } else {
                mo1263c();
                postDelayed(this.f1135A, 600);
            }
        }
        C1475wy wyVar = this.f1143g;
    }

    public final void onWindowSystemUiVisibilityChanged(int i) {
        boolean z;
        int i2 = Build.VERSION.SDK_INT;
        super.onWindowSystemUiVisibilityChanged(i);
        mo1255a();
        int i3 = this.f1142f ^ i;
        this.f1142f = i;
        int i4 = i & 4;
        int i5 = i & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        C1475wy wyVar = this.f1143g;
        if (wyVar != null) {
            if (i5 == 0) {
                z = true;
            } else {
                z = false;
            }
            C1389tt ttVar = (C1389tt) wyVar;
            ttVar.f27175k = z;
            if (i4 == 0 || i5 == 0) {
                if (ttVar.f27177m) {
                    ttVar.f27177m = false;
                    ttVar.mo16036g(true);
                }
            } else if (!ttVar.f27177m) {
                ttVar.f27177m = true;
                ttVar.mo16036g(true);
            }
        }
        if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 && this.f1143g != null) {
            C1280ps.m19937s(this);
        }
    }

    /* access modifiers changed from: protected */
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f1137a = i;
        C1475wy wyVar = this.f1143g;
        if (wyVar != null) {
            ((C1389tt) wyVar).f27174j = i;
        }
    }

    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1137a = 0;
        this.f1153r = new Rect();
        this.f1154s = new Rect();
        this.f1155t = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        this.f1156u = C1296qh.f26855a;
        this.f1157v = C1296qh.f26855a;
        this.f1158w = C1296qh.f26855a;
        this.f1159x = C1296qh.f26855a;
        this.f1145i = new C1472wv(this);
        this.f1161z = new C1473ww(this);
        this.f1135A = new C1474wx(this);
        m1261a(context);
        this.f1136B = new C1269ph();
    }

    /* renamed from: b */
    public final void mo1262b(int i) {
        mo1255a();
        if (i == 2) {
            this.f1148m.mo506f();
        } else if (i == 5) {
            this.f1148m.mo507g();
        } else if (i == 109) {
            boolean z = true;
            this.f1139c = true;
            if (getContext().getApplicationInfo().targetSdkVersion >= 19) {
                z = false;
            }
            this.f1150o = z;
        }
    }

    /* access modifiers changed from: protected */
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C1476wz(layoutParams);
    }

    /* renamed from: a */
    private static final boolean m1262a(View view, Rect rect, boolean z) {
        boolean z2;
        C1476wz wzVar = (C1476wz) view.getLayoutParams();
        if (wzVar.leftMargin != rect.left) {
            wzVar.leftMargin = rect.left;
            z2 = true;
        } else {
            z2 = false;
        }
        if (wzVar.topMargin != rect.top) {
            wzVar.topMargin = rect.top;
            z2 = true;
        }
        if (wzVar.rightMargin != rect.right) {
            wzVar.rightMargin = rect.right;
            z2 = true;
        }
        if (!z || wzVar.bottomMargin == rect.bottom) {
            return z2;
        }
        wzVar.bottomMargin = rect.bottom;
        return true;
    }

    /* renamed from: b */
    public final void mo1144b(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo1255a() {
        C1526yv yvVar;
        if (this.f1147l == null) {
            this.f1147l = (ContentFrameLayout) findViewById(C0126R.C0129id.action_bar_activity_content);
            this.f1138b = (ActionBarContainer) findViewById(C0126R.C0129id.action_bar_container);
            View findViewById = findViewById(C0126R.C0129id.action_bar);
            if (findViewById instanceof C1526yv) {
                yvVar = (C1526yv) findViewById;
            } else if (findViewById instanceof Toolbar) {
                yvVar = ((Toolbar) findViewById).mo1715q();
            } else {
                throw new IllegalStateException("Can't make a decor toolbar out of " + findViewById.getClass().getSimpleName());
            }
            this.f1148m = yvVar;
        }
    }

    /* renamed from: a */
    public final void mo1256a(int i) {
        mo1263c();
        this.f1138b.setTranslationY((float) (-Math.max(0, Math.min(i, this.f1138b.getHeight()))));
    }

    /* renamed from: a */
    public final void mo1257a(Menu menu, C1457wg wgVar) {
        mo1255a();
        this.f1148m.mo490a(menu, wgVar);
    }

    /* renamed from: a */
    public final void mo1130a(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    /* renamed from: a */
    public final void mo1131a(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    /* renamed from: a */
    public final void mo1132a(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        mo1131a(view, i, i2, i3, i4, i5);
    }

    /* renamed from: a */
    public final void mo1258a(Window.Callback callback) {
        mo1255a();
        this.f1148m.mo492a(callback);
    }

    /* renamed from: a */
    public final void mo1259a(CharSequence charSequence) {
        mo1255a();
        this.f1148m.mo493a(charSequence);
    }

    /* renamed from: a */
    public final void mo1260a(boolean z) {
        if (z != this.f1151p) {
            this.f1151p = z;
            if (!z) {
                mo1263c();
                mo1256a(0);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo1139a(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }
}
