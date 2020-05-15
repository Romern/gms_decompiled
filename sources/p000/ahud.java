package p000;

import android.content.Context;

/* renamed from: ahud */
final /* synthetic */ class ahud implements ayph {

    /* renamed from: a */
    private final Context f68058a;

    /* renamed from: b */
    private final ahsu f68059b;

    /* renamed from: c */
    private final String f68060c;

    /* renamed from: d */
    private final ahvo f68061d;

    /* renamed from: e */
    private final aypk f68062e;

    /* renamed from: f */
    private final byte[] f68063f;

    /* renamed from: g */
    private final buru f68064g;

    public ahud(Context context, ahsu ahsu, String str, ahvo ahvo, aypk aypk, byte[] bArr, buru buru) {
        this.f68058a = context;
        this.f68059b = ahsu;
        this.f68060c = str;
        this.f68061d = ahvo;
        this.f68062e = aypk;
        this.f68063f = bArr;
        this.f68064g = buru;
    }

    /* renamed from: a */
    public final void mo37165a(String str) {
        Context context = this.f68058a;
        ahsu ahsu = this.f68059b;
        String str2 = this.f68060c;
        ahvo ahvo = this.f68061d;
        aypk aypk = this.f68062e;
        byte[] bArr = this.f68063f;
        buru buru = this.f68064g;
        ahur.m56674a(context, str, ahsu.f67969b, str2);
        ahvo.mo37145a(aypk, bArr, buru, str);
    }
}
