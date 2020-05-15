package p000;

import android.content.Context;
import android.telephony.SubscriptionManager;

/* renamed from: kuc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kuc implements cayy {

    /* renamed from: a */
    private final cijl f25071a;

    /* renamed from: b */
    private final cijl f25072b;

    /* renamed from: c */
    private final cijl f25073c;

    /* renamed from: d */
    private final cijl f25074d;

    public kuc(cijl cijl, cijl cijl2, cijl cijl3, cijl cijl4) {
        this.f25071a = cijl;
        this.f25072b = cijl2;
        this.f25073c = cijl3;
        this.f25074d = cijl4;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6445a() {
        kxx kxx = new kxx(new kfa((SubscriptionManager) ((Context) ((cayz) this.f25071a).f176439a).getSystemService("telephony_subscription_service"), (kra) this.f25074d.mo6445a()), (bmzq) this.f25072b.mo6445a(), (kwu) this.f25073c.mo6445a(), 5, false);
        cazf.m127593a(kxx, "Cannot return null from a non-@Nullable @Provides method");
        return kxx;
    }
}
