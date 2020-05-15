package com.google.android.gms.scheduler.reachability;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ReachabilityObserver$AlarmReceiver extends aacn {

    /* renamed from: a */
    public final /* synthetic */ apkg f107341a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReachabilityObserver$AlarmReceiver(apkg apkg) {
        super("scheduler");
        this.f107341a = apkg;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        apkg apkg = this.f107341a;
        int i = apkg.f84590d;
        apkg.f84592a.execute(new apkf(this));
    }
}
