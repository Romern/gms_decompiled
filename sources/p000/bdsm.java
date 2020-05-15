package p000;

import android.util.Log;

/* renamed from: bdsm */
final /* synthetic */ class bdsm implements bmxj {

    /* renamed from: a */
    private final bdte f106370a;

    public bdsm(bdte bdte) {
        this.f106370a = bdte;
    }

    public final Object apply(Object obj) {
        bdte bdte = this.f106370a;
        Void voidR = (Void) obj;
        if (!bdte.f106405a) {
            Log.w("DeletionsDownloader", "No deletedAll callback received during initialization sync");
        }
        if (bdte.f106406b > 0) {
            Log.w("DeletionsDownloader", "Ignored deleteByUuids callback during initialization sync");
        }
        return Boolean.FALSE;
    }
}
