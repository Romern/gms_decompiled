package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.ListAdapter;
import com.felicanetworks.mfc.C0126R;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: bhoz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhoz extends C1492xo {

    /* renamed from: a */
    public final aap f119250a;

    /* renamed from: b */
    private final AccessibilityManager f119251b;

    /* renamed from: c */
    private final Rect f119252c = new Rect();

    /* renamed from: a */
    private final TextInputLayout m101274a() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public final CharSequence getHint() {
        TextInputLayout a = m101274a();
        if (a == null || !a.f151335i) {
            return super.getHint();
        }
        return a.mo71248a();
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int i3;
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout a = m101274a();
            int i4 = 0;
            if (!(adapter == null || a == null)) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                int min = Math.min(adapter.getCount(), Math.max(0, this.f119250a.mo112k()) + 15);
                int max = Math.max(0, min - 15);
                View view = null;
                int i5 = 0;
                while (max < min) {
                    int itemViewType = adapter.getItemViewType(max);
                    if (itemViewType != i4) {
                        i3 = itemViewType;
                    } else {
                        i3 = i4;
                    }
                    if (itemViewType != i4) {
                        view = null;
                    }
                    view = adapter.getView(max, view, a);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i5 = Math.max(i5, view.getMeasuredWidth());
                    max++;
                    i4 = i3;
                }
                Drawable b = this.f119250a.mo102b();
                if (b != null) {
                    b.getPadding(this.f119252c);
                    i5 += this.f119252c.left + this.f119252c.right;
                }
                i4 = i5 + a.f151339m.getMeasuredWidth();
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, i4), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    public final void setAdapter(ListAdapter listAdapter) {
        super.setAdapter(listAdapter);
        this.f119250a.mo99a(getAdapter());
    }

    public final void showDropDown() {
        AccessibilityManager accessibilityManager;
        if (getInputType() != 0 || (accessibilityManager = this.f119251b) == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.showDropDown();
        } else {
            this.f119250a.mo101aI();
        }
    }

    public bhoz(Context context, AttributeSet attributeSet) {
        super(bhpq.m101285a(context, attributeSet, C0126R.attr.autoCompleteTextViewStyle, 0), attributeSet, C0126R.attr.autoCompleteTextViewStyle);
        Context context2 = getContext();
        TypedArray a = bhki.m101052a(context2, attributeSet, bhpg.f119259a, C0126R.attr.autoCompleteTextViewStyle, 2132019232, new int[0]);
        if (a.hasValue(0) && a.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        this.f119251b = (AccessibilityManager) context2.getSystemService("accessibility");
        aap aap = new aap(context2);
        this.f119250a = aap;
        aap.mo114m();
        aap aap2 = this.f119250a;
        aap2.f67l = this;
        aap2.mo113l();
        this.f119250a.mo99a(getAdapter());
        this.f119250a.f68m = new bhoy(this);
        a.recycle();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: SimpleMethodDetails{bhoz.setText(java.lang.CharSequence, boolean):void}
     arg types: [java.lang.CharSequence, int]
     candidates:
      ClspMth{android.widget.EditText.setText(java.lang.CharSequence, android.widget.TextView$BufferType):void}
      ClspMth{android.widget.TextView.setText(int, android.widget.TextView$BufferType):void}
      ClspMth{android.widget.TextView.setText(java.lang.CharSequence, android.widget.TextView$BufferType):void}
      SimpleMethodDetails{bhoz.setText(java.lang.CharSequence, boolean):void} */
    /* renamed from: a */
    public final void mo64119a(Object obj) {
        int i = Build.VERSION.SDK_INT;
        setText(convertSelectionToString(obj), false);
    }
}
