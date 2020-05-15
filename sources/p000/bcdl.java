package p000;

import android.content.Context;
import android.net.Uri;
import java.util.Map;

/* renamed from: bcdl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcdl extends bcdf {

    /* renamed from: e */
    private final Map f104005e = bnmt.m109794a();

    /* renamed from: h */
    private final C0034at f104006h = new bcdk(this);

    public bcdl(Context context, bmxj bmxj, bdae bdae, Uri uri, bcdo bcdo) {
        super(context, bmxj, bdae, uri, bcdo);
    }

    /* renamed from: a */
    public final synchronized void mo56710a(bdaq bdaq) {
        bcdj bcdj = new bcdj(bdaq);
        this.f104006h.mo2447a(bcdj);
        this.f104005e.put(bdaq, bcdj);
    }

    /* renamed from: b */
    public final synchronized void mo56711b(bdaq bdaq) {
        this.f104006h.mo2449b((C0038ax) this.f104005e.get(bdaq));
    }

    /* renamed from: d */
    public final synchronized bmxv mo56712d() {
        return bmxv.m108567c(this.f104006h.mo2448b());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final synchronized void mo56705a(Object obj) {
        this.f104006h.mo2450b(obj);
    }
}
