package p000;

import android.location.GnssStatus;

/* renamed from: beyt */
final /* synthetic */ class beyt implements Runnable {

    /* renamed from: a */
    private final beyu f113026a;

    /* renamed from: b */
    private final GnssStatus f113027b;

    public beyt(beyu beyu, GnssStatus gnssStatus) {
        this.f113026a = beyu;
        this.f113027b = gnssStatus;
    }

    public final void run() {
        beyu beyu = this.f113026a;
        GnssStatus gnssStatus = this.f113027b;
        beyv beyv = beyu.f113028a;
        int i = beyv.f113032z;
        if (beyv.f113047j) {
            bfkl bfkl = new bfkl(gnssStatus);
            beyv beyv2 = beyu.f113028a;
            if (beyv.m96092a(bfkl, !beyv2.f113048k ? beyv2.f113053p : beyv2.f113054q, beyv2.f113052o)) {
                beyu.f113028a.mo61262a(bfkl);
            }
        }
    }
}
