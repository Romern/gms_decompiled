package com.google.android.gms.tron;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.IBinder;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.LruCache;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.chimera.Service;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.phenotype.ExperimentTokens;
import com.google.android.gms.udc.UdcCacheRequest;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CollectionChimeraService extends Service implements auji {

    /* renamed from: b */
    public static final UdcCacheRequest f109089b = new UdcCacheRequest(f109091i);

    /* renamed from: g */
    private static final Charset f109090g = Charset.forName("UTF-8");

    /* renamed from: i */
    private static final int[] f109091i = {8, 10};

    /* renamed from: a */
    public final Object f109092a = new Object();

    /* renamed from: c */
    public qxq f109093c;

    /* renamed from: d */
    public SharedPreferences f109094d;

    /* renamed from: e */
    public aujd f109095e;

    /* renamed from: f */
    public aujg f109096f;

    /* renamed from: h */
    private final SecureRandom f109097h = new SecureRandom();

    /* renamed from: j */
    private boolean f109098j;

    /* renamed from: k */
    private aujc f109099k;

    /* renamed from: l */
    private ArrayList f109100l;

    /* renamed from: m */
    private final LruCache f109101m = new LruCache(100);

    /* renamed from: n */
    private final MessageDigest f109102n;

    /* renamed from: o */
    private byte[] f109103o;

    /* renamed from: p */
    private skc f109104p;

    /* renamed from: q */
    private aujf f109105q;

    /* renamed from: r */
    private cixq f109106r;

    /* renamed from: s */
    private Random f109107s;

    /* renamed from: t */
    private ModuleManager f109108t;

    /* renamed from: u */
    private ModuleManager.ModuleInfo f109109u;

    public CollectionChimeraService() {
        try {
            this.f109102n = MessageDigest.getInstance("MD5");
            this.f109095e = new aujd();
            if (cgzc.f188099a.mo6606a().mo84790a()) {
                this.f109095e.f91935c = avtz.m79336a(rpr.m34216b(), new avty());
                if (cgzf.m147724c()) {
                    Log.i("CollectionChimeraSvc", "Using new consent API");
                }
            } else if (cgzf.m147724c()) {
                Log.i("CollectionChimeraSvc", "NOT using new consent API");
            }
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public static Intent m93376a(Context context) {
        return new Intent().setClassName(context, "com.google.android.gms.tron.CollectionService");
    }

    /* renamed from: b */
    public final bxvd mo50591b() {
        if (this.f109100l.isEmpty()) {
            return bzzx.f172237al.mo74144da();
        }
        bzzx bzzx = (bzzx) this.f109100l.remove(0);
        bxvd bxvd = (bxvd) bzzx.mo74142c(5);
        bxvd.mo73625a((bxvk) bzzx);
        bxvd.f164949b = (bxvk) bxvd.f164949b.mo74142c(4);
        return bxvd;
    }

    /* renamed from: c */
    public final long mo50595c(String str) {
        long j;
        synchronized (this.f109092a) {
            j = this.f109094d.getLong(str, 0);
        }
        return j;
    }

    /* renamed from: d */
    public final void mo50596d(String str) {
        synchronized (this.f109092a) {
            this.f109094d.edit().putBoolean(str, true).apply();
        }
    }

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final void onCreate() {
        super.onCreate();
        this.f109107s = new Random(System.currentTimeMillis());
        this.f109098j = false;
        if (getApplicationInfo().targetSdkVersion > 19) {
            this.f109100l = new ArrayList();
            qws qws = new qws(this, "TRON", null);
            qws.mo24337a(cagz.m126622a((int) cgzf.m147723b()));
            this.f109099k = new aujc(qws);
            this.f109093c = new qxq(qws, "TRON_COUNTERS", 1024);
            this.f109094d = getSharedPreferences("tron_prefs", 0);
            this.f109104p = new skc(this);
            if (cgzf.m147725d()) {
                this.f109098j = true;
            }
            sns sns = new sns(10);
            sns.start();
            this.f109105q = new aujf(this, sns);
        }
    }

    public final void onDestroy() {
        aujf aujf = this.f109105q;
        if (aujf != null) {
            aujf.mo25780c();
        }
        this.f109105q = null;
        super.onDestroy();
    }

    public final void onStart(Intent intent, int i) {
        ExperimentTokens experimentTokens;
        if (this.f109098j) {
            mo59544a();
            aujg aujg = new aujg(this, 1);
            aujg.f91938b = i;
            if (intent != null) {
                byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.android.gms.tron.extra.serializedExpTokens");
                if (byteArrayExtra != null) {
                    experimentTokens = (ExperimentTokens) sef.m35069a(byteArrayExtra, ExperimentTokens.CREATOR);
                } else {
                    experimentTokens = null;
                }
                aujg.f91940d = experimentTokens;
                aujg.f91944h = intent.getIntExtra("com.google.android.gms.tron.extra.reason", 0);
            } else {
                aujg.f91944h = 6;
            }
            mo50587a(aujg);
        }
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        onStart(intent, i2);
        return this.f109098j ? 1 : 2;
    }

    /* renamed from: a */
    public static boolean m93377a(rjx rjx) {
        aucb k = rjx.mo24755k("TRON");
        try {
            aucu.m76783a(k, 10000, TimeUnit.MILLISECONDS);
            if (!k.mo50384b() || k.mo50386d() == null || !((Boolean) k.mo50386d()).booleanValue()) {
                return false;
            }
            if (!cgzf.m147724c()) {
                return true;
            }
            Log.i("CollectionChimeraSvc", "Consent API says canLog is true");
            return true;
        } catch (ExecutionException | TimeoutException e) {
            return false;
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            return false;
        }
    }

    /* renamed from: b */
    public final void mo50592b(String str, int i) {
        if (cgzf.m147724c()) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 35);
            sb.append("increment counter ");
            sb.append(str);
            sb.append(" with ");
            sb.append(i);
            sb.toString();
        }
        this.f109093c.mo24383c(str).mo24360a((long) i);
    }

    /* renamed from: a */
    public final aujg mo50585a(aujh aujh) {
        return new aujg(this, aujh);
    }

    /* renamed from: a */
    public final void mo59544a() {
        byte[] bArr;
        cixq q = cgzf.f188102a.mo6606a().mo84808q();
        if (q != null) {
            bArr = q.mo73642k();
        } else {
            bArr = null;
        }
        if (bArr != null) {
            try {
                this.f109106r = (cixq) bxvk.m124016a(cixq.f191707b, bArr, bxus.m123744c());
            } catch (bxwf e) {
                Log.e("CollectionChimeraSvc", "failed to decode rate configuration", e);
            }
        } else {
            this.f109106r = null;
        }
    }

    /* renamed from: b */
    public final void mo50593b(String str, long j) {
        synchronized (this.f109092a) {
            this.f109094d.edit().putLong(str, j).apply();
        }
    }

    /* renamed from: b */
    public final boolean mo50594b(String str) {
        boolean z;
        synchronized (this.f109092a) {
            z = this.f109094d.getBoolean(str, false);
        }
        return z;
    }

    /* renamed from: a */
    public final void mo50586a(long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean c = cgzf.m147724c();
        if (j != Long.MAX_VALUE) {
            long min = Math.min(Math.max(j, (long) ((int) cgzf.f188102a.mo6606a().mo84800i())), (long) ((int) cgzf.f188102a.mo6606a().mo84799h()));
            if (c) {
                StringBuilder sb = new StringBuilder(52);
                sb.append("scheduling collection interval: ");
                sb.append(min);
                sb.toString();
            }
            PendingIntent broadcast = PendingIntent.getBroadcast(this, 0, new Intent("com.google.android.gms.tron.ALARM").setClassName(this, "com.google.android.gms.tron.AlarmReceiver"), 134217728);
            this.f109104p.mo25668a(broadcast);
            this.f109104p.mo25675a("CollectionChimeraSvc", 3, elapsedRealtime + min, broadcast, "com.google.android.gms");
            return;
        }
        this.f109093c.mo24383c("tron_disable").mo24359a();
        if (c) {
            StringBuilder sb2 = new StringBuilder(42);
            sb2.append("disabling collection: ");
            sb2.append(j);
            sb2.toString();
        }
    }

    /* renamed from: a */
    public final void mo50587a(aujg aujg) {
        aujf aujf = this.f109105q;
        if (aujf != null) {
            Message obtainMessage = aujf.obtainMessage();
            obtainMessage.obj = aujg;
            this.f109105q.sendMessage(obtainMessage);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:109:0x01ee  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0154  */
    /* renamed from: a */
    public final void mo50588a(bxvd bxvd) {
        String str;
        int i;
        int a;
        int i2;
        bxvd bxvd2 = bxvd;
        bzzx bzzx = (bzzx) bxvd.mo74062i();
        bkb bkb = bkb.VIEW_UNKNOWN;
        int a2 = bjz.m3242a(bzzx.f172274c);
        if (a2 == 0) {
            a2 = 1;
        }
        int i3 = a2 - 1;
        if (i3 == 1) {
            qxl d = this.f109093c.mo24385d("tron_view");
            bkb a3 = bkb.m3247a(bzzx.f172275d);
            if (a3 == null) {
                a3 = bkb.VIEW_UNKNOWN;
            }
            d.mo24367a(a3.f4944CA);
        } else if (i3 == 3) {
            qxl d2 = this.f109093c.mo24385d("tron_detail");
            bkb a4 = bkb.m3247a(bzzx.f172275d);
            if (a4 == null) {
                a4 = bkb.VIEW_UNKNOWN;
            }
            d2.mo24367a(a4.f4944CA);
        } else if (i3 == 4) {
            qxl d3 = this.f109093c.mo24385d("tron_action");
            bkb a5 = bkb.m3247a(bzzx.f172275d);
            if (a5 == null) {
                a5 = bkb.VIEW_UNKNOWN;
            }
            d3.mo24367a(a5.f4944CA);
        }
        bkb a6 = bkb.m3247a(bzzx.f172275d);
        if (a6 == null) {
            a6 = bkb.VIEW_UNKNOWN;
        }
        int ordinal = a6.ordinal();
        if (ordinal == 128) {
            int a7 = bjz.m3242a(bzzx.f172274c);
            if (a7 == 0) {
                a7 = 1;
            }
            int i4 = a7 - 1;
            if (i4 == 1) {
                mo50589a("tron_note_freshness", (int) (bzzx.f172280i / 60000));
            } else if (i4 == 4) {
                mo50589a("tron_note_exposure", (int) (bzzx.f172281j / 60000));
            } else if (i4 == 5) {
                mo59547a("tron_note_dismiss");
                mo50589a("tron_note_lifetime", (int) (bzzx.f172279h / 60000));
                int i5 = bzzx.f172278g;
                if (i5 == 1) {
                    mo59547a("tron_note_dismiss_click");
                } else if (i5 == 2 || i5 == 3) {
                    mo59547a("tron_note_dismiss_user");
                } else if (i5 == 7) {
                    mo59547a("tron_note_dismiss_ban");
                } else if (i5 == 10 || i5 == 11) {
                    mo59547a("tron_note_dismiss_listener");
                } else if (i5 == 17) {
                    mo59547a("tron_note_dismiss_channel");
                } else if (i5 == 18) {
                    mo59547a("tron_note_dismiss_snooze");
                }
            }
        } else if (ordinal == 199) {
            if ((bzzx.f172278g & 1) != 0) {
                mo59547a("tron_note_buzz");
            }
            if ((bzzx.f172278g & 2) != 0) {
                mo59547a("tron_note_beep");
            }
            if ((bzzx.f172278g & 4) != 0) {
                mo59547a("tron_note_blink");
            }
        }
        bkb a8 = bkb.m3247a(((bzzx) bxvd2.f164949b).f172275d);
        if (a8 == null) {
            a8 = bkb.VIEW_UNKNOWN;
        }
        int ordinal2 = a8.ordinal();
        if (!(ordinal2 == 128 || ordinal2 == 129)) {
            switch (ordinal2) {
                case 186:
                case 187:
                case 188:
                case 189:
                case 190:
                case 191:
                case AndroidInputTypeSignal.TYPE_TEXT_VARIATION_PHONETIC /*192*/:
                case 193:
                    if (!cgzf.f188102a.mo6606a().mo84802k()) {
                        return;
                    }
                    cixq cixq = this.f109106r;
                    if (!(cixq == null || cixq.f191709a.size() == 0)) {
                        for (i = 0; i < this.f109106r.f191709a.size(); i++) {
                            bkb a9 = bkb.m3247a(((bzzx) bxvd2.f164949b).f172275d);
                            if (a9 == null) {
                                a9 = bkb.VIEW_UNKNOWN;
                            }
                            if (a9.f4944CA >= ((cixr) this.f109106r.f191709a.get(i)).f191712a) {
                                bkb a10 = bkb.m3247a(((bzzx) bxvd2.f164949b).f172275d);
                                if (a10 == null) {
                                    a10 = bkb.VIEW_UNKNOWN;
                                }
                                if (a10.f4944CA <= ((cixr) this.f109106r.f191709a.get(i)).f191713b) {
                                    if (((cixr) this.f109106r.f191709a.get(i)).f191714c != 1.0f && (((cixr) this.f109106r.f191709a.get(i)).f191714c == 0.0f || this.f109107s.nextFloat() > ((cixr) this.f109106r.f191709a.get(i)).f191714c)) {
                                        return;
                                    }
                                }
                            }
                        }
                    }
                    if (cgzf.f188102a.mo6606a().mo84806o()) {
                        String str2 = ((bzzx) bxvd2.f164949b).f172283l;
                        if (!TextUtils.isEmpty(str2)) {
                            str = (String) this.f109101m.get(str2);
                            if (str == null) {
                                this.f109102n.reset();
                                MessageDigest messageDigest = this.f109102n;
                                if (this.f109103o == null) {
                                    synchronized (this.f109092a) {
                                        String string = this.f109094d.getString("hash_salt", null);
                                        if (string == null) {
                                            byte[] bArr = new byte[16];
                                            this.f109097h.nextBytes(bArr);
                                            string = Base64.encodeToString(bArr, 3);
                                            this.f109094d.edit().putString("hash_salt", string).apply();
                                            if (cgzf.m147724c()) {
                                                String valueOf = String.valueOf(string);
                                                Log.i("CollectionChimeraSvc", valueOf.length() == 0 ? new String("created a new salt: ") : "created a new salt: ".concat(valueOf));
                                            }
                                        }
                                        this.f109103o = string.getBytes(f109090g);
                                    }
                                }
                                messageDigest.update(this.f109103o);
                                this.f109102n.update(str2.getBytes(f109090g));
                                byte[] digest = this.f109102n.digest();
                                str = Base64.encodeToString(digest, 0, Math.min(8, digest.length), 3);
                                this.f109101m.put(str2, str);
                            }
                        } else {
                            str = "";
                        }
                        if (bxvd2.f164950c) {
                            bxvd.mo74035c();
                            bxvd2.f164950c = false;
                        }
                        bzzx bzzx2 = (bzzx) bxvd2.f164949b;
                        bzzx bzzx3 = bzzx.f172237al;
                        str.getClass();
                        int i6 = bzzx2.f172265a | 2048;
                        bzzx2.f172265a = i6;
                        bzzx2.f172284m = str;
                        "".getClass();
                        bzzx2.f172265a = i6 | 1024;
                        bzzx2.f172283l = "";
                    }
                    bosx bosx = bosx.f134741g;
                    if (bxvd2.f164950c) {
                        bxvd.mo74035c();
                        bxvd2.f164950c = false;
                    }
                    bzzx bzzx4 = (bzzx) bxvd2.f164949b;
                    bzzx bzzx5 = bzzx.f172237al;
                    bosx.getClass();
                    bzzx4.f172285n = bosx;
                    bzzx4.f172265a |= 4096;
                    if (this.f109109u == null) {
                        if (this.f109108t == null) {
                            this.f109108t = ModuleManager.get(this);
                        }
                        this.f109109u = this.f109108t.getCurrentModule();
                    }
                    int i7 = this.f109109u.moduleVersion;
                    if (bxvd2.f164950c) {
                        bxvd.mo74035c();
                        bxvd2.f164950c = false;
                    }
                    bzzx bzzx6 = (bzzx) bxvd2.f164949b;
                    bzzx6.f172265a |= 4194304;
                    bzzx6.f172295x = i7;
                    aujd aujd = this.f109095e;
                    if (aujd.f91935c == null) {
                        if (aujd.mo50579b()) {
                            cgzf.m147724c();
                            int size = this.f109095e.f91934a.size();
                            bosx bosx2 = ((bzzx) bxvd2.f164949b).f172285n;
                            if (bosx2 == null) {
                                bosx2 = bosx.f134741g;
                            }
                            bxvd bxvd3 = (bxvd) bosx2.mo74142c(5);
                            bxvd3.mo73625a((bxvk) bosx2);
                            if (bxvd3.f164950c) {
                                bxvd3.mo74035c();
                                bxvd3.f164950c = false;
                            }
                            bosx bosx3 = (bosx) bxvd3.f164949b;
                            bosx3.f134743a = 1 | bosx3.f134743a;
                            bosx3.f134744b = size;
                            bosx bosx4 = (bosx) bxvd3.mo74062i();
                            if (bxvd2.f164950c) {
                                bxvd.mo74035c();
                                bxvd2.f164950c = false;
                            }
                            bzzx bzzx7 = (bzzx) bxvd2.f164949b;
                            bosx4.getClass();
                            bzzx7.f172285n = bosx4;
                            bzzx7.f172265a |= 4096;
                            for (int i8 = 0; i8 < size; i8++) {
                                bosx bosx5 = ((bzzx) bxvd2.f164949b).f172285n;
                                if (bosx5 == null) {
                                    bosx5 = bosx.f134741g;
                                }
                                bxvd bxvd4 = (bxvd) bosx5.mo74142c(5);
                                bxvd4.mo73625a((bxvk) bosx5);
                                if (bxvd4.f164950c) {
                                    bxvd4.mo74035c();
                                    bxvd4.f164950c = false;
                                }
                                bosx bosx6 = (bosx) bxvd4.f164949b;
                                bosx6.f134743a |= 4;
                                bosx6.f134746d = i8;
                                bosx bosx7 = (bosx) bxvd4.mo74062i();
                                if (bxvd2.f164950c) {
                                    bxvd.mo74035c();
                                    bxvd2.f164950c = false;
                                }
                                bzzx bzzx8 = (bzzx) bxvd2.f164949b;
                                bosx7.getClass();
                                bzzx8.f172285n = bosx7;
                                bzzx8.f172265a |= 4096;
                                mo59546a((bzzx) bxvd.mo74062i(), (String) this.f109095e.f91934a.get(i8));
                            }
                        } else {
                            cgzf.m147724c();
                            bosx bosx8 = ((bzzx) bxvd2.f164949b).f172285n;
                            if (bosx8 == null) {
                                bosx8 = bosx.f134741g;
                            }
                            bxvd bxvd5 = (bxvd) bosx8.mo74142c(5);
                            bxvd5.mo73625a((bxvk) bosx8);
                            if (bxvd5.f164950c) {
                                bxvd5.mo74035c();
                                bxvd5.f164950c = false;
                            }
                            bosx bosx9 = (bosx) bxvd5.f164949b;
                            bosx9.f134743a |= 2;
                            bosx9.f134745c = true;
                            bosx bosx10 = (bosx) bxvd5.mo74062i();
                            if (bxvd2.f164950c) {
                                bxvd.mo74035c();
                                bxvd2.f164950c = false;
                            }
                            bzzx bzzx9 = (bzzx) bxvd2.f164949b;
                            bosx10.getClass();
                            bzzx9.f172285n = bosx10;
                            bzzx9.f172265a |= 4096;
                            mo59546a((bzzx) bxvd.mo74062i(), (String) null);
                        }
                        if (cgzf.m147724c()) {
                            String valueOf2 = String.valueOf(bxvd);
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 7);
                            sb.append("proto: ");
                            sb.append(valueOf2);
                            Log.i("CollectionChimeraSvc", sb.toString());
                        }
                        mo59545a((bzzx) bxvd.mo74062i());
                        return;
                    }
                    if (cgzf.m147724c()) {
                        Log.i("CollectionChimeraSvc", "Uploading with new consent API");
                    }
                    this.f109095e.f91935c.mo24695a("TRON", ((bzzx) bxvd.mo74062i()).mo73642k(), new aujb(), (int) cgzf.m147723b());
                    mo59545a((bzzx) bxvd.mo74062i());
                    return;
                default:
                    switch (ordinal2) {
                        case 196:
                        case 197:
                        case 198:
                            break;
                        case ErrorInfo.TYPE_SDU_UNKNOWN:
                            break;
                        default:
                            if (!cgzf.f188102a.mo6606a().mo84807p()) {
                                return;
                            }
                            cixq cixq2 = this.f109106r;
                            while (i < this.f109106r.f191709a.size()) {
                            }
                    }
            }
        }
        if (cgzf.f188102a.mo6606a().mo84804m()) {
            bzzx bzzx10 = (bzzx) bxvd.mo74062i();
            bkb a11 = bkb.m3247a(bzzx10.f172275d);
            if (a11 == null) {
                a11 = bkb.VIEW_UNKNOWN;
            }
            if (a11 != bkb.NOTIFICATION_ITEM || (a = bjz.m3242a(bzzx10.f172274c)) == 0 || a != 6 || (i2 = bzzx10.f172278g) == 2 || i2 == 3 || i2 == 10 || i2 == 11 || i2 == 1 || i2 == 7 || i2 == 17 || i2 == 18) {
                if (!cgzf.f188102a.mo6606a().mo84805n()) {
                    if (bxvd2.f164950c) {
                        bxvd.mo74035c();
                        bxvd2.f164950c = false;
                    }
                    bzzx bzzx11 = (bzzx) bxvd2.f164949b;
                    bzzx bzzx12 = bzzx.f172237al;
                    int i9 = bzzx11.f172265a | 512;
                    bzzx11.f172265a = i9;
                    bzzx11.f172282k = 0;
                    "".getClass();
                    bzzx11.f172265a = i9 | 1024;
                    bzzx11.f172283l = "";
                }
                cixq cixq22 = this.f109106r;
                while (i < this.f109106r.f191709a.size()) {
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo59545a(bzzx bzzx) {
        if (!this.f109100l.contains(bzzx)) {
            this.f109100l.add(bzzx);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo59546a(bzzx bzzx, String str) {
        try {
            qwo a = this.f109099k.f91932a.mo24335a(bzzx.mo73642k());
            if (str != null) {
                a.mo24330c(str);
            }
            ExperimentTokens experimentTokens = this.f109096f.f91940d;
            if (experimentTokens != null) {
                byte[] bytes = experimentTokens.mo46493b().getBytes(f109090g);
                if (!a.f42317a.f42344k) {
                    a.f42319c = false;
                    if (!(bytes == null || bytes.length == 0)) {
                        if (a.f42318b == null) {
                            a.f42318b = new ArrayList();
                        }
                        a.f42318b.add(bytes);
                    }
                } else {
                    throw new IllegalArgumentException("addExperimentToken forbidden on anonymous logger");
                }
            }
            a.mo24327b();
        } catch (IllegalArgumentException e) {
            qxl d = this.f109093c.mo24385d("tron_bad_proto");
            bkb a2 = bkb.m3247a(bzzx.f172275d);
            if (a2 == null) {
                a2 = bkb.VIEW_UNKNOWN;
            }
            d.mo24367a(a2.f4944CA);
        }
    }

    /* renamed from: a */
    public final void mo59547a(String str) {
        if (cgzf.m147724c()) {
            if (str.length() == 0) {
                new String("increment counter ");
            } else {
                "increment counter ".concat(str);
            }
        }
        this.f109093c.mo24383c(str).mo24359a();
    }

    /* renamed from: a */
    public final void mo50589a(String str, int i) {
        if (cgzf.m147724c()) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 41);
            sb.append("increment int histogram ");
            sb.append(str);
            sb.append(" with ");
            sb.append(i);
            sb.toString();
        }
        this.f109093c.mo24385d(str).mo24367a(i);
    }

    /* renamed from: a */
    public final void mo50590a(String str, long j) {
        if (cgzf.m147724c()) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51);
            sb.append("increment long histogram ");
            sb.append(str);
            sb.append(" with ");
            sb.append(j);
            sb.toString();
        }
        this.f109093c.mo24387e(str).mo24368a(j);
    }
}
