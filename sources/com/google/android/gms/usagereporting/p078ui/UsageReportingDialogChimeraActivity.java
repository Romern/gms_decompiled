package com.google.android.gms.usagereporting.p078ui;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.FragmentActivity;
import com.google.android.chimera.FragmentManager;

/* renamed from: com.google.android.gms.usagereporting.ui.UsageReportingDialogChimeraActivity */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class UsageReportingDialogChimeraActivity extends FragmentActivity {

    /* renamed from: a */
    protected boolean f109550a = false;

    /* renamed from: b */
    private int f109551b = -1;

    /* renamed from: c */
    private String f109552c;

    /* renamed from: a */
    public final void mo59696a(String str) {
        startService(new Intent(str).putExtras(getIntent().getExtras()).setPackage("com.google.android.gms"));
        spn.m35853a(this, this.f109551b, this.f109552c, 0);
        finish();
        this.f109550a = true;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        this.f109551b = intent.getIntExtra("pid", -1);
        this.f109552c = intent.getStringExtra("stack_trace");
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager.findFragmentByTag("UsageReportingDialog") == null) {
            avvu avvu = new avvu();
            avvu.setCancelable(false);
            avvu.setRetainInstance(true);
            avvu.show(supportFragmentManager, "UsageReportingDialog");
        }
    }

    public final void onStop() {
        super.onStop();
        if (!this.f109550a) {
            mo59696a("com.google.android.gms.usagereporting.OPTOUT_UR");
        }
    }
}
