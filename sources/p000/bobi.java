package p000;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;

/* renamed from: bobi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bobi {
    /* renamed from: a */
    public static boaq m111038a(File file) {
        return new bobh(file);
    }

    /* renamed from: b */
    public static byte[] m111041b(File file) {
        return m111038a(file).mo68799a();
    }

    /* renamed from: c */
    public static void m111042c(File file) {
        bmxy.m108581a(file);
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                String valueOf = String.valueOf(file);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39);
                sb.append("Unable to create parent directories of ");
                sb.append(valueOf);
                throw new IOException(sb.toString());
            }
        }
    }

    /* renamed from: a */
    public static boaw m111039a(File file, Charset charset) {
        return new boap(m111038a(file), charset);
    }

    /* renamed from: a */
    public static void m111040a(byte[] bArr, File file) {
        bobg bobg = new bobg(file, new bobe[0]);
        bmxy.m108581a(bArr);
        bobb a = bobb.m111033a();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(bobg.f132495a, bobg.f132496b.contains(bobe.APPEND));
            a.mo68842a(fileOutputStream);
            fileOutputStream.write(bArr);
            fileOutputStream.flush();
            a.close();
        } catch (Throwable th) {
            a.close();
            throw th;
        }
    }
}
