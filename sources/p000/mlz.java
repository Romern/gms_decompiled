package p000;

import java.io.FileInputStream;
import java.io.InputStream;

/* renamed from: mlz */
final /* synthetic */ class mlz implements mmr {

    /* renamed from: a */
    private final mma f33984a;

    /* renamed from: b */
    private final mir f33985b;

    public mlz(mma mma, mir mir) {
        this.f33984a = mma;
        this.f33985b = mir;
    }

    /* renamed from: a */
    public final InputStream mo20161a() {
        mma mma = this.f33984a;
        return new FileInputStream((String) mma.f33986a.get(this.f33985b));
    }
}
