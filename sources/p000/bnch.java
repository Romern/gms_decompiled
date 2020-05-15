package p000;

import java.util.NoSuchElementException;

/* renamed from: bnch */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bnch extends bnrd {

    /* renamed from: a */
    private Object f131442a;

    /* renamed from: b */
    private int f131443b = 2;

    protected bnch() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo8969a();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final Object mo67118d() {
        this.f131443b = 3;
        return null;
    }

    public final boolean hasNext() {
        boolean z;
        if (this.f131443b != 4) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108600b(z);
        int i = this.f131443b;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i2 == 0) {
            return true;
        } else {
            if (i2 != 2) {
                this.f131443b = 4;
                this.f131442a = mo8969a();
                if (this.f131443b != 3) {
                    this.f131443b = 1;
                    return true;
                }
            }
            return false;
        }
    }

    public final Object next() {
        if (hasNext()) {
            this.f131443b = 2;
            Object obj = this.f131442a;
            this.f131442a = null;
            return obj;
        }
        throw new NoSuchElementException();
    }
}
