package p000;

/* renamed from: anat */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class anat extends anay {

    /* renamed from: a */
    private final amjx f76513a;

    /* renamed from: b */
    private final int f76514b;

    /* renamed from: c */
    private final int f76515c;

    public anat(int i, amjx amjx, int i2) {
        this.f76514b = i;
        if (amjx != null) {
            this.f76513a = amjx;
            this.f76515c = i2;
            return;
        }
        throw new NullPointerException("Null mismatchFieldType");
    }

    /* renamed from: a */
    public final amjx mo41620a() {
        return this.f76513a;
    }

    /* renamed from: b */
    public final int mo41621b() {
        return this.f76514b;
    }

    /* renamed from: c */
    public final int mo41622c() {
        return this.f76515c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof anay) {
            anay anay = (anay) obj;
            return this.f76514b == anay.mo41621b() && this.f76513a.equals(anay.mo41620a()) && this.f76515c == anay.mo41622c();
        }
    }

    public final int hashCode() {
        return ((((this.f76514b ^ 1000003) * 1000003) ^ this.f76513a.hashCode()) * 1000003) ^ this.f76515c;
    }

    public final String toString() {
        String valueOf = String.valueOf(Integer.toString(this.f76514b - 1));
        String valueOf2 = String.valueOf(this.f76513a);
        String valueOf3 = String.valueOf(Integer.toString(this.f76515c - 1));
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 75 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("MismatchDataField{dataFieldType=");
        sb.append(valueOf);
        sb.append(", mismatchFieldType=");
        sb.append(valueOf2);
        sb.append(", versionMismatchType=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
