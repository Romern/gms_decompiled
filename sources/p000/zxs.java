package p000;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import java.util.concurrent.TimeUnit;

/* renamed from: zxs */
final /* synthetic */ class zxs implements Runnable {

    /* renamed from: a */
    private final zxv f56129a;

    /* renamed from: b */
    private final zxi f56130b;

    /* renamed from: c */
    private final zxh f56131c;

    public zxs(zxv zxv, zxi zxi, zxh zxh) {
        this.f56129a = zxv;
        this.f56130b = zxi;
        this.f56131c = zxh;
    }

    public final void run() {
        zxv zxv = this.f56129a;
        zxi zxi = this.f56130b;
        zxh zxh = this.f56131c;
        try {
            bmza b = bmza.m108659b(bmvy.f131119a);
            zxq zxq = zxv.f56136d;
            Object[] objArr = new Object[5];
            objArr[0] = zxi.f56105b;
            zxj zxj = zxh.f56098b;
            if (zxj == null) {
                zxj = zxj.f56108c;
            }
            objArr[1] = Integer.valueOf(zxj.f56110a);
            zxg zxg = zxh.f56099c;
            if (zxg == null) {
                zxg = zxg.f56090c;
            }
            objArr[2] = Float.valueOf(zxg.f56092a);
            zxg zxg2 = zxh.f56100d;
            if (zxg2 == null) {
                zxg2 = zxg.f56090c;
            }
            objArr[3] = Float.valueOf(zxg2.f56092a);
            objArr[4] = Integer.valueOf(zxi.f56106c);
            zyh.m46683c("FontsDBHelper", "Inserting font metadata into database (%s,%d,%.01f,%.01f,%d)", objArr);
            ContentValues contentValues = new ContentValues();
            contentValues.put("family", zxi.f56105b);
            zxj zxj2 = zxh.f56098b;
            if (zxj2 == null) {
                zxj2 = zxj.f56108c;
            }
            contentValues.put("weight", Integer.valueOf(zxj2.f56110a));
            zxg zxg3 = zxh.f56099c;
            if (zxg3 == null) {
                zxg3 = zxg.f56090c;
            }
            contentValues.put("width", Float.valueOf(zxg3.f56092a));
            zxg zxg4 = zxh.f56100d;
            if (zxg4 == null) {
                zxg4 = zxg.f56090c;
            }
            contentValues.put("italic", Float.valueOf(zxg4.f56092a));
            contentValues.put("version", Integer.valueOf(zxi.f56106c));
            SQLiteDatabase sQLiteDatabase = null;
            try {
                SQLiteDatabase writableDatabase = zxq.getWritableDatabase();
                try {
                    if (writableDatabase.insertWithOnConflict("metadata", null, contentValues, 5) == -1) {
                        String str = zxi.f56105b;
                        zxj zxj3 = zxh.f56098b;
                        if (zxj3 == null) {
                            zxj3 = zxj.f56108c;
                        }
                        int i = zxj3.f56110a;
                        zxg zxg5 = zxh.f56099c;
                        if (zxg5 == null) {
                            zxg5 = zxg.f56090c;
                        }
                        float f = zxg5.f56092a;
                        zxg zxg6 = zxh.f56100d;
                        if (zxg6 == null) {
                            zxg6 = zxg.f56090c;
                        }
                        float f2 = zxg6.f56092a;
                        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 84);
                        sb.append(str);
                        sb.append(":wght");
                        sb.append(i);
                        sb.append(":wdth");
                        sb.append(f);
                        sb.append(":ital");
                        sb.append(f2);
                        sb.append(" could not be written to DB!");
                        throw new IllegalStateException(sb.toString());
                    }
                    zxq.mo31562c(writableDatabase);
                    b.mo66931e();
                    zyh.m46683c("FontDisk", "Inserting metadata for %s took %d ms", zxi.f56105b, Long.valueOf(b.mo66928a(TimeUnit.MILLISECONDS)));
                } catch (SQLiteException e) {
                    sQLiteDatabase = writableDatabase;
                    zxq.mo31562c(sQLiteDatabase);
                    b.mo66931e();
                    zyh.m46683c("FontDisk", "Inserting metadata for %s took %d ms", zxi.f56105b, Long.valueOf(b.mo66928a(TimeUnit.MILLISECONDS)));
                } catch (Throwable th) {
                    th = th;
                    sQLiteDatabase = writableDatabase;
                    zxq.mo31562c(sQLiteDatabase);
                    throw th;
                }
            } catch (SQLiteException e2) {
                zxq.mo31562c(sQLiteDatabase);
                b.mo66931e();
                zyh.m46683c("FontDisk", "Inserting metadata for %s took %d ms", zxi.f56105b, Long.valueOf(b.mo66928a(TimeUnit.MILLISECONDS)));
            } catch (Throwable th2) {
                th = th2;
                zxq.mo31562c(sQLiteDatabase);
                throw th;
            }
        } catch (Exception e3) {
            zyh.m46681a("FontDisk", e3, "Error inserting metadata for %s", zxi.f56105b);
        }
    }
}
