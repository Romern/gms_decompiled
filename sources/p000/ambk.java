package p000;

import android.database.Cursor;
import android.database.MatrixCursor;
import android.util.Log;

/* renamed from: ambk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ambk extends Thread {

    /* renamed from: a */
    final /* synthetic */ ambn f74647a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ambk(ambn ambn) {
        super("PeopleAggregator-aggregator");
        this.f74647a = ambn;
    }

    public final void run() {
        try {
            ambn ambn = this.f74647a;
            boolean z = ambn.f74652l;
            sdo.m34974b(ambn.f74659g.mo17671b());
            ambn.f74657e.mo41711a("agg start");
            Cursor cursor = ambn.f74663k;
            if (cursor == null) {
                cursor = new MatrixCursor(ambi.f74632a);
            }
            ambg a = ambn.mo41111a(new ambm(ambn.f74660h), new ambm(ambn.f74661i), cursor);
            ambn.f74657e.mo41711a("agg finish");
            ambn.f74657e.mo41710a();
            ambn.f74665n.mo41075a(0, a);
        } catch (Exception e) {
            Log.e("PeopleAggregator", "Unknown exception during aggregation", e);
            ambn ambn2 = this.f74647a;
            boolean z2 = ambn.f74652l;
            ambn2.mo41115c();
        }
    }
}
