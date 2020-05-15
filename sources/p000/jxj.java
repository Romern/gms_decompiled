package p000;

import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;

/* renamed from: jxj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class jxj {
    /* renamed from: a */
    public static ims m17464a(Activity activity, Bundle bundle) {
        Bundle bundle2 = null;
        if (bundle != null) {
            bundle2 = bundle.getBundle("com.google.android.gms.auth.ui.UiState");
        } else if (!(activity.getIntent() == null || activity.getIntent().getExtras() == null || (bundle2 = activity.getIntent().getExtras().getBundle("ControlledActivity.indirection_key")) != null)) {
            bundle2 = activity.getIntent().getExtras();
        }
        return new ims(bundle2);
    }

    /* renamed from: a */
    public static ims m17465a(Fragment fragment, Bundle bundle) {
        Bundle bundle2;
        if (bundle != null) {
            bundle2 = bundle.getBundle("com.google.android.gms.auth.ui.UiState");
        } else {
            bundle2 = null;
        }
        if (bundle2 == null) {
            bundle2 = fragment.getArguments();
        }
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        return new ims(bundle2);
    }

    /* renamed from: a */
    public static void m17466a(ims ims, Bundle bundle) {
        bundle.putBundle("com.google.android.gms.auth.ui.UiState", ims.f21367a);
    }
}
