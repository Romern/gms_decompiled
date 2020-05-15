package p000;

import android.content.Intent;
import java.io.IOException;
import java.util.concurrent.Executor;

/* renamed from: aftc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aftc implements afwn {

    /* renamed from: a */
    public static final bnsn f64700a = afvx.m53604b();

    /* renamed from: b */
    public final aecs f64701b;

    /* renamed from: c */
    public final bats f64702c;

    /* renamed from: d */
    public final afts f64703d;

    /* renamed from: e */
    private final Executor f64704e;

    public aftc(aecs aecs, afts afts, Executor executor, bats bats) {
        this.f64701b = aecs;
        this.f64703d = afts;
        this.f64704e = executor;
        this.f64702c = bats;
    }

    /* renamed from: a */
    static final /* synthetic */ Void m53526a(Boolean bool) {
        if (bool.booleanValue()) {
            bnsi d = f64700a.mo68390d();
            d.mo68432a("aftc", "a", 115, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d.mo68405a("Profile sync successfully scheduled.");
            return null;
        }
        bnsi d2 = f64700a.mo68390d();
        d2.mo68432a("aftc", "a", 117, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d2.mo68405a("Profile sync disabled.");
        return null;
    }

    /* renamed from: a */
    public final bqgg mo35017a() {
        bnsi d = f64700a.mo68390d();
        d.mo68432a("aftc", "a", 110, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68405a("Scheduling a profile sync in reaction to push message...");
        return bqdx.m112673a(this.f64701b.mo34087e(afyd.PROFILE_SYNC), aftb.f64699a, bqfb.INSTANCE);
    }

    /* renamed from: a */
    public final bqgg mo35018a(Intent intent) {
        bqgg bqgg;
        if (!cfhg.f184087a.mo6606a().mo81240d()) {
            bnsi d = f64700a.mo68390d();
            d.mo68432a("aftc", "a", 53, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d.mo68405a("Profile sync push handler disabled, skipping push message handling...");
            return bqga.m112775a((Object) null);
        } else if (!cfhg.f184087a.mo6606a().mo81241e() ? !intent.hasExtra(cfhg.f184087a.mo6606a().mo81249m()) : !(intent.hasExtra("notification_type") && "sgbe_update_profile".equals(intent.getStringExtra("notification_type")))) {
            bnsi d2 = f64700a.mo68390d();
            d2.mo68432a("aftc", "a", 58, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d2.mo68405a("Message not relevant for profile sync, skipping push message handling...");
            return bqga.m112775a((Object) null);
        } else if (!cfhg.f184087a.mo6606a().mo81239c()) {
            return mo35017a();
        } else {
            if (!intent.hasExtra("user_id")) {
                bqgg = bqga.m112775a((Object) null);
            } else {
                String stringExtra = intent.getStringExtra("user_id");
                bmxy.m108581a(stringExtra);
                bqgg = bqga.m112778a(new afsy(this, stringExtra), this.f64704e);
            }
            return bqdx.m112674a(bqdx.m112674a(bqfl.m112747c(bqgg), new afsw(this), bqfb.INSTANCE), new afsx(this), bqfb.INSTANCE);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ Void mo35019a(Exception exc) {
        int i;
        bats bats = this.f64702c;
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
