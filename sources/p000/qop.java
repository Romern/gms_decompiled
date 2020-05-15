package p000;

import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.FragmentManager;
import com.google.android.gms.chimera.debug.ChimeraDebugChimeraActivity;

/* renamed from: qop */
final /* synthetic */ class qop implements Runnable {

    /* renamed from: a */
    private final qoq f41886a;

    /* renamed from: b */
    private final int f41887b;

    public qop(qoq qoq, int i) {
        this.f41886a = qoq;
        this.f41887b = i;
    }

    public final void run() {
        Fragment findFragmentById;
        qoq qoq = this.f41886a;
        if (this.f41887b == 0) {
            ChimeraDebugChimeraActivity chimeraDebugChimeraActivity = qoq.f41888a;
            chimeraDebugChimeraActivity.mo17641g();
            FragmentManager supportFragmentManager = chimeraDebugChimeraActivity.getSupportFragmentManager();
            if (!(supportFragmentManager == null || (findFragmentById = supportFragmentManager.findFragmentById(C0126R.C0129id.fragment_container)) == null || !"tag_messageFragment".equals(findFragmentById.getTag()))) {
                supportFragmentManager.popBackStack();
            }
        }
        qoq.f41888a.mo17644j();
    }
}
