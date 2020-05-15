package p000;

import android.content.Context;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: alnb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class alnb extends alnc {
    public alnb(String str, int i, alzm alzm, String str2, String str3) {
        this(str, i, alzm, str2, str3, null);
    }

    /* renamed from: c */
    public final DataHolder[] mo40605c(Context context) {
        return new DataHolder[]{mo40606d(context)};
    }

    /* renamed from: d */
    public abstract DataHolder mo40606d(Context context);

    protected alnb(String str, int i, alzm alzm, String str2, String str3, byte[] bArr) {
        super(str, i, alzm, false, str2, str3);
    }
}
