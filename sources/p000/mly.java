package p000;

import java.io.InputStream;

/* renamed from: mly */
final /* synthetic */ class mly implements mmr {

    /* renamed from: a */
    private final mir f33983a;

    public mly(mir mir) {
        this.f33983a = mir;
    }

    /* renamed from: a */
    public final InputStream mo20161a() {
        String valueOf = String.valueOf(this.f33983a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
        sb.append("unable to prepare for item: ");
        sb.append(valueOf);
        throw new C1577mms(sb.toString());
    }
}
