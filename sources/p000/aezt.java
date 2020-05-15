package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.magictether.host.TetherListenerChimeraService;
import com.google.android.gms.magictether.logging.DailyMetricsLoggerChimeraService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: aezt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aezt {

    /* renamed from: a */
    private static final sek f64054a = new sek(new String[]{"MagicTetherInitializer"}, (int[]) null);

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: jpc.a(bsni, boolean, android.accounts.Account):aucb
     arg types: [bsni, int, android.accounts.Account]
     candidates:
      rjx.a(int, java.lang.String, java.lang.String):aucb
      rjx.a(com.google.android.gms.location.internal.LocationRequestInternal, aehz, android.os.Looper):aucb
      rjx.a(java.lang.String, java.lang.String, byte[]):aucb
      rjx.a(com.google.android.gms.smartdevice.setup.accounts.Challenge[], boolean, boolean):aucb
      rjx.a(java.lang.String, int, int):rke
      rjx.a(android.app.Activity, int, asxx):void
      rjx.a(android.app.Activity, int, java.lang.String):void
      rjx.a(com.google.android.gms.location.internal.LocationRequestInternal, aehy, android.os.Looper):void
      rjx.a(java.lang.String, long, int):void
      artq.a(com.google.android.gms.smartdevice.setup.accounts.Challenge[], boolean, boolean):aucb
      jpc.a(bsni, boolean, android.accounts.Account):aucb */
    /* renamed from: a */
    private static void m52749a(Context context) {
        boolean z;
        if (cfcj.f183615a.mo6606a().mo80834h()) {
            afba a = afaz.m52798a();
            try {
                Account[] d = gie.m13199d(context, "com.google");
                if (d != null && (r4 = d.length) > 0) {
                    jpc a2 = jpy.m17097a(context);
                    ArrayList arrayList = new ArrayList();
                    for (Account account : d) {
                        aucb a3 = a2.mo13968a(bsni.MAGIC_TETHER_CLIENT, false, account);
                        bsni bsni = bsni.MAGIC_TETHER_HOST;
                        if (!cfcj.m138656c() || !afak.m52783a()) {
                            z = false;
                        } else {
                            z = true;
                        }
                        aucb a4 = a2.mo13968a(bsni, z, account);
                        arrayList.add(a3);
                        arrayList.add(a4);
                    }
                    try {
                        aucu.m76783a(aucu.m76779a((Collection) arrayList), cfcs.f183635a.mo6606a().mo80845b(), TimeUnit.SECONDS);
                        a.mo34724b(0);
                    } catch (InterruptedException | ExecutionException | TimeoutException e) {
                        f64054a.mo25416d("Failed to report feature support.", new Object[0]);
                        a.mo34724b(3);
                    }
                } else {
                    f64054a.mo25418e("Invalid account list.", new Object[0]);
                    a.mo34724b(2);
                }
            } catch (RemoteException | rfv | rfw e2) {
                f64054a.mo25418e("Failed to fetch account list.", new Object[0]);
                a.mo34724b(1);
            }
        }
    }

    /* renamed from: a */
    public static void m52750a(Context context, boolean z) {
        if (!cfcj.m138659f()) {
            m52749a(context);
            if (cfcj.m138656c()) {
                if (DailyMetricsLoggerChimeraService.m67145b()) {
                    aebl aebl = new aebl();
                    aebl.f63097i = "com.google.android.gms.magictether.logging.DailyMetricsLoggerService";
                    aebl.f63099k = "DailyMetricsLogger";
                    aebl.mo34023a(2);
                    aebl.mo34024a(1, 1);
                    aebl.f63070a = TimeUnit.HOURS.toSeconds(24);
                    aebl.f63071b = TimeUnit.HOURS.toSeconds(1);
                    aebl.mo34027b(0);
                    aebl.f63102n = false;
                    aeat.m51532a(context).mo33984a(aebl.mo33974b());
                }
                context.startService(TetherListenerChimeraService.m67140a(context));
            } else if (!z) {
                context.startService(TetherListenerChimeraService.m67140a(context));
            }
        }
    }
}
