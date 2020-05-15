package p000;

import java.util.NoSuchElementException;

/* renamed from: bnjf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnjf extends bnrd {

    /* renamed from: a */
    int f131695a = 0;

    /* renamed from: b */
    final /* synthetic */ Object[] f131696b;

    public bnjf(Object[] objArr) {
        this.f131696b = objArr;
    }

    public final boolean hasNext() {
        return this.f131695a < 2;
    }

    public final Object next() {
        if (hasNext()) {
            Object[] objArr = this.f131696b;
            int i = this.f131695a;
            Object obj = objArr[i];
            objArr[i] = null;
            this.f131695a = i + 1;
            return obj;
        }
        throw new NoSuchElementException();
    }
}
