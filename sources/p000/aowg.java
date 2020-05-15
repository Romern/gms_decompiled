package p000;

import com.google.android.gms.common.internal.ClientContext;
import java.util.concurrent.TimeUnit;

/* renamed from: aowg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aowg {

    /* renamed from: b */
    public static final int f83736b = ((Integer) aoss.f83544c.mo58455c()).intValue();

    /* renamed from: c */
    public static chtv f83737c;

    /* renamed from: d */
    public static chtv f83738d;

    /* renamed from: e */
    public static chtv f83739e;

    /* renamed from: f */
    public static chtv f83740f;

    /* renamed from: g */
    public static chtv f83741g;

    /* renamed from: h */
    public static chtv f83742h;

    /* renamed from: i */
    public static chtv f83743i;

    /* renamed from: j */
    public static chtv f83744j;

    /* renamed from: k */
    public static chtv f83745k;

    /* renamed from: l */
    public static chtv f83746l;

    /* renamed from: m */
    public static chtv f83747m;

    /* renamed from: n */
    public static chtv f83748n;

    /* renamed from: o */
    private static chtv f83749o;

    /* renamed from: p */
    private static chtv f83750p;

    /* renamed from: q */
    private static chtv f83751q;

    /* renamed from: r */
    private static chtv f83752r;

    /* renamed from: s */
    private static chtv f83753s;

    /* renamed from: t */
    private static chtv f83754t;

    /* renamed from: a */
    public final shl f83755a;

    public aowg(shl shl) {
        this.f83755a = shl;
    }

    /* renamed from: a */
    public final blpg mo46955a(ClientContext clientContext, blpf blpf) {
        if (f83750p == null) {
            f83750p = chtv.m149566a(chtu.UNARY, "caribou.tasks.service.TasksApiService/BumpTask", ciie.m150370a(blpf.f127211d), ciie.m150370a(blpg.f127216a));
        }
        return (blpg) this.f83755a.mo25553a(f83750p, clientContext, blpf, (long) f83736b, TimeUnit.MILLISECONDS);
    }

    /* renamed from: a */
    public final blpi mo46956a(ClientContext clientContext, blph blph) {
        if (f83754t == null) {
            f83754t = chtv.m149566a(chtu.UNARY, "caribou.tasks.service.TasksApiService/ChangeRecurrence", ciie.m150370a(blph.f127219h), ciie.m150370a(blpi.f127229a));
        }
        return (blpi) this.f83755a.mo25553a(f83754t, clientContext, blph, (long) f83736b, TimeUnit.MILLISECONDS);
    }

    /* renamed from: a */
    public final blpn mo46957a(ClientContext clientContext, blpm blpm) {
        if (f83751q == null) {
            f83751q = chtv.m149566a(chtu.UNARY, "caribou.tasks.service.TasksApiService/CreateRecurrence", ciie.m150370a(blpm.f127244g), ciie.m150370a(blpn.f127253a));
        }
        return (blpn) this.f83755a.mo25553a(f83751q, clientContext, blpm, (long) f83736b, TimeUnit.MILLISECONDS);
    }

    /* renamed from: a */
    public final blqi mo46958a(ClientContext clientContext, blqh blqh) {
        if (f83752r == null) {
            f83752r = chtv.m149566a(chtu.UNARY, "caribou.tasks.service.TasksApiService/GetTask", ciie.m150370a(blqh.f127336d), ciie.m150370a(blqi.f127341b));
        }
        return (blqi) this.f83755a.mo25553a(f83752r, clientContext, blqh, (long) f83736b, TimeUnit.MILLISECONDS);
    }

    /* renamed from: a */
    public final blqk mo46959a(ClientContext clientContext, blqj blqj) {
        if (f83753s == null) {
            f83753s = chtv.m149566a(chtu.UNARY, "caribou.tasks.service.TasksApiService/ListTasks", ciie.m150370a(blqj.f127345f), ciie.m150370a(blqk.f127353e));
        }
        return (blqk) this.f83755a.mo25553a(f83753s, clientContext, blqj, (long) f83736b, TimeUnit.MILLISECONDS);
    }

    /* renamed from: a */
    public final void mo46960a(ClientContext clientContext, blpa blpa) {
        if (f83749o == null) {
            f83749o = chtv.m149566a(chtu.UNARY, "caribou.tasks.service.TasksApiService/BatchMutate", ciie.m150370a(blpa.f127184d), ciie.m150370a(blpb.f127190a));
        }
        blpb blpb = (blpb) this.f83755a.mo25553a(f83749o, clientContext, blpa, (long) f83736b, TimeUnit.MILLISECONDS);
    }
}
