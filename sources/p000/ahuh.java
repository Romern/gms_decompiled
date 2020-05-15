package p000;

import android.content.Context;

/* renamed from: ahuh */
public final /* synthetic */ class ahuh implements Runnable {

    /* renamed from: a */
    private final Context f68081a;

    /* renamed from: b */
    private final ahyz f68082b;

    /* renamed from: c */
    private final byte[] f68083c;

    /* renamed from: d */
    private final boolean f68084d;

    /* renamed from: e */
    private final double f68085e;

    /* renamed from: f */
    private final buru f68086f;

    /* renamed from: g */
    private final String f68087g;

    public ahuh(Context context, ahyz ahyz, byte[] bArr, boolean z, double d, buru buru, String str) {
        this.f68081a = context;
        this.f68082b = ahyz;
        this.f68083c = bArr;
        this.f68084d = z;
        this.f68085e = d;
        this.f68086f = buru;
        this.f68087g = str;
    }

    public final void run() {
        ahur.m56671a(this.f68081a, this.f68082b, this.f68083c, this.f68084d, this.f68085e, this.f68086f, this.f68087g);
    }
}
