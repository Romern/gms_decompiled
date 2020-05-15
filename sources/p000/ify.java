package p000;

import android.content.Context;
import com.felicanetworks.sdu.ErrorInfo;

/* renamed from: ify */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class ify extends aaab {

    /* renamed from: a */
    private static final Logger f20895a = new Logger("CryptauthKeyServiceOperation");

    public ify(String str) {
        super(ErrorInfo.TYPE_SDU_FAILED, str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        try {
            mo12979b(context);
        } catch (aaaj e) {
            if (e.getCause() == null) {
                f20895a.mo25418e(e.getMessage(), new Object[0]);
            } else {
                f20895a.mo25417e(e.getMessage(), e.getCause(), new Object[0]);
            }
            throw e;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo12979b(Context context);
}
