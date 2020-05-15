package p000;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.nearby.discovery.service.DiscoveryChimeraService;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: aidb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aidb {

    /* renamed from: a */
    public boolean f68780a = true;

    /* renamed from: b */
    private final Context f68781b;

    /* renamed from: c */
    private final ahgp f68782c;

    /* renamed from: d */
    private final Map f68783d;

    /* renamed from: e */
    private final burl f68784e;

    /* renamed from: f */
    private final sqv f68785f;

    /* renamed from: g */
    private final ahst f68786g;

    /* renamed from: h */
    private final ahsi f68787h;

    public aidb(Context context) {
        this.f68781b = context;
        this.f68783d = new HashMap();
        this.f68782c = (ahgp) ahgz.m55754a(context, ahgp.class);
        this.f68784e = (burl) ahgz.m55754a(context, burl.class);
        this.f68785f = (sqv) ahgz.m55754a(context, sqv.class);
        this.f68786g = (ahst) ahgz.m55754a(context, ahst.class);
        this.f68787h = (ahsi) ahgz.m55754a(context, ahsi.class);
        if (aidc.m57026a()) {
            m57019c();
        }
    }

    /* renamed from: a */
    private final NotificationChannel m57015a(String str, String str2, int i, String str3) {
        NotificationChannel notificationChannel = new NotificationChannel(str, str2, i);
        notificationChannel.setGroup(str3);
        if (i >= 4) {
            notificationChannel.setSound(aicx.m57008a(this.f68781b), Notification.AUDIO_ATTRIBUTES_DEFAULT);
            notificationChannel.enableVibration(false);
        }
        return notificationChannel;
    }

    /* renamed from: b */
    private static String m57018b(String str) {
        return str == null ? "" : str;
    }

    /* renamed from: c */
    private final void m57019c() {
        this.f68782c.mo36452a(new NotificationChannelGroup("NEARBY_CHANNEL_GROUP_ID", this.f68781b.getString(C0126R.string.common_nearby_title)));
        this.f68782c.mo36452a(new NotificationChannelGroup("DEVICES_CHANNEL_GROUP_ID", this.f68781b.getResources().getString(C0126R.string.common_devices)));
        this.f68782c.mo36451a(m57015a("DEVICES_WITHIN_REACH_REBRANDED", this.f68781b.getResources().getString(C0126R.string.devices_within_reach_channel_name), 4, "DEVICES_CHANNEL_GROUP_ID"));
        this.f68782c.mo36451a(m57015a("DEVICES_REBRANDED", this.f68781b.getResources().getString(C0126R.string.common_devices), 2, "DEVICES_CHANNEL_GROUP_ID"));
        this.f68782c.mo36451a(m57015a("DEVICES_WITH_YOUR_ACCOUNT", this.f68781b.getResources().getString(C0126R.string.devices_with_your_account_channel_name), 1, "DEVICES_CHANNEL_GROUP_ID"));
    }

    /* renamed from: a */
    public final void mo37429a() {
        this.f68780a = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized void mo37432b() {
        if (this.f68782c.mo36447a("DEVICES_WITH_YOUR_ACCOUNT") == null || this.f68782c.mo36447a("DEVICES_REBRANDED") == null || this.f68782c.mo36447a("DEVICES_WITHIN_REACH_REBRANDED") == null) {
            m57019c();
        }
    }

    /* renamed from: a */
    private final PendingIntent m57016a(Intent intent, int i) {
        return PendingIntent.getService(this.f68781b, i, intent, 134217728);
    }

    /* renamed from: a */
    private final void m57017a(bvin bvin, aicz aicz) {
        int a = aidc.m57025a(aicz.f68772o);
        boolean z = aicz.f68765h;
        this.f68787h.mo37013a(bvin, this.f68786g.mo37052e(aicz.f68759b), Integer.valueOf(a));
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0056  */
    /* renamed from: a */
    public final String mo37428a(String str, Context context) {
        char c;
        if (!aidc.m57026a()) {
            return str;
        }
        ((aidb) ahgz.m55754a(context, aidb.class)).mo37432b();
        int hashCode = str.hashCode();
        if (hashCode != -1724415528) {
            if (hashCode != -618582347) {
                if (hashCode == -292229199 && str.equals("DEVICES_REBRANDED")) {
                    c = 1;
                    if (c != 0) {
                        return !aidc.m57027a(context, str) ? mo37428a("DEVICES_REBRANDED", context) : str;
                    }
                    if ((c == 1 || c == 2) && aidc.m57027a(context, str)) {
                        return str;
                    }
                    return null;
                }
            } else if (str.equals("DEVICES_WITHIN_REACH_REBRANDED")) {
                c = 0;
                if (c != 0) {
                }
            }
        } else if (str.equals("DEVICES_WITH_YOUR_ACCOUNT")) {
            c = 2;
            if (c != 0) {
            }
        }
        c = 65535;
        if (c != 0) {
        }
    }

    /* renamed from: a */
    public final void mo37430a(String str) {
        this.f68782c.mo36449a(str.hashCode());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007e, code lost:
        return;
     */
    /* renamed from: a */
    public final synchronized void mo37431a(List list) {
        synchronized (this) {
            if (this.f68780a) {
                long a = this.f68785f.mo20505a();
                HashMap hashMap = new HashMap(list.size());
                C1225nr<aicz> nrVar = new C1225nr();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    aicz aicz = (aicz) it.next();
                    hashMap.put(aicz.f68758a, new aida(a, aicz));
                    aida aida = (aida) this.f68783d.get(aicz.f68758a);
                    if (aida == null || !aicz.equals(aida.f68779b)) {
                        nrVar.add(aicz);
                    }
                }
                C1225nr<String> nrVar2 = new C1225nr(this.f68783d.keySet());
                nrVar2.removeAll(hashMap.keySet());
                if (nrVar.isEmpty()) {
                    if (nrVar2.isEmpty()) {
                        ((bnsl) ahsd.f67925a.mo68390d()).mo68409a("Show notifications: %d total, no changes since last shown, no-op.", list.size());
                    }
                }
                int i = Build.VERSION.SDK_INT;
                ((bnsl) ahsd.f67925a.mo68390d()).mo68425a("Show notifications: %d total, showing %d new or changed, removing %d old", Integer.valueOf(list.size()), Integer.valueOf(nrVar.f26758b), Integer.valueOf(nrVar2.f26758b));
                C1225nr<String> nrVar3 = new C1225nr(hashMap.keySet());
                nrVar3.removeAll(this.f68783d.keySet());
                for (String str : nrVar3) {
                    aicz aicz2 = ((aida) hashMap.get(str)).f68779b;
                    int i2 = aicz2.f68771n;
                    m57017a(bvin.NOTIFICATION_TRIGGERED, aicz2);
                }
                aicw aicw = (aicw) ahgz.m55754a(this.f68781b, aicw.class);
                for (aicz aicz3 : nrVar) {
                    aicx ahvk = aicz3.f68774q ? new ahvk(this.f68781b, aicz3.f68775r) : new aicx(this.f68781b);
                    ahvk.mo37420a(aicz3.f68772o);
                    String b = m57018b(aicz3.f68760c);
                    String b2 = m57018b(aicz3.f68761d);
                    StringBuilder sb = new StringBuilder(b.length() + 2 + b2.length());
                    sb.append(b);
                    sb.append(": ");
                    sb.append(b2);
                    ahvk.mo37421b(sb.toString());
                    ahvk.mo37422d(aicz3.f68773p);
                    ahvk.f22269u = "recommendation";
                    ahvk.f22271w = C1133kh.m17843b(this.f68781b, C0126R.color.discovery_activity_accent);
                    ahvk.mo13640e(m57018b(aicz3.f68760c));
                    ahvk.mo13632b((CharSequence) m57018b(aicz3.f68761d));
                    ahvk.mo13630b(aicz3.f68763f);
                    ahvk.f22266r = null;
                    boolean z = aicz3.f68765h;
                    ahvk.f22267s = false;
                    ahvk.mo13631b(m57016a(aicz3.f68768k, aicz3.f68758a.hashCode()));
                    ahvk.mo13620a(m57016a(aicz3.f68767j, aicz3.f68758a.hashCode()));
                    boolean z2 = aicz3.f68770m;
                    ahvk.mo13627a(true);
                    ahvk.mo13634c();
                    Bitmap bitmap = aicz3.f68764g;
                    if (bitmap != null) {
                        if (aicz3.f68773p) {
                            bitmap = bush.m120378a(this.f68781b, bitmap);
                        }
                        ahvk.mo13621a(bitmap);
                    } else {
                        int i3 = Build.VERSION.SDK_INT;
                        ahvk.mo13621a(BitmapFactory.decodeResource(this.f68784e.f154771a.getResources(), C0126R.C0127drawable.quantum_ic_link_grey600_24));
                    }
                    String str2 = aicz3.f68762e;
                    if (str2 != null) {
                        ahvk.mo13636c(str2);
                    }
                    int i4 = Build.VERSION.SDK_INT;
                    boolean z3 = aicz3.f68765h;
                    if (aicz3.f68769l) {
                        int a2 = qkj.m32287a(this.f68781b, C0126R.C0127drawable.quantum_ic_notifications_paused_grey600_24);
                        String string = this.f68781b.getString(C0126R.string.discovery_do_not_show_again);
                        String str3 = aicz3.f68759b;
                        int a3 = aidc.m57025a(aicz3.f68772o);
                        int i5 = aicz3.f68771n;
                        ahvk.mo13618a(a2, string, m57016a(DiscoveryChimeraService.m67336a(aicw.f68735a).setAction("com.google.android.gms.nearby.discovery.ACTION_NOTIFICATION_DO_NOT_SHOW_AGAIN_CLICK").putExtra("com.google.android.gms.nearby.discovery.EXTRA_ITEM_ID", str3).putExtra("com.google.android.gms.nearby.discovery.EXTRA_PRIORITY", a3).putExtra("com.google.android.gms.nearby.discovery.EXTRA_EDUCATION_POLICY", 1), aicz3.f68758a.hashCode()));
                    }
                    int i6 = Build.VERSION.SDK_INT;
                    this.f68782c.mo36450a(aicz3.f68758a.hashCode(), ahvk.mo13629b());
                }
                if (cfoj.f184966a.mo6606a().mo82075Z() && !nrVar.isEmpty()) {
                    ((bnsl) ahsd.f67925a.mo68390d()).mo68405a("FastPair: Increasing scan frequency for pairing notification.");
                    this.f68781b.sendBroadcast(new Intent("com.google.android.gms.nearby.ACTION_LOW_LATENCY_SCAN_BURST"));
                }
                for (String str4 : nrVar2) {
                    long j = ((aida) this.f68783d.get(str4)).f68778a;
                    aicz aicz4 = ((aida) this.f68783d.get(str4)).f68779b;
                    if (ahsu.m56516a(a, Long.valueOf(j))) {
                        int i7 = aicz4.f68771n;
                        m57017a(bvin.NOTIFICATION_TIMED_OUT, aicz4);
                    }
                    this.f68782c.mo36449a(str4.hashCode());
                }
                this.f68783d.clear();
                this.f68783d.putAll(hashMap);
            }
        }
    }
}
