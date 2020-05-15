package p000;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.Lock;

/* renamed from: du */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C0944du implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C0947dx f14023a;

    public C0944du(C0947dx dxVar) {
        this.f14023a = dxVar;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    private final Set m9357a() {
        HashSet hashSet = new HashSet();
        Cursor a = this.f14023a.f14327c.mo9937a(new C0924db("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"));
        while (a.moveToNext()) {
            try {
                hashSet.add(Integer.valueOf(a.getInt(0)));
            } catch (Throwable th) {
                a.close();
                throw th;
            }
        }
        a.close();
        if (!hashSet.isEmpty()) {
            this.f14023a.f14333i.mo9363b();
        }
        return hashSet;
    }

    public final void run() {
        Set set;
        Lock a = this.f14023a.f14327c.mo9939a();
        a.lock();
        try {
            C0947dx dxVar = this.f14023a;
            if (dxVar.f14327c.mo9941c()) {
                if (!dxVar.f14329e) {
                    dxVar.f14327c.f14652b.mo8640a();
                }
                if (!dxVar.f14329e) {
                    Log.e("ROOM", "database is not initialized even though it is open");
                } else if (this.f14023a.f14328d.compareAndSet(true, false) && !this.f14023a.f14327c.mo9947i()) {
                    C0953ec ecVar = this.f14023a.f14327c;
                    if (ecVar.f14653c) {
                        C0933dj a2 = ecVar.f14652b.mo8640a();
                        a2.mo9113a();
                        try {
                            set = m9357a();
                            try {
                                a2.mo9117c();
                                try {
                                    a2.mo9114b();
                                } catch (SQLiteException | IllegalStateException e) {
                                    e = e;
                                }
                            } catch (Throwable th) {
                                th = th;
                                try {
                                    a2.mo9114b();
                                    throw th;
                                } catch (SQLiteException | IllegalStateException e2) {
                                    e = e2;
                                    try {
                                        Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
                                        a.unlock();
                                        if (set != null) {
                                            return;
                                        }
                                        return;
                                    } catch (Throwable th2) {
                                        a.unlock();
                                        throw th2;
                                    }
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            set = null;
                            a2.mo9114b();
                            throw th;
                        }
                    } else {
                        set = m9357a();
                    }
                    a.unlock();
                    if (set != null && !set.isEmpty()) {
                        synchronized (this.f14023a.f14330f) {
                            Iterator it = this.f14023a.f14330f.iterator();
                            if (it.hasNext()) {
                                C0946dw dwVar = (C0946dw) ((Map.Entry) it.next()).getValue();
                                throw null;
                            }
                        }
                        return;
                    }
                    return;
                }
            }
            a.unlock();
        } catch (SQLiteException | IllegalStateException e3) {
            e = e3;
            set = null;
        }
    }
}
