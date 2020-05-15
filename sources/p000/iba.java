package p000;

/* renamed from: iba */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class iba extends ibg {

    /* renamed from: a */
    private final boge f20666a;

    /* renamed from: b */
    private final boolean f20667b;

    public iba(boge boge, boolean z) {
        if (boge != null) {
            this.f20666a = boge;
            this.f20667b = z;
            return;
        }
        throw new NullPointerException("Null event");
    }

    /* renamed from: a */
    public final boge mo12881a() {
        return this.f20666a;
    }

    /* renamed from: b */
    public final boolean mo12882b() {
        return this.f20667b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ibg) {
            ibg ibg = (ibg) obj;
            return this.f20666a.equals(ibg.mo12881a()) && this.f20667b == ibg.mo12882b();
        }
    }

    public final int hashCode() {
        boge boge = this.f20666a;
        int i = boge.f164758ag;
        if (i == 0) {
            i = bxxm.f165037a.mo74228a(boge).mo74216a(boge);
            boge.f164758ag = i;
        }
        return (!this.f20667b ? 1237 : 1231) ^ ((i ^ 1000003) * 1000003);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f20666a);
        boolean z = this.f20667b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 58);
        sb.append("SmsRetrieverEventWrapper{event=");
        sb.append(valueOf);
        sb.append(", attachOperatorName=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
