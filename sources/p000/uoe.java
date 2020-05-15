package p000;

/* renamed from: uoe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class uoe implements uof {

    /* renamed from: a */
    private final uod f48386a;

    /* renamed from: b */
    private final uof f48387b;

    /* renamed from: c */
    private final uof f48388c;

    public uoe(uod uod, uof uof, uof uof2) {
        this.f48386a = uod;
        this.f48387b = uof;
        this.f48388c = uof2;
    }

    /* renamed from: a */
    public final String mo27759a() {
        return this.f48387b.toString() + ' ' + this.f48386a.f48385d + ' ' + ((uok) this.f48388c).mo27759a();
    }

    public final String toString() {
        return mo27759a();
    }

    /* renamed from: a */
    public final uoe mo27760a(uod uod, uof uof) {
        return new uoe(uod, this, uof);
    }
}
