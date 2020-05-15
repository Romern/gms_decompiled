package p000;

import org.json.JSONObject;

/* renamed from: txw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class txw {

    /* renamed from: a */
    public final txp f46966a;

    /* renamed from: b */
    public final txp f46967b;

    public txw(txp txp, txp txp2) {
        sdo.m34959a(txp);
        this.f46966a = txp;
        sdo.m34959a(txp2);
        this.f46967b = txp2;
    }

    /* renamed from: a */
    public final JSONObject mo26926a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("forward", this.f46966a.mo26899h());
        jSONObject.put("reverse", this.f46967b.mo26899h());
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            txw txw = (txw) obj;
            return this.f46966a.equals(txw.f46966a) && this.f46967b.equals(txw.f46967b);
        }
    }

    public final int hashCode() {
        return ((this.f46966a.hashCode() + 31) * 31) + this.f46967b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f46966a);
        String valueOf2 = String.valueOf(this.f46967b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 44 + String.valueOf(valueOf2).length());
        sb.append("ApplyResult [forwardAction=");
        sb.append(valueOf);
        sb.append(", reverseAction=");
        sb.append(valueOf2);
        sb.append("]");
        return sb.toString();
    }
}
