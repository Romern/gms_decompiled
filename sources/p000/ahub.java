package p000;

import android.content.Context;

/* renamed from: ahub */
public final /* synthetic */ class ahub implements Runnable {

    /* renamed from: a */
    private final Context f68050a;

    /* renamed from: b */
    private final ahsu f68051b;

    /* renamed from: c */
    private final String f68052c;

    /* renamed from: d */
    private final byte[] f68053d;

    /* renamed from: e */
    private final buru f68054e;

    /* renamed from: f */
    private final ahvo f68055f;

    public ahub(Context context, ahsu ahsu, String str, byte[] bArr, buru buru, ahvo ahvo) {
        this.f68050a = context;
        this.f68051b = ahsu;
        this.f68052c = str;
        this.f68053d = bArr;
        this.f68054e = buru;
        this.f68055f = ahvo;
    }

    public final void run() {
        ahur.m56669a(this.f68050a, this.f68051b, this.f68052c, this.f68053d, this.f68054e, this.f68055f);
    }
}
