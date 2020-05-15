package com.google.android.gms.telephonyspam.base;

import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class TelephonySpamInitIntentOperation extends qlf {

    /* renamed from: a */
    private static final audg f109046a = audg.m76790a("TelephonySpamInit");

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: qlf.a(android.content.Intent, boolean):void
     arg types: [android.content.Intent, int]
     candidates:
      com.google.android.gms.telephonyspam.base.TelephonySpamInitIntentOperation.a(android.content.Intent, int):void
      qlf.a(android.content.Intent, int):void
      qlf.a(android.content.Intent, boolean):void */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6343a(Intent intent) {
        f109046a.mo50423b("On boot completed TelephonySpam module initialized");
        mo6268a(intent, true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6344a(Intent intent, int i) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6268a(Intent intent, boolean z) {
        f109046a.mo50423b("onModuleUpdated TelephonySpam module initialized");
        auey.m76961a();
    }
}
