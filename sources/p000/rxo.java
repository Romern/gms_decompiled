package p000;

import android.content.Context;
import com.google.android.gms.common.download.DownloadIntentOperation;

/* renamed from: rxo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class rxo extends rxm {

    /* renamed from: b */
    private final String f43826b;

    public rxo(ryp ryp, String str) {
        super(ryp, "GetDownloadStatus");
        this.f43826b = str;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        this.f43823a.mo25255a(DownloadIntentOperation.m22566e(context, this.f43826b));
    }
}
