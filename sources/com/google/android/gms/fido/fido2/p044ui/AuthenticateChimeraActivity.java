package com.google.android.gms.fido.fido2.p044ui;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.fido2.api.common.ErrorCode;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.fido2.api.common.RequestOptions;
import com.google.android.gms.fido.u2f.api.StateUpdate;
import com.google.android.gms.fido.u2f.api.view.ViewOptions;
import java.util.List;
import java.util.UUID;

/* renamed from: com.google.android.gms.fido.fido2.ui.AuthenticateChimeraActivity */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AuthenticateChimeraActivity extends xic {

    /* renamed from: d */
    public static final sek f31855d = new sek(new String[]{"AuthenticateChimeraActivity"}, (short[]) null);

    /* renamed from: e */
    private xwj f31856e;

    /* renamed from: f */
    private String f31857f;

    /* renamed from: g */
    private xdx f31858g;

    /* renamed from: h */
    private xwn f31859h;

    /* renamed from: i */
    private xob f31860i;

    /* renamed from: j */
    private UUID f31861j;

    /* renamed from: a */
    public static Intent m23558a(Context context, xwi xwi, RequestOptions requestOptions) {
        sdo.m34959a(context);
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.fido.fido2.ui.Fido2FullScreenActivity");
        intent.putExtra("UUIDExtra", UUID.randomUUID().toString());
        if (requestOptions != null) {
            intent.putExtra("RequestOptionsExtra", requestOptions.mo18689g());
            if (requestOptions instanceof PublicKeyCredentialCreationOptions) {
                intent.putExtra("RequestTypeExtra", xqj.REGISTER.f52926c);
                intent.putExtra("CallerTypeExtra", xvd.m43482a(2));
            } else if (requestOptions instanceof PublicKeyCredentialRequestOptions) {
                intent.putExtra("RequestTypeExtra", xqj.SIGN.f52926c);
                intent.putExtra("CallerTypeExtra", xvd.m43482a(2));
            } else if (requestOptions instanceof BrowserPublicKeyCredentialCreationOptions) {
                intent.putExtra("RequestTypeExtra", xqj.REGISTER.f52926c);
                intent.putExtra("CallerTypeExtra", xvd.m43482a(1));
            } else if (requestOptions instanceof BrowserPublicKeyCredentialRequestOptions) {
                intent.putExtra("RequestTypeExtra", xqj.SIGN.f52926c);
                intent.putExtra("CallerTypeExtra", xvd.m43482a(1));
            }
        }
        intent.putExtra("SessionContextSourceExtra", xwi);
        return intent;
    }

    /* renamed from: b */
    public final void mo18789b() {
        xob xob = this.f31860i;
        if (xob != null) {
            xhp xhp = xob.f52300a;
            if (xhp == null) {
                xob.f52828d.mo25418e("startEmbeddedSecurityKey should not be called for null securityKeyRequestController.", new Object[0]);
            } else {
                xhp.mo29759c();
            }
        } else {
            f31855d.mo25418e("No FIDO API ongoing to startEmbeddedSecurityKey", new Object[0]);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ea  */
    public final void onCreate(Bundle bundle) {
        RequestOptions requestOptions;
        Integer num;
        Resources resources;
        xob xob;
        List list;
        super.onCreate(bundle);
        Intent intent = getIntent();
        PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions = null;
        if (intent.hasExtra("RequestOptionsExtra") && intent.hasExtra("RequestTypeExtra")) {
            String stringExtra = intent.getStringExtra("RequestTypeExtra");
            String stringExtra2 = intent.getStringExtra("CallerTypeExtra");
            if (stringExtra.equals(xqj.REGISTER.f52926c)) {
                requestOptions = stringExtra2.equals(xvd.m43482a(2)) ? (PublicKeyCredentialCreationOptions) sef.m35069a(intent.getByteArrayExtra("RequestOptionsExtra"), PublicKeyCredentialCreationOptions.CREATOR) : stringExtra2.equals(xvd.m43482a(1)) ? (BrowserPublicKeyCredentialCreationOptions) sef.m35069a(intent.getByteArrayExtra("RequestOptionsExtra"), BrowserPublicKeyCredentialCreationOptions.CREATOR) : null;
            } else if (stringExtra.equals(xqj.SIGN.f52926c)) {
                if (stringExtra2.equals(xvd.m43482a(2))) {
                    requestOptions = (PublicKeyCredentialRequestOptions) sef.m35069a(intent.getByteArrayExtra("RequestOptionsExtra"), PublicKeyCredentialRequestOptions.CREATOR);
                } else if (stringExtra2.equals(xvd.m43482a(1))) {
                    requestOptions = (BrowserPublicKeyCredentialRequestOptions) sef.m35069a(intent.getByteArrayExtra("RequestOptionsExtra"), BrowserPublicKeyCredentialRequestOptions.CREATOR);
                }
            }
            xwi xwi = (xwi) intent.getSerializableExtra("SessionContextSourceExtra");
            if (requestOptions == null) {
                num = requestOptions.mo18684c();
            } else {
                num = null;
            }
            this.f31856e = xwj.m43508a(xwi, num);
            this.f31859h = xwm.m43526a(getApplicationContext());
            resources = getResources();
            Window window = getWindow();
            if (resources.getBoolean(C0126R.bool.is_tablet)) {
                window.addFlags(67108864);
            }
            int i = Build.VERSION.SDK_INT;
            if (getCallingActivity() != null) {
                f31855d.mo25418e("Calling activity is null. No FIDO2 operation is processed", new Object[0]);
                finish();
                return;
            }
            String packageName = getCallingActivity().getPackageName();
            this.f31857f = packageName;
            sek sek = f31855d;
            String valueOf = String.valueOf(packageName);
            sek.mo25414c(valueOf.length() == 0 ? new String("FIDO2 operation is called from ") : "FIDO2 operation is called from ".concat(valueOf), new Object[0]);
            this.f31861j = UUID.fromString(intent.getStringExtra("UUIDExtra"));
            if (requestOptions != null) {
                boolean z = requestOptions instanceof PublicKeyCredentialRequestOptions;
                if (z) {
                    publicKeyCredentialRequestOptions = (PublicKeyCredentialRequestOptions) requestOptions;
                } else if (requestOptions instanceof BrowserPublicKeyCredentialRequestOptions) {
                    publicKeyCredentialRequestOptions = ((BrowserPublicKeyCredentialRequestOptions) requestOptions).f31734a;
                }
                if (publicKeyCredentialRequestOptions != null && ((list = publicKeyCredentialRequestOptions.f31784d) == null || list.isEmpty())) {
                    f31855d.mo25418e("Request doesn't have a valid list of allowed credentials.", new Object[0]);
                    xpw xpw = new xpw();
                    xpf xpf = new xpf();
                    xpf.mo30001a(ErrorCode.NOT_ALLOWED_ERR);
                    xpf.f52860a = "Request doesn't have a valid list of allowed credentials.";
                    xpw.f52903a = xpf.mo30000a();
                    mo18787a(xpw.mo30021a());
                    return;
                }
                xdx xdx = new xdx();
                this.f31858g = xdx;
                if (xqy.m43291a(this.f31856e, requestOptions, xdx, this.f31859h).equals(xqx.PLATFORM_ATTACHED)) {
                    getWindow().setBackgroundDrawable(new ColorDrawable(0));
                    getWindow().setStatusBarColor(0);
                    xdr.m42733b(this, requestOptions);
                    setTheme(C0126R.style.fido2AuthenticateChimeraActivityStyleNoDimBackground);
                } else {
                    setTheme(C0126R.style.fidoTheme);
                    setContentView((int) C0126R.C0128layout.u2f_authenticate_activity);
                }
                this.f52327b = new ycc(this, m23559a(this.f31856e, requestOptions, getCallingPackage()), true);
                xdr xdr = new xdr(this, getSupportFragmentManager(), requestOptions, m23559a(this.f31856e, requestOptions, this.f31857f));
                xwj xwj = this.f31856e;
                xdx xdx2 = this.f31858g;
                xwn xwn = this.f31859h;
                String str = this.f31857f;
                xvc xvc = new xvc(this);
                if (z || (requestOptions instanceof BrowserPublicKeyCredentialRequestOptions)) {
                    xob = xob.m43234a(this.f31861j, this, xwj, requestOptions, xdr, xdx2, xvc, xwn, str);
                } else {
                    xob = xob.m43236b(this.f31861j, this, xwj, requestOptions, xdr, xdx2, xvc, xwn, str);
                }
                this.f31860i = xob;
                xob.mo29964b();
                return;
            }
            f31855d.mo25418e("The request options are not valid", new Object[0]);
            xpw xpw2 = new xpw();
            xpf xpf2 = new xpf();
            xpf2.mo30001a(ErrorCode.DATA_ERR);
            xpf2.f52860a = "The request options are not valid";
            xpw2.f52903a = xpf2.mo30000a();
            PublicKeyCredential a = xpw2.mo30021a();
            this.f31859h.mo30184a((xwj) null, new IllegalArgumentException("The request options are not valid"));
            mo18787a(a);
            return;
        }
        requestOptions = null;
        xwi xwi2 = (xwi) intent.getSerializableExtra("SessionContextSourceExtra");
        if (requestOptions == null) {
        }
        this.f31856e = xwj.m43508a(xwi2, num);
        this.f31859h = xwm.m43526a(getApplicationContext());
        resources = getResources();
        Window window2 = getWindow();
        if (resources.getBoolean(C0126R.bool.is_tablet)) {
        }
        int i2 = Build.VERSION.SDK_INT;
        if (getCallingActivity() != null) {
        }
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        mo18788a(StateUpdate.f31873c);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo18790b(ViewOptions viewOptions) {
        if (viewOptions == null) {
            f31855d.mo25418e("No valid ViewOptions provided!", new Object[0]);
            return;
        }
        xob xob = this.f31860i;
        if (xob != null) {
            xob.mo29750a(new StateUpdate(StateUpdate.Type.UPDATE_CURRENT_VIEW, viewOptions.mo18664a()));
        } else {
            f31855d.mo25418e("No FIDO API helper to update the current view", new Object[0]);
        }
    }

    /* renamed from: a */
    private final String m23559a(xwj xwj, RequestOptions requestOptions, String str) {
        ApplicationInfo applicationInfo;
        if (requestOptions instanceof BrowserPublicKeyCredentialCreationOptions) {
            return ((BrowserPublicKeyCredentialCreationOptions) requestOptions).f31732a.f31764a.f31789a;
        }
        if (requestOptions instanceof BrowserPublicKeyCredentialRequestOptions) {
            return ((BrowserPublicKeyCredentialRequestOptions) requestOptions).f31734a.f31783c;
        }
        if (cdwl.f181840a.mo6606a().mo78395a() && "com.google.android.gms".equals(str)) {
            return getString(C0126R.string.common_google);
        }
        PackageManager packageManager = getApplicationContext().getPackageManager();
        try {
            applicationInfo = packageManager.getApplicationInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            f31855d.mo25418e("Application info cannot be retrieved", new Object[0]);
            this.f31859h.mo30184a(xwj, e);
            applicationInfo = null;
        }
        if (applicationInfo != null && packageManager.getApplicationLabel(applicationInfo) != null) {
            return packageManager.getApplicationLabel(applicationInfo).toString();
        }
        f31855d.mo25418e("Cannot retrieve application name and package name is used instead", new Object[0]);
        return str;
    }

    /* renamed from: a */
    public final void mo18787a(PublicKeyCredential publicKeyCredential) {
        Intent intent = new Intent();
        intent.putExtra("FIDO2_CREDENTIAL_EXTRA", sef.m35074a(publicKeyCredential));
        AuthenticatorResponse a = publicKeyCredential.mo18710a();
        if (a instanceof AuthenticatorErrorResponse) {
            intent.putExtra("FIDO2_ERROR_EXTRA", a.mo18665b());
        } else {
            intent.putExtra("FIDO2_RESPONSE_EXTRA", a.mo18665b());
        }
        setResult(-1, intent);
        finish();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo18788a(StateUpdate stateUpdate) {
        xob xob = this.f31860i;
        if (xob == null) {
            f31855d.mo25418e("No FIDO API to update", new Object[0]);
        } else {
            xob.mo29750a(stateUpdate);
        }
    }
}
