package p000;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* renamed from: cax */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cax {
    static {
        citv.m151011a(cax.class);
    }

    /* renamed from: a */
    public static Map m3864a(byte[] bArr, bze... bzeArr) {
        cbb.m3883b(bArr);
        cbb.m3883b(bzeArr);
        cbb.m3879a(bArr.length > 2);
        cbb.m3879a(true);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        HashMap hashMap = new HashMap(1);
        HashSet hashSet = new HashSet(Arrays.asList(bzeArr));
        while (true) {
            try {
                if (byteArrayInputStream.available() > 0) {
                    if (byteArrayInputStream.available() >= 2) {
                        byte read = (byte) byteArrayInputStream.read();
                        byte read2 = (byte) byteArrayInputStream.read();
                        bze bze = new bze(read, read2);
                        int a = bys.m3809a(byteArrayInputStream);
                        if (byteArrayInputStream.available() < a) {
                            String valueOf = String.valueOf(cbm.m3893a(new byte[]{read, read2}));
                            throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Parse exception, could not parse dgi data for tag ") : "Parse exception, could not parse dgi data for tag ".concat(valueOf));
                        }
                        byte[] bArr2 = new byte[a];
                        if (byteArrayInputStream.read(bArr2) == a) {
                            if (hashSet.remove(bze)) {
                                citu.m151010a(bze, bArr2);
                                hashMap.put(bze, bArr2);
                            }
                            if (hashSet.isEmpty()) {
                                break;
                            }
                        } else {
                            throw new IllegalArgumentException("Parse exception, could not parse dgi data");
                        }
                    } else {
                        throw new IllegalArgumentException("Parse exception, could not parse dgi tag");
                    }
                } else if (!hashSet.isEmpty()) {
                    citu.m151009a(hashSet);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return hashMap;
    }
}
