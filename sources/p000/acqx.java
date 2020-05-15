package p000;

import com.google.android.gms.icing.service.IndexChimeraService;

/* renamed from: acqx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acqx extends acpn {

    /* renamed from: a */
    final /* synthetic */ sjj f60556a;

    /* renamed from: b */
    final /* synthetic */ String f60557b;

    /* renamed from: c */
    final /* synthetic */ sgj f60558c;

    /* renamed from: d */
    final /* synthetic */ int f60559d;

    /* renamed from: e */
    final /* synthetic */ int f60560e;

    /* renamed from: f */
    final /* synthetic */ String f60561f;

    /* renamed from: n */
    final /* synthetic */ IndexChimeraService f60562n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public acqx(IndexChimeraService indexChimeraService, bqbd bqbd, String str, sjj sjj, String str2, sgj sgj, int i, int i2, String str3) {
        super(bqbd, 1, str);
        this.f60562n = indexChimeraService;
        this.f60556a = sjj;
        this.f60557b = str2;
        this.f60558c = sgj;
        this.f60559d = i;
        this.f60560e = i2;
        this.f60561f = str3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo11132a() {
        apqe apqe;
        IndexChimeraService indexChimeraService = this.f60562n;
        sjj sjj = this.f60556a;
        String str = this.f60557b;
        sgj sgj = this.f60558c;
        int i = this.f60559d;
        int i2 = this.f60560e;
        String str2 = this.f60561f;
        boolean z = true;
        indexChimeraService.mo43419b().mo32992b(1);
        absg.m48204d("IndexChimeraService.getServiceInterface callingPackage=%s componentName=%s serviceId=%s", str, str2, sgj);
        if (!indexChimeraService.mo43416a().mo32320d()) {
            absg.m48205e("IndexManager failed to initialize. SearchIndex.API is unavailable.");
            indexChimeraService.mo43418a(sjj, 16, (sjr) null);
        } else {
            abyy a = indexChimeraService.mo43416a().f58077m.mo32497a(i2, str, i, str2);
            sgj sgj2 = sgj.UNKNOWN;
            int ordinal = sgj.ordinal();
            if (ordinal == 21) {
                apqe = new fqq(indexChimeraService.mo43416a(), a);
            } else if (ordinal == 30) {
                apqe = new apnm(indexChimeraService.mo43416a(), a);
            } else if (ordinal == 36) {
                apqe = new appe(indexChimeraService.mo43416a(), a);
            } else if (ordinal == 65) {
                indexChimeraService.mo43416a();
                apqe = new apqz();
            } else if (ordinal == 77) {
                indexChimeraService.mo43416a();
                apqe = new aprk();
            } else if (ordinal == 32) {
                apqe = new apst(indexChimeraService.mo43416a(), a);
            } else if (ordinal == 33) {
                apqe = new apqe(indexChimeraService.mo43416a(), a);
            } else {
                throw new IllegalArgumentException("Invalid service id in the request.");
            }
            abyv c = indexChimeraService.mo43416a().f58077m.mo32505c(str);
            c.mo32475d();
            if (c.mo32486o()) {
                indexChimeraService.mo43419b().mo32995d(new acqy(indexChimeraService, bqbd.CHECK_CLIENT_RESOURCES, str, str, c, sjj, apqe));
            } else {
                indexChimeraService.mo43417a(c, sjj, apqe);
            }
            if (!((Boolean) abzt.f58848P.mo58455c()).booleanValue() || !indexChimeraService.mo43416a().f58077m.mo32503b(str)) {
                z = false;
            }
            indexChimeraService.mo43419b().mo32995d(new abva(indexChimeraService.mo43416a(), false, z));
        }
        return null;
    }
}
