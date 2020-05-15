package p000;

import android.content.ContentResolver;

/* renamed from: amtf */
final /* synthetic */ class amtf implements C0038ax {

    /* renamed from: a */
    private final amti f75894a;

    public amtf(amti amti) {
        this.f75894a = amti;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: amti.a(int, boolean):void
     arg types: [int, int]
     candidates:
      amti.a(int, aucb):void
      amti.a(int, boolean):void */
    /* renamed from: a */
    public final void mo2511a(Object obj) {
        amti amti = this.f75894a;
        aucb aucb = (aucb) obj;
        amti.mo41323a(3, aucb);
        if (aucb.mo50384b()) {
            if (cfus.m143104b()) {
                ContentResolver.cancelSync(amti.f75897a, "com.android.contacts");
            }
            amti.mo41324a(10, false);
            if (cfut.m143115d()) {
                amti.f75901e.mo2444a(amti);
            }
            amti.f75901e = amti.f75898b.mo41344c();
            amti.f75901e.mo2445a(amti, new amsw(amti));
            amti.mo41321a();
        } else if (cfut.m143116e()) {
            amti.mo41329c();
        }
    }
}
