package p000;

import java.util.Arrays;

/* renamed from: ern */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ern {

    /* renamed from: a */
    public final String f15567a;

    /* renamed from: b */
    public final String f15568b;

    /* renamed from: c */
    public final bsxn f15569c;

    /* renamed from: d */
    public final boolean f15570d;

    /* renamed from: e */
    public final String f15571e;

    /* renamed from: f */
    public final epq f15572f;

    public ern(String str, String str2, bsxn bsxn, boolean z, String str3, epq epq) {
        this.f15567a = str;
        this.f15568b = str2;
        this.f15569c = bsxn;
        this.f15570d = z;
        this.f15572f = epq;
        this.f15571e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ern) {
            ern ern = (ern) obj;
            return this.f15570d == ern.f15570d && bmxi.m108538a(this.f15571e, ern.f15571e) && bmxi.m108538a(this.f15567a, ern.f15567a) && bmxi.m108538a(this.f15568b, ern.f15568b) && bmxi.m108538a(this.f15569c, ern.f15569c) && bmxi.m108538a(this.f15572f, ern.f15572f);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15567a, this.f15568b, this.f15569c, Boolean.valueOf(this.f15570d), this.f15571e, this.f15572f});
    }
}
