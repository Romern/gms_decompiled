package com.google.android.location.geofencer.service;

import android.os.SystemClock;
import android.os.WorkSource;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GeofencerStateMachine$AlarmListener extends spb {

    /* renamed from: b */
    final /* synthetic */ bfzt f150780b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GeofencerStateMachine$AlarmListener(bfzt bfzt) {
        super("location");
        this.f150780b = bfzt;
    }

    /* renamed from: a */
    public final void mo25922a() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        bfzp bfzp = (bfzp) this.f150780b.f115813r.pollFirst();
        if (bfzp != null) {
            bfzt bfzt = this.f150780b;
            bfzt.f115811p = elapsedRealtime;
            bfzt.mo62510a(bfzp.f115786b, bfzp.f115785a);
        }
        if (!this.f150780b.f115813r.isEmpty()) {
            long j = this.f150780b.f115811p;
            long b = cexn.m138393b();
            bfzt bfzt2 = this.f150780b;
            bfzt2.f115810o.mo25930a("GeofencerStateMachine", 2, j + b, this, bfzt2.f115905K, (WorkSource) null);
        }
    }
}
