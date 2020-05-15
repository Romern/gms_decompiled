package p000;

import android.os.Bundle;
import com.google.android.gms.mobiledataplan.MdpDataPlanStatus;
import com.google.android.gms.mobiledataplan.MdpDataPlanStatusResponse;
import com.google.android.gms.mobiledataplan.WalletBalanceInfo;

/* renamed from: agor */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agor {

    /* renamed from: a */
    public String f66188a;

    /* renamed from: b */
    public MdpDataPlanStatus[] f66189b;

    /* renamed from: c */
    public Bundle f66190c;

    /* renamed from: d */
    public String f66191d;

    /* renamed from: e */
    public WalletBalanceInfo f66192e;

    /* renamed from: f */
    public Integer f66193f;

    /* renamed from: g */
    public Long f66194g;

    /* renamed from: h */
    private Long f66195h;

    public agor() {
        this.f66188a = null;
        this.f66189b = null;
        this.f66190c = null;
        this.f66191d = null;
        this.f66192e = null;
        this.f66193f = null;
        this.f66194g = null;
        this.f66195h = 0L;
    }

    /* renamed from: a */
    public final MdpDataPlanStatusResponse mo35800a() {
        return new MdpDataPlanStatusResponse(this.f66188a, this.f66189b, this.f66190c, this.f66191d, this.f66192e, this.f66193f, this.f66194g, this.f66195h);
    }

    /* renamed from: a */
    public final void mo35801a(bxyk bxyk) {
        this.f66195h = bxyk != null ? Long.valueOf(bxzt.m124578a(bxyk)) : null;
    }

    public agor(MdpDataPlanStatusResponse mdpDataPlanStatusResponse) {
        this.f66188a = mdpDataPlanStatusResponse.f80186a;
        this.f66189b = mdpDataPlanStatusResponse.f80187b;
        this.f66190c = mdpDataPlanStatusResponse.f80188c;
        this.f66191d = mdpDataPlanStatusResponse.f80189d;
        this.f66192e = mdpDataPlanStatusResponse.f80190e;
        this.f66193f = mdpDataPlanStatusResponse.f80191f;
        this.f66194g = mdpDataPlanStatusResponse.f80192g;
        this.f66195h = mdpDataPlanStatusResponse.f80193h;
    }
}
