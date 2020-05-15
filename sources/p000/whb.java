package p000;

import android.support.p002v7.widget.Toolbar;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;

/* renamed from: whb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class whb {
    /* renamed from: a */
    public static void m41941a(Toolbar toolbar, String str, Activity activity) {
        toolbar.mo1679a(str);
        toolbar.getChildAt(0).setFocusable(true);
        toolbar.mo1681b(aux.m2149a(toolbar.getResources(), C0126R.C0127drawable.quantum_ic_arrow_back_vd_theme_24, toolbar.getContext().getTheme()));
        toolbar.mo1684c((int) C0126R.string.fm_navigate_up);
        toolbar.mo1678a(new wha(activity));
        if (cdsq.m134846b()) {
            toolbar.mo1674a(2132018553);
        }
    }
}
