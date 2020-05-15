package p000;

/* renamed from: bqeo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bqeo implements bqeh {

    /* renamed from: a */
    final /* synthetic */ bqer f140550a;

    /* renamed from: b */
    final /* synthetic */ bqeu f140551b;

    public bqeo(bqeu bqeu, bqer bqer) {
        this.f140551b = bqeu;
        this.f140550a = bqer;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        bqes bqes = this.f140551b.f140564b;
        bqer bqer = this.f140550a;
        bqes bqes2 = new bqes();
        try {
            bqeu a = bqer.mo60793a(bqes2, obj);
            a.mo69188a(bqes2);
            return a.f140565c;
        } finally {
            bqes.mo69183a(bqes2, bqfb.INSTANCE);
        }
    }

    public final String toString() {
        return this.f140550a.toString();
    }
}
