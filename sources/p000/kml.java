package p000;

/* renamed from: kml */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kml implements klo {

    /* renamed from: a */
    private final boolean f24468a;

    /* renamed from: b */
    private final boolean f24469b;

    public kml(kkp kkp) {
        this.f24468a = kkp.mo14592k();
        this.f24469b = kkp.mo14601t();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0093, code lost:
        r0 = r4;
     */
    /* renamed from: a */
    public final kln mo14681a(bngx bngx) {
        boolean z;
        int i;
        int i2;
        kpb kpb;
        bnia j = bnic.m109500j();
        bnre i3 = bngx.listIterator();
        while (i3.hasNext()) {
            j.mo67752b((Iterable) ((kjl) i3.next()).mo14517b());
        }
        bnic a = j.mo67751a();
        boolean contains = a.contains(kpb.PASSWORD);
        boolean contains2 = a.contains(kpb.NEW_PASSWORD);
        klm a2 = kln.m18126a();
        if ((contains || (this.f24468a && contains2)) && a.contains(kpb.EMAIL_ADDRESS) && !a.contains(kpb.USERNAME)) {
            if (!this.f24468a) {
                i2 = 0;
                i = -1;
                z = false;
            } else if (!a.contains(kpb.NEW_USERNAME)) {
                i2 = 0;
                i = -1;
                z = false;
            }
            while (true) {
                if (i2 >= bngx.size()) {
                    break;
                }
                kjl kjl = (kjl) bngx.get(i2);
                if (kjl.mo14530a(kpb.EMAIL_ADDRESS)) {
                    if (z) {
                        break;
                    }
                    i = i2;
                } else if (kjl.mo14530a(kpb.PASSWORD) || (this.f24468a && kjl.mo14530a(kpb.NEW_PASSWORD))) {
                    if (i != -1) {
                        break;
                    }
                    z = true;
                }
                i2++;
            }
            for (int i4 = 0; i4 < bngx.size(); i4++) {
                kjl kjl2 = (kjl) bngx.get(i4);
                if (i4 == i2) {
                    kpb[] kpbArr = new kpb[1];
                    if (!this.f24468a) {
                        kpb = kpb.USERNAME;
                    } else {
                        boolean z2 = contains && contains2;
                        kpb = (!z2 && !(!z2 && contains)) ? kpb.NEW_USERNAME : kpb.USERNAME;
                    }
                    kpbArr[0] = kpb;
                    kjl b = kjl2.mo14531b(kpbArr);
                    a2.mo14678a(b);
                    if (this.f24469b && !b.mo14517b().equals(kjl2.mo14517b())) {
                        a2.mo14679a(kll.m18116a(kml.class.getSimpleName(), kjl2.mo14516a(), kjl2.mo14517b(), b.mo14517b()));
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
