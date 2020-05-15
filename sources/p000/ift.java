package p000;

import android.content.Context;

/* renamed from: ift */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class ift extends aaab {

    /* renamed from: a */
    private static final Logger f20883a = new Logger("CryptauthInternalDataServiceOperation");

    public ift(String str) {
        super(107, str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        try {
            mo12978b(context);
        } catch (aaaj e) {
            if (e.getCause() == null) {
                f20883a.mo25418e(e.getMessage(), new Object[0]);
            } else {
                f20883a.mo25417e(e.getMessage(), e.getCause(), new Object[0]);
            }
            throw e;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo12978b(Context context);
}
