package com.google.android.gms.auth.uiflows.addaccount;

import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.UserManager;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.auth.account.p016be.UpdateHideDmNotificationsIntentOperation;
import com.google.android.gms.auth.firstparty.shared.D2dOptions;
import com.google.android.gms.auth.firstparty.shared.ManagedAuthOptions;
import com.google.android.gms.auth.setup.d2d.SmartDeviceChimeraActivity;
import com.google.android.gms.auth.uiflows.controller.Controller;
import com.google.android.gms.auth.uiflows.minutemaid.MinuteMaidChimeraActivity;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AddAccountController implements Controller {
    public static final Parcelable.Creator CREATOR = new juz();

    /* renamed from: a */
    static final imr f11314a = imr.m15727a("intentionally_canceled");

    /* renamed from: c */
    private static final sek f11315c = ght.m13171a("AddAccount", "AddAccountController");

    /* renamed from: d */
    private static final int f11316d = C0126R.anim.sud_slide_next_in;

    /* renamed from: e */
    private static final int f11317e = C0126R.anim.sud_slide_next_out;

    /* renamed from: f */
    private static final int f11318f = C0126R.anim.sud_slide_back_in;

    /* renamed from: g */
    private static final int f11319g = C0126R.anim.sud_slide_back_out;

    /* renamed from: h */
    private static final List f11320h = Arrays.asList("com.android.settings", "com.android.vending");

    /* renamed from: i */
    private static final imr f11321i = imr.m15727a("token_handle");

    /* renamed from: A */
    private final boolean f11322A;

    /* renamed from: B */
    private final boolean f11323B;

    /* renamed from: C */
    private final boolean f11324C;

    /* renamed from: D */
    private final ManagedAuthOptions f11325D;

    /* renamed from: E */
    private final D2dOptions f11326E;

    /* renamed from: F */
    private boolean f11327F;

    /* renamed from: G */
    private Intent f11328G;

    /* renamed from: H */
    private Account f11329H;

    /* renamed from: I */
    private boolean f11330I;

    /* renamed from: J */
    private Intent f11331J;

    /* renamed from: K */
    private String f11332K = null;

    /* renamed from: L */
    private boolean f11333L;

    /* renamed from: M */
    private boolean f11334M;

    /* renamed from: N */
    private boolean f11335N;

    /* renamed from: O */
    private rrl f11336O;

    /* renamed from: P */
    private String f11337P;

    /* renamed from: b */
    boolean f11338b;

    /* renamed from: j */
    private final Context f11339j = rpr.m34216b();

    /* renamed from: k */
    private final imw f11340k;

    /* renamed from: l */
    private final jvl f11341l;

    /* renamed from: m */
    private final AccountAuthenticatorResponse f11342m;

    /* renamed from: n */
    private final String f11343n;

    /* renamed from: o */
    private final String f11344o;

    /* renamed from: p */
    private final boolean f11345p;

    /* renamed from: q */
    private final boolean f11346q;

    /* renamed from: r */
    private final rrq f11347r;

    /* renamed from: s */
    private final boolean f11348s;

    /* renamed from: t */
    private final boolean f11349t;

    /* renamed from: u */
    private final String f11350u;

    /* renamed from: v */
    private final String f11351v;

    /* renamed from: w */
    private final String f11352w;

    /* renamed from: x */
    private final String[] f11353x;

    /* renamed from: y */
    private final boolean f11354y;

    /* renamed from: z */
    private final String f11355z;

    public AddAccountController(imw imw, jvl jvl, AccountAuthenticatorResponse accountAuthenticatorResponse, String str, boolean z, boolean z2, rrq rrq, boolean z3, String str2, String str3, String str4, String[] strArr, String str5, String str6, boolean z4, boolean z5, Intent intent, Account account, boolean z6, Intent intent2, String str7, boolean z7, boolean z8, boolean z9, String str8, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, ManagedAuthOptions managedAuthOptions, D2dOptions d2dOptions, rrl rrl) {
        this.f11340k = imw;
        this.f11341l = jvl;
        this.f11342m = accountAuthenticatorResponse;
        this.f11343n = str;
        this.f11345p = z;
        this.f11347r = rrq;
        this.f11346q = z2;
        this.f11348s = z3;
        this.f11350u = str2;
        this.f11351v = str3;
        this.f11352w = str4;
        this.f11353x = strArr;
        this.f11344o = str5;
        this.f11355z = str6;
        this.f11322A = z11;
        this.f11349t = z12;
        this.f11354y = z4;
        this.f11327F = z5;
        this.f11328G = intent;
        this.f11329H = account;
        this.f11330I = z6;
        this.f11331J = intent2;
        this.f11332K = str7;
        this.f11333L = z7;
        this.f11334M = z8;
        this.f11335N = z9;
        this.f11337P = str8;
        this.f11338b = z10;
        this.f11323B = z13;
        this.f11324C = z14;
        this.f11325D = managedAuthOptions;
        this.f11326E = d2dOptions;
        this.f11336O = rrl;
    }

    /* renamed from: a */
    private final Intent m6916a(int i, String str) {
        Bundle bundle;
        ims ims = new ims();
        ims.mo13148b(jwz.f23429j, Boolean.valueOf(this.f11346q));
        imr imr = jwz.f23428i;
        rrq rrq = this.f11347r;
        if (rrq != null) {
            bundle = rrq.mo25045a();
        } else {
            bundle = null;
        }
        ims.mo13148b(imr, bundle);
        if (this.f11345p) {
            ims.mo13148b(ErrorChimeraActivity.f11374e, true);
        } else if (!srk.m36121a(cbxe.m128828b())) {
            ims.mo13148b(ErrorChimeraActivity.f11372c, 4);
        }
        return ErrorChimeraActivity.m6968a(this.f11339j, i, str).putExtras(ims.f21367a);
    }

    /* renamed from: b */
    private final jxw m6926b(int i) {
        return m6927b(70, RemoveAccountChimeraActivity.m6997a(this.f11339j, this.f11329H, i, this.f11346q, this.f11347r));
    }

    /* renamed from: c */
    private final Intent m6929c(int i) {
        return m6917a(this.f11339j.getString(i));
    }

    /* renamed from: d */
    private final Intent m6932d() {
        String str;
        D2dOptions d2dOptions = this.f11326E;
        boolean z = d2dOptions != null && d2dOptions.f10855a && d2dOptions.f10856b;
        if ((this.f11327F && !z) || this.f11348s || !this.f11345p) {
            return null;
        }
        int i = Build.VERSION.SDK_INT;
        Context context = this.f11339j;
        String str2 = this.f11347r.f43552a;
        boolean z2 = this.f11346q;
        boolean z3 = this.f11345p;
        D2dOptions d2dOptions2 = this.f11326E;
        if (!((Boolean) SmartDeviceChimeraActivity.f11262h.mo25081c()).booleanValue()) {
            SmartDeviceChimeraActivity.f11259e.mo25414c("Skipping TargetActivity. Reason: Tap & Go V2 disabled through gservices", new Object[0]);
            return null;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (BluetoothAdapter.getDefaultAdapter() == null) {
            SmartDeviceChimeraActivity.f11259e.mo25416d("Skipping TargetActivity. Reason: Bluetooth not available.", new Object[0]);
            return null;
        }
        int i3 = Build.VERSION.SDK_INT;
        if (((UserManager) context.getSystemService("user")).getSerialNumberForUser(Process.myUserHandle()) != 0) {
            SmartDeviceChimeraActivity.f11259e.mo25416d("Skipping TargetActivity. Reason: Not primary user.", new Object[0]);
            return null;
        } else if (ascq.m73789a(context)) {
            SmartDeviceChimeraActivity.f11259e.mo25416d("Skipping TargetActivity. Reason: Cannot copy restricted profile", new Object[0]);
            return null;
        } else {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.auth.setup.d2d.SmartDeviceActivity");
            ims ims = new ims();
            ims.mo13148b(jtw.f23204a, str2);
            ims.mo13148b(jtw.f23205b, Boolean.valueOf(z2));
            imr imr = SmartDeviceChimeraActivity.f11260f;
            if (!z3) {
                str = "auth";
            } else {
                str = "suw";
            }
            ims.mo13148b(imr, str);
            ims.mo13148b(SmartDeviceChimeraActivity.f11261g, sef.m35074a(d2dOptions2));
            return className.putExtras(ims.f21367a);
        }
    }

    /* renamed from: e */
    private final jxw m6934e() {
        Intent d = m6932d();
        if (d != null) {
            return m6931c(20, d);
        }
        return m6935f();
    }

    /* renamed from: f */
    private final jxw m6935f() {
        String str;
        if (cbyn.m128917b()) {
            Context context = this.f11339j;
            String str2 = this.f11343n;
            rrq rrq = this.f11347r;
            rrl rrl = this.f11336O;
            if (rrl != null) {
                int i = rrl.f43550a;
                if (i == 1) {
                    str = (String) gnv.f18754y.mo58455c();
                } else if (i == 2) {
                    str = (String) gnv.f18755z.mo58455c();
                }
            }
            str = jvj.m17398a(context, false, str2, rrq, true);
        } else {
            str = jvj.m17398a(this.f11339j, false, this.f11343n, this.f11347r, true);
        }
        return m6931c(30, MinuteMaidChimeraActivity.m7073a(this.f11339j, this.f11343n, this.f11345p, this.f11348s, this.f11346q, this.f11347r, this.f11353x, this.f11350u, this.f11351v, this.f11352w, this.f11344o, this.f11355z, this.f11327F, this.f11322A, m6940k(), true, str));
    }

    /* renamed from: g */
    private final jxw m6936g() {
        Intent a;
        if (!jwn.m17427a(this.f11333L, this.f11349t, this.f11345p) || (a = jwn.m17425a(this.f11339j, this.f11329H, this.f11330I, this.f11345p, this.f11346q, this.f11324C, this.f11347r)) == null) {
            return m6937h();
        }
        return m6931c(41, WrapperControlledChimeraActivity.m7009a(this.f11339j, this.f11346q, this.f11347r, a));
    }

    /* renamed from: h */
    private final jxw m6937h() {
        Intent a;
        if (!jvk.m17400a(this.f11345p, this.f11332K, this.f11335N) || (a = jvk.m17399a(this.f11339j, this.f11329H, this.f11330I, this.f11345p, this.f11346q, this.f11347r)) == null) {
            return m6938i();
        }
        return m6931c(42, WrapperControlledChimeraActivity.m7009a(this.f11339j, this.f11346q, this.f11347r, a));
    }

    /* renamed from: i */
    private final jxw m6938i() {
        Bundle bundle;
        ManagedAuthOptions managedAuthOptions;
        if (rrk.m34296a(this.f11332K)) {
            f11315c.mo25414c("afterAppPicker with dmRequired", new Object[0]);
            Context context = this.f11339j;
            Account account = this.f11329H;
            boolean z = this.f11345p;
            boolean z2 = this.f11346q;
            rrq rrq = this.f11347r;
            Bundle a = rrq != null ? rrq.mo25045a() : Bundle.EMPTY;
            boolean z3 = this.f11323B;
            String str = this.f11344o;
            boolean z4 = this.f11354y;
            String str2 = this.f11332K;
            boolean z5 = this.f11335N;
            if (ccac.m129010b() && (managedAuthOptions = this.f11325D) != null) {
                bundle = managedAuthOptions.mo7693a();
            } else {
                bundle = Bundle.EMPTY;
            }
            Intent a2 = rrk.m34291a(context, account, z, z2, a, z3, str, z4, str2, z5, 0, bundle);
            if (a2 != null) {
                return jxw.m17485a(60, WrapperControlledChimeraActivity.m7009a(this.f11339j, this.f11346q, this.f11347r, a2), 0, 0);
            }
        }
        return m6919a(4);
    }

    /* renamed from: j */
    private final jxw m6939j() {
        if (this.f11331J == null || !m6940k()) {
            return m6941l();
        }
        return m6927b(50, WrapperControlledChimeraActivity.m7009a(this.f11339j, this.f11346q, this.f11347r, this.f11331J));
    }

    /* renamed from: k */
    private final boolean m6940k() {
        return this.f11345p || f11320h.contains(this.f11344o);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.Intent.putExtra(java.lang.String, int):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, int[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Bundle):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.io.Serializable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent} */
    /* renamed from: l */
    private final jxw m6941l() {
        if (!this.f11345p) {
            return m6942m();
        }
        jvl jvl = this.f11341l;
        int i = Build.VERSION.SDK_INT;
        Intent intent = new Intent("android.intent.action.CARRIER_SETUP");
        boolean z = true;
        intent.putExtra("device_setup", true);
        List carrierPackageNamesForIntent = jvl.f23367b.getCarrierPackageNamesForIntent(intent);
        if (carrierPackageNamesForIntent == null || carrierPackageNamesForIntent.isEmpty()) {
            intent = null;
        } else {
            if (carrierPackageNamesForIntent.size() != 1) {
                jvl.f23366a.mo25416d("Multiple matching carrier apps found, launching the first.", new Object[0]);
            }
            intent.setPackage((String) carrierPackageNamesForIntent.get(0));
            intent.putExtra("disable_back", true);
            if (jvl.f23368c.mo33916a("com.google").length <= 0) {
                z = false;
            }
            intent.putExtra("has_account", z);
        }
        if (intent != null) {
            return jxw.m17484a(90, WrapperControlledChimeraActivity.m7009a(this.f11339j, this.f11346q, this.f11347r, intent));
        }
        return m6942m();
    }

    /* renamed from: m */
    private final jxw m6942m() {
        Intent intent;
        Intent intent2 = this.f11328G;
        int i = -1;
        if (intent2 != null) {
            i = intent2.getIntExtra("tap_and_go_result_code", -1);
            this.f11328G.removeExtra("tap_and_go_result_code");
            intent = this.f11328G;
        } else {
            intent = null;
        }
        if (!m6946q()) {
            Bundle bundle = new Bundle();
            bundle.putString("authAccount", this.f11329H.name);
            bundle.putString("accountType", this.f11329H.type);
            bundle.putBoolean(MinuteMaidChimeraActivity.f11550f.f21366a, this.f11330I);
            String str = this.f11337P;
            if (str != null) {
                bundle.putString("accountStatusToken", str);
            }
            intent = new Intent().putExtras(bundle);
        }
        AccountAuthenticatorResponse accountAuthenticatorResponse = this.f11342m;
        if (accountAuthenticatorResponse != null) {
            accountAuthenticatorResponse.onResult(intent.getExtras());
        }
        return m6933d(i, intent);
    }

    /* renamed from: n */
    private final jxw m6943n() {
        int i;
        Intent intent;
        AccountAuthenticatorResponse accountAuthenticatorResponse = this.f11342m;
        if (accountAuthenticatorResponse != null) {
            accountAuthenticatorResponse.onError(4, "skipped or error");
        }
        if (this.f11327F) {
            intent = new Intent().putExtras(m6945p().f21367a);
            i = 0;
        } else {
            Intent intent2 = this.f11328G;
            if (intent2 != null) {
                i = intent2.getIntExtra("tap_and_go_result_code", -1);
                this.f11328G.removeExtra("tap_and_go_result_code");
                intent = this.f11328G;
            } else {
                i = 1;
                intent = null;
            }
        }
        return m6933d(i, intent);
    }

    /* renamed from: o */
    private final jxw m6944o() {
        return m6922a((Bundle) null);
    }

    /* renamed from: p */
    private final ims m6945p() {
        ims ims = new ims();
        if (gnv.m13566k()) {
            this.f11338b = true;
        }
        ims.mo13148b(f11314a, Boolean.valueOf(this.f11338b));
        return ims;
    }

    /* renamed from: q */
    private final boolean m6946q() {
        Intent intent = this.f11328G;
        if (intent != null) {
            return (intent.getStringExtra("authAccount") == null || this.f11328G.getStringExtra("accountType") == null) ? false : true;
        }
    }

    /* renamed from: b */
    public final String mo7863b() {
        return "AddAccountController";
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Bundle bundle;
        byte[] bArr;
        byte[] bArr2;
        parcel.writeParcelable(this.f11342m, 0);
        parcel.writeString(this.f11343n);
        parcel.writeByte(this.f11345p ? (byte) 1 : 0);
        parcel.writeByte(this.f11346q ? (byte) 1 : 0);
        rrq rrq = this.f11347r;
        Bundle bundle2 = null;
        if (rrq != null) {
            bundle = rrq.mo25045a();
        } else {
            bundle = null;
        }
        parcel.writeParcelable(bundle, 0);
        parcel.writeByte(this.f11348s ? (byte) 1 : 0);
        parcel.writeString(this.f11350u);
        parcel.writeString(this.f11351v);
        parcel.writeString(this.f11352w);
        parcel.writeStringArray(this.f11353x);
        parcel.writeString(this.f11344o);
        parcel.writeString(this.f11355z);
        parcel.writeByte(this.f11327F ? (byte) 1 : 0);
        parcel.writeParcelable(this.f11328G, 0);
        parcel.writeParcelable(this.f11329H, 0);
        parcel.writeByte(this.f11330I ? (byte) 1 : 0);
        parcel.writeParcelable(this.f11331J, 0);
        parcel.writeString(this.f11332K);
        parcel.writeByte(this.f11333L ? (byte) 1 : 0);
        parcel.writeByte(this.f11334M ? (byte) 1 : 0);
        parcel.writeByte(this.f11335N ? (byte) 1 : 0);
        parcel.writeString(this.f11337P);
        parcel.writeByte(this.f11338b ? (byte) 1 : 0);
        parcel.writeByte(this.f11322A ? (byte) 1 : 0);
        parcel.writeByte(this.f11349t ? (byte) 1 : 0);
        parcel.writeByte(this.f11323B ? (byte) 1 : 0);
        parcel.writeByte(this.f11324C ? (byte) 1 : 0);
        ManagedAuthOptions managedAuthOptions = this.f11325D;
        if (managedAuthOptions != null) {
            bArr = sef.m35074a(managedAuthOptions);
        } else {
            bArr = null;
        }
        parcel.writeByteArray(bArr);
        D2dOptions d2dOptions = this.f11326E;
        if (d2dOptions != null) {
            bArr2 = sef.m35074a(d2dOptions);
        } else {
            bArr2 = null;
        }
        parcel.writeByteArray(bArr2);
        rrl rrl = this.f11336O;
        if (rrl != null) {
            bundle2 = new Bundle();
            bundle2.putInt("desired_flow", rrl.f43550a);
        }
        parcel.writeParcelable(bundle2, 0);
    }

    /* renamed from: c */
    private final jxw m6930c() {
        Intent a = jwn.m17426a(this.f11339j, this.f11346q, this.f11345p, this.f11347r);
        if (a != null) {
            return jxw.m17484a(10, WrapperControlledChimeraActivity.m7009a(this.f11339j, this.f11346q, this.f11347r, a));
        }
        return jxw.m17484a(39, m6929c(C0126R.string.auth_error_generic_server_error));
    }

    /* renamed from: b */
    private static jxw m6927b(int i, Intent intent) {
        return jxw.m17485a(i, intent, f11316d, f11317e);
    }

    /* renamed from: b */
    public static boolean m6928b(boolean z) {
        return z && gnv.m13492B();
    }

    /* renamed from: c */
    private static jxw m6931c(int i, Intent intent) {
        return jxw.m17485a(i, intent, 17432576, 17432577);
    }

    /* renamed from: a */
    private final Intent m6917a(String str) {
        return m6916a((int) C0126R.string.common_login_error_title, str);
    }

    /* renamed from: a */
    public static jva m6918a() {
        return new jva();
    }

    /* renamed from: a */
    private final jxw m6919a(int i) {
        if (this.f11334M) {
            return m6926b(i);
        }
        return m6939j();
    }

    /* renamed from: a */
    private static jxw m6920a(int i, Intent intent) {
        return jxw.m17485a(i, intent, f11318f, f11319g);
    }

    /* renamed from: a */
    private static jxw m6921a(Intent intent) {
        return jxw.m17487b(0, intent, f11318f, f11319g);
    }

    /* renamed from: a */
    private final jxw m6922a(Bundle bundle) {
        AccountAuthenticatorResponse accountAuthenticatorResponse = this.f11342m;
        if (accountAuthenticatorResponse != null) {
            accountAuthenticatorResponse.onError(4, "canceled");
        }
        Intent putExtras = new Intent().putExtras(m6945p().f21367a);
        if (bundle != null) {
            putExtras.putExtras(bundle);
        }
        return m6921a(putExtras);
    }

    /* renamed from: d */
    private static jxw m6933d(int i, Intent intent) {
        return jxw.m17487b(i, intent, f11316d, f11317e);
    }

    /* renamed from: a */
    private final jxw m6923a(AccountDetail accountDetail) {
        this.f11329H = new Account(accountDetail.f11290a, accountDetail.f11291b);
        this.f11330I = accountDetail.f11292c;
        this.f11335N = accountDetail.f11294e;
        f11315c.mo25409a("Main account from minute maid:%s", sek.m35081a(this.f11329H));
        this.f11337P = accountDetail.f11296g;
        Intent intent = accountDetail.f11295f;
        this.f11331J = intent;
        if (intent != null) {
            intent.putExtra("theme", this.f11347r.f43552a);
            this.f11331J.putExtra("useImmersiveMode", this.f11346q);
        }
        this.f11332K = accountDetail.f11293d;
        this.f11335N = accountDetail.f11294e;
        if (rrk.m34296a(this.f11332K)) {
            this.f11334M = m6928b(this.f11335N);
            this.f11333L = m6925a(this.f11335N);
            m6924a(this.f11339j, this.f11329H);
        }
        return m6936g();
    }

    /* renamed from: a */
    public static void m6924a(Context context, Account account) {
        context.startService(UpdateHideDmNotificationsIntentOperation.m6279a(context, account));
    }

    /* renamed from: a */
    public static boolean m6925a(boolean z) {
        return z && gnv.m13491A();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x04f6, code lost:
        if (r2 != 103) goto L_0x0563;
     */
    /* renamed from: a */
    public final jxw mo7862a(jxy jxy) {
        Bundle bundle;
        Bundle bundle2;
        ManagedAuthOptions managedAuthOptions;
        Intent b;
        boolean z;
        int length;
        Intent a;
        jxy jxy2 = jxy;
        if (jxy2 != null) {
            f11315c.mo25412b(String.format("Result with id=%d and resultCode=%d", Integer.valueOf(jxy2.f23499a), Integer.valueOf(jxy2.f23500b)), new Object[0]);
            Intent intent = jxy2.f23501c;
            if (intent == null) {
                bundle = new Bundle();
            } else {
                bundle = intent.getExtras();
            }
            ims ims = new ims(bundle);
            int i = jxy2.f23499a;
            if (i == 1) {
                int i2 = jxy2.f23500b;
                if (i2 == -1) {
                    return m6930c();
                }
                if (i2 == 0) {
                    this.f11338b = ((Boolean) ims.mo13147a(f11314a, false)).booleanValue();
                    return m6944o();
                } else if (i2 == 1) {
                    return m6931c(39, m6929c(C0126R.string.auth_error_generic_server_error));
                }
            } else if (i == 20) {
                int i3 = jxy2.f23500b;
                if (i3 != -1) {
                    if (i3 == 0) {
                        this.f11338b = ((Boolean) ims.mo13147a(f11314a, false)).booleanValue();
                        return m6944o();
                    } else if (i3 == 1) {
                        return m6935f();
                    } else {
                        if (i3 != 102) {
                        }
                    }
                }
                Intent intent2 = jxy2.f23501c;
                this.f11328G = intent2;
                intent2.putExtra("tap_and_go_result_code", i3);
                if (!m6946q()) {
                    f11315c.mo25414c("Tap & Go finished without account transfer, launching MinuteMaid.", new Object[0]);
                    return m6935f();
                }
                this.f11329H = new Account(this.f11328G.getStringExtra("authAccount"), this.f11328G.getStringExtra("accountType"));
                return m6936g();
            } else if (i != 39) {
                if (i != 50) {
                    if (i != 60) {
                        if (i == 62) {
                            return m6939j();
                        }
                        if (i == 70) {
                            int i4 = jxy2.f23500b;
                            if (i4 == -1) {
                                this.f11338b = false;
                                this.f11327F = true;
                                this.f11328G = null;
                                this.f11329H = null;
                                this.f11330I = false;
                                this.f11331J = null;
                                this.f11332K = null;
                                this.f11333L = false;
                                this.f11334M = false;
                                this.f11335N = false;
                                this.f11336O = null;
                                Context context = this.f11339j;
                                boolean z2 = this.f11346q;
                                boolean z3 = this.f11345p;
                                rrq rrq = this.f11347r;
                                Bundle a2 = rrq != null ? rrq.mo25045a() : Bundle.EMPTY;
                                if (ccac.m129010b() && (managedAuthOptions = this.f11325D) != null) {
                                    bundle2 = managedAuthOptions.mo7693a();
                                } else {
                                    bundle2 = Bundle.EMPTY;
                                }
                                Intent a3 = rrk.m34293a(context, z2, z3, a2, bundle2);
                                if (a3 != null) {
                                    return jxw.m17484a(1, WrapperControlledChimeraActivity.m7009a(this.f11339j, this.f11346q, this.f11347r, a3));
                                }
                                return m6930c();
                            } else if (i4 == 0) {
                                this.f11338b = true;
                                return m6943n();
                            }
                        } else if (i == 90) {
                            return m6942m();
                        } else {
                            if (i == 100) {
                                return m6936g();
                            }
                            if (i == 110) {
                                f11315c.mo25412b("Finish ZeroTouch error UI.", new Object[0]);
                                Intent intent3 = new Intent();
                                ims ims2 = new ims();
                                ims2.mo13148b(f11314a, true);
                                return m6921a(intent3.putExtras(ims2.f21367a));
                            } else if (i == 10) {
                                int i5 = jxy2.f23500b;
                                if (i5 == -1) {
                                    boolean booleanValue = ((Boolean) ims.mo13147a(PreAddAccountChimeraActivity.f11421b, false)).booleanValue();
                                    this.f11327F = booleanValue;
                                    if (!booleanValue && this.f11322A && ccax.f178705a.mo6606a().mo75735a()) {
                                        return m6943n();
                                    }
                                    if (!cbyn.f178560a.mo6606a().mo75613b() || this.f11327F || (b = jwn.m17428b(this.f11339j, this.f11346q, this.f11345p, this.f11347r)) == null) {
                                        return m6934e();
                                    }
                                    f11315c.mo25414c("Launching post pre add account hook activity.", new Object[0]);
                                    return jxw.m17484a(11, WrapperControlledChimeraActivity.m7009a(this.f11339j, this.f11346q, this.f11347r, b));
                                } else if (i5 != 0) {
                                    if (i5 != 2) {
                                        if (i5 != 3) {
                                            if (i5 == 31) {
                                                Account account = (Account) ims.mo13146a(AddAccountChimeraActivity.f11299a);
                                                this.f11329H = account;
                                                if (account != null) {
                                                    return m6942m();
                                                }
                                            } else if (i5 == 111) {
                                                return m6933d(111, null);
                                            }
                                        } else if (jxy2.f23501c == null) {
                                            f11315c.mo25414c("ZeroTouch flow failed. Showing error UI.", new Object[0]);
                                            return m6927b(110, m6916a((int) C0126R.string.auth_zt_error_title, this.f11339j.getString(C0126R.string.auth_zt_error_generic)));
                                        } else {
                                            f11315c.mo25414c("Launching ZeroTouch managed provisioning.", new Object[0]);
                                            return m6927b(3, jxy2.f23501c);
                                        }
                                    }
                                    return m6931c(39, m6929c(C0126R.string.auth_error_generic_server_error));
                                } else {
                                    this.f11338b = ((Boolean) ims.mo13147a(f11314a, false)).booleanValue();
                                    return m6944o();
                                }
                            } else if (i == 11) {
                                int i6 = jxy2.f23500b;
                                if (i6 != -1) {
                                    if (i6 == 0) {
                                        this.f11338b = ((Boolean) ims.mo13147a(f11314a, false)).booleanValue();
                                        return m6944o();
                                    } else if (i6 == 32) {
                                        if (cbyn.m128917b()) {
                                            this.f11336O = rrl.m34298a((Integer) ims.mo13146a(jwn.f23414a));
                                        }
                                    }
                                }
                                return m6934e();
                            } else if (i == 30) {
                                int i7 = jxy2.f23500b;
                                if (i7 == -1) {
                                    String str = (String) ims.mo13146a(MinuteMaidChimeraActivity.f11546b);
                                    String str2 = (String) ims.mo13146a(MinuteMaidChimeraActivity.f11547c);
                                    String str3 = (String) ims.mo13146a(MinuteMaidChimeraActivity.f11548d);
                                    boolean booleanValue2 = ((Boolean) ims.mo13147a(MinuteMaidChimeraActivity.f11551g, false)).booleanValue();
                                    this.f11330I = ((Boolean) ims.mo13147a(MinuteMaidChimeraActivity.f11550f, false)).booleanValue();
                                    D2dOptions d2dOptions = this.f11326E;
                                    if (d2dOptions == null || !d2dOptions.f10855a) {
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                    return m6931c(31, AddAccountChimeraActivity.m6909a(this.f11339j, this.f11343n, this.f11345p, str, str2, str3, booleanValue2, m6940k(), this.f11346q, this.f11322A, this.f11347r, z));
                                } else if (i7 == 0) {
                                    Intent d = m6932d();
                                    if (d != null) {
                                        return m6920a(20, d);
                                    }
                                    this.f11338b = true;
                                    return m6944o();
                                } else if (i7 == 1) {
                                    return m6943n();
                                } else {
                                    if (i7 == 2) {
                                        String str4 = (String) ims.mo13146a(MinuteMaidChimeraActivity.f11552h);
                                        if (str4 == null) {
                                            str4 = this.f11339j.getString(C0126R.string.auth_error_generic_server_error);
                                        }
                                        return m6927b(39, m6917a(str4));
                                    } else if (i7 == 3) {
                                        AccountDetail[] accountDetailArr = (AccountDetail[]) ims.mo13146a(MinuteMaidChimeraActivity.f11553p);
                                        if (accountDetailArr == null || (length = accountDetailArr.length) == 0) {
                                            f11315c.mo25420f("Accounts returned are null are 0 from multi add account", new Object[0]);
                                            return m6944o();
                                        } else if (length == 1) {
                                            return m6923a(accountDetailArr[0]);
                                        } else {
                                            AccountDetail accountDetail = accountDetailArr[0];
                                            int i8 = length - 1;
                                            while (true) {
                                                if (i8 <= 0) {
                                                    break;
                                                }
                                                AccountDetail accountDetail2 = accountDetailArr[i8];
                                                if (accountDetail2.f11293d != null) {
                                                    accountDetail = accountDetail2;
                                                    break;
                                                }
                                                i8--;
                                            }
                                            return m6923a(accountDetail);
                                        }
                                    }
                                }
                            } else if (i != 31) {
                                if (i != 41) {
                                    if (i == 42) {
                                        int i9 = jxy2.f23500b;
                                        if (i9 == -1) {
                                            return m6938i();
                                        }
                                        if (i9 == 0) {
                                            if (!jwn.m17427a(this.f11333L, this.f11349t, this.f11345p) || (a = jwn.m17425a(this.f11339j, this.f11329H, this.f11330I, this.f11345p, this.f11346q, this.f11324C, this.f11347r)) == null) {
                                                return m6920a(100, AccountAddedChimeraActivity.m6903a(this.f11339j, this.f11346q, this.f11347r));
                                            }
                                            return m6920a(41, WrapperControlledChimeraActivity.m7009a(this.f11339j, this.f11346q, this.f11347r, a));
                                        }
                                    }
                                }
                                int i10 = jxy2.f23500b;
                                if (i10 == -1) {
                                    return m6937h();
                                }
                                if (i10 == 0) {
                                    this.f11338b = ((Boolean) ims.mo13147a(f11314a, false)).booleanValue();
                                    return m6920a(100, AccountAddedChimeraActivity.m6903a(this.f11339j, this.f11346q, this.f11347r));
                                }
                            } else {
                                int i11 = jxy2.f23500b;
                                if (i11 != -1) {
                                    if (i11 == 0) {
                                        this.f11338b = true;
                                        return m6944o();
                                    } else if (i11 == 2) {
                                        return m6927b(39, m6929c(C0126R.string.auth_error_generic_server_error));
                                    } else {
                                        if (i11 == 3) {
                                            return m6935f();
                                        }
                                        if (i11 == 4) {
                                            this.f11327F = false;
                                            if (this.f11322A) {
                                                return m6943n();
                                            }
                                            return m6934e();
                                        } else if (i11 == 5) {
                                            this.f11327F = false;
                                            Intent d2 = m6932d();
                                            if (d2 != null) {
                                                return m6931c(20, d2);
                                            }
                                        }
                                    }
                                }
                                this.f11329H = (Account) ims.mo13146a(AddAccountChimeraActivity.f11299a);
                                this.f11337P = (String) ims.mo13146a(f11321i);
                                Intent intent4 = (Intent) ims.mo13146a(AddAccountChimeraActivity.f11300b);
                                this.f11331J = intent4;
                                if (intent4 != null) {
                                    intent4.putExtra("theme", this.f11347r.f43552a);
                                    this.f11331J.putExtra("useImmersiveMode", this.f11346q);
                                }
                                this.f11332K = (String) ims.mo13146a(AddAccountChimeraActivity.f11301c);
                                this.f11335N = ((Boolean) ims.mo13146a(AddAccountChimeraActivity.f11302d)).booleanValue();
                                if (rrk.m34296a(this.f11332K)) {
                                    this.f11334M = m6928b(this.f11335N);
                                    this.f11333L = m6925a(this.f11335N);
                                    m6924a(this.f11339j, this.f11329H);
                                }
                                return m6936g();
                            }
                        }
                    }
                    switch (jxy2.f23500b) {
                        case -1:
                            if (rrk.m34294a(this.f11339j)) {
                                return m6942m();
                            }
                            return m6939j();
                        case 0:
                            boolean booleanValue3 = ((Boolean) ims.mo13147a(f11314a, false)).booleanValue();
                            this.f11338b = booleanValue3;
                            if (!booleanValue3) {
                                return m6944o();
                            }
                            break;
                        case 2:
                            return m6919a(1);
                        case 3:
                        case 6:
                            return m6919a(2);
                        case 5:
                            return m6927b(62, RemoveAccountChimeraActivity.m6997a(this.f11339j, this.f11329H, 5, this.f11346q, this.f11347r));
                        case 8:
                            return m6919a(4);
                        case 9:
                            return m6927b(62, RemoveAccountChimeraActivity.m6997a(this.f11339j, this.f11329H, 6, this.f11346q, this.f11347r));
                        case 10:
                            return m6926b(2);
                    }
                    return m6919a(3);
                }
                return m6941l();
            } else {
                int i12 = jxy2.f23500b;
                if (i12 == -1) {
                    return m6943n();
                }
                if (i12 == 0) {
                    this.f11338b = true;
                    return m6922a(ims.f21367a);
                }
            }
            throw new IllegalStateException(String.format("Result not handled with id %d and resultCode %d.", Integer.valueOf(i), Integer.valueOf(jxy2.f23500b)));
        } else if (!this.f11340k.mo13150a()) {
            return jxw.m17484a(39, m6929c(C0126R.string.auth_error_no_network));
        } else {
            Context context2 = this.f11339j;
            boolean z4 = this.f11346q;
            boolean z5 = this.f11345p;
            rrq rrq2 = this.f11347r;
            Intent a4 = rrk.m34293a(context2, z4, z5, rrq2 != null ? rrq2.mo25045a() : Bundle.EMPTY, Bundle.EMPTY);
            if (a4 != null) {
                return jxw.m17484a(1, WrapperControlledChimeraActivity.m7009a(this.f11339j, this.f11346q, this.f11347r, a4));
            }
            return m6930c();
        }
    }
}
