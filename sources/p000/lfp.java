package p000;

/* renamed from: lfp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lfp implements lgd {

    /* renamed from: a */
    private final bngx f26000a;

    public lfp(bngx bngx) {
        this.f26000a = bngx;
    }

    /* renamed from: a */
    public final bngx mo15054a(lgc lgc) {
        bngs b = bngx.m109371b(4);
        bnre i = this.f26000a.listIterator();
        while (i.hasNext()) {
            b.mo67666b((Iterable) ((lgd) i.next()).mo15054a(lgc));
        }
        return b.mo67664a();
    }
}
