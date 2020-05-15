package p000;

import android.content.Context;
import android.location.Location;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.location.reporting.state.update.ReportingConfig;
import com.google.android.ulr.ApiRate;
import java.util.ArrayList;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: bgwp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgwp {

    /* renamed from: a */
    public final bgyf f117852a;

    /* renamed from: b */
    public final bgyg f117853b;

    /* renamed from: c */
    public final bgye f117854c;

    /* renamed from: d */
    private final Context f117855d;

    /* renamed from: e */
    private final bguh f117856e;

    /* renamed from: f */
    private final bgzf f117857f;

    /* renamed from: g */
    private ScheduledExecutorService f117858g;

    public bgwp(Context context, bgyf bgyf, bgyg bgyg, bguh bguh, bgye bgye) {
        bgzf bgzf = new bgzf(context);
        this.f117855d = context;
        this.f117852a = bgyf;
        this.f117853b = bgyg;
        this.f117856e = bguh;
        this.f117854c = bgye;
        this.f117857f = bgzf;
        bgzo.m100459a(context);
    }

    /* renamed from: a */
    private final bgyu m100177a(boolean z, boolean z2, boolean z3) {
        if (z) {
            return bgwo.First;
        }
        bgyu bgyu = !z2 ? bgwo.Stationary : bgwo.Moving;
        bgyf bgyf = this.f117852a;
        if (!bgyf.f118016h && (bgyf.f118017i || bgyf.f118018j)) {
            return bgwo.Stationary;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f117853b.mo63404c());
        if (this.f117852a.mo63388f() != null && this.f117852a.mo63388f().mo43491a().mo43513a() == 0 && bgzf.m100441a(bgzf.m100440a(this.f117857f.f118156b))) {
            arrayList.add(bgwo.ChargingInVehicle);
        }
        if (z3) {
            arrayList.add(bgwo.WifiTriggered);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            bgyu bgyu2 = (bgyu) arrayList.get(i);
            if (bgyu2.mo63287b(z2) < bgyu.mo63287b(z2)) {
                bgyu = bgyu2;
            }
        }
        return bgyu;
    }

    /* renamed from: b */
    public final bgyu mo63294b() {
        return m100177a(false, true, false);
    }

    /* renamed from: a */
    public final bgzk mo63290a(Location location) {
        Location h = this.f117852a.mo63390h();
        boolean z = this.f117852a.f118014f;
        float a = bgzl.m100452a(location, h);
        boolean z2 = true;
        if (a <= 0.0f) {
            return new bgzk(!z, 1);
        }
        float distanceTo = h.distanceTo(location);
        float w = (float) chcs.m148251w();
        if (distanceTo > a && distanceTo > w) {
            return new bgzk(true, 2);
        }
        if (a > w) {
            return new bgzk(!z, 3);
        }
        if (distanceTo <= w) {
            z2 = false;
        }
        return new bgzk(z2, 4);
    }

    /* renamed from: a */
    public final void mo63291a() {
        if (chcs.m148229E()) {
            aeat.m51532a(this.f117855d).mo33986a("ULR", "com.google.android.location.reporting.service.UploadGcmTaskService");
            return;
        }
        ScheduledExecutorService scheduledExecutorService = this.f117858g;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
            this.f117858g = null;
        }
    }

    /* renamed from: a */
    public final void mo63292a(ReportingConfig reportingConfig, Location location) {
        mo63293a(reportingConfig, mo63290a(location), location, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x01b5, code lost:
        return;
     */
    /* renamed from: a */
    public final synchronized void mo63293a(ReportingConfig reportingConfig, bgzk bgzk, Location location, boolean z) {
        ScheduledExecutorService scheduledExecutorService;
        bgzk bgzk2 = bgzk;
        Location location2 = location;
        synchronized (this) {
            mo63291a();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            boolean z2 = bgzk2.f118160a;
            long i = this.f117852a.mo63391i();
            bgyu a = m100177a(i <= 0, z2, z);
            long j = elapsedRealtime - i;
            long b = a.mo63287b(z2);
            long j2 = b - j;
            if (this.f117852a.mo63383b() <= 1) {
                bgur.m100011a("GCoreUlr", "Not uploading first location since start (in case we're in restart loop)");
            } else if (j2 <= 0) {
                String valueOf = String.valueOf(a);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 125);
                sb.append("Sending an intent to LocationReporter, hasMoved: ");
                sb.append(z2);
                sb.append(", elapsed millis: ");
                sb.append(j);
                sb.append(", request: ");
                sb.append(valueOf);
                sb.append("(");
                sb.append(b);
                sb.append(")");
                sb.toString();
                boolean z3 = bgzk2.f118160a;
                ApiRate apiRate = new ApiRate(null, a.mo63285a(), null, null, null, null, Long.valueOf(System.currentTimeMillis()), Long.valueOf(a.mo63287b(z3)), a.mo63286a(z3), a.mo63288b());
                this.f117856e.mo63202a(reportingConfig.mo70928b(), new Pair(bgzr.m100488a(apiRate), null), apiRate.toString());
                if (location2 != null) {
                    this.f117852a.mo63374a(location2);
                }
                this.f117852a.mo63384b(elapsedRealtime);
                bgxx.m100277b(this.f117855d);
                return;
            }
            String valueOf2 = String.valueOf(a);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 116);
            sb2.append("Not calling LocationReporter, hasMoved: ");
            sb2.append(z2);
            sb2.append(", elapsed millis: ");
            sb2.append(j);
            sb2.append(", request: ");
            sb2.append(valueOf2);
            sb2.append("(");
            sb2.append(b);
            sb2.append(")");
            sb2.toString();
            if (j2 > 0) {
                if (!chcs.m148229E() && (scheduledExecutorService = this.f117858g) != null && !((sny) scheduledExecutorService).f44829d) {
                    bgur.m100011a("GCoreUlr", "Potential dangling upload identified");
                }
                mo63291a();
                if (chcs.m148229E()) {
                    long j3 = j2 / 1000;
                    aeat a2 = aeat.m51532a(this.f117855d);
                    aebi aebi = new aebi();
                    aebi.mo34004a(j3, 10 + j3);
                    aebi.f63097i = "com.google.android.location.reporting.service.UploadGcmTaskService";
                    aebi.f63102n = false;
                    aebi.mo34023a(0);
                    aebi.mo34032e();
                    aebi.f63106r = aebo.f63077a;
                    aebi.f63099k = "ULR";
                    aebi.mo34027b(1);
                    a2.mo33984a(aebi.mo33974b());
                    StringBuilder sb3 = new StringBuilder(76);
                    sb3.append("Scheduling next upload via GcmTaskManager in ");
                    sb3.append(j2);
                    sb3.append("ms from now");
                    sb3.toString();
                    return;
                }
                this.f117858g = new sny(1, 10);
                StringBuilder sb4 = new StringBuilder(58);
                sb4.append("Scheduling next upload for ");
                sb4.append(j2);
                sb4.append("ms from now");
                sb4.toString();
                ((sny) this.f117858g).schedule(new bgwn(this), j2, TimeUnit.MILLISECONDS);
            }
        }
    }
}
