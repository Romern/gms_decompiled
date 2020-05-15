package p000;

import android.app.PendingIntent;

/* renamed from: aehi */
public final /* synthetic */ class aehi implements roo {

    /* renamed from: a */
    private final PendingIntent f63399a;

    public aehi(PendingIntent pendingIntent) {
        this.f63399a = pendingIntent;
    }

    /* renamed from: a */
    public final void mo6476a(Object obj, Object obj2) {
        PendingIntent pendingIntent = this.f63399a;
        aekl aekl = (aekl) obj;
        aehk aehk = new aehk((aucf) obj2);
        aekl.mo25288A();
        sdo.checkIfNull(pendingIntent, "PendingIntent must be specified.");
        sdo.checkIfNull(aehk, "ResultHolder not provided.");
        ((aekb) aekl.mo25289B()).mo34213a(pendingIntent, new aekk(aehk), aekl.f43948r.getPackageName());
    }
}
