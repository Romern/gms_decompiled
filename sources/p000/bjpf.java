package p000;

import android.text.TextUtils;

/* renamed from: bjpf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjpf extends bjhs {

    /* renamed from: d */
    public String f123076d;

    /* renamed from: e */
    public String f123077e;

    /* renamed from: f */
    public String f123078f;

    public bjpf() {
        super(bwuv.f161076d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo65429a(blxc blxc) {
        mo65430a(bjpj.m104221a(blxc.f128040b), bjpj.m104221a(blxc.f128041c), bjpj.m104221a(blxc.f128042d), null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bxxc mo65248b() {
        bxvd da = bwuv.f161075c.mo74144da();
        bxvd da2 = blxc.f128037e.mo74144da();
        int a = bjpj.m104220a(this.f123078f);
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        blxc blxc = (blxc) da2.f164949b;
        blxc.f128039a |= 4;
        blxc.f128042d = a;
        int a2 = bjpj.m104220a(this.f123077e);
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        blxc blxc2 = (blxc) da2.f164949b;
        blxc2.f128039a |= 2;
        blxc2.f128041c = a2;
        int a3 = bjpj.m104220a(this.f123076d);
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        blxc blxc3 = (blxc) da2.f164949b;
        blxc3.f128039a |= 1;
        blxc3.f128040b = a3;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bwuv bwuv = (bwuv) da.f164949b;
        blxc blxc4 = (blxc) da2.mo74062i();
        blxc4.getClass();
        bwuv.f161079b = blxc4;
        bwuv.f161078a |= 1;
        return (bwuv) da.mo74062i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo65245a(bxxc bxxc) {
        blxc blxc = ((bwuv) bxxc).f161079b;
        if (blxc == null) {
            blxc = blxc.f128037e;
        }
        mo65429a(blxc);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo65246a(Object obj) {
        if (obj instanceof blxc) {
            mo65429a((blxc) obj);
        } else {
            throw new UnsupportedOperationException(String.format("Cannot convert %s to Date.", obj));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo65430a(String str, String str2, String str3, bjgf bjgf) {
        if (!TextUtils.equals(this.f123076d, str) || !TextUtils.equals(this.f123077e, str2) || !TextUtils.equals(this.f123078f, str3)) {
            this.f123076d = str;
            this.f123077e = str2;
            this.f123078f = str3;
            mo65244a(bjgf);
        }
    }
}
