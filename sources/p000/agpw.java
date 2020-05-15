package p000;

import android.content.ContentValues;

/* renamed from: agpw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class agpw {

    /* renamed from: a */
    private static final srn f66257a = srn.m36126a("MobileDataPlan", sgj.MOBILE_DATA_PLAN);

    /* renamed from: a */
    public static agpw m54810a(ContentValues contentValues) {
        return new agpp(contentValues);
    }

    /* renamed from: a */
    public abstract ContentValues mo35876a();

    /* renamed from: b */
    public final String mo35911b() {
        return mo35876a().getAsString("iccid");
    }

    /* renamed from: c */
    public final Long mo35912c() {
        return mo35876a().getAsLong("carrier_id");
    }

    /* renamed from: d */
    public final String mo35913d() {
        return mo35876a().getAsString("cpid");
    }

    /* renamed from: e */
    public final Long mo35914e() {
        return mo35876a().getAsLong("expiration_time");
    }

    /* renamed from: f */
    public final btas mo35915f() {
        byte[] asByteArray = mo35876a().getAsByteArray("notification_stats");
        if (asByteArray == null) {
            return null;
        }
        try {
            return (btas) GeneratedMessageLite.m124016a(btas.f148044c, asByteArray, bxus.m123744c());
        } catch (bxwf e) {
            bnsl a = f66257a.mo26019b(agyt.m55307c());
            a.mo68437a(e);
            a.mo68405a("Error parsing NotificationStats from SIM table");
            return null;
        }
    }

    /* renamed from: g */
    public final bxzx mo35916g() {
        byte[] asByteArray = mo35876a().getAsByteArray("consent_record");
        if (asByteArray == null) {
            return null;
        }
        try {
            return (bxzx) GeneratedMessageLite.m124016a(bxzx.f165197j, asByteArray, bxus.m123744c());
        } catch (bxwf e) {
            bnsl a = f66257a.mo26019b(agyt.m55307c());
            a.mo68437a(e);
            a.mo68405a("Error parsing ConsentRecord from SIM table");
            return null;
        }
    }

    /* renamed from: h */
    public final bxzz mo35917h() {
        byte[] asByteArray = mo35876a().getAsByteArray("sim_extra");
        if (asByteArray == null) {
            return null;
        }
        try {
            return (bxzz) GeneratedMessageLite.m124016a(bxzz.f165211e, asByteArray, bxus.m123744c());
        } catch (bxwf e) {
            bnsl a = f66257a.mo26019b(agyt.m55307c());
            a.mo68437a(e);
            a.mo68405a("Error parsing SimExtra from SIM table");
            return null;
        }
    }

    /* renamed from: i */
    public final agpv mo35918i() {
        return new agpv(mo35876a());
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("icccid", mo35911b());
        a.mo25396a("carrier_id", mo35912c());
        a.mo25396a("sim_state", mo35876a().getAsInteger("sim_state"));
        a.mo25396a("carrier_cpid", mo35913d());
        a.mo25396a("exp_time", mo35914e());
        a.mo25396a("notification_stats", mo35915f());
        a.mo25396a("consent_record", mo35916g());
        a.mo25396a("sim_extra", mo35917h());
        return a.toString();
    }
}
