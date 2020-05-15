package p000;

import java.util.concurrent.ExecutionException;

/* renamed from: cazk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cazk extends cazm {

    /* renamed from: a */
    private final Throwable f176450a;

    /* renamed from: a */
    public final Object mo75194a() {
        throw new ExecutionException(this.f176450a);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cazk) {
            return this.f176450a.equals(((cazk) obj).f176450a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f176450a.hashCode();
    }

    public final String toString() {
        String canonicalName = this.f176450a.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22);
        sb.append("Produced[failed with ");
        sb.append(canonicalName);
        sb.append("]");
        return sb.toString();
    }

    public cazk(Throwable th) {
        bmxy.m108581a(th);
        this.f176450a = th;
    }
}
