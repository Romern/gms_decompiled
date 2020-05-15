package com.google.android.gms.ads.nonagon.signals.gmscore;

import com.google.android.gms.ads.config.C0236e;
import com.google.android.gms.ads.internal.spamsignals.C0593a;
import com.google.android.gms.ads.nonagon.clearcut.C0752a;
import com.google.android.gms.ads.nonagon.clearcut.C0754c;
import com.google.android.gms.ads.nonagon.clearcut.C0756e;
import com.google.android.gms.ads.nonagon.clearcut.C0758g;
import com.google.android.gms.ads.nonagon.clearcut.C0760i;
import com.google.android.gms.ads.nonagon.util.concurrent.C0851d;
import com.google.android.gms.ads.nonagon.util.concurrent.C0863p;
import com.google.android.gms.ads.nonagon.util.event.C0864a;
import com.google.android.gms.ads.nonagon.util.event.C0869f;
import com.google.android.gms.ads.nonagon.util.event.C0870g;
import java.util.List;

/* renamed from: com.google.android.gms.ads.nonagon.signals.gmscore.f */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0824f {

    /* renamed from: a */
    public final C0808aq f9280a;

    /* renamed from: b */
    public cijl f9281b;

    /* renamed from: c */
    public cijl f9282c;

    /* renamed from: d */
    public cijl f9283d;

    /* renamed from: e */
    public cijl f9284e;

    /* renamed from: f */
    public cijl f9285f;

    /* renamed from: g */
    public cijl f9286g;

    /* renamed from: h */
    public cijl f9287h;

    /* renamed from: i */
    public cijl f9288i;

    /* renamed from: j */
    public final /* synthetic */ fii f9289j;

    /* renamed from: k */
    private cijl f9290k;

    /* renamed from: l */
    private cijl f9291l;

    /* renamed from: m */
    private cijl f9292m;

    /* renamed from: n */
    private cijl f9293n;

    /* renamed from: o */
    private cijl f9294o;

    /* renamed from: p */
    private cijl f9295p;

    /* renamed from: q */
    private cijl f9296q;

    /* renamed from: r */
    private cijl f9297r;

    /* renamed from: s */
    private cijl f9298s;

    /* renamed from: t */
    private cijl f9299t;

    /* renamed from: u */
    private cijl f9300u;

    /* renamed from: v */
    private cijl f9301v;

    /* renamed from: w */
    private cijl f9302w;

    /* renamed from: x */
    private cijl f9303x;

    public C0824f() {
    }

    /* renamed from: a */
    public final C0798ag mo7069a() {
        C0236e eVar = new C0236e(fia.m11732a(this.f9289j.f16639a));
        cazf.m127593a(eVar, "Cannot return null from a non-@Nullable @Provides method");
        bqgj b = C0851d.m6032b();
        List list = this.f9280a.f9258a.f8696e;
        cazf.m127593a(list, "Cannot return null from a non-@Nullable @Provides method");
        return new C0798ag(eVar, b, list);
    }

    /* renamed from: b */
    public final C0827i mo7070b() {
        C0593a b = this.f9289j.mo10848b();
        bqgj b2 = C0851d.m6032b();
        String string = this.f9280a.f9258a.f8692a.getString("ms");
        cazf.m127593a(string, "Cannot return null from a non-@Nullable @Provides method");
        return new C0827i(b, b2, string, this.f9280a.f9258a.f8697f);
    }

    /* renamed from: c */
    public final C0863p mo7071c() {
        return (C0863p) this.f9303x.mo6445a();
    }

    public C0824f(fii fii, C0808aq aqVar) {
        this.f9289j = fii;
        this.f9280a = aqVar;
        fii fii2 = this.f9289j;
        this.f9281b = new C0823e(fii2.f16648j, fii2.f16642d, fii2.f16643e);
        this.f9290k = new C0809ar(aqVar);
        fii fii3 = this.f9289j;
        cijl cijl = fii3.f16649k;
        this.f9282c = new C0832n(fii3.f16642d, this.f9290k);
        this.f9291l = new C0812au(aqVar);
        fii fii4 = this.f9289j;
        cijl cijl2 = fii4.f16648j;
        cijl cijl3 = this.f9291l;
        cijl cijl4 = fii4.f16642d;
        cijl cijl5 = fii4.f16650l;
        this.f9283d = new C0838t(cijl2, cijl3, cijl4, fii4.f16643e);
        fii fii5 = this.f9289j;
        cijl cijl6 = fii5.f16651m;
        this.f9284e = new C0842x(fii5.f16642d);
        this.f9285f = new C0796ae(this.f9289j.f16645g, this.f9290k);
        this.f9292m = new C0811at(aqVar);
        this.f9293n = new C0810as(aqVar);
        fii fii6 = this.f9289j;
        this.f9286g = new C0803al(fii6.f16652n, fii6.f16643e, this.f9292m, this.f9293n);
        fii fii7 = this.f9289j;
        cijl cijl7 = fii7.f16653o;
        this.f9287h = new C0807ap(fii7.f16643e, fii7.f16642d);
        this.f9288i = new C0820bb();
        this.f9294o = new C0813av(aqVar);
        this.f9295p = cayx.m127579a(C0754c.f9166a);
        this.f9296q = cayx.m127579a(C0752a.f9165a);
        this.f9297r = cayx.m127579a(C0756e.f9167a);
        this.f9298s = cayx.m127579a(C0758g.f9168a);
        caza a = cazb.m127586a(4);
        a.mo75186b(C0864a.GMS_SIGNALS, this.f9295p);
        a.mo75186b(C0864a.BUILD_URL, this.f9296q);
        a.mo75186b(C0864a.HTTP, this.f9297r);
        a.mo75186b(C0864a.PRE_PROCESS, this.f9298s);
        this.f9299t = a.mo75185a();
        this.f9300u = cayx.m127579a(new C0760i(this.f9294o, this.f9289j.f16642d, this.f9299t));
        cazh a2 = cazi.m127601a(0, 2);
        a2.mo75191a(this.f9289j.f16654p);
        a2.mo75191a(this.f9300u);
        cazi a3 = a2.mo75190a();
        this.f9301v = a3;
        this.f9302w = new C0870g(a3);
        this.f9303x = cayx.m127579a(new C0869f(this.f9289j.f16643e, this.f9302w));
    }
}
