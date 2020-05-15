package p000;

import android.os.Message;
import android.widget.TextView;
import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.gms.tapandpay.tokenization.SelectVerificationMethodChimeraActivity;
import com.google.android.gms.tapandpay.tokenization.VerificationMethodView;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: atra */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atra extends atyi {
    public atra(SelectVerificationMethodChimeraActivity selectVerificationMethodChimeraActivity) {
        super(selectVerificationMethodChimeraActivity);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0282 A[Catch:{ bxwf -> 0x02a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0283 A[Catch:{ bxwf -> 0x02a0 }] */
    public final void handleMessage(Message message) {
        String str;
        String str2;
        SelectVerificationMethodChimeraActivity selectVerificationMethodChimeraActivity = (SelectVerificationMethodChimeraActivity) mo50318b();
        if (selectVerificationMethodChimeraActivity != null) {
            if (message.getData().getInt("data_request_type") == 13) {
                bnsl a = SelectVerificationMethodChimeraActivity.f108854b.mo26019b(aske.m74275a());
                a.mo68432a("atra", "handleMessage", 1326, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                a.mo68405a("Handling the result of submitting an activation code");
                selectVerificationMethodChimeraActivity.f108869j = false;
            }
            int i = message.what;
            if (i != 107) {
                if (i == 6001) {
                    try {
                        btlq btlq = (btlq) atxo.m76510a(message, "data_response", btlq.f149405b);
                        if (btlq.f149407a.size() != 0) {
                            ArrayList arrayList = new ArrayList();
                            ArrayList arrayList2 = new ArrayList();
                            bxwc bxwc = btlq.f149407a;
                            int size = bxwc.size();
                            boolean z = true;
                            for (int i2 = 0; i2 < size; i2++) {
                                btjx btjx = (btjx) bxwc.get(i2);
                                if (!btjx.f149200g) {
                                    z = false;
                                }
                                if (z) {
                                    arrayList.add(btjx);
                                }
                                arrayList2.add(btjx);
                            }
                            if (arrayList.isEmpty()) {
                                arrayList.addAll(arrayList2);
                            }
                            selectVerificationMethodChimeraActivity.mo59462a(arrayList);
                            TextView textView = (TextView) selectVerificationMethodChimeraActivity.findViewById(C0126R.C0129id.OtherMethodsButton);
                            if (arrayList2.size() > arrayList.size()) {
                                textView.setOnClickListener(new atqv(selectVerificationMethodChimeraActivity, arrayList2, textView));
                                textView.setVisibility(0);
                            } else {
                                textView.setVisibility(8);
                            }
                            selectVerificationMethodChimeraActivity.mo59463a(true);
                            return;
                        }
                        bnsl bnsl = (bnsl) SelectVerificationMethodChimeraActivity.f108854b.mo68388c();
                        bnsl.mo68432a("atra", "handleMessage", 1376, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl.mo68405a("received empty list of activation methods");
                        return;
                    } catch (bxwf e) {
                        selectVerificationMethodChimeraActivity.mo59459a(e);
                        return;
                    }
                } else if (i == 7001) {
                    VerificationMethodView l = selectVerificationMethodChimeraActivity.mo59472l();
                    selectVerificationMethodChimeraActivity.f108866g = l.f108930a;
                    btnv a2 = btnv.m116964a(selectVerificationMethodChimeraActivity.f108866g.f149197d);
                    if (a2 == null) {
                        a2 = btnv.UNRECOGNIZED;
                    }
                    if (atvi.m76456a(a2)) {
                        selectVerificationMethodChimeraActivity.mo59465b(false);
                        return;
                    } else if (l.f108933d != null) {
                        int i3 = l.f108935f;
                        if (i3 < 0) {
                            bnsl a3 = SelectVerificationMethodChimeraActivity.f108854b.mo26019b(aske.m74275a());
                            a3.mo68432a("atra", "handleMessage", 1394, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            a3.mo68405a("Starting verification method from intent");
                            selectVerificationMethodChimeraActivity.startActivity(l.f108933d);
                            return;
                        }
                        bnsl a4 = SelectVerificationMethodChimeraActivity.f108854b.mo26019b(aske.m74275a());
                        a4.mo68432a("atra", "handleMessage", 1397, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        a4.mo68405a("Starting verification method from intent for result");
                        selectVerificationMethodChimeraActivity.startActivityForResult(l.f108933d, i3);
                        return;
                    } else if (l.f108934e != null) {
                        selectVerificationMethodChimeraActivity.mo59463a(true);
                        Toast.makeText(selectVerificationMethodChimeraActivity, l.f108934e, 0).show();
                        return;
                    } else {
                        return;
                    }
                } else if (i == 8001) {
                    try {
                        btjx btjx2 = (btjx) atxo.m76510a(message, "data_response", btjx.f149192h);
                        btnv a5 = btnv.m116964a(btjx2.f149197d);
                        if (a5 == null) {
                            a5 = btnv.UNRECOGNIZED;
                        }
                        if (a5 != btnv.UNKNOWN_ACTIVATION_METHOD_TYPE) {
                            selectVerificationMethodChimeraActivity.f108866g = btjx2;
                        }
                        btnv a6 = btnv.m116964a(btjx2.f149197d);
                        if (a6 == null) {
                            a6 = btnv.UNRECOGNIZED;
                        }
                        btnv btnv = btnv.RECEIVE_CALL;
                        if (a6 == btnv) {
                            selectVerificationMethodChimeraActivity.mo59466c(true);
                        }
                        btnv a7 = btnv.m116964a(btjx2.f149197d);
                        if (a7 == null) {
                            a7 = btnv.UNRECOGNIZED;
                        }
                        if (atvi.m76456a(a7)) {
                            if (a6 != btnv) {
                                selectVerificationMethodChimeraActivity.mo59465b(true);
                                return;
                            }
                        }
                        selectVerificationMethodChimeraActivity.mo59470i();
                        selectVerificationMethodChimeraActivity.mo59474n();
                        return;
                    } catch (bxwf e2) {
                        selectVerificationMethodChimeraActivity.mo59459a(e2);
                        return;
                    }
                } else if (i != 13001) {
                    switch (i) {
                        case 101:
                            break;
                        case 102:
                            selectVerificationMethodChimeraActivity.mo59463a(true);
                            try {
                                selectVerificationMethodChimeraActivity.mo59464b((btnf) atxo.m76510a(message, "tap_and_pay_api_error", btnf.f149600f));
                                return;
                            } catch (bxwf e3) {
                                selectVerificationMethodChimeraActivity.mo59464b((btnf) null);
                                return;
                            }
                        case ErrorInfo.TYPE_SDU_COMMUNICATIONERROR:
                            selectVerificationMethodChimeraActivity.mo59463a(true);
                            selectVerificationMethodChimeraActivity.f108866g = null;
                            break;
                        case ErrorInfo.TYPE_SDU_FAILED:
                            selectVerificationMethodChimeraActivity.mo59468g();
                            return;
                        default:
                            switch (i) {
                                case 109:
                                    selectVerificationMethodChimeraActivity.mo59463a(true);
                                    int i4 = message.getData().getInt("data_activation_method_type");
                                    Map map = atvi.f91009a;
                                    Integer valueOf = Integer.valueOf(i4);
                                    if (map.get(valueOf) != null) {
                                        selectVerificationMethodChimeraActivity.mo59461a(selectVerificationMethodChimeraActivity.getString(((Integer) atvi.f91009a.get(valueOf)).intValue()), selectVerificationMethodChimeraActivity.getString(C0126R.string.tp_activation_otp_no_resends_error_body), selectVerificationMethodChimeraActivity.getString(C0126R.string.common_ok), ErrorInfo.TYPE_ACTIVATE_FELICA_HTTP_ERROR);
                                        return;
                                    } else {
                                        selectVerificationMethodChimeraActivity.mo59458a((btnf) null);
                                        return;
                                    }
                                case 110:
                                case 111:
                                case AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS /*112*/:
                                case 113:
                                    break;
                                default:
                                    super.handleMessage(message);
                                    return;
                            }
                    }
                    selectVerificationMethodChimeraActivity.mo59463a(true);
                    try {
                        selectVerificationMethodChimeraActivity.mo59458a((btnf) atxo.m76511b(message, "tap_and_pay_api_error", btnf.f149600f));
                        return;
                    } catch (bxwf e4) {
                        selectVerificationMethodChimeraActivity.mo59464b((btnf) null);
                        return;
                    }
                } else {
                    selectVerificationMethodChimeraActivity.mo59463a(true);
                    try {
                        if (((btmn) atxo.m76510a(message, "data_response", btmn.f149517b)).f149519a) {
                            selectVerificationMethodChimeraActivity.setResult(-1);
                            bnsl a8 = SelectVerificationMethodChimeraActivity.f108854b.mo26019b(aske.m74275a());
                            a8.mo68432a("atra", "handleMessage", 1414, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            a8.mo68405a("Activation code was accepted and the card has been verified");
                            selectVerificationMethodChimeraActivity.finish();
                            return;
                        }
                        bnsl a9 = SelectVerificationMethodChimeraActivity.f108854b.mo26019b(aske.m74275a());
                        a9.mo68432a("atra", "handleMessage", 1418, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        a9.mo68405a("Activation code was rejected");
                        selectVerificationMethodChimeraActivity.mo59475o();
                        return;
                    } catch (bxwf e5) {
                        selectVerificationMethodChimeraActivity.mo59459a(e5);
                        return;
                    }
                }
            }
            selectVerificationMethodChimeraActivity.mo59463a(true);
            try {
                btnf btnf = (btnf) atxo.m76511b(message, "tap_and_pay_api_error", btnf.f149600f);
                if (btnf != null) {
                    if (!stm.m36302d(btnf.f149604c)) {
                        str = btnf.f149604c;
                        if (btnf == null) {
                            if (!stm.m36302d(btnf.f149603b)) {
                                str2 = btnf.f149603b;
                                selectVerificationMethodChimeraActivity.mo59461a(str2, str, selectVerificationMethodChimeraActivity.getString(C0126R.string.common_ok), 203);
                            }
                        }
                        str2 = selectVerificationMethodChimeraActivity.getString(C0126R.string.tp_activation_code_error_title);
                        selectVerificationMethodChimeraActivity.mo59461a(str2, str, selectVerificationMethodChimeraActivity.getString(C0126R.string.common_ok), 203);
                    }
                }
                str = selectVerificationMethodChimeraActivity.getString(C0126R.string.tp_generic_error_content);
                if (btnf == null) {
                }
                str2 = selectVerificationMethodChimeraActivity.getString(C0126R.string.tp_activation_code_error_title);
                selectVerificationMethodChimeraActivity.mo59461a(str2, str, selectVerificationMethodChimeraActivity.getString(C0126R.string.common_ok), 203);
            } catch (bxwf e6) {
                selectVerificationMethodChimeraActivity.mo59464b((btnf) null);
            }
        }
    }
}
