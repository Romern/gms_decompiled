package p000;

import android.content.Context;
import com.google.android.gms.pseudonymous.PseudonymousIdToken;

/* renamed from: anil */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anil implements bdza {

    /* renamed from: a */
    private final Context f76947a;

    public anil(Context context) {
        this.f76947a = context;
    }

    /* renamed from: a */
    public final String mo25222a() {
        return aooo.m66219b(this.f76947a).f83468a;
    }

    /* renamed from: a */
    public final void mo25223a(aooe aooe) {
        if (cgem.m144890e()) {
            aoop.m66223a(aooe, this.f76947a);
        } else {
            aoop.m66225a(new PseudonymousIdToken(((aonu) aooe).f78594a), this.f76947a);
        }
    }
}
