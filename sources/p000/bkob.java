package p000;

/* renamed from: bkob */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkob {

    /* renamed from: a */
    public final String f124979a;

    /* renamed from: b */
    public final long f124980b;

    public bkob(String str, long j) {
        this.f124979a = str;
        this.f124980b = j;
        if (str.isEmpty()) {
            throw new IllegalArgumentException();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bkob) {
            bkob bkob = (bkob) obj;
            return this.f124979a.equals(bkob.f124979a) && this.f124980b == bkob.f124980b;
        }
    }

    public final int hashCode() {
        int hashCode = this.f124979a.hashCode();
        long j = this.f124980b;
        return ((hashCode + 31) * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        String str = this.f124979a;
        long j = this.f124980b;
        StringBuilder sb = new StringBuilder(str.length() + 74);
        sb.append("ContinuationToken [channelSid=");
        sb.append(str);
        sb.append(", mostRecentEnvelopeId=");
        sb.append(j);
        sb.append("]");
        return sb.toString();
    }
}
