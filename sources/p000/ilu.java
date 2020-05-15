package p000;

import android.content.Intent;
import android.util.Log;
import com.felicanetworks.mfc.C0126R;
import com.felicanetworks.mfc.FelicaException;
import org.json.JSONObject;

/* renamed from: ilu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ilu {

    /* renamed from: a */
    public static final ilu f21314a = m15675a(izj.SUCCESS);

    /* renamed from: b */
    public static final ilu f21315b = m15675a(izj.USER_CANCEL);

    /* renamed from: c */
    public final izj f21316c;

    /* renamed from: d */
    public final int f21317d;

    static {
        m15675a(izj.BAD_AUTHENTICATION);
        m15675a(izj.NETWORK_ERROR);
    }

    private ilu(izj izj, int i) {
        this.f21316c = izj;
        this.f21317d = i;
    }

    /* renamed from: a */
    public static ilu m15675a(izj izj) {
        int i;
        izj izj2 = izj.CLIENT_LOGIN_DISABLED;
        int ordinal = izj.ordinal();
        if (ordinal == 8) {
            i = C0126R.string.auth_login_activity_loginfail_text_pwonly;
        } else if (ordinal == 10) {
            i = C0126R.string.auth_error_invalid_second_factor;
        } else if (ordinal == 14) {
            i = C0126R.string.auth_error_account_not_verified;
        } else if (ordinal == 16) {
            i = C0126R.string.auth_error_account_disabled;
        } else if (ordinal == 39) {
            i = C0126R.string.auth_error_bad_username;
        } else if (ordinal == 47) {
            i = C0126R.string.auth_error_username_unavailable;
        } else if (ordinal == 36) {
            i = C0126R.string.auth_account_already_has_gmail;
        } else if (ordinal != 37) {
            switch (ordinal) {
                case FelicaException.TYPE_ALREADY_ACTIVATED:
                    i = C0126R.string.auth_error_login_failed;
                    break;
                case FelicaException.TYPE_GET_BLOCK_COUNT_INFORMATION_FAILED:
                    i = C0126R.string.auth_error_not_logged_in;
                    break;
                case FelicaException.TYPE_RESET_FAILED:
                    i = C0126R.string.auth_doesnt_use_gmail;
                    break;
                default:
                    i = 0;
                    break;
            }
        } else {
            i = C0126R.string.auth_error_bad_password;
        }
        return new ilu(izj, i);
    }

    /* renamed from: b */
    public final void mo13126b(Intent intent) {
        intent.putExtra("Error", this.f21316c.f22000ac);
    }

    /* renamed from: a */
    public static izj m15676a(Intent intent) {
        if (intent == null) {
            return izj.SUCCESS;
        }
        String stringExtra = intent.getStringExtra("Error");
        if (stringExtra == null) {
            return izj.SUCCESS;
        }
        izj c = izj.m16369c(stringExtra);
        return c == null ? izj.UNKNOWN : c;
    }

    /* renamed from: a */
    public static izj m15677a(String str) {
        if (str == null) {
            return izj.SUCCESS;
        }
        izj c = izj.m16369c(str);
        String valueOf = String.valueOf(c);
        StringBuilder sb = new StringBuilder(str.length() + 44 + String.valueOf(valueOf).length());
        sb.append("gms.StatusHelper Status from wire: ");
        sb.append(str);
        sb.append(" status: ");
        sb.append(valueOf);
        Log.w("GLSActivity", sb.toString());
        return c == null ? izj.UNKNOWN : c;
    }

    /* renamed from: a */
    public static izj m15678a(JSONObject jSONObject) {
        String optString = jSONObject.optString("status");
        if (optString == null || "".equals(optString)) {
            return izj.SERVER_ERROR;
        }
        try {
            return izj.m16366a(optString);
        } catch (IllegalArgumentException e) {
            return izj.SERVER_ERROR;
        }
    }
}
