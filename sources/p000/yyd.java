package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: yyd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yyd {

    /* renamed from: a */
    private static final bmxr f54811a = bmxr.m108543a(':').mo66873a();

    /* renamed from: b */
    private static final bmyx f54812b = bmyx.m108640a(':');

    /* renamed from: c */
    private static final bnic f54813c = bnic.m109492a(745476177629L, 568316142586L, 840617513508L, 964061406556L);

    /* renamed from: a */
    public static bnic m44983a(Iterable iterable) {
        return bnic.m109488a(bnjd.m109575a(iterable, yyb.f54809a));
    }

    /* renamed from: b */
    public static bmxv m44989b(String str) {
        bngx d = m44994d(str);
        return d.size() >= 2 ? bmxv.m108566b((String) d.get(1)) : bmvz.f131120a;
    }

    /* renamed from: c */
    public static caae m44992c(String str) {
        caab caab = (caab) caae.f172323i.mo74144da();
        if (caab.f164950c) {
            caab.mo74035c();
            caab.f164950c = false;
        }
        caae caae = (caae) caab.f164949b;
        str.getClass();
        caae.f172325a |= 1;
        caae.f172326b = str;
        return (caae) caab.mo74062i();
    }

    /* renamed from: d */
    private static bngx m44994d(String str) {
        int indexOf = str.indexOf("<-");
        if (indexOf < 0) {
            return bngx.m109368a((Collection) f54812b.mo66925c((CharSequence) str));
        }
        int lastIndexOf = str.lastIndexOf(58, indexOf);
        bngs j = bngx.m109377j();
        j.mo67666b(f54812b.mo66918a((CharSequence) str.substring(0, lastIndexOf)));
        j.mo67668c(str.substring(lastIndexOf + 1));
        return j.mo67664a();
    }

    /* renamed from: a */
    public static caae m44984a(String str) {
        return m44985a(str, false);
    }

    /* renamed from: b */
    public static String m44990b(caae caae) {
        bzzz bzzz;
        String str;
        String str2;
        String str3;
        if ((caae.f172325a & 64) != 0) {
            bzzz = caae.f172332h;
            if (bzzz == null) {
                bzzz = bzzz.f172298f;
            }
        } else {
            bzzz = null;
        }
        bmxr bmxr = f54811a;
        caad a = caad.m126389a(caae.f172329e);
        if (a == null) {
            a = caad.RAW;
        }
        int ordinal = a.ordinal();
        if (ordinal == 0) {
            str = "r";
        } else if (ordinal == 1) {
            str = "d";
        } else if (ordinal == 2) {
            str = "c";
        } else if (ordinal == 3) {
            str = "v";
        } else {
            throw new AssertionError();
        }
        caah caah = caae.f172330f;
        if (caah == null) {
            caah = caah.f172333d;
        }
        String c = bzzn.m126367c(caah);
        Object[] objArr = new Object[3];
        String str4 = "";
        if (bzzz == null) {
            str2 = str4;
        } else {
            str2 = !bzzz.equals(yxy.f54800b) ? bzzz.f172301b : "gms";
        }
        objArr[0] = str2;
        if ((caae.f172325a & 32) != 0) {
            bmxr bmxr2 = f54811a;
            caaq caaq = caae.f172331g;
            if (caaq == null) {
                caaq = caaq.f172356h;
            }
            String str5 = caaq.f172362e;
            caaq caaq2 = caae.f172331g;
            if (caaq2 == null) {
                caaq2 = caaq.f172356h;
            }
            str3 = bmxr2.mo66875a(str5, caaq2.f172359b, new Object[0]);
        } else {
            str3 = str4;
        }
        objArr[1] = str3;
        if ((caae.f172325a & 4) != 0) {
            str4 = caae.f172328d;
        }
        objArr[2] = str4;
        return bmxr.mo66875a(str, c, objArr);
    }

    /* renamed from: a */
    public static caae m44985a(String str, boolean z) {
        bngx d = m44994d(str);
        yyc a = m44987a();
        a.mo30856a(caad.m126390a(((String) d.get(0)).toUpperCase(Locale.ROOT)));
        String str2 = (String) d.get(1);
        if (bzzn.m126366b(str2)) {
            a.mo30857a(bzzn.m126359a(str2));
        } else if (!z) {
            String valueOf = String.valueOf(str2);
            throw new IllegalArgumentException(valueOf.length() == 0 ? new String("DataType not found for ") : "DataType not found for ".concat(valueOf));
        } else {
            caag caag = (caag) caah.f172333d.mo74144da();
            if (caag.f164950c) {
                caag.mo74035c();
                caag.f164950c = false;
            }
            caah caah = (caah) caag.f164949b;
            str2.getClass();
            caah.f172335a |= 1;
            caah.f172336b = str2;
            a.mo30857a((caah) caag.mo74062i());
        }
        int size = d.size();
        if (d.size() == 4 || d.size() == 7) {
            bzzy bzzy = (bzzy) bzzz.f172298f.mo74144da();
            String str3 = (String) d.get(2);
            if (bzzy.f164950c) {
                bzzy.mo74035c();
                bzzy.f164950c = false;
            }
            bzzz bzzz = (bzzz) bzzy.f164949b;
            str3.getClass();
            bzzz.f172300a |= 1;
            bzzz.f172301b = str3;
            a.mo30855a((bzzz) bzzy.mo74062i());
        }
        if (size > 4) {
            int i = size - 4;
            String str4 = (String) d.get(i);
            String str5 = (String) d.get(i + 1);
            String str6 = (String) d.get(i + 2);
            bxvd da = caaq.f172356h.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            caaq caaq = (caaq) da.f164949b;
            str4.getClass();
            int i2 = caaq.f172358a | 16;
            caaq.f172358a = i2;
            caaq.f172363f = str4;
            str5.getClass();
            int i3 = i2 | 8;
            caaq.f172358a = i3;
            caaq.f172362e = str5;
            "".getClass();
            int i4 = 4 | i3;
            caaq.f172358a = i4;
            caaq.f172361d = "";
            str6.getClass();
            caaq.f172358a = 1 | i4;
            caaq.f172359b = str6;
            caap caap = caap.UNKNOWN;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            caaq caaq2 = (caaq) da.f164949b;
            caaq2.f172360c = caap.f172355h;
            int i5 = caaq2.f172358a | 2;
            caaq2.f172358a = i5;
            caaq2.f172364g = 0;
            caaq2.f172358a = i5 | 32;
            a.mo30858a((caaq) da.mo74062i());
        }
        a.mo30859a((String) d.get(size - 1));
        return a.mo30854a();
    }

    /* renamed from: c */
    public static yyc m44993c(caae caae) {
        return new yyc(caae);
    }

    /* renamed from: b */
    public static String m44991b(Iterable iterable) {
        StringBuilder sb = new StringBuilder();
        Iterator it = iterable.iterator();
        String str = "";
        while (it.hasNext()) {
            sb.append(str);
            sb.append(m44990b((caae) it.next()));
            str = ", ";
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static String m44986a(caae caae) {
        if ((caae.f172325a & 64) == 0) {
            return null;
        }
        bzzz bzzz = caae.f172332h;
        if (bzzz == null) {
            bzzz = bzzz.f172298f;
        }
        return bzzz.f172301b;
    }

    /* renamed from: a */
    public static yyc m44987a() {
        return new yyc();
    }

    /* renamed from: a */
    public static yyf m44988a(caaf caaf) {
        caad p = caaf.mo74589p();
        caah q = caaf.mo74590q();
        yye yye = new yye();
        if (p != null) {
            yye.f54814a = p;
            if (q != null) {
                yye.f54815b = q;
                if ((caaf.mo74593t().f172300a & 1) == 0) {
                    bxvw bxvw = caaf.mo74593t().f172303d;
                    int size = bxvw.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        }
                        Long l = (Long) bxvw.get(i);
                        i++;
                        if (!f54813c.contains(l)) {
                            yye.f54816c = l.toString();
                            break;
                        }
                    }
                } else {
                    yye.f54816c = caaf.mo74593t().f172301b;
                }
                if (caaf.mo74591r()) {
                    caaq s = caaf.mo74592s();
                    int i2 = s.f172358a;
                    if ((i2 & 16) != 0) {
                        yye.f54817d = s.f172363f;
                    }
                    if ((i2 & 8) != 0) {
                        yye.f54818e = s.f172362e;
                    }
                    if ((i2 & 1) != 0) {
                        yye.f54819f = s.f172359b;
                    }
                }
                if (caaf.mo74587n()) {
                    yye.f54820g = caaf.mo74588o();
                }
                return yye.mo30861a();
            }
            throw new NullPointerException("Null dataType");
        }
        throw new NullPointerException("Null type");
    }
}
