package p000;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* renamed from: bbia */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbia extends cazu {

    /* renamed from: b */
    private final cazn f102687b;

    /* renamed from: c */
    private final cazn f102688c;

    public bbia(cijl cijl, cijl cijl2, cazn cazn, cazn cazn2) {
        super(cijl2, cbag.m127657a(bbia.class), cijl);
        this.f102687b = cbac.m127643a(cazn);
        this.f102688c = cbac.m127643a(cazn2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bqgg mo14448a() {
        return bqga.m112779a(cbac.m127642a(this.f102687b.mo75201b()), this.f102688c.mo75201b());
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bqgg mo14449b(Object obj) {
        List list = (List) obj;
        cazm cazm = (cazm) list.get(0);
        ExecutionException executionException = (ExecutionException) list.get(1);
        if (executionException.getCause() instanceof IOException) {
            throw new IOException(executionException);
        }
        throw executionException;
    }
}
