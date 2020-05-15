package p000;

/* renamed from: kmj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kmj implements klo {

    /* renamed from: a */
    private final bngx f24466a;

    public kmj(Iterable iterable) {
        this.f24466a = bngx.m109355a(iterable);
    }

    /* renamed from: a */
    public final kln mo14681a(bngx bngx) {
        klm a = kln.m18126a();
        bnre i = this.f24466a.listIterator();
        while (i.hasNext()) {
            kln a2 = ((klo) i.next()).mo14681a(bngx);
            bngx bngx2 = a2.f24427a;
            a.f24424a.mo67666b((Iterable) a2.f24428b);
            bngx = bngx2;
        }
        a.mo14677a(bngx);
        return a.mo14676a();
    }
}
