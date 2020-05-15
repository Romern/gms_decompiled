package p000;

import com.google.android.chimera.Fragment;
import com.google.android.chimera.FragmentManager;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: hfm */
final /* synthetic */ class hfm implements C0038ax {

    /* renamed from: a */
    private final hfp f19667a;

    public hfm(hfp hfp) {
        this.f19667a = hfp;
    }

    /* renamed from: a */
    public final void mo2511a(Object obj) {
        Fragment fragment;
        hfp hfp = this.f19667a;
        int intValue = ((Integer) obj).intValue();
        String str = (String) hfp.f19671a.get(Integer.valueOf(intValue));
        if (str != null) {
            FragmentManager childFragmentManager = hfp.getChildFragmentManager();
            if (childFragmentManager.findFragmentByTag(str) == null) {
                Fragment findFragmentById = childFragmentManager.findFragmentById(hfp.f19673c.f19585c);
                if (intValue == 1) {
                    fragment = new hhx();
                } else if (intValue == 2) {
                    fragment = new hhv();
                } else if (intValue == 3) {
                    fragment = new hhn();
                } else {
                    StringBuilder sb = new StringBuilder(39);
                    sb.append("Unrecognized fragment type: ");
                    sb.append(intValue);
                    throw new IllegalStateException(sb.toString());
                }
                BottomSheetBehavior bottomSheetBehavior = hfp.f19672b;
                if (bottomSheetBehavior != null && findFragmentById == null) {
                    bottomSheetBehavior.mo71025a(0);
                }
                hfp.f19673c.mo12438a(fragment, str);
                return;
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder(39);
        sb2.append("Unrecognized fragment type: ");
        sb2.append(intValue);
        throw new IllegalStateException(sb2.toString());
    }
}
