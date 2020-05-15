package p000;

import com.google.android.gms.common.internal.ClientContext;
import java.util.concurrent.TimeUnit;

/* renamed from: qrr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qrr {

    /* renamed from: b */
    public static chtv f42004b;

    /* renamed from: c */
    public static chtv f42005c;

    /* renamed from: d */
    public static chtv f42006d;

    /* renamed from: e */
    public static chtv f42007e;

    /* renamed from: f */
    public static chtv f42008f;

    /* renamed from: g */
    public static chtv f42009g;

    /* renamed from: h */
    public static chtv f42010h;

    /* renamed from: i */
    public static chtv f42011i;

    /* renamed from: j */
    public static chtv f42012j;

    /* renamed from: k */
    public static chtv f42013k;

    /* renamed from: l */
    private static chtv f42014l;

    /* renamed from: a */
    public final shl f42015a;

    public qrr(shl shl) {
        this.f42015a = shl;
    }

    /* renamed from: a */
    public final bstl mo24232a(ClientContext clientContext, bstk bstk) {
        if (f42014l == null) {
            f42014l = chtv.m149566a(chtu.UNARY, "google.internal.chrome.sync.passwords.v1.Passwords/BatchUpdatePasswords", ciie.m150370a(bstk.f147023b), ciie.m150370a(bstl.f147026c));
        }
        return (bstl) this.f42015a.mo25553a(f42014l, clientContext, bstk, 10000, TimeUnit.MILLISECONDS);
    }
}
