package p000;

import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: bnyk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnyk extends AbstractList implements RandomAccess, Serializable {
    private static final long serialVersionUID = 1;

    /* renamed from: a */
    private Object[][] f132372a;

    /* renamed from: b */
    private int f132373b;

    public bnyk(int i) {
        this.f132372a = new Object[((i >> 8) + 1)][];
    }

    public final boolean add(Object obj) {
        int i = this.f132373b >> 8;
        Object[][] objArr = this.f132372a;
        if (i == objArr.length) {
            objArr = (Object[][]) Arrays.copyOf(objArr, i + i);
            this.f132372a = objArr;
            objArr[i] = new Object[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
        } else if (objArr[i] == null) {
            objArr[i] = new Object[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
        }
        Object[] objArr2 = objArr[i];
        int i2 = this.f132373b;
        objArr2[i2 & 255] = obj;
        this.f132373b = i2 + 1;
        return true;
    }

    public final Object get(int i) {
        return this.f132372a[i >> 8][i & 255];
    }

    public final Object set(int i, Object obj) {
        Object[][] objArr = this.f132372a;
        Object[] objArr2 = objArr[i];
        objArr[i >> 8][i & 255] = obj;
        return objArr2;
    }

    public final int size() {
        return this.f132373b;
    }
}
