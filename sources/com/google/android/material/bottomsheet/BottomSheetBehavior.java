package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p001v4.view.AbsSavedState;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.felicanetworks.mfc.C0126R;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BottomSheetBehavior extends aim {

    /* renamed from: A */
    private bhlx f151075A;

    /* renamed from: B */
    private boolean f151076B;

    /* renamed from: C */
    private bhfl f151077C = null;

    /* renamed from: D */
    private ValueAnimator f151078D;

    /* renamed from: E */
    private boolean f151079E;

    /* renamed from: F */
    private int f151080F;

    /* renamed from: G */
    private boolean f151081G;

    /* renamed from: H */
    private final ArrayList f151082H = new ArrayList();

    /* renamed from: I */
    private VelocityTracker f151083I;

    /* renamed from: J */
    private int f151084J;

    /* renamed from: K */
    private Map f151085K;

    /* renamed from: L */
    private final C1337rv f151086L = new bhfh(this);

    /* renamed from: a */
    public boolean f151087a = true;

    /* renamed from: b */
    public int f151088b;

    /* renamed from: c */
    public bhlr f151089c;

    /* renamed from: d */
    public int f151090d;

    /* renamed from: e */
    public int f151091e;

    /* renamed from: f */
    public int f151092f;

    /* renamed from: g */
    float f151093g = 0.5f;

    /* renamed from: h */
    public int f151094h;

    /* renamed from: i */
    float f151095i = -1.0f;

    /* renamed from: j */
    public boolean f151096j;

    /* renamed from: k */
    public boolean f151097k;

    /* renamed from: l */
    public boolean f151098l = true;

    /* renamed from: m */
    public int f151099m = 4;

    /* renamed from: n */
    public C1338rw f151100n;

    /* renamed from: o */
    int f151101o;

    /* renamed from: p */
    public int f151102p;

    /* renamed from: q */
    public WeakReference f151103q;

    /* renamed from: r */
    public WeakReference f151104r;

    /* renamed from: s */
    public int f151105s;

    /* renamed from: t */
    public boolean f151106t;

    /* renamed from: u */
    private int f151107u = 0;

    /* renamed from: v */
    private float f151108v;

    /* renamed from: w */
    private boolean f151109w;

    /* renamed from: x */
    private int f151110x;

    /* renamed from: y */
    private boolean f151111y;

    /* renamed from: z */
    private boolean f151112z;

    public BottomSheetBehavior() {
    }

    /* renamed from: a */
    private final void m117476a(Context context, AttributeSet attributeSet, boolean z, ColorStateList colorStateList) {
        if (this.f151111y) {
            this.f151075A = bhlx.m101158a(context, attributeSet, (int) C0126R.attr.bottomSheetStyle, 2132019306).mo63972a();
            bhlr bhlr = new bhlr(this.f151075A);
            this.f151089c = bhlr;
            bhlr.mo63942a(context);
            if (z && colorStateList != null) {
                this.f151089c.mo63948c(colorStateList);
                return;
            }
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(16842801, typedValue, true);
            this.f151089c.setTint(typedValue.data);
        }
    }

    /* renamed from: c */
    private final void m117478c(boolean z) {
        WeakReference weakReference = this.f151103q;
        if (weakReference != null) {
            ViewParent parent = ((View) weakReference.get()).getParent();
            if (parent instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                int childCount = coordinatorLayout.getChildCount();
                int i = Build.VERSION.SDK_INT;
                if (z) {
                    if (this.f151085K == null) {
                        this.f151085K = new HashMap(childCount);
                    } else {
                        return;
                    }
                }
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = coordinatorLayout.getChildAt(i2);
                    if (childAt != this.f151103q.get() && z) {
                        int i3 = Build.VERSION.SDK_INT;
                        this.f151085K.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    }
                }
                if (!z) {
                    this.f151085K = null;
                }
            }
        }
    }

    /* renamed from: d */
    private final int m117479d() {
        return this.f151109w ? Math.max(this.f151110x, this.f151102p - ((this.f151101o * 9) / 16)) : this.f151088b;
    }

    /* renamed from: e */
    public static BottomSheetBehavior m117480e(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof aip) {
            aim aim = ((aip) layoutParams).f596a;
            if (aim instanceof BottomSheetBehavior) {
                return (BottomSheetBehavior) aim;
            }
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    /* renamed from: f */
    private final void m117482f() {
        this.f151092f = (int) (((float) this.f151102p) * (1.0f - this.f151093g));
    }

    /* renamed from: g */
    private final void m117484g() {
        this.f151105s = -1;
        VelocityTracker velocityTracker = this.f151083I;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f151083I = null;
        }
    }

    /* renamed from: h */
    private final void m117486h() {
        View view;
        WeakReference weakReference = this.f151103q;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            C1280ps.m19910c(view, (int) AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS);
            C1280ps.m19910c(view, (int) AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE);
            C1280ps.m19910c(view, 1048576);
            if (this.f151096j && this.f151099m != 5) {
                m117477a(view, C1298qj.f26868i, 5);
            }
            int i = this.f151099m;
            int i2 = 6;
            if (i == 3) {
                if (this.f151087a) {
                    i2 = 4;
                }
                m117477a(view, C1298qj.f26867h, i2);
            } else if (i == 4) {
                if (this.f151087a) {
                    i2 = 3;
                }
                m117477a(view, C1298qj.f26866g, i2);
            } else if (i == 6) {
                m117477a(view, C1298qj.f26867h, 4);
                m117477a(view, C1298qj.f26866g, 3);
            }
        }
    }

    /* renamed from: a */
    public final void mo763a() {
        this.f151103q = null;
        this.f151100n = null;
    }

    /* renamed from: a */
    public final void mo764a(aip aip) {
        this.f151103q = null;
        this.f151100n = null;
    }

    /* renamed from: a */
    public final void mo767a(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
    }

    /* renamed from: a */
    public final boolean mo778a(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        this.f151080F = 0;
        this.f151081G = false;
        return (i & 2) != 0;
    }

    /* renamed from: b */
    public final int mo71032b() {
        if (!this.f151109w) {
            return this.f151088b;
        }
        return -1;
    }

    /* renamed from: c */
    public final int mo71036c() {
        return !this.f151087a ? this.f151090d : this.f151091e;
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR = new bhfk();

        /* renamed from: c */
        final int f151113c;

        /* renamed from: d */
        int f151114d;

        /* renamed from: e */
        boolean f151115e;

        /* renamed from: f */
        boolean f151116f;

        /* renamed from: g */
        boolean f151117g;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f151113c = parcel.readInt();
            this.f151114d = parcel.readInt();
            boolean z = false;
            this.f151115e = parcel.readInt() == 1;
            this.f151116f = parcel.readInt() == 1;
            this.f151117g = parcel.readInt() == 1 ? true : z;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f151113c);
            parcel.writeInt(this.f151114d);
            parcel.writeInt(this.f151115e ? 1 : 0);
            parcel.writeInt(this.f151116f ? 1 : 0);
            parcel.writeInt(this.f151117g ? 1 : 0);
        }

        public SavedState(Parcelable parcelable, BottomSheetBehavior bottomSheetBehavior) {
            super(parcelable);
            this.f151113c = bottomSheetBehavior.f151099m;
            this.f151114d = bottomSheetBehavior.f151088b;
            this.f151115e = bottomSheetBehavior.f151087a;
            this.f151116f = bottomSheetBehavior.f151096j;
            this.f151117g = bottomSheetBehavior.f151097k;
        }
    }

    /* renamed from: f */
    private final void m117483f(int i) {
        View view = (View) this.f151103q.get();
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent == null || !parent.isLayoutRequested() || !C1280ps.m19871F(view)) {
                mo71027a(view, i);
            } else {
                view.post(new bhff(this, view, i));
            }
        }
    }

    /* renamed from: g */
    private final void m117485g(int i) {
        boolean z;
        ValueAnimator valueAnimator;
        float f;
        if (i != 2) {
            if (i == 3) {
                z = true;
            } else {
                z = false;
            }
            if (this.f151076B != z) {
                this.f151076B = z;
                if (this.f151089c != null && (valueAnimator = this.f151078D) != null) {
                    if (!valueAnimator.isRunning()) {
                        if (i == 3) {
                            f = 0.0f;
                        } else {
                            f = 1.0f;
                        }
                        this.f151078D.setFloatValues(1.0f - f, f);
                        this.f151078D.start();
                        return;
                    }
                    this.f151078D.reverse();
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo71033b(int i) {
        if (i >= 0) {
            this.f151090d = i;
            return;
        }
        throw new IllegalArgumentException("offset must be greater than or equal to 0");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final View mo71038d(View view) {
        if (C1280ps.m19944z(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View d = mo71038d(viewGroup.getChildAt(i));
                if (d != null) {
                    return d;
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public final void mo71034b(bhfj bhfj) {
        if (!this.f151082H.contains(bhfj)) {
            this.f151082H.add(bhfj);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.material.bottomsheet.BottomSheetBehavior.a(android.content.Context, android.util.AttributeSet, boolean, android.content.res.ColorStateList):void
     arg types: [android.content.Context, android.util.AttributeSet, int, android.content.res.ColorStateList]
     candidates:
      com.google.android.material.bottomsheet.BottomSheetBehavior.a(android.view.View, int, int, boolean):void
      com.google.android.material.bottomsheet.BottomSheetBehavior.a(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void
      aim.a(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void
      aim.a(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.graphics.Rect, boolean):boolean
      com.google.android.material.bottomsheet.BottomSheetBehavior.a(android.content.Context, android.util.AttributeSet, boolean, android.content.res.ColorStateList):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.material.bottomsheet.BottomSheetBehavior.a(android.content.Context, android.util.AttributeSet, boolean, android.content.res.ColorStateList):void
     arg types: [android.content.Context, android.util.AttributeSet, int, ?[OBJECT, ARRAY]]
     candidates:
      com.google.android.material.bottomsheet.BottomSheetBehavior.a(android.view.View, int, int, boolean):void
      com.google.android.material.bottomsheet.BottomSheetBehavior.a(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void
      aim.a(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void
      aim.a(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.graphics.Rect, boolean):boolean
      com.google.android.material.bottomsheet.BottomSheetBehavior.a(android.content.Context, android.util.AttributeSet, boolean, android.content.res.ColorStateList):void */
    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bhfs.f118485a);
        this.f151111y = obtainStyledAttributes.hasValue(11);
        if (obtainStyledAttributes.hasValue(1)) {
            m117476a(context, attributeSet, true, bhky.m101077a(context, obtainStyledAttributes, 1));
        } else {
            m117476a(context, attributeSet, false, (ColorStateList) null);
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f151078D = ofFloat;
        ofFloat.setDuration(500L);
        this.f151078D.addUpdateListener(new bhfg(this));
        int i = Build.VERSION.SDK_INT;
        this.f151095i = obtainStyledAttributes.getDimension(0, -1.0f);
        TypedValue peekValue = obtainStyledAttributes.peekValue(7);
        if (peekValue == null || peekValue.data != -1) {
            mo71025a(obtainStyledAttributes.getDimensionPixelSize(7, -1));
        } else {
            mo71025a(peekValue.data);
        }
        mo71035b(obtainStyledAttributes.getBoolean(6, false));
        this.f151112z = obtainStyledAttributes.getBoolean(10, false);
        mo71030a(obtainStyledAttributes.getBoolean(4, true));
        this.f151097k = obtainStyledAttributes.getBoolean(9, false);
        this.f151098l = obtainStyledAttributes.getBoolean(2, true);
        this.f151107u = obtainStyledAttributes.getInt(8, 0);
        mo71024a(obtainStyledAttributes.getFloat(5, 0.5f));
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(3);
        if (peekValue2 == null || peekValue2.type != 16) {
            mo71033b(obtainStyledAttributes.getDimensionPixelOffset(3, 0));
        } else {
            mo71033b(peekValue2.data);
        }
        obtainStyledAttributes.recycle();
        this.f151108v = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    /* renamed from: b */
    public final void mo71035b(boolean z) {
        if (this.f151096j != z) {
            this.f151096j = z;
            if (!z && this.f151099m == 5) {
                mo71037c(4);
            }
            m117486h();
        }
    }

    /* renamed from: d */
    public final void mo71039d(int i) {
        if (this.f151099m != i) {
            this.f151099m = i;
            WeakReference weakReference = this.f151103q;
            if (weakReference != null && ((View) weakReference.get()) != null) {
                if (i == 3) {
                    m117478c(true);
                } else if (i == 6 || i == 5 || i == 4) {
                    m117478c(false);
                }
                m117485g(i);
                for (int i2 = 0; i2 < this.f151082H.size(); i2++) {
                    ((bhfj) this.f151082H.get(i2)).mo12434a(i);
                }
                m117486h();
            }
        }
    }

    /* renamed from: a */
    private final void m117477a(View view, C1298qj qjVar, int i) {
        C1280ps.m19898a(view, qjVar, new bhfi(this, i));
    }

    /* renamed from: e */
    private final void m117481e() {
        int d = m117479d();
        if (this.f151087a) {
            this.f151094h = Math.max(this.f151102p - d, this.f151091e);
        } else {
            this.f151094h = this.f151102p - d;
        }
    }

    /* renamed from: b */
    public final boolean mo779b(View view) {
        WeakReference weakReference = this.f151104r;
        return (weakReference == null || view != weakReference.get() || this.f151099m == 3) ? false : true;
    }

    /* renamed from: a */
    public final void mo71024a(float f) {
        if (f <= 0.0f || f >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.f151093g = f;
        if (this.f151103q != null) {
            m117482f();
        }
    }

    /* renamed from: b */
    public final boolean mo780b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f151099m == 1 && actionMasked == 0) {
            return true;
        }
        C1338rw rwVar = this.f151100n;
        if (rwVar != null) {
            rwVar.mo15833b(motionEvent);
        }
        if (actionMasked == 0) {
            m117484g();
        }
        if (this.f151083I == null) {
            this.f151083I = VelocityTracker.obtain();
        }
        this.f151083I.addMovement(motionEvent);
        if (actionMasked == 2 && !this.f151079E) {
            float abs = Math.abs(((float) this.f151084J) - motionEvent.getY());
            C1338rw rwVar2 = this.f151100n;
            if (abs > ((float) rwVar2.f26934b)) {
                rwVar2.mo15826a(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        if (!this.f151079E) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final Parcelable mo781c(View view) {
        return new SavedState(View.BaseSavedState.EMPTY_STATE, this);
    }

    /* renamed from: e */
    public final void mo71040e(int i) {
        float f;
        View view = (View) this.f151103q.get();
        if (view != null && !this.f151082H.isEmpty()) {
            int i2 = this.f151094h;
            if (i <= i2 && i2 != mo71036c()) {
                int i3 = this.f151094h;
                f = ((float) (i3 - i)) / ((float) (i3 - mo71036c()));
            } else {
                int i4 = this.f151094h;
                f = ((float) (i4 - i)) / ((float) (this.f151102p - i4));
            }
            for (int i5 = 0; i5 < this.f151082H.size(); i5++) {
                ((bhfj) this.f151082H.get(i5)).mo12435a(view, f);
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.material.bottomsheet.BottomSheetBehavior.a(int, boolean):void
     arg types: [int, int]
     candidates:
      com.google.android.material.bottomsheet.BottomSheetBehavior.a(android.view.View, int):void
      com.google.android.material.bottomsheet.BottomSheetBehavior.a(android.view.View, android.os.Parcelable):void
      com.google.android.material.bottomsheet.BottomSheetBehavior.a(android.view.View, float):boolean
      aim.a(android.view.View, android.os.Parcelable):void
      aim.a(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View):void
      aim.a(android.view.View, android.graphics.Rect):boolean
      aim.a(android.view.View, android.view.View):boolean
      com.google.android.material.bottomsheet.BottomSheetBehavior.a(int, boolean):void */
    /* renamed from: a */
    public final void mo71025a(int i) {
        mo71026a(i, false);
    }

    /* renamed from: a */
    public final void mo71026a(int i, boolean z) {
        View view;
        if (i != -1) {
            if (this.f151109w || this.f151088b != i) {
                this.f151109w = false;
                this.f151088b = Math.max(0, i);
            } else {
                return;
            }
        } else if (!this.f151109w) {
            this.f151109w = true;
        } else {
            return;
        }
        if (this.f151103q != null) {
            m117481e();
            if (this.f151099m == 4 && (view = (View) this.f151103q.get()) != null) {
                if (z) {
                    m117483f(this.f151099m);
                } else {
                    view.requestLayout();
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo71037c(int i) {
        if (i == this.f151099m) {
            return;
        }
        if (this.f151103q != null) {
            m117483f(i);
        } else if (i == 4 || i == 3 || i == 6 || (this.f151096j && i == 5)) {
            this.f151099m = i;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.material.bottomsheet.BottomSheetBehavior.a(android.view.View, int, int, boolean):void
     arg types: [android.view.View, int, int, int]
     candidates:
      com.google.android.material.bottomsheet.BottomSheetBehavior.a(android.content.Context, android.util.AttributeSet, boolean, android.content.res.ColorStateList):void
      com.google.android.material.bottomsheet.BottomSheetBehavior.a(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void
      aim.a(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void
      aim.a(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.graphics.Rect, boolean):boolean
      com.google.android.material.bottomsheet.BottomSheetBehavior.a(android.view.View, int, int, boolean):void */
    /* renamed from: a */
    public final void mo71027a(View view, int i) {
        int i2;
        int i3;
        if (i == 4) {
            i2 = this.f151094h;
        } else if (i == 6) {
            int i4 = this.f151092f;
            if (!this.f151087a || i4 > (i3 = this.f151091e)) {
                i2 = i4;
            } else {
                i2 = i3;
                i = 3;
            }
        } else if (i == 3) {
            i2 = mo71036c();
        } else if (!this.f151096j || i != 5) {
            StringBuilder sb = new StringBuilder(35);
            sb.append("Illegal state argument: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        } else {
            i2 = this.f151102p;
        }
        mo71028a(view, i, i2, false);
    }

    /* renamed from: a */
    public final void mo71028a(View view, int i, int i2, boolean z) {
        if (!z ? this.f151100n.mo15830a(view, view.getLeft(), i2) : this.f151100n.mo15828a(view.getLeft(), i2)) {
            mo71039d(2);
            m117485g(i);
            if (this.f151077C == null) {
                this.f151077C = new bhfl(this, view, i);
            }
            bhfl bhfl = this.f151077C;
            if (!bhfl.f118472a) {
                bhfl.f118473b = i;
                C1280ps.m19891a(view, bhfl);
                this.f151077C.f118472a = true;
                return;
            }
            bhfl.f118473b = i;
            return;
        }
        mo71039d(i);
    }

    /* renamed from: a */
    public final void mo765a(View view, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        int i = this.f151107u;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.f151088b = savedState.f151114d;
            }
            if (i == -1 || (i & 2) == 2) {
                this.f151087a = savedState.f151115e;
            }
            if (i == -1 || (i & 4) == 4) {
                this.f151096j = savedState.f151116f;
            }
            if (i == -1 || (i & 8) == 8) {
                this.f151097k = savedState.f151117g;
            }
        }
        int i2 = savedState.f151113c;
        if (i2 == 1 || i2 == 2) {
            this.f151099m = 4;
        } else {
            this.f151099m = i2;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.material.bottomsheet.BottomSheetBehavior.a(android.view.View, int, int, boolean):void
     arg types: [android.view.View, int, int, int]
     candidates:
      com.google.android.material.bottomsheet.BottomSheetBehavior.a(android.content.Context, android.util.AttributeSet, boolean, android.content.res.ColorStateList):void
      com.google.android.material.bottomsheet.BottomSheetBehavior.a(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void
      aim.a(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void
      aim.a(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.graphics.Rect, boolean):boolean
      com.google.android.material.bottomsheet.BottomSheetBehavior.a(android.view.View, int, int, boolean):void */
    /* renamed from: a */
    public final void mo768a(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
        int i2;
        float f;
        int i3 = 3;
        if (view.getTop() != mo71036c()) {
            WeakReference weakReference = this.f151104r;
            if (weakReference != null && view2 == weakReference.get() && this.f151081G) {
                if (this.f151080F <= 0) {
                    if (this.f151096j) {
                        VelocityTracker velocityTracker = this.f151083I;
                        if (velocityTracker != null) {
                            velocityTracker.computeCurrentVelocity(1000, this.f151108v);
                            f = this.f151083I.getYVelocity(this.f151105s);
                        } else {
                            f = 0.0f;
                        }
                        if (mo71031a(view, f)) {
                            i2 = this.f151102p;
                            i3 = 5;
                        }
                    }
                    if (this.f151080F == 0) {
                        int top = view.getTop();
                        if (!this.f151087a) {
                            int i4 = this.f151092f;
                            if (top >= i4) {
                                if (Math.abs(top - i4) < Math.abs(top - this.f151094h)) {
                                    i2 = this.f151092f;
                                    i3 = 6;
                                } else {
                                    i2 = this.f151094h;
                                    i3 = 4;
                                }
                            } else if (top < Math.abs(top - this.f151094h)) {
                                i2 = this.f151090d;
                            } else {
                                i2 = this.f151092f;
                                i3 = 6;
                            }
                        } else if (Math.abs(top - this.f151091e) < Math.abs(top - this.f151094h)) {
                            i2 = this.f151091e;
                        } else {
                            i2 = this.f151094h;
                            i3 = 4;
                        }
                    } else {
                        if (!this.f151087a) {
                            int top2 = view.getTop();
                            if (Math.abs(top2 - this.f151092f) < Math.abs(top2 - this.f151094h)) {
                                i2 = this.f151092f;
                                i3 = 6;
                            }
                        }
                        i2 = this.f151094h;
                        i3 = 4;
                    }
                } else if (!this.f151087a) {
                    int top3 = view.getTop();
                    i2 = this.f151092f;
                    if (top3 <= i2) {
                        i2 = this.f151090d;
                    } else {
                        i3 = 6;
                    }
                } else {
                    i2 = this.f151091e;
                }
                mo71028a(view, i3, i2, false);
                this.f151081G = false;
                return;
            }
            return;
        }
        mo71039d(3);
    }

    /* renamed from: a */
    public final void mo769a(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int[] iArr, int i2) {
        View view3;
        if (i2 != 1) {
            WeakReference weakReference = this.f151104r;
            if (weakReference != null) {
                view3 = (View) weakReference.get();
            } else {
                view3 = null;
            }
            if (view2 == view3) {
                int top = view.getTop();
                int i3 = top - i;
                if (i > 0) {
                    if (i3 < mo71036c()) {
                        int c = top - mo71036c();
                        iArr[1] = c;
                        C1280ps.m19922g(view, -c);
                        mo71039d(3);
                    } else if (this.f151098l) {
                        iArr[1] = i;
                        C1280ps.m19922g(view, -i);
                        mo71039d(1);
                    } else {
                        return;
                    }
                } else if (i < 0 && !view2.canScrollVertically(-1)) {
                    int i4 = this.f151094h;
                    if (i3 > i4 && !this.f151096j) {
                        int i5 = top - i4;
                        iArr[1] = i5;
                        C1280ps.m19922g(view, -i5);
                        mo71039d(4);
                    } else if (this.f151098l) {
                        iArr[1] = i;
                        C1280ps.m19922g(view, -i);
                        mo71039d(1);
                    } else {
                        return;
                    }
                }
                mo71040e(view.getTop());
                this.f151080F = i;
                this.f151081G = true;
            }
        }
    }

    @Deprecated
    /* renamed from: a */
    public final void mo71029a(bhfj bhfj) {
        Log.w("BottomSheetBehavior", "BottomSheetBehavior now supports multiple callbacks. `setBottomSheetCallback()` removes all existing callbacks, including ones set internally by library authors, which may result in unintended behavior. This may change in the future. Please use `addBottomSheetCallback()` and `removeBottomSheetCallback()` instead to set your own callbacks.");
        this.f151082H.clear();
        if (bhfj != null) {
            this.f151082H.add(bhfj);
        }
    }

    /* renamed from: a */
    public final void mo71030a(boolean z) {
        int i;
        if (this.f151087a != z) {
            this.f151087a = z;
            if (this.f151103q != null) {
                m117481e();
            }
            if (!this.f151087a || this.f151099m != 6) {
                i = this.f151099m;
            } else {
                i = 3;
            }
            mo71039d(i);
            m117486h();
        }
    }

    /* renamed from: a */
    public final boolean mo71031a(View view, float f) {
        if (this.f151097k) {
            return true;
        }
        if (view.getTop() >= this.f151094h) {
            if (Math.abs((((float) view.getTop()) + (f * 0.1f)) - ((float) this.f151094h)) / ((float) m117479d()) > 0.5f) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo773a(CoordinatorLayout coordinatorLayout, View view, int i) {
        boolean z;
        float f;
        bhlr bhlr;
        WindowInsets rootWindowInsets;
        if (C1280ps.m19938t(coordinatorLayout) && !C1280ps.m19938t(view)) {
            view.setFitsSystemWindows(true);
        }
        if (this.f151103q == null) {
            this.f151110x = coordinatorLayout.getResources().getDimensionPixelSize(C0126R.dimen.design_bottom_sheet_peek_height_min);
            int i2 = Build.VERSION.SDK_INT;
            if (!this.f151112z && (rootWindowInsets = coordinatorLayout.getRootWindowInsets()) != null) {
                this.f151088b += rootWindowInsets.getSystemGestureInsets().bottom;
            }
            this.f151103q = new WeakReference(view);
            if (this.f151111y && (bhlr = this.f151089c) != null) {
                C1280ps.m19890a(view, bhlr);
            }
            bhlr bhlr2 = this.f151089c;
            if (bhlr2 != null) {
                float f2 = this.f151095i;
                if (f2 == -1.0f) {
                    f2 = C1280ps.m19933o(view);
                }
                bhlr2.mo63949d(f2);
                int i3 = this.f151099m;
                if (i3 == 3) {
                    z = true;
                } else {
                    z = false;
                }
                this.f151076B = z;
                bhlr bhlr3 = this.f151089c;
                if (i3 == 3) {
                    f = 0.0f;
                } else {
                    f = 1.0f;
                }
                bhlr3.mo63947c(f);
            }
            m117486h();
            if (C1280ps.m19917f(view) == 0) {
                C1280ps.m19906b(view, 1);
            }
        }
        if (this.f151100n == null) {
            this.f151100n = C1338rw.m20124a(coordinatorLayout, this.f151086L);
        }
        int top = view.getTop();
        coordinatorLayout.mo1876b(view, i);
        this.f151101o = coordinatorLayout.getWidth();
        int height = coordinatorLayout.getHeight();
        this.f151102p = height;
        this.f151091e = Math.max(0, height - view.getHeight());
        m117482f();
        m117481e();
        int i4 = this.f151099m;
        if (i4 == 3) {
            C1280ps.m19922g(view, mo71036c());
        } else if (i4 == 6) {
            C1280ps.m19922g(view, this.f151092f);
        } else if (this.f151096j && i4 == 5) {
            C1280ps.m19922g(view, this.f151102p);
        } else if (i4 == 4) {
            C1280ps.m19922g(view, this.f151094h);
        } else if (i4 == 1 || i4 == 2) {
            C1280ps.m19922g(view, top - view.getTop());
        }
        this.f151104r = new WeakReference(mo71038d(view));
        return true;
    }

    /* renamed from: a */
    public final boolean mo776a(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        C1338rw rwVar;
        View view2;
        if (!view.isShown() || !this.f151098l) {
            this.f151079E = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m117484g();
        }
        if (this.f151083I == null) {
            this.f151083I = VelocityTracker.obtain();
        }
        this.f151083I.addMovement(motionEvent);
        View view3 = null;
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.f151084J = (int) motionEvent.getY();
            if (this.f151099m != 2) {
                WeakReference weakReference = this.f151104r;
                if (weakReference != null) {
                    view2 = (View) weakReference.get();
                } else {
                    view2 = null;
                }
                if (view2 != null && coordinatorLayout.mo1874a(view2, x, this.f151084J)) {
                    this.f151105s = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f151106t = true;
                }
            }
            this.f151079E = this.f151105s == -1 && !coordinatorLayout.mo1874a(view, x, this.f151084J);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f151106t = false;
            this.f151105s = -1;
            if (this.f151079E) {
                this.f151079E = false;
                return false;
            }
        }
        if (!this.f151079E && (rwVar = this.f151100n) != null && rwVar.mo15829a(motionEvent)) {
            return true;
        }
        WeakReference weakReference2 = this.f151104r;
        if (weakReference2 != null) {
            view3 = (View) weakReference2.get();
        }
        return actionMasked == 2 && view3 != null && !this.f151079E && this.f151099m != 1 && !coordinatorLayout.mo1874a(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) && this.f151100n != null && Math.abs(((float) this.f151084J) - motionEvent.getY()) > ((float) this.f151100n.f26934b);
    }
}
