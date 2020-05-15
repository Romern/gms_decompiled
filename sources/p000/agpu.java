package p000;

import android.content.ContentValues;

/* renamed from: agpu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class agpu {

    /* renamed from: a */
    private static final srn f66255a = srn.m36126a("MobileDataPlan", sgj.MOBILE_DATA_PLAN);

    /* renamed from: a */
    public static agpu m54793a(ContentValues contentValues) {
        return new agpo(contentValues);
    }

    /* renamed from: a */
    public abstract ContentValues mo35872a();

    /* renamed from: b */
    public final Long mo35896b() {
        return mo35872a().getAsLong("version_index");
    }

    /* renamed from: c */
    public final bxzx mo35897c() {
        byte[] asByteArray = mo35872a().getAsByteArray("consent_record");
        if (asByteArray == null) {
            return null;
        }
        try {
            return (bxzx) GeneratedMessageLite.m124016a(bxzx.f165197j, asByteArray, bxus.m123744c());
        } catch (bxwf e) {
            bnsl a = f66255a.mo26019b(agyt.m55307c());
            a.mo68437a(e);
            a.mo68405a("Error parsing ConsentRecord from Device Table");
            return null;
        }
    }

    /* renamed from: d */
    public final bxzy mo35898d() {
        byte[] asByteArray = mo35872a().getAsByteArray("device_info");
        if (asByteArray == null) {
            return null;
        }
        try {
            return (bxzy) GeneratedMessageLite.m124016a(bxzy.f165208b, asByteArray, bxus.m123744c());
        } catch (bxwf e) {
            bnsl a = f66255a.mo26019b(agyt.m55307c());
            a.mo68437a(e);
            a.mo68405a("Error parsing DeviceInfo from Device table");
            return null;
        }
    }

    /* renamed from: e */
    public final agpt mo35899e() {
        return new agpt(mo35872a());
    }
}
