package p000;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: lzw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lzw {

    /* renamed from: a */
    public final String f33307a;

    /* renamed from: b */
    public final HashMap f33308b = new HashMap();

    /* renamed from: c */
    public boolean f33309c = false;

    public lzw(long j) {
        String valueOf = String.valueOf(Long.toString(j % 65536, 16));
        this.f33307a = valueOf.length() == 0 ? new String("_tmp_") : "_tmp_".concat(valueOf);
    }

    /* renamed from: a */
    public static void m24739a(ltq ltq) {
        if ((ltq.f32973a & 2) != 0) {
            int a = ltp.m24383a(ltq.f32974b);
            if (a == 0) {
                a = 1;
            }
            if (a == 1) {
                bxwc bxwc = ltq.f32977e;
                int size = bxwc.size();
                int i = 0;
                while (i < size) {
                    ltk ltk = (ltk) bxwc.get(i);
                    if ((ltk.f32949a & 16) != 0) {
                        int a2 = ltp.m24383a(ltk.f32954f);
                        if (a2 == 0) {
                            a2 = 1;
                        }
                        if (!(a2 == 1 || a2 == 4)) {
                            StringBuilder sb = new StringBuilder("server error in app ");
                            sb.append(ltk.f32950b);
                            sb.append(": code ");
                            sb.append((Object) ltp.m24384b(a2));
                            bxwc bxwc2 = ltk.f32955g;
                            int size2 = bxwc2.size();
                            for (int i2 = 0; i2 < size2; i2++) {
                                sb.append(": ");
                                sb.append((String) bxwc2.get(i2));
                            }
                            if (a2 == 7) {
                                throw new mbt(sb.toString());
                            } else if (a2 == 8) {
                                throw new mbk(sb.toString());
                            } else if (a2 == 2) {
                                throw new mbm();
                            } else if (!ccnr.m130891c()) {
                                throw new IOException(sb.toString());
                            } else if (a2 == 10) {
                                throw new mbs();
                            } else if (ccod.f179611a.mo6606a().mo76522b()) {
                                throw new IOException(sb.toString());
                            }
                        }
                        i++;
                    } else {
                        throw new IOException("Incomplete response application");
                    }
                }
                return;
            }
            throw new mbc("Server failed authorization.", a);
        }
        throw new IOException("Incomplete response");
    }

    /* renamed from: a */
    public final bxvd mo19795a() {
        bxvd da = lth.f32914q.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        lth lth = (lth) da.f164949b;
        lth.f32916a |= 64;
        lth.f32922g = 2;
        for (Map.Entry entry : this.f33308b.entrySet()) {
            lzv lzv = (lzv) entry.getValue();
            bxvd da2 = lsz.f32870k.mo74144da();
            String str = (String) entry.getKey();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            lsz lsz = (lsz) da2.f164949b;
            str.getClass();
            int i = lsz.f32872a | 1;
            lsz.f32872a = i;
            lsz.f32873b = str;
            String str2 = lzv.f33306d;
            if (str2 != null) {
                str2.getClass();
                lsz.f32872a = i | 2;
                lsz.f32874c = str2;
            }
            bxvd da3 = lsw.f32856c.mo74144da();
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            lsw lsw = (lsw) da3.f164949b;
            "_tmp_".getClass();
            lsw.f32858a |= 1;
            lsw.f32859b = "_tmp_";
            lsw lsw2 = (lsw) da3.mo74062i();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            lsz lsz2 = (lsz) da2.f164949b;
            lsw2.getClass();
            lsz2.mo19596a();
            lsz2.f32877f.add(lsw2);
            da.mo74059h(da2);
            lzv.f33303a.clear();
            lzv.f33304b.clear();
            lzv.f33305c.clear();
        }
        return da;
    }

    /* renamed from: a */
    public final lzv mo19796a(String str, String str2) {
        lzv lzv = (lzv) this.f33308b.get(str);
        if (lzv == null) {
            lzv = new lzv();
            this.f33308b.put(str, lzv);
        }
        String str3 = lzv.f33306d;
        if (str3 == null) {
            lzv.f33306d = str2;
        } else if (str2 != null && !str3.equals(str2)) {
            String str4 = lzv.f33306d;
            int length = String.valueOf(str).length();
            StringBuilder sb = new StringBuilder(length + 39 + String.valueOf(str4).length() + str2.length());
            sb.append("Different API keys for ");
            sb.append(str);
            sb.append(": was \"");
            sb.append(str4);
            sb.append("\", now \"");
            sb.append(str2);
            sb.append("\"");
            throw new IllegalArgumentException(sb.toString());
        }
        return lzv;
    }
}
