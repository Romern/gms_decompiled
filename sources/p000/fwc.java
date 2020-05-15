package p000;

import com.google.android.gms.appinvite.model.ContactPerson;
import java.util.Arrays;

/* renamed from: fwc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fwc {

    /* renamed from: a */
    public final ContactPerson f17404a;

    /* renamed from: b */
    public final ContactPerson.ContactMethod f17405b;

    /* renamed from: c */
    public final int f17406c;

    public fwc(ContactPerson contactPerson, ContactPerson.ContactMethod contactMethod, int i) {
        this.f17404a = contactPerson;
        this.f17405b = contactMethod;
        this.f17406c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            fwc fwc = (fwc) obj;
            return this.f17406c == fwc.f17406c && sdg.m34949a(this.f17404a, fwc.f17404a) && sdg.m34949a(this.f17405b, fwc.f17405b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f17404a, this.f17405b, Integer.valueOf(this.f17406c)});
    }
}
