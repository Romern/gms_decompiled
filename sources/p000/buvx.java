package p000;

import android.content.IntentFilter;

/* renamed from: buvx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class buvx implements bvda {

    /* renamed from: a */
    final /* synthetic */ bvda f155104a;

    /* renamed from: b */
    final /* synthetic */ buvy f155105b;

    public buvx(buvy buvy, bvda bvda) {
        this.f155105b = buvy;
        this.f155104a = bvda;
    }

    /* renamed from: a */
    public final void mo73126a() {
        this.f155105b.f155107b.set(true);
        IntentFilter intentFilter = new IntentFilter("android.bluetooth.device.action.FOUND");
        buvy buvy = this.f155105b;
        buxb buxb = buvy.f155106a;
        buxb.f155211i.registerReceiver(buvy.f155110e, intentFilter, null, buxb.f155213k);
        this.f155105b.f155106a.mo73232f();
        srn srn = bvcm.f155598a;
        this.f155104a.mo73126a();
    }

    /* renamed from: b */
    public final void mo73127b() {
        bnsl bnsl = (bnsl) bvcm.f155598a.mo68387b();
        bnsl.mo68437a(new IllegalStateException());
        bnsl.mo68432a("buvx", "b", 100, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Fail to enable bluetooth");
        this.f155104a.mo73127b();
    }
}
