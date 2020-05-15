package p000;

import java.security.MessageDigest;

/* renamed from: cdk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cdk implements cdg {

    /* renamed from: b */
    private final C1223np f6576b = new cqq();

    /* renamed from: a */
    public final Object mo3739a(cdj cdj) {
        return this.f6576b.containsKey(cdj) ? this.f6576b.get(cdj) : cdj.f6572b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cdk) {
            return this.f6576b.equals(((cdk) obj).f6576b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6576b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f6576b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16);
        sb.append("Options{values=");
        sb.append(valueOf);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo3740a(cdj cdj, Object obj) {
        this.f6576b.put(cdj, obj);
    }

    /* renamed from: a */
    public final void mo3741a(cdk cdk) {
        this.f6576b.mo8150a((C1245ok) cdk.f6576b);
    }

    /* renamed from: a */
    public final void mo3732a(MessageDigest messageDigest) {
        int i = 0;
        while (true) {
            C1223np npVar = this.f6576b;
            if (i < npVar.f26809h) {
                cdj cdj = (cdj) npVar.mo15620b(i);
                Object c = this.f6576b.mo15621c(i);
                cdi cdi = cdj.f6573c;
                if (cdj.f6575e == null) {
                    cdj.f6575e = cdj.f6574d.getBytes(cdg.f6570a);
                }
                cdi.mo3735a(cdj.f6575e, c, messageDigest);
                i++;
            } else {
                return;
            }
        }
    }
}
