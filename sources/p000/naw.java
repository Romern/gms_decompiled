package p000;

import java.util.HashMap;

/* renamed from: naw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class naw {

    /* renamed from: a */
    public static final lvn f35153a = new lvn("BackupFileBuilder");

    /* renamed from: b */
    public final nax f35154b;

    /* renamed from: c */
    public final nby f35155c;

    /* renamed from: d */
    public final HashMap f35156d;

    /* renamed from: e */
    public long f35157e;

    /* renamed from: f */
    public boolean f35158f;

    /* renamed from: g */
    public final bxvd f35159g;

    /* renamed from: h */
    public final bxvd f35160h;

    public naw(nax nax, mcp mcp) {
        this.f35154b = nax;
        bnha h = bnhe.m109414h();
        bxwc bxwc = mcp.f33434b;
        int size = bxwc.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            mco mco = (mco) bxwc.get(i);
            h.mo67695b(new nbw(mco.f33429b.getKey()), new nbx(j, mco.f33430c));
            j += (long) mco.f33430c;
        }
        this.f35155c = new nby(h.mo67618b());
        bxvd da = mcp.f33431g.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        mcp mcp2 = (mcp) da.f164949b;
        mcp2.f33435c = 1;
        int i2 = 1 | mcp2.f33433a;
        mcp2.f33433a = i2;
        mcp2.f33436d = 0;
        mcp2.f33433a = i2 | 2;
        this.f35159g = da;
        this.f35160h = mcq.f33439d.mo74144da();
        this.f35156d = new HashMap();
    }
}
