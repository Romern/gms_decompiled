package com.google.android.gms.ads.internal.state;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.ads.internal.C0387d;
import com.google.android.gms.ads.internal.activeview.C0309a;
import com.google.android.gms.ads.internal.appcontent.C0312c;
import com.google.android.gms.ads.internal.appcontent.C0313d;
import com.google.android.gms.ads.internal.client.C0341h;
import com.google.android.gms.ads.internal.config.C0371o;
import com.google.android.gms.ads.internal.csi.C0378c;
import com.google.android.gms.ads.internal.flag.C0395h;
import com.google.android.gms.ads.internal.flag.C0405r;
import com.google.android.gms.ads.internal.report.C0537d;
import com.google.android.gms.ads.internal.util.C0650h;
import com.google.android.gms.ads.internal.util.C0652j;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.future.C0645d;
import com.google.android.gms.ads.internal.util.future.C0647f;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.ads.internal.state.d */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0597d {

    /* renamed from: a */
    public final Object f8895a = new Object();

    /* renamed from: b */
    public Context f8896b;

    /* renamed from: c */
    public VersionInfoParcel f8897c;

    /* renamed from: d */
    public C0378c f8898d;

    /* renamed from: e */
    public Boolean f8899e;

    /* renamed from: f */
    private final C0652j f8900f = new C0652j();

    /* renamed from: g */
    private final C0600g f8901g;

    /* renamed from: h */
    private boolean f8902h;

    /* renamed from: i */
    private final AtomicInteger f8903i;

    /* renamed from: j */
    private final Object f8904j;

    /* renamed from: k */
    private bqgg f8905k;

    public C0597d() {
        C0341h.m5277d();
        this.f8901g = new C0600g(this.f8900f);
        this.f8902h = false;
        this.f8898d = null;
        this.f8899e = null;
        this.f8903i = new AtomicInteger(0);
        new C0596c();
        this.f8904j = new Object();
    }

    /* renamed from: a */
    public final C0378c mo6781a() {
        C0378c cVar;
        synchronized (this.f8895a) {
            cVar = this.f8898d;
        }
        return cVar;
    }

    /* renamed from: b */
    public final void mo6784b() {
        this.f8903i.incrementAndGet();
    }

    /* renamed from: c */
    public final void mo6786c() {
        this.f8903i.decrementAndGet();
    }

    /* renamed from: a */
    public final void mo6782a(Context context, VersionInfoParcel versionInfoParcel) {
        C0378c cVar;
        synchronized (this.f8895a) {
            if (!this.f8902h) {
                this.f8896b = context.getApplicationContext();
                this.f8897c = versionInfoParcel;
                C0313d c = C0387d.m5365c();
                C0600g gVar = this.f8901g;
                synchronized (c.f8074a) {
                    if (c.f8075b == null) {
                        c.f8075b = new C0312c();
                    }
                    C0312c cVar2 = c.f8075b;
                    synchronized (cVar2.f8068b) {
                        cVar2.f8071e.add(gVar);
                    }
                }
                C0652j jVar = this.f8900f;
                Context context2 = this.f8896b;
                synchronized (jVar.f8984a) {
                    if (jVar.f8988e == null) {
                        jVar.f8986c = C0645d.f8973a.mo25812a(new C0650h(jVar, context2, "admob"));
                        jVar.f8985b = true;
                    }
                }
                C0537d.m5524a(this.f8896b, this.f8897c);
                new C0309a(context.getApplicationContext(), this.f8897c);
                C0387d.m5375m();
                if (((Boolean) C0395h.f8335b.mo6621a()).booleanValue()) {
                    cVar = new C0378c();
                } else {
                    cVar = null;
                }
                this.f8898d = cVar;
                if (cVar != null) {
                    C0647f.m5688a(new C0595b(this).mo6801b(), "AppState.registerCsiReporter");
                }
                this.f8902h = true;
                int i = Build.VERSION.SDK_INT;
                if (this.f8896b != null) {
                    if (!((Boolean) C0371o.f8201O.mo6604a()).booleanValue()) {
                        synchronized (this.f8904j) {
                            if (this.f8905k == null) {
                                this.f8905k = C0645d.f8973a.mo25819b(new C0594a(this));
                            }
                        }
                    }
                }
                bqga.m112775a((Object) new ArrayList());
            }
        }
        C0387d.m5363a().mo6860b(context, versionInfoParcel.f8949a);
    }

    /* renamed from: b */
    public final void mo6785b(Throwable th, String str) {
        C0537d.m5524a(this.f8896b, this.f8897c).mo6713a(th, str, ((Double) C0405r.f8363f.mo6621a()).floatValue());
    }

    /* renamed from: a */
    public final void mo6783a(Throwable th, String str) {
        C0537d.m5524a(this.f8896b, this.f8897c).mo6712a(th, str);
    }
}
