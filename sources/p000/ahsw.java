package p000;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: ahsw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class ahsw extends ahgx {
    public ahsw(Context context, String str) {
        super(context, "nearby-discovery", str);
    }

    /* renamed from: b */
    public abstract boolean mo37103b(bxxc bxxc);

    /* renamed from: c */
    public abstract boolean mo37104c(bxxc bxxc);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean mo36469d(bxxc bxxc) {
        return !mo37103b(bxxc) && super.mo36469d(bxxc);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo37106e() {
        for (bxxc bxxc : mo36468d()) {
            if (!mo37103b(bxxc)) {
                mo36469d(bxxc);
            }
        }
    }

    /* renamed from: f */
    public final Collection mo37107f() {
        ArrayList arrayList = new ArrayList();
        for (bxxc bxxc : mo36468d()) {
            if (mo37104c(bxxc)) {
                arrayList.add(bxxc);
            }
        }
        return arrayList;
    }
}
