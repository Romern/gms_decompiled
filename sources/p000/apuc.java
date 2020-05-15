package p000;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.api.Status;

/* renamed from: apuc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apuc extends apuj {

    /* renamed from: b */
    public static final /* synthetic */ int f84904b = 0;

    /* renamed from: a */
    final Intent f84905a;

    static {
        apuc.class.getSimpleName();
    }

    public apuc(Context context, Intent intent) {
        super(context, "vappsresult");
        this.f84905a = intent;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        int intExtra = this.f84905a.getIntExtra("nonce", -1);
        int d = apua.m71005a(context).mo47628d();
        if (d >= 0 && intExtra == d) {
            apua.m71005a(context).mo47626a(new Status(0), new apgy(context).mo47201a() ^ true ? 1 : 0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo47617b(Status status) {
        apua.m71005a(this.f84919c).mo47626a(status, 1);
    }
}
