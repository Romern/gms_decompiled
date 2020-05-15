package p000;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: elt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class elt implements ekw, emd {

    /* renamed from: a */
    public static final eid f15254a = eid.m10480a("proto");

    /* renamed from: b */
    public final eky f15255b;

    /* renamed from: c */
    private final elz f15256c;

    public elt(eky eky, elz elz) {
        this.f15256c = elz;
        this.f15255b = eky;
    }

    /* renamed from: a */
    public static final Long m10632a(SQLiteDatabase sQLiteDatabase, ejb ejb) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        eit eit = (eit) ejb;
        ArrayList arrayList = new ArrayList(Arrays.asList(eit.f15098a, String.valueOf(emj.m10666a(eit.f15100c))));
        if (eit.f15099b != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(eit.f15099b, 0));
        }
        return (Long) m10633a(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), elj.f15242a);
    }

    /* renamed from: c */
    private static String m10636c(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((ekz) it.next()).mo10249a());
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public final void close() {
        this.f15256c.close();
    }

    /* renamed from: b */
    public final int mo10259b() {
        return ((Integer) m10634a(new elb(System.currentTimeMillis() - this.f15255b.mo10245d()))).intValue();
    }

    /* renamed from: c */
    public final SQLiteDatabase mo10266c() {
        elz elz = this.f15256c;
        elz.getClass();
        return (SQLiteDatabase) m10635a(new ela(elz), eli.f15241a);
    }

    /* renamed from: b */
    public final void mo10260b(Iterable iterable) {
        if (iterable.iterator().hasNext()) {
            String valueOf = String.valueOf(m10636c(iterable));
            mo10266c().compileStatement(valueOf.length() == 0 ? new String("DELETE FROM events WHERE _id in ") : "DELETE FROM events WHERE _id in ".concat(valueOf)).execute();
        }
    }

    /* renamed from: c */
    public final Iterable mo10262c(ejb ejb) {
        return (Iterable) m10634a(new elo(this, ejb));
    }

    /* renamed from: b */
    public final boolean mo10261b(ejb ejb) {
        return ((Boolean) m10634a(new elm(this, ejb))).booleanValue();
    }

    /* renamed from: a */
    public static Object m10633a(Cursor cursor, elq elq) {
        try {
            return elq.mo10264a(cursor);
        } finally {
            cursor.close();
        }
    }

    /* renamed from: a */
    private final Object m10634a(elq elq) {
        SQLiteDatabase c = mo10266c();
        c.beginTransaction();
        try {
            Object a = elq.mo10264a(c);
            c.setTransactionSuccessful();
            return a;
        } finally {
            c.endTransaction();
        }
    }

    /* renamed from: a */
    private final Object m10635a(els els, elq elq) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            try {
                return els.mo10263a();
            } catch (SQLiteDatabaseLockedException e) {
                if (SystemClock.elapsedRealtime() >= ((long) this.f15255b.mo10244c()) + elapsedRealtime) {
                    return elq.mo10264a(e);
                }
                SystemClock.sleep(50);
            }
        }
    }

    /* renamed from: a */
    public final long mo10255a(ejb ejb) {
        return ((Long) m10633a(mo10266c().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{ejb.mo10171a(), String.valueOf(emj.m10666a(ejb.mo10173c()))}), ell.f15244a)).longValue();
    }

    /* renamed from: a */
    public final Iterable mo10256a() {
        return (Iterable) m10634a(elp.f15251a);
    }

    /* renamed from: a */
    public final Object mo10265a(emc emc) {
        SQLiteDatabase c = mo10266c();
        m10635a(new ele(c), elf.f15238a);
        try {
            Object a = emc.mo10237a();
            c.setTransactionSuccessful();
            return a;
        } finally {
            c.endTransaction();
        }
    }

    /* renamed from: a */
    public final void mo10257a(ejb ejb, long j) {
        m10634a(new eln(j, ejb));
    }

    /* renamed from: a */
    public final void mo10258a(Iterable iterable) {
        if (iterable.iterator().hasNext()) {
            String valueOf = String.valueOf(m10636c(iterable));
            m10634a(new elk(valueOf.length() == 0 ? new String("UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in ") : "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in ".concat(valueOf)));
        }
    }
}
