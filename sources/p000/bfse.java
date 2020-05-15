package p000;

import android.content.Context;
import android.location.Location;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.gms.location.LocationAvailability;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: bfse */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfse extends bfow implements std, bfrb {

    /* renamed from: a */
    private final bfpj f115110a;

    /* renamed from: b */
    private final ste f115111b;

    /* renamed from: c */
    private long f115112c = 0;

    /* renamed from: d */
    private boolean f115113d;

    /* renamed from: f */
    private Collection f115114f = Collections.emptyList();

    /* renamed from: g */
    private bfrb f115115g;

    public bfse(bfrc bfrc, Context context, Handler handler, bfpj bfpj) {
        super(bfrc);
        this.f115110a = bfpj;
        this.f115111b = new ste(context, handler);
    }

    /* renamed from: a */
    public final void mo62058a() {
        if (!this.f115113d) {
            this.f115113d = true;
            super.mo62058a();
            this.f115111b.mo26069a(this);
        }
    }

    /* renamed from: b */
    public final void mo62061b() {
        if (this.f115113d) {
            this.f115113d = false;
            this.f115111b.mo26067a();
            super.mo62061b();
        }
    }

    /* renamed from: cq */
    public final void mo26066cq() {
    }

    /* renamed from: f */
    public final void mo62122f(List list) {
        bfrb bfrb = this.f115115g;
        if (bfrb != null) {
            bfrb.mo62122f(list);
        }
    }

    /* renamed from: a */
    public final void mo62071a(bfrb bfrb) {
        this.f115115g = bfrb;
        super.mo62071a(this);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bfow.a(java.util.Collection, boolean):void
     arg types: [java.util.Collection, int]
     candidates:
      bfow.a(android.location.Location, int):void
      bfrc.a(android.location.Location, int):void
      bfow.a(java.util.Collection, boolean):void */
    /* renamed from: cp */
    public final void mo26065cp() {
        if (!cfag.f183542a.mo6606a().flpScreenOnLocationEnabled()) {
            return;
        }
        if (this.f115112c == 0 || SystemClock.elapsedRealtime() - this.f115112c >= cfag.f183542a.mo6606a().flpMinimumScreenOnLocationRequestTimeDeltaMillis()) {
            Location a = mo62068a(false);
            if (a != null) {
                int i = Build.VERSION.SDK_INT;
                if (SystemClock.elapsedRealtime() - TimeUnit.NANOSECONDS.toMillis(a.getElapsedRealtimeNanos()) < cfag.m138525b()) {
                    return;
                }
            }
            this.f115112c = SystemClock.elapsedRealtime();
            this.f115110a.mo26009a(36);
            mo62059a(this.f115114f, true);
        }
    }

    /* renamed from: a */
    public final void mo62121a(LocationAvailability locationAvailability) {
        bfrb bfrb = this.f115115g;
        if (bfrb != null) {
            bfrb.mo62121a(locationAvailability);
        }
    }

    /* renamed from: a */
    public final void mo62059a(Collection collection, boolean z) {
        this.f115114f = collection;
        super.mo62059a(collection, z);
    }
}
