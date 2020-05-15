package p000;

import android.view.View;
import com.google.android.chimera.Activity;
import com.google.android.gms.nearby.sharing.ReceiveSurfaceChimeraActivity;

/* renamed from: ajou */
public final /* synthetic */ class ajou implements View.OnClickListener {

    /* renamed from: a */
    private final ReceiveSurfaceChimeraActivity f71074a;

    public ajou(ReceiveSurfaceChimeraActivity receiveSurfaceChimeraActivity) {
        this.f71074a = receiveSurfaceChimeraActivity;
    }

    public void onClick(View view) {
        ReceiveSurfaceChimeraActivity receiveSurfaceChimeraActivity = this.f71074a;
        receiveSurfaceChimeraActivity.f80940l.mo44654a(true);
        aucb a = akij.m59822a((Activity) receiveSurfaceChimeraActivity);
        aucb a2 = akic.m59784a(receiveSurfaceChimeraActivity.getApplicationContext());
        aucb a3 = akiw.m59861a((Activity) receiveSurfaceChimeraActivity);
        aucu.m76781a(a, a2, receiveSurfaceChimeraActivity.f70615c.mo38905b(true), a3).mo50371a(new ajoe(receiveSurfaceChimeraActivity));
        a.mo50372a(new ajof(receiveSurfaceChimeraActivity));
        a2.mo50372a(new ajog(receiveSurfaceChimeraActivity));
        a3.mo50372a(new ajoh(receiveSurfaceChimeraActivity));
    }
}
