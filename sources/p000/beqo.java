package p000;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: beqo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class beqo {
    /* renamed from: a */
    public static bxxc m95441a(bxxc bxxc, InputStream inputStream) {
        int read = inputStream.read();
        if (read == -1) {
            return bxxc;
        }
        if ((read & 128) != 0) {
            read &= 127;
            int i = 7;
            while (true) {
                if (i < 32) {
                    int read2 = inputStream.read();
                    if (read2 != -1) {
                        read |= (read2 & 127) << i;
                        if ((read2 & 128) == 0) {
                            break;
                        }
                        i += 7;
                    } else {
                        throw new IOException();
                    }
                } else {
                    while (i < 64) {
                        int read3 = inputStream.read();
                        if (read3 == -1) {
                            throw new IOException();
                        } else if ((read3 & 128) != 0) {
                            i += 7;
                        }
                    }
                    throw new IOException();
                }
            }
        }
        byte[] bArr = new byte[read];
        int i2 = 0;
        while (i2 < read) {
            int read4 = inputStream.read(bArr, i2, read - i2);
            if (read4 != -1) {
                i2 += read4;
            } else {
                throw new IOException();
            }
        }
        return bxxc.mo73645aM().mo73633b(bArr).mo74062i();
    }

    /* renamed from: a */
    public static void m95442a(bxxc bxxc, OutputStream outputStream) {
        int i;
        int db = bxxc.mo74145db();
        if ((db & -128) != 0) {
            i = (db & -16384) != 0 ? (-2097152 & db) != 0 ? (-268435456 & db) == 0 ? 4 : 5 : 3 : 2;
        } else {
            i = 1;
        }
        int i2 = i + db;
        if (i2 > 4096) {
            i2 = 4096;
        }
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream, i2);
        while ((db & -128) != 0) {
            bufferedOutputStream.write((db & 127) | 128);
            db >>>= 7;
        }
        bufferedOutputStream.write(db);
        bufferedOutputStream.write(bxxc.serializeToBytes());
        bufferedOutputStream.flush();
    }
}
