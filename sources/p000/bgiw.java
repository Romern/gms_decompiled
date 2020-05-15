package p000;

import android.content.Context;
import java.util.Random;

/* renamed from: bgiw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgiw extends bgij {

    /* renamed from: a */
    public final Context f116565a;

    /* renamed from: b */
    public final bgmk f116566b;

    /* renamed from: c */
    public final bgns f116567c;

    /* renamed from: d */
    public final bgid f116568d;

    /* renamed from: e */
    public final bfor f116569e;

    /* renamed from: f */
    public final bfct f116570f;

    /* renamed from: g */
    public final Random f116571g = new Random();

    /* renamed from: h */
    public final bwcn f116572h;

    /* renamed from: i */
    private final bgiv f116573i;

    /* renamed from: j */
    private final bgiv f116574j;

    /* renamed from: k */
    private final bgiv f116575k;

    public bgiw(Context context, bgmk bgmk, bgns bgns, bfct bfct, bgid bgid, bfor bfor) {
        this.f116566b = bgmk;
        this.f116567c = bgns;
        this.f116570f = bfct;
        this.f116568d = bgid;
        this.f116569e = bfor;
        this.f116565a = context.getApplicationContext();
        this.f116572h = bwcn.m121756a();
        this.f116573i = new bgiv(this, 1, bgnq.GLS_QUERY);
        this.f116574j = new bgiv(this, 2, bgnq.GLS_UPLOAD);
        this.f116575k = new bgiv(this, 3, bgnq.GLS_LOC_QUERY);
    }

    /* renamed from: a */
    public final void mo62864a(bsax bsax) {
        this.f116575k.mo62873a(new bgit(bsax, 0, null, null, null));
    }

    /* renamed from: a */
    public final void mo62865a(bsax bsax, int i, bgmj bgmj, bgmn bgmn) {
        this.f116573i.mo62873a(new bgit(bsax, i, bgmj, null, bgmn));
    }

    /* renamed from: a */
    public final void mo62866a(bsax bsax, bglz bglz) {
        this.f116574j.mo62873a(new bgit(bsax, 0, null, bglz, null));
    }
}
