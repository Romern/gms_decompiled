package p000;

import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;

/* renamed from: aqeh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aqeh extends aqfl {

    /* renamed from: a */
    private final boolean f85866a;

    /* renamed from: b */
    private final boolean f85867b;

    /* renamed from: c */
    private final long f85868c;

    /* renamed from: d */
    private final int f85869d;

    /* renamed from: e */
    private final boolean f85870e;

    /* renamed from: f */
    private final String f85871f;

    /* renamed from: g */
    private final long f85872g;

    public aqeh(boolean z, boolean z2, long j, int i, boolean z3, String str, long j2) {
        this.f85866a = z;
        this.f85867b = z2;
        this.f85868c = j;
        this.f85869d = i;
        this.f85870e = z3;
        this.f85871f = str;
        this.f85872g = j2;
    }

    /* renamed from: a */
    public final boolean mo47776a() {
        return this.f85866a;
    }

    /* renamed from: b */
    public final boolean mo47777b() {
        return this.f85867b;
    }

    /* renamed from: c */
    public final long mo47778c() {
        return this.f85868c;
    }

    /* renamed from: d */
    public final int mo47779d() {
        return this.f85869d;
    }

    /* renamed from: e */
    public final boolean mo47780e() {
        return this.f85870e;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof aqfl) {
            aqfl aqfl = (aqfl) obj;
            return this.f85866a == aqfl.mo47776a() && this.f85867b == aqfl.mo47777b() && this.f85868c == aqfl.mo47778c() && this.f85869d == aqfl.mo47779d() && this.f85870e == aqfl.mo47780e() && ((str = this.f85871f) == null ? aqfl.mo47782f() == null : str.equals(aqfl.mo47782f())) && this.f85872g == aqfl.mo47783g();
        }
    }

    /* renamed from: f */
    public final String mo47782f() {
        return this.f85871f;
    }

    /* renamed from: g */
    public final long mo47783g() {
        return this.f85872g;
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = ((!this.f85866a ? 1237 : 1231) ^ 1000003) * 1000003;
        int i3 = !this.f85867b ? 1237 : 1231;
        long j = this.f85868c;
        int i4 = (((((i2 ^ i3) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.f85869d) * 1000003;
        if (this.f85870e) {
            i = 1231;
        }
        int i5 = (i4 ^ i) * 1000003;
        String str = this.f85871f;
        int hashCode = str != null ? str.hashCode() : 0;
        long j2 = this.f85872g;
        return ((i5 ^ hashCode) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2));
    }

    public final String toString() {
        boolean z = this.f85866a;
        boolean z2 = this.f85867b;
        long j = this.f85868c;
        int i = this.f85869d;
        boolean z3 = this.f85870e;
        String str = this.f85871f;
        long j2 = this.f85872g;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + BaseMfiEventCallback.TYPE_ILLEGAL_LINKAGE_DATA);
        sb.append("SdCardAnalysisInfo{jpegMissing=");
        sb.append(z);
        sb.append(", jpegTampered=");
        sb.append(z2);
        sb.append(", jpegWrongLength=");
        sb.append(j);
        sb.append(", jpegTamperedBytes=");
        sb.append(i);
        sb.append(", jpegNewlyTampered=");
        sb.append(z3);
        sb.append(", jpegFileName=");
        sb.append(str);
        sb.append(", jpegModificationTime=");
        sb.append(j2);
        sb.append("}");
        return sb.toString();
    }
}
