package p000;

import java.io.IOException;

/* renamed from: afta */
final /* synthetic */ class afta implements bmxj {

    /* renamed from: a */
    private final aftc f64698a;

    public afta(aftc aftc) {
        this.f64698a = aftc;
    }

    public final Object apply(Object obj) {
        int i;
        Exception exc = (Exception) obj;
        bats bats = this.f64698a.f64702c;
        if (!(exc instanceof IOException)) {
            i = 6;
        } else {
            i = 5;
        }
        bnsi a = bats.mo55955a(i);
        a.mo68437a(exc);
        bnsl bnsl = (bnsl) a;
        bnsl.mo68432a("aftc", "a", 102, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Failed to notify account that profile push occurred!");
        return null;
    }
}
