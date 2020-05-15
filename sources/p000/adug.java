package p000;

import android.app.Application;
import android.content.Context;
import android.net.ConnectivityManager;
import com.google.android.chimera.config.ModuleManager;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: adug */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adug extends aduh {

    /* renamed from: d */
    public final C0036av f62761d = new C0036av();

    /* renamed from: e */
    final C0034at f62762e = new C0034at();

    /* renamed from: f */
    final C0034at f62763f = new C0034at();

    /* renamed from: g */
    private final ScheduledExecutorService f62764g = snp.m35703a(1, 9);

    /* renamed from: h */
    private volatile ScheduledFuture f62765h;

    /* renamed from: i */
    private volatile ScheduledFuture f62766i;

    public adug(Application application, ModuleManager.ModuleInfo moduleInfo) {
        super(application, moduleInfo);
        this.f62761d.mo2667a(this.f62763f, new adtz(this));
        this.f62761d.mo2667a(this.f62762e, new adua(this));
    }

    /* renamed from: c */
    private final void m51207c() {
        ScheduledFuture scheduledFuture = this.f62766i;
        this.f62766i = null;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        ScheduledFuture scheduledFuture2 = this.f62765h;
        this.f62765h = null;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(true);
        }
    }

    /* renamed from: a */
    public final void mo33827a() {
        aduf aduf;
        if (Boolean.TRUE.equals(this.f62763f.mo2448b())) {
            adue adue = (adue) this.f62762e.mo2448b();
            if (adue != null) {
                switch (adue.ordinal()) {
                    case 0:
                        aduf = aduf.STARTED;
                        break;
                    case 1:
                        aduf = aduf.DONE;
                        break;
                    case 2:
                        aduf = aduf.ERROR_TIMEOUT;
                        break;
                    case 3:
                        aduf = aduf.ERROR_FAILURE;
                        break;
                    case 4:
                        aduf = aduf.ERROR_NO_NETWORK;
                        break;
                    case 5:
                        aduf = aduf.ERROR_KM_FEATURE_REQUEST_FAILED;
                        break;
                    case 6:
                        aduf = aduf.ERROR_KM_UNAVAILABLE_AFTER_DOWNLOAD;
                        break;
                    default:
                        aduf = aduf.ERROR_FAILURE;
                        break;
                }
            } else {
                aduf = aduf.NORMAL;
            }
        } else {
            aduf = aduf.NORMAL;
        }
        if (aduf.equals(this.f62761d.mo2448b())) {
            return;
        }
        if (ceqp.m137999c()) {
            this.f62761d.mo2450b(aduf);
        } else {
            this.f62761d.mo2453l(aduf);
        }
    }

    /* renamed from: b */
    public final boolean mo33830b() {
        ModuleManager moduleManager = ModuleManager.get(this.f26825a);
        ModuleManager.FeatureCheck featureCheck = new ModuleManager.FeatureCheck();
        featureCheck.checkFeatureAtAnyVersion("kids");
        if (moduleManager.checkFeaturesAreAvailable(featureCheck) != 0) {
            return false;
        }
        m51207c();
        this.f62762e.mo2453l(adue.DONE);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo3218f() {
        m51207c();
    }

    /* renamed from: a */
    public final void mo33828a(adue adue) {
        if (mo33830b()) {
            return;
        }
        if (((ConnectivityManager) this.f26825a.getSystemService("connectivity")).getActiveNetwork() == null) {
            this.f62762e.mo2453l(adue.ERROR_NO_NETWORK);
        } else {
            this.f62762e.mo2453l(adue);
        }
    }

    /* renamed from: a */
    public final void mo33829a(Context context, String str) {
        if (!adue.DONE.equals(this.f62762e.mo2448b())) {
            mo33830b();
            if (!adue.STARTED.equals(this.f62762e.mo2448b()) && !adue.DONE.equals(this.f62762e.mo2448b())) {
                this.f62762e.mo2450b(adue.STARTED);
                if (((ConnectivityManager) this.f26825a.getSystemService("connectivity")).getActiveNetwork() == null) {
                    this.f62762e.mo2450b(adue.ERROR_NO_NETWORK);
                    return;
                }
                ModuleManager.FeatureRequest featureRequest = new ModuleManager.FeatureRequest();
                featureRequest.requestFeatureAtLatestVersion("kids");
                featureRequest.setSessionId(str);
                featureRequest.setUrgent(new adud(this));
                m51207c();
                if (!ModuleManager.get(context).requestFeatures(featureRequest)) {
                    this.f62762e.mo2450b(adue.ERROR_KM_FEATURE_REQUEST_FAILED);
                    if (ceqp.m137999c()) {
                        return;
                    }
                }
                this.f62766i = ((sny) this.f62764g).scheduleWithFixedDelay(new adub(this), ceqw.m138012c(), ceqw.m138012c(), TimeUnit.MILLISECONDS);
                this.f62765h = ((sny) this.f62764g).schedule(new aduc(this), ceqw.f183329a.mo6606a().mo79655h(), TimeUnit.MILLISECONDS);
            }
        }
    }
}
