package p000;

import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.FragmentManager;
import com.google.android.chimera.FragmentTransaction;

/* renamed from: hfu */
final /* synthetic */ class hfu implements C0038ax {

    /* renamed from: a */
    private final hfv f19685a;

    public hfu(hfv hfv) {
        this.f19685a = hfv;
    }

    /* renamed from: a */
    public final void mo2511a(Object obj) {
        Fragment fragment;
        hfv hfv = this.f19685a;
        int intValue = ((Integer) obj).intValue();
        String str = (String) hfv.f19686a.get(Integer.valueOf(intValue));
        if (str != null) {
            FragmentManager childFragmentManager = hfv.getChildFragmentManager();
            if (childFragmentManager.findFragmentByTag(str) == null) {
                if (intValue == 1) {
                    fragment = hhj.m14350a(hfv.f19687b);
                } else if (intValue == 2) {
                    fragment = new hhk();
                } else {
                    StringBuilder sb = new StringBuilder(39);
                    sb.append("Unrecognized fragment type: ");
                    sb.append(intValue);
                    throw new IllegalStateException(sb.toString());
                }
                FragmentTransaction beginTransaction = childFragmentManager.beginTransaction();
                beginTransaction.replace(C0126R.C0129id.main_container, fragment, str);
                beginTransaction.commitNow();
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
