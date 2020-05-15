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

/* renamed from: bide */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bide {

    /* renamed from: a */
    public final byte[] f120288a;

    /* renamed from: b */
    private final File f120289b;

    /* renamed from: c */
    private final int f120290c = 1;

    /* renamed from: d */
    private final int f120291d = 32;

    public bide(File file) {
        DataInputStream dataInputStream;
        this.f120289b = file;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        File file2 = this.f120289b;
        DataOutputStream dataOutputStream = null;
        Closeable closeable = null;
        DataOutputStream dataOutputStream2 = null;
        if (file2 != null) {
            try {
                dataInputStream = new DataInputStream(new FileInputStream(file2));
                try {
                    dataInputStream.readUnsignedShort();
                    byte[] bArr = new byte[this.f120291d];
                    while (true) {
                        int read = dataInputStream.read(bArr);
                        if (read < 0) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, read);
                    }
                } catch (FileNotFoundException | IOException e) {
                } catch (Throwable th) {
                    th = th;
                    closeable = dataInputStream;
                    m101996a(closeable);
                    throw th;
                }
            } catch (FileNotFoundException e2) {
                dataInputStream = null;
            } catch (IOException e3) {
                dataInputStream = null;
            } catch (Throwable th2) {
                th = th2;
                m101996a(closeable);
                throw th;
            }
            m101996a(dataInputStream);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (byteArray == null || byteArray.length != 32) {
            SecureRandom secureRandom = new SecureRandom();
            byteArray = new byte[this.f120291d];
            secureRandom.nextBytes(byteArray);
            File file3 = this.f120289b;
            if (file3 != null) {
                try {
                    DataOutputStream dataOutputStream3 = new DataOutputStream(new FileOutputStream(file3));
                    try {
                        dataOutputStream3.writeShort(this.f120290c);
                        dataOutputStream3.write(byteArray);
                        m101996a(dataOutputStream3);
                    } catch (FileNotFoundException | IOException e4) {
                        dataOutputStream = dataOutputStream3;
                        m101996a(dataOutputStream);
                        this.f120288a = byteArray;
                    } catch (Throwable th3) {
                        th = th3;
                        dataOutputStream2 = dataOutputStream3;
                        m101996a(dataOutputStream2);
                        throw th;
                    }
                } catch (FileNotFoundException | IOException e5) {
                    m101996a(dataOutputStream);
                    this.f120288a = byteArray;
                } catch (Throwable th4) {
                    th = th4;
                    m101996a(dataOutputStream2);
                    throw th;
                }
            }
        }
        this.f120288a = byteArray;
    }

    /* renamed from: a */
    private static void m101996a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e) {
            }
        }
    }
}
