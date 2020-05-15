package p000;

import android.text.TextUtils;
import com.google.android.gms.common.internal.ClientContext;

/* renamed from: fvn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fvn extends fvh implements sjr {

    /* renamed from: a */
    private final sjn f17333a;

    /* renamed from: b */
    private final ClientContext f17334b;

    /* renamed from: c */
    private final fva f17335c;

    /* renamed from: d */
    private final fuu f17336d;

    public fvn(sjn sjn, ClientContext clientContext, fva fva, fuu fuu) {
        this.f17333a = sjn;
        this.f17334b = clientContext;
        this.f17335c = fva;
        this.f17336d = fuu;
    }

    /* renamed from: a */
    private static final void m12476a(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Invitation id can not be empty.");
        }
    }

    /* renamed from: b */
    public final void mo11397b(fvd fvd, String str) {
        m12476a(str);
        this.f17333a.mo25649a(new fvp(this.f17334b, this.f17335c, this.f17336d, str, fvd));
    }

    /* renamed from: a */
    public final void mo11395a(fvd fvd) {
        this.f17333a.mo25649a(new fvr(this.f17334b, fvd));
    }

    /* renamed from: a */
    public final void mo11396a(fvd fvd, String str) {
        m12476a(str);
        this.f17333a.mo25649a(new fvo(this.f17334b, this.f17335c, this.f17336d, str, fvd));
    }
}
