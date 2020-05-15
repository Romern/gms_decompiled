package p000;

import android.app.PendingIntent;

/* renamed from: bigk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bigk extends bhpv {

    /* renamed from: b */
    final /* synthetic */ aabl f120525b;

    /* renamed from: c */
    final /* synthetic */ PendingIntent f120526c;

    /* renamed from: d */
    final /* synthetic */ bigx f120527d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bigk(bigx bigx, rkb rkb, aabl aabl, PendingIntent pendingIntent) {
        super(rkb);
        this.f120527d = bigx;
        this.f120525b = aabl;
        this.f120526c = pendingIntent;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final rke mo64140a() {
        blji b = this.f120525b.mo16696b("ConnectionCallbacks");
        try {
            aejs.m51941a(this.f120527d.f120561k, this.f120526c);
            bigx bigx = this.f120527d;
            rke a = aejs.m51941a(bigx.f120561k, bigx.f120560j);
            if (b != null) {
                b.close();
            }
            return a;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }
}
