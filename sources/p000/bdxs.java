package p000;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: bdxs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdxs implements bdxl {

    /* renamed from: a */
    public final SQLiteDatabase f106604a;

    /* renamed from: b */
    private final Executor f106605b;

    public bdxs(SQLiteDatabase sQLiteDatabase, Executor executor) {
        this.f106604a = sQLiteDatabase;
        this.f106605b = executor;
    }

    /* renamed from: a */
    public final bqgg mo58418a() {
        return bqga.m112778a(new bdxn(this), this.f106605b);
    }

    /* renamed from: b */
    public final List mo58426b() {
        Cursor query;
        String[] strArr = {"_id", "data", "timestamp"};
        ArrayList arrayList = new ArrayList();
        try {
            query = this.f106604a.query("queue", strArr, null, null, null, null, "_id", null);
            while (query.moveToNext()) {
                bdxq bdxq = new bdxq();
                bdxq.f106603c = Long.valueOf(query.getLong(0));
                bxtx a = bxtx.m123261a(query.getBlob(1));
                if (a != null) {
                    bdxq.f106601a = a;
                    bdxq.f106602b = Long.valueOf(query.getLong(2));
                    String str = "";
                    if (bdxq.f106601a == null) {
                        str = " data";
                    }
                    if (bdxq.f106602b == null) {
                        str = str.concat(" timestamp");
                    }
                    if (bdxq.f106603c == null) {
                        str = String.valueOf(str).concat(" id");
                    }
                    if (str.isEmpty()) {
                        arrayList.add(new bdwg(bdxq.f106601a, bdxq.f106602b.longValue(), bdxq.f106603c));
                    } else {
                        String valueOf = String.valueOf(str);
                        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
                    }
                } else {
                    throw new NullPointerException("Null data");
                }
            }
            if (query != null) {
                query.close();
            }
            return arrayList;
        } catch (SQLException e) {
            throw new bdrc(e);
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: a */
    public final bqgg mo58419a(long j, Iterable iterable) {
        return bqga.m112778a(new bdxm(this, j, iterable), this.f106605b);
    }

    public final void close() {
        try {
            this.f106604a.close();
        } catch (SQLException e) {
            throw new bdvx(e);
        }
    }

    /* renamed from: a */
    public final bqgg mo58420a(List list) {
        return bqga.m112778a(new bdxo(this, list), this.f106605b);
    }

    /* renamed from: b */
    public final void mo58427b(long j, Iterable iterable) {
        try {
            this.f106604a.beginTransaction();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("data", ((bxtx) it.next()).mo73780k());
                contentValues.put("timestamp", Long.valueOf(j));
                if (this.f106604a.insertOrThrow("queue", null, contentValues) == -1) {
                    throw new bdrc("insertOrThrow returned -1");
                }
            }
            this.f106604a.setTransactionSuccessful();
            this.f106604a.endTransaction();
        } catch (SQLException e) {
            throw new bdrc(e);
        } catch (Throwable th) {
            this.f106604a.endTransaction();
            throw th;
        }
    }

    /* renamed from: b */
    public final void mo58428b(List list) {
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((bdxr) ((bdxk) it.next())).mo58406c());
            }
            String a = bmxr.m108543a(',').mo66874a((Iterable) arrayList);
            StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 9);
            sb.append("_id IN (");
            sb.append(a);
            sb.append(")");
            String sb2 = sb.toString();
            this.f106604a.beginTransaction();
            this.f106604a.delete("queue", sb2, null);
            this.f106604a.setTransactionSuccessful();
            this.f106604a.endTransaction();
        } catch (SQLException e) {
            throw new bdrc(e);
        } catch (Throwable th) {
            this.f106604a.endTransaction();
            throw th;
        }
    }
}
