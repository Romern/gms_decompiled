package p000;

import android.content.Context;
import java.util.Arrays;
import java.util.List;

/* renamed from: awpk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awpk implements awpl {

    /* renamed from: a */
    private final Context f94804a;

    /* renamed from: b */
    private final awpi[] f94805b;

    /* renamed from: c */
    private final awpj[] f94806c;

    public awpk(Context context) {
        this.f94804a = context;
        this.f94805b = new awpi[]{new awwo(context), new awta(context)};
        this.f94806c = new awpj[]{new awew(context), new awsz(context)};
    }

    /* renamed from: a */
    public final int mo52449a(aecc aecc) {
        List asList = Arrays.asList(adyd.m51363a(this.f94804a).mo33916a("com.google"));
        awpi[] awpiArr = this.f94805b;
        for (int i = 0; i < 2; i++) {
            awpi awpi = awpiArr[i];
            C1225nr nrVar = new C1225nr();
            nrVar.addAll(awpi.mo52447a());
            nrVar.removeAll(asList);
            if (!nrVar.isEmpty()) {
                awpi.mo52448a(nrVar);
            }
        }
        awpj[] awpjArr = this.f94806c;
        for (int i2 = 0; i2 < 2; i2++) {
            awpjArr[i2].mo52088a();
        }
        return 0;
    }
}
