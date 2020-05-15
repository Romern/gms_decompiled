package p000;

/* renamed from: ldj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ldj extends led {

    /* renamed from: a */
    private final bnic f25836a;

    /* renamed from: b */
    private final int f25837b;

    /* renamed from: c */
    private final int f25838c;

    public ldj(bnic bnic, int i, int i2) {
        if (bnic != null) {
            this.f25836a = bnic;
            this.f25837b = i;
            this.f25838c = i2;
            return;
        }
        throw new NullPointerException("Null autofillPredictedFields");
    }

    /* renamed from: a */
    public final bnic mo15011a() {
        return this.f25836a;
    }

    /* renamed from: b */
    public final int mo15012b() {
        return this.f25837b;
    }

    /* renamed from: c */
    public final int mo15013c() {
        return this.f25838c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof led) {
            led led = (led) obj;
            return this.f25836a.equals(led.mo15011a()) && this.f25837b == led.mo15012b() && this.f25838c == led.mo15013c();
        }
    }

    public final int hashCode() {
        return ((((this.f25836a.hashCode() ^ 1000003) * 1000003) ^ this.f25837b) * 1000003) ^ this.f25838c;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f25836a);
        int i = this.f25837b;
        int i2 = this.f25838c;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 91);
        sb.append("AutofillIdInfo{autofillPredictedFields=");
        sb.append(valueOf);
        sb.append(", autofillType=");
        sb.append(i);
        sb.append(", fingerprint=");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }
}
