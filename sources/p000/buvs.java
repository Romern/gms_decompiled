package p000;

import com.google.android.gms.beacon.BleSettings;

/* renamed from: buvs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class buvs implements bvda {

    /* renamed from: a */
    final /* synthetic */ bvda f155074a;

    /* renamed from: b */
    final /* synthetic */ buvu f155075b;

    public buvs(buvu buvu, bvda bvda) {
        this.f155075b = buvu;
        this.f155074a = bvda;
    }

    /* renamed from: a */
    public final void mo73126a() {
        this.f155075b.f155086e.set(true);
        nem nem = new nem();
        nem.mo20538b(2);
        nem.mo20536a(this.f155075b.f155088g);
        nem.mo20537a(this.f155075b.mo73160c());
        nem.f35408a = 1;
        BleSettings a = nem.mo20533a();
        buvu buvu = this.f155075b;
        buvu.f155083b.mo73223a(buvu.f155089h, a);
        srn srn = bvcm.f155598a;
        this.f155074a.mo73126a();
    }

    /* renamed from: b */
    public final void mo73127b() {
        bnsl bnsl = (bnsl) bvcm.f155598a.mo68387b();
        bnsl.mo68437a(new IllegalStateException());
        bnsl.mo68432a("buvs", "b", 294, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Fail to enable bluetooth");
        this.f155074a.mo73127b();
    }
}
