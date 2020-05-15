package p000;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: bawq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bawq implements bavw {

    /* renamed from: a */
    public final Context f101992a;

    /* renamed from: b */
    public final bbep f101993b;

    /* renamed from: c */
    public final bbch f101994c;

    /* renamed from: d */
    public final befa f101995d;

    /* renamed from: e */
    public final Executor f101996e;

    /* renamed from: f */
    public final bmxv f101997f;

    /* renamed from: g */
    private final bqfj f101998g = bqfj.m112745a();

    public bawq(Context context, bbep bbep, bbch bbch, Executor executor, befa befa, bmxv bmxv) {
        new HashMap();
        this.f101992a = context;
        this.f101993b = bbep;
        this.f101996e = executor;
        this.f101994c = bbch;
        this.f101995d = befa;
        this.f101997f = bmxv;
    }

    /* renamed from: a */
    public static bato m87633a(String str, int i, int i2, String str2) {
        bxvd da = bato.f101710f.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bato bato = (bato) da.f164949b;
        str.getClass();
        int i3 = bato.f101712a | 1;
        bato.f101712a = i3;
        bato.f101713b = str;
        int i4 = i3 | 4;
        bato.f101712a = i4;
        bato.f101715d = i;
        if (i2 > 0) {
            i4 |= 8;
            bato.f101712a = i4;
            bato.f101716e = i2;
        }
        if (str2 != null) {
            str2.getClass();
            bato.f101712a = i4 | 2;
            bato.f101714c = str2;
        }
        return (bato) da.mo74062i();
    }

    /* renamed from: a */
    public final bqgg mo55992a() {
        bqfj bqfj = this.f101998g;
        bbch bbch = this.f101994c;
        bbch.getClass();
        return bqfj.mo69205a(new bavy(bbch), this.f101996e);
    }

    /* renamed from: a */
    public final bqgg mo55993a(batz batz) {
        return this.f101998g.mo69205a(new bavx(this, batz), this.f101996e);
    }

    /* renamed from: a */
    public final bqgg mo55994a(baus baus) {
        bauc bauc = (bauc) baus;
        String str = bauc.f101749a;
        bxvd da = bavr.f101916f.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bavr bavr = (bavr) da.f164949b;
        str.getClass();
        bavr.f101918a |= 1;
        bavr.f101919b = str;
        String packageName = this.f101992a.getPackageName();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bavr bavr2 = (bavr) da.f164949b;
        packageName.getClass();
        bavr2.f101918a |= 2;
        bavr2.f101920c = packageName;
        if (bauc.f101750b.mo66813a()) {
            String a = bawv.m87644a((Account) bauc.f101750b.mo66814b());
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bavr bavr3 = (bavr) da.f164949b;
            a.getClass();
            bavr3.f101918a |= 4;
            bavr3.f101921d = a;
        }
        bqgg a2 = bqdx.m112673a(bqga.m112771a(new bawn(this, baus, str, (bavr) da.mo74062i()), this.f101996e), new bawo(this, baus, str), this.f101996e);
        bqga.m112781a(a2, new bawp(this, baus, str), this.f101996e);
        return a2;
    }

    /* renamed from: a */
    public final bqgg mo55995a(bauu bauu) {
        return this.f101998g.mo69205a(new bawm(this, bauu), this.f101996e);
    }

    /* renamed from: a */
    public final bqgg mo55997a(bavd bavd, String str, int i) {
        if (bavd == null) {
            return bqga.m112775a((Object) null);
        }
        batp batp = (batp) batr.f101718h.mo74144da();
        String str2 = bavd.f101873c;
        if (batp.f164950c) {
            batp.mo74035c();
            batp.f164950c = false;
        }
        batr batr = (batr) batp.f164949b;
        str2.getClass();
        int i2 = batr.f101720a | 1;
        batr.f101720a = i2;
        batr.f101721b = str2;
        String str3 = bavd.f101874d;
        str3.getClass();
        int i3 = i2 | 2;
        batr.f101720a = i3;
        batr.f101722c = str3;
        int i4 = bavd.f101875e;
        int i5 = i3 | 8;
        batr.f101720a = i5;
        batr.f101724e = i4;
        batr.f101725f = i - 1;
        int i6 = i5 | 16;
        batr.f101720a = i6;
        if (str != null) {
            str.getClass();
            batr.f101720a = i6 | 4;
            batr.f101723d = str;
        }
        bqgg a = bqga.m112775a(batp);
        bxwc bxwc = bavd.f101880j;
        int size = bxwc.size();
        for (int i7 = 0; i7 < size; i7++) {
            a = bqdx.m112674a(a, new bawj(this, i, (bauy) bxwc.get(i7), bavd), this.f101996e);
        }
        return bqdf.m112619a(bqdx.m112673a(bqfl.m112747c(a), bawk.f101978a, this.f101996e), bauq.class, bawl.f101979a, this.f101996e);
    }

    /* renamed from: a */
    public final bqgg mo55996a(baws baws) {
        return this.f101998g.mo69205a(new bavz(this, baws), this.f101996e);
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [java.util.List, java.lang.Iterable], assign insn: 0x0007: INVOKE  (r10v1 ? I:java.lang.Iterable) = (r1v0 befa), (r10v0 android.net.Uri) type: VIRTUAL call: befa.f(android.net.Uri):java.lang.Iterable */
    /* renamed from: a */
    public final List mo55998a(Uri uri, String str) {
        ArrayList arrayList = new ArrayList();
        ? f = this.f101995d.mo60650f(uri);
        int size = f.size();
        for (int i = 0; i < size; i++) {
            Uri uri2 = (Uri) f.get(i);
            if (this.f101995d.mo60648d(uri2)) {
                arrayList.addAll(mo55998a(uri2, str));
            } else {
                String path = uri2.getPath();
                if (path != null) {
                    bxvd da = bato.f101710f.mo74144da();
                    String replaceFirst = path.replaceFirst(str, "");
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bato bato = (bato) da.f164949b;
                    replaceFirst.getClass();
                    bato.f101712a |= 1;
                    bato.f101713b = replaceFirst;
                    int e = (int) this.f101995d.mo60649e(uri2);
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bato bato2 = (bato) da.f164949b;
                    bato2.f101712a |= 4;
                    bato2.f101715d = e;
                    String uri3 = uri2.toString();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bato bato3 = (bato) da.f164949b;
                    uri3.getClass();
                    bato3.f101712a |= 2;
                    bato3.f101714c = uri3;
                    arrayList.add((bato) da.mo74062i());
                }
            }
        }
        return arrayList;
    }
}
