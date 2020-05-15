package p000;

import android.content.Context;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: alnx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alnx extends alnb {

    /* renamed from: b */
    private final String f73883b;

    /* renamed from: c */
    private final String f73884c;

    /* renamed from: d */
    private final int f73885d;

    public alnx(String str, int i, alzm alzm, String str2, String str3, int i2) {
        super(str, i, alzm, null, "LoadContactsGaiaIds");
        this.f73883b = str2;
        this.f73884c = str3;
        this.f73885d = i2;
    }

    /* renamed from: d */
    public final DataHolder mo40606d(Context context) {
        return alog.m61418a(context, this.f73883b, this.f73884c, this.f73885d);
    }
}
