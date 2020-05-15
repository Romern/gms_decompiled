package p000;

import com.google.android.gms.common.api.Status;

/* renamed from: axsc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class axsc extends axpu {

    /* renamed from: a */
    final /* synthetic */ String f96292a;

    /* renamed from: b */
    final /* synthetic */ String f96293b;

    /* renamed from: c */
    final /* synthetic */ byte[] f96294c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public axsc(rkb rkb, String str, String str2, byte[] bArr) {
        super(rkb);
        this.f96292a = str;
        this.f96293b = str2;
        this.f96294c = bArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo11186a(rjd rjd) {
        ((axry) ((axtl) rjd).mo25289B()).mo53479a(new axti(this), this.f96292a, this.f96293b, this.f96294c);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ rkk mo11187b(Status status) {
        return new axsf(status, -1);
    }
}
