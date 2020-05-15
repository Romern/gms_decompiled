package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.download.DownloadIntentOperation;

/* renamed from: rxr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class rxr extends rxm {

    /* renamed from: b */
    private final String f43830b;

    public rxr(ryp ryp, String str) {
        super(ryp, "UnregisterDownload");
        this.f43830b = str;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        DownloadIntentOperation.m22565d(context, this.f43830b);
        this.f43823a.mo25255a(new Status(0));
    }
}
