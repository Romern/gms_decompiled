package com.google.android.gms.mdi.download.service;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class MddModuleInitIntentOperation extends qlf {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6344a(Intent intent, int i) {
        Context baseContext = getBaseContext();
        if ((i & 12) > 0 || (i & 2) > 0) {
            MddGcmTaskChimeraService.m67182b();
            afol.m53356a(baseContext, new afoq(baseContext, new bbfi(baseContext), afor.m53373a(baseContext)));
        }
    }
}
