package com.google.android.gms.car;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.Activity;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BroadcastRedirectActivityImpl extends Activity {
    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = new Intent(getIntent());
        intent.setComponent(null);
        aki.m919a(this).mo874a(intent);
        finish();
    }
}
