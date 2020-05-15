package p000;

import com.google.android.gms.common.Feature;

/* renamed from: amud */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amud extends C0053bl {

    /* renamed from: a */
    public final amsg f75938a;

    /* renamed from: d */
    public final adch f75939d;

    /* renamed from: e */
    public boolean f75940e = false;

    /* renamed from: f */
    public final amtn f75941f;

    /* renamed from: g */
    private final amul f75942g;

    /* renamed from: h */
    private final amuk f75943h;

    public amud(amsg amsg, amul amul, amuk amuk, amtn amtn) {
        this.f75938a = amsg;
        this.f75942g = amul;
        this.f75943h = amuk;
        this.f75939d = new adch();
        this.f75941f = amtn;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C0034at mo41340a() {
        amsg amsg = this.f75938a;
        amuk amuk = this.f75943h;
        amuk.getClass();
        return C0052bk.m3245b(amsg, new amuc(amuk));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C0034at mo41342b() {
        amtn amtn = this.f75941f;
        adch adch = new adch();
        aucb a = amtn.f75916a.mo40712a();
        adch.getClass();
        a.mo50371a(new amtj(adch));
        return adch;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final C0034at mo41344c() {
        amtn amtn = this.f75941f;
        adch adch = new adch();
        alsl alsl = amtn.f75916a;
        roz b = rpa.m34196b();
        b.f43473b = new Feature[]{alks.f73600c};
        b.f43472a = new alsw();
        aucb a = ((rjx) alsl).mo24701a(b.mo24977a());
        adch.getClass();
        a.mo50371a(new amtm(adch));
        return adch;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo41346d() {
        this.f75939d.mo2450b((Object) 2);
    }

    /* renamed from: e */
    public final void mo41347e() {
        this.f75939d.mo2450b((Object) 1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo41348g() {
        this.f75939d.mo2450b((Object) 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C0034at mo41341a(String str) {
        return this.f75943h.mo41353a(amup.m63312a(str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo41343b(String str) {
        if (!this.f75942g.mo41354a().equals(str)) {
            this.f75942g.f75954a.edit().putString("core_ui_selected_account", str).apply();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo41345c(String str) {
        mo41343b(str);
        this.f75938a.mo41300e();
    }
}
