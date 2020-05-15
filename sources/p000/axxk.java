package p000;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* renamed from: axxk */
public final /* synthetic */ class axxk implements Runnable {

    /* renamed from: a */
    private final axxv f96654a;

    public axxk(axxv axxv) {
        this.f96654a = axxv;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x03dd  */
    /* JADX WARNING: Removed duplicated region for block: B:167:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0192 A[Catch:{ all -> 0x03cc }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0208  */
    public final void run() {
        Long valueOf;
        Cursor rawQuery;
        int size;
        int i;
        int i2;
        Cursor query;
        Throwable th;
        long j;
        int i3;
        axxv axxv = this.f96654a;
        aygy.m83985a();
        if (aygy.m83989b(axxv.f96694b)) {
            if (Log.isLoggable("DataItems", 4)) {
                Log.i("DataItems", "Running scheduled database maintenance.");
            }
            if (Log.isLoggable("DataItems", 3)) {
                Log.d("DataItems", "gcDeletedDataItems: expiring deleted data items");
            }
            long S = chnj.f188812a.mo6606a().mo85393S();
            if (S > 0) {
                long T = chnj.f188812a.mo6606a().mo85394T();
                long currentTimeMillis = System.currentTimeMillis() - S;
                long R = chnj.f188812a.mo6606a().mo85392R();
                String[] strArr = {String.valueOf(currentTimeMillis), String.valueOf(R)};
                try {
                    SQLiteDatabase writableDatabase = axxv.f96695c.getWritableDatabase();
                    i3 = 0;
                    while (true) {
                        try {
                            int delete = writableDatabase.delete("dataitems", "_id IN (SELECT _id FROM dataitems WHERE deleted=1 AND timestampMs <= ? LIMIT ?)", strArr);
                            i3 += delete;
                            if (Log.isLoggable("DataItems", 3)) {
                                StringBuilder sb = new StringBuilder(50);
                                sb.append("gcDeletedDataItems: expired ");
                                sb.append(i3);
                                sb.append(" data items");
                                Log.d("DataItems", sb.toString());
                            }
                            bqhi.m112839a(T, TimeUnit.MILLISECONDS);
                            if (((long) delete) < R) {
                                break;
                            }
                        } catch (SQLiteException e) {
                            e = e;
                            String valueOf2 = String.valueOf(e);
                            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 20);
                            sb2.append("gcDeletedDataItems: ");
                            sb2.append(valueOf2);
                            Log.w("DataItems", sb2.toString());
                            axxv.f96708p.mo24359a();
                            String b = ayjl.m84113b(currentTimeMillis);
                            StringBuilder sb3 = new StringBuilder(String.valueOf(b).length() + 44);
                            sb3.append("Expired ");
                            sb3.append(i3);
                            sb3.append(" deleted data items from ");
                            sb3.append(b);
                            Log.d("DataItems", sb3.toString());
                            valueOf = Long.valueOf(System.currentTimeMillis());
                            axue a = axue.m83239a("com.google.android.gms", "38918a453d07199354f8b19af05ec6562ced5788");
                            axxf axxf = new axxf(axxv.mo53743b(), "/node_sentinel");
                            axxf.f96642d = valueOf.toString().getBytes();
                            axxv.mo53728a(a, axxf);
                            SQLiteDatabase writableDatabase2 = axxv.f96695c.getWritableDatabase();
                            String str = axxv.f96711s.mo53808b().f96814a;
                            long Q = chnj.f188812a.mo6606a().mo85391Q();
                            if (Log.isLoggable("DataItems", 3)) {
                            }
                            ArrayList arrayList = new ArrayList();
                            long longValue = valueOf.longValue() - Q;
                            rawQuery = writableDatabase2.rawQuery("SELECT * FROM nodeinfo ORDER BY node", null);
                            while (rawQuery.moveToNext()) {
                                try {
                                } catch (Throwable th2) {
                                    rawQuery.close();
                                    throw th2;
                                }
                            }
                            rawQuery.close();
                            size = arrayList.size();
                            i = 0;
                            while (i < size) {
                            }
                            if (chnj.m149036l()) {
                            }
                        }
                    }
                    axxv.f96707o.mo24359a();
                } catch (SQLiteException e2) {
                    e = e2;
                    i3 = 0;
                    String valueOf22 = String.valueOf(e);
                    StringBuilder sb22 = new StringBuilder(String.valueOf(valueOf22).length() + 20);
                    sb22.append("gcDeletedDataItems: ");
                    sb22.append(valueOf22);
                    Log.w("DataItems", sb22.toString());
                    axxv.f96708p.mo24359a();
                    String b2 = ayjl.m84113b(currentTimeMillis);
                    StringBuilder sb32 = new StringBuilder(String.valueOf(b2).length() + 44);
                    sb32.append("Expired ");
                    sb32.append(i3);
                    sb32.append(" deleted data items from ");
                    sb32.append(b2);
                    Log.d("DataItems", sb32.toString());
                    valueOf = Long.valueOf(System.currentTimeMillis());
                    axue a2 = axue.m83239a("com.google.android.gms", "38918a453d07199354f8b19af05ec6562ced5788");
                    axxf axxf2 = new axxf(axxv.mo53743b(), "/node_sentinel");
                    axxf2.f96642d = valueOf.toString().getBytes();
                    axxv.mo53728a(a2, axxf2);
                    SQLiteDatabase writableDatabase22 = axxv.f96695c.getWritableDatabase();
                    String str2 = axxv.f96711s.mo53808b().f96814a;
                    long Q2 = chnj.f188812a.mo6606a().mo85391Q();
                    if (Log.isLoggable("DataItems", 3)) {
                    }
                    ArrayList arrayList2 = new ArrayList();
                    long longValue2 = valueOf.longValue() - Q2;
                    rawQuery = writableDatabase22.rawQuery("SELECT * FROM nodeinfo ORDER BY node", null);
                    while (rawQuery.moveToNext()) {
                    }
                    rawQuery.close();
                    size = arrayList2.size();
                    i = 0;
                    while (i < size) {
                    }
                    if (chnj.m149036l()) {
                    }
                }
                if (Log.isLoggable("DataItems", 3) && i3 > 0) {
                    String b22 = ayjl.m84113b(currentTimeMillis);
                    StringBuilder sb322 = new StringBuilder(String.valueOf(b22).length() + 44);
                    sb322.append("Expired ");
                    sb322.append(i3);
                    sb322.append(" deleted data items from ");
                    sb322.append(b22);
                    Log.d("DataItems", sb322.toString());
                }
            }
            valueOf = Long.valueOf(System.currentTimeMillis());
            axue a22 = axue.m83239a("com.google.android.gms", "38918a453d07199354f8b19af05ec6562ced5788");
            axxf axxf22 = new axxf(axxv.mo53743b(), "/node_sentinel");
            axxf22.f96642d = valueOf.toString().getBytes();
            axxv.mo53728a(a22, axxf22);
            try {
                SQLiteDatabase writableDatabase222 = axxv.f96695c.getWritableDatabase();
                String str22 = axxv.f96711s.mo53808b().f96814a;
                long Q22 = chnj.f188812a.mo6606a().mo85391Q();
                if (Log.isLoggable("DataItems", 3)) {
                    String valueOf3 = String.valueOf(valueOf);
                    StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf3).length() + 74);
                    sb4.append("gcOldNodes: findExpiredNodes, now=");
                    sb4.append(valueOf3);
                    sb4.append(", expiration period=");
                    sb4.append(Q22);
                    Log.d("DataItems", sb4.toString());
                }
                ArrayList arrayList22 = new ArrayList();
                long longValue22 = valueOf.longValue() - Q22;
                rawQuery = writableDatabase222.rawQuery("SELECT * FROM nodeinfo ORDER BY node", null);
                while (rawQuery.moveToNext()) {
                    String string = rawQuery.getString(0);
                    if (!string.equals(str22) && !"cloud".equals(string)) {
                        if (!rawQuery.isNull(1)) {
                            j = rawQuery.getLong(1);
                        } else {
                            j = -1;
                        }
                        long j2 = rawQuery.getLong(2);
                        if (j2 <= longValue22) {
                            if (Log.isLoggable("DataItems", 3)) {
                                StringBuilder sb5 = new StringBuilder(String.valueOf(string).length() + 102);
                                sb5.append("gcOldNodes: found expired node, nodeId=");
                                sb5.append(string);
                                sb5.append(", seqId=");
                                sb5.append(j);
                                sb5.append(", lastActivity=");
                                sb5.append(j2);
                                Log.d("DataItems", sb5.toString());
                            }
                            arrayList22.add(string);
                        }
                    }
                }
                rawQuery.close();
                size = arrayList22.size();
                i = 0;
                while (i < size) {
                    String str3 = (String) arrayList22.get(i);
                    if (!chmu.f188793a.mo6606a().mo85361a()) {
                        String valueOf4 = String.valueOf(str3);
                        Log.i("DataItems", valueOf4.length() == 0 ? new String("purgeNode: node purging is disabled, node=") : "purgeNode: node purging is disabled, node=".concat(valueOf4));
                        i2 = size;
                    } else {
                        if (Log.isLoggable("DataItems", 3)) {
                            String valueOf5 = String.valueOf(str3);
                            Log.d("DataItems", valueOf5.length() == 0 ? new String("purgeNode: purging data items for node ") : "purgeNode: purging data items for node ".concat(valueOf5));
                        }
                        int i4 = 0;
                        while (true) {
                            writableDatabase222.beginTransaction();
                            try {
                                query = writableDatabase222.query("dataItemsAndAssets", axyx.f96804a, "host=?", new String[]{str3}, null, null, "packageName, signatureDigest, host, path", "100");
                                int count = query.getCount();
                                if (Log.isLoggable("DataItems", 3)) {
                                    StringBuilder sb6 = new StringBuilder(45);
                                    sb6.append("purgeNode: processing batch, rows=");
                                    sb6.append(count);
                                    Log.d("DataItems", sb6.toString());
                                }
                                ArrayList arrayList3 = new ArrayList(100);
                                query.moveToFirst();
                                while (!query.isAfterLast()) {
                                    arrayList3.add(axxj.m83477b(query));
                                    axxi a3 = axxj.m83472a(query);
                                    if (Log.isLoggable("DataItems", 2)) {
                                        String valueOf6 = String.valueOf(a3.f96647b.f96640b);
                                        Log.v("DataItems", valueOf6.length() == 0 ? new String("purgeNode: deleting data and asset refs: ") : "purgeNode: deleting data and asset refs: ".concat(valueOf6));
                                    }
                                }
                                Iterator it = arrayList3.iterator();
                                while (it.hasNext()) {
                                    String str4 = (String) it.next();
                                    writableDatabase222.delete("assetrefs", "dataitems_id=?", new String[]{str4});
                                    writableDatabase222.delete("dataitems", "_id =?", new String[]{str4});
                                    i4++;
                                    size = size;
                                }
                                i2 = size;
                                writableDatabase222.setTransactionSuccessful();
                                if (query != null) {
                                    query.close();
                                }
                                writableDatabase222.endTransaction();
                                if (count < 100) {
                                    break;
                                }
                                size = i2;
                            } catch (Throwable th3) {
                                writableDatabase222.endTransaction();
                                throw th3;
                            }
                        }
                        writableDatabase222.beginTransaction();
                        try {
                            writableDatabase222.delete("nodeinfo", "node=?", new String[]{str3});
                            writableDatabase222.setTransactionSuccessful();
                            if (i4 > 0) {
                                if (Log.isLoggable("DataItems", 2)) {
                                    String valueOf7 = String.valueOf(str3);
                                    Log.v("DataItems", valueOf7.length() == 0 ? new String("notifyDataItemsPurged: ") : "notifyDataItemsPurged: ".concat(valueOf7));
                                }
                                axxv.f96706n.mo24359a();
                                for (axzg axzg : axxv.f96701i) {
                                    axzg.mo53783a();
                                }
                            }
                            if (Log.isLoggable("DataItems", 3)) {
                                StringBuilder sb7 = new StringBuilder(String.valueOf(str3).length() + 47);
                                sb7.append("purgeNode: purged ");
                                sb7.append(i4);
                                sb7.append(" items from node: ");
                                sb7.append(str3);
                                Log.d("DataItems", sb7.toString());
                            }
                        } finally {
                            writableDatabase222.endTransaction();
                        }
                    }
                    i++;
                    size = i2;
                }
            } catch (SQLiteException e3) {
                Log.w("DataItems", "Exception in gcLostNodes", e3);
            }
            if (chnj.m149036l()) {
                axxv.mo53747e();
                return;
            }
            return;
        }
        return;
        throw th;
    }
}
