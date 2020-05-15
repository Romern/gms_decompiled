package p000;

import com.google.firebase.appindexing.internal.GetIndexableResponse;
import com.google.firebase.appindexing.internal.Thing;

/* renamed from: brio */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brio extends brit {

    /* renamed from: a */
    private final aucf f142881a;

    /* renamed from: b */
    private final Class f142882b;

    /* renamed from: a */
    public final void mo69567a(GetIndexableResponse getIndexableResponse) {
        Thing thing;
        if (!getIndexableResponse.f152360a.mo17710c() || ((thing = getIndexableResponse.f152361b) != null && !this.f142882b.isInstance(thing))) {
            this.f142881a.mo50390a((Exception) brjg.m114101a(getIndexableResponse.f152360a, "GetIndexable error, please try again."));
        } else {
            this.f142881a.mo50391a(this.f142882b.cast(getIndexableResponse.f152361b));
        }
    }

    public brio(aucf aucf, Class cls) {
        this.f142881a = aucf;
        this.f142882b = cls;
    }
}
