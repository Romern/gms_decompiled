package p000;

/* renamed from: dfg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dfg {

    /* renamed from: a */
    public final int f13006a;

    /* renamed from: b */
    public final String f13007b;

    public dfg(int i) {
        this(i, null);
    }

    public final String toString() {
        int i = this.f13006a;
        String str = this.f13007b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 14);
        sb.append("[");
        sb.append(i);
        sb.append("] ");
        sb.append(str);
        return sb.toString();
    }

    public dfg(int i, String str) {
        this.f13006a = i;
        this.f13007b = str;
    }
}
