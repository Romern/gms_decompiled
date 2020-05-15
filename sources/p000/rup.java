package p000;

/* renamed from: rup */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class rup extends ruq {

    /* renamed from: b */
    private final bngx f43714b;

    public rup(String str, bngx bngx) {
        super(str);
        this.f43714b = bngx;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo25185a(rvl rvl) {
        bnre i = this.f43714b.listIterator();
        while (i.hasNext()) {
            if (!((ruq) i.next()).mo25185a(rvl)) {
                return false;
            }
        }
        return true;
    }
}
