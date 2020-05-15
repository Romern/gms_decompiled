package p000;

import java.util.concurrent.TimeUnit;

/* renamed from: off */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class off extends oik {

    /* renamed from: g */
    private final ofe f37496g;

    /* JADX WARNING: Illegal instructions before constructor call */
    public off(int i, birv birv, ofe ofe, ojm ojm, oiu oiu) {
        super(r3, ofe, ojm, oiu, 2, birv, r9);
        int i2;
        oim oim;
        if (i != 1) {
            i2 = i != 2 ? i != 3 ? 0 : 5 : 4;
        } else {
            i2 = 3;
        }
        if (ccur.f180000a.mo6606a().mo76851b()) {
            oim = ois.m28865a(oiu);
        } else if (ccur.f180000a.mo6606a().mo76850a()) {
            oim = oiq.m28857a(oiu);
        } else {
            oim = new oim(oiu);
        }
        this.f37496g = ofe;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo22070a(bipu bipu) {
        super.mo22070a(bipu);
        int a = bipt.m102708a(bipu.f121215a);
        if (a != 0 && a == 2) {
            ofe ofe = this.f37496g;
            synchronized (((nhi) ofe).f35600l) {
                if (!((nhi) ofe).f35601m) {
                    ((nhi) ofe).f35601m = true;
                    ((nhi) ofe).f35597i.start();
                    nhi nhi = (nhi) ofe;
                    ((nhi) ofe).f35598j = new nhh(nhi, ((nhi) ofe).f35597i.getLooper(), ((nhi) ofe).f35602n, ((nhi) ofe).f35603o.mo21384a());
                    nhh nhh = ((nhi) ofe).f35598j;
                    int i = ((nhi) ofe).f35593e;
                    birv birv = ((nhi) ofe).f35595g;
                    synchronized (nhh) {
                        nhh.f35574b = false;
                        nhh.sendMessage(nhh.obtainMessage(1, i, 0, birv));
                    }
                    try {
                        if (nhh.f35573a.tryAcquire(5000, TimeUnit.MILLISECONDS)) {
                            ((nhi) ofe).f35590b.mo20701d(((nhi) ofe).f35591c);
                            return;
                        }
                        throw new IllegalStateException("Config change took too long");
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        } else {
            this.f37496g.mo20655b();
        }
    }

    /* renamed from: j */
    public final olk mo22071j() {
        return olk.AUDIO;
    }
}
