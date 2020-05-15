package com.google.android.gms.trustagent;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.PowerManager;
import android.os.RemoteException;
import com.google.android.chimera.TrustAgentService;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.android.gms.trustagent.trustlet.device.bluetooth.internal.BluetoothTrustletChimeraService;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GoogleTrustAgentChimeraService extends TrustAgentService {

    /* renamed from: a */
    public static final aunx f109110a = new aunx("TrustAgent", "GoogleTrustAgentChimeraService");

    /* renamed from: b */
    public aurl f109111b;

    /* renamed from: c */
    public SharedPreferences f109112c;

    /* renamed from: d */
    private final auoz f109113d = new aukl(this);

    /* renamed from: e */
    private final aulj f109114e = aulj.m77263a();

    /* renamed from: f */
    private final Context f109115f = rpr.m34216b();

    /* renamed from: g */
    private BroadcastReceiver f109116g;

    /* renamed from: h */
    private boolean f109117h;

    /* renamed from: a */
    public static boolean m93395a(Map map, Intent intent, String str, String str2) {
        if (!map.containsKey(str)) {
            return false;
        }
        intent.putExtra("type", str2);
        intent.putExtra("name", (String) map.get(str));
        return true;
    }

    public final boolean onConfigure(List list) {
        int i;
        f109110a.mo50711a("onConfigure(\"%s\")", list).mo50707b();
        aupq a = aupq.m77579a();
        boolean z = a.f92276b;
        boolean z2 = a.f92275a;
        boolean z3 = a.f92277c;
        boolean z4 = a.f92278d;
        boolean z5 = a.f92279e;
        boolean z6 = a.f92280f;
        boolean z7 = a.f92281g;
        HashSet hashSet = new HashSet(a.f92282h);
        int i2 = a.f92283i;
        a.mo50792b();
        if (!(z == a.f92276b && z2 == a.f92275a && z3 == a.f92277c && z4 == a.f92278d && z5 == a.f92279e && z6 == a.f92280f && z7 == a.f92281g && hashSet.equals(a.f92282h) && i2 == a.f92283i)) {
            aurl aurl = this.f109111b;
            synchronized (aurl.f92336e) {
                if (aurl.f92343l.mo50792b()) {
                    i = aurl.f92343l.f92283i;
                } else {
                    i = 240;
                }
                aurh aurh = aurl.f92344m;
                aunx aunx = aurh.f92308a;
                StringBuilder sb = new StringBuilder(34);
                sb.append("updateIdelThreshold to ");
                sb.append(i);
                aunx.mo50711a(sb.toString(), new Object[0]).mo50708c();
                aurh.f92315h = i;
            }
            aurl.mo50834b();
            aurl.mo50830a("Device Policy changed");
            aurl.mo50838c("device_policy_changed");
            Iterator it = aurl.f92340i.iterator();
            while (it.hasNext()) {
                try {
                    ((auri) it.next()).f92322e.mo50808h();
                } catch (RemoteException e) {
                    auri.f92318a.mo50710a("RemoteException", e, new Object[0]).mo50706a();
                }
            }
        }
        return true;
    }

    public final void onCreate() {
        int i;
        f109110a.mo50711a("onCreate()", new Object[0]);
        super.onCreate();
        auro auro = new auro(this);
        bnre i2 = auro.f92369a.listIterator();
        while (i2.hasNext()) {
            aurn aurn = (aurn) i2.next();
            aurm aurm = new aurm(auro.f92371c, new aurq(), aurn.f92366a, aurn.f92367b, aurn.f92368c);
            synchronized (auro.f92370b) {
                auro.f92372d.add(aurm);
            }
        }
        aurl a = aurl.m77712a();
        this.f109111b = a;
        synchronized (a.f92336e) {
            a.f92349r = auro;
            boolean b = a.f92343l.mo50792b();
            if (a.f92344m == null) {
                a.f92344m = new aurh(a.f92337f, a);
            }
            if (b) {
                i = a.f92343l.f92283i;
            } else {
                i = 240;
            }
            aurh aurh = a.f92344m;
            aurh.f92315h = i;
            IntentFilter intentFilter = new IntentFilter(aurh.f92309b);
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            aurh.f92312e.registerReceiver(aurh.f92317j, intentFilter);
            if (!((PowerManager) aurh.f92312e.getSystemService("power")).isInteractive()) {
                aurh.mo50820a();
            }
            a.mo50829a(a.f92342k);
            aurj aurj = a.f92342k;
            synchronized (aurj.f92324a) {
                aurj.f92325b = true;
                aurj.mo50824a("is_trustagent_on", true);
            }
            a.mo50829a(new aurk(a));
        }
        IntentFilter intentFilter2 = new IntentFilter("com.google.gservices.intent.action.GSERVICES_CHANGED");
        intentFilter2.addAction("android.intent.action.USER_PRESENT");
        synchronized (a.f92336e) {
            a.f92337f.getApplicationContext().registerReceiver(a.f92338g, intentFilter2);
        }
        this.f109111b.mo50829a(this.f109113d);
        auro.mo50846a();
        aurl aurl = this.f109111b;
        aurl.mo50830a("finish TrustletRegistration");
        aurl.mo50838c("finished_trustlet_factory_registration");
        aulj aulj = this.f109114e;
        synchronized (aulj.f92037c) {
            aulj.f92036b = false;
        }
        this.f109112c = aupo.m77578a(this.f109115f);
        if (this.f109116g != null) {
            f109110a.mo50711a("Registering broadcast receiver more than once.", new Object[0]).mo50709d();
            return;
        }
        IntentFilter intentFilter3 = new IntentFilter();
        intentFilter3.addAction("android.intent.action.USER_PRESENT");
        intentFilter3.addAction("android.intent.action.USER_BACKGROUND");
        C16691 r1 = new aacn("trustagent") {
            /* class com.google.android.gms.trustagent.GoogleTrustAgentChimeraService.C16691 */

            /* renamed from: a */
            public final void mo6253a(Context context, Intent intent) {
                Map map;
                boolean a;
                String action = intent.getAction();
                if ("android.intent.action.USER_PRESENT".equals(action)) {
                    KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
                    GoogleTrustAgentChimeraService googleTrustAgentChimeraService = GoogleTrustAgentChimeraService.this;
                    aunx aunx = GoogleTrustAgentChimeraService.f109110a;
                    if (!googleTrustAgentChimeraService.f109112c.getBoolean("auth_trust_agent_pref_first_notification_shown_", false) && GoogleTrustAgentChimeraService.this.f109111b.mo50840e() && keyguardManager.isKeyguardSecure()) {
                        Intent intent2 = new Intent();
                        intent2.setClassName(context, "com.google.android.gms.trustagent.GoogleTrustAgentFirstNotificationActivity");
                        intent2.setFlags(335544320);
                        aurl aurl = GoogleTrustAgentChimeraService.this.f109111b;
                        synchronized (aurl.f92336e) {
                            map = aurl.f92341j;
                        }
                        if (GoogleTrustAgentChimeraService.m93395a(map, intent2, "PhonePosition", "PhonePosition") || (GoogleTrustAgentChimeraService.m93395a(map, intent2, "Bluetooth", BluetoothTrustletChimeraService.class.getName()) | GoogleTrustAgentChimeraService.m93395a(map, intent2, "Place", "Place"))) {
                            context.startActivity(intent2);
                            GoogleTrustAgentChimeraService.this.f109112c.edit().putBoolean("auth_trust_agent_pref_first_notification_shown_", true).apply();
                        }
                    }
                } else if ("android.intent.action.USER_BACKGROUND".equals(action)) {
                    GoogleTrustAgentChimeraService.f109110a.mo50711a("User switched (ACTION_USER_BACKGROUND)", new Object[0]).mo50708c();
                    aurl aurl2 = GoogleTrustAgentChimeraService.this.f109111b;
                    synchronized (aurl2.f92336e) {
                        if (!aurl2.f92347p) {
                            aunw a2 = aurl.f92332a.mo50711a("Revoking trust and requiring user authentication.", new Object[0]);
                            a2.mo50708c();
                            a2.mo50707b();
                            aurl2.f92347p = true;
                            aurl2.mo50830a("Revoking trust and requiring user authentication.");
                            aurl2.mo50837c();
                            aurl2.mo50839d();
                        }
                    }
                    aurl2.mo50838c("switch_to_a_different_user");
                }
            }
        };
        this.f109116g = r1;
        this.f109115f.registerReceiver(r1, intentFilter3);
    }

    public final void onDestroy() {
        f109110a.mo50711a("onDestroy()", new Object[0]);
        this.f109111b.mo50835b(this.f109113d);
        aurl aurl = this.f109111b;
        aurl.mo50834b();
        synchronized (aurl.f92336e) {
            aurh aurh = aurl.f92344m;
            aurh.f92312e.unregisterReceiver(aurh.f92317j);
            aurl.mo50835b(aurl.f92342k);
            aurj aurj = aurl.f92342k;
            synchronized (aurj.f92324a) {
                aurj.f92325b = false;
                aurj.mo50824a("is_trustagent_on", false);
            }
        }
        synchronized (aurl.f92336e) {
            aurl.f92337f.getApplicationContext().unregisterReceiver(aurl.f92338g);
        }
        aurl.mo50838c("trustAgent_is_off");
        synchronized (aurl.f92333b) {
            aurl.f92335d = new WeakReference(null);
        }
        aulj aulj = this.f109114e;
        synchronized (aulj.f92037c) {
            aulj.f92036b = true;
        }
        BroadcastReceiver broadcastReceiver = this.f109116g;
        if (broadcastReceiver == null) {
            f109110a.mo50711a("Attempting to unregister broadcast receiver when none is registered.", new Object[0]).mo50709d();
        } else {
            this.f109115f.unregisterReceiver(broadcastReceiver);
            this.f109116g = null;
        }
        super.onDestroy();
    }

    public final void onDeviceUnlockLockout(long j) {
        f109110a.mo50711a("onDeviceUnlockLockout, timeoutMs: %s", Long.valueOf(j));
        this.f109117h = true;
        Iterator it = this.f109111b.f92340i.iterator();
        while (it.hasNext()) {
            try {
                ((auri) it.next()).f92322e.mo50798a(j);
            } catch (RemoteException e) {
                auri.f92318a.mo50710a("RemoteException", e, new Object[0]).mo50706a();
            }
        }
    }

    public final void onDeviceUnlocked() {
        f109110a.mo50711a("onDeviceUnlocked", new Object[0]);
        if (this.f109117h) {
            this.f109117h = false;
            aurl aurl = this.f109111b;
            aurl.mo50834b();
            aurl.mo50830a("Device unlocked after lockout");
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.chimera.TrustAgentService.grantTrust(java.lang.CharSequence, long, boolean):void
     arg types: [java.lang.String, int, int]
     candidates:
      com.google.android.chimera.TrustAgentService.grantTrust(java.lang.CharSequence, long, int):void
      com.google.android.chimera.TrustAgentService.grantTrust(java.lang.CharSequence, long, boolean):void */
    public final void onTrustTimeout() {
        f109110a.mo50711a("onTrustTimeout()", new Object[0]).mo50707b();
        if (this.f109111b.mo50840e()) {
            f109110a.mo50711a("Trust granted again", new Object[0]).mo50708c();
            grantTrust((CharSequence) "onTrustTimeout() grants trust again", 0L, false);
            return;
        }
        f109110a.mo50711a("Trust not reviewed", new Object[0]).mo50708c();
    }

    public final boolean onUnbind(Intent intent) {
        if (chao.f188205a.mo6606a().mo84882a()) {
            aurl aurl = this.f109111b;
            synchronized (aurl.f92336e) {
                aurl.f92345n = false;
            }
            f109110a.mo50711a("onUnbind() set internal trust state to false", new Object[0]).mo50708c();
        }
        return super.onUnbind(intent);
    }

    public final void onUnlockAttempt(boolean z) {
        f109110a.mo50711a("onUnlockAttempt(%b)", Boolean.valueOf(z)).mo50707b();
        bogj bogj = (bogj) bohi.f133070z.mo74144da();
        boolean isKeyguardSecure = ((KeyguardManager) this.f109115f.getSystemService("keyguard")).isKeyguardSecure();
        if (bogj.f164950c) {
            bogj.mo74035c();
            bogj.f164950c = false;
        }
        bohi bohi = (bohi) bogj.f164949b;
        int i = bohi.f133071a | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        bohi.f133071a = i;
        bohi.f133079i = isKeyguardSecure;
        if (!z) {
            bohi.f133088r = 2;
            bohi.f133071a = i | 4096;
        } else {
            bohi.f133088r = 1;
            bohi.f133071a = i | 4096;
        }
        aupk.m77567a(this.f109115f, (bohi) bogj.mo74062i());
        aulj aulj = this.f109114e;
        if (z) {
            aulj.mo50655b();
        }
    }
}
