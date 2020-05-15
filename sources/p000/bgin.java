package p000;

import android.content.Context;
import java.util.Random;

/* renamed from: bgin */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgin extends bgij {

    /* renamed from: a */
    public final Context f116534a;

    /* renamed from: b */
    public final bgmk f116535b;

    /* renamed from: c */
    public final bgns f116536c;

    /* renamed from: d */
    public final bgid f116537d;

    /* renamed from: e */
    public final bfor f116538e;

    /* renamed from: f */
    public final bfct f116539f;

    /* renamed from: g */
    public final Random f116540g = new Random();

    /* renamed from: h */
    public final bwcn f116541h;

    /* renamed from: i */
    private final bgim f116542i;

    /* renamed from: j */
    private final bgim f116543j;

    /* renamed from: k */
    private final bgim f116544k;

    public bgin(Context context, bgmk bgmk, bgns bgns, bfct bfct, bgid bgid, bfor bfor) {
        this.f116535b = bgmk;
        this.f116536c = bgns;
        this.f116539f = bfct;
        this.f116537d = bgid;
        this.f116538e = bfor;
        this.f116534a = context.getApplicationContext();
        this.f116541h = bwcn.m121756a();
        this.f116542i = new bgim(this, 1, bgnq.GLS_QUERY);
        this.f116543j = new bgim(this, 2, bgnq.GLS_UPLOAD);
        this.f116544k = new bgim(this, 3, bgnq.GLS_LOC_QUERY);
    }

    /* renamed from: a */
    public final void mo62864a(bsax bsax) {
        this.f116544k.mo62868a(new bgik(bsax, 0, null, null, null));
    }

    /* renamed from: a */
    public final void mo62865a(bsax bsax, int i, bgmj bgmj, bgmn bgmn) {
        this.f116542i.mo62868a(new bgik(bsax, i, bgmj, null, bgmn));
    }

    /* renamed from: a */
    public final void mo62866a(bsax bsax, bglz bglz) {
        this.f116543j.mo62868a(new bgik(bsax, 0, null, bglz, null));
    }
}
