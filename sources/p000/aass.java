package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;

/* renamed from: aass */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aass {

    /* renamed from: a */
    private final aasf f56523a;

    /* renamed from: b */
    private final aasg f56524b;

    public aass(aasf aasf) {
        this.f56523a = aasf;
        this.f56524b = null;
    }

    /* renamed from: a */
    static Intent m46942a(String str) {
        return Intent.parseUri(str, 1);
    }

    public aass(aasf aasf, aasg aasg) {
        this.f56523a = aasf;
        this.f56524b = aasg;
    }

    /* renamed from: a */
    public static boolean m46943a(String str, Context context) {
        Intent intent;
        try {
            intent = m46942a(str);
        } catch (Exception e) {
            String valueOf = String.valueOf(str);
            Log.e("gH_IntentActionsUtil", valueOf.length() == 0 ? new String("The Intent URI is invalid: ") : "The Intent URI is invalid: ".concat(valueOf));
            intent = null;
        }
        if (intent != null) {
            return spn.m35860a(context, intent);
        }
        return false;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aass.a(java.lang.String, int, int, java.lang.String, boolean):void
     arg types: [java.lang.String, int, int, java.lang.String, int]
     candidates:
      aass.a(android.net.Uri, java.lang.String, int, int, java.lang.String):android.content.Intent
      aass.a(android.net.Uri, int, java.lang.String, int, java.lang.String):boolean
      aass.a(java.lang.String, int, int, java.lang.String, boolean):void */
    /* renamed from: a */
    public final Intent mo31747a(Uri uri, String str, int i, int i2, String str2) {
        Intent intent;
        String str3;
        String uri2 = uri.toString();
        try {
            intent = m46942a(uri2);
        } catch (Exception e) {
            String valueOf = String.valueOf(uri2);
            Log.e("gH_IntentActionsUtil", valueOf.length() == 0 ? new String("The Intent URI is invalid: ") : "The Intent URI is invalid: ".concat(valueOf));
            intent = null;
        }
        if (intent == null) {
            aasg aasg = this.f56524b;
            if (aasg != null) {
                aasf aasf = this.f56523a;
                aasm aasm = aasg.f56426a;
                if (aasm != null) {
                    str3 = aasm.f56497g;
                } else {
                    str3 = null;
                }
                abcx.m47485a(aasf, str, str3);
            } else {
                abcx.m47485a(this.f56523a, str, (String) null);
            }
            String valueOf2 = String.valueOf(uri);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 37);
            sb.append("Intent could not be parsed from Uri: ");
            sb.append(valueOf2);
            Log.w("gH_IntentActionsUtil", sb.toString());
            return null;
        } else if (spn.m35860a((Context) this.f56523a, intent)) {
            return intent;
        } else {
            mo31748a(str, i, i2, str2, false);
            String valueOf3 = String.valueOf(uri);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf3).length() + 26);
            sb2.append("Intent is not actionable: ");
            sb2.append(valueOf3);
            Log.w("gH_IntentActionsUtil", sb2.toString());
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo31748a(String str, int i, int i2, String str2, boolean z) {
        if (i2 != 1) {
            abcx.m47474a(this.f56523a, i2, str, i, str2, z);
        }
    }

    /* renamed from: a */
    public final boolean mo31749a(Uri uri, int i) {
        return mo31750a(uri, -1, (String) null, i, (String) null);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aass.a(java.lang.String, int, int, java.lang.String, boolean):void
     arg types: [java.lang.String, int, int, java.lang.String, int]
     candidates:
      aass.a(android.net.Uri, java.lang.String, int, int, java.lang.String):android.content.Intent
      aass.a(android.net.Uri, int, java.lang.String, int, java.lang.String):boolean
      aass.a(java.lang.String, int, int, java.lang.String, boolean):void */
    /* renamed from: a */
    public final boolean mo31750a(Uri uri, int i, String str, int i2, String str2) {
        boolean z;
        Uri uri2;
        String scheme = uri.getScheme();
        aasg aasg = this.f56524b;
        if (aasg == null || aasg.mo31705b()) {
            z = false;
        } else {
            z = true;
        }
        if (!(!z ? scheme.equals("intent") : scheme.equals("ghandroid"))) {
            return false;
        }
        if (z) {
            uri2 = uri.buildUpon().scheme("intent").build();
        } else {
            uri2 = uri;
        }
        if (Looper.myLooper() == Looper.getMainLooper() && this.f56523a != null) {
            String uri3 = TextUtils.isEmpty(str) ? uri2.toString() : str;
            Intent a = mo31747a(uri2, uri3, i, i2, str2);
            if (a != null) {
                mo31748a(uri3, i, i2, str2, true);
                if (a.hasExtra("account_name")) {
                    Account account = this.f56523a.mo18626g().f78829d;
                    if (account != null) {
                        a.putExtra("account_name", account.name);
                    } else {
                        a.removeExtra("account_name");
                    }
                }
                ((Activity) this.f56523a).startActivityForResult(a, 0);
            } else {
                Toast.makeText((Context) this.f56523a, (int) C0126R.string.gh_action_not_supported_message, 1).show();
            }
        } else {
            mo31748a(str, i, i2, str2, false);
            Log.w("gH_IntentActionsUtil", "No Activity present to use for launching the intent, or not main thread.");
        }
        return true;
    }
}
