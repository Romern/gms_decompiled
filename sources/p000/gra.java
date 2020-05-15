package p000;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: gra */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gra extends aaab {

    /* renamed from: a */
    private final gsg f18874a;

    /* renamed from: b */
    private final String f18875b;

    /* renamed from: c */
    private final boolean f18876c;

    /* renamed from: d */
    private final goo f18877d;

    public gra(goo goo, gsg gsg, boolean z, String str) {
        super(AndroidInputTypeSignal.TYPE_TEXT_VARIATION_WEB_PASSWORD, "RequestAccountsAccessGoogleAuthOperation");
        this.f18877d = goo;
        this.f18874a = gsg;
        this.f18875b = str;
        this.f18876c = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        this.f18877d.mo12112a(Status.f30107a, this.f18874a.mo12164a(this.f18875b, this.f18876c));
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f18877d.mo12112a(status, (Bundle) null);
    }
}
