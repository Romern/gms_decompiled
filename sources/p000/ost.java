package p000;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.carsetup.CarInfoInternal;
import com.google.android.gms.carsetup.CarSetupServiceImpl;

/* renamed from: ost */
final /* synthetic */ class ost implements Runnable {

    /* renamed from: a */
    private final osu f38363a;

    /* renamed from: b */
    private final pbp f38364b;

    /* renamed from: c */
    private final boolean f38365c;

    public ost(osu osu, pbp pbp, boolean z) {
        this.f38363a = osu;
        this.f38364b = pbp;
        this.f38365c = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0072, code lost:
        if (r5 != null) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0075, code lost:
        if (r5 != null) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008d, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008f, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0090, code lost:
        r21 = ":com.google.android.gms@201515033@20.15.15 (120300-306758586)";
        r1 = "a";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00aa, code lost:
        r16.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b6, code lost:
        r16.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x008d A[ExcHandler: all (th java.lang.Throwable), Splitter:B:1:0x001a] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b6  */
    public final void run() {
        String str;
        String str2;
        osu osu = this.f38363a;
        pbp pbp = this.f38364b;
        boolean z = this.f38365c;
        CarSetupServiceImpl carSetupServiceImpl = osu.f38366a;
        bnsn bnsn = CarSetupServiceImpl.f29560a;
        CarInfoInternal carInfoInternal = carSetupServiceImpl.f29595l;
        Cursor cursor = null;
        try {
            SQLiteDatabase writableDatabase = pbp.getWritableDatabase();
            str = ":com.google.android.gms@201515033@20.15.15 (120300-306758586)";
            str2 = "a";
            Cursor query = writableDatabase.query("allowedcars", new String[]{"bluetoothConnectionAllowed"}, "id = ?", new String[]{Long.toString(carInfoInternal.f29542d)}, null, null, null);
            try {
                if (query.moveToFirst()) {
                    if (query.getInt(query.getColumnIndex("bluetoothConnectionAllowed")) != z) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("bluetoothConnectionAllowed", Integer.valueOf(z ? 1 : 0));
                        writableDatabase.update("allowedcars", contentValues, "id = ?", new String[]{Long.toString(carInfoInternal.f29542d)});
                    }
                    query.close();
                    carInfoInternal.f29541c = z;
                } else if (query != null) {
                    query.close();
                }
            } catch (SQLiteException e) {
                e = e;
                cursor = query;
                try {
                    bnsi b = pbp.f38794a.mo68387b();
                    b.mo68437a(e);
                    b.mo68432a("pbp", str2, 870, str);
                    b.mo68405a("Exception while updating database");
                    if (cursor != null) {
                    }
                    osu.f38366a.mo17421e();
                } catch (Throwable th) {
                    th = th;
                    if (cursor != null) {
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cursor = query;
                if (cursor != null) {
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            bnsi b2 = pbp.f38794a.mo68387b();
            b2.mo68437a(e);
            b2.mo68432a("pbp", str2, 870, str);
            b2.mo68405a("Exception while updating database");
            if (cursor != null) {
            }
            osu.f38366a.mo17421e();
        } catch (Throwable th3) {
        }
        osu.f38366a.mo17421e();
    }
}
