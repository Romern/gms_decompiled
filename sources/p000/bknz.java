package p000;

/* renamed from: bknz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bknz {

    /* renamed from: a */
    public final Exception f124975a;

    /* renamed from: b */
    public final int f124976b;

    /* renamed from: c */
    public final bkob f124977c;

    /* renamed from: d */
    public final int f124978d;

    public bknz(int i, Exception exc, int i2, bkob bkob) {
        this.f124978d = i;
        this.f124975a = exc;
        this.f124976b = i2;
        this.f124977c = bkob;
        if (exc == null) {
            throw null;
        }
    }

    public final String toString() {
        int i = this.f124978d;
        String str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "UNKNOWN_SID" : "INVALID_RESPONSE" : "SERVER_BACKOFF" : "SERVER_ERROR" : "NETWORK";
        String valueOf = String.valueOf(this.f124975a);
        int i2 = this.f124976b;
        StringBuilder sb = new StringBuilder(str.length() + 59 + String.valueOf(valueOf).length());
        sb.append("BindErrorEvent [errorType=");
        sb.append(str);
        sb.append(", cause=");
        sb.append(valueOf);
        sb.append(", statusCode=");
        sb.append(i2);
        sb.append("]");
        return sb.toString();
    }

    public bknz(int i, Exception exc, bkob bkob) {
        this(i, exc, -1, bkob);
    }
}
