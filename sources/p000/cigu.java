package p000;

import java.util.List;
import java.util.logging.Logger;

/* renamed from: cigu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cigu {
    static {
        Logger.getLogger(cigu.class.getName());
    }

    private cigu() {
    }

    /* renamed from: a */
    public static byte[][] m150276a(List list) {
        int size = list.size();
        byte[][] bArr = new byte[(size + size)][];
        int size2 = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size2; i2++) {
            cihp cihp = (cihp) list.get(i2);
            int i3 = i + 1;
            bArr[i] = cihp.f190348f.mo86347f();
            i = i3 + 1;
            bArr[i3] = cihp.f190349g.mo86347f();
        }
        return cife.m150162a(bArr);
    }
}
