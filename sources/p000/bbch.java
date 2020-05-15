package p000;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: bbch */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbch {

    /* renamed from: a */
    public static volatile boolean f102314a = false;

    /* renamed from: b */
    public final Context f102315b;

    /* renamed from: c */
    public final bbep f102316c;

    /* renamed from: d */
    public final bbav f102317d;

    /* renamed from: e */
    public final bbaz f102318e;

    /* renamed from: f */
    public final bbda f102319f;

    /* renamed from: g */
    public final bbdd f102320g;

    /* renamed from: h */
    public final bayg f102321h;

    /* renamed from: i */
    public final bawt f102322i;

    /* renamed from: j */
    public final bbfc f102323j;

    /* renamed from: k */
    public final bbeu f102324k;

    /* renamed from: l */
    public final bbew f102325l;

    /* renamed from: m */
    public final bmxv f102326m;

    /* renamed from: n */
    public final Executor f102327n;

    public bbch(Context context, bbep bbep, bbda bbda, bbdd bbdd, bbav bbav, bbaz bbaz, bayg bayg, bawt bawt, bbfc bbfc, bbeu bbeu, bbew bbew, bmxv bmxv, Executor executor) {
        this.f102315b = context;
        this.f102316c = bbep;
        this.f102319f = bbda;
        this.f102320g = bbdd;
        this.f102317d = bbav;
        this.f102318e = bbaz;
        this.f102321h = bayg;
        this.f102322i = bawt;
        this.f102323j = bbfc;
        this.f102324k = bbeu;
        this.f102325l = bbew;
        this.f102326m = bmxv;
        this.f102327n = executor;
    }

    /* renamed from: a */
    public final bqgg mo56063a() {
        if (f102314a) {
            return bqga.m112775a((Object) null);
        }
        return bqdx.m112673a(bqdx.m112674a(bqdx.m112674a(bqdx.m112674a(bqfl.m112747c(bqga.m112775a((Object) null)), new bbbc(this, bbfh.m87928a(this.f102315b, "gms_icing_mdd_manager_metadata", this.f102326m)), this.f102327n), new bbbn(this), this.f102327n), new bbby(this), this.f102327n), bbca.f102299a, this.f102327n);
    }

    /* renamed from: b */
    public final bqgg mo56066b() {
        return bqdx.m112674a(mo56063a(), new bbce(this), this.f102327n);
    }

    /* renamed from: c */
    public final bqgg mo56067c() {
        return bqdx.m112674a(mo56063a(), new bbbg(this), this.f102327n);
    }

    /* renamed from: d */
    public final bqgg mo56068d() {
        return bqdx.m112674a(mo56063a(), new bbbi(this), this.f102327n);
    }

    /* renamed from: e */
    public final bqgg mo56069e() {
        return bqdx.m112674a(this.f102317d.mo56040a(), new bbbk(this), this.f102327n);
    }

    /* renamed from: f */
    public final bqgg mo56070f() {
        return bqdx.m112674a(this.f102317d.mo56040a(), new bbbl(this), this.f102327n);
    }

    /* renamed from: a */
    public final bqgg mo56064a(bauy bauy, bavd bavd) {
        Object[] objArr = {"MDDManager", bauy.f101850b, bavd.f101873c};
        return bqdx.m112674a(mo56063a(), new bbcf(this, bauy, bavd), this.f102327n);
    }

    /* renamed from: a */
    public final bqgg mo56065a(bavr bavr, bavd bavd) {
        return bqdx.m112674a(mo56063a(), new bbcb(this, bavd, bavr), this.f102327n);
    }
}
