package p000;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.LinkedList;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: civn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class civn {

    /* renamed from: a */
    public static final Object f191532a = new Object();

    /* renamed from: b */
    public final ciwr f191533b;

    /* renamed from: c */
    public final civm f191534c;

    /* renamed from: d */
    public final ciwn f191535d;

    /* renamed from: e */
    public final civo f191536e;

    public civn(ciwr ciwr, ciwn ciwn, ciwt ciwt, ciwl ciwl, civo civo) {
        this.f191533b = ciwr;
        this.f191535d = ciwn;
        this.f191536e = civo;
        this.f191534c = new civm(ciwn, ciwt, ciwl, civo);
    }

    /* renamed from: a */
    private static final Cipher m151044a(int i, SecretKeySpec secretKeySpec, int i2) {
        try {
            Cipher instance = Cipher.getInstance("AES/CTR/NoPadding");
            byte[] bArr = new byte[16];
            bArr[3] = (byte) i2;
            bArr[2] = (byte) (i2 >> 8);
            bArr[1] = (byte) (i2 >> 16);
            bArr[0] = (byte) (i2 >> 24);
            instance.init(i, secretKeySpec, new IvParameterSpec(bArr));
            return instance;
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: b */
    private static final byte[] m151048b(int i, ciwi ciwi, byte[] bArr) {
        Cipher cipher;
        if (i >= 3) {
            try {
                cipher = m151045a(2, ciwi.f191593a, ciwi.f191595c);
            } catch (BadPaddingException | IllegalBlockSizeException e) {
                throw new civi(e);
            }
        } else {
            cipher = m151044a(2, ciwi.f191593a, ciwi.f191596d);
        }
        return cipher.doFinal(bArr);
    }

    /* renamed from: a */
    private static final Cipher m151045a(int i, SecretKeySpec secretKeySpec, IvParameterSpec ivParameterSpec) {
        try {
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
            instance.init(i, secretKeySpec, ivParameterSpec);
            return instance;
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    public static final byte[] m151046a(int i, ciwi ciwi, byte[] bArr) {
        Cipher cipher;
        if (i >= 3) {
            try {
                cipher = m151045a(1, ciwi.f191593a, ciwi.f191595c);
            } catch (BadPaddingException | IllegalBlockSizeException e) {
                throw new AssertionError(e);
            }
        } else {
            cipher = m151044a(1, ciwi.f191593a, ciwi.f191596d);
        }
        return cipher.doFinal(bArr);
    }

    /* renamed from: a */
    private static final byte[] m151047a(ciwq ciwq, ciwc ciwc) {
        ciwh ciwh;
        ciwi ciwi;
        ciwq ciwq2 = ciwq;
        ciwc ciwc2 = ciwc;
        if ((ciwq2.f191608a.f191648a & 32) == 0) {
            throw new civi("Uninitialized session!");
        } else if (ciwc2.f191555a == ciwq.mo86613b()) {
            int i = ciwc2.f191555a;
            civs civs = ciwc2.f191559e;
            int i2 = ciwc2.f191556b;
            try {
                if (ciwq2.mo86609a(civs) == null) {
                    ciwk ciwk = new ciwk(civw.m151056a(ciwq.mo86613b()), ciwq2.f191608a.f191652e.getKey());
                    civs f = ciwq.mo86617f();
                    ciwz ciwz = ciwq2.f191608a.f191654g;
                    if (ciwz == null) {
                        ciwz = ciwz.f191633f;
                    }
                    cixf a = ciwk.mo86606a(civs, new civt(f, civq.m151050a(ciwz.f191637c.getKey())));
                    civt a2 = civq.m151051a();
                    cixf a3 = ((ciwk) a.f191669a).mo86606a(civs, a2);
                    ciwq2.mo86611a((ciwk) a3.f191669a);
                    ciwh ciwh2 = (ciwh) a.f191670b;
                    bxvd da = ciwx.f191621d.mo74144da();
                    ByteString a4 = ByteString.m123261a(ciwh2.f191590a);
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    ciwx ciwx = (ciwx) da.f164949b;
                    a4.getClass();
                    int i3 = ciwx.f191623a | 2;
                    ciwx.f191623a = i3;
                    ciwx.f191625c = a4;
                    int i4 = ciwh2.f191591b;
                    ciwx.f191623a = i3 | 1;
                    ciwx.f191624b = i4;
                    ciwx ciwx2 = (ciwx) da.mo74062i();
                    bxvd da2 = ciwz.f191633f.mo74144da();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    ciwz ciwz2 = (ciwz) da2.f164949b;
                    ciwx2.getClass();
                    ciwz2.f191638d = ciwx2;
                    ciwz2.f191635a |= 4;
                    ByteString a5 = ByteString.m123261a(civs.mo86595a());
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    ciwz ciwz3 = (ciwz) da2.f164949b;
                    a5.getClass();
                    ciwz3.f191635a |= 1;
                    ciwz3.f191636b = a5;
                    ciwz ciwz4 = (ciwz) da2.mo74062i();
                    cixb cixb = ciwq2.f191608a;
                    bxvd bxvd = (bxvd) cixb.mo74142c(5);
                    bxvd.mo73625a((GeneratedMessageLite) cixb);
                    ciww ciww = (ciww) bxvd;
                    if (ciww.f164950c) {
                        ciww.mo74035c();
                        ciww.f164950c = false;
                    }
                    cixb cixb2 = (cixb) ciww.f164949b;
                    cixb cixb3 = cixb.f191646m;
                    ciwz4.getClass();
                    cixb2.mo86621c();
                    cixb2.f191655h.add(ciwz4);
                    ciwq2.f191608a = (cixb) ciww.mo74062i();
                    if (ciwq2.f191608a.f191655h.size() > 5) {
                        cixb cixb4 = ciwq2.f191608a;
                        bxvd bxvd2 = (bxvd) cixb4.mo74142c(5);
                        bxvd2.mo73625a((GeneratedMessageLite) cixb4);
                        ciww ciww2 = (ciww) bxvd2;
                        if (ciww2.f164950c) {
                            ciww2.mo74035c();
                            ciww2.f164950c = false;
                        }
                        cixb cixb5 = (cixb) ciww2.f164949b;
                        cixb5.mo86621c();
                        cixb5.f191655h.remove(0);
                        ciwq2.f191608a = (cixb) ciww2.mo74062i();
                    }
                    int max = Math.max(ciwq.mo86616e().f191591b - 1, 0);
                    cixb cixb6 = ciwq2.f191608a;
                    bxvd bxvd3 = (bxvd) cixb6.mo74142c(5);
                    bxvd3.mo73625a((GeneratedMessageLite) cixb6);
                    ciww ciww3 = (ciww) bxvd3;
                    if (ciww3.f164950c) {
                        ciww3.mo74035c();
                        ciww3.f164950c = false;
                    }
                    cixb cixb7 = (cixb) ciww3.f164949b;
                    cixb7.f191648a |= 16;
                    cixb7.f191653f = max;
                    ciwq2.f191608a = (cixb) ciww3.mo74062i();
                    ciwq2.mo86610a(a2, (ciwh) a3.f191670b);
                    ciwh = (ciwh) a.f191670b;
                } else {
                    ciwz ciwz5 = (ciwz) ciwq2.mo86609a(civs).f191669a;
                    if (ciwz5 != null) {
                        civw a6 = civw.m151056a(ciwq.mo86613b());
                        ciwx ciwx3 = ciwz5.f191638d;
                        if (ciwx3 == null) {
                            ciwx3 = ciwx.f191621d;
                        }
                        byte[] k = ciwx3.f191625c.getKey();
                        ciwx ciwx4 = ciwz5.f191638d;
                        if (ciwx4 == null) {
                            ciwx4 = ciwx.f191621d;
                        }
                        ciwh = new ciwh(a6, k, ciwx4.f191624b);
                    } else {
                        ciwh = null;
                    }
                }
                int i5 = ciwh.f191591b;
                if (i5 > i2) {
                    ciwz ciwz6 = (ciwz) ciwq2.mo86609a(civs).f191669a;
                    if (ciwz6 != null) {
                        bxwc bxwc = ciwz6.f191639e;
                        int size = bxwc.size();
                        int i6 = 0;
                        while (i6 < size) {
                            int i7 = i6 + 1;
                            if (((ciwy) bxwc.get(i6)).f191629b == i2) {
                                cixf a7 = ciwq2.mo86609a(civs);
                                ciwz ciwz7 = (ciwz) a7.f191669a;
                                if (ciwz7 != null) {
                                    LinkedList linkedList = new LinkedList(ciwz7.f191639e);
                                    Iterator it = linkedList.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            ciwi = null;
                                            break;
                                        }
                                        ciwy ciwy = (ciwy) it.next();
                                        if (ciwy.f191629b == i2) {
                                            ciwi = new ciwi(new SecretKeySpec(ciwy.f191630c.getKey(), "AES"), new SecretKeySpec(ciwy.f191631d.getKey(), "HmacSHA256"), new IvParameterSpec(ciwy.f191632e.getKey()), ciwy.f191629b);
                                            it.remove();
                                            break;
                                        }
                                    }
                                    bxvd bxvd4 = (bxvd) ciwz7.mo74142c(5);
                                    bxvd4.mo73625a((GeneratedMessageLite) ciwz7);
                                    if (bxvd4.f164950c) {
                                        bxvd4.mo74035c();
                                        bxvd4.f164950c = false;
                                    }
                                    ((ciwz) bxvd4.f164949b).f191639e = GeneratedMessageLite.m124030de();
                                    if (bxvd4.f164950c) {
                                        bxvd4.mo74035c();
                                        bxvd4.f164950c = false;
                                    }
                                    ciwz ciwz8 = (ciwz) bxvd4.f164949b;
                                    ciwz8.mo86620c();
                                    bxsy.m123078a(linkedList, ciwz8.f191639e);
                                    cixb cixb8 = ciwq2.f191608a;
                                    bxvd bxvd5 = (bxvd) cixb8.mo74142c(5);
                                    bxvd5.mo73625a((GeneratedMessageLite) cixb8);
                                    ciww ciww4 = (ciww) bxvd5;
                                    ciww4.mo86619a(((Integer) a7.f191670b).intValue(), (ciwz) bxvd4.mo74062i());
                                    ciwq2.f191608a = (cixb) ciww4.mo74062i();
                                } else {
                                    ciwi = null;
                                }
                            } else {
                                i6 = i7;
                            }
                        }
                    }
                    int i8 = ciwh.f191591b;
                    StringBuilder sb = new StringBuilder(60);
                    sb.append("Received message with old counter: ");
                    sb.append(i8);
                    sb.append(" , ");
                    sb.append(i2);
                    throw new civd(sb.toString());
                } else if (i2 - i5 <= 2000) {
                    while (ciwh.f191591b < i2) {
                        ciwi b = ciwh.mo86605b();
                        cixf a8 = ciwq2.mo86609a(civs);
                        ciwz ciwz9 = (ciwz) a8.f191669a;
                        bxvd da3 = ciwy.f191626f.mo74144da();
                        ByteString a9 = ByteString.m123261a(b.f191593a.getEncoded());
                        if (da3.f164950c) {
                            da3.mo74035c();
                            da3.f164950c = false;
                        }
                        ciwy ciwy2 = (ciwy) da3.f164949b;
                        a9.getClass();
                        ciwy2.f191628a |= 2;
                        ciwy2.f191630c = a9;
                        ByteString a10 = ByteString.m123261a(b.f191594b.getEncoded());
                        if (da3.f164950c) {
                            da3.mo74035c();
                            da3.f164950c = false;
                        }
                        ciwy ciwy3 = (ciwy) da3.f164949b;
                        a10.getClass();
                        int i9 = ciwy3.f191628a | 4;
                        ciwy3.f191628a = i9;
                        ciwy3.f191631d = a10;
                        int i10 = b.f191596d;
                        ciwy3.f191628a = i9 | 1;
                        ciwy3.f191629b = i10;
                        ByteString a11 = ByteString.m123261a(b.f191595c.getIV());
                        if (da3.f164950c) {
                            da3.mo74035c();
                            da3.f164950c = false;
                        }
                        ciwy ciwy4 = (ciwy) da3.f164949b;
                        a11.getClass();
                        ciwy4.f191628a |= 8;
                        ciwy4.f191632e = a11;
                        ciwy ciwy5 = (ciwy) da3.mo74062i();
                        bxvd bxvd6 = (bxvd) ciwz9.mo74142c(5);
                        bxvd6.mo73625a((GeneratedMessageLite) ciwz9);
                        if (bxvd6.f164950c) {
                            bxvd6.mo74035c();
                            bxvd6.f164950c = false;
                        }
                        ciwz ciwz10 = (ciwz) bxvd6.f164949b;
                        ciwz ciwz11 = ciwz.f191633f;
                        ciwy5.getClass();
                        ciwz10.mo86620c();
                        ciwz10.f191639e.add(ciwy5);
                        if (((ciwz) bxvd6.f164949b).f191639e.size() > 2000) {
                            if (bxvd6.f164950c) {
                                bxvd6.mo74035c();
                                bxvd6.f164950c = false;
                            }
                            ciwz ciwz12 = (ciwz) bxvd6.f164949b;
                            ciwz12.mo86620c();
                            ciwz12.f191639e.remove(0);
                        }
                        cixb cixb9 = ciwq2.f191608a;
                        bxvd bxvd7 = (bxvd) cixb9.mo74142c(5);
                        bxvd7.mo73625a((GeneratedMessageLite) cixb9);
                        ciww ciww5 = (ciww) bxvd7;
                        ciww5.mo86619a(((Integer) a8.f191670b).intValue(), (ciwz) bxvd6.mo74062i());
                        ciwq2.f191608a = (cixb) ciww5.mo74062i();
                        ciwh = ciwh.mo86604a();
                    }
                    ciwh a12 = ciwh.mo86604a();
                    cixf a13 = ciwq2.mo86609a(civs);
                    ciwz ciwz13 = (ciwz) a13.f191669a;
                    bxvd da4 = ciwx.f191621d.mo74144da();
                    ByteString a14 = ByteString.m123261a(a12.f191590a);
                    if (da4.f164950c) {
                        da4.mo74035c();
                        da4.f164950c = false;
                    }
                    ciwx ciwx5 = (ciwx) da4.f164949b;
                    a14.getClass();
                    int i11 = 2 | ciwx5.f191623a;
                    ciwx5.f191623a = i11;
                    ciwx5.f191625c = a14;
                    int i12 = a12.f191591b;
                    ciwx5.f191623a = i11 | 1;
                    ciwx5.f191624b = i12;
                    ciwx ciwx6 = (ciwx) da4.mo74062i();
                    bxvd bxvd8 = (bxvd) ciwz13.mo74142c(5);
                    bxvd8.mo73625a((GeneratedMessageLite) ciwz13);
                    if (bxvd8.f164950c) {
                        bxvd8.mo74035c();
                        bxvd8.f164950c = false;
                    }
                    ciwz ciwz14 = (ciwz) bxvd8.f164949b;
                    ciwz ciwz15 = ciwz.f191633f;
                    ciwx6.getClass();
                    ciwz14.f191638d = ciwx6;
                    ciwz14.f191635a |= 4;
                    cixb cixb10 = ciwq2.f191608a;
                    bxvd bxvd9 = (bxvd) cixb10.mo74142c(5);
                    bxvd9.mo73625a((GeneratedMessageLite) cixb10);
                    ciww ciww6 = (ciww) bxvd9;
                    ciww6.mo86619a(((Integer) a13.f191670b).intValue(), (ciwz) bxvd8.mo74062i());
                    ciwq2.f191608a = (cixb) ciww6.mo74062i();
                    ciwi = ciwh.mo86605b();
                } else {
                    throw new civi("Over 2000 messages into the future!");
                }
                cive c = ciwq.mo86614c();
                cive d = ciwq.mo86615d();
                SecretKeySpec secretKeySpec = ciwi.f191594b;
                byte[] bArr = ciwc2.f191558d;
                byte[][] a15 = cixd.m151109a(bArr, bArr.length - 8, 8);
                if (MessageDigest.isEqual(ciwc.m151069a(i, c, d, secretKeySpec, a15[0]), a15[1])) {
                    byte[] b2 = m151048b(i, ciwi, ciwc2.f191557c);
                    cixb cixb11 = ciwq2.f191608a;
                    bxvd bxvd10 = (bxvd) cixb11.mo74142c(5);
                    bxvd10.mo73625a((GeneratedMessageLite) cixb11);
                    ciww ciww7 = (ciww) bxvd10;
                    if (ciww7.f164950c) {
                        ciww7.mo74035c();
                        ciww7.f164950c = false;
                    }
                    cixb cixb12 = (cixb) ciww7.f164949b;
                    cixb cixb13 = cixb.f191646m;
                    cixb12.f191656i = null;
                    cixb12.f191648a &= -129;
                    ciwq2.f191608a = (cixb) ciww7.mo74062i();
                    return b2;
                }
                throw new civi("Bad Mac!");
            } catch (civg e) {
                throw new civi(e);
            }
        } else {
            throw new civi(String.format("Message version %d, but session version %d", Integer.valueOf(ciwc2.f191555a), Integer.valueOf(ciwq.mo86613b())));
        }
    }

    /* renamed from: a */
    public final byte[] mo86591a(ciwo ciwo, ciwc ciwc) {
        byte[] a;
        synchronized (f191532a) {
            Iterator it = ciwo.f191603b.iterator();
            LinkedList linkedList = new LinkedList();
            try {
                ciwq ciwq = new ciwq(ciwo.f191602a);
                a = m151047a(ciwq, ciwc);
                ciwo.f191602a = ciwq;
            } catch (civi e) {
                linkedList.add(e);
                while (it.hasNext()) {
                    try {
                        ciwq ciwq2 = new ciwq((ciwq) it.next());
                        byte[] a2 = m151047a(ciwq2, ciwc);
                        it.remove();
                        ciwo.mo86608a(ciwq2);
                        return a2;
                    } catch (civi e2) {
                        linkedList.add(e2);
                    }
                }
                throw new civi("No valid sessions.", linkedList);
            }
        }
        return a;
    }
}
