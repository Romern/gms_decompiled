package p000;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ocr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1582ocr {

    /* renamed from: a */
    public static final bnsn f37187a = odk.m28481a("CAR.ANALYTICS");

    /* renamed from: b */
    public final AtomicBoolean f37188b = new AtomicBoolean(false);

    /* renamed from: c */
    public ocp f37189c;

    /* renamed from: d */
    public final AtomicReference f37190d = new AtomicReference(ocq.UNKNOWN);

    /* renamed from: e */
    private final rjx f37191e;

    public C1582ocr(Context context) {
        rjx a = avtz.m79336a(context, new avty());
        this.f37191e = a;
        a.mo24680a((avub) new oco(this));
    }

    /* renamed from: c */
    private final synchronized rjx m28394c() {
        return this.f37191e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo21975a() {
        if (!ccqr.f179769a.mo6606a().mo76656b()) {
            this.f37190d.set(ocq.ENABLED);
        } else if (this.f37188b.compareAndSet(false, true)) {
            this.f37190d.set(ocq.UNKNOWN);
            m28394c().mo24673E().mo50371a(new ocn(this));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo21977a(ocp ocp) {
        this.f37189c = ocp;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final ocq mo21978b() {
        return (ocq) this.f37190d.get();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo21976a(aucb aucb) {
        if (!aucb.mo50384b() || aucb.mo50386d() == null) {
            bnsi b = f37187a.mo68387b();
            b.mo68437a(aucb.mo50387e());
            b.mo68432a("ocr", "a", 109, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b.mo68405a("CarTelemetryCheckboxFeature exception");
        } else {
            this.f37190d.set(((rkj) aucb.mo50386d()).mo24824r() ? ocq.ENABLED : ocq.DISABLED);
            synchronized (this) {
                ocp ocp = this.f37189c;
                if (ocp != null) {
                    ocp.mo21974a();
                }
            }
            this.f37190d.toString();
            Thread.currentThread().getName();
        }
        this.f37188b.set(false);
    }
}
