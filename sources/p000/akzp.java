package p000;

/* renamed from: akzp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class akzp implements Comparable {

    /* renamed from: a */
    final String f73174a;

    /* renamed from: b */
    final String f73175b;

    public akzp(String str, String str2) {
        this.f73174a = str;
        this.f73175b = str2;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return toString().compareTo(((akzp) obj).toString());
    }

    public final String toString() {
        String a = stm.m36299a(this.f73174a);
        String a2 = stm.m36299a(this.f73175b);
        StringBuilder sb = new StringBuilder(a.length() + 1 + a2.length());
        sb.append(a);
        sb.append(":");
        sb.append(a2);
        return sb.toString();
    }
}
