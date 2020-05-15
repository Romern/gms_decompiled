package p000;

import java.security.MessageDigest;

/* renamed from: cqm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cqm implements cdg {

    /* renamed from: b */
    private final Object f11850b;

    public cqm(Object obj) {
        crb.m7382a(obj);
        this.f11850b = obj;
    }

    /* renamed from: a */
    public final void mo3732a(MessageDigest messageDigest) {
        messageDigest.update(this.f11850b.toString().getBytes(f6570a));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cqm) {
            return this.f11850b.equals(((cqm) obj).f11850b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f11850b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f11850b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
        sb.append("ObjectKey{object=");
        sb.append(valueOf);
        sb.append('}');
        return sb.toString();
    }
}
