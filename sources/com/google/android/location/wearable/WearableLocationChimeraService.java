package com.google.android.location.wearable;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Build;
import android.os.Looper;
import com.google.android.gms.location.internal.LocationRequestInternal;
import com.google.android.gms.wearable.internal.MessageEventParcelable;
import com.google.android.gms.wearable.internal.NodeParcelable;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class WearableLocationChimeraService extends axpp implements sth, bhdg {

    /* renamed from: a */
    public final Object f150973a = new Object();

    /* renamed from: h */
    public Looper f150974h;

    /* renamed from: i */
    public bhdh f150975i;

    /* renamed from: j */
    public C1245ok f150976j;

    /* renamed from: k */
    public bhdj f150977k;

    /* renamed from: l */
    public rjx f150978l;

    /* renamed from: m */
    public rjx f150979m;

    /* renamed from: n */
    private aesh f150980n;

    /* renamed from: o */
    private sti f150981o;

    /* renamed from: p */
    private rkb f150982p;

    /* renamed from: q */
    private bfpj f150983q;

    /* renamed from: r */
    private axot f150984r;

    /* renamed from: s */
    private bhdi f150985s;

    /* renamed from: t */
    private boolean f150986t;

    /* renamed from: u */
    private boolean f150987u;

    /* renamed from: v */
    private boolean f150988v;

    /* renamed from: w */
    private Set f150989w;

    /* renamed from: x */
    private Set f150990x;

    /* renamed from: y */
    private axqb f150991y;

    /* renamed from: z */
    private rjx f150992z;

    /* renamed from: a */
    public final void mo53375a(axoj axoj) {
        int i;
        if ("com.google.android.location.fused.wearable.LOCATION_REQUESTOR_CAPABILITY".equals(axoj.mo53306a())) {
            synchronized (this.f150973a) {
                Set b = axoj.mo53307b();
                for (NodeParcelable nodeParcelable : rsr.m34361b(this.f150989w, b)) {
                    bfpj bfpj = this.f150983q;
                    bfpj.mo26010a(25, bfpj.f114792l.mo62094a(nodeParcelable.f110950a));
                }
                for (NodeParcelable nodeParcelable2 : rsr.m34361b(b, this.f150989w)) {
                    bfpj bfpj2 = this.f150983q;
                    bfpj2.mo26010a(24, bfpj2.f114792l.mo62094a(nodeParcelable2.f110950a));
                }
                Iterator it = b.iterator();
                while (true) {
                    i = 0;
                    if (!it.hasNext()) {
                        break;
                    }
                    NodeParcelable nodeParcelable3 = (NodeParcelable) it.next();
                    if (nodeParcelable3.f110953d && !this.f150990x.contains(nodeParcelable3)) {
                        if (!cevw.m138328m()) {
                            bhdh bhdh = this.f150975i;
                            rkb d = mo70965d();
                            String str = nodeParcelable3.f110950a;
                            axsg axsg = ((bhdf) bhdh).f118322b;
                            axsg.m83138a(d, str, "com/google/android/location/fused/wearable/LOCATION_REQUESTS_REFRESH", new byte[0]);
                        } else {
                            this.f150979m.mo24694a(nodeParcelable3.f110950a, "com/google/android/location/fused/wearable/LOCATION_REQUESTS_REFRESH", new byte[0]);
                        }
                    }
                }
                this.f150989w = b;
                this.f150990x.clear();
                for (NodeParcelable nodeParcelable4 : this.f150989w) {
                    if (nodeParcelable4.f110953d) {
                        this.f150990x.add(nodeParcelable4);
                    }
                }
                while (true) {
                    C1245ok okVar = this.f150976j;
                    if (i >= okVar.f26809h) {
                        break;
                    }
                    bhdk bhdk = (bhdk) okVar.mo15621c(i);
                    String str2 = bhdk.f118324a;
                    NodeParcelable nodeParcelable5 = null;
                    if (str2 != null) {
                        Iterator it2 = this.f150989w.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            NodeParcelable nodeParcelable6 = (NodeParcelable) it2.next();
                            if (bxbl.m122538a(nodeParcelable6.f110950a, str2)) {
                                nodeParcelable5 = nodeParcelable6;
                                break;
                            }
                        }
                    }
                    if (nodeParcelable5 == null) {
                        bhdk.mo63565a();
                    }
                    i++;
                }
                boolean z = !this.f150990x.isEmpty();
                if (z != this.f150986t) {
                    this.f150986t = z;
                    if (z) {
                        startService(new Intent().setComponent(new ComponentName(this, "com.google.android.location.wearable.WearableLocationService")));
                    } else {
                        stopSelf();
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public final aesh mo70964c() {
        if (this.f150980n == null) {
            this.f150980n = new aesh(this);
        }
        return this.f150980n;
    }

    /* renamed from: d */
    public final rkb mo70965d() {
        if (this.f150982p == null) {
            rjy rjy = new rjy(this);
            rjy.mo24779a(axoz.f96226a);
            this.f150982p = rjy.mo24784b();
        }
        this.f150982p.mo24801e();
        return this.f150982p;
    }

    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        synchronized (this.f150973a) {
            boolean z = this.f150987u;
            StringBuilder sb = new StringBuilder(23);
            sb.append("location capable: ");
            sb.append(z);
            printWriter.println(sb.toString());
            boolean z2 = this.f150986t;
            StringBuilder sb2 = new StringBuilder(23);
            sb2.append("service required: ");
            sb2.append(z2);
            printWriter.println(sb2.toString());
            printWriter.println("all nodes:");
            for (NodeParcelable nodeParcelable : this.f150989w) {
                String valueOf = String.valueOf(nodeParcelable);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 2);
                sb3.append("  ");
                sb3.append(valueOf);
                printWriter.println(sb3.toString());
            }
            printWriter.println("active requests:");
            int i = 0;
            while (true) {
                C1245ok okVar = this.f150976j;
                if (i < okVar.f26809h) {
                    bhdk bhdk = (bhdk) okVar.mo15621c(i);
                    String valueOf2 = String.valueOf(bhdk.f118324a);
                    printWriter.println(valueOf2.length() == 0 ? new String("  ") : "  ".concat(valueOf2));
                    if (!bhdk.mo63567b().isEmpty()) {
                        for (LocationRequestInternal locationRequestInternal : bhdk.mo63567b()) {
                            String valueOf3 = String.valueOf(locationRequestInternal);
                            StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf3).length() + 4);
                            sb4.append("    ");
                            sb4.append(valueOf3);
                            printWriter.println(sb4.toString());
                        }
                    } else {
                        printWriter.println("    <none>");
                    }
                    i++;
                }
            }
        }
    }

    public final void onCreate() {
        rjx rjx;
        super.onCreate();
        sre.m36089i(this);
        Looper a = bfqt.m97589a();
        if (cevw.m138328m()) {
            rjx = aeie.m51878c(this);
        } else {
            rjx = null;
        }
        axqb axqb = axoz.f96227b;
        bhdh bhdh = bhdf.f118321a;
        rjx b = axoz.m82854b(this);
        rjx c = axoz.m82855c(this);
        bfpj b2 = bfqt.m97591b();
        if (this.f150974h == null) {
            this.f150974h = a;
        }
        if (this.f150978l == null) {
            this.f150978l = rjx;
        }
        if (this.f150980n == null) {
            this.f150980n = null;
        }
        if (this.f150981o == null) {
            this.f150981o = null;
        }
        if (this.f150982p == null) {
            this.f150982p = null;
        }
        if (this.f150991y == null) {
            this.f150991y = axqb;
        }
        if (this.f150975i == null) {
            this.f150975i = bhdh;
        }
        if (this.f150983q == null) {
            this.f150983q = b2;
        }
        if (this.f150979m == null) {
            this.f150979m = b;
        }
        if (this.f150992z == null) {
            this.f150992z = c;
        }
        this.f150977k = new bhdj(this, this.f150974h);
        this.f150976j = new C1245ok();
        this.f150984r = new bhde(this, this);
        this.f150985s = new bhdi(this);
        boolean z = false;
        this.f150986t = false;
        this.f150987u = false;
        int i = Build.VERSION.SDK_INT;
        if (checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0 || checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0) {
            z = true;
        }
        this.f150988v = z;
        this.f150989w = Collections.emptySet();
        this.f150990x = new C1225nr(2);
    }

    public final void onDestroy() {
        synchronized (this.f150973a) {
            int i = 0;
            while (true) {
                C1245ok okVar = this.f150976j;
                if (i < okVar.f26809h) {
                    ((bhdk) okVar.mo15621c(i)).mo63565a();
                    i++;
                } else {
                    okVar.clear();
                    sti sti = this.f150981o;
                    if (sti != null) {
                        sti.mo26073b();
                    }
                    aesh aesh = this.f150980n;
                    if (aesh != null) {
                        aesh.mo34507b();
                    }
                    rkb rkb = this.f150982p;
                    if (rkb != null) {
                        rkb.mo24803g();
                    }
                }
            }
            while (true) {
            }
        }
        super.onDestroy();
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        synchronized (this.f150973a) {
            this.f150986t = true;
            if (this.f150981o == null) {
                this.f150981o = new sti(this, this.f150974h);
            }
            this.f150981o.f45129a = this;
            this.f150981o.mo26072a();
        }
        return 1;
    }

    /* renamed from: a */
    public final void mo7590a(MessageEventParcelable messageEventParcelable) {
        if (cevw.m138328m()) {
            this.f150985s.mo7590a(messageEventParcelable);
        } else {
            this.f150984r.mo7590a(messageEventParcelable);
        }
    }

    /* renamed from: a */
    public final void mo63564a(String str, Collection collection, boolean z) {
        synchronized (this.f150973a) {
            bhdk bhdk = (bhdk) this.f150976j.get(str);
            if (bhdk == null) {
                bhdk = new bhdk(this, str);
                this.f150976j.put(str, bhdk);
            }
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                LocationRequestInternal locationRequestInternal = (LocationRequestInternal) it.next();
                if (cevw.f183465a.mo6606a().setWearableRequestModuleId()) {
                    locationRequestInternal.f79426h = "com.google.android.gms.location__nonwearable";
                }
                locationRequestInternal.mo43611a();
                String str2 = locationRequestInternal.f79422d;
                locationRequestInternal.f79422d = String.valueOf(str2 != null ? str2.concat("_") : "").concat("wearable");
            }
            bhdk.mo63566a(collection, z);
        }
    }

    /* renamed from: a */
    public final void mo26071a(boolean z, boolean z2) {
        synchronized (this.f150973a) {
            boolean z3 = false;
            if (z || z2) {
                if (this.f150988v) {
                    z3 = true;
                }
            }
            this.f150987u = z3;
            bfpj bfpj = this.f150983q;
            if (!z3) {
                bfpj.mo26009a(30);
            } else {
                bfpj.mo26009a(29);
            }
            if (!this.f150987u) {
                if (cevw.m138328m()) {
                    this.f150992z.mo24759m("com.google.android.location.fused.wearable.LOCATION_CAPABILITY");
                } else {
                    axqb.m82892b(mo70965d(), "com.google.android.location.fused.wearable.LOCATION_CAPABILITY");
                }
            } else if (cevw.m138328m()) {
                this.f150992z.mo24757l("com.google.android.location.fused.wearable.LOCATION_CAPABILITY");
            } else {
                axqb.m82891a(mo70965d(), "com.google.android.location.fused.wearable.LOCATION_CAPABILITY");
            }
        }
    }
}
