package p000;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Process;
import android.os.StrictMode;
import android.os.SystemClock;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.zip.CRC32;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/* renamed from: bqxw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqxw {

    /* renamed from: a */
    private static final String f141928a = Locale.ENGLISH.getLanguage();

    /* renamed from: a */
    public static String m113726a(Context context, AssetManager assetManager, String str) {
        byte[] bArr;
        long j;
        byte[] bArr2;
        boolean z;
        Context context2 = context;
        AssetManager assetManager2 = assetManager;
        String a = m113729a(str);
        String packageCodePath = context.getPackageCodePath();
        String valueOf = String.valueOf(context.getFilesDir());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length());
        sb.append(valueOf);
        String sb2 = sb.toString();
        String a2 = m113728a(context2, a, packageCodePath);
        if (!new File(sb2, a2).exists()) {
            SystemClock.elapsedRealtime();
            File file = new File(sb2, a2);
            int myPid = Process.myPid();
            StringBuilder sb3 = new StringBuilder(String.valueOf(a2).length() + 16);
            sb3.append(a2);
            sb3.append(".");
            sb3.append(myPid);
            sb3.append(".tmp");
            String sb4 = sb3.toString();
            bobd bobd = new bobd(new BufferedOutputStream(context2.openFileOutput(sb4, 0)));
            ZipOutputStream zipOutputStream = new ZipOutputStream(bobd);
            InputStream open = assetManager2.open("AndroidManifest.xml");
            byte[] a3 = boav.m111020a(open);
            open.close();
            ZipEntry zipEntry = new ZipEntry("AndroidManifest.xml");
            CRC32 crc32 = new CRC32();
            crc32.update(a3);
            zipEntry.setMethod(0);
            String str2 = sb4;
            zipEntry.setSize((long) a3.length);
            zipEntry.setTime(0);
            zipEntry.setCrc(crc32.getValue());
            m113732a(zipEntry, bobd.f132491a);
            zipOutputStream.putNextEntry(zipEntry);
            zipOutputStream.write(a3);
            zipOutputStream.closeEntry();
            InputStream open2 = assetManager2.open("metaresources.arsc");
            BufferedInputStream bufferedInputStream = new BufferedInputStream(open2);
            byte[] a4 = bqxi.m113641a(new Locale(a).getLanguage());
            DataInputStream dataInputStream = new DataInputStream(bufferedInputStream);
            int readInt = dataInputStream.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i < readInt; i++) {
                byte[] bArr3 = new byte[2];
                dataInputStream.readFully(bArr3);
                arrayList.add(bArr3);
            }
            int i2 = 0;
            bqxe bqxe = null;
            while (i2 < arrayList.size()) {
                if (!Arrays.equals(a4, (byte[]) arrayList.get(i2))) {
                    if (dataInputStream.readInt() == 1296389185) {
                        z = true;
                    } else {
                        z = false;
                    }
                    bmxy.m108600b(z);
                    int readInt2 = dataInputStream.readInt() - 8;
                    while (true) {
                        bArr2 = a4;
                        long j2 = (long) readInt2;
                        long skip = dataInputStream.skip(j2);
                        if (skip == j2) {
                            break;
                        }
                        readInt2 = (int) (j2 - skip);
                        a4 = bArr2;
                    }
                } else {
                    bqxe = new bqxe(dataInputStream);
                    bArr2 = a4;
                }
                i2++;
                a4 = bArr2;
            }
            if (bqxe != null) {
                bqwu a5 = bqwx.m113581a(new bobl(dataInputStream), (bqwu) null, bqxe);
                bmxy.m108600b(a5 instanceof bqww);
                ((bqww) a5).mo69401a();
                bArr = a5.mo69399c();
            } else {
                bArr = null;
            }
            if (bArr != null) {
                CRC32 crc322 = new CRC32();
                crc322.update(bArr);
                ZipEntry zipEntry2 = new ZipEntry("resources.arsc");
                zipEntry2.setMethod(0);
                zipEntry2.setSize((long) bArr.length);
                zipEntry2.setTime(0);
                zipEntry2.setCrc(crc322.getValue());
                m113732a(zipEntry2, bobd.f132491a);
                zipOutputStream.putNextEntry(zipEntry2);
                zipOutputStream.write(bArr);
                zipOutputStream.closeEntry();
                open2.close();
                zipOutputStream.close();
                String str3 = str2;
                File file2 = new File(sb2, str3);
                if (packageCodePath != null) {
                    j = new File(packageCodePath).lastModified();
                } else {
                    j = 0;
                }
                if (j != 0) {
                    file2.setLastModified(j);
                }
                if (!file2.renameTo(file)) {
                    if (file.exists()) {
                        context2.deleteFile(str3);
                    } else {
                        throw new IOException("Failed to rename resources");
                    }
                }
            } else {
                String valueOf2 = String.valueOf(a);
                throw new RuntimeException(valueOf2.length() == 0 ? new String("Did not have specifier language ") : "Did not have specifier language ".concat(valueOf2));
            }
        }
        StringBuilder sb5 = new StringBuilder(String.valueOf(sb2).length() + 1 + String.valueOf(a2).length());
        sb5.append(sb2);
        sb5.append("/");
        sb5.append(a2);
        return sb5.toString();
    }

    /* renamed from: b */
    private static int m113735b(Resources resources, String str) {
        return resources.getIdentifier("LEMON_languages_key", "LEMON_languages", str);
    }

    /* renamed from: a */
    public static String m113727a(Context context, String str) {
        String str2;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            if (packageInfo.versionName != null) {
                str2 = packageInfo.versionName;
            } else {
                str2 = "noversion";
            }
            int hashCode = str2.hashCode() * 31;
            int i = packageInfo.versionCode;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 42);
            sb.append("locale-filtered-resources-");
            sb.append(hashCode + i);
            sb.append("-");
            sb.append(str);
            sb.append(".zip");
            return sb.toString();
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("Failed to find our own package", e);
        }
    }

    /* renamed from: a */
    public static String m113728a(Context context, String str, String str2) {
        String str3;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            if (packageInfo.versionName != null) {
                str3 = packageInfo.versionName;
            } else {
                str3 = "noversion";
            }
            int hashCode = (str3.hashCode() * 31) + packageInfo.versionCode;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 42);
            sb.append("locale-filtered-resources-");
            sb.append(hashCode);
            sb.append("-");
            sb.append(str);
            sb.append(".zip");
            String sb2 = sb.toString();
            m113730a(context, "locale-filtered-resources-", hashCode, str2);
            return sb2;
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("Failed to find our own package", e);
        }
    }

    /* renamed from: a */
    public static String m113729a(String str) {
        return "fil".equals(str) ? "tl" : str;
    }

    /* renamed from: a */
    public static void m113730a(Context context, String str, int i, String str2) {
        long j;
        String str3;
        Context context2 = context;
        String str4 = str;
        String str5 = str2;
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.allowThreadDiskReads();
        StrictMode.allowThreadDiskWrites();
        try {
            File filesDir = context.getFilesDir();
            if (filesDir != null) {
                if (str5 != null) {
                    j = new File(str5).lastModified();
                } else {
                    j = Long.MAX_VALUE;
                }
                StringBuilder sb = new StringBuilder(str.length() + 12);
                sb.append(str4);
                sb.append(i);
                sb.append("-");
                String sb2 = sb.toString();
                String[] fileList = context.fileList();
                int length = fileList.length;
                int i2 = 0;
                while (i2 < length) {
                    String str6 = fileList[i2];
                    if (!str6.startsWith(str4)) {
                        str3 = sb2;
                    } else if (str6.startsWith(sb2)) {
                        long lastModified = new File(filesDir, str6).lastModified();
                        long currentTimeMillis = System.currentTimeMillis();
                        str3 = sb2;
                        long millis = currentTimeMillis - TimeUnit.HOURS.toMillis(1);
                        if ((currentTimeMillis >= j || lastModified <= millis) && lastModified < j) {
                            context2.deleteFile(str6);
                        }
                    } else {
                        str3 = sb2;
                        context2.deleteFile(str6);
                    }
                    i2++;
                    str4 = str;
                    sb2 = str3;
                }
            }
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* renamed from: a */
    public static void m113731a(AssetManager assetManager, String str) {
        try {
            Object invoke = AssetManager.class.getDeclaredMethod("addAssetPath", String.class).invoke(assetManager, str);
            if (invoke == null || !(invoke instanceof Integer) || ((Integer) invoke).intValue() == 0) {
                String valueOf = String.valueOf(invoke);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26 + String.valueOf(str).length());
                sb.append("addAssetPath failed: ");
                sb.append(valueOf);
                sb.append(" for ");
                sb.append(str);
                throw new RuntimeException(sb.toString());
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            String valueOf2 = String.valueOf(str);
            throw new RuntimeException(valueOf2.length() == 0 ? new String("addAssetPath failed:  for ") : "addAssetPath failed:  for ".concat(valueOf2), e);
        }
    }

    /* renamed from: a */
    private static void m113732a(ZipEntry zipEntry, long j) {
        byte[] extra = zipEntry.getExtra() != null ? zipEntry.getExtra() : new byte[0];
        int length = zipEntry.getName().length();
        int length2 = extra.length;
        long j2 = (long) length2;
        long j3 = (j + ((((long) length) + 30) + j2)) % 8;
        if (j3 != 0) {
            byte[] bArr = new byte[((int) (j2 + (8 - j3)))];
            System.arraycopy(extra, 0, bArr, 0, length2);
            zipEntry.setExtra(bArr);
        }
    }

    /* renamed from: a */
    public static boolean m113733a(Resources resources, String str) {
        return m113735b(resources, str) != 0;
    }

    /* renamed from: a */
    public static boolean m113734a(Resources resources, String str, String str2) {
        int b;
        String a = m113729a(str);
        if ((a.length() == 2 || a.length() == 3) && !a.equals(f141928a) && (b = m113735b(resources, str2)) != 0) {
            for (String str3 : resources.getString(b).split(",")) {
                if (m113729a(new Locale(str3).getLanguage()).equals(a)) {
                    return true;
                }
            }
        }
        return false;
    }
}
