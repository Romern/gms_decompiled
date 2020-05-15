package p000;

import android.os.SystemClock;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: nog */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class nog extends ojd {

    /* renamed from: a */
    final /* synthetic */ noj f36151a;

    public nog(noj noj) {
        this.f36151a = noj;
    }

    /* renamed from: a */
    public final void mo21235a(bitq bitq) {
        if (bitq.f121699b == this.f36151a.f36174S) {
            int elapsedRealtime = (int) (SystemClock.elapsedRealtime() - bitq.f121699b);
            nja nja = (nja) this.f36151a.f36168M;
            bxvd c = nja.mo20870c();
            bxvd da = bpeh.f137274e.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpeh bpeh = (bpeh) da.f164949b;
            bpeh.f137276a |= 1;
            bpeh.f137277b = elapsedRealtime;
            bpeh bpeh2 = (bpeh) da.mo74062i();
            if (c.f164950c) {
                c.mo74035c();
                c.f164950c = false;
            }
            bpcl bpcl = (bpcl) c.f164949b;
            bpcl bpcl2 = bpcl.f135759L;
            bpeh2.getClass();
            bpcl.f135788p = bpeh2;
            bpcl.f135773a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
            nja.mo20868a(c, 43);
        }
    }
}
