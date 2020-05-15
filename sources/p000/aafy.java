package p000;

import android.content.ContentValues;
import android.database.Cursor;

/* renamed from: aafy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aafy extends aaho {

    /* renamed from: a */
    public static final /* synthetic */ int f28048a = 0;

    public aafy(aago aago) {
    }

    /* renamed from: a */
    public static String m21188a() {
        String format = String.format(" (%s INTEGER PRIMARY KEY AUTOINCREMENT, ", "_id");
        String format2 = String.format("%s BLOB, ", "pb");
        String format3 = String.format("%s INTEGER, ", "timestamp");
        String format4 = String.format("%s INTEGER)", "operation_status");
        int length = String.valueOf(format).length();
        int length2 = String.valueOf(format2).length();
        StringBuilder sb = new StringBuilder(length + 27 + length2 + String.valueOf(format3).length() + String.valueOf(format4).length());
        sb.append("CREATE TABLE ad_attestation");
        sb.append(format);
        sb.append(format2);
        sb.append(format3);
        sb.append(format4);
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0091 A[Catch:{ all -> 0x008e }] */
    /* renamed from: a */
    public final synchronized aail mo16839a(Long l) {
        aail aail;
        Cursor cursor = null;
        aail = null;
        aail = null;
        try {
            Cursor query = aago.m21235b().query("ad_attestation", new String[]{"_id", "pb", "timestamp", "operation_status"}, String.format("%s>=\"%d\" and %s=\"%d\" ORDER BY %s DESC LIMIT 1", "timestamp", l, "operation_status", 1, "timestamp"), null, null, null, null);
            try {
                if (query.getCount() > 0) {
                    query.moveToFirst();
                    aail = (aail) bxvk.m124016a(aail.f28193f, query.getBlob(1), bxus.m123744c());
                    if (query != null) {
                        query.close();
                    }
                } else if (query != null) {
                    query.close();
                }
            } catch (bxwf e) {
                new Object[1][0] = e.toString();
                throw new aagp(String.format("Failed to get app info pb, error: %s", e.toString()));
            } catch (Throwable th) {
                cursor = query;
                th = th;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            if (cursor != null) {
            }
            throw th;
        }
        return aail;
    }

    /* renamed from: a */
    public final synchronized void mo16840a(aail aail) {
        Long l;
        Integer num;
        ContentValues contentValues = new ContentValues();
        contentValues.put("pb", aail.mo73642k());
        int i = 1;
        if ((aail.f28195a & 1) != 0) {
            l = Long.valueOf(aail.f28196b);
        } else {
            l = null;
        }
        contentValues.put("timestamp", l);
        if ((aail.f28195a & 2) != 0) {
            int a = aais.m21316a(aail.f28197c);
            if (a != 0) {
                i = a;
            }
            num = Integer.valueOf(i - 1);
        } else {
            num = null;
        }
        contentValues.put("operation_status", num);
        if (aago.m21236c().insert("ad_attestation", null, contentValues) <= 0) {
            throw new aagp("Failed to add ad attestation to sql table.");
        }
    }
}
