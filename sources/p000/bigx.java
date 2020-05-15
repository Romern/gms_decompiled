package p000;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.net.wifi.WifiManager;
import android.os.Handler;
import android.util.Log;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.gms.beacon.BleSettings;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.location.ActivityRecognitionRequest;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.internal.LocationRequestInternal;
import com.google.android.places.signals.SignalManager$GeofenceBroadcastReceiver;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: bigx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bigx {

    /* renamed from: a */
    public static final int[] f120549a = {3, 2, 1, 0};

    /* renamed from: b */
    public static final List f120550b = Collections.emptyList();

    /* renamed from: A */
    private final long f120551A;

    /* renamed from: B */
    private final long f120552B;

    /* renamed from: c */
    public final Context f120553c;

    /* renamed from: d */
    public final Handler f120554d;

    /* renamed from: e */
    public final List f120555e;

    /* renamed from: f */
    public final bigi f120556f;

    /* renamed from: g */
    public final aesh f120557g;

    /* renamed from: h */
    public final bigj f120558h;

    /* renamed from: i */
    public final bigb f120559i;

    /* renamed from: j */
    public final PendingIntent f120560j;

    /* renamed from: k */
    public final rkb f120561k;

    /* renamed from: l */
    public final BroadcastReceiver f120562l;

    /* renamed from: m */
    public final aesj f120563m;

    /* renamed from: n */
    public final List f120564n;

    /* renamed from: o */
    public int f120565o = 0;

    /* renamed from: p */
    public int f120566p = 0;

    /* renamed from: q */
    public int f120567q = 0;

    /* renamed from: r */
    public int f120568r = 0;

    /* renamed from: s */
    public int f120569s = -1;

    /* renamed from: t */
    public boolean f120570t;

    /* renamed from: u */
    public long f120571u;

    /* renamed from: v */
    public long f120572v;

    /* renamed from: w */
    final aehy f120573w = new bigs(this);

    /* renamed from: x */
    public final aejs f120574x;

    /* renamed from: y */
    public final bigt f120575y = new bigt(this);

    /* renamed from: z */
    private final long f120576z;

    public bigx(Context context, Handler handler) {
        Handler handler2;
        aesh aesh = new aesh(context);
        bigi a = bigi.m102351a(context, handler);
        bigj bigj = new bigj((WifiManager) context.getSystemService("wifi"));
        rjy rjy = new rjy(context);
        rjy.mo24779a(aefo.f63329a);
        bigb bigb = new bigb(context, rjy.mo24784b(), aefo.f63330b);
        rjy rjy2 = new rjy(context);
        rjy2.mo24779a(aeie.f63411a);
        rkb b = rjy2.mo24784b();
        aejs aejs = aeie.f63412b;
        this.f120553c = context;
        this.f120554d = handler;
        this.f120557g = aesh;
        this.f120556f = a;
        this.f120558h = bigj;
        this.f120559i = bigb;
        this.f120574x = aejs;
        this.f120561k = b;
        this.f120555e = new ArrayList();
        this.f120564n = new ArrayList();
        cggm.f186849a.mo6606a().mo83721L();
        this.f120576z = cggm.f186849a.mo6606a().mo83745x();
        this.f120551A = cggm.f186849a.mo6606a().mo83710A();
        this.f120552B = cggm.f186849a.mo6606a().mo83747z();
        aesh aesh2 = this.f120557g;
        aesj aesj = null;
        if (!(aesh2 == null || (handler2 = this.f120554d) == null)) {
            aesj = new aesj(aesh2, this.f120573w, handler2.getLooper());
        }
        this.f120563m = aesj;
        this.f120562l = new SignalManager$GeofenceBroadcastReceiver(this);
        this.f120560j = PendingIntent.getBroadcast(context, 0, spn.m35889g("com.google.android.places.action.SIGNAL_MANAGER_GEOFENCE_RESULT"), 134217728);
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, spn.m35889g("com.google.android.location.places.action.SIGNAL_MANAGER_GEOFENCE_RESULT"), 134217728);
        this.f120561k.mo24801e();
        aabl aabl = new aabl(getClass(), 14, "SignalManager", "places");
        rkb rkb = this.f120561k;
        rkb.mo24790a((rjz) new bigk(this, rkb, aabl, broadcast));
        this.f120553c.registerReceiver(this.f120562l, new IntentFilter("com.google.android.places.action.SIGNAL_MANAGER_GEOFENCE_RESULT"), "com.google.android.gms.permission.INTERNAL_BROADCAST", this.f120554d);
    }

    /* renamed from: c */
    public static final boolean m102369c() {
        return !cggm.m145261g();
    }

    /* renamed from: a */
    public final long mo64600a(int i) {
        return i != 1 ? i != 2 ? this.f120552B : this.f120576z : this.f120551A;
    }

    /* renamed from: b */
    public final void mo64604b() {
        this.f120570t = false;
        aesj aesj = this.f120563m;
        ArrayList arrayList = new ArrayList();
        this.f120571u = Long.MAX_VALUE;
        List list = this.f120564n;
        int size = list.size();
        int i = 0;
        while (i < size) {
            bigw bigw = (bigw) list.get(i);
            int i2 = bigw.f120546a;
            long j = bigw.f120547b;
            ClientIdentity clientIdentity = bigw.f120548c;
            LocationRequest locationRequest = new LocationRequest();
            if (i2 == 1) {
                locationRequest.mo43553c((int) ErrorInfo.TYPE_SDU_FAILED);
            } else if (i2 != 2) {
                locationRequest.mo43553c((int) ErrorInfo.TYPE_SDU_MEMORY_FULL);
            } else {
                locationRequest.mo43553c(102);
            }
            aesj aesj2 = aesj;
            long max = Math.max(j, cghb.m145406b());
            List list2 = list;
            long max2 = Math.max(j / cggm.f186849a.mo6606a().mo83746y(), cghb.m145406b() / 2);
            locationRequest.mo43554c(max);
            locationRequest.mo43552b(max2);
            LocationRequestInternal a = LocationRequestInternal.m66889a("places_signal_manager", locationRequest);
            a.mo43613a(Arrays.asList(clientIdentity));
            a.mo43614b();
            long j2 = a.f79420b.f79351c;
            if (j2 < this.f120571u) {
                this.f120571u = j2;
            }
            arrayList.add(a);
            i++;
            aesj = aesj2;
            list = list2;
        }
        aesj.mo34511a(arrayList, false);
        int i3 = this.f120569s;
        if (i3 == -1 || i3 == 0) {
            this.f120556f.mo64592a();
            this.f120559i.mo64585a();
            return;
        }
        bigi bigi = this.f120556f;
        if (Log.isLoggable("Places", 4)) {
            StringBuilder sb = new StringBuilder(50);
            sb.append("PlacesBleScanner start() with priority ");
            sb.append(i3);
            bioi.m102660b("Places", sb.toString());
        }
        Map map = bigi.f120512e;
        Integer valueOf = Integer.valueOf(i3);
        if (map.containsKey(valueOf)) {
            int intValue = ((Integer) bigi.f120512e.get(valueOf)).intValue();
            if (bigi.f120518k != intValue) {
                BleSettings bleSettings = null;
                if (intValue != 0) {
                    if (intValue == 1) {
                        bleSettings = bigi.f120510d;
                    } else if (intValue == 2) {
                        bleSettings = bigi.f120509c;
                    } else if (Log.isLoggable("Places", 5)) {
                        bioi.m102662c("Places", "PlacesBleScanner state could not be recognized");
                    }
                }
                if (bleSettings == null || !cgfc.f186710a.mo6606a().mo83585c()) {
                    if (Log.isLoggable("Places", 4)) {
                        StringBuilder sb2 = new StringBuilder(64);
                        sb2.append("PlacesBleScanner stopping, cannot scan with priority ");
                        sb2.append(i3);
                        bioi.m102660b("Places", sb2.toString());
                    }
                    bigi.mo64592a();
                } else {
                    bigi.f120513f.mo24801e();
                    rkb rkb = bigi.f120513f;
                    rkb.mo24790a((rjz) new bigg(bigi, rkb, bleSettings));
                    bigi.f120518k = intValue;
                }
            }
        } else if (Log.isLoggable("Places", 4)) {
            StringBuilder sb3 = new StringBuilder(51);
            sb3.append("No configuration available for priority ");
            sb3.append(i3);
            bioi.m102660b("Places", sb3.toString());
        }
        if (this.f120564n.isEmpty() || !cggm.f186849a.mo6606a().mo83715F()) {
            this.f120559i.mo64585a();
            return;
        }
        bigb bigb = this.f120559i;
        aefy aefy = new aefy();
        ArrayList arrayList2 = new ArrayList();
        List list3 = this.f120564n;
        int size2 = list3.size();
        long j3 = Long.MAX_VALUE;
        for (int i4 = 0; i4 < size2; i4++) {
            bigw bigw2 = (bigw) list3.get(i4);
            j3 = Math.min(j3, bigw2.f120547b);
            arrayList2.add(bigw2.f120548c);
        }
        long max3 = Math.max(j3, cggm.f186849a.mo6606a().mo83712C());
        aefy.f63348e = "places_signal_manager";
        aefy.mo34115a(max3);
        aefy.f63346c = true;
        aefy.f63347d = saq.m34797a(arrayList2);
        ActivityRecognitionRequest a2 = aefy.mo34113a();
        if (bigb.f120494d) {
            bigb.f120491a.mo24801e();
            rkb rkb2 = bigb.f120491a;
            rkb2.mo24790a((rjz) new bifz(bigb, rkb2, a2));
        }
    }

    /* renamed from: a */
    public final Location mo64601a() {
        if (!cggm.m145261g()) {
            return this.f120557g.mo34508c();
        }
        return null;
    }

    /* renamed from: a */
    public final void mo64602a(int i, long j, ClientIdentity clientIdentity) {
        sdo.m34974b(true);
        if (j < 0) {
            j = mo64600a(i);
        }
        bigw bigw = new bigw(i, j, clientIdentity);
        if (!this.f120564n.contains(bigw)) {
            this.f120564n.add(bigw);
            int i2 = this.f120569s;
            if (i2 == -1 || i >= i2) {
                this.f120569s = i;
            }
            mo64604b();
        }
    }

    /* renamed from: a */
    public final void mo64603a(bigv bigv) {
        this.f120555e.add(bigv);
    }

    /* renamed from: b */
    public final void mo64605b(bigv bigv) {
        this.f120555e.remove(bigv);
    }
}
