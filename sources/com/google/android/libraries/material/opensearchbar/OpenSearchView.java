package com.google.android.libraries.material.opensearchbar;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p001v4.view.AbsSavedState;
import android.support.p002v7.widget.ActionMenuView;
import android.support.p002v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.felicanetworks.mfc.C0126R;
import com.google.android.libraries.material.internal.ClippableRoundedCornerLayout;
import com.google.android.libraries.material.internal.TouchObserverFrameLayout;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class OpenSearchView extends FrameLayout implements ail {

    /* renamed from: a */
    public final View f111262a;

    /* renamed from: b */
    public final ClippableRoundedCornerLayout f111263b;

    /* renamed from: c */
    final View f111264c;

    /* renamed from: d */
    final View f111265d;

    /* renamed from: e */
    public final FrameLayout f111266e;

    /* renamed from: f */
    public final Toolbar f111267f;

    /* renamed from: g */
    public final Toolbar f111268g;

    /* renamed from: h */
    public final TextView f111269h;

    /* renamed from: i */
    public final EditText f111270i;

    /* renamed from: j */
    public final ImageButton f111271j;

    /* renamed from: k */
    public final View f111272k;

    /* renamed from: l */
    public final TouchObserverFrameLayout f111273l;

    /* renamed from: m */
    public final azyn f111274m;

    /* renamed from: n */
    public azxs f111275n;

    /* renamed from: o */
    public boolean f111276o;

    /* renamed from: p */
    public boolean f111277p;

    /* renamed from: q */
    private final boolean f111278q;

    /* renamed from: r */
    private final bhid f111279r;

    /* renamed from: s */
    private final Set f111280s;

    /* renamed from: t */
    private int f111281t;

    /* renamed from: u */
    private boolean f111282u;

    /* renamed from: v */
    private Map f111283v;

    /* renamed from: w */
    private int f111284w;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class Behavior extends aim {
        public Behavior() {
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ boolean mo777a(CoordinatorLayout coordinatorLayout, View view, View view2) {
            OpenSearchView openSearchView = (OpenSearchView) view;
            if (openSearchView.f111275n != null || !(view2 instanceof azxs)) {
                return false;
            }
            azxs azxs = (azxs) view2;
            openSearchView.f111275n = azxs;
            openSearchView.f111274m.f100212k = azxs;
            azxs.setOnClickListener(new azxz(openSearchView));
            openSearchView.mo60441a(C1280ps.m19923h(openSearchView));
            openSearchView.mo60445b();
            return false;
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR = new azyc();

        /* renamed from: c */
        String f111285c;

        /* renamed from: d */
        int f111286d;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f111285c = parcel.readString();
            this.f111286d = parcel.readInt();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f111285c);
            parcel.writeInt(this.f111286d);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public OpenSearchView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private final void m94747a(float f) {
        bhid bhid = this.f111279r;
        if (bhid != null && this.f111264c != null) {
            this.f111264c.setBackgroundColor(bhid.mo63792a(bhid.f118700b, f));
        }
    }

    /* renamed from: k */
    private final void m94749k() {
        int i;
        ImageButton b = azxq.m86337b(this.f111267f);
        if (b != null) {
            if (this.f111263b.getVisibility() == 0) {
                i = 1;
            } else {
                i = 0;
            }
            Drawable drawable = b.getDrawable();
            if (drawable instanceof C1393tx) {
                ((C1393tx) drawable).mo16070a((float) i);
            }
            if (drawable instanceof azxf) {
                ((azxf) drawable).mo55356a((float) i);
            }
        }
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.f111278q) {
            this.f111273l.addView(view, i, layoutParams);
        } else {
            super.addView(view, i, layoutParams);
        }
    }

    /* renamed from: b */
    public final void mo60445b() {
        if (this.f111275n == null) {
            m94747a(getResources().getDimension(C0126R.dimen.google_opensearchview_elevation));
            return;
        }
        throw null;
    }

    /* renamed from: c */
    public final Editable mo60448c() {
        return this.f111270i.getText();
    }

    /* renamed from: d */
    public final boolean mo60449d() {
        int i = this.f111284w;
        if (i != 0) {
            return i == 4 || i == 3;
        }
        throw null;
    }

    /* renamed from: e */
    public final void mo60450e() {
        int i = this.f111284w;
        if (i == 0) {
            throw null;
        } else if (i != 4 && i != 3) {
            azyn azyn = this.f111274m;
            if (azyn.f100212k == null) {
                if (azyn.f100202a.mo60455j()) {
                    OpenSearchView openSearchView = azyn.f100202a;
                    openSearchView.getClass();
                    openSearchView.postDelayed(new azye(openSearchView), 150);
                }
                azyn.f100204c.setVisibility(4);
                azyn.f100204c.post(new azyf(azyn));
                mo60447b(true);
                return;
            }
            if (azyn.f100202a.mo60455j()) {
                azyn.f100202a.mo60452g();
            }
            azyn.f100202a.mo60446b(3);
            Menu j = azyn.f100206e.mo1700j();
            if (j != null) {
                j.clear();
            }
            throw null;
        }
    }

    /* renamed from: f */
    public final void mo60451f() {
        int i = this.f111284w;
        if (i == 0) {
            throw null;
        } else if (i != 2 && i != 1) {
            azyn azyn = this.f111274m;
            if (azyn.f100212k == null) {
                if (azyn.f100202a.mo60455j()) {
                    azyn.f100202a.mo60453h();
                }
                AnimatorSet a = azyn.mo55407a(false);
                a.addListener(new azyl(azyn));
                a.start();
            } else {
                if (azyn.f100202a.mo60455j()) {
                    azyn.f100202a.mo60453h();
                }
                AnimatorSet animatorSet = new AnimatorSet();
                Animator[] animatorArr = new Animator[9];
                TimeInterpolator timeInterpolator = bhdl.f118328b;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(azxp.m86335a(false, timeInterpolator));
                ofFloat.addUpdateListener(azxn.m86332a(azyn.f100203b));
                animatorArr[0] = ofFloat;
                OpenSearchView openSearchView = azyn.f100202a;
                Rect rect = new Rect(openSearchView.getLeft(), openSearchView.getTop(), openSearchView.getRight(), openSearchView.getBottom());
                int[] iArr = new int[2];
                azyn.f100212k.getLocationOnScreen(iArr);
                int i2 = iArr[0];
                int i3 = iArr[1];
                int[] iArr2 = new int[2];
                azyn.f100204c.getLocationOnScreen(iArr2);
                int i4 = i2 - iArr2[0];
                int i5 = i3 - iArr2[1];
                Rect rect2 = new Rect(i4, i5, azyn.f100212k.getWidth() + i4, azyn.f100212k.getHeight() + i5);
                Rect rect3 = new Rect(rect2);
                float dimension = azyn.f100202a.getResources().getDimension(C0126R.dimen.google_opensearchbar_radius);
                ValueAnimator ofObject = ValueAnimator.ofObject(new azxo(rect3), rect2, rect);
                ofObject.addUpdateListener(new azyg(azyn, dimension, rect3));
                ofObject.setDuration(250L);
                ofObject.setInterpolator(azxp.m86335a(false, bhdl.f118328b));
                animatorArr[1] = ofObject;
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.setDuration(42L);
                ofFloat2.setStartDelay(0);
                ofFloat2.setInterpolator(azxp.m86335a(false, bhdl.f118327a));
                ofFloat2.addUpdateListener(azxn.m86332a(azyn.f100209h));
                animatorArr[2] = ofFloat2;
                AnimatorSet animatorSet2 = new AnimatorSet();
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat3.setDuration(83L);
                ofFloat3.setStartDelay(0);
                ofFloat3.setInterpolator(azxp.m86335a(false, bhdl.f118327a));
                ofFloat3.addUpdateListener(azxn.m86332a(azyn.f100210i, azyn.f100211j));
                ValueAnimator ofFloat4 = ValueAnimator.ofFloat((((float) azyn.f100211j.getHeight()) * 0.050000012f) / 2.0f, 0.0f);
                ofFloat4.setDuration(250L);
                ofFloat4.setInterpolator(azxp.m86335a(false, bhdl.f118328b));
                ofFloat4.addUpdateListener(azxn.m86334c(azyn.f100210i));
                ValueAnimator ofFloat5 = ValueAnimator.ofFloat(0.95f, 1.0f);
                ofFloat5.setDuration(250L);
                ofFloat5.setInterpolator(azxp.m86335a(false, bhdl.f118328b));
                ofFloat5.addUpdateListener(new azxn(azxj.f100172a, azyn.f100211j));
                animatorSet2.playTogether(ofFloat3, ofFloat4, ofFloat5);
                animatorArr[3] = animatorSet2;
                AnimatorSet animatorSet3 = new AnimatorSet();
                ImageButton b = azxq.m86337b(azyn.f100205d);
                if (b != null) {
                    ValueAnimator ofFloat6 = ValueAnimator.ofFloat((float) azyn.mo55405a(b), 0.0f);
                    ofFloat6.addUpdateListener(azxn.m86333b(b));
                    ValueAnimator ofFloat7 = ValueAnimator.ofFloat((float) azyn.mo55404a(), 0.0f);
                    ofFloat7.addUpdateListener(azxn.m86334c(b));
                    animatorSet3.playTogether(ofFloat6, ofFloat7);
                }
                azyn.mo55409a(animatorSet3);
                ActionMenuView a2 = azxq.m86336a(azyn.f100205d);
                if (a2 != null) {
                    ValueAnimator ofFloat8 = ValueAnimator.ofFloat((float) azyn.mo55410b(a2), 0.0f);
                    ofFloat8.addUpdateListener(azxn.m86333b(a2));
                    ValueAnimator ofFloat9 = ValueAnimator.ofFloat((float) azyn.mo55404a(), 0.0f);
                    ofFloat9.addUpdateListener(azxn.m86334c(a2));
                    animatorSet3.playTogether(ofFloat8, ofFloat9);
                }
                animatorSet3.setDuration(250L);
                animatorSet3.setInterpolator(azxp.m86335a(false, bhdl.f118328b));
                animatorArr[4] = animatorSet3;
                animatorArr[5] = azyn.mo55406a(false, azyn.f100206e);
                ValueAnimator ofFloat10 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat10.setDuration(250L);
                ofFloat10.setInterpolator(azxp.m86335a(false, bhdl.f118328b));
                if (azyn.f100202a.f111277p) {
                    ofFloat10.addUpdateListener(new azxg(azxq.m86336a(azyn.f100206e), azxq.m86336a(azyn.f100205d)));
                }
                animatorArr[6] = ofFloat10;
                animatorArr[7] = azyn.mo55406a(true, azyn.f100208g);
                animatorArr[8] = azyn.mo55406a(true, azyn.f100207f);
                animatorSet.playTogether(animatorArr);
                animatorSet.addListener(new azym(azyn));
                animatorSet.addListener(new azyj(azyn));
                animatorSet.start();
            }
            mo60447b(false);
        }
    }

    /* renamed from: g */
    public final void mo60452g() {
        if (this.f111282u) {
            this.f111270i.post(new azya(this));
        }
    }

    /* renamed from: h */
    public final void mo60453h() {
        this.f111270i.clearFocus();
        mo60454i().hideSoftInputFromWindow(this.f111270i.getWindowToken(), 0);
    }

    /* renamed from: i */
    public final InputMethodManager mo60454i() {
        return (InputMethodManager) getContext().getSystemService("input_method");
    }

    /* renamed from: j */
    public final boolean mo60455j() {
        return this.f111281t == 48;
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        bhls.m101141a(this);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0051, code lost:
        if (r0 == 768) goto L_0x0055;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0059  */
    public final void onFinishInflate() {
        Activity activity;
        super.onFinishInflate();
        Context context = getContext();
        while (true) {
            if (context instanceof ContextWrapper) {
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            } else {
                activity = null;
                break;
            }
        }
        if (activity != null) {
            Window window = activity.getWindow();
            if (window != null) {
                this.f111281t = window.getAttributes().softInputMode;
            }
            boolean z = true;
            int i = 0;
            if (window != null) {
                WindowManager.LayoutParams attributes = window.getAttributes();
                int i2 = Build.VERSION.SDK_INT;
                int i3 = attributes.flags;
                int i4 = attributes.flags & 512;
                int i5 = Build.VERSION.SDK_INT;
                int systemUiVisibility = window.getDecorView().getSystemUiVisibility() & 768;
                if ((i3 & 67108864) != 67108864) {
                    if (i4 != 512) {
                    }
                }
                View view = this.f111265d;
                if (!z) {
                    i = 8;
                }
                view.setVisibility(i);
            }
            z = false;
            View view2 = this.f111265d;
            if (!z) {
            }
            view2.setVisibility(i);
        }
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f1048b);
        mo60442a(savedState.f111285c);
        mo60443a(savedState.f111286d == 0);
    }

    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        mo60441a(i);
    }

    /* access modifiers changed from: protected */
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Editable c = mo60448c();
        savedState.f111285c = c != null ? c.toString() : null;
        savedState.f111286d = this.f111263b.getVisibility();
        return savedState;
    }

    public final void setElevation(float f) {
        super.setElevation(f);
        m94747a(f);
    }

    public OpenSearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0126R.attr.openSearchViewStyle);
    }

    public OpenSearchView(Context context, AttributeSet attributeSet, int i) {
        super(bhpq.m101285a(context, attributeSet, i, 2132019416), attributeSet, i);
        this.f111280s = new LinkedHashSet();
        this.f111281t = 16;
        this.f111284w = 2;
        Context context2 = getContext();
        int i2 = 0;
        TypedArray a = bhki.m101052a(context2, attributeSet, azyo.f100214a, i, 2132019416, new int[0]);
        int resourceId = a.getResourceId(0, -1);
        String string = a.getString(1);
        String string2 = a.getString(2);
        String string3 = a.getString(7);
        int i3 = 8;
        boolean z = a.getBoolean(8, false);
        this.f111276o = a.getBoolean(4, true);
        this.f111277p = a.getBoolean(3, true);
        boolean z2 = a.getBoolean(6, false);
        this.f111282u = a.getBoolean(5, true);
        a.recycle();
        LayoutInflater.from(context2).inflate((int) C0126R.C0128layout.open_search_view, this);
        this.f111278q = true;
        this.f111262a = findViewById(C0126R.C0129id.open_search_view_scrim);
        this.f111263b = (ClippableRoundedCornerLayout) findViewById(C0126R.C0129id.open_search_view_root);
        this.f111264c = findViewById(C0126R.C0129id.open_search_view_background);
        this.f111265d = findViewById(C0126R.C0129id.open_search_view_status_bar_spacer);
        this.f111266e = (FrameLayout) findViewById(C0126R.C0129id.open_search_view_toolbar_container);
        this.f111267f = (Toolbar) findViewById(C0126R.C0129id.open_search_view_toolbar);
        this.f111268g = (Toolbar) findViewById(C0126R.C0129id.open_search_view_dummy_toolbar);
        this.f111269h = (TextView) findViewById(C0126R.C0129id.open_search_view_search_prefix);
        this.f111270i = (EditText) findViewById(C0126R.C0129id.open_search_view_edit_text);
        this.f111271j = (ImageButton) findViewById(C0126R.C0129id.open_search_view_clear_button);
        this.f111272k = findViewById(C0126R.C0129id.open_search_view_divider);
        this.f111273l = (TouchObserverFrameLayout) findViewById(C0126R.C0129id.open_search_view_content_container);
        this.f111274m = new azyn(this);
        this.f111279r = new bhid(context2);
        this.f111263b.setOnTouchListener(azxt.f100180a);
        mo60445b();
        this.f111269h.setText(string3);
        this.f111269h.setVisibility(!TextUtils.isEmpty(string3) ? 0 : i3);
        if (resourceId != -1) {
            C1334rs.m20104a(this.f111270i, resourceId);
        }
        this.f111270i.setText(string);
        this.f111270i.setHint(string2);
        if (z2) {
            this.f111267f.mo1681b((Drawable) null);
        } else {
            this.f111267f.mo1678a(new azxu(this));
            if (z) {
                this.f111267f.mo1681b(new C1393tx(getContext()));
            }
        }
        this.f111271j.setOnClickListener(new azxv(this));
        this.f111270i.addTextChangedListener(new azyb(this));
        this.f111272k.setBackgroundColor(C1165lm.m19355b(bhkx.m101073a(this, (int) C0126R.attr.colorOnSurface), Math.round(30.599998f)));
        this.f111273l.f111260a = new azxw(this);
        ViewGroup.LayoutParams layoutParams = this.f111265d.getLayoutParams();
        int identifier = getResources().getIdentifier("status_bar_height", "dimen", "android");
        layoutParams.height = identifier > 0 ? getResources().getDimensionPixelSize(identifier) : i2;
        bhkn.m101063a(this.f111267f, new azxx(this));
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f111272k.getLayoutParams();
        C1280ps.m19895a(this.f111272k, new azxy(marginLayoutParams, marginLayoutParams.leftMargin, marginLayoutParams.rightMargin));
    }

    /* renamed from: a */
    private final void m94748a(ViewGroup viewGroup, boolean z) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt != this) {
                if (childAt.findViewById(this.f111263b.getId()) != null) {
                    m94748a((ViewGroup) childAt, z);
                } else if (z) {
                    int i2 = Build.VERSION.SDK_INT;
                    this.f111283v.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    C1280ps.m19906b(childAt, 4);
                } else {
                    Map map = this.f111283v;
                    if (map != null && map.containsKey(childAt)) {
                        C1280ps.m19906b(childAt, ((Integer) this.f111283v.get(childAt)).intValue());
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo60446b(int i) {
        int i2 = this.f111284w;
        if (i2 == 0) {
            throw null;
        } else if (i2 != i) {
            this.f111284w = i;
            for (azyd azyd : new LinkedHashSet(this.f111280s)) {
                azyd.mo55390a();
            }
        }
    }

    /* renamed from: b */
    public final void mo60447b(boolean z) {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        int i = Build.VERSION.SDK_INT;
        if (z) {
            this.f111283v = new HashMap(viewGroup.getChildCount());
        }
        m94748a(viewGroup, z);
        if (!z) {
            this.f111283v = null;
        }
    }

    /* renamed from: a */
    public final aim mo762a() {
        return new Behavior();
    }

    /* renamed from: a */
    public final void mo60441a(int i) {
        int i2;
        Toolbar toolbar = this.f111267f;
        if (toolbar != null && !(toolbar.mo1699i() instanceof C1393tx)) {
            if (i != 1) {
                i2 = C0126R.C0127drawable.quantum_ic_arrow_back_vd_theme_24;
            } else {
                i2 = C0126R.C0127drawable.quantum_ic_arrow_forward_vd_theme_24;
            }
            azxs azxs = this.f111275n;
            if (azxs != null) {
                this.f111267f.mo1681b(new azxf(azxs.mo1699i(), C1391tv.m20459b(getContext(), i2)));
                m94749k();
                return;
            }
            this.f111267f.mo1690d(i2);
        }
    }

    /* renamed from: a */
    public final void mo60442a(CharSequence charSequence) {
        this.f111270i.setText(charSequence);
    }

    /* renamed from: a */
    public final void mo60443a(boolean z) {
        boolean z2;
        int i;
        int i2 = 0;
        if (this.f111263b.getVisibility() != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = this.f111263b;
        if (!z) {
            i2 = 8;
        }
        clippableRoundedCornerLayout.setVisibility(i2);
        m94749k();
        if (z2 != z) {
            mo60447b(z);
        }
        if (!z) {
            i = 2;
        } else {
            i = 4;
        }
        mo60446b(i);
    }
}
