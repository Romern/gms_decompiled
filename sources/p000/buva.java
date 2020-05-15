package p000;

/* renamed from: buva */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class buva implements bvda {

    /* renamed from: a */
    final /* synthetic */ bvda f155022a;

    /* renamed from: b */
    final /* synthetic */ buvb f155023b;

    public buva(buvb buvb, bvda bvda) {
        this.f155023b = buvb;
        this.f155022a = bvda;
    }

    /* renamed from: a */
    public final void mo73126a() {
        Boolean bool;
        this.f155023b.f155026c.set(true);
        buyx buyx = this.f155023b.f155027d;
        if ((buyx.f155355a & 1) != 0) {
            bool = Boolean.valueOf(buyx.f155356b);
        } else {
            bool = null;
        }
        if (bool == null) {
            bool = false;
        }
        buvb buvb = this.f155023b;
        buxb buxb = buvb.f155024a;
        ahfv ahfv = new ahfv(buvb.f155025b.f155421b.mo73780k());
        boolean booleanValue = bool.booleanValue();
        buyv a = buyv.m120788a(this.f155023b.f155027d.f155357c);
        if (a == null) {
            a = buyv.BLE_ADVERTISE_DATA_TYPE_UNKNOWN;
        }
        srn srn = bvcm.f155598a;
        buxv buxv = buxb.f155210h;
        buxv.getClass();
        buxb.mo73221a((bvda) null, new buxr(buxv, ahfv, booleanValue, a));
        this.f155022a.mo73126a();
    }

    /* renamed from: b */
    public final void mo73127b() {
        bnsl bnsl = (bnsl) bvcm.f155598a.mo68387b();
        bnsl.mo68437a(new IllegalStateException());
        bnsl.mo68432a("buva", "b", 85, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Fail to enable bluetooth");
        this.f155022a.mo73127b();
    }
}
