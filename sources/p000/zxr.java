package p000;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.fonts.FontMatchSpec;

/* renamed from: zxr */
public final /* synthetic */ class zxr implements Runnable {

    /* renamed from: a */
    private final zxv f56127a;

    /* renamed from: b */
    private final FontMatchSpec f56128b;

    public zxr(zxv zxv, FontMatchSpec fontMatchSpec) {
        this.f56127a = zxv;
        this.f56128b = fontMatchSpec;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0055, code lost:
        if (r7 != null) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0057, code lost:
        r1.mo31562c(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005a, code lost:
        r5.mo66931e();
        p000.zyh.m46683c("FontDisk", "Updating last accessed time for %s took %d ms", r2, java.lang.Long.valueOf(r5.mo66928a(java.util.concurrent.TimeUnit.MILLISECONDS)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0072, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0046, code lost:
        if (r7 == null) goto L_0x005a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0050 A[SYNTHETIC, Splitter:B:13:0x0050] */
    public final void run() {
        zxv zxv = this.f56127a;
        FontMatchSpec fontMatchSpec = this.f56128b;
        try {
            bmza b = bmza.m108659b(bmvy.f131119a);
            zxq zxq = zxv.f56136d;
            SQLiteDatabase sQLiteDatabase = null;
            try {
                sQLiteDatabase = zxq.getWritableDatabase();
                try {
                    zyh.m46683c("FontsDBHelper", "Updating last accessed time for %s", fontMatchSpec);
                    sQLiteDatabase.execSQL("UPDATE metadata SET last_accessed = CURRENT_TIMESTAMP WHERE family = ? AND width = ? AND weight = ? AND italic = ?", new String[]{fontMatchSpec.f32464b, String.valueOf(fontMatchSpec.f32465c), String.valueOf(fontMatchSpec.f32466d), String.valueOf(fontMatchSpec.f32467e)});
                } catch (SQLiteException e) {
                } catch (Throwable th) {
                    th = th;
                    if (sQLiteDatabase != null) {
                        zxq.mo31562c(sQLiteDatabase);
                    }
                    throw th;
                }
            } catch (SQLiteException e2) {
            } catch (Throwable th2) {
                th = th2;
                if (sQLiteDatabase != null) {
                }
                throw th;
            }
        } catch (Exception e3) {
            zyh.m46681a("FontDisk", e3, "Error updating last accessed time for %s.", fontMatchSpec);
        }
    }
}
