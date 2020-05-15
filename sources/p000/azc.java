package p000;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.LocaleList;

/* renamed from: azc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azc extends Paint {
    public azc() {
    }

    public final void setTextLocales(LocaleList localeList) {
    }

    public azc(int i) {
        super(i);
    }

    public azc(PorterDuff.Mode mode) {
        setXfermode(new PorterDuffXfermode(mode));
    }

    public azc(PorterDuff.Mode mode, byte[] bArr) {
        super(1);
        setXfermode(new PorterDuffXfermode(mode));
    }
}
