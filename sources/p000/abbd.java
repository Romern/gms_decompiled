package p000;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.feedback.ErrorReport;

/* renamed from: abbd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abbd extends soa {

    /* renamed from: a */
    final /* synthetic */ ErrorReport f56977a;

    /* renamed from: b */
    final /* synthetic */ Context f56978b;

    /* renamed from: c */
    final /* synthetic */ boolean f56979c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public abbd(ErrorReport errorReport, Context context, boolean z) {
        super(10);
        this.f56977a = errorReport;
        this.f56978b = context;
        this.f56979c = z;
    }

    public final void run() {
        if (!TextUtils.isEmpty(this.f56977a.f31529T)) {
            aayh.m47252a(this.f56978b.getCacheDir(), this.f56977a.f31529T, ".bmp");
        }
        if (this.f56979c) {
            for (String str : this.f56977a.f31531V) {
                aayh.m47252a(this.f56978b.getCacheDir(), str, ".txt");
            }
        }
    }
}
