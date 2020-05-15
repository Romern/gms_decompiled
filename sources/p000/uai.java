package p000;

import android.content.SyncResult;
import android.database.Cursor;
import java.util.List;

/* renamed from: uai */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class uai implements vcd {

    /* renamed from: a */
    final /* synthetic */ String f47013a;

    /* renamed from: b */
    final /* synthetic */ List f47014b;

    /* renamed from: c */
    final /* synthetic */ uaj f47015c;

    public uai(uaj uaj, String str, List list) {
        this.f47015c = uaj;
        this.f47013a = str;
        this.f47014b = list;
    }

    /* renamed from: a */
    public final void mo26997a(SyncResult syncResult) {
        Cursor a;
        uhn uhn;
        int i;
        if (syncResult != null && !syncResult.hasError()) {
            uaj uaj = this.f47015c;
            for (Long l : this.f47014b) {
                uaj.f47018b.mo27435d();
                try {
                    uhn uhn2 = uaj.f47018b;
                    long longValue = l.longValue();
                    uhj uhj = ((ugx) uhn2).f47578a;
                    C1596ulr ulr = null;
                    a = uhj.mo27468a(ulu.f48160a.mo27735b(), (String[]) null, ulu.f48160a.f48341a.mo27717e(longValue), (String) null);
                    if (a.moveToFirst()) {
                        ulr = C1596ulr.m38942a(uhj, a);
                    }
                    a.close();
                    if (ulr != null) {
                        uih c = uaj.f47018b.mo27427c(ulr.f48153d);
                        txr txr = ulr.f48150a;
                        long j = ulr.f48151b;
                        long j2 = ulr.f48152c;
                        vcy c2 = uaj.f47019c.f49777x.mo28312c();
                        c2.mo28308i();
                        c2.mo28300c(1, 36);
                        c2.mo28284a(c.f47682a);
                        txr txr2 = txr.NULL;
                        int ordinal = txr.ordinal();
                        if (ordinal == 10) {
                            i = vpb.m40991b(uaj.f47018b, c, j, true);
                        } else if (ordinal != 12) {
                            uaj.f47016a.mo25377c("ActionQueue", "Unexpected action type for deferred cleanup");
                            i = 0;
                        } else {
                            i = tyk.m37742a(uaj.f47018b, c, j, true);
                            if (i > 0) {
                                uaj.f47020d.mo27275a();
                            }
                        }
                        ulr.mo27726u();
                        long currentTimeMillis = System.currentTimeMillis();
                        c2.mo28286a(txr);
                        c2.mo28279a(i, currentTimeMillis - j2);
                        c2.mo28307h();
                        c2.mo28274a();
                        uaj.f47018b.mo27442f();
                        uhn = uaj.f47018b;
                    } else {
                        uaj.f47018b.mo27442f();
                        uhn = uaj.f47018b;
                    }
                    uhn.mo27439e();
                } catch (Throwable th) {
                    uaj.f47018b.mo27439e();
                    throw th;
                }
            }
            return;
        }
        uaj.f47016a.mo25369a("Sync failed for account: %s", this.f47013a);
    }
}
