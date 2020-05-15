package p000;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: ctc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ctc {

    /* renamed from: a */
    private static final Map f12005a;

    static {
        List<Class> asList = Arrays.asList(csx.class, csu.class, ctd.class);
        HashMap hashMap = new HashMap(csx.values().length + csu.values().length + ctd.values().length);
        for (Class cls : asList) {
            for (Enum enumR : (Enum[]) cls.getEnumConstants()) {
                csz csz = (csz) enumR;
                hashMap.put(czm.m8019b(csz.mo8234a()), csz);
            }
        }
        f12005a = Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: a */
    public static csv m7522a(csu csu) {
        return new ctb(csu, new cta[0]);
    }

    /* renamed from: b */
    public static ctf[] m7528b(byte[] bArr) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            ArrayList arrayList = new ArrayList();
            while (byteArrayInputStream.available() > 0) {
                byte[] a = m7526a(byteArrayInputStream);
                arrayList.add(m7529c(a).mo8233a(czm.m8007a(byteArrayInputStream)));
            }
            return (ctf[]) arrayList.toArray(new ctf[arrayList.size()]);
        } finally {
            byteArrayInputStream.close();
        }
    }

    /* renamed from: c */
    private static csz m7529c(byte[] bArr) {
        csz csz = (csz) f12005a.get(czm.m8019b(bArr));
        return csz == null ? new csw(bArr) : csz;
    }

    /* renamed from: a */
    public static csv m7523a(cta[] ctaArr, csu csu) {
        for (cta cta : ctaArr) {
            if (cta.mo8254e() == csu) {
                return (csv) cta;
            }
        }
        return m7522a(csu);
    }

    /* renamed from: a */
    public static csy m7524a(cta[] ctaArr, csx csx) {
        for (cta cta : ctaArr) {
            if (cta.mo8254e() == csx) {
                return (csy) cta;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static cte m7525a(cta[] ctaArr, ctd ctd) {
        for (cta cta : ctaArr) {
            if (cta.mo8254e() == ctd) {
                return (cte) cta;
            }
        }
        return null;
    }

    /* renamed from: a */
    private static byte[] m7526a(ByteArrayInputStream byteArrayInputStream) {
        byte read = (byte) byteArrayInputStream.read();
        if ((read & 31) == 31) {
            return new byte[]{read, (byte) byteArrayInputStream.read()};
        }
        return new byte[]{read};
    }

    /* renamed from: a */
    public static cta[] m7527a(byte[] bArr) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            ArrayList arrayList = new ArrayList();
            while (byteArrayInputStream.available() > 0) {
                byte[] a = m7526a(byteArrayInputStream);
                byte[] bArr2 = new byte[czm.m8007a(byteArrayInputStream)];
                byteArrayInputStream.read(bArr2);
                arrayList.add(m7529c(a).mo8232a(bArr2));
            }
            return (cta[]) arrayList.toArray(new cta[arrayList.size()]);
        } finally {
            byteArrayInputStream.close();
        }
    }
}
