package p000;

import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.internal.LocationRequestInternal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: bfrn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfrn {

    /* renamed from: a */
    public static final bmxz f115033a = bfri.f115028a;

    /* renamed from: b */
    public static final bmxz f115034b = bfrj.f115029a;

    /* renamed from: c */
    public static final bmxz f115035c = bfrk.f115030a;

    /* renamed from: d */
    public static final bmxz f115036d = bfrl.f115031a;

    /* renamed from: e */
    public static final bmxz f115037e = bfrm.f115032a;

    /* renamed from: f */
    public long f115038f;

    /* renamed from: g */
    public long f115039g;

    /* renamed from: h */
    public int f115040h;

    /* renamed from: i */
    public int f115041i;

    /* renamed from: j */
    public boolean f115042j;

    /* renamed from: k */
    public final Collection f115043k = new ArrayList();

    /* renamed from: l */
    public final Collection f115044l = new ArrayList();

    /* renamed from: m */
    private float f115045m;

    public bfrn() {
        mo62182a(Collections.emptyList());
    }

    /* renamed from: a */
    public final void mo62181a() {
        mo62182a(Collections.emptyList());
    }

    /* renamed from: b */
    public final boolean mo62183b() {
        long j = this.f115039g;
        return j / 2 >= this.f115038f && j > 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bfrn) {
            bfrn bfrn = (bfrn) obj;
            if (this.f115038f != bfrn.f115038f || this.f115039g != bfrn.f115039g || !bxbl.m122538a(this.f115043k, bfrn.f115043k) || !bxbl.m122538a(this.f115044l, bfrn.f115044l)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f115038f), Long.valueOf(this.f115039g), this.f115043k, this.f115044l});
    }

    public final String toString() {
        long j = this.f115038f;
        long j2 = this.f115039g;
        String valueOf = String.valueOf(this.f115043k);
        String valueOf2 = String.valueOf(this.f115044l);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 138 + String.valueOf(valueOf2).length());
        sb.append("LocationRequestSummary[minIntervalMs ");
        sb.append(j);
        sb.append(", maxWaitTimeMs ");
        sb.append(j2);
        sb.append(", blameClients ");
        sb.append(valueOf);
        sb.append(", blamedGmsCoreComponentTags ");
        sb.append(valueOf2);
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo62182a(Iterable iterable) {
        this.f115038f = Long.MAX_VALUE;
        this.f115039g = Long.MAX_VALUE;
        this.f115045m = Float.MAX_VALUE;
        this.f115040h = 0;
        this.f115041i = 0;
        this.f115042j = false;
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            LocationRequestInternal locationRequestInternal = (LocationRequestInternal) it.next();
            LocationRequest locationRequest = locationRequestInternal.f79420b;
            long j = locationRequest.f79350b;
            if (j < this.f115038f) {
                this.f115038f = j;
            }
            long b = locationRequest.mo43550b();
            if (b < this.f115039g) {
                this.f115039g = b;
            }
            float f = locationRequest.f79355g;
            if (f < this.f115045m) {
                this.f115045m = f;
            }
            int i = locationRequest.f79349a;
            if (i == 100) {
                this.f115040h++;
            } else if (i == 102) {
                this.f115041i++;
            }
            this.f115042j = locationRequestInternal.f79427i | this.f115042j;
        }
        float f2 = this.f115045m;
        if (f2 == Float.MAX_VALUE) {
            f2 = 0.0f;
        }
        this.f115045m = f2;
        this.f115043k.clear();
        this.f115044l.clear();
        long j2 = this.f115038f;
        if (j2 < Long.MAX_VALUE) {
            long j3 = ((j2 + 1000) * 3) / 2;
            Iterator it2 = iterable.iterator();
            while (it2.hasNext()) {
                LocationRequestInternal locationRequestInternal2 = (LocationRequestInternal) it2.next();
                if (locationRequestInternal2.f79420b.f79350b < j3) {
                    this.f115043k.addAll(locationRequestInternal2.f79421c);
                    String str = locationRequestInternal2.f79422d;
                    if (str != null) {
                        this.f115044l.add(str);
                    }
                }
            }
        }
    }
}
