package p000;

/* renamed from: bhps */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bhps implements Runnable {

    /* renamed from: a */
    final /* synthetic */ int f119271a;

    /* renamed from: b */
    final /* synthetic */ qwo f119272b;

    /* renamed from: c */
    final /* synthetic */ bhpt f119273c;

    public bhps(bhpt bhpt, int i, qwo qwo) {
        this.f119273c = bhpt;
        this.f119271a = i;
        this.f119272b = qwo;
    }

    public final void run() {
        String a = bhqp.m101339a(this.f119273c.f119274a).mo64167a();
        if (a == null || a.hashCode() % this.f119271a == 0) {
            qwo qwo = this.f119272b;
            qwo.f42323g = a;
            qwo.mo24327b();
        }
    }
}
