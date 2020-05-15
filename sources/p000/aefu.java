package p000;

import android.app.PendingIntent;

/* renamed from: aefu */
public final /* synthetic */ class aefu implements roo {

    /* renamed from: a */
    private final PendingIntent f63341a;

    public aefu(PendingIntent pendingIntent) {
        this.f63341a = pendingIntent;
    }

    /* renamed from: a */
    public final void mo6476a(Object obj, Object obj2) {
        PendingIntent pendingIntent = this.f63341a;
        aekl aekl = (aekl) obj;
        aefx aefx = new aefx((aucf) obj2);
        aekl.mo25288A();
        sdo.m34966a(aefx, "ResultHolder not provided.");
        ((aekb) aekl.mo25289B()).mo34215a(pendingIntent, new ros(aefx));
    }
}
