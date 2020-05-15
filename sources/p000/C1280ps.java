package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Display;
import android.view.PointerIcon;
import android.view.View;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.felicanetworks.mfc.C0126R;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: ps */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1280ps {

    /* renamed from: a */
    public static final /* synthetic */ int f26840a = 0;

    /* renamed from: b */
    private static WeakHashMap f26841b = null;

    static {
        new AtomicInteger(1);
        new C1277pp();
    }

    /* renamed from: A */
    public static void m19866A(View view) {
        int i = Build.VERSION.SDK_INT;
        view.stopNestedScroll();
    }

    /* renamed from: B */
    public static boolean m19867B(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.isInLayout();
    }

    /* renamed from: C */
    public static boolean m19868C(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.isLaidOut();
    }

    /* renamed from: D */
    public static float m19869D(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.getZ();
    }

    /* renamed from: E */
    public static Rect m19870E(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.getClipBounds();
    }

    /* renamed from: F */
    public static boolean m19871F(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.isAttachedToWindow();
    }

    /* renamed from: G */
    public static boolean m19872G(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.hasOnClickListeners();
    }

    /* renamed from: H */
    public static Display m19873H(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.getDisplay();
    }

    /* renamed from: I */
    public static boolean m19874I(View view) {
        Boolean bool = (Boolean) new C1274pm().mo15702b(view);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* renamed from: J */
    public static CharSequence m19875J(View view) {
        return (CharSequence) new C1275pn().mo15702b(view);
    }

    @Deprecated
    /* renamed from: K */
    public static void m19876K(View view) {
        view.setAlpha(0.0f);
    }

    /* renamed from: L */
    public static void m19877L(View view) {
        int i = Build.VERSION.SDK_INT;
        view.setImportantForAutofill(8);
    }

    /* renamed from: M */
    private static View.AccessibilityDelegate m19878M(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.getAccessibilityDelegate();
    }

    /* renamed from: N */
    private static List m19879N(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(C0126R.C0129id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(C0126R.C0129id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    @Deprecated
    /* renamed from: a */
    public static int m19880a(View view) {
        return view.getOverScrollMode();
    }

    /* renamed from: b */
    public static int m19903b(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.getImportantForAutofill();
    }

    /* renamed from: c */
    public static C1251oq m19908c(View view) {
        View.AccessibilityDelegate M = m19878M(view);
        if (M == null) {
            return null;
        }
        if (M instanceof C1250op) {
            return ((C1250op) M).f26817a;
        }
        return new C1251oq(M);
    }

    @Deprecated
    /* renamed from: d */
    public static void m19911d(View view, float f) {
        view.setPivotX(f);
    }

    /* renamed from: e */
    public static View m19914e(View view, int i) {
        int i2 = Build.VERSION.SDK_INT;
        return view.requireViewById(i);
    }

    /* renamed from: f */
    public static int m19917f(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.getImportantForAccessibility();
    }

    @Deprecated
    /* renamed from: g */
    public static float m19920g(View view) {
        return view.getAlpha();
    }

    /* renamed from: h */
    public static int m19923h(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.getLayoutDirection();
    }

    /* renamed from: i */
    public static int m19925i(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.getPaddingStart();
    }

    /* renamed from: j */
    public static int m19927j(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.getPaddingEnd();
    }

    /* renamed from: k */
    public static int m19929k(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.getMinimumWidth();
    }

    /* renamed from: l */
    public static int m19930l(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.getMinimumHeight();
    }

    /* renamed from: m */
    public static C1285px m19931m(View view) {
        if (f26841b == null) {
            f26841b = new WeakHashMap();
        }
        C1285px pxVar = (C1285px) f26841b.get(view);
        if (pxVar != null) {
            return pxVar;
        }
        C1285px pxVar2 = new C1285px(view);
        f26841b.put(view, pxVar2);
        return pxVar2;
    }

    @Deprecated
    /* renamed from: n */
    public static float m19932n(View view) {
        return view.getY();
    }

    /* renamed from: o */
    public static float m19933o(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.getElevation();
    }

    /* renamed from: p */
    public static float m19934p(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.getTranslationZ();
    }

    /* renamed from: q */
    public static String m19935q(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.getTransitionName();
    }

    /* renamed from: r */
    public static int m19936r(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.getWindowSystemUiVisibility();
    }

    /* renamed from: s */
    public static void m19937s(View view) {
        int i = Build.VERSION.SDK_INT;
        view.requestApplyInsets();
    }

    /* renamed from: t */
    public static boolean m19938t(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.getFitsSystemWindows();
    }

    /* renamed from: u */
    public static C1296qh m19939u(View view) {
        int i = Build.VERSION.SDK_INT;
        return C1296qh.m19996a(C1279pr.m19865a(view));
    }

    /* renamed from: v */
    public static boolean m19940v(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.hasOverlappingRendering();
    }

    /* renamed from: w */
    public static boolean m19941w(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.isPaddingRelative();
    }

    /* renamed from: x */
    public static ColorStateList m19942x(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.getBackgroundTintList();
    }

    /* renamed from: y */
    public static PorterDuff.Mode m19943y(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.getBackgroundTintMode();
    }

    /* renamed from: z */
    public static boolean m19944z(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.isNestedScrollingEnabled();
    }

    /* renamed from: a */
    public static C1296qh m19881a(View view, C1296qh qhVar) {
        int i = Build.VERSION.SDK_INT;
        WindowInsets l = qhVar.mo15746l();
        if (l != null) {
            WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(l);
            if (!onApplyWindowInsets.equals(l)) {
                return C1296qh.m19996a(onApplyWindowInsets);
            }
        }
        return qhVar;
    }

    /* renamed from: b */
    public static C1296qh m19904b(View view, C1296qh qhVar) {
        int i = Build.VERSION.SDK_INT;
        WindowInsets l = qhVar.mo15746l();
        return (l == null || view.dispatchApplyWindowInsets(l).equals(l)) ? qhVar : C1296qh.m19996a(l);
    }

    /* renamed from: d */
    public static void m19912d(View view, int i) {
        int i2 = Build.VERSION.SDK_INT;
        view.setLayoutDirection(i);
    }

    /* renamed from: e */
    public static void m19915e(View view) {
        int i = Build.VERSION.SDK_INT;
        view.postInvalidateOnAnimation();
    }

    /* renamed from: f */
    public static void m19918f(View view, float f) {
        int i = Build.VERSION.SDK_INT;
        view.setElevation(f);
    }

    /* renamed from: g */
    public static void m19921g(View view, float f) {
        int i = Build.VERSION.SDK_INT;
        view.setTranslationZ(f);
    }

    /* renamed from: h */
    public static void m19924h(View view, int i) {
        int i2 = Build.VERSION.SDK_INT;
        view.offsetLeftAndRight(i);
    }

    /* renamed from: i */
    public static void m19926i(View view, int i) {
        int i2;
        if (((AccessibilityManager) view.getContext().getSystemService("accessibility")).isEnabled()) {
            CharSequence J = m19875J(view);
            int i3 = Build.VERSION.SDK_INT;
            if (view.getAccessibilityLiveRegion() != 0 || (J != null && view.getVisibility() == 0)) {
                if (J == null) {
                    i2 = 2048;
                } else {
                    i2 = 32;
                }
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(i2);
                obtain.setContentChangeTypes(i);
                view.sendAccessibilityEventUnchecked(obtain);
            } else if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                } catch (AbstractMethodError e) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e);
                }
            }
        }
    }

    /* renamed from: j */
    public static void m19928j(View view, int i) {
        int i2 = Build.VERSION.SDK_INT;
        view.setScrollIndicators(i, 3);
    }

    /* renamed from: d */
    public static boolean m19913d(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.hasTransientState();
    }

    @Deprecated
    /* renamed from: e */
    public static void m19916e(View view, float f) {
        view.setPivotY(f);
    }

    /* renamed from: f */
    public static void m19919f(View view, int i) {
        int i2 = Build.VERSION.SDK_INT;
        view.setAccessibilityLiveRegion(i);
    }

    /* renamed from: g */
    public static void m19922g(View view, int i) {
        int i2 = Build.VERSION.SDK_INT;
        view.offsetTopAndBottom(i);
    }

    @Deprecated
    /* renamed from: c */
    public static void m19909c(View view, float f) {
        view.setScaleY(f);
    }

    /* renamed from: a */
    public static void m19882a() {
        int i = Build.VERSION.SDK_INT;
    }

    @Deprecated
    /* renamed from: b */
    public static void m19905b(View view, float f) {
        view.setScaleX(f);
    }

    /* renamed from: c */
    public static void m19910c(View view, int i) {
        int i2 = Build.VERSION.SDK_INT;
        m19883a(i, view);
        m19926i(view, 0);
    }

    /* renamed from: a */
    private static void m19883a(int i, View view) {
        List N = m19879N(view);
        int i2 = 0;
        while (i2 < N.size()) {
            if (((C1298qj) N.get(i2)).mo15748a() != i) {
                i2++;
            } else {
                N.remove(i2);
                return;
            }
        }
    }

    /* renamed from: b */
    public static void m19906b(View view, int i) {
        int i2 = Build.VERSION.SDK_INT;
        view.setImportantForAccessibility(i);
    }

    @Deprecated
    /* renamed from: a */
    public static void m19884a(View view, float f) {
        view.setTranslationY(f);
    }

    @Deprecated
    /* renamed from: b */
    public static void m19907b(View view, boolean z) {
        view.setFitsSystemWindows(z);
    }

    /* renamed from: a */
    public static void m19885a(View view, int i, int i2, int i3, int i4) {
        int i5 = Build.VERSION.SDK_INT;
        view.setPaddingRelative(i, i2, i3, i4);
    }

    /* renamed from: a */
    public static void m19886a(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
    }

    /* renamed from: a */
    public static void m19887a(View view, ColorStateList colorStateList) {
        int i = Build.VERSION.SDK_INT;
        view.setBackgroundTintList(colorStateList);
        int i2 = Build.VERSION.SDK_INT;
    }

    /* renamed from: a */
    public static void m19888a(View view, PorterDuff.Mode mode) {
        int i = Build.VERSION.SDK_INT;
        view.setBackgroundTintMode(mode);
        int i2 = Build.VERSION.SDK_INT;
    }

    /* renamed from: a */
    public static void m19889a(View view, Rect rect) {
        int i = Build.VERSION.SDK_INT;
        view.setClipBounds(rect);
    }

    /* renamed from: a */
    public static void m19890a(View view, Drawable drawable) {
        int i = Build.VERSION.SDK_INT;
        view.setBackground(drawable);
    }

    /* renamed from: a */
    public static void m19891a(View view, Runnable runnable) {
        int i = Build.VERSION.SDK_INT;
        view.postOnAnimation(runnable);
    }

    /* renamed from: a */
    public static void m19892a(View view, Runnable runnable, long j) {
        int i = Build.VERSION.SDK_INT;
        view.postOnAnimationDelayed(runnable, j);
    }

    /* renamed from: a */
    public static void m19893a(View view, String str) {
        int i = Build.VERSION.SDK_INT;
        view.setTransitionName(str);
    }

    /* renamed from: a */
    public static void m19894a(View view, C1251oq oqVar) {
        View.AccessibilityDelegate accessibilityDelegate;
        if (oqVar == null && (m19878M(view) instanceof C1250op)) {
            oqVar = new C1251oq();
        }
        if (oqVar != null) {
            accessibilityDelegate = oqVar.f26819a;
        } else {
            accessibilityDelegate = null;
        }
        view.setAccessibilityDelegate(accessibilityDelegate);
    }

    /* renamed from: a */
    public static void m19895a(View view, C1270pi piVar) {
        int i = Build.VERSION.SDK_INT;
        if (piVar == null) {
            view.setOnApplyWindowInsetsListener(null);
        } else {
            view.setOnApplyWindowInsetsListener(new C1273pl(piVar));
        }
    }

    /* renamed from: a */
    public static void m19896a(View view, C1272pk pkVar) {
        int i = Build.VERSION.SDK_INT;
        view.setPointerIcon((PointerIcon) (pkVar != null ? pkVar.f26837a : null));
    }

    /* renamed from: a */
    public static void m19897a(View view, C1296qh qhVar, Rect rect) {
        int i = Build.VERSION.SDK_INT;
        WindowInsets l = qhVar.mo15746l();
        if (l != null) {
            C1296qh.m19996a(view.computeSystemWindowInsets(l, rect));
        } else {
            rect.setEmpty();
        }
    }

    /* renamed from: a */
    public static void m19898a(View view, C1298qj qjVar, C1314qz qzVar) {
        if (qzVar != null) {
            C1298qj qjVar2 = new C1298qj(null, qjVar.f26872m, null, qzVar, qjVar.f26873n);
            int i = Build.VERSION.SDK_INT;
            C1251oq c = m19908c(view);
            if (c == null) {
                c = new C1251oq();
            }
            m19894a(view, c);
            m19883a(qjVar2.mo15748a(), view);
            m19879N(view).add(qjVar2);
            m19926i(view, 0);
            return;
        }
        m19910c(view, qjVar.mo15748a());
    }

    /* renamed from: a */
    public static void m19899a(View view, C1301qm qmVar) {
        view.onInitializeAccessibilityNodeInfo(qmVar.f26877a);
    }

    /* renamed from: a */
    public static void m19900a(View view, boolean z) {
        int i = Build.VERSION.SDK_INT;
        view.setHasTransientState(z);
    }

    @Deprecated
    /* renamed from: a */
    public static boolean m19901a(View view, int i) {
        return view.canScrollVertically(i);
    }

    /* renamed from: a */
    public static boolean m19902a(View view, int i, Bundle bundle) {
        int i2 = Build.VERSION.SDK_INT;
        return view.performAccessibilityAction(i, bundle);
    }
}
