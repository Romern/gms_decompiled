package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: qfe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qfe {

    /* renamed from: a */
    public static final qgc f41114a = new qfd();

    /* renamed from: f */
    private static final sek f41115f = qgn.m32143a("ExecutionManager");

    /* renamed from: b */
    public final Context f41116b;

    /* renamed from: c */
    public final AtomicBoolean f41117c = new AtomicBoolean(false);

    /* renamed from: d */
    public final qfs f41118d = ((qfs) qfs.f41128a.mo24026b());

    /* renamed from: e */
    public final bngx f41119e;

    public qfe(Context context) {
        this.f41116b = context;
        this.f41119e = bngx.m109358a(new qfw(context), new qfx(context), new qfv(context));
    }

    /* renamed from: a */
    public final Bundle mo24008a(Bundle bundle) {
        if (this.f41118d.mo24018b().mo66813a()) {
            Bundle bundle2 = ((qfq) this.f41118d.mo24018b().mo66814b()).f41127b;
            bundle = (Bundle) bundle.clone();
            if (bundle2.getBoolean("CheckinService_fetchSystemUpdates", false)) {
                bundle.putBoolean("CheckinService_fetchSystemUpdates", true);
            }
            if (bundle2.getBoolean("checkin_source_force")) {
                bundle.putBoolean("checkin_source_force", true);
                if (bundle2.containsKey("checkin_source_package")) {
                    bundle.putString("checkin_source_package", bundle2.getString("checkin_source_package"));
                }
                if (bundle2.containsKey("checkin_source_class")) {
                    bundle.putString("checkin_source_class", bundle2.getString("checkin_source_class"));
                }
            }
        }
        return bundle;
    }

    /* renamed from: b */
    public final long mo24011b(long j, Bundle bundle) {
        bnre i = this.f41119e.listIterator();
        long j2 = 0;
        while (i.hasNext()) {
            qfu qfu = (qfu) i.next();
            long a = qfu.mo24020a(j, bundle);
            f41115f.mo25412b("Computer: %s with delay: %d", qfu.mo24021a(), Long.valueOf(a));
            j2 = Math.max(j2, a);
        }
        return j2;
    }

    /* renamed from: a */
    public final void mo24009a(long j, Bundle bundle) {
        long j2 = j;
        Bundle a = mo24008a(bundle);
        long b = mo24011b(j2, a);
        if (b < cdbw.m132505b()) {
            b = cdbw.m132505b();
        }
        long b2 = b + cdbw.f180438a.mo6606a().mo77212b();
        bmxv b3 = this.f41118d.mo24018b();
        if (!b3.mo66813a() || b2 + j2 <= ((qfq) b3.mo66814b()).f41126a) {
            long j3 = b2 + j2;
            qfy a2 = qfz.m32111a(this.f41116b);
            a2.mo24024a();
            int i = Build.VERSION.SDK_INT;
            skc skc = a2.f41143b;
            Context context = a2.f41142a;
            skc.mo25681b("checkin_attempt_alarm", 2, j3, PendingIntent.getService(context, 0, qga.m32113a(context, a), 134217728), "com.google.android.gms.checkin");
            this.f41118d.mo24017a(new qfq(j3, a));
            f41115f.mo25414c("Checkin scheduled at %d.", Long.valueOf(j3));
            return;
        }
        this.f41118d.mo24017a(new qfq(((qfq) b3.mo66814b()).f41126a, a));
        f41115f.mo25414c("Updated checkin scheduled at %d.", Long.valueOf(((qfq) b3.mo66814b()).f41126a));
    }

    /* renamed from: a */
    public final void mo24010a(long j, qda qda) {
        this.f41117c.set(false);
        bnre i = this.f41119e.listIterator();
        while (i.hasNext()) {
            ((qfu) i.next()).mo24022a(j, qda);
        }
    }
}
