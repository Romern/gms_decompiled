package p000;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Build;
import android.os.StatFs;
import android.system.ErrnoException;
import com.google.android.gms.fonts.FontMatchSpec;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: zxv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zxv {

    /* renamed from: a */
    public final File f56133a;

    /* renamed from: b */
    public final File f56134b;

    /* renamed from: c */
    public final Object f56135c;

    /* renamed from: d */
    public final zxq f56136d;

    /* renamed from: e */
    public final ExecutorService f56137e;

    /* renamed from: f */
    protected final long f56138f;

    /* renamed from: g */
    protected final long f56139g;

    /* renamed from: h */
    final boolean f56140h;

    /* renamed from: i */
    long f56141i = 0;

    /* renamed from: j */
    private final Object f56142j = new Object();

    /* renamed from: k */
    private final File f56143k;

    /* renamed from: l */
    private final Object f56144l;

    /* renamed from: m */
    private final zyg f56145m;

    static {
        TimeUnit.MINUTES.toMillis(1);
    }

    public zxv(Context context, zxq zxq, ExecutorService executorService, zyg zyg, long j, long j2, boolean z) {
        sdo.checkIfNull(context, "context");
        sdo.checkIfNull(zxq, "databaseHelper");
        this.f56136d = zxq;
        int i = Build.VERSION.SDK_INT;
        this.f56143k = new File(context.getFilesDir(), "fonts");
        this.f56133a = new File(this.f56143k, "opentype");
        this.f56134b = new File(this.f56143k, "directory");
        if (this.f56133a.isDirectory() || this.f56133a.mkdirs()) {
            if (!this.f56134b.isDirectory() && !this.f56134b.mkdirs()) {
                zyh.m46680a("FontDisk", "can't create directory for directory.pb: %s", this.f56134b);
            }
            this.f56135c = new Object();
            this.f56144l = new Object();
            this.f56137e = executorService;
            this.f56145m = zyg;
            this.f56138f = j;
            this.f56139g = j2;
            this.f56140h = z;
        }
        zyh.m46680a("FontDisk", "can't create directory %s", this.f56133a);
        zyg.mo31587a(1, 23506, "com.google.android.gms.fonts.disk");
        this.f56135c = new Object();
        this.f56144l = new Object();
        this.f56137e = executorService;
        this.f56145m = zyg;
        this.f56138f = j;
        this.f56139g = j2;
        this.f56140h = z;
    }

    /* renamed from: a */
    private static String m46647a(float f) {
        return String.format(Locale.ENGLISH, "%d_%d", Integer.valueOf((int) Math.floor((double) f)), Integer.valueOf((int) Math.floor((double) ((f * 10.0f) % 10.0f))));
    }

    /* renamed from: b */
    public final boolean mo31574b(long j) {
        boolean z = true;
        try {
            StatFs statFs = new StatFs(this.f56143k.getPath());
            synchronized (this.f56144l) {
                int i = Build.VERSION.SDK_INT;
                if (statFs.getAvailableBytes() <= this.f56138f + j) {
                    z = false;
                }
            }
            return z;
        } catch (IllegalArgumentException e) {
            int i2 = Build.VERSION.SDK_INT;
            String str = "com.google.android.gms.fonts.disk.statfs";
            if (e.getCause() instanceof ErrnoException) {
                str = String.format(Locale.ENGLISH, "%s.errno.%d", str, Integer.valueOf(((ErrnoException) e.getCause()).errno));
            }
            this.f56145m.mo31587a(1, 23517, str);
            return false;
        }
    }

    /* renamed from: c */
    public final boolean mo31575c(long j) {
        SQLiteDatabase sQLiteDatabase;
        synchronized (this.f56144l) {
            if (!this.f56140h) {
                return false;
            }
            if (System.currentTimeMillis() - this.f56141i < this.f56139g) {
                return false;
            }
            this.f56141i = System.currentTimeMillis();
            zxq zxq = this.f56136d;
            SQLiteDatabase readableDatabase = zxq.getReadableDatabase();
            SQLiteDatabase sQLiteDatabase2 = null;
            Cursor rawQuery = readableDatabase.rawQuery("SELECT family, width, weight, italic FROM metadata WHERE NOT EXISTS (SELECT * FROM manifest_deps WHERE metadata.id = manifest_deps.font_id) AND NOT EXISTS (SELECT * FROM pinned_deps WHERE metadata.id = pinned_deps.font_id) AND DATETIME('now','-5 MINUTES') > last_accessed ORDER BY last_accessed", null);
            ArrayList arrayList = new ArrayList();
            if (rawQuery.moveToFirst()) {
                while (!rawQuery.isAfterLast()) {
                    arrayList.add(new FontMatchSpec(rawQuery.getString(0), rawQuery.getFloat(1), rawQuery.getInt(2), rawQuery.getFloat(3), false));
                    rawQuery.moveToNext();
                }
            }
            if (rawQuery != null) {
                try {
                    rawQuery.close();
                } catch (Exception e) {
                    zyh.m46680a("FontsDBHelper", "Error closing Cursor ", e);
                }
            }
            zxq.mo31562c(readableDatabase);
            long j2 = 0;
            while (!arrayList.isEmpty() && !mo31574b(j)) {
                FontMatchSpec fontMatchSpec = (FontMatchSpec) arrayList.get(0);
                zyh.m46683c("FontDisk", "Evicting %s", fontMatchSpec);
                sdo.checkIfNull(fontMatchSpec, "fontMatchSpec");
                File file = new File(this.f56133a, m46648a(fontMatchSpec));
                if (file.exists() && !file.isDirectory()) {
                    j2 += file.length();
                    file.delete();
                }
                zxq zxq2 = this.f56136d;
                try {
                    sQLiteDatabase = zxq2.getWritableDatabase();
                    try {
                        sQLiteDatabase.delete("metadata", "family = ? AND width = ? AND weight = ? AND italic = ?", new String[]{fontMatchSpec.f32464b, String.valueOf(fontMatchSpec.f32465c), String.valueOf(fontMatchSpec.f32466d), String.valueOf(fontMatchSpec.f32467e)});
                    } catch (SQLiteException e2) {
                    } catch (Throwable th) {
                        th = th;
                        sQLiteDatabase2 = sQLiteDatabase;
                        zxq2.mo31562c(sQLiteDatabase2);
                        throw th;
                    }
                } catch (SQLiteException e3) {
                    sQLiteDatabase = null;
                } catch (Throwable th2) {
                    th = th2;
                    zxq2.mo31562c(sQLiteDatabase2);
                    throw th;
                }
                zxq2.mo31562c(sQLiteDatabase);
                arrayList.remove(0);
            }
            boolean b = mo31574b(j);
            zyh.m46683c("FontDisk", "Evicting fonts took %d ms, reclaimed %d bytes, and returns %b", Long.valueOf(System.currentTimeMillis() - this.f56141i), Long.valueOf(j2), Boolean.valueOf(b));
            return b;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.String.replace(char, char):java.lang.String}
     arg types: [int, int]
     candidates:
      ClspMth{java.lang.String.replace(java.lang.CharSequence, java.lang.CharSequence):java.lang.String}
      ClspMth{java.lang.String.replace(char, char):java.lang.String} */
    /* renamed from: a */
    public static String m46648a(FontMatchSpec fontMatchSpec) {
        return String.format(Locale.ENGLISH, "%s-%d-%s-%s.ttf", fontMatchSpec.f32464b.replace(' ', '_'), Integer.valueOf(fontMatchSpec.f32466d), m46647a(fontMatchSpec.f32465c), m46647a(fontMatchSpec.f32467e));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.String.replace(char, char):java.lang.String}
     arg types: [int, int]
     candidates:
      ClspMth{java.lang.String.replace(java.lang.CharSequence, java.lang.CharSequence):java.lang.String}
      ClspMth{java.lang.String.replace(char, char):java.lang.String} */
    /* renamed from: a */
    public static String m46649a(String str, zxh zxh) {
        Locale locale = Locale.ENGLISH;
        Object[] objArr = new Object[4];
        objArr[0] = str.replace(' ', '_');
        zxj zxj = zxh.f56098b;
        if (zxj == null) {
            zxj = zxj.f56108c;
        }
        objArr[1] = Integer.valueOf(zxj.f56110a);
        zxg zxg = zxh.f56099c;
        if (zxg == null) {
            zxg = zxg.f56090c;
        }
        objArr[2] = m46647a(zxg.f56092a);
        zxg zxg2 = zxh.f56100d;
        if (zxg2 == null) {
            zxg2 = zxg.f56090c;
        }
        objArr[3] = m46647a(zxg2.f56092a);
        return String.format(locale, "%s-%d-%s-%s.ttf", objArr);
    }

    /* renamed from: a */
    public final File mo31568a(File file, zxi zxi, zxh zxh) {
        long j;
        String str;
        sdo.checkIfNull(zxi, "family");
        sdo.checkIfNull(zxh, "font");
        File a = mo31569a(zxi, zxh);
        zyh.m46683c("FontDisk", "takeFont(%s); may put in %s", file, a);
        synchronized (this.f56135c) {
            zxf zxf = zxh.f56097a;
            if (zxf == null) {
                zxf = zxf.f56084e;
            }
            if (!mo31573a(zxf.f56088c, file, a)) {
                boolean exists = a.exists();
                if (exists) {
                    j = a.length();
                } else {
                    j = -1;
                }
                String str2 = zxi.f56105b;
                zxj zxj = zxh.f56098b;
                if (zxj == null) {
                    zxj = zxj.f56108c;
                }
                int i = zxj.f56110a;
                zxg zxg = zxh.f56099c;
                if (zxg == null) {
                    zxg = zxg.f56090c;
                }
                float f = zxg.f56092a;
                zxg zxg2 = zxh.f56100d;
                if (zxg2 == null) {
                    zxg2 = zxg.f56090c;
                }
                float f2 = zxg2.f56092a;
                if (exists) {
                    zxf zxf2 = zxh.f56097a;
                    if (zxf2 == null) {
                        zxf2 = zxf.f56084e;
                    }
                    long j2 = zxf2.f56088c;
                    StringBuilder sb = new StringBuilder(72);
                    sb.append("wrong size, actual ");
                    sb.append(j);
                    sb.append(" != expected ");
                    sb.append(j2);
                    str = sb.toString();
                } else {
                    str = "missing";
                }
                String valueOf = String.valueOf(a);
                int length = String.valueOf(str2).length();
                StringBuilder sb2 = new StringBuilder(length + 75 + String.valueOf(str).length() + String.valueOf(valueOf).length());
                sb2.append("FontDisk - ");
                sb2.append(str2);
                sb2.append(":wght");
                sb2.append(i);
                sb2.append(":wdth");
                sb2.append(f);
                sb2.append(":ital");
                sb2.append(f2);
                sb2.append(" is ");
                sb2.append(str);
                sb2.append(" at ");
                sb2.append(valueOf);
                throw new IllegalStateException(sb2.toString());
            }
        }
        this.f56137e.execute(new zxs(this, zxi, zxh));
        return a;
    }

    /* renamed from: a */
    public final File mo31569a(zxi zxi, zxh zxh) {
        sdo.checkIfNull(zxi, "family");
        sdo.checkIfNull(zxh, "font");
        zxf zxf = zxh.f56097a;
        if (zxf == null) {
            zxf = zxf.f56084e;
        }
        if (zxf.f56087b.isEmpty()) {
            return new File(this.f56133a, m46649a(zxi.f56105b, zxh));
        }
        zxf zxf2 = zxh.f56097a;
        if (zxf2 == null) {
            zxf2 = zxf.f56084e;
        }
        return new File(zxf2.f56087b);
    }

    /* renamed from: a */
    public final File mo31570a(zxi zxi, zxh zxh, boolean z) {
        File a = mo31569a(zxi, zxh);
        if (!a.exists()) {
            return null;
        }
        if (!a.isDirectory()) {
            if (z) {
                long length = a.length();
                zxf zxf = zxh.f56097a;
                if (zxf == null) {
                    zxf = zxf.f56084e;
                }
                if (length != zxf.f56088c) {
                    zyh.m46683c("FontDisk", "Not accepting existing file %s; wrong size", a);
                    return null;
                }
            }
            return a;
        } else if (ceao.f182169a.mo6606a().mo78691e()) {
            srj.m36120a(a);
            return null;
        } else {
            String valueOf = String.valueOf(a.getPath());
            throw new IllegalStateException(valueOf.length() == 0 ? new String("Not a file but directory:") : "Not a file but directory:".concat(valueOf));
        }
    }

    /* renamed from: a */
    public final void mo31571a(long j) {
        if (!mo31574b(j) && !mo31575c(j)) {
            throw new IllegalStateException("FontDisk - insufficient space on disk for font.");
        }
    }

    /* renamed from: a */
    public final void mo31572a(zxe zxe) {
        sdo.checkIfNull(zxe, "directory");
        File file = new File(this.f56134b, String.valueOf(zxe.f56082b));
        int i = zxe.f56082b;
        StringBuilder sb = new StringBuilder(68);
        sb.append("New directory for directory.pb files created for version ");
        sb.append(i);
        String sb2 = sb.toString();
        zyh.m46683c("FontDisk", sb2, new Object[0]);
        File file2 = new File(file, "directory.pb");
        if (file2.exists()) {
            file2.delete();
        }
        file.mkdir();
        try {
            synchronized (this.f56142j) {
                bobi.m111040a(zxe.serializeToBytes(), file2);
            }
        } catch (IOException e) {
            if (file.exists()) {
                for (File file3 : file.listFiles()) {
                    file3.delete();
                }
                file.delete();
            }
            String valueOf = String.valueOf(file2);
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 16);
            sb3.append("Unable to write ");
            sb3.append(valueOf);
            throw new IOException(sb3.toString(), e);
        }
    }

    /* renamed from: a */
    public final boolean mo31573a(long j, File file, File file2) {
        long j2;
        if (!file.exists()) {
            zyh.m46680a("FontDisk", "takeFontInternal temp file does not exist: %s", file);
            return false;
        }
        long length = file.length();
        if (length != j) {
            zyh.m46680a("FontDisk", "takeFontInternal %s wrong temp length, expected %d got %d", file2, Long.valueOf(j), Long.valueOf(length));
            return false;
        }
        mo31571a(j);
        if (!file.renameTo(file2)) {
            zyh.m46680a("FontDisk", "takeFontInternal(%s) failed to renameTo %s", file, file2);
            return false;
        }
        if (file2.exists()) {
            j2 = file2.length();
        } else {
            j2 = -1;
        }
        if (j2 != j) {
            zyh.m46680a("FontDisk", "takeFontInternal %s wrong dest length, expected %d got %d", Long.valueOf(j), Long.valueOf(j2));
            return false;
        }
        zyh.m46683c("FontDisk", "takeFontInternal(%s); successfully put in %s", file, file2);
        return true;
    }
}
