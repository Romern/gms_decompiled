package p000;

import android.text.TextUtils;

/* renamed from: bjno */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bjno extends bjhs {

    /* renamed from: d */
    public String f123019d;

    /* renamed from: e */
    public String f123020e;

    /* renamed from: f */
    public String f123021f;

    /* renamed from: g */
    public String f123022g;

    public bjno() {
        super(bwsn.f160886g);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo65245a(bxxc bxxc) {
        String str;
        bwsn bwsn = (bwsn) bxxc;
        int i = bwsn.f160889b;
        String str2 = "";
        if (i == 2) {
            str = (String) bwsn.f160890c;
        } else {
            str = str2;
        }
        this.f123019d = str;
        if (i == 1) {
            str2 = (String) bwsn.f160890c;
        }
        this.f123020e = str2;
        this.f123021f = bwsn.f160891d;
        this.f123022g = bwsn.f160892e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bxxc mo65248b() {
        bxvd da = bwsn.f160885f.mo74144da();
        if (!TextUtils.isEmpty(this.f123019d)) {
            String str = this.f123019d;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bwsn bwsn = (bwsn) da.f164949b;
            str.getClass();
            bwsn.f160889b = 2;
            bwsn.f160890c = str;
        }
        if (!TextUtils.isEmpty(this.f123020e)) {
            String str2 = this.f123020e;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bwsn bwsn2 = (bwsn) da.f164949b;
            str2.getClass();
            bwsn2.f160889b = 1;
            bwsn2.f160890c = str2;
        }
        if (!TextUtils.isEmpty(this.f123021f)) {
            String str3 = this.f123021f;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bwsn bwsn3 = (bwsn) da.f164949b;
            str3.getClass();
            bwsn3.f160888a |= 4;
            bwsn3.f160891d = str3;
        }
        if (!TextUtils.isEmpty(this.f123022g)) {
            String str4 = this.f123022g;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bwsn bwsn4 = (bwsn) da.f164949b;
            str4.getClass();
            bwsn4.f160888a |= 8;
            bwsn4.f160892e = str4;
        }
        return (bwsn) da.mo74062i();
    }
}
