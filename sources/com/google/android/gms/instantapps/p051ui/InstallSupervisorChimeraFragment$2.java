package com.google.android.gms.instantapps.p051ui;

import android.content.Context;
import android.content.Intent;

/* renamed from: com.google.android.gms.instantapps.ui.InstallSupervisorChimeraFragment$2 */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class InstallSupervisorChimeraFragment$2 extends aacn {

    /* renamed from: a */
    final /* synthetic */ adlp f79237a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InstallSupervisorChimeraFragment$2(adlp adlp, String str) {
        super(str);
        this.f79237a = adlp;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        int intExtra = intent.getIntExtra("package_event", -1);
        adfs adfs = adlp.f62123a;
        new Object[1][0] = Integer.valueOf(intExtra);
        this.f79237a.mo33636a(intExtra);
    }
}
