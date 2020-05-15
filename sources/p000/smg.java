package p000;

import android.content.ContentResolver;
import android.database.Cursor;
import android.os.Build;
import com.google.android.gms.common.stats.net.contentprovider.NetworkUsageChimeraContentProvider;
import java.util.Collection;

/* renamed from: smg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class smg {
    /* renamed from: a */
    public static Cursor m35653a(ContentResolver contentResolver, long j, long j2) {
        String[] strArr = {String.valueOf(j), String.valueOf(j2)};
        if (((Boolean) skj.f44624g.mo58455c()).booleanValue()) {
            int i = Build.VERSION.SDK_INT;
            return contentResolver.query(NetworkUsageChimeraContentProvider.f30377d, null, null, strArr, null);
        }
        int i2 = Build.VERSION.SDK_INT;
        return null;
    }

    /* renamed from: b */
    public static Collection m35654b(ContentResolver contentResolver, long j, long j2) {
        C1223np npVar = new C1223np();
        int i = 2;
        int i2 = 1;
        int i3 = 3;
        int i4 = 4;
        int i5 = 5;
        int i6 = 6;
        int i7 = 7;
        String[] strArr = {"_id", "datetime_updated", "iface", "tag", "uid", "counter_set", "device_state", "transport_type", "rxbytes", "rxpackets", "txbytes", "txpackets"};
        Cursor query = contentResolver.query(NetworkUsageChimeraContentProvider.f30374a, strArr, "datetime_updated BETWEEN ? AND ?", new String[]{String.valueOf(j), String.valueOf(j2)}, null);
        if (query == null) {
            return bngx.m109376e();
        }
        while (query.moveToNext()) {
            try {
                long j3 = query.getLong(i2);
                String string = query.getString(i);
                int i8 = query.getInt(i3);
                int i9 = query.getInt(i4);
                int i10 = query.getInt(i5);
                int i11 = query.getInt(i6);
                int i12 = query.getInt(i7);
                long j4 = query.getLong(8);
                long j5 = query.getLong(9);
                long j6 = query.getLong(10);
                long j7 = query.getLong(11);
                smc smc = new smc(string, i8, i9, i11, i12);
                if (i10 <= 0) {
                    smc.f44720c = j4;
                    smc.f44721d = j5;
                    smc.f44722e = j6;
                    smc.f44723f = j7;
                } else {
                    smc.f44724g = j4;
                    smc.f44725h = j5;
                    smc.f44726i = j6;
                    smc.f44727j = j7;
                }
                smc.f44752p = j3;
                smc.f44753q = j3;
                String str = smc.f44719b;
                int i13 = smc.f44748l;
                int i14 = smc.f44749m;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 22);
                sb.append(str);
                sb.append(i13);
                sb.append(i14);
                String sb2 = sb.toString();
                smd smd = (smd) npVar.get(sb2);
                if (smd == null) {
                    smd smd2 = new smd(smc.f44719b, smc.f44748l, smc.f44749m, smc.f44751o);
                    smd2.mo25746a(smc);
                    npVar.put(sb2, smd2);
                    i = 2;
                    i2 = 1;
                    i3 = 3;
                    i4 = 4;
                    i5 = 5;
                    i6 = 6;
                    i7 = 7;
                } else {
                    smd.mo25746a(smc);
                    i = 2;
                    i2 = 1;
                    i3 = 3;
                    i4 = 4;
                    i5 = 5;
                    i6 = 6;
                    i7 = 7;
                }
            } catch (Throwable th) {
                if (query != null) {
                    query.close();
                }
                throw th;
            }
        }
        query.close();
        return npVar.values();
    }

    /* renamed from: c */
    public static Collection m35655c(ContentResolver contentResolver, long j, long j2) {
        int i = Build.VERSION.SDK_INT;
        if (!((Boolean) skj.f44624g.mo58455c()).booleanValue()) {
            return bngx.m109376e();
        }
        C1223np npVar = new C1223np();
        Cursor query = contentResolver.query(NetworkUsageChimeraContentProvider.f30375b, null, "from_datetime_updated_androidN >= ? AND to_datetime_updated_androidN <= ? ", new String[]{String.valueOf(j), String.valueOf(j2)}, null);
        if (query == null) {
            try {
                return bngx.m109376e();
            } catch (Throwable th) {
                if (query != null) {
                    query.close();
                }
                throw th;
            }
        } else {
            int columnIndexOrThrow = query.getColumnIndexOrThrow("tag_androidN");
            int columnIndexOrThrow2 = query.getColumnIndexOrThrow("uid_androidN");
            int columnIndexOrThrow3 = query.getColumnIndexOrThrow("device_state_androidN");
            int columnIndexOrThrow4 = query.getColumnIndexOrThrow("transport_type_androidN");
            int columnIndexOrThrow5 = query.getColumnIndexOrThrow("rxbytes_androidN");
            int columnIndexOrThrow6 = query.getColumnIndexOrThrow("rxpackets_androidN");
            int columnIndexOrThrow7 = query.getColumnIndexOrThrow("txbytes_androidN");
            int columnIndexOrThrow8 = query.getColumnIndexOrThrow("txpackets_androidN");
            while (query.moveToNext()) {
                smi smi = new smi(query.getInt(columnIndexOrThrow), query.getInt(columnIndexOrThrow2), query.getInt(columnIndexOrThrow3), query.getInt(columnIndexOrThrow4));
                smi.f44754r = query.getLong(columnIndexOrThrow5);
                smi.f44755s = query.getLong(columnIndexOrThrow6);
                smi.f44756t = query.getLong(columnIndexOrThrow7);
                smi.f44757u = query.getLong(columnIndexOrThrow8);
                String valueOf = String.valueOf(smi.f44748l);
                int i2 = smi.f44749m;
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 11);
                sb.append(valueOf);
                sb.append(i2);
                String sb2 = sb.toString();
                smj smj = (smj) npVar.get(sb2);
                if (smj == null) {
                    smj smj2 = new smj(smi.f44748l, smi.f44749m, smi.f44751o);
                    smj2.mo25746a(smi);
                    npVar.put(sb2, smj2);
                } else {
                    smj.mo25746a(smi);
                }
            }
            query.close();
            return npVar.values();
        }
    }
}
