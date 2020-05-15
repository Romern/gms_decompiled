package p000;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

/* renamed from: adla */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adla {
    /* renamed from: a */
    public static final int m50783a(String str) {
        if (str.startsWith("*.")) {
            str = str.substring(2);
        }
        return ByteBuffer.wrap(m50784a(str, -1)[0]).asIntBuffer().get(0) & -4096;
    }

    /* renamed from: a */
    public static byte[][] m50784a(String str, int i) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            ArrayList arrayList = new ArrayList();
            if (i <= 0) {
                arrayList.add(instance.digest(str.getBytes()));
            } else {
                int lastIndexOf = str.lastIndexOf(46, str.lastIndexOf(46) - 1);
                if (lastIndexOf < 0) {
                    arrayList.add(instance.digest(str.getBytes()));
                } else {
                    arrayList.add(instance.digest(str.substring(lastIndexOf + 1).getBytes()));
                    int i2 = 1;
                    while (lastIndexOf >= 0 && i2 < i) {
                        lastIndexOf = str.lastIndexOf(46, lastIndexOf - 1);
                        arrayList.add(instance.digest(str.substring(lastIndexOf + 1).getBytes()));
                        i2++;
                    }
                }
            }
            return (byte[][]) arrayList.toArray(new byte[arrayList.size()][]);
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("Could not find SHA-256 algorithm.", e);
        }
    }
}
