package com.google.android.gms.plus.oob;

import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.FragmentManager;
import com.google.android.chimera.FragmentTransaction;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class UpgradeAccountInfoChimeraActivity extends anyz implements anzd {

    /* renamed from: d */
    private Fragment f82598d;

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo42408a() {
    }

    /* renamed from: f */
    public final void mo42483f() {
        setResult(0);
        finish();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C0126R.C0128layout.plus_oob_upgrade_account_activity);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag("content_fragment");
        this.f82598d = findFragmentByTag;
        if (findFragmentByTag == null) {
            Bundle extras = getIntent().getExtras();
            this.f82598d = anze.m65631a(mo42476c(), extras.getString("title"), extras.getString("text"), extras.getString("button_text"));
            FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
            beginTransaction.add(C0126R.C0129id.content_layout, this.f82598d, "content_fragment");
            beginTransaction.commit();
        }
    }
}
