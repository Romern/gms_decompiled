package p000;

import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Logger;

/* renamed from: blkr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blkr {
    static {
        Logger.getLogger(blkr.class.getName());
    }

    /* renamed from: a */
    static final long m107305a(InputStream inputStream) {
        long j = 0;
        for (int i = 0; i < 64; i += 8) {
            j |= ((long) inputStream.read()) << i;
        }
        if (j != Long.MIN_VALUE) {
            return (Long.MIN_VALUE & j) != 0 ? -(Long.MAX_VALUE & j) : j;
        }
        throw new blkq("read negative zero");
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static void m107306a(File file, OutputStream outputStream, InputStream inputStream, Long l) {
        InputStream b;
        Throwable th;
        blku a = blku.m107310a(file);
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 4096);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream, AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES);
            try {
                byte[] bArr = new byte[16];
                blkv.m107314a(bufferedInputStream, bArr, 16);
                String str = new String(bArr, 0, 16, "US-ASCII");
                if ("ENDSLEY/BSDIFF43".equals(str)) {
                    long j = ((blkw) a).f126774b;
                    long j2 = 2147483647L;
                    if (j <= 2147483647L) {
                        long a2 = m107305a(bufferedInputStream);
                        long j3 = 0;
                        if (a2 < 0 || a2 > 2147483647L) {
                            throw new blkq("bad newSize");
                        } else if (l.longValue() == a2) {
                            byte[] bArr2 = new byte[49152];
                            byte[] bArr3 = new byte[49152];
                            long j4 = 0;
                            long j5 = 0;
                            while (j4 < a2) {
                                long j6 = j;
                                long a3 = m107305a(bufferedInputStream);
                                long j7 = j4;
                                long a4 = m107305a(bufferedInputStream);
                                long a5 = m107305a(bufferedInputStream);
                                if (a3 < j3 || a3 > j2) {
                                    throw new blkq("bad diffSegmentLength");
                                } else if (a4 < j3 || a4 > j2) {
                                    throw new blkq("bad copySegmentLength");
                                } else if (a5 < -2147483648L || a5 > j2) {
                                    throw new blkq("bad offsetToNextInput");
                                } else {
                                    long j8 = j7 + a3 + a4;
                                    if (j8 <= a2) {
                                        long j9 = j5 + a3 + a5;
                                        if (j9 > j6) {
                                            throw new blkq("expectedFinalOldDataOffset too large");
                                        } else if (j9 >= j3) {
                                            long j10 = a4;
                                            byte[] bArr4 = bArr2;
                                            long j11 = a2;
                                            byte[] bArr5 = bArr3;
                                            long j12 = j3;
                                            b = new blla(a, j5, Math.max(((blkw) a).f126774b - j5, j3)).mo66626b();
                                            if (a3 > j12) {
                                                int i = (int) a3;
                                                while (i > 0) {
                                                    int min = Math.min(i, 49152);
                                                    blkv.m107314a(b, bArr4, min);
                                                    blkv.m107314a(bufferedInputStream, bArr5, min);
                                                    for (int i2 = 0; i2 < min; i2++) {
                                                        bArr4[i2] = (byte) (bArr4[i2] + bArr5[i2]);
                                                    }
                                                    bufferedOutputStream.write(bArr4, 0, min);
                                                    i -= min;
                                                }
                                            }
                                            if (b != null) {
                                                b.close();
                                            }
                                            long j13 = j10;
                                            if (j13 > j12) {
                                                int i3 = (int) j13;
                                                while (i3 > 0) {
                                                    int min2 = Math.min(49152, i3);
                                                    blkv.m107314a(bufferedInputStream, bArr4, min2);
                                                    bufferedOutputStream.write(bArr4, 0, min2);
                                                    i3 -= min2;
                                                }
                                            }
                                            j = j6;
                                            bArr2 = bArr4;
                                            bArr3 = bArr5;
                                            j3 = j12;
                                            j4 = j8;
                                            j5 = j9;
                                            a2 = j11;
                                            j2 = 2147483647L;
                                        } else {
                                            throw new blkq("expectedFinalOldDataOffset is negative");
                                        }
                                    } else {
                                        throw new blkq("expectedFinalNewDataBytesWritten too large");
                                    }
                                }
                            }
                            bufferedOutputStream.flush();
                            a.close();
                            return;
                        } else {
                            throw new blkq("expectedNewSize != newSize");
                        }
                    } else {
                        throw new blkq("bad oldSize");
                    }
                } else {
                    throw new blkq(String.format("bad signature: found %s should've been %s", str, "ENDSLEY/BSDIFF43"));
                }
            } catch (IOException e) {
                throw new blkq("truncated signature", e);
            } catch (Throwable th2) {
                bufferedOutputStream.flush();
                throw th2;
            }
            throw th;
        } catch (Throwable th3) {
            Throwable th4 = th3;
            try {
                a.close();
            } catch (Throwable th5) {
                bqye.m113761a(th4, th5);
            }
            throw th4;
        }
    }
}
