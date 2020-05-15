package p000;

/* renamed from: brza */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brza implements bntp {

    /* renamed from: a */
    private final bngx f143706a;

    public brza(bntp... bntpArr) {
        this.f143706a = bngx.m109370a((Object[]) bntpArr);
    }

    /* renamed from: a */
    public final bnsx mo25075a(String str) {
        bngs j = bngx.m109377j();
        bnre i = this.f143706a.listIterator();
        while (i.hasNext()) {
            j.mo67668c(((bntp) i.next()).mo25075a(str));
        }
        return new bryz(str, j.mo67664a());
    }
}
