package p000;

import android.content.Context;
import com.google.android.gms.car.CarInfo;
import java.util.List;

/* renamed from: ozy */
final /* synthetic */ class ozy implements Runnable {

    /* renamed from: a */
    private final pad f38688a;

    public ozy(pad pad) {
        this.f38688a = pad;
    }

    public final void run() {
        pad pad = this.f38688a;
        pam pam = pad.f38703k;
        bnsn bnsn = pam.f38717a;
        Context context = pam.f38718b;
        List list = pad.f38698f;
        oha oha = pad.f38697e;
        bmzi bmzi = pam.f38721e;
        CarInfo carInfo = pam.f38722f;
        ojk a = ojq.m28927a();
        a.f37764e = context;
        a.f37785z = 2;
        a.f37761b = list;
        a.f37766g = new pai();
        a.f37774o = oha;
        a.f37765f = bmzi;
        if (carInfo != null && ccpv.m131195d()) {
            a.f37781v = new ofh(carInfo.f29336e, carInfo.f29337f);
        }
        pad.f38701i = a.mo22211a();
        nov nov = pad.f38703k.f38724h;
        ojq ojq = pad.f38701i;
        pai pai = new pai();
        omi omi = pad.f38702j;
        bnsn bnsn2 = noy.f36261a;
        noy noy = nov.f36257a;
        long j = noy.f36270j;
        noy.f36265e.post(new nop(nov, ojq, pai, omi));
    }
}
