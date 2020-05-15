package p000;

import android.app.PendingIntent;

/* renamed from: mjf */
public final /* synthetic */ class mjf implements Runnable {

    /* renamed from: a */
    private final mji f33821a;

    /* renamed from: b */
    private final PendingIntent f33822b;

    public mjf(mji mji, PendingIntent pendingIntent) {
        this.f33821a = mji;
        this.f33822b = pendingIntent;
    }

    public final void run() {
        mji mji = this.f33821a;
        mji.f33828b.mo20093a(this.f33822b);
    }
}
