package p000;

import com.google.android.gms.common.api.Status;

/* renamed from: amca */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class amca extends alln {

    /* renamed from: a */
    final /* synthetic */ String f74683a;

    /* renamed from: b */
    final /* synthetic */ String f74684b;

    /* renamed from: c */
    final /* synthetic */ alkv f74685c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public amca(rkb rkb, String str, String str2, alkv alkv) {
        super(rkb);
        this.f74683a = str;
        this.f74684b = str2;
        this.f74685c = alkv;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo11186a(rjd rjd) {
        amaz amaz = (amaz) rjd;
        String str = this.f74683a;
        String str2 = this.f74684b;
        alkv alkv = this.f74685c;
        amaz.mo41086a(this, str, str2, alkv.f73609a, alkv.f73610b, alkv.f73611c);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ rkk mo11187b(Status status) {
        return new ambz(status);
    }
}
