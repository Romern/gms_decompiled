package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import com.felicanetworks.mfc.C0126R;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class PreferenceScreen extends PreferenceGroup {

    /* renamed from: d */
    public boolean f1620d = true;

    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C1164ll.m19309a(context, (int) C0126R.attr.preferenceScreenStyle, 16842891));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo1957a() {
        aol aol;
        if (this.f1604t == null && this.f1605u == null && mo2023g() != 0 && (aol = this.f1596l.f1887f) != null) {
            aol.mo2232a(this);
        }
    }

    /* renamed from: w */
    public final boolean mo2026w() {
        return false;
    }
}
