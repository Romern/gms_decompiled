package com.google.android.gms.wearable.node;

import android.content.Intent;
import com.google.android.gms.wearable.util.AlarmHelper$AlarmBroadcastReceiver;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class TransportWriter$1 extends AlarmHelper$AlarmBroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ ayan f110985a;

    public TransportWriter$1(ayan ayan) {
        this.f110985a = ayan;
    }

    /* renamed from: a */
    public final void mo60310a(Intent intent) {
        if ("TrasnportWriter::QueueFlush".equals(intent.getAction())) {
            ayan ayan = this.f110985a;
            int i = ayan.f96937g;
            ayan.mo53836a("alarm triggering flush.");
            this.f110985a.mo53837c();
        }
    }
}
