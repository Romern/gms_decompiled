package p000;

import android.os.SystemClock;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.concurrent.Future;

/* renamed from: nho */
final /* synthetic */ class nho implements Runnable {

    /* renamed from: a */
    private final nhr f35651a;

    public nho(nhr nhr) {
        this.f35651a = nhr;
    }

    public final void run() {
        Future future;
        nhr nhr = this.f35651a;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        bxvd da = bpck.f135742p.mo74144da();
        synchronized (nhr) {
            if (!nhr.f35666o && (future = nhr.f35667p) != null) {
                future.cancel(false);
                nhr.f35667p = null;
            }
            int i = (int) (elapsedRealtime - nhr.f35668q);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpck bpck = (bpck) da.f164949b;
            bpck.f135744a |= 1;
            bpck.f135745b = i;
            int andSet = (int) nhr.f35658g.getAndSet(0);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpck bpck2 = (bpck) da.f164949b;
            bpck2.f135744a |= 2;
            bpck2.f135746c = andSet;
            int andSet2 = nhr.f35654c.getAndSet(0);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpck bpck3 = (bpck) da.f164949b;
            bpck3.f135744a |= 4;
            bpck3.f135747d = andSet2;
            int andSet3 = nhr.f35656e.getAndSet(0);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpck bpck4 = (bpck) da.f164949b;
            bpck4.f135744a |= 8;
            bpck4.f135748e = andSet3;
            int andSet4 = nhr.f35655d.getAndSet(0);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpck bpck5 = (bpck) da.f164949b;
            bpck5.f135744a |= 16;
            bpck5.f135749f = andSet4;
            int andSet5 = (int) nhr.f35657f.getAndSet(0);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpck bpck6 = (bpck) da.f164949b;
            int i2 = bpck6.f135744a | 32;
            bpck6.f135744a = i2;
            bpck6.f135750g = andSet5;
            int i3 = nhr.f35652a.f121478h;
            int i4 = i2 | 64;
            bpck6.f135744a = i4;
            bpck6.f135751h = i3;
            int i5 = nhr.f35669r;
            bpck6.f135744a = i4 | 128;
            bpck6.f135752i = i5;
            int andSet6 = nhr.f35659h.getAndSet(0);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpck bpck7 = (bpck) da.f164949b;
            bpck7.f135744a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            bpck7.f135753j = andSet6;
            int i6 = nhr.f35660i.get();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpck bpck8 = (bpck) da.f164949b;
            bpck8.f135744a |= 512;
            bpck8.f135754k = i6;
            int andSet7 = nhr.f35661j.getAndSet(-99999);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpck bpck9 = (bpck) da.f164949b;
            bpck9.f135744a |= 1024;
            bpck9.f135755l = andSet7;
            int andSet8 = nhr.f35662k.getAndSet(-99999);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpck bpck10 = (bpck) da.f164949b;
            bpck10.f135744a |= 2048;
            bpck10.f135756m = andSet8;
            if (cctf.m131515b()) {
                int andSet9 = (int) nhr.f35663l.getAndSet(0);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bpck bpck11 = (bpck) da.f164949b;
                bpck11.f135744a |= 4096;
                bpck11.f135757n = andSet9;
                synchronized (nhr.f35665n) {
                    int i7 = (int) nhr.f35664m;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bpck bpck12 = (bpck) da.f164949b;
                    bpck12.f135744a |= 8192;
                    bpck12.f135758o = i7;
                    nhr.f35664m = 0;
                }
            }
            nhr.f35666o = false;
            nhr.f35668q = elapsedRealtime;
        }
        nhr.f35653b.mo20854a((bpck) da.mo74062i());
    }
}
