package p000;

import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: blks */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blks {
    /* renamed from: a */
    public static void m107307a(byte[] bArr, blku blku, OutputStream outputStream, long j, int i, long j2) {
        InputStream b;
        if (i < 0) {
            throw new IOException("copyLength negative");
        } else if (j >= 0) {
            long j3 = (long) i;
            if (j3 <= j2) {
                try {
                    b = new blla(blku, j, Math.min(j3, ((blkw) blku).f126774b)).mo66626b();
                    while (i > 0) {
                        int min = Math.min(i, (int) AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES);
                        blkv.m107314a(b, bArr, min);
                        outputStream.write(bArr, 0, min);
                        i -= min;
                    }
                    if (b != null) {
                        b.close();
                        return;
                    }
                    return;
                } catch (EOFException e) {
                    throw new IOException("patch underrun", e);
                } catch (Throwable th) {
                    bqye.m113761a(th, th);
                }
            } else {
                throw new IOException("Output length overrun");
            }
        } else {
            throw new IOException("inputOffset negative");
        }
        throw th;
    }

    /* renamed from: a */
    public static void m107308a(byte[] bArr, DataInputStream dataInputStream, OutputStream outputStream, int i, long j) {
        if (i < 0) {
            throw new IOException("copyLength negative");
        } else if (((long) i) <= j) {
            while (i > 0) {
                try {
                    int min = Math.min(i, (int) AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES);
                    dataInputStream.readFully(bArr, 0, min);
                    outputStream.write(bArr, 0, min);
                    i -= min;
                } catch (EOFException e) {
                    throw new IOException("patch underrun");
                }
            }
        } else {
            throw new IOException("Output length overrun");
        }
    }
}
