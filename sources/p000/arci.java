package p000;

import com.google.android.gms.common.api.Status;

/* renamed from: arci */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class arci implements Runnable {

    /* renamed from: a */
    final /* synthetic */ arcj f87356a;

    public arci(arcj arcj) {
        this.f87356a = arcj;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.String, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.String, java.lang.Object):void */
    public final void run() {
        aucb aucb;
        Status status;
        arcj arcj = this.f87356a;
        ardc ardc = arcj.f87358b;
        arit arit = arcj.f87357a;
        String str = arcj.f87359c;
        sdo.m34964a(ardc.f87414c);
        ardc.f87413b.mo48652e(2);
        armj.m73128a(ardc.f87413b, 6);
        arbt arbt = ardc.f87415d;
        if (!arbt.mo48381b()) {
            arbt.f87315a.mo25418e("No connection currently in progress.", new Object[0]);
            arbt.m72425f(arit, new Status(10567));
            return;
        }
        Status status2 = new Status(8);
        try {
            arbb arbb = arbt.f87320f;
            int i = ((aras) arbb).f87233c;
            int i2 = i - 1;
            if (i != 0) {
                if (i2 == 1) {
                    arbb arbb2 = ((aras) arbb).f87231a;
                    if (str != null) {
                        sdo.m34969a(str, (Object) "pin cannot be empty.");
                        String lowerCase = str.toLowerCase();
                        Logger Logger = arbj.f87275a;
                        String valueOf = String.valueOf(lowerCase);
                        Logger.logVerbose(valueOf.length() == 0 ? new String("Attempting connection with PIN ") : "Attempting connection with PIN ".concat(valueOf), new Object[0]);
                        ahco ahco = ((arbj) arbb2).f87276b;
                        roz b = rpa.m34196b();
                        b.f43472a = new ahdx(lowerCase);
                        aucb = ((rjx) ahco).mo24732b(b.mo24977a());
                    } else {
                        arbj.f87275a.logVerbose("Attempting connection without PIN. Will use Nearby#Bootstrap#confirm.", new Object[0]);
                        ahco ahco2 = ((arbj) arbb2).f87276b;
                        roz b2 = rpa.m34196b();
                        b2.f43472a = ahdy.f67067a;
                        aucb = ((rjx) ahco2).mo24732b(b2.mo24977a());
                    }
                } else if (i2 != 2) {
                    aucb = aucu.m76777a((Exception) new rjp(new Status(13)));
                } else {
                    arbr arbr = ((aras) arbb).f87232b;
                    String str2 = arbr.f87304g;
                    if (str2 != null) {
                        Logger logger2 = arbr.f87299b;
                        String valueOf2 = String.valueOf(arbr.f87304g);
                        logger2.logVerbose(valueOf2.length() == 0 ? new String("Automatically accepting connection to device endpoint ") : "Automatically accepting connection to device endpoint ".concat(valueOf2), new Object[0]);
                        aucb = arbr.f87300c.mo36521a(str2, new arnm(arbr.f87301d, arbr.f87311n));
                    } else {
                        arbr.f87299b.mo25418e("No device to accept connection to.", new Object[0]);
                        aucb = aucu.m76777a((Exception) new rjp(new Status(10567)));
                    }
                }
                if (!ascs.m73792a(aucb).mo17710c()) {
                    status = new Status(10557);
                } else {
                    status = new Status(0);
                }
                return;
            }
            throw null;
        } finally {
            arbt.m72425f(arit, status2);
        }
    }
}
