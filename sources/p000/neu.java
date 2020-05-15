package p000;

import android.content.Context;
import com.google.android.gms.beacon.BleSettings;

/* renamed from: neu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class neu extends rjx implements neg {

    /* renamed from: a */
    public final nfs f35424a;

    public neu(Context context) {
        super(context, nef.f35385a, (rjk) null, rjw.f43159a);
        if (nfs.f35464a == null) {
            synchronized (nfs.class) {
                if (nfs.f35464a == null) {
                    nfs.f35464a = new nfs();
                }
            }
        }
        this.f35424a = nfs.f35464a;
    }

    /* renamed from: a */
    public final aucb mo20512a() {
        roz b = rpa.m34196b();
        b.f43472a = ner.f35421a;
        return mo24701a(b.mo24977a());
    }

    /* renamed from: a */
    public final aucb mo20513a(nej nej) {
        return mo24698a(roe.m34171a(nej, neu.class.getSimpleName()));
    }

    /* renamed from: a */
    public final aucb mo20514a(nej nej, BleSettings bleSettings) {
        rod a = this.f35424a.mo20569a(nej, neu.class.getSimpleName());
        nep nep = new nep(this, nej, a, bleSettings);
        neq neq = new neq(this, nej, a);
        rom a2 = ron.m34179a();
        a2.f43443a = nep;
        a2.f43444b = neq;
        a2.f43445c = a;
        return mo24700a(a2.mo24973a());
    }
}
