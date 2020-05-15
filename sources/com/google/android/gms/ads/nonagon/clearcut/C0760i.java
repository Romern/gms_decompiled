package com.google.android.gms.ads.nonagon.clearcut;

import android.content.Context;
import com.google.android.gms.ads.internal.clearcut.C0327b;
import com.google.android.gms.ads.internal.clearcut.C0331f;
import com.google.android.gms.ads.internal.config.C0371o;
import com.google.android.gms.ads.nonagon.p013ad.event.C0751d;
import com.google.android.gms.ads.nonagon.signals.gmscore.C0813av;
import com.google.android.gms.ads.nonagon.util.concurrent.C0851d;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.ads.nonagon.clearcut.i */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0760i implements cayy {

    /* renamed from: a */
    private final cijl f9169a;

    /* renamed from: b */
    private final cijl f9170b;

    /* renamed from: c */
    private final cijl f9171c;

    public C0760i(cijl cijl, cijl cijl2, cijl cijl3) {
        this.f9169a = cijl;
        this.f9170b = cijl2;
        this.f9171c = cijl3;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6445a() {
        Set set;
        String b = ((C0813av) this.f9169a).mo6445a();
        Context b2 = ((fia) this.f9170b).mo6445a();
        bqgj b3 = C0851d.m6032b();
        Map b4 = ((cazb) this.f9171c).mo6445a();
        if (!((Boolean) C0371o.f8236an.mo6604a()).booleanValue()) {
            set = Collections.emptySet();
        } else {
            C0327b bVar = new C0327b(new C0331f(b2));
            bVar.mo6567a(new C0761j(b));
            set = Collections.singleton(new C0751d(new C0763l(bVar, b4), b3));
        }
        cazf.m127593a(set, "Cannot return null from a non-@Nullable @Provides method");
        return set;
    }
}
