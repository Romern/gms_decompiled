package p000;

import com.google.android.gms.auth.api.phone.internal.SmsRetrieverEvent;

/* renamed from: iaz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class iaz extends ibf {

    /* renamed from: a */
    private final SmsRetrieverEvent f20662a;

    /* renamed from: b */
    private final boolean f20663b;

    public iaz(SmsRetrieverEvent smsRetrieverEvent, boolean z) {
        if (smsRetrieverEvent != null) {
            this.f20662a = smsRetrieverEvent;
            this.f20663b = z;
            return;
        }
        throw new NullPointerException("Null event");
    }

    /* renamed from: a */
    public final SmsRetrieverEvent mo12871a() {
        return this.f20662a;
    }

    /* renamed from: b */
    public final boolean mo12872b() {
        return this.f20663b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ibf) {
            ibf ibf = (ibf) obj;
            return this.f20662a.equals(ibf.mo12871a()) && this.f20663b == ibf.mo12872b();
        }
    }

    public final int hashCode() {
        return ((this.f20662a.hashCode() ^ 1000003) * 1000003) ^ (!this.f20663b ? 1237 : 1231);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f20662a);
        boolean z = this.f20663b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 66);
        sb.append("InternalSmsRetrieverEventWrapper{event=");
        sb.append(valueOf);
        sb.append(", attachOperatorName=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
