package p000;

import android.net.Uri;
import com.google.android.gms.common.Feature;
import com.google.android.gms.mobstore.DeleteFileRequest;
import java.util.concurrent.Callable;

/* renamed from: ahbc */
final /* synthetic */ class ahbc implements Callable {

    /* renamed from: a */
    private final ahbh f66949a;

    /* renamed from: b */
    private final Uri f66950b;

    public ahbc(ahbh ahbh, Uri uri) {
        this.f66949a = ahbh;
        this.f66950b = uri;
    }

    public final Object call() {
        ahbh ahbh = this.f66949a;
        Uri uri = this.f66950b;
        rjx rjx = ahbh.f66959a;
        DeleteFileRequest deleteFileRequest = new DeleteFileRequest(uri);
        roz b = rpa.m34196b();
        b.mo24978a(new ahbr(deleteFileRequest));
        b.f43473b = new Feature[]{abpq.f57888f};
        return (Void) aucu.m76782a(rjx.mo24701a(b.mo24977a()));
    }
}
