package androidx.preference;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import com.felicanetworks.mfc.C0126R;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C1164ll.m19309a(context, (int) C0126R.attr.preferenceCategoryStyle, 16842892), null);
    }

    /* renamed from: a */
    public final void mo1956a(aoq aoq) {
        super.mo1956a(aoq);
        int i = Build.VERSION.SDK_INT;
        aoq.f201a.setAccessibilityHeading(true);
    }

    /* renamed from: c */
    public final boolean mo1963c() {
        return !super.mo2005i();
    }

    /* renamed from: i */
    public final boolean mo2005i() {
        return false;
    }
}
