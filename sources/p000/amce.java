package p000;

import com.google.android.gms.common.api.Status;

/* renamed from: amce */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amce extends alln {

    /* renamed from: a */
    final /* synthetic */ String f74691a;

    /* renamed from: b */
    final /* synthetic */ String f74692b;

    /* renamed from: c */
    final /* synthetic */ alkt f74693c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public amce(rkb rkb, String str, String str2, alkt alkt) {
        super(rkb);
        this.f74691a = str;
        this.f74692b = str2;
        this.f74693c = alkt;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo11186a(rjd rjd) {
        amaz amaz = (amaz) rjd;
        String str = this.f74691a;
        String str2 = this.f74692b;
        alkt alkt = this.f74693c;
        amaz.mo41093a(this, str, str2, alkt.f73605a, alkt.f73606b, alkt.f73607c, alkt.f73608d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ rkk mo11187b(Status status) {
        return new amcd(status);
    }
}
