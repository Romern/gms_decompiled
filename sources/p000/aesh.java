package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.Binder;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.internal.LocationRequestInternal;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

@Deprecated
/* renamed from: aesh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aesh implements rjz, rka {

    /* renamed from: d */
    private static final Object f63721d = new Object();

    /* renamed from: a */
    public final rkb f63722a;

    /* renamed from: b */
    public final LinkedHashMap f63723b = new LinkedHashMap();

    /* renamed from: c */
    public final aejn f63724c = aeie.f63413c;

    /* renamed from: e */
    private boolean f63725e = false;

    public aesh(Context context) {
        rjy rjy = new rjy(context);
        rjy.mo24779a(aeie.f63411a);
        rjy.mo24782a((rka) this);
        rjy.mo24781a((rjz) this);
        this.f63722a = rjy.mo24784b();
    }

    /* renamed from: a */
    private final void m52483a(Object obj, aesg aesg) {
        synchronized (this.f63723b) {
            this.f63723b.put(obj, aesg);
        }
        if (this.f63722a.mo24805i()) {
            m52484b(obj, aesg);
            return;
        }
        synchronized (this.f63722a) {
            if (this.f63725e && !this.f63722a.mo24806j()) {
                this.f63722a.mo24801e();
            }
        }
    }

    /* renamed from: b */
    private final void m52484b(Object obj, aesg aesg) {
        long clearCallingIdentity;
        try {
            clearCallingIdentity = Binder.clearCallingIdentity();
            aesg.mo34500a().mo9458a(new aese(this, aesg, obj));
            Binder.restoreCallingIdentity(clearCallingIdentity);
        } catch (IllegalStateException e) {
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            throw th;
        }
    }

    /* renamed from: c */
    public final Location mo34508c() {
        return aejn.m51936a(this.f63722a);
    }

    /* renamed from: d */
    public final LocationAvailability mo34509d() {
        try {
            return aeie.m51875a(this.f63722a).mo34260o();
        } catch (Exception e) {
            return null;
        }
    }

    /* renamed from: g */
    public final void mo7257g(Bundle bundle) {
        ArrayList arrayList;
        synchronized (this.f63723b) {
            arrayList = new ArrayList(this.f63723b.entrySet());
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Map.Entry entry = (Map.Entry) arrayList.get(i);
            m52484b(entry.getKey(), (aesg) entry.getValue());
        }
    }

    /* renamed from: b */
    public final void mo34507b() {
        synchronized (this.f63722a) {
            this.f63725e = false;
            this.f63722a.mo24803g();
        }
    }

    /* renamed from: a */
    public final void mo34501a() {
        synchronized (this.f63722a) {
            this.f63725e = true;
            this.f63722a.mo24801e();
        }
    }

    /* renamed from: a */
    public final void mo7244a(int i) {
        Log.e("FlpInternalHelper", "Connection suspended within location process for FLP connection");
    }

    /* renamed from: a */
    public final void mo34502a(aehy aehy) {
        m52483a(aehy, new aesa(this, aehy));
    }

    /* renamed from: a */
    public final void mo34503a(aesf aesf) {
        m52483a(f63721d, new aesd(this, aesf));
    }

    /* renamed from: a */
    public final void mo34504a(PendingIntent pendingIntent) {
        m52483a(pendingIntent, new aesb(this, pendingIntent));
    }

    /* renamed from: a */
    public final void mo7249a(ConnectionResult connectionResult) {
        Log.wtf("FlpInternalHelper", "Failed to connect to FLP from within location process", new Exception());
    }

    /* renamed from: a */
    public final void mo34505a(LocationRequestInternal locationRequestInternal, aehy aehy, Looper looper) {
        m52483a(aehy, new aery(this, locationRequestInternal, aehy, looper));
    }

    /* renamed from: a */
    public final void mo34506a(LocationRequestInternal locationRequestInternal, PendingIntent pendingIntent) {
        m52483a(pendingIntent, new aerz(this, locationRequestInternal, pendingIntent));
    }
}
