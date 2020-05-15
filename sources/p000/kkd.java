package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: kkd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class kkd implements Iterator {

    /* renamed from: a */
    private kom f24297a;

    /* renamed from: b */
    private final int f24298b;

    /* renamed from: c */
    private int f24299c = 0;

    public kkd(kom kom, int i) {
        this.f24297a = kom;
        this.f24298b = i;
    }

    /* renamed from: a */
    public final kom next() {
        kom kom = this.f24297a;
        if (kom != null) {
            int i = this.f24299c + 1;
            this.f24299c = i;
            if (i <= this.f24298b) {
                this.f24297a = (kom) kom.f24625x.mo66815c();
            } else {
                this.f24297a = null;
            }
            return kom;
        }
        throw new NoSuchElementException();
    }

    public final boolean hasNext() {
        return this.f24297a != null;
    }
}
