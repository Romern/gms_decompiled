package p000;

import android.app.PendingIntent;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.hardware.SensorEventListener;
import android.location.Location;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.RemoteException;
import android.provider.Settings;
import android.text.TextUtils;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.util.PackageResetHelper;
import com.google.android.gms.location.ActivityRecognitionRequest;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.DetectedActivity;
import com.google.android.location.internal.server.GoogleLocationChimeraService;
import com.google.android.location.internal.server.ServiceThread$LogRequestReceiver;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* renamed from: bgdo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgdo extends adzt implements bgjn, ssn, spr {

    /* renamed from: A */
    private long f116139A = -1;

    /* renamed from: B */
    private bhcv f116140B = null;

    /* renamed from: C */
    private final List f116141C = new ArrayList();

    /* renamed from: D */
    private final ArrayList f116142D;

    /* renamed from: E */
    private final ContentObserver f116143E;

    /* renamed from: F */
    private final bgmi f116144F;

    /* renamed from: a */
    public final GoogleLocationChimeraService f116145a;

    /* renamed from: b */
    public boolean f116146b = false;

    /* renamed from: c */
    public boolean f116147c = false;

    /* renamed from: d */
    public boolean f116148d = false;

    /* renamed from: e */
    public final Object f116149e = new Object();

    /* renamed from: f */
    public bfor f116150f;

    /* renamed from: h */
    public Boolean f116151h;

    /* renamed from: i */
    public boolean f116152i = false;

    /* renamed from: j */
    public bgjp f116153j;

    /* renamed from: k */
    public long f116154k = -1;

    /* renamed from: l */
    public final bgcg f116155l;

    /* renamed from: m */
    public final bgdu f116156m;

    /* renamed from: n */
    public final bgbg f116157n;

    /* renamed from: o */
    public final bgdt f116158o;

    /* renamed from: p */
    public final bgdt f116159p;

    /* renamed from: q */
    public final bgdt f116160q;

    /* renamed from: r */
    public final aeri f116161r;

    /* renamed from: s */
    public final PackageResetHelper f116162s;

    /* renamed from: t */
    public ServiceThread$LogRequestReceiver f116163t;

    /* renamed from: u */
    public final sps f116164u;

    /* renamed from: v */
    private final bugp f116165v;

    /* renamed from: w */
    private final bfnf f116166w;

    /* renamed from: x */
    private final bfmd f116167x;

    /* renamed from: y */
    private final aerd f116168y;

    /* renamed from: z */
    private boolean f116169z = false;

    public bgdo(GoogleLocationChimeraService googleLocationChimeraService, bugp bugp, Looper looper, rsk rsk, rsk rsk2, rsk rsk3, rsk rsk4, bfnf bfnf, bfmd bfmd) {
        super(looper);
        this.f116145a = googleLocationChimeraService;
        this.f116165v = bugp;
        this.f116166w = bfnf;
        this.f116167x = bfmd;
        bhcl bhcl = new bhcl(googleLocationChimeraService);
        this.f116155l = new bgcg();
        this.f116156m = new bgdu();
        this.f116157n = new bgbg(googleLocationChimeraService, this, rsk, bhcl);
        bgdt bgdt = new bgdt(new bgbw(rsk2), this.f116149e);
        this.f116158o = bgdt;
        this.f116141C.add(bgdt);
        bgdt bgdt2 = new bgdt(new bgbk(rsk4), this.f116149e);
        this.f116159p = bgdt2;
        this.f116141C.add(bgdt2);
        bgdt bgdt3 = new bgdt(new bgds(rsk3), this.f116149e);
        this.f116160q = bgdt3;
        this.f116141C.add(bgdt3);
        this.f116143E = new bgdn(this, this);
        this.f116161r = aeri.m52441e(googleLocationChimeraService);
        this.f116144F = bgbr.m98545a(googleLocationChimeraService);
        this.f116142D = new ArrayList();
        this.f116162s = new PackageResetHelper(googleLocationChimeraService, this, true);
        this.f116164u = sps.m35913a(googleLocationChimeraService, this);
        this.f116168y = new bgdg(this);
    }

    /* renamed from: a */
    public final bfnp mo62669a(bfnb bfnb, bfnv bfnv) {
        bgjp bgjp = this.f116153j;
        if (bgjp != null) {
            return bgjp.mo62669a(bfnb, bfnv);
        }
        return null;
    }

    /* renamed from: a */
    public final void mo61009a(bfnn bfnn, boolean z) {
        throw null;
    }

    /* renamed from: a */
    public final void mo61010a(ActivityRecognitionResult activityRecognitionResult) {
        throw null;
    }

    /* renamed from: a */
    public final void mo61011a(List list) {
        throw null;
    }

    /* renamed from: a */
    public final void mo61012a(List list, int i) {
        throw null;
    }

    /* renamed from: b */
    public final void mo62678b() {
        try {
            new bxbi(this.f116145a.getPackageName()).mo73549a(this.f116145a);
            ContentResolver contentResolver = this.f116145a.getContentResolver();
            contentResolver.registerContentObserver(aymk.f97976b, true, this.f116143E);
            contentResolver.registerContentObserver(Settings.Secure.getUriFor("location_providers_allowed"), true, this.f116143E);
            if (!this.f116152i) {
                this.f116145a.getContentResolver().unregisterContentObserver(this.f116143E);
            }
        } catch (IllegalStateException e) {
            int i = Build.VERSION.SDK_INT;
            if ((bmxx.m108577a(this.f116145a.getPackageName()) || this.f116145a.getPackageName().equals("com.google.android.gms")) && cdje.f180974a.mo6606a().mo77668b() && ((double) new Random().nextFloat()) < cdje.m133543c()) {
                spn.m35884e();
            }
            throw e;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bgcg.a(android.content.Context, boolean):void
     arg types: [com.google.android.location.internal.server.GoogleLocationChimeraService, int]
     candidates:
      bgcg.a(android.content.Context, bfnc[]):void
      bgcg.a(android.content.Context, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bgid.a(bgoy, boolean):void
     arg types: [bgpc, int]
     candidates:
      bgid.a(bfor, android.content.Context):void
      bgid.a(boolean, bfmd):void
      bgid.a(bgoy, boolean):void */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0250 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01c8  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01d1  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01d3  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01fe  */
    /* renamed from: c */
    public final void mo62681c() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        File file;
        boolean z5;
        boolean z6;
        boolean z7;
        bgid bgid;
        bgpc bgpc;
        bgls bgls;
        boolean z8 = this.f116152i;
        synchronized (this.f116149e) {
            z = this.f116169z;
        }
        GoogleLocationChimeraService googleLocationChimeraService = this.f116145a;
        boolean a = mo62677a();
        StringBuilder sb = new StringBuilder(30);
        sb.append("hasLocationPermission is ");
        sb.append(a);
        sb.toString();
        boolean a2 = this.f116161r.mo34487a("network");
        StringBuilder sb2 = new StringBuilder(19);
        sb2.append("nlpEnabled is ");
        sb2.append(a2);
        sb2.toString();
        boolean a3 = aeri.m52434a(googleLocationChimeraService);
        StringBuilder sb3 = new StringBuilder(20);
        sb3.append("userConsent is ");
        sb3.append(a3);
        sb3.toString();
        if (!a) {
            z2 = false;
        } else {
            z2 = a2 && a3;
        }
        StringBuilder sb4 = new StringBuilder(22);
        sb4.append("final result is: ");
        sb4.append(z2);
        sb4.toString();
        if (!z8) {
            z3 = false;
        } else {
            z3 = z || z2;
        }
        synchronized (this.f116149e) {
            boolean z9 = this.f116146b;
            StringBuilder sb5 = new StringBuilder(56);
            sb5.append("shouldBeRunning=");
            sb5.append(z8);
            sb5.append(" shouldBeEnabled=");
            sb5.append(z3);
            sb5.append(" enable=");
            sb5.append(z9);
            sb5.toString();
            if (!z8 || this.f116153j != null) {
                z4 = false;
            } else {
                z4 = true;
            }
        }
        File file2 = null;
        if (z4) {
            GoogleLocationChimeraService googleLocationChimeraService2 = this.f116145a;
            bgjp bgjp = new bgjp(googleLocationChimeraService2, this.f116150f, this, new bgjv(googleLocationChimeraService2), this.f116144F, this.f116165v);
            bexd.m96012a(this.f116145a, bgjp.f116626g, bgjp.f116634o, bgjp.f116621b);
            bgjp.f116622c.mo62845a(bgjp.m99109q(), this.f116167x);
            Handler c = bgjp.f116622c.mo62851c();
            bgjr bgjr = bgjp.f116635p;
            synchronized (bgjr.f116645a) {
                bgjr.f116650f = c;
            }
            bgkc bgkc = bgjp.f116627h;
            bugp bugp = bgkc.f116686e;
            boolean b = ceuk.m138257b();
            StringBuilder sb6 = new StringBuilder(32);
            sb6.append("wifi-scan nanoapp value is ");
            sb6.append(b);
            sb6.toString();
            if (!ceuk.m138257b() || (ceuk.f183439a.mo6606a().bugFixOnlyRunOnPrimaryProfile() && !soz.m35811h(bgkc.f116682a))) {
                bgls = null;
            } else {
                Context context = bgkc.f116682a;
                bgkg bgkg = bgkc.f116684c;
                bfor bfor = bgkc.f116683b;
                int i = Build.VERSION.SDK_INT;
                bugn a4 = bugp.mo62634a(context);
                if (a4 != null) {
                    bgls = new bglr(a4, bgkg, bfor, c);
                } else {
                    bgls = new bglq();
                }
                bgls.mo62992d();
            }
            bgkc.f116688g = bgls;
            synchronized (this.f116149e) {
                this.f116153j = bgjp;
                mo62680b(true);
                for (bgbs bgbs : this.f116141C) {
                    bgbs.mo62631a(this.f116153j);
                }
            }
        }
        synchronized (this.f116149e) {
            if (!z3) {
                if (this.f116146b) {
                    this.f116146b = false;
                    this.f116155l.mo62636a((Context) this.f116145a, false);
                }
            }
        }
        if (z3) {
            int i2 = Build.VERSION.SDK_INT;
            boolean isOwner = Process.myUserHandle().isOwner();
            int i3 = Build.VERSION.SDK_INT;
            if (z2) {
                if (bgjp.m99109q()) {
                    z5 = false;
                } else if (isOwner) {
                    z5 = true;
                }
                boolean enableCollection = cext.f183499a.mo6606a().enableCollection();
                StringBuilder sb7 = new StringBuilder(84);
                sb7.append("fullCollection: ");
                sb7.append(isOwner);
                sb7.append(", collectionEnabled: ");
                sb7.append(z5);
                sb7.append(", gServices collection enabled: ");
                sb7.append(enableCollection);
                sb7.toString();
                bgjp bgjp2 = this.f116153j;
                if (z5) {
                    z6 = false;
                } else {
                    z6 = enableCollection;
                }
                if (isOwner) {
                    z7 = false;
                } else {
                    z7 = enableCollection;
                }
                bfnf bfnf = this.f116166w;
                bgid = bgjp2.f116622c;
                bgid.f116481b.mo62048a(bfos.INIT_NETWORK_PROVIDER);
                bgoz bgoz = bgid.f116491l;
                bgoz.mo63061k();
                bgpc bgpc2 = bgoz.f117147b;
                if (!(bgpc2 == null || bgpc2.f117160g == z6)) {
                    bgid.f116485f.mo62909s();
                }
                if (!bgid.f116491l.mo63060j()) {
                    bgfj bgfj = new bgfj(bgid.f116485f);
                    bgid.f116492m = bgfj;
                    bgoz bgoz2 = bgid.f116491l;
                    bfct bfct = bgid.f116485f.f116624e;
                    bglw bglw = bgid.f116493n;
                    File d = bgfj.mo62753h().mo62784d();
                    bgoz2.mo63061k();
                    if (bgoz2.f117147b == null) {
                        bgoz2.f117147b = new bgpc(bgfj, bfct, bfnf, bglw, d, z6);
                        bgoz2.f117147b.mo61055i();
                        bgoz2.f117146a.add(bgoz2.f117147b);
                        bgpc = bgoz2.f117147b;
                    } else {
                        bgpc = null;
                    }
                    if (bgpc != null) {
                        bgid.mo62841a((bgoy) bgpc, true);
                        bgpc.mo61054h(z7);
                    }
                }
                synchronized (this.f116149e) {
                    mo62682c(!this.f116146b);
                    this.f116151h = Boolean.valueOf(z5);
                }
            }
            z5 = false;
            boolean enableCollection2 = cext.f183499a.mo6606a().enableCollection();
            StringBuilder sb72 = new StringBuilder(84);
            sb72.append("fullCollection: ");
            sb72.append(isOwner);
            sb72.append(", collectionEnabled: ");
            sb72.append(z5);
            sb72.append(", gServices collection enabled: ");
            sb72.append(enableCollection2);
            sb72.toString();
            bgjp bgjp22 = this.f116153j;
            if (z5) {
            }
            if (isOwner) {
            }
            bfnf bfnf2 = this.f116166w;
            bgid = bgjp22.f116622c;
            bgid.f116481b.mo62048a(bfos.INIT_NETWORK_PROVIDER);
            bgoz bgoz3 = bgid.f116491l;
            bgoz3.mo63061k();
            bgpc bgpc22 = bgoz3.f117147b;
            bgid.f116485f.mo62909s();
            if (!bgid.f116491l.mo63060j()) {
            }
            synchronized (this.f116149e) {
            }
        } else {
            bgjp bgjp3 = this.f116153j;
            if (bgjp3 != null) {
                bgjp3.mo62909s();
                synchronized (this.f116149e) {
                    bgcg bgcg = this.f116155l;
                    if (bgcg.f116030a.size() != 0) {
                        Iterator it = bgcg.f116030a.entrySet().iterator();
                        while (it.hasNext()) {
                            ((bgce) ((Map.Entry) it.next()).getValue()).mo62594a();
                            it.remove();
                        }
                        bgcg.mo62638a(bgcg.f116030a.values());
                    }
                    this.f116154k = -1;
                }
            }
        }
        synchronized (this.f116149e) {
            if (z3) {
                if (!this.f116146b) {
                    this.f116146b = true;
                    this.f116155l.mo62636a((Context) this.f116145a, true);
                    this.f116145a.sendBroadcast(new Intent("com.google.android.location.internal.server.ACTION_RESTARTED"));
                }
            }
        }
        synchronized (this.f116149e) {
            if (!this.f116146b) {
                GoogleLocationChimeraService googleLocationChimeraService3 = this.f116145a;
                try {
                    File filesDir = googleLocationChimeraService3.getFilesDir();
                    if (filesDir != null) {
                        file = new File(filesDir, "nlp_state");
                    } else {
                        file = null;
                    }
                    if (file != null) {
                        file.delete();
                    }
                    File cacheDir = googleLocationChimeraService3.getCacheDir();
                    if (cacheDir != null) {
                        file2 = new File(cacheDir, "nlp_devices");
                    }
                    if (file2 != null) {
                        file2.delete();
                    }
                    File b2 = bgji.m99083b(googleLocationChimeraService3);
                    if (b2 != null) {
                        b2.delete();
                    }
                } catch (SecurityException e) {
                }
                try {
                    File a5 = bgji.m99081a(googleLocationChimeraService3);
                    if (a5 != null) {
                        bhcy.m100662a(a5);
                    }
                } catch (Exception e2) {
                }
                bgij.m99011a(googleLocationChimeraService3.getApplicationContext());
            }
        }
        if (!z8) {
            bgjp bgjp4 = this.f116153j;
            if (bgjp4 != null) {
                bgjp4.f116622c.mo62844a(z3);
                bgjp bgjp5 = this.f116153j;
                bgjr bgjr2 = bgjp5.f116635p;
                synchronized (bgjr2.f116645a) {
                    for (SensorEventListener sensorEventListener : bgjr2.f116647c.values()) {
                        bgjr2.f116648d.unregisterListener(sensorEventListener);
                    }
                    bgjr2.f116647c.clear();
                }
                bgjp5.f116622c.mo62848b();
                ((bgji) bgjp5.f116626g).f116607b.shutdown();
                try {
                    ((bgji) bgjp5.f116626g).f116607b.awaitTermination(10, TimeUnit.SECONDS);
                } catch (InterruptedException e3) {
                }
                bgjp5.f116630k.mo62920a(false);
            }
            this.f116145a.mo70877a();
            Message.obtain(this, 6).sendToTarget();
        }
    }

    /* renamed from: d */
    public final bgns mo62683d() {
        bgjp bgjp = this.f116153j;
        return bgjp == null ? new bgnm() : bgjp.f116630k;
    }

    public final void handleMessage(Message message) {
        bfon bfon;
        ModuleManager.ModuleInfo moduleInfo;
        String str;
        switch (message.what) {
            case 1:
                if (ceun.f183441a.mo6606a().compactLogEnabled()) {
                    File file = new File(this.f116145a.getCacheDir(), "compactlog");
                    file.mkdir();
                    bfon a = bfon.m97409a(file, bgof.m99492e());
                    ServiceThread$LogRequestReceiver serviceThread$LogRequestReceiver = new ServiceThread$LogRequestReceiver(this, a);
                    this.f116163t = serviceThread$LogRequestReceiver;
                    GoogleLocationChimeraService googleLocationChimeraService = this.f116145a;
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("com.google.android.location.reporting.DUMP_LOG_BROADCAST_ACTION");
                    googleLocationChimeraService.registerReceiver(serviceThread$LogRequestReceiver, intentFilter, null, serviceThread$LogRequestReceiver.f150816b);
                    bfon = a;
                } else {
                    bfon = null;
                }
                try {
                    moduleInfo = ModuleManager.get(this.f116145a).getCurrentModule();
                } catch (IllegalStateException e) {
                    moduleInfo = null;
                }
                if (moduleInfo != null) {
                    int i = moduleInfo.moduleVersion;
                    long j = (long) moduleInfo.moduleApk.apkVersionCode;
                    str = String.format("%x,%x", Integer.valueOf(i), Long.valueOf((j + j) | 1));
                } else {
                    str = null;
                }
                bfor bfor = new bfor(str, "com.google.android.gms", rfi.f42869b, bgdh.f116111a, bfon);
                synchronized (this.f116149e) {
                    this.f116150f = bfor;
                    this.f116155l.f116032c = bfor;
                    this.f116157n.f115990n = bfor;
                    for (bgbs bgbs : this.f116141C) {
                        bgbs.mo62630a(bfor);
                    }
                }
                bhcz.m100664a(new bggo(bfor));
                return;
            case 2:
                this.f116161r.mo34482a(this.f116168y, getLooper());
                return;
            case 3:
                mo62681c();
                return;
            case 4:
                this.f116161r.mo34481a(this.f116168y);
                return;
            case 5:
                synchronized (this.f116149e) {
                    mo62678b();
                }
                return;
            case 6:
                synchronized (this.f116149e) {
                    this.f116147c = true;
                    Looper.myLooper().quit();
                    this.f116153j = null;
                }
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public final void mo25943a(int i, boolean z) {
        synchronized (this.f116149e) {
            bgbg bgbg = this.f116157n;
            if (cese.m138157f()) {
                StringBuilder sb = new StringBuilder(72);
                sb.append("Received onImportanceChanged for uid = ");
                sb.append(i);
                sb.append(", isForeground = ");
                sb.append(z);
                sb.toString();
                Iterator it = bgbg.f115983g.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    bgbe bgbe = (bgbe) it.next();
                    if (bhcq.m100641b(bgbe.f116017h) == i) {
                        if (!z) {
                            String str = bgbe.f116019j;
                            long j = bgbe.f116051q;
                            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 82);
                            sb2.append("May be throttle period for package = ");
                            sb2.append(str);
                            sb2.append(" current period millis = ");
                            sb2.append(j);
                            sb2.toString();
                            if (bgbe.f116051q < cesh.m138174f()) {
                                bgbe.mo62595a(cesh.m138174f());
                                break;
                            }
                        } else {
                            long j2 = bgbe.f116051q;
                            int i2 = bgbe.f115973g;
                            long j3 = bgbe.f115978e;
                            if (j2 > j3) {
                                bgbe.mo62595a(j3);
                                break;
                            }
                        }
                    }
                }
                bgbg.mo62371g();
                mo62680b(false);
            }
        }
    }

    /* renamed from: b */
    public final void mo62679b(List list) {
        boolean z;
        Object obj;
        long j;
        this.f116142D.clear();
        int size = list.size();
        Location location = null;
        bfnb bfnb = null;
        for (int i = 0; i < size; i++) {
            bfnb bfnb2 = (bfnb) list.get(i);
            bfmz bfmz = bfnb2.f114456a;
            if (bfmz != null && bfmz.f114450d == bfmy.OK) {
                this.f116142D.add(bgcd.m98578a(bfnb2));
                bfnb = bfnb2;
            }
        }
        if (bfnb != null) {
            location = bgcd.m98578a(bfnb);
        }
        synchronized (this.f116149e) {
            bgcg bgcg = this.f116155l;
            GoogleLocationChimeraService googleLocationChimeraService = this.f116145a;
            ArrayList arrayList = this.f116142D;
            if (bfnb == null || !bfnb.f114459d) {
                z = false;
            } else {
                z = true;
            }
            boolean z2 = !this.f116161r.mo34487a("network");
            if (arrayList != null) {
                obj = Integer.valueOf(arrayList.size());
            } else {
                obj = "null";
            }
            String valueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 61);
            sb.append("Delivering location to clients, historical location count is ");
            sb.append(valueOf);
            sb.toString();
            Intent a = bgcg.m98581a();
            if (location != null) {
                a.putExtra("location", location);
            }
            if (arrayList != null) {
                if (arrayList.size() > 0) {
                    int i2 = Build.VERSION.SDK_INT;
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        long elapsedRealtimeNanos = ((Location) it.next()).getElapsedRealtimeNanos();
                        StringBuilder sb2 = new StringBuilder(82);
                        sb2.append("Bundling historical location with since-boot millis timestamp ");
                        sb2.append(elapsedRealtimeNanos / 1000000);
                        sb2.toString();
                    }
                    a.putParcelableArrayListExtra("com.google.android.location.internal.EXTRA_LOCATION_LIST", arrayList);
                }
            }
            Iterator it2 = bgcg.f116030a.values().iterator();
            boolean z3 = false;
            while (it2.hasNext()) {
                bgce bgce = (bgce) it2.next();
                if (!z || bgce.f116026a) {
                    if (z2) {
                        if (bgce.f116021l) {
                        }
                    }
                    long j2 = bgce.f116020k;
                    StringBuilder sb3 = new StringBuilder(70);
                    sb3.append("Delivering a location to a listener registered at ");
                    sb3.append(j2);
                    sb3.toString();
                    if (!bgce.mo62597a(googleLocationChimeraService, a)) {
                        String valueOf2 = String.valueOf(bgce);
                        StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf2).length() + 24);
                        sb4.append("dropping intent receiver");
                        sb4.append(valueOf2);
                        sb4.toString();
                        bfor bfor = bgcg.f116032c;
                        if (bfor != null) {
                            bfor.mo62052a(bfos.LOCATION_PENDING_INTENT_DROPPED, bgce.f116017h.hashCode(), bgce.f116017h.getTargetPackage());
                        }
                        it2.remove();
                        z3 = true;
                    }
                }
            }
            if (z3) {
                bgcg.mo62638a(bgcg.f116030a.values());
            }
            String valueOf3 = String.valueOf(location);
            StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf3).length() + 10);
            sb5.append("reporting ");
            sb5.append(valueOf3);
            sb5.toString();
            mo62682c(false);
            if (bfkq.m97139a(ceze.m138457b())) {
                bgcg bgcg2 = this.f116155l;
                HashMap hashMap = new HashMap(bgcg2.f116030a.size());
                for (bgce bgce2 : bgcg2.f116030a.values()) {
                    bhcv bhcv = bgce2.f116023n;
                    if (bhcv != null) {
                        List<String> c = bhcv.mo63560c();
                        if (c != null) {
                            if (c.size() <= 1) {
                                j = bgce2.f116051q;
                            } else {
                                j = Long.MAX_VALUE;
                            }
                            for (String str : c) {
                                if (!"com.google.android.gms".equals(str)) {
                                    Long l = (Long) hashMap.get(str);
                                    if (l == null) {
                                        l = Long.MAX_VALUE;
                                    }
                                    if (j < l.longValue()) {
                                        l = Long.valueOf(j);
                                    }
                                    hashMap.put(str, l);
                                }
                            }
                        }
                    }
                }
                for (String str2 : hashMap.keySet()) {
                    this.f116144F.mo62628a(str2, ((Long) hashMap.get(str2)).longValue());
                }
                this.f116144F.mo62624a();
            }
        }
    }

    /* renamed from: a */
    public final void mo62670a(PendingIntent pendingIntent) {
        bgdl bgdl = new bgdl(this, pendingIntent);
        if (ceze.m138460e()) {
            post(bgdl);
        } else {
            bgdl.run();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:160:0x0320 A[Catch:{ all -> 0x030e, all -> 0x0334 }] */
    /* renamed from: a */
    public final void mo61008a(bfma bfma) {
        btxt btxt;
        List list;
        btye btye;
        List list2;
        boolean z;
        List list3;
        boolean z2;
        boolean z3;
        synchronized (this.f116149e) {
            try {
                bgbg bgbg = this.f116157n;
                GoogleLocationChimeraService googleLocationChimeraService = this.f116145a;
                try {
                    Iterator it = bgbg.f115983g.entrySet().iterator();
                    boolean z4 = false;
                    while (it.hasNext()) {
                        bgbe bgbe = (bgbe) ((Map.Entry) it.next()).getValue();
                        if (cerm.m138127b()) {
                            z = bgbe.f116018i > bgbe.f116051q;
                        } else {
                            z = false;
                        }
                        if (!z) {
                            list3 = bfma.mo61910a(bgbe);
                        } else {
                            int i = bgbe.f115973g;
                            list3 = bfma.mo61909a(bgbe.f115974a, bgbe.f116051q, bgbe);
                        }
                        String valueOf = String.valueOf(list3);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33);
                        sb.append("allResults: ");
                        sb.append(valueOf);
                        sb.append(" isBatchClient: ");
                        sb.append(z);
                        sb.toString();
                        if (!z || list3.isEmpty()) {
                            if (!z) {
                                Iterator it2 = list3.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        break;
                                    }
                                    Intent i2 = bgbg.m98504i();
                                    i2.putExtra("com.google.android.location.internal.EXTRA_ACTIVITY_RESULT", (ActivityRecognitionResult) it2.next());
                                    if (!bgbg.mo62603a(googleLocationChimeraService, i2, bgbe)) {
                                        z2 = true;
                                        break;
                                    }
                                }
                            }
                            z2 = false;
                        } else {
                            Intent i3 = bgbg.m98504i();
                            for (int i4 = 1; i4 < list3.size(); i4++) {
                                if (((ActivityRecognitionResult) list3.get(i4)).f79302c >= ((ActivityRecognitionResult) list3.get(i4 - 1)).f79302c) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                sdo.m34975b(z3, "ActivityRecognitionResult list are out of order in time.");
                            }
                            sef.m35072a(list3, i3, "com.google.android.location.internal.EXTRA_ACTIVITY_RESULT_LIST");
                            z2 = !bgbg.mo62603a(googleLocationChimeraService, i3, bgbe);
                        }
                        if (list3 != null && !list3.isEmpty()) {
                            long j = ((ActivityRecognitionResult) list3.get(list3.size() - 1)).f79302c;
                            int i5 = bgbe.f115973g;
                            bgbe.f115974a = j;
                        }
                        if (list3 != null && !list3.isEmpty() && cesb.m138150f()) {
                            bero.m95594b(googleLocationChimeraService, bgbe.f116017h);
                        }
                        if (z2) {
                            it.remove();
                            z4 = true;
                        }
                    }
                    if (cese.m138156e()) {
                        try {
                            ArrayList arrayList = new ArrayList();
                            for (bgbe bgbe2 : bgbg.f115983g.values()) {
                                if (!TextUtils.isEmpty(bgbe2.f116017h.getTargetPackage())) {
                                    arrayList.add(bgbe2.f116017h.getTargetPackage());
                                }
                            }
                            bewq a = bewq.m95998a(googleLocationChimeraService);
                            List b = bfma.mo61912b();
                            long currentTimeMillis = System.currentTimeMillis();
                            String str = null;
                            if (b == null || b.isEmpty() || arrayList.isEmpty()) {
                                btxt = null;
                            } else {
                                bxvd da = btxt.f152853c.mo74144da();
                                int i6 = 0;
                                while (i6 < arrayList.size()) {
                                    btyc a2 = bewq.m95999a((String) arrayList.get(i6), str);
                                    if (da.f164950c) {
                                        da.mo74035c();
                                        da.f164950c = false;
                                    }
                                    btxt btxt2 = (btxt) da.f164949b;
                                    a2.getClass();
                                    if (!btxt2.f152855a.mo73666a()) {
                                        btxt2.f152855a = bxvk.m124021a(btxt2.f152855a);
                                    }
                                    btxt2.f152855a.add(a2);
                                    i6++;
                                    str = null;
                                }
                                int i7 = 0;
                                while (i7 < b.size()) {
                                    ActivityRecognitionResult activityRecognitionResult = (ActivityRecognitionResult) b.get(i7);
                                    if (activityRecognitionResult == null || (list2 = activityRecognitionResult.f79300a) == null || list2.isEmpty()) {
                                        list = b;
                                        btye = null;
                                    } else {
                                        bxvd da2 = btye.f152889f.mo74144da();
                                        int i8 = 0;
                                        while (i8 < list2.size()) {
                                            DetectedActivity detectedActivity = (DetectedActivity) list2.get(i8);
                                            bxvd da3 = btyd.f152884d.mo74144da();
                                            List list4 = b;
                                            int a3 = detectedActivity.mo43513a();
                                            List list5 = list2;
                                            if (da3.f164950c) {
                                                da3.mo74035c();
                                                da3.f164950c = false;
                                            }
                                            btyd btyd = (btyd) da3.f164949b;
                                            int i9 = btyd.f152886a | 4;
                                            btyd.f152886a = i9;
                                            btyd.f152888c = a3;
                                            btyd.f152886a = i9 | 2;
                                            btyd.f152887b = (float) detectedActivity.f79320e;
                                            btyd btyd2 = (btyd) da3.mo74062i();
                                            if (da2.f164950c) {
                                                da2.mo74035c();
                                                da2.f164950c = false;
                                            }
                                            btye btye2 = (btye) da2.f164949b;
                                            btyd2.getClass();
                                            if (!btye2.f152892b.mo73666a()) {
                                                btye2.f152892b = bxvk.m124021a(btye2.f152892b);
                                            }
                                            btye2.f152892b.add(btyd2);
                                            i8++;
                                            b = list4;
                                            list2 = list5;
                                        }
                                        list = b;
                                        long j2 = activityRecognitionResult.f79301b;
                                        if (da2.f164950c) {
                                            da2.mo74035c();
                                            da2.f164950c = false;
                                        }
                                        btye btye3 = (btye) da2.f164949b;
                                        int i10 = btye3.f152891a | 1;
                                        btye3.f152891a = i10;
                                        btye3.f152893c = j2;
                                        int i11 = i10 | 2;
                                        btye3.f152891a = i11;
                                        btye3.f152894d = currentTimeMillis;
                                        int i12 = activityRecognitionResult.f79303d;
                                        btye3.f152891a = i11 | 4;
                                        btye3.f152895e = i12;
                                        btye = (btye) da2.mo74062i();
                                    }
                                    if (btye != null) {
                                        if (da.f164950c) {
                                            da.mo74035c();
                                            da.f164950c = false;
                                        }
                                        btxt btxt3 = (btxt) da.f164949b;
                                        btye.getClass();
                                        if (!btxt3.f152856b.mo73666a()) {
                                            btxt3.f152856b = bxvk.m124021a(btxt3.f152856b);
                                        }
                                        btxt3.f152856b.add(btye);
                                    }
                                    i7++;
                                    b = list;
                                }
                                btxt = (btxt) da.mo74062i();
                            }
                            if (btxt != null) {
                                bxvd da4 = btxm.f152814q.mo74144da();
                                if (da4.f164950c) {
                                    da4.mo74035c();
                                    da4.f164950c = false;
                                }
                                btxm btxm = (btxm) da4.f164949b;
                                btxt.getClass();
                                btxm.f152818c = btxt;
                                btxm.f152816a |= 2;
                                qwo a4 = a.f112849a.mo24333a((btxm) da4.mo74062i());
                                a4.mo24328b(2);
                                a4.mo24327b();
                            }
                        } catch (Throwable th) {
                            th = th;
                            Throwable th2 = th;
                            while (r5.hasNext()) {
                            }
                            bgbg.f115985i.clear();
                            throw th2;
                        }
                    }
                    if (z4) {
                        bgbg.mo62371g();
                    }
                    for (rnt rnt : bgbg.f115985i) {
                        try {
                            rnt.mo11797a(Status.f30107a);
                        } catch (RemoteException e) {
                        }
                    }
                    bgbg.f115985i.clear();
                    mo62680b(false);
                } catch (Throwable th3) {
                    th = th3;
                    Throwable th22 = th;
                    for (rnt rnt2 : bgbg.f115985i) {
                        try {
                            rnt2.mo11797a(Status.f30107a);
                        } catch (RemoteException e2) {
                        }
                    }
                    bgbg.f115985i.clear();
                    throw th22;
                }
            } catch (Throwable th4) {
                th = th4;
                throw th;
            }
        }
    }

    /* renamed from: b */
    public final void mo62680b(boolean z) {
        if (this.f116153j != null) {
            ActivityRecognitionRequest activityRecognitionRequest = this.f116157n.f115987k;
            bfmb bfmb = new bfmb(activityRecognitionRequest.f79292a, activityRecognitionRequest.f79297f, activityRecognitionRequest.f79299h);
            bgjp bgjp = this.f116153j;
            int h = this.f116157n.mo62605h();
            bgbg bgbg = this.f116157n;
            bgjp.f116622c.mo62846a(20, 0, new bghq(h, bfmb, z, bgbg.f115988l, bgbg.f115986j, bgbg.f115991o), true);
        }
    }

    /* renamed from: b */
    public final boolean mo26048b(String str) {
        boolean z;
        synchronized (this.f116149e) {
            z = true;
            if (this.f116157n.mo62604c(str) == null && this.f116160q.mo62629a(str) == null) {
                Iterator it = this.f116141C.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((bgdt) it.next()).mo62629a(str) != null) {
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
            }
        }
        return z;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [long, int]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
    /* renamed from: c */
    public final void mo62682c(boolean z) {
        long j;
        long j2;
        boolean z2;
        boolean z3 = z;
        bgcg bgcg = this.f116155l;
        long j3 = bgcg.f116033d;
        long j4 = bgcg.f116034e;
        long j5 = bgcg.f116035f;
        boolean z4 = bgcg.f116036g;
        bhcv bhcv = bgcg.f116037h;
        long max = Math.max(j3, 5000L);
        if (ceze.m138458c()) {
            j = Math.max(j3, 1000L);
        } else {
            j = Math.max(j3, 5000L);
        }
        if (this.f116153j != null) {
            boolean a = bmxi.m108538a(bhcv, this.f116140B);
            if (z3) {
                z2 = z4;
            } else {
                z2 = z4;
                if (j == this.f116154k && j4 == this.f116139A && a) {
                    j2 = j4;
                }
            }
            bgjp bgjp = this.f116153j;
            j2 = j4;
            bgjp.f116622c.mo62846a(3, z ? 1 : 0, new bfmx(max, j4, j5, j, z2, bhcv), false);
        } else {
            j2 = j4;
        }
        this.f116154k = j;
        this.f116139A = j2;
        this.f116140B = bhcv;
    }

    /* renamed from: a */
    public final void mo62671a(bfnp bfnp) {
        bgjp bgjp = this.f116153j;
        if (bgjp != null) {
            bgjp.mo62671a(bfnp);
        }
    }

    /* renamed from: a */
    public final void mo62672a(bfnv bfnv) {
        this.f116156m.mo62690a(this.f116145a, bfnv);
    }

    /* renamed from: a */
    public final void mo62673a(bgbs bgbs, PendingIntent pendingIntent) {
        bgbs.mo62608a(pendingIntent, this.f116153j);
    }

    /* renamed from: a */
    public final void mo62674a(bgbs bgbs, PendingIntent pendingIntent, Object obj, boolean z, bhcv bhcv, String str, rnt rnt) {
        if (ceze.m138460e()) {
            post(new bgdk(this, bgbs, pendingIntent, obj, z, bhcv, str, rnt));
        } else {
            bgbs.mo62609a(this.f116145a, mo62683d(), pendingIntent, obj, z, bhcv, str, rnt, this.f116153j);
        }
    }

    /* renamed from: a */
    public final void mo26047a(String str) {
        PendingIntent c;
        PendingIntent a;
        int i;
        while (true) {
            synchronized (this.f116149e) {
                c = this.f116157n.mo62604c(str);
            }
            if (c != null) {
                String hexString = Integer.toHexString(c.hashCode());
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 50 + String.valueOf(hexString).length());
                sb.append("remove reset package: packageName=");
                sb.append(str);
                sb.append(", pendingIntent=");
                sb.append(hexString);
                sb.toString();
                mo62670a(c);
            } else {
                List list = this.f116141C;
                int size = list.size();
                int i2 = 0;
                while (i2 < size) {
                    bgdt bgdt = (bgdt) list.get(i2);
                    while (true) {
                        PendingIntent a2 = bgdt.mo62629a(str);
                        i = i2 + 1;
                        if (a2 == null) {
                            break;
                        }
                        String hexString2 = Integer.toHexString(a2.hashCode());
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 50 + String.valueOf(hexString2).length());
                        sb2.append("remove reset package: packageName=");
                        sb2.append(str);
                        sb2.append(", pendingIntent=");
                        sb2.append(hexString2);
                        sb2.toString();
                        bgdt.mo62608a(a2, this.f116153j);
                    }
                    i2 = i;
                }
                while (true) {
                    synchronized (this.f116149e) {
                        a = this.f116160q.mo62629a(str);
                    }
                    if (a != null) {
                        String hexString3 = Integer.toHexString(a.hashCode());
                        StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 50 + String.valueOf(hexString3).length());
                        sb3.append("remove reset package: packageName=");
                        sb3.append(str);
                        sb3.append(", pendingIntent=");
                        sb3.append(hexString3);
                        sb3.toString();
                    } else {
                        return;
                    }
                }
                while (true) {
                }
            }
        }
        while (true) {
        }
    }

    /* renamed from: a */
    public final void mo62675a(boolean z) {
        if (z != this.f116169z) {
            this.f116169z = z;
            if (z) {
                Message.obtain(this, 3).sendToTarget();
            }
        }
    }

    /* renamed from: a */
    public final void mo62676a(bfnc[] bfncArr) {
        synchronized (this.f116149e) {
            this.f116155l.mo62637a(this.f116145a, bfncArr);
        }
    }

    /* renamed from: a */
    public final boolean mo62677a() {
        return svr.m36484b(this.f116145a).mo26170a("android.permission.ACCESS_COARSE_LOCATION", Process.myPid(), Process.myUid()) == 0;
    }
}
