package p000;

import android.content.Context;
import com.google.android.gms.location.places.internal.PlacesParams;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* renamed from: biau */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class biau implements Callable {

    /* renamed from: a */
    private final biam f120074a;

    /* renamed from: b */
    private final long[] f120075b;

    public biau(biam biam, long[] jArr) {
        this.f120074a = biam;
        this.f120075b = jArr;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        biam biam = this.f120074a;
        long[] jArr = this.f120075b;
        sgv sgv = biam.f120057e;
        Context context = biam.f120053a;
        int length = jArr.length;
        PlacesParams placesParams = PlacesParams.f79571a;
        ArrayList arrayList = new ArrayList(length);
        for (long j : jArr) {
            arrayList.add(Long.valueOf(j));
        }
        bxvd da = bvox.f157234d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvox bvox = (bvox) da.f164949b;
        if (!bvox.f157237b.mo73666a()) {
            bvox.f157237b = GeneratedMessageLite.m124020a(bvox.f157237b);
        }
        bxsy.m123078a(arrayList, bvox.f157237b);
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
        bvox bvox2 = (bvox) da.f164949b;
        bvny2.getClass();
        bvox2.f157238c = bvny2;
        bvox2.f157236a |= 1;
        bvox bvox3 = (bvox) da.mo74062i();
        bxvd da3 = bvna.f156836d.mo74144da();
        bvov a = bian.m101870a(context, placesParams);
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        bvna bvna = (bvna) da3.f164949b;
        a.getClass();
        bvna.f156839b = a;
        int i = bvna.f156838a | 1;
        bvna.f156838a = i;
        bvox3.getClass();
        bvna.f156840c = bvox3;
        bvna.f156838a = i | 32;
        bvnb bvnb = (bvnb) sgv.mo25517a("getPlaceInferenceModels", ((bvna) da3.mo74062i()).serializeToBytes(), bvnb.f156841d, biam.f120055c, biam.f120056d, cggs.m145360c(), 10248);
        Context context2 = biam.f120053a;
        bvoy bvoy = null;
        if (!(bvnb == null || (bvnb.f156843a & 32) == 0)) {
            bvow bvow = bvnb.f156844b;
            if (bvow == null) {
                bvow = bvow.f157230c;
            }
            bian.m101877a(context2, bvow);
            bvoy = bvnb.f156845c;
            if (bvoy == null) {
                return bvoy.f157239c;
            }
        }
        return bvoy;
    }
}
