package p000;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/* renamed from: srj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class srj {
    /* renamed from: a */
    public static File m36115a(Context context, String str) {
        File dir = context.getDir(str, 0);
        if (!dir.isDirectory()) {
            String valueOf = String.valueOf(dir.getAbsolutePath());
            Log.e("CommonFileUtils", valueOf.length() == 0 ? new String("Cannot get or create directory: ") : "Cannot get or create directory: ".concat(valueOf));
            return null;
        } else if (!m36119a(context, dir)) {
            String valueOf2 = String.valueOf(dir.getAbsolutePath());
            Log.e("CommonFileUtils", valueOf2.length() == 0 ? new String("Cannot set directory as world-readable: ") : "Cannot set directory as world-readable: ".concat(valueOf2));
            return null;
        } else {
            dir.setReadable(true, false);
            return dir;
        }
    }

    /* renamed from: a */
    private static FileLock m36116a(RandomAccessFile randomAccessFile) {
        int i = 0;
        while (true) {
            try {
                return randomAccessFile.getChannel().lock();
            } catch (OverlappingFileLockException e) {
                if (i == 3) {
                    return null;
                }
                i++;
                try {
                    Thread.sleep(cdjl.f180997a.mo6606a().mo77720z());
                } catch (InterruptedException e2) {
                    Thread.currentThread().interrupt();
                    return null;
                }
            }
        }
    }

    /* renamed from: a */
    public static void m36117a() {
        String a = ssy.m36271a();
        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 29);
        sb.append("=== Listing open FDs for ");
        sb.append(a);
        sb.append(" ===");
        Log.i("CommonFileUtils", sb.toString());
        int myPid = Process.myPid();
        StringBuilder sb2 = new StringBuilder(21);
        sb2.append("/proc/");
        sb2.append(myPid);
        sb2.append("/fd/");
        String sb3 = sb2.toString();
        int i = 0;
        int i2 = 0;
        while (i < 1024) {
            try {
                StringBuilder sb4 = new StringBuilder(String.valueOf(sb3).length() + 11);
                sb4.append(sb3);
                sb4.append(i);
                File file = new File(sb4.toString());
                if (!file.exists()) {
                    i++;
                } else {
                    int i3 = Build.VERSION.SDK_INT;
                    String readlink = Os.readlink(file.getAbsolutePath());
                    StringBuilder sb5 = new StringBuilder(String.valueOf(readlink).length() + 15);
                    sb5.append(i);
                    sb5.append(" -> ");
                    sb5.append(readlink);
                    Log.i("CommonFileUtils", sb5.toString());
                    i2++;
                    i++;
                }
            } catch (Exception e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb6 = new StringBuilder(String.valueOf(valueOf).length() + 15);
                sb6.append(i);
                sb6.append(" -> ");
                sb6.append(valueOf);
                Log.w("CommonFileUtils", sb6.toString());
            }
        }
        StringBuilder sb7 = new StringBuilder(29);
        sb7.append("Listed ");
        sb7.append(i2);
        sb7.append(" open files");
        Log.i("CommonFileUtils", sb7.toString());
    }

    /* renamed from: a */
    public static void m36118a(InputStream inputStream, File file) {
        FileOutputStream fileOutputStream;
        try {
            fileOutputStream = new FileOutputStream(file);
            srz.m36172a(inputStream, fileOutputStream);
            fileOutputStream.close();
            srz.m36171a((Closeable) inputStream);
        } catch (IOException e) {
            file.delete();
            throw e;
        } catch (Throwable th) {
            srz.m36171a((Closeable) inputStream);
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0249, code lost:
        if (r9 != false) goto L_0x024b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x02d0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x02d1, code lost:
        r2 = r0;
        r5 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x02d5, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x02d6, code lost:
        r5 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:?, code lost:
        r7.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0310, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:?, code lost:
        r0 = java.lang.String.valueOf(r0);
        r3 = new java.lang.StringBuilder(java.lang.String.valueOf(r0).length() + 29);
        r3.append("Failed to release file lock: ");
        r3.append(r0);
        android.util.Log.w("CommonFileUtils", r3.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:?, code lost:
        r5.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0346, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:?, code lost:
        r0 = java.lang.String.valueOf(r0);
        r4 = new java.lang.StringBuilder(java.lang.String.valueOf(r0).length() + 29);
        r4.append("Failed to release file lock: ");
        r4.append(r0);
        android.util.Log.w("CommonFileUtils", r4.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01ac, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01bc, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01bd, code lost:
        r21 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01c5, code lost:
        r0 = java.lang.String.valueOf(r0);
        r19 = r11;
        r11 = new java.lang.StringBuilder((java.lang.String.valueOf(r2).length() + 41) + java.lang.String.valueOf(r0).length());
        r11.append("Failed to reset executable bits on dir ");
        r11.append(r2);
        r11.append(": ");
        r11.append(r0);
        android.util.Log.w("CommonFileUtils", r11.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01ff, code lost:
        throw ((java.lang.RuntimeException) r0);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x02d0 A[ExcHandler: all (r0v19 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:32:0x0068] */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x030c A[SYNTHETIC, Splitter:B:142:0x030c] */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0342 A[SYNTHETIC, Splitter:B:154:0x0342] */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x01fd A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01c5 A[Catch:{ IOException -> 0x02d5, all -> 0x02d0 }] */
    /* renamed from: a */
    public static synchronized boolean m36119a(Context context, File file) {
        RandomAccessFile randomAccessFile;
        Throwable th;
        FileLock fileLock;
        String name;
        String str;
        File[] fileArr;
        int i;
        String str2;
        synchronized (srj.class) {
            SystemClock.elapsedRealtime();
            char c = 0;
            if (!file.isDirectory()) {
                String valueOf = String.valueOf(file.getAbsolutePath());
                Log.e("CommonFileUtils", valueOf.length() == 0 ? new String("Not a directory: ") : "Not a directory: ".concat(valueOf));
                return false;
            }
            File cacheDir = context.getCacheDir();
            if (cacheDir == null) {
                Log.w("CommonFileUtils", "Failed to get cache directory.");
                return false;
            }
            File filesDir = context.getFilesDir();
            if (filesDir == null) {
                Log.w("CommonFileUtils", "Failed to get files directory.");
                return false;
            }
            File file2 = new File(context.getFilesDir(), "gmscore_global_dirs.txt");
            RandomAccessFile randomAccessFile2 = null;
            String str3 = null;
            r5 = null;
            FileLock fileLock2 = null;
            try {
                file2.createNewFile();
                randomAccessFile = new RandomAccessFile(file2, "rw");
                try {
                    fileLock = m36116a(randomAccessFile);
                    if (fileLock != null) {
                        try {
                            byte[] bArr = new byte[((int) randomAccessFile.length())];
                            randomAccessFile.readFully(bArr);
                            HashSet a = bnpf.m110049a(bmyx.m108640a(':').mo66920b().mo66917a().mo66918a((CharSequence) new String(bArr, "UTF-8")));
                            boolean addAll = a.addAll(bmyx.m108640a(':').mo66920b().mo66917a().mo66925c((CharSequence) cdkv.f181175a.mo6606a().mo77846b()));
                            File parentFile = filesDir.getParentFile();
                            int i2 = 2;
                            char c2 = 1;
                            String[] strArr = {filesDir.getName(), cacheDir.getName()};
                            File canonicalFile = parentFile.getCanonicalFile();
                            File canonicalFile2 = file.getCanonicalFile();
                            if (canonicalFile2.getPath().startsWith(canonicalFile.getPath())) {
                                ArrayList<File> arrayList = new ArrayList();
                                while (canonicalFile2 != null) {
                                    arrayList.add(canonicalFile2);
                                    if (canonicalFile.equals(canonicalFile2)) {
                                        break;
                                    }
                                    File parentFile2 = canonicalFile2.getParentFile();
                                    if (canonicalFile.equals(parentFile2)) {
                                        name = canonicalFile2.getName();
                                        int i3 = 0;
                                        while (i3 < i2) {
                                            if (!strArr[i3].equals(name)) {
                                                i3++;
                                            } else {
                                                Object[] objArr = new Object[i2];
                                                objArr[c] = name;
                                                objArr[c2] = Arrays.toString(strArr);
                                                throw new IllegalArgumentException(String.format("Cannot make directory (%s) world-executable. Forbidden list: %s", objArr));
                                            }
                                        }
                                        int myUid = Process.myUid();
                                        if (cdkv.f181175a.mo6606a().mo77845a()) {
                                            int i4 = Build.VERSION.SDK_INT;
                                            if (canonicalFile != null) {
                                                File[] listFiles = canonicalFile.listFiles();
                                                if (listFiles != null) {
                                                    int length = listFiles.length;
                                                    int i5 = 0;
                                                    while (i5 < length) {
                                                        File file3 = listFiles[i5];
                                                        if (file3.getName().equals(name)) {
                                                            fileArr = listFiles;
                                                            str2 = name;
                                                            i = length;
                                                        } else if (!file3.isDirectory()) {
                                                            fileArr = listFiles;
                                                            str2 = name;
                                                            i = length;
                                                        } else if (!a.contains(file3.getName())) {
                                                            String absolutePath = file3.getAbsolutePath();
                                                            if (Os.stat(absolutePath).st_uid == myUid) {
                                                                int i6 = Os.stat(absolutePath).st_mode;
                                                                fileArr = listFiles;
                                                                int i7 = (i6 & (OsConstants.S_IXGRP ^ -1) & (OsConstants.S_IXOTH ^ -1)) | OsConstants.S_IXUSR;
                                                                if (i7 != i6) {
                                                                    Os.chmod(absolutePath, i7);
                                                                    str2 = name;
                                                                    Log.i("CommonFileUtils", String.format("Reset dir mode %s: %o to %o", absolutePath, Integer.valueOf(i6), Integer.valueOf(i7)));
                                                                    i = length;
                                                                } else {
                                                                    str2 = name;
                                                                    i = length;
                                                                }
                                                            } else {
                                                                fileArr = listFiles;
                                                                str2 = name;
                                                                i = length;
                                                            }
                                                        } else {
                                                            fileArr = listFiles;
                                                            str2 = name;
                                                            i = length;
                                                        }
                                                        i5++;
                                                        listFiles = fileArr;
                                                        name = str2;
                                                        length = i;
                                                    }
                                                }
                                                str = name;
                                            } else {
                                                str = name;
                                            }
                                        } else {
                                            str = name;
                                        }
                                        str3 = str;
                                    }
                                    canonicalFile2 = parentFile2;
                                    c = 0;
                                    c2 = 1;
                                    i2 = 2;
                                }
                                for (File file4 : arrayList) {
                                    file4.setExecutable(true, false);
                                }
                                if (str3 == null || !a.add(str3)) {
                                }
                                randomAccessFile.seek(0);
                                randomAccessFile.write(bmxr.m108543a(':').mo66874a((Iterable) a).getBytes("UTF-8"));
                                try {
                                    fileLock.release();
                                } catch (IOException e) {
                                    String valueOf2 = String.valueOf(e);
                                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 29);
                                    sb.append("Failed to release file lock: ");
                                    sb.append(valueOf2);
                                    Log.w("CommonFileUtils", sb.toString());
                                }
                                srz.m36171a(randomAccessFile);
                                return true;
                            }
                            throw new IllegalArgumentException(String.format("Not an ancestor directory: %s, %s", canonicalFile.getPath(), canonicalFile2.getPath()));
                        } catch (Exception e2) {
                            e = e2;
                            str2 = name;
                            if (!(e instanceof RuntimeException)) {
                            }
                        } catch (Throwable th2) {
                        }
                    } else {
                        String valueOf3 = String.valueOf(file2.getCanonicalPath());
                        throw new IOException(valueOf3.length() == 0 ? new String("Cannot lock file: ") : "Cannot lock file: ".concat(valueOf3));
                    }
                } catch (IOException e3) {
                    e = e3;
                    fileLock = null;
                    randomAccessFile2 = randomAccessFile;
                    try {
                        String valueOf4 = String.valueOf(e);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf4).length() + 36);
                        sb2.append("Failed to set dir world executable: ");
                        sb2.append(valueOf4);
                        Log.w("CommonFileUtils", sb2.toString());
                        if (fileLock != null) {
                        }
                        srz.m36171a(randomAccessFile2);
                        return false;
                    } catch (Throwable th3) {
                        th = th3;
                        randomAccessFile = randomAccessFile2;
                        fileLock2 = fileLock;
                        if (fileLock2 != null) {
                        }
                        srz.m36171a(randomAccessFile);
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    if (fileLock2 != null) {
                    }
                    srz.m36171a(randomAccessFile);
                    throw th;
                }
            } catch (IOException e4) {
                e = e4;
                fileLock = null;
                String valueOf42 = String.valueOf(e);
                StringBuilder sb22 = new StringBuilder(String.valueOf(valueOf42).length() + 36);
                sb22.append("Failed to set dir world executable: ");
                sb22.append(valueOf42);
                Log.w("CommonFileUtils", sb22.toString());
                if (fileLock != null) {
                }
                srz.m36171a(randomAccessFile2);
                return false;
            } catch (Throwable th5) {
                th = th5;
                randomAccessFile = null;
                if (fileLock2 != null) {
                }
                srz.m36171a(randomAccessFile);
                throw th;
            }
        }
    }

    /* renamed from: a */
    public static boolean m36120a(File file) {
        if (!file.exists() || file.delete()) {
            return true;
        }
        if (file.isDirectory()) {
            String[] list = file.list();
            if (list != null) {
                for (String str : list) {
                    m36120a(new File(file, str));
                }
            }
            if (file.delete()) {
                return true;
            }
        }
        return false;
    }
}
