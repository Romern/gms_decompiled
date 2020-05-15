package p000;

import android.content.Context;
import java.util.concurrent.TimeUnit;

/* renamed from: bbqb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbqb implements chqt {

    /* renamed from: a */
    static final chtn f103054a = chtn.m149535a("X-Goog-Spatula", chtr.f189134b);

    /* renamed from: b */
    public volatile String f103055b;

    /* renamed from: c */
    public volatile bqgy f103056c;

    /* renamed from: d */
    private final Context f103057d;

    public bbqb(Context context) {
        this.f103057d = context;
        mo56352a();
    }

    /* renamed from: a */
    public final synchronized bqgg mo56352a() {
        bqgy bqgy;
        bqgy = this.f103056c;
        if (bqgy == null) {
            bqgy = bqgy.m112818c();
            this.f103056c = bqgy;
            rjy rjy = new rjy(this.f103057d);
            rjy.mo24779a(gsq.f18963a);
            rkb b = rjy.mo24784b();
            b.mo24790a((rjz) new bbpz(this, b, bqgy));
            b.mo24791a((rka) new bbpx(this, bqgy, b));
            b.mo24801e();
        }
        return bqgy;
    }

    /* renamed from: a */
    public final chqs mo56353a(chtv chtv, chqo chqo, chqp chqp) {
        try {
            mo56352a().get(20, TimeUnit.SECONDS);
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            bbos.m88294d("ClntIntrcptrFctryV12", valueOf.length() == 0 ? new String("Error connecting GoogleApiClient: ") : "Error connecting GoogleApiClient: ".concat(valueOf));
        }
        return new bbqa(this, chqp.mo70053a(chtv, chqo));
    }
}
