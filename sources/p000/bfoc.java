package p000;

import android.content.Context;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.List;

/* renamed from: bfoc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfoc {

    /* renamed from: b */
    private static bfoc f114541b;

    /* renamed from: a */
    private final bfoe f114542a;

    private bfoc(bfoe bfoe) {
        this.f114542a = bfoe;
    }

    /* renamed from: a */
    public static synchronized bfoc m97397a(Context context) {
        bfoc bfoc;
        synchronized (bfoc.class) {
            if (f114541b == null) {
                SecureRandom secureRandom = new SecureRandom();
                bfob a = bfob.m97393a(context, secureRandom);
                long a2 = spn.m35843a(context);
                if (a2 != 0) {
                    f114541b = new bfoc(new bfoe(a, new bfod(secureRandom, Long.toString(a2))));
                } else {
                    throw new bfof();
                }
            }
            bfoc = f114541b;
        }
        return bfoc;
    }

    /* renamed from: c */
    public static final synchronized void m97400c(Context context) {
        synchronized (bfoc.class) {
            File a = m97399a(context, "EARStorage");
            if (a.exists()) {
                if (!a.delete()) {
                    throw new bfof();
                }
            }
            File a2 = m97399a(context, "EARStorage.tmp");
            if (a2.exists()) {
                if (!a2.delete()) {
                    throw new bfof();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r0 = r2.f114545a.mo62028b(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0038, code lost:
        r5 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0039, code lost:
        r2 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003d, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0038 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:8:0x0013] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x003d A[ExcHandler: IOException (e java.io.IOException), Splitter:B:8:0x0013] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0054 A[SYNTHETIC, Splitter:B:36:0x0054] */
    /* renamed from: b */
    public final synchronized buil mo62030b(Context context) {
        buil buil;
        File a = m97399a(context, "EARStorage");
        FileInputStream fileInputStream = null;
        if (!a.exists()) {
            return null;
        }
        try {
            FileInputStream fileInputStream2 = new FileInputStream(a);
            try {
                byte[] a2 = boav.m111020a(fileInputStream2);
                bfoe bfoe = this.f114542a;
                byte[] bArr = bfoe.f114546b.mo62032b(a2);
                buil = (buil) bxvk.m124014a(buil.f153949d, bArr);
                try {
                    fileInputStream2.close();
                } catch (IOException e) {
                }
            } catch (IOException e2) {
            } catch (bfof e3) {
                e = e3;
                fileInputStream = fileInputStream2;
                try {
                    m97400c(context);
                } catch (Exception e4) {
                }
                try {
                    throw new bfof(e);
                } catch (Throwable th) {
                    th = th;
                    if (fileInputStream != null) {
                    }
                    throw th;
                }
            } catch (Throwable th2) {
            }
        } catch (bfof | IOException e5) {
            e = e5;
            m97400c(context);
            throw new bfof(e);
        } catch (Throwable th3) {
            th = th3;
            if (fileInputStream != null) {
            }
            throw th;
        }
        return buil;
    }

    /* renamed from: a */
    public static bfoc m97398a(Context context, boolean z) {
        bfoc a = m97397a(context);
        a.f114542a.f114547c = z;
        return a;
    }

    /* renamed from: a */
    private static File m97399a(Context context, String str) {
        File filesDir = context.getFilesDir();
        if (filesDir != null) {
            return new File(filesDir, str);
        }
        throw new bfof();
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x0091 A[SYNTHETIC, Splitter:B:40:0x0091] */
    /* renamed from: a */
    public final synchronized void mo62029a(Context context, List list) {
        byte[] bArr;
        bxvd da = buil.f153949d.mo74144da();
        long currentTimeMillis = System.currentTimeMillis();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        buil buil = (buil) da.f164949b;
        buil.f153951a |= 1;
        buil.f153952b = currentTimeMillis;
        if (!buil.f153953c.mo73666a()) {
            buil.f153953c = bxvk.m124021a(buil.f153953c);
        }
        bxsy.m123078a(list, buil.f153953c);
        bfoe bfoe = this.f114542a;
        byte[] k = ((buil) da.mo74062i()).mo73642k();
        if (!bfoe.f114547c) {
            bArr = bfoe.f114545a.mo62027a(k);
        } else {
            bArr = bfoe.f114546b.mo62031a(k);
        }
        FileOutputStream fileOutputStream = null;
        try {
            File a = m97399a(context, "EARStorage");
            File a2 = m97399a(context, "EARStorage.tmp");
            FileOutputStream fileOutputStream2 = new FileOutputStream(a2);
            try {
                fileOutputStream2.write(bArr);
                if (a2.renameTo(a)) {
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e) {
                        return;
                    }
                } else {
                    throw new IOException("rename");
                }
            } catch (IOException e2) {
                e = e2;
                fileOutputStream = fileOutputStream2;
                try {
                    throw new bfof(e);
                } catch (Throwable th) {
                    th = th;
                    if (fileOutputStream != null) {
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = fileOutputStream2;
                if (fileOutputStream != null) {
                }
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
            throw new bfof(e);
        } catch (Throwable th3) {
            th = th3;
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e4) {
                }
            }
            throw th;
        }
        return;
    }
}
