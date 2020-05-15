package com.google.android.gms.stats.controlledevents;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
class ControlledEventsBroadcastReceiver extends aacn {

    /* renamed from: a */
    ControlledEventsOperation f108284a;

    public ControlledEventsBroadcastReceiver(ControlledEventsOperation controlledEventsOperation) {
        super("stats_controlled_events");
        this.f108284a = controlledEventsOperation;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        if ("android.intent.action.SCREEN_ON".equals(intent.getAction())) {
            asfj.m73952a("ControlledEventsReceiverFailureScreenOn");
            asfi.m73948a();
            this.f108284a.mo59203a();
        }
    }
}
