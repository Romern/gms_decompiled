package p000;

import com.google.android.gms.icing.service.IndexChimeraService;

/* renamed from: acqy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class acqy extends acpn {

    /* renamed from: a */
    final /* synthetic */ String f60563a;

    /* renamed from: b */
    final /* synthetic */ abyv f60564b;

    /* renamed from: c */
    final /* synthetic */ sjj f60565c;

    /* renamed from: d */
    final /* synthetic */ sjr f60566d;

    /* renamed from: e */
    final /* synthetic */ IndexChimeraService f60567e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public acqy(IndexChimeraService indexChimeraService, bqbd bqbd, String str, String str2, abyv abyv, sjj sjj, sjr sjr) {
        super(bqbd, 2, str);
        this.f60567e = indexChimeraService;
        this.f60563a = str2;
        this.f60564b = abyv;
        this.f60565c = sjj;
        this.f60566d = sjr;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo11132a() {
        this.f60567e.mo43416a().mo32318c(this.f60563a);
        this.f60567e.mo43417a(this.f60564b, this.f60565c, this.f60566d);
        return null;
    }
}
