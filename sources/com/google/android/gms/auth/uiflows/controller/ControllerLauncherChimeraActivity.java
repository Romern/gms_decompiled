package com.google.android.gms.auth.uiflows.controller;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.FragmentActivity;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ControllerLauncherChimeraActivity extends FragmentActivity {

    /* renamed from: a */
    private static final sek f11514a = ght.m13171a("Addaccount", "ControllerLauncherActivity");

    /* renamed from: a */
    public static Intent m7062a(Context context, Controller controller) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("controller", controller);
        return new Intent().setClassName(context, "com.google.android.gms.auth.uiflows.controller.ControllerLauncherActivity").putExtra("wrapper_bundle", bundle);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle bundleExtra = getIntent().getBundleExtra("wrapper_bundle");
        if (bundleExtra == null) {
            f11514a.mo25420f("WrapperBundle is null.", new Object[0]);
            finish();
            return;
        }
        Controller controller = (Controller) bundleExtra.getParcelable("controller");
        if (controller == null) {
            f11514a.mo25420f("Controller is null.", new Object[0]);
            finish();
            return;
        }
        jxx.m17490a(this, controller, controller.mo7862a(null));
    }
}
