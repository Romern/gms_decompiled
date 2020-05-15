package p000;

/* renamed from: kmm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kmm implements klo {

    /* renamed from: a */
    private final kkp f24470a;

    public kmm(kkp kkp) {
        this.f24470a = kkp;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0092, code lost:
        r3 = r4;
     */
    /* renamed from: a */
    public final kln mo14681a(bngx bngx) {
        bnia j = bnic.m109500j();
        bnre i = bngx.listIterator();
        while (i.hasNext()) {
            j.mo67752b((Iterable) ((kjl) i.next()).mo14517b());
        }
        bnic a = j.mo67751a();
        klm a2 = kln.m18126a();
        if ((a.contains(kpb.PASSWORD) || a.contains(kpb.NEW_PASSWORD)) && ((a.contains(kpb.PHONE_NATIONAL) || a.contains(kpb.PHONE_NUMBER)) && !a.contains(kpb.EMAIL_ADDRESS) && !a.contains(kpb.USERNAME) && !a.contains(kpb.NEW_USERNAME))) {
            int i2 = 0;
            int i3 = -1;
            boolean z = false;
            while (true) {
                if (i2 >= bngx.size()) {
                    break;
                }
                kjl kjl = (kjl) bngx.get(i2);
                if (kjl.mo14530a(kpb.PHONE_NUMBER) || kjl.mo14530a(kpb.PHONE_NATIONAL)) {
                    if (z) {
                        break;
                    }
                    i3 = i2;
                } else if (kjl.mo14530a(kpb.PASSWORD)) {
                    if (i3 != -1) {
                        break;
                    }
                    z = true;
                } else {
                    continue;
                }
                i2++;
            }
            for (int i4 = 0; i4 < bngx.size(); i4++) {
                kjl kjl2 = (kjl) bngx.get(i4);
                if (i4 == i2) {
                    kjl b = kjl2.mo14531b(kpb.USERNAME);
                    a2.mo14678a(b);
                    if (this.f24470a.mo14601t() && !b.mo14517b().equals(kjl2.mo14517b())) {
                        a2.mo14679a(kll.m18116a(kmm.class.getSimpleName(), kjl2.mo14516a(), kjl2.mo14517b(), b.mo14517b()));
                    }
                } else {
                    a2.mo14678a(kjl2);
                }
            }
            return a2.mo14676a();
        }
        a2.mo14677a(bngx);
        return a2.mo14676a();
    }
}
