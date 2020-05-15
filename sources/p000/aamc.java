package p000;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQueryBuilder;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: aamc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aamc {

    /* renamed from: f */
    private static final String[] f28436f = {"rmq_id"};

    /* renamed from: g */
    private static final String[] f28437g = {"rmq_id", "data", "type"};

    /* renamed from: a */
    protected long f28438a = -1;

    /* renamed from: b */
    public final Context f28439b;

    /* renamed from: c */
    final aama f28440c;

    /* renamed from: d */
    public final bnnn f28441d = bngf.m109302f();

    /* renamed from: e */
    public final Map f28442e = new C1223np();

    /* renamed from: h */
    private final aama f28443h;

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004f, code lost:
        return 0;
     */
    /* renamed from: a */
    private static final synchronized int m21486a(aama aama, String str, List list) {
        SQLiteDatabase b;
        synchronized (aamc.class) {
            int size = list.size();
            if (size != 0 && (b = aama.mo16995b()) != null) {
                int i = 0;
                int i2 = 0;
                while (i < size) {
                    int min = Math.min(i + 100, size);
                    String[] strArr = new String[(min - i)];
                    StringBuilder sb = new StringBuilder();
                    int i3 = 0;
                    while (i < min) {
                        if (i3 > 0) {
                            sb.append(" OR ");
                        }
                        sb.append("rmq_id=?");
                        int i4 = i3 + 1;
                        int i5 = i + 1;
                        strArr[i3] = (String) list.get(i);
                        i3 = i4;
                        i = i5;
                    }
                    i2 += b.delete(str, sb.toString(), strArr);
                }
                return i2;
            }
        }
    }

    /* renamed from: e */
    private final synchronized long m21488e() {
        SQLiteDatabase a = this.f28440c.mo16994a();
        long j = 0;
        if (a == null) {
            return 0;
        }
        Cursor query = a.query("outgoingRmqMessages", f28436f, null, null, null, null, "rmq_id DESC", "1");
        try {
            if (query.moveToFirst()) {
                j = query.getLong(query.getColumnIndexOrThrow("rmq_id"));
            }
            return j;
        } finally {
            query.close();
        }
    }

    /* renamed from: f */
    private final synchronized aama m21489f() {
        return !aytw.m84813a(this.f28439b) ? this.f28440c : this.f28443h;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0039, code lost:
        return r1;
     */
    /* renamed from: b */
    public final synchronized long mo17005b() {
        long j = 0;
        if (aytw.m84813a(this.f28439b)) {
            return 0;
        }
        SQLiteDatabase a = this.f28440c.mo16994a();
        if (a != null) {
            Cursor query = a.query("lastrmqid", f28436f, null, null, null, null, "rmq_id DESC", "1");
            try {
                if (query.moveToFirst()) {
                    j = query.getLong(query.getColumnIndexOrThrow("rmq_id"));
                }
            } finally {
                query.close();
            }
        }
    }

    /* renamed from: c */
    public final synchronized List mo17006c() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        aama aama = this.f28443h;
        if (aama != null) {
            m21487a(aama, arrayList);
        }
        if (aytw.m84815b(this.f28439b)) {
            m21487a(this.f28440c, arrayList);
        }
        return arrayList;
    }

    /* renamed from: d */
    public final synchronized long mo17007d() {
        long j;
        j = this.f28438a + 1;
        this.f28438a = j;
        return j;
    }

    public aamc(Context context) {
        this.f28439b = context;
        this.f28440c = new aama(context, "rmq.db");
        aytw.m84814b();
        this.f28443h = aaka.m21376a(context) ? new aama(context.createDeviceProtectedStorageContext(), "rmq.db") : null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0035, code lost:
        return;
     */
    /* renamed from: a */
    private static final synchronized void m21487a(aama aama, List list) {
        synchronized (aamc.class) {
            SQLiteDatabase a = aama.mo16994a();
            if (a != null) {
                SQLiteQueryBuilder sQLiteQueryBuilder = new SQLiteQueryBuilder();
                sQLiteQueryBuilder.setTables("s2dRmqIds");
                Cursor query = sQLiteQueryBuilder.query(a, f28436f, null, null, null, null, "rmq_id ASC", null);
                if (query != null) {
                    while (query.moveToNext()) {
                        try {
                            list.add(query.getString(0));
                        } finally {
                            query.close();
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final synchronized int mo16997a(String str, List list) {
        int i;
        i = 0;
        if (list.size() != 0) {
            aama aama = this.f28443h;
            if (aama != null) {
                i = m21486a(aama, str, list);
            }
            if (aytw.m84815b(this.f28439b)) {
                i += m21486a(this.f28440c, str, list);
            }
        }
        return i;
    }

    /* renamed from: a */
    public final int mo16998a(List list) {
        if (aytw.m84813a(this.f28439b) || list.isEmpty()) {
            return 0;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            synchronized (this.f28441d) {
                aamh aamh = (aamh) this.f28442e.remove(str);
                if (aamh != null) {
                    this.f28441d.remove(aamh);
                }
            }
        }
        Iterator it2 = list.iterator();
        long j = -1;
        while (it2.hasNext()) {
            try {
                long parseLong = Long.parseLong((String) it2.next());
                if (parseLong > j) {
                    j = parseLong;
                }
            } catch (NumberFormatException e) {
            }
        }
        long j2 = j + 1;
        if (j2 >= this.f28438a) {
            try {
                mo17000a(j2);
            } catch (Exception e2) {
            }
        }
        return mo16997a("outgoingRmqMessages", list);
    }

    /* renamed from: a */
    public final void mo16999a() {
        if (!aytw.m84813a(this.f28439b) && this.f28438a < 0) {
            if (!aytw.m84813a(this.f28439b)) {
                long e = m21488e();
                if (e == 0) {
                    e = mo17005b();
                }
                this.f28438a = e + 1;
            }
            mo17001a(new aamb());
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Byte):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Float):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.String):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Long):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Boolean):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, byte[]):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Double):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Short):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void} */
    /* renamed from: a */
    public final synchronized void mo17000a(long j) {
        SQLiteDatabase b;
        if (!aytw.m84813a(this.f28439b) && (b = this.f28440c.mo16995b()) != null) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("_id", (Integer) 1);
            contentValues.put("rmq_id", Long.valueOf(j));
            b.replace("lastrmqid", null, contentValues);
        }
    }

    /* renamed from: a */
    public final synchronized void mo17001a(aamb aamb) {
        SQLiteDatabase a;
        Cursor query;
        if (!(aytw.m84813a(this.f28439b) || (a = this.f28440c.mo16994a()) == null || (query = a.query("outgoingRmqMessages", f28437g, "type!=0", null, null, null, "rmq_id ASC", null)) == null)) {
            int columnIndex = query.getColumnIndex("data");
            int columnIndex2 = query.getColumnIndex("rmq_id");
            synchronized (this.f28441d) {
                this.f28442e.clear();
                this.f28441d.clear();
                while (query.moveToNext()) {
                    try {
                        long j = query.getLong(columnIndex2);
                        blmp blmp = (blmp) aane.m21625a((byte) 8, query.getBlob(columnIndex));
                        aamb.mo16993a(j, blmp);
                        aamh a2 = aamh.m21512a(blmp);
                        mo17004a(a2);
                        this.f28442e.put(blmp.f126873h, a2);
                    } catch (IOException e) {
                        Log.w("GCM", "Found invalid message in the RMQ");
                    } catch (Throwable th) {
                        query.close();
                        throw th;
                    }
                }
                query.close();
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo17002a(String str) {
        if (str != null) {
            if (!str.isEmpty()) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("rmq_id", str);
                SQLiteDatabase b = m21489f().mo16995b();
                if (b != null) {
                    b.insert("s2dRmqIds", null, contentValues);
                }
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Byte):void}
     arg types: [java.lang.String, byte]
     candidates:
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Float):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.String):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Long):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Boolean):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, byte[]):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Double):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Short):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Byte):void} */
    /* renamed from: a */
    public final synchronized boolean mo17003a(long j, blmp blmp) {
        SQLiteDatabase b = this.f28440c.mo16995b();
        if (b == null) {
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("rmq_id", Long.valueOf(j));
        contentValues.put("data", blmp.serializeToBytes());
        contentValues.put("type", (Byte) (byte) 8);
        long insert = b.insert("outgoingRmqMessages", null, contentValues);
        synchronized (this.f28441d) {
            this.f28442e.put(blmp.f126873h, aamh.m21512a(blmp));
        }
        if (insert >= 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo17004a(aamh aamh) {
        synchronized (this.f28441d) {
            if (((long) this.f28441d.mo67285a(aamh)) >= cecz.f182285a.mo6606a().mo78810ab()) {
                return false;
            }
            this.f28441d.add(aamh);
            return true;
        }
    }
}
