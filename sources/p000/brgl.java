package p000;

/* renamed from: brgl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brgl implements brgk {

    /* renamed from: a */
    private final bngx f142825a;

    /* renamed from: b */
    private final brgj f142826b;

    /* renamed from: c */
    private final brez f142827c;

    static {
        brgk.class.getSimpleName();
    }

    /* renamed from: a */
    public final void mo69516a(brgm brgm) {
        brgj brgj = this.f142826b;
        brgj.f142816d.add(new brgh(this.f142825a, brgm));
        brgj.mo69509c();
    }

    public brgl(String[] strArr, brez brez) {
        this.f142825a = bngx.m109370a((Object[]) strArr);
        this.f142826b = brez;
        this.f142827c = brez;
    }

    /* renamed from: a */
    public final void mo69517a(String str, brfa brfa) {
        mo69518a(str, brfa, 1);
    }

    /* renamed from: a */
    public final void mo69518a(String str, brfa brfa, int i) {
        brez brez = this.f142827c;
        brez.f142816d.add(new brgh(brez.f142746a, new brey(str, brfa, i)));
        brez.mo69509c();
    }

    /* renamed from: a */
    public final void mo69519a(String str, brgn brgn) {
        brgj brgj = this.f142826b;
        brgj.f142816d.add(new brgh(this.f142825a, new brgi(str, brgn)));
        brgj.mo69509c();
    }
}
