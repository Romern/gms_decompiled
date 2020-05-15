package p000;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteException;
import java.io.File;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: aqey */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aqey {

    /* renamed from: a */
    private static final Set f85926a = new HashSet(Arrays.asList("/dev", "/proc", "/sys", "/system"));

    /* renamed from: b */
    private List f85927b;

    /* renamed from: c */
    private ArrayDeque f85928c;

    /* renamed from: d */
    private final aqff f85929d;

    /* renamed from: e */
    private final long f85930e;

    /* renamed from: f */
    private final aqfu f85931f;

    /* renamed from: g */
    private final aqfv f85932g;

    public aqey(Context context, aqff aqff, long j, aqfv aqfv) {
        this.f85929d = aqff;
        this.f85930e = j;
        this.f85931f = new aqfu(context);
        this.f85932g = aqfv;
    }

    /* renamed from: a */
    private final void m71463a(File file) {
        try {
            if (!this.f85929d.mo47817b(file) && !f85926a.contains(file.getAbsolutePath())) {
                if (file.isFile()) {
                    aqff aqff = this.f85929d;
                    aqfd a = aqff.mo47815a(file);
                    if ((aqff.f85945a & a.f85942c) != 0 && a.f85941b == 0) {
                        byte[] a2 = aqfy.m71560a(file);
                        aqex aqex = new aqex();
                        aqex.f85917a = file.getAbsolutePath();
                        aqex.f85919c = true;
                        aqex.f85923g = a2;
                        aqex.f85920d = true;
                        aqex.f85918b = this.f85930e;
                        try {
                            aqex.f85925i = this.f85929d.mo47815a(file);
                        } catch (aqfe e) {
                        }
                        this.f85927b.add(aqex);
                        aqfu aqfu = this.f85931f;
                        if (aqex.f85917a != null) {
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("full_path", aqex.f85917a);
                            byte[] bArr = aqex.f85923g;
                            if (bArr != null) {
                                contentValues.put("sha256_digest", bArr);
                            }
                            contentValues.put("is_setuid_root", Integer.valueOf(aqex.f85920d ? 1 : 0));
                            contentValues.put("time_ms", Long.valueOf(aqex.f85918b));
                            contentValues.put("is_symlink", Integer.valueOf(aqex.f85921e ? 1 : 0));
                            String str = aqex.f85922f;
                            if (str != null) {
                                contentValues.put("symlink_target", str);
                            }
                            aqfd aqfd = aqex.f85925i;
                            if (aqfd != null) {
                                contentValues.put("file_permissions", Integer.valueOf(aqfd.f85942c));
                                contentValues.put("file_owner", Integer.valueOf(aqex.f85925i.f85941b));
                                contentValues.put("file_group", Integer.valueOf(aqex.f85925i.f85940a));
                                String str2 = aqex.f85925i.f85944e;
                                if (str2 != null) {
                                    contentValues.put("se_linux_security_context", str2);
                                }
                            }
                            aqfu.f86005a.replace("files_info", null, contentValues);
                            return;
                        }
                        return;
                    }
                }
                if (file.isDirectory()) {
                    this.f85928c.push(file);
                }
            }
        } catch (aqfe e2) {
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0128  */
    /* renamed from: a */
    public final List mo47804a() {
        aqfv aqfv;
        Exception exc;
        List d;
        if (!this.f85929d.f85946b) {
            return null;
        }
        this.f85927b = new ArrayList();
        this.f85928c = new ArrayDeque();
        File[] listRoots = File.listRoots();
        try {
            this.f85931f.mo47837a();
            SQLiteDatabase sQLiteDatabase = this.f85931f.f86005a;
            if (sQLiteDatabase != null) {
                sQLiteDatabase.beginTransaction();
            }
            m71463a(listRoots[0]);
            while (!this.f85928c.isEmpty()) {
                File[] listFiles = ((File) this.f85928c.pop()).listFiles();
                if (listFiles != null) {
                    for (File file : listFiles) {
                        m71463a(file);
                    }
                }
            }
            SQLiteDatabase sQLiteDatabase2 = this.f85931f.f86005a;
            if (sQLiteDatabase2 != null) {
                sQLiteDatabase2.setTransactionSuccessful();
            }
            try {
                this.f85931f.mo47839c();
            } catch (SQLiteException e) {
                aqfv = this.f85932g;
                String simpleName = aqey.class.getSimpleName();
                String sQLiteException = e.toString();
                StringBuilder sb = new StringBuilder(String.valueOf(simpleName).length() + 1 + String.valueOf(sQLiteException).length());
                sb.append(simpleName);
                sb.append("\n");
                sb.append(sQLiteException);
                exc = new Exception(sb.toString());
            }
        } catch (SQLiteDatabaseCorruptException e2) {
            aqfv aqfv2 = this.f85932g;
            String simpleName2 = aqey.class.getSimpleName();
            String sQLiteDatabaseCorruptException = e2.toString();
            StringBuilder sb2 = new StringBuilder(String.valueOf(simpleName2).length() + 1 + String.valueOf(sQLiteDatabaseCorruptException).length());
            sb2.append(simpleName2);
            sb2.append("\n");
            sb2.append(sQLiteDatabaseCorruptException);
            aqfv2.mo47846a((Throwable) new Exception(sb2.toString()));
            this.f85931f.mo47841e();
            try {
                this.f85931f.mo47839c();
            } catch (SQLiteException e3) {
                aqfv = this.f85932g;
                String simpleName3 = aqey.class.getSimpleName();
                String sQLiteException2 = e3.toString();
                StringBuilder sb3 = new StringBuilder(String.valueOf(simpleName3).length() + 1 + String.valueOf(sQLiteException2).length());
                sb3.append(simpleName3);
                sb3.append("\n");
                sb3.append(sQLiteException2);
                exc = new Exception(sb3.toString());
            }
        } catch (Throwable th) {
            try {
                this.f85931f.mo47839c();
            } catch (SQLiteException e4) {
                aqfv aqfv3 = this.f85932g;
                String simpleName4 = aqey.class.getSimpleName();
                String sQLiteException3 = e4.toString();
                StringBuilder sb4 = new StringBuilder(String.valueOf(simpleName4).length() + 1 + String.valueOf(sQLiteException3).length());
                sb4.append(simpleName4);
                sb4.append("\n");
                sb4.append(sQLiteException3);
                aqfv3.mo47846a((Throwable) new Exception(sb4.toString()));
            }
            this.f85931f.mo47838b();
            throw th;
        }
        this.f85931f.mo47838b();
        d = this.f85931f.mo47840d();
        if (d != null) {
            this.f85927b.addAll(d);
        }
        return this.f85927b;
        aqfv.mo47846a((Throwable) exc);
        this.f85931f.mo47838b();
        d = this.f85931f.mo47840d();
        if (d != null) {
        }
        return this.f85927b;
    }
}
