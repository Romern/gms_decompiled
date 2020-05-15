package p000;

import android.os.Process;

/* renamed from: oag */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class oag implements Runnable {

    /* renamed from: a */
    final /* synthetic */ oak f37048a;

    /* renamed from: b */
    private boolean f37049b = false;

    public oag(oak oak) {
        this.f37048a = oak;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: oak.a(boolean, boolean):void
     arg types: [int, int]
     candidates:
      oak.a(int, boolean):biwf
      oak.a(biwf, android.graphics.Point):boolean
      oak.a(biwg, android.graphics.Point):boolean
      oak.a(boolean, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: oak.a(boolean, boolean):void
     arg types: [int, boolean]
     candidates:
      oak.a(int, boolean):biwf
      oak.a(biwf, android.graphics.Point):boolean
      oak.a(biwg, android.graphics.Point):boolean
      oak.a(boolean, boolean):void */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c2, code lost:
        if (r1.mo22033a(new p000.oai(r0)) != false) goto L_0x00f1;
     */
    public final void run() {
        int i;
        oak oak;
        oas oas;
        Process.setThreadPriority(-4);
        while (true) {
            try {
                i = ((Integer) this.f37048a.f37071r.take()).intValue();
            } catch (InterruptedException e) {
                i = 4;
            }
            Integer num = (Integer) this.f37048a.f37071r.poll();
            while (i != 4 && num != null) {
                i = num.intValue();
                num = (Integer) this.f37048a.f37071r.poll();
            }
            if (i != 1) {
                if (i != 2 && i != 3) {
                    if (i == 4) {
                        break;
                    }
                } else {
                    boolean z = i == 3;
                    if (this.f37049b || !z) {
                        this.f37048a.mo21904a(true, z);
                        this.f37049b = false;
                    }
                }
            } else if (!this.f37049b) {
                oak = this.f37048a;
                okf okf = oak.f37059f;
                bmxy.m108581a(okf);
                okf.mo22187c(oak.f37056c.f37023a);
                if (oak.f37064k.f36296c.getBoolean("car_save_video", false)) {
                    oas = oas.m28302a(oak.f37066m.getApplicationContext());
                } else {
                    oas = null;
                }
                oak.f37060g = odu.m28520a(oak.f37063j, oas);
                try {
                    odw odw = oak.f37060g;
                    bmxy.m108581a(odw);
                    odw.mo22028a(oak.f37065l.mo21350t(), oak.f37056c.f37024b, oak.f37056c.f37025c, oak.f37056c.f37026d);
                    odw odw2 = oak.f37060g;
                    bmxy.m108581a(odw2);
                } catch (RuntimeException e2) {
                    bnsi c = oak.f37052a.mo68388c();
                    c.mo68437a(e2);
                    c.mo68432a("oak", "i", 677, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    c.mo68405a("Failed to start encoding");
                }
            }
        }
        this.f37048a.f37071r.clear();
        if (this.f37049b) {
            this.f37048a.mo21904a(false, false);
            this.f37049b = false;
            return;
        }
        return;
        if (oak.f37065l.mo21351u() != 0) {
            oak.f37057d.mo21228a("cannot start video encoding", bpdo.VIDEO_ENCODING_INIT_FAIL);
            this.f37049b = true;
        }
        oaj oaj = oak.f37055b;
        odw odw3 = oak.f37060g;
        bmxy.m108581a(odw3);
        oaj.sendMessage(oaj.obtainMessage(1, ((odp) odw3).f37290c));
        this.f37049b = true;
    }
}
