package p000;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: asrk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asrk implements carn, caoy, caov, Ccase, casf {

    /* renamed from: b */
    private static final srn f89521b = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: e */
    private static final List f89522e = Arrays.asList(250, 254, 258, 312, 474, 175, 638, 652, 663);

    /* renamed from: a */
    public final asri f89523a;

    /* renamed from: c */
    private final asqq f89524c;

    /* renamed from: d */
    private final caou f89525d;

    public asrk(asqq asqq, caou caou, asri asri) {
        this.f89524c = asqq;
        this.f89525d = caou;
        this.f89523a = asri;
    }

    /* renamed from: a */
    static String m74556a(caqu caqu, casa casa) {
        byte[] bArr;
        byte b;
        byte[] bArr2;
        caso caso = caqu.f175618e;
        if (caso != null) {
            cass a = caso.mo74823a();
            bnsl a2 = f89521b.mo26019b(aske.m74275a());
            a2.mo68432a("asrk", "a", 117, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            a2.mo68420a("terminal technology is: %s", a);
            if (a == null) {
                bnsl a3 = f89521b.mo26019b(aske.m74275a());
                a3.mo68432a("asrk", "a", 120, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                a3.mo68405a("Null terminal technology, cannot compute transaction id");
                return null;
            }
            int i = 0;
            if (a == cass.CONTACTLESS_MAGSTRIPE) {
                bnsl a4 = f89521b.mo26019b(aske.m74275a());
                a4.mo68432a("asrk", "a", 126, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                a4.mo68405a("Magstripe transaction");
                try {
                    byte[] bArr3 = caqu.f175616c;
                    byte[] a5 = asti.m74762a(new String(caqu.f175617d, StandardCharsets.UTF_8));
                    if (bArr3.length != 0) {
                        if (a5.length == 0) {
                            byte[] a6 = caqx.m126999a(bArr3);
                            bArr2 = new byte[32];
                            System.arraycopy(a6, 0, bArr2, 0, 16);
                        } else {
                            byte[] a7 = caqx.m126999a(bArr3);
                            byte[] a8 = caqx.m126999a(a5);
                            if (a7 == null) {
                                bArr2 = null;
                            } else if (a8 != null) {
                                int length = a7.length;
                                int length2 = a8.length;
                                byte[] bArr4 = new byte[(length + length2)];
                                System.arraycopy(a7, 0, bArr4, 0, length);
                                System.arraycopy(a8, 0, bArr4, length, length2);
                                bArr2 = bArr4;
                            } else {
                                bArr2 = null;
                            }
                        }
                    } else if (a5.length != 0) {
                        bArr2 = new byte[32];
                        System.arraycopy(caqx.m126999a(a5), 0, bArr2, 16, 16);
                    } else {
                        bArr2 = null;
                    }
                    return asti.m74760a(bArr2);
                } catch (capg | RuntimeException e) {
                    bnsl bnsl = (bnsl) f89521b.mo68387b();
                    bnsl.mo68437a(e);
                    bnsl.mo68432a("asrk", "a", 137, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("Transaction id exception");
                }
            } else {
                if (a == cass.CONTACTLESS_EMV) {
                    try {
                        byte[] bArr5 = caqu.f175614a;
                        byte[] bArr6 = caqu.f175615b;
                        byte[] a9 = m74557a(casa.f175729b.f175731b);
                        if (bArr5 != null) {
                            if (!(bArr6 == null || a9 == null)) {
                                String a10 = asti.m74760a(a9);
                                if (a10.endsWith("f")) {
                                    a10 = a10.substring(0, a10.length() - 1);
                                }
                                byte[] bytes = a10.getBytes(StandardCharsets.US_ASCII);
                                if (bytes != null) {
                                    int length3 = bytes.length;
                                    if (length3 < 9 || length3 > 19) {
                                        throw new capg("Pan length should be in between 9 to 19");
                                    }
                                    int i2 = length3 & 1;
                                    if (i2 != 0) {
                                        bArr = new byte[((length3 >> 1) + 1)];
                                    } else {
                                        bArr = new byte[(length3 >> 1)];
                                    }
                                    int i3 = 0;
                                    while (true) {
                                        int length4 = bytes.length;
                                        if (i >= length4) {
                                            LinkedList linkedList = new LinkedList();
                                            linkedList.add(bArr);
                                            linkedList.add(bArr5);
                                            linkedList.add(bArr6);
                                            return asti.m74760a(caqx.m127000b(catg.m127161a(linkedList)));
                                        }
                                        byte b2 = (byte) ((bytes[i] << 4) & 240);
                                        if (i2 != 0) {
                                            if (length4 - i == 1) {
                                                b = (byte) (b2 | 15);
                                                bArr[i3] = b;
                                                i3++;
                                                i += 2;
                                            }
                                        }
                                        b = (byte) ((bytes[i + 1] & 15) | b2);
                                        bArr[i3] = b;
                                        i3++;
                                        i += 2;
                                    }
                                } else {
                                    throw new capg("Pan is null");
                                }
                            }
                        }
                        bnsl a11 = f89521b.mo26019b(aske.m74275a());
                        a11.mo68432a("asrk", "a", 146, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        a11.mo68405a("atc, cryptogram, or pan is null, not computing transaction id");
                        return null;
                    } catch (capg | RuntimeException e2) {
                        bnsl bnsl2 = (bnsl) f89521b.mo68387b();
                        bnsl2.mo68437a(e2);
                        bnsl2.mo68432a("asrk", "a", 161, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl2.mo68405a("Transaction id exception");
                    }
                }
                return null;
            }
        } else {
            bnsl a12 = f89521b.mo26019b(aske.m74275a());
            a12.mo68432a("asrk", "a", 111, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            a12.mo68405a("Null terminal information, cannot compute transaction id");
            return null;
        }
    }

    /* renamed from: a */
    public final boolean mo49415a() {
        return true;
    }

    /* renamed from: a */
    public final boolean mo49416a(int i) {
        return i == 1 && this.f89525d != null;
    }

    /* renamed from: a */
    public final boolean mo49417a(int i, int i2) {
        return i2 != 1 || i == 2;
    }

    /* renamed from: b */
    public final boolean mo49418b() {
        return true;
    }

    /* renamed from: c */
    public final long mo49419c() {
        if (this.f89524c.mo49384c()) {
            return System.currentTimeMillis();
        }
        return 0;
    }

    /* renamed from: d */
    public final caou mo49420d() {
        return new asrj();
    }

    /* renamed from: e */
    public final boolean mo49421e() {
        return true;
    }

    /* renamed from: f */
    public final int mo49422f() {
        return 2;
    }

    /* renamed from: g */
    public final caou mo49423g() {
        this.f89523a.mo49402a();
        return this.f89525d;
    }

    /* renamed from: h */
    public final caou mo49424h() {
        this.f89523a.mo49402a();
        return this.f89525d;
    }

    /* renamed from: a */
    private static byte[] m74557a(carx[] carxArr) {
        int length = carxArr.length;
        int i = 0;
        while (i < length) {
            try {
                byte[] h = assu.m74713a(carxArr[i].f175717c).mo49448c().mo49438a(90).mo49442h();
                if (h != null) {
                    return h;
                }
                i++;
            } catch (NoSuchElementException e) {
            } catch (assv e2) {
                bnsl bnsl = (bnsl) f89521b.mo68388c();
                bnsl.mo68437a(e2);
                bnsl.mo68432a("asrk", "a", 184, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Error decoding record bytes when getting token pan");
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002f, code lost:
        if (r6.f89524c.mo49383b() == false) goto L_0x0031;
     */
    /* renamed from: a */
    public final casg mo49413a(casg casg, casy casy, caso caso) {
        boolean z;
        this.f89523a.mo49404a(caso, casy);
        boolean z2 = true;
        if (casg.f175749b != 1) {
            return casg;
        }
        int e = casy.mo74833e();
        if (e != 0) {
            if (e != 4) {
                if (!this.f89524c.mo49382a()) {
                    this.f89523a.mo49405b();
                } else if (casy.mo74831c()) {
                }
                return new casg(2, Collections.singletonList(cash.MISSING_CD_CVM));
            }
            if (!cgwn.f187872a.mo6606a().mo84632m()) {
                return casg;
            }
            boolean b = caso.mo74825b();
            byte[] a = caso.mo74824a("9F1A");
            if (a == null || a.length <= 0) {
                z = false;
            } else {
                try {
                    z = f89522e.contains(Integer.valueOf(Integer.parseInt(asti.m74760a(a))));
                } catch (NumberFormatException e2) {
                    z = false;
                }
            }
            if (casy.mo74829a() == null || !bmwb.m108443a(casy.mo74829a().getCurrencyCode(), "EUR")) {
                z2 = false;
            }
            return (!b || !z || !z2 || casy.mo74830b() <= 30.0d || this.f89524c.mo49383b()) ? casg : new casg(2, Collections.singletonList(cash.MISSING_CD_CVM));
        }
        throw null;
    }

    /* renamed from: a */
    public final void mo49414a(caqu caqu) {
        this.f89523a.mo49403a(caqu);
    }
}
