package p000;

import java.util.Arrays;
import java.util.Locale;

/* renamed from: asss */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asss extends assu {

    /* renamed from: a */
    public final byte[] f89615a;

    /* renamed from: c */
    private final int f89616c;

    private asss(int i, byte[] bArr) {
        super(i);
        this.f89616c = bArr.length;
        this.f89615a = bArr;
        if (m74716b(i)) {
            throw new assx(i);
        }
    }

    /* renamed from: a */
    public static asss m74706a(int i, int i2, byte[] bArr, int i3) {
        int i4 = i3 + i2;
        int length = bArr.length;
        if (i4 <= length) {
            return new asss(i, Arrays.copyOfRange(bArr, i3, i4));
        }
        throw new assy(i2, length - i3);
    }

    /* renamed from: a */
    public final int mo49436a() {
        return this.f89616c;
    }

    /* renamed from: h */
    public final byte[] mo49442h() {
        return this.f89615a;
    }

    public final String toString() {
        String upperCase = bmxr.m108544a(",").mo66876a((Object[]) new String[]{mo49450e(), Integer.toHexString(this.f89616c), asti.m74760a(this.f89615a)}).toUpperCase(Locale.US);
        StringBuilder sb = new StringBuilder(String.valueOf(upperCase).length() + 2);
        sb.append("(");
        sb.append(upperCase);
        sb.append(")");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo49437a(byte[] bArr, int i) {
        int i2 = this.f89616c;
        System.arraycopy(this.f89615a, 0, bArr, i, i2);
        return i + i2;
    }
}
