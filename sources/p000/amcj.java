package p000;

import com.google.android.gms.common.api.Status;
import java.util.List;

/* renamed from: amcj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amcj extends alln {

    /* renamed from: a */
    final /* synthetic */ String f74699a;

    /* renamed from: b */
    final /* synthetic */ String f74700b;

    /* renamed from: c */
    final /* synthetic */ String f74701c;

    /* renamed from: m */
    final /* synthetic */ List f74702m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public amcj(rkb rkb, String str, String str2, String str3, List list) {
        super(rkb);
        this.f74699a = str;
        this.f74700b = str2;
        this.f74701c = str3;
        this.f74702m = list;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo11186a(rjd rjd) {
        ((amaz) rjd).mo41091a(this, this.f74699a, this.f74700b, this.f74701c, this.f74702m);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ rkk mo11187b(Status status) {
        return new amci(status);
    }
}
