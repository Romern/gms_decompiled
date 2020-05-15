package com.google.android.gms.udc.service;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class UdcContextInitChimeraService extends aeah {

    /* renamed from: a */
    private static final bnsn f109382a = avex.m78396b();

    /* renamed from: a */
    public static void m93661a(Context context) {
        bnsi d = f109382a.mo68390d();
        d.mo68432a("com.google.android.gms.udc.service.UdcContextInitChimeraService", "a", 372, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68405a("Scheduling context registration change job.");
        aebi aebi = new aebi();
        aebi.f63097i = "com.google.android.gms.udc.service.UdcContextInitService";
        aebi.f63099k = "UdcContextRegistrationOneOff";
        aebi.f63102n = true;
        aebi.mo34023a(2);
        aebi.mo34024a(0, cdny.m134338c() ? 1 : 0);
        aebi.mo34004a(chbh.f188248a.mo6606a().mo84946f(), chbh.f188248a.mo6606a().mo84945e());
        aebn aebn = new aebn();
        aebn.f63075b = 30;
        aebn.f63076c = (int) TimeUnit.HOURS.toSeconds(18);
        aebn.f63074a = 0;
        aebi.f63106r = aebn.mo34011a();
        aebi.mo34027b(1);
        aeat.m51532a(context).mo33984a(aebi.mo33974b());
        aebl aebl = new aebl();
        aebl.f63097i = "com.google.android.gms.udc.service.UdcContextInitService";
        aebl.f63099k = "UdcContextRegistrationPeriodic";
        aebl.f63102n = true;
        aebl.mo34023a(2);
        aebl.mo34024a(0, cdny.m134338c() ? 1 : 0);
        aebl.f63070a = chbh.f188248a.mo6606a().mo84944d();
        aebl.f63071b = TimeUnit.HOURS.toSeconds(1);
        aebn aebn2 = new aebn();
        aebn2.f63075b = 30;
        aebn2.f63076c = (int) TimeUnit.HOURS.toSeconds(18);
        aebn2.f63074a = 0;
        aebl.f63106r = aebn2.mo34011a();
        aebl.mo34027b(1);
        aeat.m51532a(context).mo33984a(aebl.mo33974b());
    }

    /* renamed from: b */
    private final int m93664b() {
        for (Account account : soz.m35801d(getApplicationContext(), "com.google.android.gms")) {
            try {
                String str = account.name;
                avjf.f93267a.mo58362b(account).mo58361b().get();
            } catch (ExecutionException e) {
                bnsi b = f109382a.mo68387b();
                b.mo68432a("com.google.android.gms.udc.service.UdcContextInitChimeraService", "b", 246, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                b.mo68424a("ExecutionException while refreshing FACS Cache client-side cache for account '%s'! %s", account.name, e.toString());
                return 2;
            } catch (InterruptedException e2) {
                bnsi b2 = f109382a.mo68387b();
                b2.mo68432a("com.google.android.gms.udc.service.UdcContextInitChimeraService", "b", 251, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                b2.mo68424a("InterruptedException while refreshing FACS Cache client-side cache for account '%s'! %s", account.name, e2.toString());
                return 2;
            }
        }
        return 0;
    }

    /* renamed from: b */
    public static boolean m93665b(Context context) {
        return context.getSharedPreferences("UdcCtxMgrPrefs", 0).getBoolean("UdcCtxMgrPrefsReg", false);
    }

    /* renamed from: b */
    private static final boolean m93666b(String str) {
        return "UdcSyncOneOff".equals(str) || "UdcSyncPeriodic".equals(str) || "UdcTestSync".equals(str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0053 A[SYNTHETIC, Splitter:B:10:0x0053] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0078 A[Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x009d }] */
    /* renamed from: a */
    private final boolean m93662a(Context context, Account account, boolean z) {
        int i;
        Intent startIntent = IntentOperation.getStartIntent(context, "com.google.android.gms.udc.intentoperation.UdcContextListenerIntentOperation", "com.google.android.gms.udc.CONTEXT_CHANGED");
        startIntent.putExtra("UdcAccountName", account.name);
        tit tit = new tit();
        tit.mo26579a(10002);
        tiu a = tit.mo26578a();
        try {
            String c = aviz.m78601c(context, gik.m13218f(context, account.name));
            if (stm.m36302d(c)) {
                i = account.hashCode();
                boolean z2 = false;
                PendingIntent service = PendingIntent.getService(context, i, startIntent, 0);
                rjx c2 = lrh.m19579c(context, lri.m19582a("com.google.android.gms.udc", account));
                if (!z) {
                    try {
                        bnsi d = f109382a.mo68390d();
                        d.mo68432a("com.google.android.gms.udc.service.UdcContextInitChimeraService", "a", 347, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        d.mo68405a("Registering with contextmanager");
                        aucu.m76783a(sdl.m34954a(tjj.m37076a(c2.f43165D, a, service)), chbh.m148005c(), TimeUnit.MILLISECONDS);
                        z2 = true;
                    } catch (InterruptedException | ExecutionException | TimeoutException e) {
                        bnsi b = f109382a.mo68387b();
                        b.mo68437a(e);
                        b.mo68432a("com.google.android.gms.udc.service.UdcContextInitChimeraService", "a", 362, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        b.mo68405a("context manager (un)subscription failed");
                    }
                } else {
                    bnsi d2 = f109382a.mo68390d();
                    d2.mo68432a("com.google.android.gms.udc.service.UdcContextInitChimeraService", "a", 353, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    d2.mo68405a("Unregistering with contextmanager");
                    aucu.m76783a(sdl.m34954a(tjj.m37074a(c2.f43165D, service)), chbh.m148005c(), TimeUnit.MILLISECONDS);
                    z2 = true;
                }
                String str = account.name;
                return z2;
            }
            i = c.hashCode();
            boolean z22 = false;
            PendingIntent service2 = PendingIntent.getService(context, i, startIntent, 0);
            rjx c22 = lrh.m19579c(context, lri.m19582a("com.google.android.gms.udc", account));
            if (!z) {
            }
            String str2 = account.name;
            return z22;
        } catch (gid | IOException e2) {
        }
    }

    /* renamed from: a */
    private static final boolean m93663a(String str) {
        return "UdcContextRegistrationOneOff".equals(str) || "UdcContextRegistrationPeriodic".equals(str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:56:0x0136  */
    /* renamed from: a */
    public final int mo6269a(aecc aecc) {
        int i;
        avgl avgl;
        int a;
        aeez aeez;
        boolean z;
        String str = aecc.f63128a;
        if (!m93663a(str) ? m93666b(str) : !chbh.m148017o()) {
            int i2 = 1;
            if (chbh.m148017o() || m93663a(aecc.f63128a)) {
                Context applicationContext = getApplicationContext();
                if (!chbh.m148004b() || chbh.m148017o()) {
                    z = false;
                } else {
                    z = true;
                }
                if (!z) {
                    if (m93665b(applicationContext)) {
                        z = false;
                    }
                }
                boolean z2 = false;
                for (Account account : soz.m35801d(applicationContext, "com.google.android.gms")) {
                    z2 |= !m93662a(applicationContext, account, z);
                }
                if (!z2) {
                    applicationContext.getSharedPreferences("UdcCtxMgrPrefs", 0).edit().putBoolean("UdcCtxMgrPrefsReg", z).commit();
                    i2 = 0;
                }
                if (!chbh.m148016n() && (aeez = avfo.m78438a(this).f93091a) != null) {
                    bbjl a2 = "UdcTestSync".equals(aecc.f63128a) ? bbjl.m88093a(aval.SYNC_ID_CUSTOM_CACHE, 2) : aeez.mo34111a(aecc.f63128a);
                    if (a2.mo56168a() == aval.SYNC_ID_CUSTOM_CACHE) {
                        avgl avgl2 = a2.mo56169b() == 3 ? avgl.PERIODIC : avgl.TRIGGERED_BY_EVENT;
                        aeeh g = avfo.m78445g(this);
                        if (chbh.m148010h()) {
                            i = g.mo34073a(g.mo34075a((aval) a2.mo56168a(), avgm.m78459a(this).mo51205b(avgl2), a2.mo56169b(), avfo.m78444f(this)));
                        } else {
                            aeeu g2 = g.mo34089g((aval) a2.mo56168a());
                            i = g2.mo34063a(g2.mo34066a(new avfe(this, avgl2), a2.mo56169b(), avfo.m78444f(this)), a2.mo56169b());
                        }
                        if (chbh.m148008f() && "UdcTestSync".equals(aecc.f63128a) && i == 0) {
                            return m93664b();
                        }
                    }
                } else if (m93666b(aecc.f63128a)) {
                    if (!"UdcSyncPeriodic".equals(aecc.f63128a)) {
                        avgl = avgl.TRIGGERED_BY_EVENT;
                    } else {
                        avgl = avgl.PERIODIC;
                    }
                    aeeh g3 = avfo.m78445g(this);
                    if (chbh.m148010h()) {
                        a = g3.mo34073a(g3.mo34075a(aval.SYNC_ID_CUSTOM_CACHE, avgm.m78459a(this).mo51205b(avgl), g3.mo34079b(aval.SYNC_ID_CUSTOM_CACHE).mo34092a(aecc.f63128a), avfo.m78444f(this)));
                    } else {
                        aeeu g4 = g3.mo34089g(aval.SYNC_ID_CUSTOM_CACHE);
                        int a3 = g4.mo34065a(aecc.f63128a);
                        a = g4.mo34063a(g4.mo34066a(new avff(this, avgl), a3, avfo.m78444f(this)), a3);
                    }
                    if (chbh.m148008f() && "UdcTestSync".equals(aecc.f63128a) && i == 0) {
                        return m93664b();
                    }
                }
                return i;
            }
            i2 = 0;
            if (!chbh.m148016n()) {
            }
            if (m93666b(aecc.f63128a)) {
            }
            return i;
        }
        aeat.m51532a(this).mo33986a(aecc.f63128a, "com.google.android.gms.udc.service.UdcContextInitService");
        return 2;
    }
}
