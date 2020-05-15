package p000;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.internal.InternalCredentialWrapper;

/* renamed from: hrm */
final /* synthetic */ class hrm implements bmxj {

    /* renamed from: a */
    private final hrr f20310a;

    /* renamed from: b */
    private final boolean f20311b;

    /* renamed from: c */
    private final InternalCredentialWrapper f20312c;

    public hrm(hrr hrr, boolean z, InternalCredentialWrapper internalCredentialWrapper) {
        this.f20310a = hrr;
        this.f20311b = z;
        this.f20312c = internalCredentialWrapper;
    }

    public final Object apply(Object obj) {
        hrr hrr = this.f20310a;
        boolean z = this.f20311b;
        InternalCredentialWrapper internalCredentialWrapper = this.f20312c;
        Credential credential = (Credential) obj;
        if (!z) {
            Context context = hrr.f20319a;
            Credential credential2 = internalCredentialWrapper.f10139a;
            String str = hrr.f20323e;
            Intent className = new Intent().setClassName(context, "com.google.android.gms.auth.api.credentials.ui.AutoSignInSnackbarService");
            className.putExtra("log_session_id", str);
            sef.m35071a(credential2, className, "com.google.android.gms.credentials.Credential");
            context.startService(className);
        } else {
            Context context2 = hrr.f20319a;
            Credential credential3 = internalCredentialWrapper.f10139a;
            String str2 = hrr.f20323e;
            Intent className2 = new Intent().setClassName(context2, "com.google.android.gms.auth.api.credentials.ui.AutoSignInWarmWelcomeService");
            className2.putExtra("log_session_id", str2);
            sef.m35071a(credential3, className2, "com.google.android.gms.credentials.Credential");
            context2.startService(className2);
        }
        return credential;
    }
}
