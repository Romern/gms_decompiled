package p000;

import android.app.Application;
import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.config.ModuleManager;

/* renamed from: adun */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adun extends Fragment {

    /* renamed from: a */
    private static final srn f62774a = srn.m36127a(sgj.KIDS);

    /* renamed from: b */
    private C0061bs f62775b;

    /* renamed from: c */
    private C0060br f62776c;

    /* renamed from: a */
    public final C0060br mo33834a(Activity activity) {
        ModuleManager.ModuleInfo moduleInfo;
        C0060br brVar = this.f62776c;
        if (brVar != null) {
            return brVar;
        }
        Application application = activity.getApplication();
        try {
            moduleInfo = ModuleManager.get(activity).getCurrentModule();
        } catch (IllegalStateException e) {
            moduleInfo = (ModuleManager.ModuleInfo) adum.f62773a.mo66814b();
        }
        adui adui = new adui(application, moduleInfo);
        this.f62775b = new C0061bs();
        C0060br brVar2 = new C0060br(this.f62775b, adui);
        this.f62776c = brVar2;
        return brVar2;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
    }

    public final void onDestroy() {
        super.onDestroy();
        C0061bs bsVar = this.f62775b;
        if (bsVar != null) {
            bsVar.mo3468a();
            String str = null;
            this.f62775b = null;
            this.f62776c = null;
            Fragment parentFragment = getParentFragment();
            if (parentFragment != null) {
                str = parentFragment.getClass().getName();
            } else {
                Activity activity = getActivity();
                if (activity != null) {
                    str = activity.getClass().getName();
                }
            }
            ((bnsl) f62774a.mo68390d()).mo68420a("Clearing view model store for %s", str);
        }
    }
}
