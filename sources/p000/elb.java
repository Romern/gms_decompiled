package p000;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: elb */
final /* synthetic */ class elb implements elq {

    /* renamed from: a */
    private final long f15233a;

    public elb(long j) {
        this.f15233a = j;
    }

    /* renamed from: a */
    public final Object mo10264a(Object obj) {
        long j = this.f15233a;
        eid eid = elt.f15254a;
        return Integer.valueOf(((SQLiteDatabase) obj).delete("events", "timestamp_ms < ?", new String[]{String.valueOf(j)}));
    }
}
