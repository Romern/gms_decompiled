package p000;

import android.accounts.Account;
import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.PeriodicSync;
import android.content.SharedPreferences;
import android.content.SyncResult;
import android.os.Bundle;
import android.util.Pair;
import com.felicanetworks.sdu.ErrorInfo;
import java.io.IOException;
import java.io.Serializable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: zot */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zot extends smx {

    /* renamed from: a */
    private static final srn f55632a = zvt.m46581a();

    /* renamed from: b */
    private final yzs f55633b;

    /* renamed from: c */
    private final ytp f55634c;

    /* renamed from: d */
    private final sqv f55635d;

    public zot(Context context, boolean z, boolean z2, yzs yzs) {
        super(context, z, z2, "fitness");
        this.f55633b = yzs;
        this.f55634c = yzs.mo30887i();
        this.f55635d = yzs.mo30869a();
    }

    /* renamed from: a */
    private final ytq m45910a(Account account, int i) {
        ytq a = this.f55634c.mo30767a(getContext());
        a.mo30762a(account.name);
        a.mo30755a((int) ErrorInfo.TYPE_FELICA_EXCEPTION_TIMEOUT_OCCURRED);
        a.mo30765d(i);
        return a;
    }

    /* renamed from: b */
    private final void m45914b() {
        if (yvq.m44913f(getContext())) {
            zme.m45749a(getContext(), "com.google.android.gms.fitness.service.recording.FitRecordingBroker");
        }
    }

    /* renamed from: c */
    private final void m45916c(Account account) {
        long a = (long) yvq.m44908a(getContext());
        boolean z = false;
        for (PeriodicSync periodicSync : ContentResolver.getPeriodicSyncs(account, "com.google.android.gms.fitness")) {
            if (periodicSync.period != a) {
                new rtg(getContext());
                rtg.m34395a(account, "com.google.android.gms.fitness", periodicSync.extras);
            } else {
                z = true;
            }
        }
        if (!z) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("sync_periodic", true);
            new rtg(getContext());
            rtg.m34396a(account, "com.google.android.gms.fitness", bundle, a);
        }
    }

    /* renamed from: d */
    private final SharedPreferences m45917d(Account account) {
        return zuw.m46538d(getContext(), account.name);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo11595a() {
        return 3329;
    }

    /* renamed from: a */
    private final ytq m45911a(Account account, int i, long j) {
        long b = this.f55635d.mo20506b();
        ytq a = m45910a(account, i);
        a.mo30756a(b - j);
        return a;
    }

    /* renamed from: b */
    private final boolean m45915b(Account account) {
        return zmc.m45740a(this.f55633b.mo30877c(account.name), this.f55633b.mo30880e(account.name));
    }

    /* renamed from: a */
    private final void m45912a(Account account) {
        for (PeriodicSync periodicSync : ContentResolver.getPeriodicSyncs(account, "com.google.android.gms.fitness")) {
            new rtg(getContext());
            rtg.m34395a(account, "com.google.android.gms.fitness", periodicSync.extras);
        }
        ContentResolver.setIsSyncable(account, "com.google.android.gms.fitness", 0);
        ContentResolver.setSyncAutomatically(account, "com.google.android.gms.fitness", false);
        ContentResolver.cancelSync(account, "com.google.android.gms.fitness");
    }

    /* renamed from: a */
    private final void m45913a(Account account, long j, zsr zsr, cadt cadt, int i) {
        long b = this.f55635d.mo20506b() - j;
        zsr.mo31463c(b);
        zsr.mo31455a(cadt);
        ytq a = m45910a(account, i);
        a.mo30756a(b);
        a.mo30760a(zsr.mo31451a());
        a.mo30754a();
        this.f55633b.mo30894l(account.name).mo31468a(zsr.mo31451a());
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: zul.a(android.content.Context, zuu, zra):void
     arg types: [android.content.Context, zuu, zre]
     candidates:
      zul.a(android.content.Context, zuu, zre):void
      zul.a(android.content.Context, zuu, zra):void */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo11596a(Account account, Bundle bundle, String str, ContentProviderClient contentProviderClient, SyncResult syncResult) {
        long j;
        bpgz bpgz;
        String str2;
        String str3;
        long j2;
        Pair pair;
        zot zot = this;
        Account account2 = account;
        Bundle bundle2 = bundle;
        yvq.m44916i(getContext());
        if (cdyu.f181962a.mo6606a().mo78519w() && !m45915b(account)) {
            return false;
        }
        boolean z = bundle2.getBoolean("initialize");
        boolean z2 = bundle2.getBoolean("force");
        cadu cadu = !z2 ? cadu.PERIODIC : cadu.FIT_APP_INITIATED;
        if (z) {
            String str4 = account2.name;
            if (!cdyu.f181962a.mo6606a().mo78518v() || m45915b(account)) {
                if (ceab.m135734g()) {
                    m45912a(account);
                    zuq.m46513a(getContext(), account2.name);
                } else {
                    zux.m46540a(account);
                    m45916c(account);
                }
            }
            return false;
        } else if (ceab.m135734g()) {
            m45912a(account);
            zuq.m46514a(getContext(), account2.name, cadu);
            return false;
        } else {
            long a = zot.f55635d.mo20505a();
            long b = zot.f55635d.mo20506b();
            long a2 = zuw.m46534a(getContext(), account2.name);
            if (a2 > 0) {
                bxvd da = bpgz.f137612c.mo74144da();
                j = b;
                long j3 = a - a2;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bpgz bpgz2 = (bpgz) da.f164949b;
                bpgz2.f137614a |= 1;
                bpgz2.f137615b = j3;
                bpgz = (bpgz) da.mo74062i();
            } else {
                j = b;
                bpgz = bpgz.f137612c;
            }
            ytq a3 = zot.f55634c.mo30767a(getContext());
            a3.mo30762a(account2.name);
            a3.mo30755a((int) ErrorInfo.TYPE_FELICA_EXCEPTION_FELICA_NOT_AVAILABLE);
            a3.mo30765d(2);
            a3.mo30761a(bpgz);
            a3.mo30763b(z2 ? 1 : 0);
            a3.mo30754a();
            if (!ceab.f182124a.mo6606a().mo78651b()) {
                zre c = zot.f55633b.mo30877c(account2.name);
                zrk e = zot.f55633b.mo30880e(account2.name);
                long j4 = j;
                if (yud.m44848a(getContext(), a, yvq.m44911d(getContext()), c)) {
                    m45911a(account2, 57, j4).mo30754a();
                } else {
                    j2 = j4;
                    zot = this;
                    if (!zmc.m45740a(c, e)) {
                        zot.m45911a(account2, 45, j2).mo30754a();
                    } else {
                        str3 = "zot";
                        str2 = "a";
                        int seconds = (int) TimeUnit.MILLISECONDS.toSeconds(a - zuw.m46534a(getContext(), account2.name));
                        if (!bundle2.getBoolean("force")) {
                            if (seconds < yvq.m44909b(getContext())) {
                                ytq a4 = zot.m45911a(account2, 46, j2);
                                a4.mo30763b(0);
                                a4.mo30764c(seconds);
                                a4.mo30754a();
                            } else {
                                int c2 = yvq.m44910c(getContext());
                                if (!yua.m44836a(getContext()) && seconds < c2) {
                                    ytq a5 = zot.m45911a(account2, 47, j2);
                                    a5.mo30763b(0);
                                    a5.mo30764c(seconds);
                                    a5.mo30754a();
                                }
                            }
                        }
                    }
                }
                if (!cdyu.f181962a.mo6606a().mo78504h()) {
                    return false;
                }
                m45914b();
                return false;
            }
            j2 = j;
            str3 = "zot";
            str2 = "a";
            zre c3 = zot.f55633b.mo30877c(account2.name);
            zqx j5 = zot.f55633b.mo30890j(account2.name);
            zsr zsr = new zsr(a);
            zsr.mo31465d(3);
            zsr.mo31456a(cadu);
            zuu k = zot.f55633b.mo30892k(account2.name);
            if (k == null) {
                return false;
            }
            zum zum = new zum();
            zul zul = new zul(zsr, m45917d(account), zum, zvn.m46574a(getContext()), zot.f55633b.mo30869a());
            zun zun = new zun(m45917d(account), zum, zsr);
            boolean a6 = yua.m44836a(getContext());
            cadt cadt = !a6 ? cadt.CELL_CONNECTIVITY : cadt.WIFI_CONNECTIVITY;
            try {
                zul.mo31529a(getContext(), k, c3, j5);
                if (!((bnic) yvm.f54688a.mo30787a()).isEmpty()) {
                    if (a6 && yua.m44838c(getContext()) && yua.m44839d(getContext())) {
                        zul.mo31526a(getContext(), k, (zra) c3);
                    }
                }
                zun.mo31532a(k, c3);
                zuw.m46535a(getContext(), account2.name, a);
                m45913a(account, j2, zsr, cadt, 2);
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                m45913a(account, j2, zsr, cadt, 8);
                return false;
            } catch (yqh e3) {
                m45913a(account, j2, zsr, cadt, 34);
                bnsl bnsl = (bnsl) f55632a.mo68388c();
                bnsl.mo68437a(e3);
                bnsl.mo68432a(str3, str2, 230, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68420a("sync error: %s", account2);
            } catch (zuv e4) {
                bnsl bnsl2 = (bnsl) f55632a.mo68390d();
                bnsl2.mo68432a(str3, str2, 232, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68405a("user requested delete history");
                zuw.m46537c(getContext(), account2.name);
                c3.mo31379g();
                m45913a(account, j2, zsr, cadt, 2);
            } catch (TimeoutException e5) {
                bnsl bnsl3 = (bnsl) f55632a.mo68388c();
                bnsl3.mo68437a(e5);
                bnsl3.mo68432a(str3, str2, 238, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl3.mo68420a("Sync timed out: %s", account2);
                m45913a(account, j2, zsr, cadt, 6);
            } catch (IOException e6) {
                bnsl bnsl4 = (bnsl) f55632a.mo68388c();
                bnsl4.mo68437a(e6);
                bnsl4.mo68432a(str3, str2, 243, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl4.mo68420a("Sync failed: %s", account2);
                m45913a(account, j2, zsr, cadt, 10);
            }
            m45916c(account);
            m45914b();
            Intent intent = new Intent();
            intent.setClassName("com.google.android.apps.fitness", "com.google.android.apps.fitness.api.sync.PlatformSyncBroadcastReceiver");
            intent.putExtra("TimestampMillis", System.currentTimeMillis());
            long j6 = zum.f55941a;
            if (j6 != Long.MAX_VALUE) {
                pair = new Pair(Long.valueOf(j6), Long.valueOf(zum.f55942b));
            } else {
                pair = null;
            }
            if (pair != null) {
                Object obj = pair.first;
                Object obj2 = pair.second;
                intent.putExtra("ModifiedStartTimeNanos", (Serializable) pair.first);
                intent.putExtra("ModifiedEndTimeNanos", (Serializable) pair.second);
            }
            getContext().sendBroadcast(intent);
            return true;
        }
    }
}
