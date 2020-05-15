package p000;

import java.util.Arrays;
import java.util.List;

/* renamed from: bhwd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhwd implements bhwh {

    /* renamed from: a */
    private final List f119729a;

    public bhwd(bhwh... bhwhArr) {
        this.f119729a = Arrays.asList(bhwhArr);
    }

    /* renamed from: a */
    public final C1245ok mo64353a(bhtx bhtx) {
        C1245ok okVar = new C1245ok();
        for (bhwh bhwh : this.f119729a) {
            okVar.mo8150a(bhwh.mo64353a(bhtx));
        }
        return okVar;
    }
}
