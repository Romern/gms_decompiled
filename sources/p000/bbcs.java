package p000;

import android.content.Context;
import android.net.Uri;
import java.util.List;

/* renamed from: bbcs */
final /* synthetic */ class bbcs implements bqeh {

    /* renamed from: a */
    private final bbda f102366a;

    /* renamed from: b */
    private final bavg f102367b;

    /* renamed from: c */
    private final bauy f102368c;

    /* renamed from: d */
    private final bavt f102369d;

    /* renamed from: e */
    private final bavr f102370e;

    /* renamed from: f */
    private final int f102371f;

    /* renamed from: g */
    private final Uri f102372g;

    /* renamed from: h */
    private final bavn f102373h;

    /* renamed from: i */
    private final int f102374i;

    /* renamed from: j */
    private final List f102375j;

    public bbcs(bbda bbda, bavg bavg, bauy bauy, bavt bavt, bavr bavr, int i, Uri uri, bavn bavn, int i2, List list) {
        this.f102366a = bbda;
        this.f102367b = bavg;
        this.f102368c = bauy;
        this.f102369d = bavt;
        this.f102370e = bavr;
        this.f102371f = i;
        this.f102372g = uri;
        this.f102373h = bavn;
        this.f102374i = i2;
        this.f102375j = list;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        List list;
        int i;
        bavn bavn;
        int i2;
        bavr bavr;
        bbda bbda;
        int i3;
        int i4;
        bbda bbda2 = this.f102366a;
        bavg bavg = this.f102367b;
        bauy bauy = this.f102368c;
        bavt bavt = this.f102369d;
        bavr bavr2 = this.f102370e;
        int i5 = this.f102371f;
        Uri uri = this.f102372g;
        bavn bavn2 = this.f102373h;
        int i6 = this.f102374i;
        List list2 = this.f102375j;
        Boolean bool = (Boolean) obj;
        if (!bbda2.f102396f.mo66813a()) {
            bbda = bbda2;
            list = list2;
            i = i6;
            bavn = bavn2;
            i2 = i5;
            bavr = bavr2;
        } else if (bavg != null) {
            Context context = bbda2.f102391a;
            bbdd bbdd = bbda2.f102393c;
            befa befa = bbda2.f102395e;
            bawt bawt = bbda2.f102392b;
            int a = bavb.m87594a(bavt.f101933e);
            if (a != 0) {
                i4 = a;
            } else {
                i4 = 1;
            }
            bbec bbec = new bbec(context, bbdd, befa, bawt, bauy, i4, (baxa) bbda2.f102396f.mo66814b(), bavg, bbda2.f102398h, bavr2, i5, bbda2.f102400j, bbda2.f102401k);
            bbda2.mo56074a(bavr2, uri);
            return bbda2.f102394d.mo56090a(bavr2, i5, uri, bavg.f101887b, bavg.f101888c, bavn2, bbec, i6, list2);
        } else {
            bbda = bbda2;
            list = list2;
            i = i6;
            bavn = bavn2;
            i2 = i5;
            bavr = bavr2;
        }
        bbdd bbdd2 = bbda.f102393c;
        befa befa2 = bbda.f102395e;
        int a2 = bavb.m87594a(bavt.f101933e);
        if (a2 != 0) {
            i3 = a2;
        } else {
            i3 = 1;
        }
        bbef bbef = new bbef(bbdd2, befa2, bauy, i3, bbda.f102398h, bavr, i2, bbda.f102401k);
        bbda.mo56074a(bavr, uri);
        return bbda.f102394d.mo56090a(bavr, i2, uri, bauy.f101851c, bauy.f101852d, bavn, bbef, i, list);
    }
}
