package p000;

/* renamed from: wrm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class wrm implements Comparable {

    /* renamed from: a */
    final String f51186a;

    /* renamed from: b */
    final String f51187b;

    public wrm(String str, String str2) {
        this.f51186a = str;
        this.f51187b = str2;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return toString().compareTo(((wrm) obj).toString());
    }

    public final String toString() {
        String a = stm.m36299a(this.f51186a);
        String a2 = stm.m36299a(this.f51187b);
        StringBuilder sb = new StringBuilder(a.length() + 1 + a2.length());
        sb.append(a);
        sb.append(":");
        sb.append(a2);
        return sb.toString();
    }
}
