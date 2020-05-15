package p000;

import java.io.File;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: rcy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class rcy implements Iterator {

    /* renamed from: a */
    int f42685a = 0;

    /* renamed from: b */
    final /* synthetic */ rcz f42686b;

    public rcy(rcz rcz) {
        this.f42686b = rcz;
    }

    /* renamed from: a */
    public final File next() {
        if (hasNext()) {
            rcz rcz = this.f42686b;
            String[] strArr = rcz.f42688b;
            int i = this.f42685a;
            String str = strArr[i];
            strArr[i] = null;
            this.f42685a = i + 1;
            return new File(rcz.f42687a, str);
        }
        throw new NoSuchElementException();
    }

    public final boolean hasNext() {
        String[] strArr = this.f42686b.f42688b;
        return strArr != null && this.f42685a < strArr.length;
    }
}
