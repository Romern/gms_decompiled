package p000;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: aatb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aatb {
    /* renamed from: a */
    public static abee m46959a(String str) {
        return m46960a(str, -1);
    }

    /* renamed from: b */
    public static byte[] m46965b(byte[] bArr) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
        try {
            return m46963a(gZIPInputStream);
        } finally {
            gZIPInputStream.close();
            byteArrayInputStream.close();
        }
    }

    /* renamed from: a */
    public static abee m46960a(String str, int i) {
        bxvd da = abee.f57180d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        abee abee = (abee) da.f164949b;
        str.getClass();
        int i2 = abee.f57182a | 1;
        abee.f57182a = i2;
        abee.f57183b = str;
        abee.f57182a = i2 | 2;
        abee.f57184c = i;
        return (abee) da.mo74062i();
    }

    /* renamed from: a */
    public static abes m46961a(String str, String str2) {
        bxvd da = abes.f57287d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        abes abes = (abes) da.f164949b;
        str.getClass();
        int i = abes.f57289a | 1;
        abes.f57289a = i;
        abes.f57290b = str;
        str2.getClass();
        abes.f57289a = i | 2;
        abes.f57291c = str2;
        return (abes) da.mo74062i();
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0036  */
    /* renamed from: a */
    public static bxxc m46962a(File file, bxxc bxxc) {
        BufferedInputStream bufferedInputStream = null;
        if (!file.exists()) {
            return null;
        }
        try {
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(file));
            try {
                byte[] a = m46963a(bufferedInputStream2);
                if (srz.m36173a(a)) {
                    a = m46965b(a);
                }
                bxxc i = bxxc.mo73645aM().mo73633b(a).mo74062i();
                bufferedInputStream2.close();
                return i;
            } catch (Throwable th) {
                th = th;
                bufferedInputStream = bufferedInputStream2;
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            if (bufferedInputStream != null) {
            }
            throw th;
        }
    }

    /* renamed from: a */
    private static byte[] m46963a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[10240];
        while (true) {
            try {
                int read = inputStream.read(bArr, 0, 10240);
                if (read == -1) {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, read);
            } finally {
                byteArrayOutputStream.close();
            }
        }
    }

    /* renamed from: a */
    public static byte[] m46964a(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } finally {
            byteArrayOutputStream.close();
        }
    }
}
