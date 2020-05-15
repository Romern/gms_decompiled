package p000;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.Cursor;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.stats.net.contentprovider.NetworkUsageChimeraContentProvider;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: smf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class smf implements Runnable {

    /* renamed from: a */
    private static final String[] f44741a = {"_id", "datetime_updated"};

    /* renamed from: b */
    private final ContentResolver f44742b;

    /* renamed from: c */
    private final int f44743c;

    /* renamed from: d */
    private long f44744d;

    /* renamed from: e */
    private Map f44745e;

    public smf(ContentResolver contentResolver, int i) {
        this.f44742b = contentResolver;
        this.f44743c = i;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: smf.a(android.content.ContentValues, long, int, boolean, long, smc):void
     arg types: [android.content.ContentValues, long, int, int, long, smc]
     candidates:
      smf.a(android.content.ContentResolver, android.content.ContentValues[], int, slx, long, long):int
      smf.a(android.content.ContentValues, long, int, boolean, long, smc):void */
    /* renamed from: a */
    private static final int m35648a(ContentResolver contentResolver, ContentValues[] contentValuesArr, int i, slx slx, long j, long j2) {
        int i2;
        ArrayList arrayList;
        ContentValues[] contentValuesArr2 = contentValuesArr;
        long j3 = j;
        long j4 = j2;
        if (j3 > j4) {
            StringBuilder sb = new StringBuilder(90);
            sb.append("Error in groupData: fromDateTime(");
            sb.append(j3);
            sb.append(") > toDateTime (");
            sb.append(j4);
            sb.append(")");
            Log.e("NetworkUsageDbReporter", sb.toString());
            return i;
        }
        String[] strArr = {String.valueOf(j), String.valueOf(j2)};
        Cursor query = contentResolver.query(NetworkUsageChimeraContentProvider.f30382i, null, null, strArr, null);
        if (query != null) {
            try {
                int columnIndexOrThrow = query.getColumnIndexOrThrow("_id");
                int columnIndexOrThrow2 = query.getColumnIndexOrThrow("datetime_updated");
                int columnIndexOrThrow3 = query.getColumnIndexOrThrow("iface");
                int columnIndexOrThrow4 = query.getColumnIndexOrThrow("tag");
                int columnIndexOrThrow5 = query.getColumnIndexOrThrow("uid");
                int columnIndexOrThrow6 = query.getColumnIndexOrThrow("counter_set");
                int columnIndexOrThrow7 = query.getColumnIndexOrThrow("device_state");
                int columnIndexOrThrow8 = query.getColumnIndexOrThrow("transport_type");
                int columnIndexOrThrow9 = query.getColumnIndexOrThrow("rxbytes");
                int columnIndexOrThrow10 = query.getColumnIndexOrThrow("rxpackets");
                int columnIndexOrThrow11 = query.getColumnIndexOrThrow("txbytes");
                int columnIndexOrThrow12 = query.getColumnIndexOrThrow("txpackets");
                String[] strArr2 = strArr;
                int columnIndexOrThrow13 = query.getColumnIndexOrThrow("row_group_count");
                ArrayList arrayList2 = new ArrayList();
                i2 = i;
                boolean z = false;
                while (query.moveToNext()) {
                    long j5 = query.getLong(columnIndexOrThrow);
                    int i3 = columnIndexOrThrow;
                    arrayList2.add(Long.valueOf(j5));
                    if (query.getLong(columnIndexOrThrow13) != 1) {
                        String string = query.getString(columnIndexOrThrow3);
                        int i4 = query.getInt(columnIndexOrThrow4);
                        int i5 = query.getInt(columnIndexOrThrow5);
                        int i6 = query.getInt(columnIndexOrThrow6);
                        int i7 = query.getInt(columnIndexOrThrow7);
                        int i8 = query.getInt(columnIndexOrThrow8);
                        long j6 = query.getLong(columnIndexOrThrow2);
                        int i9 = columnIndexOrThrow2;
                        int i10 = columnIndexOrThrow3;
                        long j7 = query.getLong(columnIndexOrThrow9);
                        int i11 = columnIndexOrThrow4;
                        int i12 = columnIndexOrThrow5;
                        long j8 = query.getLong(columnIndexOrThrow10);
                        int i13 = columnIndexOrThrow6;
                        int i14 = columnIndexOrThrow7;
                        long j9 = query.getLong(columnIndexOrThrow11);
                        int i15 = columnIndexOrThrow13;
                        int i16 = columnIndexOrThrow11;
                        long j10 = query.getLong(columnIndexOrThrow12);
                        ArrayList arrayList3 = arrayList2;
                        smc smc = new smc(string, i4, i5, i7, i8);
                        if (i6 <= 0) {
                            smc.f44720c = j7;
                            smc.f44721d = j8;
                            smc.f44722e = j9;
                            smc.f44723f = j10;
                        } else {
                            smc.f44724g = j7;
                            smc.f44725h = j8;
                            smc.f44726i = j9;
                            smc.f44727j = j10;
                        }
                        ContentValues b = slx.mo8188a();
                        contentValuesArr2[i2] = b;
                        m35651a(b, j6, i6, true, j5, smc);
                        int i17 = i2 + 1;
                        if (i17 != 50) {
                            i2 = i17;
                            arrayList = arrayList3;
                        } else {
                            arrayList = arrayList3;
                            m35650a(contentResolver, contentValuesArr2, slx, 50);
                            i2 = 0;
                        }
                        columnIndexOrThrow = i3;
                        columnIndexOrThrow2 = i9;
                        arrayList2 = arrayList;
                        columnIndexOrThrow3 = i10;
                        columnIndexOrThrow4 = i11;
                        columnIndexOrThrow5 = i12;
                        columnIndexOrThrow6 = i13;
                        columnIndexOrThrow7 = i14;
                        columnIndexOrThrow11 = i16;
                        columnIndexOrThrow13 = i15;
                        z = true;
                    } else {
                        columnIndexOrThrow = i3;
                        columnIndexOrThrow2 = columnIndexOrThrow2;
                        arrayList2 = arrayList2;
                        columnIndexOrThrow3 = columnIndexOrThrow3;
                    }
                }
                ArrayList arrayList4 = arrayList2;
                ContentResolver contentResolver2 = contentResolver;
                if (z) {
                    StringBuilder sb2 = new StringBuilder();
                    int size = arrayList4.size();
                    int i18 = 0;
                    while (i18 < size) {
                        String[] strArr3 = strArr2;
                        sb2.append(arrayList4.get(i18));
                        if (i18 < size - 1) {
                            sb2.append(",");
                        }
                        i18++;
                        strArr2 = strArr3;
                    }
                    contentResolver2.delete(NetworkUsageChimeraContentProvider.f30374a, String.format("_id IN (SELECT _id FROM network_raw_entry WHERE datetime_updated BETWEEN ? AND ? AND _id NOT IN (%s))", sb2.toString()), strArr2);
                }
            } catch (Throwable th) {
                query.close();
                throw th;
            }
        } else {
            i2 = i;
        }
        if (query != null) {
            query.close();
        }
        return i2;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: smf.a(android.content.ContentValues, long, int, boolean, long, smc):void
     arg types: [android.content.ContentValues, long, int, int, long, smc]
     candidates:
      smf.a(android.content.ContentResolver, android.content.ContentValues[], int, slx, long, long):int
      smf.a(android.content.ContentValues, long, int, boolean, long, smc):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: smf.a(android.content.ContentValues, long, int, boolean, long, smc):void
     arg types: [android.content.ContentValues, long, int, int, int, smc]
     candidates:
      smf.a(android.content.ContentResolver, android.content.ContentValues[], int, slx, long, long):int
      smf.a(android.content.ContentValues, long, int, boolean, long, smc):void */
    public final void run() {
        sly sly;
        boolean z;
        boolean z2;
        int i;
        int i2;
        long j;
        boolean z3;
        int i3;
        slx slx;
        int i4;
        Cursor query;
        boolean z4;
        long j2;
        ContentValues[] contentValuesArr;
        long j3;
        long j4;
        long j5;
        File file = new File("/proc/net/xt_qtaguid/stats");
        this.f44745e = new HashMap(sks.m35544a());
        this.f44744d = smh.m35658c(System.currentTimeMillis()).longValue();
        try {
            sly = new sly(new FileInputStream(file));
            sly.mo25726a();
            try {
                sly.mo25728c();
                ContentResolver contentResolver = this.f44742b;
                smc smc = new smc("?", 0, this.f44743c, 7, -1);
                smc smc2 = new smc("?", 0, this.f44743c, 7, -1);
                ContentValues[] contentValuesArr2 = new ContentValues[50];
                slx slx2 = new slx();
                int i5 = 0;
                boolean z5 = false;
                int i6 = 0;
                while (true) {
                    try {
                        char c = 5;
                        if (!sly.mo25727b() && !z5) {
                            break;
                        }
                        if (z5) {
                            smc.f44748l = smc2.f44748l;
                            smc.f44749m = smc2.f44749m;
                            smc.f44719b = smc2.f44719b;
                            smc.f44751o = smc2.f44751o;
                            smc.f44750n = smc2.f44750n;
                            smc.f44720c = smc2.f44720c;
                            smc.f44721d = smc2.f44721d;
                            smc.f44722e = smc2.f44722e;
                            smc.f44723f = smc2.f44723f;
                            smc.f44724g = smc2.f44724g;
                            smc.f44725h = smc2.f44725h;
                            smc.f44726i = smc2.f44726i;
                            smc.f44727j = smc2.f44727j;
                            z = false;
                        } else if (m35652a(sly, smc)) {
                            if (sly.mo25727b() && m35652a(sly, smc2)) {
                                if (smc.f44719b.equals(smc2.f44719b) && smc.f44749m == smc2.f44749m && smc.f44748l == smc2.f44748l && smc.f44750n == smc2.f44750n && smc.f44751o == smc2.f44751o) {
                                    smc.mo25738a(smc2);
                                } else {
                                    z = true;
                                }
                            }
                            z = z5;
                        } else {
                            i5 = 0;
                        }
                        long currentTimeMillis = System.currentTimeMillis();
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        slx slx3 = slx2;
                        ContentValues[] contentValuesArr3 = contentValuesArr2;
                        smc smc3 = smc2;
                        long a = m35649a(contentResolver, currentTimeMillis, elapsedRealtime, 0, smc);
                        long a2 = m35649a(contentResolver, currentTimeMillis, elapsedRealtime, 1, smc);
                        long j6 = currentTimeMillis - elapsedRealtime;
                        if (j6 >= this.f44744d) {
                            i = i6;
                            z2 = z;
                            i2 = 0;
                        } else {
                            int i7 = 0;
                            while (i7 < 2) {
                                String[] strArr = new String[8];
                                strArr[0] = String.valueOf(j6);
                                strArr[1] = String.valueOf(this.f44744d - 1);
                                strArr[2] = smc.f44719b;
                                strArr[3] = String.valueOf(smc.f44748l);
                                strArr[4] = String.valueOf(smc.f44749m);
                                strArr[c] = String.valueOf(i7);
                                strArr[6] = String.valueOf(smc.f44750n);
                                strArr[7] = String.valueOf(smc.f44751o);
                                query = contentResolver.query(NetworkUsageChimeraContentProvider.f30376c, null, null, strArr, null);
                                if (query == null) {
                                    z4 = z;
                                } else if (query.moveToFirst()) {
                                    long j7 = query.getLong(query.getColumnIndexOrThrow("rxbytes"));
                                    long j8 = query.getLong(query.getColumnIndexOrThrow("rxpackets"));
                                    long j9 = query.getLong(query.getColumnIndexOrThrow("txbytes"));
                                    long j10 = query.getLong(query.getColumnIndexOrThrow("txpackets"));
                                    if (i7 == 0) {
                                        z4 = z;
                                        smc.f44720c -= j7;
                                        smc.f44721d -= j8;
                                        smc.f44722e -= j9;
                                        smc.f44723f -= j10;
                                    } else {
                                        z4 = z;
                                        smc.f44724g -= j7;
                                        smc.f44725h -= j8;
                                        smc.f44726i -= j9;
                                        smc.f44727j -= j10;
                                    }
                                } else {
                                    z4 = z;
                                }
                                if (query != null) {
                                    query.close();
                                }
                                i7++;
                                z = z4;
                                c = 5;
                            }
                            z2 = z;
                            i = i6;
                            i2 = 0;
                        }
                        for (int i8 = 2; i2 < i8; i8 = 2) {
                            if (i2 != 0) {
                                z3 = smc.f44724g > 0 || smc.f44725h > 0 || smc.f44726i > 0 || smc.f44727j > 0;
                                j = a2;
                            } else {
                                z3 = smc.f44720c > 0 || smc.f44721d > 0 || smc.f44722e > 0 || smc.f44723f > 0;
                                j = a;
                            }
                            if (z3) {
                                ContentValues b = slx3.mo8188a();
                                contentValuesArr3[i] = b;
                                if (j > -1) {
                                    m35651a(b, currentTimeMillis, i2, true, j, smc);
                                    i3 = i + 1;
                                } else {
                                    m35651a(b, currentTimeMillis, i2, false, 0L, smc);
                                    i3 = i + 1;
                                }
                            } else {
                                i3 = i;
                            }
                            if (i3 != 50) {
                                i4 = i3;
                                slx = slx3;
                            } else {
                                slx = slx3;
                                m35650a(contentResolver, contentValuesArr3, slx, 50);
                                i4 = 0;
                            }
                            i2++;
                            slx3 = slx;
                        }
                        slx2 = slx3;
                        contentValuesArr2 = contentValuesArr3;
                        i6 = i;
                        smc2 = smc3;
                        z5 = z2;
                        i5 = 0;
                    } catch (IOException e) {
                        String.valueOf(e.getMessage());
                        srz.m36171a(sly);
                        return;
                    } catch (IllegalArgumentException e2) {
                        try {
                            String valueOf = String.valueOf(e2.getMessage());
                            if (valueOf.length() == 0) {
                                new String("Illegal argument while reading database\n");
                            } else {
                                "Illegal argument while reading database\n".concat(valueOf);
                            }
                            srz.m36171a(sly);
                            return;
                        } catch (Throwable th) {
                            srz.m36171a(sly);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        query.close();
                        throw th2;
                    }
                }
                if (i6 > 0) {
                    m35650a(contentResolver, contentValuesArr2, slx2, i6);
                    i6 = 0;
                }
                srz.m36171a(sly);
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                long currentTimeMillis2 = System.currentTimeMillis();
                long j11 = currentTimeMillis2 - elapsedRealtime2;
                long j12 = this.f44744d;
                Calendar instance = Calendar.getInstance();
                instance.setTimeInMillis(j12);
                instance.set(11, i5);
                instance.set(12, i5);
                instance.set(13, i5);
                instance.set(14, i5);
                instance.set(5, 1);
                long timeInMillis = instance.getTimeInMillis();
                long longValue = smh.m35657b(this.f44744d).longValue();
                if (j11 > timeInMillis) {
                    if (j11 <= timeInMillis || j11 > longValue) {
                        contentValuesArr = contentValuesArr2;
                        if (j11 > longValue) {
                            long j13 = this.f44744d;
                            if (j11 <= j13) {
                                j2 = j13;
                                j4 = longValue;
                                j3 = timeInMillis;
                                timeInMillis = j11;
                            }
                        }
                        j4 = timeInMillis <= longValue ? longValue : timeInMillis;
                        if (timeInMillis > longValue) {
                            timeInMillis = longValue;
                        }
                        longValue = this.f44744d;
                        j2 = j11;
                    } else {
                        contentValuesArr = contentValuesArr2;
                        j2 = this.f44744d;
                        j4 = j11;
                    }
                    timeInMillis = longValue;
                    j3 = timeInMillis;
                } else {
                    contentValuesArr = contentValuesArr2;
                    if (j11 >= longValue) {
                        j5 = j11;
                        j11 = longValue;
                    } else {
                        if (longValue >= timeInMillis) {
                            j5 = timeInMillis;
                            timeInMillis = longValue;
                        }
                        j2 = this.f44744d;
                        j4 = longValue;
                        j3 = j11;
                    }
                    longValue = j5;
                    j2 = this.f44744d;
                    j4 = longValue;
                    j3 = j11;
                }
                if (j3 != j4) {
                    i6 = m35648a(contentResolver, contentValuesArr, i6, slx2, j3, j4 - 1);
                }
                if (j4 != timeInMillis) {
                    i6 = m35648a(contentResolver, contentValuesArr, i6, slx2, j4, timeInMillis - 1);
                }
                if (timeInMillis != j2) {
                    i6 = m35648a(contentResolver, contentValuesArr, i6, slx2, timeInMillis, j2 - 1);
                }
                int a3 = m35648a(contentResolver, contentValuesArr, i6, slx2, j2, currentTimeMillis2);
                if (a3 > 0) {
                    m35650a(contentResolver, contentValuesArr, slx2, a3);
                }
                if (elapsedRealtime2 < TimeUnit.DAYS.toMillis(31)) {
                    contentResolver.delete(NetworkUsageChimeraContentProvider.f30374a, "datetime_updated < ?", new String[]{String.valueOf(Long.valueOf(smh.m35656a(System.currentTimeMillis())))});
                }
            } catch (IOException e3) {
                e = e3;
                String.valueOf(e.getMessage());
                srz.m36171a(sly);
            }
        } catch (IOException e4) {
            e = e4;
            sly = null;
            String.valueOf(e.getMessage());
            srz.m36171a(sly);
        }
    }

    /* renamed from: a */
    private final long m35649a(ContentResolver contentResolver, long j, long j2, int i, smc smc) {
        Cursor query = contentResolver.query(NetworkUsageChimeraContentProvider.f30374a, f44741a, "datetime_updated BETWEEN ? AND ? AND iface = ? AND tag = ? AND uid = ? AND counter_set = ? AND device_state = ? AND transport_type = ? ", new String[]{String.valueOf(this.f44744d), String.valueOf(this.f44744d + 86399999), smc.f44719b, String.valueOf(smc.f44748l), String.valueOf(smc.f44749m), String.valueOf(i), String.valueOf(smc.f44750n), String.valueOf(smc.f44751o)}, "datetime_updated DESC");
        long j3 = -1;
        if (query != null) {
            try {
                if (query.moveToFirst()) {
                    int columnIndexOrThrow = query.getColumnIndexOrThrow("_id");
                    int columnIndexOrThrow2 = query.getColumnIndexOrThrow("datetime_updated");
                    long j4 = query.getLong(columnIndexOrThrow);
                    if (j2 >= j - query.getLong(columnIndexOrThrow2)) {
                        j3 = j4;
                    }
                }
            } finally {
                query.close();
            }
        }
        return j3;
    }

    /* renamed from: a */
    private static final void m35650a(ContentResolver contentResolver, ContentValues[] contentValuesArr, slx slx, int i) {
        if (contentResolver.bulkInsert(NetworkUsageChimeraContentProvider.f30380g, contentValuesArr) != i) {
            Log.w("NetworkUsageDbReporter", "Not all values were updated or inserted.");
        }
        for (int i2 = 0; i2 < i; i2++) {
            ContentValues contentValues = contentValuesArr[i2];
            sdo.m34959a(contentValues);
            slx.mo8189a(contentValues);
            contentValuesArr[i2] = null;
        }
    }

    /* renamed from: a */
    public static final void m35651a(ContentValues contentValues, long j, int i, boolean z, long j2, smc smc) {
        contentValues.put("datetime_updated", Long.valueOf(j));
        contentValues.put("iface", smc.f44719b);
        contentValues.put("tag", Integer.valueOf(smc.f44748l));
        contentValues.put("uid", Integer.valueOf(smc.f44749m));
        contentValues.put("counter_set", Integer.valueOf(i));
        contentValues.put("device_state", Integer.valueOf(smc.f44750n));
        contentValues.put("transport_type", Integer.valueOf(smc.f44751o));
        if (i == 0) {
            contentValues.put("rxbytes", Long.valueOf(smc.f44720c));
            contentValues.put("rxpackets", Long.valueOf(smc.f44721d));
            contentValues.put("txbytes", Long.valueOf(smc.f44722e));
            contentValues.put("txpackets", Long.valueOf(smc.f44723f));
        } else {
            contentValues.put("rxbytes", Long.valueOf(smc.f44724g));
            contentValues.put("rxpackets", Long.valueOf(smc.f44725h));
            contentValues.put("txbytes", Long.valueOf(smc.f44726i));
            contentValues.put("txpackets", Long.valueOf(smc.f44727j));
        }
        contentValues.put("is_update", Boolean.valueOf(z));
        if (z) {
            contentValues.put("id_update_row", Long.valueOf(j2));
        }
    }

    /* renamed from: a */
    private final boolean m35652a(sly sly, smc smc) {
        int i;
        int i2;
        int i3;
        sly.mo25732f();
        String d = sly.mo25730d();
        smc.f44719b = d;
        String d2 = sly.mo25730d();
        int length = d2.length();
        if (length > 10) {
            i = Long.decode(d2.substring(0, length - 8)).intValue();
        } else {
            i = 0;
        }
        if (shq.m35308b(i)) {
            int c = shq.m35309c(i);
            i2 = shq.m35310d(i);
            i = c;
        } else {
            i2 = 7;
        }
        smc.f44748l = i;
        smc.f44750n = i2;
        try {
            i3 = this.f44745e.containsKey(d) ? ((Integer) this.f44745e.get(d)).intValue() : sks.m35542a(d);
        } catch (ClassCastException e) {
            i3 = sks.m35542a(d);
        }
        smc.f44751o = i3;
        int f = sly.mo25732f();
        if (f == this.f44743c) {
            smc.f44749m = f;
            int f2 = sly.mo25732f();
            long e2 = sly.mo25731e();
            long e3 = sly.mo25731e();
            long e4 = sly.mo25731e();
            long e5 = sly.mo25731e();
            sly.mo25728c();
            if (f2 <= 0) {
                smc.f44720c = e2;
                smc.f44721d = e3;
                smc.f44722e = e4;
                smc.f44723f = e5;
                smc.f44724g = 0;
                smc.f44725h = 0;
                smc.f44726i = 0;
                smc.f44727j = 0;
                return true;
            }
            smc.f44720c = 0;
            smc.f44721d = 0;
            smc.f44722e = 0;
            smc.f44723f = 0;
            smc.f44724g = e2;
            smc.f44725h = e3;
            smc.f44726i = e4;
            smc.f44727j = e5;
            return true;
        }
        sly.mo25728c();
        return false;
    }
}
