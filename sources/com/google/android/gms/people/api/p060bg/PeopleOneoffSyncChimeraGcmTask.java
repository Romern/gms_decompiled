package com.google.android.gms.people.api.p060bg;

/* renamed from: com.google.android.gms.people.api.bg.PeopleOneoffSyncChimeraGcmTask */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PeopleOneoffSyncChimeraGcmTask extends aeah {
    /* renamed from: a */
    public final int mo6269a(aecc aecc) {
        int i;
        amea.m62724a(this).mo41135a();
        aeat a = almz.m61376a(getApplicationContext());
        aebl aebl = new aebl();
        aebl.f63099k = "PeoplePeriodicSyncGcmTask";
        aebl.f63097i = "com.google.android.gms.people.service.bg.PeoplePeriodicSyncGcmTask";
        aebl.f63070a = cgbe.m144178g();
        aebl.mo34023a((int) cgbe.m144180i());
        boolean h = cgbe.m144179h();
        if (cdny.m134338c() || cgbe.m144179h()) {
            i = 1;
        } else {
            i = 0;
        }
        aebl.mo34024a(h ? 1 : 0, i);
        aebl.f63071b = cgbe.m144177f();
        aebl.mo34027b(1);
        a.mo33984a(aebl.mo33974b());
        return 0;
    }
}
