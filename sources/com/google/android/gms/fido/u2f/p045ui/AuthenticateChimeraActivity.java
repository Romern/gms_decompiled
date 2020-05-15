package com.google.android.gms.fido.u2f.p045ui;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.fido.u2f.api.StateUpdate;
import com.google.android.gms.fido.u2f.api.common.BrowserRegisterRequestParams;
import com.google.android.gms.fido.u2f.api.common.BrowserRequestParams;
import com.google.android.gms.fido.u2f.api.common.BrowserSignRequestParams;
import com.google.android.gms.fido.u2f.api.common.ErrorCode;
import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import com.google.android.gms.fido.u2f.api.common.RegisterRequestParams;
import com.google.android.gms.fido.u2f.api.common.RequestParams;
import com.google.android.gms.fido.u2f.api.common.ResponseData;
import com.google.android.gms.fido.u2f.api.common.SignRequestParams;
import com.google.android.gms.fido.u2f.api.view.ViewOptions;

/* renamed from: com.google.android.gms.fido.u2f.ui.AuthenticateChimeraActivity */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AuthenticateChimeraActivity extends xic {

    /* renamed from: d */
    public static final sek f31972d = new sek(new String[]{"U2fAuthChimeraActivity"}, (short[]) null);

    /* renamed from: e */
    private xxa f31973e;

    /* renamed from: f */
    private xxq f31974f;

    /* renamed from: g */
    private String f31975g;

    /* renamed from: h */
    private RequestParams f31976h;

    /* renamed from: i */
    private xws f31977i;

    /* renamed from: j */
    private xwj f31978j;

    /* renamed from: a */
    public static Intent m23656a(Context context, xwi xwi, RequestParams requestParams) {
        sdo.m34959a(context);
        sdo.m34959a(requestParams);
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.fido.u2f.ui.AuthenticateActivity");
        intent.putExtra("RequestExtra", requestParams);
        intent.putExtra("SessionContextSourceExtra", xwi);
        return intent;
    }

    /* renamed from: b */
    public final void mo18789b() {
        throw new RuntimeException("Embedded Security Key option is not available for U2F request!");
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        Integer num;
        super.onCreate(bundle);
        xwi xwi = (xwi) getIntent().getSerializableExtra("SessionContextSourceExtra");
        RequestParams requestParams = this.f31976h;
        if (requestParams != null) {
            num = requestParams.mo18800a();
        } else {
            num = null;
        }
        this.f31978j = xwj.m43508a(xwi, num);
        this.f31977i = xwr.m43574a(getApplicationContext());
        if (getCallingActivity() == null) {
            f31972d.mo25418e("Calling activity is null. No FIDO2 operation is processed", new Object[0]);
            finish();
            return;
        }
        String packageName = getCallingActivity().getPackageName();
        this.f31975g = packageName;
        sek sek = f31972d;
        String valueOf = String.valueOf(packageName);
        sek.mo25414c(valueOf.length() == 0 ? new String("U2f operation is requested from ") : "U2f operation is requested from ".concat(valueOf), new Object[0]);
        int i = Build.VERSION.SDK_INT;
        setTheme(C0126R.style.fidoTheme);
        setContentView((int) C0126R.C0128layout.u2f_authenticate_activity);
        Resources resources = getResources();
        Window window = getWindow();
        if (resources.getBoolean(C0126R.bool.is_tablet)) {
            window.addFlags(67108864);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    public final void onResume() {
        ApplicationInfo applicationInfo;
        f31972d.mo25412b("onResume", new Object[0]);
        super.onResume();
        try {
            xxa xxa = this.f31973e;
            if (xxa == null) {
                xxq xxq = this.f31974f;
                if (xxq == null) {
                    f31972d.mo25418e("No FIDO API call to resume, and a new request is being processed.", new Object[0]);
                    RequestParams requestParams = (RequestParams) getIntent().getParcelableExtra("RequestExtra");
                    this.f31976h = requestParams;
                    String str = this.f31975g;
                    if (requestParams instanceof BrowserRequestParams) {
                        str = ((BrowserRequestParams) requestParams).mo18804e().getAuthority();
                    } else {
                        PackageManager packageManager = getApplicationContext().getPackageManager();
                        try {
                            applicationInfo = packageManager.getApplicationInfo(str, 0);
                        } catch (PackageManager.NameNotFoundException e) {
                            f31972d.mo25418e("Application info cannot be retrieved", new Object[0]);
                            applicationInfo = null;
                        }
                        if (applicationInfo == null || packageManager.getApplicationLabel(applicationInfo) == null) {
                            f31972d.mo25418e("Cannot retrieve application name and package name is used instead", new Object[0]);
                        } else {
                            str = packageManager.getApplicationLabel(applicationInfo).toString();
                        }
                    }
                    sdo.m34971a(!str.trim().isEmpty(), (Object) "App name or authority from request params cannot be empty after trimming.");
                    this.f52327b = new ycc(this, str, false);
                    ybu ybu = new ybu(this);
                    ybv ybv = new ybv(this);
                    Context applicationContext = getApplicationContext();
                    try {
                        if (!(this.f31976h instanceof BrowserRequestParams)) {
                            xxq xxq2 = new xxq(this.f31977i);
                            this.f31974f = xxq2;
                            RequestParams requestParams2 = this.f31976h;
                            if (requestParams2 instanceof RegisterRequestParams) {
                                xwj xwj = this.f31978j;
                                RegisterRequestParams registerRequestParams = (RegisterRequestParams) requestParams2;
                                new xbd(applicationContext);
                                String str2 = this.f31975g;
                                sek sek = xxq.f53341c;
                                String valueOf = String.valueOf(str2);
                                sek.mo25414c(valueOf.length() == 0 ? new String("headfulRegister is called by ") : "headfulRegister is called by ".concat(valueOf), new Object[0]);
                                xbc a = xbd.m42595a(str2);
                                if (a != null) {
                                    xxq2.f53343b = true;
                                    xxs xxs = xxq2.f53342a;
                                    xyy a2 = xxq2.mo30231a(applicationContext);
                                    xxs.f53345g.mo25414c("doRegister for apps is called", new Object[0]);
                                    xxs.f53346b = applicationContext;
                                    xxs.f53347c = ybv;
                                    xxs.f53348d = a2;
                                    xxs.f53349e = new xxg(registerRequestParams);
                                    xxs.f53350f.mo30201a(xwj, str2, registerRequestParams, a2.mo30279a());
                                    if (a2.mo30279a().isEmpty()) {
                                        xxs.f53345g.mo25418e("No enabled transport found on the platform", new Object[0]);
                                        xxs.mo30235a(xwj, ErrorCode.CONFIGURATION_UNSUPPORTED);
                                        return;
                                    }
                                    xxs.mo30237a(xwj, a);
                                    return;
                                }
                                throw new SecurityException("Calling app is unknown; facetId should not be null!");
                            } else if (requestParams2 instanceof SignRequestParams) {
                                xwj xwj2 = this.f31978j;
                                SignRequestParams signRequestParams = (SignRequestParams) requestParams2;
                                new xbd(applicationContext);
                                String str3 = this.f31975g;
                                sek sek2 = xxq.f53341c;
                                String valueOf2 = String.valueOf(str3);
                                sek2.mo25414c(valueOf2.length() == 0 ? new String("headfulSign is called by ") : "headfulSign is called by ".concat(valueOf2), new Object[0]);
                                xbc a3 = xbd.m42595a(str3);
                                if (a3 != null) {
                                    xxq2.f53343b = true;
                                    xxs xxs2 = xxq2.f53342a;
                                    xyy a4 = xxq2.mo30231a(applicationContext);
                                    xxs.f53345g.mo25414c("doSign for apps is called", new Object[0]);
                                    xxs2.f53346b = applicationContext;
                                    xxs2.f53347c = ybu;
                                    xxs2.f53348d = a4;
                                    xxs2.f53349e = new xxl(signRequestParams);
                                    xxs2.f53350f.mo30202a(xwj2, str3, signRequestParams, xxs2.f53348d.mo30279a());
                                    if (a4.mo30279a().isEmpty()) {
                                        xxs.f53345g.mo25418e("No enabled transport found on the platform", new Object[0]);
                                        xxs2.mo30235a(xwj2, ErrorCode.CONFIGURATION_UNSUPPORTED);
                                        return;
                                    }
                                    xxs2.mo30237a(xwj2, a3);
                                    return;
                                }
                                throw new SecurityException("Calling app is unknown; facetId should not be null!");
                            } else {
                                f31972d.mo25418e("Unsupported RequestParams type!", new Object[0]);
                            }
                        } else {
                            xxa xxa2 = new xxa(this.f31977i);
                            this.f31973e = xxa2;
                            RequestParams requestParams3 = this.f31976h;
                            if (requestParams3 instanceof BrowserRegisterRequestParams) {
                                xwj xwj3 = this.f31978j;
                                BrowserRegisterRequestParams browserRegisterRequestParams = (BrowserRegisterRequestParams) requestParams3;
                                xbd xbd = new xbd(applicationContext);
                                String str4 = this.f31975g;
                                sek sek3 = xxa.f53319c;
                                String valueOf3 = String.valueOf(str4);
                                sek3.mo25414c(valueOf3.length() == 0 ? new String("headfulRegister is called by ") : "headfulRegister is called by ".concat(valueOf3), new Object[0]);
                                xxa2.f53321b = true;
                                if (xbd.mo29604a(browserRegisterRequestParams.f31888b.toString(), str4) != null) {
                                    xxa2.f53320a.mo30233a(applicationContext, xwj3, browserRegisterRequestParams, ybv, xxa2.mo30208a(applicationContext), str4);
                                    return;
                                }
                                throw new SecurityException("Calling app is not a legitimate browser!");
                            } else if (requestParams3 instanceof BrowserSignRequestParams) {
                                xwj xwj4 = this.f31978j;
                                BrowserSignRequestParams browserSignRequestParams = (BrowserSignRequestParams) requestParams3;
                                xbd xbd2 = new xbd(applicationContext);
                                String str5 = this.f31975g;
                                sek sek4 = xxa.f53319c;
                                String valueOf4 = String.valueOf(str5);
                                sek4.mo25414c(valueOf4.length() == 0 ? new String("headfulSign is called by ") : "headfulSign is called by ".concat(valueOf4), new Object[0]);
                                xxa2.f53321b = true;
                                if (xbd2.mo29604a(browserSignRequestParams.f31890b.toString(), str5) != null) {
                                    xxa2.f53320a.mo30234a(applicationContext, xwj4, browserSignRequestParams, ybu, xxa2.mo30208a(applicationContext), str5);
                                    return;
                                }
                                throw new SecurityException("Calling app is not a legitimate browser!");
                            } else {
                                f31972d.mo25418e("Unsupported BrowserRequestParams type!", new Object[0]);
                            }
                        }
                    } catch (SecurityException e2) {
                        this.f31977i.mo30184a(this.f31978j, e2);
                        mo18877a(new ErrorResponseData(ErrorCode.BAD_REQUEST, "SecurityException"));
                    } catch (Exception e3) {
                        this.f31977i.mo30184a(this.f31978j, e3);
                        mo18877a(new ErrorResponseData(ErrorCode.OTHER_ERROR));
                    }
                } else {
                    xxq.mo30232a(StateUpdate.f31873c);
                }
            } else {
                xxa.mo30209a(StateUpdate.f31873c);
            }
        } catch (SecurityException e4) {
            this.f31977i.mo30184a(this.f31978j, e4);
            mo18877a(new ErrorResponseData(ErrorCode.BAD_REQUEST, "SecurityException"));
        } catch (Exception e5) {
            this.f31977i.mo30184a(this.f31978j, e5);
            mo18877a(new ErrorResponseData(ErrorCode.OTHER_ERROR));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo18790b(ViewOptions viewOptions) {
        if (viewOptions != null) {
            xxa xxa = this.f31973e;
            if (xxa != null) {
                xxa.mo30209a(new StateUpdate(StateUpdate.Type.UPDATE_CURRENT_VIEW, viewOptions.mo18664a()));
                return;
            }
            xxq xxq = this.f31974f;
            if (xxq != null) {
                xxq.mo30232a(new StateUpdate(StateUpdate.Type.UPDATE_CURRENT_VIEW, viewOptions.mo18664a()));
            } else {
                f31972d.mo25418e("No FIDO API helper to update the current view", new Object[0]);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo18788a(StateUpdate stateUpdate) {
        try {
            xxa xxa = this.f31973e;
            if (xxa == null) {
                xxq xxq = this.f31974f;
                if (xxq == null) {
                    f31972d.mo25418e("No FIDO API to update", new Object[0]);
                } else {
                    xxq.mo30232a(stateUpdate);
                }
            } else {
                xxa.mo30209a(stateUpdate);
            }
        } catch (SecurityException e) {
            this.f31977i.mo30184a(this.f31978j, e);
            mo18877a(new ErrorResponseData(ErrorCode.BAD_REQUEST, "SecurityException"));
        } catch (Exception e2) {
            this.f31977i.mo30184a(this.f31978j, e2);
            mo18877a(new ErrorResponseData(ErrorCode.OTHER_ERROR));
        }
    }

    /* renamed from: a */
    public final void mo18877a(ResponseData responseData) {
        sek sek = f31972d;
        String valueOf = String.valueOf(responseData.mo18664a());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
        sb.append("setActivityResult ");
        sb.append(valueOf);
        sek.mo25412b(sb.toString(), new Object[0]);
        Intent intent = new Intent();
        intent.putExtra("RESPONSE_EXTRA", responseData);
        setResult(-1, intent);
        finish();
    }
}
