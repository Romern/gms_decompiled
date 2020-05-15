package p000;

import com.google.android.chimera.Fragment;
import com.google.android.chimera.FragmentManager;

/* renamed from: hbn */
final /* synthetic */ class hbn implements C0038ax {

    /* renamed from: a */
    private final hbp f19422a;

    public hbn(hbp hbp) {
        this.f19422a = hbp;
    }

    /* renamed from: a */
    public final void mo2511a(Object obj) {
        hbp hbp = this.f19422a;
        if (((Boolean) ((bmxv) obj).mo66814b()).booleanValue()) {
            FragmentManager childFragmentManager = hbp.getChildFragmentManager();
            Fragment findFragmentById = childFragmentManager.findFragmentById(hbp.f19424a);
            Fragment findFragmentById2 = childFragmentManager.findFragmentById(hbp.f19425b);
            if (findFragmentById != null && findFragmentById2 != null) {
                childFragmentManager.beginTransaction().remove(findFragmentById).commitNow();
            }
        }
    }
}
