package p000;

/* renamed from: abkt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class abkt implements Comparable {

    /* renamed from: a */
    final String f57639a;

    /* renamed from: b */
    final String f57640b;

    public abkt(String str, String str2) {
        this.f57639a = str;
        this.f57640b = str2;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return toString().compareTo(((abkt) obj).toString());
    }

    public final String toString() {
        String a = stm.m36299a(this.f57639a);
        String a2 = stm.m36299a(this.f57640b);
        StringBuilder sb = new StringBuilder(a.length() + 1 + a2.length());
        sb.append(a);
        sb.append(":");
        sb.append(a2);
        return sb.toString();
    }
}
