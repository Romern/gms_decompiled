package p000;

import android.app.usage.UsageStatsManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.UserHandle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.gcm.DataMessageManager$2;
import com.google.android.gms.gcm.DataMessageManager$BroadcastDoneReceiver;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* renamed from: aajt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aajt {

    /* renamed from: a */
    public final Context f28298a;

    /* renamed from: b */
    public final ExecutorService f28299b;

    /* renamed from: c */
    public final aamg f28300c;

    /* renamed from: d */
    public final aank f28301d;

    /* renamed from: e */
    public final aamc f28302e;

    /* renamed from: f */
    public final aaqx f28303f;

    /* renamed from: g */
    public final aaqs f28304g;

    /* renamed from: h */
    public final aamn f28305h;

    /* renamed from: i */
    public final aamr f28306i;

    /* renamed from: j */
    public final aalx f28307j;

    /* renamed from: k */
    public final aaml f28308k;

    /* renamed from: l */
    public final qxq f28309l;

    /* renamed from: m */
    public final BroadcastReceiver f28310m;

    /* renamed from: n */
    public final aamf f28311n;

    /* renamed from: o */
    public final aaod f28312o;

    /* renamed from: p */
    public aand f28313p;

    /* renamed from: q */
    public List f28314q = null;

    /* renamed from: r */
    public final aakv f28315r = new aakv();

    /* renamed from: s */
    private final Object f28316s = new Object();

    /* renamed from: t */
    private final Handler f28317t = new adzt(Looper.getMainLooper());

    /* renamed from: u */
    private final asfb f28318u;

    public aajt(Context context, ExecutorService executorService, aamg aamg, aank aank, aamc aamc, aaqx aaqx, aaqs aaqs, aalt aalt, aamn aamn, aamr aamr, aalx aalx, aaml aaml, qxq qxq, aamf aamf, aaod aaod) {
        DataMessageManager$2 dataMessageManager$2;
        aamg aamg2 = aamg;
        this.f28298a = context;
        this.f28299b = executorService;
        this.f28300c = aamg2;
        this.f28301d = aank;
        this.f28302e = aamc;
        this.f28303f = aaqx;
        this.f28304g = aaqs;
        this.f28305h = aamn;
        this.f28306i = aamr;
        this.f28307j = aalx;
        asfb asfb = new asfb(context, 1, "GOOGLE_C2DM", null, "com.google.android.gms");
        this.f28318u = asfb;
        asfb.mo49115a(true);
        this.f28308k = aaml;
        this.f28309l = qxq;
        if (aamg2 != null) {
            dataMessageManager$2 = new DataMessageManager$2(this, "gcm");
        } else {
            dataMessageManager$2 = null;
        }
        this.f28310m = dataMessageManager$2;
        this.f28311n = aamf;
        this.f28312o = aaod;
        this.f28314q = Arrays.asList(cecz.f182285a.mo6606a().mo78840h().split(","));
        aalt.mo16978a(2, new aajh(this));
        if (aakb.m21382b()) {
            return;
        }
        if (cecz.f182285a.mo6606a().mo78837e()) {
            mo16911a(0, (String) null);
            executorService.execute(new aaji(this));
            return;
        }
        mo16917c();
    }

    /* renamed from: a */
    public static final String m21354a(int i) {
        return i != 5 ? i != 10 ? i != 17 ? "UNKNOWN" : "REDUCED" : "HIGH" : "NORMAL";
    }

    /* renamed from: d */
    public static boolean m21357d() {
        return cecn.m136009c() == 1;
    }

    /* renamed from: e */
    public static boolean m21358e() {
        int c = (int) cecn.m136009c();
        return c == 1 || c == 2;
    }

    /* renamed from: b */
    public final String mo16915b() {
        return !aytw.m84813a(this.f28298a) ? "com.google.android.c2dm.intent.RECEIVE" : "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT";
    }

    /* renamed from: c */
    public final void mo16917c() {
        this.f28306i.mo17049a(this.f28298a, this);
    }

    /* renamed from: a */
    public static void m21355a(aajs aajs) {
        if (!cecz.f182285a.mo6606a().mo78845m()) {
            aajs.mo16903a();
            return;
        }
        adyw a = adyv.m51453a();
        try {
            aajs.mo16903a().mo50378a(aajn.f28291a, new aajo(a));
        } catch (Exception e) {
            a.close();
            throw e;
        }
    }

    /* renamed from: b */
    public final void mo16916b(blmp blmp) {
        m21355a(new aajl(this, blmp));
    }

    /* renamed from: a */
    public static void m21356a(blmo blmo, String str, String str2) {
        if (str2 != null) {
            bxvd da = blmi.f126842d.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blmi blmi = (blmi) da.f164949b;
            str.getClass();
            int i = blmi.f126844a | 1;
            blmi.f126844a = i;
            blmi.f126845b = str;
            str2.getClass();
            blmi.f126844a = i | 2;
            blmi.f126846c = str2;
            blmo.mo66684a(da);
        }
    }

    /* renamed from: a */
    public final aucb mo16908a(Intent intent, blmp blmp, aaob aaob) {
        int i = aaob.f28674c.f28458b;
        if (cecz.f182285a.mo6606a().mo78808a()) {
            intent.addFlags(32);
        }
        DataMessageManager$BroadcastDoneReceiver dataMessageManager$BroadcastDoneReceiver = new DataMessageManager$BroadcastDoneReceiver(this, intent, blmp, SystemClock.elapsedRealtime());
        String concat = (!aaob.mo17170b() || aaob.f28671a.contains(aaob.f28673b)) ? null : String.valueOf(aaob.f28673b).concat(".permission.C2D_MESSAGE");
        bxwc bxwc = blmp.f126872g;
        int size = bxwc.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            blmi blmi = (blmi) bxwc.get(i2);
            String str = blmi.f126845b;
            String str2 = blmi.f126846c;
            i2++;
            if (str.equals("google.aia")) {
                if ("1".equals(str2) || Boolean.valueOf(str2).booleanValue()) {
                    return aucu.m76778a((Object) null);
                }
            }
        }
        this.f28317t.postDelayed(new aajr(dataMessageManager$BroadcastDoneReceiver), 5000);
        mo16911a(i, intent.getPackage());
        int i3 = blmp.f126882q;
        if (i3 == 10 || (i3 == 17 && cecz.f182285a.mo6606a().mo78833ay())) {
            intent.addFlags(268435456);
            int i4 = Build.VERSION.SDK_INT;
            if (cecq.m136016b() > 0) {
                aamh a = aamh.m21513a(intent.getPackage(), i);
                if (a.f28457a != null) {
                    Context context = this.f28298a;
                    long b = cecq.m136016b();
                    aajg.m21339a();
                    int i5 = Build.VERSION.SDK_INT;
                    UserHandle userHandle = (UserHandle) aajg.m21342c(a.f28458b);
                    if (userHandle == null) {
                        int i6 = a.f28458b;
                        StringBuilder sb = new StringBuilder(51);
                        sb.append("Failed to convert user serial ");
                        sb.append(i6);
                        sb.append(" to handle");
                        Log.e("GCM", sb.toString());
                    } else if (cecz.m136074v()) {
                        try {
                            aajg.f28261d.invoke(aajg.f28260c, a.f28457a, Long.valueOf(b), userHandle);
                        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
                        }
                    } else {
                        try {
                            ((UsageStatsManager) context.getSystemService(UsageStatsManager.class)).whitelistAppTemporarily(a.f28457a, b, userHandle);
                        } catch (IllegalArgumentException | SecurityException e2) {
                            String valueOf = String.valueOf(e2);
                            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 43);
                            sb2.append("Error whitelisting app for waking in doze: ");
                            sb2.append(valueOf);
                            Log.w("GCM", sb2.toString());
                        }
                    }
                }
            }
        }
        if (i <= 0) {
            this.f28298a.sendOrderedBroadcast(intent, concat, dataMessageManager$BroadcastDoneReceiver, this.f28317t, 0, null, null);
        } else {
            if (!aajg.m21345d(i)) {
                StringBuilder sb3 = new StringBuilder(54);
                sb3.append("Attempting to send message to stopped user ");
                sb3.append(i);
                Log.w("GCM", sb3.toString());
            }
            aajg.m21336a(this.f28298a, i, intent, null, dataMessageManager$BroadcastDoneReceiver, this.f28317t);
        }
        return dataMessageManager$BroadcastDoneReceiver.f32769a.f91388a;
    }

    /* renamed from: a */
    public final aucb mo16909a(blmp blmp, long j, boolean z) {
        Integer num;
        aaob a = aaob.m21739a(blmp);
        String str = null;
        if (!TextUtils.isEmpty(a.f28673b)) {
            Intent intent = new Intent(mo16915b());
            if (a.mo17170b()) {
                str = a.f28673b;
            } else if (a.mo17171c()) {
                str = "com.google.android.gsf.subscribedfeeds";
            }
            if (str != null) {
                intent.addCategory(str);
            }
            int i = Build.VERSION.SDK_INT;
            intent.setPackage(a.mo17169a());
            intent.putExtras(aaoc.m21743a(blmp));
            aucb a2 = mo16908a(intent, blmp, a);
            if (!z) {
                aamn aamn = this.f28305h;
                if (aamn.f28469a && ((blmp.f126866a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT) == 0 || blmp.f126877l != 0)) {
                    aamh a3 = aamh.m21512a(blmp);
                    String str2 = blmp.f126873h;
                    if (!TextUtils.isEmpty(a3.f28457a) && !TextUtils.isEmpty(str2)) {
                        aamk aamk = aamn.f28471c;
                        synchronized (aamk) {
                            num = (Integer) aamk.f28464b.get(a3);
                        }
                        if (num != null) {
                            try {
                                if (aamk.m21520d(a3) == num.intValue()) {
                                    aamn.f28472d.mo17050a(blmp, j);
                                    aamn.mo17037a();
                                }
                            } catch (PackageManager.NameNotFoundException e) {
                            }
                        }
                    }
                }
            }
            for (blmp blmp2 : this.f28315r.mo16950a()) {
                aamh a4 = aamh.m21512a(blmp2);
                if (a4.f28457a != null) {
                    if (this.f28304g.mo17191b(a4)) {
                        String valueOf = String.valueOf(a4);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30);
                        sb.append("Retrying expired message for: ");
                        sb.append(valueOf);
                        Log.w("GCM", sb.toString());
                        this.f28317t.post(new aajp(this, blmp2));
                    } else {
                        String valueOf2 = String.valueOf(a4);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 38);
                        sb2.append("Unregistering due to expired message: ");
                        sb2.append(valueOf2);
                        Log.w("GCM", sb2.toString());
                        mo16912a(a4);
                        this.f28304g.mo17190a(a4);
                    }
                }
            }
            return a2;
        }
        Log.e("GCM", "processPackage: received msg w/o category, dropping");
        return aucu.m76778a((Object) null);
    }

    /* renamed from: a */
    public final void mo16910a() {
        synchronized (this.f28316s) {
            this.f28318u.mo49120c();
        }
    }

    /* renamed from: a */
    public final void mo16911a(int i, String str) {
        if (str == null) {
            str = "com.google.android.gms";
        }
        synchronized (this.f28316s) {
            this.f28318u.mo49121c(stx.m36335a(this.f28311n.mo17012b(i), str));
            this.f28318u.mo49117b();
        }
    }

    /* renamed from: a */
    public final void mo16912a(aamh aamh) {
        if (aamh.f28457a == null) {
            return;
        }
        if (!ceck.m135993c() || !aytw.m84813a(this.f28298a)) {
            String valueOf = String.valueOf(aamh);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
            sb.append("Unregister application ");
            sb.append(valueOf);
            Log.w("GCM", sb.toString());
            this.f28303f.mo17196a(new aajq(this, aamh));
        }
    }

    /* renamed from: a */
    public final void mo16913a(blmp blmp) {
        m21355a(new aajk(this, blmp));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo16914a(blmp blmp, String str) {
        Intent intent = new Intent(mo16915b());
        intent.setPackage(blmp.f126870e);
        intent.putExtra("error", str);
        intent.putExtra("message_type", "send_error");
        if ((blmp.f126866a & 2) != 0) {
            intent.putExtra("google.message_id", blmp.f126867b);
        }
        mo16908a(intent, blmp, aaob.m21739a(blmp));
    }
}
