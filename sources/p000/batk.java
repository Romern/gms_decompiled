package p000;

import java.util.Collection;
import java.util.concurrent.TimeUnit;

/* renamed from: batk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class batk implements bqfp {

    /* renamed from: a */
    final /* synthetic */ batl f101703a;

    public batk(batl batl) {
        this.f101703a = batl;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        azzq azzq = (azzq) obj;
        batl batl = this.f101703a;
        if (azzq.mo55492b().mo55509c() != 0) {
            boolean z = false;
            for (basd basd : (Collection) azzq.mo55491a()) {
                bati bati = batl.f101704a;
                azzq.mo55492b();
                int seconds = (int) TimeUnit.MICROSECONDS.toSeconds(basd.f101655c);
                byte[] bArr = basd.f101653a;
                if (bArr == null) {
                    bhwb bhwb = (bhwb) bati;
                    bhwb.mo64352a(new bvnw[0], new bvoa[0], seconds, 0, bhwb.f119723a, 2);
                    bhuj.m101555a().mo64361c("Null personalized places data.");
                    z = true;
                } else {
                    int length = bArr.length;
                    if (length == 0) {
                        ((bhwb) bati).mo64350a(bxlu.f163891c, seconds, 0);
                        z = true;
                    } else {
                        try {
                            ((bhwb) bati).mo64350a((bxlu) basd.mo55930a(), seconds, length);
                            z = true;
                        } catch (bxwf e) {
                            bhwb bhwb2 = (bhwb) bati;
                            bhwb2.mo64352a(new bvnw[0], new bvoa[0], seconds, bArr.length, bhwb2.f119723a, 2);
                            bhuj.m101555a().mo64359a("Failure parsing personalized places proto.", e);
                            z = true;
                        }
                    }
                }
            }
            if (!z) {
                bati bati2 = batl.f101704a;
                azzq.mo55492b();
                ((bhwb) bati2).mo64350a(bxlu.f163891c, 0, 0);
            }
        }
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        bati bati = this.f101703a.f101704a;
        bhuj.m101555a().mo64359a("Failure reading Footprints.", th);
        bhwb bhwb = (bhwb) bati;
        bhwb.mo64351a(bhwb.f119723a);
    }
}
