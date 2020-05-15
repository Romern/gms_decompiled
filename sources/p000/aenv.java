package p000;

import android.app.PendingIntent;

/* renamed from: aenv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aenv extends aeme {

    /* renamed from: a */
    final /* synthetic */ PendingIntent f63540a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aenv(rjo rjo, rkb rkb, PendingIntent pendingIntent) {
        super(rjo, rkb);
        this.f63540a = pendingIntent;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo11186a(rjd rjd) {
        aeoa aeoa = (aeoa) rjd;
        aemf aemf = new aemf((aeme) this);
        PendingIntent pendingIntent = this.f63540a;
        sdo.checkIfNull(aemf, "callback == null");
        ((aeni) aeoa.mo25289B()).mo34356a(aeoa.f63545a, pendingIntent, aemf);
    }
}
