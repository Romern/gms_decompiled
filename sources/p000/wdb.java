package p000;

import android.accounts.Account;
import android.net.Uri;

/* renamed from: wdb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class wdb {

    /* renamed from: a */
    public Account f50529a;

    /* renamed from: b */
    private Integer f50530b;

    /* renamed from: c */
    private Uri f50531c;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final wdc mo29043a() {
        String str;
        boolean z;
        boolean z2;
        if (this.f50530b != null) {
            str = "";
        } else {
            str = " type";
        }
        if (!str.isEmpty()) {
            throw new IllegalStateException(str.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(str));
        }
        wbd wbd = new wbd(this.f50530b.intValue(), this.f50529a, this.f50531c);
        int i = wbd.f50379a;
        boolean z3 = false;
        if (i == 1 || i == 2) {
            z = true;
        } else {
            z = false;
        }
        if (wbd.f50380b == null) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z == z2) {
            z3 = true;
        }
        bmxy.m108600b(z3);
        return wbd;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo29044a(int i) {
        this.f50530b = Integer.valueOf(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo29045a(String str) {
        if (!str.isEmpty()) {
            this.f50531c = Uri.parse(str);
        }
    }
}
