package p000;

/* renamed from: bbyb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbyb extends bbyo {

    /* renamed from: a */
    public final bmxv f103740a;

    /* renamed from: b */
    public final bmxv f103741b;

    public bbyb(bmxv bmxv, bmxv bmxv2) {
        this.f103740a = bmxv;
        this.f103741b = bmxv2;
    }

    /* renamed from: a */
    public final bmxv mo56523a() {
        return this.f103740a;
    }

    /* renamed from: b */
    public final bmxv mo56524b() {
        return this.f103741b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bbyo) {
            bbyo bbyo = (bbyo) obj;
            return this.f103740a.equals(bbyo.mo56523a()) && this.f103741b.equals(bbyo.mo56524b());
        }
    }

    public final int hashCode() {
        return ((this.f103740a.hashCode() ^ 1000003) * 1000003) ^ this.f103741b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f103740a);
        String valueOf2 = String.valueOf(this.f103741b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 46 + String.valueOf(valueOf2).length());
        sb.append("ReceiveMessagesResult{tachyonMessage=");
        sb.append(valueOf);
        sb.append(", ackId=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
