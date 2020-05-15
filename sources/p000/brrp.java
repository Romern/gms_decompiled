package p000;

import android.text.TextUtils;

/* renamed from: brrp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brrp implements brpy {

    /* renamed from: a */
    public boolean f143260a;

    /* renamed from: b */
    public String f143261b;

    /* renamed from: c */
    public String f143262c;

    /* renamed from: d */
    public String f143263d;

    /* renamed from: e */
    public String f143264e;

    /* renamed from: f */
    public String f143265f;

    /* renamed from: g */
    public String f143266g;

    /* renamed from: h */
    public boolean f143267h;

    /* renamed from: i */
    public String f143268i;

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bxxc mo69786a() {
        bxvd da = bklh.f124757j.mo74144da();
        if (this.f143260a) {
            String str = this.f143261b;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bklh bklh = (bklh) da.f164949b;
            str.getClass();
            int i = bklh.f124759a | 2;
            bklh.f124759a = i;
            bklh.f124761c = str;
            String str2 = this.f143262c;
            str2.getClass();
            bklh.f124759a = i | 16;
            bklh.f124764f = str2;
        } else if (TextUtils.isEmpty(this.f143265f)) {
            String str3 = this.f143263d;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bklh bklh2 = (bklh) da.f164949b;
            str3.getClass();
            int i2 = bklh2.f124759a | 1;
            bklh2.f124759a = i2;
            bklh2.f124760b = str3;
            String str4 = this.f143264e;
            str4.getClass();
            bklh2.f124759a = i2 | 4;
            bklh2.f124762d = str4;
        } else {
            String str5 = this.f143265f;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bklh bklh3 = (bklh) da.f164949b;
            str5.getClass();
            int i3 = bklh3.f124759a | 8;
            bklh3.f124759a = i3;
            bklh3.f124763e = str5;
            String str6 = this.f143261b;
            str6.getClass();
            bklh3.f124759a = i3 | 2;
            bklh3.f124761c = str6;
        }
        String str7 = this.f143266g;
        if (str7 != null) {
            bklh bklh4 = (bklh) da.f164949b;
            str7.getClass();
            bklh4.f124759a |= 32;
            bklh4.f124765g = str7;
        }
        if (!this.f143267h) {
            bklh bklh5 = (bklh) da.f164949b;
            bklh5.f124766h = 2;
            bklh5.f124759a |= 64;
        }
        String str8 = this.f143268i;
        if (str8 != null) {
            bklh bklh6 = (bklh) da.f164949b;
            str8.getClass();
            bklh6.f124759a |= 128;
            bklh6.f124767i = str8;
        }
        return (bklh) da.mo74062i();
    }
}
