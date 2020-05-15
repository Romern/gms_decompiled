package p000;

import android.graphics.BitmapFactory;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/* renamed from: bbrv */
final /* synthetic */ class bbrv implements Callable {

    /* renamed from: a */
    private final bbsc f103250a;

    /* renamed from: b */
    private final bcoh f103251b;

    /* renamed from: c */
    private final bcsj f103252c;

    /* renamed from: d */
    private final bqgg f103253d;

    /* renamed from: e */
    private final bqgg f103254e;

    /* renamed from: f */
    private final bqgg f103255f;

    public bbrv(bbsc bbsc, bcoh bcoh, bcsj bcsj, bqgg bqgg, bqgg bqgg2, bqgg bqgg3) {
        this.f103250a = bbsc;
        this.f103251b = bcoh;
        this.f103252c = bcsj;
        this.f103253d = bqgg;
        this.f103254e = bqgg2;
        this.f103255f = bqgg3;
    }

    public final Object call() {
        byte[] bArr;
        int length;
        bbsc bbsc = this.f103250a;
        bcoh bcoh = this.f103251b;
        bcsj bcsj = this.f103252c;
        bqgg bqgg = this.f103253d;
        bqgg bqgg2 = this.f103254e;
        bbyk bbyk = (bbyk) bqga.m112780a((Future) this.f103255f);
        long nextInt = (long) bbsc.f103278f.nextInt(((Integer) bqga.m112780a((Future) bqgg2)).intValue());
        bbon.m88284a();
        long currentTimeMillis = System.currentTimeMillis() + nextInt + ((Long) bqga.m112780a((Future) bqgg)).longValue();
        int b = bbyk.mo56513b();
        int i = b - 1;
        if (b == 0) {
            throw null;
        } else if (i != 1) {
            if (i != 2) {
                bbos.m88291b("LitContactCtrlr", "contact profile is not supported.");
                bcsi l = bcsj.mo57313l();
                l.mo57442a(Long.valueOf(currentTimeMillis));
                return l.mo57436a();
            }
            bbos.m88294d("LitContactCtrlr", "Failed to get contact profile");
            bcsi l2 = bcsj.mo57313l();
            bbon.m88284a();
            l2.mo57442a(Long.valueOf(System.currentTimeMillis() + nextInt));
            bcsj a = l2.mo57436a();
            bbsc.mo56391a(bcoh).mo56652c(a);
            return a;
        } else if (!bbyk.mo56512a().mo66813a()) {
            bbos.m88294d("LitContactCtrlr", "Got empty contact profile.");
            return bcsj;
        } else {
            bcsi m = bcsj.m89802m();
            m.mo57441a(bcsj.mo57302a());
            m.mo57446b(((bchq) bbyk.mo56512a().mo66814b()).mo56841a());
            m.mo57442a(Long.valueOf(currentTimeMillis));
            m.mo57440a(((bchq) bbyk.mo56512a().mo66814b()).mo56849h());
            m.mo57445b(((bchq) bbyk.mo56512a().mo66814b()).mo56851i());
            if (((bchq) bbyk.mo56512a().mo66814b()).mo56842b().mo66813a()) {
                m.f104793a = bmxv.m108566b((String) ((bchq) bbyk.mo56512a().mo66814b()).mo56842b().mo66814b());
            }
            if (((bchq) bbyk.mo56512a().mo66814b()).mo56852j().mo66813a()) {
                m.mo57439a((bctd) ((bchq) bbyk.mo56512a().mo66814b()).mo56852j().mo66814b());
            }
            if (((bchq) bbyk.mo56512a().mo66814b()).mo56843c().mo66813a()) {
                m.mo57443a((String) ((bchq) bbyk.mo56512a().mo66814b()).mo56843c().mo66814b());
                bmxv e = bcsj.mo57306e();
                m.getClass();
                bbot.m88296a(e, new bbrx(m));
                if (!bcsj.mo57305d().equals(((bchq) bbyk.mo56512a().mo66814b()).mo56843c())) {
                    m.mo57444a(true);
                }
            } else if (((bchq) bbyk.mo56512a().mo66814b()).mo56844d().mo66813a() && (length = (bArr = (byte[]) ((bchq) bbyk.mo56512a().mo66814b()).mo56844d().mo66814b()).length) > 0) {
                m.mo57437a(BitmapFactory.decodeByteArray(bArr, 0, length));
            }
            bmxv k = ((bchq) bbyk.mo56512a().mo66814b()).mo56853k();
            if (k.mo66813a()) {
                m.mo57438a((bcsv) k.mo66814b());
            }
            bcsj a2 = m.mo57436a();
            bbsc.mo56391a(bcoh).mo56652c(a2);
            return a2;
        }
    }
}
