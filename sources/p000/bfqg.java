package p000;

import android.content.Context;
import com.google.android.gms.location.internal.LocationRequestInternal;

/* renamed from: bfqg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfqg implements Runnable {

    /* renamed from: a */
    final /* synthetic */ int f114848a;

    /* renamed from: b */
    final /* synthetic */ String f114849b;

    /* renamed from: c */
    final /* synthetic */ LocationRequestInternal f114850c;

    /* renamed from: d */
    final /* synthetic */ boolean f114851d;

    /* renamed from: e */
    final /* synthetic */ boolean f114852e;

    /* renamed from: f */
    final /* synthetic */ aeht f114853f;

    /* renamed from: g */
    final /* synthetic */ aejv f114854g;

    /* renamed from: h */
    final /* synthetic */ bfqm f114855h;

    public bfqg(bfqm bfqm, int i, String str, LocationRequestInternal locationRequestInternal, boolean z, boolean z2, aeht aeht, aejv aejv) {
        this.f114855h = bfqm;
        this.f114848a = i;
        this.f114849b = str;
        this.f114850c = locationRequestInternal;
        this.f114851d = z;
        this.f114852e = z2;
        this.f114853f = aeht;
        this.f114854g = aejv;
    }

    public final void run() {
        Context context = this.f114855h.f114879f;
        int i = this.f114848a;
        String str = this.f114849b;
        LocationRequestInternal locationRequestInternal = this.f114850c;
        boolean z = this.f114851d;
        boolean z2 = this.f114852e;
        bfqf bfqf = new bfqf(this);
        aeht aeht = this.f114853f;
        int i2 = bfph.f114761p;
        bfpe bfpe = new bfpe(context, i, str, locationRequestInternal, z, z2, bfqf, aeht);
        this.f114855h.mo62137a(this.f114853f.asBinder(), bfpe);
    }
}
