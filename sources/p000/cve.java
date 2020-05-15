package p000;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: cve */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cve {

    /* renamed from: a */
    private static final Map f12182a;

    static {
        List<Class> asList = Arrays.asList(cuz.class, cuw.class, cvf.class);
        HashMap hashMap = new HashMap(cuz.values().length + cuw.values().length + cvf.values().length);
        for (Class cls : asList) {
            for (Enum enumR : (Enum[]) cls.getEnumConstants()) {
                cvb cvb = (cvb) enumR;
                hashMap.put(cvz.m7704a(cvb.mo8320a()), cvb);
            }
        }
        f12182a = Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: a */
    public static cux m7663a(cuw cuw) {
        return new cvd(cuw, new cvc[0]);
    }

    /* renamed from: b */
    public static cvc[] m7669b(cvc[] cvcArr) {
        List asList = Arrays.asList(cvcArr);
        if (!asList.contains(null)) {
            return cvcArr;
        }
        ArrayList arrayList = new ArrayList(asList);
        arrayList.removeAll(Collections.singleton(null));
        return (cvc[]) arrayList.toArray(new cvc[arrayList.size()]);
    }

    /* renamed from: c */
    public static cvb m7671c(byte[] bArr) {
        int length = bArr.length;
        if (length == 0) {
            return null;
        }
        if (length == 2 && bArr[0] == 0) {
            bArr = new byte[]{bArr[1]};
        }
        cvb cvb = (cvb) f12182a.get(cvz.m7704a(bArr));
        return cvb == null ? new cuy(bArr) : cvb;
    }

    /* renamed from: a */
    public static cux m7664a(cvc[] cvcArr, cuw cuw) {
        for (cvc cvc : cvcArr) {
            if (cvc.mo8332e() == cuw) {
                return (cux) cvc;
            }
        }
        return m7663a(cuw);
    }

    /* renamed from: b */
    public static cvh[] m7670b(byte[] bArr) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            ArrayList arrayList = new ArrayList();
            while (byteArrayInputStream.available() > 0) {
                byte[] a = m7666a(byteArrayInputStream);
                arrayList.add(m7671c(a).mo8319a(cvz.m7702a(byteArrayInputStream)));
            }
            return (cvh[]) arrayList.toArray(new cvh[arrayList.size()]);
        } finally {
            byteArrayInputStream.close();
        }
    }

    /* renamed from: a */
    public static cvg m7665a(cvc[] cvcArr, cvf cvf) {
        for (cvc cvc : cvcArr) {
            if (cvc.mo8332e() == cvf) {
                return (cvg) cvc;
            }
        }
        return null;
    }

    /* renamed from: a */
    private static byte[] m7666a(ByteArrayInputStream byteArrayInputStream) {
        byte read = (byte) byteArrayInputStream.read();
        if ((read & 31) == 31) {
            return new byte[]{read, (byte) byteArrayInputStream.read()};
        }
        return new byte[]{read};
    }

    /* renamed from: a */
    public static byte[] m7667a(cvc[] cvcArr) {
        byte[][] bArr = new byte[cvcArr.length][];
        for (int i = 0; i < cvcArr.length; i++) {
            bArr[i] = cvcArr[i].mo8331d();
        }
        return cvz.m7723b(bArr);
    }

    /* renamed from: a */
    public static cvc[] m7668a(byte[] bArr) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            ArrayList arrayList = new ArrayList();
            while (byteArrayInputStream.available() > 0) {
                byte[] a = m7666a(byteArrayInputStream);
                byte[] bArr2 = new byte[cvz.m7702a(byteArrayInputStream)];
                byteArrayInputStream.read(bArr2);
                arrayList.add(m7671c(a).mo8318a(bArr2));
            }
            return (cvc[]) arrayList.toArray(new cvc[arrayList.size()]);
        } finally {
            byteArrayInputStream.close();
        }
    }
}
