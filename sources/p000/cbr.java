package p000;

import android.content.Context;
import android.content.ContextWrapper;
import java.util.List;
import java.util.Map;

/* renamed from: cbr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbr extends ContextWrapper {

    /* renamed from: a */
    static final cce f6423a = new cce();

    /* renamed from: b */
    public final cgr f6424b;

    /* renamed from: c */
    public final cby f6425c;

    /* renamed from: d */
    public final List f6426d;

    /* renamed from: e */
    public final Map f6427e;

    /* renamed from: f */
    public final cfu f6428f;

    /* renamed from: g */
    public final int f6429g = 4;

    /* renamed from: h */
    private cpu f6430h;

    public cbr(Context context, cgr cgr, cby cby, Map map, List list, cfu cfu) {
        super(context.getApplicationContext());
        this.f6424b = cgr;
        this.f6425c = cby;
        this.f6426d = list;
        this.f6427e = map;
        this.f6428f = cfu;
    }

    /* renamed from: a */
    public final synchronized cpu mo3660a() {
        if (this.f6430h == null) {
            cpu cpu = new cpu();
            cpu.mo8109f();
            this.f6430h = cpu;
        }
        return this.f6430h;
    }
}
