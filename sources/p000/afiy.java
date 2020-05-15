package p000;

import com.google.android.gms.common.internal.ClientContext;
import java.util.concurrent.TimeUnit;

/* renamed from: afiy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afiy {

    /* renamed from: b */
    public static final int f64263b = ((int) cfeo.m138877h());

    /* renamed from: c */
    public static chtv f64264c;

    /* renamed from: d */
    private static chtv f64265d;

    /* renamed from: e */
    private static chtv f64266e;

    /* renamed from: f */
    private static chtv f64267f;

    /* renamed from: g */
    private static chtv f64268g;

    /* renamed from: a */
    public final shl f64269a;

    public afiy(shl shl) {
        this.f64269a = shl;
    }

    /* renamed from: a */
    public final cbli mo34891a(ClientContext clientContext, cblh cblh) {
        if (f64265d == null) {
            f64265d = chtv.m149566a(chtu.UNARY, "google.internal.communications.instantmessaging.v1.IM/Register", ciie.m150370a(cblh.f177503d), ciie.m150370a(cbli.f177508d));
        }
        return (cbli) this.f64269a.mo25553a(f64265d, clientContext, cblh, (long) f64263b, TimeUnit.MILLISECONDS);
    }

    /* renamed from: b */
    public final cblk mo34894b(ClientContext clientContext, cblj cblj) {
        if (f64267f == null) {
            f64267f = chtv.m149566a(chtu.UNARY, "google.internal.communications.instantmessaging.v1.IM/PeriodicRegisterSilent", ciie.m150370a(cblj.f177513f), ciie.m150370a(cblk.f177520f));
        }
        return (cblk) this.f64269a.mo25553a(f64267f, clientContext, cblj, (long) f64263b, TimeUnit.MILLISECONDS);
    }

    /* renamed from: a */
    public final cblk mo34892a(ClientContext clientContext, cblj cblj) {
        if (f64266e == null) {
            f64266e = chtv.m149566a(chtu.UNARY, "google.internal.communications.instantmessaging.v1.IM/RegisterSilent", ciie.m150370a(cblj.f177513f), ciie.m150370a(cblk.f177520f));
        }
        return (cblk) this.f64269a.mo25553a(f64266e, clientContext, cblj, (long) f64263b, TimeUnit.MILLISECONDS);
    }

    /* renamed from: a */
    public final cblw mo34893a(ClientContext clientContext, cblv cblv) {
        if (f64268g == null) {
            f64268g = chtv.m149566a(chtu.UNARY, "google.internal.communications.instantmessaging.v1.IM/Verify", ciie.m150370a(cblv.f177568c), ciie.m150370a(cblw.f177572b));
        }
        return (cblw) this.f64269a.mo25553a(f64268g, clientContext, cblv, (long) f64263b, TimeUnit.MILLISECONDS);
    }
}
