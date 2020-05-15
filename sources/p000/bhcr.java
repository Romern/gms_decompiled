package p000;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* renamed from: bhcr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhcr {
    /* renamed from: a */
    public static bsax m100642a(InputStream inputStream, bsaz bsaz) {
        bsax bsax = new bsax(bsaz);
        try {
            bsax.mo70109a(inputStream, Integer.MAX_VALUE);
            bsax.mo70120b();
            if (bsax.mo70112a()) {
                return bsax;
            }
            throw new IOException("Missing required field or has more than one value for no repeated field.");
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException("Runtime exception while parsing.");
        }
    }

    /* renamed from: a */
    public static List m100643a(bsax bsax, int i) {
        if (bsax == null) {
            return null;
        }
        int j = bsax.mo70138j(i);
        ArrayList arrayList = new ArrayList(j);
        for (int i2 = 0; i2 < j; i2++) {
            arrayList.add(bsax.mo70131f(i, i2));
        }
        return arrayList;
    }
}
