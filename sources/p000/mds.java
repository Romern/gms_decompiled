package p000;

import com.google.android.chimera.Fragment;
import com.google.android.gms.backup.d2d.component.D2dSourceChimeraActivity;

/* renamed from: mds */
public final /* synthetic */ class mds implements Runnable {

    /* renamed from: a */
    private final String f33492a;

    /* renamed from: b */
    private final mga f33493b;

    public mds(mga mga, String str) {
        this.f33493b = mga;
        this.f33492a = str;
    }

    public final void run() {
        mga mga = this.f33493b;
        String str = this.f33492a;
        D2dSourceChimeraActivity d2dSourceChimeraActivity = mga.f33612a;
        lvn lvn = D2dSourceChimeraActivity.f29016a;
        d2dSourceChimeraActivity.f29020d = str;
        Fragment b = d2dSourceChimeraActivity.mo17224b(d2dSourceChimeraActivity.f29022f);
        if (b instanceof mnj) {
            ((mnj) b).mo20183a(d2dSourceChimeraActivity.f29020d);
        }
    }
}
