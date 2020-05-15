package p000;

import com.google.android.gms.common.api.Status;

/* renamed from: amcc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class amcc extends alln {

    /* renamed from: a */
    final /* synthetic */ String f74687a;

    /* renamed from: b */
    final /* synthetic */ String f74688b;

    /* renamed from: c */
    final /* synthetic */ alkz f74689c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public amcc(rkb rkb, String str, String str2, alkz alkz) {
        super(rkb);
        this.f74687a = str;
        this.f74688b = str2;
        this.f74689c = alkz;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo11186a(rjd rjd) {
        ((amaz) rjd).mo41087a(this, this.f74687a, this.f74688b, this.f74689c);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ rkk mo11187b(Status status) {
        return new amcb(status);
    }
}
