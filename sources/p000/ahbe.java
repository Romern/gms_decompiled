package p000;

import android.net.Uri;
import com.google.android.gms.common.Feature;
import com.google.android.gms.mobstore.OpenFileDescriptorRequest;
import com.google.android.gms.mobstore.OpenFileDescriptorResponse;
import java.util.concurrent.Callable;

/* renamed from: ahbe */
final /* synthetic */ class ahbe implements Callable {

    /* renamed from: a */
    private final ahbh f66954a;

    /* renamed from: b */
    private final Uri f66955b;

    /* renamed from: c */
    private final int f66956c;

    public ahbe(ahbh ahbh, Uri uri, int i) {
        this.f66954a = ahbh;
        this.f66955b = uri;
        this.f66956c = i;
    }

    public final Object call() {
        ahbh ahbh = this.f66954a;
        Uri uri = this.f66955b;
        int i = this.f66956c;
        rjx rjx = ahbh.f66959a;
        OpenFileDescriptorRequest openFileDescriptorRequest = new OpenFileDescriptorRequest(uri, i);
        roz b = rpa.m34196b();
        b.mo24978a(new ahbt(openFileDescriptorRequest));
        b.f43473b = i == 1 ? new Feature[]{abpq.f57888f} : null;
        return ((OpenFileDescriptorResponse) aucu.m76782a(rjx.mo24701a(b.mo24977a()))).f80392a;
    }
}
