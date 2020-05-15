package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.p002v7.widget.SwitchCompat;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import com.felicanetworks.mfc.C0126R;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SwitchPreferenceCompat extends TwoStatePreference {

    /* renamed from: c */
    private final aow f1639c;

    /* renamed from: d */
    private CharSequence f1640d;

    /* renamed from: e */
    private CharSequence f1641e;

    public SwitchPreferenceCompat(Context context) {
        this(context, null);
    }

    /* renamed from: c */
    private final void m1617c(View view) {
        boolean z = view instanceof SwitchCompat;
        if (z) {
            ((SwitchCompat) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(((TwoStatePreference) this).f1642a);
        }
        if (z) {
            SwitchCompat switchCompat = (SwitchCompat) view;
            switchCompat.f1295a = this.f1640d;
            switchCompat.requestLayout();
            switchCompat.f1296b = this.f1641e;
            switchCompat.requestLayout();
            switchCompat.setOnCheckedChangeListener(this.f1639c);
        }
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0126R.attr.switchPreferenceCompatStyle);
    }

    /* renamed from: a */
    public final void mo1955a(View view) {
        mo2008l();
        if (((AccessibilityManager) this.f1595k.getSystemService("accessibility")).isEnabled()) {
            m1617c(view.findViewById(C0126R.C0129id.switchWidget));
            mo2031b(view.findViewById(16908304));
        }
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ll.a(android.content.res.TypedArray, int, int, boolean):boolean
     arg types: [android.content.res.TypedArray, int, int, int]
     candidates:
      ll.a(android.content.res.TypedArray, int, int, int):int
      ll.a(android.content.res.TypedArray, org.xmlpull.v1.XmlPullParser, java.lang.String, int):int
      ll.a(android.content.res.Resources, android.content.res.Resources$Theme, android.util.AttributeSet, int[]):android.content.res.TypedArray
      ll.a(android.content.res.TypedArray, int, int, boolean):boolean */
    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f1639c = new aow(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, aor.f1912l, i, i2);
        mo2033c((CharSequence) C1164ll.m19314a(obtainStyledAttributes, 7, 0));
        mo2034d((CharSequence) C1164ll.m19314a(obtainStyledAttributes, 6, 1));
        this.f1640d = C1164ll.m19314a(obtainStyledAttributes, 9, 3);
        mo1958b();
        this.f1641e = C1164ll.m19314a(obtainStyledAttributes, 8, 4);
        mo1958b();
        ((TwoStatePreference) this).f1643b = C1164ll.m19316a(obtainStyledAttributes, 5, 2, false);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public void mo1956a(aoq aoq) {
        super.mo1956a(aoq);
        m1617c(aoq.mo2241c(C0126R.C0129id.switchWidget));
        mo2032b(aoq);
    }
}
