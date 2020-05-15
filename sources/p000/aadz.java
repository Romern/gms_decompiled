package p000;

import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;

/* renamed from: aadz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aadz {
    static {
        srn.m36126a("ChimeraAndroidInjection", sgj.GAMES);
    }

    /* renamed from: a */
    public static void m21130a(Fragment fragment) {
        cays cays;
        bmxy.m108582a(fragment, "fragment");
        Fragment fragment2 = fragment;
        while (true) {
            fragment2 = fragment2.getParentFragment();
            if (fragment2 != null) {
                if (fragment2 instanceof cays) {
                    cays = (cays) fragment2;
                    break;
                }
            } else {
                Activity activity = fragment.getActivity();
                if (activity instanceof cays) {
                    cays = (cays) activity;
                } else {
                    throw new IllegalStateException("Unable to find a parent that implements HasAndroidInjector");
                }
            }
        }
        fragment.getClass().getCanonicalName();
        cays.getClass().getCanonicalName();
        cayp e = cays.mo19363e();
        bmxy.m108587a(e, "%s.androidInjector() returned null", cays.getClass());
        e.mo75183a(fragment);
    }
}
