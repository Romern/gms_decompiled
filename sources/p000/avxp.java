package p000;

import android.content.Context;

/* renamed from: avxp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avxp {

    /* renamed from: a */
    public final avxv f94058a;

    /* renamed from: b */
    public final avxt f94059b;

    public avxp(Context context, avxv avxv) {
        avxt avxt = new avxt();
        this.f94059b = avxt;
        if (context != null) {
            this.f94058a = avxv;
            avxt.f94071a = context;
            return;
        }
        throw new IllegalArgumentException("No context supplied.");
    }
}
