package p000;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import com.google.android.chimera.Loader;
import com.google.android.gms.auth.managed.p029ui.ManagingAppDownloadBroadcastReceiver;
import java.util.Locale;

/* renamed from: jgu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jgu extends Loader implements jgm, jgo {

    /* renamed from: a */
    public static final sek f22437a = ght.m13171a("AuthManaged", "ManagingAppDownloadStatusLoader");

    /* renamed from: b */
    public final long f22438b;

    /* renamed from: c */
    public boolean f22439c;

    /* renamed from: d */
    public long f22440d;

    /* renamed from: e */
    private final ManagingAppDownloadBroadcastReceiver f22441e;

    /* renamed from: f */
    private Handler f22442f;

    /* renamed from: g */
    private Handler f22443g;

    /* renamed from: h */
    private final HandlerThread f22444h;

    /* renamed from: i */
    private final jgn f22445i;

    /* renamed from: j */
    private Integer f22446j = null;

    /* renamed from: k */
    private boolean f22447k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jgu(Context context, long j) {
        super(context);
        HandlerThread handlerThread = new HandlerThread("CheckDownloadProgressThread");
        this.f22438b = j;
        this.f22444h = handlerThread;
        this.f22441e = new ManagingAppDownloadBroadcastReceiver(rpr.m34216b(), this);
        this.f22445i = new jgn(rpr.m34216b(), this, this.f22438b);
    }

    /* renamed from: a */
    public final void mo13712a() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.f22440d;
        if (j == 0) {
            this.f22440d = elapsedRealtime;
            j = elapsedRealtime;
        }
        if (elapsedRealtime - j < 30000) {
            mo13718a(-1);
            mo13719b();
            return;
        }
        mo13718a(-2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo13719b() {
        if (!isReset()) {
            if (this.f22443g == null) {
                this.f22444h.start();
                this.f22443g = new adzt(this.f22444h.getLooper());
            }
            this.f22443g.postDelayed(this.f22445i, 250);
            f22437a.mo25412b("run thread to check the download progress.", new Object[0]);
        }
    }

    /* access modifiers changed from: protected */
    public final void onReset() {
        f22437a.mo25412b("onReset", new Object[0]);
        if (this.f22447k) {
            this.f22447k = false;
            this.f22444h.quit();
            if (!ccge.m129596b()) {
                this.f22441e.mo7765b();
            }
            this.f22443g = null;
            this.f22442f = null;
            this.f22440d = 0;
            this.f22439c = false;
            this.f22446j = null;
        }
    }

    public final void onStartLoading() {
        f22437a.mo25412b("onStartLoading", new Object[0]);
        Integer num = this.f22446j;
        if (num != null) {
            deliverResult(num);
        }
        if (!this.f22447k) {
            this.f22447k = true;
            this.f22442f = new adzt();
            this.f22439c = false;
            if (!ccge.m129596b()) {
                this.f22441e.mo7764a();
            }
            mo13719b();
            this.f22440d = 0;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo13718a(Integer num) {
        f22437a.mo25412b(String.format(Locale.US, "deliverProgress: %d", num), new Object[0]);
        this.f22446j = num;
        if (isStarted()) {
            this.f22442f.post(new jgt(this, num));
        }
    }
}
