package p000;

/* renamed from: cow */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cow implements cpa {

    /* renamed from: a */
    final /* synthetic */ cox f11746a;

    public cow(cox cox) {
        this.f11746a = cox;
    }

    public final String toString() {
        String obj = super.toString();
        String valueOf = String.valueOf(this.f11746a);
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 11 + String.valueOf(valueOf).length());
        sb.append(obj);
        sb.append("{fragment=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
