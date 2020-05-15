package p000;

/* renamed from: zub */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class zub extends zuh {

    /* renamed from: a */
    private final yqi f55916a;

    /* renamed from: b */
    private final yre f55917b;

    public zub(yqi yqi, yre yre) {
        if (yqi != null) {
            this.f55916a = yqi;
            if (yre != null) {
                this.f55917b = yre;
                return;
            }
            throw new NullPointerException("Null changeSet");
        }
        throw new NullPointerException("Null syncStatus");
    }

    /* renamed from: a */
    public final yqi mo31515a() {
        return this.f55916a;
    }

    /* renamed from: b */
    public final yre mo31516b() {
        return this.f55917b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zuh) {
            zuh zuh = (zuh) obj;
            return this.f55916a.equals(zuh.mo31515a()) && this.f55917b.equals(zuh.mo31516b());
        }
    }

    public final int hashCode() {
        return ((this.f55916a.hashCode() ^ 1000003) * 1000003) ^ this.f55917b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f55916a);
        String valueOf2 = String.valueOf(this.f55917b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35 + String.valueOf(valueOf2).length());
        sb.append("SyncResult{syncStatus=");
        sb.append(valueOf);
        sb.append(", changeSet=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
