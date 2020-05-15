package p000;

import android.util.Pair;
import java.io.ByteArrayInputStream;
import java.io.IOException;
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
import java.util.Map;

/* renamed from: dkn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dkn {
    /* renamed from: a */
    private static int m8736a(int i) {
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
    private static String m8744b(int i) {
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
    private static int m8746c(int i) {
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
    private static ByteBuffer m8737a(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() >= 4) {
            int i = byteBuffer.getInt();
            if (i < 0) {
                throw new IllegalArgumentException("Negative length");
            } else if (i <= byteBuffer.remaining()) {
                return m8738a(byteBuffer, i);
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
    private static byte[] m8745b(ByteBuffer byteBuffer) {
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
    public static ByteBuffer m8738a(ByteBuffer byteBuffer, int i) {
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
    private static void m8739a(int i, byte[] bArr) {
        bArr[1] = (byte) (i & 255);
        bArr[2] = (byte) ((i >>> 8) & 255);
        bArr[3] = (byte) ((i >>> 16) & 255);
        bArr[4] = (byte) (i >> 24);
    }

    /* renamed from: a */
    private static void m8740a(Map map, FileChannel fileChannel, long j, long j2, long j3, ByteBuffer byteBuffer) {
        Map map2 = map;
        long j4 = j;
        if (!map.isEmpty()) {
            dki dki = new dki(fileChannel, 0, j);
            dki dki2 = new dki(fileChannel, j2, j3 - j2);
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.order(ByteOrder.LITTLE_ENDIAN);
            dla.m8782a(duplicate);
            int position = duplicate.position() + 16;
            if (j4 < 0 || j4 > 4294967295L) {
                StringBuilder sb = new StringBuilder(47);
                sb.append("uint32 value of out range: ");
                sb.append(j4);
                throw new IllegalArgumentException(sb.toString());
            }
            duplicate.putInt(duplicate.position() + position, (int) j4);
            dkg dkg = new dkg(duplicate);
            int i = ((C1245ok) map2).f26809h;
            int[] iArr = new int[i];
            int i2 = 0;
            int i3 = 0;
            for (Integer num : map.keySet()) {
                iArr[i3] = num.intValue();
                i3++;
            }
            try {
                byte[][] a = m8742a(iArr, new dkh[]{dki, dki2, dkg});
                while (i2 < i) {
                    int i4 = iArr[i2];
                    if (MessageDigest.isEqual((byte[]) map2.get(Integer.valueOf(i4)), a[i2])) {
                        i2++;
                    } else {
                        throw new SecurityException(m8744b(i4).concat(" digest of contents did not verify"));
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
    private static X509Certificate[] m8741a(ByteBuffer byteBuffer, Map map, CertificateFactory certificateFactory) {
        String str;
        Pair pair;
        ByteBuffer a = m8737a(byteBuffer);
        ByteBuffer a2 = m8737a(byteBuffer);
        byte[] b = m8745b(byteBuffer);
        ArrayList arrayList = new ArrayList();
        byte[] bArr = null;
        byte[] bArr2 = null;
        int i = -1;
        int i2 = 0;
        while (a2.hasRemaining()) {
            i2++;
            try {
                ByteBuffer a3 = m8737a(a2);
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
                        int a4 = m8736a(i3);
                        int a5 = m8736a(i);
                        if (a4 != 1) {
                            if (a5 != 1) {
                            }
                        }
                    }
                    bArr2 = m8745b(a3);
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
                    ByteBuffer a6 = m8737a(a);
                    ArrayList arrayList2 = new ArrayList();
                    int i4 = 0;
                    while (a6.hasRemaining()) {
                        i4++;
                        try {
                            ByteBuffer a7 = m8737a(a6);
                            if (a7.remaining() >= 8) {
                                int i5 = a7.getInt();
                                arrayList2.add(Integer.valueOf(i5));
                                if (i5 == i) {
                                    bArr = m8745b(a7);
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
                        int a8 = m8736a(i);
                        byte[] bArr3 = (byte[]) map.put(Integer.valueOf(a8), bArr);
                        if (bArr3 == null || MessageDigest.isEqual(bArr3, bArr)) {
                            ByteBuffer a9 = m8737a(a);
                            ArrayList arrayList3 = new ArrayList();
                            int i6 = 0;
                            while (a9.hasRemaining()) {
                                i6++;
                                byte[] b2 = m8745b(a9);
                                try {
                                    arrayList3.add(new dkl((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(b2)), b2));
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
                            throw new SecurityException(m8744b(a8).concat(" contents digest does not match the digest specified by a preceding signer"));
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
    private static byte[][] m8742a(int[] iArr, dkh[] dkhArr) {
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
            j3 += (dkhArr[i3].mo9191a() + 1048575) / 1048576;
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
                byte[] bArr2 = new byte[((m8746c(iArr2[i5]) * i4) + 5)];
                bArr2[0] = 90;
                m8739a(i4, bArr2);
                bArr[i5] = bArr2;
                i5++;
            }
            byte[] bArr3 = new byte[5];
            bArr3[0] = -91;
            MessageDigest[] messageDigestArr = new MessageDigest[length];
            int i6 = 0;
            while (i6 < iArr2.length) {
                String b = m8744b(iArr2[i6]);
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
                dkh dkh = dkhArr[i7];
                long j4 = j2;
                int i10 = length;
                long a = dkh.mo9191a();
                while (a > j2) {
                    int min = (int) Math.min(a, j);
                    m8739a(min, bArr3);
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
                        dkh.mo9192a(messageDigestArr, j5, min);
                        int i13 = 0;
                        while (true) {
                            dkh dkh2 = dkh;
                            if (i13 >= iArr2.length) {
                                break;
                            }
                            int i14 = iArr2[i13];
                            byte[] bArr4 = bArr3;
                            byte[] bArr5 = bArr[i13];
                            int c = m8746c(i14);
                            int i15 = i2;
                            MessageDigest messageDigest = messageDigestArr[i13];
                            MessageDigest[] messageDigestArr2 = messageDigestArr;
                            int digest = messageDigest.digest(bArr5, (i8 * c) + 5, c);
                            if (digest == c) {
                                i13++;
                                dkh = dkh2;
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
                String b2 = m8744b(i17);
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
    public static X509Certificate[][] m8743a(FileChannel fileChannel, dkj dkj) {
        C1223np npVar = new C1223np();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory instance = CertificateFactory.getInstance("X.509");
            try {
                ByteBuffer a = m8737a(dkj.f13411a);
                int i = 0;
                while (a.hasRemaining()) {
                    i++;
                    try {
                        arrayList.add(m8741a(m8737a(a), npVar, instance));
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
                } else if (!npVar.isEmpty()) {
                    m8740a(npVar, fileChannel, dkj.f13412b, dkj.f13413c, dkj.f13414d, dkj.f13415e);
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
