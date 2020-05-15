package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import com.felicanetworks.mfc.C0126R;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CheckBoxPreference extends TwoStatePreference {

    /* renamed from: c */
    private final ann f1550c = new ann(this);

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ll.a(android.content.res.TypedArray, int, int, boolean):boolean
     arg types: [android.content.res.TypedArray, int, int, int]
     candidates:
      ll.a(android.content.res.TypedArray, int, int, int):int
      ll.a(android.content.res.TypedArray, org.xmlpull.v1.XmlPullParser, java.lang.String, int):int
      ll.a(android.content.res.Resources, android.content.res.Resources$Theme, android.util.AttributeSet, int[]):android.content.res.TypedArray
      ll.a(android.content.res.TypedArray, int, int, boolean):boolean */
    /* JADX WARNING: Illegal instructions before constructor call */
    public CheckBoxPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, r0, 0);
        int a = C1164ll.m19309a(context, (int) C0126R.attr.checkBoxPreferenceStyle, 16842895);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, aor.f1902b, a, 0);
        mo2033c((CharSequence) C1164ll.m19314a(obtainStyledAttributes, 5, 0));
        mo2034d((CharSequence) C1164ll.m19314a(obtainStyledAttributes, 4, 1));
        ((TwoStatePreference) this).f1643b = C1164ll.m19316a(obtainStyledAttributes, 3, 2, false);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: c */
    private final void m1503c(View view) {
        boolean z = view instanceof CompoundButton;
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(((TwoStatePreference) this).f1642a);
        }
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.f1550c);
        }
    }

    /* renamed from: a */
    public final void mo1955a(View view) {
        mo2008l();
        if (((AccessibilityManager) this.f1595k.getSystemService("accessibility")).isEnabled()) {
            m1503c(view.findViewById(16908289));
            mo2031b(view.findViewById(16908304));
        }
    }

    /* renamed from: a */
    public final void mo1956a(aoq aoq) {
        super.mo1956a(aoq);
        m1503c(aoq.mo2241c(16908289));
        mo2032b(aoq);
    }
}
