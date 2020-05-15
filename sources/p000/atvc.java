package p000;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.felicanetworks.mfc.C0126R;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import com.google.android.gms.tapandpay.issuer.PushTokenizeRequest;
import com.google.android.gms.tapandpay.tokenization.TokenizePanChimeraService;
import java.util.HashMap;

/* renamed from: atvc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atvc extends atvb {

    /* renamed from: b */
    static final HashMap f90989b = new HashMap();

    /* renamed from: c */
    private static final srn f90990c = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: a */
    final atbq f90991a;

    /* renamed from: h */
    private byte[] f90992h = null;

    /* renamed from: i */
    private final btiy f90993i;

    /* renamed from: j */
    private final askf f90994j;

    /* renamed from: k */
    private final String f90995k;

    /* renamed from: l */
    private final byte[] f90996l;

    /* renamed from: m */
    private final String f90997m;

    /* renamed from: n */
    private final String f90998n;

    /* renamed from: o */
    private final String f90999o;

    /* renamed from: p */
    private final String f91000p;

    /* renamed from: q */
    private final PushTokenizeRequest f91001q;

    /* renamed from: r */
    private final boolean f91002r;

    /* renamed from: s */
    private final byte[] f91003s;

    /* renamed from: t */
    private final String f91004t;

    public atvc(askf askf, btiy btiy, String str, byte[] bArr, String str2, String str3, String str4, String str5, PushTokenizeRequest pushTokenizeRequest, boolean z, byte[] bArr2, String str6, TokenizePanChimeraService tokenizePanChimeraService, Messenger messenger) {
        super(tokenizePanChimeraService);
        this.f90994j = askf;
        this.f90986e = messenger;
        this.f90995k = str;
        this.f90996l = bArr;
        this.f90997m = str2;
        this.f90998n = str3;
        this.f90999o = str4;
        this.f91000p = str5;
        this.f91001q = pushTokenizeRequest;
        this.f90993i = btiy;
        this.f91002r = z;
        this.f91003s = bArr2;
        this.f91004t = str6;
        this.f90991a = new atbq();
    }

    /* renamed from: a */
    public static Message m76443a(byte[] bArr, byte[] bArr2, String str, byte[] bArr3, String str2, String str3, String str4, boolean z, byte[] bArr4, String str5, AccountInfo accountInfo, String str6, Handler handler) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("data_push_tokenize_request", bArr);
        bundle.putByteArray("data_card_id", bArr2);
        bundle.putString("data_cvv", str);
        bundle.putByteArray("data_eligibility_receipt", bArr3);
        bundle.putString("data_session_id", str2);
        bundle.putString("data_bundle_type", str3);
        bundle.putString("alternate_cardholder_name", str4);
        bundle.putBoolean("data_is_account_tokenization", z);
        bundle.putByteArray("data_opaque_card_data", bArr4);
        bundle.putString("data_server_session_id", str5);
        return m76438a(2, bundle, accountInfo, str6, handler);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        String str;
        String str2;
        String str3;
        Void[] voidArr = (Void[]) objArr;
        try {
            String str4 = "atvc";
            try {
                str3 = "a";
            } catch (atcz e) {
                e = e;
                str = "a";
                str2 = str4;
                bnsl bnsl = (bnsl) f90990c.mo68388c();
                bnsl.mo68437a(e);
                bnsl.mo68432a(str2, str, 132, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Couldn't create TokenizeSession");
                mo50221a(this.f90994j, (int) C0126R.string.tp_add_card_error_title, (int) C0126R.string.tp_add_card_error_content);
                return null;
            }
            try {
                atro atro = new atro(this.f90994j, this.f90993i, this.f90995k, this.f90996l, this.f90997m, this.f90998n, this.f90999o, this.f91002r, this.f91003s, this.f91004t, this.f91000p, this.f91001q, this.f90991a);
                synchronized (f90989b) {
                    if (((atro) f90989b.get(this.f90997m)) != null) {
                        f90989b.put(this.f90997m, atro);
                    } else {
                        f90989b.put(this.f90997m, atro);
                    }
                }
                try {
                    return atro.mo50148a();
                } catch (atrn e2) {
                    this.f90988g = e2.f90711a;
                    this.f90987f = e2.f90712b;
                    this.f90992h = e2.f90713c;
                    bnsl bnsl2 = (bnsl) f90990c.mo68388c();
                    bnsl2.mo68437a(e2);
                    bnsl2.mo68432a(str4, str3, (int) MfiClientException.TYPE_ILLEGAL_CARD_OPERATION, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl2.mo68405a("Got tokenization exception");
                    return null;
                }
            } catch (atcz e3) {
                e = e3;
                str2 = str4;
                str = str3;
                bnsl bnsl3 = (bnsl) f90990c.mo68388c();
                bnsl3.mo68437a(e);
                bnsl3.mo68432a(str2, str, 132, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl3.mo68405a("Couldn't create TokenizeSession");
                mo50221a(this.f90994j, (int) C0126R.string.tp_add_card_error_title, (int) C0126R.string.tp_add_card_error_content);
                return null;
            }
        } catch (atcz e4) {
            e = e4;
            str = "a";
            str2 = "atvc";
            bnsl bnsl32 = (bnsl) f90990c.mo68388c();
            bnsl32.mo68437a(e);
            bnsl32.mo68432a(str2, str, 132, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl32.mo68405a("Couldn't create TokenizeSession");
            mo50221a(this.f90994j, (int) C0126R.string.tp_add_card_error_title, (int) C0126R.string.tp_add_card_error_content);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Bundle mo50225a(Void... voidArr) {
        String str;
        String str2;
        try {
            String str3 = "atvc";
            try {
                String str4 = "a";
                try {
                    atro atro = new atro(this.f90994j, this.f90993i, this.f90995k, this.f90996l, this.f90997m, this.f90998n, this.f90999o, this.f91002r, this.f91003s, this.f91004t, this.f91000p, this.f91001q, this.f90991a);
                    synchronized (f90989b) {
                        if (((atro) f90989b.get(this.f90997m)) != null) {
                            f90989b.put(this.f90997m, atro);
                        } else {
                            f90989b.put(this.f90997m, atro);
                        }
                    }
                    try {
                        return atro.mo50148a();
                    } catch (atrn e) {
                        this.f90988g = e.f90711a;
                        this.f90987f = e.f90712b;
                        this.f90992h = e.f90713c;
                        bnsl bnsl = (bnsl) f90990c.mo68388c();
                        bnsl.mo68437a(e);
                        bnsl.mo68432a(str3, str4, (int) MfiClientException.TYPE_ILLEGAL_CARD_OPERATION, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl.mo68405a("Got tokenization exception");
                        return null;
                    }
                } catch (atcz e2) {
                    e = e2;
                    str2 = str3;
                    str = str4;
                    bnsl bnsl2 = (bnsl) f90990c.mo68388c();
                    bnsl2.mo68437a(e);
                    bnsl2.mo68432a(str2, str, 132, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl2.mo68405a("Couldn't create TokenizeSession");
                    mo50221a(this.f90994j, (int) C0126R.string.tp_add_card_error_title, (int) C0126R.string.tp_add_card_error_content);
                    return null;
                }
            } catch (atcz e3) {
                e = e3;
                str = "a";
                str2 = str3;
                bnsl bnsl22 = (bnsl) f90990c.mo68388c();
                bnsl22.mo68437a(e);
                bnsl22.mo68432a(str2, str, 132, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl22.mo68405a("Couldn't create TokenizeSession");
                mo50221a(this.f90994j, (int) C0126R.string.tp_add_card_error_title, (int) C0126R.string.tp_add_card_error_content);
                return null;
            }
        } catch (atcz e4) {
            e = e4;
            str = "a";
            str2 = "atvc";
            bnsl bnsl222 = (bnsl) f90990c.mo68388c();
            bnsl222.mo68437a(e);
            bnsl222.mo68432a(str2, str, 132, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl222.mo68405a("Couldn't create TokenizeSession");
            mo50221a(this.f90994j, (int) C0126R.string.tp_add_card_error_title, (int) C0126R.string.tp_add_card_error_content);
            return null;
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo50195a(Object obj) {
        Message message;
        Bundle bundle;
        Bundle bundle2 = (Bundle) obj;
        byte[] bArr = null;
        if (bundle2 == null) {
            try {
                message = Message.obtain((Handler) null, this.f90988g);
                btnf btnf = this.f90987f;
                if (btnf != null) {
                    bArr = btnf.serializeToBytes();
                }
                bundle = new Bundle();
                bundle.putByteArray("tap_and_pay_api_error", bArr);
                bundle.putByteArray("data_recovery_token", this.f90992h);
            } catch (RemoteException e) {
                return;
            }
        } else {
            bundle = bundle2;
            message = Message.obtain((Handler) null, 1002);
        }
        message.setData(bundle);
        this.f90986e.send(message);
    }
}
