package p000;

import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Log;
import android.util.Pair;
import com.felicanetworks.sdu.ErrorInfo;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.cert.X509Certificate;

/* renamed from: qmd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qmd implements dkw {
    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:48:0x00fc */
    /* JADX WARN: Type inference failed for: r15v14, assign insn: 0x00eb: CONST  (r15v14 ? I:?[long, double]) = (0 ?[long, double]) */
    /* JADX WARN: Type inference failed for: r15v16, assign insn: PHI: (r15v16 ?) = (r15v14 ?), (r15v18 ?), (r15v18 ?), (r15v18 ?), (r15v18 ?), (r15v18 ?) binds: [B:45:0x00f1, B:48:0x00fc, B:59:0x0154, B:62:0x016b, B:74:0x019b, B:92:0x01f4] */
    /* JADX WARN: Type inference failed for: r15v18, types: [java.io.RandomAccessFile], assign insn: 0x00fa: MOVE  (r15v18 ? I:?[OBJECT, ARRAY]) = (r17v2 java.io.RandomAccessFile) */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x037d, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x037f, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0387, code lost:
        throw new java.security.GeneralSecurityException("Failed to verify signatures", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0388, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0390, code lost:
        throw new java.security.GeneralSecurityException("Package is not signed", r0);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x037d A[ExcHandler: RuntimeException (e java.lang.RuntimeException), Splitter:B:137:0x0377] */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0388 A[Catch:{ IOException -> 0x037b, dkk -> 0x0388, RuntimeException -> 0x037d, Exception -> 0x0391 }, ExcHandler: dkk (r0v6 'e' dkk A[CUSTOM_DECLARE, Catch:{  }]), Splitter:B:3:0x0011] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:144:0x0380=Splitter:B:144:0x0380, B:83:0x01cb=Splitter:B:83:0x01cb} */
    /* renamed from: a */
    public final boolean mo9238a(File file) {
        RandomAccessFile randomAccessFile;
        Throwable th;
        Pair pair;
        ByteBuffer byteBuffer;
        int limit;
        int position;
        rpr b = rpr.m34216b();
        PackageInfo packageInfo = new PackageInfo();
        try {
            aptm.m70976a(b);
            try {
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(file.getAbsolutePath(), "r");
                try {
                    if (randomAccessFile2.length() >= 22) {
                        try {
                            pair = dla.m8781a(randomAccessFile2, 0);
                            if (pair == null) {
                                pair = dla.m8781a(randomAccessFile2, 65535);
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            randomAccessFile = randomAccessFile2;
                            randomAccessFile.close();
                            throw th;
                        }
                    } else {
                        pair = null;
                    }
                    if (pair != null) {
                        ByteBuffer byteBuffer2 = (ByteBuffer) pair.first;
                        long longValue = ((Long) pair.second).longValue();
                        long j = -20 + longValue;
                        if (j >= 0) {
                            randomAccessFile2.seek(j);
                            if (randomAccessFile2.readInt() == 1347094023) {
                                throw new dkk("ZIP64 APK not supported");
                            }
                        }
                        dla.m8782a(byteBuffer2);
                        long a = dla.m8780a(byteBuffer2, byteBuffer2.position() + 16);
                        if (a < longValue) {
                            dla.m8782a(byteBuffer2);
                            if (dla.m8780a(byteBuffer2, byteBuffer2.position() + 12) + a != longValue) {
                                throw new dkk("ZIP Central Directory is not immediately followed by End of Central Directory");
                            } else if (a >= 32) {
                                ByteBuffer allocate = ByteBuffer.allocate(24);
                                allocate.order(ByteOrder.LITTLE_ENDIAN);
                                randomAccessFile2.seek(a - ((long) allocate.capacity()));
                                randomAccessFile2.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
                                if (allocate.getLong(8) == 2334950737559900225L) {
                                    if (allocate.getLong(16) == 3617552046287187010L) {
                                        long j2 = allocate.getLong(0);
                                        RandomAccessFile randomAccessFile3 = randomAccessFile2;
                                        if (j2 >= ((long) allocate.capacity())) {
                                            if (j2 <= 2147483639) {
                                                int i = (int) (8 + j2);
                                                long j3 = a - ((long) i);
                                                ? r15 = 0;
                                                if (j3 >= 0) {
                                                    try {
                                                        ByteBuffer allocate2 = ByteBuffer.allocate(i);
                                                        allocate2.order(ByteOrder.LITTLE_ENDIAN);
                                                        r15 = randomAccessFile3;
                                                        try {
                                                            r15.seek(j3);
                                                            r15.readFully(allocate2.array(), allocate2.arrayOffset(), allocate2.capacity());
                                                            rpr rpr = b;
                                                            PackageInfo packageInfo2 = packageInfo;
                                                            long j4 = allocate2.getLong(0);
                                                            if (j4 == j2) {
                                                                Pair create = Pair.create(allocate2, Long.valueOf(j3));
                                                                byteBuffer = (ByteBuffer) create.first;
                                                                long longValue2 = ((Long) create.second).longValue();
                                                                if (byteBuffer.order() == ByteOrder.LITTLE_ENDIAN) {
                                                                    int capacity = byteBuffer.capacity() - 24;
                                                                    if (capacity >= 8) {
                                                                        int capacity2 = byteBuffer.capacity();
                                                                        if (capacity <= byteBuffer.capacity()) {
                                                                            limit = byteBuffer.limit();
                                                                            position = byteBuffer.position();
                                                                            byteBuffer.position(0);
                                                                            byteBuffer.limit(capacity);
                                                                            byteBuffer.position(8);
                                                                            ByteBuffer slice = byteBuffer.slice();
                                                                            slice.order(byteBuffer.order());
                                                                            byteBuffer.position(0);
                                                                            byteBuffer.limit(limit);
                                                                            byteBuffer.position(position);
                                                                            int i2 = 0;
                                                                            while (slice.hasRemaining()) {
                                                                                i2++;
                                                                                if (slice.remaining() >= 8) {
                                                                                    long j5 = slice.getLong();
                                                                                    if (j5 < 4 || j5 > 2147483647L) {
                                                                                        StringBuilder sb = new StringBuilder(76);
                                                                                        sb.append("APK Signing Block entry #");
                                                                                        sb.append(i2);
                                                                                        sb.append(" size out of range: ");
                                                                                        sb.append(j5);
                                                                                        throw new dkk(sb.toString());
                                                                                    }
                                                                                    int i3 = (int) j5;
                                                                                    int position2 = slice.position() + i3;
                                                                                    if (i3 > slice.remaining()) {
                                                                                        int remaining = slice.remaining();
                                                                                        StringBuilder sb2 = new StringBuilder(91);
                                                                                        sb2.append("APK Signing Block entry #");
                                                                                        sb2.append(i2);
                                                                                        sb2.append(" size out of range: ");
                                                                                        sb2.append(i3);
                                                                                        sb2.append(", available: ");
                                                                                        sb2.append(remaining);
                                                                                        throw new dkk(sb2.toString());
                                                                                    } else if (slice.getInt() == 1896449818) {
                                                                                        X509Certificate[][] a2 = dkn.m8743a(r15.getChannel(), new dkj(dkn.m8738a(slice, i3 - 4), longValue2, a, longValue, byteBuffer2));
                                                                                        r15.close();
                                                                                        r15.close();
                                                                                        Signature[] signatureArr = new Signature[a2.length];
                                                                                        for (int i4 = 0; i4 < a2.length; i4++) {
                                                                                            signatureArr[i4] = new Signature(a2[i4][0].getEncoded());
                                                                                        }
                                                                                        PackageInfo packageInfo3 = packageInfo2;
                                                                                        packageInfo3.signatures = signatureArr;
                                                                                        return rfz.m33557a(rpr).mo24611c(packageInfo3);
                                                                                    } else {
                                                                                        PackageInfo packageInfo4 = packageInfo2;
                                                                                        slice.position(position2);
                                                                                        packageInfo2 = packageInfo4;
                                                                                    }
                                                                                } else {
                                                                                    StringBuilder sb3 = new StringBuilder(70);
                                                                                    sb3.append("Insufficient data to read size of APK Signing Block entry #");
                                                                                    sb3.append(i2);
                                                                                    throw new dkk(sb3.toString());
                                                                                }
                                                                            }
                                                                            throw new dkk("No APK Signature Scheme v2 block in APK Signing Block");
                                                                        }
                                                                        StringBuilder sb4 = new StringBuilder(41);
                                                                        sb4.append("end > capacity: ");
                                                                        sb4.append(capacity);
                                                                        sb4.append(" > ");
                                                                        sb4.append(capacity2);
                                                                        throw new IllegalArgumentException(sb4.toString());
                                                                    }
                                                                    StringBuilder sb5 = new StringBuilder(38);
                                                                    sb5.append("end < start: ");
                                                                    sb5.append(capacity);
                                                                    sb5.append(" < ");
                                                                    sb5.append(8);
                                                                    throw new IllegalArgumentException(sb5.toString());
                                                                }
                                                                throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
                                                            }
                                                            StringBuilder sb6 = new StringBuilder((int) ErrorInfo.TYPE_SDU_COMMUNICATIONERROR);
                                                            sb6.append("APK Signing Block sizes in header and footer do not match: ");
                                                            sb6.append(j4);
                                                            sb6.append(" vs ");
                                                            sb6.append(j2);
                                                            throw new dkk(sb6.toString());
                                                        } catch (Throwable th3) {
                                                            th = th3;
                                                            randomAccessFile = r15;
                                                            th = th;
                                                            randomAccessFile.close();
                                                            throw th;
                                                        }
                                                    } catch (Throwable th4) {
                                                        th = th4;
                                                        randomAccessFile = randomAccessFile3;
                                                        th = th;
                                                        randomAccessFile.close();
                                                        throw th;
                                                    }
                                                } else {
                                                    StringBuilder sb7 = new StringBuilder(59);
                                                    sb7.append("APK Signing Block offset out of range: ");
                                                    sb7.append(j3);
                                                    throw new dkk(sb7.toString());
                                                }
                                            }
                                        }
                                        StringBuilder sb8 = new StringBuilder(57);
                                        sb8.append("APK Signing Block size out of range: ");
                                        sb8.append(j2);
                                        throw new dkk(sb8.toString());
                                    }
                                }
                                throw new dkk("No APK Signing Block before ZIP Central Directory");
                            } else {
                                StringBuilder sb9 = new StringBuilder(87);
                                sb9.append("APK too small for APK Signing Block. ZIP Central Directory offset: ");
                                sb9.append(a);
                                throw new dkk(sb9.toString());
                            }
                        } else {
                            StringBuilder sb10 = new StringBuilder(122);
                            sb10.append("ZIP Central Directory offset out of range: ");
                            sb10.append(a);
                            sb10.append(". ZIP End of Central Directory offset: ");
                            sb10.append(longValue);
                            throw new dkk(sb10.toString());
                        }
                    } else {
                        throw new dkk("Not an APK file: ZIP End of Central Directory record not found");
                    }
                } catch (Throwable th5) {
                    th = th5;
                    randomAccessFile = randomAccessFile2;
                    th = th;
                    randomAccessFile.close();
                    throw th;
                }
            } catch (IOException e) {
            } catch (dkk e2) {
            } catch (RuntimeException e3) {
            }
        } catch (IOException e4) {
        } catch (dkk e22) {
        } catch (RuntimeException e32) {
        } catch (Exception e5) {
            StringBuilder sb11 = new StringBuilder(e5.toString());
            Throwable cause = e5.getCause();
            if (cause != null) {
                sb11.append(", ");
                sb11.append(cause);
            }
            String absolutePath = file.getAbsolutePath();
            String valueOf = String.valueOf(sb11);
            StringBuilder sb12 = new StringBuilder(String.valueOf(absolutePath).length() + 25 + String.valueOf(valueOf).length());
            sb12.append(absolutePath);
            sb12.append(" failed signature check: ");
            sb12.append(valueOf);
            Log.w("GmsSigVfyr", sb12.toString());
            return false;
        }
    }
}
