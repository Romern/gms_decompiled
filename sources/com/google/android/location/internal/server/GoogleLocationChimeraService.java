package com.google.android.location.internal.server;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.chimera.Service;
import com.google.android.gms.location.ActivityRecognitionRequest;
import com.google.android.gms.location.ActivityTransitionRequest;
import com.google.android.gms.location.SleepSegmentRequest;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GoogleLocationChimeraService extends Service {

    /* renamed from: a */
    HandlerThread f150798a;

    /* renamed from: b */
    public bgdo f150799b;

    /* renamed from: c */
    public bgbp f150800c;

    /* renamed from: d */
    private rsk f150801d;

    /* renamed from: e */
    private rsk f150802e;

    /* renamed from: f */
    private rsk f150803f;

    /* renamed from: g */
    private rsk f150804g;

    /* renamed from: h */
    private rsk f150805h;

    /* renamed from: i */
    private SharedPreferences f150806i;

    /* renamed from: j */
    private bgda f150807j;

    /* renamed from: k */
    private boolean f150808k = false;

    /* renamed from: l */
    private final bugl f150809l = new bgbx(this);

    /* renamed from: m */
    private bfmd f150810m;

    /* renamed from: a */
    private static final long m117265a(Intent intent, String str, int i) {
        if (!intent.hasExtra(str)) {
            return (long) i;
        }
        long longExtra = intent.getLongExtra(str, -1);
        if (longExtra < 0) {
            longExtra = (long) intent.getIntExtra(str, -1);
        }
        return longExtra < 0 ? (long) i : longExtra;
    }

    /* renamed from: b */
    private final synchronized boolean m117272b() {
        return this.f150808k;
    }

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final void onCreate() {
        HandlerThread handlerThread = new HandlerThread("GoogleLocationService", 9);
        this.f150798a = handlerThread;
        handlerThread.start();
        this.f150801d = m117268a("com.google.android.location.internal.EXTRA_ACTIVITY_PENDING_INTENT", 0);
        this.f150802e = m117268a("com.google.android.location.internal.EXTRA_FLOOR_CHANGE_PENDING_INTENT", 2);
        this.f150803f = m117268a("com.google.android.location.internal.EXTRA_SLEEP_SEGMENT_PENDING_INTENT", 3);
        this.f150804g = m117268a("com.google.android.location.internal.EXTRA_ACTIVITY_TRANSITION_PENDING_INTENT", 4);
        this.f150805h = rsk.m34333a(this, "com.google.android.location.internal.server.GoogleLocationService", 6, new bgby());
        this.f150806i = getSharedPreferences("activity.transitionStateSharedPreferences", 0);
        this.f150807j = new bgda(this.f150805h);
        this.f150810m = new bfmd(this.f150806i);
        bgcb bgcb = new bgcb();
        bgdo bgdo = new bgdo(this, bgcb, this.f150798a.getLooper(), this.f150801d, this.f150802e, this.f150803f, this.f150804g, this.f150807j, this.f150810m);
        this.f150799b = bgdo;
        synchronized (bgdo.f116149e) {
            bgdo.f116152i = true;
            Message.obtain(bgdo, 1).sendToTarget();
            Message.obtain(bgdo, 2).sendToTarget();
            Message.obtain(bgdo, 3).sendToTarget();
            Message.obtain(bgdo, 5).sendToTarget();
            bgdo.f116162s.mo17934a(bgdo);
        }
        bugn a = bgcb.mo62634a(this);
        a.mo72629a(5147455389092024324L, this.f150809l, new adzt(Looper.myLooper()));
        bgbp a2 = bgbp.m98537a(this, this.f150799b, a);
        this.f150800c = a2;
        a2.mo62618a();
    }

    public final void onDestroy() {
        bgdo bgdo = this.f150799b;
        synchronized (bgdo.f116149e) {
            bgdo.f116152i = false;
            bgjp bgjp = bgdo.f116153j;
            if (bgjp != null) {
                bgjp.f116622c.mo62836a();
            }
            if (!bgdo.f116147c) {
                Message.obtain(bgdo, 3).sendToTarget();
            }
            ServiceThread$LogRequestReceiver serviceThread$LogRequestReceiver = bgdo.f116163t;
            if (serviceThread$LogRequestReceiver != null) {
                bgdo.f116145a.unregisterReceiver(serviceThread$LogRequestReceiver);
                bgdo.f116163t = null;
            }
            bgdo.mo62678b();
            bgdo.f116162s.mo17933a();
            Message.obtain(bgdo, 4).sendToTarget();
            bhcz.m100664a(null);
            bgdo.f116150f = null;
        }
        super.onDestroy();
        this.f150800c.mo62619b();
        new bgcb().mo62634a(this).mo72630a(this.f150809l);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.location.internal.server.GoogleLocationChimeraService.a(android.content.Intent, boolean):void
     arg types: [android.content.Intent, int]
     candidates:
      com.google.android.location.internal.server.GoogleLocationChimeraService.a(android.content.Intent, java.lang.String):bhcv
      com.google.android.location.internal.server.GoogleLocationChimeraService.a(java.lang.String, int):rsk
      com.google.android.location.internal.server.GoogleLocationChimeraService.a(android.content.Intent, boolean):void */
    public final void onStart(Intent intent, int i) {
        budt budt;
        long[] jArr;
        long[] jArr2;
        Intent intent2 = intent;
        if (intent2 != null) {
            try {
                int i2 = 4;
                int i3 = 3;
                rsk rsk = null;
                if (rsk.m34335a(intent)) {
                    int b = rsk.m34336b(intent);
                    if (b == 0) {
                        rsk = this.f150801d;
                        rsk.mo25070c(intent2);
                    } else if (b == 6) {
                        this.f150805h.mo25070c(intent2);
                        int size = this.f150805h.mo25074e().size();
                        StringBuilder sb = new StringBuilder(39);
                        sb.append("NLP_PERSISTENT, data length ");
                        sb.append(size);
                        sb.toString();
                        this.f150807j.mo62662c();
                    } else if (b == 2) {
                        rsk = this.f150802e;
                        rsk.mo25070c(intent2);
                    } else if (b == 3) {
                        rsk = this.f150803f;
                        rsk.mo25070c(intent2);
                    } else if (b != 4) {
                        StringBuilder sb2 = new StringBuilder(31);
                        sb2.append("Unknown cache type: ");
                        sb2.append(b);
                        sb2.toString();
                    } else {
                        rsk = this.f150804g;
                        rsk.mo25070c(intent2);
                    }
                    if (m117272b()) {
                        mo70877a();
                    } else if (rsk != null) {
                        for (Intent intent3 : rsk.mo25074e()) {
                            m117271a(intent3, false);
                        }
                        StringBuilder sb3 = new StringBuilder(73);
                        sb3.append("Finished initializing clients from pending intent cache, type=");
                        sb3.append(b);
                        sb3.toString();
                    }
                } else if (intent2.hasExtra("com.google.android.location.internal.CACHE_REQUEST_PROTO")) {
                    if (intent2.hasExtra("com.google.android.location.internal.CACHE_REQUEST_PROTO")) {
                        long id = Thread.currentThread().getId();
                        StringBuilder sb4 = new StringBuilder(65);
                        sb4.append("LocationService thread handler, thread ID is ");
                        sb4.append(id);
                        sb4.toString();
                        byte[] byteArrayExtra = intent2.getByteArrayExtra("com.google.android.location.internal.CACHE_REQUEST_PROTO");
                        int length = byteArrayExtra.length;
                        StringBuilder sb5 = new StringBuilder(39);
                        sb5.append("cache query proto is length ");
                        sb5.append(length);
                        sb5.toString();
                        try {
                            bufk bufk = (bufk) GeneratedMessageLite.m124014a(bufk.f153709c, byteArrayExtra);
                            int size2 = bufk.f153711a.size();
                            int size3 = bufk.f153712b.size();
                            StringBuilder sb6 = new StringBuilder(59);
                            sb6.append("query bssid count is ");
                            sb6.append(size2);
                            sb6.append(", cell count is ");
                            sb6.append(size3);
                            sb6.toString();
                            jArr2 = new long[bufk.f153711a.size()];
                            jArr = new long[bufk.f153712b.size()];
                            int i4 = 0;
                            for (bufn bufn : bufk.f153711a) {
                                jArr2[i4] = bufn.f153723a;
                                i4++;
                            }
                            int i5 = 0;
                            for (bufh bufh : bufk.f153712b) {
                                int i6 = i5 + 1;
                                jArr[i5] = bufh.f153699a;
                                i5 = i6;
                            }
                        } catch (bxwf e) {
                            jArr2 = new long[0];
                            jArr = jArr2;
                        }
                        PendingIntent pendingIntent = (PendingIntent) intent2.getParcelableExtra("com.google.android.location.internal.EXTRA_PENDING_INTENT");
                        bgdo bgdo = this.f150799b;
                        bgca bgca = new bgca(this, pendingIntent);
                        synchronized (bgdo.f116149e) {
                            bgjp bgjp = bgdo.f116153j;
                            if (bgjp != null) {
                                bgjp.f116622c.mo62846a(6, 0, new bghs(jArr2, jArr, bgca), false);
                            } else {
                                m117270a(getApplicationContext(), pendingIntent, 2, new HashMap(), new HashMap());
                            }
                        }
                    }
                } else if (!intent2.hasExtra("com.google.android.location.internal.EXTRA_COMPUTE_WIFI_LOCATIONS_REQUEST")) {
                    m117271a(intent2, true);
                } else if (cest.f183409a.mo6606a().nlpEnableComputeWifiLocations()) {
                    Context applicationContext = getApplicationContext();
                    bgdo bgdo2 = this.f150799b;
                    byte[] byteArrayExtra2 = intent2.getByteArrayExtra("com.google.android.location.internal.EXTRA_COMPUTE_WIFI_LOCATIONS_REQUEST");
                    ArrayList arrayList = new ArrayList();
                    if (byteArrayExtra2 != null) {
                        try {
                            for (bucu bucu : ((bucw) GeneratedMessageLite.m124014a(bucw.f153415b, byteArrayExtra2)).f153417a) {
                                if (buct.m119339a(bucu.f153411a) == i3) {
                                    if (bucu.f153411a == i2) {
                                        budt = (budt) bucu.f153412b;
                                    } else {
                                        budt = budt.f153515b;
                                    }
                                    long j = bucu.f153413c / 1000000;
                                    bfnu bfnu = new bfnu(j, budt.f153517a.size());
                                    for (buds buds : budt.f153517a) {
                                        bfnu.mo62002a(buds.f153512a, (byte) buds.f153513b, 0, j);
                                    }
                                    arrayList.add(bfnu.mo62001a(null, false));
                                    i2 = 4;
                                    i3 = 3;
                                } else {
                                    i2 = 4;
                                    i3 = 3;
                                }
                            }
                        } catch (bxwf e2) {
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        bgbu bgbu = new bgbu(intent2, applicationContext);
                        synchronized (bgdo2.f116149e) {
                            bgjp bgjp2 = bgdo2.f116153j;
                            if (bgjp2 != null) {
                                bgjp2.f116622c.mo62846a(9, 0, new bght(arrayList, bgbu), false);
                            } else {
                                bgbv.m98559a(intent2, applicationContext);
                            }
                        }
                    } else {
                        bgbv.m98559a(intent2, applicationContext);
                    }
                } else {
                    bgbv.m98559a(intent2, getApplicationContext());
                }
            } catch (Exception e3) {
                long nlpSilentFeedbackIntervalMillis = ceze.f183524a.mo6606a().nlpSilentFeedbackIntervalMillis();
                if (nlpSilentFeedbackIntervalMillis != -1) {
                    boolean nlpSilentFeedbackEnabled = ceze.f183524a.mo6606a().nlpSilentFeedbackEnabled();
                    StringBuilder sb7 = new StringBuilder(31);
                    sb7.append("reportToFeedback; enabled=");
                    sb7.append(nlpSilentFeedbackEnabled);
                    sb7.toString();
                    if (nlpSilentFeedbackEnabled) {
                        synchronized (bgdq.class) {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            if (bgdq.f116171a == 0 || elapsedRealtime - bgdq.f116171a >= nlpSilentFeedbackIntervalMillis) {
                                bgdq.f116171a = elapsedRealtime;
                                new bgdp(e3).start();
                                return;
                            }
                            StringBuilder sb8 = new StringBuilder(62);
                            sb8.append("reportToFeedback; throttled for interval: ");
                            sb8.append(elapsedRealtime - bgdq.f116171a);
                            sb8.toString();
                            return;
                        }
                    }
                    return;
                }
                throw e3;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        bgjp bgjp;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long currentTimeMillis = System.currentTimeMillis();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM-dd HH:mm:ss.SSS", Locale.US);
        String format = simpleDateFormat.format(new Date(currentTimeMillis));
        printWriter.print("elapsedRealtime ");
        printWriter.print(elapsedRealtime);
        printWriter.print(" is time ");
        printWriter.println(format);
        bgdo bgdo = this.f150799b;
        synchronized (bgdo.f116149e) {
            long j = bgdo.f116154k;
            StringBuilder sb = new StringBuilder(53);
            sb.append("NLP-Period (millis) is currently ");
            sb.append(j);
            printWriter.println(sb.toString());
            boolean z = bgdo.f116146b;
            StringBuilder sb2 = new StringBuilder(21);
            sb2.append("NLP operational ");
            sb2.append(z);
            printWriter.println(sb2.toString());
            boolean a = bgdo.mo62677a();
            StringBuilder sb3 = new StringBuilder(26);
            sb3.append("location permission? ");
            sb3.append(a);
            printWriter.println(sb3.toString());
            boolean a2 = bgdo.f116161r.mo34487a("network");
            StringBuilder sb4 = new StringBuilder(17);
            sb4.append("nlpEnabled? ");
            sb4.append(a2);
            printWriter.println(sb4.toString());
            boolean a3 = aeri.m52434a(bgdo.f116145a);
            StringBuilder sb5 = new StringBuilder(18);
            sb5.append("userConsent? ");
            sb5.append(a3);
            printWriter.println(sb5.toString());
            bgcg bgcg = bgdo.f116155l;
            long a4 = bgcg.f116031b.mo26054a() / 1000;
            StringBuilder sb6 = new StringBuilder(53);
            sb6.append(a4);
            sb6.append(" sec. (");
            sb6.append(a4 / 60);
            sb6.append(" min.)");
            String valueOf = String.valueOf(sb6.toString());
            printWriter.println(valueOf.length() == 0 ? new String("####NLP Location Client Stats: ") : "####NLP Location Client Stats: ".concat(valueOf));
            printWriter.println(bgcg.f116031b);
        }
        printWriter.println();
        bgdo bgdo2 = this.f150799b;
        synchronized (bgdo2.f116149e) {
            bgbg bgbg = bgdo2.f116157n;
            long a5 = bgbg.f115984h.mo26054a() / 1000;
            StringBuilder sb7 = new StringBuilder(53);
            sb7.append(a5);
            sb7.append(" sec. (");
            sb7.append(a5 / 60);
            sb7.append(" min.)");
            String valueOf2 = String.valueOf(sb7.toString());
            printWriter.println(valueOf2.length() == 0 ? new String("####Activity Client Stats: ") : "####Activity Client Stats: ".concat(valueOf2));
            printWriter.println(bgbg.f115984h);
        }
        printWriter.println();
        this.f150799b.f116158o.mo62632a(printWriter);
        printWriter.println();
        this.f150799b.f116159p.mo62632a(printWriter);
        printWriter.println();
        this.f150799b.f116160q.mo62632a(printWriter);
        printWriter.println();
        bgdo bgdo3 = this.f150799b;
        synchronized (bgdo3.f116149e) {
            printWriter.print("GMS collection is ");
            Boolean bool = bgdo3.f116151h;
            if (bool != null) {
                printWriter.println(!bool.booleanValue() ? "disabled" : "enabled");
            } else {
                printWriter.println("not yet set.");
            }
            if (bgdo3.f116153j != null) {
                printWriter.println("RealOs stats:");
                bgjp bgjp2 = bgdo3.f116153j;
                bfko bfko = bgjp2.f116633n;
                bgmk bgmk = bgjp2.f116625f;
                bfko.mo61851a(simpleDateFormat, bgof.m99492e(), printWriter);
                printWriter.println();
            }
            bgla.f116740a.mo62966a(printWriter, SystemClock.elapsedRealtime());
        }
        bgdo bgdo4 = this.f150799b;
        synchronized (bgdo4.f116149e) {
            bgjp = bgdo4.f116153j;
        }
        if (bgjp != null) {
            boolean z2 = bgjp.f116638s;
            boolean i = ceze.m138464i();
            StringBuilder sb8 = new StringBuilder(39);
            sb8.append("Telephony status: ");
            sb8.append(z2);
            sb8.append(", from PM: ");
            sb8.append(i);
            printWriter.println(sb8.toString());
            bgid bgid = bgjp.f116622c;
            CountDownLatch countDownLatch = new CountDownLatch(1);
            bgid.mo62847a(new bghn(bgid, printWriter, countDownLatch));
            while (true) {
                try {
                    countDownLatch.await();
                    break;
                } catch (InterruptedException e) {
                }
            }
        }
        this.f150801d.mo25063a(printWriter);
        this.f150802e.mo25063a(printWriter);
        this.f150803f.mo25063a(printWriter);
        this.f150804g.mo25063a(printWriter);
        printWriter.flush();
    }

    /* renamed from: a */
    private final bhcv m117266a(Intent intent, String str) {
        bhcw a = bhcw.m100653a(intent, "com.google.android.location.internal.EXTRA_LOCATION_WORK_SOURCE");
        if (a != null) {
            if (svr.m36484b(this).mo26171a("android.permission.UPDATE_DEVICE_STATS", getPackageName()) == 0) {
                if (svr.m36484b(this).mo26171a("android.permission.UPDATE_DEVICE_STATS", str) != 0) {
                    List c = a.mo63560c();
                    if (c.size() != 1 || !((String) c.get(0)).equals(str)) {
                        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 47);
                        sb.append("package ");
                        sb.append(str);
                        sb.append(" doesn't have permission for WorkSource");
                        sb.toString();
                    }
                }
            }
            return null;
        }
        return a;
    }

    /* renamed from: a */
    private static final rnt m117267a(Intent intent) {
        IBinder a = C1004fv.m12454a(intent.getExtras(), "com.google.android.location.internal.EXTRA_API_CALLBACK");
        if (a == null) {
            return null;
        }
        IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
        if (queryLocalInterface instanceof rnt) {
            return (rnt) queryLocalInterface;
        }
        return new rnr(a);
    }

    /* renamed from: a */
    private final rsk m117268a(String str, int i) {
        return new rsk(this, "com.google.android.location.internal.server.GoogleLocationService", new bgbz(str), i);
    }

    /* renamed from: a */
    static void m117269a(Context context, PendingIntent pendingIntent, int i, int i2, Map map, Map map2) {
        bxvd da = bufm.f153714f.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bufm bufm = (bufm) da.f164949b;
        bufm.f153717b = i - 1;
        int i3 = bufm.f153716a | 1;
        bufm.f153716a = i3;
        bufm.f153718c = i2 - 1;
        bufm.f153716a = i3 | 2;
        for (Map.Entry entry : map.entrySet()) {
            Long l = (Long) entry.getKey();
            bfni bfni = (bfni) entry.getValue();
            int i4 = 94;
            if (bfni.f114480b == 0 && bfni.f114481c == 0 && bfni.f114482d == 0) {
                i4 = -1;
            }
            bxvd da2 = bufo.f153725h.mo74144da();
            long longValue = l.longValue();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bufo bufo = (bufo) da2.f164949b;
            int i5 = bufo.f153727a | 1;
            bufo.f153727a = i5;
            bufo.f153728b = longValue;
            int i6 = bfni.f114480b;
            int i7 = i5 | 2;
            bufo.f153727a = i7;
            bufo.f153729c = i6;
            int i8 = bfni.f114481c;
            int i9 = i7 | 4;
            bufo.f153727a = i9;
            bufo.f153730d = i8;
            int i10 = bfni.f114482d;
            int i11 = i9 | 8;
            bufo.f153727a = i11;
            bufo.f153731e = i10;
            int i12 = i11 | 16;
            bufo.f153727a = i12;
            bufo.f153732f = 20000;
            bufo.f153727a = i12 | 32;
            bufo.f153733g = i4;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bufm bufm2 = (bufm) da.f164949b;
            bufo bufo2 = (bufo) da2.mo74062i();
            bufo2.getClass();
            if (!bufm2.f153719d.mo73666a()) {
                bufm2.f153719d = GeneratedMessageLite.m124021a(bufm2.f153719d);
            }
            bufm2.f153719d.add(bufo2);
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            bfni bfni2 = (bfni) entry2.getValue();
            bxvd da3 = bufi.f153701f.mo74144da();
            long longValue2 = ((Long) entry2.getKey()).longValue();
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            bufi bufi = (bufi) da3.f164949b;
            int i13 = bufi.f153703a | 1;
            bufi.f153703a = i13;
            bufi.f153704b = longValue2;
            int i14 = bfni2.f114480b;
            int i15 = i13 | 2;
            bufi.f153703a = i15;
            bufi.f153705c = i14;
            int i16 = bfni2.f114481c;
            int i17 = i15 | 4;
            bufi.f153703a = i17;
            bufi.f153706d = i16;
            int i18 = bfni2.f114482d;
            bufi.f153703a = i17 | 8;
            bufi.f153707e = i18;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bufm bufm3 = (bufm) da.f164949b;
            bufi bufi2 = (bufi) da3.mo74062i();
            bufi2.getClass();
            if (!bufm3.f153720e.mo73666a()) {
                bufm3.f153720e = GeneratedMessageLite.m124021a(bufm3.f153720e);
            }
            bufm3.f153720e.add(bufi2);
        }
        byte[] k = ((bufm) da.mo74062i()).mo73642k();
        Intent intent = new Intent();
        intent.putExtra("com.google.android.location.internal.CACHE_RESULT_PROTO", k);
        try {
            sse.m36201a(pendingIntent, context, 0, intent, (PendingIntent.OnFinished) null);
        } catch (Exception e) {
        }
    }

    /* renamed from: a */
    public static void m117270a(Context context, PendingIntent pendingIntent, int i, Map map, Map map2) {
        int size = map.size();
        int size2 = map2.size();
        StringBuilder sb = new StringBuilder(71);
        sb.append("Sending cache response, wifi size ");
        sb.append(size);
        sb.append(", cell size is ");
        sb.append(size2);
        sb.toString();
        int size3 = map.size();
        HashMap hashMap = new HashMap(14);
        Map map3 = map2;
        int i2 = 2;
        for (Map.Entry entry : map.entrySet()) {
            hashMap.put((Long) entry.getKey(), (bfni) entry.getValue());
            size3--;
            if (hashMap.size() == 14) {
                if (size3 == 0) {
                    i2 = 1;
                } else {
                    i2 = 2;
                }
                m117269a(context, pendingIntent, i, i2, hashMap, map3);
                Map emptyMap = Collections.emptyMap();
                hashMap.clear();
                map3 = emptyMap;
            }
        }
        if (i2 == 2) {
            m117269a(context, pendingIntent, i, 1, hashMap, map3);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [long, int]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
    /* renamed from: a */
    private final void m117271a(Intent intent, boolean z) {
        bgjp bgjp;
        ActivityTransitionRequest activityTransitionRequest;
        SleepSegmentRequest sleepSegmentRequest;
        rnt a;
        PendingIntent pendingIntent;
        Intent intent2 = intent;
        String valueOf = String.valueOf(intent);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 29);
        sb.append("handleClientRequestIntent is ");
        sb.append(valueOf);
        sb.toString();
        if (intent2.hasExtra("com.google.android.location.internal.EXTRA_PENDING_INTENT")) {
            PendingIntent pendingIntent2 = (PendingIntent) intent2.getParcelableExtra("com.google.android.location.internal.EXTRA_PENDING_INTENT");
            boolean booleanExtra = intent2.getBooleanExtra("com.google.android.location.internal.EXTRA_LOCATION_LOW_POWER", false);
            boolean booleanExtra2 = intent2.getBooleanExtra("com.google.android.location.internal.EXTRA_LOCATION_REMOVE", false);
            long a2 = m117265a(intent2, "com.google.android.location.internal.EXTRA_PERIOD_MILLIS", -1);
            long a3 = m117265a(intent2, "com.google.android.location.internal.EXTRA_BATCH_DURATION_MILLIS", 0);
            boolean booleanExtra3 = intent2.getBooleanExtra("com.google.android.location.internal.EXTRA_LOCATION_FORCE_NOW", true);
            boolean booleanExtra4 = intent2.getBooleanExtra("locationSettingsIgnored", false);
            String stringExtra = intent2.getStringExtra("com.google.android.location.internal.EXTRA_LOCATION_TAG");
            if (pendingIntent2 != null) {
                if (booleanExtra2) {
                    String valueOf2 = String.valueOf(pendingIntent2);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 32);
                    sb2.append("Client canceled location update ");
                    sb2.append(valueOf2);
                    sb2.toString();
                    bgdo bgdo = this.f150799b;
                    synchronized (bgdo.f116149e) {
                        String valueOf3 = String.valueOf(Integer.toHexString(pendingIntent2.hashCode()));
                        if (valueOf3.length() == 0) {
                            new String("removing location pending intent: ");
                        } else {
                            "removing location pending intent: ".concat(valueOf3);
                        }
                        bgcg bgcg = bgdo.f116155l;
                        bfor bfor = bgcg.f116032c;
                        if (bfor != null) {
                            bfor.mo62052a(bfos.LOCATION_PENDING_INTENT_REMOVED, pendingIntent2.hashCode(), pendingIntent2.getTargetPackage());
                        }
                        bgce bgce = (bgce) bgcg.f116030a.remove(pendingIntent2);
                        if (bgce != null) {
                            bgce.mo62594a();
                            bgcg.mo62638a(bgcg.f116030a.values());
                        }
                        bgdo.mo62682c(false);
                        bgdo.mo62675a(bgdo.f116155l.f116036g);
                    }
                } else if (a2 >= 0) {
                    String targetPackage = pendingIntent2.getTargetPackage();
                    String valueOf4 = String.valueOf(pendingIntent2);
                    boolean a4 = rsk.m34335a(intent);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf4).length() + 75 + String.valueOf(targetPackage).length() + String.valueOf(stringExtra).length());
                    sb3.append("received pending intent. pendingIntent=");
                    sb3.append(valueOf4);
                    sb3.append(", packageName=");
                    sb3.append(targetPackage);
                    sb3.append(", tag=");
                    sb3.append(stringExtra);
                    sb3.append(", isCache? ");
                    sb3.append(a4);
                    sb3.toString();
                    bhcv a5 = m117266a(intent2, targetPackage);
                    bgdo bgdo2 = this.f150799b;
                    bgdi bgdi = new bgdi(bgdo2, pendingIntent2, stringExtra, a2, booleanExtra3, a3, booleanExtra, a5, booleanExtra4);
                    if (!ceze.m138460e()) {
                        synchronized (bgdo2.f116149e) {
                            bgjp bgjp2 = bgdo2.f116153j;
                            if (bgjp2 != null) {
                                bgjp2.mo62907a((Runnable) bgdi);
                            } else {
                                bgdi.run();
                            }
                        }
                    } else {
                        bgdo2.post(bgdi);
                    }
                }
            }
        }
        if (intent2.hasExtra("com.google.android.location.internal.EXTRA_ACTIVITY_PENDING_INTENT") && (pendingIntent = (PendingIntent) intent2.getParcelableExtra("com.google.android.location.internal.EXTRA_ACTIVITY_PENDING_INTENT")) != null) {
            String targetPackage2 = pendingIntent.getTargetPackage();
            String valueOf5 = String.valueOf(pendingIntent);
            StringBuilder sb4 = new StringBuilder(String.valueOf(targetPackage2).length() + 39 + String.valueOf(valueOf5).length());
            sb4.append("received activity pending intent from ");
            sb4.append(targetPackage2);
            sb4.append(" ");
            sb4.append(valueOf5);
            sb4.toString();
            if (intent2.getBooleanExtra("com.google.android.location.internal.EXTRA_ACTIVITY_REMOVE", false)) {
                String valueOf6 = String.valueOf(pendingIntent);
                StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf6).length() + 35);
                sb5.append("Client canceled activity detection ");
                sb5.append(valueOf6);
                sb5.toString();
                this.f150799b.mo62670a(pendingIntent);
                if (z) {
                    this.f150801d.mo25067b((Parcelable) intent2);
                }
            } else {
                boolean booleanExtra5 = intent2.getBooleanExtra("com.google.android.location.internal.EXTRA_IS_FROM_FIRST_PARTY", false);
                ActivityRecognitionRequest activityRecognitionRequest = (intent2 == null || !intent2.hasExtra("com.google.android.location.internal.EXTRA_ACTIVITY_RECOGNITION_REQUEST")) ? null : (ActivityRecognitionRequest) sef.m35067a(intent2, "com.google.android.location.internal.EXTRA_ACTIVITY_RECOGNITION_REQUEST", ActivityRecognitionRequest.CREATOR);
                if (activityRecognitionRequest == null) {
                    long a6 = m117265a(intent2, "com.google.android.location.internal.EXTRA_ACTIVITY_PERIOD_MILLIS", 180000);
                    boolean booleanExtra6 = intent2.getBooleanExtra("com.google.android.location.internal.EXTRA_ACTIVITY_FORCE_DETECTION_NOW", true);
                    bhcv a7 = m117266a(intent2, targetPackage2);
                    String stringExtra2 = intent2.getStringExtra("com.google.android.location.internal.EXTRA_ACTIVITY_TAG");
                    int[] intArrayExtra = intent2.getIntArrayExtra("com.google.android.location.internal.EXTRA_NONDEFAULT_ACTIVITY_TYPES");
                    boolean booleanExtra7 = intent2.getBooleanExtra("com.google.android.location.internal.EXTRA_REQUEST_SENSOR_DATA_FOR_ACTIVITY", false);
                    aefy aefy = new aefy();
                    aefy.mo34115a(Math.max(a6, 0L));
                    aefy.f63346c = booleanExtra6;
                    aefy.f63348e = stringExtra2;
                    aefy.f63349f = booleanExtra7;
                    if (a7 != null) {
                        aefy.f63347d = ((bhcw) a7).f118316a;
                    }
                    if (intArrayExtra != null) {
                        for (int i : intArrayExtra) {
                            aefy.mo34114a(i);
                        }
                    }
                    activityRecognitionRequest = aefy.mo34113a();
                }
                bgdo bgdo3 = this.f150799b;
                bgdj bgdj = new bgdj(bgdo3, pendingIntent, activityRecognitionRequest, booleanExtra5);
                if (ceze.m138460e()) {
                    bgdo3.post(bgdj);
                } else {
                    synchronized (bgdo3.f116149e) {
                        bgjp bgjp3 = bgdo3.f116153j;
                        if (bgjp3 != null) {
                            bgjp3.mo62907a((Runnable) bgdj);
                        } else {
                            bgdj.run();
                        }
                    }
                }
                if (z) {
                    this.f150801d.mo25062a((Parcelable) intent2);
                }
                if (cezo.m138476b()) {
                    bgdo bgdo4 = this.f150799b;
                    synchronized (bgdo4.f116149e) {
                        bgjp bgjp4 = bgdo4.f116153j;
                        if (bgjp4 != null) {
                            if (intent2 != null) {
                                String str = activityRecognitionRequest.f79298g;
                                if (str != null) {
                                    new Object[1][0] = str;
                                    bgjp4.f116636q = str;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (intent2.hasExtra("com.google.android.location.internal.EXTRA_FLUSH_ACTIVITY_SAMPLES") && (a = m117267a(intent)) != null) {
            bgdo bgdo5 = this.f150799b;
            synchronized (bgdo5.f116149e) {
                bgdo5.f116157n.f115985i.add(a);
                bgjp bgjp5 = bgdo5.f116153j;
                if (bgjp5 != null) {
                    bgjp5.f116622c.mo62846a(41, 0, null, true);
                } else {
                    bgdo5.mo61008a(bfma.f114382b);
                }
            }
        }
        if (intent2.hasExtra("com.google.android.location.internal.EXTRA_FLOOR_CHANGE_PENDING_INTENT")) {
            PendingIntent pendingIntent3 = (PendingIntent) intent2.getParcelableExtra("com.google.android.location.internal.EXTRA_FLOOR_CHANGE_PENDING_INTENT");
            bgdt bgdt = this.f150799b.f116158o;
            if (pendingIntent3 != null) {
                String targetPackage3 = pendingIntent3.getTargetPackage();
                String valueOf7 = String.valueOf(pendingIntent3);
                StringBuilder sb6 = new StringBuilder(String.valueOf(targetPackage3).length() + 43 + String.valueOf(valueOf7).length());
                sb6.append("Received floor change pending intent from ");
                sb6.append(targetPackage3);
                sb6.append(" ");
                sb6.append(valueOf7);
                sb6.toString();
                if (intent2.getBooleanExtra("com.google.android.location.internal.EXTRA_FLOOR_CHANGE_REMOVE", false)) {
                    String valueOf8 = String.valueOf(pendingIntent3);
                    StringBuilder sb7 = new StringBuilder(String.valueOf(valueOf8).length() + 39);
                    sb7.append("Client canceled floor change detection ");
                    sb7.append(valueOf8);
                    sb7.toString();
                    this.f150799b.mo62673a(bgdt, pendingIntent3);
                    if (z) {
                        this.f150802e.mo25067b((Parcelable) intent2);
                    }
                } else {
                    bhcv a8 = m117266a(intent2, targetPackage3);
                    boolean booleanExtra8 = intent2.getBooleanExtra("com.google.android.location.internal.EXTRA_IS_FROM_FIRST_PARTY", false);
                    String stringExtra3 = intent2.getStringExtra("com.google.android.location.internal.EXTRA_FLOOR_CHANGE_TAG");
                    String valueOf9 = String.valueOf(a8);
                    StringBuilder sb8 = new StringBuilder(String.valueOf(targetPackage3).length() + 95 + String.valueOf(valueOf9).length() + String.valueOf(stringExtra3).length());
                    sb8.append("Adding/updating floor change detection client: package=");
                    sb8.append(targetPackage3);
                    sb8.append(" workSource=");
                    sb8.append(valueOf9);
                    sb8.append(" tag=");
                    sb8.append(stringExtra3);
                    sb8.append(" isFromFirstParty=");
                    sb8.append(booleanExtra8);
                    sb8.toString();
                    this.f150799b.mo62674a(bgdt, pendingIntent3, Boolean.TRUE, booleanExtra8, a8, stringExtra3, null);
                    if (z) {
                        this.f150802e.mo25062a((Parcelable) intent2);
                    }
                }
            }
        }
        if (intent2.hasExtra("com.google.android.location.internal.EXTRA_SLEEP_SEGMENT_PENDING_INTENT")) {
            PendingIntent pendingIntent4 = (PendingIntent) intent2.getParcelableExtra("com.google.android.location.internal.EXTRA_SLEEP_SEGMENT_PENDING_INTENT");
            bgdt bgdt2 = this.f150799b.f116160q;
            if (pendingIntent4 != null) {
                String targetPackage4 = pendingIntent4.getTargetPackage();
                String valueOf10 = String.valueOf(pendingIntent4);
                StringBuilder sb9 = new StringBuilder(String.valueOf(targetPackage4).length() + 44 + String.valueOf(valueOf10).length());
                sb9.append("Received sleep segment pending intent from ");
                sb9.append(targetPackage4);
                sb9.append(" ");
                sb9.append(valueOf10);
                sb9.toString();
                if (intent2.getBooleanExtra("com.google.android.location.internal.EXTRA_SLEEP_SEGMENT_REMOVE", false)) {
                    String valueOf11 = String.valueOf(pendingIntent4);
                    StringBuilder sb10 = new StringBuilder(String.valueOf(valueOf11).length() + 40);
                    sb10.append("Client canceled sleep segment detection ");
                    sb10.append(valueOf11);
                    sb10.toString();
                    this.f150799b.mo62673a(bgdt2, pendingIntent4);
                    if (z) {
                        this.f150803f.mo25067b((Parcelable) intent2);
                    }
                } else {
                    if (intent2 == null || !intent2.hasExtra("com.google.android.location.internal.EXTRA_SLEEP_SEGMENT_REQUEST")) {
                        sleepSegmentRequest = null;
                    } else {
                        sleepSegmentRequest = (SleepSegmentRequest) sef.m35067a(intent2, "com.google.android.location.internal.EXTRA_SLEEP_SEGMENT_REQUEST", SleepSegmentRequest.CREATOR);
                    }
                    bhcv a9 = m117266a(intent2, targetPackage4);
                    boolean booleanExtra9 = intent2.getBooleanExtra("com.google.android.location.internal.EXTRA_IS_FROM_FIRST_PARTY", false);
                    String stringExtra4 = intent2.getStringExtra("com.google.android.location.internal.EXTRA_SLEEP_SEGMENT_TAG");
                    String valueOf12 = String.valueOf(a9);
                    StringBuilder sb11 = new StringBuilder(String.valueOf(targetPackage4).length() + 96 + String.valueOf(valueOf12).length() + String.valueOf(stringExtra4).length());
                    sb11.append("Adding/updating sleep segment detection client: package=");
                    sb11.append(targetPackage4);
                    sb11.append(" workSource=");
                    sb11.append(valueOf12);
                    sb11.append(" tag=");
                    sb11.append(stringExtra4);
                    sb11.append(" isFromFirstParty=");
                    sb11.append(booleanExtra9);
                    sb11.toString();
                    this.f150799b.mo62674a(bgdt2, pendingIntent4, sleepSegmentRequest, booleanExtra9, a9, stringExtra4, m117267a(intent));
                    if (z) {
                        this.f150803f.mo25062a((Parcelable) intent2);
                    }
                }
            }
        }
        if (intent2.hasExtra("com.google.android.location.internal.EXTRA_ACTIVITY_TRANSITION_PENDING_INTENT")) {
            PendingIntent pendingIntent5 = (PendingIntent) intent2.getParcelableExtra("com.google.android.location.internal.EXTRA_ACTIVITY_TRANSITION_PENDING_INTENT");
            bgdt bgdt3 = this.f150799b.f116159p;
            if (pendingIntent5 != null) {
                String targetPackage5 = pendingIntent5.getTargetPackage();
                String valueOf13 = String.valueOf(pendingIntent5);
                StringBuilder sb12 = new StringBuilder(String.valueOf(targetPackage5).length() + 50 + String.valueOf(valueOf13).length());
                sb12.append("Received activity transition pending intent from ");
                sb12.append(targetPackage5);
                sb12.append(" ");
                sb12.append(valueOf13);
                sb12.toString();
                if (intent2.getBooleanExtra("com.google.android.location.internal.EXTRA_ACTIVITY_TRANSITION_REMOVE", false)) {
                    String valueOf14 = String.valueOf(pendingIntent5);
                    StringBuilder sb13 = new StringBuilder(String.valueOf(valueOf14).length() + 46);
                    sb13.append("Client canceled activity transition detection ");
                    sb13.append(valueOf14);
                    sb13.toString();
                    this.f150799b.mo62673a(bgdt3, pendingIntent5);
                    if (z) {
                        this.f150804g.mo25067b((Parcelable) intent2);
                    }
                } else {
                    if (intent2 == null || !intent2.hasExtra("com.google.android.location.internal.EXTRA_ACTIVITY_TRANSITION_REQUEST")) {
                        activityTransitionRequest = null;
                    } else {
                        activityTransitionRequest = (ActivityTransitionRequest) sef.m35067a(intent2, "com.google.android.location.internal.EXTRA_ACTIVITY_TRANSITION_REQUEST", ActivityTransitionRequest.CREATOR);
                    }
                    if (activityTransitionRequest != null) {
                        String valueOf15 = String.valueOf(activityTransitionRequest);
                        StringBuilder sb14 = new StringBuilder(String.valueOf(valueOf15).length() + 38);
                        sb14.append("Received activity transition request: ");
                        sb14.append(valueOf15);
                        sb14.toString();
                        this.f150799b.mo62674a(bgdt3, pendingIntent5, activityTransitionRequest, intent2.getBooleanExtra("com.google.android.location.internal.EXTRA_IS_FROM_FIRST_PARTY", false), new bhcw(), activityTransitionRequest.f79312c, m117267a(intent));
                        intent.getExtras().remove("com.google.android.location.internal.EXTRA_API_CALLBACK");
                        if (z) {
                            this.f150804g.mo25062a((Parcelable) intent2);
                        }
                    }
                }
            }
        }
        if (intent2.hasExtra("nlp.FLUSH_BATCH_INTENT") && (bgjp = this.f150799b.f116153j) != null) {
            bgjp.f116622c.mo62846a(2, 0, null, true);
        }
        if (intent2.hasExtra("nlp.WIFI_SCAN_INTENT")) {
            PendingIntent pendingIntent6 = (PendingIntent) intent2.getParcelableExtra("nlp.WIFI_SCAN_INTENT");
            String valueOf16 = String.valueOf(pendingIntent6);
            StringBuilder sb15 = new StringBuilder(String.valueOf(valueOf16).length() + 26);
            sb15.append("wifiScan pendingIntent is ");
            sb15.append(valueOf16);
            sb15.toString();
            boolean booleanExtra10 = intent2.getBooleanExtra("com.google.android.location.internal.EXTRA_LOCATION_REMOVE", false);
            if (pendingIntent6 == null) {
                return;
            }
            if (!booleanExtra10) {
                bgdo bgdo6 = this.f150799b;
                bgdo6.f116156m.mo62691a(bgdo6.mo62683d(), pendingIntent6);
                return;
            }
            this.f150799b.f116156m.mo62689a(pendingIntent6);
        }
    }

    /* renamed from: a */
    public final synchronized void mo70877a() {
        if (this.f150801d.mo25065a()) {
            if (this.f150803f.mo25065a()) {
                stopSelf();
                return;
            }
        }
        this.f150808k = true;
    }
}
