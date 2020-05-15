package com.google.android.gms.backup.transport.component;

import android.content.Context;
import android.content.Intent;
import android.os.Build;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CallLogFlagSetter extends qlf {

    /* renamed from: a */
    private static final lvn f29218a = new lvn("CallLogFlagSetter");

    /* renamed from: b */
    private final lvr f29219b = lvr.f33060a;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: lvr.a(android.content.Context, boolean):void
     arg types: [com.google.android.gms.backup.transport.component.CallLogFlagSetter, int]
     candidates:
      lvr.a(android.content.Context, int):void
      lvr.a(android.content.Context, long):void
      lvr.a(android.content.Context, boolean):void */
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo6536b(Intent intent, boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (sre.m36080a(this)) {
            f29218a.mo25414c("Not enabling call log backup; current device is a sidewinder device.", new Object[0]);
        } else if (!ccmk.m130670b()) {
            f29218a.mo25414c("Not whitelisted for call log backup.", new Object[0]);
        } else if (this.f29219b.mo19655b(this)) {
            f29218a.mo25414c("Whitelisted for call log backup; backup_enabled flag already enabled.", new Object[0]);
        } else if (!this.f29219b.mo19660e(this)) {
            f29218a.mo25414c("Whitelisted for call log backup, but not enabling because user_full_data_backup_aware not set.", new Object[0]);
        } else {
            f29218a.mo25414c("Whitelisted for call log backup; enabling backup_enabled flag.", new Object[0]);
            this.f29219b.mo19651a((Context) this, true);
        }
    }
}
