package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: babx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class babx implements bmzi {

    /* renamed from: a */
    private final cayo f100444a;

    /* renamed from: b */
    private final bmzi f100445b;

    /* renamed from: c */
    private final bmzi f100446c;

    /* renamed from: d */
    private final Object f100447d = new Object();

    /* renamed from: e */
    private String f100448e;

    /* renamed from: f */
    private Integer f100449f;

    /* renamed from: g */
    private bqgg f100450g;

    /* renamed from: h */
    private final bacf f100451h;

    public babx(cayo cayo, bmzi bmzi, bmzi bmzi2, bacf bacf) {
        this.f100444a = cayo;
        this.f100445b = bmzi;
        this.f100446c = bmzi2;
        this.f100451h = bacf;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6606a() {
        bqgg bqgg;
        synchronized (this.f100447d) {
            String str = (String) this.f100445b.mo6606a();
            Integer num = (Integer) this.f100446c.mo6606a();
            bmxy.m108581a(str);
            bmxy.m108581a(num);
            if (!num.equals(this.f100449f) || !str.equals(this.f100448e)) {
                bqgg bqgg2 = this.f100450g;
                if (bqgg2 != null) {
                    try {
                        if (bqgg2.get() instanceof chsz) {
                            chsz chsz = (chsz) this.f100450g.get();
                            chsz.mo85624c();
                            bmxy.m108601b(chsz.mo85623a(10, TimeUnit.SECONDS), "The channel has not been closed after timeout");
                        }
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        ((achw) this.f100444a.mo16713a()).mo25413c("Exception during closing the channel", e, new Object[0]);
                    } catch (Exception e2) {
                        ((achw) this.f100444a.mo16713a()).mo25413c("Exception during closing the channel", e2, new Object[0]);
                    }
                }
                this.f100448e = str;
                this.f100449f = num;
                bacf bacf = this.f100451h;
                int intValue = num.intValue();
                cayo cayo = bacf.f100467a;
                Executor executor = bacf.f100468b;
                ((achw) cayo.mo16713a()).logVerbose("[ProdGrpcChannelModule] Binding to %s:%d with OkHttp", str, Integer.valueOf(intValue));
                cifv b = cifv.m150191b(str, intValue);
                b.transportExecutor(executor);
                this.f100450g = bqga.m112775a(b.mo85581b());
            }
            bqgg = this.f100450g;
        }
        return bqgg;
    }
}
