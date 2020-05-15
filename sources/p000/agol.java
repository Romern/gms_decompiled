package p000;

import com.google.android.gms.mobiledataplan.MdpCarrierPlanIdResponse;
import com.google.android.gms.mobiledataplan.carriersupport.CarrierSupportInfo;

/* renamed from: agol */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agol {

    /* renamed from: a */
    public String f66176a;

    /* renamed from: b */
    public String f66177b;

    /* renamed from: c */
    public String f66178c;

    /* renamed from: d */
    public long f66179d;

    /* renamed from: e */
    public String f66180e;

    /* renamed from: f */
    public int f66181f;

    /* renamed from: g */
    public CarrierSupportInfo f66182g;

    /* renamed from: h */
    public Integer f66183h;

    /* renamed from: i */
    public Long f66184i;

    /* renamed from: j */
    private final long f66185j;

    public agol(MdpCarrierPlanIdResponse mdpCarrierPlanIdResponse) {
        this.f66176a = mdpCarrierPlanIdResponse.f80151a;
        this.f66185j = mdpCarrierPlanIdResponse.f80152b;
        this.f66177b = mdpCarrierPlanIdResponse.f80153c;
        this.f66178c = mdpCarrierPlanIdResponse.f80154d;
        this.f66179d = mdpCarrierPlanIdResponse.f80155e;
        this.f66180e = mdpCarrierPlanIdResponse.f80156f;
        this.f66181f = mdpCarrierPlanIdResponse.f80157g;
        this.f66182g = mdpCarrierPlanIdResponse.f80158h;
        this.f66183h = mdpCarrierPlanIdResponse.f80159i;
        this.f66184i = mdpCarrierPlanIdResponse.f80160j;
    }

    /* renamed from: a */
    public final MdpCarrierPlanIdResponse mo35778a() {
        return new MdpCarrierPlanIdResponse(this.f66176a, this.f66185j, this.f66177b, this.f66178c, this.f66179d, this.f66180e, this.f66181f, this.f66182g, this.f66183h, this.f66184i);
    }

    public agol(String str, long j) {
        this.f66176a = str;
        this.f66185j = j;
    }
}
