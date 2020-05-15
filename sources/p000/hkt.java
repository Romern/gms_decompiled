package p000;

import android.content.pm.PackageManager;
import java.util.concurrent.TimeUnit;

/* renamed from: hkt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hkt implements hep {

    /* renamed from: a */
    private final String f19960a;

    public hkt(String str) {
        sdo.m34977c(str);
        this.f19960a = str;
    }

    /* renamed from: a */
    public final adbj mo12290a() {
        return adbj.AUTH_API_CREDENTIALS_INTERNAL_RESET_SIGN_IN_CANCELLATION_COUNTER;
    }

    /* renamed from: a */
    public final bqgg mo12291a(hez hez) {
        try {
            ((hje) hje.f19881a.mo33309a()).mo12574a(this.f19960a, 0, TimeUnit.MINUTES);
            return bqga.m112775a((Object) null);
        } catch (PackageManager.NameNotFoundException e) {
            throw adbe.m50106a(28442);
        }
    }
}
