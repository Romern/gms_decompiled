package p000;

/* renamed from: bbkp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bbkp extends bblo {

    /* renamed from: a */
    private final Object f102820a;

    /* renamed from: b */
    private final Object f102821b;

    public bbkp(Object obj, Object obj2) {
        if (obj != null) {
            this.f102820a = obj;
            if (obj2 != null) {
                this.f102821b = obj2;
                return;
            }
            throw new NullPointerException("Null storedResponse");
        }
        throw new NullPointerException("Null rpcResponse");
    }

    /* renamed from: a */
    public final Object mo56182a() {
        return this.f102820a;
    }

    /* renamed from: b */
    public final Object mo56183b() {
        return this.f102821b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bblo) {
            bblo bblo = (bblo) obj;
            return this.f102820a.equals(bblo.mo56182a()) && this.f102821b.equals(bblo.mo56183b());
        }
    }

    public final int hashCode() {
        int hashCode = (this.f102820a.hashCode() ^ 1000003) * 1000003;
        Object obj = this.f102821b;
        GeneratedMessageLite GeneratedMessageLite = (GeneratedMessageLite) obj;
        int i = GeneratedMessageLite.f164758ag;
        if (i == 0) {
            i = bxxm.f165037a.mo74228a(obj).mo74216a(obj);
            GeneratedMessageLite.f164758ag = i;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f102820a);
        String valueOf2 = String.valueOf(this.f102821b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 45 + String.valueOf(valueOf2).length());
        sb.append("ResponseHolder{rpcResponse=");
        sb.append(valueOf);
        sb.append(", storedResponse=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
