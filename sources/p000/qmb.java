package p000;

import android.content.Context;
import com.google.android.cast.JGCastService;
import com.google.android.chimera.config.InvalidConfigException;
import java.nio.charset.CharacterCodingException;

/* renamed from: qmb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class qmb {

    /* renamed from: a */
    public boolean f41692a = false;

    /* renamed from: a */
    public final boolean mo24105a(Context context, Throwable th) {
        if ((!(th instanceof Exception) || (th instanceof InvalidConfigException)) && (!th.getClass().equals(Error.class) || !(th.getCause() instanceof CharacterCodingException))) {
            return false;
        }
        if (!this.f41692a) {
            sqx.m36054a(context, th, JGCastService.FLAG_PRIVATE_DISPLAY);
            this.f41692a = true;
        }
        return true;
    }
}
