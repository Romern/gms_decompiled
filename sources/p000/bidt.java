package p000;

import java.util.concurrent.Callable;

/* renamed from: bidt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bidt implements Callable {

    /* renamed from: a */
    final /* synthetic */ bidv f120321a;

    /* renamed from: b */
    private final String f120322b;

    public bidt(bidv bidv, String str) {
        this.f120321a = bidv;
        this.f120322b = str;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        bhqi bhqi = null;
        if (this.f120322b != null && cggg.m145198b()) {
            bhqy bhqy = this.f120321a.f120336k;
            String str = this.f120322b;
            bhsi bhsi = (bhsi) bhqy;
            if (!bhsi.f119449d) {
                bhuj.m101555a();
                return null;
            } else if (str != null) {
                bhro bhro = (bhro) bhsi.f119448c.get(str);
                if (bhro != null) {
                    bhqi = bhro.mo64189a();
                }
                if (bhqi == null) {
                    return bhsi.mo64218a(bhsi.f119450e.mo64189a());
                }
                return bhsi.mo64218a(bhqi);
            } else {
                bhuj.m101555a().mo64361c("Account name cannot be null.");
                return null;
            }
        } else {
            bhsi bhsi2 = (bhsi) this.f120321a.f120336k;
            if (bhsi2.f119449d) {
                return bhsi2.mo64218a(bhsi2.f119450e.mo64189a());
            }
            bhuj.m101555a();
            return null;
        }
    }
}
