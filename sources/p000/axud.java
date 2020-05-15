package p000;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.wearable.node.AbstractCloudSyncManager$GcmConnectionReceiver;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: axud */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class axud implements axxg, ayjm, axwy {

    /* renamed from: a */
    protected boolean f96364a;

    /* renamed from: b */
    protected boolean f96365b;

    /* renamed from: c */
    public final axwi f96366c;

    /* renamed from: d */
    protected final Object f96367d = new Object();

    /* renamed from: e */
    public final axzm f96368e;

    /* renamed from: f */
    protected final Context f96369f;

    /* renamed from: g */
    protected final axuc f96370g = new axuc();

    /* renamed from: h */
    final aakz f96371h;

    /* renamed from: i */
    private final AbstractCloudSyncManager$GcmConnectionReceiver f96372i;

    /* renamed from: j */
    private final ayak f96373j;

    /* renamed from: k */
    private final ayae f96374k;

    /* renamed from: l */
    private final axxv f96375l;

    public axud(Context context, axwi axwi, ayak ayak, ayae ayae, axxv axxv, axzm axzm) {
        this.f96366c = axwi;
        this.f96369f = context;
        this.f96375l = axxv;
        this.f96368e = axzm;
        this.f96371h = aakz.m21424a(context);
        this.f96364a = m83221k();
        this.f96365b = mo53564c();
        this.f96372i = new AbstractCloudSyncManager$GcmConnectionReceiver(this);
        this.f96373j = ayak;
        this.f96374k = ayae;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.gcm.CONNECTED");
        intentFilter.addAction("com.google.android.gcm.DISCONNECTED");
        this.f96369f.registerReceiver(this.f96372i, intentFilter);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        return false;
     */
    /* renamed from: k */
    private final boolean m83221k() {
        synchronized (this.f96367d) {
            axos l = m83222l();
            if (l != null) {
                if (Log.isLoggable("CloudSync", 3)) {
                    boolean g = l.mo53344g("cloud_sync_opted_in");
                    StringBuilder sb = new StringBuilder(23);
                    sb.append("CloudSyncOptedIn: ");
                    sb.append(g);
                    Log.d("CloudSync", sb.toString());
                }
                boolean g2 = l.mo53344g("cloud_sync_opted_in");
                return g2;
            } else if (Log.isLoggable("CloudSync", 3)) {
                Log.d("CloudSync", "CloudSyncOptedIn not set, default to be false.");
            }
        }
    }

    /* renamed from: l */
    private final axos m83222l() {
        return axxj.m83471a(this.f96375l, "cloud", "/cloud_sync_opt_in");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo53556a(String str);

    /* renamed from: a */
    public final void mo53557a(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            axxi axxi = (axxi) arrayList.get(i);
            if (ayha.f97559a.equals(axxi.f96646a) && "cloud".equals(axxi.f96647b.f96639a)) {
                String str = axxi.f96647b.f96640b;
                if ("/cloud_sync_opt_in".equals(str) || "/cloud_sync_setting".equals(str)) {
                    synchronized (this.f96367d) {
                        boolean i2 = mo53570i();
                        axos a = axos.m82822a(axxi.f96647b.f96642d);
                        if ("/cloud_sync_opt_in".equals(str)) {
                            this.f96364a = a.mo53344g("cloud_sync_opted_in");
                            if (Log.isLoggable("CloudSync", 3)) {
                                boolean z = this.f96364a;
                                StringBuilder sb = new StringBuilder(33);
                                sb.append("CloudSyncOptedIn is set to: ");
                                sb.append(z);
                                Log.d("CloudSync", sb.toString());
                            }
                        } else if ("/cloud_sync_setting".equals(str)) {
                            this.f96365b = a.mo53344g("cloud_sync_setting_enabled");
                            if (Log.isLoggable("CloudSync", 3)) {
                                boolean z2 = this.f96365b;
                                StringBuilder sb2 = new StringBuilder(33);
                                sb2.append("CloudSyncSetting is set to: ");
                                sb2.append(z2);
                                Log.d("CloudSync", sb2.toString());
                            }
                        }
                        mo53562b(i2);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final axom mo53561b() {
        return new axom(mo53560a(), m83221k());
    }

    /* renamed from: c */
    public final void mo53563c(boolean z) {
        axos axos = new axos();
        axos.mo53330a("cloud_sync_setting_enabled", z);
        if (Log.isLoggable("CloudSync", 3)) {
            StringBuilder sb = new StringBuilder(34);
            sb.append("saveCloudSyncSetting, value: ");
            sb.append(z);
            Log.d("CloudSync", sb.toString());
        }
        axxj.m83474a(this.f96375l, "cloud", "/cloud_sync_setting", axos);
    }

    /* renamed from: d */
    public final boolean mo53565d() {
        ayae ayae = this.f96374k;
        synchronized (ayae.f96894b) {
            ayae.mo53826a();
            for (String str : ayae.f96893a.keySet()) {
                axzf b = ayae.mo53828b(str);
                if (b != null && "cloud".equals(b.f96814a) && !str.equals("cloud")) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: e */
    public final boolean mo53566e() {
        Set<ayac> b = this.f96368e.mo53786b();
        if (Log.isLoggable("CloudSync", 3)) {
            String valueOf = String.valueOf(b.toString());
            Log.d("CloudSync", valueOf.length() == 0 ? new String("isConnectedToCloud(), Reachable Nodes: ") : "isConnectedToCloud(), Reachable Nodes: ".concat(valueOf));
        }
        for (ayac ayac : b) {
            if (ayac.f96884a.f96814a.equals("cloud") && ayac.f96885b == 1) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public final void mo53567f() {
        synchronized (this.f96367d) {
            if (Log.isLoggable("CloudSync", 3)) {
                Log.d("CloudSync", "enableCloudRoute: transitioning to connectedToCloud");
            }
            this.f96368e.mo53588a(axwp.f96619b);
            this.f96373j.mo53588a(axwp.f96619b);
            mo53568g();
        }
    }

    /* renamed from: g */
    public final void mo53568g() {
        Bundle bundle = new Bundle();
        bundle.putString("to", "https://gcm.googleapis.com/gcm/gcmevents");
        bundle.putString("notify", String.valueOf(chnj.m149031g()).concat("@google.com"));
        bundle.putString("type", "7");
        try {
            this.f96371h.mo16961a("https://gcm.googleapis.com/gcm/gcm.event_tracker", "enableConnectionNotifications", 0, bundle);
            if (Log.isLoggable("CloudSync", 3)) {
                Log.d("CloudSync", "enableConnectionNotifications: sent request to enable GCM events");
            }
        } catch (IOException e) {
            String valueOf = String.valueOf(e.getMessage());
            Log.w("CloudSync", valueOf.length() == 0 ? new String("enableConnectionNotifications: IOException while attempting to enable GCM events: ") : "enableConnectionNotifications: IOException while attempting to enable GCM events: ".concat(valueOf));
        }
    }

    /* renamed from: h */
    public final void mo53569h() {
        this.f96368e.mo53589a("cloud");
        this.f96373j.mo53589a("cloud");
    }

    /* renamed from: i */
    public final boolean mo53570i() {
        boolean z;
        synchronized (this.f96367d) {
            z = false;
            if (this.f96365b && this.f96364a) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: j */
    public abstract void mo53571j();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo53562b(boolean z) {
        synchronized (this.f96367d) {
            if (Log.isLoggable("CloudSync", 3)) {
                boolean z2 = this.f96364a;
                StringBuilder sb = new StringBuilder(34);
                sb.append("Initial cloud sync opted in: ");
                sb.append(z2);
                Log.d("CloudSync", sb.toString());
                boolean z3 = this.f96365b;
                StringBuilder sb2 = new StringBuilder(33);
                sb2.append("Initial Cloud sync setting: ");
                sb2.append(z3);
                Log.d("CloudSync", sb2.toString());
            }
            if (mo53570i()) {
                if (!z) {
                    if (Log.isLoggable("CloudSync", 3)) {
                        Log.d("CloudSync", "Init cloud sync.");
                    }
                    this.f96368e.mo53786b();
                    mo53571j();
                    try {
                        aakz aakz = this.f96371h;
                        adzt adzt = new adzt(Looper.getMainLooper(), new axub(this));
                        if (aakz.f28399c.size() <= 20) {
                            int andIncrement = aakz.f28397d.getAndIncrement();
                            StringBuilder sb3 = new StringBuilder(21);
                            sb3.append("google.rpc");
                            sb3.append(andIncrement);
                            String sb4 = sb3.toString();
                            aakz.f28399c.put(sb4, adzt);
                            Bundle bundle = new Bundle();
                            bundle.putParcelable("google.messenger", aakz.f28401f);
                            aakz.f28396a.mo16961a("https://gcm.googleapis.com/local/status", sb4, 0, bundle);
                            axwi axwi = this.f96366c;
                            if (Log.isLoggable("CloudNode", 2)) {
                                Log.v("CloudNode", "received request to start syncing to cloud, scheduling.");
                            }
                            axwi.f96594s = true;
                            axwi.f96592q = true;
                            axwi.f96595t.mo54035a();
                            axwi.f96585j.mo53669a(1);
                        } else {
                            throw new IOException("ERROR_MAX_CONCURRENT_RPC_EXCEEDED");
                        }
                    } catch (IOException e) {
                        String valueOf = String.valueOf(e.getMessage());
                        Log.w("CloudSync", valueOf.length() == 0 ? new String("Failed to check GCM connection state: ") : "Failed to check GCM connection state: ".concat(valueOf));
                    }
                }
            }
            if (!mo53570i()) {
                if (z) {
                    mo53556a(this.f96364a ? "disabled in setting" : "not opted in");
                }
            }
        }
    }

    /* renamed from: c */
    public final boolean mo53564c() {
        axos a = axxj.m83471a(this.f96375l, "cloud", "/cloud_sync_setting");
        if (a != null) {
            return a.mo53344g("cloud_sync_setting_enabled");
        }
        return false;
    }

    /* renamed from: a */
    public void mo53558a(ssb ssb, boolean z, boolean z2) {
        ssb.mo26034a();
        boolean z3 = this.f96364a;
        StringBuilder sb = new StringBuilder(26);
        sb.append("Cloud Sync opted in: ");
        sb.append(z3);
        ssb.println(sb.toString());
        boolean z4 = this.f96365b;
        StringBuilder sb2 = new StringBuilder(25);
        sb2.append("Cloud Sync setting: ");
        sb2.append(z4);
        ssb.println(sb2.toString());
        boolean e = mo53566e();
        StringBuilder sb3 = new StringBuilder(29);
        sb3.append("Connected to gcm/cloud: ");
        sb3.append(e);
        ssb.println(sb3.toString());
        ssb.mo26035b();
    }

    /* renamed from: a */
    public final void mo53559a(boolean z) {
        if (m83221k() && !z) {
            this.f96366c.mo53679a("cloud");
        }
        axos axos = new axos();
        axos.mo53330a("cloud_sync_opted_in", z);
        axxj.m83474a(this.f96375l, "cloud", "/cloud_sync_opt_in", axos);
        mo53563c(z);
    }

    /* renamed from: a */
    public final boolean mo53560a() {
        return m83222l() != null;
    }
}
