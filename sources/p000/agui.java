package p000;

import android.support.p002v7.widget.RecyclerView;
import com.google.android.gms.mobiledataplan.p055ui.MobileDataPlanSettingsChimeraActivity;

/* renamed from: agui */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agui extends abz {

    /* renamed from: a */
    final /* synthetic */ C1341rz f66573a;

    /* renamed from: b */
    final /* synthetic */ MobileDataPlanSettingsChimeraActivity f66574b;

    public agui(MobileDataPlanSettingsChimeraActivity mobileDataPlanSettingsChimeraActivity, C1341rz rzVar) {
        this.f66574b = mobileDataPlanSettingsChimeraActivity;
        this.f66573a = rzVar;
    }

    /* renamed from: a */
    public final void mo271a(RecyclerView recyclerView, int i, int i2) {
        C1341rz rzVar = this.f66573a;
        float f = 0.0f;
        if (!(recyclerView.getChildCount() == 0 || recyclerView.getChildAt(0).getTop() == 0)) {
            f = this.f66574b.f80331b;
        }
        rzVar.mo15839a(f);
    }
}
