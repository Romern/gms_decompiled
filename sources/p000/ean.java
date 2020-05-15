package p000;

import android.content.Context;
import android.location.Location;
import android.os.Looper;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.internal.LocationRequestInternal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: ean */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ean extends aehy {

    /* renamed from: e */
    protected static ean f14556e;

    /* renamed from: a */
    public final dzz f14557a = new dzz(cdgr.f180865bb, cdgr.f180864ba, cdgr.f180836aZ, false);

    /* renamed from: b */
    public final aesh f14558b;

    /* renamed from: c */
    public final aesj f14559c;

    /* renamed from: d */
    protected final HashSet f14560d = new HashSet();

    /* renamed from: f */
    private long f14561f = dwq.m9665i().mo20505a();

    /* renamed from: g */
    private final rjx f14562g;

    protected ean(Context context) {
        if (!cdgp.f180782a.mo6606a().mo77539aD()) {
            this.f14562g = null;
            aesh aesh = new aesh(context);
            this.f14558b = aesh;
            aesh.mo34501a();
            this.f14559c = new aesj(this.f14558b, this, Looper.getMainLooper());
            return;
        }
        this.f14562g = aeie.m51878c(context);
        this.f14558b = null;
        this.f14559c = new aesj(this.f14562g, this, Looper.getMainLooper());
    }

    /* renamed from: a */
    public static ean m9992a() {
        if (f14556e == null) {
            Context g = dwq.m9663g();
            if (g == null) {
                bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
                bnsl.mo68432a("ean", "a", 56, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("[SingletonLocationProducer] Failed to get chimera context.");
                g = dwq.m9662f();
            }
            ean ean = new ean(g);
            f14556e = ean;
            new Object[1][0] = ean;
        }
        return f14556e;
    }

    /* renamed from: b */
    public final void mo9911b() {
        new Object[1][0] = Integer.valueOf(this.f14557a.f14509a.size());
        ArrayList arrayList = new ArrayList(this.f14557a.f14509a.size() + 1);
        int a = this.f14557a.mo9895a();
        long b = this.f14557a.mo9899b();
        Object[] objArr = {Integer.valueOf(a), Long.valueOf(b)};
        LocationRequest a2 = LocationRequest.m66854a();
        a2.mo43553c(a);
        a2.mo43554c(b);
        arrayList.add(LocationRequestInternal.m66889a("SingletonLocationProducer", a2));
        for (dwa dwa : this.f14557a.f14509a) {
            this.f14557a.mo9896a(dwa.mo9753g());
            Object[] objArr2 = {Integer.valueOf(this.f14557a.f14512d), Long.valueOf(this.f14557a.f14513e), dwa.f14242b};
            LocationRequest a3 = LocationRequest.m66854a();
            a3.mo43553c(this.f14557a.f14512d);
            a3.mo43554c(this.f14557a.f14513e);
            LocationRequestInternal a4 = LocationRequestInternal.m66889a("SingletonLocationProducer", a3);
            dvz dvz = dwa.f14242b;
            a4.mo43613a(Collections.singletonList(new ClientIdentity(dvz.f14239b, dvz.mo9738a())));
            arrayList.add(a4);
        }
        this.f14559c.mo34511a(arrayList, false);
    }

    /* renamed from: c */
    public final void mo9912c() {
        Location location;
        aesh aesh = this.f14558b;
        if (aesh != null) {
            location = aesh.mo34508c();
        } else {
            try {
                location = (Location) aucu.m76783a(this.f14562g.mo24756l(), cdgp.f180782a.mo6606a().mo77565aj(), TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            } catch (ExecutionException | TimeoutException e2) {
                return;
            }
        }
        if (location != null && location.getTime() > this.f14561f + cdgp.m133212u()) {
            mo9909a(location);
        }
    }

    /* renamed from: a */
    public final void mo9909a(Location location) {
        this.f14561f = location.getTime();
        Iterator it = this.f14560d.iterator();
        while (it.hasNext()) {
            ((aehz) it.next()).mo7032a(location);
        }
    }

    /* renamed from: a */
    public final void mo9910a(LocationResult locationResult) {
        dwq.m9667k().mo9435a(new eam(this, locationResult), dqy.m9123a("SingletonLocationProducer_onLocationChanged"));
    }
}
