package p000;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.felicanetworks.mfc.FelicaException;
import com.felicanetworks.mfc.KeyInformation;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.android.gms.walletp2p.feature.common.transferparams.TransferParams;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: axma */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axma {

    /* renamed from: a */
    public String f96172a = "UNSET";

    /* renamed from: b */
    public String f96173b = "";

    /* renamed from: c */
    private final qws f96174c;

    public axma(Context context) {
        this.f96174c = qws.m33019a(context, "WALLET_SDK_GCORE");
    }

    /* renamed from: a */
    public static axma m82708a(Context context, String str) {
        return new axma(context, str);
    }

    /* renamed from: a */
    public final void mo53241a(String str) {
        if (str != null) {
            this.f96172a = str;
        }
    }

    private axma(Context context, String str) {
        this.f96174c = new qws(context, "WALLET_SDK_GCORE", str);
    }

    /* renamed from: a */
    public final void mo53239a(bwah bwah, String str, int i) {
        String str2;
        if (!spn.m35859a()) {
            qwo a = this.f96174c.mo24334a(new axly(bwah));
            if (!stm.m36302d(str)) {
                a.mo24323a((long) str.hashCode());
            }
            if (i != 1) {
                a.mo24328b(i - 1);
            }
            a.mo24327b();
        }
        if (Log.isLoggable("WalletP2PFlowStep", 4)) {
            switch (i) {
                case 1:
                    str2 = "UNKNOWN_STEP";
                    break;
                case 2:
                    str2 = "TRANSFER_CONTROLLER_CREATE_STARTED";
                    break;
                case 3:
                    str2 = "TRANSFER_CONTROLLER_CREATE_COMPLETE";
                    break;
                case 4:
                    str2 = "TRANSFER_CONTROLLER_ONRESTORESTATE";
                    break;
                case 5:
                    str2 = "TRANSFER_CONTROLLER_ONDESTROY";
                    break;
                case 6:
                    str2 = "TRANSFER_CONTROLLER_ONSAVESTATE";
                    break;
                case 7:
                    str2 = "TRANSFER_CONTROLLER_PICK_ACCOUNT_STARTED";
                    break;
                case 8:
                    str2 = "TRANSFER_CONTROLLER_GUESS_NAME_FROM_TRANSACTION_STARTED";
                    break;
                case 9:
                    str2 = "TRANSFER_CONTROLLER_PICK_TRANSFER_MODE";
                    break;
                case 10:
                    str2 = "TRANSFER_CONTROLLER_RENDER";
                    break;
                case 11:
                    str2 = "TRANSFER_CONTROLLER_STARTED";
                    break;
                case 12:
                case 13:
                case 14:
                case 57:
                case 129:
                default:
                    str2 = "null";
                    break;
                case 15:
                    str2 = "TRANSFER_CONTROLLER_VISIBLE";
                    break;
                case 16:
                    str2 = "TRANSFER_CONTROLLER_DONE_BUTTON_PRESSED";
                    break;
                case 17:
                    str2 = "INSTRUMENT_LIST_PRESSED";
                    break;
                case 18:
                    str2 = "TRANSFER_CONTROLLER_CONTINUE_WITH_ACCOUNT_STARTED";
                    break;
                case 19:
                    str2 = "TRANSFER_CONTROLLER_GUESS_NAME_FROM_TRANSACTION_FOUND_ONE";
                    break;
                case 20:
                    str2 = "TRANSFER_CONTROLLER_GUESS_NAME_FROM_TRANSACTION_FOUND_MULTIPLE";
                    break;
                case 21:
                    str2 = "TRANSFER_CONTROLLER_GUESS_NAME_FROM_TRANSACTION_FOUND_NONE";
                    break;
                case 22:
                    str2 = "TRANSFER_CONTROLLER_MAYBE_FETCH_TRANSACTION_STARTED";
                    break;
                case 23:
                    str2 = "TRANSFER_CONTROLLER_MAYBE_FETCH_TRANSACTION_COMPLETED";
                    break;
                case 24:
                    str2 = "TRANSFER_CONTROLLER_ERROR_PICK_TRANSFER_MODE";
                    break;
                case 25:
                    str2 = "INSTRUMENT_SELECTED";
                    break;
                case 26:
                    str2 = "CREATABLE_INSTRUMENT_SELECTED";
                    break;
                case 27:
                    str2 = "TRANSFER_CONTROLLER_INSTRUMENT_CREATE_FIRST_INSTRUMENT_MODE";
                    break;
                case 28:
                    str2 = "TRANSFER_CONTROLLER_INSTRUMENT_CREATE_FIRST_INSTRUMENT_SELECTED";
                    break;
                case 29:
                    str2 = "TRANSFER_CONTROLLER_ERROR_NO_INSTRUMENT_NO_CREATION_TOKEN";
                    break;
                case 30:
                    str2 = "TRANSFER_CONTROLLER_SCREEN_TOO_SMALL_HIDDEN_DETAILS";
                    break;
                case 31:
                    str2 = "TRANSFER_MONEY_PRESSED";
                    break;
                case 32:
                    str2 = "TRANSFER_CONTROLLER_ERROR_FAILED_PARSE_AMOUNT";
                    break;
                case 33:
                    str2 = "TRANSFER_CONTROLLER_ON_ACTIVITY_RESULT_STARTED";
                    break;
                case 34:
                    str2 = "TRANSFER_CONTROLLER_ON_ACTIVITY_RESULT_TRANSFER_CODE_OK";
                    break;
                case 35:
                    str2 = "TRANSFER_CONTROLLER_ON_ACTIVITY_RESULT_TRANSFER_CODE_CANCEL";
                    break;
                case 36:
                    str2 = "TRANSFER_CONTROLLER_ON_ACTIVITY_RESULT_ACCOUNT_CODE_OK";
                    break;
                case FelicaException.TYPE_NOT_CLOSED:
                    str2 = "TRANSFER_CONTROLLER_ERROR_NO_ACCOUNT_SELECTED";
                    break;
                case FelicaException.TYPE_ILLEGAL_METHOD_CALL:
                    str2 = "TRANSFER_CONTROLLER_ON_ACTIVITY_RESULT_INSTRUMENT_CODE_OK";
                    break;
                case FelicaException.TYPE_USED_BY_OTHER_APP:
                    str2 = "TRANSFER_CONTROLLER_ON_ACTIVITY_RESULT_INSTRUMENT_CODE_CANCEL";
                    break;
                case FelicaException.TYPE_PUSH_FAILED:
                    str2 = "TRANSFER_CONTROLLER_BACK_PRESSED";
                    break;
                case 41:
                    str2 = "TRANSFER_CONTROLLER_ERROR_UNABLE_CONNECT_GMSCORE";
                    break;
                case FelicaException.TYPE_ALREADY_ACTIVATED:
                    str2 = "TRANSFER_CONTROLLER_FETCH_INSTRUMENT_STARTED";
                    break;
                case FelicaException.TYPE_GET_BLOCK_COUNT_INFORMATION_FAILED:
                    str2 = "TRANSFER_CONTROLLER_FETCH_INSTRUMENT_COMPLETED";
                    break;
                case FelicaException.TYPE_RESET_FAILED:
                    str2 = "TRANSFER_CONTROLLER_AUTO_SELECTED_FIRST_INSTRUMENT";
                    break;
                case FelicaException.TYPE_GET_SYSTEM_CODE_LIST_FAILED:
                    str2 = "TRANSFER_CONTROLLER_FETCHED_INSTRUMENT_FAILED";
                    break;
                case FelicaException.TYPE_GET_CONTAINER_ID_FAILED:
                    str2 = "TRANSFER_CONTROLLER_FETCH_TRANSACTION_STARTED";
                    break;
                case 47:
                    str2 = "TRANSFER_CONTROLLER_FETCH_TRANSACTION_COMPLETED";
                    break;
                case 48:
                    str2 = "TRANSFER_CONTROLLER_FETCH_TRANSACTION_FAILED";
                    break;
                case FelicaException.TYPE_CURRENTLY_ACTIVATING:
                    str2 = "TRANSFER_CONTROLLER_DISPLAY_ACCOUNT_PICKER";
                    break;
                case 50:
                    str2 = "TRANSFER_CONTROLLER_OVERFLOW_CLICKED_RETURN";
                    break;
                case 51:
                    str2 = "TRANSFER_CONTROLLER_OVERFLOW_CLICKED_DECLINE";
                    break;
                case 52:
                    str2 = "TRANSFER_CONTROLLER_OVERFLOW_CLICKED_VIEW";
                    break;
                case 53:
                    str2 = "TRANSFER_CONTROLLER_OVERFLOW_CLICKED_HELP";
                    break;
                case 54:
                    str2 = "TRANSFER_CONTROLLER_OVERFLOW_CLICKED";
                    break;
                case 55:
                    str2 = "TRANSFER_CONTROLLER_GENERIC_ERROR_ALERT_DISPLAYED";
                    break;
                case FelicaException.TYPE_ACTIVATE_FAILED:
                    str2 = "TRANSFER_CONTROLLER_NETWORK_ERROR_ALERT_DISPLAYED";
                    break;
                case FelicaException.TYPE_OFFLINE_CANCELED:
                    str2 = "TRANSFER_CONTROLLER_INVALID_TRANSACTION_ERROR_ALERT_DISPLAYED";
                    break;
                case FelicaException.TYPE_NOW_EXECUTING_FALP:
                    str2 = "TRANSFER_CONTROLLER_KEYPAD_PRESSED";
                    break;
                case FelicaException.TYPE_MFC_NOT_FOUND:
                    str2 = "COMPLETION_CONTROLLER_CREATE_STARTED";
                    break;
                case FelicaException.TYPE_INITIATE_ADHOC_ERROR:
                    str2 = "COMPLETION_CONTROLLER_CREATE_COMPLETE";
                    break;
                case 62:
                    str2 = "COMPLETION_CONTROLLER_ERROR_CALLER_NOT_GOOGLE_SIGNED";
                    break;
                case 63:
                    str2 = "COMPLETION_CONTROLLER_STARTED";
                    break;
                case 64:
                    str2 = "COMPLETION_CONTROLLER_START_ONACTIVITY_RETURN";
                    break;
                case KeyInformation.AES128_DES56:
                    str2 = "COMPLETION_CONTROLLER_ONDESTROY";
                    break;
                case 66:
                    str2 = "COMPLETION_CONTROLLER_FETCH_DELAY_STARTED";
                    break;
                case KeyInformation.AES128_DES112:
                    str2 = "FETCH_DELAY_INSTANT";
                    break;
                case 68:
                    str2 = "FETCH_DELAY_DELAYED";
                    break;
                case 69:
                    str2 = "FETCH_DELAY_ERROR";
                    break;
                case 70:
                    str2 = "COMPLETION_CONTROLLER_TRANSFER_STARTED";
                    break;
                case 71:
                    str2 = "TRANSFER_SUCCESS";
                    break;
                case 72:
                    str2 = "TRANSFER_CHALLENGE";
                    break;
                case 73:
                    str2 = "TRANSFER_ERROR";
                    break;
                case 74:
                    str2 = "COMPLETION_CONTROLLER_PREPARE_TRANSFER_ASYNC";
                    break;
                case 75:
                    str2 = "COMPLETION_CONTROLLER_DELAY_ALERT_DISPLAYED";
                    break;
                case 76:
                    str2 = "COMPLETION_CONTROLLER_DELAY_CANCEL_PRESSED";
                    break;
                case 77:
                    str2 = "COMPLETION_CONTROLLER_DELAY_CONTINUE_PRESSED";
                    break;
                case 78:
                    str2 = "COMPLETION_CONTROLLER_CVN_CHALLENGE_DISPLAYED";
                    break;
                case KeyInformation.AES128:
                    str2 = "COMPLETION_CONTROLLER_CVN_CHALLENGE_CANCEL_PRESSED";
                    break;
                case AndroidInputTypeSignal.TYPE_TEXT_VARIATION_LONG_MESSAGE /*80*/:
                    str2 = "COMPLETION_CONTROLLER_ERROR_CVN_CHALLENGE_MISSING_TOKEN_OR_INSTRUMENT";
                    break;
                case 81:
                    str2 = "COMPLETION_CONTROLLER_CVN_CHALLENGE_CONTINUE_PRESSED";
                    break;
                case 82:
                    str2 = "COMPLETION_CONTROLLER_DEVICE_LOCK_CHALLENGE_DISPLAYED";
                    break;
                case 83:
                    str2 = "COMPLETION_CONTROLLER_DEVICE_LOCK_CHALLENGE_CANCEL_PRESSED";
                    break;
                case 84:
                    str2 = "COMPLETION_CONTROLLER_DEVICE_LOCK_CHALLENGE_CONTINUE_PRESSED";
                    break;
                case 85:
                    str2 = "COMPLETION_CONTROLLER_ERROR_ALERT_DISPLAYED";
                    break;
                case 86:
                    str2 = "COMPLETION_CONTROLLER_ERROR_ALERT_CANCEL_PRESSED";
                    break;
                case 87:
                    str2 = "COMPLETION_CONTROLLER_INSTRUMENT_FIX_DISPLAYED";
                    break;
                case 88:
                    str2 = "COMPLETION_CONTROLLER_INSTRUMENT_FIX_CANCEL_PRESSED";
                    break;
                case 89:
                    str2 = "COMPLETION_CONTROLLER_INSTRUMENT_FIX_CONTINUE_PRESSED";
                    break;
                case 90:
                    str2 = "COMPLETION_CONTROLLER_KYC_CHALLENGE_DISPLAYED";
                    break;
                case 91:
                    str2 = "COMPLETION_CONTROLLER_KYC_CHALLENGE_CANCEL_PRESSED";
                    break;
                case 92:
                    str2 = "COMPLETION_CONTROLLER_KYC_CHALLENGE_CONTINUE_PRESSED";
                    break;
                case 93:
                    str2 = "COMPLETION_CONTROLLER_NETWORK_ERROR_DISPLAYED";
                    break;
                case 94:
                    str2 = "COMPLETION_CONTROLLER_NETWORK_ERROR_CANCEL_PRESSED";
                    break;
                case 95:
                    str2 = "COMPLETION_CONTROLLER_NETWORK_ERROR_RETRY_PRESSED";
                    break;
                case AndroidInputTypeSignal.TYPE_TEXT_VARIATION_PERSON_NAME /*96*/:
                    str2 = "COMPLETION_CONTROLLER_ON_ACTIVITY_RESULT_STARTED";
                    break;
                case 97:
                    str2 = "COMPLETION_CONTROLLER_ON_ACTIVITY_RESULT_KYC_CODE_OK";
                    break;
                case 98:
                    str2 = "COMPLETION_CONTROLLER_ON_ACTIVITY_RESULT_KYC_CODE_CANCEL";
                    break;
                case 99:
                    str2 = "COMPLETION_CONTROLLER_ON_ACTIVITY_RESULT_DEVICE_CODE_OK";
                    break;
                case 100:
                    str2 = "COMPLETION_CONTROLLER_ON_ACTIVITY_RESULT_DEVICE_CODE_CANCEL";
                    break;
                case 101:
                    str2 = "COMPLETION_CONTROLLER_ON_ACTIVITY_RESULT_INSTRUMENT_FIX_CODE_OK";
                    break;
                case 102:
                    str2 = "COMPLETION_CONTROLLER_INSTRUMENT_FIX_VERIFICATION_OK";
                    break;
                case ErrorInfo.TYPE_SDU_COMMUNICATIONERROR:
                    str2 = "COMPLETION_CONTROLLER_INSTRUMENT_FIX_VERIFICATION_FAILED";
                    break;
                case ErrorInfo.TYPE_SDU_FAILED:
                    str2 = "COMPLETION_CONTROLLER_ON_ACTIVITY_RESULT_INSTRUMENT_FIX_CODE_CANCEL";
                    break;
                case ErrorInfo.TYPE_SDU_MEMORY_FULL:
                    str2 = "COMPLETION_CONTROLLER_ON_ACTIVITY_RESULT_CVN_CODE_OK";
                    break;
                case 106:
                    str2 = "COMPLETION_CONTROLLER_ON_ACTIVITY_RESULT_CVN_CODE_CANCEL";
                    break;
                case 107:
                    str2 = "COMPLETION_CONTROLLER_FETCH_IDV_TOKEN_STARTED";
                    break;
                case 108:
                    str2 = "COMPLETION_CONTROLLER_FETCH_IDV_TOKEN_SUCCESS";
                    break;
                case 109:
                    str2 = "COMPLETION_CONTROLLER_FETCH_IDV_TOKEN_FAILED";
                    break;
                case 110:
                    str2 = "COMPLETION_CONTROLLER_DONE_BUTTON_DISPLAYED";
                    break;
                case 111:
                    str2 = "COMPLETION_CONTROLLER_DEFAULT_INSTRUMENT_DISPLAYED";
                    break;
                case AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS /*112*/:
                    str2 = "COMPLETION_CONTROLLER_DONE_BUTTON_PRESSED";
                    break;
                case 113:
                    str2 = "COMPLETION_CONTROLLER_SUCCESS_TOAST_DISPLAYED";
                    break;
                case 114:
                    str2 = "TRANSFER_CONTROLLER_ERROR_CALLER_NOT_GOOGLE_SIGNED";
                    break;
                case 115:
                    str2 = "TRANSFER_CONTROLLER_Z_REDIRECT";
                    break;
                case 116:
                    str2 = "TRANSFER_CONTROLLER_ERROR_ALERT_DISPLAYED";
                    break;
                case 117:
                    str2 = "TRANSFER_CONTROLLER_ERROR_ALERT_CANCEL_PRESSED";
                    break;
                case 118:
                    str2 = "TRANSFER_CONTROLLER_VALIDATE_DRAFT_FAILED";
                    break;
                case 119:
                    str2 = "TRANSFER_CONTROLLER_VALIDATE_DRAFT_COMPLETED";
                    break;
                case 120:
                    str2 = "COMPLETE_CONTROLLER_VALIDATE_DRAFT_FAILED";
                    break;
                case 121:
                    str2 = "COMPLETE_CONTROLLER_VALIDATE_DRAFT_FAILED_REQUEST_MATCH";
                    break;
                case 122:
                    str2 = "COMPLETE_CONTROLLER_VALIDATE_DRAFT_FAILED_MISSING_INSTRUMENT";
                    break;
                case 123:
                    str2 = "COMPLETE_CONTROLLER_VALIDATE_DRAFT_FAILED_PRESENT_INSTRUMENT";
                    break;
                case 124:
                    str2 = "COMPLETE_CONTROLLER_VALIDATE_DRAFT_COMPLETED";
                    break;
                case 125:
                    str2 = "COMPLETE_CONTROLLER_VALIDATE_DRAFT_INSTRUMENT_FAILED";
                    break;
                case 126:
                    str2 = "COMPLETE_CONTROLLER_VALIDATE_DRAFT_INSTRUMENT_EMPTY";
                    break;
                case 127:
                    str2 = "COMPLETE_CONTROLLER_VALIDATE_DRAFT_INSTRUMENT_COMPLETED";
                    break;
                case 128:
                    str2 = "COMPLETE_CONTROLLER_VALIDATE_DRAFT_INSTRUMENT_NOT_FOUND";
                    break;
                case 130:
                    str2 = "TRANSFER_CONTROLLER_MEMO_ENTERED";
                    break;
                case 131:
                    str2 = "TRANSFER_CONTROLLER_MEMO_SKIPPED";
                    break;
                case 132:
                    str2 = "TRANSFER_CONTROLLER_ACCOUNT_AUTH_FAILURE_ERROR_ALERT_DISPLAYED";
                    break;
                case 133:
                    str2 = "TRANSFER_CONTROLLER_SKIP_PREPARE_DRAFT";
                    break;
                case 134:
                    str2 = "TRANSFER_CONTROLLER_SCREEN_WIDTH_SQUEEZE";
                    break;
                case 135:
                    str2 = "TRANSFER_CONTROLLER_PROCESS_DRAFT_STARTED";
                    break;
                case 136:
                    str2 = "TRANSFER_CONTROLLER_PROCESS_DRAFT_TRANSACTION_TOKEN_MISMATCH";
                    break;
                case 137:
                    str2 = "TRANSFER_CONTROLLER_FETCH_DRAFT_STARTED";
                    break;
                case 138:
                    str2 = "TRANSFER_CONTROLLER_LANDSCAPE_FANCY_KEYPAD";
                    break;
                case 139:
                    str2 = "COMPLETION_CONTROLLER_VALIDATE_DRAFT_INSTRUMENT_STARTED";
                    break;
                case 140:
                    str2 = "COMPLETION_CONTROLLER_PROCESS_DRAFT_STARTED";
                    break;
                case 141:
                    str2 = "COMPLETION_CONTROLLER_PURCHASE_MANAGER_CHALLENGE_DISPLAYED";
                    break;
                case 142:
                    str2 = "COMPLETION_CONTROLLER_PURCHASE_MANAGER_CHALLENGE_CANCEL_PRESSED";
                    break;
                case 143:
                    str2 = "COMPLETION_CONTROLLER_ERROR_PURCHASE_MANAGER_CHALLENGE_MISSING_TOKEN";
                    break;
                case AndroidInputTypeSignal.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD /*144*/:
                    str2 = "COMPLETION_CONTROLLER_PURCHASE_MANAGER_CHALLENGE_CONTINUE_PRESSED";
                    break;
                case 145:
                    str2 = "COMPLETION_CONTROLLER_ON_ACTIVITY_RESULT_PURCHASE_MANAGER_CODE_OK";
                    break;
                case 146:
                    str2 = "COMPLETION_CONTROLLER_ON_ACTIVITY_RESULT_PURCHASE_MANAGER_CODE_CANCEL";
                    break;
                case 147:
                    str2 = "TRANSFER_CONTROLLER_ON_ACTIVITY_RESULT_TRANSFER_CODE_FATAL";
                    break;
                case 148:
                    str2 = "TRANSFER_CONTROLLER_CALLER_PASSED_ELIGIBILITY_GATE";
                    break;
                case 149:
                    str2 = "TRANSFER_CONTROLLER_ERROR_CALLER_FAILED_ELIGIBILITY_GATE";
                    break;
                case MfiClientException.TYPE_MFICLIENT_REMOTE_ACCESS_FAILED:
                    str2 = "GET_PIN_SETTINGS_RPC_SUCCESS";
                    break;
                case MfiClientException.TYPE_MFICLIENT_NOT_FOUND:
                    str2 = "GET_PIN_SETTINGS_RPC_FAILED";
                    break;
                case MfiClientException.TYPE_MFICLIENT_NOT_ACTIVATED:
                    str2 = "VERIFY_PIN_RPC_SUCCESS";
                    break;
                case MfiClientException.TYPE_MFICLIENT_STARTED:
                    str2 = "VERIFY_PIN_RPC_CALL_ERROR";
                    break;
                case MfiClientException.TYPE_MFICLIENT_NOT_STARTED:
                    str2 = "VERIFY_PIN_RPC_FAILED";
                    break;
                case MfiClientException.TYPE_ILLEGAL_LINKAGE_DATA:
                    str2 = "PIN_NOT_REQUIRED";
                    break;
                case MfiClientException.TYPE_NO_ACCOUNT_INFO:
                    str2 = "PIN_SCREEN_SHOWN";
                    break;
                case MfiClientException.TYPE_CARD_NOT_CACHED:
                    str2 = "PIN_VERIFIED";
                    break;
                case MfiClientException.TYPE_ILLEGAL_CARD_OPERATION:
                    str2 = "PIN_VERIFY_CANCELED";
                    break;
                case MfiClientException.TYPE_MFICLIENT_CURRENTLY_ONLINE:
                    str2 = "FORGOT_PIN_CLICKED";
                    break;
                case 160:
                    str2 = "ONBOARDING_SHOWN";
                    break;
                case 161:
                    str2 = "ONBOARDING_NOT_REQUIRED";
                    break;
                case 162:
                    str2 = "FETCH_SETTINGS_RPC_SUCCESS";
                    break;
                case 163:
                    str2 = "FETCH_SETTINGS_RPC_FAILED";
                    break;
                case 164:
                    str2 = "UPDATE_SETTING_RPC_SUCCESS";
                    break;
                case 165:
                    str2 = "UPDATE_SETTING_RPC_FAILED";
                    break;
                case 166:
                    str2 = "ALREADY_RECEIVING_OFFERS";
                    break;
                case 167:
                    str2 = "NOT_RECEIVING_OFFERS";
                    break;
                case 168:
                    str2 = "CHECK_RECEIVE_OFFERS";
                    break;
                case 169:
                    str2 = "UNCHECK_RECEIVE_OFFERS";
                    break;
                case 170:
                    str2 = "TRANSFER_CONTROLLER_OVERFLOW_CLICKED_SETTINGS";
                    break;
                case 171:
                    str2 = "TRANSFER_CONTROLLER_TRANSACTION_CURRENCY_MISMATCH";
                    break;
                case 172:
                    str2 = "COMPLETION_CONTROLLER_EVALUATE_TRANSACTION_STARTED";
                    break;
                case 173:
                    str2 = "EVALUATE_TRANSACTION_ERROR";
                    break;
                case 174:
                    str2 = "EVALUATE_TRANSACTION_NO_WARNING";
                    break;
                case 175:
                    str2 = "EVALUATE_TRANSACTION_HAS_WARNING";
                    break;
                case AndroidInputTypeSignal.TYPE_TEXT_VARIATION_FILTER /*176*/:
                    str2 = "WARNING_IMPRESSION";
                    break;
                case 177:
                    str2 = "WARNING_CONTINUE_CLICKED";
                    break;
                case 178:
                    str2 = "WARNING_CANCEL_CLICKED";
                    break;
                case 179:
                    str2 = "MORE_OPTIONS_CLICKED";
                    break;
                case 180:
                    str2 = "PAYMENTS_LIMIT_LINK_CLICKED";
                    break;
            }
            Log.i("WalletP2PFlowStep", str2);
        }
    }

    /* renamed from: a */
    public final void mo53240a(TransferParams transferParams, Intent intent, int i) {
        bxvd da = bwah.f158643i.mo74144da();
        int i2 = transferParams.f110653l - 1;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bwah bwah = (bwah) da.f164949b;
        boolean z = true;
        int i3 = bwah.f158645a | 1;
        bwah.f158645a = i3;
        bwah.f158646b = i2;
        String str = this.f96172a;
        str.getClass();
        int i4 = i3 | 2;
        bwah.f158645a = i4;
        bwah.f158647c = str;
        bwah.f158648d = 1;
        bwah.f158645a = i4 | 4;
        bxvd da2 = bwae.f158618k.mo74144da();
        int i5 = transferParams.f110646e;
        int i6 = 5;
        if (i5 == 2) {
            i6 = 2;
        } else if (i5 == 3) {
            i6 = 3;
        } else if (i5 != 4) {
            i6 = i5 != 5 ? 1 : 4;
        }
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bwae bwae = (bwae) da2.f164949b;
        bwae.f158621b = i6 - 1;
        int i7 = bwae.f158620a | 1;
        bwae.f158620a = i7;
        boolean z2 = transferParams.f110647f != null;
        int i8 = 2 | i7;
        bwae.f158620a = i8;
        bwae.f158622c = z2;
        boolean z3 = transferParams.f110649h != null;
        bwae.f158620a = 4 | i8;
        bwae.f158623d = z3;
        boolean hasExtra = intent.hasExtra("amount_in_micros");
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bwae bwae2 = (bwae) da2.f164949b;
        bwae2.f158620a |= 8;
        bwae2.f158624e = hasExtra;
        boolean z4 = intent.hasExtra("amount_currency") && !stm.m36302d(intent.getStringExtra("amount_currency"));
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bwae bwae3 = (bwae) da2.f164949b;
        bwae3.f158620a |= 16;
        bwae3.f158625f = z4;
        if (!intent.hasExtra("account_name") || stm.m36302d(intent.getStringExtra("account_name"))) {
            z = false;
        }
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bwae bwae4 = (bwae) da2.f164949b;
        int i9 = bwae4.f158620a | 32;
        bwae4.f158620a = i9;
        bwae4.f158626g = z;
        boolean z5 = transferParams.f110651j;
        bwae4.f158620a = i9 | 64;
        bwae4.f158627h = z5;
        boolean hasExtra2 = intent.hasExtra("draft_mode");
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bwae bwae5 = (bwae) da2.f164949b;
        int i10 = bwae5.f158620a | 128;
        bwae5.f158620a = i10;
        bwae5.f158628i = hasExtra2;
        boolean z6 = transferParams.f110648g;
        bwae5.f158620a = i10 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        bwae5.f158629j = z6;
        bwae bwae6 = (bwae) da2.mo74062i();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bwah bwah2 = (bwah) da.f164949b;
        bwae6.getClass();
        bwah2.f158649e = bwae6;
        int i11 = bwah2.f158645a | 8;
        bwah2.f158645a = i11;
        bwah2.f158650f = i - 1;
        bwah2.f158645a = i11 | 16;
        mo53239a((bwah) da.mo74062i(), this.f96173b, i);
    }
}
