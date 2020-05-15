package p000;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: bnjg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnjg extends bnrd {

    /* renamed from: a */
    final /* synthetic */ Iterator f131697a;

    /* renamed from: b */
    final /* synthetic */ int f131698b;

    public bnjg(Iterator it, int i) {
        this.f131697a = it;
        this.f131698b = i;
    }

    public final boolean hasNext() {
        return this.f131697a.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        if (hasNext()) {
            Object[] objArr = new Object[this.f131698b];
            int i = 0;
            while (i < this.f131698b && this.f131697a.hasNext()) {
                objArr[i] = this.f131697a.next();
                i++;
            }
            for (int i2 = i; i2 < this.f131698b; i2++) {
                objArr[i2] = null;
            }
            List unmodifiableList = Collections.unmodifiableList(Arrays.asList(objArr));
            return i != this.f131698b ? unmodifiableList.subList(0, i) : unmodifiableList;
        }
        throw new NoSuchElementException();
    }
}
