package p000;

import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: nwl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class nwl implements Runnable {

    /* renamed from: a */
    final /* synthetic */ nwp f36811a;

    /* renamed from: b */
    private final List f36812b = new ArrayList(8);

    public nwl(nwp nwp) {
        this.f36811a = nwp;
    }

    public final void run() {
        int i;
        int i2;
        boolean a;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        synchronized (nwp.class) {
            nwp nwp = this.f36811a;
            nwp.f36823e++;
            long j = (elapsedRealtime - nwp.f36820b) - 500;
            if (j > 500) {
                int i3 = (((int) j) / 500) + 1;
                int i4 = i3 * i3;
                StringBuilder sb = new StringBuilder(95);
                sb.append("too much delay in timer. system heavily loaded? delay:");
                sb.append(j);
                sb.append(" back-off:");
                sb.append(i4);
                Log.w("CAR.TIME", sb.toString());
                for (int i5 = 0; i5 < this.f36811a.f36824f.size(); i5++) {
                    ((nwm) this.f36811a.f36824f.get(i5)).f36813a += i4;
                }
                i2 = 0;
            } else {
                i2 = 0;
            }
            while (i2 < this.f36811a.f36824f.size()) {
                nwm nwm = (nwm) this.f36811a.f36824f.get(i2);
                if (nwm.f36813a <= this.f36811a.f36823e) {
                    this.f36812b.add(nwm);
                }
                i2++;
            }
            for (int size = this.f36812b.size() - 1; size >= 0; size--) {
                this.f36811a.f36824f.remove(this.f36812b.get(size));
            }
            a = this.f36811a.mo21758a();
        }
        List list = this.f36812b;
        int size2 = list.size();
        for (i = 0; i < size2; i++) {
            ((nwm) list.get(i)).mo21755a();
        }
        this.f36812b.clear();
        nwp nwp2 = this.f36811a;
        nwp2.f36820b = elapsedRealtime;
        if (!a) {
            nwp2.f36822d.postDelayed(this, 500);
        }
    }
}
