package p000;

import com.google.android.libraries.matchstick.data.LocalEntityId;

/* renamed from: azgx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class azgx implements azgw {

    /* renamed from: b */
    public final String f99325b;

    /* renamed from: c */
    protected final bxxc f99326c;

    /* renamed from: d */
    public final LocalEntityId f99327d;

    /* renamed from: e */
    public final aznz f99328e;

    /* renamed from: f */
    public final long f99329f;

    protected azgx(cbkj cbkj) {
        this.f99325b = cbkj.f177409c;
        this.f99329f = cbkj.f177412f;
        bxxc a = mo54916a(cbkj);
        bmxy.m108581a(a);
        this.f99326c = a;
        LocalEntityId a2 = mo54917a(cbkj, a);
        this.f99327d = a2;
        this.f99328e = mo54915a(cbkj, this.f99326c, a2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract aznz mo54915a(cbkj cbkj, bxxc bxxc, LocalEntityId localEntityId);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract bxxc mo54916a(cbkj cbkj);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract LocalEntityId mo54917a(cbkj cbkj, bxxc bxxc);
}
