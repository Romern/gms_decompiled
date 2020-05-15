package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.PaymentData;
import com.google.android.gms.wallet.WebPaymentData;
import com.google.android.gms.wallet.intentoperation.p083ib.ReportFacilitatedTransactionChimeraIntentOperation;
import com.google.android.gms.wallet.service.p086ib.IbBuyFlowInput;
import com.google.android.gms.wallet.service.p086ib.ProcessBuyFlowResultRequest;
import com.google.android.gms.wallet.service.p086ib.ProcessBuyFlowResultResponse;
import com.google.android.gms.wallet.shared.ApplicationParameters;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: awsq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awsq {

    /* renamed from: a */
    private static final List f95048a = Arrays.asList(1, 4, 3);

    /* renamed from: c */
    private static final Object f95049c = new Object();

    /* renamed from: b */
    private final Context f95050b;

    /* renamed from: d */
    private final awwt f95051d;

    /* renamed from: e */
    private final awsm f95052e;

    /* renamed from: f */
    private final awsz f95053f;

    /* renamed from: g */
    private final awta f95054g;

    /* renamed from: h */
    private final BuyFlowConfig f95055h;

    /* renamed from: i */
    private final ProcessBuyFlowResultRequest f95056i;

    public awsq(Context context, awwt awwt, awsm awsm, awsz awsz, awta awta, BuyFlowConfig buyFlowConfig, ProcessBuyFlowResultRequest processBuyFlowResultRequest) {
        this.f95050b = context;
        this.f95051d = awwt;
        this.f95052e = awsm;
        this.f95053f = awsz;
        this.f95054g = awta;
        this.f95055h = buyFlowConfig;
        this.f95056i = processBuyFlowResultRequest;
    }

    /* renamed from: a */
    private final ProcessBuyFlowResultResponse m80976a(int i, int i2) {
        Intent intent = new Intent();
        String e = this.f95056i.f110358c.mo59994e();
        awfm.m79848a(this.f95055h, intent, i);
        int m = this.f95056i.f110358c.mo60005m();
        int i3 = m - 1;
        if (m != 0) {
            if (i3 == 1 || i3 == 3) {
                awbb a = MaskedWallet.m93790a();
                if (TextUtils.isEmpty(e)) {
                    e = null;
                }
                a.mo51808a(e);
                a.mo51809b(this.f95056i.f110359d.f110343b);
                intent.putExtra("com.google.android.gms.wallet.EXTRA_MASKED_WALLET", a.f94143a);
            } else if (i3 == 4) {
                awap a2 = FullWallet.m93786a();
                if (TextUtils.isEmpty(e)) {
                    e = null;
                }
                a2.mo51790a(e);
                a2.mo51791b(this.f95056i.f110359d.f110343b);
                intent.putExtra("com.google.android.gms.wallet.EXTRA_FULL_WALLET", a2.f94139a);
            }
            return new ProcessBuyFlowResultResponse(1, 1, i2, intent, false);
        }
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0504, code lost:
        if (r3.mo60002j() == false) goto L_0x0506;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x0530, code lost:
        if (r3.mo60006n() == 1) goto L_0x0568;
     */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0413 A[Catch:{ JSONException -> 0x0678, JSONException -> 0x05f7, JSONException -> 0x04e7, all -> 0x071c }] */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0424 A[Catch:{ JSONException -> 0x0678, JSONException -> 0x05f7, JSONException -> 0x04e7, all -> 0x071c }] */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x051d A[Catch:{ JSONException -> 0x0678, JSONException -> 0x05f7, JSONException -> 0x04e7, all -> 0x071c }] */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x051e A[Catch:{ JSONException -> 0x0678, JSONException -> 0x05f7, JSONException -> 0x04e7, all -> 0x071c }] */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x054e A[Catch:{ JSONException -> 0x0678, JSONException -> 0x05f7, JSONException -> 0x04e7, all -> 0x071c }] */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x0574 A[Catch:{ JSONException -> 0x0678, JSONException -> 0x05f7, JSONException -> 0x04e7, all -> 0x071c }] */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x068f A[Catch:{ JSONException -> 0x0678, JSONException -> 0x05f7, JSONException -> 0x04e7, all -> 0x071c }] */
    /* JADX WARNING: Removed duplicated region for block: B:282:0x0716 A[Catch:{ JSONException -> 0x0678, JSONException -> 0x05f7, JSONException -> 0x04e7, all -> 0x071c }] */
    /* renamed from: a */
    public final ProcessBuyFlowResultResponse mo52536a() {
        IbBuyFlowInput ibBuyFlowInput;
        ProcessBuyFlowResultResponse processBuyFlowResultResponse;
        bxvd bxvd;
        bwey bwey;
        boolean z;
        boolean z2;
        boolean z3;
        int m;
        JSONObject optJSONObject;
        synchronized (f95049c) {
            try {
                int m2 = this.f95056i.f110358c.mo60005m();
                byak a = this.f95053f.mo52546a(this.f95056i.f110358c.mo59994e());
                if (a != null) {
                    ibBuyFlowInput = IbBuyFlowInput.m94104a(a.f165274d);
                } else {
                    ibBuyFlowInput = null;
                }
                if (m2 == 5) {
                    if (ibBuyFlowInput != null && ibBuyFlowInput.mo60005m() == 5) {
                        awrt.m80846a("loadFullWallet", String.format("A successful full wallet for googleTransactionId \"%s\" has already been issued. You must call changeMaskedWallet again before issuing a new full wallet with this googleTransactionId or  call loadMaskedWallet to obtain a new googleTransactionId.", this.f95056i.f110358c.mo59994e()));
                        processBuyFlowResultResponse = m80976a(410, 1017);
                    }
                }
                List list = f95048a;
                int i = m2 - 1;
                if (m2 != 0) {
                    if (list.contains(Integer.valueOf(i))) {
                        if (ibBuyFlowInput != null) {
                            List list2 = f95048a;
                            int m3 = ibBuyFlowInput.mo60005m();
                            int i2 = m3 - 1;
                            if (m3 == 0) {
                                throw null;
                            } else if (!list2.contains(Integer.valueOf(i2))) {
                                awrt.m80846a(this.f95056i.f110358c.mo59998g(), String.format("googleTransactionId \"%s\" returned by %s cannot be used by %s", this.f95056i.f110358c.mo59994e(), ibBuyFlowInput.mo59998g(), this.f95056i.f110358c.mo59998g()));
                                processBuyFlowResultResponse = m80976a(410, 1070);
                            }
                        }
                    }
                    blzw blzw = (blzw) bjvp.m104733a(this.f95056i.f110357b, (bxxk) blzw.f128403k.mo74142c(7));
                    bxvd bxvd2 = (bxvd) blzw.mo74142c(5);
                    bxvd2.mo73625a((bxvk) blzw);
                    BuyFlowConfig buyFlowConfig = this.f95055h;
                    ApplicationParameters applicationParameters = buyFlowConfig.f110418b;
                    int i3 = applicationParameters.f110406a;
                    Account account = applicationParameters.f110407b;
                    String str = buyFlowConfig.f110419c;
                    byal a2 = this.f95054g.mo52547a(i3, account, str);
                    if (a2 != null) {
                        bxvd = (bxvd) a2.mo74142c(5);
                        bxvd.mo73625a((bxvk) a2);
                    } else {
                        bxvd = byal.f165279g.mo74144da();
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    byal byal = (byal) bxvd.f164949b;
                    int i4 = byal.f165281a | 1;
                    byal.f165281a = i4;
                    byal.f165282b = currentTimeMillis;
                    blzw blzw2 = (blzw) bxvd2.f164949b;
                    boolean z4 = blzw2.f128410f;
                    byal.f165281a = i4 | 8;
                    byal.f165285e = z4;
                    if ((blzw2.f128405a & 2) != 0) {
                        blzu blzu = blzw2.f128407c;
                        if (blzu == null) {
                            blzu = blzu.f128387j;
                        }
                        String str2 = blzu.f128390b;
                        if (bxvd.f164950c) {
                            bxvd.mo74035c();
                            bxvd.f164950c = false;
                        }
                        byal byal2 = (byal) bxvd.f164949b;
                        str2.getClass();
                        byal2.f165281a |= 2;
                        byal2.f165283c = str2;
                        blzu blzu2 = ((blzw) bxvd2.f164949b).f128407c;
                        if (blzu2 == null) {
                            blzu2 = blzu.f128387j;
                        }
                        boolean z5 = !blzu2.f128397i;
                        if (bxvd.f164950c) {
                            bxvd.mo74035c();
                            bxvd.f164950c = false;
                        }
                        byal byal3 = (byal) bxvd.f164949b;
                        byal3.f165281a |= 16;
                        byal3.f165286f = z5;
                    }
                    blzw blzw3 = (blzw) bxvd2.f164949b;
                    if ((blzw3.f128405a & 4) != 0) {
                        blzr blzr = blzw3.f128408d;
                        if (blzr == null) {
                            blzr = blzr.f128380e;
                        }
                        bxtx bxtx = blzr.f128383b;
                        if (bxvd.f164950c) {
                            bxvd.mo74035c();
                            bxvd.f164950c = false;
                        }
                        byal byal4 = (byal) bxvd.f164949b;
                        bxtx.getClass();
                        byal4.f165281a |= 4;
                        byal4.f165284d = bxtx;
                    }
                    byal byal5 = (byal) bxvd.mo74062i();
                    awta awta = this.f95054g;
                    String a3 = bjvp.m104734a(byal5);
                    SharedPreferences.Editor edit = awta.f95078a.edit();
                    edit.putString(awta.m80992b(i3, account, str), a3);
                    edit.apply();
                    IbBuyFlowInput b = this.f95056i.f110358c.mo59984b();
                    b.mo59980a(byal5);
                    blzq blzq = ((blzf) b.f110340b.f164949b).f128346i;
                    if (blzq == null) {
                        blzq = blzq.f128364p;
                    }
                    if ((blzq.f128366a & 16) != 0) {
                        blzq blzq2 = ((blzf) b.f110340b.f164949b).f128346i;
                        if (blzq2 == null) {
                            blzq2 = blzq.f128364p;
                        }
                        bwey = blzq2.f128371f;
                        if (bwey == null) {
                            bwey = bwey.f159035i;
                        }
                    } else {
                        bwey = null;
                    }
                    blze blze = b.f110340b;
                    blzq blzq3 = ((blzf) blze.f164949b).f128346i;
                    if (blzq3 == null) {
                        blzq3 = blzq.f128364p;
                    }
                    bxvd bxvd3 = (bxvd) blzq3.mo74142c(5);
                    bxvd3.mo73625a((bxvk) blzq3);
                    if (bxvd3.f164950c) {
                        bxvd3.mo74035c();
                        bxvd3.f164950c = false;
                    }
                    blzq blzq4 = (blzq) bxvd3.f164949b;
                    blzq4.f128371f = null;
                    blzq4.f128366a &= -17;
                    if (blze.f164950c) {
                        blze.mo74035c();
                        blze.f164950c = false;
                    }
                    blzf blzf = (blzf) blze.f164949b;
                    blzq blzq5 = (blzq) bxvd3.mo74062i();
                    bxvu bxvu = blzf.f128336h;
                    blzq5.getClass();
                    blzf.f128346i = blzq5;
                    blzf.f128339a |= 32;
                    bxvd da = byak.f165269i.mo74144da();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    byak byak = (byak) da.f164949b;
                    byak.f165271a |= 1;
                    byak.f165272b = i3;
                    String str3 = account.name;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    byak byak2 = (byak) da.f164949b;
                    str3.getClass();
                    byak2.f165271a |= 2;
                    byak2.f165273c = str3;
                    bxtx a4 = bxtx.m123261a(this.f95056i.f110356a);
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    byak byak3 = (byak) da.f164949b;
                    a4.getClass();
                    byak3.f165271a |= 8;
                    byak3.f165275e = a4;
                    bxtx a5 = bxtx.m123261a(b.mo59990c());
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    byak byak4 = (byak) da.f164949b;
                    a5.getClass();
                    byak4.f165271a |= 4;
                    byak4.f165274d = a5;
                    blzw blzw4 = (blzw) bxvd2.f164949b;
                    if ((blzw4.f128405a & 2) != 0) {
                        blzu blzu3 = blzw4.f128407c;
                        if (blzu3 == null) {
                            blzu3 = blzu.f128387j;
                        }
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        byak byak5 = (byak) da.f164949b;
                        blzu3.getClass();
                        byak5.f165276f = blzu3;
                        byak5.f165271a |= 16;
                    }
                    String str4 = ((blzw) bxvd2.f164949b).f128411g;
                    byak byak6 = (byak) da.f164949b;
                    str4.getClass();
                    int i5 = byak6.f165271a | 32;
                    byak6.f165271a = i5;
                    byak6.f165277g = str4;
                    int i6 = this.f95056i.f110359d.f110342a;
                    byak6.f165271a = i5 | 64;
                    byak6.f165278h = i6;
                    awsz awsz = this.f95053f;
                    String e = b.mo59994e();
                    long currentTimeMillis2 = System.currentTimeMillis();
                    long j = awsz.f95076b;
                    bjwa a6 = bjwb.m104764a();
                    a6.mo65580a(currentTimeMillis2 + j);
                    a6.mo65581a((byak) da.mo74062i());
                    String bjwa = a6.toString();
                    SharedPreferences.Editor edit2 = awsz.f95075a.edit();
                    edit2.putString(e, bjwa);
                    edit2.apply();
                    awsz.mo52088a();
                    if (b.mo60005m() == 5 || !b.mo59997f() || !byal5.f165286f) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (chjh.f188679a.mo6606a().mo85278a()) {
                        z2 = z;
                    } else {
                        z2 = z && b.mo60006n() != 1;
                    }
                    int i7 = this.f95056i.f110360e;
                    if (i7 == 1) {
                        Status a7 = this.f95051d.mo65546a(this.f95055h, applicationParameters.f110407b, b.mo59994e());
                        if (!a7.mo17710c()) {
                            Log.w("ProcessBFResultAction", String.format(Locale.US, "Failed to report InApp manual unlock! status = %s", a7));
                            processBuyFlowResultResponse = m80976a(8, 1069);
                        }
                    }
                    if (z2) {
                        if (((Boolean) awie.f94411g.mo58455c()).booleanValue()) {
                            if (this.f95056i.f110360e == 1) {
                            }
                            z3 = true;
                            if (b.mo60005m() == 5 && b.mo60006n() == 3) {
                                String c = b.mo59988c("publicKey");
                                if (bwey != null) {
                                    Log.e("ProcessBFResultAction", "No network token was generated for direct integration!");
                                    processBuyFlowResultResponse = m80976a(8, 1016);
                                } else {
                                    bxvd da2 = blzx.f128415c.mo74144da();
                                    awsm awsm = this.f95052e;
                                    String a8 = awrt.m80835a(bwey);
                                    String a9 = awsm.mo52530a(c);
                                    sdo.m34975b(a9 == null, a9);
                                    ECPublicKey a10 = awsm.mo52532a(awfn.m79850a(awsm.m80956b(c)));
                                    KeyPair a11 = awsm.mo52531a();
                                    byte[] bArr = new byte[16];
                                    byte[] bArr2 = new byte[16];
                                    awsm.mo52533a((ECPublicKey) a11.getPublic(), (ECPrivateKey) a11.getPrivate(), a10, bArr, bArr2);
                                    byte[] a12 = awsm.mo52534a(bArr, a8.getBytes(awsm.f95035a));
                                    byte[] b2 = awsm.mo52535b(bArr2, a12);
                                    ECPublicKey eCPublicKey = (ECPublicKey) a11.getPublic();
                                    JSONObject jSONObject = new JSONObject();
                                    jSONObject.put("ephemeralPublicKey", awsm.m80954a(awfn.m79852a(eCPublicKey.getW())));
                                    jSONObject.put("encryptedMessage", awsm.m80954a(a12));
                                    jSONObject.put("tag", awsm.m80954a(b2));
                                    String jSONObject2 = jSONObject.toString();
                                    if (da2.f164950c) {
                                        da2.mo74035c();
                                        da2.f164950c = false;
                                    }
                                    blzx blzx = (blzx) da2.f164949b;
                                    jSONObject2.getClass();
                                    blzx.f128417a |= 1;
                                    blzx.f128418b = jSONObject2;
                                    if (bxvd2.f164950c) {
                                        bxvd2.mo74035c();
                                        bxvd2.f164950c = false;
                                    }
                                    blzw blzw5 = (blzw) bxvd2.f164949b;
                                    blzx blzx2 = (blzx) da2.mo74062i();
                                    blzx2.getClass();
                                    blzw5.f128409e = blzx2;
                                    blzw5.f128405a |= 8;
                                }
                            }
                            if (b.mo60005m() != 5) {
                                if (b.mo60005m() == 7) {
                                }
                                if (b.mo60005m() == 5) {
                                    if (b.mo60005m() != 6) {
                                        if (b.mo60005m() == 7) {
                                        }
                                        if (!TextUtils.isEmpty(((blzw) bxvd2.f164949b).f128413i)) {
                                            blzw blzw6 = (blzw) bxvd2.f164949b;
                                            if ((blzw6.f128405a & 8) != 0) {
                                                blzx blzx3 = blzw6.f128409e;
                                                if (blzx3 == null) {
                                                    blzx3 = blzx.f128415c;
                                                }
                                                if (!blzx3.f128418b.isEmpty()) {
                                                    JSONObject jSONObject3 = new JSONObject(((blzw) bxvd2.f164949b).f128413i);
                                                    JSONObject optJSONObject2 = jSONObject3.optJSONObject("paymentMethodToken");
                                                    if (optJSONObject2 != null) {
                                                        blzx blzx4 = ((blzw) bxvd2.f164949b).f128409e;
                                                        if (blzx4 == null) {
                                                            blzx4 = blzx.f128415c;
                                                        }
                                                        optJSONObject2.put("token", blzx4.f128418b);
                                                    }
                                                    JSONObject optJSONObject3 = jSONObject3.optJSONObject("paymentMethodData");
                                                    if (!(optJSONObject3 == null || (optJSONObject = optJSONObject3.optJSONObject("tokenizationData")) == null)) {
                                                        blzx blzx5 = ((blzw) bxvd2.f164949b).f128409e;
                                                        if (blzx5 == null) {
                                                            blzx5 = blzx.f128415c;
                                                        }
                                                        optJSONObject.put("token", blzx5.f128418b);
                                                    }
                                                    String jSONObject4 = jSONObject3.toString();
                                                    if (bxvd2.f164950c) {
                                                        bxvd2.mo74035c();
                                                        bxvd2.f164950c = false;
                                                    }
                                                    blzw blzw7 = (blzw) bxvd2.f164949b;
                                                    jSONObject4.getClass();
                                                    blzw7.f128405a |= 128;
                                                    blzw7.f128413i = jSONObject4;
                                                }
                                            }
                                            if (((blzw) bxvd2.f164949b).f128414j.size() > 0) {
                                                JSONObject jSONObject5 = TextUtils.isEmpty(((blzw) bxvd2.f164949b).f128413i) ? new JSONObject() : new JSONObject(((blzw) bxvd2.f164949b).f128413i);
                                                JSONObject jSONObject6 = new JSONObject();
                                                for (blzv blzv : Collections.unmodifiableList(((blzw) bxvd2.f164949b).f128414j)) {
                                                    jSONObject6.put(blzv.f128400a, blzv.f128401b);
                                                }
                                                jSONObject5.put("extraData", jSONObject6);
                                                String jSONObject7 = jSONObject5.toString();
                                                if (bxvd2.f164950c) {
                                                    bxvd2.mo74035c();
                                                    bxvd2.f164950c = false;
                                                }
                                                blzw blzw8 = (blzw) bxvd2.f164949b;
                                                jSONObject7.getClass();
                                                blzw8.f128405a |= 128;
                                                blzw8.f128413i = jSONObject7;
                                            }
                                        }
                                        Intent intent = new Intent();
                                        m = b.mo60005m();
                                        int i8 = m - 1;
                                        if (m != 0) {
                                            if (i8 == 4) {
                                                intent.putExtra("com.google.android.gms.wallet.EXTRA_FULL_WALLET", awrt.m80820a((blzw) bxvd2.mo74062i(), account.name, b.mo59994e(), this.f95056i.f110359d.f110343b, b.mo60006n()));
                                            } else if (i8 == 5) {
                                                awbx a13 = WebPaymentData.m93795a();
                                                a13.mo51838a(((blzw) bxvd2.f164949b).f128413i);
                                                WebPaymentData webPaymentData = a13.f94158a;
                                                webPaymentData.f109908b = b.f110339a;
                                                WebPaymentData.m93796a(intent, webPaymentData);
                                            } else if (i8 != 6) {
                                                intent.putExtra("com.google.android.gms.wallet.EXTRA_MASKED_WALLET", awrt.m80822a((blzw) bxvd2.mo74062i(), account.name, b.mo59994e(), this.f95056i.f110359d.f110343b));
                                            } else {
                                                PaymentData a14 = awrt.m80823a((blzw) bxvd2.mo74062i(), account.name, this.f95056i.f110359d.f110344c, b.mo60006n(), b.mo59994e());
                                                a14.f109883h = b.f110339a;
                                                a14.mo59766a(intent);
                                            }
                                            processBuyFlowResultResponse = new ProcessBuyFlowResultResponse(1, -1, 1, intent, z3);
                                        } else {
                                            throw null;
                                        }
                                    }
                                }
                                BuyFlowConfig buyFlowConfig2 = this.f95055h;
                                Context context = this.f95050b;
                                byte[] k = ((blzw) bxvd2.f164949b).f128412h.mo73780k();
                                if (((Boolean) awip.f94485e.mo58455c()).booleanValue()) {
                                    sdo.m34966a(buyFlowConfig2, "buyFlowConfig is required");
                                    Intent startIntent = IntentOperation.getStartIntent(context, ReportFacilitatedTransactionChimeraIntentOperation.class, "com.google.android.gms.wallet.ib.REPORT_FACILITATED_TRANSACTION");
                                    sef.m35071a(buyFlowConfig2, startIntent, "com.google.android.gms.wallet.buyFlowConfig");
                                    startIntent.putExtra("com.google.android.gms.wallet.service.ib.ReportFacilitatedTransactionChimeraIntentOperation.transactionCompletionToken", k);
                                    context.startService(startIntent);
                                }
                                if (!TextUtils.isEmpty(((blzw) bxvd2.f164949b).f128413i)) {
                                }
                                Intent intent2 = new Intent();
                                m = b.mo60005m();
                                int i82 = m - 1;
                                if (m != 0) {
                                }
                            }
                            awwt awwt = this.f95051d;
                            BuyFlowConfig buyFlowConfig3 = this.f95055h;
                            awwt.mo65550d(buyFlowConfig3, buyFlowConfig3.f110418b.f110407b, b.mo59994e());
                            if (b.mo60005m() == 5) {
                            }
                            BuyFlowConfig buyFlowConfig22 = this.f95055h;
                            Context context2 = this.f95050b;
                            byte[] k2 = ((blzw) bxvd2.f164949b).f128412h.mo73780k();
                            if (((Boolean) awip.f94485e.mo58455c()).booleanValue()) {
                            }
                            if (!TextUtils.isEmpty(((blzw) bxvd2.f164949b).f128413i)) {
                            }
                            Intent intent22 = new Intent();
                            m = b.mo60005m();
                            int i822 = m - 1;
                            if (m != 0) {
                            }
                        }
                        if (this.f95056i.f110360e == 2) {
                            z3 = true;
                            String c2 = b.mo59988c("publicKey");
                            if (bwey != null) {
                            }
                        } else if (i7 != 1) {
                            rjr a15 = this.f95051d.mo65547a(this.f95055h, applicationParameters.f110407b, b.mo59994e(), byal5.f165283c);
                            if (!a15.f43154a.mo17710c()) {
                                Locale locale = Locale.US;
                                Status status = a15.f43154a;
                                Log.w("ProcessBFResultAction", String.format(locale, "Failed to retrieve payment credential for Android Pay in full wallet! status = %s message = %s", status, status.f30116j));
                                processBuyFlowResultResponse = m80976a(8, 1015);
                            } else if (!a15.f43155b) {
                                z3 = true;
                                String c22 = b.mo59988c("publicKey");
                                if (bwey != null) {
                                }
                            }
                        }
                    }
                    z3 = false;
                    String c222 = b.mo59988c("publicKey");
                    if (bwey != null) {
                    }
                } else {
                    throw null;
                }
            } catch (JSONException e2) {
                throw new RuntimeException("JSON error encountered with paymentRequestData!", e2);
            } catch (JSONException e3) {
                throw new RuntimeException("invalid payment request data json!", e3);
            } catch (JSONException e4) {
                throw new RuntimeException("Error serializing NetworkToken to JSON.", e4);
            } catch (Throwable th) {
                throw th;
            }
        }
        return processBuyFlowResultResponse;
    }
}
