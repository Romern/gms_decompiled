package p000;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.FragmentManager;

/* renamed from: fbt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fbt {
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ps.g(android.view.View, float):void
     arg types: [android.view.View, int]
     candidates:
      ps.g(android.view.View, int):void
      ps.g(android.view.View, float):void */
    /* renamed from: a */
    public static void m11409a(Context context, FragmentManager fragmentManager, Fragment fragment, String str, fbs fbs) {
        Fragment findFragmentByTag;
        if (fbs.f16236l && (findFragmentByTag = fragmentManager.findFragmentByTag(str)) != null) {
            C1280ps.m19921g(findFragmentByTag.getView(), -1.0f);
        }
        if (cbro.f178167a.mo6606a().mo75281a()) {
            int i = Build.VERSION.SDK_INT;
            if (Settings.Global.getFloat(context.getContentResolver(), "window_animation_scale", 0.0f) == 0.0f && Settings.Global.getFloat(context.getContentResolver(), "transition_animation_scale", 0.0f) == 0.0f && Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 0.0f) == 0.0f) {
                fbs = fbs.INSTANT;
            }
        }
        fragmentManager.beginTransaction().setCustomAnimations(fbs.f16234j, fbs.f16235k).replace(C0126R.C0129id.fragment_container, fragment, str).commitNow();
    }

    /* renamed from: a */
    public static void m11410a(Fragment fragment, Fragment fragment2, String str, fbs fbs) {
        m11409a(fragment.getContext(), fragment.getChildFragmentManager(), fragment2, str, fbs);
    }

    /* renamed from: a */
    public static void m11411a(Fragment fragment, fek fek) {
        Fragment.SavedState savedState;
        if (fek != null && fragment.getClass().getName().equals(fek.f16385a) && (savedState = fek.f16386b) != null) {
            fragment.setInitialSavedState(savedState);
        }
    }

    /* renamed from: a */
    public static boolean m11412a(Activity activity, String str) {
        return activity.getSupportFragmentManager().findFragmentByTag(str) != null;
    }
}
