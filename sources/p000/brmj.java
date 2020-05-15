package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: brmj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class brmj extends sji {

    /* renamed from: a */
    protected final brpj f142967a;

    /* renamed from: d */
    protected final String f142968d;

    /* renamed from: e */
    protected final brps f142969e;

    /* renamed from: f */
    protected final sek f142970f;

    /* renamed from: g */
    private final String f142971g;

    public brmj(String str, String str2, brps brps, brpp brpp, String str3) {
        super(AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS, str3);
        this.f142970f = new sek("FirebaseAuth", str3);
        sdo.m34977c(str);
        this.f142968d = str;
        sdo.m34959a(brps);
        this.f142969e = brps;
        this.f142967a = new brpj(brpp, this.f142970f);
        sdo.m34977c(str2);
        this.f142971g = str2;
    }

    /* renamed from: a */
    public final void mo11356a(Context context) {
        mo69748a(context, new brph(new brpw(context, new brpx(context, this.f142968d), this.f142971g, this.f142969e), new brpi(this.f142969e)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo69748a(Context context, brph brph);

    /* renamed from: a */
    public final void mo11357a(Status status) {
        this.f142967a.mo69680a(status);
    }
}
