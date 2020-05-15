package p000;

import com.google.android.gms.mdh.LatestFootprintFilter;
import com.google.android.gms.mdh.SecondaryIdMatcher;
import java.util.ArrayList;
import java.util.List;

/* renamed from: afkp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afkp {

    /* renamed from: a */
    private final List f64314a = new ArrayList();

    /* renamed from: a */
    public final LatestFootprintFilter mo34925a() {
        return new LatestFootprintFilter(this.f64314a);
    }

    /* renamed from: a */
    public final void mo34926a(byte[] bArr, int i) {
        this.f64314a.add(new SecondaryIdMatcher((byte[]) bArr.clone(), i));
    }
}
