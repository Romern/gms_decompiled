package p000;

import android.app.ActivityManager;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.nearby.messages.ClientAppIdentifier;
import com.google.android.gms.nearby.messages.Strategy;
import com.google.android.gms.nearby.messages.internal.ClientAppContext;
import com.google.android.gms.nearby.messages.internal.MessageType;
import com.google.android.gms.nearby.messages.internal.SubscribeRequest;
import com.google.android.gms.nearby.messages.settings.NearbyMessagesAppOptInChimeraActivity;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.TimeoutException;

/* renamed from: aiyd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aiyd {

    /* renamed from: a */
    public final ClientAppIdentifier f70048a;

    /* renamed from: b */
    public final Context f70049b;

    /* renamed from: c */
    public int f70050c;

    /* renamed from: d */
    private final aiwj f70051d;

    /* renamed from: e */
    private final ajgk f70052e;

    public aiyd(ClientAppIdentifier clientAppIdentifier, Context context, aiwj aiwj, ajgk ajgk) {
        this.f70048a = clientAppIdentifier;
        this.f70049b = context;
        this.f70051d = aiwj;
        this.f70052e = ajgk;
    }

    /* renamed from: a */
    public static boolean m58181a(int i) {
        return i < 9000000;
    }

    /* renamed from: b */
    private final boolean m58184b() {
        return (this.f70050c & 1) != 0;
    }

    /* renamed from: c */
    private final boolean m58185c() {
        return m58181a(sqr.m35996a(this.f70049b, this.f70048a.f80669d));
    }

    /* renamed from: d */
    public final boolean mo38255d(ajcg ajcg) {
        try {
            this.f70051d.mo38159a();
            return true;
        } catch (InterruptedException | TimeoutException e) {
            aixw.m58159a(new Status(8), ajcg);
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m58182a(int i, ajcg ajcg) {
        if (i >= 0 && i < 4) {
            return true;
        }
        StringBuilder sb = new StringBuilder(35);
        sb.append("Invalid calling context ");
        sb.append(i);
        aixw.m58159a(new Status(8, sb.toString()), ajcg);
        return false;
    }

    /* renamed from: b */
    public final boolean mo38251b(ajcg ajcg) {
        if (mo38245a()) {
            return true;
        }
        String c = this.f70048a.mo44294c();
        if (!m58185c() || !this.f70052e.mo38610a(c)) {
            String valueOf = String.valueOf(this.f70048a);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 45);
            sb.append("Nearby.Messages is not enabled for this app: ");
            sb.append(valueOf);
            aixw.m58159a(new Status(2802, sb.toString()), ajcg);
            return false;
        }
        srn srn = ahfq.f67120a;
        String valueOf2 = String.valueOf(this.f70048a);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 45);
        sb2.append("Nearby.Messages is not enabled for this app: ");
        sb2.append(valueOf2);
        aixw.m58159a(new Status(2802, sb2.toString(), NearbyMessagesAppOptInChimeraActivity.m67429a(this.f70049b, c)), ajcg);
        return false;
    }

    /* renamed from: c */
    public final boolean mo38253c(ajcg ajcg) {
        if (!aixt.m58149a(this.f70049b, this.f70048a.f80669d, cfop.f185115a.mo6606a().mo82229h())) {
            return true;
        }
        aixw.m58159a(new Status(2804, String.valueOf(this.f70048a.f80669d).concat(" reached its quota limit.")), ajcg);
        bnsl bnsl = (bnsl) ahfq.f67120a.mo68388c();
        bnsl.mo68432a("aiyd", "c", 569, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68420a("%s reached its quota limit.", this.f70048a.f80669d);
        return false;
    }

    /* renamed from: a */
    private final boolean m58183a(String str) {
        return butf.m120430a(this.f70049b, this.f70048a.f80669d, str);
    }

    /* renamed from: d */
    public final boolean mo38256d(SubscribeRequest subscribeRequest) {
        return mo38247a(subscribeRequest.f80763d, subscribeRequest.f80762c);
    }

    /* renamed from: a */
    public final boolean mo38245a() {
        int i;
        if (this.f70052e.mo38612b(this.f70048a.mo44294c()) || this.f70048a.mo44296d() || (i = this.f70050c) == 0) {
            return true;
        }
        if ((i & 2) != 0) {
            if (!m58183a("android.permission.ACCESS_FINE_LOCATION")) {
                return false;
            }
            if (cfop.f185115a.mo6606a().mo82202F()) {
                int i2 = Build.VERSION.SDK_INT;
                if (!m58183a("android.permission.ACCESS_BACKGROUND_LOCATION")) {
                    return false;
                }
            }
            i ^= 2;
        }
        return i == 0;
    }

    /* renamed from: b */
    public final boolean mo38252b(SubscribeRequest subscribeRequest) {
        boolean a = subscribeRequest.f80764e.mo44309a();
        if (!a || subscribeRequest.f80762c.mo44316a()) {
            return mo38248a(subscribeRequest.f80762c, a, subscribeRequest.f80763d);
        }
        aixw.m58159a(new Status(10, "Discovery mode must be SCAN or DEFAULT for a raw audio subscribe."), subscribeRequest.f80763d);
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004f, code lost:
        if (r9.f70048a.mo44292a(3) == false) goto L_0x0053;
     */
    /* renamed from: c */
    public final boolean mo38254c(SubscribeRequest subscribeRequest) {
        if ((!subscribeRequest.f80774o && subscribeRequest.f80775p == 0) || this.f70048a.mo44292a(1)) {
            if (subscribeRequest.f80762c.f80697j != 1) {
                String[] strArr = {"__eddystone_url", "__ble_record"};
                Iterator it = subscribeRequest.f80764e.f80683c.iterator();
                loop0:
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    MessageType messageType = (MessageType) it.next();
                    int i = 0;
                    while (true) {
                        if (i < 2) {
                            if (sdg.m34949a(messageType.f80740c, strArr[i])) {
                                break loop0;
                            }
                            i++;
                        }
                    }
                }
                return true;
            }
        }
        bnsl bnsl = (bnsl) ahfq.f67120a.mo68388c();
        bnsl.mo68432a("aiyd", "c", 281, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68420a("This client has made an illegal request: %s", this.f70048a);
        aixw.m58159a(new Status(2806), subscribeRequest.f80763d);
        return false;
    }

    /* renamed from: a */
    public final boolean mo38246a(ajcg ajcg) {
        return mo38251b(ajcg) && mo38253c(ajcg);
    }

    /* renamed from: a */
    public final boolean mo38247a(ajcg ajcg, Strategy strategy) {
        if (m58185c()) {
            srn srn = ahfq.f67120a;
            return true;
        }
        boolean a = strategy.mo44316a();
        if (strategy.mo44320e() && !m58184b() && a) {
            aixw.m58159a(new Status(2807, "Missing microphone permission"), ajcg);
            return false;
        } else if (strategy.f80693f == 1 && (!a || m58184b())) {
            return true;
        } else {
            if (strategy.mo44318c() && (this.f70050c & 2) == 0) {
                aixw.m58159a(new Status(2807, "Missing Bluetooth Low Energy permission"), ajcg);
                return false;
            } else if (!strategy.mo44319d() || (this.f70050c & 6) != 0) {
                return true;
            } else {
                aixw.m58159a(new Status(2807, "Missing Bluetooth permission"), ajcg);
                return false;
            }
        }
    }

    /* renamed from: a */
    public final boolean mo38248a(Strategy strategy, boolean z, ajcg ajcg) {
        if (z && !strategy.mo44320e()) {
            aixw.m58159a(new Status(10, "Discovery medium must be either DEFAULT or ULTRASOUND for raw audio messages."), ajcg);
            return false;
        }
        buye buye = (buye) ahgz.m55755b(this.f70049b, buye.class);
        if (strategy.f80695h == 2 && buye != null) {
            boolean a = aixs.m58137a(this.f70049b, buye, bzbu.BLE_ADVERTISING_PACKET);
            boolean a2 = aixs.m58138a(this.f70049b, buye, bzbu.BLE_ADVERTISING_PACKET, strategy.f80697j);
            int i = strategy.f80696i;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        StringBuilder sb = new StringBuilder(35);
                        sb.append("Invalid discovery mode: ");
                        sb.append(i);
                        aixw.m58159a(new Status(13, sb.toString()), ajcg);
                        return false;
                    } else if (!a && !a2) {
                        aixw.m58159a(new Status(2822), ajcg);
                        return false;
                    }
                } else if (!a2) {
                    aixw.m58159a(new Status(2822), ajcg);
                    return false;
                }
            } else if (!a) {
                aixw.m58159a(new Status(2821), ajcg);
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo38249a(SubscribeRequest subscribeRequest) {
        try {
            if (subscribeRequest.f80761b != null) {
                int a = ClientAppContext.m67402a(subscribeRequest.f80776q, this.f70048a.f80668c);
                return m58182a(a, subscribeRequest.f80763d) && mo38254c(subscribeRequest) && mo38246a(subscribeRequest.f80763d) && mo38256d(subscribeRequest) && mo38250a("subscribe", subscribeRequest.f80763d, a) && mo38252b(subscribeRequest);
            } else if (subscribeRequest.f80765f != null) {
                if (mo38254c(subscribeRequest) && mo38246a(subscribeRequest.f80763d) && mo38256d(subscribeRequest)) {
                    PendingIntent pendingIntent = subscribeRequest.f80765f;
                    ajcg ajcg = subscribeRequest.f80763d;
                    if (!ajcp.m58515a(pendingIntent).equals(this.f70048a.f80669d)) {
                        String str = this.f70048a.f80669d;
                        String a2 = ajcp.m58515a(pendingIntent);
                        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 85 + String.valueOf(a2).length());
                        sb.append("The PendingIntent creator must be the package making the API call. Expected ");
                        sb.append(str);
                        sb.append(" but was ");
                        sb.append(a2);
                        aixw.m58159a(new Status(10, sb.toString()), ajcg);
                    } else if (mo38255d(subscribeRequest.f80763d)) {
                        PendingIntent pendingIntent2 = subscribeRequest.f80765f;
                        ajcg ajcg2 = subscribeRequest.f80763d;
                        aiyr aiyr = (aiyr) ahgz.m55754a(this.f70049b, aiyr.class);
                        ClientAppIdentifier clientAppIdentifier = this.f70048a;
                        aiyr.f70096g.mo72984b();
                        aiyr.f70096g.mo72984b();
                        sdo.m34959a(clientAppIdentifier);
                        HashSet hashSet = new HashSet();
                        if (aiyr.f70093d.mo67271d(clientAppIdentifier)) {
                            for (aiyo aiyo : ((bndq) aiyr.f70093d).mo67127c(clientAppIdentifier)) {
                                PendingIntent pendingIntent3 = aiyo.f70084b.f70081b;
                                if (pendingIntent3 != null) {
                                    hashSet.add(pendingIntent3);
                                }
                            }
                        }
                        hashSet.add(pendingIntent2);
                        if (hashSet.size() > 5) {
                            aixw.m58159a(new Status(2801, "Will exceed MAX_PENDING_INTENTS_PER_APP=5"), ajcg2);
                        } else if (mo38252b(subscribeRequest)) {
                            return true;
                        }
                    }
                }
                return false;
            } else {
                throw new IllegalArgumentException("SubscribeRequest missing both messageListener and pendingIntent");
            }
        } catch (Exception e) {
            bnsl bnsl = (bnsl) ahfq.f67120a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("aiyd", "a", 138, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("NearbyPreconditions: Exception trying to check %s", subscribeRequest);
            aixw.m58159a(new Status(8), subscribeRequest.f80763d);
            return false;
        }
    }

    /* renamed from: a */
    public final boolean mo38250a(String str, ajcg ajcg, int i) {
        boolean z;
        byyj byyj = ((ajat) ahgz.m55754a(this.f70049b, ajat.class)).f70278f.f168931o;
        if (byyj == null) {
            byyj = byyj.f168939c;
        }
        if (!byyj.f168942b) {
            return true;
        }
        if (ClientAppIdentifier.m67378b(this.f70048a.f80669d)) {
            srn srn = ahfq.f67120a;
            return true;
        }
        Context context = this.f70049b;
        String str2 = this.f70048a.f80669d;
        if (cfos.m141992f()) {
            z = aixt.m58148a(context, str2);
        } else {
            z = aixt.m58149a(context, str2, cfop.f185115a.mo6606a().mo82243v());
        }
        if (z) {
            srn srn2 = ahfq.f67120a;
            return true;
        } else if (i == 0) {
            srn srn3 = ahfq.f67120a;
            return true;
        } else if (i == 1) {
            srn srn4 = ahfq.f67120a;
            return true;
        } else {
            if (i == 3) {
                String str3 = this.f70048a.f80669d;
                for (ActivityManager.RunningServiceInfo runningServiceInfo : ((ActivityManager) this.f70049b.getSystemService("activity")).getRunningServices((int) cfop.f185115a.mo6606a().mo82240s())) {
                    if (str3 != null && runningServiceInfo.service != null && str3.equals(runningServiceInfo.service.getPackageName()) && runningServiceInfo.foreground) {
                        srn srn5 = ahfq.f67120a;
                        return true;
                    }
                }
            }
            aixw.m58159a(new Status(2803, "Attempting to perform a high-power operation from a non-Activity Context"), ajcg);
            bnsl bnsl = (bnsl) ahfq.f67120a.mo68388c();
            bnsl.mo68432a("aiyd", "a", 390, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68424a("Disallowing high-power mode %s for %s", str, this.f70048a);
            return false;
        }
    }
}
