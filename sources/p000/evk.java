package p000;

import android.content.Context;
import android.content.Intent;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.auth.UserRecoverableAuthException;
import java.util.Arrays;

/* renamed from: evk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class evk {

    /* renamed from: a */
    public final String f15878a;

    /* renamed from: b */
    public final String f15879b;

    /* renamed from: c */
    public final String f15880c;

    /* renamed from: d */
    public final bswh f15881d;

    /* renamed from: e */
    public final boolean f15882e;

    /* renamed from: f */
    public final Intent f15883f;

    public evk(String str, String str2, String str3, bswh bswh, boolean z, Intent intent) {
        this.f15878a = str;
        this.f15879b = str2;
        this.f15880c = str3;
        this.f15881d = bswh;
        this.f15882e = z;
        this.f15883f = intent;
    }

    /* renamed from: a */
    private static evk m11191a(Context context) {
        bxvd da = bswh.f147430g.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bswh bswh = (bswh) da.f164949b;
        bswh.f147432a |= 1;
        bswh.f147433b = 19;
        return new evk(context.getString(C0126R.string.common_something_went_wrong), context.getString(C0126R.string.accountsettings_outdated_data_message_other_error), null, (bswh) da.mo74062i(), false, null);
    }

    /* renamed from: a */
    public final boolean mo10529a() {
        return this.f15881d != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof evk) {
            evk evk = (evk) obj;
            return this.f15882e == evk.f15882e && bmxi.m108538a(this.f15878a, evk.f15878a) && bmxi.m108538a(this.f15879b, evk.f15879b) && bmxi.m108538a(this.f15880c, evk.f15880c) && bmxi.m108538a(this.f15881d, evk.f15881d) && bmxi.m108538a(this.f15883f, evk.f15883f);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15878a, this.f15879b, this.f15880c, this.f15881d, Boolean.valueOf(this.f15882e), this.f15883f});
    }

    /* renamed from: a */
    public static evk m11192a(Throwable th, Context context) {
        if (th instanceof chuw) {
            chuv chuv = ((chuw) th).f189236a;
            if (chuv.f189233s != chus.DEADLINE_EXCEEDED && chuv.f189233s != chus.UNAVAILABLE) {
                return m11191a(context);
            }
            bxvd da = bswh.f147430g.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bswh bswh = (bswh) da.f164949b;
            bswh.f147432a |= 1;
            bswh.f147433b = 18;
            return new evk(context.getString(C0126R.string.accountsettings_snackbar_error_no_connection), context.getString(C0126R.string.as_network_error_description), context.getString(C0126R.string.common_try_again), (bswh) da.mo74062i(), true, null);
        } else if (th instanceof UserRecoverableAuthException) {
            Intent a = ((UserRecoverableAuthException) th).mo7366a();
            bxvd da2 = bswh.f147430g.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bswh bswh2 = (bswh) da2.f164949b;
            bswh2.f147432a |= 1;
            bswh2.f147433b = 13;
            return new evk(context.getString(C0126R.string.accountsettings_autherror_message), context.getString(C0126R.string.as_authentication_error_description), context.getString(C0126R.string.common_sign_in), (bswh) da2.mo74062i(), false, a);
        } else if (th != null) {
            return m11191a(context);
        } else {
            return null;
        }
    }
}
