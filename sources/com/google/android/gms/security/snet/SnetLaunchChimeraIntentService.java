package com.google.android.gms.security.snet;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SnetLaunchChimeraIntentService extends IntentOperation {

    /* renamed from: a */
    private static final String f107574a = SnetLaunchChimeraIntentService.class.getSimpleName();

    /* renamed from: b */
    private String f107575b;

    /* renamed from: c */
    private String f107576c;

    /* renamed from: d */
    private String f107577d;

    /* renamed from: e */
    private String f107578e;

    /* renamed from: f */
    private aqdu f107579f;

    /* renamed from: g */
    private ArrayList f107580g;

    /* renamed from: h */
    private String f107581h;

    /* renamed from: i */
    private byte[] f107582i;

    /* renamed from: j */
    private Bundle f107583j;

    /* renamed from: k */
    private String[] f107584k;

    /* renamed from: l */
    private ArrayList f107585l;

    /* renamed from: a */
    public static ComponentName m92432a(Context context, String str, String str2, long j, int i, String str3, String str4, String str5, ArrayList arrayList, apyq apyq, Set set, Bundle bundle) {
        Intent startIntent = IntentOperation.getStartIntent(context, SnetLaunchChimeraIntentService.class, str5);
        if (startIntent == null) {
            return null;
        }
        startIntent.putExtra("snet.intent.extra.SNET_PATH", str);
        startIntent.putExtra("snet.intent.extra.INSTALLED_JAR_PATH", str2);
        startIntent.putExtra("snet.intent.extra.JAR_VERSION", j);
        startIntent.putExtra("snet.intent.extra.GMS_CORE_VERSION", i);
        startIntent.putExtra("snet.intent.extra.UUID", str3);
        startIntent.putExtra("snet.intent.extra.SHARED_UUID", str4);
        startIntent.putStringArrayListExtra("snet.intent.extra.SNET_API_PACKAGES", arrayList);
        startIntent.putExtra("snet.intent.extra.CACHED_LOGS", apyq.mo73642k());
        startIntent.putExtra("snet.intent.extra.SNET_FLAGS", bundle);
        startIntent.putExtra("snet.intent.extra.REQUESTED_DIGESTS", (String[]) set.toArray(new String[set.size()]));
        startIntent.putParcelableArrayListExtra("snet.intent.extra.DEX_INFO_BUNDLES", apyv.m71200a(context).mo47709a());
        return context.startService(startIntent);
    }

    public final void onCreate() {
    }

    public final void onHandleIntent(Intent intent) {
        Map a;
        if (intent != null) {
            String action = intent.getAction();
            this.f107581h = action;
            if (!"com.google.android.gms.security.snet.ACTION_IDLE_MODE".equals(action)) {
                mo58944a(this, intent);
                return;
            }
            asfb asfb = new asfb(this, 1, f107574a, null, "com.google.android.gms");
            asfb.mo49115a(false);
            try {
                asfb.mo49111a(SnetWatchdogChimeraIntentService.m92438a(this.f107581h));
                mo58944a(this, intent);
                if (cgkt.f187180a.mo6606a().mo84005H() && (a = new apuw(this).mo47634a()) != null && a.containsKey(aqay.NEW_ACTIVITY_AFTER_SCREEN_OFF)) {
                    aqdu aqdu = this.f107579f;
                    aqdu.mo47764a();
                    if (!a.isEmpty()) {
                        apuv apuv = (apuv) a.get(aqay.NEW_ACTIVITY_AFTER_SCREEN_OFF);
                        if (apuv != null) {
                            bxvd da = aqba.f85521b.mo74144da();
                            bxvd da2 = aqaz.f85515e.mo74144da();
                            aqay aqay = aqay.NEW_ACTIVITY_AFTER_SCREEN_OFF;
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            aqaz aqaz = (aqaz) da2.f164949b;
                            aqaz.f85518b = aqay.f85514c;
                            int i = aqaz.f85517a | 1;
                            aqaz.f85517a = i;
                            int i2 = apuv.f84958a;
                            aqaz.f85517a = i | 2;
                            aqaz.f85519c = i2;
                            for (Map.Entry entry : apuv.f84959b.entrySet()) {
                                bxvd da3 = aqbb.f85524e.mo74144da();
                                if (!TextUtils.isEmpty((CharSequence) entry.getKey())) {
                                    String str = (String) entry.getKey();
                                    if (da3.f164950c) {
                                        da3.mo74035c();
                                        da3.f164950c = false;
                                    }
                                    aqbb aqbb = (aqbb) da3.f164949b;
                                    str.getClass();
                                    aqbb.f85526a |= 1;
                                    aqbb.f85527b = str;
                                    bxtx a2 = bxtx.m123261a(((aput) entry.getValue()).f84952a);
                                    if (da3.f164950c) {
                                        da3.mo74035c();
                                        da3.f164950c = false;
                                    }
                                    aqbb aqbb2 = (aqbb) da3.f164949b;
                                    a2.getClass();
                                    aqbb2.f85526a |= 2;
                                    aqbb2.f85528c = a2;
                                    int i3 = ((aput) entry.getValue()).f84953b;
                                    if (da3.f164950c) {
                                        da3.mo74035c();
                                        da3.f164950c = false;
                                    }
                                    aqbb aqbb3 = (aqbb) da3.f164949b;
                                    aqbb3.f85526a |= 4;
                                    aqbb3.f85529d = i3;
                                    if (da2.f164950c) {
                                        da2.mo74035c();
                                        da2.f164950c = false;
                                    }
                                    aqaz aqaz2 = (aqaz) da2.f164949b;
                                    aqbb aqbb4 = (aqbb) da3.mo74062i();
                                    aqbb4.getClass();
                                    if (!aqaz2.f85520d.mo73666a()) {
                                        aqaz2.f85520d = GeneratedMessageLite.m124021a(aqaz2.f85520d);
                                    }
                                    aqaz2.f85520d.add(aqbb4);
                                }
                            }
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            aqba aqba = (aqba) da.f164949b;
                            aqaz aqaz3 = (aqaz) da2.mo74062i();
                            aqaz3.getClass();
                            if (!aqba.f85523a.mo73666a()) {
                                aqba.f85523a = GeneratedMessageLite.m124021a(aqba.f85523a);
                            }
                            aqba.f85523a.add(aqaz3);
                            bxvd bxvd = aqdu.f85803q;
                            if (bxvd.f164950c) {
                                bxvd.mo74035c();
                                bxvd.f164950c = false;
                            }
                            aqaw aqaw = (aqaw) bxvd.f164949b;
                            aqba aqba2 = (aqba) da.mo74062i();
                            aqaw aqaw2 = aqaw.f85497l;
                            aqba2.getClass();
                            aqaw.f85509k = aqba2;
                            aqaw.f85500b |= 4;
                        }
                    }
                    aqdu aqdu2 = this.f107579f;
                    aqdu2.mo47764a();
                    bxvd bxvd2 = aqdu2.f85803q;
                    if (bxvd2.f164950c) {
                        bxvd2.mo74035c();
                        bxvd2.f164950c = false;
                    }
                    aqaw aqaw3 = (aqaw) bxvd2.f164949b;
                    aqaw aqaw4 = aqaw.f85497l;
                    aqaw3.f85499a |= 1;
                    aqaw3.f85501c = 10003000;
                    if (TextUtils.isEmpty(aqdu2.f85799m)) {
                        bxvd bxvd3 = aqdu2.f85803q;
                        String uuid = UUID.randomUUID().toString();
                        if (bxvd3.f164950c) {
                            bxvd3.mo74035c();
                            bxvd3.f164950c = false;
                        }
                        aqaw aqaw5 = (aqaw) bxvd3.f164949b;
                        uuid.getClass();
                        aqaw5.f85499a |= 2;
                        aqaw5.f85502d = uuid;
                        bxvd bxvd4 = aqdu2.f85803q;
                        if (bxvd4.f164950c) {
                            bxvd4.mo74035c();
                            bxvd4.f164950c = false;
                        }
                        aqaw aqaw6 = (aqaw) bxvd4.f164949b;
                        aqaw6.f85499a |= 4;
                        aqaw6.f85503e = false;
                    } else {
                        bxvd bxvd5 = aqdu2.f85803q;
                        String str2 = aqdu2.f85799m;
                        if (bxvd5.f164950c) {
                            bxvd5.mo74035c();
                            bxvd5.f164950c = false;
                        }
                        aqaw aqaw7 = (aqaw) bxvd5.f164949b;
                        str2.getClass();
                        aqaw7.f85499a |= 2;
                        aqaw7.f85502d = str2;
                        bxvd bxvd6 = aqdu2.f85803q;
                        if (bxvd6.f164950c) {
                            bxvd6.mo74035c();
                            bxvd6.f164950c = false;
                        }
                        aqaw aqaw8 = (aqaw) bxvd6.f164949b;
                        aqaw8.f85499a |= 4;
                        aqaw8.f85503e = true;
                    }
                    if (!TextUtils.isEmpty(aqdu2.f85800n)) {
                        bxvd bxvd7 = aqdu2.f85803q;
                        String str3 = aqdu2.f85800n;
                        if (bxvd7.f164950c) {
                            bxvd7.mo74035c();
                            bxvd7.f164950c = false;
                        }
                        aqaw aqaw9 = (aqaw) bxvd7.f164949b;
                        str3.getClass();
                        aqaw9.f85499a |= 8;
                        aqaw9.f85504f = str3;
                    }
                    String str4 = Build.FINGERPRINT;
                    aqdu2.mo47764a();
                    if (str4 != null) {
                        bxvd bxvd8 = aqdu2.f85803q;
                        if (bxvd8.f164950c) {
                            bxvd8.mo74035c();
                            bxvd8.f164950c = false;
                        }
                        aqaw aqaw10 = (aqaw) bxvd8.f164949b;
                        str4.getClass();
                        aqaw10.f85500b = 1 | aqaw10.f85500b;
                        aqaw10.f85508j = str4;
                    }
                    if (!TextUtils.isEmpty(aqdu2.f85801o)) {
                        bxvd bxvd9 = aqdu2.f85803q;
                        String str5 = aqdu2.f85801o;
                        if (bxvd9.f164950c) {
                            bxvd9.mo74035c();
                            bxvd9.f164950c = false;
                        }
                        aqaw aqaw11 = (aqaw) bxvd9.f164949b;
                        str5.getClass();
                        aqaw11.f85499a |= 32;
                        aqaw11.f85506h = str5;
                    }
                    bxvd bxvd10 = aqdu2.f85803q;
                    boolean a3 = sre.m36080a(aqdu2.f85798b);
                    if (bxvd10.f164950c) {
                        bxvd10.mo74035c();
                        bxvd10.f164950c = false;
                    }
                    aqaw aqaw12 = (aqaw) bxvd10.f164949b;
                    aqaw12.f85499a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    aqaw12.f85507i = a3;
                    synchronized (aqdu.f85796l) {
                        bxvd bxvd11 = aqdu2.f85803q;
                        List list = aqdu.f85795k;
                        if (bxvd11.f164950c) {
                            bxvd11.mo74035c();
                            bxvd11.f164950c = false;
                        }
                        aqaw aqaw13 = (aqaw) bxvd11.f164949b;
                        if (!aqaw13.f85505g.mo73666a()) {
                            aqaw13.f85505g = GeneratedMessageLite.m124021a(aqaw13.f85505g);
                        }
                        bxsy.m123078a(list, aqaw13.f85505g);
                        aqdu.f85795k.clear();
                    }
                    aqdu2.f85797a = (aqaw) aqdu2.f85803q.mo74062i();
                    qws.m33019a(aqdu2.f85798b, "ANDROID_SNET_JAR").mo24335a(aqdu2.f85797a.mo73642k()).mo24327b();
                    aqdu2.f85803q = aqaw.f85497l.mo74144da();
                    aqdu2.f85797a = null;
                }
            } catch (Throwable th) {
            }
            asfb.mo49120c();
        }
    }

    /* renamed from: a */
    private final void m92433a(Context context, Bundle bundle) {
        String str;
        String absolutePath = new File(this.f107575b, "dalvik-cache").getAbsolutePath();
        new File(absolutePath).mkdirs();
        new File(absolutePath, "snet.dex").delete();
        srj.m36120a(new File(this.f107575b, "installed/oat"));
        new File(this.f107575b, "installed/snet.jar.prof").delete();
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        if (systemClassLoader == null) {
            Log.e(f107574a, "Couldn't find class loader");
            return;
        }
        ClassLoader parent = systemClassLoader.getParent();
        if (parent.getParent() != null) {
            parent = parent.getParent();
        }
        int i = Build.VERSION.SDK_INT;
        Class loadClass = new DexClassLoader(this.f107576c, absolutePath, null, parent).loadClass("com.google.android.snet.Snet");
        if ("com.google.android.gms.security.snet.ACTION_IDLE_MODE".equals(this.f107581h)) {
            str = "enterSnetIdle";
        } else {
            str = "enterSnet";
        }
        loadClass.getMethod(str, Context.class, Bundle.class).invoke(null, context, bundle);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0104 A[Catch:{ all -> 0x013c, all -> 0x0150 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0117 A[Catch:{ all -> 0x013c, all -> 0x0150 }] */
    /* renamed from: a */
    public final void mo58944a(Context context, Intent intent) {
        char c = 65535;
        this.f107579f = new aqdu(context, intent.getIntExtra("snet.intent.extra.GMS_CORE_VERSION", -1));
        this.f107575b = intent.getStringExtra("snet.intent.extra.SNET_PATH");
        this.f107576c = intent.getStringExtra("snet.intent.extra.INSTALLED_JAR_PATH");
        this.f107577d = intent.getStringExtra("snet.intent.extra.UUID");
        this.f107578e = intent.getStringExtra("snet.intent.extra.SHARED_UUID");
        this.f107580g = intent.getStringArrayListExtra("snet.intent.extra.SNET_API_PACKAGES");
        this.f107582i = intent.getByteArrayExtra("snet.intent.extra.CACHED_LOGS");
        this.f107583j = intent.getBundleExtra("snet.intent.extra.SNET_FLAGS");
        this.f107584k = intent.getStringArrayExtra("snet.intent.extra.REQUESTED_DIGESTS");
        if (!TextUtils.isEmpty(this.f107577d)) {
            this.f107579f.f85799m = this.f107577d;
        }
        if (!TextUtils.isEmpty(this.f107578e)) {
            this.f107579f.f85800n = this.f107578e;
        }
        if (!TextUtils.isEmpty(cgkt.m145932d())) {
            this.f107579f.f85801o = cgkt.m145932d();
        }
        this.f107585l = intent.getParcelableArrayListExtra("snet.intent.extra.DEX_INFO_BUNDLES");
        try {
            if (this.f107581h != null) {
                Bundle a = apui.m71030a(context);
                if (!TextUtils.isEmpty(this.f107577d)) {
                    a.putString("snet_uuid", this.f107577d);
                }
                if (!TextUtils.isEmpty(this.f107578e)) {
                    a.putString("snet_shared_uuid", this.f107578e);
                }
                a.putBoolean("snet_is_sidewinder_device", sre.m36080a(context));
                if ("com.google.android.gms.security.snet.ACTION_IDLE_MODE".equals(this.f107581h)) {
                    a.putCharSequenceArray("snet_upload_requested_apks", this.f107584k);
                }
                a.putStringArrayList("snet_verify_apps_api_usage", this.f107580g);
                a.putByteArray("snet_cached_logs", this.f107582i);
                a.putBundle("snet.intent.extra.SNET_FLAGS", this.f107583j);
                a.putParcelableArrayList("snet.intent.extra.DEX_INFO_BUNDLES", this.f107585l);
                String str = this.f107581h;
                int hashCode = str.hashCode();
                if (hashCode != 372813122) {
                    if (hashCode == 539976355 && str.equals("com.google.android.gms.security.snet.ACTION_IDLE_MODE")) {
                        c = 0;
                        if (c != 0) {
                            if (c == 1) {
                                if (cgkt.m145941m() && cgkt.m145935g()) {
                                    aqfs.m71511b(context, a);
                                }
                            }
                        } else if (cgkt.m145951w()) {
                            aqfs.m71508a(context, a);
                            if (cgkt.m145946r()) {
                                m92433a(context, a);
                            }
                        } else {
                            m92433a(context, a);
                        }
                        SnetWatchdogChimeraIntentService.m92441a(context, this.f107581h);
                    }
                } else if (str.equals("com.google.android.gms.security.snet.ACTION_EVENT_LOG_COLLECTOR")) {
                    c = 1;
                    if (c != 0) {
                    }
                    SnetWatchdogChimeraIntentService.m92441a(context, this.f107581h);
                }
                if (c != 0) {
                }
                try {
                    SnetWatchdogChimeraIntentService.m92441a(context, this.f107581h);
                } catch (RuntimeException e) {
                }
            } else {
                try {
                    SnetWatchdogChimeraIntentService.m92441a(context, (String) null);
                } catch (RuntimeException e2) {
                }
            }
        } catch (Throwable th) {
            try {
                SnetWatchdogChimeraIntentService.m92441a(context, this.f107581h);
            } catch (RuntimeException e3) {
            }
            throw th;
        }
    }
}
