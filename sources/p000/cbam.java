package p000;

/* renamed from: cbam */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cbam extends cbaj {

    /* renamed from: b */
    private final bngx f176478b;

    public cbam(Iterable iterable) {
        this.f176478b = bngx.m109355a(iterable);
    }

    /* renamed from: a */
    public final cbak mo75223a(Object obj) {
        bngs j = bngx.m109377j();
        bnre i = this.f176478b.listIterator();
        while (i.hasNext()) {
            cbaj cbaj = (cbaj) i.next();
            try {
                cbak a = cbaj.mo75223a(obj);
                if (a != null) {
                    j.mo67668c(a);
                }
            } catch (RuntimeException e) {
                cbar.m127681a(e, cbaj, obj);
            }
        }
        bngx a2 = j.mo67664a();
        if (a2.isEmpty()) {
            return cbak.f176476a;
        }
        if (a2.size() == 1) {
            return new cbaq((cbak) bnjd.m109587b(a2));
        }
        return new cban(a2);
    }
}
