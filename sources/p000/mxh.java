package p000;

import android.os.Parcel;

/* renamed from: mxh */
final /* synthetic */ class mxh implements mxj {

    /* renamed from: a */
    private final beba f34886a;

    public mxh(beba beba) {
        this.f34886a = beba;
    }

    /* renamed from: a */
    public final Object mo20292a(beaz beaz) {
        beba beba = this.f34886a;
        int i = mxk.f34888a;
        Parcel bj = beaz.mo8529bj();
        dcl.m8164a(bj, beba);
        Parcel a = beaz.mo8526a(5, bj);
        boolean a2 = dcl.m8167a(a);
        a.recycle();
        return Boolean.valueOf(a2);
    }
}
