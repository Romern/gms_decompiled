package com.google.android.gms.thunderbird;

import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ThunderbirdGcmTaskChimeraService extends aeah {

    /* renamed from: a */
    private qws f109062a;

    /* renamed from: b */
    private rjx f109063b;

    /* renamed from: a */
    public final int mo6269a(aecc aecc) {
        String str = aecc.f63128a;
        if (((str.hashCode() == -18452444 && str.equals("PeriodicLogging")) ? (char) 0 : 65535) != 0) {
            auho.m77069a(this, new IllegalStateException());
            return 2;
        }
        try {
            if (!((rkj) aucu.m76782a(this.f109063b.mo24673E())).mo24824r()) {
                aeat.m51532a(this).mo33986a("PeriodicLogging", "com.google.android.gms.thunderbird.ThunderbirdGcmTaskService");
                return 0;
            } else if (Math.random() >= cgyq.f188062a.mo6606a().mo84774r()) {
                return 0;
            } else {
                bxvd da = bokz.f133479h.mo74144da();
                bxvd da2 = boky.f133475c.mo74144da();
                boolean a = auhf.m77066a(this);
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                boky boky = (boky) da2.f164949b;
                boky.f133477a |= 1;
                boky.f133478b = a;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bokz bokz = (bokz) da.f164949b;
                boky boky2 = (boky) da2.mo74062i();
                boky2.getClass();
                bokz.f133482b = boky2;
                bokz.f133481a |= 1;
                this.f109062a.mo24335a(((bokz) da.mo74062i()).mo73642k()).mo24327b();
                return 0;
            }
        } catch (ExecutionException e) {
            if (!(e.getCause() instanceof rjp) || ((rjp) e.getCause()).mo24655a() != 17) {
                auho.m77069a(this, e);
                return 2;
            }
        } catch (InterruptedException e2) {
        }
        return 2;
    }

    public final void onCreate() {
        super.onCreate();
        this.f109063b = avtz.m79338b(this);
        qws a = qws.m33019a(this, "THUNDERBIRD");
        if (this.f109062a == null) {
            this.f109062a = a;
            a.mo24337a(cagz.UNMETERED_OR_DAILY);
        }
    }
}
