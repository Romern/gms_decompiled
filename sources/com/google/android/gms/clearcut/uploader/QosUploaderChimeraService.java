package com.google.android.gms.clearcut.uploader;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteException;
import android.net.ConnectivityManager;
import android.os.Build;
import android.provider.Settings;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class QosUploaderChimeraService extends aeah {

    /* renamed from: a */
    private static final bngx f30056a = bngx.m109359a(cagz.FAST_IF_RADIO_AWAKE, cagz.DEFAULT, cagz.UNMETERED_OR_DAILY, cagz.UNMETERED_ONLY);

    /* renamed from: b */
    private Context f30057b;

    /* renamed from: c */
    private rel f30058c;

    /* renamed from: d */
    private rdq f30059d;

    /* renamed from: e */
    private ren f30060e;

    /* renamed from: g */
    private sqv f30061g;

    /* renamed from: h */
    private anfa f30062h;

    public QosUploaderChimeraService() {
    }

    /* renamed from: b */
    private final void m22445b(String str) {
        SharedPreferences.Editor edit = mo17668c().edit();
        edit.putLong(String.valueOf(str).concat("lastUnmeteredOrDailySent"), this.f30061g.mo20505a());
        if (!edit.commit()) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 41);
            sb.append("Failed to update ");
            sb.append(str);
            sb.append("lastUnmeteredOrDailySent");
            Log.e("QosUploaderService", sb.toString());
        }
    }

    /* renamed from: d */
    private static boolean m22446d(String str) {
        return str.contains("qos_debug_force_upload");
    }

    /* renamed from: e */
    private static boolean m22447e(String str) {
        return str.contains("qos_collect_for_debug_upload");
    }

    /* renamed from: a */
    public final int mo6269a(aecc aecc) {
        if ((!m22446d(aecc.f63128a) || cdej.m132798d()) && mo17666a(aecc.f63128a)) {
            return 0;
        }
        return 2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final SharedPreferences mo17668c() {
        return this.f30057b.getSharedPreferences("QosUploaderService", 0);
    }

    public final void onCreate() {
        super.onCreate();
        mo17665a(this);
    }

    public final void onDestroy() {
        mo17667b();
        super.onDestroy();
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        if (intent == null || !rsk.m34335a(intent)) {
            return super.onStartCommand(intent, i, i2);
        }
        synchronized (qxs.f42397a) {
            rsk rsk = qxs.f42399c;
            throw null;
        }
    }

    QosUploaderChimeraService(Context context, rel rel, rdq rdq, ren ren, sqv sqv, anfa anfa) {
        this.f30057b = context;
        this.f30058c = rel;
        this.f30059d = rdq;
        this.f30060e = ren;
        this.f30061g = sqv;
        this.f30062h = anfa;
    }

    /* renamed from: b */
    public final void mo17667b() {
        srz.m36176b(this.f30059d);
    }

    /* renamed from: a */
    public final void mo17665a(Context context) {
        this.f30057b = context;
        this.f30058c = rel.m33456a();
        this.f30059d = rds.m33429c();
        this.f30060e = new ren(context);
        this.f30061g = srb.f45012a;
        this.f30062h = new anfb(anef.m64089a(context), "com.google.android.gms.playlog.uploader", "direct_boot:com.google.android.gms.playlog.uploader", context);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.io.FileOutputStream.<init>(java.io.File, boolean):void throws java.io.FileNotFoundException}
     arg types: [java.io.File, int]
     candidates:
      ClspMth{java.io.FileOutputStream.<init>(java.lang.String, boolean):void throws java.io.FileNotFoundException}
      ClspMth{java.io.FileOutputStream.<init>(java.io.File, boolean):void throws java.io.FileNotFoundException} */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0205, code lost:
        if (r9 == false) goto L_0x0208;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x02eb, code lost:
        if (r8 != false) goto L_0x02ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x036e, code lost:
        if (r8 != false) goto L_0x0370;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x040a, code lost:
        if (r8 != false) goto L_0x040c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x046f, code lost:
        if (r8 != false) goto L_0x0471;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:0x04d8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x04d9, code lost:
        p000.rae.f42460a.mo24412e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x04e2, code lost:
        if (p000.cddp.m132711c() != false) goto L_0x04e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x04e4, code lost:
        p000.rae.f42460a.mo24408b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x04e9, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b4, code lost:
        if (r2.equals("qos_unmetered_periodic") != false) goto L_0x00b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x011a, code lost:
        if (r0.isDefaultNetworkActive() == false) goto L_0x011c;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x027a A[Catch:{ all -> 0x033c }] */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x0295 A[Catch:{ all -> 0x033c }] */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x02c7 A[Catch:{ all -> 0x033c }] */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x02ce  */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x03c4 A[SYNTHETIC, Splitter:B:262:0x03c4] */
    /* JADX WARNING: Removed duplicated region for block: B:280:0x03ea A[Catch:{ all -> 0x045a }] */
    /* JADX WARNING: Removed duplicated region for block: B:281:0x03f0 A[Catch:{ all -> 0x045a }] */
    /* JADX WARNING: Removed duplicated region for block: B:284:0x03f9 A[SYNTHETIC, Splitter:B:284:0x03f9] */
    /* JADX WARNING: Removed duplicated region for block: B:288:0x0404 A[Catch:{ all -> 0x04d8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:289:0x0405 A[Catch:{ all -> 0x04d8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:306:0x044f A[Catch:{ RuntimeException -> 0x04ad }] */
    /* JADX WARNING: Removed duplicated region for block: B:309:0x0457  */
    /* JADX WARNING: Removed duplicated region for block: B:313:0x045e A[SYNTHETIC, Splitter:B:313:0x045e] */
    /* JADX WARNING: Removed duplicated region for block: B:317:0x0469 A[Catch:{ all -> 0x04d8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:318:0x046a A[Catch:{ all -> 0x04d8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:361:0x02d4 A[SYNTHETIC] */
    /* renamed from: a */
    public final boolean mo17666a(String str) {
        boolean z;
        rai rai;
        boolean z2;
        boolean z3;
        rai rai2;
        boolean z4;
        Throwable th;
        rdp rdp;
        boolean z5;
        boolean z6;
        boolean z7;
        bngx bngx;
        boolean z8;
        FileOutputStream fileOutputStream;
        Throwable th2;
        String str2 = str;
        if (cddm.m132697b()) {
            cain cain = (cain) caip.f174755b.mo74144da();
            bxvd da = caio.f174748e.mo74144da();
            long currentTimeMillis = System.currentTimeMillis();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            caio caio = (caio) da.f164949b;
            int i = caio.f174750a | 1;
            caio.f174750a = i;
            caio.f174751b = currentTimeMillis;
            str.getClass();
            caio.f174750a = i | 4;
            caio.f174753d = str2;
            cain.mo74652a(da);
            caip caip = (caip) cain.mo74062i();
            try {
                fileOutputStream = new FileOutputStream(new File(rpr.m34216b().getFilesDir(), "clearcut_simulation_upload_events.pb"), true);
                caip.mo73638a(fileOutputStream);
                fileOutputStream.flush();
                fileOutputStream.close();
            } catch (IOException e) {
                throw new RuntimeException("Failed to write simulation upload events to file.", e);
            } catch (Throwable th3) {
                bqye.m113761a(th2, th3);
            }
        }
        synchronized (QosUploaderChimeraService.class) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() == 0) {
                new String("executing QosUploaderService: ");
            } else {
                "executing QosUploaderService: ".concat(valueOf);
            }
            if (!aytw.m84813a(this.f30057b)) {
                if (!cddm.f180532a.mo6606a().mo77295e()) {
                    if (str2.equals("qos_default_periodic")) {
                    }
                    this.f30062h.mo25219a("");
                }
                if (cdej.f180585a.mo6606a().mo77338e()) {
                    int i2 = Build.VERSION.SDK_INT;
                    try {
                        if (Settings.Secure.getInt(getContentResolver(), "user_setup_complete", 0) != 1) {
                            rae.f42460a.mo24412e();
                            if (cddp.m132711c()) {
                                rai = rae.f42460a;
                            }
                            z = true;
                        }
                    } catch (RuntimeException e2) {
                        Log.e("QosUploaderService", "Exception thrown when trying to get user_setup_complete setting.", e2);
                        rae.f42460a.mo24412e();
                        if (cddp.m132711c()) {
                            rai = rae.f42460a;
                        } else {
                            z = true;
                        }
                    }
                }
                boolean equals = "qos_oneoff".equals(str2);
                if (equals) {
                    rel rel = this.f30058c;
                    synchronized (rel.f42811b) {
                        rel.f42810a = false;
                    }
                    int i3 = Build.VERSION.SDK_INT;
                    if (cdej.f180585a.mo6606a().mo77337d()) {
                        ConnectivityManager connectivityManager = (ConnectivityManager) this.f30057b.getSystemService("connectivity");
                        if (connectivityManager == null) {
                        }
                        this.f30058c.mo24557a(5000);
                        rae.f42460a.mo24412e();
                        if (cddp.m132711c()) {
                            rai = rae.f42460a;
                        }
                        z = true;
                    }
                }
                boolean equals2 = "qos_default_periodic".equals(str2);
                boolean equals3 = "qos_unmetered_periodic".equals(str2);
                try {
                    rbp a = rbq.m33303a(this.f30057b, this.f30059d);
                    try {
                        boolean a2 = rep.m33475a(this.f30057b);
                        if (!equals2 || !a2) {
                            if (equals3) {
                                String valueOf2 = String.valueOf(str);
                                if (valueOf2.length() == 0) {
                                    new String("reschedule periodic scheduler on ");
                                } else {
                                    "reschedule periodic scheduler on ".concat(valueOf2);
                                }
                                this.f30058c.mo24559c();
                            }
                            bnre i4 = this.f30059d.mo24519b().listIterator();
                            boolean z9 = false;
                            z2 = false;
                            while (i4.hasNext()) {
                                try {
                                    rdp = (rdp) i4.next();
                                    z5 = rdp.mo24487a();
                                    if (z2) {
                                        z2 = true;
                                    } else {
                                        z2 = z5;
                                    }
                                } catch (SQLiteException | IOException e3) {
                                    Log.e("QosUploaderService", "Failed to see if we have fast data. Won't try to upload fast.", e3);
                                    z5 = false;
                                } catch (Throwable th4) {
                                    th = th4;
                                    z4 = z9;
                                    if (a != null) {
                                        try {
                                            a.close();
                                        } catch (Throwable th5) {
                                            try {
                                                bqye.m113761a(th, th5);
                                            } catch (SQLiteException e4) {
                                                e = e4;
                                                try {
                                                    String valueOf3 = String.valueOf(str);
                                                    Log.e("QosUploaderService", valueOf3.length() == 0 ? new String("Failed to run QosUploaderService:") : "Failed to run QosUploaderService:".concat(valueOf3), e);
                                                    if (z4) {
                                                    }
                                                    if (!cdej.m132805k()) {
                                                    }
                                                    this.f30058c.mo24558b();
                                                    rae.f42460a.mo24412e();
                                                    if (cddp.m132711c()) {
                                                    }
                                                } catch (Throwable th6) {
                                                    th = th6;
                                                    z3 = z4;
                                                    if (z3) {
                                                    }
                                                    if (!cdej.m132805k()) {
                                                    }
                                                    this.f30058c.mo24558b();
                                                    throw th;
                                                }
                                            } catch (Throwable th7) {
                                                th = th7;
                                                z3 = z4;
                                                if (z3) {
                                                }
                                                if (!cdej.m132805k()) {
                                                }
                                                this.f30058c.mo24558b();
                                                throw th;
                                            }
                                        }
                                    }
                                    throw th;
                                }
                                try {
                                    boolean z10 = m22446d(str) || m22447e(str);
                                    if (z5) {
                                        z7 = true;
                                    } else {
                                        z7 = !equals;
                                    }
                                    long b = this.f30060e.mo24561b();
                                    bnre bnre = i4;
                                    z6 = z9;
                                    if (!z10) {
                                        if (b != 0) {
                                            if (equals && z5) {
                                                try {
                                                    a.mo24446a("DeferFastUpload");
                                                } catch (Throwable th8) {
                                                    th = th8;
                                                }
                                            }
                                        }
                                        i4 = bnre;
                                        z9 = z6;
                                    }
                                    try {
                                        a.mo24448a(rdp);
                                        String k = rdp.mo24507k();
                                        if (!m22446d(str) && !m22447e(str)) {
                                            if (str2.equals("qos_oneoff")) {
                                                bngx = bngx.m109357a(cagz.FAST_IF_RADIO_AWAKE, cagz.DEFAULT);
                                            } else if (!a2) {
                                                bngx = this.f30061g.mo20505a() - mo17668c().getLong(String.valueOf(k).concat("lastUnmeteredOrDailySent"), 0) > cdej.f180585a.mo6606a().mo77352s() ? bngx.m109358a(cagz.FAST_IF_RADIO_AWAKE, cagz.DEFAULT, cagz.UNMETERED_OR_DAILY) : bngx.m109357a(cagz.FAST_IF_RADIO_AWAKE, cagz.DEFAULT);
                                            }
                                            if (cdes.m132867b()) {
                                                bnre i5 = bngx.listIterator();
                                                while (true) {
                                                    if (!i5.hasNext()) {
                                                        z8 = true;
                                                        break;
                                                    }
                                                    cagz cagz = (cagz) i5.next();
                                                    if (!reo.m33471a(rdp, a).mo24562a(str2, bngx.m109356a(cagz))) {
                                                        z8 = false;
                                                        break;
                                                    } else if (cagz == cagz.UNMETERED_OR_DAILY) {
                                                        m22445b(k);
                                                    }
                                                }
                                            } else if (!reo.m33471a(rdp, a).mo24562a(str2, bngx)) {
                                                z8 = false;
                                            } else if (bngx.contains(cagz.UNMETERED_OR_DAILY)) {
                                                m22445b(k);
                                                z8 = true;
                                            } else {
                                                z8 = true;
                                            }
                                            a.mo24447a(rdp.mo24505i());
                                            if (equals) {
                                                a.mo24446a("FastUpload");
                                            }
                                            if (!z8) {
                                                i4 = bnre;
                                                z9 = true;
                                            } else {
                                                if (a != null) {
                                                    try {
                                                        a.close();
                                                    } catch (SQLiteException e5) {
                                                        e = e5;
                                                        z4 = true;
                                                        String valueOf32 = String.valueOf(str);
                                                        Log.e("QosUploaderService", valueOf32.length() == 0 ? new String("Failed to run QosUploaderService:") : "Failed to run QosUploaderService:".concat(valueOf32), e);
                                                        if (z4) {
                                                        }
                                                        if (!cdej.m132805k()) {
                                                        }
                                                        this.f30058c.mo24558b();
                                                        rae.f42460a.mo24412e();
                                                        if (cddp.m132711c()) {
                                                        }
                                                    } catch (Throwable th9) {
                                                        th = th9;
                                                        z3 = true;
                                                        if (z3) {
                                                        }
                                                        if (!cdej.m132805k()) {
                                                        }
                                                        this.f30058c.mo24558b();
                                                        throw th;
                                                    }
                                                }
                                                this.f30060e.mo24560a();
                                                if (!cdej.m132805k()) {
                                                    if (z2) {
                                                        if (equals2) {
                                                        }
                                                        String valueOf4 = String.valueOf(str);
                                                        if (valueOf4.length() == 0) {
                                                            new String("try scheduling oneoff task by: ");
                                                        } else {
                                                            "try scheduling oneoff task by: ".concat(valueOf4);
                                                        }
                                                        this.f30058c.mo24557a(this.f30060e.mo24561b() + 1000);
                                                    }
                                                }
                                                if (m22447e(str) && qxw.m33076a(this.f30057b, this.f30061g)) {
                                                    this.f30058c.mo24558b();
                                                }
                                                rae.f42460a.mo24412e();
                                                if (cddp.m132711c()) {
                                                    rai2 = rae.f42460a;
                                                    rai2.mo24408b();
                                                }
                                                z = false;
                                            }
                                        }
                                        bngx = f30056a;
                                        if (cdes.m132867b()) {
                                        }
                                        a.mo24447a(rdp.mo24505i());
                                        if (equals) {
                                        }
                                        if (!z8) {
                                        }
                                    } catch (Throwable th10) {
                                        th = th10;
                                        z4 = true;
                                        if (a != null) {
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th11) {
                                    th = th11;
                                    z6 = z9;
                                    th = th;
                                    z4 = z6;
                                    if (a != null) {
                                    }
                                    throw th;
                                }
                            }
                            boolean z11 = z9;
                            if (a != null) {
                                try {
                                    a.close();
                                } catch (SQLiteException e6) {
                                    e = e6;
                                    z4 = z11;
                                } catch (Throwable th12) {
                                    th = th12;
                                    z3 = z11;
                                    if (z3) {
                                    }
                                    if (!cdej.m132805k()) {
                                    }
                                    this.f30058c.mo24558b();
                                    throw th;
                                }
                            }
                            if (z11) {
                                this.f30060e.mo24560a();
                            }
                            if (!cdej.m132805k()) {
                                if (z2) {
                                    if (equals2) {
                                    }
                                    String valueOf5 = String.valueOf(str);
                                    if (valueOf5.length() == 0) {
                                        new String("try scheduling oneoff task by: ");
                                    } else {
                                        "try scheduling oneoff task by: ".concat(valueOf5);
                                    }
                                    this.f30058c.mo24557a(this.f30060e.mo24561b() + 1000);
                                }
                            }
                            if (m22447e(str) && qxw.m33076a(this.f30057b, this.f30061g)) {
                                this.f30058c.mo24558b();
                            }
                            rae.f42460a.mo24412e();
                            if (cddp.m132711c()) {
                                rai = rae.f42460a;
                            }
                            z = true;
                        } else {
                            if (a != null) {
                                a.close();
                            }
                            cdej.m132805k();
                            if (m22447e(str) && qxw.m33076a(this.f30057b, this.f30061g)) {
                                this.f30058c.mo24558b();
                            }
                            rae.f42460a.mo24412e();
                            if (cddp.m132711c()) {
                                rai = rae.f42460a;
                            } else {
                                z = true;
                            }
                        }
                    } catch (Throwable th13) {
                        th = th13;
                        z4 = false;
                        z2 = false;
                        if (a != null) {
                        }
                        throw th;
                    }
                } catch (SQLiteException e7) {
                    e = e7;
                    z4 = false;
                    z2 = false;
                    String valueOf322 = String.valueOf(str);
                    Log.e("QosUploaderService", valueOf322.length() == 0 ? new String("Failed to run QosUploaderService:") : "Failed to run QosUploaderService:".concat(valueOf322), e);
                    if (z4) {
                        this.f30060e.mo24560a();
                    }
                    if (!cdej.m132805k()) {
                        if (z2) {
                            if (equals2) {
                            }
                            String valueOf6 = String.valueOf(str);
                            if (valueOf6.length() == 0) {
                                new String("try scheduling oneoff task by: ");
                            } else {
                                "try scheduling oneoff task by: ".concat(valueOf6);
                            }
                            this.f30058c.mo24557a(this.f30060e.mo24561b() + 1000);
                        }
                    }
                    if (m22447e(str) && qxw.m33076a(this.f30057b, this.f30061g)) {
                        this.f30058c.mo24558b();
                    }
                    rae.f42460a.mo24412e();
                    if (cddp.m132711c()) {
                        rai2 = rae.f42460a;
                        rai2.mo24408b();
                        z = false;
                        return z;
                    }
                    z = false;
                    return z;
                } catch (Throwable th14) {
                    th = th14;
                    z3 = false;
                    z2 = false;
                    if (z3) {
                        this.f30060e.mo24560a();
                    }
                    if (!cdej.m132805k()) {
                        if (z2) {
                            if (equals2) {
                            }
                            String valueOf7 = String.valueOf(str);
                            if (valueOf7.length() == 0) {
                                new String("try scheduling oneoff task by: ");
                            } else {
                                "try scheduling oneoff task by: ".concat(valueOf7);
                            }
                            this.f30058c.mo24557a(this.f30060e.mo24561b() + 1000);
                        }
                    }
                    if (m22447e(str) && qxw.m33076a(this.f30057b, this.f30061g)) {
                        this.f30058c.mo24558b();
                    }
                    throw th;
                }
            } else {
                rae.f42460a.mo24412e();
                if (cddp.m132711c()) {
                    rai = rae.f42460a;
                }
                z = true;
            }
            rai.mo24408b();
            z = true;
        }
        return z;
        throw th2;
    }
}
