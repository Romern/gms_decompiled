package p000;

import java.util.concurrent.Callable;

/* renamed from: bhbn */
final /* synthetic */ class bhbn implements Callable {

    /* renamed from: a */
    private final bhbr f118264a;

    public bhbn(bhbr bhbr) {
        this.f118264a = bhbr;
    }

    public final Object call() {
        bhbr bhbr = this.f118264a;
        return Boolean.valueOf(bhbr.f118271a.addGpsStatusListener(bhbr.f118273c));
    }
}
