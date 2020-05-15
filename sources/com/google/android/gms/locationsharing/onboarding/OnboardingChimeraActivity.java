package com.google.android.gms.locationsharing.onboarding;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.location.LocationRequest;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class OnboardingChimeraActivity extends Activity implements aetx, aesu {

    /* renamed from: c */
    private static final srn f79655c = srn.m36127a(sgj.LOCATION_SHARING);

    /* renamed from: a */
    public aetp f79656a;

    /* renamed from: b */
    public String f79657b;

    /* renamed from: d */
    private final LoaderManager.LoaderCallbacks f79658d = new aets(this);

    /* renamed from: a */
    private final void m67029a() {
        setResult(-1);
        finish();
    }

    /* renamed from: b */
    private final void m67030b() {
        setResult(0);
        finish();
    }

    /* renamed from: c */
    public final void mo34527c(String str) {
        if ("dialog_lh_error".equals(str)) {
            aert.m52469a(this);
            m67030b();
        }
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 0 && i2 == -1) {
            m67029a();
        } else {
            m67030b();
        }
    }

    public final void onBackPressed() {
        aetk a;
        aetp aetp = this.f79656a;
        if (!(aetp == null || (a = aetp.mo34555a()) == null)) {
            a.mo34554c(6);
        }
        super.onBackPressed();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = Build.VERSION.SDK_INT;
        getWindow().setStatusBarColor(0);
        setContentView((int) C0126R.C0128layout.location_sharing_fragment_container);
        if (!aext.m52661a(this, getIntent(), getCallingActivity())) {
            bnsl bnsl = (bnsl) f79655c.mo68390d();
            bnsl.mo68432a("com.google.android.gms.locationsharing.onboarding.OnboardingChimeraActivity", "onCreate", 101, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Calling Activity is not whitelisted for Location Sharing settings.");
            finish();
            return;
        }
        Intent intent = getIntent();
        boolean booleanExtra = intent.getBooleanExtra("has_signed_tos", true);
        boolean booleanExtra2 = intent.getBooleanExtra("is_location_history_enabled", true);
        String stringExtra = intent.getStringExtra("account_name");
        this.f79657b = stringExtra;
        if (stringExtra == null) {
            finish();
        } else if (booleanExtra && booleanExtra2) {
            m67029a();
        } else {
            setTitle((int) C0126R.string.location_sharing_tos_activity_title);
            aetp aetp = (aetp) getSupportFragmentManager().findFragmentById(C0126R.C0129id.fragment_container);
            this.f79656a = aetp;
            if (aetp == null) {
                getSupportLoaderManager().initLoader(3, intent.getExtras(), this.f79658d);
                aexw.m52664a(this, C0126R.string.common_loading, true);
            }
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        aexw.m52662a(this);
    }

    /* renamed from: a */
    public final void mo34525a(String str) {
        if ("dialog_lh_error".equals(str)) {
            m67030b();
        }
    }

    /* renamed from: b */
    public final void mo34526b(String str) {
        if ("dialog_lh_error".equals(str)) {
            m67030b();
        }
    }

    /* renamed from: a */
    public final void mo34560a(boolean z) {
        if (z) {
            getSupportFragmentManager().beginTransaction().remove(this.f79656a).commitAllowingStateLoss();
            aesv a = aesv.m52523a(getString(C0126R.string.location_sharing_location_history_activity_title), getString(C0126R.string.location_sharing_enable_location_reporting_error, new Object[]{this.f79657b}), getString(C0126R.string.location_sharing_open_location_settings), getString(17039360));
            FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
            beginTransaction.add(a, "dialog_lh_error");
            beginTransaction.commitAllowingStateLoss();
            return;
        }
        LocationRequest a2 = LocationRequest.m66854a();
        a2.mo43553c(100);
        aerj aerj = new aerj();
        aerj.mo34489a(a2);
        aerj.mo34490b();
        startActivityForResult(aerj.mo34488a(), 0);
    }
}
