package p000;

import java.util.UUID;

/* renamed from: buwu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buwu extends bvds {

    /* renamed from: a */
    public final /* synthetic */ buxb f155192a;

    public buwu(buxb buxb) {
        this.f155192a = buxb;
    }

    /* renamed from: a */
    public final void mo73217a(bvdu bvdu) {
        buxb buxb = this.f155192a;
        UUID uuid = buxb.f155203a;
        buxb.mo73226b(bvdu);
        if (bvdu instanceof buxr) {
            bnsl bnsl = (bnsl) bvcm.f155598a.mo68388c();
            bnsl.mo68432a("buwu", "a", 163, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("BluetoothMedium: Start BLE Advertising failed.");
            this.f155192a.f155215m.mo73347b(bvdu);
        } else if (sdg.m34949a(bvdu, this.f155192a.f155210h.f155262f)) {
            srn srn = bvcm.f155598a;
            this.f155192a.mo73230d();
        } else if (sdg.m34949a(bvdu, this.f155192a.f155210h.f155261e)) {
            srn srn2 = bvcm.f155598a;
            this.f155192a.mo73230d();
        } else if (this.f155192a.f155209g.mo73214m() == 2) {
            srn srn3 = bvcm.f155598a;
            this.f155192a.f155209g.mo73214m();
            this.f155192a.mo73230d();
        } else {
            buxb buxb2 = this.f155192a;
            if (buxb2.f155216n) {
                srn srn4 = bvcm.f155598a;
                buxb2.mo73230d();
                return;
            }
            srn srn5 = bvcm.f155598a;
            buxb2.f155216n = true;
            bvdt bvdt = buxb2.f155215m;
            buxv buxv = buxb2.f155210h;
            bvdu[] bvduArr = {buxv.f155262f, buxv.f155263g};
            sdo.m34959a(bvduArr);
            for (int i = 1; i >= 0; i--) {
                bvdu bvdu2 = bvduArr[i];
                sdo.m34959a(bvdu2);
                bvdt.f155672c.addFirst(bvdu2);
            }
            bvdt.mo73344a();
        }
    }
}
