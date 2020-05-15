package p000;

import android.os.SystemClock;
import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* renamed from: nwt */
final /* synthetic */ class nwt implements Runnable {

    /* renamed from: a */
    private final nwu f36827a;

    public nwt(nwu nwu) {
        this.f36827a = nwu;
    }

    public final void run() {
        int i;
        nwu nwu = this.f36827a;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        synchronized (nwu) {
            if (!nwu.f36838k) {
                i = (int) nwu.f36839l;
                nwu.f36839l = 0;
            } else {
                nwu.f36839l = -elapsedRealtime;
                i = (int) (nwu.f36839l + elapsedRealtime);
            }
        }
        bxvd da = bpdr.f136363k.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpdr bpdr = (bpdr) da.f164949b;
        bpdr.f136365a |= 1;
        bpdr.f136366b = i;
        int andSet = (int) nwu.f36833f.getAndSet(0);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpdr bpdr2 = (bpdr) da.f164949b;
        bpdr2.f136365a |= 4;
        bpdr2.f136367c = andSet;
        int andSet2 = nwu.f36829b.getAndSet(0);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpdr bpdr3 = (bpdr) da.f164949b;
        bpdr3.f136365a |= 8;
        bpdr3.f136368d = andSet2;
        int andSet3 = nwu.f36830c.getAndSet(0);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpdr bpdr4 = (bpdr) da.f164949b;
        bpdr4.f136365a |= 16;
        bpdr4.f136369e = andSet3;
        int andSet4 = nwu.f36832e.getAndSet(0);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpdr bpdr5 = (bpdr) da.f164949b;
        bpdr5.f136365a |= 32;
        bpdr5.f136370f = andSet4;
        int andSet5 = (int) nwu.f36831d.getAndSet(0);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpdr bpdr6 = (bpdr) da.f164949b;
        int i2 = bpdr6.f136365a | 64;
        bpdr6.f136365a = i2;
        bpdr6.f136371g = andSet5;
        int i3 = nwu.f36837j;
        bpdr6.f136365a = i2 | 128;
        bpdr6.f136372h = i3;
        if (cctf.m131515b()) {
            int andSet6 = (int) nwu.f36834g.getAndSet(0);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpdr bpdr7 = (bpdr) da.f164949b;
            bpdr7.f136365a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            bpdr7.f136373i = andSet6;
            synchronized (nwu.f36836i) {
                int i4 = (int) nwu.f36835h;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bpdr bpdr8 = (bpdr) da.f164949b;
                bpdr8.f136365a |= 512;
                bpdr8.f136374j = i4;
                nwu.f36835h = 0;
            }
        }
        ccux.m131754c();
        bxvd da2 = bpdq.f136359c.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bpdq bpdq = (bpdq) da2.f164949b;
        bpdr bpdr9 = (bpdr) da.mo74062i();
        bpdr9.getClass();
        bpdq.f136362b = bpdr9;
        bpdq.f136361a |= 1;
        bpdq bpdq2 = (bpdq) da2.mo74062i();
        nja nja = (nja) nwu.f36828a;
        bxvd c = nja.mo20870c();
        if (c.f164950c) {
            c.mo74035c();
            c.f164950c = false;
        }
        bpcl bpcl = (bpcl) c.f164949b;
        bpcl bpcl2 = bpcl.f135759L;
        bpdq2.getClass();
        bpcl.f135763C = bpdq2;
        bpcl.f135774b |= 2048;
        nja.mo20868a(c, 54);
    }
}
