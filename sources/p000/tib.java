package p000;

import android.os.Bundle;
import com.google.android.chimera.Loader;

/* renamed from: tib */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class tib extends tic {

    /* renamed from: a */
    final /* synthetic */ String f46059a;

    /* renamed from: b */
    final /* synthetic */ tie f46060b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tib(tie tie, tid tid, String str) {
        super(tid);
        this.f46060b = tie;
        this.f46059a = str;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        return new tif(this.f46060b.f46062a, this.f46059a);
    }
}
