package p000;

import android.content.SharedPreferences;

/* renamed from: buxi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class buxi extends bvdu {

    /* renamed from: a */
    final /* synthetic */ buxv f155235a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public buxi(buxv buxv, String str, bvdu... bvduArr) {
        super(str, bvduArr);
        this.f155235a = buxv;
    }

    /* renamed from: b */
    public final boolean mo73237b() {
        return this.f155235a.f155259c.contains("bluetoothEnabled");
    }

    /* renamed from: c */
    public final boolean mo73238c() {
        SharedPreferences.Editor edit = this.f155235a.f155259c.edit();
        int e = this.f155235a.f155258b.mo73206e();
        boolean z = true;
        if (!(e == 11 || e == 12)) {
            z = false;
        }
        buxv buxv = this.f155235a;
        SharedPreferences.Editor putBoolean = edit.putBoolean("bluetoothEnabled", z);
        StringBuilder sb = new StringBuilder(29);
        sb.append("save user enabled state ");
        sb.append(z);
        return buxv.mo73240a(putBoolean, sb.toString());
    }

    /* renamed from: d */
    public final long mo73239d() {
        byyl byyl = this.f155235a.f155257a.f155567b.f168921d;
        if (byyl == null) {
            byyl = byyl.f168949v;
        }
        return byyl.f168960j;
    }
}
