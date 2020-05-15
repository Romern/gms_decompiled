package p000;

import android.os.Bundle;
import com.google.android.chimera.Loader;

/* renamed from: tia */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class tia extends tic {

    /* renamed from: a */
    final /* synthetic */ String f46057a;

    /* renamed from: b */
    final /* synthetic */ tie f46058b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tia(tie tie, tid tid, String str) {
        super(tid);
        this.f46058b = tie;
        this.f46057a = str;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        return new thz(this.f46058b.f46062a, this.f46057a);
    }
}
