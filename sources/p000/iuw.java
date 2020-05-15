package p000;

import android.text.TextUtils;
import com.google.android.gms.auth.easyunlock.authorization.EasyUnlockChimeraService;
import com.google.android.gms.auth.proximity.RemoteDevice;
import com.google.android.gms.auth.proximity.firstparty.SyncedCryptauthDevice;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: iuw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class iuw implements Runnable {

    /* renamed from: a */
    final /* synthetic */ EasyUnlockChimeraService f21834a;

    public iuw(EasyUnlockChimeraService easyUnlockChimeraService) {
        this.f21834a = easyUnlockChimeraService;
    }

    /* renamed from: a */
    private final Set m16182a(ivi ivi) {
        C1225nr nrVar = new C1225nr();
        jpc a = jpy.m17097a(this.f21834a);
        Set b = ivg.m16210b(this.f21834a);
        if (b.isEmpty()) {
            return nrVar;
        }
        try {
            for (SyncedCryptauthDevice syncedCryptauthDevice : (List) aucu.m76783a(a.mo13965a(), ccfm.m129454b(), TimeUnit.SECONDS)) {
                if (b.contains(syncedCryptauthDevice.f11187b)) {
                    if (!ccfs.f178881a.mo6606a().mo75868a() || !syncedCryptauthDevice.f11197l.contains(bsni.EASY_UNLOCK_CLIENT.name())) {
                        if (syncedCryptauthDevice.f11191f) {
                            if (!"chrome".equals(syncedCryptauthDevice.f11194i)) {
                            }
                        }
                    }
                    jnd jnd = new jnd();
                    jnd.f22863a = RemoteDevice.m6768a(syncedCryptauthDevice.f11186a);
                    jnd.f22864b = syncedCryptauthDevice.f11188c;
                    jnd.f22865c = syncedCryptauthDevice.f11187b;
                    jnd.f22866d = syncedCryptauthDevice.f11186a;
                    jnd.f22867e = syncedCryptauthDevice.f11194i;
                    nrVar.add(jnd.mo13895a());
                }
            }
            return nrVar;
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            EasyUnlockChimeraService.f10563b.mo25417e("Error getting synced metadata.", e, new Object[0]);
            if (e instanceof InterruptedException) {
                ivi.mo13372c(5);
                Thread.currentThread().interrupt();
                return null;
            } else if (e instanceof TimeoutException) {
                ivi.mo13372c(6);
                return null;
            } else {
                ivi.mo13372c(7);
                return null;
            }
        }
    }

    public final void run() {
        boolean z;
        ivi a = ivh.m16212a();
        if (ccfm.m129455c()) {
            rrs rrs = this.f21834a.f10565a;
            if (rrs != null && rrs.mo25052b()) {
                iuy a2 = EasyUnlockChimeraService.m6557a();
                Set a3 = m16182a(a);
                if (a3 == null) {
                    this.f21834a.stopSelf();
                } else if (a3.isEmpty()) {
                    EasyUnlockChimeraService.f10563b.mo25412b("Not initializing EasyUnlock. No remote devices.", new Object[0]);
                    a.mo13372c(3);
                    this.f21834a.stopSelf();
                } else {
                    if (a2 != null && a2.f21839c) {
                        synchronized (a2.f21838b) {
                            z = !a2.f21837a.equals(a3);
                        }
                        if (!z) {
                            EasyUnlockChimeraService.f10563b.mo25414c("Nothing to do. %d remote devices have not changed:\n    %s", Integer.valueOf(((C1225nr) a3).f26758b), TextUtils.join("\n    ", a3));
                            a.mo13372c(4);
                            return;
                        }
                    }
                    EasyUnlockChimeraService.f10563b.mo25414c("Initializing ProximityAuth with %d devices:\n    %s", Integer.valueOf(((C1225nr) a3).f26758b), TextUtils.join("\n    ", a3));
                    if (a2 != null) {
                        a2.mo13351b();
                    }
                    iuy iuy = new iuy(this.f21834a, a3);
                    EasyUnlockChimeraService.m6558a(iuy);
                    iuy.mo13347a();
                    a.mo13372c(0);
                }
            } else {
                EasyUnlockChimeraService.f10563b.mo25412b("Not initializing EasyUnlock. Bluetooth disabled", new Object[0]);
                a.mo13372c(2);
                this.f21834a.stopSelf();
            }
        } else {
            EasyUnlockChimeraService.f10563b.mo25414c("EasyUnlock not enabled, skipping initialization.", new Object[0]);
            a.mo13372c(1);
            this.f21834a.stopSelf();
        }
    }
}
