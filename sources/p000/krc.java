package p000;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: krc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class krc {

    /* renamed from: a */
    public static final lrd f24835a = new lrd();

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX WARN: Type inference failed for: r1v1, types: [kre], assign insn: PHI: (r1v1 ?) = (r1v8 ?), (r1v9 ?), (r1v10 ?) binds: [B:1:0x0004, B:13:0x008f, B:11:0x008d] */
    /* JADX WARN: Type inference failed for: r1v8, assign insn: ?: MOVE  (r1v8 ?) = (r1v0 java.lang.Object) */
    /* JADX WARN: Type inference failed for: r1v9, assign insn: ?: MOVE  (r1v9 ?) = (r1v2 java.lang.Object) */
    /* JADX WARN: Type inference failed for: r1v10, assign insn: ?: MOVE  (r1v10 ?) = (r1v6 java.lang.Object) */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    public static kre m18382a(Context context) {
        lrd lrd = f24835a;
        Object obj = lrd.f26628a;
        ? r1 = obj;
        if (obj == null) {
            synchronized (lrd) {
                Object obj2 = lrd.f26628a;
                if (obj2 == null) {
                    Context applicationContext = context.getApplicationContext();
                    ktn ktn = new ktn();
                    cazf.m127594a(applicationContext);
                    ktn.f24976a = applicationContext;
                    kyp a = kyp.m18803a(applicationContext);
                    cazf.m127594a(a);
                    ktn.f24977b = a;
                    ktt ktt = new ktt();
                    snf a2 = snp.m35703a(Integer.MAX_VALUE, 9);
                    cazf.m127594a(a2);
                    ktt.f25047b = a2;
                    cazf.m127594a(applicationContext);
                    ktt.f25046a = applicationContext;
                    cazf.m127595a(ktt.f25046a, Context.class);
                    cazf.m127595a(ktt.f25047b, ScheduledExecutorService.class);
                    ktu ktu = new ktu(ktt.f25046a, ktt.f25047b);
                    cazf.m127594a(ktu);
                    ktn.f24978c = ktu;
                    cazf.m127595a(ktn.f24976a, Context.class);
                    cazf.m127595a(ktn.f24977b, kyp.class);
                    cazf.m127595a(ktn.f24978c, kus.class);
                    krh krh = new krh(ktn.f24978c, ktn.f24976a, ktn.f24977b);
                    if (krh.mo14851z()) {
                        krh.mo14831f().mo15074a(new krf(krh));
                    }
                    lrd.f26628a = krh;
                    Object obj3 = lrd.f26628a;
                    r1 = obj3;
                } else {
                    r1 = obj2;
                }
            }
        }
        return r1;
    }
}
