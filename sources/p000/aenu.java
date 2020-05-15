package p000;

import android.app.PendingIntent;

/* renamed from: aenu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aenu extends aeme {

    /* renamed from: a */
    final /* synthetic */ PendingIntent f63539a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aenu(rjo rjo, rkb rkb, PendingIntent pendingIntent) {
        super(rjo, rkb);
        this.f63539a = pendingIntent;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo11186a(rjd rjd) {
        aeoa aeoa = (aeoa) rjd;
        aemf aemf = new aemf((aeme) this);
        PendingIntent pendingIntent = this.f63539a;
        sdo.m34966a(aemf, "callback == null");
        ((aeni) aeoa.mo25289B()).mo34359b(aeoa.f63545a, pendingIntent, aemf);
    }
}
