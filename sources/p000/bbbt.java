package p000;

import android.net.Uri;
import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* renamed from: bbbt */
final /* synthetic */ class bbbt implements bmxj {

    /* renamed from: a */
    private final bauy f102289a;

    public bbbt(bauy bauy) {
        this.f102289a = bauy;
    }

    public final Object apply(Object obj) {
        bauy bauy = this.f102289a;
        Uri uri = (Uri) obj;
        if (uri == null || (bauy.f101849a & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0) {
            return uri;
        }
        bzny bzny = bauy.f101858j;
        if (bzny == null) {
            bzny = bzny.f170777b;
        }
        return (!ceni.f183073a.mo6606a().mo79429f() || bzny.f170779a.size() == 0) ? uri : uri.buildUpon().encodedFragment(beij.m95138a(bzny)).build();
    }
}
