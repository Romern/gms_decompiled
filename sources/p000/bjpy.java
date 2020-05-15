package p000;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Locale;

/* renamed from: bjpy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjpy extends bjhs {

    /* renamed from: d */
    public String f123122d;

    /* renamed from: e */
    public String f123123e;

    /* renamed from: f */
    public String f123124f;

    /* renamed from: g */
    public String f123125g;

    /* renamed from: h */
    int f123126h;

    public bjpy() {
        super(bwvx.f161195d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String mo65445a(String str) {
        String str2 = this.f123124f;
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        return String.format(Locale.US, "+%s %s", str, this.f123124f);
    }

    /* renamed from: e */
    public final String mo65447e() {
        return mo65445a(this.f123123e);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo65243a(Bundle bundle) {
        bundle.putString("regionCode", this.f123125g);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bxxc mo65248b() {
        bxvd da = bwwb.f161205e.mo74144da();
        String str = this.f123124f;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bwwb bwwb = (bwwb) da.f164949b;
        str.getClass();
        int i = bwwb.f161207a | 2;
        bwwb.f161207a = i;
        bwwb.f161209c = str;
        int i2 = this.f123126h;
        int i3 = i2 - 1;
        if (i2 != 0) {
            bwwb.f161210d = i3;
            bwwb.f161207a = i | 4;
            if (!TextUtils.isEmpty(this.f123123e)) {
                String str2 = this.f123123e;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bwwb bwwb2 = (bwwb) da.f164949b;
                str2.getClass();
                bwwb2.f161207a |= 1;
                bwwb2.f161208b = str2;
            } else if (!TextUtils.isEmpty(this.f123122d)) {
                String str3 = this.f123122d;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bwwb bwwb3 = (bwwb) da.f164949b;
                str3.getClass();
                bwwb3.f161207a |= 1;
                bwwb3.f161208b = str3;
            }
            bxvd da2 = bwvx.f161194c.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bwvx bwvx = (bwvx) da2.f164949b;
            bwwb bwwb4 = (bwwb) da.mo74062i();
            bwwb4.getClass();
            bwvx.f161198b = bwwb4;
            bwvx.f161197a |= 1;
            return (bwvx) da2.mo74062i();
        }
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo65245a(bxxc bxxc) {
        bwvx bwvx = (bwvx) bxxc;
        bwwb bwwb = bwvx.f161198b;
        if (bwwb == null) {
            bwwb = bwwb.f161205e;
        }
        this.f123123e = bwwb.f161208b;
        bwwb bwwb2 = bwvx.f161198b;
        if (bwwb2 == null) {
            bwwb2 = bwwb.f161205e;
        }
        this.f123124f = bwwb2.f161209c;
        bwwb bwwb3 = bwvx.f161198b;
        if (bwwb3 == null) {
            bwwb3 = bwwb.f161205e;
        }
        int a = bwwa.m122361a(bwwb3.f161210d);
        if (a == 0) {
            a = 1;
        }
        this.f123126h = a;
    }

    /* renamed from: a */
    public final void mo65446a(String str, String str2, String str3, int i, bjgf bjgf) {
        if (!TextUtils.equals(str, this.f123125g) || !TextUtils.equals(str2, this.f123123e) || !TextUtils.equals(str3, this.f123124f)) {
            this.f123125g = str;
            this.f123123e = str2;
            this.f123124f = str3;
            this.f123126h = i;
            mo65244a(bjgf);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo65249b(Bundle bundle) {
        this.f123125g = bundle.getString("regionCode");
    }
}
