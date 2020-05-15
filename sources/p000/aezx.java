package p000;

import android.app.NotificationChannel;
import android.content.Context;
import android.net.wifi.WifiConfiguration;
import android.os.Build;
import android.os.ResultReceiver;
import android.util.Base64;
import com.google.android.gms.auth.proximity.ConnectionInfo;
import com.google.android.gms.auth.proximity.RemoteDevice;
import com.google.android.gms.auth.proximity.Role;
import com.google.android.gms.magictether.host.ApDisablingIntentOperation;
import com.google.android.gms.magictether.host.AutoDisconnectIntentOperation;
import com.google.android.gms.magictether.host.ConnectTetheringResponder$TetheringResultReceiver;
import com.google.android.gms.magictether.host.HotspotEnablerIntentOperation;
import com.google.android.gms.magictether.host.TetherListenerChimeraService;
import com.google.android.gms.magictether.logging.MetricTaskDurationTimerIntentOperation;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Timer;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: aezx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aezx implements jmk {

    /* renamed from: f */
    public static final sek f64058f = new sek(new String[]{"ProximityAuthWrapper"}, (int[]) null);

    /* renamed from: g */
    private static final C1245ok f64059g = new C1245ok();

    /* renamed from: a */
    public final jmx f64060a;

    /* renamed from: b */
    public final List f64061b;

    /* renamed from: c */
    public boolean f64062c;

    /* renamed from: d */
    public final Object f64063d;

    /* renamed from: e */
    public Role f64064e;

    /* renamed from: h */
    private final aezw f64065h;

    public aezx(Context context, List list, aezw aezw) {
        jmx a = jmj.m16923a(context);
        ArrayList arrayList = new ArrayList(list);
        this.f64060a = a;
        this.f64065h = aezw;
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            RemoteDevice remoteDevice = (RemoteDevice) arrayList.get(i);
            if (!hashSet.contains(remoteDevice.f11138b)) {
                arrayList2.add(remoteDevice);
                hashSet.add(remoteDevice.f11138b);
            }
        }
        this.f64061b = arrayList2;
        this.f64062c = false;
        this.f64063d = new Object();
    }

    /* renamed from: d */
    private final List m52761d() {
        aucb a = this.f64060a.mo13887a(this.f64064e);
        try {
            aucu.m76783a(a, 5, TimeUnit.SECONDS);
            return (List) a.mo50386d();
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            throw new gid("Failed retrieving connection infos for role", e);
        }
    }

    /* renamed from: a */
    public final RemoteDevice mo34697a(String str) {
        List list = this.f64061b;
        int size = list.size();
        int i = 0;
        while (i < size) {
            RemoteDevice remoteDevice = (RemoteDevice) list.get(i);
            i++;
            if (remoteDevice.f11138b.equals(str)) {
                return remoteDevice;
            }
        }
        return null;
    }

    /* renamed from: b */
    public final aucb mo34700b() {
        synchronized (this.f64063d) {
            if (!this.f64062c) {
                return null;
            }
            ArrayList<RemoteDevice> arrayList = new ArrayList(this.f64061b);
            ArrayList arrayList2 = new ArrayList();
            for (RemoteDevice remoteDevice : arrayList) {
                String str = remoteDevice.f11138b;
                RemoteDevice a = mo34697a(str);
                if (a != null) {
                    this.f64061b.remove(a);
                    synchronized (aezx.class) {
                        if (!f64059g.containsKey(str)) {
                            f64058f.mo25418e("Decrementing RemoteDevice count for a non-existent device with ID: %s", jkr.m16853a(str));
                        } else {
                            int intValue = ((Integer) f64059g.get(str)).intValue() - 1;
                            if (intValue != 0) {
                                f64059g.put(str, Integer.valueOf(intValue));
                                if (intValue != 0) {
                                    continue;
                                }
                            } else {
                                f64059g.remove(str);
                            }
                        }
                    }
                    arrayList2.add(this.f64060a.mo13888a(str, this.f64064e));
                }
            }
            aucb a2 = aucu.m76779a((Collection) arrayList2);
            return a2;
        }
    }

    /* renamed from: c */
    public final void mo34701c() {
        synchronized (this.f64063d) {
            HashSet hashSet = new HashSet();
            try {
                for (ConnectionInfo connectionInfo : m52761d()) {
                    hashSet.add(connectionInfo.f11124b.f11138b);
                }
                for (RemoteDevice remoteDevice : this.f64061b) {
                    if (!hashSet.contains(remoteDevice.f11138b)) {
                        try {
                            aucu.m76783a(this.f64060a.mo13886a(remoteDevice, this.f64064e), 5, TimeUnit.SECONDS);
                        } catch (InterruptedException | ExecutionException | TimeoutException e) {
                            f64058f.mo25417e("Couldn't register remote device for role.", e, new Object[0]);
                            return;
                        }
                    }
                }
            } catch (gid e2) {
                f64058f.mo25418e("Couldn't retrieve connection infos.", new Object[0]);
            }
        }
    }

    /* renamed from: a */
    public final void mo34698a() {
        synchronized (this.f64063d) {
            aucb b = mo34700b();
            if (b != null) {
                try {
                    aucu.m76783a(b, 5, TimeUnit.SECONDS);
                } catch (InterruptedException | ExecutionException | TimeoutException e) {
                    f64058f.mo25417e("Error unregistering devices", e, new Object[0]);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo34699a(int i) {
        int i2;
        this.f64060a.mo13890a((jmk) this);
        this.f64064e = new Role("magic_tether", i);
        List list = this.f64061b;
        int size = list.size();
        int i3 = 0;
        while (i3 < size) {
            RemoteDevice remoteDevice = (RemoteDevice) list.get(i3);
            String str = remoteDevice.f11138b;
            synchronized (aezx.class) {
                if (f64059g.containsKey(str)) {
                    i2 = ((Integer) f64059g.get(str)).intValue();
                } else {
                    i2 = 0;
                }
                f64059g.put(str, Integer.valueOf(i2 + 1));
            }
            try {
                aucu.m76783a(this.f64060a.mo13886a(remoteDevice, this.f64064e), 5, TimeUnit.SECONDS);
                i3++;
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
                throw new gid("Error registering device for role", e);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (ConnectionInfo connectionInfo : m52761d()) {
            if (connectionInfo.f11126d == 3 && mo34697a(connectionInfo.f11124b.f11138b) != null) {
                arrayList.add(connectionInfo.f11124b);
            }
        }
        this.f64062c = true;
    }

    /* renamed from: a */
    public final void mo13348a(String str, int i, int i2) {
        synchronized (this.f64063d) {
            RemoteDevice a = mo34697a(str);
            if (a == null) {
                f64058f.mo25418e("Can't update connection status. deviceId: %s, oldStatus: %s, newStatus: %s", jkr.m16853a(str), ConnectionInfo.m6759a(i), ConnectionInfo.m6759a(i2));
            } else {
                aezw aezw = this.f64065h;
                sek sek = TetherListenerChimeraService.f79824e;
                StringBuilder sb = new StringBuilder(63);
                sb.append("onConnectionStatusChanged... old: ");
                sb.append(i);
                sb.append(", new: ");
                sb.append(i2);
                sb.toString();
                if (i2 == 4) {
                    MetricTaskDurationTimerIntentOperation.m67149a(((afav) aezw).f64108e.getApplicationContext(), "magictether_performance_advertisement_to_connection_duration_host", a.f11138b);
                } else if (i2 == 2) {
                    MetricTaskDurationTimerIntentOperation.m67152b(((afav) aezw).f64108e.getApplicationContext(), "magictether_performance_advertisement_to_connection_duration_host", a.f11138b);
                    MetricTaskDurationTimerIntentOperation.m67149a(((afav) aezw).f64108e.getApplicationContext(), "magictether_performance_connection_to_authentication_duration_host", a.f11138b);
                } else if (i2 == 3) {
                    MetricTaskDurationTimerIntentOperation.m67152b(((afav) aezw).f64108e.getApplicationContext(), "magictether_performance_connection_to_authentication_duration_host", a.f11138b);
                } else if (i2 == 0) {
                    MetricTaskDurationTimerIntentOperation.m67153c(((afav) aezw).f64108e.getApplicationContext(), "magictether_performance_advertisement_to_connection_duration_host", a.f11138b);
                    MetricTaskDurationTimerIntentOperation.m67153c(((afav) aezw).f64108e.getApplicationContext(), "magictether_performance_connection_to_authentication_duration_host", a.f11138b);
                }
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.magictether.host.HotspotEnablerIntentOperation.a(android.content.Context, boolean, android.os.ResultReceiver):android.content.Intent
     arg types: [android.content.Context, int, com.google.android.gms.magictether.host.ConnectTetheringResponder$TetheringResultReceiver]
     candidates:
      com.google.android.chimera.IntentOperation.a(android.content.Context, android.content.Intent, java.lang.String):dnb
      com.google.android.gms.magictether.host.HotspotEnablerIntentOperation.a(android.content.Context, boolean, android.os.ResultReceiver):android.content.Intent */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0278, code lost:
        if (p000.afcd.f64169a.get() == null) goto L_0x027a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00d7 A[Catch:{ afbq | bxwf | JSONException -> 0x03f7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0306 A[Catch:{ afbq | bxwf | JSONException -> 0x03f7 }] */
    /* renamed from: a */
    public final void mo13349a(String str, String str2, byte[] bArr) {
        int i;
        bxxc bxxc;
        int i2;
        int i3;
        NotificationChannel a;
        synchronized (this.f64063d) {
            if (str2.equals("magic_tether")) {
                int i4 = 1;
                new Object[1][0] = jkr.m16853a(str);
                RemoteDevice a2 = mo34697a(str);
                if (a2 != null) {
                    aezw aezw = this.f64065h;
                    sek sek = TetherListenerChimeraService.f79824e;
                    new Object[1][0] = a2.mo7784a();
                    try {
                        JSONObject jSONObject = new JSONObject(new String(bArr));
                        byte[] decode = Base64.decode(jSONObject.getString("data"), 8);
                        switch (jSONObject.getInt("type")) {
                            case 0:
                                i = 1;
                                break;
                            case 1:
                                i = 2;
                                break;
                            case 2:
                                i = 3;
                                break;
                            case 3:
                                i = 4;
                                break;
                            case 4:
                                i = 5;
                                break;
                            case 5:
                                i = 6;
                                break;
                            case 6:
                                i = 7;
                                break;
                            case 7:
                                i = 8;
                                break;
                            default:
                                i = 0;
                                break;
                        }
                        int i5 = i - 1;
                        if (i != 0) {
                            switch (i5) {
                                case 1:
                                    bxxc = (afbj) bxvk.m124016a(afbj.f64141a, decode, bxus.m123744c());
                                    afbr afbr = new afbr(bxxc);
                                    rpr b = rpr.m34216b();
                                    i2 = afbr.f64156b - 1;
                                    if (i2 != 1) {
                                        if (i2 != 3) {
                                            if (i2 != 5) {
                                                if (i2 == 6) {
                                                    TetherListenerChimeraService.f79824e.mo25414c("Received KEEP_ALIVE_TICKLE", new Object[0]);
                                                    AutoDisconnectIntentOperation.m67134a(a2.f11138b);
                                                    bxvd da = afbi.f64137c.mo74144da();
                                                    afbf a3 = afae.m52777a(b).mo34708a();
                                                    if (da.f164950c) {
                                                        da.mo74035c();
                                                        da.f164950c = false;
                                                    }
                                                    afbi afbi = (afbi) da.f164949b;
                                                    a3.getClass();
                                                    afbi.f64140b = a3;
                                                    afbi.f64139a = 1 | afbi.f64139a;
                                                    ((afav) aezw).mo34720a(a2, (afbi) da.mo74062i());
                                                    break;
                                                } else {
                                                    sek sek2 = TetherListenerChimeraService.f79824e;
                                                    StringBuilder sb = new StringBuilder(42);
                                                    sb.append("Received unknown message type: ");
                                                    sb.append(afbr.f64156b - 1);
                                                    sek2.mo25414c(sb.toString(), new Object[0]);
                                                    break;
                                                }
                                            } else {
                                                TetherListenerChimeraService.f79824e.mo25414c("Received DISCONNECT_TETHERING_REQUEST.", new Object[0]);
                                                aezy.m52769a(b).mo34704b(a2.f11138b);
                                                break;
                                            }
                                        } else {
                                            TetherListenerChimeraService.f79824e.mo25414c("Received CONNECT_TETHERING_REQUEST.", new Object[0]);
                                            if (!((afav) aezw).f64104a.isEmpty()) {
                                                ((afav) aezw).f64104a.add(a2);
                                                break;
                                            } else {
                                                ((afav) aezw).f64104a.add(a2);
                                                MetricTaskDurationTimerIntentOperation.m67148a(b, "magictether_performance_connect_tethering_response_duration");
                                                ((afav) aezw).f64106c = new Timer();
                                                ((afav) aezw).f64106c.schedule(new afau((afav) aezw), 90000);
                                                ((afav) aezw).f64105b = new afaa(b, a2);
                                                afaa afaa = ((afav) aezw).f64105b;
                                                afat afat = new afat((afav) aezw);
                                                sdo.m34970a(afaa.f64078e == null);
                                                afbf a4 = afae.m52777a(rpr.m34216b()).mo34708a();
                                                bxvd da2 = afbe.f64117f.mo74144da();
                                                if (da2.f164950c) {
                                                    da2.mo74035c();
                                                    da2.f164950c = false;
                                                }
                                                afbe afbe = (afbe) da2.f164949b;
                                                a4.getClass();
                                                afbe.f64123e = a4;
                                                afbe.f64119a = 8 | afbe.f64119a;
                                                if (afaa.f64076c.mo34734d()) {
                                                    if (a4.f64132g) {
                                                        if (afaa.f64076c.mo34732b()) {
                                                            WifiConfiguration a5 = afaa.f64076c.mo34730a();
                                                            String str3 = a5.SSID;
                                                            if (da2.f164950c) {
                                                                da2.mo74035c();
                                                                da2.f164950c = false;
                                                            }
                                                            afbe afbe2 = (afbe) da2.f164949b;
                                                            str3.getClass();
                                                            afbe2.f64119a |= 2;
                                                            afbe2.f64121c = str3;
                                                            String str4 = a5.preSharedKey;
                                                            if (da2.f164950c) {
                                                                da2.mo74035c();
                                                                da2.f164950c = false;
                                                            }
                                                            afbe afbe3 = (afbe) da2.f164949b;
                                                            str4.getClass();
                                                            int i6 = afbe3.f64119a | 4;
                                                            afbe3.f64119a = i6;
                                                            afbe3.f64122d = str4;
                                                            afbe3.f64120b = 1;
                                                            afbe3.f64119a = 1 | i6;
                                                            afat.mo34717a((afbe) da2.mo74062i());
                                                            afcg.m52833a().mo34740a(ApDisablingIntentOperation.m67131a(afaa.f64074a));
                                                            AutoDisconnectIntentOperation.m67134a(afaa.f64075b.f11138b);
                                                            break;
                                                        } else {
                                                            afaa.f64078e = new ConnectTetheringResponder$TetheringResultReceiver(afaa.f64074a, afat, afaa.f64075b, a4, afaa.f64076c);
                                                            if (!afaa.f64077d.mo34710d()) {
                                                                if (afcd.f64169a != null) {
                                                                    break;
                                                                }
                                                                afcd.f64169a = new WeakReference(new afcd());
                                                                ((afcd) afcd.f64169a.get()).f64170b.execute(new afcc(new aezz(afaa, a4)));
                                                                break;
                                                            } else {
                                                                Context context = afaa.f64074a;
                                                                context.startService(HotspotEnablerIntentOperation.m67139a(context, false, (ResultReceiver) afaa.f64078e));
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        afaa.f64073f.mo25418e("Cell data is not available.", new Object[0]);
                                                        if (da2.f164950c) {
                                                            da2.mo74035c();
                                                            da2.f164950c = false;
                                                        }
                                                        afbe afbe4 = (afbe) da2.f164949b;
                                                        afbe4.f64120b = 5;
                                                        afbe4.f64119a = 1 | afbe4.f64119a;
                                                        afat.mo34717a((afbe) da2.mo74062i());
                                                        break;
                                                    }
                                                } else {
                                                    afaa.f64073f.mo25418e("Tethering is not supported on this device.", new Object[0]);
                                                    if (da2.f164950c) {
                                                        da2.mo74035c();
                                                        da2.f164950c = false;
                                                    }
                                                    afbe afbe5 = (afbe) da2.f164949b;
                                                    afbe5.f64120b = 4;
                                                    afbe5.f64119a = 1 | afbe5.f64119a;
                                                    afat.mo34717a((afbe) da2.mo74062i());
                                                    break;
                                                }
                                            }
                                        }
                                    } else {
                                        TetherListenerChimeraService.f79824e.mo25414c("Received TETHER_AVAILABILITY_REQUEST.", new Object[0]);
                                        MetricTaskDurationTimerIntentOperation.m67148a(b, "magictether_performance_tether_availability_response_duration_host");
                                        afar afar = new afar(b);
                                        afbf a6 = afae.m52777a(afar.f64098a).mo34708a();
                                        bxvd da3 = afbm.f64144d.mo74144da();
                                        if (afar.f64100c.getSimState() != 5) {
                                            i3 = 5;
                                        } else if (!a6.f64132g) {
                                            i3 = 4;
                                        } else if (!afar.f64099b.mo34734d() || a6.f64131f) {
                                            i3 = 1;
                                        } else {
                                            afcg a7 = afcg.m52833a();
                                            int i7 = Build.VERSION.SDK_INT;
                                            if (!a7.f64176c.mo25453e() || (a = a7.f64176c.mo25437a("mt-notification-channel-id")) == null || a.getImportance() == 0) {
                                                int i8 = Build.VERSION.SDK_INT;
                                                i3 = 7;
                                            } else {
                                                i3 = afar.f64101d.mo34710d() ? afap.m52790a(afar.f64098a).f64097a.getSharedPreferences("com.google.android.gms.magictether.host.PROVISIONING_RESULT_PREFERENCE_FILE", 0).getBoolean("com.google.android.gms.magictether.LAST_PROVISIONING_RESULT", true) ? 2 : 8 : 3;
                                            }
                                        }
                                        if (da3.f164950c) {
                                            da3.mo74035c();
                                            da3.f164950c = false;
                                        }
                                        afbm afbm = (afbm) da3.f164949b;
                                        afbm.f64147b = i3 - 1;
                                        int i9 = afbm.f64146a | 1;
                                        afbm.f64146a = i9;
                                        a6.getClass();
                                        afbm.f64148c = a6;
                                        afbm.f64146a = i9 | 2;
                                        afbm afbm2 = (afbm) da3.mo74062i();
                                        if (((afav) aezw).mo34720a(a2, afbm2)) {
                                            afba afba = ((afav) aezw).f64107d;
                                            int a8 = afbl.m52815a(afbm2.f64147b);
                                            if (a8 == 0) {
                                                a8 = 1;
                                            }
                                            if (cfcm.m138682b()) {
                                                switch (a8 - 1) {
                                                    case 1:
                                                        i4 = 0;
                                                        break;
                                                    case 2:
                                                        break;
                                                    case 3:
                                                        i4 = 3;
                                                        break;
                                                    case 4:
                                                        i4 = 4;
                                                        break;
                                                    case 5:
                                                    case 6:
                                                        i4 = 5;
                                                        break;
                                                    case 7:
                                                        i4 = 6;
                                                        break;
                                                    default:
                                                        i4 = 2;
                                                        break;
                                                }
                                                afba.mo34723a("magictether_tether_availability_result_code_host", i4);
                                                afba.f64113b.mo24388e();
                                            }
                                        }
                                        MetricTaskDurationTimerIntentOperation.m67151b(b, "magictether_performance_tether_availability_response_duration_host");
                                        break;
                                    }
                                    break;
                                case 2:
                                    bxxc = (afbm) bxvk.m124016a(afbm.f64144d, decode, bxus.m123744c());
                                    afbr afbr2 = new afbr(bxxc);
                                    rpr b2 = rpr.m34216b();
                                    i2 = afbr2.f64156b - 1;
                                    if (i2 != 1) {
                                    }
                                    break;
                                case 3:
                                    bxxc = (afbb) bxvk.m124016a(afbb.f64114a, decode, bxus.m123744c());
                                    afbr afbr22 = new afbr(bxxc);
                                    rpr b22 = rpr.m34216b();
                                    i2 = afbr22.f64156b - 1;
                                    if (i2 != 1) {
                                    }
                                    break;
                                case 4:
                                    bxxc = (afbe) bxvk.m124016a(afbe.f64117f, decode, bxus.m123744c());
                                    afbr afbr222 = new afbr(bxxc);
                                    rpr b222 = rpr.m34216b();
                                    i2 = afbr222.f64156b - 1;
                                    if (i2 != 1) {
                                    }
                                    break;
                                case 5:
                                    bxxc = (afbg) bxvk.m124016a(afbg.f64133a, decode, bxus.m123744c());
                                    afbr afbr2222 = new afbr(bxxc);
                                    rpr b2222 = rpr.m34216b();
                                    i2 = afbr2222.f64156b - 1;
                                    if (i2 != 1) {
                                    }
                                    break;
                                case 6:
                                    bxxc = (afbh) bxvk.m124016a(afbh.f64135a, decode, bxus.m123744c());
                                    afbr afbr22222 = new afbr(bxxc);
                                    rpr b22222 = rpr.m34216b();
                                    i2 = afbr22222.f64156b - 1;
                                    if (i2 != 1) {
                                    }
                                    break;
                                case 7:
                                    bxxc = (afbi) bxvk.m124016a(afbi.f64137c, decode, bxus.m123744c());
                                    afbr afbr222222 = new afbr(bxxc);
                                    rpr b222222 = rpr.m34216b();
                                    i2 = afbr222222.f64156b - 1;
                                    if (i2 != 1) {
                                    }
                                    break;
                                default:
                                    throw new afbq(i5);
                            }
                        } else {
                            throw null;
                        }
                    } catch (afbq | bxwf | JSONException e) {
                        TetherListenerChimeraService.f79824e.mo25417e("Error reading message.", e, new Object[0]);
                    }
                }
            }
        }
    }
}
