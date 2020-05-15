package p000;

import android.net.Uri;
import com.google.android.gms.common.api.Status;

/* renamed from: amcr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amcr extends alln {

    /* renamed from: a */
    final /* synthetic */ String f74716a;

    /* renamed from: b */
    final /* synthetic */ String f74717b;

    /* renamed from: c */
    final /* synthetic */ Uri f74718c;

    /* renamed from: m */
    final /* synthetic */ boolean f74719m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public amcr(rkb rkb, String str, String str2, Uri uri, boolean z) {
        super(rkb);
        this.f74716a = str;
        this.f74717b = str2;
        this.f74718c = uri;
        this.f74719m = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo11186a(rjd rjd) {
        ((amaz) rjd).mo41089a(this, this.f74716a, this.f74717b, this.f74718c, this.f74719m);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ rkk mo11187b(Status status) {
        return new amcq(status);
    }
}
