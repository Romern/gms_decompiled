package p000;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* renamed from: bqol */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqol {
    static {
        Charset.forName("UTF-8");
    }

    /* renamed from: a */
    public static bqsl m113118a(bqsj bqsj) {
        bxvd da = bqsl.f141541c.mo74144da();
        int i = bqsj.f141533a;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((bqsl) da.f164949b).f141543a = i;
        bxwc bxwc = bqsj.f141534b;
        int size = bxwc.size();
        for (int i2 = 0; i2 < size; i2++) {
            bqsi bqsi = (bqsi) bxwc.get(i2);
            bxvd da2 = bqsk.f141535e.mo74144da();
            bqsd bqsd = bqsi.f141527a;
            if (bqsd == null) {
                bqsd = bqsd.f141509d;
            }
            String str = bqsd.f141511a;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            str.getClass();
            ((bqsk) da2.f164949b).f141537a = str;
            int b = bqse.m113312b(bqsi.f141528b);
            int i3 = 1;
            if (b == 0) {
                b = 1;
            }
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            ((bqsk) da2.f164949b).f141538b = bqse.m113311a(b);
            int b2 = bqsq.m113326b(bqsi.f141530d);
            if (b2 != 0) {
                i3 = b2;
            }
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            ((bqsk) da2.f164949b).f141540d = bqsq.m113325a(i3);
            int i4 = bqsi.f141529c;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            ((bqsk) da2.f164949b).f141539c = i4;
            bqsk bqsk = (bqsk) da2.mo74062i();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bqsl bqsl = (bqsl) da.f164949b;
            bqsk.getClass();
            if (!bqsl.f141544b.mo73666a()) {
                bqsl.f141544b = GeneratedMessageLite.m124021a(bqsl.f141544b);
            }
            bqsl.f141544b.add(bqsk);
        }
        return (bqsl) da.mo74062i();
    }

    /* renamed from: b */
    public static void m113120b(bqsj bqsj) {
        int i = bqsj.f141533a;
        bxwc bxwc = bqsj.f141534b;
        int size = bxwc.size();
        int i2 = 0;
        boolean z = false;
        boolean z2 = true;
        for (int i3 = 0; i3 < size; i3++) {
            bqsi bqsi = (bqsi) bxwc.get(i3);
            int b = bqse.m113312b(bqsi.f141528b);
            if (b != 0 && b == 3) {
                if (bqsi.f141527a != null) {
                    int b2 = bqsq.m113326b(bqsi.f141530d);
                    if (b2 != 0 && b2 == 2) {
                        throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(bqsi.f141529c)));
                    }
                    int b3 = bqse.m113312b(bqsi.f141528b);
                    if (b3 != 0 && b3 == 2) {
                        throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(bqsi.f141529c)));
                    }
                    if (bqsi.f141529c == i) {
                        if (!z) {
                            z = true;
                        } else {
                            throw new GeneralSecurityException("keyset contains multiple primary keys");
                        }
                    }
                    bqsd bqsd = bqsi.f141527a;
                    if (bqsd == null) {
                        bqsd = bqsd.f141509d;
                    }
                    int b4 = bqsc.m113309b(bqsd.f141513c);
                    if (b4 == 0 || b4 != 5) {
                        z2 = false;
                    }
                    i2++;
                } else {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(bqsi.f141529c)));
                }
            }
        }
        if (i2 == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        } else if (!z && !z2) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
    }

    /* renamed from: a */
    public static byte[] m113119a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }
}
