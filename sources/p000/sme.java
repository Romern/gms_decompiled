package p000;

import android.app.usage.NetworkStats;
import android.app.usage.NetworkStatsManager;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.Log;
import com.google.android.gms.common.stats.net.contentprovider.NetworkUsageChimeraContentProvider;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/* renamed from: sme */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class sme implements Runnable {

    /* renamed from: a */
    private static final int[] f44729a = {0, 1};

    /* renamed from: b */
    private static final int[] f44730b = {0, 1, 2, 3};

    /* renamed from: c */
    private static final int[] f44731c = {0};

    /* renamed from: d */
    private static Collection f44732d;

    /* renamed from: e */
    private final ContentResolver f44733e;

    /* renamed from: f */
    private final Context f44734f;

    /* renamed from: g */
    private final NetworkStatsManager f44735g;

    /* renamed from: h */
    private final int f44736h;

    /* renamed from: i */
    private long f44737i = 0;

    /* renamed from: j */
    private long f44738j = 0;

    /* renamed from: k */
    private boolean f44739k = false;

    /* renamed from: l */
    private boolean f44740l = false;

    public sme(Context context, int i, long j, long j2, boolean z, boolean z2) {
        this.f44734f = context;
        this.f44733e = context.getContentResolver();
        this.f44736h = i;
        this.f44737i = j;
        this.f44738j = j2;
        this.f44739k = z;
        this.f44740l = z2;
        this.f44735g = (NetworkStatsManager) this.f44734f.getSystemService(NetworkStatsManager.class);
        f44732d = shq.m35307a().keySet();
    }

    /* renamed from: a */
    private static final smi m35644a(int i, int i2, int i3, int i4, long j, long j2, long j3, long j4, long j5, long j6) {
        smi smi = new smi(i, i2, i3, i4);
        smi.f44754r = j;
        smi.f44756t = j3;
        smi.f44755s = j2;
        smi.f44757u = j4;
        smi.f44752p = j5;
        smi.f44753q = j6;
        return smi;
    }

    /* renamed from: a */
    private static final void m35645a(ContentResolver contentResolver, long j, long j2) {
        if (j > j2) {
            StringBuilder sb = new StringBuilder(62);
            sb.append("Error deleting from ");
            sb.append(j);
            sb.append("- ");
            sb.append(j2);
            Log.e("NetworkUsageDbReporterN", sb.toString());
            return;
        }
        contentResolver.delete(NetworkUsageChimeraContentProvider.f30375b, "_id IN (SELECT _id FROM network_raw_entry_androidN WHERE from_datetime_updated_androidN >= ? AND to_datetime_updated_androidN <= ? )", new String[]{String.valueOf(j), String.valueOf(j2)});
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x03d4  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0227  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0233  */
    public final void run() {
        long j;
        ArrayList arrayList;
        String str;
        int size;
        int i;
        int i2;
        int i3;
        ContentResolver contentResolver;
        String str2;
        Integer valueOf;
        HashMap hashMap;
        int intValue;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int[] iArr;
        int[] iArr2;
        long j2;
        long j3;
        NetworkStats.Bucket bucket;
        long j4;
        sme sme = this;
        int i9 = Build.VERSION.SDK_INT;
        if (((Boolean) skj.f44624g.mo58455c()).booleanValue()) {
            String str3 = "NetworkUsageDbReporterN";
            if (!sme.f44734f.isDeviceProtectedStorage()) {
                long currentTimeMillis = System.currentTimeMillis();
                if (sme.f44740l) {
                    m35645a(sme.f44733e, smh.m35657b(currentTimeMillis).longValue(), smh.m35658c(currentTimeMillis).longValue());
                }
                Context context = sme.f44734f;
                long j5 = sme.f44737i;
                long j6 = sme.f44738j;
                ArrayList arrayList2 = new ArrayList();
                String subscriberId = ((TelephonyManager) context.getSystemService("phone")).getSubscriberId();
                try {
                    NetworkStats.Bucket bucket2 = new NetworkStats.Bucket();
                    for (Integer num : f44732d) {
                        boolean b = shq.m35308b(num.intValue());
                        int[] iArr3 = !b ? f44731c : f44730b;
                        int[] iArr4 = f44729a;
                        int length = iArr4.length;
                        int i10 = 0;
                        while (i10 < length) {
                            Integer valueOf2 = Integer.valueOf(iArr4[i10]);
                            int length2 = iArr3.length;
                            j = currentTimeMillis;
                            int i11 = 0;
                            while (i11 < length2) {
                                try {
                                    valueOf = Integer.valueOf(iArr3[i11]);
                                    str2 = str3;
                                } catch (SecurityException e) {
                                    e = e;
                                    str2 = str3;
                                    arrayList = arrayList2;
                                    str = str2;
                                    Log.e(str, "Gmscore does not have permission to view network usage data for a client module");
                                    bqye.m113758a(e);
                                    ContentValues[] contentValuesArr = new ContentValues[50];
                                    slx slx = new slx();
                                    size = arrayList.size();
                                    long j7 = j;
                                    i = 0;
                                    i2 = 0;
                                    while (i < size) {
                                    }
                                    if (i2 > 0) {
                                    }
                                    if (!sme.f44739k) {
                                    }
                                }
                                try {
                                    hashMap = new HashMap();
                                    intValue = num.intValue();
                                    if (valueOf.intValue() != 0) {
                                        intValue = num.intValue() | (valueOf.intValue() << 28);
                                    }
                                    if (b) {
                                        i4 = valueOf.intValue();
                                    } else {
                                        i4 = 7;
                                    }
                                    i5 = i11;
                                    i6 = length2;
                                    i7 = i10;
                                    i8 = length;
                                    iArr = iArr3;
                                    iArr2 = iArr4;
                                    j2 = j5;
                                    j3 = j5;
                                    arrayList = arrayList2;
                                    bucket = bucket2;
                                    j4 = j6;
                                } catch (SecurityException e2) {
                                    e = e2;
                                    arrayList = arrayList2;
                                    str = str2;
                                    Log.e(str, "Gmscore does not have permission to view network usage data for a client module");
                                    bqye.m113758a(e);
                                    ContentValues[] contentValuesArr2 = new ContentValues[50];
                                    slx slx2 = new slx();
                                    size = arrayList.size();
                                    long j72 = j;
                                    i = 0;
                                    i2 = 0;
                                    while (i < size) {
                                    }
                                    if (i2 > 0) {
                                    }
                                    if (!sme.f44739k) {
                                    }
                                }
                                try {
                                    NetworkStats queryDetailsForUidTag = sme.f44735g.queryDetailsForUidTag(valueOf2.intValue(), subscriberId, j2, j6, sme.f44736h, intValue);
                                    while (queryDetailsForUidTag.getNextBucket(bucket)) {
                                        int intValue2 = num.intValue();
                                        int i12 = sme.f44736h;
                                        int intValue3 = valueOf2.intValue();
                                        long startTimeStamp = bucket.getStartTimeStamp();
                                        smi a = m35644a(intValue2, i12, i4, intValue3, bucket.getRxBytes(), bucket.getRxPackets(), bucket.getTxBytes(), bucket.getTxPackets(), startTimeStamp, bucket.getEndTimeStamp());
                                        Long valueOf3 = Long.valueOf(smh.m35658c(startTimeStamp).longValue());
                                        smi smi = (smi) hashMap.get(valueOf3);
                                        if (smi == null) {
                                            smi = m35644a(intValue2, i12, i4, intValue3, 0, 0, 0, 0, Long.MAX_VALUE, Long.MIN_VALUE);
                                            hashMap.put(valueOf3, smi);
                                        }
                                        smi.mo25738a(a);
                                    }
                                    if (queryDetailsForUidTag != null) {
                                        queryDetailsForUidTag.close();
                                        arrayList.addAll(hashMap.values());
                                    }
                                    i11 = i5 + 1;
                                    arrayList2 = arrayList;
                                    bucket2 = bucket;
                                    str3 = str2;
                                    length2 = i6;
                                    i10 = i7;
                                    length = i8;
                                    iArr4 = iArr2;
                                    iArr3 = iArr;
                                    j5 = j3;
                                    j6 = j4;
                                } catch (SecurityException e3) {
                                    e = e3;
                                    str = str2;
                                    Log.e(str, "Gmscore does not have permission to view network usage data for a client module");
                                    bqye.m113758a(e);
                                    ContentValues[] contentValuesArr22 = new ContentValues[50];
                                    slx slx22 = new slx();
                                    size = arrayList.size();
                                    long j722 = j;
                                    i = 0;
                                    i2 = 0;
                                    while (i < size) {
                                    }
                                    if (i2 > 0) {
                                    }
                                    if (!sme.f44739k) {
                                    }
                                }
                            }
                            i10++;
                            currentTimeMillis = j;
                            j5 = j5;
                        }
                        j5 = j5;
                    }
                    j = currentTimeMillis;
                    arrayList = arrayList2;
                    str = str3;
                } catch (SecurityException e4) {
                    e = e4;
                    str2 = str3;
                    j = currentTimeMillis;
                    arrayList = arrayList2;
                    str = str2;
                    Log.e(str, "Gmscore does not have permission to view network usage data for a client module");
                    bqye.m113758a(e);
                    ContentValues[] contentValuesArr222 = new ContentValues[50];
                    slx slx222 = new slx();
                    size = arrayList.size();
                    long j7222 = j;
                    i = 0;
                    i2 = 0;
                    while (i < size) {
                    }
                    if (i2 > 0) {
                    }
                    if (!sme.f44739k) {
                    }
                }
                ContentValues[] contentValuesArr2222 = new ContentValues[50];
                slx slx2222 = new slx();
                size = arrayList.size();
                long j72222 = j;
                i = 0;
                i2 = 0;
                while (i < size) {
                    smi smi2 = (smi) arrayList.get(i);
                    ContentValues b2 = slx2222.mo8188a();
                    contentValuesArr2222[i2] = b2;
                    m35647a(b2, smi2.f44748l, smi2.f44749m, smi2.f44750n, smi2.f44751o, smi2.mo25740c(), smi2.f44755s, smi2.mo25741d(), smi2.f44757u, j72222, smi2.f44752p, smi2.f44753q, false, 0L);
                    i2++;
                    if (i2 == 50) {
                        sme = this;
                        m35646a(sme.f44733e, contentValuesArr2222, slx2222, 50);
                        i2 = 0;
                    } else {
                        sme = this;
                    }
                    i++;
                    j72222 = System.currentTimeMillis();
                }
                if (i2 > 0) {
                    m35646a(sme.f44733e, contentValuesArr2222, slx2222, i2);
                    i2 = 0;
                }
                if (!sme.f44739k) {
                    ContentResolver contentResolver2 = sme.f44733e;
                    long longValue = smh.m35658c(j72222).longValue();
                    if (longValue > j72222) {
                        StringBuilder sb = new StringBuilder(90);
                        sb.append("Error in groupData: fromDateTime(");
                        sb.append(longValue);
                        sb.append(") > toDateTime (");
                        sb.append(j72222);
                        sb.append(")");
                        Log.e(str, sb.toString());
                        return;
                    }
                    String[] strArr = {String.valueOf(longValue), String.valueOf(j72222)};
                    Cursor query = contentResolver2.query(NetworkUsageChimeraContentProvider.f30383j, null, null, strArr, null);
                    if (query != null) {
                        try {
                            int columnIndexOrThrow = query.getColumnIndexOrThrow("_id");
                            int columnIndexOrThrow2 = query.getColumnIndexOrThrow("datetime_updated_androidN");
                            int columnIndexOrThrow3 = query.getColumnIndexOrThrow("from_datetime_updated_androidN");
                            int columnIndexOrThrow4 = query.getColumnIndexOrThrow("to_datetime_updated_androidN");
                            int columnIndexOrThrow5 = query.getColumnIndexOrThrow("tag_androidN");
                            int columnIndexOrThrow6 = query.getColumnIndexOrThrow("uid_androidN");
                            int columnIndexOrThrow7 = query.getColumnIndexOrThrow("device_state_androidN");
                            int columnIndexOrThrow8 = query.getColumnIndexOrThrow("transport_type_androidN");
                            int columnIndexOrThrow9 = query.getColumnIndexOrThrow("rxbytes_androidN");
                            int columnIndexOrThrow10 = query.getColumnIndexOrThrow("txbytes_androidN");
                            int columnIndexOrThrow11 = query.getColumnIndexOrThrow("rxpackets_androidN");
                            String[] strArr2 = strArr;
                            int columnIndexOrThrow12 = query.getColumnIndexOrThrow("txpackets_androidN");
                            ContentResolver contentResolver3 = contentResolver2;
                            int columnIndexOrThrow13 = query.getColumnIndexOrThrow("row_group_count_AndroidN");
                            int i13 = columnIndexOrThrow4;
                            ArrayList arrayList3 = new ArrayList();
                            int i14 = columnIndexOrThrow3;
                            int i15 = i2;
                            boolean z = false;
                            while (query.moveToNext()) {
                                int i16 = columnIndexOrThrow;
                                Long valueOf4 = Long.valueOf(query.getLong(columnIndexOrThrow));
                                arrayList3.add(valueOf4);
                                if (query.getLong(columnIndexOrThrow13) != 1) {
                                    ContentValues b3 = slx2222.mo8188a();
                                    contentValuesArr2222[i15] = b3;
                                    int i17 = query.getInt(columnIndexOrThrow5);
                                    int i18 = query.getInt(columnIndexOrThrow6);
                                    int i19 = query.getInt(columnIndexOrThrow7);
                                    int i20 = query.getInt(columnIndexOrThrow8);
                                    long j8 = query.getLong(columnIndexOrThrow9);
                                    long j9 = query.getLong(columnIndexOrThrow11);
                                    long j10 = query.getLong(columnIndexOrThrow10);
                                    long j11 = query.getLong(columnIndexOrThrow12);
                                    long j12 = query.getLong(columnIndexOrThrow2);
                                    int i21 = columnIndexOrThrow13;
                                    long j13 = query.getLong(i14);
                                    i14 = i14;
                                    int i22 = i13;
                                    m35647a(b3, i17, i18, i19, i20, j8, j9, j10, j11, j12, j13, query.getLong(i22), true, valueOf4);
                                    int i23 = i15 + 1;
                                    if (i23 != 50) {
                                        i3 = i23;
                                        contentResolver = contentResolver3;
                                    } else {
                                        contentResolver = contentResolver3;
                                        m35646a(contentResolver, contentValuesArr2222, slx2222, 50);
                                        i3 = 0;
                                    }
                                    i13 = i22;
                                    contentResolver3 = contentResolver;
                                    i15 = i3;
                                    columnIndexOrThrow13 = i21;
                                    columnIndexOrThrow = i16;
                                    z = true;
                                } else {
                                    columnIndexOrThrow13 = columnIndexOrThrow13;
                                    columnIndexOrThrow = i16;
                                }
                            }
                            ContentResolver contentResolver4 = contentResolver3;
                            if (i15 > 0) {
                                m35646a(contentResolver4, contentValuesArr2222, slx2222, i15);
                            }
                            if (z) {
                                StringBuilder sb2 = new StringBuilder();
                                int size2 = arrayList3.size();
                                int i24 = 0;
                                while (i24 < size2) {
                                    String[] strArr3 = strArr2;
                                    sb2.append(arrayList3.get(i24));
                                    if (i24 < size2 - 1) {
                                        sb2.append(",");
                                    }
                                    i24++;
                                    strArr2 = strArr3;
                                }
                                String valueOf5 = String.valueOf(sb2);
                                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf5).length() + 149);
                                sb3.append("_id IN (SELECT _id FROM network_raw_entry_androidN WHERE from_datetime_updated_androidN >= ? AND to_datetime_updated_androidN <= ? AND _id NOT IN (");
                                sb3.append(valueOf5);
                                sb3.append("))");
                                contentResolver4.delete(NetworkUsageChimeraContentProvider.f30375b, sb3.toString(), strArr2);
                            }
                        } catch (Throwable th) {
                            query.close();
                            throw th;
                        }
                    }
                    if (query != null) {
                        query.close();
                        return;
                    }
                    return;
                }
                m35645a(this.f44733e, 0, smh.m35656a(j72222));
                return;
            }
            Log.e(str3, "This task shouldn't run on a Device Protected Storage Context.");
        }
    }

    /* renamed from: a */
    private static final void m35646a(ContentResolver contentResolver, ContentValues[] contentValuesArr, slx slx, int i) {
        if (contentResolver.bulkInsert(NetworkUsageChimeraContentProvider.f30381h, contentValuesArr) != i) {
            Log.w("NetworkUsageDbReporterN", "Not all values were updated or inserted.");
        }
        for (int i2 = 0; i2 < i; i2++) {
            ContentValues contentValues = contentValuesArr[i2];
            sdo.m34959a(contentValues);
            slx.mo8189a(contentValues);
            contentValuesArr[i2] = null;
        }
    }

    /* renamed from: a */
    public static final void m35647a(ContentValues contentValues, int i, int i2, int i3, int i4, long j, long j2, long j3, long j4, long j5, long j6, long j7, boolean z, Long l) {
        contentValues.put("datetime_updated_androidN", Long.valueOf(j5));
        contentValues.put("from_datetime_updated_androidN", Long.valueOf(j6));
        contentValues.put("to_datetime_updated_androidN", Long.valueOf(j7));
        contentValues.put("tag_androidN", Integer.valueOf(i));
        contentValues.put("uid_androidN", Integer.valueOf(i2));
        contentValues.put("device_state_androidN", Integer.valueOf(i3));
        contentValues.put("transport_type_androidN", Integer.valueOf(i4));
        contentValues.put("rxbytes_androidN", Long.valueOf(j));
        contentValues.put("rxpackets_androidN", Long.valueOf(j2));
        contentValues.put("txbytes_androidN", Long.valueOf(j3));
        contentValues.put("txpackets_androidN", Long.valueOf(j4));
        contentValues.put("is_update", Boolean.valueOf(z));
        if (z) {
            contentValues.put("id_update_row", l);
        }
    }
}
