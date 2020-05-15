package p000;

import android.view.autofill.AutofillId;

/* renamed from: leg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class leg extends lfl {

    /* renamed from: a */
    public final AutofillId f25869a;

    /* renamed from: b */
    public final bmxv f25870b;

    public leg(AutofillId autofillId, bmxv bmxv) {
        if (autofillId != null) {
            this.f25869a = autofillId;
            this.f25870b = bmxv;
            return;
        }
        throw new NullPointerException("Null autofillId");
    }

    /* renamed from: a */
    public final AutofillId mo15030a() {
        return this.f25869a;
    }

    /* renamed from: b */
    public final bmxv mo15031b() {
        return this.f25870b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lfl) {
            lfl lfl = (lfl) obj;
            return this.f25869a.equals(lfl.mo15030a()) && this.f25870b.equals(lfl.mo15031b());
        }
    }

    public final int hashCode() {
        return ((this.f25869a.hashCode() ^ 1000003) * 1000003) ^ this.f25870b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f25869a);
        String valueOf2 = String.valueOf(this.f25870b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30 + String.valueOf(valueOf2).length());
        sb.append("PromoInfo{autofillId=");
        sb.append(valueOf);
        sb.append(", field=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
