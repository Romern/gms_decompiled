package com.google.android.wallet.biometric;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.felicanetworks.mfc.C0126R;
import java.util.concurrent.Executor;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DeviceCredentialHandlerActivity extends deu {

    /* renamed from: b */
    private boolean f151792b;

    /* renamed from: a */
    public final void mo71779a(int i) {
        bjsk bjsk = bjsk.f123233a;
        if (bjsk == null) {
            Log.e("DeviceCredentialHandler", "onActivityResult: Bridge or callback was null!");
        } else if (i != -1) {
            bjsk.f123237e = 2;
            bjsk.f123236d = false;
            bjsk.mo65497b();
        } else {
            bjsk.f123237e = 1;
            bjsk.f123236d = false;
            bjsk.mo65497b();
        }
        finish();
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        mo71779a(i2);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        boolean z;
        bjsk a = bjsk.m104497a();
        int i = a.f123234b;
        super.onCreate(bundle);
        if (bundle == null || !bundle.getBoolean("did_change_configuration", false)) {
            z = false;
        } else {
            z = true;
        }
        this.f151792b = z;
        if (!z) {
            a.mo65498c();
        } else {
            this.f151792b = false;
        }
        setTitle((CharSequence) null);
        setContentView((int) C0126R.C0128layout.device_credential_handler_activity);
        Executor executor = a.f123235c;
        Log.e("DeviceCredentialHandler", "onCreate: Executor and/or callback was null!");
        finish();
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        super.onPause();
        bjsk bjsk = bjsk.f123233a;
        if (isChangingConfigurations() && bjsk != null) {
            if (bjsk.f123238f == 0) {
                bjsk.f123238f = 1;
            }
            this.f151792b = true;
        }
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("did_change_configuration", this.f151792b);
    }
}
