package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.PowerManager;
import com.google.android.gms.location.WifiScan;
import com.google.android.location.reporting.collectors.LocationHistorianDataRetriever$LogDataReceiver;
import com.google.android.location.reporting.service.ReportingSyncChimeraService;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: bgxw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bgxw extends bgxs {

    /* renamed from: b */
    public final bgwm f117945b;

    /* renamed from: f */
    private final bgxm f117946f;

    /* renamed from: g */
    private FutureTask f117947g;

    /* renamed from: h */
    private final bfke f117948h;

    /* renamed from: i */
    private final sny f117949i = new sny(1, 10);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo63328a(Intent intent) {
        int i = bgxx.f117951w;
        int i2 = Build.VERSION.SDK_INT;
        String action = intent.getAction();
        String valueOf = String.valueOf(intent);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36);
        sb.append("DispatchingService.Slow dispatching ");
        sb.append(valueOf);
        sb.toString();
        if ("com.google.android.location.reporting.UPLOAD".equals(action)) {
            FutureTask futureTask = this.f117947g;
            if (futureTask != null && !futureTask.isDone()) {
                bgur.m100011a("GCoreUlr", "Previous upload task still in progress");
                return;
            }
            long aZ = chcs.f188354a.mo6606a().mo85064aZ();
            FutureTask futureTask2 = new FutureTask(new bgxv(this), null);
            this.f117947g = futureTask2;
            this.f117949i.execute(futureTask2);
            try {
                this.f117947g.get(aZ, TimeUnit.MILLISECONDS);
            } catch (InterruptedException | CancellationException e) {
                bgur.m100021b("GCoreUlr", "Upload task interrupted or cancelled", e);
                bguv.m100042a("UlrUploadTaskCancelled");
            } catch (TimeoutException e2) {
                StringBuilder sb2 = new StringBuilder(51);
                sb2.append("Upload task timed out after ");
                sb2.append(aZ);
                sb2.append("ms ");
                bgur.m100021b("GCoreUlr", sb2.toString(), e2);
                bguv.m100042a("UlrUploadTaskTimeout");
            } catch (ExecutionException e3) {
                bgur.m100009a("GCoreUlr", 7, "Upload task exception", e3);
            }
        } else if ("com.google.android.location.reporting.ACTION_INSISTENT_SYNC".equals(action)) {
            Account a = bgyc.m100305a(intent);
            if (a != null && chca.f188316a.mo6606a().mo84980a()) {
                Account account = new Account(bgzo.m100473b(a.name), a.type);
                intent.putExtra("account", account);
                a = account;
            }
            if (a != null && this.f117948h.mo61825a(a)) {
                bgxm bgxm = this.f117946f;
                String stringExtra = intent.getStringExtra("label");
                Account account2 = (Account) intent.getParcelableExtra("account");
                try {
                    bgxm.mo63326a(account2, bgxm.m100246a(intent, "reportingEnabled"), bgxm.m100246a(intent, "historyEnabled"), bgxm.m100246a(intent, "ulrRelatedSettingChange").booleanValue(), intent.getStringExtra("auditToken"));
                } catch (chuw | gid | IOException e4) {
                    bgur.m100012a("GCoreUlr", "Insistent sync failed, requesting regular sync with retry", e4);
                    ReportingSyncChimeraService.m117310a(account2, stringExtra, bgxm.f117923a);
                    bguv.m100042a("UlrSyncException");
                }
            } else {
                String valueOf2 = String.valueOf(aeqm.m52397a(a));
                bgur.m100018b("GCoreUlr", 42, valueOf2.length() == 0 ? new String("Received sync request for invalid account: ") : "Received sync request for invalid account: ".concat(valueOf2));
            }
        } else {
            String valueOf3 = String.valueOf(intent);
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 27);
            sb3.append("Unsupported Slow action in ");
            sb3.append(valueOf3);
            bgur.m100024c("GCoreUlr", 19, sb3.toString());
        }
    }

    /* renamed from: c */
    public final void mo25780c() {
        bgts bgts;
        LocationHistorianDataRetriever$LogDataReceiver locationHistorianDataRetriever$LogDataReceiver;
        FutureTask futureTask = this.f117947g;
        if (futureTask != null && !futureTask.isDone()) {
            this.f117947g.cancel(true);
        }
        bgwm bgwm = this.f117945b;
        if (!(bgwm == null || (locationHistorianDataRetriever$LogDataReceiver = (bgts = bgwm.f117841i).f117518b) == null)) {
            bqgj bqgj = locationHistorianDataRetriever$LogDataReceiver.f150863b;
            if (bqgj != null) {
                bqgj.shutdownNow();
                locationHistorianDataRetriever$LogDataReceiver.f150863b = null;
            }
            bgts.f117519c.unregisterReceiver(bgts.f117518b);
            bgts.f117518b = null;
        }
        super.mo25780c();
    }

    public bgxw(bgxx bgxx) {
        super(bgxx, bgxx.m100276a(), "UlrDispSvcSlow");
        bgwx a = bgwx.m100189a(bgxx.f117952b);
        Context context = bgxx.f117952b;
        bgye bgye = bgxx.f117953c;
        bgyg bgyg = bgxx.f117954d;
        bguc bguc = bgxx.f117963m;
        bgue bgue = bgxx.f117964n;
        bgug bgug = bgxx.f117965o;
        aesh aesh = bgxx.f117956f;
        rjx rjx = bgxx.f117972v;
        bgyf bgyf = bgxx.f117955e;
        this.f117945b = new bgwm(context, bgye, bgyg, a, bguc, bgue, bgug, aesh, rjx, bgyf, new bgts(context, bgyf, context.getSharedPreferences("ULR_HISTORIAN_STATE", 0), (ConnectivityManager) context.getSystemService("connectivity"), new bgtr((PowerManager) context.getSystemService("power")), new LocationHistorianDataRetriever$LogDataReceiver()), new Random(System.currentTimeMillis()));
        this.f117946f = bgxm.m100244a(bgxx.f117952b);
        this.f117948h = bfkd.m97106a(bgxx.f117952b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo63330a(WifiScan wifiScan) {
        bgur.m100022b("GCoreUlr", new UnsupportedOperationException("DispatchingService.Slow unexpectedly received wifi scan"));
    }
}
