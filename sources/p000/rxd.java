package p000;

import android.content.Context;
import com.google.android.gms.pseudonymous.PseudonymousIdToken;

/* renamed from: rxd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class rxd implements bdza {

    /* renamed from: a */
    private final Context f43803a;

    public rxd(Context context) {
        this.f43803a = context;
    }

    /* renamed from: a */
    public final String mo25222a() {
        return aooo.m66219b(this.f43803a).f83468a;
    }

    /* renamed from: a */
    public final void mo25223a(aooe aooe) {
        if (cgem.m144890e()) {
            aoop.m66224a(aooe, this.f43803a, (qxq) null);
        } else {
            aoop.m66226a(new PseudonymousIdToken(((aonu) aooe).f78594a), this.f43803a, (qxq) null);
        }
    }
}
