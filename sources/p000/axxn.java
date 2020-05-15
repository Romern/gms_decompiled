package p000;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: axxn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axxn implements ayjm {

    /* renamed from: a */
    final /* synthetic */ axxv f96661a;

    public axxn(axxv axxv) {
        this.f96661a = axxv;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final void mo53558a(ssb ssb, boolean z, boolean z2) {
        SQLiteDatabase readableDatabase = this.f96661a.f96695c.getReadableDatabase();
        ssb.mo26034a();
        ssb.printf("%16s %8s %22s\n", "nodeId", "seqId", "lastActivity");
        Cursor rawQuery = readableDatabase.rawQuery("SELECT * FROM nodeinfo ORDER BY node", null);
        while (rawQuery.moveToNext()) {
            try {
                String string = rawQuery.getString(0);
                long j = !rawQuery.isNull(1) ? rawQuery.getLong(1) : -1;
                long j2 = rawQuery.getLong(2);
                ssb.printf("%16s %8s %22s (%d)\n", string, Long.valueOf(j), ayjl.m84113b(j2), Long.valueOf(j2));
            } catch (Throwable th) {
                rawQuery.close();
                throw th;
            }
        }
        rawQuery.close();
        ssb.mo26035b();
    }
}
