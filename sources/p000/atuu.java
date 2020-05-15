package p000;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import com.felicanetworks.mfc.C0126R;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import com.google.android.gms.tapandpay.tokenization.TokenizePanChimeraService;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: atuu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atuu extends atvb {

    /* renamed from: a */
    private static final srn f90937a = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: b */
    private static final btnv[] f90938b = {btnv.SMS, btnv.EMAIL, btnv.PLACE_CALL, btnv.RECEIVE_CALL, btnv.WEB_URL, btnv.APP, btnv.ISSUER_STATEMENT};

    /* renamed from: c */
    private final String f90939c;

    /* renamed from: h */
    private final askf f90940h;

    /* renamed from: i */
    private final byte[] f90941i;

    /* renamed from: j */
    private final String f90942j;

    /* renamed from: k */
    private final atds f90943k;

    public atuu(String str, askf askf, Messenger messenger, byte[] bArr, String str2, TokenizePanChimeraService tokenizePanChimeraService) {
        super(tokenizePanChimeraService);
        this.f90939c = str;
        this.f90940h = askf;
        this.f90986e = messenger;
        this.f90941i = bArr;
        this.f90942j = str2;
        this.f90943k = atds.m75666a(askf);
    }

    /* renamed from: a */
    public static Message m76414a(String str, AccountInfo accountInfo, String str2, byte[] bArr, String str3, Handler handler) {
        Bundle bundle = new Bundle();
        bundle.putString("data_billing_id", str);
        bundle.putByteArray("data_activation_receipt", bArr);
        bundle.putString("data_session_id", str3);
        return atvb.m76438a(6, bundle, accountInfo, str2, handler);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        try {
            btlo btlo = (btlo) btlp.f149399e.mo74144da();
            btiy a = this.f90943k.mo49843a(this.f90939c);
            if (btlo.f164950c) {
                btlo.mo74035c();
                btlo.f164950c = false;
            }
            btlp btlp = (btlp) btlo.f164949b;
            a.getClass();
            btlp.f149401a = a;
            String str = this.f90942j;
            str.getClass();
            btlp.f149402b = str;
            btlo.mo70826a(Arrays.asList(f90938b));
            byte[] bArr = this.f90941i;
            if (bArr != null) {
                ByteString a2 = ByteString.m123261a(bArr);
                if (btlo.f164950c) {
                    btlo.mo74035c();
                    btlo.f164950c = false;
                }
                a2.getClass();
                ((btlp) btlo.f164949b).f149403c = a2;
            }
            return (btlq) atff.m75759a(this.f90940h, "t/cardtokenization/listactivationmethods", btlo.mo74062i(), btlq.f149405b);
        } catch (atfh e) {
            btmu a3 = atvb.m76439a(e.f90231a);
            if (a3 != null) {
                int b = btmt.m116934b(a3.f149548a);
                if (b == 0) {
                    b = 1;
                }
                int i = b - 2;
                if (i != 1) {
                    if (i == 8) {
                        try {
                            this.f90943k.mo49855b(this.f90939c, 4);
                        } catch (asks e2) {
                            bnsl bnsl = (bnsl) f90937a.mo68388c();
                            bnsl.mo68437a(e2);
                            bnsl.mo68432a("atuu", "a", 147, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl.mo68405a("Error deleting token to restart tokenization");
                        }
                        this.f90988g = 102;
                    } else if (i == 12) {
                        this.f90988g = ErrorInfo.TYPE_SDU_FAILED;
                    }
                    this.f90987f = e.f90231a;
                    return null;
                }
                try {
                    this.f90943k.mo49859d();
                } catch (asks | atfh | IOException e3) {
                }
                this.f90988g = 102;
                this.f90987f = e.f90231a;
                return null;
            }
            this.f90988g = 101;
            this.f90987f = e.f90231a;
            return null;
        } catch (IOException e4) {
            bnsl bnsl2 = (bnsl) f90937a.mo68388c();
            bnsl2.mo68437a(e4);
            bnsl2.mo68432a("atuu", "a", 164, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("IOException when listing activation methods");
            mo50221a(this.f90940h, (int) C0126R.string.tp_verify_card_error_title, (int) C0126R.string.tp_list_activation_methods_error_content);
            return null;
        } catch (Exception e5) {
            this.f90988g = 101;
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final btlq mo50207a(Void... voidArr) {
        try {
            btlo btlo = (btlo) btlp.f149399e.mo74144da();
            btiy a = this.f90943k.mo49843a(this.f90939c);
            if (btlo.f164950c) {
                btlo.mo74035c();
                btlo.f164950c = false;
            }
            btlp btlp = (btlp) btlo.f164949b;
            a.getClass();
            btlp.f149401a = a;
            String str = this.f90942j;
            str.getClass();
            btlp.f149402b = str;
            btlo.mo70826a(Arrays.asList(f90938b));
            byte[] bArr = this.f90941i;
            if (bArr != null) {
                ByteString a2 = ByteString.m123261a(bArr);
                if (btlo.f164950c) {
                    btlo.mo74035c();
                    btlo.f164950c = false;
                }
                a2.getClass();
                ((btlp) btlo.f164949b).f149403c = a2;
            }
            return (btlq) atff.m75759a(this.f90940h, "t/cardtokenization/listactivationmethods", btlo.mo74062i(), btlq.f149405b);
        } catch (atfh e) {
            btmu a3 = atvb.m76439a(e.f90231a);
            if (a3 != null) {
                int b = btmt.m116934b(a3.f149548a);
                if (b == 0) {
                    b = 1;
                }
                int i = b - 2;
                if (i == 1) {
                    try {
                        this.f90943k.mo49859d();
                    } catch (asks | atfh | IOException e2) {
                    }
                    this.f90988g = 102;
                } else if (i == 8) {
                    try {
                        this.f90943k.mo49855b(this.f90939c, 4);
                    } catch (asks e3) {
                        bnsl bnsl = (bnsl) f90937a.mo68388c();
                        bnsl.mo68437a(e3);
                        bnsl.mo68432a("atuu", "a", 147, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl.mo68405a("Error deleting token to restart tokenization");
                    }
                    this.f90988g = 102;
                    this.f90987f = e.f90231a;
                    return null;
                } else if (i == 12) {
                    this.f90988g = ErrorInfo.TYPE_SDU_FAILED;
                }
                this.f90987f = e.f90231a;
                return null;
            }
            this.f90988g = 101;
            this.f90987f = e.f90231a;
            return null;
        } catch (IOException e4) {
            bnsl bnsl2 = (bnsl) f90937a.mo68388c();
            bnsl2.mo68437a(e4);
            bnsl2.mo68432a("atuu", "a", 164, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("IOException when listing activation methods");
            mo50221a(this.f90940h, (int) C0126R.string.tp_verify_card_error_title, (int) C0126R.string.tp_list_activation_methods_error_content);
            return null;
        } catch (Exception e5) {
            this.f90988g = 101;
            return null;
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo50195a(Object obj) {
        mo50222a((btlq) obj, 6, 6001);
    }
}
