package p000;

/* renamed from: aywr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aywr {

    /* renamed from: a */
    public final aywt f98642a;

    public aywr(aywt aywt) {
        this.f98642a = aywt;
    }

    public final String toString() {
        String obj = super.toString();
        bqbo a = bqbo.m112517a(this.f98642a.f98647b);
        if (a == null) {
            a = bqbo.UNASSIGNED_USER_ACTION_ID;
        }
        String name = a.name();
        String valueOf = String.valueOf(this.f98642a);
        int length = String.valueOf(obj).length();
        StringBuilder sb = new StringBuilder(length + 2 + String.valueOf(name).length() + String.valueOf(valueOf).length());
        sb.append(obj);
        sb.append(" ");
        sb.append(name);
        sb.append(" ");
        sb.append(valueOf);
        return sb.toString();
    }
}
