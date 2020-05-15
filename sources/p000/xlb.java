package p000;

import java.util.concurrent.Callable;

/* renamed from: xlb */
final /* synthetic */ class xlb implements Callable {

    /* renamed from: a */
    private final xlc f52641a;

    /* renamed from: b */
    private final byte[] f52642b;

    public xlb(xlc xlc, byte[] bArr) {
        this.f52641a = xlc;
        this.f52642b = bArr;
    }

    public final Object call() {
        xlc xlc = this.f52641a;
        byte[] bArr = this.f52642b;
        xlc.f52644a.mo29884a();
        return xlc.f52644a.mo29885a(bArr);
    }
}
