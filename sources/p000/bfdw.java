package p000;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

/* renamed from: bfdw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfdw implements bffq {

    /* renamed from: o */
    private static final Set f113522o;

    /* renamed from: a */
    public final Context f113523a;

    /* renamed from: b */
    public final String f113524b;

    /* renamed from: c */
    public final String f113525c;

    /* renamed from: d */
    public final boolean f113526d;

    /* renamed from: e */
    public final Handler f113527e;

    /* renamed from: f */
    public final bfec f113528f;

    /* renamed from: g */
    public long f113529g;

    /* renamed from: h */
    public final bhdb f113530h;

    /* renamed from: i */
    public final byte[] f113531i;

    /* renamed from: j */
    public volatile boolean f113532j = false;

    /* renamed from: k */
    public final bgns f113533k;

    /* renamed from: l */
    public volatile boolean f113534l = false;

    /* renamed from: m */
    public final CountDownLatch f113535m = new CountDownLatch(1);

    /* renamed from: n */
    public bfdv f113536n;

    /* renamed from: p */
    private final Runnable f113537p = new bfdn(this);

    static {
        HashSet hashSet = new HashSet();
        f113522o = hashSet;
        hashSet.add(".lck");
        f113522o.add("sessionId");
        f113522o.add("uploadedSeq");
        f113522o.add("sessionSummary");
    }

    public bfdw(Context context, bgns bgns, String str, String str2, byte[] bArr, bfec bfec, Looper looper, bhdb bhdb) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (looper != null) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108589a(z, "looper could not be null when listener is not null.");
        bmxy.m108581a(context);
        bmxy.m108581a(str);
        if (bArr != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        bmxy.m108589a(z2, "Need non empty key");
        bmxy.m108589a(bArr.length == 32 ? true : z3, "signingKey needs to be 32 byte long.");
        this.f113530h = bfib.m96837a(bhdb);
        this.f113523a = context;
        this.f113524b = str2;
        this.f113533k = bgns;
        if (!str.endsWith("/")) {
            this.f113525c = String.valueOf(str).concat("/");
        } else {
            this.f113525c = str;
        }
        this.f113531i = bArr;
        this.f113526d = true;
        this.f113528f = bfec;
        this.f113527e = new adzt(looper);
    }

    /* renamed from: a */
    public final void mo61506a() {
        Thread thread = new Thread(this.f113537p, "BatchScanResultUploader.Thread");
        thread.setPriority(4);
        thread.start();
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0065 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x006a A[SYNTHETIC, Splitter:B:42:0x006a] */
    /* renamed from: b */
    public final String mo61509b(String str) {
        byte[] bArr;
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        try {
            File file = new File(this.f113525c, str);
            if (!file.exists() || file.isDirectory()) {
                bArr = null;
                if (bArr != null) {
                    return new String(bArr);
                }
                return null;
            }
            fileInputStream = new FileInputStream(file);
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr2 = new byte[1024];
                while (true) {
                    int read = fileInputStream.read(bArr2);
                    if (read < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr2, 0, read);
                }
                bArr = byteArrayOutputStream.toByteArray();
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                }
            } catch (IOException e2) {
            }
            if (bArr != null) {
            }
        } catch (IOException e3) {
            fileInputStream = null;
            try {
                String valueOf = String.valueOf(str);
                if (valueOf.length() == 0) {
                    new String("Could not read file: ");
                } else {
                    "Could not read file: ".concat(valueOf);
                }
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                        bArr = null;
                    } catch (IOException e4) {
                        bArr = null;
                        if (bArr != null) {
                        }
                    }
                    if (bArr != null) {
                    }
                }
                bArr = null;
                if (bArr != null) {
                }
            } catch (Throwable th) {
                th = th;
                fileInputStream2 = fileInputStream;
                if (fileInputStream2 != null) {
                    try {
                        fileInputStream2.close();
                    } catch (IOException e5) {
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            if (fileInputStream2 != null) {
            }
            throw th;
        }
    }

    /* renamed from: b */
    public final void mo61510b() {
        this.f113534l = true;
    }

    /* renamed from: c */
    public final void mo61511c() {
        if (System.currentTimeMillis() > this.f113529g) {
            bfgo.f113789a.mo61664a(this.f113525c);
            this.f113529g = System.currentTimeMillis() + 3600000;
        }
    }

    /* renamed from: d */
    public final boolean mo61513d() {
        File file = new File(this.f113525c);
        try {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                String valueOf = String.valueOf(file.getAbsolutePath());
                if (valueOf.length() == 0) {
                    new String("Error: Trying to delete non-directory");
                } else {
                    "Error: Trying to delete non-directory".concat(valueOf);
                }
                return false;
            }
            int length = listFiles.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    File file2 = listFiles[i];
                    if (file2.isDirectory() || !f113522o.contains(file2.getName())) {
                        break;
                    }
                    i++;
                } else if (listFiles.length <= f113522o.size()) {
                    return mo61508a(file);
                }
            }
            return false;
        } catch (SecurityException e) {
            String valueOf2 = String.valueOf(file.getAbsolutePath());
            if (valueOf2.length() == 0) {
                new String("Failed to delete directory ");
            } else {
                "Failed to delete directory ".concat(valueOf2);
            }
        }
    }

    /* renamed from: a */
    public final void mo61507a(String str) {
        if (this.f113528f != null) {
            this.f113527e.post(new bfdo(this, str));
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.io.FileOutputStream.<init>(java.io.File, boolean):void throws java.io.FileNotFoundException}
     arg types: [java.io.File, int]
     candidates:
      ClspMth{java.io.FileOutputStream.<init>(java.lang.String, boolean):void throws java.io.FileNotFoundException}
      ClspMth{java.io.FileOutputStream.<init>(java.io.File, boolean):void throws java.io.FileNotFoundException} */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0033 A[SYNTHETIC, Splitter:B:18:0x0033] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x003c A[SYNTHETIC, Splitter:B:24:0x003c] */
    /* renamed from: c */
    public final boolean mo61512c(String str) {
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(new File(this.f113525c, "sessionId"), false);
            try {
                fileOutputStream2.write(str.getBytes());
                try {
                    fileOutputStream2.close();
                } catch (IOException e) {
                }
                return true;
            } catch (IOException e2) {
                e = e2;
                fileOutputStream = fileOutputStream2;
                try {
                    Locale locale = Locale.US;
                    new Object[1][0] = e.getMessage();
                    if (fileOutputStream != null) {
                    }
                    return false;
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
            Locale locale2 = Locale.US;
            new Object[1][0] = e.getMessage();
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e4) {
                }
            }
            return false;
        } catch (Throwable th3) {
            th = th3;
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e5) {
                }
            }
            throw th;
        }
    }

    /* renamed from: a */
    public final boolean mo61508a(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    mo61508a(file2);
                } else {
                    file2.delete();
                }
            }
            if (file.delete()) {
                String absolutePath = file.getAbsolutePath();
                StringBuilder sb = new StringBuilder(String.valueOf(absolutePath).length() + 19);
                sb.append("Directory ");
                sb.append(absolutePath);
                sb.append(" deleted.");
                sb.toString();
                return true;
            }
            String valueOf = String.valueOf(file.getAbsolutePath());
            if (valueOf.length() == 0) {
                new String("Failed to delete directory ");
            } else {
                "Failed to delete directory ".concat(valueOf);
            }
        }
        return false;
    }
}
