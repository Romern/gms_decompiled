package p000;

import android.os.SystemClock;
import java.util.UUID;

/* renamed from: bvdr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bvdr extends buqn {

    /* renamed from: a */
    final /* synthetic */ bvdt f155669a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bvdr(bvdt bvdt, String str) {
        super(str);
        this.f155669a = bvdt;
    }

    public final void run() {
        long j;
        this.f155669a.f155671b.mo72989e(this);
        bvdu bvdu = (bvdu) this.f155669a.f155672c.peek();
        if (bvdu == null) {
            srn srn = bvcm.f155598a;
            buxb buxb = ((buwu) this.f155669a.f155678i).f155192a;
            UUID uuid = buxb.f155203a;
            buxb.mo73235i();
        } else if (bvdu.mo73237b()) {
            this.f155669a.f155672c.removeFirst();
            bvds bvds = this.f155669a.f155678i;
            srn srn2 = bvcm.f155598a;
            buwu buwu = (buwu) bvds;
            buxb buxb2 = buwu.f155192a;
            UUID uuid2 = buxb.f155203a;
            for (bvda bvda : ((bndq) buxb2.f155218p).mo67272e(bvdu)) {
                bvda.mo73126a();
            }
            buxb buxb3 = buwu.f155192a;
            if (buxb3.f155217o && sdg.m34949a(bvdu, buxb3.f155210h.f155273q)) {
                buwu.f155192a.f155217o = false;
            }
            this.f155669a.mo73344a();
        } else {
            bvdt bvdt = this.f155669a;
            if (bvdt.f155673d < bvdt.f155670a) {
                long b = bvdt.mo73346b();
                buxb buxb4 = this.f155669a.f155679j;
                UUID uuid3 = buxb.f155203a;
                byyb byyb = buxb4.f155212j.f155567b.f168924g;
                if (byyb == null) {
                    byyb = byyb.f168875j;
                }
                long j2 = byyb.f168883g;
                if (this.f155669a.f155673d != 0) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    bvdt bvdt2 = this.f155669a;
                    long j3 = elapsedRealtime - bvdt2.f155674e;
                    j = bvdt2.f155676g ? bvdu.mo73239d() - j3 : b - j3;
                } else {
                    j = j2 - (SystemClock.elapsedRealtime() - this.f155669a.f155675f);
                }
                if (j <= 0) {
                    bvdu a = bvdu.mo73236a();
                    if (a == null) {
                        this.f155669a.f155676g = bvdu.mo73238c();
                        bvdt bvdt3 = this.f155669a;
                        bvdt3.f155673d++;
                        bvdt3.f155674e = SystemClock.elapsedRealtime();
                        bvdt bvdt4 = this.f155669a;
                        if (bvdt4.f155676g) {
                            srn srn3 = bvcm.f155598a;
                            bvdt4.f155671b.mo72987c(this);
                            return;
                        }
                        long b2 = bvdt4.mo73346b();
                        srn srn4 = bvcm.f155598a;
                        this.f155669a.f155671b.mo72983a(this, b2);
                        return;
                    }
                    srn srn5 = bvcm.f155598a;
                    this.f155669a.f155672c.addFirst(a);
                    this.f155669a.mo73344a();
                    return;
                }
                srn srn6 = bvcm.f155598a;
                this.f155669a.f155671b.mo72983a(this, j);
                return;
            }
            buwu buwu2 = (buwu) bvdt.f155678i;
            buxb buxb5 = buwu2.f155192a;
            UUID uuid4 = buxb.f155203a;
            buxb5.mo73226b(bvdu);
            if (bvdu instanceof buxr) {
                bnsl bnsl = (bnsl) bvcm.f155598a.mo68388c();
                bnsl.mo68432a("buwu", "a", 163, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("BluetoothMedium: Start BLE Advertising failed.");
                buwu2.f155192a.f155215m.mo73347b(bvdu);
            } else if (sdg.m34949a(bvdu, buwu2.f155192a.f155210h.f155262f)) {
                srn srn7 = bvcm.f155598a;
                buwu2.f155192a.mo73230d();
            } else if (sdg.m34949a(bvdu, buwu2.f155192a.f155210h.f155261e)) {
                srn srn8 = bvcm.f155598a;
                buwu2.f155192a.mo73230d();
            } else if (buwu2.f155192a.f155209g.mo73214m() == 2) {
                srn srn9 = bvcm.f155598a;
                buwu2.f155192a.f155209g.mo73214m();
                buwu2.f155192a.mo73230d();
            } else {
                buxb buxb6 = buwu2.f155192a;
                if (buxb6.f155216n) {
                    srn srn10 = bvcm.f155598a;
                    buxb6.mo73230d();
                    return;
                }
                srn srn11 = bvcm.f155598a;
                buxb6.f155216n = true;
                bvdt bvdt5 = buxb6.f155215m;
                buxv buxv = buxb6.f155210h;
                bvdu[] bvduArr = {buxv.f155262f, buxv.f155263g};
                sdo.m34959a(bvduArr);
                for (int i = 1; i >= 0; i--) {
                    bvdu bvdu2 = bvduArr[i];
                    sdo.m34959a(bvdu2);
                    bvdt5.f155672c.addFirst(bvdu2);
                }
                bvdt5.mo73344a();
            }
        }
    }
}
