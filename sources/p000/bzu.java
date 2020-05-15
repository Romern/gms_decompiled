package p000;

import java.io.Serializable;
import java.util.Arrays;

/* renamed from: bzu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzu implements Serializable {

    /* renamed from: a */
    public final String f6273a;

    /* renamed from: b */
    public final byte[] f6274b;

    /* renamed from: c */
    public final int f6275c;

    /* renamed from: d */
    public final int f6276d;

    /* renamed from: e */
    public final int f6277e;

    /* renamed from: f */
    public final int f6278f;

    /* renamed from: g */
    private final String f6279g;

    /* renamed from: h */
    private final bzx f6280h;

    /* renamed from: i */
    private final int f6281i;

    /* renamed from: j */
    private final int f6282j;

    /* renamed from: k */
    private final int f6283k;

    /* renamed from: l */
    private final int f6284l;

    /* renamed from: m */
    private final int f6285m;

    public bzu(String str, String str2, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, bzx bzx, int i9) {
        this.f6273a = str;
        this.f6279g = str2;
        this.f6274b = bArr;
        this.f6275c = i;
        this.f6276d = i2;
        this.f6277e = i3;
        this.f6278f = i4;
        this.f6281i = i5;
        this.f6282j = i6;
        this.f6283k = i7;
        this.f6284l = i8;
        this.f6280h = bzx;
        this.f6285m = i9;
    }

    public final boolean equals(Object obj) {
        if (obj != null && getClass() == obj.getClass()) {
            bzu bzu = (bzu) obj;
            String str = this.f6273a;
            if (str == null ? bzu.f6273a != null : !str.equals(bzu.f6273a)) {
                return false;
            }
            String str2 = this.f6279g;
            if (str2 == null ? bzu.f6279g != null : !str2.equals(bzu.f6279g)) {
                return false;
            }
            if (Arrays.equals(this.f6274b, bzu.f6274b) && this.f6275c == bzu.f6275c && this.f6276d == bzu.f6276d && this.f6277e == bzu.f6277e && this.f6281i == bzu.f6281i && this.f6282j == bzu.f6282j && this.f6283k == bzu.f6283k && this.f6284l == bzu.f6284l && this.f6280h == bzu.f6280h && this.f6285m == bzu.f6285m) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        String str = this.f6273a;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = (i + 469) * 67;
        String str2 = this.f6279g;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int hashCode = (((((((((i4 + i2) * 67) + Arrays.hashCode(this.f6274b)) * 67) + this.f6275c) * 67) + this.f6276d) * 67) + this.f6277e) * 67;
        int i5 = this.f6278f;
        if (i5 == 0) {
            i5 = 0;
        }
        int i6 = (hashCode + i5) * 67;
        int i7 = this.f6281i;
        if (i7 == 0) {
            i7 = 0;
        }
        int i8 = (((i6 + i7) * 67) + 4) * 67;
        int i9 = this.f6282j;
        if (i9 == 0) {
            i9 = 0;
        }
        int i10 = (i8 + i9) * 67;
        int i11 = this.f6283k;
        if (i11 == 0) {
            i11 = 0;
        }
        int i12 = (i10 + i11) * 67;
        int i13 = this.f6284l;
        if (i13 == 0) {
            i13 = 0;
        }
        int i14 = (i12 + i13) * 67;
        bzx bzx = this.f6280h;
        if (bzx != null) {
            i3 = bzx.hashCode();
        }
        return i14 + i3;
    }
}
