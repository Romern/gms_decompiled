package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.awareness.snapshot.internal.BeaconStateImpl;
import com.google.android.gms.nearby.messages.MessageFilter;
import com.google.android.gms.nearby.messages.Strategy;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: dzb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class dzb {

    /* renamed from: a */
    public final String f14455a;

    /* renamed from: b */
    public final aixg f14456b;

    /* renamed from: c */
    public final HashSet f14457c;

    /* renamed from: d */
    public HashSet f14458d;

    /* renamed from: e */
    public PendingIntent f14459e = null;

    /* renamed from: f */
    public int f14460f = -1;

    /* renamed from: g */
    public final dzz f14461g;

    /* renamed from: h */
    final /* synthetic */ dzc f14462h;

    /* renamed from: i */
    private final aixf f14463i;

    /* renamed from: j */
    private boolean f14464j;

    public dzb(dzc dzc, Context context, String str) {
        this.f14462h = dzc;
        sdo.m34977c(str);
        this.f14455a = str;
        aixh aixh = new aixh();
        aixh.mo38209a("0p:com.google.android.contextmanager");
        aixh.mo38210b();
        aixh.f69978c = str;
        this.f14456b = ahcb.m55440a(context, aixh.mo38208a());
        this.f14457c = new HashSet();
        this.f14458d = new HashSet();
        this.f14463i = new dza(dzc);
        this.f14461g = new dzz(null, null, cdgr.f180875i);
        this.f14464j = false;
    }

    /* renamed from: a */
    private static final aixd m9858a(HashSet hashSet) {
        aixd aixd = new aixd();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            BeaconStateImpl.TypeFilterImpl typeFilterImpl = (BeaconStateImpl.TypeFilterImpl) it.next();
            aixd.mo38201a(typeFilterImpl.mo8038a(), typeFilterImpl.mo8040b());
        }
        return aixd;
    }

    /* renamed from: b */
    private final void m9861b() {
        this.f14456b.mo38204a(this.f14463i).mo50371a(new dqi("[DetectedBeaconProducer] unsubscribe foreground, package=%s", this.f14455a));
        this.f14464j = false;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, int, java.lang.Object):void
     arg types: [java.lang.String, int, java.lang.String]
     candidates:
      bnsi.a(java.lang.String, byte, byte):void
      bnsi.a(java.lang.String, double, double):void
      bnsi.a(java.lang.String, int, byte):void
      bnsi.a(java.lang.String, int, int):void
      bnsi.a(java.lang.String, int, long):void
      bnsi.a(java.lang.String, int, boolean):void
      bnsi.a(java.lang.String, long, int):void
      bnsi.a(java.lang.String, long, long):void
      bnsi.a(java.lang.String, long, java.lang.Object):void
      bnsi.a(java.lang.String, long, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, byte):void
      bnsi.a(java.lang.String, java.lang.Object, int):void
      bnsi.a(java.lang.String, java.lang.Object, long):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object):void
      bnsi.a(java.lang.String, java.lang.Object, boolean):void
      bnsi.a(java.lang.String, boolean, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, boolean):void
      bnsi.a(java.lang.String, int, java.lang.Object):void */
    /* renamed from: c */
    private final HashSet m9862c() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f14457c.iterator();
        while (it.hasNext()) {
            dwa dwa = (dwa) it.next();
            if (!dwa.mo9752f()) {
                bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
                bnsl.mo68432a("dzb", "c", 671, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68424a("[DetectedBeaconProducer] No production policy found for interestRecord=%s for package=%s", dwa, this.f14455a);
            } else {
                dwk g = dwa.mo9753g();
                if (g.mo9780a() != 4) {
                    bnsl bnsl2 = (bnsl) dss.f13961a.mo68387b();
                    bnsl2.mo68432a("dzb", "c", 681, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl2.mo68413a("[DetectedBeaconProducer] production policy type is wrong (found to be %s), package=%s", g.mo9780a(), (Object) this.f14455a);
                } else {
                    bxdf bxdf = g.f14274a;
                    String str = bxdf.f163024e;
                    String str2 = bxdf.f163025f;
                    if (str == null || str2 == null) {
                        bnsl bnsl3 = (bnsl) dss.f13961a.mo68387b();
                        bnsl3.mo68432a("dzb", "c", 692, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl3.mo68425a("[DetectedBeaconProducer] Missing beacon namespace(%s) or type(%s), package=%s", str, str2, this.f14455a);
                    }
                    hashSet.add(new BeaconStateImpl.TypeFilterImpl(str, str2));
                }
            }
        }
        return hashSet;
    }

    /* renamed from: a */
    private final void m9859a(HashSet hashSet, aixd aixd) {
        aiyl aiyl = new aiyl();
        aiyl.f70070a = Strategy.f80689b;
        aiyl.f70071b = aixd.mo38199a();
        this.f14456b.mo38205a(this.f14463i, aiyl.mo38273a()).mo50371a(new dqi("[DetectedBeaconProducer] subscribe ble=%s, package=%s, pendigngIntentId=%s", hashSet, this.f14455a, this.f14463i));
        this.f14464j = true;
    }

    /* renamed from: a */
    private final void m9860a(boolean z) {
        long j = this.f14461g.f14511c;
        HashSet hashSet = this.f14458d;
        if (hashSet.size() == 0 && this.f14464j) {
            m9861b();
        } else if (z) {
            if (j < this.f14461g.mo9899b()) {
                m9859a(hashSet, m9858a(hashSet));
            } else if (this.f14464j) {
                m9861b();
            }
        } else if (this.f14464j) {
            if (j >= this.f14461g.mo9899b()) {
                m9861b();
            }
        } else if (j < this.f14461g.mo9899b()) {
            m9859a(hashSet, m9858a(hashSet));
        }
    }

    /* renamed from: a */
    public final void mo9887a(dwa dwa) {
        new Object[1][0] = dwa;
        this.f14457c.remove(dwa);
        this.f14461g.mo9897a(dwa);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, int, java.lang.Object):void
     arg types: [java.lang.String, int, java.lang.String]
     candidates:
      bnsi.a(java.lang.String, byte, byte):void
      bnsi.a(java.lang.String, double, double):void
      bnsi.a(java.lang.String, int, byte):void
      bnsi.a(java.lang.String, int, int):void
      bnsi.a(java.lang.String, int, long):void
      bnsi.a(java.lang.String, int, boolean):void
      bnsi.a(java.lang.String, long, int):void
      bnsi.a(java.lang.String, long, long):void
      bnsi.a(java.lang.String, long, java.lang.Object):void
      bnsi.a(java.lang.String, long, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, byte):void
      bnsi.a(java.lang.String, java.lang.Object, int):void
      bnsi.a(java.lang.String, java.lang.Object, long):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object):void
      bnsi.a(java.lang.String, java.lang.Object, boolean):void
      bnsi.a(java.lang.String, boolean, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, boolean):void
      bnsi.a(java.lang.String, int, java.lang.Object):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, java.lang.Object, int):void
     arg types: [java.lang.String, java.lang.String, int]
     candidates:
      bnsi.a(java.lang.String, byte, byte):void
      bnsi.a(java.lang.String, double, double):void
      bnsi.a(java.lang.String, int, byte):void
      bnsi.a(java.lang.String, int, int):void
      bnsi.a(java.lang.String, int, long):void
      bnsi.a(java.lang.String, int, java.lang.Object):void
      bnsi.a(java.lang.String, int, boolean):void
      bnsi.a(java.lang.String, long, int):void
      bnsi.a(java.lang.String, long, long):void
      bnsi.a(java.lang.String, long, java.lang.Object):void
      bnsi.a(java.lang.String, long, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, byte):void
      bnsi.a(java.lang.String, java.lang.Object, long):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object):void
      bnsi.a(java.lang.String, java.lang.Object, boolean):void
      bnsi.a(java.lang.String, boolean, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, int):void */
    /* renamed from: a */
    public final boolean mo9888a() {
        HashSet hashSet;
        HashSet hashSet2 = new HashSet();
        Iterator it = this.f14457c.iterator();
        while (it.hasNext()) {
            dwa dwa = (dwa) it.next();
            if (!dwa.mo9752f()) {
                bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
                bnsl.mo68432a("dzb", "c", 671, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68424a("[DetectedBeaconProducer] No production policy found for interestRecord=%s for package=%s", dwa, this.f14455a);
            } else {
                dwk g = dwa.mo9753g();
                if (g.mo9780a() != 4) {
                    bnsl bnsl2 = (bnsl) dss.f13961a.mo68387b();
                    bnsl2.mo68432a("dzb", "c", 681, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl2.mo68413a("[DetectedBeaconProducer] production policy type is wrong (found to be %s), package=%s", g.mo9780a(), (Object) this.f14455a);
                } else {
                    bxdf bxdf = g.f14274a;
                    String str = bxdf.f163024e;
                    String str2 = bxdf.f163025f;
                    if (str == null || str2 == null) {
                        bnsl bnsl3 = (bnsl) dss.f13961a.mo68387b();
                        bnsl3.mo68432a("dzb", "c", 692, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl3.mo68425a("[DetectedBeaconProducer] Missing beacon namespace(%s) or type(%s), package=%s", str, str2, this.f14455a);
                    }
                    hashSet2.add(new BeaconStateImpl.TypeFilterImpl(str, str2));
                }
            }
        }
        if (hashSet2.equals(this.f14458d)) {
            m9860a(false);
            return true;
        }
        aixd aixd = new aixd();
        Iterator it2 = hashSet2.iterator();
        int i = 0;
        while (it2.hasNext()) {
            BeaconStateImpl.TypeFilterImpl typeFilterImpl = (BeaconStateImpl.TypeFilterImpl) it2.next();
            aixd.mo38201a(typeFilterImpl.mo8038a(), typeFilterImpl.mo8040b());
            i++;
        }
        if (i == 0) {
            PendingIntent pendingIntent = this.f14459e;
            if (pendingIntent != null) {
                this.f14456b.mo38207e(pendingIntent).mo50371a(new dqi("[DetectedBeaconProducer] unsubscribe beacons, package=%s", this.f14455a));
            }
        } else if (this.f14459e != null) {
            aiyl aiyl = new aiyl();
            aiyl.f70070a = Strategy.f80689b;
            aiyl.f70071b = aixd.mo38199a();
            aiyl.mo38274b();
            this.f14456b.mo38206a(this.f14459e, aiyl.mo38273a()).mo50371a(new dqi("[DetectedBeaconProducer] subscribe beacons=%s, package=%s", hashSet2, this.f14455a));
        } else {
            dzc dzc = this.f14462h;
            dxr dxr = dzc.f14465b;
            int i2 = 5;
            if (dzc.f14466k.size() > 5) {
                bnsl bnsl4 = (bnsl) dss.f13961a.mo68387b();
                bnsl4.mo68432a("dzb", "a", 627, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl4.mo68420a("[DetectedBeaconProducer] Over the limit for subscribing to Nearby. package=%s", this.f14455a);
            } else {
                HashSet hashSet3 = null;
                for (dzb dzb : this.f14462h.f14466k.values()) {
                    int i3 = dzb.f14460f;
                    if (i3 != -1) {
                        if (hashSet3 == null) {
                            hashSet3 = new HashSet();
                        }
                        hashSet3.add(Integer.valueOf(i3));
                    }
                }
                MessageFilter a = aixd.mo38199a();
                int i4 = 0;
                while (true) {
                    if (i4 >= i2) {
                        break;
                    }
                    if (hashSet3 != null && hashSet3.contains(Integer.valueOf(i4))) {
                        hashSet = hashSet3;
                    } else {
                        Intent intent = new Intent("com.google.android.contextmanager.module.DetectedBeaconProducer");
                        intent.setPackage("com.google.android.gms");
                        PendingIntent broadcast = PendingIntent.getBroadcast(this.f14462h.f14388d, i4, intent, 134217728);
                        aiyl aiyl2 = new aiyl();
                        aiyl2.f70070a = Strategy.f80689b;
                        aiyl2.f70071b = a;
                        aiyl2.mo38274b();
                        try {
                            hashSet = hashSet3;
                            try {
                                aucu.m76783a(this.f14456b.mo38206a(broadcast, aiyl2.mo38273a()), 5000, TimeUnit.MILLISECONDS);
                                this.f14459e = broadcast;
                                this.f14460f = i4;
                                if (dss.m9250a(2)) {
                                    Object[] objArr = {hashSet2, this.f14455a, Integer.valueOf(i4)};
                                }
                            } catch (InterruptedException | ExecutionException | TimeoutException e) {
                                e = e;
                                bnsl bnsl5 = (bnsl) dss.f13961a.mo68387b();
                                bnsl5.mo68437a(e);
                                bnsl5.mo68432a("dzb", "a", 613, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                bnsl5.mo68422a("[DetectedBeaconProducer] Failed subscribe first time: package=%s,pendingIntentId=%s", (Object) this.f14455a, i4);
                                i4++;
                                hashSet3 = hashSet;
                                i2 = 5;
                            }
                        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
                            e = e2;
                            hashSet = hashSet3;
                            bnsl bnsl52 = (bnsl) dss.f13961a.mo68387b();
                            bnsl52.mo68437a(e);
                            bnsl52.mo68432a("dzb", "a", 613, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl52.mo68422a("[DetectedBeaconProducer] Failed subscribe first time: package=%s,pendingIntentId=%s", (Object) this.f14455a, i4);
                            i4++;
                            hashSet3 = hashSet;
                            i2 = 5;
                        }
                    }
                    i4++;
                    hashSet3 = hashSet;
                    i2 = 5;
                }
            }
        }
        this.f14458d = hashSet2;
        m9860a(true);
        return i > 0;
    }
}
