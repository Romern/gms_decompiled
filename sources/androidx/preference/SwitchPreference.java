package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.Switch;
import com.felicanetworks.mfc.C0126R;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SwitchPreference extends TwoStatePreference {

    /* renamed from: c */
    private final aov f1636c;

    /* renamed from: d */
    private CharSequence f1637d;

    /* renamed from: e */
    private CharSequence f1638e;

    public SwitchPreference(Context context) {
        this(context, null);
    }

    /* renamed from: c */
    private final void m1614c(View view) {
        boolean z = view instanceof Switch;
        if (z) {
            ((Switch) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(((TwoStatePreference) this).f1642a);
        }
        if (z) {
            Switch switchR = (Switch) view;
            switchR.setTextOn(this.f1637d);
            switchR.setTextOff(this.f1638e);
            switchR.setOnCheckedChangeListener(this.f1636c);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ll.a(android.content.res.TypedArray, int, int, boolean):boolean
     arg types: [android.content.res.TypedArray, int, int, int]
     candidates:
      ll.a(android.content.res.TypedArray, int, int, int):int
      ll.a(android.content.res.TypedArray, org.xmlpull.v1.XmlPullParser, java.lang.String, int):int
      ll.a(android.content.res.Resources, android.content.res.Resources$Theme, android.util.AttributeSet, int[]):android.content.res.TypedArray
      ll.a(android.content.res.TypedArray, int, int, boolean):boolean */
    /* JADX WARNING: Illegal instructions before constructor call */
    public SwitchPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, r0, 0);
        int a = C1164ll.m19309a(context, (int) C0126R.attr.switchPreferenceStyle, 16843629);
        this.f1636c = new aov(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, aor.f1911k, a, 0);
        mo2033c((CharSequence) C1164ll.m19314a(obtainStyledAttributes, 7, 0));
        mo2034d((CharSequence) C1164ll.m19314a(obtainStyledAttributes, 6, 1));
        this.f1637d = C1164ll.m19314a(obtainStyledAttributes, 9, 3);
        mo1958b();
        this.f1638e = C1164ll.m19314a(obtainStyledAttributes, 8, 4);
        mo1958b();
        ((TwoStatePreference) this).f1643b = C1164ll.m19316a(obtainStyledAttributes, 5, 2, false);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public final void mo1955a(View view) {
        mo2008l();
        if (((AccessibilityManager) this.f1595k.getSystemService("accessibility")).isEnabled()) {
            m1614c(view.findViewById(16908352));
            mo2031b(view.findViewById(16908304));
        }
    }

    /* renamed from: a */
    public final void mo1956a(aoq aoq) {
        super.mo1956a(aoq);
        m1614c(aoq.mo2241c(16908352));
        mo2032b(aoq);
    }
}
