package p000;

import android.util.Pair;
import com.felicanetworks.sdu.ErrorInfo;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.DigestException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: blq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blq {
    /* renamed from: a */
    private static int m3297a(int i) {
        if (i == 513) {
            return 1;
        }
        if (i == 514) {
            return 2;
        }
        if (i == 769) {
            return 1;
        }
        switch (i) {
            case 257:
            case 259:
                return 1;
            case 258:
            case 260:
                return 2;
            default:
                String valueOf = String.valueOf(Long.toHexString((long) i));
                throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Unknown signature algorithm: 0x") : "Unknown signature algorithm: 0x".concat(valueOf));
        }
    }

    /* renamed from: b */
    private static String m3306b(int i) {
        if (i == 1) {
            return "SHA-256";
        }
        if (i == 2) {
            return "SHA-512";
        }
        StringBuilder sb = new StringBuilder(44);
        sb.append("Unknown content digest algorthm: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: c */
    private static int m3308c(int i) {
        if (i == 1) {
            return 32;
        }
        if (i == 2) {
            return 64;
        }
        StringBuilder sb = new StringBuilder(44);
        sb.append("Unknown content digest algorthm: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    private static ByteBuffer m3298a(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() >= 4) {
            int i = byteBuffer.getInt();
            if (i < 0) {
                throw new IllegalArgumentException("Negative length");
            } else if (i <= byteBuffer.remaining()) {
                return m3299a(byteBuffer, i);
            } else {
                int remaining = byteBuffer.remaining();
                StringBuilder sb = new StringBuilder(101);
                sb.append("Length-prefixed field longer than remaining buffer. Field length: ");
                sb.append(i);
                sb.append(", remaining: ");
                sb.append(remaining);
                throw new IOException(sb.toString());
            }
        } else {
            int remaining2 = byteBuffer.remaining();
            StringBuilder sb2 = new StringBuilder(93);
            sb2.append("Remaining buffer too short to contain length of length-prefixed field. Remaining: ");
            sb2.append(remaining2);
            throw new IOException(sb2.toString());
        }
    }

    /* renamed from: b */
    private static byte[] m3307b(ByteBuffer byteBuffer) {
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new IOException("Negative length");
        } else if (i <= byteBuffer.remaining()) {
            byte[] bArr = new byte[i];
            byteBuffer.get(bArr);
            return bArr;
        } else {
            int remaining = byteBuffer.remaining();
            StringBuilder sb = new StringBuilder(90);
            sb.append("Underflow while reading length-prefixed value. Length: ");
            sb.append(i);
            sb.append(", available: ");
            sb.append(remaining);
            throw new IOException(sb.toString());
        }
    }

    /* renamed from: a */
    private static ByteBuffer m3299a(ByteBuffer byteBuffer, int i) {
        if (i >= 0) {
            int limit = byteBuffer.limit();
            int position = byteBuffer.position();
            int i2 = i + position;
            if (i2 < position || i2 > limit) {
                throw new BufferUnderflowException();
            }
            byteBuffer.limit(i2);
            try {
                ByteBuffer slice = byteBuffer.slice();
                slice.order(byteBuffer.order());
                byteBuffer.position(i2);
                return slice;
            } finally {
                byteBuffer.limit(limit);
            }
        } else {
            StringBuilder sb = new StringBuilder(17);
            sb.append("size: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: a */
    private static void m3300a(int i, byte[] bArr) {
        bArr[1] = (byte) (i & 255);
        bArr[2] = (byte) ((i >>> 8) & 255);
        bArr[3] = (byte) ((i >>> 16) & 255);
        bArr[4] = (byte) (i >> 24);
    }

    /* renamed from: a */
    private static void m3301a(Map map, FileChannel fileChannel, long j, long j2, long j3, ByteBuffer byteBuffer) {
        long j4 = j;
        if (!map.isEmpty()) {
            bll bll = new bll(fileChannel, 0, j);
            bll bll2 = new bll(fileChannel, j2, j3 - j2);
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.order(ByteOrder.LITTLE_ENDIAN);
            blr.m3311a(duplicate);
            int position = duplicate.position() + 16;
            if (j4 < 0 || j4 > 4294967295L) {
                StringBuilder sb = new StringBuilder(47);
                sb.append("uint32 value of out range: ");
                sb.append(j4);
                throw new IllegalArgumentException(sb.toString());
            }
            duplicate.putInt(duplicate.position() + position, (int) j4);
            blj blj = new blj(duplicate);
            int size = map.size();
            int[] iArr = new int[size];
            int i = 0;
            int i2 = 0;
            for (Integer num : map.keySet()) {
                iArr[i2] = num.intValue();
                i2++;
            }
            try {
                byte[][] a = m3303a(iArr, new blk[]{bll, bll2, blj});
                while (i < size) {
                    int i3 = iArr[i];
                    if (MessageDigest.isEqual((byte[]) map.get(Integer.valueOf(i3)), a[i])) {
                        i++;
                    } else {
                        throw new SecurityException(m3306b(i3).concat(" digest of contents did not verify"));
                    }
                }
            } catch (DigestException e) {
                throw new SecurityException("Failed to compute digest(s) of contents", e);
            }
        } else {
            throw new SecurityException("No digests provided");
        }
    }

    /* renamed from: a */
    private static X509Certificate[] m3302a(ByteBuffer byteBuffer, Map map, CertificateFactory certificateFactory) {
        String str;
        Pair pair;
        ByteBuffer a = m3298a(byteBuffer);
        ByteBuffer a2 = m3298a(byteBuffer);
        byte[] b = m3307b(byteBuffer);
        ArrayList arrayList = new ArrayList();
        byte[] bArr = null;
        byte[] bArr2 = null;
        int i = -1;
        int i2 = 0;
        while (a2.hasRemaining()) {
            i2++;
            try {
                ByteBuffer a3 = m3298a(a2);
                if (a3.remaining() >= 8) {
                    int i3 = a3.getInt();
                    arrayList.add(Integer.valueOf(i3));
                    if (!(i3 == 513 || i3 == 514 || i3 == 769)) {
                        switch (i3) {
                            case 257:
                            case 258:
                            case 259:
                            case 260:
                                break;
                            default:
                                continue;
                        }
                    }
                    if (i != -1) {
                        int a4 = m3297a(i3);
                        int a5 = m3297a(i);
                        if (a4 != 1) {
                            if (a5 != 1) {
                            }
                        }
                    }
                    bArr2 = m3307b(a3);
                    i = i3;
                } else {
                    throw new SecurityException("Signature record too short");
                }
            } catch (IOException | BufferUnderflowException e) {
                StringBuilder sb = new StringBuilder(45);
                sb.append("Failed to parse signature record #");
                sb.append(i2);
                throw new SecurityException(sb.toString(), e);
            }
        }
        if (i != -1) {
            if (i == 513 || i == 514) {
                str = "EC";
            } else if (i != 769) {
                switch (i) {
                    default:
                        String valueOf = String.valueOf(Long.toHexString((long) i));
                        throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Unknown signature algorithm: 0x") : "Unknown signature algorithm: 0x".concat(valueOf));
                    case 257:
                    case 258:
                    case 259:
                    case 260:
                        str = "RSA";
                        break;
                }
            } else {
                str = "DSA";
            }
            if (i == 513) {
                pair = Pair.create("SHA256withECDSA", null);
            } else if (i == 514) {
                pair = Pair.create("SHA512withECDSA", null);
            } else if (i != 769) {
                switch (i) {
                    case 257:
                        pair = Pair.create("SHA256withRSA/PSS", new PSSParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, 32, 1));
                        break;
                    case 258:
                        pair = Pair.create("SHA512withRSA/PSS", new PSSParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, 64, 1));
                        break;
                    case 259:
                        pair = Pair.create("SHA256withRSA", null);
                        break;
                    case 260:
                        pair = Pair.create("SHA512withRSA", null);
                        break;
                    default:
                        String valueOf2 = String.valueOf(Long.toHexString((long) i));
                        throw new IllegalArgumentException(valueOf2.length() == 0 ? new String("Unknown signature algorithm: 0x") : "Unknown signature algorithm: 0x".concat(valueOf2));
                }
            } else {
                pair = Pair.create("SHA256withDSA", null);
            }
            String str2 = (String) pair.first;
            AlgorithmParameterSpec algorithmParameterSpec = (AlgorithmParameterSpec) pair.second;
            try {
                PublicKey generatePublic = KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(b));
                Signature instance = Signature.getInstance(str2);
                instance.initVerify(generatePublic);
                if (algorithmParameterSpec != null) {
                    instance.setParameter(algorithmParameterSpec);
                }
                instance.update(a);
                if (instance.verify(bArr2)) {
                    a.clear();
                    ByteBuffer a6 = m3298a(a);
                    ArrayList arrayList2 = new ArrayList();
                    int i4 = 0;
                    while (a6.hasRemaining()) {
                        i4++;
                        try {
                            ByteBuffer a7 = m3298a(a6);
                            if (a7.remaining() >= 8) {
                                int i5 = a7.getInt();
                                arrayList2.add(Integer.valueOf(i5));
                                if (i5 == i) {
                                    bArr = m3307b(a7);
                                }
                            } else {
                                throw new IOException("Record too short");
                            }
                        } catch (IOException | BufferUnderflowException e2) {
                            StringBuilder sb2 = new StringBuilder(42);
                            sb2.append("Failed to parse digest record #");
                            sb2.append(i4);
                            throw new IOException(sb2.toString(), e2);
                        }
                    }
                    if (arrayList.equals(arrayList2)) {
                        int a8 = m3297a(i);
                        byte[] bArr3 = (byte[]) map.put(Integer.valueOf(a8), bArr);
                        if (bArr3 == null || MessageDigest.isEqual(bArr3, bArr)) {
                            ByteBuffer a9 = m3298a(a);
                            ArrayList arrayList3 = new ArrayList();
                            int i6 = 0;
                            while (a9.hasRemaining()) {
                                i6++;
                                byte[] b2 = m3307b(a9);
                                try {
                                    arrayList3.add(new blo((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(b2)), b2));
                                } catch (CertificateException e3) {
                                    StringBuilder sb3 = new StringBuilder(41);
                                    sb3.append("Failed to decode certificate #");
                                    sb3.append(i6);
                                    throw new SecurityException(sb3.toString(), e3);
                                }
                            }
                            if (arrayList3.isEmpty()) {
                                throw new SecurityException("No certificates listed");
                            } else if (Arrays.equals(b, ((X509Certificate) arrayList3.get(0)).getPublicKey().getEncoded())) {
                                return (X509Certificate[]) arrayList3.toArray(new X509Certificate[arrayList3.size()]);
                            } else {
                                throw new SecurityException("Public key mismatch between certificate and signature record");
                            }
                        } else {
                            throw new SecurityException(m3306b(a8).concat(" contents digest does not match the digest specified by a preceding signer"));
                        }
                    } else {
                        throw new SecurityException("Signature algorithms don't match between digests and signatures records");
                    }
                } else {
                    throw new SecurityException(String.valueOf(str2).concat(" signature did not verify"));
                }
            } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | SignatureException | InvalidKeySpecException e4) {
                StringBuilder sb4 = new StringBuilder(String.valueOf(str2).length() + 27);
                sb4.append("Failed to verify ");
                sb4.append(str2);
                sb4.append(" signature");
                throw new SecurityException(sb4.toString(), e4);
            }
        } else if (i2 == 0) {
            throw new SecurityException("No signatures found");
        } else {
            throw new SecurityException("No supported signatures found");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0106, code lost:
        r1 = (long) r2;
        r3 = r11 + r1;
        r9 = r9 - r1;
        r13 = r13 + 1;
        r12 = r8;
        r17 = r7;
        r1 = 0;
        r7 = 1048576;
        r3 = r18;
        r4 = r4;
        r18 = r3;
     */
    /* renamed from: a */
    private static byte[][] m3303a(int[] iArr, blk[] blkArr) {
        long j;
        int i;
        int length;
        int i2;
        int[] iArr2 = iArr;
        long j2 = 0;
        long j3 = 0;
        int i3 = 0;
        while (true) {
            j = 1048576;
            if (i3 >= 3) {
                break;
            }
            j3 += (blkArr[i3].mo3223a() + 1048575) / 1048576;
            i3++;
        }
        if (j3 < 2097151) {
            int i4 = (int) j3;
            byte[][] bArr = new byte[iArr2.length][];
            int i5 = 0;
            while (true) {
                length = iArr2.length;
                if (i5 >= length) {
                    break;
                }
                byte[] bArr2 = new byte[((m3308c(iArr2[i5]) * i4) + 5)];
                bArr2[0] = 90;
                m3300a(i4, bArr2);
                bArr[i5] = bArr2;
                i5++;
            }
            byte[] bArr3 = new byte[5];
            bArr3[0] = -91;
            MessageDigest[] messageDigestArr = new MessageDigest[length];
            int i6 = 0;
            while (i6 < iArr2.length) {
                String b = m3306b(iArr2[i6]);
                try {
                    messageDigestArr[i6] = MessageDigest.getInstance(b);
                    i6++;
                } catch (NoSuchAlgorithmException e) {
                    throw new RuntimeException(b.concat(" digest not supported"), e);
                }
            }
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            for (i = 3; i7 < i; i = 3) {
                blk blk = blkArr[i7];
                long j4 = j2;
                int i10 = length;
                long a = blk.mo3223a();
                while (a > j2) {
                    int min = (int) Math.min(a, j);
                    m3300a(min, bArr3);
                    int i11 = 0;
                    while (true) {
                        i2 = i10;
                        if (i11 >= i2) {
                            break;
                        }
                        messageDigestArr[i11].update(bArr3);
                        i11++;
                        i10 = i2;
                    }
                    int i12 = i7;
                    long j5 = j4;
                    try {
                        blk.mo3224a(messageDigestArr, j5, min);
                        int i13 = 0;
                        while (true) {
                            blk blk2 = blk;
                            if (i13 >= iArr2.length) {
                                break;
                            }
                            int i14 = iArr2[i13];
                            byte[] bArr4 = bArr3;
                            byte[] bArr5 = bArr[i13];
                            int c = m3308c(i14);
                            int i15 = i2;
                            MessageDigest messageDigest = messageDigestArr[i13];
                            MessageDigest[] messageDigestArr2 = messageDigestArr;
                            int digest = messageDigest.digest(bArr5, (i8 * c) + 5, c);
                            if (digest == c) {
                                i13++;
                                blk = blk2;
                                bArr3 = bArr4;
                                i2 = i15;
                                messageDigestArr = messageDigestArr2;
                            } else {
                                String algorithm = messageDigest.getAlgorithm();
                                StringBuilder sb = new StringBuilder(String.valueOf(algorithm).length() + 46);
                                sb.append("Unexpected output size of ");
                                sb.append(algorithm);
                                sb.append(" digest: ");
                                sb.append(digest);
                                throw new RuntimeException(sb.toString());
                            }
                        }
                    } catch (IOException e2) {
                        StringBuilder sb2 = new StringBuilder(59);
                        sb2.append("Failed to digest chunk #");
                        sb2.append(i8);
                        sb2.append(" of section #");
                        sb2.append(i9);
                        throw new DigestException(sb2.toString(), e2);
                    }
                }
                i9++;
                i7++;
                length = i10;
            }
            byte[][] bArr6 = new byte[iArr2.length][];
            int i16 = 0;
            while (i16 < iArr2.length) {
                int i17 = iArr2[i16];
                byte[] bArr7 = bArr[i16];
                String b2 = m3306b(i17);
                try {
                    bArr6[i16] = MessageDigest.getInstance(b2).digest(bArr7);
                    i16++;
                } catch (NoSuchAlgorithmException e3) {
                    throw new RuntimeException(b2.concat(" digest not supported"), e3);
                }
            }
            return bArr6;
        }
        StringBuilder sb3 = new StringBuilder(37);
        sb3.append("Too many chunks: ");
        sb3.append(j3);
        throw new DigestException(sb3.toString());
    }

    /* renamed from: a */
    public static X509Certificate[][] m3304a(String str) {
        Pair pair;
        ByteBuffer byteBuffer;
        int limit;
        int position;
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
        try {
            int i = 0;
            if (randomAccessFile.length() >= 22) {
                pair = blr.m3310a(randomAccessFile, 0);
                if (pair == null) {
                    pair = blr.m3310a(randomAccessFile, 65535);
                }
            } else {
                pair = null;
            }
            if (pair != null) {
                ByteBuffer byteBuffer2 = (ByteBuffer) pair.first;
                long longValue = ((Long) pair.second).longValue();
                long j = -20 + longValue;
                if (j >= 0) {
                    randomAccessFile.seek(j);
                    if (randomAccessFile.readInt() == 1347094023) {
                        throw new bln("ZIP64 APK not supported");
                    }
                }
                blr.m3311a(byteBuffer2);
                long a = blr.m3309a(byteBuffer2, byteBuffer2.position() + 16);
                if (a < longValue) {
                    blr.m3311a(byteBuffer2);
                    if (blr.m3309a(byteBuffer2, byteBuffer2.position() + 12) + a != longValue) {
                        throw new bln("ZIP Central Directory is not immediately followed by End of Central Directory");
                    } else if (a >= 32) {
                        ByteBuffer allocate = ByteBuffer.allocate(24);
                        allocate.order(ByteOrder.LITTLE_ENDIAN);
                        randomAccessFile.seek(a - ((long) allocate.capacity()));
                        randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
                        int i2 = 8;
                        if (allocate.getLong(8) == 2334950737559900225L && allocate.getLong(16) == 3617552046287187010L) {
                            long j2 = allocate.getLong(0);
                            if (j2 < ((long) allocate.capacity()) || j2 > 2147483639) {
                                StringBuilder sb = new StringBuilder(57);
                                sb.append("APK Signing Block size out of range: ");
                                sb.append(j2);
                                throw new bln(sb.toString());
                            }
                            int i3 = (int) (8 + j2);
                            long j3 = a - ((long) i3);
                            if (j3 >= 0) {
                                ByteBuffer allocate2 = ByteBuffer.allocate(i3);
                                allocate2.order(ByteOrder.LITTLE_ENDIAN);
                                randomAccessFile.seek(j3);
                                randomAccessFile.readFully(allocate2.array(), allocate2.arrayOffset(), allocate2.capacity());
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
                                                while (slice.hasRemaining()) {
                                                    i++;
                                                    if (slice.remaining() >= i2) {
                                                        long j5 = slice.getLong();
                                                        if (j5 < 4 || j5 > 2147483647L) {
                                                            StringBuilder sb2 = new StringBuilder(76);
                                                            sb2.append("APK Signing Block entry #");
                                                            sb2.append(i);
                                                            sb2.append(" size out of range: ");
                                                            sb2.append(j5);
                                                            throw new bln(sb2.toString());
                                                        }
                                                        int i4 = (int) j5;
                                                        int position2 = slice.position() + i4;
                                                        if (i4 > slice.remaining()) {
                                                            int remaining = slice.remaining();
                                                            StringBuilder sb3 = new StringBuilder(91);
                                                            sb3.append("APK Signing Block entry #");
                                                            sb3.append(i);
                                                            sb3.append(" size out of range: ");
                                                            sb3.append(i4);
                                                            sb3.append(", available: ");
                                                            sb3.append(remaining);
                                                            throw new bln(sb3.toString());
                                                        } else if (slice.getInt() == 1896449818) {
                                                            X509Certificate[][] a2 = m3305a(randomAccessFile.getChannel(), new blm(m3299a(slice, i4 - 4), longValue2, a, longValue, byteBuffer2));
                                                            randomAccessFile.close();
                                                            try {
                                                                randomAccessFile.close();
                                                            } catch (IOException e) {
                                                            }
                                                            return a2;
                                                        } else {
                                                            slice.position(position2);
                                                            i2 = 8;
                                                        }
                                                    } else {
                                                        StringBuilder sb4 = new StringBuilder(70);
                                                        sb4.append("Insufficient data to read size of APK Signing Block entry #");
                                                        sb4.append(i);
                                                        throw new bln(sb4.toString());
                                                    }
                                                }
                                                throw new bln("No APK Signature Scheme v2 block in APK Signing Block");
                                            }
                                            StringBuilder sb5 = new StringBuilder(41);
                                            sb5.append("end > capacity: ");
                                            sb5.append(capacity);
                                            sb5.append(" > ");
                                            sb5.append(capacity2);
                                            throw new IllegalArgumentException(sb5.toString());
                                        }
                                        StringBuilder sb6 = new StringBuilder(38);
                                        sb6.append("end < start: ");
                                        sb6.append(capacity);
                                        sb6.append(" < ");
                                        sb6.append(8);
                                        throw new IllegalArgumentException(sb6.toString());
                                    }
                                    throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
                                }
                                StringBuilder sb7 = new StringBuilder((int) ErrorInfo.TYPE_SDU_COMMUNICATIONERROR);
                                sb7.append("APK Signing Block sizes in header and footer do not match: ");
                                sb7.append(j4);
                                sb7.append(" vs ");
                                sb7.append(j2);
                                throw new bln(sb7.toString());
                            }
                            StringBuilder sb8 = new StringBuilder(59);
                            sb8.append("APK Signing Block offset out of range: ");
                            sb8.append(j3);
                            throw new bln(sb8.toString());
                        }
                        throw new bln("No APK Signing Block before ZIP Central Directory");
                    } else {
                        StringBuilder sb9 = new StringBuilder(87);
                        sb9.append("APK too small for APK Signing Block. ZIP Central Directory offset: ");
                        sb9.append(a);
                        throw new bln(sb9.toString());
                    }
                } else {
                    StringBuilder sb10 = new StringBuilder(122);
                    sb10.append("ZIP Central Directory offset out of range: ");
                    sb10.append(a);
                    sb10.append(". ZIP End of Central Directory offset: ");
                    sb10.append(longValue);
                    throw new bln(sb10.toString());
                }
            } else {
                long length = randomAccessFile.length();
                StringBuilder sb11 = new StringBuilder(102);
                sb11.append("Not an APK file: ZIP End of Central Directory record not found in file with ");
                sb11.append(length);
                sb11.append(" bytes");
                throw new bln(sb11.toString());
            }
        } catch (Throwable th) {
            Throwable th2 = th;
            try {
                randomAccessFile.close();
            } catch (IOException e2) {
            }
            throw th2;
        }
    }

    /* renamed from: a */
    private static X509Certificate[][] m3305a(FileChannel fileChannel, blm blm) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory instance = CertificateFactory.getInstance("X.509");
            try {
                ByteBuffer a = m3298a(blm.f5108a);
                int i = 0;
                while (a.hasRemaining()) {
                    i++;
                    try {
                        arrayList.add(m3302a(m3298a(a), hashMap, instance));
                    } catch (IOException | SecurityException | BufferUnderflowException e) {
                        StringBuilder sb = new StringBuilder(48);
                        sb.append("Failed to parse/verify signer #");
                        sb.append(i);
                        sb.append(" block");
                        throw new SecurityException(sb.toString(), e);
                    }
                }
                if (i <= 0) {
                    throw new SecurityException("No signers found");
                } else if (!hashMap.isEmpty()) {
                    m3301a(hashMap, fileChannel, blm.f5109b, blm.f5110c, blm.f5111d, blm.f5112e);
                    return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()][]);
                } else {
                    throw new SecurityException("No content digests found");
                }
            } catch (IOException e2) {
                throw new SecurityException("Failed to read list of signers", e2);
            }
        } catch (CertificateException e3) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e3);
        }
    }
}
