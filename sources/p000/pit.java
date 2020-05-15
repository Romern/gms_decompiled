package p000;

/* renamed from: pit */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pit {

    /* renamed from: a */
    public final /* synthetic */ pjc f39253a;

    public pit(pjc pjc) {
        this.f39253a = pjc;
    }

    /* renamed from: a */
    public final void mo23223a(int i) {
        bpes bpes;
        poq poq;
        boolean z = true;
        this.f39253a.f39316e.mo23677d("Unsuccessful cast nearby session %d", Integer.valueOf(i));
        if (i != 2503) {
            z = false;
        }
        pjc pjc = this.f39253a;
        if (i == 2500) {
            bpes = bpes.ERROR_CANCELED;
        } else if (i == 2502) {
            bpes = bpes.ERROR_CAST_NEARBY_INVALID_REQUEST;
        } else if (i != 2503) {
            bpes = bpes.ERROR_UNKNOWN;
        } else {
            bpes = bpes.ERROR_IO;
        }
        pjc.mo23236a(i, z, bpes);
        if (qay.m31788b()) {
            pjc pjc2 = this.f39253a;
            if (pjc2.f39315c) {
                poj poj = pjc2.f39335x;
                poq = new por(poj.f39918b, poj.f39919c, pjc2.f39230a.mo17494a());
            } else {
                poj poj2 = pjc2.f39335x;
                poq = new poi(poj2.f39918b, poj2.f39919c, pjc2.f39230a.mo17494a());
            }
            poq.mo23522a();
        }
    }
}
