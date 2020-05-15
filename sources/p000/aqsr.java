package p000;

import android.os.Bundle;
import com.google.android.chimera.Loader;
import java.util.List;

/* renamed from: aqsr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqsr extends aqst {

    /* renamed from: a */
    final /* synthetic */ aqsu f86713a;

    public aqsr(aqsu aqsu) {
        this.f86713a = aqsu;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        aqsu aqsu = this.f86713a;
        return new aqvv(aqsu.f86718d, aqsu.f86716b, aqsu.f86717c);
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        this.f86713a.f86720f.mo48133a((List) obj);
    }
}
