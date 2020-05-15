package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: ssj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ssj {

    /* renamed from: a */
    private static final Map f45086a;

    static {
        HashMap hashMap = new HashMap();
        f45086a = hashMap;
        hashMap.put("armeabi-v7a", "arm");
        f45086a.put("x86", "x86");
        f45086a.put("x86_64", "x86_64");
        f45086a.put("arm64-v8a", "arm64");
    }

    /* renamed from: a */
    public static File m36227a(Context context) {
        Context d = aytw.m84817d(context);
        if (sqr.m35998a()) {
            return srj.m36115a(d, "extracted_libs");
        }
        return d.getDir("extracted_libs", 0);
    }

    /* renamed from: b */
    public static void m36230b(Context context) {
        File a;
        File[] listFiles;
        if ("com.google.android.gms".equals(context.getPackageName()) && (a = m36227a(context)) != null && (listFiles = a.listFiles()) != null) {
            for (File file : listFiles) {
                srj.m36120a(file);
            }
        }
    }

    /* renamed from: c */
    public static boolean m36232c(Context context) {
        return sro.m36132a(context);
    }

    /* renamed from: e */
    private static SharedPreferences m36234e(Context context) {
        return aytw.m84817d(context).getSharedPreferences("native_lib", 4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01d4, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01d5, code lost:
        r23 = r6;
        r24 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:?, code lost:
        p000.srz.m36171a((java.io.Closeable) r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01dc, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01e0, code lost:
        r22 = r4;
        r23 = r6;
        r21 = r12;
        r24 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0349, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x034f, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0352, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x0354, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0355, code lost:
        r22 = r4;
        r23 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x0381, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x0382, code lost:
        r16 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x03b7, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x03bc, code lost:
        r5 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x03be, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x03bf, code lost:
        r16 = r3;
        r22 = r4;
        r23 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x03ef, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00d1, code lost:
        r0 = r2.getApplicationInfo().nativeLibraryDir;
        r3 = new java.io.File(r0);
        r7 = android.os.Build.VERSION.SDK_INT;
        r17 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00ea, code lost:
        if ("lib".equals(r3.getName()) == false) goto L_0x00ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00ec, code lost:
        r0 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00ef, code lost:
        r0 = (java.lang.String) p000.ssj.f45086a.get(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00f7, code lost:
        if (r0 != null) goto L_0x0128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00f9, code lost:
        r3 = new java.lang.StringBuilder(java.lang.String.valueOf(r10).length() + 34);
        r3.append("Instruction set for ");
        r3.append(r10);
        r3.append(" is not known.");
        android.util.Log.w("NativeLibraryUtils", r3.toString());
        r22 = r4;
        r23 = r6;
        r18 = r8;
        r21 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0128, code lost:
        r0 = new java.io.File(r3.getParentFile(), r0).getAbsolutePath();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0135, code lost:
        r3 = new java.io.File(r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x013e, code lost:
        r18 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0142, code lost:
        if (r3.exists() != false) goto L_0x014e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0144, code lost:
        r22 = r4;
        r23 = r6;
        r21 = r12;
        r24 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:?, code lost:
        r19 = r13.getCrc();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0156, code lost:
        if (r3.exists() != false) goto L_0x0162;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0158, code lost:
        r22 = r4;
        r23 = r6;
        r21 = r12;
        r24 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
        r0 = new java.util.zip.CRC32();
        r8 = new java.io.FileInputStream(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x016c, code lost:
        r22 = r4;
        r21 = r12;
        r12 = 4096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        r4 = new byte[4096];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0174, code lost:
        r23 = r6;
        r24 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:?, code lost:
        r14 = r8.read(r4, 0, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x017f, code lost:
        if (r14 != -1) goto L_0x01c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:?, code lost:
        p000.srz.m36171a((java.io.Closeable) r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x018a, code lost:
        if (r0.getValue() != r19) goto L_0x01e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:?, code lost:
        r0 = m36228a(r2, r10, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0194, code lost:
        if (r0.exists() == false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x019a, code lost:
        if (r0.delete() == false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x019c, code lost:
        r0 = m36234e(r2).edit();
        r3 = java.lang.String.valueOf(r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01ac, code lost:
        if (r3.length() != 0) goto L_0x01b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01ae, code lost:
        r3 = new java.lang.String("crc_");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01b4, code lost:
        r3 = "crc_".concat(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01b8, code lost:
        r0.remove(r3);
        r0.apply();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:?, code lost:
        r0.update(r4, 0, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01cb, code lost:
        r6 = r23;
        r14 = r24;
        r12 = 4096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01d2, code lost:
        r0 = th;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0315  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x0347  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x034f A[ExcHandler: all (th java.lang.Throwable), Splitter:B:174:0x02d5] */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x03b7 A[ExcHandler: all (th java.lang.Throwable), PHI: r4 r6 10  PHI: (r4v6 java.io.RandomAccessFile) = (r4v3 java.io.RandomAccessFile), (r4v7 java.io.RandomAccessFile), (r4v14 java.io.RandomAccessFile), (r4v14 java.io.RandomAccessFile), (r4v14 java.io.RandomAccessFile), (r4v14 java.io.RandomAccessFile) binds: [B:35:0x0081, B:42:0x00a0, B:51:0x00c9, B:65:0x014e, B:69:0x0162, B:70:?] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r6v9 java.nio.channels.FileLock) = (r6v4 java.nio.channels.FileLock), (r6v10 java.nio.channels.FileLock), (r6v19 java.nio.channels.FileLock), (r6v19 java.nio.channels.FileLock), (r6v19 java.nio.channels.FileLock), (r6v19 java.nio.channels.FileLock) binds: [B:35:0x0081, B:42:0x00a0, B:51:0x00c9, B:65:0x014e, B:69:0x0162, B:70:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:35:0x0081] */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x03df A[SYNTHETIC, Splitter:B:235:0x03df] */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x03ef A[Catch:{ IOException -> 0x03f5, all -> 0x03f3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x040c A[SYNTHETIC, Splitter:B:254:0x040c] */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x041d A[SYNTHETIC, Splitter:B:265:0x041d] */
    /* renamed from: d */
    public static void m36233d(Context context) {
        Context d;
        RandomAccessFile randomAccessFile;
        RandomAccessFile randomAccessFile2;
        FileLock fileLock;
        Throwable th;
        FileLock fileLock2;
        FileLock fileLock3;
        Iterator it;
        char c;
        int i;
        int i2;
        ZipFile zipFile;
        Iterator it2;
        ZipFile zipFile2;
        FileLock fileLock4;
        Enumeration<? extends ZipEntry> entries;
        ZipEntry zipEntry;
        Enumeration<? extends ZipEntry> enumeration;
        int i3;
        int i4;
        String name;
        String name2;
        String name3;
        File file;
        String str;
        boolean z;
        Throwable th2;
        if (sro.m36132a(context)) {
            d = aytw.m84817d(context);
            ApplicationInfo applicationInfo = d.getApplicationInfo();
            try {
                randomAccessFile = new RandomAccessFile(new File(d.getCacheDir(), ".lib.lock"), "rw");
                try {
                    fileLock2 = randomAccessFile.getChannel().tryLock();
                } catch (IOException e) {
                    fileLock2 = null;
                } catch (Throwable th3) {
                    th = th3;
                    randomAccessFile2 = randomAccessFile;
                    fileLock = null;
                    if (fileLock != null) {
                        try {
                            fileLock.release();
                        } catch (IOException e2) {
                        }
                    }
                    try {
                        randomAccessFile2.close();
                    } catch (IOException e3) {
                    }
                    throw th;
                }
                if (fileLock2 != null) {
                    try {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(applicationInfo.sourceDir);
                        int i5 = Build.VERSION.SDK_INT;
                        if (applicationInfo.splitSourceDirs != null) {
                            Collections.addAll(arrayList, applicationInfo.splitSourceDirs);
                        }
                        it = arrayList.iterator();
                        c = 0;
                        i = 0;
                        i2 = 0;
                        while (it.hasNext()) {
                            try {
                                zipFile2 = new ZipFile((String) it.next());
                                try {
                                    entries = zipFile2.entries();
                                    while (entries.hasMoreElements()) {
                                        zipEntry = (ZipEntry) entries.nextElement();
                                        String name4 = zipEntry.getName();
                                        if (name4.startsWith("lib/")) {
                                            i3 = i + 1;
                                            if (!zipEntry.isDirectory()) {
                                                name = zipEntry.getName();
                                                File file2 = new File(name);
                                                name2 = file2.getName();
                                                File parentFile = file2.getParentFile();
                                                if (parentFile != null) {
                                                    name3 = parentFile.getName();
                                                    int i6 = Build.VERSION.SDK_INT;
                                                    String[] strArr = Build.SUPPORTED_ABIS;
                                                    int length = strArr.length;
                                                    it2 = it;
                                                    int i7 = 0;
                                                    while (true) {
                                                        if (i7 >= length) {
                                                            break;
                                                        }
                                                        int i8 = length;
                                                        if (strArr[i7].equals(name3)) {
                                                            break;
                                                        }
                                                        i7++;
                                                        length = i8;
                                                        randomAccessFile = randomAccessFile;
                                                        fileLock2 = fileLock2;
                                                    }
                                                }
                                            }
                                            it2 = it;
                                            randomAccessFile2 = randomAccessFile;
                                            fileLock3 = fileLock2;
                                            i4 = i3;
                                            enumeration = entries;
                                            i = i4;
                                        } else {
                                            it2 = it;
                                            randomAccessFile2 = randomAccessFile;
                                            fileLock3 = fileLock2;
                                            enumeration = entries;
                                        }
                                        it = it2;
                                        entries = enumeration;
                                        randomAccessFile = randomAccessFile2;
                                        fileLock2 = fileLock3;
                                    }
                                    Iterator it3 = it;
                                    randomAccessFile2 = randomAccessFile;
                                    fileLock3 = fileLock2;
                                    try {
                                        zipFile2.close();
                                        it = it3;
                                        randomAccessFile = randomAccessFile2;
                                        fileLock4 = fileLock3;
                                        c = 0;
                                    } catch (IOException e4) {
                                        e = e4;
                                        try {
                                            Log.w("NativeLibraryUtils", "Install failed", e);
                                            if (fileLock3 != null) {
                                                try {
                                                    fileLock3.release();
                                                } catch (IOException e5) {
                                                }
                                            }
                                            try {
                                                randomAccessFile2.close();
                                                return;
                                            } catch (IOException e6) {
                                                return;
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                            fileLock = fileLock3;
                                            if (fileLock != null) {
                                            }
                                            randomAccessFile2.close();
                                            throw th;
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        th = th;
                                        fileLock = fileLock3;
                                        if (fileLock != null) {
                                        }
                                        randomAccessFile2.close();
                                        throw th;
                                    }
                                } catch (IOException e7) {
                                    e = e7;
                                    randomAccessFile2 = randomAccessFile;
                                    fileLock3 = fileLock2;
                                    i4 = i3;
                                    i = i4;
                                    try {
                                        Log.e("NativeLibraryUtils", "Couldn't open apk source file.", e);
                                        if (zipFile2 != null) {
                                        }
                                        it = it2;
                                        randomAccessFile = randomAccessFile2;
                                        fileLock4 = fileLock3;
                                        c = 0;
                                    } catch (Throwable th6) {
                                        th = th6;
                                        zipFile = zipFile2;
                                        if (zipFile != null) {
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th7) {
                                }
                            } catch (IOException e8) {
                                e = e8;
                                it2 = it;
                                randomAccessFile2 = randomAccessFile;
                                fileLock3 = fileLock2;
                                zipFile2 = null;
                                Log.e("NativeLibraryUtils", "Couldn't open apk source file.", e);
                                if (zipFile2 != null) {
                                }
                                it = it2;
                                randomAccessFile = randomAccessFile2;
                                fileLock4 = fileLock3;
                                c = 0;
                            } catch (Throwable th8) {
                                th = th8;
                                zipFile = null;
                                if (zipFile != null) {
                                }
                                throw th;
                            }
                        }
                        Object[] objArr = new Object[2];
                        objArr[c] = Integer.valueOf(i);
                        objArr[1] = Integer.valueOf(i2);
                        if (fileLock2 != null) {
                            try {
                                fileLock2.release();
                            } catch (IOException e9) {
                            }
                        }
                        try {
                            randomAccessFile.close();
                            return;
                        } catch (IOException e10) {
                            return;
                        }
                    } catch (IOException e11) {
                        e = e11;
                        randomAccessFile2 = randomAccessFile;
                        fileLock3 = fileLock2;
                        Log.w("NativeLibraryUtils", "Install failed", e);
                        if (fileLock3 != null) {
                        }
                        randomAccessFile2.close();
                        return;
                    } catch (Throwable th9) {
                        th = th9;
                        randomAccessFile2 = randomAccessFile;
                        fileLock3 = fileLock2;
                        th = th;
                        fileLock = fileLock3;
                        if (fileLock != null) {
                        }
                        randomAccessFile2.close();
                        throw th;
                    }
                } else {
                    RandomAccessFile randomAccessFile3 = randomAccessFile;
                    FileLock fileLock5 = fileLock2;
                    if (fileLock5 != null) {
                        try {
                            fileLock5.release();
                        } catch (IOException e12) {
                        }
                    }
                    try {
                        randomAccessFile3.close();
                        return;
                    } catch (IOException e13) {
                        return;
                    }
                }
            } catch (IOException e14) {
                Log.w("NativeLibraryUtils", "Failed to open lock file", e14);
                return;
            }
        } else {
            return;
        }
        String absolutePath = file.getAbsolutePath();
        StringBuilder sb = new StringBuilder(String.valueOf(absolutePath).length() + 24);
        sb.append("File ");
        sb.append(absolutePath);
        sb.append(" is not up to date.");
        Log.w("NativeLibraryUtils", sb.toString());
        Log.w("NativeLibraryUtils", String.format("ZipFile CRC32: %x", Long.valueOf(zipEntry.getCrc())));
        File a = m36228a(d, name3, name2);
        SharedPreferences e15 = m36234e(d);
        String valueOf = String.valueOf(name);
        if (e15.getLong(valueOf.length() == 0 ? new String("crc_") : "crc_".concat(valueOf), 0) != zipEntry.getCrc()) {
            try {
                InputStream inputStream = zipFile2.getInputStream(zipEntry);
                File parentFile2 = a.getParentFile();
                if (!parentFile2.exists()) {
                    if (parentFile2.mkdirs()) {
                        try {
                            parentFile2.setReadable(true, false);
                            parentFile2.setExecutable(true, false);
                        } catch (IOException e16) {
                            z = false;
                            String absolutePath2 = a.getAbsolutePath();
                            StringBuilder sb2 = new StringBuilder(String.valueOf(absolutePath2).length() + 20);
                            sb2.append("Extraction to ");
                            sb2.append(absolutePath2);
                            sb2.append(" ");
                            sb2.append(z);
                            Log.i("NativeLibraryUtils", sb2.toString());
                            if (z) {
                            }
                        } catch (Throwable th10) {
                        }
                    } else {
                        z = false;
                        String absolutePath22 = a.getAbsolutePath();
                        StringBuilder sb22 = new StringBuilder(String.valueOf(absolutePath22).length() + 20);
                        sb22.append("Extraction to ");
                        sb22.append(absolutePath22);
                        sb22.append(" ");
                        sb22.append(z);
                        Log.i("NativeLibraryUtils", sb22.toString());
                        if (z) {
                        }
                    }
                }
                try {
                    File createTempFile = File.createTempFile(a.getName(), null, parentFile2);
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                        try {
                            byte[] bArr = new byte[4096];
                            while (true) {
                                int read = inputStream.read(bArr, 0, 4096);
                                if (read == -1) {
                                    try {
                                        break;
                                    } catch (Throwable th11) {
                                        th2 = th11;
                                        try {
                                            fileOutputStream.close();
                                        } catch (Throwable th12) {
                                            try {
                                                bqye.m113761a(th2, th12);
                                            } catch (IOException e17) {
                                                try {
                                                    createTempFile.delete();
                                                    z = false;
                                                    String absolutePath222 = a.getAbsolutePath();
                                                    StringBuilder sb222 = new StringBuilder(String.valueOf(absolutePath222).length() + 20);
                                                    sb222.append("Extraction to ");
                                                    sb222.append(absolutePath222);
                                                    sb222.append(" ");
                                                    sb222.append(z);
                                                    Log.i("NativeLibraryUtils", sb222.toString());
                                                    if (z) {
                                                    }
                                                } catch (IOException e18) {
                                                    e = e18;
                                                    i = i4;
                                                    Log.e("NativeLibraryUtils", "Couldn't open apk source file.", e);
                                                    if (zipFile2 != null) {
                                                    }
                                                    it = it2;
                                                    randomAccessFile = randomAccessFile2;
                                                    fileLock4 = fileLock3;
                                                    c = 0;
                                                } catch (Throwable th102) {
                                                }
                                            } catch (Throwable th1022) {
                                            }
                                        }
                                        throw th2;
                                    }
                                } else {
                                    try {
                                        fileOutputStream.write(bArr, 0, read);
                                    } catch (Throwable th13) {
                                        th = th13;
                                        th2 = th;
                                        fileOutputStream.close();
                                        throw th2;
                                    }
                                }
                            }
                            fileOutputStream.flush();
                            fileOutputStream.getFD().sync();
                        } catch (Throwable th14) {
                            th = th14;
                            th2 = th;
                            fileOutputStream.close();
                            throw th2;
                        }
                        try {
                            fileOutputStream.close();
                            try {
                                z = createTempFile.renameTo(a);
                                if (z) {
                                    try {
                                        a.setReadable(true, false);
                                        a.setExecutable(true, false);
                                    } catch (IOException e19) {
                                        z = false;
                                        String absolutePath2222 = a.getAbsolutePath();
                                        StringBuilder sb2222 = new StringBuilder(String.valueOf(absolutePath2222).length() + 20);
                                        sb2222.append("Extraction to ");
                                        sb2222.append(absolutePath2222);
                                        sb2222.append(" ");
                                        sb2222.append(z);
                                        Log.i("NativeLibraryUtils", sb2222.toString());
                                        if (z) {
                                        }
                                    } catch (Throwable th10222) {
                                    }
                                } else {
                                    createTempFile.delete();
                                }
                            } catch (IOException e20) {
                                z = false;
                                String absolutePath22222 = a.getAbsolutePath();
                                StringBuilder sb22222 = new StringBuilder(String.valueOf(absolutePath22222).length() + 20);
                                sb22222.append("Extraction to ");
                                sb22222.append(absolutePath22222);
                                sb22222.append(" ");
                                sb22222.append(z);
                                Log.i("NativeLibraryUtils", sb22222.toString());
                                if (z) {
                                }
                            } catch (Throwable th102222) {
                            }
                        } catch (IOException e21) {
                            createTempFile.delete();
                            z = false;
                            String absolutePath222222 = a.getAbsolutePath();
                            StringBuilder sb222222 = new StringBuilder(String.valueOf(absolutePath222222).length() + 20);
                            sb222222.append("Extraction to ");
                            sb222222.append(absolutePath222222);
                            sb222222.append(" ");
                            sb222222.append(z);
                            Log.i("NativeLibraryUtils", sb222222.toString());
                            if (z) {
                                i2++;
                                long crc = zipEntry.getCrc();
                                SharedPreferences.Editor edit = m36234e(d).edit();
                                String valueOf2 = String.valueOf(str);
                                edit.putLong(valueOf2.length() == 0 ? new String("crc_") : "crc_".concat(valueOf2), crc);
                                edit.apply();
                                i = i4;
                                it = it2;
                                entries = enumeration;
                                randomAccessFile = randomAccessFile2;
                                fileLock2 = fileLock3;
                            } else {
                                i = i4;
                                it = it2;
                                entries = enumeration;
                                randomAccessFile = randomAccessFile2;
                                fileLock2 = fileLock3;
                            }
                        } catch (Throwable th1022222) {
                        }
                    } catch (IOException e22) {
                        createTempFile.delete();
                        z = false;
                        String absolutePath2222222 = a.getAbsolutePath();
                        StringBuilder sb2222222 = new StringBuilder(String.valueOf(absolutePath2222222).length() + 20);
                        sb2222222.append("Extraction to ");
                        sb2222222.append(absolutePath2222222);
                        sb2222222.append(" ");
                        sb2222222.append(z);
                        Log.i("NativeLibraryUtils", sb2222222.toString());
                        if (z) {
                        }
                    } catch (Throwable th10222222) {
                    }
                } catch (IOException e23) {
                    z = false;
                    String absolutePath22222222 = a.getAbsolutePath();
                    StringBuilder sb22222222 = new StringBuilder(String.valueOf(absolutePath22222222).length() + 20);
                    sb22222222.append("Extraction to ");
                    sb22222222.append(absolutePath22222222);
                    sb22222222.append(" ");
                    sb22222222.append(z);
                    Log.i("NativeLibraryUtils", sb22222222.toString());
                    if (z) {
                    }
                } catch (Throwable th102222222) {
                }
            } catch (IOException e24) {
                z = false;
                String absolutePath222222222 = a.getAbsolutePath();
                StringBuilder sb222222222 = new StringBuilder(String.valueOf(absolutePath222222222).length() + 20);
                sb222222222.append("Extraction to ");
                sb222222222.append(absolutePath222222222);
                sb222222222.append(" ");
                sb222222222.append(z);
                Log.i("NativeLibraryUtils", sb222222222.toString());
                if (z) {
                }
            } catch (Throwable th1022222222) {
            }
            String absolutePath2222222222 = a.getAbsolutePath();
            StringBuilder sb2222222222 = new StringBuilder(String.valueOf(absolutePath2222222222).length() + 20);
            sb2222222222.append("Extraction to ");
            sb2222222222.append(absolutePath2222222222);
            sb2222222222.append(" ");
            sb2222222222.append(z);
            Log.i("NativeLibraryUtils", sb2222222222.toString());
            if (z) {
            }
        }
        i = i4;
        it = it2;
        entries = enumeration;
        randomAccessFile = randomAccessFile2;
        fileLock2 = fileLock3;
    }

    /* renamed from: a */
    private static File m36228a(Context context, String str, String str2) {
        File a = m36227a(context);
        String str3 = File.separator;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + String.valueOf(str3).length() + String.valueOf(str2).length());
        sb.append(str);
        sb.append(str3);
        sb.append(str2);
        return new File(a, sb.toString());
    }

    /* renamed from: a */
    public static String m36229a(Context context, String str) {
        return sro.m36130a(context, str);
    }

    /* renamed from: b */
    public static boolean m36231b(Context context, String str) {
        return sro.m36134b(context, str);
    }
}
