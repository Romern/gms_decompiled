package p000;

import android.app.KeyguardManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.provider.Settings;
import com.felicanetworks.mfc.C0126R;
import com.google.android.cast.JGCastService;
import com.google.android.gms.trustlet.onbody.discovery.OnbodyScreenLockNotificationsManager$AccountChangedReceiver;
import java.lang.ref.WeakReference;

/* renamed from: auve */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auve {

    /* renamed from: a */
    public static final aunx f92589a = new aunx("TrustAgent", "OnbodyScreenLockNotificationsManager");

    /* renamed from: c */
    private static WeakReference f92590c = new WeakReference(null);

    /* renamed from: b */
    public final SharedPreferences f92591b;

    /* renamed from: d */
    private final bmzi f92592d = bmzn.m108681a(auvb.f92578a);

    /* renamed from: e */
    private final Context f92593e;

    /* renamed from: f */
    private final Object f92594f;

    public auve() {
        rpr b = rpr.m34216b();
        this.f92593e = b;
        this.f92591b = aupo.m77578a(b);
        this.f92594f = new Object();
    }

    /* renamed from: a */
    public static synchronized auve m77923a() {
        auve auve;
        synchronized (auve.class) {
            if (f92590c.get() == null) {
                auve auve2 = new auve();
                OnbodyScreenLockNotificationsManager$AccountChangedReceiver onbodyScreenLockNotificationsManager$AccountChangedReceiver = new OnbodyScreenLockNotificationsManager$AccountChangedReceiver();
                IntentFilter intentFilter = new IntentFilter("com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE");
                intentFilter.addCategory("com.google.android.gms.auth.category.ACCOUNT_ADDED");
                auve2.f92593e.registerReceiver(onbodyScreenLockNotificationsManager$AccountChangedReceiver, intentFilter);
                f92590c = new WeakReference(auve2);
            }
            auve = (auve) f92590c.get();
        }
        return auve;
    }

    /* renamed from: b */
    public final void mo50967b() {
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        if (currentTimeMillis - this.f92591b.getLong("last_account_add_seconds", currentTimeMillis) > chac.f188164a.mo6606a().mo84845a() / 1000) {
            if (!aupi.m77556a((KeyguardManager) this.f92593e.getSystemService("keyguard")) && Settings.Global.getInt(this.f92593e.getContentResolver(), "device_provisioned", 0) != 0) {
                if (!this.f92591b.contains("promotion_status_for_2")) {
                    this.f92591b.edit().putInt("promotion_status_for_2", 2).commit();
                }
                if (chac.f188164a.mo6606a().mo84849e()) {
                    mo50966a(bogq.ONBODY_ON_ADD_ACCOUNT, "com.google.android.gms.trustagent.discovery.OnbodyScreenLockNotificationsManager$addaccount", C0126R.string.auth_trust_agent_account_added_promotion_notification_title, C0126R.string.auth_trust_agent_account_added_promotion_notification_desc);
                }
            }
            this.f92591b.edit().remove("last_account_add_seconds").apply();
        }
    }

    /* renamed from: a */
    public final void mo50966a(bogq bogq, String str, int i, int i2) {
        if (((Boolean) this.f92592d.mo6606a()).booleanValue()) {
            bqga.m112781a(auwo.m77989b(this.f92593e), new auvc(this, bogq, str, i, i2), bqfb.INSTANCE);
        } else {
            bqga.m112781a(auwo.m77983a(this.f92593e), new auvd(this, bogq, str, i, i2), bqfb.INSTANCE);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo50968b(bogq bogq, String str, int i, int i2) {
        synchronized (this.f92594f) {
            if (auwo.m77988a(this.f92593e, bogq)) {
                f92589a.mo50711a("Notification shown before, abort showing again.", new Object[0]);
                return;
            }
            String str2 = "promotion_status_for_";
            if (bogq == bogq.ONBODY_ON_ADD_ACCOUNT) {
                StringBuilder sb = new StringBuilder(22);
                sb.append(str2);
                sb.append(2);
                str2 = sb.toString();
            } else if (bogq == bogq.ONBODY_ON_DISABLE_SCREEN_LOCK) {
                StringBuilder sb2 = new StringBuilder(22);
                sb2.append(str2);
                sb2.append(3);
                str2 = sb2.toString();
            }
            f92589a.mo50711a("Show notification to promote Screen Lock and SmartLock.", new Object[0]);
            String string = this.f92593e.getString(i);
            String string2 = this.f92593e.getString(i2);
            int a = aupf.m77548a();
            PendingIntent a2 = aupf.m77549a(this.f92593e, bogq, a);
            Intent intent = new Intent();
            intent.setClassName(this.f92593e, "com.google.android.gms.trustagent.discovery.PromoteScreenLockAndOnbodyActivity");
            intent.putExtra("extra_from_intent", str);
            PendingIntent activity = PendingIntent.getActivity(this.f92593e, 0, intent, JGCastService.FLAG_PRIVATE_DISPLAY);
            aupf aupf = new aupf(this.f92593e);
            aupf.f92248a = string;
            aupf.f92250c = string2;
            aupf.f92251d = activity;
            aupf.f92252e = a2;
            aupf.f92264q = a;
            aupf.f92253f = bogq;
            if (aupf.mo50787b()) {
                this.f92591b.edit().putInt(str2, 3).apply();
                auwo.m77990b(this.f92593e, bogq);
                bogj bogj = (bogj) bohi.f133070z.mo74144da();
                bxvd da = bogm.f133003e.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bogm bogm = (bogm) da.f164949b;
                bogm.f133006b = bogq.f133019h;
                int i3 = bogm.f133005a | 1;
                bogm.f133005a = i3;
                bogm.f133007c = 0;
                bogm.f133005a = i3 | 2;
                bogj.mo68908a((bogm) da.mo74062i());
                aupk.m77567a(this.f92593e, (bohi) bogj.mo74062i());
            }
        }
    }
}
