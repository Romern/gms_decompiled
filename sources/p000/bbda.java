package p000;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: bbda */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbda {

    /* renamed from: a */
    public final Context f102391a;

    /* renamed from: b */
    public final bawt f102392b;

    /* renamed from: c */
    public final bbdd f102393c;

    /* renamed from: d */
    public final bben f102394d;

    /* renamed from: e */
    public final befa f102395e;

    /* renamed from: f */
    public final bmxv f102396f;

    /* renamed from: g */
    public final bmxv f102397g;

    /* renamed from: h */
    public final bbep f102398h;

    /* renamed from: i */
    public final bbaz f102399i;

    /* renamed from: j */
    public final bmxv f102400j;

    /* renamed from: k */
    public final Executor f102401k;

    public bbda(Context context, bawt bawt, bbdd bbdd, befa befa, bben bben, bmxv bmxv, bmxv bmxv2, bbep bbep, bbaz bbaz, bmxv bmxv3, Executor executor) {
        this.f102391a = context;
        this.f102392b = bawt;
        this.f102393c = bbdd;
        this.f102395e = befa;
        this.f102394d = bben;
        this.f102396f = bmxv;
        this.f102397g = bmxv2;
        this.f102398h = bbep;
        this.f102399i = bbaz;
        this.f102400j = bmxv3;
        this.f102401k = executor;
    }

    /* renamed from: a */
    public final bqgg mo56071a() {
        bbfh.m87928a(this.f102391a, "gms_icing_mdd_shared_file_manager_metadata", this.f102400j).edit().clear().commit();
        try {
            this.f102395e.mo60651h(bbfd.m87918a(this.f102391a, this.f102400j));
        } catch (IOException e) {
            this.f102392b.mo55999a("Failure while deleting mdd storage during clear", e);
        }
        return bqga.m112775a((Object) null);
    }

    /* renamed from: b */
    public final bqgg mo56075b(bavt bavt) {
        return bqdx.m112674a(this.f102393c.mo56079a(bavt), new bbcw(this, bavt), this.f102401k);
    }

    /* renamed from: c */
    public final bqgg mo56076c(bavt bavt) {
        return bqdx.m112674a(this.f102393c.mo56079a(bavt), new bbcz(this, bavt), this.f102401k);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final bqgg mo56072a(bavt bavt) {
        return bqdx.m112674a(this.f102393c.mo56079a(bavt), new bbcv(bavt), this.f102401k);
    }

    /* renamed from: a */
    public final bqgg mo56073a(List list, int i, int i2) {
        if (i == list.size()) {
            return bqga.m112775a((Object) null);
        }
        bavg bavg = (bavg) list.get(i);
        int a = bavf.m87598a(bavg.f101890e);
        if (a == 0) {
            a = 1;
        }
        if (a != ((baxa) this.f102396f.mo66814b()).mo56001b()) {
            return mo56073a(list, i + 1, i2);
        }
        bxvd da = bavt.f101927g.mo74144da();
        bauv bauv = bavg.f101891f;
        if (bauv == null) {
            bauv = bauv.f101842b;
        }
        String str = bauv.f101844a;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bavt bavt = (bavt) da.f164949b;
        str.getClass();
        int i3 = bavt.f101929a | 4;
        bavt.f101929a = i3;
        bavt.f101932d = str;
        bavt.f101933e = i2 - 1;
        bavt.f101929a = i3 | 8;
        bavt bavt2 = (bavt) da.mo74062i();
        return bqdx.m112674a(this.f102393c.mo56079a(bavt2), new bbcu(this, bavt2, bavg, list, i, i2), this.f102401k);
    }

    /* renamed from: a */
    public final void mo56074a(bavr bavr, Uri uri) {
        if (this.f102397g.mo66813a()) {
            try {
                long e = this.f102395e.mo60649e(uri);
                if (e > 0) {
                    ((bbfl) this.f102397g.mo66814b()).mo56099a(bavr.f101919b, e);
                }
            } catch (IOException e2) {
            }
        }
    }
}
