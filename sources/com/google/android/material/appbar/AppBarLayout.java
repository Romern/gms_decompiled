package com.google.android.material.appbar;

import android.animation.AnimatorInflater;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p001v4.view.AbsSavedState;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.felicanetworks.mfc.C0126R;
import com.google.android.cast.JGCastService;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AppBarLayout extends LinearLayout implements ail {

    /* renamed from: a */
    public boolean f150993a;

    /* renamed from: b */
    public int f150994b;

    /* renamed from: c */
    public C1296qh f150995c;

    /* renamed from: d */
    public boolean f150996d;

    /* renamed from: e */
    public boolean f150997e;

    /* renamed from: f */
    private int f150998f;

    /* renamed from: g */
    private int f150999g;

    /* renamed from: h */
    private int f151000h;

    /* renamed from: i */
    private int f151001i;

    /* renamed from: j */
    private List f151002j;

    /* renamed from: k */
    private boolean f151003k;

    /* renamed from: l */
    private boolean f151004l;

    /* renamed from: m */
    private int f151005m;

    /* renamed from: n */
    private WeakReference f151006n;

    /* renamed from: o */
    private ValueAnimator f151007o;

    /* renamed from: p */
    private int[] f151008p;

    /* renamed from: q */
    private Drawable f151009q;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class BaseBehavior extends bhef {

        /* renamed from: a */
        private int f151010a;

        /* renamed from: b */
        public int f151011b;

        /* renamed from: d */
        private ValueAnimator f151012d;

        /* renamed from: e */
        private int f151013e = -1;

        /* renamed from: f */
        private boolean f151014f;

        /* renamed from: g */
        private float f151015g;

        /* renamed from: h */
        private WeakReference f151016h;

        /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
        public class SavedState extends AbsSavedState {
            public static final Parcelable.Creator CREATOR = new bhdw();

            /* renamed from: c */
            int f151017c;

            /* renamed from: d */
            float f151018d;

            /* renamed from: e */
            boolean f151019e;

            public SavedState(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f151017c = parcel.readInt();
                this.f151018d = parcel.readFloat();
                this.f151019e = parcel.readByte() != 0;
            }

            public final void writeToParcel(Parcel parcel, int i) {
                super.writeToParcel(parcel, i);
                parcel.writeInt(this.f151017c);
                parcel.writeFloat(this.f151018d);
                parcel.writeByte(this.f151019e ? (byte) 1 : 0);
            }

            public SavedState(Parcelable parcelable) {
                super(parcelable);
            }
        }

        public BaseBehavior() {
        }

        /* renamed from: a */
        private static final View m117425a(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof C1265pd) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        /* renamed from: a */
        private static boolean m117430a(int i, int i2) {
            return (i & i2) == i2;
        }

        /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
         method: ps.c(android.view.View, int):void
         arg types: [androidx.coordinatorlayout.widget.CoordinatorLayout, int]
         candidates:
          ps.c(android.view.View, float):void
          ps.c(android.view.View, int):void */
        /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
         method: com.google.android.material.appbar.AppBarLayout.BaseBehavior.a(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, qj, boolean):void
         arg types: [androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, qj, int]
         candidates:
          com.google.android.material.appbar.AppBarLayout.BaseBehavior.a(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void
          aim.a(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void
          aim.a(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.graphics.Rect, boolean):boolean
          com.google.android.material.appbar.AppBarLayout.BaseBehavior.a(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, qj, boolean):void */
        /* renamed from: b */
        private final void m117431b(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            C1280ps.m19910c((View) coordinatorLayout, C1298qj.f26864e.mo15748a());
            C1280ps.m19910c((View) coordinatorLayout, C1298qj.f26865f.mo15748a());
            View a = m117425a(coordinatorLayout);
            if (a != null && appBarLayout.mo70975c() != 0 && (((aip) a.getLayoutParams()).f596a instanceof ScrollingViewBehavior)) {
                if (mo63588b() != (-appBarLayout.mo70975c()) && a.canScrollVertically(1)) {
                    m117429a(coordinatorLayout, appBarLayout, C1298qj.f26864e, false);
                }
                if (mo63588b() == 0) {
                    return;
                }
                if (a.canScrollVertically(-1)) {
                    int i = -appBarLayout.mo70978d();
                    if (i != 0) {
                        C1280ps.m19898a(coordinatorLayout, C1298qj.f26865f, new bhdu(this, coordinatorLayout, appBarLayout, a, i));
                        return;
                    }
                    return;
                }
                m117429a(coordinatorLayout, appBarLayout, C1298qj.f26865f, true);
            }
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ Parcelable mo781c(View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            android.view.AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
            int c = mo63602c();
            int childCount = appBarLayout.getChildCount();
            boolean z = false;
            for (int i = 0; i < childCount; i++) {
                View childAt = appBarLayout.getChildAt(i);
                int bottom = childAt.getBottom() + c;
                if (childAt.getTop() + c <= 0 && bottom >= 0) {
                    SavedState savedState = new SavedState(absSavedState);
                    savedState.f151017c = i;
                    if (bottom == C1280ps.m19930l(childAt) + appBarLayout.mo70983g()) {
                        z = true;
                    }
                    savedState.f151019e = z;
                    savedState.f151018d = ((float) bottom) / ((float) childAt.getHeight());
                    return savedState;
                }
            }
            return absSavedState;
        }

        /* renamed from: d */
        public final /* bridge */ /* synthetic */ int mo63593d(View view) {
            return ((AppBarLayout) view).mo70975c();
        }

        /* renamed from: e */
        public final /* bridge */ /* synthetic */ int mo63594e(View view) {
            return -((AppBarLayout) view).mo70981e();
        }

        /* renamed from: f */
        public final /* bridge */ /* synthetic */ boolean mo63595f(View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            WeakReference weakReference = this.f151016h;
            if (weakReference == null) {
                return true;
            }
            View view2 = (View) weakReference.get();
            if (view2 == null || !view2.isShown() || view2.canScrollVertically(-1)) {
                return false;
            }
            return true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: a */
        private final void m117426a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            int b = mo63588b();
            int childCount = appBarLayout.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    i = -1;
                    break;
                }
                View childAt = appBarLayout.getChildAt(i);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                bhdy bhdy = (bhdy) childAt.getLayoutParams();
                if (m117430a(bhdy.f118355a, 32)) {
                    top -= bhdy.topMargin;
                    bottom += bhdy.bottomMargin;
                }
                int i2 = -b;
                if (top <= i2 && bottom >= i2) {
                    break;
                }
                i++;
            }
            if (i >= 0) {
                View childAt2 = appBarLayout.getChildAt(i);
                bhdy bhdy2 = (bhdy) childAt2.getLayoutParams();
                int i3 = bhdy2.f118355a;
                if ((i3 & 17) == 17) {
                    int i4 = -childAt2.getTop();
                    int i5 = -childAt2.getBottom();
                    if (i == appBarLayout.getChildCount() - 1) {
                        i5 += appBarLayout.mo70983g();
                    }
                    if (m117430a(i3, 2)) {
                        i5 += C1280ps.m19930l(childAt2);
                    } else if (m117430a(i3, 5)) {
                        int l = C1280ps.m19930l(childAt2) + i5;
                        if (b >= l) {
                            i5 = l;
                        } else {
                            i4 = l;
                        }
                    }
                    if (m117430a(i3, 32)) {
                        i4 += bhdy2.topMargin;
                        i5 -= bhdy2.bottomMargin;
                    }
                    if (b < (i5 + i4) / 2) {
                        i4 = i5;
                    }
                    m117427a(coordinatorLayout, appBarLayout, C1183mc.m19626a(i4, -appBarLayout.mo70975c(), 0));
                }
            }
        }

        /* renamed from: b */
        public final int mo63588b() {
            return mo63602c() + this.f151011b;
        }

        /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
         method: com.google.android.material.appbar.AppBarLayout.BaseBehavior.a(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, int, int, boolean):void
         arg types: [androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, int, int, int]
         candidates:
          com.google.android.material.appbar.AppBarLayout.BaseBehavior.a(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, android.view.View, int, int[]):void
          com.google.android.material.appbar.AppBarLayout.BaseBehavior.a(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int, int, int):boolean
          aim.a(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int, int, int):boolean
          com.google.android.material.appbar.AppBarLayout.BaseBehavior.a(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, int, int, boolean):void */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x00a7  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x00a9  */
        /* renamed from: b */
        public final /* bridge */ /* synthetic */ int mo63589b(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            int i4;
            int i5;
            int i6;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int b = mo63588b();
            int i7 = 0;
            if (i2 != 0 && b >= i2 && b <= i3) {
                int a = C1183mc.m19626a(i, i2, i3);
                if (b != a) {
                    if (appBarLayout.f150993a) {
                        int abs = Math.abs(a);
                        int childCount = appBarLayout.getChildCount();
                        int i8 = 0;
                        while (true) {
                            if (i8 >= childCount) {
                                break;
                            }
                            View childAt = appBarLayout.getChildAt(i8);
                            bhdy bhdy = (bhdy) childAt.getLayoutParams();
                            Interpolator interpolator = bhdy.f118356b;
                            if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                                i8++;
                            } else if (interpolator != null) {
                                int i9 = bhdy.f118355a;
                                if ((i9 & 1) != 0) {
                                    i6 = childAt.getHeight() + bhdy.topMargin + bhdy.bottomMargin;
                                    if ((i9 & 2) != 0) {
                                        i6 -= C1280ps.m19930l(childAt);
                                    }
                                } else {
                                    i6 = 0;
                                }
                                if (C1280ps.m19938t(childAt)) {
                                    i6 -= appBarLayout.mo70983g();
                                }
                                if (i6 > 0) {
                                    float f = (float) i6;
                                    i4 = Integer.signum(a) * (childAt.getTop() + Math.round(f * interpolator.getInterpolation(((float) (abs - childAt.getTop())) / f)));
                                }
                            }
                        }
                        boolean a2 = mo63601a(i4);
                        int i10 = b - a;
                        this.f151011b = a - i4;
                        if (!a2 && appBarLayout.f150993a) {
                            coordinatorLayout.mo1871a(appBarLayout);
                        }
                        appBarLayout.mo70967a(mo63602c());
                        if (a >= b) {
                            i5 = -1;
                        } else {
                            i5 = 1;
                        }
                        m117428a(coordinatorLayout, appBarLayout, a, i5, false);
                        i7 = i10;
                    }
                    i4 = a;
                    boolean a22 = mo63601a(i4);
                    int i102 = b - a;
                    this.f151011b = a - i4;
                    coordinatorLayout.mo1871a(appBarLayout);
                    appBarLayout.mo70967a(mo63602c());
                    if (a >= b) {
                    }
                    m117428a(coordinatorLayout, appBarLayout, a, i5, false);
                    i7 = i102;
                }
            } else {
                this.f151011b = 0;
            }
            m117431b(coordinatorLayout, appBarLayout);
            return i7;
        }

        /* renamed from: a */
        private final void m117427a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            int i2;
            int abs = Math.abs(mo63588b() - i);
            float abs2 = Math.abs(0.0f);
            if (abs2 > 0.0f) {
                i2 = Math.round((((float) abs) / abs2) * 1000.0f) * 3;
            } else {
                i2 = (int) (((((float) abs) / ((float) appBarLayout.getHeight())) + 1.0f) * 150.0f);
            }
            int b = mo63588b();
            if (b == i) {
                ValueAnimator valueAnimator = this.f151012d;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f151012d.cancel();
                    return;
                }
                return;
            }
            ValueAnimator valueAnimator2 = this.f151012d;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f151012d = valueAnimator3;
                valueAnimator3.setInterpolator(bhdl.f118331e);
                this.f151012d.addUpdateListener(new bhdt(this, coordinatorLayout, appBarLayout));
            } else {
                valueAnimator2.cancel();
            }
            this.f151012d.setDuration((long) Math.min(i2, 600));
            this.f151012d.setIntValues(b, i);
            this.f151012d.start();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:21:0x005a, code lost:
            if ((-r8) >= ((r4.getBottom() - r1) - r7.mo70983g())) goto L_0x005e;
         */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0062  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x0071  */
        /* renamed from: a */
        private static final void m117428a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, boolean z) {
            View view;
            int abs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            int i3 = 0;
            int i4 = 0;
            while (true) {
                if (i4 >= childCount) {
                    view = null;
                    break;
                }
                view = appBarLayout.getChildAt(i4);
                if (abs >= view.getTop() && abs <= view.getBottom()) {
                    break;
                }
                i4++;
            }
            if (view != null) {
                int i5 = ((bhdy) view.getLayoutParams()).f118355a;
                boolean z2 = true;
                if ((i5 & 1) != 0) {
                    int l = C1280ps.m19930l(view);
                    if (i2 > 0 && (i5 & 12) != 0) {
                        if ((-i) < (view.getBottom() - l) - appBarLayout.mo70983g()) {
                            z2 = false;
                        }
                        if (appBarLayout.f150997e) {
                            z2 = appBarLayout.mo70971a(m117425a(coordinatorLayout));
                        }
                        boolean b = appBarLayout.mo70974b(z2);
                        if (!z) {
                            if (b) {
                                List b2 = coordinatorLayout.f1485e.mo796b(appBarLayout);
                                coordinatorLayout.f1486f.clear();
                                if (b2 != null) {
                                    coordinatorLayout.f1486f.addAll(b2);
                                }
                                List list = coordinatorLayout.f1486f;
                                int size = list.size();
                                while (i3 < size) {
                                    aim aim = ((aip) ((View) list.get(i3)).getLayoutParams()).f596a;
                                    if (!(aim instanceof ScrollingViewBehavior)) {
                                        i3++;
                                    } else if (((ScrollingViewBehavior) aim).f118375d == 0) {
                                        return;
                                    }
                                }
                                return;
                            }
                            return;
                        }
                        appBarLayout.jumpDrawablesToCurrentState();
                    } else if ((i5 & 2) != 0) {
                    }
                }
                z2 = false;
                if (appBarLayout.f150997e) {
                }
                boolean b3 = appBarLayout.mo70974b(z2);
                if (!z) {
                }
                appBarLayout.jumpDrawablesToCurrentState();
            }
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo63590b(CoordinatorLayout coordinatorLayout, View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            m117426a(coordinatorLayout, appBarLayout);
            if (appBarLayout.f150997e) {
                appBarLayout.mo70974b(appBarLayout.mo70971a(m117425a(coordinatorLayout)));
            }
        }

        /* renamed from: a */
        private static final void m117429a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, C1298qj qjVar, boolean z) {
            C1280ps.m19898a(coordinatorLayout, qjVar, new bhdv(appBarLayout, z));
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo765a(View view, Parcelable parcelable) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (parcelable instanceof SavedState) {
                SavedState savedState = (SavedState) parcelable;
                this.f151013e = savedState.f151017c;
                this.f151015g = savedState.f151018d;
                this.f151014f = savedState.f151019e;
                return;
            }
            this.f151013e = -1;
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo767a(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i3 < 0) {
                iArr[1] = mo63592c(coordinatorLayout, appBarLayout, i3, -appBarLayout.mo70981e(), 0);
            }
            if (i3 == 0) {
                m117431b(coordinatorLayout, appBarLayout);
            }
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo768a(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.f151010a == 0 || i == 1) {
                m117426a(coordinatorLayout, appBarLayout);
                if (appBarLayout.f150997e) {
                    appBarLayout.mo70974b(appBarLayout.mo70971a(view2));
                }
            }
            this.f151016h = new WeakReference(view2);
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo769a(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int[] iArr, int i2) {
            mo70996a(coordinatorLayout, (AppBarLayout) view, view2, i, iArr);
        }

        /* renamed from: a */
        public final void mo70996a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int[] iArr) {
            int i2;
            int i3;
            if (i != 0) {
                if (i < 0) {
                    int i4 = -appBarLayout.mo70975c();
                    i3 = i4;
                    i2 = appBarLayout.mo70978d() + i4;
                } else {
                    i3 = -appBarLayout.mo70975c();
                    i2 = 0;
                }
                if (i3 != i2) {
                    iArr[1] = mo63592c(coordinatorLayout, appBarLayout, i, i3, i2);
                }
            }
            if (appBarLayout.f150997e) {
                appBarLayout.mo70974b(appBarLayout.mo70971a(view));
            }
        }

        /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
         method: bhei.a(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int):boolean
         arg types: [androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, int]
         candidates:
          com.google.android.material.appbar.AppBarLayout.BaseBehavior.a(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, int):void
          bhef.a(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean
          aim.a(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean
          aim.a(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View):boolean
          bhei.a(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int):boolean */
        /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
         method: com.google.android.material.appbar.AppBarLayout.BaseBehavior.a(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, int, int, boolean):void
         arg types: [androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, int, int, int]
         candidates:
          com.google.android.material.appbar.AppBarLayout.BaseBehavior.a(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, android.view.View, int, int[]):void
          com.google.android.material.appbar.AppBarLayout.BaseBehavior.a(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int, int, int):boolean
          aim.a(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int, int, int):boolean
          com.google.android.material.appbar.AppBarLayout.BaseBehavior.a(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, int, int, boolean):void */
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ boolean mo773a(CoordinatorLayout coordinatorLayout, View view, int i) {
            int i2;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            boolean a = super.mo773a(coordinatorLayout, (View) appBarLayout, i);
            int i3 = appBarLayout.f150994b;
            int i4 = this.f151013e;
            if (i4 >= 0 && (i3 & 8) == 0) {
                View childAt = appBarLayout.getChildAt(i4);
                int i5 = -childAt.getBottom();
                if (this.f151014f) {
                    i2 = i5 + C1280ps.m19930l(childAt) + appBarLayout.mo70983g();
                } else {
                    i2 = i5 + Math.round(((float) childAt.getHeight()) * this.f151015g);
                }
                mo63591b(coordinatorLayout, appBarLayout, i2);
            } else if (i3 != 0) {
                int i6 = i3 & 4;
                if ((i3 & 2) != 0) {
                    int i7 = -appBarLayout.mo70975c();
                    if (i6 != 0) {
                        m117427a(coordinatorLayout, appBarLayout, i7);
                    } else {
                        mo63591b(coordinatorLayout, appBarLayout, i7);
                    }
                } else if ((i3 & 1) != 0) {
                    if (i6 == 0) {
                        mo63591b(coordinatorLayout, appBarLayout, 0);
                    } else {
                        m117427a(coordinatorLayout, appBarLayout, 0);
                    }
                }
            }
            appBarLayout.f150994b = 0;
            this.f151013e = -1;
            mo63601a(C1183mc.m19626a(mo63602c(), -appBarLayout.mo70975c(), 0));
            m117428a(coordinatorLayout, appBarLayout, mo63602c(), 0, true);
            appBarLayout.mo70967a(mo63602c());
            m117431b(coordinatorLayout, appBarLayout);
            return a;
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ boolean mo774a(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((aip) appBarLayout.getLayoutParams()).height != -2) {
                return false;
            }
            coordinatorLayout.mo1872a(appBarLayout, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0));
            return true;
        }

        /* renamed from: a */
        public boolean mo778a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i, int i2) {
            ValueAnimator valueAnimator;
            int i3 = i & 2;
            boolean z = true;
            if (i3 != 0) {
                if (!appBarLayout.f150997e) {
                    if (appBarLayout.mo70975c() != 0) {
                        if (coordinatorLayout.getHeight() - view.getHeight() > appBarLayout.getHeight()) {
                            z = false;
                        }
                    }
                }
                if (z && (valueAnimator = this.f151012d) != null) {
                    valueAnimator.cancel();
                }
                this.f151016h = null;
                this.f151010a = i2;
                return z;
            }
            z = false;
            valueAnimator.cancel();
            this.f151016h = null;
            this.f151010a = i2;
            return z;
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class Behavior extends BaseBehavior {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class ScrollingViewBehavior extends bheg {
        public ScrollingViewBehavior() {
        }

        /* renamed from: b */
        static final AppBarLayout m117448b(List list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = (View) list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ View mo63596a(List list) {
            return m117448b(list);
        }

        /* renamed from: d */
        public final float mo63598d(View view) {
            int i;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int c = appBarLayout.mo70975c();
                int d = appBarLayout.mo70978d();
                aim aim = ((aip) appBarLayout.getLayoutParams()).f596a;
                int b = aim instanceof BaseBehavior ? ((BaseBehavior) aim).mo63588b() : 0;
                if ((d == 0 || c + b > d) && (i = c - d) != 0) {
                    return (((float) b) / ((float) i)) + 1.0f;
                }
            }
            return 0.0f;
        }

        /* renamed from: e */
        public final int mo63599e(View view) {
            if (view instanceof AppBarLayout) {
                return ((AppBarLayout) view).mo70975c();
            }
            return view.getMeasuredHeight();
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bheh.f118380e);
            this.f118375d = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            obtainStyledAttributes.recycle();
        }

        /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
         method: ps.c(android.view.View, int):void
         arg types: [androidx.coordinatorlayout.widget.CoordinatorLayout, int]
         candidates:
          ps.c(android.view.View, float):void
          ps.c(android.view.View, int):void */
        /* renamed from: a */
        public final void mo766a(CoordinatorLayout coordinatorLayout, View view) {
            if (view instanceof AppBarLayout) {
                C1280ps.m19910c((View) coordinatorLayout, C1298qj.f26864e.mo15748a());
                C1280ps.m19910c((View) coordinatorLayout, C1298qj.f26865f.mo15748a());
            }
        }

        /* renamed from: a */
        public final boolean mo772a(View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ boolean mo774a(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            View a;
            int i4;
            C1296qh qhVar;
            int i5 = view.getLayoutParams().height;
            if ((i5 != -1 && i5 != -2) || (a = mo63596a(coordinatorLayout.mo1875b(view))) == null) {
                return false;
            }
            int size = View.MeasureSpec.getSize(i3);
            if (size <= 0) {
                size = coordinatorLayout.getHeight();
            } else if (C1280ps.m19938t(a) && (qhVar = coordinatorLayout.f1487g) != null) {
                size += qhVar.mo15733b() + qhVar.mo15736d();
            }
            int e = size + mo63599e(a);
            int measuredHeight = a.getMeasuredHeight();
            if (mo60440b()) {
                view.setTranslationY((float) (-measuredHeight));
            } else {
                e -= measuredHeight;
            }
            if (i5 == -1) {
                i4 = JGCastService.FLAG_PRIVATE_DISPLAY;
            } else {
                i4 = Integer.MIN_VALUE;
            }
            coordinatorLayout.mo1872a(view, i, i2, View.MeasureSpec.makeMeasureSpec(e, i4));
            return true;
        }

        /* renamed from: a */
        public final boolean mo775a(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout b = m117448b(coordinatorLayout.mo1875b(view));
            if (b != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = ((bheg) this).f118372a;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    b.mo70970a(false, !z);
                    return true;
                }
            }
            return false;
        }

        /* renamed from: a */
        public boolean mo777a(CoordinatorLayout coordinatorLayout, View view, View view2) {
            aim aim = ((aip) view2.getLayoutParams()).f596a;
            if (aim instanceof BaseBehavior) {
                C1280ps.m19922g(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) aim).f151011b) + this.f118374c) - mo63600f(view2));
            }
            if (!(view2 instanceof AppBarLayout)) {
                return false;
            }
            AppBarLayout appBarLayout = (AppBarLayout) view2;
            if (!appBarLayout.f150997e) {
                return false;
            }
            appBarLayout.mo70974b(appBarLayout.mo70971a(view));
            return false;
        }
    }

    public AppBarLayout(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    protected static final bhdy m117403a(ViewGroup.LayoutParams layoutParams) {
        int i = Build.VERSION.SDK_INT;
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return new bhdy((LinearLayout.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new bhdy((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new bhdy(layoutParams);
    }

    /* renamed from: h */
    protected static final bhdy m117405h() {
        return new bhdy();
    }

    /* renamed from: i */
    private final boolean m117406i() {
        return this.f151009q != null && mo70983g() > 0;
    }

    /* renamed from: j */
    private final void m117407j() {
        this.f150999g = -1;
        this.f151000h = -1;
        this.f151001i = -1;
    }

    /* renamed from: k */
    private final boolean m117408k() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            return childAt.getVisibility() != 8 && !C1280ps.m19938t(childAt);
        }
    }

    /* renamed from: b */
    public final void mo70972b() {
        setWillNotDraw(!m117406i());
    }

    /* renamed from: c */
    public final int mo70975c() {
        int i = this.f150999g;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            bhdy bhdy = (bhdy) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = bhdy.f118355a;
            if ((i4 & 1) == 0) {
                break;
            }
            i3 += measuredHeight + bhdy.topMargin + bhdy.bottomMargin;
            if (i2 == 0 && C1280ps.m19938t(childAt)) {
                i3 -= mo70983g();
            }
            if ((i4 & 2) != 0) {
                i3 -= C1280ps.m19930l(childAt);
                break;
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.f150999g = max;
        return max;
    }

    /* access modifiers changed from: protected */
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof bhdy;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final int mo70978d() {
        int i;
        int i2 = this.f151000h;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            bhdy bhdy = (bhdy) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = bhdy.f118355a;
            if ((i4 & 5) == 5) {
                int i5 = bhdy.topMargin + bhdy.bottomMargin;
                if ((i4 & 8) != 0) {
                    i = i5 + C1280ps.m19930l(childAt);
                } else {
                    i = (i4 & 2) != 0 ? i5 + (measuredHeight - C1280ps.m19930l(childAt)) : i5 + measuredHeight;
                }
                if (childCount == 0 && C1280ps.m19938t(childAt)) {
                    i = Math.min(i, measuredHeight - mo70983g());
                }
                i3 += i;
            } else if (i3 > 0) {
                break;
            }
        }
        int max = Math.max(0, i3);
        this.f151000h = max;
        return max;
    }

    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (m117406i()) {
            int save = canvas.save();
            canvas.translate(0.0f, (float) (-this.f150998f));
            this.f151009q.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    /* access modifiers changed from: protected */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f151009q;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final int mo70981e() {
        int i = this.f151001i;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            bhdy bhdy = (bhdy) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + bhdy.topMargin + bhdy.bottomMargin;
            int i4 = bhdy.f118355a;
            if ((i4 & 1) == 0) {
                break;
            }
            i3 += measuredHeight;
            if ((i4 & 2) != 0) {
                i3 -= C1280ps.m19930l(childAt);
                break;
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.f151001i = max;
        return max;
    }

    /* renamed from: f */
    public final int mo70982f() {
        int g = mo70983g();
        int l = C1280ps.m19930l(this);
        if (l == 0) {
            int childCount = getChildCount();
            if (childCount > 0) {
                l = C1280ps.m19930l(getChildAt(childCount - 1));
            } else {
                l = 0;
            }
            if (l == 0) {
                return getHeight() / 3;
            }
        }
        return l + l + g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final int mo70983g() {
        C1296qh qhVar = this.f150995c;
        if (qhVar != null) {
            return qhVar.mo15733b();
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        bhls.m101141a(this);
    }

    /* access modifiers changed from: protected */
    public final int[] onCreateDrawableState(int i) {
        int i2;
        int i3;
        if (this.f151008p == null) {
            this.f151008p = new int[4];
        }
        int[] iArr = this.f151008p;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        boolean z = this.f151003k;
        if (!z) {
            i2 = -2130970268;
        } else {
            i2 = C0126R.attr.state_liftable;
        }
        iArr[0] = i2;
        int i4 = -2130970269;
        if (z && this.f151004l) {
            i4 = C0126R.attr.state_lifted;
        }
        iArr[1] = i4;
        if (!z) {
            i3 = -2130970266;
        } else {
            i3 = C0126R.attr.state_collapsible;
        }
        iArr[2] = i3;
        int i5 = -2130970265;
        if (z && this.f151004l) {
            i5 = C0126R.attr.state_collapsed;
        }
        iArr[3] = i5;
        return mergeDrawableStates(onCreateDrawableState, iArr);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference weakReference = this.f151006n;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f151006n = null;
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (C1280ps.m19938t(this) && m117408k()) {
            int g = mo70983g();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                C1280ps.m19922g(getChildAt(childCount), g);
            }
        }
        m117407j();
        boolean z2 = false;
        this.f150993a = false;
        int childCount2 = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 < childCount2) {
                if (((bhdy) getChildAt(i5).getLayoutParams()).f118356b != null) {
                    this.f150993a = true;
                    break;
                }
                i5++;
            } else {
                break;
            }
        }
        Drawable drawable = this.f151009q;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), mo70983g());
        }
        if (!this.f150996d) {
            if (!this.f150997e) {
                int childCount3 = getChildCount();
                int i6 = 0;
                while (true) {
                    if (i6 >= childCount3) {
                        break;
                    }
                    int i7 = ((bhdy) getChildAt(i6).getLayoutParams()).f118355a;
                    if ((i7 & 1) == 1 && (i7 & 10) != 0) {
                        z2 = true;
                        break;
                    }
                    i6++;
                }
            } else {
                z2 = true;
            }
            mo70976c(z2);
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824 && C1280ps.m19938t(this) && m117408k()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = C1183mc.m19626a(getMeasuredHeight() + mo70983g(), 0, View.MeasureSpec.getSize(i2));
            } else if (mode == 0) {
                measuredHeight += mo70983g();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        m117407j();
    }

    public final void setElevation(float f) {
        super.setElevation(f);
        bhls.m101142a(this, f);
    }

    public final void setOrientation(int i) {
        if (i == 1) {
            super.setOrientation(1);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    public final void setVisibility(int i) {
        boolean z;
        super.setVisibility(i);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        Drawable drawable = this.f151009q;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    /* access modifiers changed from: protected */
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f151009q;
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0126R.attr.appBarLayoutStyle);
    }

    /* renamed from: b */
    public final void mo70973b(bhdx bhdx) {
        List list = this.f151002j;
        if (list != null && bhdx != null) {
            list.remove(bhdx);
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppBarLayout(Context context, AttributeSet attributeSet, int i) {
        super(bhpq.m101285a(context, attributeSet, i, 2132019304), attributeSet, i);
        this.f150999g = -1;
        this.f151000h = -1;
        this.f151001i = -1;
        this.f150994b = 0;
        Context context2 = getContext();
        boolean z = true;
        setOrientation(1);
        int i2 = Build.VERSION.SDK_INT;
        int[] iArr = bhek.f118387a;
        setOutlineProvider(ViewOutlineProvider.BOUNDS);
        Context context3 = getContext();
        TypedArray a = bhki.m101052a(context3, attributeSet, bhek.f118387a, i, 2132019304, new int[0]);
        try {
            if (a.hasValue(0)) {
                setStateListAnimator(AnimatorInflater.loadStateListAnimator(context3, a.getResourceId(0, 0)));
            }
            a.recycle();
            TypedArray a2 = bhki.m101052a(context2, attributeSet, bheh.f118376a, i, 2132019304, new int[0]);
            C1280ps.m19890a(this, a2.getDrawable(0));
            if (getBackground() instanceof ColorDrawable) {
                bhlr bhlr = new bhlr();
                bhlr.mo63948c(ColorStateList.valueOf(((ColorDrawable) getBackground()).getColor()));
                bhlr.mo63942a(context2);
                C1280ps.m19890a(this, bhlr);
            }
            if (a2.hasValue(4)) {
                m117404a(a2.getBoolean(4, false), false, false);
            }
            int i3 = Build.VERSION.SDK_INT;
            if (a2.hasValue(3)) {
                bhek.m100715a(this, (float) a2.getDimensionPixelSize(3, 0));
            }
            int i4 = Build.VERSION.SDK_INT;
            if (a2.hasValue(2)) {
                setKeyboardNavigationCluster(a2.getBoolean(2, false));
            }
            if (a2.hasValue(1)) {
                setTouchscreenBlocksFocus(a2.getBoolean(1, false));
            }
            this.f150997e = a2.getBoolean(5, false);
            this.f151005m = a2.getResourceId(6, -1);
            Drawable drawable = a2.getDrawable(7);
            Drawable drawable2 = this.f151009q;
            if (drawable2 != drawable) {
                Drawable drawable3 = null;
                if (drawable2 != null) {
                    drawable2.setCallback(null);
                }
                drawable3 = drawable != null ? drawable.mutate() : drawable3;
                this.f151009q = drawable3;
                if (drawable3 != null) {
                    if (drawable3.isStateful()) {
                        this.f151009q.setState(getDrawableState());
                    }
                    C1173lt.m19608b(this.f151009q, C1280ps.m19923h(this));
                    this.f151009q.setVisible(getVisibility() != 0 ? false : z, false);
                    this.f151009q.setCallback(this);
                }
                mo70972b();
                C1280ps.m19915e(this);
            }
            a2.recycle();
            C1280ps.m19895a(this, new bhdr(this));
        } catch (Throwable th) {
            a.recycle();
            throw th;
        }
    }

    /* renamed from: b */
    public final boolean mo70974b(boolean z) {
        float f;
        if (this.f151004l == z) {
            return false;
        }
        this.f151004l = z;
        refreshDrawableState();
        if (this.f150997e && (getBackground() instanceof bhlr)) {
            bhlr bhlr = (bhlr) getBackground();
            float dimension = getResources().getDimension(C0126R.dimen.design_appbar_elevation);
            if (!z) {
                f = dimension;
            } else {
                f = 0.0f;
            }
            if (!z) {
                dimension = 0.0f;
            }
            ValueAnimator valueAnimator = this.f151007o;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f, dimension);
            this.f151007o = ofFloat;
            ofFloat.setDuration((long) getResources().getInteger(C0126R.integer.app_bar_elevation_anim_duration));
            this.f151007o.setInterpolator(bhdl.f118327a);
            this.f151007o.addUpdateListener(new bhds(bhlr));
            this.f151007o.start();
        }
        return true;
    }

    /* renamed from: a */
    private final void m117404a(boolean z, boolean z2, boolean z3) {
        int i = 0;
        int i2 = (!z ? 2 : 1) | (!z2 ? 0 : 4);
        if (z3) {
            i = 8;
        }
        this.f150994b = i2 | i;
        requestLayout();
    }

    /* renamed from: a */
    public final aim mo762a() {
        return new Behavior();
    }

    /* renamed from: a */
    public final bhdy generateLayoutParams(AttributeSet attributeSet) {
        return new bhdy(getContext(), attributeSet);
    }

    /* renamed from: c */
    public final void mo70976c(boolean z) {
        if (this.f151003k != z) {
            this.f151003k = z;
            refreshDrawableState();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo70967a(int i) {
        this.f150998f = i;
        if (!willNotDraw()) {
            C1280ps.m19915e(this);
        }
        List list = this.f151002j;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                bhdx bhdx = (bhdx) this.f151002j.get(i2);
                if (bhdx != null) {
                    bhdx.mo10589a(this, i);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo70968a(bhdx bhdx) {
        if (this.f151002j == null) {
            this.f151002j = new ArrayList();
        }
        if (bhdx != null && !this.f151002j.contains(bhdx)) {
            this.f151002j.add(bhdx);
        }
    }

    /* renamed from: a */
    public final void mo70969a(boolean z) {
        mo70970a(z, C1280ps.m19868C(this));
    }

    /* renamed from: a */
    public final void mo70970a(boolean z, boolean z2) {
        m117404a(z, z2, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo70971a(View view) {
        int i;
        View view2;
        View view3 = null;
        if (this.f151006n == null && (i = this.f151005m) != -1) {
            if (view != null) {
                view2 = view.findViewById(i);
            } else {
                view2 = null;
            }
            if (view2 == null && (getParent() instanceof ViewGroup)) {
                view2 = ((ViewGroup) getParent()).findViewById(this.f151005m);
            }
            if (view2 != null) {
                this.f151006n = new WeakReference(view2);
            }
        }
        WeakReference weakReference = this.f151006n;
        if (weakReference != null) {
            view3 = (View) weakReference.get();
        }
        if (view3 != null) {
            view = view3;
        }
        if (view == null || (!view.canScrollVertically(-1) && view.getScrollY() <= 0)) {
            return false;
        }
        return true;
    }
}
