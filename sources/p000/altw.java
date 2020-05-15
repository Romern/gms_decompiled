package p000;

import java.util.Arrays;
import java.util.Map;

/* renamed from: altw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class altw implements alua {

    /* renamed from: a */
    private final String f74272a;

    /* renamed from: b */
    private final byte[] f74273b;

    public altw(String str, byte[] bArr) {
        this.f74272a = str;
        this.f74273b = bArr;
    }

    /* renamed from: a */
    public final int mo40779a() {
        return this.f74273b.length;
    }

    /* renamed from: b */
    public final String mo40781b() {
        return this.f74272a;
    }

    /* renamed from: a */
    public final byte[] mo40780a(int i) {
        if (i != Integer.MAX_VALUE) {
            byte[] bArr = this.f74273b;
            if (i < bArr.length) {
                return Arrays.copyOf(bArr, i);
            }
        }
        return this.f74273b;
    }

    /* renamed from: c */
    public final Map mo40782c() {
        return bnoj.f131912b;
    }
}
