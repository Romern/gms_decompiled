package p000;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: eqz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class eqz {

    /* renamed from: a */
    public final Map f15552a = new HashMap();

    /* renamed from: b */
    public final Map f15553b = new HashMap();

    /* renamed from: c */
    public bnic f15554c = bnon.f131923a;

    /* renamed from: d */
    public final Map f15555d = new ConcurrentHashMap();

    /* renamed from: e */
    public volatile boolean f15556e;

    /* renamed from: f */
    private C0034at f15557f;

    /* renamed from: g */
    private C0034at f15558g;

    /* renamed from: a */
    public final C0034at mo10427a() {
        if (this.f15557f == null) {
            C0034at atVar = new C0034at();
            this.f15557f = atVar;
            atVar.mo2450b((Object) false);
        }
        return this.f15557f;
    }

    /* renamed from: b */
    public final C0034at mo10432b() {
        if (this.f15558g == null) {
            C0034at atVar = new C0034at();
            this.f15558g = atVar;
            atVar.mo2450b((Object) false);
        }
        return this.f15558g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C0034at mo10428a(eqy eqy) {
        if (this.f15552a.containsKey(eqy)) {
            return (C0034at) this.f15552a.get(eqy);
        }
        C0034at atVar = new C0034at();
        atVar.mo2450b(new eps(false, false, null));
        this.f15552a.put(eqy, atVar);
        return atVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C0034at mo10433b(eqy eqy) {
        if (this.f15555d.containsKey(eqy)) {
            return (C0034at) this.f15555d.get(eqy);
        }
        C0034at atVar = new C0034at();
        atVar.mo2450b(new epq(eqy.f15548b));
        this.f15555d.put(eqy, atVar);
        return atVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C0034at mo10429a(String str) {
        if (this.f15553b.containsKey(str)) {
            return (C0034at) this.f15553b.get(str);
        }
        C0034at atVar = new C0034at();
        if (this.f15556e) {
            atVar.mo2450b(bnon.f131923a);
        } else {
            atVar.mo2450b((Object) null);
        }
        this.f15553b.put(str, atVar);
        return atVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo10430a(ffk ffk, String str, boolean z) {
        bnia j = bnic.m109500j();
        for (eqy eqy : this.f15555d.keySet()) {
            if (eqy.f15547a.equals(ffk) && eqy.f15549c.equals(str)) {
                j.mo67629b(mo10433b(eqy));
            }
        }
        for (C0034at atVar : j.mo67751a()) {
            if (z || !((epq) atVar.mo2448b()).f15491a.f147584e) {
                atVar.mo2450b(new epq(((epq) atVar.mo2448b()).f15491a, 0, ((epq) atVar.mo2448b()).f15493c));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo10431a(Long l) {
        bnia bnia = new bnia();
        bnia.mo67752b((Iterable) this.f15554c);
        bnia.mo67629b(l);
        this.f15554c = bnia.mo67751a();
    }
}
