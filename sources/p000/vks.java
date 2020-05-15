package p000;

import java.util.Arrays;

/* renamed from: vks */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vks {

    /* renamed from: a */
    public static final vks f49399a = new vks();

    /* renamed from: b */
    public final Integer f49400b;

    /* renamed from: c */
    public final Boolean f49401c;

    /* renamed from: d */
    public final Boolean f49402d;

    /* renamed from: e */
    public final Boolean f49403e;

    /* renamed from: f */
    private final Integer f49404f;

    private vks() {
        this.f49404f = null;
        this.f49400b = null;
        this.f49401c = null;
        this.f49402d = null;
        this.f49403e = null;
    }

    /* renamed from: a */
    public final String mo28592a() {
        Integer num = this.f49404f;
        if (num != null) {
            return Integer.toString(num.intValue());
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            vks vks = (vks) obj;
            return sdg.m34949a(this.f49404f, vks.f49404f) && sdg.m34949a(this.f49400b, vks.f49400b) && sdg.m34949a(this.f49401c, vks.f49401c) && sdg.m34949a(this.f49402d, vks.f49402d) && sdg.m34949a(this.f49403e, vks.f49403e);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f49404f, this.f49400b, this.f49401c, this.f49402d, this.f49403e});
    }

    public vks(int i, int i2, boolean z, boolean z2) {
        this.f49404f = Integer.valueOf(i);
        this.f49400b = Integer.valueOf(i2);
        this.f49401c = Boolean.valueOf(z);
        this.f49403e = Boolean.valueOf(z2);
        this.f49402d = false;
    }
}
