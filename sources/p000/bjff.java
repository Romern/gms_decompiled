package p000;

import android.content.Intent;

/* renamed from: bjff */
final /* synthetic */ class bjff implements Runnable {

    /* renamed from: a */
    private final bjfh f122615a;

    public bjff(bjfh bjfh) {
        this.f122615a = bjfh;
    }

    public final void run() {
        bjfh bjfh = this.f122615a;
        if (!bjfh.f122624g) {
            int i = 0;
            while (i < bjfh.f122621d.size()) {
                bjez bjez = (bjez) bjfh.f122623f.get(i);
                if (bjfh.f122623f.get(i) == null) {
                    bjfa bjfa = bjfh.f122619b;
                    int intValue = ((Integer) bjfh.f122620c.get(i)).intValue();
                    bjfa.mo65076b();
                    bjez = (bjez) bjfa.f122605c.mo15646f(intValue);
                    bjfh.f122623f.set(i, bjez);
                    if (bjez != null) {
                        bjez.f122600e = bjfh;
                    }
                }
                if (bjez == null || bjez.f122599d == 4) {
                    Intent intent = (Intent) bjfh.f122622e.get(i);
                    if (bjez == null) {
                        bmxy.m108581a(intent);
                        bjfa bjfa2 = bjfh.f122619b;
                        bjfc bjfc = new bjfc((Intent) bjfh.f122622e.get(i));
                        bjfa2.mo65076b();
                        bjez bjez2 = new bjez(bjfa2.f122607e);
                        bjfa2.f122607e++;
                        bjez2.f122598c = bjfc;
                        bjfa2.f122605c.mo15637a(bjez2.f122596a, bjez2);
                        bjfh.f122620c.set(i, Integer.valueOf(bjez2.f122596a));
                        bjfh.f122623f.set(i, bjez2);
                        bjfh.f122622e.set(i, null);
                        bjez2.f122600e = bjfh;
                        i++;
                    } else {
                        int intValue2 = ((Integer) bjfh.f122621d.remove(i)).intValue();
                        bjez bjez3 = (bjez) bjfh.f122623f.remove(i);
                        bjfh.f122620c.remove(i);
                        bjfh.f122622e.remove(i);
                        bjfd bjfd = bjez3.f122597b;
                        bjfa bjfa3 = bjfh.f122619b;
                        bjez3.f122600e = null;
                        bjfa3.f122605c.mo15636a(bjez3.f122596a);
                        bjfh.f122618a.mo52014a(intValue2, bjfd);
                    }
                } else {
                    i++;
                }
            }
            bjfh.f122619b.mo65073a();
        }
    }
}
