package p000;

import com.google.android.gms.autofill.fill.FillForm;

/* renamed from: kqa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class kqa extends kql {

    /* renamed from: a */
    private final FillForm f24779a;

    /* renamed from: b */
    private final kck f24780b;

    /* renamed from: c */
    private final bnic f24781c;

    /* renamed from: d */
    private final bmxv f24782d;

    /* renamed from: e */
    private final bmxv f24783e;

    public kqa(FillForm fillForm, kck kck, bnic bnic, bmxv bmxv, bmxv bmxv2) {
        if (fillForm != null) {
            this.f24779a = fillForm;
            if (kck != null) {
                this.f24780b = kck;
                if (bnic != null) {
                    this.f24781c = bnic;
                    if (bmxv != null) {
                        this.f24782d = bmxv;
                        if (bmxv2 != null) {
                            this.f24783e = bmxv2;
                            return;
                        }
                        throw new NullPointerException("Null inlineSuggestionsRequest");
                    }
                    throw new NullPointerException("Null metricsContext");
                }
                throw new NullPointerException("Null dataEntries");
            }
            throw new NullPointerException("Null applicationDomain");
        }
        throw new NullPointerException("Null fillForm");
    }

    /* renamed from: a */
    public final FillForm mo14782a() {
        return this.f24779a;
    }

    /* renamed from: b */
    public final kck mo14783b() {
        return this.f24780b;
    }

    /* renamed from: c */
    public final bnic mo14784c() {
        return this.f24781c;
    }

    /* renamed from: d */
    public final bmxv mo14785d() {
        return this.f24782d;
    }

    /* renamed from: e */
    public final bmxv mo14786e() {
        return this.f24783e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kql) {
            kql kql = (kql) obj;
            return this.f24779a.equals(kql.mo14782a()) && this.f24780b.equals(kql.mo14783b()) && this.f24781c.equals(kql.mo14784c()) && this.f24782d.equals(kql.mo14785d()) && this.f24783e.equals(kql.mo14786e());
        }
    }

    public final int hashCode() {
        return ((((((((this.f24779a.hashCode() ^ 1000003) * 1000003) ^ this.f24780b.hashCode()) * 1000003) ^ this.f24781c.hashCode()) * 1000003) ^ this.f24782d.hashCode()) * 1000003) ^ this.f24783e.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f24779a);
        String valueOf2 = String.valueOf(this.f24780b);
        String valueOf3 = String.valueOf(this.f24781c);
        String valueOf4 = String.valueOf(this.f24782d);
        String valueOf5 = String.valueOf(this.f24783e);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + 94 + length2 + length3 + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length());
        sb.append("Input{fillForm=");
        sb.append(valueOf);
        sb.append(", applicationDomain=");
        sb.append(valueOf2);
        sb.append(", dataEntries=");
        sb.append(valueOf3);
        sb.append(", metricsContext=");
        sb.append(valueOf4);
        sb.append(", inlineSuggestionsRequest=");
        sb.append(valueOf5);
        sb.append("}");
        return sb.toString();
    }
}
