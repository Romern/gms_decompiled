package p000;

import android.content.Context;

/* renamed from: aakl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aakl {

    /* renamed from: b */
    private static final bnhe f28368b;

    /* renamed from: c */
    private static final bnhe f28369c;

    /* renamed from: d */
    private static final bnhe f28370d;

    /* renamed from: a */
    public final aakk f28371a;

    /* renamed from: e */
    private final Context f28372e;

    static {
        bnha bnha = new bnha();
        bnha.mo67695b(aaqd.APP_WAS_IN_HIGH_USAGE_BUCKET, "USAGE_QUOTA_APP_IN_HIGH_USAGE_BUCKET");
        bnha.mo67695b(aaqd.APP_WAS_WITHIN_QUOTA, "USAGE_QUOTA_WITHIN_QUOTA");
        bnha.mo67695b(aaqd.REDUCED_MESSAGE_PRIORITY, "USAGE_QUOTA_PRIORITY_REDUCED");
        f28368b = bnha.mo67618b();
        bnha bnha2 = new bnha();
        bnha2.mo67695b(aaqg.WRITTEN_TO_DOZE_QUEUE, "DOZE_QUEUE_MESSAGE_QUEUED");
        bnha2.mo67695b(aaqg.SENT_ON_LEAVING_DOZE, "DOZE_QUEUE_SENT_ON_LEAVING_DOZE");
        bnha2.mo67695b(aaqg.SENT_ON_GMSCORE_RESTART, "DOZE_QUEUE_SENT_ON_RESTART");
        f28369c = bnha2.mo67618b();
        bnha bnha3 = new bnha();
        bnha3.mo67695b(aaqi.DOZE_QUEUE_COLLAPSED, "DOZE_QUEUE_COLLAPSED");
        bnha3.mo67695b(aaqi.DOZE_QUEUE_DROPPED_DUE_TO_DIRTY_PING, "DOZE_QUEUE_DROPPED_DIRTY_PING");
        bnha3.mo67695b(aaqi.TTL_ZERO, "DOZE_QUEUE_DROPPED_TTL_0");
        bnha3.mo67695b(aaqi.TTL_EXPIRED, "DOZE_QUEUE_DROPPED_EXPIRED");
        f28370d = bnha3.mo67618b();
    }

    public aakl(Context context, aakk aakk) {
        this.f28372e = context;
        this.f28371a = aakk;
    }

    /* renamed from: a */
    public final void mo16932a(aamh aamh, String str, int i, aaqg aaqg) {
        if (cecn.m136008b()) {
            bxvd da = aaqk.f28904k.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            aaqk aaqk = (aaqk) da.f164949b;
            str.getClass();
            int i2 = aaqk.f28906a | 1;
            aaqk.f28906a = i2;
            aaqk.f28909d = str;
            String str2 = aamh.f28457a;
            str2.getClass();
            int i3 = i2 | 2;
            aaqk.f28906a = i3;
            aaqk.f28910e = str2;
            int i4 = aamh.f28458b;
            int i5 = i3 | 4;
            aaqk.f28906a = i5;
            aaqk.f28911f = i4;
            aaqk.f28906a = i5 | 8;
            aaqk.f28912g = i;
            aaqk.f28908c = Integer.valueOf(aaqg.f28888e);
            aaqk.f28907b = 7;
            if (cecz.m136063k()) {
                int a = aamm.m21537a(this.f28372e);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                aaqk aaqk2 = (aaqk) da.f164949b;
                aaqk2.f28915j = a - 1;
                aaqk2.f28906a |= 64;
            }
            aakk aakk = this.f28371a;
            bxvd da2 = aaql.f28916c.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            aaql aaql = (aaql) da2.f164949b;
            aaqk aaqk3 = (aaqk) da.mo74062i();
            aaqk3.getClass();
            aaql.f28919b = aaqk3;
            aaql.f28918a |= 4;
            aakk.mo16931a((aaql) da2.mo74062i());
        }
        if (f28369c.containsKey(aaqg)) {
            this.f28371a.f28364a.mo24383c((String) f28369c.get(aaqg)).mo24359a();
        }
    }

    /* renamed from: a */
    public final void mo16933a(aamh aamh, String str, int i, aaqi aaqi) {
        if (cecn.m136008b()) {
            bxvd da = aaqk.f28904k.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            aaqk aaqk = (aaqk) da.f164949b;
            str.getClass();
            int i2 = aaqk.f28906a | 1;
            aaqk.f28906a = i2;
            aaqk.f28909d = str;
            String str2 = aamh.f28457a;
            str2.getClass();
            int i3 = i2 | 2;
            aaqk.f28906a = i3;
            aaqk.f28910e = str2;
            int i4 = aamh.f28458b;
            int i5 = i3 | 4;
            aaqk.f28906a = i5;
            aaqk.f28911f = i4;
            aaqk.f28906a = i5 | 8;
            aaqk.f28912g = i;
            aaqk.f28908c = Integer.valueOf(aaqi.f28902l);
            aaqk.f28907b = 5;
            aaqk aaqk2 = (aaqk) da.mo74062i();
            aakk aakk = this.f28371a;
            bxvd da2 = aaql.f28916c.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            aaql aaql = (aaql) da2.f164949b;
            aaqk2.getClass();
            aaql.f28919b = aaqk2;
            aaql.f28918a |= 4;
            aakk.mo16931a((aaql) da2.mo74062i());
        }
        if (f28370d.containsKey(aaqi)) {
            this.f28371a.f28364a.mo24383c((String) f28370d.get(aaqi)).mo24359a();
        }
    }

    /* renamed from: a */
    public final void mo16934a(bxvd bxvd, aaqd aaqd) {
        if (cebv.f182235a.mo6606a().mo78742a()) {
            aakk aakk = this.f28371a;
            bxvd da = aaql.f28916c.mo74144da();
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            aaqk aaqk = (aaqk) bxvd.f164949b;
            aaqk aaqk2 = aaqk.f28904k;
            aaqk.f28908c = Integer.valueOf(aaqd.f28880f);
            aaqk.f28907b = 8;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            aaql aaql = (aaql) da.f164949b;
            aaqk aaqk3 = (aaqk) bxvd.mo74062i();
            aaqk3.getClass();
            aaql.f28919b = aaqk3;
            aaql.f28918a |= 4;
            aakk.mo16931a((aaql) da.mo74062i());
        }
        if (f28368b.containsKey(aaqd)) {
            this.f28371a.f28364a.mo24383c((String) f28368b.get(aaqd)).mo24359a();
        }
    }
}
