package com.google.android.gms.nearby.discovery.fastpair;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.Activity;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CompanionAppInstallChimeraActivity extends Activity {
    /* renamed from: a */
    public static Intent m67323a(Context context, String str) {
        return busm.m120388a(context, sbv.m34879b(str));
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        srn srn = ahsd.f67925a;
        finish();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent().hasExtra("intent")) {
            srn srn = ahsd.f67925a;
            startActivityForResult((Intent) getIntent().getParcelableExtra("intent"), 1000);
        }
        finish();
    }
}
