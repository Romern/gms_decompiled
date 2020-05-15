package p000;

import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.mobiledataplan.p055ui.MobileDataPlanSettingsChimeraActivity;
import java.lang.ref.WeakReference;

/* renamed from: agvm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agvm {

    /* renamed from: a */
    private static WeakReference f66662a = null;

    /* renamed from: a */
    public static void m55175a() {
        WeakReference weakReference = f66662a;
        if (weakReference != null && weakReference.get() != null) {
            ((bhnh) f66662a.get()).mo64021d();
            f66662a = null;
        }
    }

    /* renamed from: a */
    public static void m55176a(agtw agtw, bxyk bxyk) {
        bxyk a = bxzt.m124580a(System.currentTimeMillis());
        MobileDataPlanSettingsChimeraActivity mobileDataPlanSettingsChimeraActivity = agtw.f66529a;
        String string = mobileDataPlanSettingsChimeraActivity.getString(C0126R.string.refreshing, new Object[]{agze.m55337b(mobileDataPlanSettingsChimeraActivity, bxyk, a)});
        m55177a(agtw, string, false);
        agrl.m54942a().mo35987a(53, string, (String) null, bygd.CACHING_LOADING_SNACKBAR_SHOWN, System.currentTimeMillis(), agvh.m55172b());
    }

    /* renamed from: a */
    public static void m55177a(agtw agtw, String str, boolean z) {
        if (agtw.f66529a != null) {
            if (f66662a != null) {
                m55175a();
            }
            bhnh a = bhnh.m101202a(agtw.f66529a.findViewById(C0126R.C0129id.coordinator_layout), str, -2);
            if (z) {
                a.mo64030a((int) C0126R.string.common_retry, new agvl(agtw));
            } else if (cflu.m139984b()) {
                a.f119111f = (int) cflu.m139986d();
            }
            a.mo64020c();
            f66662a = new WeakReference(a);
        }
    }
}
