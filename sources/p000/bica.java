package p000;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: bica */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bica implements Callable {

    /* renamed from: a */
    private final bibq f120181a;

    /* renamed from: b */
    private final long[] f120182b;

    public bica(bibq bibq, long[] jArr) {
        this.f120181a = bibq;
        this.f120182b = jArr;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        bibq bibq = this.f120181a;
        long[] jArr = this.f120182b;
        bibx bibx = bibq.f120155b;
        int length = jArr.length;
        ArrayList arrayList = new ArrayList(length);
        for (long j : jArr) {
            arrayList.add(Long.valueOf(j));
        }
        bxvd da = bvui.f157693d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvui bvui = (bvui) da.f164949b;
        if (!bvui.f157696b.mo73666a()) {
            bvui.f157696b = bxvk.m124020a(bvui.f157696b);
        }
        bxsy.m123078a(arrayList, bvui.f157696b);
        bxvd da2 = bvny.f156984c.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bvny bvny = (bvny) da2.f164949b;
        bvny.f156986a |= 1;
        bvny.f156987b = 64723;
        bvny.m121305a(bvny);
        bvny bvny2 = (bvny) da2.mo74062i();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvui bvui2 = (bvui) da.f164949b;
        bvny2.getClass();
        bvui2.f157697c = bvny2;
        bvui2.f157695a |= 1;
        bvui bvui3 = (bvui) da.mo74062i();
        long c = cghh.m145422c();
        if (bibx.f120169b == null) {
            bibx.f120169b = chtv.m149566a(chtu.UNARY, "userlocation.SemanticLocationService/GetPlaceIndex", ciie.m150370a(bvui.f157693d), ciie.m150370a(bvuj.f157698c));
        }
        return (bvuj) bibx.f120175a.mo25554a(bibx.f120169b, bvui3, c, TimeUnit.MILLISECONDS);
    }
}
