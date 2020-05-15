package p000;

import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.SignatureException;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: byrg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byrg implements byre {

    /* renamed from: a */
    static final BigInteger[] f167461a = {new BigInteger(new byte[]{25, -127, -5, 67, -15, 3, 41, 14, -49, -105, 114, 2, 45, -72, -79, -101, -6, -13, -119, 5, 126, -39, 30, -124, -122, -21, 54, -121, 99, 67, 89, 37}), new BigInteger(new byte[]{10, 113, 76, 52, -13, -75, -120, -86, -55, 47, -46, 88, 120, -124, -94, 9, 100, -3, 53, 26, 31, 20, 125, 92, 75, -65, 92, 47, 55, -89, 124, 54}), BigInteger.ONE, new BigInteger(new byte[]{4, -113, -63, -50, -27, -125, -103, 37, -27, -101, Byte.MIN_VALUE, -22, -83, -126, -84, 10, 60, -2, -59, 96, -109, 89, -117, 72, 68, -35, 42, 62, 36, 93, -120, 51})};

    /* renamed from: b */
    static final BigInteger[] f167462b = {new BigInteger(new byte[]{32, 26, 24, 79, 71, -39, -89, -105, 56, -111, -47, 72, -29, -47, -56, 100, -40, 8, 69, 71, 19, 28, 44, 28, -17, -73, -18, -67, 38, -58, 53, 103}), new BigInteger(new byte[]{109, -94, -45, -79, -114, -60, -7, -86, 59, 8, -29, -100, -103, 124, -40, -65, 110, -103, 72, -1, -44, -2, -1, -20, -81, -115, -48, -77, -42, 72, -73, -24}), BigInteger.ONE, new BigInteger(new byte[]{22, 64, -19, 90, 84, -6, 11, 7, 34, -122, -23, -46, 47, 70, 71, 99, -5, -10, 13, 121, 29, 55, -71, 9, 59, 88, 77, -12, -55, -107, -9, -127})};

    /* renamed from: c */
    static final BigInteger[] f167463c = {new BigInteger(new byte[]{33, 105, 54, -45, -51, 110, 83, -2, -64, -92, -30, 49, -3, -42, -36, 92, 105, 44, -57, 96, -107, 37, -89, -78, -55, 86, 45, 96, -113, 37, -43, 26}), new BigInteger(new byte[]{102, 102, 102, 102, 102, 102, 102, 102, 102, 102, 102, 102, 102, 102, 102, 102, 102, 102, 102, 102, 102, 102, 102, 102, 102, 102, 102, 102, 102, 102, 102, 88}), BigInteger.ONE, new BigInteger(new byte[]{103, -121, 95, 15, -41, -117, 118, 101, 102, -22, 78, -114, 100, -85, -29, 125, 32, -16, -97, Byte.MIN_VALUE, 119, 81, 82, -11, 109, -34, -118, -77, -91, -73, -35, -93})};

    /* renamed from: d */
    public byte[] f167464d;

    /* renamed from: e */
    public int f167465e;

    /* renamed from: f */
    private BigInteger f167466f;

    /* renamed from: g */
    private BigInteger f167467g;

    /* renamed from: h */
    private BigInteger[] f167468h;

    /* renamed from: i */
    private BigInteger[] f167469i;

    /* renamed from: j */
    private BigInteger[] f167470j;

    /* renamed from: k */
    private BigInteger[] f167471k;

    /* renamed from: l */
    private BigInteger[] f167472l;

    public byrg(int i, byte[] bArr) {
        BigInteger bigInteger;
        if (bArr.length >= 4) {
            this.f167465e = i;
            this.f167466f = new BigInteger(1, m125202c(bArr));
            do {
                bigInteger = new BigInteger((int) PSKKeyManager.MAX_KEY_LENGTH_BYTES, new SecureRandom());
                this.f167467g = bigInteger;
            } while (bigInteger.equals(BigInteger.ZERO));
            try {
                this.f167468h = byro.m125216a(f167463c, this.f167467g);
            } catch (byrn e) {
                throw new byrq("Could not make public key point", e);
            }
        } else {
            throw new byrq("Passwords must be at least 4 bytes");
        }
    }

    /* renamed from: a */
    private final byte[] m125196a(boolean z) {
        BigInteger[] bigIntegerArr;
        if (!z) {
            try {
                bigIntegerArr = f167462b;
            } catch (byrn e) {
                throw new byrq("Could not make commitment point message", e);
            }
        } else {
            bigIntegerArr = f167461a;
        }
        BigInteger[] a = byro.m125216a(bigIntegerArr, this.f167466f);
        this.f167472l = a;
        BigInteger[] b = byro.m125219b(a, this.f167468h);
        this.f167472l = b;
        this.f167471k = byro.m125215a(b);
        bxvd da = byrm.f167498f.mo74144da();
        bxvd da2 = byrj.f167479e.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        byrj byrj = (byrj) da2.f164949b;
        byrj.f167482b = 1;
        byrj.f167481a |= 1;
        bxtx a2 = bxtx.m123261a(this.f167471k[0].toByteArray());
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        byrj byrj2 = (byrj) da2.f164949b;
        a2.getClass();
        int i = 2;
        byrj2.f167481a |= 2;
        byrj2.f167483c = a2;
        bxtx a3 = bxtx.m123261a(this.f167471k[1].toByteArray());
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        byrj byrj3 = (byrj) da2.f164949b;
        a3.getClass();
        byrj3.f167481a |= 4;
        byrj3.f167484d = a3;
        byrj byrj4 = (byrj) da2.mo74062i();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        byrm byrm = (byrm) da.f164949b;
        byrj4.getClass();
        byrm.f167502c = byrj4;
        int i2 = byrm.f167500a | 2;
        byrm.f167500a = i2;
        if (z) {
            i = 1;
        }
        byrm.f167500a = i2 | 1;
        byrm.f167501b = i;
        return ((byrm) da.mo74062i()).mo73642k();
    }

    /* renamed from: b */
    private final void m125200b(boolean z) {
        BigInteger[] bigIntegerArr;
        int i = this.f167465e;
        if (i == 5 || i == 2) {
            if (!z) {
                try {
                    bigIntegerArr = f167461a;
                } catch (byrn e) {
                    throw new byrq("Error computing shared key", e);
                }
            } else {
                bigIntegerArr = f167462b;
            }
            this.f167464d = m125202c(m125198a(byro.m125215a(byro.m125216a(byro.m125217a(this.f167470j, byro.m125216a(bigIntegerArr, this.f167466f)), this.f167467g))));
            return;
        }
        String a = byrf.m125195a(i);
        StringBuilder sb = new StringBuilder(a.length() + 33);
        sb.append("Cannot make shared key in state: ");
        sb.append(a);
        throw new byrq(sb.toString());
    }

    /* renamed from: c */
    private static byte[] m125202c(byte[] bArr) {
        try {
            return MessageDigest.getInstance("SHA-256").digest(bArr);
        } catch (NoSuchAlgorithmException e) {
            throw new byrq("Error performing hash", e);
        }
    }

    /* renamed from: a */
    public final byte[] mo74485a(byte[] bArr) {
        throw null;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: byrg.a(boolean, byte[]):byte[]
     arg types: [int, ?[OBJECT, ARRAY]]
     candidates:
      byrg.a(byte[], boolean):byte[]
      byrg.a(boolean, byte[]):byte[] */
    /* renamed from: d */
    public final byte[] mo74488d() {
        int i = this.f167465e;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i2 == 0) {
            byte[] a = m125196a(true);
            this.f167465e = 2;
            return a;
        } else if (i2 == 2) {
            byte[] a2 = mo74490a(true, (byte[]) null);
            this.f167465e = 4;
            return a2;
        } else if (i2 == 5) {
            byte[] a3 = m125196a(false);
            this.f167465e = 7;
            return a3;
        } else if (i2 == 7) {
            byte[] a4 = mo74490a(false, (byte[]) null);
            this.f167465e = 9;
            return a4;
        } else {
            String a5 = byrf.m125195a(i);
            StringBuilder sb = new StringBuilder(a5.length() + 34);
            sb.append("Cannot get next message in state: ");
            sb.append(a5);
            throw new byrq(sb.toString());
        }
    }

    /* renamed from: e */
    public final byqy mo74489e() {
        throw null;
    }

    /* renamed from: c */
    public final boolean mo74487c() {
        int i = this.f167465e;
        int i2 = i - 1;
        if (i != 0) {
            return i2 == 8 || i2 == 9;
        }
        throw null;
    }

    /* renamed from: b */
    private final void m125201b(byte[] bArr, boolean z) {
        try {
            byrm byrm = (byrm) bxvk.m124014a(byrm.f167498f, bArr);
            int i = byrm.f167500a;
            if ((i & 1) != 0) {
                if (byrm.f167501b != (!z ? 1 : 2)) {
                    throw new byrq("Commitment message has wrong flow number");
                } else if ((i & 2) != 0) {
                    byrj byrj = byrm.f167502c;
                    if (byrj == null) {
                        byrj = byrj.f167479e;
                    }
                    int i2 = byrj.f167481a;
                    if ((i2 & 1) != 0) {
                        int i3 = byrj.f167482b;
                        if ((i2 & 2) == 0) {
                            throw new byrq("Commitment point missing x coordinate");
                        } else if ((i2 & 4) != 0) {
                            BigInteger[] bigIntegerArr = {new BigInteger(byrj.f167483c.mo73780k()), new BigInteger(byrj.f167484d.mo73780k())};
                            this.f167469i = bigIntegerArr;
                            try {
                                byro.m125220c(bigIntegerArr);
                                BigInteger bigInteger = bigIntegerArr[0];
                                BigInteger bigInteger2 = bigIntegerArr[1];
                                if (bigInteger.signum() != 1 || bigInteger2.signum() != 1) {
                                    throw new byrn("Point encoding must use only positive integers");
                                } else if (bigInteger.compareTo(byro.f167506a) >= 0 || bigInteger2.compareTo(byro.f167506a) >= 0) {
                                    throw new byrn("Point lies outside of the expected field");
                                } else {
                                    BigInteger multiply = bigInteger.multiply(bigInteger);
                                    BigInteger multiply2 = bigInteger2.multiply(bigInteger2);
                                    if (multiply.negate().add(multiply2).mod(byro.f167506a).equals(BigInteger.ONE.add(byro.f167507b.multiply(multiply).multiply(multiply2)).mod(byro.f167506a))) {
                                        BigInteger[] bigIntegerArr2 = this.f167469i;
                                        byro.m125220c(bigIntegerArr2);
                                        this.f167470j = new BigInteger[]{bigIntegerArr2[0], bigIntegerArr2[1], BigInteger.ONE, bigIntegerArr2[0].multiply(bigIntegerArr2[1]).mod(byro.f167506a)};
                                        return;
                                    }
                                    throw new byrn("Point does not lie on the expected curve");
                                }
                            } catch (byrn e) {
                                throw new byrq("Error validating their commitment point", e);
                            }
                        } else {
                            throw new byrq("Commitment point missing y coordinate");
                        }
                    } else {
                        throw new byrq("Commitment message has wrong curve");
                    }
                } else {
                    throw new byrq("Commitment message missing point");
                }
            } else {
                throw new byrq("Commitment message missing flow number");
            }
        } catch (bxwf e2) {
            throw new byrq("Could not parse commitment message", e2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0060, code lost:
        if (r4 == 0) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0063, code lost:
        if (r1 == r0) goto L_0x0065;
     */
    /* renamed from: a */
    private final byte[] m125197a(byte[] bArr, boolean z) {
        try {
            byrm byrm = (byrm) bxvk.m124014a(byrm.f167498f, bArr);
            int i = byrm.f167500a;
            if ((i & 1) != 0) {
                int i2 = !z ? 3 : 4;
                int i3 = byrm.f167501b;
                if (i3 != i2) {
                    StringBuilder sb = new StringBuilder(78);
                    sb.append("Hash message has flow number ");
                    sb.append(i3);
                    sb.append(", but expected flow number ");
                    sb.append(i2);
                    throw new byrq(sb.toString());
                } else if ((i & 4) != 0) {
                    byte[] k = byrm.f167503d.mo73780k();
                    byte[] c = m125202c(m125199a(new byte[]{z ? (byte) 1 : 0}, m125198a(this.f167471k), m125198a(this.f167469i), this.f167464d));
                    if (c != null && k != null) {
                        if (c.length == k.length) {
                            byte b = 0;
                            for (int i4 = 0; i4 < k.length; i4++) {
                                b = (byte) (b | (c[i4] ^ k[i4]));
                            }
                        }
                        throw new byrq("Hash message had incorrect hash value");
                    }
                    if (!z || (byrm.f167500a & 8) == 0) {
                        return new byte[0];
                    }
                    try {
                        byri a = byrb.m125173a(new SecretKeySpec(this.f167464d, "AES"), byrm.f167504e.mo73780k());
                        if (a.f167478c == 1) {
                            return a.f167477b.mo73780k();
                        }
                        throw new byrq("Incorrect sequence number in responder hello");
                    } catch (SignatureException e) {
                        throw new byrq("Error recovering payload from hash message", e);
                    }
                } else {
                    throw new byrq("Hash message missing hash value");
                }
            } else {
                throw new byrq("Hash message missing flow number");
            }
        } catch (bxwf e2) {
            throw new byrq("Could not parse hash message", e2);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: byrg.a(byte[], boolean):byte[]
     arg types: [byte[], int]
     candidates:
      byrg.a(boolean, byte[]):byte[]
      byrg.a(byte[], boolean):byte[] */
    /* renamed from: b */
    public final byte[] mo74486b(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            throw new byrq("Handshake message too short");
        }
        byte[] bArr2 = new byte[0];
        int i = this.f167465e;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i2 == 1) {
            m125201b(bArr, true);
            m125200b(true);
            this.f167465e = 3;
            return bArr2;
        } else if (i2 == 6) {
            m125197a(bArr, false);
            this.f167465e = 8;
            return bArr2;
        } else if (i2 == 3) {
            byte[] a = m125197a(bArr, true);
            this.f167465e = 9;
            return a;
        } else if (i2 == 4) {
            m125201b(bArr, false);
            m125200b(false);
            this.f167465e = 6;
            return bArr2;
        } else {
            String a2 = byrf.m125195a(i);
            StringBuilder sb = new StringBuilder(a2.length() + 31);
            sb.append("Cannot parse message in state: ");
            sb.append(a2);
            throw new byrq(sb.toString());
        }
    }

    /* renamed from: a */
    private static final byte[] m125198a(BigInteger[] bigIntegerArr) {
        return m125199a(bigIntegerArr[0].toByteArray(), bigIntegerArr[1].toByteArray());
    }

    /* renamed from: a */
    private static byte[] m125199a(byte[]... bArr) {
        int i = 0;
        for (byte[] bArr2 : bArr) {
            i += bArr2.length;
        }
        byte[] bArr3 = new byte[i];
        int i2 = 0;
        for (byte[] bArr4 : bArr) {
            int length = bArr4.length;
            System.arraycopy(bArr4, 0, bArr3, i2, length);
            i2 += length;
        }
        return bArr3;
    }

    /* renamed from: a */
    public final byte[] mo74490a(boolean z, byte[] bArr) {
        bxvd da = byrm.f167498f.mo74144da();
        int i = 4;
        bxtx a = bxtx.m123261a(m125202c(m125199a(new byte[]{!z}, m125198a(this.f167469i), m125198a(this.f167471k), this.f167464d)));
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        byrm byrm = (byrm) da.f164949b;
        a.getClass();
        int i2 = byrm.f167500a | 4;
        byrm.f167500a = i2;
        byrm.f167503d = a;
        if (z) {
            i = 3;
        }
        byrm.f167500a = i2 | 1;
        byrm.f167501b = i;
        if (this.f167465e == 8 && bArr != null) {
            try {
                bxtx a2 = bxtx.m123261a(byrb.m125177a(new byrz(bysa.DEVICE_TO_DEVICE_RESPONDER_HELLO_PAYLOAD, byqy.m125143a(bArr, 1).mo73642k()), new SecretKeySpec(this.f167464d, "AES")));
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                byrm byrm2 = (byrm) da.f164949b;
                a2.getClass();
                byrm2.f167500a = 8 | byrm2.f167500a;
                byrm2.f167504e = a2;
            } catch (InvalidKeyException | NoSuchAlgorithmException e) {
                throw new byrq("Cannot set payload", e);
            }
        }
        return ((byrm) da.mo74062i()).mo73642k();
    }
}
