package p000;

import android.content.ContentValues;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/* renamed from: agps */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class agps {

    /* renamed from: a */
    private static final srn f66253a = srn.m36126a("MobileDataPlan", sgj.MOBILE_DATA_PLAN);

    /* renamed from: a */
    public static agps m54783a(ContentValues contentValues) {
        return new agpn(contentValues);
    }

    /* renamed from: a */
    public abstract ContentValues mo35868a();

    /* renamed from: b */
    public final Long mo35888b() {
        return mo35868a().getAsLong("carrier_id");
    }

    /* renamed from: c */
    public final btap mo35889c() {
        byte[] asByteArray = mo35868a().getAsByteArray("list_cpid_endpoints_resp");
        if (asByteArray == null) {
            return null;
        }
        try {
            return (btap) GeneratedMessageLite.m124016a(btap.f148027h, asByteArray, bxus.m123744c());
        } catch (bxwf e) {
            bnsl a = f66253a.mo26019b(agyt.m55307c());
            a.mo68437a(e);
            a.mo68405a("Parsing ListCpidEndpointsResponse from database carrier table error");
            return null;
        }
    }

    /* renamed from: d */
    public final Bitmap mo35890d() {
        byte[] asByteArray = mo35868a().getAsByteArray("carrier_logo");
        if (asByteArray != null) {
            return BitmapFactory.decodeByteArray(asByteArray, 0, asByteArray.length);
        }
        return null;
    }

    /* renamed from: e */
    public final Long mo35891e() {
        return mo35868a().getAsLong("expiration_time");
    }

    /* renamed from: f */
    public final bxzw mo35892f() {
        byte[] asByteArray = mo35868a().getAsByteArray("carrier_extra");
        if (asByteArray == null) {
            return null;
        }
        try {
            return (bxzw) GeneratedMessageLite.m124016a(bxzw.f165192d, asByteArray, bxus.m123744c());
        } catch (bxwf e) {
            bnsl a = f66253a.mo26019b(agyt.m55307c());
            a.mo68437a(e);
            a.mo68405a("Error parsing CarrierExtra from SIM table");
            return null;
        }
    }
}
