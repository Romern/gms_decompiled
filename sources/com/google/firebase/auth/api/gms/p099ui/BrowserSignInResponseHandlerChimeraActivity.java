package com.google.firebase.auth.api.gms.p099ui;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.firebase.auth.api.model.VerifyAssertionRequest;
import com.google.firebase.auth.internal.FederatedSignInActivity;
import java.util.Set;

/* renamed from: com.google.firebase.auth.api.gms.ui.BrowserSignInResponseHandlerChimeraActivity */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BrowserSignInResponseHandlerChimeraActivity extends Activity {

    /* renamed from: a */
    private static final sek f152503a = new sek("FirebaseAuth", "IdpResponseHandler");

    /* JADX WARNING: Removed duplicated region for block: B:48:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0187  */
    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        if (cdxz.m135247b()) {
            f152503a.mo25409a("Activity enabled. Continuing", new Object[0]);
            Intent intent = null;
            try {
                Uri data = getIntent().getData();
                sek sek = f152503a;
                String valueOf = String.valueOf(data);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 4);
                sb.append("uri:");
                sb.append(valueOf);
                sek.mo25409a("SignInCompleteActivity", sb.toString());
                if (data != null) {
                    Set<String> queryParameterNames = data.getQueryParameterNames();
                    if (queryParameterNames.contains("cpn")) {
                        str = data.getQueryParameter("cpn");
                        try {
                            sek sek2 = f152503a;
                            Object[] objArr = new Object[1];
                            String valueOf2 = String.valueOf(str);
                            objArr[0] = valueOf2.length() == 0 ? new String("package name (cpn): ") : "package name (cpn): ".concat(valueOf2);
                            sek2.mo25409a("SignInCompleteActivity", objArr);
                            if (queryParameterNames.contains("firebaseError")) {
                                String queryParameter = data.getQueryParameter("firebaseError");
                                Intent intent2 = new Intent(this, FederatedSignInActivity.class);
                                intent2.setPackage(str);
                                intent2.setClassName(str, FederatedSignInActivity.class.getName());
                                intent2.setAction("com.google.firebase.auth.internal.WEB_SIGN_IN_FAILED");
                                intent2.addFlags(603979776);
                                brsb.m114521a(intent2, brsb.m114520a(queryParameter));
                                intent = intent2;
                            } else if (queryParameterNames.contains("link")) {
                                String queryParameter2 = data.getQueryParameter("link");
                                sek sek3 = f152503a;
                                Object[] objArr2 = new Object[1];
                                String valueOf3 = String.valueOf(queryParameter2);
                                objArr2[0] = valueOf3.length() == 0 ? new String("idpResponseUrl (link): ") : "idpResponseUrl (link): ".concat(valueOf3);
                                sek3.mo25409a("SignInCompleteActivity", objArr2);
                                String queryParameter3 = data.getQueryParameter("eventId");
                                Intent intent3 = new Intent(this, FederatedSignInActivity.class);
                                intent3.setPackage(str);
                                intent3.setClassName(str, FederatedSignInActivity.class.getName());
                                intent3.addFlags(603979776);
                                if (queryParameter2 != null) {
                                    if (queryParameter3 != null) {
                                        brrt a = brru.m114514a(this, str, queryParameter3);
                                        if (a != null) {
                                            sef.m35071a(new VerifyAssertionRequest(a, queryParameter2), intent3, "com.google.firebase.auth.internal.VERIFY_ASSERTION_REQUEST");
                                            intent3.putExtra("com.google.firebase.auth.internal.OPERATION", a.f143282b);
                                            String str2 = a.f143284d;
                                            if (str2 != null) {
                                                intent3.putExtra("com.google.firebase.auth.internal.EXTRA_TENANT_ID", str2);
                                            }
                                        } else {
                                            intent3.setAction("com.google.firebase.auth.internal.WEB_SIGN_IN_FAILED");
                                        }
                                        intent = intent3;
                                    }
                                }
                                intent3.setAction("com.google.firebase.auth.internal.WEB_SIGN_IN_FAILED");
                                intent = intent3;
                            }
                        } catch (UnsupportedOperationException e) {
                            e = e;
                            sek sek4 = f152503a;
                            String valueOf4 = String.valueOf(e.getMessage());
                            sek4.mo25418e(valueOf4.length() != 0 ? new String("Error parsing url: ") : "Error parsing url: ".concat(valueOf4), new Object[0]);
                            if (!cdyf.f181909a.mo6606a().mo78448a()) {
                            }
                        }
                        if (!cdyf.f181909a.mo6606a().mo78448a()) {
                            if (intent != null) {
                                try {
                                    startActivity(intent);
                                } catch (ActivityNotFoundException e2) {
                                    sek sek5 = f152503a;
                                    String valueOf5 = String.valueOf(str);
                                    sek5.mo25418e(valueOf5.length() == 0 ? new String("FederatedSignInActivity not found in package: ") : "FederatedSignInActivity not found in package: ".concat(valueOf5), new Object[0]);
                                }
                            }
                            finish();
                        } else if (intent != null) {
                            try {
                                startActivity(intent);
                            } catch (ActivityNotFoundException e3) {
                                sek sek6 = f152503a;
                                String valueOf6 = String.valueOf(str);
                                sek6.mo25418e(valueOf6.length() == 0 ? new String("FederatedSignInActivity not found in package: ") : "FederatedSignInActivity not found in package: ".concat(valueOf6), new Object[0]);
                                finish();
                            }
                        } else {
                            finish();
                        }
                    } else {
                        finish();
                    }
                } else {
                    finish();
                }
            } catch (UnsupportedOperationException e4) {
                e = e4;
                str = null;
                sek sek42 = f152503a;
                String valueOf42 = String.valueOf(e.getMessage());
                sek42.mo25418e(valueOf42.length() != 0 ? new String("Error parsing url: ") : "Error parsing url: ".concat(valueOf42), new Object[0]);
                if (!cdyf.f181909a.mo6606a().mo78448a()) {
                }
            }
        } else {
            f152503a.mo25409a("Activity disabled. Finishing", new Object[0]);
            finish();
        }
    }
}
