package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;

/* renamed from: adxu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adxu extends aaab {

    /* renamed from: a */
    private final String f62876a;

    /* renamed from: b */
    private final adwh f62877b;

    public adxu(adwh adwh, String str) {
        super(167, "DebugString");
        this.f62877b = adwh;
        this.f62876a = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        if (this.f62876a != null) {
            this.f62877b.mo33860a(Status.f30107a, adxt.m51334a().mo33880a(this.f62876a).toString());
            return;
        }
        this.f62877b.mo33860a(Status.f30107a, "ULP not available.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f62877b.mo33860a(status, (String) null);
    }
}
