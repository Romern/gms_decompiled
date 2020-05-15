package com.google.android.gms.rcs;

import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class RcsModuleInitIntentOperation extends qlf {

    /* renamed from: a */
    private static final sek f83469a = aope.m66267a("RcsModuleInitIntentOperation");

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6343a(Intent intent) {
        f83469a.mo25412b("Boot completed: %s", intent);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo17616b(Intent intent) {
        f83469a.mo25412b("Locked boot completed: %s", intent);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6344a(Intent intent, int i) {
        f83469a.mo25412b("Init runtime state: %s", intent);
        startService(aopd.m66266a(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo6536b(Intent intent, boolean z) {
        f83469a.mo25412b("Container update. Module updated: %b", Boolean.valueOf(z));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6268a(Intent intent, boolean z) {
        f83469a.mo25412b("Module update. Container updated: %b", Boolean.valueOf(z));
    }
}
