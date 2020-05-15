package p000;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;

/* renamed from: be */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0046be extends Fragment {
    /* renamed from: a */
    public static void m2751a(Activity activity) {
        int i = Build.VERSION.SDK_INT;
        activity.registerActivityLifecycleCallbacks(new C0045bd());
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new C0046be(), "android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        C0005ad adVar = C0005ad.ON_CREATE;
        int i = Build.VERSION.SDK_INT;
    }

    public final void onDestroy() {
        super.onDestroy();
        C0005ad adVar = C0005ad.ON_CREATE;
        int i = Build.VERSION.SDK_INT;
    }

    public final void onPause() {
        super.onPause();
        C0005ad adVar = C0005ad.ON_CREATE;
        int i = Build.VERSION.SDK_INT;
    }

    public final void onResume() {
        super.onResume();
        C0005ad adVar = C0005ad.ON_CREATE;
        int i = Build.VERSION.SDK_INT;
    }

    public final void onStart() {
        super.onStart();
        C0005ad adVar = C0005ad.ON_CREATE;
        int i = Build.VERSION.SDK_INT;
    }

    public final void onStop() {
        super.onStop();
        C0005ad adVar = C0005ad.ON_CREATE;
        int i = Build.VERSION.SDK_INT;
    }

    /* renamed from: a */
    static void m2752a(Activity activity, C0005ad adVar) {
        if (activity instanceof C0016an) {
            ((C0016an) activity).mo1063a().mo1023a(adVar);
        } else if (activity instanceof C0013ak) {
            C0008af lifecycle = ((C0013ak) activity).getLifecycle();
            if (lifecycle instanceof C0015am) {
                ((C0015am) lifecycle).mo1023a(adVar);
            }
        }
    }
}
