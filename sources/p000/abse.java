package p000;

import java.io.File;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: abse */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class abse implements Iterator {

    /* renamed from: a */
    int f58096a = 0;

    /* renamed from: b */
    final /* synthetic */ absf f58097b;

    public abse(absf absf) {
        this.f58097b = absf;
    }

    /* renamed from: a */
    public final File next() {
        if (hasNext()) {
            absf absf = this.f58097b;
            String[] strArr = absf.f58099b;
            if (strArr != null) {
                int i = this.f58096a;
                String str = strArr[i];
                if (str != null) {
                    strArr[i] = null;
                    this.f58096a = i + 1;
                    return new File(absf.f58098a, str);
                }
                throw new NoSuchElementException();
            }
            throw new NoSuchElementException();
        }
        throw new NoSuchElementException();
    }

    public final boolean hasNext() {
        String[] strArr = this.f58097b.f58099b;
        return strArr != null && this.f58096a < strArr.length;
    }
}
