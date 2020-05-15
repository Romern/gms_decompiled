package p000;

import android.content.Context;
import android.util.Base64;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.KeyFactory;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;

/* renamed from: apyy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apyy {

    /* renamed from: a */
    public final Context f85200a;

    /* renamed from: b */
    public final String f85201b;

    /* renamed from: c */
    public final int f85202c;

    /* renamed from: d */
    public final boolean f85203d;

    /* renamed from: e */
    public final apyk f85204e;

    static {
        apyy.class.getSimpleName();
    }

    public apyy(Context context, int i) {
        this.f85200a = context;
        this.f85202c = i;
        this.f85203d = rfy.m33549f(context);
        this.f85201b = String.valueOf(context.getApplicationInfo().dataDir).concat("/snet");
        this.f85204e = new apyk(context);
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x008a A[SYNTHETIC, Splitter:B:37:0x008a] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0093 A[SYNTHETIC, Splitter:B:43:0x0093] */
    /* renamed from: a */
    static boolean m71205a(File file, apyx apyx, int i) {
        byte[] bArr;
        if (file.length() > 52428800) {
            return false;
        }
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                byte[] bArr2 = new byte[4096];
                Signature instance = Signature.getInstance("SHA512withRSA");
                if (i != 1) {
                    bArr = Base64.decode("MIICIjANBgkqhkiG9w0BAQEFAAOCAg8AMIICCgKCAgEAx6BVAlkSMqzfalpLdBSWJTmw9Sn6KH3yeITXQSjW930rKP8JyO4eDUKG/dKovjpgyryB2gKC8UrTc/H755T7DkCPWo8iolPGEU9wHad5L/cczatyXkfyzXdAlnm22gDm8hZNe5Uuhxp1lLJpYq6BXGa7inwCnqm3CzZH0GD7+GUEUJPiSUuRqsZ85W1ACQQkZ1Xx4DaUkQzdMQtmoYT5JKn2QIRAkROy17vWR3kgt59iVlLu0FoJHS4Qo9nL2q8y5aacEhDo9pT7b0MIVdHOZuHn5CygkBefD8wUlPfezKe7ixHxpXx4YO3lUfBmZDxmjLvkxIWPDq7V+SGpgEzYI0HficnCOO8iz3CiAB787G2iqSIVO95XwMz5k286NK8OZJo40aN6XLgQnn3OJe+Ff2ISIm/SHO3LfsDzffy/N38+zZVZhcW/wlag/dRL+ltB3Oyed3fNraSuw6s0e3FHBnSHDsSmrveBz3HKB65DEjuTlZEsRGt8VoPOfO4vRYaZSDVR6QR1lZAPlFQC787Q8k0YdzIIW0usHopP0QY4CHyY69ctdQbW1CFuYEJvEfYoUJbhgYaEP0HKIkWUkcIEVNwewRr+xuh0B0BFLVdqGtZUyQOUNoKUj+VM/Lo0Z6nXXVcln+not//YuLa8bugEVsuAUPFylQXaTahJsW3oyPUCAwEAAQ==", 0);
                } else {
                    bArr = Base64.decode("MIICIjANBgkqhkiG9w0BAQEFAAOCAg8AMIICCgKCAgEA9OT2I+Zh5gPONCNYTeMAI7FxnISQLa6ART9E30l7PCHMMU7a90n2piOLxGL4GNQkpPckjB4OYucSCFuro/2Hb2+qMBfomOKOEZYE+rkYckQEExQZcc8Htds05Hm/obWUlJS3pdM7Pt7F5Y854Md8xrjMCJoYGOkrVR/IwrfzmGrRSshr8wl8ho6wSyeShw1ZqCCRMUQCWWXhk0ZFxXtDtYGNeeIJvafeiL6rskHDh80Z4orTS4+ZyZaCXEidogWt6n/OYmCFxRBcWudo0daCjmosskIzjIbuaewXzJpygFRmCQoYOG7tGsgKtnyzT5KKAyRwXCN9vhw5R8pYd74cZMtaZoufT8DdIS5gzceKC0/GVXPFAzpw1fySpXML7Pw7lP6DpYn5vArex6JKFWJnwph8uK2EADnlTPWUC52EF0v7yieDLXwdWtK4PJbkPDucMG4PWv5b8jyhXcXCUJFOBfzVmSSci5Y7J4ak6QfIV5KbCvG08nZY50iv7FUStfK3vpt6HaiduWxudIgl+qdPiQH0hFbgPTBiwh6DXIj5akhBnwPR3ojAGZqU4QITJv+2ll8pk+fnIcXcaeSqXDVx4XWKnp22HZOaXOCK1krO2rYf32pRlk8jZ+e8rzC1tHmV3FSXmntB1PmclCvrAaQQGRjr6GW7nlMy0cLaWz/v6dMCAwEAAQ==", 0);
                }
                instance.initVerify(KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(bArr)));
                int i2 = 0;
                while (true) {
                    int read = fileInputStream2.read(bArr2);
                    if (read == -1) {
                        break;
                    }
                    instance.update(bArr2, 0, read);
                    i2 += read;
                }
                if (((long) i2) == file.length()) {
                    instance.update(String.valueOf(apyx.f85199b).getBytes());
                    boolean verify = instance.verify(Base64.decode(apyx.f85198a.getBytes(), 0));
                    try {
                        fileInputStream2.close();
                    } catch (IOException e) {
                    }
                    return verify;
                }
                try {
                    fileInputStream2.close();
                } catch (IOException e2) {
                }
                return false;
            } catch (Exception e3) {
                e = e3;
                fileInputStream = fileInputStream2;
                try {
                    aqdu.m71410a(e);
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e4) {
                        }
                    }
                    return false;
                } catch (Throwable th) {
                    th = th;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e5) {
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = fileInputStream2;
                if (fileInputStream != null) {
                }
                throw th;
            }
        } catch (Exception e6) {
            e = e6;
            aqdu.m71410a(e);
            if (fileInputStream != null) {
            }
            return false;
        } catch (Throwable th3) {
            th = th3;
            if (fileInputStream != null) {
            }
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final long mo47714b() {
        if (mo47710a()) {
            try {
                return new apyx(new File(this.f85201b, "installed/metadata")).f85199b;
            } catch (IOException e) {
            }
        }
        return -1;
    }

    /* renamed from: b */
    public final boolean mo47715b(File file, File file2) {
        try {
            apyx apyx = new apyx(file);
            if (apyx.f85199b > mo47714b()) {
                return mo47711a(apyx, file2);
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    /* renamed from: a */
    static boolean m71206a(File file, File file2) {
        return file.exists() && file2.exists();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo47710a() {
        return m71206a(new File(this.f85201b, "installed/metadata"), new File(this.f85201b, "installed/snet.jar"));
    }

    /* renamed from: a */
    public final boolean mo47711a(apyx apyx, File file) {
        if (m71205a(file, apyx, 2)) {
            return true;
        }
        if (!this.f85203d) {
            return false;
        }
        boolean a = m71205a(file, apyx, 1);
        if (a) {
            new aqdu(this.f85200a, apyx.f85199b, this.f85202c);
            aqdu.f85789e = true;
        }
        return a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo47712a(String str, String str2, String str3, String str4) {
        new File(this.f85201b, "installed/").mkdirs();
        File file = new File(this.f85201b, str2);
        File file2 = new File(this.f85201b, str4);
        file.delete();
        file2.delete();
        return new File(this.f85201b, str).renameTo(file) && new File(this.f85201b, str3).renameTo(file2);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0061 A[SYNTHETIC, Splitter:B:29:0x0061] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0068 A[SYNTHETIC, Splitter:B:33:0x0068] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0073 A[SYNTHETIC, Splitter:B:40:0x0073] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x007a A[SYNTHETIC, Splitter:B:44:0x007a] */
    /* renamed from: a */
    public final boolean mo47713a(byte[] bArr, String str, String str2) {
        FileOutputStream fileOutputStream;
        new File(this.f85201b, "download/").mkdirs();
        String str3 = this.f85201b;
        FileOutputStream fileOutputStream2 = null;
        try {
            int i = ByteBuffer.wrap(bArr, 0, 4).order(ByteOrder.BIG_ENDIAN).getInt();
            FileOutputStream fileOutputStream3 = new FileOutputStream(new File(str3, str));
            try {
                fileOutputStream3.write(bArr, 4, i);
                fileOutputStream = new FileOutputStream(new File(str3, str2));
            } catch (Exception e) {
                e = e;
                fileOutputStream = null;
                fileOutputStream2 = fileOutputStream3;
                try {
                    aqdu.m71410a(e);
                    if (fileOutputStream2 != null) {
                    }
                    if (fileOutputStream != null) {
                    }
                    return false;
                } catch (Throwable th) {
                    th = th;
                    if (fileOutputStream2 != null) {
                        try {
                            fileOutputStream2.close();
                        } catch (IOException e2) {
                        }
                    }
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e3) {
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
                fileOutputStream2 = fileOutputStream3;
                if (fileOutputStream2 != null) {
                }
                if (fileOutputStream != null) {
                }
                throw th;
            }
            try {
                fileOutputStream.write(bArr, i + 4, (bArr.length - 4) - i);
                try {
                    fileOutputStream3.close();
                } catch (IOException e4) {
                }
                try {
                    fileOutputStream.close();
                    return true;
                } catch (IOException e5) {
                    return true;
                }
            } catch (Exception e6) {
                e = e6;
                fileOutputStream2 = fileOutputStream3;
                aqdu.m71410a(e);
                if (fileOutputStream2 != null) {
                }
                if (fileOutputStream != null) {
                }
                return false;
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream2 = fileOutputStream3;
                if (fileOutputStream2 != null) {
                }
                if (fileOutputStream != null) {
                }
                throw th;
            }
        } catch (Exception e7) {
            e = e7;
            fileOutputStream = null;
            aqdu.m71410a(e);
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException e8) {
                }
            }
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                    return false;
                } catch (IOException e9) {
                    return false;
                }
            }
            return false;
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
            if (fileOutputStream2 != null) {
            }
            if (fileOutputStream != null) {
            }
            throw th;
        }
    }
}
