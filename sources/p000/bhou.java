package p000;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.text.TextWatcher;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import com.felicanetworks.mfc.C0126R;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: bhou */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhou extends bhov {

    /* renamed from: j */
    public static final /* synthetic */ int f119208j = 0;

    /* renamed from: a */
    public final TextWatcher f119209a = new bhol(this);

    /* renamed from: b */
    public final bhpl f119210b = new bhom(this, this.f119220k);

    /* renamed from: c */
    public boolean f119211c = false;

    /* renamed from: d */
    public boolean f119212d = false;

    /* renamed from: e */
    public long f119213e = Long.MAX_VALUE;

    /* renamed from: f */
    public StateListDrawable f119214f;

    /* renamed from: g */
    public bhlr f119215g;

    /* renamed from: h */
    public AccessibilityManager f119216h;

    /* renamed from: i */
    public ValueAnimator f119217i;

    /* renamed from: n */
    private final bhpm f119218n = new bhon(this);

    /* renamed from: o */
    private ValueAnimator f119219o;

    static {
        int i = Build.VERSION.SDK_INT;
    }

    public bhou(TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    /* renamed from: a */
    private final ValueAnimator m101243a(int i, float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(bhdl.f118327a);
        ofFloat.setDuration((long) i);
        ofFloat.addUpdateListener(new bhot(this));
        return ofFloat;
    }

    /* renamed from: a */
    public final boolean mo64098a(int i) {
        return i != 0;
    }

    /* renamed from: b */
    public final void mo64099b(boolean z) {
        if (this.f119212d != z) {
            this.f119212d = z;
            this.f119217i.cancel();
            this.f119219o.start();
        }
    }

    /* renamed from: b */
    public final boolean mo64100b() {
        return true;
    }

    /* renamed from: c */
    public final boolean mo64101c() {
        long currentTimeMillis = System.currentTimeMillis() - this.f119213e;
        return currentTimeMillis < 0 || currentTimeMillis > 300;
    }

    /* renamed from: a */
    private final bhlr m101244a(float f, float f2, float f3, int i) {
        bhlw a = bhlx.m101155a();
        a.mo63975c(f);
        a.mo63976d(f);
        a.mo63973a(f2);
        a.mo63974b(f2);
        bhlx a2 = a.mo63972a();
        bhlr a3 = bhlr.m101107a(this.f119221l, f3);
        a3.mo63916a(a2);
        bhlq bhlq = a3.f119007s;
        if (bhlq.f118976i == null) {
            bhlq.f118976i = new Rect();
        }
        a3.f119007s.f118976i.set(0, i, 0, i);
        a3.invalidateSelf();
        return a3;
    }

    /* renamed from: a */
    public final AutoCompleteTextView mo64096a(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ps.b(android.view.View, int):void
     arg types: [com.google.android.material.internal.CheckableImageButton, int]
     candidates:
      ps.b(android.view.View, qh):qh
      ps.b(android.view.View, float):void
      ps.b(android.view.View, boolean):void
      ps.b(android.view.View, int):void */
    /* renamed from: a */
    public final void mo64082a() {
        float dimensionPixelOffset = (float) this.f119221l.getResources().getDimensionPixelOffset(C0126R.dimen.mtrl_shape_corner_size_small_component);
        float dimensionPixelOffset2 = (float) this.f119221l.getResources().getDimensionPixelOffset(C0126R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        int dimensionPixelOffset3 = this.f119221l.getResources().getDimensionPixelOffset(C0126R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        bhlr a = m101244a(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        bhlr a2 = m101244a(0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.f119215g = a;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.f119214f = stateListDrawable;
        stateListDrawable.addState(new int[]{16842922}, a);
        this.f119214f.addState(new int[0], a2);
        this.f119220k.mo71271c(C1391tv.m20459b(this.f119221l, C0126R.C0127drawable.mtrl_dropdown_arrow));
        TextInputLayout textInputLayout = this.f119220k;
        textInputLayout.mo71284e(textInputLayout.getResources().getText(C0126R.string.exposed_dropdown_menu_content_description));
        this.f119220k.mo71255a(new bhoo(this));
        this.f119220k.mo71258a(this.f119218n);
        this.f119217i = m101243a(67, 0.0f, 1.0f);
        ValueAnimator a3 = m101243a(50, 1.0f, 0.0f);
        this.f119219o = a3;
        a3.addListener(new bhos(this));
        C1280ps.m19906b((View) this.f119222m, 2);
        this.f119216h = (AccessibilityManager) this.f119221l.getSystemService("accessibility");
    }

    /* renamed from: a */
    public final void mo64097a(AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView != null) {
            if (mo64101c()) {
                this.f119211c = false;
            }
            if (!this.f119211c) {
                mo64099b(!this.f119212d);
                if (this.f119212d) {
                    autoCompleteTextView.requestFocus();
                    autoCompleteTextView.showDropDown();
                    return;
                }
                autoCompleteTextView.dismissDropDown();
                return;
            }
            this.f119211c = false;
        }
    }
}
