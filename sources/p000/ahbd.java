package p000;

import android.net.Uri;
import com.google.android.gms.common.Feature;
import com.google.android.gms.mobstore.RenameRequest;
import java.util.concurrent.Callable;

/* renamed from: ahbd */
final /* synthetic */ class ahbd implements Callable {

    /* renamed from: a */
    private final ahbh f66951a;

    /* renamed from: b */
    private final Uri f66952b;

    /* renamed from: c */
    private final Uri f66953c;

    public ahbd(ahbh ahbh, Uri uri, Uri uri2) {
        this.f66951a = ahbh;
        this.f66952b = uri;
        this.f66953c = uri2;
    }

    public final Object call() {
        ahbh ahbh = this.f66951a;
        Uri uri = this.f66952b;
        Uri uri2 = this.f66953c;
        rjx rjx = ahbh.f66959a;
        RenameRequest renameRequest = new RenameRequest(uri, uri2);
        roz b = rpa.m34196b();
        b.mo24978a(new ahbv(renameRequest));
        b.f43473b = new Feature[]{abpq.f57889g};
        b.mo24979b();
        return (Void) aucu.m76782a(rjx.mo24701a(b.mo24977a()));
    }
}
