package com.google.android.gms.auth.uiflows.addaccount;

import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.auth.uiflows.controller.Controller;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FinishAddAccountSessionController implements Controller {
    public static final Parcelable.Creator CREATOR = new jvv();

    /* renamed from: a */
    private static final sek f11376a = ght.m13171a("AddAccount", "FinishAddAccountSessionController");

    /* renamed from: b */
    private static final int f11377b = C0126R.anim.sud_slide_next_in;

    /* renamed from: c */
    private static final int f11378c = C0126R.anim.sud_slide_next_out;

    /* renamed from: d */
    private static final int f11379d = C0126R.anim.sud_slide_back_in;

    /* renamed from: e */
    private static final int f11380e = C0126R.anim.sud_slide_back_out;

    /* renamed from: f */
    private static final imr f11381f = imr.m15727a("token_handle");

    /* renamed from: A */
    private boolean f11382A;

    /* renamed from: B */
    private boolean f11383B;

    /* renamed from: C */
    private String f11384C;

    /* renamed from: g */
    private final Context f11385g = rpr.m34216b();

    /* renamed from: h */
    private final imw f11386h;

    /* renamed from: i */
    private final AccountAuthenticatorResponse f11387i;

    /* renamed from: j */
    private final String f11388j;

    /* renamed from: k */
    private final boolean f11389k;

    /* renamed from: l */
    private final boolean f11390l;

    /* renamed from: m */
    private final rrq f11391m;

    /* renamed from: n */
    private final String f11392n;

    /* renamed from: o */
    private final boolean f11393o;

    /* renamed from: p */
    private final String f11394p;

    /* renamed from: q */
    private final String f11395q;

    /* renamed from: r */
    private final boolean f11396r;

    /* renamed from: s */
    private final boolean f11397s;

    /* renamed from: t */
    private final String f11398t;

    /* renamed from: u */
    private final boolean f11399u;

    /* renamed from: v */
    private final boolean f11400v;

    /* renamed from: w */
    private final boolean f11401w;

    /* renamed from: x */
    private Account f11402x;

    /* renamed from: y */
    private String f11403y = null;

    /* renamed from: z */
    private boolean f11404z;

    public FinishAddAccountSessionController(AccountAuthenticatorResponse accountAuthenticatorResponse, String str, boolean z, boolean z2, rrq rrq, String str2, String str3, String str4, boolean z3, boolean z4, String str5, boolean z5, boolean z6, boolean z7, Account account, String str6, boolean z8, boolean z9, boolean z10, String str7) {
        imw imw = new imw(rpr.m34216b());
        boolean isOwner = Process.myUserHandle().isOwner();
        this.f11386h = imw;
        this.f11387i = accountAuthenticatorResponse;
        this.f11388j = str;
        this.f11389k = z;
        this.f11391m = rrq;
        this.f11390l = z2;
        this.f11392n = str2;
        this.f11394p = str3;
        this.f11395q = str4;
        this.f11396r = z3;
        this.f11393o = isOwner;
        this.f11402x = account;
        this.f11397s = z4;
        this.f11398t = str5;
        this.f11400v = z5;
        this.f11399u = z6;
        this.f11401w = z7;
        this.f11403y = str6;
        this.f11404z = z8;
        this.f11382A = z9;
        this.f11383B = z10;
        this.f11384C = str7;
    }

    /* renamed from: a */
    private final jxw m6972a() {
        if (!this.f11404z) {
            if (this.f11389k) {
                int i = Build.VERSION.SDK_INT;
            }
            Intent a = jwn.m17425a(this.f11385g, this.f11402x, this.f11397s, this.f11389k, this.f11390l, this.f11401w, this.f11391m);
            if (a != null) {
                return m6976b(30, WrapperControlledChimeraActivity.m7009a(this.f11385g, this.f11390l, this.f11391m, a));
            }
        }
        return m6977c();
    }

    /* renamed from: b */
    private final Intent m6975b(int i) {
        String string = this.f11385g.getString(i);
        ims ims = new ims();
        ims.mo13148b(jwz.f23429j, Boolean.valueOf(this.f11390l));
        ims.mo13148b(jwz.f23428i, this.f11391m.mo25045a());
        if (!this.f11389k) {
            ims.mo13148b(ErrorChimeraActivity.f11372c, 4);
        } else {
            ims.mo13148b(ErrorChimeraActivity.f11374e, true);
        }
        return ErrorChimeraActivity.m6968a(this.f11385g, (int) C0126R.string.common_login_error_title, string).putExtras(ims.f21367a);
    }

    /* renamed from: c */
    private final jxw m6977c() {
        Intent a;
        if (!rrk.m34296a(this.f11403y) || (a = rrk.m34291a(this.f11385g, this.f11402x, this.f11389k, this.f11390l, this.f11391m.mo25045a(), this.f11399u, this.f11398t, this.f11393o, this.f11403y, this.f11383B, 0, Bundle.EMPTY)) == null) {
            return m6973a(4);
        }
        return m6974a(40, WrapperControlledChimeraActivity.m7009a(this.f11385g, this.f11390l, this.f11391m, a));
    }

    /* renamed from: d */
    private final jxw m6979d() {
        Bundle bundle = new Bundle();
        bundle.putString("authAccount", this.f11402x.name);
        bundle.putString("accountType", this.f11402x.type);
        bundle.putString("accountStatusToken", this.f11384C);
        Intent putExtras = new Intent().putExtras(bundle);
        AccountAuthenticatorResponse accountAuthenticatorResponse = this.f11387i;
        if (accountAuthenticatorResponse != null) {
            accountAuthenticatorResponse.onResult(bundle);
        }
        return m6978c(-1, putExtras);
    }

    /* renamed from: e */
    private final jxw m6980e() {
        AccountAuthenticatorResponse accountAuthenticatorResponse = this.f11387i;
        if (accountAuthenticatorResponse != null) {
            accountAuthenticatorResponse.onError(4, "canceled or skipped");
        }
        return jxw.m17487b(0, null, f11379d, f11380e);
    }

    /* renamed from: b */
    public final String mo7863b() {
        return "FinishAddAccountSessionController";
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f11387i, 0);
        parcel.writeString(this.f11388j);
        parcel.writeByte(this.f11389k ? (byte) 1 : 0);
        parcel.writeByte(this.f11390l ? (byte) 1 : 0);
        parcel.writeParcelable(this.f11391m.mo25045a(), 0);
        parcel.writeString(this.f11392n);
        parcel.writeString(this.f11394p);
        parcel.writeString(this.f11395q);
        parcel.writeByte(this.f11396r ? (byte) 1 : 0);
        parcel.writeByte(this.f11397s ? (byte) 1 : 0);
        parcel.writeString(this.f11398t);
        parcel.writeByte(this.f11400v ? (byte) 1 : 0);
        parcel.writeByte(this.f11399u ? (byte) 1 : 0);
        parcel.writeByte(this.f11401w ? (byte) 1 : 0);
        parcel.writeParcelable(this.f11402x, 0);
        parcel.writeString(this.f11403y);
        parcel.writeByte(this.f11404z ? (byte) 1 : 0);
        parcel.writeByte(this.f11382A ? (byte) 1 : 0);
        parcel.writeByte(this.f11383B ? (byte) 1 : 0);
        parcel.writeString(this.f11384C);
    }

    /* renamed from: a */
    private final jxw m6973a(int i) {
        if (this.f11382A) {
            return m6974a(50, RemoveAccountChimeraActivity.m6997a(this.f11385g, this.f11402x, i, this.f11390l, this.f11391m));
        }
        return m6979d();
    }

    /* renamed from: c */
    private static jxw m6978c(int i, Intent intent) {
        return jxw.m17487b(i, intent, f11377b, f11378c);
    }

    /* renamed from: b */
    private static jxw m6976b(int i, Intent intent) {
        return jxw.m17485a(i, intent, 17432576, 17432577);
    }

    /* renamed from: a */
    private static jxw m6974a(int i, Intent intent) {
        return jxw.m17485a(i, intent, f11377b, f11378c);
    }

    /* renamed from: a */
    public final jxw mo7862a(jxy jxy) {
        jxy jxy2 = jxy;
        if (jxy2 != null) {
            f11376a.mo25412b(String.format("Result with id=%d and resultCode=%d", Integer.valueOf(jxy2.f23499a), Integer.valueOf(jxy2.f23500b)), new Object[0]);
            Intent intent = jxy2.f23501c;
            ims ims = new ims(intent == null ? new Bundle() : intent.getExtras());
            int i = jxy2.f23499a;
            if (i == 10) {
                int i2 = jxy2.f23500b;
                if (i2 == -1) {
                    return m6976b(20, AddAccountChimeraActivity.m6909a(this.f11385g, this.f11388j, this.f11389k, this.f11394p, this.f11395q, this.f11392n, this.f11396r, false, this.f11390l, false, this.f11391m, false));
                }
                if (i2 == 0) {
                    return m6980e();
                }
                if (i2 == 2) {
                    return m6976b(70, m6975b(C0126R.string.auth_error_generic_server_error));
                }
            } else if (i == 20) {
                int i3 = jxy2.f23500b;
                if (i3 == -1) {
                    this.f11402x = (Account) ims.mo13146a(AddAccountChimeraActivity.f11299a);
                    this.f11384C = (String) ims.mo13146a(f11381f);
                    this.f11403y = (String) ims.mo13146a(AddAccountChimeraActivity.f11301c);
                    this.f11383B = ((Boolean) ims.mo13146a(AddAccountChimeraActivity.f11302d)).booleanValue();
                    if (rrk.m34296a(this.f11403y)) {
                        this.f11382A = AddAccountController.m6928b(this.f11383B);
                        this.f11404z = AddAccountController.m6925a(this.f11383B);
                        AddAccountController.m6924a(this.f11385g, this.f11402x);
                    }
                    return m6972a();
                } else if (i3 == 0) {
                    return m6980e();
                } else {
                    if (i3 == 2) {
                        return m6974a(70, m6975b(C0126R.string.auth_error_generic_server_error));
                    }
                    if (i3 == 3 || i3 == 4) {
                        return m6974a(70, m6975b(C0126R.string.auth_error_generic_server_error));
                    }
                }
            } else if (i == 30) {
                int i4 = jxy2.f23500b;
                if (i4 == -1) {
                    return m6977c();
                }
                if (i4 == 0) {
                    return jxw.m17485a(60, AccountAddedChimeraActivity.m6903a(this.f11385g, this.f11390l, this.f11391m), f11379d, f11380e);
                }
            } else if (i == 40) {
                int i5 = jxy2.f23500b;
                if (i5 != -1) {
                    if (i5 == 2) {
                        return m6973a(1);
                    }
                    if (i5 != 3) {
                        if (i5 == 5) {
                            return m6974a(42, RemoveAccountChimeraActivity.m6997a(this.f11385g, this.f11402x, 5, this.f11390l, this.f11391m));
                        }
                        if (i5 != 6) {
                            if (i5 == 8) {
                                return m6973a(4);
                            }
                            if (i5 != 9) {
                                return m6973a(3);
                            }
                            return m6974a(42, RemoveAccountChimeraActivity.m6997a(this.f11385g, this.f11402x, 6, this.f11390l, this.f11391m));
                        }
                    }
                    return m6973a(2);
                } else if (!rrk.m34294a(this.f11385g)) {
                    return m6979d();
                } else {
                    f11376a.mo25414c("Device was provisioned by Device Management. Finishing SUW.", new Object[0]);
                    return m6979d();
                }
            } else if (i == 42) {
                return m6979d();
            } else {
                if (i == 50) {
                    int i6 = jxy2.f23500b;
                    if (i6 == -1) {
                        return m6980e();
                    }
                    if (i6 == 0) {
                        AccountAuthenticatorResponse accountAuthenticatorResponse = this.f11387i;
                        if (accountAuthenticatorResponse != null) {
                            accountAuthenticatorResponse.onError(4, "skipped or error");
                        }
                        return m6978c(0, null);
                    }
                } else if (i != 60) {
                    if (i == 70) {
                        return m6980e();
                    }
                }
                return m6972a();
            }
            throw new IllegalStateException(String.format("Result not handled with id %d and resultCode %d.", Integer.valueOf(i), Integer.valueOf(jxy2.f23500b)));
        } else if (!this.f11386h.mo13150a()) {
            return jxw.m17484a(70, m6975b(C0126R.string.auth_error_no_network));
        } else {
            return jxw.m17484a(10, PreAddAccountChimeraActivity.m6987a(this.f11385g, this.f11390l, this.f11391m, this.f11389k));
        }
    }
}
