package p000;

import android.text.TextUtils;
import android.widget.TextView;

/* renamed from: bkjs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkjs extends bkgj {

    /* renamed from: a */
    final /* synthetic */ bkjt f124447a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bkjs(bkjt bkjt) {
        super("");
        this.f124447a = bkjt;
    }

    /* renamed from: a */
    public final CharSequence mo65759a() {
        String str;
        this.f124447a.mo65884y();
        bkjt bkjt = this.f124447a;
        int i = bkjt.f124462o;
        if (i == 1) {
            bmiy bmiy = ((bmjb) bkjt.f124069w).f129673k;
            if (bmiy == null) {
                bmiy = bmiy.f129654d;
            }
            str = bmiy.f129656a;
        } else if (i == 2) {
            bmiy bmiy2 = ((bmjb) bkjt.f124069w).f129673k;
            if (bmiy2 == null) {
                bmiy2 = bmiy.f129654d;
            }
            str = bmiy2.f129657b;
        } else if (i != 3) {
            str = "";
        } else {
            bmiy bmiy3 = ((bmjb) bkjt.f124069w).f129673k;
            if (bmiy3 == null) {
                bmiy3 = bmiy.f129654d;
            }
            str = bmiy3.f129658c;
        }
        this.f124209b = str;
        return this.f124209b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo65760a(TextView textView) {
        return !this.f124447a.f124460m || TextUtils.isEmpty(mo65759a());
    }
}
