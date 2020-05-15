package p000;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.felicanetworks.mfc.C0126R;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import com.google.android.gms.tapandpay.firstparty.CardInfo;
import com.google.android.gms.tapandpay.tokenization.TokenizePanChimeraService;
import java.io.IOException;

/* renamed from: atuy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atuy extends atvb {

    /* renamed from: a */
    private static final srn f90962a = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: b */
    private final String f90963b;

    /* renamed from: c */
    private final askf f90964c;

    /* renamed from: h */
    private final byte[] f90965h;

    /* renamed from: i */
    private final String f90966i;

    /* renamed from: j */
    private final byte[] f90967j;

    /* renamed from: k */
    private final atds f90968k;

    /* renamed from: l */
    private final atam f90969l;

    /* renamed from: m */
    private btnv f90970m = btnv.UNKNOWN_ACTIVATION_METHOD_TYPE;

    public atuy(String str, askf askf, Messenger messenger, byte[] bArr, String str2, byte[] bArr2, TokenizePanChimeraService tokenizePanChimeraService) {
        super(tokenizePanChimeraService);
        this.f90963b = str;
        this.f90964c = askf;
        this.f90986e = messenger;
        this.f90965h = bArr;
        this.f90966i = str2;
        this.f90967j = bArr2;
        this.f90968k = atds.m75666a(askf);
        this.f90969l = new atam(askf);
    }

    /* renamed from: a */
    public static Message m76426a(String str, AccountInfo accountInfo, String str2, byte[] bArr, byte[] bArr2, String str3, Handler handler) {
        Bundle bundle = new Bundle();
        bundle.putString("data_billing_id", str);
        bundle.putByteArray("data_activation_receipt", bArr);
        bundle.putString("data_session_id", str3);
        bundle.putByteArray("data_activation_method", bArr2);
        return m76438a(7, bundle, accountInfo, str2, handler);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        btka btka;
        btka btka2;
        SQLiteDatabase e;
        btjx btjx;
        int i;
        Void[] voidArr = (Void[]) objArr;
        try {
            btjx btjx2 = (btjx) bxvk.m124016a(btjx.f149192h, this.f90967j, bxus.m123744c());
            btnv a = btnv.m116964a(btjx2.f149197d);
            if (a == null) {
                a = btnv.UNRECOGNIZED;
            }
            this.f90970m = a;
            if (!this.f90968k.mo49850a(this.f90963b, btjx2.f149196c.mo73780k())) {
                bxvd da = btmh.f149485e.mo74144da();
                btiy a2 = this.f90968k.mo49843a(this.f90963b);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                btmh btmh = (btmh) da.f164949b;
                a2.getClass();
                btmh.f149487a = a2;
                String str = this.f90966i;
                str.getClass();
                btmh.f149489c = str;
                bxtx bxtx = btjx2.f149196c;
                bxtx.getClass();
                btmh.f149488b = bxtx;
                byte[] bArr = this.f90965h;
                if (bArr != null) {
                    bxtx a3 = bxtx.m123261a(bArr);
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    a3.getClass();
                    ((btmh) da.f164949b).f149490d = a3;
                }
                btmk btmk = (btmk) atff.m75759a(this.f90964c, "t/cardtokenization/selectactivationmethod", da.mo74062i(), btmk.f149498c);
                atds atds = this.f90968k;
                String str2 = this.f90963b;
                e = atds.mo49861e();
                e.beginTransaction();
                atds.mo49846a(e, str2, btjx2.mo73642k());
                asil b = atds.mo49851b(e, str2, btjx2.f149196c.mo73780k());
                bxvd da2 = asil.f89046d.mo74144da();
                btmj btmj = btmk.f149501b;
                if (btmj != null && btmj.f149497a > 0) {
                    bxvd da3 = asii.f89035c.mo74144da();
                    btmj btmj2 = btmk.f149501b;
                    if (btmj2 == null) {
                        btmj2 = btmj.f149495b;
                    }
                    int i2 = btmj2.f149497a;
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    asii asii = (asii) da3.f164949b;
                    asii.f89037a = i2;
                    asii asii2 = b.f89049b;
                    if (asii2 != null) {
                        i = asii2.f89038b + 1;
                    } else {
                        i = 1;
                    }
                    asii.f89038b = i;
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    asii asii3 = (asii) da3.mo74062i();
                    asii3.getClass();
                    ((asil) da2.f164949b).f89049b = asii3;
                }
                btmi btmi = btmk.f149500a;
                if (btmi != null) {
                    if (btmi.f149494b > 0) {
                        bxvd da4 = asik.f89043b.mo74144da();
                        long currentTimeMillis = System.currentTimeMillis();
                        btmi btmi2 = btmk.f149500a;
                        if (btmi2 == null) {
                            btmi2 = btmi.f149491c;
                        }
                        btjx = btjx2;
                        long j = currentTimeMillis + btmi2.f149494b;
                        if (da4.f164950c) {
                            da4.mo74035c();
                            da4.f164950c = false;
                        }
                        ((asik) da4.f164949b).f89045a = j;
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        asik asik = (asik) da4.mo74062i();
                        asik.getClass();
                        ((asil) da2.f164949b).f89050c = asik;
                    } else {
                        btjx = btjx2;
                    }
                    btmi btmi3 = btmk.f149500a;
                    if (btmi3 == null) {
                        btmi3 = btmi.f149491c;
                    }
                    if (btmi3.f149493a > 0) {
                        bxvd da5 = asij.f89039c.mo74144da();
                        btmi btmi4 = btmk.f149500a;
                        if (btmi4 == null) {
                            btmi4 = btmi.f149491c;
                        }
                        int i3 = btmi4.f149493a;
                        if (da5.f164950c) {
                            da5.mo74035c();
                            da5.f164950c = false;
                        }
                        ((asij) da5.f164949b).f89041a = i3;
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        asij asij = (asij) da5.mo74062i();
                        asij.getClass();
                        ((asil) da2.f164949b).f89048a = asij;
                    }
                } else {
                    btjx = btjx2;
                }
                atds.mo49847a(e, str2, btjx.f149196c.mo73780k(), (asil) da2.mo74062i());
                e.setTransactionSuccessful();
                e.endTransaction();
                return true;
            }
            this.f90988g = 109;
            return null;
        } catch (atfh e2) {
            atfh atfh = e2;
            btmu a4 = atvb.m76439a(atfh.f90231a);
            if (a4 != null) {
                int b2 = btmt.m116934b(a4.f149548a);
                if (b2 == 0) {
                    b2 = 1;
                }
                int i4 = b2 - 2;
                if (i4 != 1) {
                    if (i4 == 8) {
                        try {
                            this.f90968k.mo49855b(this.f90963b, 4);
                        } catch (asks e3) {
                            bnsl bnsl = (bnsl) f90962a.mo68388c();
                            bnsl.mo68437a(e3);
                            bnsl.mo68432a("atuy", "a", 171, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl.mo68405a("Error deleting token when restarting tokenization");
                        }
                        this.f90988g = 102;
                    } else if (i4 == 9) {
                        this.f90968k.mo49862e(this.f90963b);
                        this.f90988g = 102;
                        this.f90987f = atfh.f90231a;
                        return null;
                    } else if (i4 == 12) {
                        this.f90988g = ErrorInfo.TYPE_SDU_FAILED;
                    } else if (i4 == 13) {
                        this.f90968k.mo49862e(this.f90963b);
                        this.f90988g = ErrorInfo.TYPE_SDU_COMMUNICATIONERROR;
                        this.f90987f = atfh.f90231a;
                        try {
                            CardInfo b3 = this.f90968k.mo49853b(this.f90963b);
                            if (b3 != null) {
                                atam atam = this.f90969l;
                                String str3 = this.f90966i;
                                btjx btjx3 = (btjx) bxvk.m124016a(btjx.f149192h, this.f90967j, bxus.m123744c());
                                bxvd b4 = atam.mo49753b(32, b3);
                                bxvd da6 = bpaq.f135525e.mo74144da();
                                int a5 = atam.m75293a(btjx3);
                                if (da6.f164950c) {
                                    da6.mo74035c();
                                    da6.f164950c = false;
                                }
                                bpaq bpaq = (bpaq) da6.f164949b;
                                bpaq.f135528b = a5 - 1;
                                bpaq.f135527a |= 1;
                                if (btjx3.f149194a == 5) {
                                    bxvd da7 = boxg.f135244e.mo74144da();
                                    if (btjx3.f149194a == 5) {
                                        btka = (btka) btjx3.f149195b;
                                    } else {
                                        btka = btka.f149211f;
                                    }
                                    String str4 = btka.f149214b;
                                    if (da7.f164950c) {
                                        da7.mo74035c();
                                        da7.f164950c = false;
                                    }
                                    boxg boxg = (boxg) da7.f164949b;
                                    str4.getClass();
                                    boxg.f135246a |= 2;
                                    boxg.f135248c = str4;
                                    if (btjx3.f149194a == 5) {
                                        btka2 = (btka) btjx3.f149195b;
                                    } else {
                                        btka2 = btka.f149211f;
                                    }
                                    String str5 = btka2.f149213a;
                                    if (da7.f164950c) {
                                        da7.mo74035c();
                                        da7.f164950c = false;
                                    }
                                    boxg boxg2 = (boxg) da7.f164949b;
                                    str5.getClass();
                                    boxg2.f135246a |= 1;
                                    boxg2.f135247b = str5;
                                    if (da6.f164950c) {
                                        da6.mo74035c();
                                        da6.f164950c = false;
                                    }
                                    bpaq bpaq2 = (bpaq) da6.f164949b;
                                    boxg boxg3 = (boxg) da7.mo74062i();
                                    boxg3.getClass();
                                    bpaq2.f135529c = boxg3;
                                    bpaq2.f135527a |= 2;
                                }
                                if (b4.f164950c) {
                                    b4.mo74035c();
                                    b4.f164950c = false;
                                }
                                bpbx bpbx = (bpbx) b4.f164949b;
                                bpaq bpaq3 = (bpaq) da6.mo74062i();
                                bpbx bpbx2 = bpbx.f135635S;
                                bpaq3.getClass();
                                bpbx.f135664j = bpaq3;
                                bpbx.f135655a |= 128;
                                atam.mo49742a((bpbx) b4.mo74062i(), str3);
                                return null;
                            }
                            throw new RuntimeException();
                        } catch (asks | bxwf | RuntimeException e4) {
                            bnsl bnsl2 = (bnsl) f90962a.mo68388c();
                            bnsl2.mo68437a(e4);
                            bnsl2.mo68432a("atuy", "a", 193, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl2.mo68405a("Error logging unavailable method");
                            return null;
                        }
                    }
                    this.f90987f = atfh.f90231a;
                    return null;
                }
                try {
                    this.f90968k.mo49859d();
                } catch (asks | atfh | IOException e5) {
                    bnsl bnsl3 = (bnsl) f90962a.mo68388c();
                    bnsl3.mo68437a(e5);
                    bnsl3.mo68432a("atuy", "a", (int) MfiClientException.TYPE_MFICLIENT_CURRENTLY_ONLINE, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl3.mo68405a("Unable to fetch cards");
                }
                this.f90988g = 102;
                this.f90987f = atfh.f90231a;
                return null;
            }
            this.f90988g = 101;
            this.f90987f = atfh.f90231a;
            return null;
        } catch (IOException e6) {
            bnsl bnsl4 = (bnsl) f90962a.mo68388c();
            bnsl4.mo68437a(e6);
            bnsl4.mo68432a("atuy", "a", (int) BaseMfiEventCallback.TYPE_ILLEGAL_LINKAGE_DATA, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl4.mo68405a("IOException when selecting activation methods");
            mo50221a(this.f90964c, (int) C0126R.string.tp_verify_card_error_title, (int) C0126R.string.tp_add_card_error_content);
            return null;
        } catch (Exception e7) {
            bnsl bnsl5 = (bnsl) f90962a.mo68388c();
            bnsl5.mo68437a(e7);
            bnsl5.mo68432a("atuy", "a", (int) BaseMfiEventCallback.TYPE_OPSRV_RESULT_ERROR, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl5.mo68405a("Error selecting activation method");
            this.f90988g = 101;
            return null;
        } catch (Throwable th) {
            Throwable th2 = th;
            e.endTransaction();
            throw th2;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Boolean mo50214a(Void... voidArr) {
        Boolean bool;
        btka btka;
        btka btka2;
        SQLiteDatabase e;
        btjx btjx;
        int i;
        try {
            btjx btjx2 = (btjx) bxvk.m124016a(btjx.f149192h, this.f90967j, bxus.m123744c());
            btnv a = btnv.m116964a(btjx2.f149197d);
            if (a == null) {
                a = btnv.UNRECOGNIZED;
            }
            this.f90970m = a;
            if (!this.f90968k.mo49850a(this.f90963b, btjx2.f149196c.mo73780k())) {
                bxvd da = btmh.f149485e.mo74144da();
                btiy a2 = this.f90968k.mo49843a(this.f90963b);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                btmh btmh = (btmh) da.f164949b;
                a2.getClass();
                btmh.f149487a = a2;
                String str = this.f90966i;
                str.getClass();
                btmh.f149489c = str;
                bxtx bxtx = btjx2.f149196c;
                bxtx.getClass();
                btmh.f149488b = bxtx;
                byte[] bArr = this.f90965h;
                if (bArr != null) {
                    bxtx a3 = bxtx.m123261a(bArr);
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    a3.getClass();
                    ((btmh) da.f164949b).f149490d = a3;
                }
                btmk btmk = (btmk) atff.m75759a(this.f90964c, "t/cardtokenization/selectactivationmethod", da.mo74062i(), btmk.f149498c);
                atds atds = this.f90968k;
                String str2 = this.f90963b;
                e = atds.mo49861e();
                e.beginTransaction();
                atds.mo49846a(e, str2, btjx2.mo73642k());
                asil b = atds.mo49851b(e, str2, btjx2.f149196c.mo73780k());
                bxvd da2 = asil.f89046d.mo74144da();
                btmj btmj = btmk.f149501b;
                if (btmj != null && btmj.f149497a > 0) {
                    bxvd da3 = asii.f89035c.mo74144da();
                    btmj btmj2 = btmk.f149501b;
                    if (btmj2 == null) {
                        btmj2 = btmj.f149495b;
                    }
                    int i2 = btmj2.f149497a;
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    asii asii = (asii) da3.f164949b;
                    asii.f89037a = i2;
                    asii asii2 = b.f89049b;
                    if (asii2 != null) {
                        i = asii2.f89038b + 1;
                    } else {
                        i = 1;
                    }
                    asii.f89038b = i;
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    asii asii3 = (asii) da3.mo74062i();
                    asii3.getClass();
                    ((asil) da2.f164949b).f89049b = asii3;
                }
                btmi btmi = btmk.f149500a;
                if (btmi != null) {
                    if (btmi.f149494b > 0) {
                        bxvd da4 = asik.f89043b.mo74144da();
                        long currentTimeMillis = System.currentTimeMillis();
                        btmi btmi2 = btmk.f149500a;
                        if (btmi2 == null) {
                            btmi2 = btmi.f149491c;
                        }
                        btjx = btjx2;
                        long j = currentTimeMillis + btmi2.f149494b;
                        if (da4.f164950c) {
                            da4.mo74035c();
                            da4.f164950c = false;
                        }
                        ((asik) da4.f164949b).f89045a = j;
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        asik asik = (asik) da4.mo74062i();
                        asik.getClass();
                        ((asil) da2.f164949b).f89050c = asik;
                    } else {
                        btjx = btjx2;
                    }
                    btmi btmi3 = btmk.f149500a;
                    if (btmi3 == null) {
                        btmi3 = btmi.f149491c;
                    }
                    if (btmi3.f149493a > 0) {
                        bxvd da5 = asij.f89039c.mo74144da();
                        btmi btmi4 = btmk.f149500a;
                        if (btmi4 == null) {
                            btmi4 = btmi.f149491c;
                        }
                        int i3 = btmi4.f149493a;
                        if (da5.f164950c) {
                            da5.mo74035c();
                            da5.f164950c = false;
                        }
                        ((asij) da5.f164949b).f89041a = i3;
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        asij asij = (asij) da5.mo74062i();
                        asij.getClass();
                        ((asil) da2.f164949b).f89048a = asij;
                    }
                } else {
                    btjx = btjx2;
                }
                atds.mo49847a(e, str2, btjx.f149196c.mo73780k(), (asil) da2.mo74062i());
                e.setTransactionSuccessful();
                e.endTransaction();
                return true;
            }
            this.f90988g = 109;
            return null;
        } catch (atfh e2) {
            atfh atfh = e2;
            btmu a4 = atvb.m76439a(atfh.f90231a);
            if (a4 != null) {
                int b2 = btmt.m116934b(a4.f149548a);
                if (b2 == 0) {
                    b2 = 1;
                }
                int i4 = b2 - 2;
                if (i4 == 1) {
                    try {
                        this.f90968k.mo49859d();
                    } catch (asks | atfh | IOException e3) {
                        bnsl bnsl = (bnsl) f90962a.mo68388c();
                        bnsl.mo68437a(e3);
                        bnsl.mo68432a("atuy", "a", (int) MfiClientException.TYPE_MFICLIENT_CURRENTLY_ONLINE, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl.mo68405a("Unable to fetch cards");
                    }
                    this.f90988g = 102;
                    this.f90987f = atfh.f90231a;
                    return null;
                } else if (i4 == 8) {
                    try {
                        this.f90968k.mo49855b(this.f90963b, 4);
                    } catch (asks e4) {
                        bnsl bnsl2 = (bnsl) f90962a.mo68388c();
                        bnsl2.mo68437a(e4);
                        bnsl2.mo68432a("atuy", "a", 171, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl2.mo68405a("Error deleting token when restarting tokenization");
                    }
                    this.f90988g = 102;
                    this.f90987f = atfh.f90231a;
                    return null;
                } else if (i4 == 9) {
                    this.f90968k.mo49862e(this.f90963b);
                    this.f90988g = 102;
                    this.f90987f = atfh.f90231a;
                    return null;
                } else if (i4 == 12) {
                    this.f90988g = ErrorInfo.TYPE_SDU_FAILED;
                    this.f90987f = atfh.f90231a;
                    return null;
                } else if (i4 != 13) {
                    bool = null;
                } else {
                    this.f90968k.mo49862e(this.f90963b);
                    this.f90988g = ErrorInfo.TYPE_SDU_COMMUNICATIONERROR;
                    this.f90987f = atfh.f90231a;
                    try {
                        CardInfo b3 = this.f90968k.mo49853b(this.f90963b);
                        if (b3 != null) {
                            atam atam = this.f90969l;
                            String str3 = this.f90966i;
                            btjx btjx3 = (btjx) bxvk.m124016a(btjx.f149192h, this.f90967j, bxus.m123744c());
                            bxvd b4 = atam.mo49753b(32, b3);
                            bxvd da6 = bpaq.f135525e.mo74144da();
                            int a5 = atam.m75293a(btjx3);
                            if (da6.f164950c) {
                                da6.mo74035c();
                                da6.f164950c = false;
                            }
                            bpaq bpaq = (bpaq) da6.f164949b;
                            bpaq.f135528b = a5 - 1;
                            bpaq.f135527a |= 1;
                            if (btjx3.f149194a == 5) {
                                bxvd da7 = boxg.f135244e.mo74144da();
                                if (btjx3.f149194a == 5) {
                                    btka = (btka) btjx3.f149195b;
                                } else {
                                    btka = btka.f149211f;
                                }
                                String str4 = btka.f149214b;
                                if (da7.f164950c) {
                                    da7.mo74035c();
                                    da7.f164950c = false;
                                }
                                boxg boxg = (boxg) da7.f164949b;
                                str4.getClass();
                                boxg.f135246a |= 2;
                                boxg.f135248c = str4;
                                if (btjx3.f149194a == 5) {
                                    btka2 = (btka) btjx3.f149195b;
                                } else {
                                    btka2 = btka.f149211f;
                                }
                                String str5 = btka2.f149213a;
                                if (da7.f164950c) {
                                    da7.mo74035c();
                                    da7.f164950c = false;
                                }
                                boxg boxg2 = (boxg) da7.f164949b;
                                str5.getClass();
                                boxg2.f135246a |= 1;
                                boxg2.f135247b = str5;
                                if (da6.f164950c) {
                                    da6.mo74035c();
                                    da6.f164950c = false;
                                }
                                bpaq bpaq2 = (bpaq) da6.f164949b;
                                boxg boxg3 = (boxg) da7.mo74062i();
                                boxg3.getClass();
                                bpaq2.f135529c = boxg3;
                                bpaq2.f135527a |= 2;
                            }
                            if (b4.f164950c) {
                                b4.mo74035c();
                                b4.f164950c = false;
                            }
                            bpbx bpbx = (bpbx) b4.f164949b;
                            bpaq bpaq3 = (bpaq) da6.mo74062i();
                            bpbx bpbx2 = bpbx.f135635S;
                            bpaq3.getClass();
                            bpbx.f135664j = bpaq3;
                            bpbx.f135655a |= 128;
                            atam.mo49742a((bpbx) b4.mo74062i(), str3);
                            return null;
                        }
                        throw new RuntimeException();
                    } catch (asks | bxwf | RuntimeException e5) {
                        bnsl bnsl3 = (bnsl) f90962a.mo68388c();
                        bnsl3.mo68437a(e5);
                        bnsl3.mo68432a("atuy", "a", 193, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl3.mo68405a("Error logging unavailable method");
                        return null;
                    }
                }
            } else {
                bool = null;
            }
            this.f90988g = 101;
            this.f90987f = atfh.f90231a;
            return bool;
        } catch (IOException e6) {
            bnsl bnsl4 = (bnsl) f90962a.mo68388c();
            bnsl4.mo68437a(e6);
            bnsl4.mo68432a("atuy", "a", (int) BaseMfiEventCallback.TYPE_ILLEGAL_LINKAGE_DATA, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl4.mo68405a("IOException when selecting activation methods");
            mo50221a(this.f90964c, (int) C0126R.string.tp_verify_card_error_title, (int) C0126R.string.tp_add_card_error_content);
            return null;
        } catch (Exception e7) {
            bnsl bnsl5 = (bnsl) f90962a.mo68388c();
            bnsl5.mo68437a(e7);
            bnsl5.mo68432a("atuy", "a", (int) BaseMfiEventCallback.TYPE_OPSRV_RESULT_ERROR, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl5.mo68405a("Error selecting activation method");
            this.f90988g = 101;
            return null;
        } catch (Throwable th) {
            Throwable th2 = th;
            e.endTransaction();
            throw th2;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo50215a(Boolean bool) {
        Message message;
        Bundle bundle = new Bundle();
        bundle.putInt("data_request_type", 7);
        byte[] bArr = null;
        if (bool == null) {
            try {
                message = Message.obtain((Handler) null, this.f90988g);
                btnf btnf = this.f90987f;
                if (btnf != null) {
                    bArr = btnf.mo73642k();
                }
                bundle.putByteArray("tap_and_pay_api_error", bArr);
            } catch (RemoteException e) {
                bnsl bnsl = (bnsl) f90962a.mo68388c();
                bnsl.mo68437a(e);
                bnsl.mo68432a("atuy", "a", 244, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Error replying from SelectActivationMethodAsync");
                return;
            }
        } else {
            message = Message.obtain((Handler) null, 7001);
        }
        bundle.putInt("data_activation_method_type", this.f90970m.mo3214a());
        message.setData(bundle);
        this.f90986e.send(message);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo50195a(Object obj) {
        Message message;
        Boolean bool = (Boolean) obj;
        Bundle bundle = new Bundle();
        bundle.putInt("data_request_type", 7);
        byte[] bArr = null;
        if (bool == null) {
            try {
                message = Message.obtain((Handler) null, this.f90988g);
                btnf btnf = this.f90987f;
                if (btnf != null) {
                    bArr = btnf.mo73642k();
                }
                bundle.putByteArray("tap_and_pay_api_error", bArr);
            } catch (RemoteException e) {
                bnsl bnsl = (bnsl) f90962a.mo68388c();
                bnsl.mo68437a(e);
                bnsl.mo68432a("atuy", "a", 244, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Error replying from SelectActivationMethodAsync");
                return;
            }
        } else {
            message = Message.obtain((Handler) null, 7001);
        }
        bundle.putInt("data_activation_method_type", this.f90970m.mo3214a());
        message.setData(bundle);
        this.f90986e.send(message);
    }
}
