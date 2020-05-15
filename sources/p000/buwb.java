package p000;

import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* renamed from: buwb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class buwb implements bvbr {

    /* renamed from: a */
    final /* synthetic */ bvat f155119a;

    /* renamed from: b */
    final /* synthetic */ buwc f155120b;

    public buwb(buwc buwc, bvat bvat) {
        this.f155120b = buwc;
        this.f155119a = bvat;
    }

    /* renamed from: a */
    public final void mo73116a() {
        this.f155120b.mo73168d();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x012a, code lost:
        if (r3.mo73146d() != false) goto L_0x0175;
     */
    public final void run() {
        if (this.f155120b.f155124d.mo73231e()) {
            buwc buwc = this.f155120b;
            buwe buwe = buwc.f155122b;
            buzt buzt = buwc.f155125e.f155394b;
            if (buzt == null) {
                buzt = buzt.f155423f;
            }
            buwc.f155127g = (buwd) buwe.mo73279b(buzt);
            buwc buwc2 = this.f155120b;
            buwd buwd = buwc2.f155127g;
            if (buwd != null) {
                try {
                    buwd.mo73144c();
                    buwd buwd2 = buwc2.f155127g;
                    if (buwd2.f155131a) {
                        byte[] bArr = new byte[1];
                        int i = buwc2.f155129i;
                        int i2 = i - 1;
                        if (i != 0) {
                            bArr[0] = (byte) i2;
                            buwd2.mo73142a(bArr);
                        } else {
                            throw null;
                        }
                    } else {
                        byte[] b = buwd2.mo73143b();
                        if (b == null || b.length != 1) {
                            throw new IOException("Unexpected data while negotiating encryption type");
                        } else if (buwc2.f155129i == 4) {
                            buwc2.f155129i = buzs.m120815a(b[0]);
                        }
                    }
                    buwc buwc3 = this.f155120b;
                    int i3 = buwc3.f155129i;
                    int i4 = i3 - 1;
                    if (i3 != 0) {
                        if (i4 == 0) {
                            srn srn = bvcm.f155598a;
                            buwc3.f155128h = buwc3.f155127g;
                        } else if (i4 == 1) {
                            srn srn2 = bvcm.f155598a;
                            buwc3.f155128h = new bvcz(buwc3.f155127g, buwc3.f155125e.f155395c.getKey());
                        } else if (i4 == 2) {
                            srn srn3 = bvcm.f155598a;
                            buwc3.f155128h = new bvcy(buwc3.f155127g);
                        } else {
                            throw new RuntimeException("Unrecognized encryption type");
                        }
                        try {
                            this.f155120b.f155128h.mo73144c();
                        } catch (IOException e) {
                        }
                        buwc buwc4 = this.f155120b;
                        buwc4.f155123c.mo73292a(buwc4.f155128h);
                        buwc buwc5 = this.f155120b;
                        int i5 = buwc5.f155129i;
                        if (i5 == 3) {
                            bvcy bvcy = (bvcy) buwc5.f155128h;
                            bvat bvat = this.f155119a;
                            try {
                                String i6 = bvcy.mo73330i();
                                bxvd da = buzl.f155397g.mo74144da();
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                buzl buzl = (buzl) da.f164949b;
                                buzl.f155401c = 5;
                                int i7 = buzl.f155399a | 2;
                                buzl.f155399a = i7;
                                i6.getClass();
                                buzl.f155399a = i7 | 16;
                                buzl.f155404f = i6;
                                bvat.mo36284a((buzl) da.mo74062i());
                                if (bvcy.mo73328g()) {
                                    while (true) {
                                        if (!bvcy.mo73146d() && bvcy.mo73332k()) {
                                            try {
                                                buwc5.f155121a.await(500, TimeUnit.MILLISECONDS);
                                            } catch (InterruptedException e2) {
                                                bnsl bnsl = (bnsl) bvcm.f155598a.mo68388c();
                                                bnsl.mo68437a(e2);
                                                bnsl.mo68432a("buwc", "a", (int) BaseMfiEventCallback.TYPE_INVALID_LINKAGE_DATA, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                bnsl.mo68405a("ConnectionStatusCheck interrupted");
                                            }
                                            if (buwc5.f155126f.get()) {
                                                break;
                                            }
                                        }
                                    }
                                }
                            } catch (IOException e3) {
                            }
                            this.f155120b.mo73168d();
                            this.f155119a.mo36284a(this.f155120b.mo73125c());
                            return;
                        } else if (i5 == 2 && !buwc5.f155128h.mo73146d()) {
                            this.f155120b.mo73168d();
                            bvat bvat2 = this.f155119a;
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
                        this.f155119a.mo36284a(this.f155120b.mo73125c());
                        try {
                            if (this.f155120b.f155128h.mo73146d()) {
                                while (!this.f155120b.f155126f.get()) {
                                    byte[] b2 = this.f155120b.f155128h.mo73143b();
                                    bvat bvat3 = this.f155119a;
                                    buwc buwc6 = this.f155120b;
                                    bxvd da3 = buzl.f155397g.mo74144da();
                                    if (da3.f164950c) {
                                        da3.mo74035c();
                                        da3.f164950c = false;
                                    }
                                    buzl buzl3 = (buzl) da3.f164949b;
                                    buzl3.f155401c = 3;
                                    buzl3.f155399a |= 2;
                                    buzo e4 = buwc6.f155128h.mo73147e();
                                    if (da3.f164950c) {
                                        da3.mo74035c();
                                        da3.f164950c = false;
                                    }
                                    buzl buzl4 = (buzl) da3.f164949b;
                                    e4.getClass();
                                    buzl4.f155402d = e4;
                                    buzl4.f155399a |= 4;
                                    bxvd da4 = buzq.f155418c.mo74144da();
                                    ByteString a = ByteString.m123261a(b2);
                                    if (da4.f164950c) {
                                        da4.mo74035c();
                                        da4.f164950c = false;
                                    }
                                    buzq buzq = (buzq) da4.f164949b;
                                    a.getClass();
                                    buzq.f155420a |= 1;
                                    buzq.f155421b = a;
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
                        } catch (IOException e5) {
                        }
                    } else {
                        throw null;
                    }
                } catch (IOException e6) {
                    bnsl bnsl2 = (bnsl) bvcm.f155598a.mo68388c();
                    bnsl2.mo68437a(e6);
                    bnsl2.mo68432a("buwb", "run", 87, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl2.mo68405a("Fail to negotiate encryption type");
                    this.f155119a.mo36284a(this.f155120b.mo73125c());
                }
            } else {
                throw new RuntimeException("Error getting connection.");
            }
        } else {
            throw new RuntimeException("Fail to enable bluetooth");
        }
    }
}
