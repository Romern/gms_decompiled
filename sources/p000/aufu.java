package p000;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.CRC32;

/* renamed from: aufu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aufu {
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aufu.a(boolean, auff):aufq
     arg types: [int, auff]
     candidates:
      aufu.a(java.util.List, int):void
      aufu.a(boolean, auff):aufq */
    /* renamed from: a */
    public static final aufq m77002a(auff auff) {
        return m77003a(true, auff);
    }

    /* renamed from: a */
    public static final aufq m77003a(boolean z, auff auff) {
        bnwr bnwr;
        Object obj;
        boolean z2;
        String str;
        auff auff2 = auff;
        int i = 1;
        if ((auff2.f91648a & 128) != 0) {
            bxvd bxvd = (bxvd) auff2.mo74142c(5);
            bxvd.mo73625a((GeneratedMessageLite) auff2);
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            auff auff3 = (auff) bxvd.f164949b;
            auff auff4 = auff.f91640C;
            auff3.f91666s = null;
            int i2 = auff3.f91648a & -129;
            auff3.f91648a = i2;
            auff3.f91667t = null;
            auff3.f91648a = i2 & -257;
            byte[] k = ((auff) bxvd.mo74062i()).serializeToBytes();
            aufe aufe = auff2.f91666s;
            if (aufe == null) {
                aufe = aufe.f91636c;
            }
            if ((aufe.f91638a & 1) != 0) {
                aufe aufe2 = auff2.f91666s;
                if (aufe2 == null) {
                    aufe2 = aufe.f91636c;
                }
                long j = ((long) aufe2.f91639b) & 4294967295L;
                CRC32 crc32 = new CRC32();
                crc32.update(k);
                if (j != crc32.getValue()) {
                    long value = crc32.getValue();
                    StringBuilder sb = new StringBuilder(71);
                    sb.append("crc32 checksum ");
                    sb.append(value);
                    sb.append(" does not match ");
                    sb.append(j);
                    throw new IOException(sb.toString());
                }
            }
        }
        if ((auff2.f91648a & 512) == 0 && auff2.f91668u.size() <= 0 && auff2.f91669v.size() <= 0 && auff2.f91670w.size() <= 0 && auff2.f91671x.size() <= 0 && auff2.f91672y.size() <= 0 && auff2.f91673z.size() <= 0 && auff2.f91642A.size() <= 0 && auff2.f91643B.size() <= 0) {
            int i3 = auff2.f91648a;
            if ((i3 & 1024) == 0 && (i3 & 2048) == 0) {
                aufp aufp = new aufp(auff2.f91649b);
                aufp.f91702b = z;
                int i4 = auff2.f91650c;
                if (i4 < 0 || i4 > 100) {
                    StringBuilder sb2 = new StringBuilder(37);
                    sb2.append("min battery ");
                    sb2.append(i4);
                    sb2.append("% out of range");
                    throw new ParseException(sb2.toString(), 0);
                }
                double d = (double) i4;
                Double.isNaN(d);
                float f = (float) (d / 100.0d);
                try {
                    bmxy.m108588a(f >= 0.0f && f < 1.0f);
                    aufp.f91703c = f;
                    List a = m77004a(auff2.f91651d);
                    bmxy.m108581a(a);
                    aufp.f91704d = a;
                    List a2 = m77004a(auff2.f91652e);
                    bmxy.m108581a(a2);
                    aufp.f91705e = a2;
                    bxwc bxwc = auff2.f91653f;
                    m77005a(bxwc, 6);
                    bmxy.m108581a(bxwc);
                    aufp.f91706f = bxwc;
                    bxwc bxwc2 = auff2.f91654g;
                    m77005a(bxwc2, 6);
                    bmxy.m108581a(bxwc2);
                    aufp.f91707g = bxwc2;
                    bxwc bxwc3 = auff2.f91655h;
                    m77005a(bxwc3, 6);
                    bmxy.m108581a(bxwc3);
                    aufp.f91708h = bxwc3;
                    bxwc bxwc4 = auff2.f91656i;
                    m77005a(bxwc4, 6);
                    bmxy.m108581a(bxwc4);
                    aufp.f91709i = bxwc4;
                    bxwc bxwc5 = auff2.f91657j;
                    m77005a(bxwc5, 15);
                    bmxy.m108581a(bxwc5);
                    aufp.f91710j = bxwc5;
                    bxwc bxwc6 = auff2.f91658k;
                    m77005a(bxwc6, 15);
                    bmxy.m108581a(bxwc6);
                    aufp.f91711k = bxwc6;
                    aufh aufh = auff2.f91659l;
                    if (aufh == null) {
                        aufh = aufh.f91678c;
                    }
                    bsam bsam = aufh.f91681b;
                    if (bsam == null) {
                        bsam = bsam.f143872d;
                    }
                    if ((bsam.f143874a & 1) == 0) {
                        ArrayList arrayList = new ArrayList(bsam.f143875b.size());
                        for (bsan bsan : bsam.f143875b) {
                            ArrayList a3 = bnkn.m109662a(bsan.f143880a.size());
                            for (bsal bsal : bsan.f143880a) {
                                a3.add(new bnwc(bnvn.m110522a(bsal.f143869b), bnvn.m110522a(bsal.f143870c)).mo68618e());
                            }
                            arrayList.add(new bnwi(a3));
                        }
                        bnwr = new bnwr(arrayList);
                    } else {
                        bnwr = bnwr.m110676a(new ByteArrayInputStream(bsam.f143876c.getKey()));
                    }
                    aufr aufr = new aufr(bnwr);
                    bmxy.m108581a(aufr);
                    aufp.f91712l = aufr;
                    float f2 = auff2.f91660m;
                    if (f2 < 0.0f || f2 > 1.0f) {
                        StringBuilder sb3 = new StringBuilder(39);
                        sb3.append("percentage ");
                        sb3.append(f2);
                        sb3.append(" out of range");
                        throw new ParseException(sb3.toString(), 0);
                    }
                    bmxy.m108588a(f2 > 0.0f && f2 < 1.0f);
                    aufp.f91713m = f2;
                    aufp.f91714n = auff2.f91661n;
                    aufp.f91715o = auff2.f91662o;
                    bxvw bxvw = auff2.f91663p;
                    bmxy.m108581a(bxvw);
                    aufp.f91716p = bxvw;
                    long j2 = auff2.f91664q;
                    bmxy.m108588a(j2 >= 0);
                    aufp.f91717q = j2;
                    bxwc bxwc7 = auff2.f91665r;
                    bngs b = bngx.m109371b(bxwc7.size());
                    int size = bxwc7.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        aufk aufk = (aufk) bxwc7.get(i5);
                        int a4 = aufj.m76984a(aufk.f91687b);
                        if (a4 == 0) {
                            a4 = 1;
                        }
                        int i6 = a4 - 1;
                        if (i6 == 1) {
                            obj = augu.m77041a(aufk);
                        } else if (i6 == 2 || i6 == 3) {
                            obj = augm.m77028a(aufk);
                        } else if (i6 != 4) {
                            int a5 = aufj.m76984a(aufk.f91687b);
                            if (a5 != 0) {
                                i = a5;
                            }
                            String valueOf = String.valueOf(Integer.toString(i - 1));
                            StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf).length() + 18);
                            sb4.append("unknown reporter: ");
                            sb4.append(valueOf);
                            throw new ParseException(sb4.toString(), 0);
                        } else {
                            int i7 = augn.f91778d;
                            int a6 = aufj.m76984a(aufk.f91687b);
                            if (a6 == 0) {
                                z2 = false;
                            } else {
                                z2 = a6 == 5;
                            }
                            bmxy.m108588a(z2);
                            String str2 = aufk.f91689d;
                            if ((aufk.f91686a & 16) != 0) {
                                str = aufk.f91691f;
                            } else {
                                str = null;
                            }
                            obj = new augn(str2, str);
                        }
                        b.mo67668c(obj);
                    }
                    bngx a7 = b.mo67664a();
                    bmxy.m108581a(a7);
                    aufp.f91718r = a7;
                    return new aufq(aufp.f91701a, aufp.f91702b, aufp.f91703c, aufp.f91704d, aufp.f91705e, aufp.f91706f, aufp.f91707g, aufp.f91708h, aufp.f91709i, aufp.f91710j, aufp.f91711k, aufp.f91712l, aufp.f91713m, aufp.f91714n, aufp.f91715o, aufp.f91716p, aufp.f91717q, aufp.f91718r);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (IllegalArgumentException e2) {
                    throw new IOException(e2);
                }
            }
        }
        throw new IOException("contains deprecated parameters");
    }

    /* renamed from: a */
    private static List m77004a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(auho.m77073b((String) list.get(i)));
        }
        return arrayList;
    }

    /* renamed from: a */
    private static void m77005a(List list, int i) {
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            String str = (String) list.get(i2);
            try {
                if (str.length() <= i) {
                    i2++;
                    if (Long.parseLong(str) < 0) {
                        throw new NumberFormatException("illegal negative prefix");
                    }
                } else {
                    StringBuilder sb = new StringBuilder(38);
                    sb.append("illegal prefix longer than ");
                    sb.append(i);
                    throw new NumberFormatException(sb.toString());
                }
            } catch (NumberFormatException e) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 13);
                sb2.append("bad prefix \"");
                sb2.append(str);
                sb2.append("\"");
                ParseException parseException = new ParseException(sb2.toString(), 0);
                parseException.initCause(e);
                throw parseException;
            }
        }
    }
}
