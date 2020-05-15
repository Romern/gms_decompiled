package p000;

import android.content.Context;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.location.places.internal.PlacesParams;
import java.util.concurrent.Callable;

/* renamed from: biav */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class biav implements Callable {

    /* renamed from: a */
    private final biam f120076a;

    /* renamed from: b */
    private final bvmo[] f120077b;

    public biav(biam biam, bvmo[] bvmoArr) {
        this.f120076a = biam;
        this.f120077b = bvmoArr;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        biam biam = this.f120076a;
        bvmo[] bvmoArr = this.f120077b;
        sgv sgv = biam.f120057e;
        Context context = biam.f120053a;
        PlacesParams placesParams = PlacesParams.f79571a;
        int b = stu.m36316b();
        int i = ModuleManager.get(biam.f120053a).getCurrentModule().moduleVersion;
        bxvd da = bvml.f156751f.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvml bvml = (bvml) da.f164949b;
        int i2 = bvml.f156753a | 2;
        bvml.f156753a = i2;
        bvml.f156755c = b;
        bvml.f156753a = i2 | 4;
        bvml.f156756d = i;
        bvov a = bian.m101870a(context, placesParams);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvml bvml2 = (bvml) da.f164949b;
        a.getClass();
        bvml2.f156754b = a;
        bvml2.f156753a |= 1;
        for (bvmo bvmo : bvmoArr) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bvml bvml3 = (bvml) da.f164949b;
            bvmo.getClass();
            if (!bvml3.f156757e.mo73666a()) {
                bvml3.f156757e = GeneratedMessageLite.m124021a(bvml3.f156757e);
            }
            bvml3.f156757e.add(bvmo);
        }
        return (bvmm) sgv.mo25517a("getPlaceInferenceModelWeights", ((bvml) da.mo74062i()).serializeToBytes(), bvmm.f156758d, biam.f120055c, biam.f120056d, cggs.m145360c(), 10269);
    }
}
