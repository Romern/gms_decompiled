package p000;

import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Fragment;

/* renamed from: gxl */
final /* synthetic */ class gxl implements C0038ax {

    /* renamed from: a */
    private final gxn f19176a;

    public gxl(gxn gxn) {
        this.f19176a = gxn;
    }

    /* renamed from: a */
    public final void mo2511a(Object obj) {
        Fragment fragment;
        gxn gxn = this.f19176a;
        int intValue = ((Integer) obj).intValue();
        bnhe bnhe = gxn.f19178a;
        Integer valueOf = Integer.valueOf(intValue);
        bmxy.m108591a(bnhe.containsKey(valueOf), "Unrecognized UI Type: %s", intValue);
        String str = (String) gxn.f19178a.get(valueOf);
        if (gxn.getChildFragmentManager().findFragmentByTag(str) == null) {
            if (intValue == 1) {
                fragment = new gyt();
            } else if (intValue == 2) {
                fragment = new gzd();
            } else {
                StringBuilder sb = new StringBuilder(33);
                sb.append("Unrecognized UI Type: ");
                sb.append(intValue);
                throw new IllegalArgumentException(sb.toString());
            }
            gxn.getChildFragmentManager().beginTransaction().replace(C0126R.C0129id.google_sign_in_container, fragment, str).commitNow();
        }
    }
}
