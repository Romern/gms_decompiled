package p000;

import android.os.Message;
import android.view.View;
import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.gms.tapandpay.tokenization.EnterVerificationCodeChimeraActivity;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.Map;

/* renamed from: atqe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atqe extends atyi {
    public atqe(EnterVerificationCodeChimeraActivity enterVerificationCodeChimeraActivity) {
        super(enterVerificationCodeChimeraActivity);
    }

    public final void handleMessage(Message message) {
        int i;
        EnterVerificationCodeChimeraActivity enterVerificationCodeChimeraActivity = (EnterVerificationCodeChimeraActivity) mo50318b();
        if (enterVerificationCodeChimeraActivity != null) {
            if (message.getData().getInt("data_request_type") == 13) {
                enterVerificationCodeChimeraActivity.f108815u = false;
                enterVerificationCodeChimeraActivity.f108802h.setClickable(true);
            }
            if (message.getData().getInt("data_request_type") == 7) {
                enterVerificationCodeChimeraActivity.f108802h.setEnabled(true);
            }
            int i2 = message.what;
            if (i2 == 107) {
                View findViewById = enterVerificationCodeChimeraActivity.findViewById(C0126R.C0129id.ResendCode);
                if (findViewById != null && findViewById.getVisibility() == 0) {
                    enterVerificationCodeChimeraActivity.mo59447b(3);
                    enterVerificationCodeChimeraActivity.mo59441a((int) C0126R.string.tp_expired_code_sub_label);
                    return;
                }
                try {
                    enterVerificationCodeChimeraActivity.mo59443a((btnf) atxo.m76511b(message, "tap_and_pay_api_error", btnf.f149600f), 12);
                } catch (bxwf e) {
                    enterVerificationCodeChimeraActivity.mo59443a((btnf) null, 12);
                }
            } else if (i2 == 7001) {
                int i3 = message.getData().getInt("data_activation_method_type");
                bnhe bnhe = EnterVerificationCodeChimeraActivity.f108790c;
                Integer valueOf = Integer.valueOf(i3);
                if (bnhe.containsKey(valueOf)) {
                    if (!atyj.m76564a(enterVerificationCodeChimeraActivity.f108806l) || !EnterVerificationCodeChimeraActivity.f108791d.containsKey(valueOf)) {
                        i = ((Integer) EnterVerificationCodeChimeraActivity.f108790c.get(valueOf)).intValue();
                    } else {
                        i = ((Integer) EnterVerificationCodeChimeraActivity.f108791d.get(valueOf)).intValue();
                    }
                    Toast.makeText(enterVerificationCodeChimeraActivity, i, 0).show();
                }
            } else if (i2 != 13001) {
                switch (i2) {
                    case 101:
                        enterVerificationCodeChimeraActivity.mo59447b(1);
                        try {
                            enterVerificationCodeChimeraActivity.mo59442a((btnf) atxo.m76511b(message, "tap_and_pay_api_error", btnf.f149600f));
                            return;
                        } catch (bxwf e2) {
                            enterVerificationCodeChimeraActivity.mo59442a((btnf) null);
                            return;
                        }
                    case 102:
                        try {
                            enterVerificationCodeChimeraActivity.mo59443a((btnf) atxo.m76511b(message, "tap_and_pay_api_error", btnf.f149600f), 13);
                            return;
                        } catch (bxwf e3) {
                            enterVerificationCodeChimeraActivity.mo59443a((btnf) null, 13);
                            return;
                        }
                    case ErrorInfo.TYPE_SDU_COMMUNICATIONERROR:
                        try {
                            enterVerificationCodeChimeraActivity.mo59443a((btnf) atxo.m76511b(message, "tap_and_pay_api_error", btnf.f149600f), 4);
                            return;
                        } catch (bxwf e4) {
                            enterVerificationCodeChimeraActivity.mo59443a((btnf) null, 4);
                            return;
                        }
                    case ErrorInfo.TYPE_SDU_FAILED:
                        enterVerificationCodeChimeraActivity.mo59449e();
                        return;
                    default:
                        switch (i2) {
                            case 109:
                                int i4 = message.getData().getInt("data_activation_method_type");
                                Map map = atvi.f91009a;
                                Integer valueOf2 = Integer.valueOf(i4);
                                if (map.containsKey(valueOf2)) {
                                    enterVerificationCodeChimeraActivity.mo59445a(enterVerificationCodeChimeraActivity.getString(((Integer) atvi.f91009a.get(valueOf2)).intValue()), enterVerificationCodeChimeraActivity.getString(C0126R.string.tp_activation_otp_no_resends_error_body), enterVerificationCodeChimeraActivity.getString(C0126R.string.common_ok), 14);
                                    return;
                                } else {
                                    enterVerificationCodeChimeraActivity.mo59443a((btnf) null, 14);
                                    return;
                                }
                            case 110:
                                enterVerificationCodeChimeraActivity.mo59445a(enterVerificationCodeChimeraActivity.getString(C0126R.string.tp_activation_otp_too_many_tries_error_title), enterVerificationCodeChimeraActivity.getString(C0126R.string.tp_activation_otp_too_many_tries_error_body), enterVerificationCodeChimeraActivity.getString(C0126R.string.common_ok), 12);
                                return;
                            case 111:
                                enterVerificationCodeChimeraActivity.mo59445a(enterVerificationCodeChimeraActivity.getString(C0126R.string.tp_activation_otp_too_many_tries_error_title), enterVerificationCodeChimeraActivity.getString(C0126R.string.tp_activation_otp_too_many_tries_no_resends_error_body), enterVerificationCodeChimeraActivity.getString(C0126R.string.common_ok), 12);
                                return;
                            case AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS /*112*/:
                                enterVerificationCodeChimeraActivity.mo59445a(enterVerificationCodeChimeraActivity.getString(C0126R.string.tp_activation_otp_expired_error_title), enterVerificationCodeChimeraActivity.getString(C0126R.string.tp_activation_otp_expired_error_body), enterVerificationCodeChimeraActivity.getString(C0126R.string.common_ok), 12);
                                return;
                            case 113:
                                enterVerificationCodeChimeraActivity.mo59445a(enterVerificationCodeChimeraActivity.getString(C0126R.string.tp_activation_otp_expired_error_title), enterVerificationCodeChimeraActivity.getString(C0126R.string.tp_activation_otp_expired_no_resends_error_body), enterVerificationCodeChimeraActivity.getString(C0126R.string.common_ok), 12);
                                return;
                            default:
                                return;
                        }
                }
            } else {
                try {
                    btmn btmn = (btmn) atxo.m76510a(message, "data_response", btmn.f149517b);
                    if (btmn != null) {
                        if (btmn.f149519a) {
                            enterVerificationCodeChimeraActivity.mo59449e();
                            new adzt().postDelayed(new atpt(enterVerificationCodeChimeraActivity), 30000);
                            return;
                        }
                    }
                    enterVerificationCodeChimeraActivity.mo59447b(3);
                    enterVerificationCodeChimeraActivity.mo59441a((int) C0126R.string.tp_incorrect_code_sub_label);
                } catch (bxwf e5) {
                    enterVerificationCodeChimeraActivity.mo59442a((btnf) null);
                }
            }
        }
    }
}
