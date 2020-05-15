package p000;

/* renamed from: cpc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cpc implements cpa {

    /* renamed from: a */
    final /* synthetic */ cpd f11763a;

    public cpc(cpd cpd) {
        this.f11763a = cpd;
    }

    public final String toString() {
        String obj = super.toString();
        String valueOf = String.valueOf(this.f11763a);
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 11 + String.valueOf(valueOf).length());
        sb.append(obj);
        sb.append("{fragment=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
