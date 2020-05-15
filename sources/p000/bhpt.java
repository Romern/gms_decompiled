package p000;

import android.content.Context;
import java.util.concurrent.ExecutorService;

/* renamed from: bhpt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhpt {

    /* renamed from: a */
    public final Context f119274a;

    /* renamed from: b */
    private final qws f119275b;

    /* renamed from: c */
    private final int f119276c;

    /* renamed from: d */
    private final ExecutorService f119277d;

    public bhpt(Context context, qws qws, int i, ExecutorService executorService) {
        this.f119274a = context.getApplicationContext();
        this.f119275b = qws;
        this.f119276c = i;
        this.f119277d = executorService;
    }

    /* renamed from: a */
    private final long m101286a() {
        if (this.f119276c != 1) {
            return cgff.f186716a.mo6606a().mo83588a();
        }
        return cgff.f186716a.mo6606a().mo83589b();
    }

    /* renamed from: a */
    public final void mo64139a(bonq bonq) {
        bxvd bxvd;
        bxvd bxvd2 = (bxvd) bonq.mo74142c(5);
        bxvd2.mo73625a((bxvk) bonq);
        int a = (int) m101286a();
        bonq bonq2 = (bonq) bxvd2.f164949b;
        bxvd bxvd3 = null;
        if ((bonq2.f133835a & 2) != 0) {
            bpqk bpqk = bonq2.f133837c;
            if (bpqk == null) {
                bpqk = bpqk.f138732w;
            }
            bxvd = (bxvd) bpqk.mo74142c(5);
            bxvd.mo73625a((bxvk) bpqk);
        } else {
            bxvd = null;
        }
        int a2 = bonp.m111368a(((bonq) bxvd2.f164949b).f133836b);
        if ((a2 == 0 || a2 == 1) && bxvd != null) {
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bpqk bpqk2 = (bpqk) bxvd.f164949b;
            bpqk bpqk3 = bpqk.f138732w;
            bpqk2.f138734a |= 1;
            bpqk2.f138735b = a;
        }
        bonq bonq3 = (bonq) bxvd2.f164949b;
        if ((bonq3.f133835a & 16) != 0) {
            bpoh bpoh = bonq3.f133840f;
            if (bpoh == null) {
                bpoh = bpoh.f138508s;
            }
            bxvd3 = (bxvd) bpoh.mo74142c(5);
            bxvd3.mo73625a((bxvk) bpoh);
        }
        int a3 = bonp.m111368a(((bonq) bxvd2.f164949b).f133836b);
        if (!(a3 == 0 || a3 != 4 || bxvd3 == null)) {
            if (bxvd3.f164950c) {
                bxvd3.mo74035c();
                bxvd3.f164950c = false;
            }
            bpoh bpoh2 = (bpoh) bxvd3.f164949b;
            bpoh bpoh3 = bpoh.f138508s;
            bpoh2.f138510a |= 1;
            bpoh2.f138511b = a;
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            bonq bonq4 = (bonq) bxvd2.f164949b;
            bpoh bpoh4 = (bpoh) bxvd3.mo74062i();
            bonq bonq5 = bonq.f133833p;
            bpoh4.getClass();
            bonq4.f133840f = bpoh4;
            bonq4.f133835a |= 16;
        }
        if (bxvd != null) {
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            bonq bonq6 = (bonq) bxvd2.f164949b;
            bpqk bpqk4 = (bpqk) bxvd.mo74062i();
            bonq bonq7 = bonq.f133833p;
            bpqk4.getClass();
            bonq6.f133837c = bpqk4;
            bonq6.f133835a |= 2;
        }
        this.f119277d.execute(new bhps(this, (int) m101286a(), this.f119275b.mo24333a((bonq) bxvd2.mo74062i())));
    }
}
