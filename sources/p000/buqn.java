package p000;

/* renamed from: buqn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class buqn implements Runnable {

    /* renamed from: m */
    public final String f154716m;

    public buqn(String str) {
        this.f154716m = str;
    }

    public final String toString() {
        String str = this.f154716m;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 10);
        sb.append("Runnable[");
        sb.append(str);
        sb.append("]");
        return sb.toString();
    }
}
