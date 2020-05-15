package p000;

import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.ArrayList;

/* renamed from: aacv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aacv implements rjh, rjj, rjg {

    /* renamed from: a */
    public final boolean f27955a;

    /* renamed from: b */
    public final boolean f27956b;

    /* renamed from: c */
    public final int f27957c;

    /* renamed from: d */
    public final boolean f27958d;

    /* renamed from: e */
    public final int f27959e;

    /* renamed from: f */
    public final String f27960f;

    /* renamed from: g */
    public final ArrayList f27961g;

    /* renamed from: h */
    public final boolean f27962h;

    /* renamed from: i */
    public final boolean f27963i;

    /* renamed from: j */
    public final GoogleSignInAccount f27964j;

    /* renamed from: k */
    public final String f27965k;

    /* renamed from: l */
    public final int f27966l = 0;

    /* renamed from: m */
    public final int f27967m;

    public aacv(boolean z, boolean z2, int i, boolean z3, int i2, String str, ArrayList arrayList, boolean z4, boolean z5, GoogleSignInAccount googleSignInAccount, String str2, int i3) {
        this.f27955a = z;
        this.f27956b = z2;
        this.f27957c = i;
        this.f27958d = z3;
        this.f27959e = i2;
        this.f27960f = str;
        this.f27961g = arrayList;
        this.f27962h = z4;
        this.f27963i = z5;
        this.f27964j = googleSignInAccount;
        this.f27965k = str2;
        this.f27967m = i3;
    }

    /* renamed from: a */
    public final GoogleSignInAccount mo16734a() {
        return this.f27964j;
    }

    public final boolean equals(Object obj) {
        String str;
        GoogleSignInAccount googleSignInAccount;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aacv)) {
            return false;
        }
        aacv aacv = (aacv) obj;
        if (this.f27955a == aacv.f27955a && this.f27956b == aacv.f27956b && this.f27957c == aacv.f27957c && this.f27958d == aacv.f27958d && this.f27959e == aacv.f27959e && ((str = this.f27960f) == null ? aacv.f27960f == null : str.equals(aacv.f27960f)) && this.f27961g.equals(aacv.f27961g) && this.f27962h == aacv.f27962h && this.f27963i == aacv.f27963i && ((googleSignInAccount = this.f27964j) == null ? aacv.f27964j == null : googleSignInAccount.equals(aacv.f27964j)) && TextUtils.equals(this.f27965k, aacv.f27965k)) {
            int i = aacv.f27966l;
            if (this.f27967m == aacv.f27967m) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = ((((((((((this.f27955a ? 1 : 0) + true) * 31) + (this.f27956b ? 1 : 0)) * 31) + this.f27957c) * 31) + (this.f27958d ? 1 : 0)) * 31) + this.f27959e) * 31;
        String str = this.f27960f;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int hashCode = (((((((i2 + i) * 31) + this.f27961g.hashCode()) * 31) + (this.f27962h ? 1 : 0)) * 31) + (this.f27963i ? 1 : 0)) * 31;
        GoogleSignInAccount googleSignInAccount = this.f27964j;
        int hashCode2 = (hashCode + (googleSignInAccount != null ? googleSignInAccount.hashCode() : 0)) * 31;
        String str2 = this.f27965k;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        return ((hashCode2 + i3) * 961) + this.f27967m;
    }
}
