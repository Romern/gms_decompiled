package p000;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.Arrays;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: bgog */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgog implements bgml {

    /* renamed from: a */
    private final long f116911a;

    /* renamed from: b */
    private final byte[] f116912b;

    public bgog(long j, File file) {
        Throwable th;
        DataInputStream dataInputStream;
        this.f116911a = j;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = null;
        Closeable closeable = null;
        DataOutputStream dataOutputStream2 = null;
        if (file != null) {
            try {
                dataInputStream = new DataInputStream(new FileInputStream(file));
                try {
                    dataInputStream.readUnsignedShort();
                    byte[] bArr = new byte[32];
                    while (true) {
                        int read = dataInputStream.read(bArr);
                        if (read < 0) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, read);
                    }
                } catch (FileNotFoundException | Exception e) {
                } catch (Throwable th2) {
                    th = th2;
                    closeable = dataInputStream;
                    bhcy.m100661a(closeable);
                    throw th;
                }
            } catch (FileNotFoundException e2) {
                dataInputStream = null;
            } catch (Exception e3) {
                dataInputStream = null;
            } catch (Throwable th3) {
                th = th3;
                bhcy.m100661a(closeable);
                throw th;
            }
            bhcy.m100661a(dataInputStream);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (byteArray == null || byteArray.length != 32) {
            byte[] bArr2 = new byte[32];
            new SecureRandom().nextBytes(bArr2);
            if (file != null) {
                try {
                    DataOutputStream dataOutputStream3 = new DataOutputStream(new FileOutputStream(file));
                    try {
                        dataOutputStream3.writeShort(1);
                        dataOutputStream3.write(bArr2);
                        bhcy.m100661a(dataOutputStream3);
                    } catch (FileNotFoundException | IOException e4) {
                        dataOutputStream = dataOutputStream3;
                        bhcy.m100661a(dataOutputStream);
                        byteArray = bArr2;
                        this.f116912b = byteArray;
                    } catch (Throwable th4) {
                        th = th4;
                        dataOutputStream2 = dataOutputStream3;
                        bhcy.m100661a(dataOutputStream2);
                        throw th;
                    }
                } catch (FileNotFoundException | IOException e5) {
                    bhcy.m100661a(dataOutputStream);
                    byteArray = bArr2;
                    this.f116912b = byteArray;
                } catch (Throwable th5) {
                    th = th5;
                    bhcy.m100661a(dataOutputStream2);
                    throw th;
                }
            }
            byteArray = bArr2;
        }
        this.f116912b = byteArray;
    }

    /* renamed from: a */
    public final SecretKey mo63005a() {
        try {
            long j = this.f116911a;
            if (j != 0) {
                byte b = (byte) ((int) (j >>> 56));
                byte b2 = (byte) ((int) ((j >>> 48) & 255));
                byte b3 = (byte) ((int) ((j >>> 40) & 255));
                byte b4 = (byte) ((int) ((j >>> 32) & 255));
                byte b5 = (byte) ((int) ((j >>> 24) & 255));
                byte b6 = (byte) ((int) ((j >>> 16) & 255));
                byte b7 = (byte) ((int) ((j >>> 8) & 255));
                byte b8 = (byte) ((int) (j & 255));
                return new SecretKeySpec(new byte[]{b, b2, b3, b4, b5, b6, b7, b8, b, b2, b3, b4, b5, b6, b7, b8, b, b2, b3, b4, b5, b6, b7, b8, b, b2, b3, b4, b5, b6, b7, b8}, "AES");
            }
            throw new IOException("no android ID; can't access encrypted cache");
        } catch (IOException e) {
            return null;
        }
    }

    /* renamed from: b */
    public final byte[] mo63006b() {
        byte[] bArr = this.f116912b;
        return Arrays.copyOf(bArr, bArr.length);
    }
}
