package com.google.android.gms.auth.uiflows.addaccount;

import android.accounts.AccountAuthenticatorResponse;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.auth.uiflows.controller.Controller;
import com.google.android.gms.auth.uiflows.minutemaid.MinuteMaidChimeraActivity;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class StartAddAccountSessionController implements Controller {
    public static final Parcelable.Creator CREATOR = new jwo();

    /* renamed from: a */
    private static final sek f11433a = ght.m13171a("AddAccount", "StartAddAccountSessionController");

    /* renamed from: b */
    private static final int f11434b = C0126R.anim.sud_slide_next_in;

    /* renamed from: c */
    private static final int f11435c = C0126R.anim.sud_slide_next_out;

    /* renamed from: d */
    private static final int f11436d = C0126R.anim.sud_slide_back_in;

    /* renamed from: e */
    private static final int f11437e = C0126R.anim.sud_slide_back_out;

    /* renamed from: f */
    private final Context f11438f = rpr.m34216b();

    /* renamed from: g */
    private final imw f11439g;

    /* renamed from: h */
    private final AccountAuthenticatorResponse f11440h;

    /* renamed from: i */
    private final String f11441i;

    /* renamed from: j */
    private final boolean f11442j;

    /* renamed from: k */
    private final boolean f11443k;

    /* renamed from: l */
    private final rrq f11444l;

    /* renamed from: m */
    private final String f11445m;

    /* renamed from: n */
    private final String f11446n;

    /* renamed from: o */
    private final String[] f11447o;

    /* renamed from: p */
    private final String f11448p;

    /* renamed from: q */
    private final String f11449q;

    /* renamed from: r */
    private boolean f11450r;

    /* renamed from: s */
    private String f11451s;

    /* renamed from: t */
    private String f11452t;

    /* renamed from: u */
    private String f11453u;

    /* renamed from: v */
    private String f11454v;

    /* renamed from: w */
    private boolean f11455w;

    public StartAddAccountSessionController(AccountAuthenticatorResponse accountAuthenticatorResponse, String str, boolean z, boolean z2, rrq rrq, String str2, String str3, String[] strArr, String str4, String str5, boolean z3, boolean z4, String str6, String str7, String str8, String str9) {
        imw imw = new imw(rpr.m34216b());
        this.f11439g = imw;
        this.f11440h = accountAuthenticatorResponse;
        this.f11441i = str;
        this.f11442j = z;
        this.f11444l = rrq;
        this.f11443k = z2;
        this.f11445m = str2;
        this.f11446n = str3;
        this.f11447o = strArr;
        this.f11448p = str4;
        this.f11449q = str5;
        this.f11450r = z3;
        this.f11455w = z4;
        this.f11451s = str6;
        this.f11452t = str7;
        this.f11453u = str8;
        this.f11454v = str9;
    }

    /* renamed from: a */
    private final Intent m7001a(int i) {
        return m7002a(this.f11438f.getString(i));
    }

    /* renamed from: c */
    private final jxw m7006c() {
        AccountAuthenticatorResponse accountAuthenticatorResponse = this.f11440h;
        if (accountAuthenticatorResponse != null) {
            accountAuthenticatorResponse.onError(4, "canceled");
        }
        return jxw.m17487b(0, null, f11436d, f11437e);
    }

    /* renamed from: b */
    public final String mo7863b() {
        return "StartAddAccountSessionController";
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f11440h, 0);
        parcel.writeString(this.f11441i);
        parcel.writeByte(this.f11442j ? (byte) 1 : 0);
        parcel.writeByte(this.f11443k ? (byte) 1 : 0);
        parcel.writeParcelable(this.f11444l.mo25045a(), 0);
        parcel.writeString(this.f11445m);
        parcel.writeString(this.f11446n);
        parcel.writeStringArray(this.f11447o);
        parcel.writeString(this.f11448p);
        parcel.writeString(this.f11449q);
        parcel.writeByte(this.f11450r ? (byte) 1 : 0);
        parcel.writeByte(this.f11455w ? (byte) 1 : 0);
        parcel.writeString(this.f11451s);
        parcel.writeString(this.f11452t);
        parcel.writeString(this.f11453u);
        parcel.writeString(this.f11454v);
    }

    /* renamed from: a */
    private final Intent m7002a(String str) {
        ims ims = new ims();
        ims.mo13148b(jwz.f23429j, Boolean.valueOf(this.f11443k));
        ims.mo13148b(jwz.f23428i, this.f11444l.mo25045a());
        if (!this.f11442j) {
            ims.mo13148b(ErrorChimeraActivity.f11372c, 4);
        } else {
            ims.mo13148b(ErrorChimeraActivity.f11374e, true);
        }
        return ErrorChimeraActivity.m6968a(this.f11438f, (int) C0126R.string.common_login_error_title, str).putExtras(ims.f21367a);
    }

    /* renamed from: a */
    private final jxw m7003a() {
        AccountAuthenticatorResponse accountAuthenticatorResponse = this.f11440h;
        if (accountAuthenticatorResponse != null) {
            accountAuthenticatorResponse.onError(4, "skipped or error");
        }
        return m7004a(1, null);
    }

    /* renamed from: a */
    private static jxw m7004a(int i, Intent intent) {
        return jxw.m17487b(i, intent, f11434b, f11435c);
    }

    /* renamed from: a */
    private static jxw m7005a(Intent intent) {
        return jxw.m17485a(19, intent, f11434b, f11435c);
    }

    /* renamed from: a */
    public final jxw mo7862a(jxy jxy) {
        jxy jxy2 = jxy;
        if (jxy2 != null) {
            f11433a.mo25412b(String.format("Result with id=%d and resultCode=%d", Integer.valueOf(jxy2.f23499a), Integer.valueOf(jxy2.f23500b)), new Object[0]);
            Intent intent = jxy2.f23501c;
            ims ims = new ims(intent == null ? new Bundle() : intent.getExtras());
            int i = jxy2.f23499a;
            if (i == 0) {
                int i2 = jxy2.f23500b;
                if (i2 == -1) {
                    Context context = this.f11438f;
                    String str = this.f11441i;
                    boolean z = this.f11442j;
                    boolean z2 = this.f11443k;
                    rrq rrq = this.f11444l;
                    return jxw.m17484a(10, MinuteMaidChimeraActivity.m7073a(context, str, z, true, z2, rrq, this.f11447o, null, this.f11445m, this.f11446n, this.f11448p, this.f11449q, true, false, false, false, jvj.m17398a(context, false, str, rrq, true)));
                } else if (i2 == 0) {
                    return m7006c();
                } else {
                    if (i2 == 1) {
                        return m7005a(m7001a((int) C0126R.string.auth_error_generic_server_error));
                    }
                }
            } else if (i == 10) {
                int i3 = jxy2.f23500b;
                if (i3 == -1) {
                    this.f11451s = (String) ims.mo13146a(MinuteMaidChimeraActivity.f11546b);
                    this.f11452t = (String) ims.mo13146a(MinuteMaidChimeraActivity.f11547c);
                    this.f11453u = (String) ims.mo13146a(MinuteMaidChimeraActivity.f11548d);
                    this.f11454v = (String) ims.mo13146a(MinuteMaidChimeraActivity.f11549e);
                    this.f11455w = ((Boolean) ims.mo13147a(MinuteMaidChimeraActivity.f11551g, false)).booleanValue();
                    boolean booleanValue = ((Boolean) ims.mo13147a(MinuteMaidChimeraActivity.f11550f, false)).booleanValue();
                    this.f11450r = booleanValue;
                    Bundle a = FinishSessionChimeraActivity.m6985a(this.f11442j, this.f11443k, this.f11444l, this.f11451s, this.f11452t, this.f11455w, booleanValue, this.f11453u, this.f11441i);
                    Bundle bundle = new Bundle();
                    bundle.putBundle("accountSessionBundle", a);
                    bundle.putString("password", this.f11454v);
                    Intent putExtras = new Intent().putExtras(bundle);
                    AccountAuthenticatorResponse accountAuthenticatorResponse = this.f11440h;
                    if (accountAuthenticatorResponse != null) {
                        accountAuthenticatorResponse.onResult(bundle);
                    }
                    return m7004a(-1, putExtras);
                } else if (i3 == 0) {
                    return m7006c();
                } else {
                    if (i3 == 1) {
                        return m7003a();
                    }
                    if (i3 == 2) {
                        String str2 = (String) ims.mo13146a(MinuteMaidChimeraActivity.f11552h);
                        if (str2 == null) {
                            str2 = this.f11438f.getString(C0126R.string.auth_error_generic_server_error);
                        }
                        return m7005a(m7002a(str2));
                    }
                }
            } else if (i == 19) {
                int i4 = jxy2.f23500b;
                if (i4 == -1) {
                    return m7003a();
                }
                if (i4 == 0) {
                    return m7006c();
                }
            }
            throw new IllegalStateException(String.format("Result not handled with id %d and resultCode %d.", Integer.valueOf(i), Integer.valueOf(jxy2.f23500b)));
        } else if (!this.f11439g.mo13150a()) {
            return jxw.m17484a(19, m7001a((int) C0126R.string.auth_error_no_network));
        } else {
            Intent a2 = rrk.m34293a(this.f11438f, this.f11443k, this.f11442j, this.f11444l.mo25045a(), Bundle.EMPTY);
            if (a2 != null) {
                return jxw.m17484a(0, WrapperControlledChimeraActivity.m7009a(this.f11438f, this.f11443k, this.f11444l, a2));
            }
            Context context2 = this.f11438f;
            String str3 = this.f11441i;
            boolean z3 = this.f11442j;
            boolean z4 = this.f11443k;
            rrq rrq2 = this.f11444l;
            return jxw.m17484a(10, MinuteMaidChimeraActivity.m7073a(context2, str3, z3, true, z4, rrq2, this.f11447o, null, this.f11445m, this.f11446n, this.f11448p, this.f11449q, true, false, false, false, jvj.m17398a(context2, false, str3, rrq2, true)));
        }
    }
}
