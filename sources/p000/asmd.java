package p000;

import android.content.Context;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Collection;

/* renamed from: asmd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asmd {
    static {
        sgj sgj = sgj.UNKNOWN;
    }

    /* renamed from: a */
    public static File m74370a(Context context) {
        return new File(context.getCacheDir(), "android_pay_temp_files");
    }

    /* renamed from: b */
    private static void m74376b(File file) {
        if (!file.mkdirs() && !file.isDirectory()) {
            throw new IOException("Failed to create parent directory");
        }
    }

    /* renamed from: a */
    public static String m74371a(File file) {
        BufferedInputStream bufferedInputStream;
        BufferedInputStream bufferedInputStream2 = null;
        try {
            if (!file.exists()) {
                m74373a((Closeable) null);
                return null;
            } else if (file.length() <= 2147483647L) {
                bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = bufferedInputStream.read(bArr, 0, 1024);
                        if (read == -1) {
                            String str = new String(byteArrayOutputStream.toByteArray(), StandardCharsets.UTF_8);
                            m74373a(bufferedInputStream);
                            return str;
                        }
                        byteArrayOutputStream.write(bArr, 0, read);
                    }
                } catch (IOException e) {
                } catch (Throwable th) {
                    th = th;
                    bufferedInputStream2 = bufferedInputStream;
                    m74373a(bufferedInputStream2);
                    throw th;
                }
            } else {
                m74373a((Closeable) null);
                return null;
            }
        } catch (IOException e2) {
            bufferedInputStream = null;
            m74373a(bufferedInputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            m74373a(bufferedInputStream2);
            throw th;
        }
    }

    /* renamed from: a */
    public static String m74372a(String str) {
        byte[] a = spn.m35862a(str, "MD5");
        StringBuilder sb = new StringBuilder();
        for (byte b : a) {
            if ((b & 240) == 0) {
                sb.append("0");
            }
            sb.append(Integer.toHexString(b & 255));
        }
        return sb.toString();
    }

    /* renamed from: a */
    private static void m74373a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
            }
        }
    }

    /* renamed from: a */
    public static void m74374a(File file, Collection collection) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            boolean z = false;
            for (File file2 : listFiles) {
                if (file2.isFile() && !collection.contains(file2.toString())) {
                    z |= !file2.delete();
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x004f A[SYNTHETIC, Splitter:B:20:0x004f] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005c  */
    /* renamed from: a */
    public static void m74375a(String str, File file, Context context) {
        File a = m74370a(context);
        m74376b(a);
        m74376b(file.getParentFile());
        File file2 = null;
        BufferedInputStream bufferedInputStream = null;
        try {
            File createTempFile = File.createTempFile(file.getName(), null, a);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                try {
                    BufferedInputStream bufferedInputStream2 = new BufferedInputStream(stp.m36306a(new URL(str), 9984).getInputStream());
                    try {
                        srz.m36172a(bufferedInputStream2, fileOutputStream);
                        bufferedInputStream2.close();
                        fileOutputStream.close();
                        if (!createTempFile.renameTo(file) && createTempFile != null) {
                            createTempFile.delete();
                        }
                        shr.m35312a();
                    } catch (Throwable th) {
                        th = th;
                        bufferedInputStream = bufferedInputStream2;
                        if (bufferedInputStream != null) {
                            bufferedInputStream.close();
                        }
                        fileOutputStream.close();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (bufferedInputStream != null) {
                    }
                    fileOutputStream.close();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                file2 = createTempFile;
                if (file2 != null) {
                    file2.delete();
                }
                shr.m35312a();
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            if (file2 != null) {
            }
            shr.m35312a();
            throw th;
        }
    }
}
