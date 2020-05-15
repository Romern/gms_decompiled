package com.google.android.location.fused;

import android.os.SystemClock;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FusedLocationServiceHelper$AlarmListener extends spb {

    /* renamed from: b */
    final /* synthetic */ bfqm f150716b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FusedLocationServiceHelper$AlarmListener(bfqm bfqm) {
        super("location");
        this.f150716b = bfqm;
    }

    /* renamed from: a */
    public final void mo25922a() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (bfph bfph : this.f150716b.f114883j.mo25992c()) {
            if (500 + elapsedRealtime >= bfph.f114767c.f79420b.f79353e) {
                bfph.mo62093c();
            }
        }
    }
}
