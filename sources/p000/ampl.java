package p000;

import com.google.android.gms.common.internal.ClientContext;
import java.util.concurrent.TimeUnit;

/* renamed from: ampl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ampl {

    /* renamed from: b */
    public static chtv f75667b;

    /* renamed from: c */
    public static chtv f75668c;

    /* renamed from: d */
    public static chtv f75669d;

    /* renamed from: e */
    public static chtv f75670e;

    /* renamed from: f */
    public static chtv f75671f;

    /* renamed from: g */
    public static chtv f75672g;

    /* renamed from: h */
    public static chtv f75673h;

    /* renamed from: i */
    public static chtv f75674i;

    /* renamed from: j */
    public static chtv f75675j;

    /* renamed from: k */
    public static chtv f75676k;

    /* renamed from: l */
    public static chtv f75677l;

    /* renamed from: m */
    public static chtv f75678m;

    /* renamed from: n */
    public static chtv f75679n;

    /* renamed from: o */
    public static chtv f75680o;

    /* renamed from: p */
    private static chtv f75681p;

    /* renamed from: a */
    public final shl f75682a;

    public ampl(shl shl) {
        this.f75682a = shl;
    }

    /* renamed from: a */
    public final btdb mo41247a(ClientContext clientContext, btcz btcz) {
        return mo41248a(clientContext, btcz, 10000);
    }

    /* renamed from: a */
    public final btdb mo41248a(ClientContext clientContext, btcz btcz, long j) {
        if (f75681p == null) {
            f75681p = chtv.m149566a(chtu.UNARY, "google.internal.people.v2.InternalPeopleService/GetPeople", ciie.m150370a(btcz.f148362g), ciie.m150370a(btdb.f148370b));
        }
        return (btdb) this.f75682a.mo25553a(f75681p, clientContext, btcz, j, TimeUnit.MILLISECONDS);
    }
}
