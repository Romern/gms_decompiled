package p000;

import android.content.Context;

/* renamed from: bcs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcs {

    /* renamed from: a */
    public final String f3012a;

    /* renamed from: b */
    public final bcr f3013b;

    /* renamed from: c */
    private final Context f3014c;

    public bcs(Context context, String str) {
        this.f3014c = context.getApplicationContext();
        this.f3012a = str;
        this.f3013b = new bcr(this.f3014c, str);
    }
}
