package p000;

/* renamed from: buvv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class buvv implements bvda {

    /* renamed from: a */
    final /* synthetic */ bvda f155097a;

    /* renamed from: b */
    final /* synthetic */ buvw f155098b;

    public buvv(buvw buvw, bvda bvda) {
        this.f155098b = buvw;
        this.f155097a = bvda;
    }

    /* renamed from: a */
    public final void mo73126a() {
        buvw buvw = this.f155098b;
        int i = buvw.f155099e;
        buvw.f155103d.set(true);
        buzi buzi = this.f155098b.f155101b.f155381b;
        if (buzi == null) {
            buzi = buzi.f155382d;
        }
        String str = buzi.f155385b;
        byte[] k = this.f155098b.f155102c.f155421b.getKey();
        String valueOf = String.valueOf(str);
        String valueOf2 = String.valueOf(new ahfv(k).mo36407a());
        String str2 = valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
        buxb buxb = this.f155098b.f155100a;
        srn srn = bvcm.f155598a;
        buxv buxv = buxb.f155210h;
        buxv.getClass();
        buxb.mo73221a((bvda) null, new buxu(buxv, str2), buxb.f155210h.f155268l);
        this.f155097a.mo73126a();
    }

    /* renamed from: b */
    public final void mo73127b() {
        bnsl bnsl = (bnsl) bvcm.f155598a.mo68387b();
        bnsl.mo68437a(new IllegalStateException());
        bnsl.mo68432a("buvv", "b", 77, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Fail to enable bluetooth");
        this.f155097a.mo73127b();
    }
}
