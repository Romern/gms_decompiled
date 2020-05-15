package p000;

import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: bjbk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjbk {

    /* renamed from: a */
    private static final bjbu f122471a = new bjbu("FileUtils");

    /* renamed from: a */
    static void m103156a(File file, byte[] bArr) {
        FileOutputStream fileOutputStream;
        try {
            fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(bArr);
            fileOutputStream.close();
            return;
        } catch (IOException e) {
            f122471a.mo64982a("Failed to write bytes", e);
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: b */
    static void m103158b(File file) {
        File[] listFiles;
        if (!file.exists()) {
            bjbu bjbu = f122471a;
            String valueOf = String.valueOf(file);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16);
            sb.append("File not exist: ");
            sb.append(valueOf);
            bjbu.mo64983b(sb.toString());
            return;
        }
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                m103158b(file2);
            }
        }
        if (!file.delete()) {
            bjbu bjbu2 = f122471a;
            String valueOf2 = String.valueOf(file);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 18);
            sb2.append("Failed to delete: ");
            sb2.append(valueOf2);
            bjbu2.mo64983b(sb2.toString());
        }
    }

    /* renamed from: a */
    static byte[] m103157a(File file) {
        FileInputStream fileInputStream;
        if (file.isDirectory()) {
            bjbu bjbu = f122471a;
            String valueOf = String.valueOf(file);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 38);
            sb.append("Cannot open input stream on directory ");
            sb.append(valueOf);
            bjbu.mo64983b(sb.toString());
            return null;
        }
        byte[] bArr = new byte[((int) file.length())];
        try {
            fileInputStream = new FileInputStream(file);
            boav.m111017a(fileInputStream, bArr);
            fileInputStream.close();
            return bArr;
        } catch (IOException e) {
            bjbu bjbu2 = f122471a;
            String valueOf2 = String.valueOf(file);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 26);
            sb2.append("Failed to read from file: ");
            sb2.append(valueOf2);
            Log.e("ConsentLogging", bjbu2.f122492a.concat(sb2.toString()), e);
            return null;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }
}
