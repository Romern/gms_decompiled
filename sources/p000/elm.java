package p000;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: elm */
final /* synthetic */ class elm implements elq {

    /* renamed from: a */
    private final elt f15245a;

    /* renamed from: b */
    private final ejb f15246b;

    public elm(elt elt, ejb ejb) {
        this.f15245a = elt;
        this.f15246b = ejb;
    }

    /* renamed from: a */
    public final Object mo10264a(Object obj) {
        elt elt = this.f15245a;
        Long a = elt.m10632a((SQLiteDatabase) obj, this.f15246b);
        if (a == null) {
            return false;
        }
        return (Boolean) elt.m10633a(elt.mo10266c().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{a.toString()}), elh.f15240a);
    }
}
