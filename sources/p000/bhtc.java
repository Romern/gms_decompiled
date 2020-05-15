package p000;

import java.io.File;
import java.util.concurrent.TimeUnit;

/* renamed from: bhtc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhtc implements Runnable {

    /* renamed from: a */
    final /* synthetic */ bhtl f119529a;

    public bhtc(bhtl bhtl) {
        this.f119529a = bhtl;
    }

    public final void run() {
        int i;
        bhtl bhtl = this.f119529a;
        int i2 = bhtl.f119552c;
        if (i2 == 0) {
            int i3 = 0;
            if (bhtl.f119550a == null) {
                bhtl.f119550a = new bhsw(7, (int) cggd.f186816a.mo6606a().mo83680a(), new File(bhtl.f119554e, "l1"), new bhta(bhtl.f119555f), bhuj.m101555a());
                i = bhtl.f119550a.mo64238a();
            } else {
                i = 0;
            }
            if (bhtl.f119551b == null) {
                bhtl.f119551b = new bhsw(7, (int) cggd.f186816a.mo6606a().mo83681b(), new File(bhtl.f119554e, "l2"), new bhtb(bhtl.f119555f), bhuj.m101555a());
                i3 = bhtl.f119551b.mo64238a();
            }
            bhtl.f119552c = 1;
            long millis = TimeUnit.SECONDS.toMillis((long) ((int) cggm.f186849a.mo6606a().mo83714E()));
            long b = bhtl.mo64274b();
            if (b < 0) {
                bhuj.m101555a();
                bhtl.mo64270a(4, i, i3);
                bhtl.f119558i.f119594i++;
                bhtl.mo64268a();
            } else if (b > millis) {
                bhuj.m101555a();
                bhtl.mo64270a(5, i, i3);
                bhtl.f119558i.f119595j++;
                bhtl.mo64268a();
            } else {
                bhuj.m101555a();
                bhtl.mo64270a(6, i, i3);
                bhtl.f119558i.f119597l++;
            }
        } else {
            bhtl.f119552c = i2 + 1;
        }
    }
}
