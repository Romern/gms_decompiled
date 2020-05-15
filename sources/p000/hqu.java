package p000;

import android.accounts.Account;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import java.io.IOException;

/* renamed from: hqu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hqu extends adcf {

    /* renamed from: a */
    public static final sek f20246a = ght.m13172b("AccountReauthFragment");

    /* renamed from: b */
    public String f20247b;

    /* renamed from: c */
    public int f20248c;

    /* renamed from: d */
    public Account f20249d;

    /* renamed from: e */
    public Context f20250e;

    /* renamed from: f */
    public ixl f20251f;

    /* renamed from: g */
    public hqv f20252g;

    /* renamed from: h */
    public String f20253h;

    /* renamed from: i */
    private final bqgj f20254i = sne.m35694a(1, 9);

    /* renamed from: j */
    private sty f20255j;

    /* renamed from: k */
    private bqgy f20256k;

    /* renamed from: l */
    private boolean f20257l;

    /* renamed from: m */
    private final bmzi f20258m = new hqq(this);

    /* renamed from: a */
    public static hqu m14753a(Account account, String str, String str2) {
        bmxy.m108581a(account);
        bmxy.m108581a(str);
        bmxy.m108581a(str2);
        Bundle bundle = new Bundle();
        bundle.putParcelable("account", account);
        bundle.putString("calling_package", str);
        bundle.putString("session_id", str2);
        hqu hqu = new hqu();
        hqu.setArguments(bundle);
        return hqu;
    }

    /* renamed from: c */
    private final bqgg m14754c() {
        bqgy c = bqgy.m112818c();
        this.f20256k = c;
        return adax.m50093a(c, bmxv.m108566b(1));
    }

    /* renamed from: b */
    public final void mo12681b() {
        bqgg bqgg;
        int i = this.f20248c;
        if (i == 1) {
            bqgg = this.f20254i.mo25819b(new hqr(this, bngx.m109356a(new Scope("profile"))));
        } else if (i == 2) {
            bqgg = m14754c();
            adyd.m51363a(this.f20250e).mo33911a(this.f20249d, this.f20253h, Bundle.EMPTY, (Activity) null, new hqs(this));
        } else if (i == 3) {
            bqgg = m14754c();
            bmxv a = aczv.m50062a(this.f20250e, this.f20249d, Bundle.EMPTY);
            if (!a.mo66813a()) {
                this.f20256k.mo69136a((Throwable) adbe.m50108a("Device management is not supported", 8));
            } else {
                startActivityForResult((Intent) a.mo66814b(), 102);
            }
        } else if (i == 4) {
            startActivityForResult(aczv.m50060a(this.f20250e, this.f20249d), ErrorInfo.TYPE_SDU_COMMUNICATIONERROR);
            bqgg = m14754c();
        } else {
            StringBuilder sb = new StringBuilder(41);
            sb.append("Invalid flowStep was reached: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        bqga.m112781a(bqgg, new hqt(this), this.f20255j);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        bmxv bmxv;
        Status status;
        switch (i) {
            case 101:
            case ErrorInfo.TYPE_SDU_COMMUNICATIONERROR:
                if (i2 == -1) {
                    this.f20256k.mo69138b((Object) null);
                    return;
                } else if (i2 != 0) {
                    this.f20256k.mo69136a((Throwable) adbe.m50106a(8));
                    return;
                } else {
                    this.f20256k.mo69136a((Throwable) adbe.m50106a(16));
                    return;
                }
            case 102:
                switch (i2) {
                    case 2:
                    case 7:
                    case 8:
                        status = new Status(8, "Unexpected server error");
                        bmxv = bmxv.m108566b(status);
                        break;
                    case 3:
                        status = new Status(7, "Network error");
                        bmxv = bmxv.m108566b(status);
                        break;
                    case 4:
                        status = new Status(8, "App installation failure");
                        bmxv = bmxv.m108566b(status);
                        break;
                    case 5:
                    case 9:
                        status = new Status(8, "Device management not supported");
                        bmxv = bmxv.m108566b(status);
                        break;
                    case 6:
                    case 10:
                        status = new Status(16, "User canceled");
                        bmxv = bmxv.m108566b(status);
                        break;
                    default:
                        bmxv = bmvz.f131120a;
                        break;
                }
                if (bmxv.mo66813a()) {
                    this.f20256k.mo69136a((Throwable) adbe.m50108a(((Status) bmxv.mo66814b()).f30116j, ((Status) bmxv.mo66814b()).f30115i));
                    return;
                } else {
                    this.f20256k.mo69138b((Object) null);
                    return;
                }
            default:
                return;
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
        Bundle arguments = getArguments();
        bmxy.m108581a(arguments);
        Account account = (Account) arguments.getParcelable("account");
        bmxy.m108581a(account);
        this.f20249d = account;
        String string = arguments.getString("calling_package");
        bmxy.m108581a(string);
        this.f20247b = string;
        bmxy.m108581a(arguments.getString("session_id"));
        this.f20255j = new sty(new adzt(Looper.getMainLooper()));
        this.f20250e = getContext().getApplicationContext();
        this.f20248c = 1;
        this.f20252g = (hqv) adcj.m50161a(getActivity()).mo3444a(hqv.class);
        this.f20255j = new sty(new adzt(Looper.getMainLooper()));
        this.f20251f = (ixl) this.f20258m.mo6606a();
    }

    /* renamed from: a */
    public final void mo12679a() {
        if (!this.f20257l) {
            this.f20257l = true;
            mo12681b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo12680a(AccountManagerFuture accountManagerFuture) {
        try {
            Intent intent = (Intent) ((Bundle) accountManagerFuture.getResult()).getParcelable("intent");
            if (intent == null) {
                this.f20256k.mo69136a((Throwable) adbe.m50106a(8));
            } else {
                startActivityForResult(intent, 101);
            }
        } catch (AuthenticatorException e) {
            this.f20256k.mo69136a((Throwable) adbe.m50108a("Authenticator error", 8));
        } catch (OperationCanceledException e2) {
            this.f20256k.mo69136a((Throwable) adbe.m50108a("Reauth canceled", 16));
        } catch (IOException e3) {
            this.f20256k.mo69136a((Throwable) adbe.m50108a("Network error", 8));
        }
    }
}
