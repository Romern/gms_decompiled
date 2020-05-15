package p000;

import android.content.Context;
import java.util.EnumSet;
import java.util.Set;

/* renamed from: ucj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class ucj extends uci {
    protected ucj(String str, ubk ubk, uto uto) {
        super(str, ubk, uto, null);
    }

    /* renamed from: a */
    public Set mo27229a() {
        return EnumSet.allOf(twt.class);
    }

    /* renamed from: c */
    public abstract void mo27235c();

    /* renamed from: c */
    public final void mo27231c(Context context) {
        mo27235c();
    }

    protected ucj(String str, ubk ubk, uto uto, byte[] bArr) {
        super(str, ubk, uto, null, 62);
    }
}
