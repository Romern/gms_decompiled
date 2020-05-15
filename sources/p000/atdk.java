package p000;

import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: atdk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atdk implements atcv {

    /* renamed from: c */
    private static final srn f90121c = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: a */
    final atap f90122a;

    /* renamed from: b */
    int f90123b = -2;

    public atdk(ataq ataq) {
        bxvd bxvd = (bxvd) ataq.mo74142c(5);
        bxvd.mo73625a((bxvk) ataq);
        this.f90122a = (atap) bxvd;
    }

    /* renamed from: a */
    private static atco m75620a(Exception exc, int i) {
        return new atco(exc != null ? new atcn(i, exc) : new atcn(i));
    }

    /* renamed from: b */
    public final btjw mo49800b() {
        return btjw.f149188c;
    }

    /* renamed from: d */
    public final atcs mo49802d() {
        return new atcs(Long.MAX_VALUE, Long.MAX_VALUE);
    }

    /* renamed from: e */
    public final boolean mo49803e() {
        int size = ((ataq) this.f90122a.f164949b).f89967c.size();
        double b = cgxi.f187963a.mo6606a().mo84671b();
        int i = ((ataq) this.f90122a.f164949b).f89969e;
        double d = (double) size;
        Double.isNaN(d);
        return i > ((int) (d * b));
    }

    /* renamed from: f */
    public final boolean mo49804f() {
        return false;
    }

    /* renamed from: g */
    public final int mo49805g() {
        int i = this.f90123b;
        if (i != -2) {
            return i;
        }
        bmsy bmsy = ((ataq) this.f90122a.f164949b).f89966b;
        if (bmsy == null) {
            bmsy = bmsy.f130790d;
        }
        bmsw bmsw = bmsy.f130793b;
        if (bmsw == null) {
            bmsw = bmsw.f130761r;
        }
        bxwc bxwc = bmsw.f130779q;
        int size = bxwc.size();
        int i2 = 0;
        while (i2 < size) {
            try {
                byte[] h = assu.m74713a(((bmsv) bxwc.get(i2)).f130760c.mo73780k()).mo49448c().mo49438a(24360).mo49442h();
                if (h == null) {
                    i2++;
                } else {
                    int a = (int) asuv.m74875a(h);
                    this.f90123b = a;
                    return a;
                }
            } catch (NoSuchElementException e) {
            } catch (assv e2) {
                bnsl bnsl = (bnsl) f90121c.mo68388c();
                bnsl.mo68437a(e2);
                bnsl.mo68432a("atdk", "g", 272, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Error decoding record bytes when getting issuer country code");
            }
        }
        this.f90123b = -1;
        return -1;
    }

    /* renamed from: h */
    public final byte[] mo49806h() {
        return ((ataq) this.f90122a.mo74062i()).mo73642k();
    }

    /* renamed from: a */
    static atct m75621a(carq carq) {
        String str;
        byte[] bArr;
        byte b;
        try {
            byte[] bytes = carq.f175692a.getBytes(StandardCharsets.US_ASCII);
            byte[] bArr2 = carq.f175694c;
            if (bytes == null) {
                throw new capg("Pan is null");
            } else if (bArr2 != null) {
                int length = bytes.length;
                if (length < 9 || length > 19) {
                    throw new capg("Pan length should be in between 9 to 19");
                }
                int i = length & 1;
                if (i != 0) {
                    bArr = new byte[((length >> 1) + 1)];
                } else {
                    bArr = new byte[(length >> 1)];
                }
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    int length2 = bytes.length;
                    if (i2 >= length2) {
                        break;
                    }
                    byte b2 = (byte) ((bytes[i2] << 4) & 240);
                    if (i != 0) {
                        if (length2 - i2 == 1) {
                            b = (byte) (b2 | 15);
                            bArr[i3] = b;
                            i3++;
                            i2 += 2;
                        }
                    }
                    b = (byte) ((bytes[i2 + 1] & 15) | b2);
                    bArr[i3] = b;
                    i3++;
                    i2 += 2;
                }
                byte[] a = catg.m127160a(catg.m127164b(boan.f132470d.mo68796b(new String(bArr2, StandardCharsets.US_ASCII))));
                int length3 = bArr.length;
                int length4 = a.length;
                byte[] bArr3 = new byte[(length3 + length4)];
                System.arraycopy(bArr, 0, bArr3, 0, length3);
                System.arraycopy(a, 0, bArr3, length3, length4);
                str = asti.m74763b(caqx.m127000b(bArr3));
                byte[] b3 = boan.f132470d.mo68796b(new String(carq.f175694c, StandardCharsets.US_ASCII));
                String str2 = carq.f175692a;
                cate cate = carq.f175693b;
                return new atct(b3, str2, cate.f175819c, cate.f175817a + 2000, null, str);
            } else {
                throw new capg("Ucaf is null");
            }
        } catch (capg e) {
            bnsl bnsl = (bnsl) f90121c.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("atdk", "a", 397, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Transaction id generation failed");
            str = null;
        }
    }

    /* renamed from: a */
    private static caou m75622a(bmsz bmsz, boolean z) {
        return new atdj(z, bmsz);
    }

    /* renamed from: a */
    private static casa m75623a(bmsy bmsy) {
        bmsw bmsw = bmsy.f130793b;
        if (bmsw == null) {
            bmsw = bmsw.f130761r;
        }
        bmst bmst = bmsy.f130792a;
        if (bmst == null) {
            bmst = bmst.f130745c;
        }
        casd casd = new casd();
        casd.mo74808a(bmsw.f130777o.mo73780k(), bmsw.f130768f.mo73780k(), bmsw.f130764b, bmsw.f130765c.mo73780k(), bmsw.f130766d.mo73780k(), bmsw.f130778p.mo73780k(), bmsw.f130775m.mo73780k(), bmsw.f130767e.mo73780k(), bmsw.f130763a.mo73780k(), bmsw.f130774l.mo73780k());
        casd.mo74807a(bmst.f130748b.mo73780k(), bmst.f130747a.mo73780k());
        casd.mo74811b(bmsw.f130772j.mo73780k(), bmsw.f130773k.mo73780k(), bmsw.f130770h.mo73780k(), bmsw.f130771i.mo73780k(), bmsw.f130769g.mo73780k());
        bmsu bmsu = bmsw.f130776n;
        if (bmsu != null) {
            casd.mo74809a(bmsu.f130755e.mo73780k(), bmsu.f130754d.mo73780k(), bmsu.f130753c.mo73780k(), bmsu.f130751a.mo73780k(), bmsu.f130752b.mo73780k());
        }
        bxwc bxwc = bmsw.f130779q;
        int size = bxwc.size();
        for (int i = 0; i < size; i++) {
            bmsv bmsv = (bmsv) bxwc.get(i);
            casd.mo74806a(bmsv.f130759b.mo73780k()[0], bmsv.f130758a.mo73780k()[0], bmsv.f130760c.mo73780k());
        }
        bmsx bmsx = bmsy.f130794c;
        if (bmsx != null) {
            casd.mo74810a(bmsx.f130783b.mo73780k(), bmsx.f130789h.mo73780k(), bmsx.f130788g.mo73780k(), bmsx.f130785d.mo73780k(), bmsx.f130782a.mo73780k(), bmsx.f130784c.mo73780k(), bmsx.f130787f.mo73780k(), bmsx.f130786e.mo73780k());
        }
        return casd.mo74805a();
    }

    /* renamed from: a */
    private final void m75624a(asqs asqs, boolean z) {
        if (!(asqs instanceof asrh)) {
            bnsl bnsl = (bnsl) f90121c.mo68388c();
            bnsl.mo68432a("atdk", "a", 292, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Unexpected applet type: %s. Doing nothing.", asqs.getClass());
            return;
        }
        asrh asrh = (asrh) asqs;
        if (asrh.f89512e || z) {
            ataq ataq = (ataq) this.f90122a.f164949b;
            if (ataq.f89969e < ataq.f89967c.size()) {
                byte[] bArr = asrh.f89510c;
                atap atap = this.f90122a;
                if (Arrays.equals(bArr, atap.mo49766a(((ataq) atap.f164949b).f89969e).f130799c.mo73780k())) {
                    atap atap2 = this.f90122a;
                    int i = ((ataq) atap2.f164949b).f89969e + 1;
                    if (atap2.f164950c) {
                        atap2.mo74035c();
                        atap2.f164950c = false;
                    }
                    ataq ataq2 = (ataq) atap2.f164949b;
                    ataq ataq3 = ataq.f89963f;
                    ataq2.f89965a |= 2;
                    ataq2.f89969e = i;
                    m75625a(this.f90122a, 4, asrh.f89510c);
                } else {
                    bnsl bnsl2 = (bnsl) f90121c.mo68388c();
                    bnsl2.mo68432a("atdk", "a", 303, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl2.mo68405a("updateAfterTap: atc mismatch!");
                    return;
                }
            } else {
                bnsl bnsl3 = (bnsl) f90121c.mo68388c();
                bnsl3.mo68432a("atdk", "a", 298, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl3.mo68405a("updateAfterTap: no credentials!");
                return;
            }
        }
        asqs.mo49387b().f89415k = ((ataq) this.f90122a.f164949b).f89967c.size() - ((ataq) this.f90122a.f164949b).f89969e;
    }

    /* renamed from: a */
    public static final void m75625a(atap atap, int i, byte[] bArr) {
        int size = ((ataq) atap.f164949b).f89968d.size();
        btma[] btmaArr = new btma[(size + 1)];
        System.arraycopy(Collections.unmodifiableList(((ataq) atap.f164949b).f89968d).toArray(new btma[0]), 0, btmaArr, 0, size);
        bxvd da = btma.f149457d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((btma) da.f164949b).f149460b = btlz.m116911a(i);
        long currentTimeMillis = System.currentTimeMillis();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((btma) da.f164949b).f149461c = currentTimeMillis;
        short a = bqct.m112601a(bArr);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((btma) da.f164949b).f149459a = a;
        btmaArr[size] = (btma) da.mo74062i();
        if (atap.f164950c) {
            atap.mo74035c();
            atap.f164950c = false;
        }
        ataq ataq = ataq.f89963f;
        ((ataq) atap.f164949b).f89968d = bxvk.m124030de();
        List asList = Arrays.asList(btmaArr);
        if (atap.f164950c) {
            atap.mo74035c();
            atap.f164950c = false;
        }
        ataq ataq2 = (ataq) atap.f164949b;
        if (!ataq2.f89968d.mo73666a()) {
            ataq2.f89968d = bxvk.m124021a(ataq2.f89968d);
        }
        bxsy.m123078a(asList, ataq2.f89968d);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: atdk.a(bmsz, boolean):caou
     arg types: [bmsz, int]
     candidates:
      atdk.a(java.lang.Exception, int):atco
      atdk.a(asqs, boolean):void
      atdk.a(asqs, askf):void
      atcv.a(asqs, askf):void
      atdk.a(bmsz, boolean):caou */
    /* renamed from: a */
    public final asqs mo49793a(askf askf, asqq asqq, String str) {
        ataq ataq = (ataq) this.f90122a.f164949b;
        if (ataq.f89969e >= ataq.f89967c.size()) {
            return null;
        }
        bmsy bmsy = ((ataq) this.f90122a.f164949b).f89966b;
        if (bmsy == null) {
            bmsy = bmsy.f130790d;
        }
        casa a = m75623a(bmsy);
        atap atap = this.f90122a;
        asrh asrh = new asrh(a, m75622a(atap.mo49766a(((ataq) atap.f164949b).f89969e), true), asqq, bqcn.m112585b(cgxr.f187985a.mo6606a().mo84697i()), str);
        atap atap2 = this.f90122a;
        int i = ((ataq) atap2.f164949b).f89969e + 1;
        if (atap2.f164950c) {
            atap2.mo74035c();
            atap2.f164950c = false;
        }
        ataq ataq2 = (ataq) atap2.f164949b;
        ataq ataq3 = ataq.f89963f;
        ataq2.f89965a |= 2;
        ataq2.f89969e = i;
        return asrh;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: atdk.a(bmsz, boolean):caou
     arg types: [bmsz, int]
     candidates:
      atdk.a(java.lang.Exception, int):atco
      atdk.a(asqs, boolean):void
      atdk.a(asqs, askf):void
      atcv.a(asqs, askf):void
      atdk.a(bmsz, boolean):caou */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x015a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
        r2 = (p000.bnsl) p000.atdk.f90121c.mo68388c();
        r2.mo68437a(r0);
        r2.mo68432a("atdk", "a", 397, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        r2.mo68405a("Transaction id generation failed");
        r16 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x019c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01a2, code lost:
        return m75620a(r0, 0);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x019c A[ExcHandler: GeneralSecurityException (r0v19 'e' java.security.GeneralSecurityException A[CUSTOM_DECLARE]), Splitter:B:9:0x0058] */
    /* renamed from: a */
    public final atcq mo49795a(atcp atcp, askf askf, btiy btiy) {
        byte[] bArr;
        byte b;
        ataq ataq = (ataq) this.f90122a.f164949b;
        if (ataq.f89969e < ataq.f89967c.size()) {
            bmsy bmsy = ((ataq) this.f90122a.f164949b).f89966b;
            if (bmsy == null) {
                bmsy = bmsy.f130790d;
            }
            casa a = m75623a(bmsy);
            atap atap = this.f90122a;
            int i = 0;
            caou a2 = m75622a(atap.mo49766a(((ataq) atap.f164949b).f89969e), false);
            asrt asrt = new asrt(a2);
            caof a3 = caog.m126869a(a, asrt, asrt, asrt, asrt, null);
            try {
                a3.mo74718a();
                carp carp = new carp();
                carp.f175690b = 1;
                carp.f175689a = atcp.f90083a;
                try {
                    carr a4 = cars.m127065a(carp, a3);
                    int i2 = a4.f175696b;
                    int i3 = i2 - 1;
                    if (i3 == 0) {
                        m75625a(this.f90122a, 5, a2.mo49410c());
                        atap atap2 = this.f90122a;
                        int i4 = ((ataq) atap2.f164949b).f89969e + 1;
                        if (atap2.f164950c) {
                            atap2.mo74035c();
                            atap2.f164950c = false;
                        }
                        ataq ataq2 = (ataq) atap2.f164949b;
                        ataq ataq3 = ataq.f89963f;
                        ataq2.f89965a = 2 | ataq2.f89965a;
                        ataq2.f89969e = i4;
                        carq carq = a4.f175695a;
                        byte[] bytes = carq.f175692a.getBytes(StandardCharsets.US_ASCII);
                        byte[] bArr2 = carq.f175694c;
                        if (bytes == null) {
                            throw new capg("Pan is null");
                        } else if (bArr2 != null) {
                            int length = bytes.length;
                            if (length < 9 || length > 19) {
                                throw new capg("Pan length should be in between 9 to 19");
                            }
                            int i5 = length & 1;
                            if (i5 != 0) {
                                bArr = new byte[((length >> 1) + 1)];
                            } else {
                                bArr = new byte[(length >> 1)];
                            }
                            int i6 = 0;
                            int i7 = 0;
                            while (true) {
                                int length2 = bytes.length;
                                if (i6 >= length2) {
                                    break;
                                }
                                byte b2 = (byte) ((bytes[i6] << 4) & 240);
                                if (i5 != 0) {
                                    if (length2 - i6 == 1) {
                                        b = (byte) (b2 | 15);
                                        bArr[i7] = b;
                                        i7++;
                                        i6 += 2;
                                        i = 0;
                                    }
                                }
                                b = (byte) (b2 | (bytes[i6 + 1] & 15));
                                bArr[i7] = b;
                                i7++;
                                i6 += 2;
                                i = 0;
                            }
                            byte[] a5 = catg.m127160a(catg.m127164b(boan.f132470d.mo68796b(new String(bArr2, StandardCharsets.US_ASCII))));
                            int length3 = bArr.length;
                            int length4 = a5.length;
                            byte[] bArr3 = new byte[(length3 + length4)];
                            System.arraycopy(bArr, i, bArr3, i, length3);
                            System.arraycopy(a5, i, bArr3, length3, length4);
                            String str = asti.m74763b(caqx.m127000b(bArr3));
                            byte[] b3 = boan.f132470d.mo68796b(new String(carq.f175694c, StandardCharsets.US_ASCII));
                            String str2 = carq.f175692a;
                            cate cate = carq.f175693b;
                            return new atcm(new atct(b3, str2, cate.f175819c, cate.f175817a + 2000, null, str));
                        } else {
                            throw new capg("Ucaf is null");
                        }
                    } else if (i3 == 1) {
                        return m75620a((Exception) null, 0);
                    } else {
                        if (i3 == 3) {
                            return m75620a((Exception) null, 1);
                        }
                        if (i3 == 4) {
                            return m75620a((Exception) null, 3);
                        }
                        String a6 = cart.m127066a(i2);
                        StringBuilder sb = new StringBuilder(a6.length() + 24);
                        sb.append("Unexpected result code: ");
                        sb.append(a6);
                        throw new RuntimeException(sb.toString());
                    }
                } catch (GeneralSecurityException e) {
                } catch (capg e2) {
                    return m75620a(e2, 1);
                }
            } catch (capi e3) {
                return m75620a(e3, 2);
            }
        } else {
            bnsl bnsl = (bnsl) f90121c.mo68390d();
            bnsl.mo68432a("atdk", "a", 337, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("No more keys left");
            throw new atcr();
        }
    }

    /* renamed from: a */
    public final btmd mo49796a() {
        HashMap hashMap = new HashMap();
        for (btma btma : Collections.unmodifiableList(((ataq) this.f90122a.f164949b).f89968d)) {
            hashMap.put(Short.valueOf((short) btma.f149459a), btma);
        }
        int size = ((ataq) this.f90122a.f164949b).f89967c.size();
        btma[] btmaArr = new btma[size];
        for (int i = 0; i < size; i++) {
            short a = bqct.m112601a(this.f90122a.mo49766a(i).f130799c.mo73780k());
            btma btma2 = (btma) hashMap.get(Short.valueOf(a));
            if (btma2 == null) {
                if (i >= ((ataq) this.f90122a.f164949b).f89969e) {
                    bxvd da = btma.f149457d.mo74144da();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    btma btma3 = (btma) da.f164949b;
                    btma3.f149459a = a;
                    btma3.f149460b = btlz.m116911a(3);
                    btma2 = (btma) da.mo74062i();
                } else {
                    bxvd da2 = btma.f149457d.mo74144da();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    btma btma4 = (btma) da2.f164949b;
                    btma4.f149459a = a;
                    btma4.f149460b = btlz.m116911a(2);
                    btma2 = (btma) da2.mo74062i();
                }
            }
            btmaArr[i] = btma2;
        }
        bxvd da3 = btmd.f149473c.mo74144da();
        bxvd da4 = btmb.f149462b.mo74144da();
        List asList = Arrays.asList(btmaArr);
        if (da4.f164950c) {
            da4.mo74035c();
            da4.f164950c = false;
        }
        btmb btmb = (btmb) da4.f164949b;
        if (!btmb.f149464a.mo73666a()) {
            btmb.f149464a = bxvk.m124021a(btmb.f149464a);
        }
        bxsy.m123078a(asList, btmb.f149464a);
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        btmd btmd = (btmd) da3.f164949b;
        btmb btmb2 = (btmb) da4.mo74062i();
        btmb2.getClass();
        btmd.f149476b = btmb2;
        btmd.f149475a = 1;
        return (btmd) da3.mo74062i();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: atdk.a(asqs, boolean):void
     arg types: [asqs, int]
     candidates:
      atdk.a(java.lang.Exception, int):atco
      atdk.a(bmsz, boolean):caou
      atdk.a(asqs, askf):void
      atcv.a(asqs, askf):void
      atdk.a(asqs, boolean):void */
    /* renamed from: a */
    public final void mo49797a(asqs asqs) {
        m75624a(asqs, true);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: atdk.a(asqs, boolean):void
     arg types: [asqs, int]
     candidates:
      atdk.a(java.lang.Exception, int):atco
      atdk.a(bmsz, boolean):caou
      atdk.a(asqs, askf):void
      atcv.a(asqs, askf):void
      atdk.a(asqs, boolean):void */
    /* renamed from: a */
    public final void mo49798a(asqs asqs, askf askf) {
        m75624a(asqs, false);
    }
}
