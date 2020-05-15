package p000;

import android.content.Context;
import android.text.format.DateUtils;
import com.felicanetworks.mfc.C0126R;

/* renamed from: atvv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atvv {

    /* renamed from: a */
    public final bxvd f91029a;

    public atvv(btrg btrg) {
        bxvd bxvd = (bxvd) btrg.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) btrg);
        this.f91029a = bxvd;
    }

    /* renamed from: a */
    public final String mo50246a() {
        return ((btrg) this.f91029a.f164949b).f150091a;
    }

    /* renamed from: b */
    public final String mo50249b() {
        int b;
        btrb btrb = ((btrg) this.f91029a.f164949b).f150095e;
        if (btrb == null || (b = btra.m117057b(btrb.f150064g)) == 0 || b != 4) {
            return null;
        }
        btrb btrb2 = ((btrg) this.f91029a.f164949b).f150095e;
        if (btrb2 == null) {
            btrb2 = btrb.f150056k;
        }
        if (btrb2.f150058a.isEmpty()) {
            return null;
        }
        btrb btrb3 = ((btrg) this.f91029a.f164949b).f150095e;
        if (btrb3 == null) {
            btrb3 = btrb.f150056k;
        }
        return btrb3.f150058a;
    }

    /* renamed from: c */
    public final String mo50252c() {
        btnd btnd = ((btrg) this.f91029a.f164949b).f150093c;
        return btnd != null ? beps.m95418a(btnd) : "";
    }

    /* renamed from: d */
    public final String mo50253d() {
        if (mo50258i() != 4) {
            return null;
        }
        btrb btrb = ((btrg) this.f91029a.f164949b).f150095e;
        if (btrb == null) {
            btrb = btrb.f150056k;
        }
        if (btrb.f150059b == null) {
            return null;
        }
        btrb btrb2 = ((btrg) this.f91029a.f164949b).f150095e;
        if (btrb2 == null) {
            btrb2 = btrb.f150056k;
        }
        btmy btmy = btrb2.f150059b;
        if (btmy == null) {
            btmy = btmy.f149577g;
        }
        btnc btnc = btmy.f149582d;
        if (btnc == null) {
            btnc = btnc.f149591d;
        }
        if (btnc.f149593a == 0.0d) {
            return null;
        }
        btrb btrb3 = ((btrg) this.f91029a.f164949b).f150095e;
        if (btrb3 == null) {
            btrb3 = btrb.f150056k;
        }
        btmy btmy2 = btrb3.f150059b;
        if (btmy2 == null) {
            btmy2 = btmy.f149577g;
        }
        btnc btnc2 = btmy2.f149582d;
        if (btnc2 == null) {
            btnc2 = btnc.f149591d;
        }
        if (btnc2.f149594b == 0.0d) {
            return null;
        }
        btrb btrb4 = ((btrg) this.f91029a.f164949b).f150095e;
        if (btrb4 == null) {
            btrb4 = btrb.f150056k;
        }
        btmy btmy3 = btrb4.f150059b;
        if (btmy3 == null) {
            btmy3 = btmy.f149577g;
        }
        btnc btnc3 = btmy3.f149582d;
        if (btnc3 == null) {
            btnc3 = btnc.f149591d;
        }
        String valueOf = String.valueOf(btnc3.f149593a);
        btrb btrb5 = ((btrg) this.f91029a.f164949b).f150095e;
        if (btrb5 == null) {
            btrb5 = btrb.f150056k;
        }
        btmy btmy4 = btrb5.f150059b;
        if (btmy4 == null) {
            btmy4 = btmy.f149577g;
        }
        btnc btnc4 = btmy4.f149582d;
        if (btnc4 == null) {
            btnc4 = btnc.f149591d;
        }
        String valueOf2 = String.valueOf(btnc4.f149594b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append(",");
        sb.append(valueOf2);
        return sb.toString();
    }

    /* renamed from: e */
    public final String mo50254e() {
        if (mo50258i() != 4) {
            return null;
        }
        btrb btrb = ((btrg) this.f91029a.f164949b).f150095e;
        if (btrb == null) {
            btrb = btrb.f150056k;
        }
        if (btrb.f150060c.isEmpty()) {
            return null;
        }
        btrb btrb2 = ((btrg) this.f91029a.f164949b).f150095e;
        if (btrb2 == null) {
            btrb2 = btrb.f150056k;
        }
        return btrb2.f150060c;
    }

    /* renamed from: f */
    public final boolean mo50255f() {
        int a = btrl.m117069a(((btrg) this.f91029a.f164949b).f150094d);
        return a != 0 && a == 7;
    }

    /* renamed from: g */
    public final boolean mo50256g() {
        int a = btrl.m117069a(((btrg) this.f91029a.f164949b).f150094d);
        return a != 0 && a == 8;
    }

    /* renamed from: h */
    public final boolean mo50257h() {
        int a = btrl.m117069a(((btrg) this.f91029a.f164949b).f150094d);
        return a != 0 && a == 9;
    }

    /* renamed from: i */
    public final int mo50258i() {
        int b;
        btrb btrb = ((btrg) this.f91029a.f164949b).f150095e;
        if (btrb == null || (b = btra.m117057b(btrb.f150064g)) == 0 || b == 1) {
            return 2;
        }
        btrb btrb2 = ((btrg) this.f91029a.f164949b).f150095e;
        if (btrb2 == null) {
            btrb2 = btrb.f150056k;
        }
        int b2 = btra.m117057b(btrb2.f150064g);
        if (b2 != 0) {
            return b2;
        }
        return 1;
    }

    /* renamed from: j */
    public final int mo50259j() {
        int b;
        btrb btrb = ((btrg) this.f91029a.f164949b).f150095e;
        int i = 2;
        if (!(btrb == null || (b = btqz.m117055b(btrb.f150067j)) == 0 || b == 1)) {
            btrb btrb2 = ((btrg) this.f91029a.f164949b).f150095e;
            if (btrb2 == null) {
                btrb2 = btrb.f150056k;
            }
            i = btqz.m117055b(btrb2.f150067j);
            if (i != 0) {
                return i;
            }
            return 1;
        }
        return i;
    }

    /* renamed from: a */
    public final String mo50247a(Context context) {
        bxyk bxyk = ((btrg) this.f91029a.f164949b).f150092b;
        if (bxyk != null) {
            return DateUtils.formatDateTime(context, bxyk.f165097a * 1000, 1);
        }
        return null;
    }

    /* renamed from: a */
    public final void mo50248a(int i) {
        bxvd bxvd = this.f91029a;
        btrb btrb = ((btrg) bxvd.f164949b).f150095e;
        if (btrb != null) {
            bxvd bxvd2 = (bxvd) btrb.mo74142c(5);
            bxvd2.mo73625a((GeneratedMessageLite) btrb);
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            ((btrb) bxvd2.f164949b).f150064g = btra.m117056a(i);
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            btrb btrb2 = (btrb) bxvd2.mo74062i();
            btrg btrg = btrg.f150089i;
            btrb2.getClass();
            ((btrg) bxvd.f164949b).f150095e = btrb2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0159 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x015a A[RETURN] */
    /* renamed from: b */
    public final String mo50250b(Context context) {
        String str;
        String str2;
        String str3;
        if (mo50258i() == 4) {
            btrb btrb = ((btrg) this.f91029a.f164949b).f150095e;
            if (btrb == null) {
                btrb = btrb.f150056k;
            }
            if (btrb.f150059b != null) {
                btrb btrb2 = ((btrg) this.f91029a.f164949b).f150095e;
                if (btrb2 == null) {
                    btrb2 = btrb.f150056k;
                }
                btmy btmy = btrb2.f150059b;
                if (btmy == null) {
                    btmy = btmy.f149577g;
                }
                if (!btmy.f149583e.isEmpty()) {
                    btrb btrb3 = ((btrg) this.f91029a.f164949b).f150095e;
                    if (btrb3 == null) {
                        btrb3 = btrb.f150056k;
                    }
                    btmy btmy2 = btrb3.f150059b;
                    if (btmy2 == null) {
                        btmy2 = btmy.f149577g;
                    }
                    str = btmy2.f149583e;
                    if (str == null) {
                        return str;
                    }
                    if (mo50258i() == 4) {
                        btrb btrb4 = ((btrg) this.f91029a.f164949b).f150095e;
                        if (btrb4 == null) {
                            btrb4 = btrb.f150056k;
                        }
                        if (btrb4.f150059b != null) {
                            btrb btrb5 = ((btrg) this.f91029a.f164949b).f150095e;
                            if (btrb5 == null) {
                                btrb5 = btrb.f150056k;
                            }
                            btmy btmy3 = btrb5.f150059b;
                            if (btmy3 == null) {
                                btmy3 = btmy.f149577g;
                            }
                            if (!btmy3.f149580b.isEmpty()) {
                                btrb btrb6 = ((btrg) this.f91029a.f164949b).f150095e;
                                if (btrb6 == null) {
                                    btrb6 = btrb.f150056k;
                                }
                                btmy btmy4 = btrb6.f150059b;
                                if (btmy4 == null) {
                                    btmy4 = btmy.f149577g;
                                }
                                if (!btmy4.f149581c.isEmpty()) {
                                    String string = context.getResources().getString(C0126R.string.tp_locality_area);
                                    Object[] objArr = new Object[2];
                                    btrb btrb7 = ((btrg) this.f91029a.f164949b).f150095e;
                                    if (btrb7 == null) {
                                        btrb7 = btrb.f150056k;
                                    }
                                    btmy btmy5 = btrb7.f150059b;
                                    if (btmy5 == null) {
                                        btmy5 = btmy.f149577g;
                                    }
                                    objArr[0] = btmy5.f149580b;
                                    btrb btrb8 = ((btrg) this.f91029a.f164949b).f150095e;
                                    if (btrb8 == null) {
                                        btrb8 = btrb.f150056k;
                                    }
                                    btmy btmy6 = btrb8.f150059b;
                                    if (btmy6 == null) {
                                        btmy6 = btmy.f149577g;
                                    }
                                    objArr[1] = btmy6.f149581c;
                                    str2 = String.format(string, objArr);
                                    if (mo50258i() == 4) {
                                        btrb btrb9 = ((btrg) this.f91029a.f164949b).f150095e;
                                        if (btrb9 == null) {
                                            btrb9 = btrb.f150056k;
                                        }
                                        if (btrb9.f150059b != null) {
                                            btrb btrb10 = ((btrg) this.f91029a.f164949b).f150095e;
                                            if (btrb10 == null) {
                                                btrb10 = btrb.f150056k;
                                            }
                                            btmy btmy7 = btrb10.f150059b;
                                            if (btmy7 == null) {
                                                btmy7 = btmy.f149577g;
                                            }
                                            if (btmy7.f149579a.size() != 0) {
                                                bmxr a = bmxr.m108544a("\n");
                                                btrb btrb11 = ((btrg) this.f91029a.f164949b).f150095e;
                                                if (btrb11 == null) {
                                                    btrb11 = btrb.f150056k;
                                                }
                                                btmy btmy8 = btrb11.f150059b;
                                                if (btmy8 == null) {
                                                    btmy8 = btmy.f149577g;
                                                }
                                                str3 = a.mo66874a((Iterable) btmy8.f149579a);
                                            } else {
                                                str3 = null;
                                            }
                                            if (str2 == null) {
                                                return null;
                                            }
                                            if (str3 == null) {
                                                return str2;
                                            }
                                            StringBuilder sb = new StringBuilder(str3.length() + 1 + str2.length());
                                            sb.append(str3);
                                            sb.append("\n");
                                            sb.append(str2);
                                            return sb.toString();
                                        }
                                    }
                                    str3 = null;
                                    if (str2 == null) {
                                    }
                                }
                            }
                        }
                    }
                    str2 = null;
                    if (mo50258i() == 4) {
                    }
                    str3 = null;
                    if (str2 == null) {
                    }
                }
            }
        }
        str = null;
        if (str == null) {
        }
    }

    /* renamed from: b */
    public final void mo50251b(int i) {
        bxvd bxvd = this.f91029a;
        btrb btrb = ((btrg) bxvd.f164949b).f150095e;
        if (btrb != null) {
            bxvd bxvd2 = (bxvd) btrb.mo74142c(5);
            bxvd2.mo73625a((GeneratedMessageLite) btrb);
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            ((btrb) bxvd2.f164949b).f150067j = btqz.m117054a(i);
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            btrb btrb2 = (btrb) bxvd2.mo74062i();
            btrg btrg = btrg.f150089i;
            btrb2.getClass();
            ((btrg) bxvd.f164949b).f150095e = btrb2;
        }
    }
}
