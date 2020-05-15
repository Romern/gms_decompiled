package p000;

import android.content.Context;
import android.location.Location;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.internal.LocationRequestInternal;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* renamed from: bfqk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bfqk extends squ {

    /* renamed from: a */
    final /* synthetic */ bfqm f114861a;

    /* renamed from: b */
    private boolean f114862b = false;

    /* renamed from: g */
    private boolean f114863g = false;

    /* renamed from: h */
    private long f114864h = Long.MAX_VALUE;

    /* renamed from: i */
    private long f114865i = Long.MAX_VALUE;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bfqk(bfqm bfqm, Context context, Handler handler, sss sss) {
        super(bfqm.f114869a, context, handler, bfqm.f114893t, bfqm.f114880g, sss);
        this.f114861a = bfqm;
        mo25988a(bfqm.f114870b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo9714a(int i) {
        boolean z;
        long j;
        String[] strArr;
        boolean z2;
        if (this.f114861a.f114899z != cesn.m138187b()) {
            bfqm bfqm = this.f114861a;
            if (bfqm.f114899z) {
                bfqm.mo62143b();
            } else {
                bfqm.mo62129a();
            }
            for (bfph bfph : mo25992c()) {
                bfph.f114776l = this.f114861a.mo62141a(bfph);
            }
        }
        int i2 = i & 5;
        if (i2 == 0 || !this.f114862b) {
            z = false;
        } else {
            if (i2 == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            z = this.f114861a.f114895v.mo63542a(this.f114863g, this.f114864h, z2, this.f114865i);
        }
        bfqm bfqm2 = this.f114861a;
        bfqm2.f114878e.mo62059a(bfqm2.mo62144c(), z);
        this.f114862b = false;
        this.f114863g = false;
        long j2 = Long.MAX_VALUE;
        this.f114864h = Long.MAX_VALUE;
        this.f114865i = Long.MAX_VALUE;
        if ((i & 40) != 0) {
            for (bfph bfph2 : mo25993d()) {
                bfph2.mo62092b(bfqm.f114871c);
            }
        }
        bfqm bfqm3 = this.f114861a;
        if (bfqm3.f114898y) {
            if (bfqm3.f114883j.mo25992c().isEmpty() && this.f114861a.f114883j.mo25993d().isEmpty()) {
                bfqm bfqm4 = this.f114861a;
                bfqm4.f114898y = false;
                bfqm4.f114872A.mo17933a();
                bfqm4.f114884k.mo34481a(bfqm4);
                if (bfqm4.f114899z) {
                    bfqm4.mo62143b();
                }
                bfqm4.f114883j.mo25988a(bfqm.f114870b);
            }
        } else if (!bfqm3.f114883j.mo25992c().isEmpty() || !this.f114861a.f114883j.mo25993d().isEmpty()) {
            bfqm bfqm5 = this.f114861a;
            bfqm5.f114898y = true;
            bfqm5.f114872A.mo17934a(bfqm5.f114889p.f118291c);
            bfqm5.f114884k.mo34482a(bfqm5, bfqm5.f114889p.mo63548a());
            bfqk bfqk = bfqm5.f114883j;
            if (bfqm5.f114884k.mo34487a("gps")) {
                strArr = bfqm.f114869a;
            } else {
                strArr = bfqm.f114870b;
            }
            bfqk.mo25988a(strArr);
            if (!bfqm5.f114899z && cesn.m138187b()) {
                bfqm5.mo62129a();
            }
        }
        if ((i & 7) != 0) {
            bfqm bfqm6 = this.f114861a;
            LocationRequestInternal locationRequestInternal = null;
            for (bfph bfph3 : bfqm6.f114883j.mo25992c()) {
                LocationRequestInternal locationRequestInternal2 = bfph3.f114767c;
                long j3 = locationRequestInternal2.f79420b.f79353e;
                if (j3 < j2) {
                    locationRequestInternal = locationRequestInternal2;
                }
                if (j3 < j2) {
                    j2 = j3;
                }
            }
            if (locationRequestInternal != null) {
                if (j2 == 0) {
                    j = SystemClock.elapsedRealtime();
                } else {
                    j = j2;
                }
                bfqm6.f114888o.mo25930a("com.google.android.gms.location.fused.EXPIRATION_ALARM", 3, j, bfqm6.f114887n, bfqm6.f114886m, saq.m34797a(locationRequestInternal.f79421c));
                return;
            }
            bfqm6.f114888o.mo25932a(bfqm6.f114887n);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bfqm.a(bfqm, int, java.lang.String, java.lang.String, boolean, boolean):android.location.Location
     arg types: [bfqm, int, java.lang.String, java.lang.String, boolean, int]
     candidates:
      bfqm.a(int, java.lang.String, java.lang.String, boolean, boolean, boolean):android.location.Location
      bfqm.a(bfqm, int, java.lang.String, java.lang.String, boolean, boolean):android.location.Location */
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo9718b(sqt sqt) {
        long j;
        long j2;
        long j3;
        Location a;
        bfph bfph = (bfph) sqt;
        LocationRequest locationRequest = bfph.f114767c.f79420b;
        if (locationRequest.f79349a != 105) {
            this.f114862b = true;
            boolean z = bfph.f114776l;
            this.f114863g = z;
            if (!z) {
                j2 = bhbd.m100559a(locationRequest.mo43555c());
            } else {
                j2 = locationRequest.f79350b;
            }
            this.f114864h = Math.min(this.f114864h, j2);
            if (cevw.f183465a.mo6606a().supportMaxLocationAge()) {
                long min = Math.min(bfph.f114767c.f79430l, this.f114865i);
                this.f114865i = min;
                j3 = min;
            } else {
                this.f114865i = Long.MAX_VALUE;
                j3 = Long.MAX_VALUE;
            }
            if (!this.f114861a.f114895v.mo63542a(this.f114863g, this.f114864h, false, j3) && (a = this.f114861a.mo62127a(bfph.f114765a, bfph.f114766b, bfph.f114767c.f79429k, bfph.f114768d, bfph.f114769e, false)) != null) {
                this.f114861a.mo62138a(Collections.singletonList(a), bfph);
                bfph.mo62092b(this.f114861a.mo62128a(bfph.f114765a, bfph.f114766b, bfph.f114768d));
            }
        }
        int i = Build.VERSION.SDK_INT;
        Location a2 = this.f114861a.mo62127a(bfph.f114765a, bfph.f114766b, bfph.f114767c.f79429k, bfph.f114768d, false, false);
        if (a2 != null) {
            j = TimeUnit.NANOSECONDS.toMillis(a2.getElapsedRealtimeNanos());
        } else {
            j = SystemClock.elapsedRealtime();
        }
        bfph.f114775k = j - cevw.f183465a.mo6606a().flpAllowedDeliveryAgeMs();
        bfqm bfqm = this.f114861a;
        LocationRequestInternal locationRequestInternal = bfph.f114767c;
        for (ClientIdentity clientIdentity : locationRequestInternal.f79421c) {
            LocationRequest locationRequest2 = locationRequestInternal.f79420b;
            bfqm.f114890q.mo26056a(new bfql(clientIdentity.f30222b, locationRequest2.f79349a, locationRequestInternal.f79422d), locationRequest2.f79350b);
        }
        bfpj bfpj = this.f114861a.f114894u;
        bfpj.mo26010a(6, bfpj.f114791k.mo62094a(bfph.f114767c.f79421c));
    }

    /* renamed from: c */
    public final void mo62123c(Object obj) {
        if (cevw.f183465a.mo6606a().bugfixReleaseClientResource()) {
            bfph bfph = (bfph) super.mo25984a(obj);
            if (bfph != null) {
                bfph.mo62087b();
                return;
            }
            return;
        }
        bfph bfph2 = (bfph) super.mo25984a(obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9717a(sqt sqt) {
        bfph bfph = (bfph) sqt;
        bfqm bfqm = this.f114861a;
        LocationRequestInternal locationRequestInternal = bfph.f114767c;
        for (ClientIdentity clientIdentity : locationRequestInternal.f79421c) {
            LocationRequest locationRequest = locationRequestInternal.f79420b;
            bfqm.f114890q.mo26057b(new bfql(clientIdentity.f30222b, locationRequest.f79349a, locationRequestInternal.f79422d), locationRequest.f79350b);
        }
        bfpj bfpj = this.f114861a.f114894u;
        bfpj.mo26010a(7, bfpj.f114791k.mo62094a(bfph.f114767c.f79421c));
    }
}
