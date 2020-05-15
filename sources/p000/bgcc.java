package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;

/* renamed from: bgcc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bgcc implements PendingIntent.OnFinished {

    /* renamed from: h */
    final PendingIntent f116017h;

    /* renamed from: i */
    final long f116018i;

    /* renamed from: j */
    final String f116019j;

    /* renamed from: k */
    final long f116020k = SystemClock.elapsedRealtime();

    /* renamed from: l */
    final boolean f116021l;

    /* renamed from: m */
    final String f116022m;

    /* renamed from: n */
    final bhcv f116023n;

    /* renamed from: o */
    final bgns f116024o;

    /* renamed from: p */
    final boolean f116025p;

    public bgcc(PendingIntent pendingIntent, long j, bgns bgns, bhcv bhcv, boolean z, boolean z2, String str) {
        this.f116017h = pendingIntent;
        this.f116018i = j;
        this.f116024o = bgns;
        this.f116022m = str;
        this.f116025p = z;
        this.f116021l = z2;
        this.f116019j = pendingIntent.getTargetPackage();
        this.f116023n = bhcv;
    }

    /* renamed from: a */
    public void mo62594a() {
    }

    public final void onSendFinished(PendingIntent pendingIntent, Intent intent, int i, String str, Bundle bundle) {
        this.f116024o.mo62925c(bgnq.PENDING_INTENT);
    }

    /* renamed from: a */
    public boolean mo62597a(Context context, Intent intent) {
        this.f116024o.mo62923b(bgnq.PENDING_INTENT, 10000, this.f116023n);
        try {
            String valueOf = String.valueOf(this);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 11);
            sb.append("sending to ");
            sb.append(valueOf);
            sb.toString();
            sse.m36201a(this.f116017h, context, 0, intent, this);
            return true;
        } catch (PendingIntent.CanceledException e) {
            String valueOf2 = String.valueOf(this);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 24);
            sb2.append("pendingIntent cancelled ");
            sb2.append(valueOf2);
            sb2.toString();
            this.f116024o.mo62925c(bgnq.PENDING_INTENT);
            mo62594a();
            return false;
        }
    }
}
