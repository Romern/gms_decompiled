package p000;

import android.content.Context;
import com.google.android.gms.common.download.DownloadDetails;
import com.google.android.gms.common.download.DownloadIntentOperation;

/* renamed from: rxp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class rxp extends rxm {

    /* renamed from: b */
    private final DownloadDetails f43827b;

    public rxp(ryp ryp, DownloadDetails downloadDetails) {
        super(ryp, "RegisterDownload");
        this.f43827b = downloadDetails;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        DownloadIntentOperation.m22563c(context, this.f43827b);
        this.f43823a.mo25255a(DownloadIntentOperation.m22566e(context, this.f43827b.f30175a));
    }
}
