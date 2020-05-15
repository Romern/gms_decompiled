package p000;

import android.content.Context;
import com.google.android.gms.audiomodem.Encoding;

/* renamed from: gem */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gem {

    /* renamed from: a */
    public final gdu f18050a = new gdu();

    /* renamed from: b */
    public gce f18051b;

    /* renamed from: c */
    public boolean f18052c;

    /* renamed from: d */
    private final Context f18053d;

    public gem(Context context) {
        gdf gdf = new gdf(context);
        this.f18053d = context;
        this.f18051b = gdf;
    }

    /* renamed from: a */
    public final gej mo11736a(Encoding encoding) {
        if (this.f18050a.containsKey(encoding)) {
            return (gej) this.f18050a.get(encoding);
        }
        int i = this.f18050a.f17982a;
        srn srn = gdv.f17985a;
        this.f18051b.mo11643b();
        this.f18051b.mo11641a();
        gej gej = new gej(this.f18053d, encoding, i, this.f18051b.mo11641a(), this.f18051b.mo11643b(), cfnp.f184595a.mo6606a().mo81708v());
        this.f18050a.put(encoding, gej);
        return gej;
    }

    /* renamed from: b */
    public final void mo11738b() {
        if (this.f18050a.isEmpty() && !this.f18051b.mo11645c()) {
            srn srn = gdv.f17985a;
            if (this.f18051b.mo11647e()) {
                this.f18052c = false;
            }
        }
    }

    /* renamed from: a */
    public final void mo11737a() {
        this.f18051b.mo11646d();
    }
}
