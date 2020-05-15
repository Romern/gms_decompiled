package p000;

import android.content.Context;
import android.util.Pair;

/* renamed from: alne */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class alne extends alna {

    /* renamed from: c */
    private final String f73827c;

    /* renamed from: d */
    private final String f73828d;

    /* renamed from: e */
    private final String f73829e;

    /* renamed from: f */
    private final int f73830f;

    protected alne(alzm alzm, String str, int i, String str2, String str3, String str4, String str5, int i2) {
        super(str, i, alzm, str3, str5, null);
        this.f73827c = str2;
        this.f73828d = str3;
        this.f73829e = str4;
        this.f73830f = i2;
    }

    /* renamed from: a */
    public abstract Pair mo40607a(Context context, almq almq, amph amph);

    /* renamed from: c */
    public final Pair mo40604c(Context context) {
        return mo40607a(context, almq.m61303a(context, this.f73830f), almq.m61304a(context, this.f73828d, this.f73829e, this.f73827c));
    }
}
