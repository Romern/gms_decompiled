package p000;

import android.location.Location;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.internal.LocationRequestInternal;
import com.google.android.gms.thunderbird.state.ActivationInfo;
import com.google.android.gms.thunderbird.state.DeviceState;
import com.google.android.gms.thunderbird.state.EmergencyInfo;
import com.google.android.gms.thunderbird.worker.ConfigWorker$AlarmListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: auiq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auiq extends auja implements aehz {

    /* renamed from: j */
    private static final WorkSource f91894j = stx.m36334a(Process.myUid(), "com.google.android.gms");

    /* renamed from: a */
    public final aufq f91895a;

    /* renamed from: b */
    public final Map f91896b = new C1223np(2);

    /* renamed from: c */
    public final Collection f91897c = new ArrayList(2);

    /* renamed from: d */
    public final auip f91898d = new auip(this);

    /* renamed from: e */
    public EmergencyInfo f91899e;

    /* renamed from: f */
    public int f91900f = 0;

    /* renamed from: g */
    public Location f91901g = null;

    /* renamed from: h */
    public long f91902h = Math.min(cgyq.f188062a.mo6606a().mo84761e(), cgyq.m147644b());

    /* renamed from: k */
    private boolean f91903k = false;

    /* renamed from: l */
    private boolean f91904l = false;

    /* renamed from: m */
    private bqgg f91905m = null;

    /* renamed from: n */
    private auht f91906n = null;

    /* renamed from: o */
    private boolean f91907o = false;

    /* renamed from: p */
    private Location f91908p = null;

    /* renamed from: q */
    private boolean f91909q = false;

    /* renamed from: r */
    private final ConfigWorker$AlarmListener f91910r = new ConfigWorker$AlarmListener(this);

    public auiq(auit auit, aufq aufq, EmergencyInfo emergencyInfo) {
        super(auit);
        bmxy.m108581a(aufq);
        this.f91895a = aufq;
        bmxy.m108581a(emergencyInfo);
        this.f91899e = emergencyInfo;
    }

    /* renamed from: a */
    private final void m77105a(auiu auiu, Location location) {
        boolean z;
        boolean z2;
        boolean z3;
        bngx bngx;
        int i;
        if (this.f91900f < 3) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108600b(z);
        Collection collection = this.f91897c;
        if (auiu.f91921b == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        bmxy.m108600b(z2);
        int size = auiu.mo50573d().f91736r.size();
        int size2 = auiu.mo50574e().f109087b.size();
        if (size <= 0) {
            z3 = false;
        } else {
            z3 = size2 > 0;
        }
        bmxy.m108600b(z3);
        auiu.f91921b = new ArrayList(size * size2);
        EmergencyInfo e = auiu.mo50574e();
        if (e.f109087b.isEmpty()) {
            bngx = bngx.m109376e();
        } else if (e.f109087b.size() != 1) {
            bngs b = bngx.m109371b(e.f109087b.size());
            List list = e.f109087b;
            int size3 = list.size();
            for (int i2 = 0; i2 < size3; i2++) {
                b.mo67668c(new EmergencyInfo(e.f109086a, bngx.m109356a((DeviceState) list.get(i2))));
            }
            bngx = b.mo67664a();
        } else {
            bngx = bngx.m109356a(e);
        }
        int size4 = bngx.size();
        int i3 = 0;
        while (i3 < size4) {
            EmergencyInfo emergencyInfo = (EmergencyInfo) bngx.get(i3);
            List list2 = auiu.mo50573d().f91736r;
            int size5 = list2.size();
            int i4 = 0;
            while (true) {
                i = i3 + 1;
                if (i4 >= size5) {
                    break;
                }
                auiu.f91921b.add(new auix(auiu, emergencyInfo, (auft) list2.get(i4)));
                i4++;
            }
            i3 = i;
        }
        auiu.f91922c = location;
        C1223np npVar = auho.f91828a;
        ArrayList arrayList = new ArrayList(auiu.f91921b.size());
        List list3 = auiu.f91921b;
        int size6 = list3.size();
        for (int i5 = 0; i5 < size6; i5++) {
            auix auix = (auix) list3.get(i5);
            bmxy.m108600b(!auix.f91927c);
            auix.f91927c = true;
            auix.f91928d = auix.mo50576i();
            arrayList.add(bqdx.m112673a(bqdf.m112619a(auix.f91926b.mo50498a(auix.mo50572bN(), auix.f91925a, ((auiu) auix.f91931i).mo50573d(), location), Exception.class, new auiv(auix), bqfb.INSTANCE), new auiw(auix), auix.mo50572bN().f91796a));
        }
        bqgg a = bqdx.m112673a(bqga.m112774a((Iterable) arrayList), bmxm.m108539a(auiu), bqfb.INSTANCE);
        snl.m35700a(a);
        collection.add(a);
    }

    /* renamed from: b */
    private final auiu m77107b(long j) {
        return new auiu(this, j);
    }

    /* renamed from: d */
    private static boolean m77109d(Location location) {
        return location != null && auho.m77068a(location) < cgyq.f188062a.mo6606a().mo84773q();
    }

    /* renamed from: j */
    private final boolean m77110j() {
        boolean z;
        if (this.f91900f > 0) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108600b(z);
        if (this.f91900f > 1 || (this.f91903k && this.f91896b.isEmpty())) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List, java.util.Collection], assign insn: 0x001a: IGET  (r0v5 ? I:java.util.Collection) = (r6v0 'this' auiq A[THIS]) auiq.c java.util.Collection */
    /* renamed from: k */
    private final boolean m77111k() {
        boolean z;
        if (this.f91900f >= 3) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108600b(z);
        bmxy.m108600b(this.f91896b.isEmpty());
        if (this.f91900f <= 3) {
            ? r0 = this.f91897c;
            int size = r0.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                if (!((bqgg) r0.get(i)).isDone()) {
                    return false;
                }
                i = i2;
            }
        }
        return true;
    }

    /* renamed from: l */
    private final void m77112l() {
        LocationRequest locationRequest;
        int i = this.f91900f;
        aerw aerw = null;
        if (i == 1) {
            locationRequest = LocationRequest.m66854a();
            locationRequest.mo43553c(100);
            locationRequest.mo43554c(1000L);
        } else if (i == 2) {
            locationRequest = LocationRequest.m66854a();
            locationRequest.mo43553c(100);
            locationRequest.mo43554c(this.f91895a.f91735q);
            locationRequest.mo43552b(this.f91895a.f91735q);
        } else {
            locationRequest = null;
        }
        if (locationRequest != null) {
            LocationRequestInternal a = LocationRequestInternal.m66889a("Thunderbird", locationRequest);
            a.mo43611a();
            try {
                a.f79426h = ModuleManager.get(mo50572bN()).getCurrentModule().moduleId;
            } catch (IllegalStateException e) {
            }
            if (!this.f91895a.f91720b) {
                if (auhu.m77082b()) {
                    a.f79427i = true;
                }
                if (this.f91906n == null) {
                    auht auht = new auht(auhu.m77081a(), mo50572bN());
                    this.f91906n = auht;
                    auht.mo50538a();
                }
            }
            try {
                if (!this.f91904l) {
                    aucb l = mo50572bN().mo50517a().f63702b.mo24756l();
                    bqgy c = bqgy.m112818c();
                    l.mo50378a(bqfb.INSTANCE, new aeru(c));
                    bqgg a2 = bqdx.m112673a(c, new auim(this), mo50572bN().f91796a);
                    snl.m35700a(a2);
                    this.f91905m = a2;
                }
                aerx a3 = mo50572bN().mo50517a();
                bqgk bqgk = mo50572bN().f91796a;
                synchronized (a3.f63701a) {
                    aerw aerw2 = (aerw) a3.f63701a.get(this);
                    if (aerw2 == null || aerw2.f63699a == bqgk) {
                        aerw = aerw2;
                    } else {
                        aerw2.mo34499a();
                        a3.f63702b.mo24678a((aehz) aerw2);
                    }
                    if (aerw == null) {
                        aerw = new aerw(bqgk, this);
                        a3.f63701a.put(this, aerw);
                    }
                    a3.f63702b.mo24685a(a, aerw, Looper.getMainLooper());
                }
                this.f91904l = true;
            } catch (SecurityException e2) {
                Log.w("Thunderbird", "cannot retrieve location - lost permission", e2);
            }
        } else if (this.f91904l) {
            bqgg bqgg = this.f91905m;
            if (bqgg != null) {
                bqgg.cancel(true);
                this.f91905m = null;
            }
            aerx a4 = mo50572bN().mo50517a();
            synchronized (a4.f63701a) {
                aerw aerw3 = (aerw) a4.f63701a.remove(this);
                if (aerw3 != null) {
                    aerw3.mo34499a();
                    a4.f63702b.mo24678a((aehz) aerw3);
                }
            }
            this.f91904l = false;
            auht auht2 = this.f91906n;
            if (auht2 != null) {
                auht2.mo50539b();
                this.f91906n = null;
            }
        }
    }

    /* renamed from: m */
    private final auiu m77113m() {
        return m77107b(mo50576i());
    }

    /* access modifiers changed from: protected */
    /* renamed from: bL */
    public final ActivationInfo mo50561bL() {
        return this.f91899e.f109086a;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable
     arg types: [java.util.List, bmxj]
     candidates:
      bnjd.a(java.lang.Iterable, int):java.lang.Iterable
      bnjd.a(java.lang.Iterable, java.util.Comparator):java.lang.Iterable
      bnjd.a(java.lang.Iterable, bmxz):boolean
      bnjd.a(java.lang.Iterable, java.lang.Object):boolean
      bnjd.a(java.util.Collection, java.lang.Iterable):boolean
      bnjd.a(java.util.List, bmxz):boolean
      bnjd.a(java.lang.Iterable, java.lang.Class):java.lang.Object[]
      bnjd.a(java.lang.Iterable, java.lang.Object[]):java.lang.Object[]
      bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable */
    /* access modifiers changed from: protected */
    /* renamed from: bM */
    public final String mo50562bM() {
        String bM = super.mo50562bM();
        String str = this.f91895a.f91719a;
        String valueOf = String.valueOf(bnjd.m109575a((Iterable) this.f91899e.f109087b, auik.f91886a));
        int length = String.valueOf(bM).length();
        StringBuilder sb = new StringBuilder(length + 2 + String.valueOf(str).length() + String.valueOf(valueOf).length());
        sb.append(bM);
        sb.append(":");
        sb.append(str);
        sb.append(":");
        sb.append(valueOf);
        return sb.toString();
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List, java.util.Collection], assign insn: 0x0025: IGET  (r0v5 ? I:java.util.Collection) = (r5v0 'this' auiq A[THIS]) auiq.c java.util.Collection */
    /* renamed from: c */
    public final void mo50563c() {
        if (this.f91900f < 4) {
            for (bqgi bqgi : this.f91896b.values()) {
                bqgi.cancel(true);
            }
            this.f91896b.clear();
            ? r0 = this.f91897c;
            int size = r0.size();
            for (int i = 0; i < size; i++) {
                ((bqgg) r0.get(i)).cancel(true);
            }
            mo50557a(5);
        }
    }

    /* renamed from: e */
    public final boolean mo50565e() {
        return this.f91900f == 5;
    }

    /* renamed from: f */
    public final void mo50566f() {
        boolean z = false;
        if (this.f91900f == 2) {
            C1223np npVar = auho.f91828a;
            spf c = mo50572bN().mo50519c();
            long j = mo50561bL().f109075e + this.f91902h;
            ConfigWorker$AlarmListener configWorker$AlarmListener = this.f91910r;
            bqgk bqgk = mo50572bN().f91796a;
            if (j > 0) {
                z = true;
            }
            WorkSource workSource = f91894j;
            sdo.m34974b(z);
            synchronized (c.f44920a) {
                c.mo25931a("TrackingComplete", 2, j, c.mo25928a("TrackingComplete", 2, configWorker$AlarmListener, null, bqgk), (Handler) null, workSource);
            }
            this.f91909q = true;
        } else if (this.f91909q) {
            mo50572bN().mo50519c().mo25932a(this.f91910r);
            this.f91909q = false;
        }
    }

    /* renamed from: g */
    public final void mo50567g() {
        boolean z = false;
        if (this.f91900f == 2 && mo50564d()) {
            z = true;
        }
        bmxy.m108600b(z);
        mo50557a(3);
    }

    /* renamed from: h */
    public final void mo50568h() {
        int i = this.f91900f;
        if (i <= 3) {
            boolean z = false;
            if (i == 3 && m77111k()) {
                z = true;
            }
            bmxy.m108600b(z);
            bmxy.m108600b(!this.f91904l);
            bmxy.m108600b(!this.f91909q);
            mo50557a(4);
        }
    }

    /* renamed from: b */
    private final void m77108b(auiu auiu) {
        boolean z;
        if (this.f91900f < 3) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108600b(z);
        bmxy.m108600b(!this.f91896b.containsKey(auiu));
        long i = auiu.f91920a - mo50576i();
        if (auho.m77070a() && i > 0) {
            String valueOf = String.valueOf(auiu);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 41);
            sb.append(valueOf);
            sb.append(" scheduled work in ");
            sb.append(i);
            sb.append("ms");
            Log.d("Thunderbird", sb.toString());
        }
        if (i > 0) {
            bqgi a = mo50572bN().f91796a.mo25814a(new auin(this, auiu), i, TimeUnit.MILLISECONDS);
            snl.m35700a(a);
            if (!a.isDone()) {
                this.f91896b.put(auiu, a);
                return;
            }
            return;
        }
        mo50559a(auiu);
    }

    /* renamed from: d */
    public final boolean mo50564d() {
        boolean z;
        if (this.f91900f >= 2) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108600b(z);
        return this.f91900f > 2 || this.f91895a.f91735q == 0 || mo50576i() >= this.f91902h;
    }

    /* renamed from: b */
    public final boolean mo50560b(Location location) {
        if (this.f91907o || this.f91895a.mo50494a(mo50572bN(), this.f91899e, location) != null) {
            return false;
        }
        String valueOf = String.valueOf(this);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31);
        sb.append(valueOf);
        sb.append(" no longer matched by emergency");
        Log.i("Thunderbird", sb.toString());
        mo50563c();
        return true;
    }

    /* renamed from: a */
    private final void m77106a(boolean z) {
        boolean z2 = false;
        if (this.f91900f == 1 && m77110j()) {
            z2 = true;
        }
        bmxy.m108600b(z2);
        if (z && this.f91897c.isEmpty() && this.f91908p == null) {
            String valueOf = String.valueOf(this);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 53);
            sb.append(valueOf);
            sb.append(" unable to derive any location - sending empty report");
            Log.i("Thunderbird", sb.toString());
            m77105a(m77113m(), null);
        }
        mo50557a(2);
    }

    /* renamed from: a */
    public final void mo50557a(int i) {
        boolean z;
        String str;
        if (i > this.f91900f) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108588a(z);
        bmxy.m108600b(this.f91896b.isEmpty());
        if (i == 4) {
            bmxy.m108600b(this.f91900f == 3);
        }
        this.f91900f = i;
        if (auho.m77070a()) {
            String valueOf = String.valueOf(this);
            int i2 = this.f91900f;
            if (i2 != 0) {
                str = i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "CANCELED" : "FINISHED" : "PENDING_FINISHED" : "TRACKING" : "SAMPLING";
            } else {
                str = "READY";
            }
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19 + str.length());
            sb.append(valueOf);
            sb.append(" state switched to ");
            sb.append(str);
            Log.d("Thunderbird", sb.toString());
        }
        int i3 = this.f91900f;
        if (i3 == 1) {
            bmxy.m108600b(true);
            List list = this.f91895a.f91734p;
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                long longValue = ((Long) list.get(i4)).longValue();
                if (longValue < 0 || longValue > cgyq.m147648f()) {
                    String valueOf2 = String.valueOf(this);
                    long f = cgyq.m147648f();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 73);
                    sb2.append(valueOf2);
                    sb2.append(" delta ");
                    sb2.append(longValue);
                    sb2.append("ms is not in range [0, ");
                    sb2.append(f);
                    sb2.append("]ms");
                    Log.w("Thunderbird", sb2.toString());
                } else {
                    m77108b(m77107b(longValue));
                }
            }
            this.f91903k = true;
            if (m77110j()) {
                m77106a(false);
            } else {
                m77112l();
            }
        } else if (i3 == 2) {
            if (mo50564d()) {
                mo50567g();
                return;
            }
            m77112l();
            mo50566f();
        } else if (i3 == 3) {
            m77112l();
            mo50566f();
            if (m77111k()) {
                mo50568h();
            } else {
                snl.m35700a(bqga.m112782b(this.f91897c).mo69215a(new auil(this), mo50572bN().f91796a));
            }
        } else if (i3 == 4) {
            if (auho.m77070a()) {
                String valueOf3 = String.valueOf(this);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 16);
                sb3.append(valueOf3);
                sb3.append(" config complete");
                Log.d("Thunderbird", sb3.toString());
            }
            this.f91898d.mo50556b();
        } else if (i3 == 5) {
            m77112l();
            mo50566f();
            if (auho.m77070a()) {
                String valueOf4 = String.valueOf(this);
                StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf4).length() + 16);
                sb4.append(valueOf4);
                sb4.append(" config canceled");
                Log.d("Thunderbird", sb4.toString());
            }
            this.f91898d.mo50556b();
        }
    }

    /* renamed from: a */
    public final void mo50558a(long j) {
        if (j != this.f91902h) {
            this.f91902h = Math.min(j, cgyq.m147644b());
            if (this.f91900f != 2) {
                return;
            }
            if (mo50564d()) {
                mo50567g();
            } else {
                mo50566f();
            }
        }
    }

    /* renamed from: a */
    public final void mo7032a(Location location) {
        int i = this.f91900f;
        bmxy.m108600b(i == 1 ? true : i == 2);
        if (location != null && ((this.f91895a.f91720b || !aeim.m51907k(location)) && location.hasAccuracy() && location.getAccuracy() > 0.0f && location.getAccuracy() <= 20000.0f && auho.m77068a(location) > -5000 && m77109d(location))) {
            if (this.f91901g == null) {
                this.f91901g = location;
            }
            this.f91908p = location;
            int i2 = this.f91900f;
            if (i2 == 1) {
                if (this.f91895a.f91733o && this.f91897c.isEmpty()) {
                    if (auho.m77070a()) {
                        String valueOf = String.valueOf(this);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
                        sb.append(valueOf);
                        sb.append(" first time location");
                        Log.d("Thunderbird", sb.toString());
                    }
                    m77108b(m77113m());
                }
            } else if (i2 == 2) {
                m77108b(m77113m());
            }
        } else {
            Log.w("Thunderbird", "rejecting incoming location");
        }
    }

    /* renamed from: a */
    public final void mo50559a(auiu auiu) {
        boolean z;
        if (this.f91900f < 3) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108600b(z);
        this.f91896b.remove(auiu);
        Location location = this.f91908p;
        if (this.f91907o || !mo50560b(location)) {
            if (m77109d(location)) {
                this.f91907o = true;
                m77105a(auiu, location);
            } else if (auho.m77070a()) {
                String valueOf = String.valueOf(auiu);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
                sb.append(valueOf);
                sb.append(" no location to report");
                Log.d("Thunderbird", sb.toString());
            }
            if (this.f91900f == 1 && m77110j()) {
                m77106a(this.f91895a.f91730l.mo50497a());
            }
        }
    }
}
