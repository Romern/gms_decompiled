package p000;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: amx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class amx {

    /* renamed from: a */
    public final Context f946a;

    /* renamed from: b */
    public final Handler f947b;

    /* renamed from: c */
    public boolean f948c;

    /* renamed from: d */
    public final BroadcastReceiver f949d = new amu(this);

    /* renamed from: e */
    public final Runnable f950e = new amv(this);

    /* renamed from: f */
    private final amw f951f;

    /* renamed from: g */
    private final PackageManager f952g;

    /* renamed from: h */
    private final ArrayList f953h = new ArrayList();

    public amx(Context context, amw amw) {
        this.f946a = context;
        this.f951f = amw;
        this.f947b = new Handler();
        this.f952g = context.getPackageManager();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo1061a() {
        if (this.f948c) {
            Iterator<ResolveInfo> it = this.f952g.queryIntentServices(new Intent("android.media.MediaRouteProviderService"), 0).iterator();
            int i = 0;
            while (true) {
                int i2 = -1;
                if (!it.hasNext()) {
                    break;
                }
                ServiceInfo serviceInfo = it.next().serviceInfo;
                if (serviceInfo != null) {
                    String str = serviceInfo.packageName;
                    String str2 = serviceInfo.name;
                    int size = this.f953h.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size) {
                            break;
                        }
                        amt amt = (amt) this.f953h.get(i3);
                        if (amt.f937i.getPackageName().equals(str) && amt.f937i.getClassName().equals(str2)) {
                            i2 = i3;
                            break;
                        }
                        i3++;
                    }
                    if (i2 < 0) {
                        amt amt2 = new amt(this.f946a, new ComponentName(serviceInfo.packageName, serviceInfo.name));
                        amt2.mo1048a();
                        this.f953h.add(i, amt2);
                        this.f951f.mo986a(amt2);
                        i++;
                    } else if (i2 >= i) {
                        amt amt3 = (amt) this.f953h.get(i2);
                        amt3.mo1048a();
                        if (amt3.f941m == null && amt3.mo1052c()) {
                            amt3.mo1054e();
                            amt3.mo1053d();
                        }
                        Collections.swap(this.f953h, i2, i);
                        i++;
                    }
                }
            }
            if (i < this.f953h.size()) {
                for (int size2 = this.f953h.size() - 1; size2 >= i; size2--) {
                    amt amt4 = (amt) this.f953h.get(size2);
                    alt alt = (alt) this.f951f;
                    alu b = alt.mo990b(amt4);
                    if (b != null) {
                        amt4.mo948a((akq) null);
                        amt4.mo947a((akp) null);
                        alt.mo987a(b, (alb) null);
                        alt.f855g.mo983a(514, b);
                        alt.f853e.remove(b);
                    }
                    this.f953h.remove(amt4);
                    if (amt4.f940l) {
                        amt4.f940l = false;
                        amt4.mo1051b();
                    }
                }
            }
        }
    }
}
