package p000;

import android.content.Context;
import com.google.android.gms.location.internal.LocationRequestInternal;

/* renamed from: bfqe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfqe implements Runnable {

    /* renamed from: a */
    final /* synthetic */ int f114839a;

    /* renamed from: b */
    final /* synthetic */ String f114840b;

    /* renamed from: c */
    final /* synthetic */ LocationRequestInternal f114841c;

    /* renamed from: d */
    final /* synthetic */ boolean f114842d;

    /* renamed from: e */
    final /* synthetic */ boolean f114843e;

    /* renamed from: f */
    final /* synthetic */ aehw f114844f;

    /* renamed from: g */
    final /* synthetic */ aejv f114845g;

    /* renamed from: h */
    final /* synthetic */ bfqm f114846h;

    public bfqe(bfqm bfqm, int i, String str, LocationRequestInternal locationRequestInternal, boolean z, boolean z2, aehw aehw, aejv aejv) {
        this.f114846h = bfqm;
        this.f114839a = i;
        this.f114840b = str;
        this.f114841c = locationRequestInternal;
        this.f114842d = z;
        this.f114843e = z2;
        this.f114844f = aehw;
        this.f114845g = aejv;
    }

    public final void run() {
        Context context = this.f114846h.f114879f;
        int i = this.f114839a;
        String str = this.f114840b;
        LocationRequestInternal locationRequestInternal = this.f114841c;
        boolean z = this.f114842d;
        boolean z2 = this.f114843e;
        bfqd bfqd = new bfqd(this);
        aehw aehw = this.f114844f;
        int i2 = bfph.f114761p;
        bfpf bfpf = new bfpf(context, i, str, locationRequestInternal, z, z2, bfqd, aehw);
        this.f114846h.mo62137a(this.f114844f.asBinder(), bfpf);
    }
}
