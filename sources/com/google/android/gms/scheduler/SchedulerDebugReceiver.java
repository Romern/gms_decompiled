package com.google.android.gms.scheduler;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class SchedulerDebugReceiver extends aacn {
    public SchedulerDebugReceiver() {
        super("scheduler");
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        aphm aphm;
        if (rfy.m33550g(context) && "INVOKE_ALL".equals(intent.getStringExtra("debug_sub_action")) && (aphm = apht.m70315a().f84401a) != null) {
            aphm.f84390a.mo47236c(aapx.INVOKE_ALL);
        }
    }
}
