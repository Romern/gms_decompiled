package p000;

import com.google.android.chimera.Fragment;
import com.google.android.chimera.FragmentManager;
import com.google.android.chimera.FragmentTransaction;

/* renamed from: hbm */
final /* synthetic */ class hbm implements C0038ax {

    /* renamed from: a */
    private final hbp f19421a;

    public hbm(hbp hbp) {
        this.f19421a = hbp;
    }

    /* renamed from: a */
    public final void mo2511a(Object obj) {
        Fragment fragment;
        int i;
        hbp hbp = this.f19421a;
        int intValue = ((Integer) obj).intValue();
        String str = (String) hbp.f19426c.get(Integer.valueOf(intValue));
        if (str != null) {
            FragmentManager childFragmentManager = hbp.getChildFragmentManager();
            if (childFragmentManager.findFragmentByTag(str) == null) {
                if (intValue == 1) {
                    fragment = new hcc();
                    i = hbp.f19424a;
                } else if (intValue == 2) {
                    fragment = hbu.m14178a(hbp.f19427d);
                    i = hbp.f19424a;
                } else if (intValue == 3) {
                    fragment = new hbz();
                    i = hbp.f19425b;
                } else {
                    StringBuilder sb = new StringBuilder(39);
                    sb.append("Unrecognized fragment type: ");
                    sb.append(intValue);
                    throw new IllegalStateException(sb.toString());
                }
                FragmentTransaction beginTransaction = childFragmentManager.beginTransaction();
                beginTransaction.replace(i, fragment, str);
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
