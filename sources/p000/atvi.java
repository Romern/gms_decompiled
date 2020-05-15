package p000;

import com.felicanetworks.mfc.C0126R;
import java.util.Map;

/* renamed from: atvi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atvi {

    /* renamed from: a */
    public static final Map f91009a = bnhe.m109409a(1, Integer.valueOf((int) C0126R.string.tp_activation_sms_no_resends_error_title), 2, Integer.valueOf((int) C0126R.string.tp_activation_email_no_resends_error_title));

    /* renamed from: a */
    public static boolean m76456a(btnv btnv) {
        return btnv == btnv.SMS || btnv == btnv.EMAIL || btnv == btnv.RECEIVE_CALL || btnv == btnv.ISSUER_STATEMENT;
    }
}
