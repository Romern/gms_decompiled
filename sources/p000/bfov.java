package p000;

import android.content.Context;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.internal.LocationRequestInternal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: bfov */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfov extends bfsm implements bfrb, bfsk {

    /* renamed from: g */
    private static final bmxz f114721g = bfou.f114720a;

    /* renamed from: a */
    public final bfsl f114722a;

    /* renamed from: b */
    public final bfpj f114723b;

    /* renamed from: c */
    public boolean f114724c = false;

    /* renamed from: d */
    public boolean f114725d;

    /* renamed from: h */
    private final bfrn f114726h = new bfrn();

    /* renamed from: i */
    private final bfrn f114727i = new bfrn();

    /* renamed from: j */
    private final ArrayList f114728j = new ArrayList();

    /* renamed from: k */
    private boolean f114729k = false;

    /* renamed from: l */
    private Collection f114730l = Collections.emptyList();

    /* renamed from: m */
    private boolean f114731m = false;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bfov(bfrc bfrc, Context context, Looper looper, bfpj bfpj) {
        super(bfrc, new sti(context, looper), spf.m35821a(context), looper);
        bfsl bfsl = new bfsl(context, looper);
        this.f114723b = bfpj;
        this.f114722a = bfsl;
    }

    /* renamed from: b */
    private final void m97433b(boolean z) {
        Collection collection;
        if (!this.f114725d) {
            collection = this.f114730l;
        } else {
            if (!this.f114729k) {
                this.f114728j.ensureCapacity(this.f114730l.size());
                this.f114729k = true;
                long flpThrottleWhenStillIntervalMs = cewd.f183471a.mo6606a().flpThrottleWhenStillIntervalMs();
                for (LocationRequestInternal locationRequestInternal : this.f114730l) {
                    LocationRequest locationRequest = locationRequestInternal.f79420b;
                    if (locationRequest.f79355g <= 0.0f) {
                        if (cewd.m138340c() && ((long) locationRequest.f79349a) >= cewd.m138339b() && locationRequest.f79350b < flpThrottleWhenStillIntervalMs) {
                            LocationRequest locationRequest2 = new LocationRequest(locationRequest);
                            locationRequestInternal = LocationRequestInternal.m66888a(locationRequestInternal);
                            locationRequestInternal.mo43612a(locationRequest2);
                            locationRequest2.mo43554c(flpThrottleWhenStillIntervalMs);
                        }
                        this.f114728j.add(locationRequestInternal);
                    }
                }
            }
            collection = this.f114728j;
        }
        if (this.f114725d && z) {
            mo62212i();
            z = false;
        }
        this.f114732e.mo62059a(collection, z);
    }

    /* renamed from: j */
    private final void m97434j() {
        if (this.f114724c && this.f114731m) {
            bfsl bfsl = this.f114722a;
            if (!bfsl.f115137l) {
                bfsl.f115137l = true;
                bfsa bfsa = bfsl.f115130e;
                bfsa.f115095i = bfsl;
                bfsa.mo62202d();
                bfsl.f115136k.mo62210e();
                return;
            }
            return;
        }
        bfsl bfsl2 = this.f114722a;
        if (bfsl2.f115137l) {
            bfsl2.f115137l = false;
            bfsl2.f115130e.mo62203e();
            bfsf bfsf = bfsl2.f115136k;
            bfsf.mo62204a(bfsf.f115116a.f115131f);
        }
    }

    /* renamed from: a */
    public final void mo62058a() {
        if (!this.f114731m) {
            this.f114731m = true;
            this.f114725d = false;
            bfsl bfsl = this.f114722a;
            if (bfsl.f115136k != bfsl.f115131f) {
                Log.wtf("GCoreFlp", new IllegalStateException("Called setCallback when stationary device helper was enabled."));
            }
            bfsl.f115135j = this;
            m97434j();
            m97433b(false);
            super.mo62058a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo62062c() {
        this.f114722a.f115136k.mo62209d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final Collection mo62063d() {
        return this.f114727i.f115043k;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final boolean mo62064e() {
        return this.f114725d;
    }

    /* renamed from: f */
    public final boolean mo62065f() {
        m97433b(false);
        return super.mo62065f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final long mo62066g() {
        return Math.max(cewd.f183471a.mo6606a().minSyntheticSmdDeliveryMs(), this.f114727i.f115038f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final String mo62067h() {
        return "activity stationary engine";
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.b(java.lang.Iterable, bmxz):java.lang.Iterable
     arg types: [java.util.Collection, bmxz]
     candidates:
      bnjd.b(java.lang.Iterable, int):java.lang.Object
      bnjd.b(java.lang.Iterable, java.lang.Object):java.lang.Object
      bnjd.b(java.lang.Iterable, bmxz):java.lang.Iterable */
    /* renamed from: a */
    public final void mo62059a(Collection collection, boolean z) {
        boolean z2;
        this.f114727i.mo62182a(bnjd.m109586b((Iterable) collection, bfrn.f115033a));
        this.f114726h.mo62182a(bnjd.m109586b((Iterable) collection, f114721g));
        bfsl bfsl = this.f114722a;
        double flpSmdSwitchIntervalFactor = cewd.f183471a.mo6606a().flpSmdSwitchIntervalFactor();
        long j = this.f114727i.f115038f;
        double d = (double) j;
        Double.isNaN(d);
        bfsl.f115139n = (long) (flpSmdSwitchIntervalFactor * d);
        long j2 = this.f114726h.f115038f;
        if (j2 > j || j2 > cewd.f183471a.mo6606a().flpSmdIntervalThresholdMs()) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.f114724c = z2;
        this.f114730l = collection;
        this.f114728j.clear();
        this.f114729k = false;
        m97434j();
        if (this.f114724c || !this.f114725d) {
            m97433b(z);
            return;
        }
        this.f114725d = false;
        mo62065f();
    }

    /* renamed from: b */
    public final void mo62061b() {
        if (this.f114731m) {
            this.f114731m = false;
            m97434j();
            m97433b(false);
            super.mo62061b();
        }
    }

    /* renamed from: a */
    public final void mo62060a(List list) {
        this.f114722a.mo62211b(list);
    }
}
