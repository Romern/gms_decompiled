package p000;

import android.app.usage.UsageStatsManager;
import android.os.Build;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.Feature;
import com.google.android.gms.lockbox.LockboxChimeraService;
import java.util.ArrayList;

/* renamed from: aeyk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aeyk implements aubq {

    /* renamed from: a */
    final /* synthetic */ aeyl f64007a;

    public aeyk(aeyl aeyl) {
        this.f64007a = aeyl;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [int, long]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.Object, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.Object, java.lang.Object):void */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0084, code lost:
        if (((android.os.UserManager) p000.rpr.m34216b().getSystemService("user")).getUserCount() <= 1) goto L_0x0086;
     */
    /* renamed from: a */
    public final void mo6378a(aucb aucb) {
        aucb aucb2;
        boolean b = aucb.mo50384b();
        StringBuilder sb = new StringBuilder(21);
        sb.append("Completed task: ");
        sb.append(b);
        Log.i("LockboxService", sb.toString());
        if (!aucb.mo50384b() || !((Boolean) aucb.mo50386d()).booleanValue()) {
            this.f64007a.f64008a.mo43832a(86400000);
            return;
        }
        bosx bosx = bosx.f134741g;
        ArrayList arrayList = new ArrayList();
        LockboxChimeraService lockboxChimeraService = this.f64007a.f64008a;
        int i = Build.VERSION.SDK_INT;
        arrayList.add(new aeyr(new aeyx(lockboxChimeraService, bosx, new aeyv((UsageStatsManager) lockboxChimeraService.getSystemService("usagestats")))));
        if (cfbr.f183596a.mo6606a().mo80814a()) {
            if (cfbc.f183579a.mo6606a().mo80802a()) {
                int i2 = Build.VERSION.SDK_INT;
            }
            arrayList.add(new aeyr(new aezs(this.f64007a.f64008a, bosx)));
            arrayList.add(new aeyr(new aezb(this.f64007a.f64008a, bosx)));
        }
        aeyl aeyl = this.f64007a;
        aeyl.f64008a.mo43832a(Math.max(60000L, cfbr.f183596a.mo6606a().mo80815b()));
        aeyl aeyl2 = this.f64007a;
        long currentTimeMillis = System.currentTimeMillis();
        int size = arrayList.size();
        int i3 = 0;
        int i4 = 0;
        while (i4 < size) {
            aeyr aeyr = (aeyr) arrayList.get(i4);
            if (aeyr != null) {
                rjx rjx = aeyl2.f64008a.f79790c;
                aeyp a = aeyr.f64009a.mo34658a(currentTimeMillis);
                while (a.hasNext()) {
                    try {
                        Pair pair = (Pair) a.next();
                        String str = (String) pair.first;
                        bxxc bxxc = (bxxc) pair.second;
                        String a2 = aeyr.f64009a.mo34660a(bxxc);
                        avua a3 = aeyr.f64009a.mo34659a();
                        if (!aeyr.f64009a.mo34661b()) {
                            aucb2 = rjx.mo24695a(str, bxxc.serializeToBytes(), a3, i3);
                        } else {
                            byte[] k = bxxc.serializeToBytes();
                            sdo.checkIfNull((Object) a2, (Object) "filteredField cannot be null. Use the other upload method to explicitly indicate that whitelisting filtering is not applicable.");
                            roz b2 = rpa.m34196b();
                            b2.f43472a = new avuf(rjx, str, k, a2, a3);
                            b2.f43473b = new Feature[]{avtu.f93904b};
                            aucb2 = rjx.mo24732b(b2.mo24977a());
                        }
                        aucb2.mo50371a(new aeyo());
                        i3 = 0;
                    } finally {
                        a.mo34657a();
                    }
                }
            }
            i4++;
            i3 = 0;
        }
    }
}
