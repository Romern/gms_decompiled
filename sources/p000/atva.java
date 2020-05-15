package p000;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import com.felicanetworks.mfc.C0126R;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import com.google.android.gms.tapandpay.firstparty.CardInfo;
import com.google.android.gms.tapandpay.tokenization.TokenizePanChimeraService;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.IOException;

/* renamed from: atva */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atva extends atvb {

    /* renamed from: a */
    private static final srn f90974a = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: b */
    private final askf f90975b;

    /* renamed from: c */
    private final CardInfo f90976c;

    /* renamed from: h */
    private final String f90977h;

    /* renamed from: i */
    private final byte[] f90978i;

    /* renamed from: j */
    private final boolean f90979j;

    /* renamed from: k */
    private final boolean f90980k;

    /* renamed from: l */
    private final String f90981l;

    /* renamed from: m */
    private final atds f90982m;

    /* renamed from: n */
    private final atam f90983n;

    /* renamed from: o */
    private final btjx f90984o;

    public atva(askf askf, CardInfo cardInfo, String str, byte[] bArr, byte[] bArr2, boolean z, boolean z2, String str2, Messenger messenger, TokenizePanChimeraService tokenizePanChimeraService) {
        super(tokenizePanChimeraService);
        btjx btjx;
        this.f90986e = messenger;
        this.f90975b = askf;
        this.f90976c = cardInfo;
        this.f90977h = str;
        this.f90978i = bArr;
        this.f90979j = z;
        this.f90980k = z2;
        this.f90981l = str2;
        this.f90982m = atds.m75666a(askf);
        this.f90983n = new atam(askf);
        try {
            btjx = (btjx) GeneratedMessageLite.m124016a(btjx.f149192h, bArr2, bxus.m123744c());
        } catch (bxwf e) {
            btjx = null;
        }
        this.f90984o = btjx;
    }

    /* renamed from: a */
    public static Message m76433a(CardInfo cardInfo, AccountInfo accountInfo, String str, byte[] bArr, String str2, String str3, boolean z, boolean z2, byte[] bArr2, Handler handler) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("data_card_info", cardInfo);
        bundle.putByteArray("data_activation_receipt", bArr);
        bundle.putString("data_session_id", str2);
        bundle.putString("activation_code", str3);
        bundle.putBoolean("is_activation_code_autofilled", z);
        bundle.putBoolean("is_activation_code_from_issuer_app", z2);
        bundle.putByteArray("data_activation_method", bArr2);
        return m76438a(13, bundle, accountInfo, str, handler);
    }

    /* renamed from: b */
    private final void m76435b() {
        int i;
        if (!this.f90982m.mo49850a(this.f90976c.f108340a, this.f90984o.f149196c.getKey())) {
            i = AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS;
        } else {
            i = 113;
        }
        this.f90988g = i;
        this.f90982m.mo49862e(this.f90976c.f108340a);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        SQLiteDatabase e;
        Void[] voidArr = (Void[]) objArr;
        btjx btjx = this.f90984o;
        if (btjx != null) {
            try {
                if (!this.f90982m.mo49856b(this.f90976c.f108340a, btjx.f149196c.getKey())) {
                    atds atds = this.f90982m;
                    asik asik = atds.mo49851b(atds.mo49861e(), this.f90976c.f108340a, this.f90984o.f149196c.getKey()).f89050c;
                    if (asik != null) {
                        if (asik.f89045a < System.currentTimeMillis()) {
                            m76435b();
                            return null;
                        }
                    }
                    bxvd da = btmm.f149510f.mo74144da();
                    bxvd da2 = btiy.f149054c.mo74144da();
                    String str = this.f90976c.f108340a;
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    str.getClass();
                    ((btiy) da2.f164949b).f149056a = str;
                    ByteString a = ByteString.m123261a(this.f90976c.f108341b);
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    a.getClass();
                    ((btiy) da2.f164949b).f149057b = a;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    btiy btiy = (btiy) da2.mo74062i();
                    btiy.getClass();
                    ((btmm) da.f164949b).f149514c = btiy;
                    String str2 = this.f90981l;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    btmm btmm = (btmm) da.f164949b;
                    str2.getClass();
                    btmm.f149515d = str2;
                    if (!this.f90980k) {
                        String str3 = this.f90977h;
                        str3.getClass();
                        btmm.f149512a = 2;
                        btmm.f149513b = str3;
                    } else {
                        String str4 = this.f90977h;
                        str4.getClass();
                        btmm.f149512a = 5;
                        btmm.f149513b = str4;
                    }
                    byte[] bArr = this.f90978i;
                    if (bArr != null) {
                        ByteString a2 = ByteString.m123261a(bArr);
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        a2.getClass();
                        ((btmm) da.f164949b).f149516e = a2;
                    }
                    btmn btmn = (btmn) atff.m75759a(this.f90975b, "t/cardtokenization/submitactivationcode", da.mo74062i(), btmn.f149517b);
                    if (!btmn.f149519a) {
                        atds atds2 = this.f90982m;
                        String str5 = this.f90976c.f108340a;
                        byte[] k = this.f90984o.f149196c.getKey();
                        e = atds2.mo49861e();
                        e.beginTransaction();
                        asil b = atds2.mo49851b(e, str5, k);
                        bxvd bxvd = (bxvd) b.mo74142c(5);
                        bxvd.mo73625a((GeneratedMessageLite) b);
                        asij asij = ((asil) bxvd.f164949b).f89048a;
                        if (asij != null) {
                            bxvd bxvd2 = (bxvd) asij.mo74142c(5);
                            bxvd2.mo73625a((GeneratedMessageLite) asij);
                            int i = ((asij) bxvd2.f164949b).f89042b + 1;
                            if (bxvd2.f164950c) {
                                bxvd2.mo74035c();
                                bxvd2.f164950c = false;
                            }
                            ((asij) bxvd2.f164949b).f89042b = i;
                            if (bxvd.f164950c) {
                                bxvd.mo74035c();
                                bxvd.f164950c = false;
                            }
                            asij asij2 = (asij) bxvd2.mo74062i();
                            asil asil = asil.f89046d;
                            asij2.getClass();
                            ((asil) bxvd.f164949b).f89048a = asij2;
                            atds2.mo49847a(e, str5, k, (asil) bxvd.mo74062i());
                        }
                        e.setTransactionSuccessful();
                        e.endTransaction();
                        if (this.f90982m.mo49856b(this.f90976c.f108340a, this.f90984o.f149196c.getKey())) {
                            m76434a();
                            return null;
                        }
                    }
                    return btmn;
                }
                m76434a();
            } catch (atfh e2) {
                atfh atfh = e2;
                btmu a3 = atvb.m76439a(atfh.f90231a);
                if (a3 != null) {
                    int b2 = btmt.m116934b(a3.f149548a);
                    if (b2 == 0) {
                        b2 = 1;
                    }
                    int i2 = b2 - 2;
                    if (i2 != 1) {
                        if (i2 == 12) {
                            this.f90988g = ErrorInfo.TYPE_SDU_FAILED;
                        } else if (i2 != 13) {
                            switch (i2) {
                                case 6:
                                    try {
                                        m76434a();
                                        return null;
                                    } catch (asks e3) {
                                        bnsl bnsl = (bnsl) f90974a.mo68388c();
                                        bnsl.mo68437a(e3);
                                        bnsl.mo68432a("atva", "a", 231, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                        bnsl.mo68405a("Error dealing with ACTIVATION_ATTEMPT_LIMIT_EXCEEDED");
                                        return null;
                                    }
                                case 7:
                                    try {
                                        m76435b();
                                        return null;
                                    } catch (asks e4) {
                                        bnsl bnsl2 = (bnsl) f90974a.mo68388c();
                                        bnsl2.mo68437a(e4);
                                        bnsl2.mo68432a("atva", "a", 239, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                        bnsl2.mo68405a("Error dealing with ACTIVATION_CODE_EXPIRED");
                                        return null;
                                    }
                                case 8:
                                    try {
                                        this.f90982m.mo49855b(this.f90976c.f108340a, 4);
                                    } catch (asks e5) {
                                        bnsl bnsl3 = (bnsl) f90974a.mo68388c();
                                        bnsl3.mo68437a(e5);
                                        bnsl3.mo68432a("atva", "a", 254, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                        bnsl3.mo68405a("Error deleting token when restarting tokenization");
                                    }
                                    this.f90988g = 102;
                                    break;
                                case 9:
                                    this.f90982m.mo49862e(this.f90976c.f108340a);
                                    this.f90988g = 102;
                                    this.f90987f = atfh.f90231a;
                                    return null;
                            }
                        } else {
                            this.f90982m.mo49862e(this.f90976c.f108340a);
                            this.f90988g = ErrorInfo.TYPE_SDU_COMMUNICATIONERROR;
                            this.f90987f = atfh.f90231a;
                            return null;
                        }
                        this.f90987f = atfh.f90231a;
                        return null;
                    }
                    try {
                        this.f90982m.mo49859d();
                    } catch (asks | atfh | IOException e6) {
                    }
                    this.f90988g = 102;
                    this.f90987f = atfh.f90231a;
                    return null;
                }
                this.f90988g = 101;
                this.f90987f = atfh.f90231a;
                return null;
            } catch (IOException e7) {
                bnsl bnsl4 = (bnsl) f90974a.mo68388c();
                bnsl4.mo68437a(e7);
                bnsl4.mo68432a("atva", "a", 273, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl4.mo68405a("IOException when selecting activation methods");
                mo50221a(this.f90975b, (int) C0126R.string.tp_verify_card_error_title, (int) C0126R.string.tp_add_card_error_content);
                return null;
            } catch (asks | RuntimeException e8) {
                bnsl bnsl5 = (bnsl) f90974a.mo68388c();
                bnsl5.mo68437a(e8);
                bnsl5.mo68432a("atva", "a", 281, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl5.mo68405a("Error submitting activation code");
                this.f90988g = 101;
                return null;
            } catch (Throwable th) {
                e.endTransaction();
                throw th;
            }
        } else {
            this.f90988g = 102;
        }
        return null;
    }

    /* renamed from: a */
    private final void m76434a() {
        int i;
        if (!this.f90982m.mo49850a(this.f90976c.f108340a, this.f90984o.f149196c.getKey())) {
            i = 110;
        } else {
            i = 111;
        }
        this.f90988g = i;
        this.f90982m.mo49862e(this.f90976c.f108340a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final btmn mo50219a(Void... voidArr) {
        SQLiteDatabase e;
        btjx btjx = this.f90984o;
        if (btjx != null) {
            try {
                if (!this.f90982m.mo49856b(this.f90976c.f108340a, btjx.f149196c.getKey())) {
                    atds atds = this.f90982m;
                    asik asik = atds.mo49851b(atds.mo49861e(), this.f90976c.f108340a, this.f90984o.f149196c.getKey()).f89050c;
                    if (asik != null) {
                        if (asik.f89045a < System.currentTimeMillis()) {
                            m76435b();
                            return null;
                        }
                    }
                    bxvd da = btmm.f149510f.mo74144da();
                    bxvd da2 = btiy.f149054c.mo74144da();
                    String str = this.f90976c.f108340a;
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    str.getClass();
                    ((btiy) da2.f164949b).f149056a = str;
                    ByteString a = ByteString.m123261a(this.f90976c.f108341b);
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    a.getClass();
                    ((btiy) da2.f164949b).f149057b = a;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    btiy btiy = (btiy) da2.mo74062i();
                    btiy.getClass();
                    ((btmm) da.f164949b).f149514c = btiy;
                    String str2 = this.f90981l;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    btmm btmm = (btmm) da.f164949b;
                    str2.getClass();
                    btmm.f149515d = str2;
                    if (!this.f90980k) {
                        String str3 = this.f90977h;
                        str3.getClass();
                        btmm.f149512a = 2;
                        btmm.f149513b = str3;
                    } else {
                        String str4 = this.f90977h;
                        str4.getClass();
                        btmm.f149512a = 5;
                        btmm.f149513b = str4;
                    }
                    byte[] bArr = this.f90978i;
                    if (bArr != null) {
                        ByteString a2 = ByteString.m123261a(bArr);
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        a2.getClass();
                        ((btmm) da.f164949b).f149516e = a2;
                    }
                    btmn btmn = (btmn) atff.m75759a(this.f90975b, "t/cardtokenization/submitactivationcode", da.mo74062i(), btmn.f149517b);
                    if (!btmn.f149519a) {
                        atds atds2 = this.f90982m;
                        String str5 = this.f90976c.f108340a;
                        byte[] k = this.f90984o.f149196c.getKey();
                        e = atds2.mo49861e();
                        e.beginTransaction();
                        asil b = atds2.mo49851b(e, str5, k);
                        bxvd bxvd = (bxvd) b.mo74142c(5);
                        bxvd.mo73625a((GeneratedMessageLite) b);
                        asij asij = ((asil) bxvd.f164949b).f89048a;
                        if (asij != null) {
                            bxvd bxvd2 = (bxvd) asij.mo74142c(5);
                            bxvd2.mo73625a((GeneratedMessageLite) asij);
                            int i = ((asij) bxvd2.f164949b).f89042b + 1;
                            if (bxvd2.f164950c) {
                                bxvd2.mo74035c();
                                bxvd2.f164950c = false;
                            }
                            ((asij) bxvd2.f164949b).f89042b = i;
                            if (bxvd.f164950c) {
                                bxvd.mo74035c();
                                bxvd.f164950c = false;
                            }
                            asij asij2 = (asij) bxvd2.mo74062i();
                            asil asil = asil.f89046d;
                            asij2.getClass();
                            ((asil) bxvd.f164949b).f89048a = asij2;
                            atds2.mo49847a(e, str5, k, (asil) bxvd.mo74062i());
                        }
                        e.setTransactionSuccessful();
                        e.endTransaction();
                        if (this.f90982m.mo49856b(this.f90976c.f108340a, this.f90984o.f149196c.getKey())) {
                            m76434a();
                            return null;
                        }
                    }
                    return btmn;
                }
                m76434a();
                return null;
            } catch (atfh e2) {
                atfh atfh = e2;
                btmu a3 = atvb.m76439a(atfh.f90231a);
                if (a3 != null) {
                    int b2 = btmt.m116934b(a3.f149548a);
                    if (b2 == 0) {
                        b2 = 1;
                    }
                    int i2 = b2 - 2;
                    if (i2 != 1) {
                        if (i2 == 12) {
                            this.f90988g = ErrorInfo.TYPE_SDU_FAILED;
                        } else if (i2 != 13) {
                            switch (i2) {
                                case 6:
                                    try {
                                        m76434a();
                                    } catch (asks e3) {
                                        bnsl bnsl = (bnsl) f90974a.mo68388c();
                                        bnsl.mo68437a(e3);
                                        bnsl.mo68432a("atva", "a", 231, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                        bnsl.mo68405a("Error dealing with ACTIVATION_ATTEMPT_LIMIT_EXCEEDED");
                                    }
                                    return null;
                                case 7:
                                    try {
                                        m76435b();
                                    } catch (asks e4) {
                                        bnsl bnsl2 = (bnsl) f90974a.mo68388c();
                                        bnsl2.mo68437a(e4);
                                        bnsl2.mo68432a("atva", "a", 239, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                        bnsl2.mo68405a("Error dealing with ACTIVATION_CODE_EXPIRED");
                                    }
                                    return null;
                                case 8:
                                    try {
                                        this.f90982m.mo49855b(this.f90976c.f108340a, 4);
                                    } catch (asks e5) {
                                        bnsl bnsl3 = (bnsl) f90974a.mo68388c();
                                        bnsl3.mo68437a(e5);
                                        bnsl3.mo68432a("atva", "a", 254, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                        bnsl3.mo68405a("Error deleting token when restarting tokenization");
                                    }
                                    this.f90988g = 102;
                                    break;
                                case 9:
                                    this.f90982m.mo49862e(this.f90976c.f108340a);
                                    this.f90988g = 102;
                                    this.f90987f = atfh.f90231a;
                                    return null;
                            }
                        } else {
                            this.f90982m.mo49862e(this.f90976c.f108340a);
                            this.f90988g = ErrorInfo.TYPE_SDU_COMMUNICATIONERROR;
                            this.f90987f = atfh.f90231a;
                            return null;
                        }
                        this.f90987f = atfh.f90231a;
                        return null;
                    }
                    try {
                        this.f90982m.mo49859d();
                    } catch (asks | atfh | IOException e6) {
                    }
                    this.f90988g = 102;
                    this.f90987f = atfh.f90231a;
                    return null;
                }
                this.f90988g = 101;
                this.f90987f = atfh.f90231a;
                return null;
            } catch (IOException e7) {
                bnsl bnsl4 = (bnsl) f90974a.mo68388c();
                bnsl4.mo68437a(e7);
                bnsl4.mo68432a("atva", "a", 273, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl4.mo68405a("IOException when selecting activation methods");
                mo50221a(this.f90975b, (int) C0126R.string.tp_verify_card_error_title, (int) C0126R.string.tp_add_card_error_content);
                return null;
            } catch (asks | RuntimeException e8) {
                bnsl bnsl5 = (bnsl) f90974a.mo68388c();
                bnsl5.mo68437a(e8);
                bnsl5.mo68432a("atva", "a", 281, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl5.mo68405a("Error submitting activation code");
                this.f90988g = 101;
                return null;
            } catch (Throwable th) {
                e.endTransaction();
                throw th;
            }
        } else {
            this.f90988g = 102;
            return null;
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo50195a(Object obj) {
        boolean z;
        btmn btmn = (btmn) obj;
        mo50222a(btmn, 13, 13001);
        btjx btjx = this.f90984o;
        if (btjx != null) {
            atam atam = this.f90983n;
            CardInfo cardInfo = this.f90976c;
            String str = this.f90981l;
            if (btmn == null || !btmn.f149519a) {
                z = false;
            } else {
                z = true;
            }
            boolean z2 = this.f90979j;
            boolean z3 = this.f90980k;
            bxvd b = atam.mo49753b(16, cardInfo);
            bxvd da = bpav.f135548f.mo74144da();
            int a = atam.m75293a(btjx);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpav bpav = (bpav) da.f164949b;
            bpav.f135552c = a - 1;
            int i = bpav.f135550a | 2;
            bpav.f135550a = i;
            int i2 = i | 1;
            bpav.f135550a = i2;
            bpav.f135551b = z;
            int i3 = i2 | 4;
            bpav.f135550a = i3;
            bpav.f135553d = z2;
            bpav.f135550a = i3 | 8;
            bpav.f135554e = z3;
            if (b.f164950c) {
                b.mo74035c();
                b.f164950c = false;
            }
            bpbx bpbx = (bpbx) b.f164949b;
            bpav bpav2 = (bpav) da.mo74062i();
            bpbx bpbx2 = bpbx.f135635S;
            bpav2.getClass();
            bpbx.f135665k = bpav2;
            bpbx.f135655a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            atam.mo49742a((bpbx) b.mo74062i(), str);
        }
    }
}
