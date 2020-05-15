package com.google.android.gms.appinvite;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.chimera.Activity;
import com.google.android.chimera.FragmentManager;
import com.google.android.chimera.FragmentTransaction;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AppInviteAcceptInvitationChimeraActivity extends Activity {
    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 0 && i2 != -1) {
            StringBuilder sb = new StringBuilder(46);
            sb.append("Inline install failed. Error code: ");
            sb.append(i2);
            Log.e("AcceptInvitation", sb.toString());
        }
        finish();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent().getData() == null) {
            finish();
            return;
        }
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
        if (((fzh) supportFragmentManager.findFragmentByTag("progressFragment")) == null) {
            beginTransaction.add(fzh.m12776a(), "progressFragment");
        }
        if (supportFragmentManager.findFragmentByTag("acceptFragment") == null) {
            fuf fuf = new fuf();
            fuf.setRetainInstance(true);
            beginTransaction.add(fuf, "acceptFragment");
        }
        if (!beginTransaction.isEmpty()) {
            beginTransaction.commit();
        }
    }
}
