package p000;

import android.bluetooth.BluetoothManager;
import java.io.IOException;

/* renamed from: buvf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class buvf implements bvbr {

    /* renamed from: a */
    final /* synthetic */ buvh f155031a;

    public buvf(buvh buvh) {
        this.f155031a = buvh;
    }

    /* renamed from: a */
    public final void mo73116a() {
        this.f155031a.mo73132a();
    }

    public final void run() {
        srn srn = bvcm.f155598a;
        this.f155031a.f155035b = new blvr(buxb.f155204b, buxb.f155207e, buxb.f155208f, new buvd(this));
        buvh buvh = this.f155031a;
        blvr blvr = buvh.f155035b;
        blvr.mo66758a(aysp.m84734a(((BluetoothManager) this.f155031a.f155034a.getSystemService("bluetooth")).openGattServer(buvh.f155034a, blvr.f98425c)), new buve(this));
        while (!this.f155031a.f155039f.get()) {
            try {
                buvg buvg = (buvg) this.f155031a.f155040g.take();
                IOException iOException = buvg.f155033b;
                if (iOException == null) {
                    buvh buvh2 = this.f155031a;
                    buvo buvo = buvg.f155032a;
                    synchronized (buvh2.f155036c) {
                        buvh2.f155036c.add(buvo);
                        buvh2.f155037d.mo73278a(buvo);
                        bxvd da = buyn.f155316e.mo74144da();
                        bxvd da2 = buzt.f155423f.mo74144da();
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        buzt buzt = (buzt) da2.f164949b;
                        buzt.f155426b = 3;
                        buzt.f155425a |= 1;
                        buzx g = buvo.mo73149g();
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        buzt buzt2 = (buzt) da2.f164949b;
                        g.getClass();
                        buzt2.f155427c = g;
                        buzt2.f155425a |= 2;
                        bxvd da3 = buzu.f155430c.mo74144da();
                        bxtx a = bxtx.m123261a(bvau.m120846a(buvo.f155059a));
                        if (da3.f164950c) {
                            da3.mo74035c();
                            da3.f164950c = false;
                        }
                        buzu buzu = (buzu) da3.f164949b;
                        a.getClass();
                        buzu.f155432a |= 1;
                        buzu.f155433b = a;
                        buzu buzu2 = (buzu) da3.mo74062i();
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        buzt buzt3 = (buzt) da2.f164949b;
                        buzu2.getClass();
                        buzt3.f155429e = buzu2;
                        buzt3.f155425a |= 16;
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        buyn buyn = (buyn) da.f164949b;
                        buzt buzt4 = (buzt) da2.mo74062i();
                        buzt4.getClass();
                        buyn.f155320c = buzt4;
                        buyn.f155318a |= 2;
                        bvat bvat = buvh2.f155038e;
                        if (bvat != null) {
                            bvat.mo36284a((buyn) da.mo74062i());
                        }
                    }
                } else {
                    throw iOException;
                }
            } catch (IOException | InterruptedException e) {
                return;
            }
        }
    }
}
