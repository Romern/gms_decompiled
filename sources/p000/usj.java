package p000;

import com.google.android.gms.drive.internal.QueryRequest;
import com.google.android.gms.drive.query.Query;

/* renamed from: usj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class usj extends usg {

    /* renamed from: a */
    final /* synthetic */ Query f48595a;

    /* renamed from: b */
    final /* synthetic */ utr f48596b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public usj(rkb rkb, Query query, utr utr) {
        super(rkb);
        this.f48595a = query;
        this.f48596b = utr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo11186a(rjd rjd) {
        ((usn) rjd).mo27951n().mo27135a(new QueryRequest(this.f48595a), this.f48596b, new uuv(this));
    }
}
