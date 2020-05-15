package p000;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/* renamed from: beij */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class beij {

    /* renamed from: a */
    public static final bznx f111582a;

    static {
        bxvd da = bznx.f170773c.mo74144da();
        bznu bznu = bznu.f170763a;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bznx bznx = (bznx) da.f164949b;
        bznu.getClass();
        bznx.f170776b = bznu;
        bznx.f170775a = 1;
        bznx bznx2 = (bznx) da.mo74062i();
        bxvd da2 = bznx.f170773c.mo74144da();
        bznv bznv = bznv.f170765c;
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bznx bznx3 = (bznx) da2.f164949b;
        bznv.getClass();
        bznx3.f170776b = bznv;
        bznx3.f170775a = 2;
        bznx bznx4 = (bznx) da2.mo74062i();
        bxvd da3 = bznx.f170773c.mo74144da();
        bznw bznw = bznw.f170769c;
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        bznx bznx5 = (bznx) da3.f164949b;
        bznw.getClass();
        bznx5.f170776b = bznw;
        bznx5.f170775a = 3;
        f111582a = (bznx) da3.mo74062i();
    }

    /* renamed from: a */
    public static String m95137a(bznx bznx) {
        int i;
        bznv bznv;
        bznw bznw;
        bznz bznz;
        int i2 = bznx.f170775a;
        if (i2 == 0) {
            i = 5;
        } else if (i2 != 1) {
            i = i2 != 2 ? i2 != 3 ? i2 != 4 ? 0 : 4 : 3 : 2;
        } else {
            i = 1;
        }
        int i3 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i3 == 0) {
            return "compress";
        } else {
            if (i3 == 1) {
                if (i2 == 2) {
                    bznv = (bznv) bznx.f170776b;
                } else {
                    bznv = bznv.f170765c;
                }
                if (bznv.f170767a != 1) {
                    return "encrypt";
                }
                String a = m95139a((String) bznv.f170768b);
                StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 21);
                sb.append("encrypt(aes_gcm_key=");
                sb.append(a);
                sb.append(")");
                return sb.toString();
            } else if (i3 == 2) {
                if (i2 == 3) {
                    bznw = (bznw) bznx.f170776b;
                } else {
                    bznw = bznw.f170769c;
                }
                if (bznw.f170771a != 1) {
                    return "integrity";
                }
                String a2 = m95139a((String) bznw.f170772b);
                StringBuilder sb2 = new StringBuilder(String.valueOf(a2).length() + 18);
                sb2.append("integrity(sha256=");
                sb2.append(a2);
                sb2.append(")");
                return sb2.toString();
            } else if (i3 == 3) {
                if (i2 == 4) {
                    bznz = (bznz) bznx.f170776b;
                } else {
                    bznz = bznz.f170780c;
                }
                if ((bznz.f170782a & 1) != 0) {
                    String a3 = m95139a(bznz.f170783b);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(a3).length() + 12);
                    sb3.append("zip(target=");
                    sb3.append(a3);
                    sb3.append(")");
                    return sb3.toString();
                }
                throw new IllegalArgumentException("zip transform requires target");
            } else {
                throw new IllegalArgumentException("No transform specified");
            }
        }
    }

    /* renamed from: a */
    public static String m95138a(bzny bzny) {
        bngs j = bngx.m109377j();
        bxwc bxwc = bzny.f170779a;
        int size = bxwc.size();
        for (int i = 0; i < size; i++) {
            j.mo67668c(m95137a((bznx) bxwc.get(i)));
        }
        return behf.m95043a(j.mo67664a());
    }

    /* renamed from: a */
    private static final String m95139a(String str) {
        try {
            return URLEncoder.encode(str, behb.f111555a.displayName());
        } catch (UnsupportedEncodingException e) {
            throw new IllegalStateException(e);
        }
    }
}
