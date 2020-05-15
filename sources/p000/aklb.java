package p000;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* renamed from: aklb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aklb extends aaab {

    /* renamed from: a */
    private final rnt f72188a;

    /* renamed from: b */
    private final Map f72189b;

    public aklb(rnt rnt, Map map) {
        super(137, "UnregisterAsAuthenticationApp");
        this.f72188a = rnt;
        this.f72189b = map;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        akmh akmh = new akmh(context);
        try {
            if (!akmj.m60014a(akmj.m60011a((String) akka.f72133h.mo10351a()), akmj.m60012a(context.getPackageManager()), this.f72189b)) {
                eog eog = akka.f72133h;
                boolean contains = eog.f15385c.mo10354a().contains(eog.f15384b);
                akka.f72133h.mo10353b();
                if (contains) {
                    int i = spn.f44932a;
                    SQLiteDatabase a = akmh.f72258c.mo39569a();
                    if (a != null) {
                        a.delete("network", "captive_portal IS NOT NULL", null);
                    }
                    akmq.m60025c(akmh.f72256a);
                }
                this.f72188a.mo11797a(Status.f30107a);
                return;
            }
            int i2 = eoa.f15378a;
            this.f72188a.mo11797a(new Status(22004));
        } catch (RuntimeException e) {
            eoa.m10825a("NetRec", e, "Error executing UnregisterAsAuthenticationAppOperation", new Object[0]);
            throw new aaaj(8, null);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f72188a.mo11797a(status);
    }
}
