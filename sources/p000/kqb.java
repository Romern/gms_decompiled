package p000;

/* renamed from: kqb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class kqb extends kqm {

    /* renamed from: a */
    private final bnhe f24784a;

    /* renamed from: b */
    private final bnhe f24785b;

    public kqb(bnhe bnhe, bnhe bnhe2) {
        if (bnhe != null) {
            this.f24784a = bnhe;
            if (bnhe2 != null) {
                this.f24785b = bnhe2;
                return;
            }
            throw new NullPointerException("Null dataEntryToFillFieldsMap");
        }
        throw new NullPointerException("Null dataEntryToDatasetMap");
    }

    /* renamed from: a */
    public final bnhe mo14790a() {
        return this.f24784a;
    }

    /* renamed from: b */
    public final bnhe mo14791b() {
        return this.f24785b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kqm) {
            kqm kqm = (kqm) obj;
            return this.f24784a.equals(kqm.mo14790a()) && this.f24785b.equals(kqm.mo14791b());
        }
    }

    public final int hashCode() {
        return ((this.f24784a.hashCode() ^ 1000003) * 1000003) ^ this.f24785b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f24784a);
        String valueOf2 = String.valueOf(this.f24785b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 57 + String.valueOf(valueOf2).length());
        sb.append("Result{dataEntryToDatasetMap=");
        sb.append(valueOf);
        sb.append(", dataEntryToFillFieldsMap=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
