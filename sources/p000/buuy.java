package p000;

import java.io.IOException;

/* renamed from: buuy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class buuy implements bvbr {

    /* renamed from: a */
    final /* synthetic */ bvat f155014a;

    /* renamed from: b */
    final /* synthetic */ buuz f155015b;

    public buuy(buuz buuz, bvat bvat) {
        this.f155015b = buuz;
        this.f155014a = bvat;
    }

    /* renamed from: a */
    public final void mo73116a() {
        this.f155015b.mo73120a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0178, code lost:
        if (r10.mo73146d() == false) goto L_0x0191;
     */
    public final void run() {
        buuz buuz = this.f155015b;
        buzt buzt = buuz.f155019d.f155394b;
        if (buzt == null) {
            buzt = buzt.f155423f;
        }
        buuz.f155020e = buuz.mo73119a(buzt);
        buuz buuz2 = this.f155015b;
        bvbw bvbw = buuz2.f155020e;
        if (bvbw != null) {
            try {
                bvbw.mo73144c();
                if (buuz2.f155020e.mo73148f()) {
                    bvbw bvbw2 = buuz2.f155020e;
                    byte[] bArr = new byte[1];
                    int a = buzs.m120815a(buuz2.f155019d.f155396d);
                    if (a == 0) {
                        a = 1;
                    }
                    bArr[0] = (byte) (a - 1);
                    bvbw2.mo73142a(bArr);
                } else {
                    byte[] b = buuz2.f155020e.mo73143b();
                    if (b == null || b.length != 1) {
                        throw new IOException("Unexpected data while negotiating encryption type");
                    }
                    int a2 = buzs.m120815a(buuz2.f155019d.f155396d);
                    if (a2 != 0 && a2 == 4) {
                        buzk buzk = buuz2.f155019d;
                        bxvd bxvd = (bxvd) buzk.mo74142c(5);
                        bxvd.mo73625a((bxvk) buzk);
                        int a3 = buzs.m120815a(b[0]);
                        if (bxvd.f164950c) {
                            bxvd.mo74035c();
                            bxvd.f164950c = false;
                        }
                        buzk buzk2 = (buzk) bxvd.f164949b;
                        buzk buzk3 = buzk.f155391e;
                        int i = a3 - 1;
                        if (a3 != 0) {
                            buzk2.f155396d = i;
                            buzk2.f155393a |= 4;
                            buuz2.f155019d = (buzk) bxvd.mo74062i();
                        } else {
                            throw null;
                        }
                    }
                }
                int a4 = buzs.m120815a(this.f155015b.f155019d.f155396d);
                if (a4 == 0) {
                    a4 = 1;
                }
                int i2 = a4 - 1;
                if (i2 == 0) {
                    srn srn = bvcm.f155598a;
                    buuz buuz3 = this.f155015b;
                    buuz3.f155021f = buuz3.f155020e;
                } else if (i2 == 1) {
                    srn srn2 = bvcm.f155598a;
                    buuz buuz4 = this.f155015b;
                    buuz4.f155021f = new bvcz(buuz4.f155020e, buuz4.f155019d.f155395c.mo73780k());
                } else if (i2 == 2) {
                    srn srn3 = bvcm.f155598a;
                    buuz buuz5 = this.f155015b;
                    buuz5.f155021f = new bvcy(buuz5.f155020e);
                } else {
                    throw new RuntimeException("Unrecognized encryption type");
                }
                try {
                    this.f155015b.f155021f.mo73144c();
                } catch (IOException e) {
                    bnsl bnsl = (bnsl) bvcm.f155598a.mo68387b();
                    bnsl.mo68437a(e);
                    bnsl.mo68432a("buuy", "run", 91, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("Connection.connect() failed on IOException.");
                }
                buuz buuz6 = this.f155015b;
                buuz6.f155018c.mo73292a(buuz6.f155021f);
                int a5 = buzs.m120815a(this.f155015b.f155019d.f155396d);
                if (a5 != 0 && a5 == 3) {
                    try {
                        buuz buuz7 = this.f155015b;
                        bvcy bvcy = (bvcy) buuz7.f155021f;
                        bvat bvat = this.f155014a;
                        String i3 = bvcy.mo73330i();
                        bxvd da = buzl.f155397g.mo74144da();
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        buzl buzl = (buzl) da.f164949b;
                        buzl.f155401c = 5;
                        int i4 = buzl.f155399a | 2;
                        buzl.f155399a = i4;
                        i3.getClass();
                        buzl.f155399a = i4 | 16;
                        buzl.f155404f = i3;
                        bvat.mo36284a((buzl) da.mo74062i());
                        if (bvcy.mo73148f()) {
                            if (buuz7.mo73123a(bvcy)) {
                                bvcy.mo73329h();
                                if (bvcy.mo73328g()) {
                                }
                            }
                            this.f155015b.mo73120a();
                            this.f155014a.mo36284a(this.f155015b.mo73124b());
                            return;
                        }
                        if (bvcy.mo73328g() && buuz7.mo73123a(bvcy)) {
                            bvcy.mo73329h();
                        }
                        this.f155015b.mo73120a();
                        this.f155014a.mo36284a(this.f155015b.mo73124b());
                        return;
                    } catch (IOException e2) {
                        bnsl bnsl2 = (bnsl) bvcm.f155598a.mo68387b();
                        bnsl2.mo68437a(e2);
                        bnsl2.mo68432a("buuy", "run", 102, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl2.mo68405a("BleGattConnect failed to confirm on ECDH");
                    }
                } else {
                    int a6 = buzs.m120815a(this.f155015b.f155019d.f155396d);
                    if (a6 != 0 && a6 == 2 && !this.f155015b.f155021f.mo73146d()) {
                        this.f155015b.mo73120a();
                        bvat bvat2 = this.f155014a;
                        bxvd da2 = buzl.f155397g.mo74144da();
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        buzl buzl2 = (buzl) da2.f164949b;
                        buzl2.f155401c = 4;
                        buzl2.f155399a = 2 | buzl2.f155399a;
                        bvat2.mo36284a((buzl) da2.mo74062i());
                        return;
                    }
                }
                this.f155014a.mo36284a(this.f155015b.mo73124b());
                try {
                    if (this.f155015b.f155021f.mo73146d()) {
                        while (!this.f155015b.f155016a.get()) {
                            byte[] b2 = this.f155015b.f155021f.mo73143b();
                            bvat bvat3 = this.f155014a;
                            buuz buuz8 = this.f155015b;
                            bxvd da3 = buzl.f155397g.mo74144da();
                            if (da3.f164950c) {
                                da3.mo74035c();
                                da3.f164950c = false;
                            }
                            buzl buzl3 = (buzl) da3.f164949b;
                            buzl3.f155401c = 3;
                            buzl3.f155399a |= 2;
                            buzo e3 = buuz8.f155021f.mo73147e();
                            if (da3.f164950c) {
                                da3.mo74035c();
                                da3.f164950c = false;
                            }
                            buzl buzl4 = (buzl) da3.f164949b;
                            e3.getClass();
                            buzl4.f155402d = e3;
                            buzl4.f155399a |= 4;
                            bxvd da4 = buzq.f155418c.mo74144da();
                            bxtx a7 = bxtx.m123261a(b2);
                            if (da4.f164950c) {
                                da4.mo74035c();
                                da4.f164950c = false;
                            }
                            buzq buzq = (buzq) da4.f164949b;
                            a7.getClass();
                            buzq.f155420a |= 1;
                            buzq.f155421b = a7;
                            if (da3.f164950c) {
                                da3.mo74035c();
                                da3.f164950c = false;
                            }
                            buzl buzl5 = (buzl) da3.f164949b;
                            buzq buzq2 = (buzq) da4.mo74062i();
                            buzq2.getClass();
                            buzl5.f155403e = buzq2;
                            buzl5.f155399a |= 8;
                            bvat3.mo36284a((buzl) da3.mo74062i());
                        }
                    }
                } catch (IOException e4) {
                    bnsl bnsl3 = (bnsl) bvcm.f155598a.mo68387b();
                    bnsl3.mo68437a(e4);
                    bnsl3.mo68432a("buuy", "run", 132, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl3.mo68405a("Connection ended on IOException.");
                }
            } catch (IOException e5) {
                bnsl bnsl4 = (bnsl) bvcm.f155598a.mo68388c();
                bnsl4.mo68437a(e5);
                bnsl4.mo68432a("buuy", "run", 64, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl4.mo68405a("Fail to negotiate encryption type");
                this.f155014a.mo36284a(this.f155015b.mo73124b());
            }
        } else {
            throw new RuntimeException("Error getting connection.");
        }
    }
}
