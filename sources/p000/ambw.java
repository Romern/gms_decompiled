package p000;

import com.google.android.gms.common.api.Status;

/* renamed from: ambw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ambw extends alln {

    /* renamed from: a */
    final /* synthetic */ alkx f74678a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ambw(rkb rkb, alkx alkx) {
        super(rkb);
        this.f74678a = alkx;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: amaz.a(rlf, boolean, boolean, java.lang.String, java.lang.String, int):void
     arg types: [ambw, int, boolean, ?[OBJECT, ARRAY], ?[OBJECT, ARRAY], int]
     candidates:
      amaz.a(rlf, java.lang.String, java.lang.String, int, java.lang.String, boolean):void
      amaz.a(rlf, boolean, boolean, java.lang.String, java.lang.String, int):void */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo11186a(rjd rjd) {
        amaz amaz = (amaz) rjd;
        alkx alkx = this.f74678a;
        amaz.mo41094a((rlf) this, false, alkx.f73613b, (String) null, (String) null, alkx.f73614c);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ rkk mo11187b(Status status) {
        return new ambv(status);
    }
}
