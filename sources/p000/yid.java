package p000;

/* renamed from: yid */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yid implements yig {

    /* renamed from: a */
    public final caae f53853a;

    /* renamed from: b */
    public yhe f53854b;

    public yid(caae caae, yhe yhe) {
        this.f53853a = caae;
        this.f53854b = yhe;
    }

    /* renamed from: a */
    public final void mo30534a(yif yif) {
        yif.mo30538a(this);
    }

    public final String toString() {
        String b = yyd.m44990b(this.f53853a);
        String valueOf = String.valueOf(this.f53854b);
        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 1 + String.valueOf(valueOf).length());
        sb.append(b);
        sb.append(" ");
        sb.append(valueOf);
        return sb.toString();
    }
}
