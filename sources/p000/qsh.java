package p000;

import android.content.Context;
import java.util.HashSet;

/* renamed from: qsh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qsh {

    /* renamed from: a */
    private static final bmzu f42027a;

    /* renamed from: b */
    private final Context f42028b;

    /* renamed from: c */
    private final qws f42029c;

    static {
        bmzz a = bmzz.m108708a();
        a.mo66960b(bnbg.SOFT);
        f42027a = a.mo66962d();
    }

    private qsh(Context context, String str) {
        this.f42028b = context;
        this.f42029c = new qws(this.f42028b, "CHROMESYNC", str);
    }

    /* renamed from: a */
    public static synchronized qsh m32791a(Context context, String str) {
        qsh qsh;
        synchronized (qsh.class) {
            qsh = (qsh) f42027a.mo66947b(str);
            if (qsh == null) {
                qsh = new qsh(context, str);
                f42027a.mo66946a(str, qsh);
            }
        }
        return qsh;
    }

    /* renamed from: a */
    private final void m32792a(bxvd bxvd) {
        HashSet hashSet = new HashSet();
        for (String str : bmyx.m108640a(',').mo66917a().mo66918a((CharSequence) qqv.f41981r.mo58455c())) {
            hashSet.add(Integer.valueOf(Integer.parseInt(str)));
        }
        int a = bokc.m111278a(((bokd) bxvd.f164949b).f133389b);
        if (a == 0) {
            a = 1;
        }
        if (hashSet.contains(Integer.valueOf(a - 1))) {
            this.f42029c.mo24335a(((bokd) bxvd.mo74062i()).serializeToBytes()).mo24327b();
        }
    }

    /* renamed from: a */
    public final void mo24249a(boka boka) {
        bxvd da = bokd.f133386e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bokd bokd = (bokd) da.f164949b;
        bokd.f133389b = 2;
        int i = bokd.f133388a | 1;
        bokd.f133388a = i;
        boka.getClass();
        bokd.f133390c = boka;
        bokd.f133388a = i | 2;
        m32792a(da);
    }

    /* renamed from: a */
    public final void mo24250a(bokg bokg) {
        bxvd da = bokd.f133386e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bokd bokd = (bokd) da.f164949b;
        bokd.f133389b = 1;
        int i = 1 | bokd.f133388a;
        bokd.f133388a = i;
        bokg.getClass();
        bokd.f133391d = bokg;
        bokd.f133388a = i | 4;
        m32792a(da);
    }
}
