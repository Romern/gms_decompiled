package p000;

import java.io.IOException;

/* renamed from: aftf */
final /* synthetic */ class aftf implements bmxj {

    /* renamed from: a */
    private final afti f64708a;

    public aftf(afti afti) {
        this.f64708a = afti;
    }

    public final Object apply(Object obj) {
        int i;
        Exception exc = (Exception) obj;
        bats bats = this.f64708a.f64712b;
        if (!(exc instanceof IOException)) {
            i = 6;
        } else {
            i = 5;
        }
        bnsi a = bats.mo55955a(i);
        a.mo68437a(exc);
        bnsl bnsl = (bnsl) a;
        bnsl.mo68432a("afti", "a", 77, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Failed to check if account should be synced in one-off profile sync task!");
        return true;
    }
}
