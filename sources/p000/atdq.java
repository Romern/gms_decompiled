package p000;

import com.google.android.gms.tapandpay.paymentbundle.api.CryptoParameters;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECGenParameterSpec;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: atdq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atdq implements atcy {

    /* renamed from: a */
    private static final srn f90144a = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: b */
    private final atdp f90145b;

    /* renamed from: c */
    private final atcl f90146c;

    public atdq(atcl atcl) {
        try {
            this.f90146c = atcl;
            this.f90145b = new atdp();
        } catch (GeneralSecurityException e) {
            throw new RuntimeException("Initialization of crypto client failed", e);
        }
    }

    /* renamed from: b */
    static CryptoParameters m75661b() {
        try {
            KeyPairGenerator instance = KeyPairGenerator.getInstance("EC");
            instance.initialize(new ECGenParameterSpec("prime256v1"), asmc.m74369a());
            KeyPair genKeyPair = instance.genKeyPair();
            ECPublicKey eCPublicKey = (ECPublicKey) genKeyPair.getPublic();
            PrivateKey privateKey = genKeyPair.getPrivate();
            String a = bmzh.m108673a(eCPublicKey.getW().getAffineX().toString(16));
            String a2 = bmzh.m108673a(eCPublicKey.getW().getAffineY().toString(16));
            bxvd da = btli.f149372c.mo74144da();
            bxvd da2 = btmx.f149574b.mo74144da();
            String valueOf = String.valueOf(a);
            String valueOf2 = String.valueOf(a2);
            String str = valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            str.getClass();
            ((btmx) da2.f164949b).f149576a = str;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            btli btli = (btli) da.f164949b;
            btmx btmx = (btmx) da2.mo74062i();
            btmx.getClass();
            btli.f149375b = btmx;
            btli.f149374a = 3;
            btli btli2 = (btli) da.f164949b;
            if (btli2.f149374a == 3) {
                btmx btmx2 = (btmx) btli2.f149375b;
            }
            return new CryptoParameters((btli) da.mo74062i(), privateKey.getEncoded());
        } catch (GeneralSecurityException e) {
            bnsl bnsl = (bnsl) f90144a.mo68388c();
            bnsl.mo68432a("atdq", "b", 87, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Crypto parameters generation failed");
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public final btmd mo49809a() {
        return btmd.f149473c;
    }

    /* renamed from: a */
    public final CryptoParameters mo49810a(atcv atcv) {
        return m75661b();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:163:0x02d3, code lost:
        if (r8.f130846a != null) goto L_0x02d5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:377:0x075c A[Catch:{ UnsupportedEncodingException | GeneralSecurityException | JSONException -> 0x086f }] */
    /* JADX WARNING: Removed duplicated region for block: B:378:0x075d A[Catch:{ UnsupportedEncodingException | GeneralSecurityException | JSONException -> 0x086f }] */
    /* JADX WARNING: Removed duplicated region for block: B:381:0x0772 A[Catch:{ UnsupportedEncodingException | GeneralSecurityException | JSONException -> 0x086f }] */
    /* JADX WARNING: Removed duplicated region for block: B:382:0x0773 A[Catch:{ UnsupportedEncodingException | GeneralSecurityException | JSONException -> 0x086f }] */
    /* JADX WARNING: Removed duplicated region for block: B:385:0x0788 A[Catch:{ UnsupportedEncodingException | GeneralSecurityException | JSONException -> 0x086f }] */
    /* JADX WARNING: Removed duplicated region for block: B:386:0x0789 A[Catch:{ UnsupportedEncodingException | GeneralSecurityException | JSONException -> 0x086f }] */
    /* JADX WARNING: Removed duplicated region for block: B:389:0x078f A[Catch:{ UnsupportedEncodingException | GeneralSecurityException | JSONException -> 0x086f }] */
    /* JADX WARNING: Removed duplicated region for block: B:390:0x0790 A[Catch:{ UnsupportedEncodingException | GeneralSecurityException | JSONException -> 0x086f }] */
    /* JADX WARNING: Removed duplicated region for block: B:393:0x07a1 A[Catch:{ UnsupportedEncodingException | GeneralSecurityException | JSONException -> 0x086f }] */
    /* JADX WARNING: Removed duplicated region for block: B:394:0x07a2 A[Catch:{ UnsupportedEncodingException | GeneralSecurityException | JSONException -> 0x086f }] */
    /* JADX WARNING: Removed duplicated region for block: B:397:0x07b6 A[Catch:{ UnsupportedEncodingException | GeneralSecurityException | JSONException -> 0x086f }] */
    /* JADX WARNING: Removed duplicated region for block: B:398:0x07b7 A[Catch:{ UnsupportedEncodingException | GeneralSecurityException | JSONException -> 0x086f }] */
    /* JADX WARNING: Removed duplicated region for block: B:401:0x07d0 A[Catch:{ UnsupportedEncodingException | GeneralSecurityException | JSONException -> 0x086f }] */
    /* JADX WARNING: Removed duplicated region for block: B:402:0x07d1 A[Catch:{ UnsupportedEncodingException | GeneralSecurityException | JSONException -> 0x086f }] */
    /* JADX WARNING: Removed duplicated region for block: B:405:0x07ea A[Catch:{ UnsupportedEncodingException | GeneralSecurityException | JSONException -> 0x086f }] */
    /* JADX WARNING: Removed duplicated region for block: B:406:0x07eb A[Catch:{ UnsupportedEncodingException | GeneralSecurityException | JSONException -> 0x086f }] */
    /* JADX WARNING: Removed duplicated region for block: B:409:0x0808 A[Catch:{ UnsupportedEncodingException | GeneralSecurityException | JSONException -> 0x086f }] */
    /* JADX WARNING: Removed duplicated region for block: B:420:0x0845 A[Catch:{ UnsupportedEncodingException | GeneralSecurityException | JSONException -> 0x086f }] */
    /* JADX WARNING: Removed duplicated region for block: B:421:0x0846 A[Catch:{ UnsupportedEncodingException | GeneralSecurityException | JSONException -> 0x086f }] */
    /* renamed from: b */
    public final atdo mo49808a(askf askf, atcv atcv, bmtc bmtc, byte[] bArr, long j) {
        bmts bmts;
        bxvd bxvd;
        bmtp bmtp;
        bxvd bxvd2;
        bmti bmti;
        bxvd bxvd3;
        bmti bmti2;
        bmtg bmtg;
        bxvd bxvd4;
        bmtk bmtk;
        bmtp bmtp2;
        bxwc bxwc;
        askf askf2 = askf;
        bmtc bmtc2 = bmtc;
        byte[] bArr2 = bArr;
        try {
            bydd bydd = (bydd) bydf.f165769j.mo74144da();
            if (bmtc2.f130815a == 3) {
                bmts = (bmts) bmtc2.f130816b;
            } else {
                bmts = bmts.f130908c;
            }
            bmtp bmtp3 = bmts.f130910a;
            if (bmtp3 == null) {
                bmtp3 = bmtp.f130893f;
            }
            if (bmtp3.f130895a.isEmpty()) {
                bydd bydd2 = ((atdo) atcv).f90135a;
                int i = ((bydf) bydd2.f164949b).f165773c;
                if (bydd.f164950c) {
                    bydd.mo74035c();
                    bydd.f164950c = false;
                }
                bydf bydf = (bydf) bydd.f164949b;
                bydf.f165771a |= 2;
                bydf.f165773c = i;
                bmts bmts2 = ((bydf) bydd2.f164949b).f165772b;
                if (bmts2 == null) {
                    bmts2 = bmts.f130908c;
                }
                bxvd = (bxvd) bmts2.mo74142c(5);
                bxvd.mo73625a((bxvk) bmts2);
                bmtp bmtp4 = bmts.f130910a;
                if (bmtp4 == null) {
                    bmtp4 = bmtp.f130893f;
                }
                bmti bmti3 = bmtp4.f130898d;
                if (bmti3 == null) {
                    bmti3 = bmti.f130844c;
                }
                if (bmti3.f130847b != null) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    bmtp bmtp5 = ((bmts) bxvd.f164949b).f130910a;
                    if (bmtp5 == null) {
                        bmtp5 = bmtp.f130893f;
                    }
                    bmti bmti4 = bmtp5.f130898d;
                    if (bmti4 == null) {
                        bmti4 = bmti.f130844c;
                    }
                    bmto bmto = bmti4.f130847b;
                    if (bmto == null) {
                        bmto = bmto.f130881k;
                    }
                    bxwc bxwc2 = bmto.f130883a;
                    int size = bxwc2.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        bmtf bmtf = (bmtf) bxwc2.get(i2);
                        linkedHashMap.put(astc.m74747a(asti.m74762a(bmtf.f130827b)), bmtf);
                    }
                    bmtp bmtp6 = bmts.f130910a;
                    if (bmtp6 == null) {
                        bmtp6 = bmtp.f130893f;
                    }
                    bmti bmti5 = bmtp6.f130898d;
                    if (bmti5 == null) {
                        bmti5 = bmti.f130844c;
                    }
                    bmto bmto2 = bmti5.f130847b;
                    if (bmto2 == null) {
                        bmto2 = bmto.f130881k;
                    }
                    bxwc bxwc3 = bmto2.f130883a;
                    int size2 = bxwc3.size();
                    int i3 = 0;
                    while (i3 < size2) {
                        bmtf bmtf2 = (bmtf) bxwc3.get(i3);
                        astc a = astc.m74747a(asti.m74762a(bmtf2.f130827b));
                        if (bmtf2.f130826a.isEmpty() && bmtf2.f130829d.isEmpty()) {
                            if (bmtf2.f130828c.isEmpty()) {
                                linkedHashMap.remove(a);
                                bxwc = bxwc3;
                                i3++;
                                bxwc3 = bxwc;
                            }
                        }
                        bmtf bmtf3 = (bmtf) linkedHashMap.get(a);
                        if (bmtf3 != null) {
                            bxwc = bxwc3;
                            bxvd bxvd5 = (bxvd) bmtf3.mo74142c(5);
                            bxvd5.mo73625a((bxvk) bmtf3);
                            bxvd5.mo73625a((bxvk) bmtf2);
                            linkedHashMap.put(a, (bmtf) bxvd5.mo74062i());
                        } else {
                            bxwc = bxwc3;
                            linkedHashMap.put(a, bmtf2);
                        }
                        i3++;
                        bxwc3 = bxwc;
                    }
                    bmtp bmtp7 = ((bmts) bxvd.f164949b).f130910a;
                    if (bmtp7 == null) {
                        bmtp7 = bmtp.f130893f;
                    }
                    bxvd bxvd6 = (bxvd) bmtp7.mo74142c(5);
                    bxvd6.mo73625a((bxvk) bmtp7);
                    bmti bmti6 = ((bmtp) bxvd6.f164949b).f130898d;
                    if (bmti6 == null) {
                        bmti6 = bmti.f130844c;
                    }
                    bxvd bxvd7 = (bxvd) bmti6.mo74142c(5);
                    bxvd7.mo73625a((bxvk) bmti6);
                    bmti bmti7 = ((bmtp) bxvd6.f164949b).f130898d;
                    if (bmti7 == null) {
                        bmti7 = bmti.f130844c;
                    }
                    bmto bmto3 = bmti7.f130847b;
                    if (bmto3 == null) {
                        bmto3 = bmto.f130881k;
                    }
                    bxvd bxvd8 = (bxvd) bmto3.mo74142c(5);
                    bxvd8.mo73625a((bxvk) bmto3);
                    if (bxvd8.f164950c) {
                        bxvd8.mo74035c();
                        bxvd8.f164950c = false;
                    }
                    ((bmto) bxvd8.f164949b).f130883a = bxvk.m124030de();
                    Collection values = linkedHashMap.values();
                    if (bxvd8.f164950c) {
                        bxvd8.mo74035c();
                        bxvd8.f164950c = false;
                    }
                    bmto bmto4 = (bmto) bxvd8.f164949b;
                    if (!bmto4.f130883a.mo73666a()) {
                        bmto4.f130883a = bxvk.m124021a(bmto4.f130883a);
                    }
                    bxsy.m123078a(values, bmto4.f130883a);
                    if (bxvd7.f164950c) {
                        bxvd7.mo74035c();
                        bxvd7.f164950c = false;
                    }
                    bmto bmto5 = (bmto) bxvd8.mo74062i();
                    bmto5.getClass();
                    ((bmti) bxvd7.f164949b).f130847b = bmto5;
                    if (bxvd6.f164950c) {
                        bxvd6.mo74035c();
                        bxvd6.f164950c = false;
                    }
                    bmti bmti8 = (bmti) bxvd7.mo74062i();
                    bmti8.getClass();
                    ((bmtp) bxvd6.f164949b).f130898d = bmti8;
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    bmtp bmtp8 = (bmtp) bxvd6.mo74062i();
                    bmtp8.getClass();
                    ((bmts) bxvd.f164949b).f130910a = bmtp8;
                    bmtp bmtp9 = bmts.f130910a;
                    if (bmtp9 == null) {
                        bmtp9 = bmtp.f130893f;
                    }
                    bxvd bxvd9 = (bxvd) bmtp9.mo74142c(5);
                    bxvd9.mo73625a((bxvk) bmtp9);
                    bmti bmti9 = ((bmtp) bxvd9.f164949b).f130898d;
                    if (bmti9 == null) {
                        bmti9 = bmti.f130844c;
                    }
                    bxvd bxvd10 = (bxvd) bmti9.mo74142c(5);
                    bxvd10.mo73625a((bxvk) bmti9);
                    bmti bmti10 = ((bmtp) bxvd9.f164949b).f130898d;
                    if (bmti10 == null) {
                        bmti10 = bmti.f130844c;
                    }
                    bmto bmto6 = bmti10.f130847b;
                    if (bmto6 == null) {
                        bmto6 = bmto.f130881k;
                    }
                    bxvd bxvd11 = (bxvd) bmto6.mo74142c(5);
                    bxvd11.mo73625a((bxvk) bmto6);
                    if (bxvd11.f164950c) {
                        bxvd11.mo74035c();
                        bxvd11.f164950c = false;
                    }
                    ((bmto) bxvd11.f164949b).f130883a = bxvk.m124030de();
                    if (bxvd10.f164950c) {
                        bxvd10.mo74035c();
                        bxvd10.f164950c = false;
                    }
                    bmto bmto7 = (bmto) bxvd11.mo74062i();
                    bmto7.getClass();
                    ((bmti) bxvd10.f164949b).f130847b = bmto7;
                    if (bxvd9.f164950c) {
                        bxvd9.mo74035c();
                        bxvd9.f164950c = false;
                    }
                    bmti bmti11 = (bmti) bxvd10.mo74062i();
                    bmti11.getClass();
                    ((bmtp) bxvd9.f164949b).f130898d = bmti11;
                    bmtp2 = (bmtp) bxvd9.mo74062i();
                } else {
                    bmtp2 = bmts.f130910a;
                    if (bmtp2 == null) {
                        bmtp2 = bmtp.f130893f;
                    }
                }
                bmtp bmtp10 = ((bmts) bxvd.f164949b).f130910a;
                if (bmtp10 == null) {
                    bmtp10 = bmtp.f130893f;
                }
                bxvd bxvd12 = (bxvd) bmtp10.mo74142c(5);
                bxvd12.mo73625a((bxvk) bmtp10);
                bxvd12.mo73625a((bxvk) bmtp2);
                if (cgwn.m147262l()) {
                    bmtp bmtp11 = bmts.f130910a;
                    if (bmtp11 == null) {
                        bmtp11 = bmtp.f130893f;
                    }
                    bmti bmti12 = bmtp11.f130898d;
                    if (bmti12 == null) {
                        bmti12 = bmti.f130844c;
                    }
                }
                bmti bmti13 = ((bmtp) bxvd12.f164949b).f130898d;
                if (bmti13 == null) {
                    bmti13 = bmti.f130844c;
                }
                bxvd bxvd13 = (bxvd) bmti13.mo74142c(5);
                bxvd13.mo73625a((bxvk) bmti13);
                bmti bmti14 = ((bmtp) bxvd12.f164949b).f130898d;
                if (bmti14 == null) {
                    bmti14 = bmti.f130844c;
                }
                bmtg bmtg2 = bmti14.f130846a;
                if (bmtg2 == null) {
                    bmtg2 = bmtg.f130832g;
                }
                bxvd bxvd14 = (bxvd) bmtg2.mo74142c(5);
                bxvd14.mo73625a((bxvk) bmtg2);
                bmti bmti15 = ((bmtp) bxvd12.f164949b).f130898d;
                if (bmti15 == null) {
                    bmti15 = bmti.f130844c;
                }
                bmtg bmtg3 = bmti15.f130846a;
                if (bmtg3 == null) {
                    bmtg3 = bmtg.f130832g;
                }
                int i4 = bmtg3.f130835b + 1;
                if (bxvd14.f164950c) {
                    bxvd14.mo74035c();
                    bxvd14.f164950c = false;
                }
                ((bmtg) bxvd14.f164949b).f130835b = i4;
                if (bxvd13.f164950c) {
                    bxvd13.mo74035c();
                    bxvd13.f164950c = false;
                }
                bmtg bmtg4 = (bmtg) bxvd14.mo74062i();
                bmtg4.getClass();
                ((bmti) bxvd13.f164949b).f130846a = bmtg4;
                if (bxvd12.f164950c) {
                    bxvd12.mo74035c();
                    bxvd12.f164950c = false;
                }
                bmti bmti16 = (bmti) bxvd13.mo74062i();
                bmti16.getClass();
                ((bmtp) bxvd12.f164949b).f130898d = bmti16;
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                bmtp bmtp12 = (bmtp) bxvd12.mo74062i();
                bmtp12.getClass();
                ((bmts) bxvd.f164949b).f130910a = bmtp12;
                String str = ((bydf) bydd2.f164949b).f165777g;
                if (bydd.f164950c) {
                    bydd.mo74035c();
                    bydd.f164950c = false;
                }
                bydf bydf2 = (bydf) bydd.f164949b;
                str.getClass();
                bydf2.f165771a |= 16;
                bydf2.f165777g = str;
                bmtk bmtk2 = bmts.f130911b;
                if (bmtk2 != null) {
                    bmtk bmtk3 = ((bmts) bxvd.f164949b).f130911b;
                    if (bmtk3 != null) {
                        bxvd bxvd15 = (bxvd) bmtk3.mo74142c(5);
                        bxvd15.mo73625a((bxvk) bmtk3);
                        bmtk bmtk4 = bmts.f130911b;
                        if (bmtk4 == null) {
                            bmtk4 = bmtk.f130852g;
                        }
                        bxvd15.mo73625a((bxvk) bmtk4);
                        if (bxvd.f164950c) {
                            bxvd.mo74035c();
                            bxvd.f164950c = false;
                        }
                        bmtk bmtk5 = (bmtk) bxvd15.mo74062i();
                        bmtk5.getClass();
                        ((bmts) bxvd.f164949b).f130911b = bmtk5;
                    } else {
                        if (bxvd.f164950c) {
                            bxvd.mo74035c();
                            bxvd.f164950c = false;
                        }
                        bmtk2.getClass();
                        ((bmts) bxvd.f164949b).f130911b = bmtk2;
                    }
                }
            } else {
                if (bydd.f164950c) {
                    bydd.mo74035c();
                    bydd.f164950c = false;
                }
                bydf bydf3 = (bydf) bydd.f164949b;
                bydf3.f165771a |= 2;
                bydf3.f165773c = 1;
                atdp atdp = this.f90145b;
                bmtp bmtp13 = bmts.f130910a;
                if (bmtp13 == null) {
                    bmtp13 = bmtp.f130893f;
                }
                String string = new JSONObject(new String(atdp.mo49840a(bArr2, bmtp13.f130895a, askf2), "UTF-8")).getString("token");
                if (bydd.f164950c) {
                    bydd.mo74035c();
                    bydd.f164950c = false;
                }
                bydf bydf4 = (bydf) bydd.f164949b;
                string.getClass();
                bydf4.f165771a |= 16;
                bydf4.f165777g = string;
                bxvd = (bxvd) bmts.mo74142c(5);
                bxvd.mo73625a((bxvk) bmts);
                bmtp bmtp14 = ((bmts) bxvd.f164949b).f130910a;
                if (bmtp14 == null) {
                    bmtp14 = bmtp.f130893f;
                }
                bxvd bxvd16 = (bxvd) bmtp14.mo74142c(5);
                bxvd16.mo73625a((bxvk) bmtp14);
                if (bxvd16.f164950c) {
                    bxvd16.mo74035c();
                    bxvd16.f164950c = false;
                }
                ((bmtp) bxvd16.f164949b).f130895a = bmtp.f130893f.f130895a;
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                bmtp bmtp15 = (bmtp) bxvd16.mo74062i();
                bmts bmts3 = bmts.f130908c;
                bmtp15.getClass();
                ((bmts) bxvd.f164949b).f130910a = bmtp15;
            }
            bmtk bmtk6 = bmts.f130911b;
            if (bmtk6 != null && !bmtk6.f130857d.isEmpty()) {
                atdp atdp2 = this.f90145b;
                bmtk bmtk7 = bmts.f130911b;
                if (bmtk7 == null) {
                    bmtk7 = bmtk.f130852g;
                }
                JSONObject jSONObject = new JSONObject(new String(atdp2.mo49840a(bArr2, bmtk7.f130857d, askf2), "UTF-8")).getJSONObject("iccCRTPrivateKey");
                bxvd da = byde.f165759i.mo74144da();
                bxtx a2 = bxtx.m123261a(asti.m74762a(jSONObject.getString("modulus")));
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                byde byde = (byde) da.f164949b;
                a2.getClass();
                byde.f165761a |= 1;
                byde.f165762b = a2;
                bxtx a3 = bxtx.m123261a(asti.m74762a(jSONObject.getString("exponent")));
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                byde byde2 = (byde) da.f164949b;
                a3.getClass();
                byde2.f165761a |= 2;
                byde2.f165763c = a3;
                bxtx a4 = bxtx.m123261a(asti.m74762a(jSONObject.getString("primeP")));
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                byde byde3 = (byde) da.f164949b;
                a4.getClass();
                byde3.f165761a |= 4;
                byde3.f165764d = a4;
                bxtx a5 = bxtx.m123261a(asti.m74762a(jSONObject.getString("primeQ")));
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                byde byde4 = (byde) da.f164949b;
                a5.getClass();
                byde4.f165761a |= 8;
                byde4.f165765e = a5;
                bxtx a6 = bxtx.m123261a(asti.m74762a(jSONObject.getString("CoefDmodP")));
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                byde byde5 = (byde) da.f164949b;
                a6.getClass();
                byde5.f165761a |= 16;
                byde5.f165766f = a6;
                bxtx a7 = bxtx.m123261a(asti.m74762a(jSONObject.getString("CoefDmodQ")));
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                byde byde6 = (byde) da.f164949b;
                a7.getClass();
                byde6.f165761a |= 32;
                byde6.f165767g = a7;
                bxtx a8 = bxtx.m123261a(asti.m74762a(jSONObject.getString("CoefQinvModP")));
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                byde byde7 = (byde) da.f164949b;
                a8.getClass();
                byde7.f165761a |= 64;
                byde7.f165768h = a8;
                if (bydd.f164950c) {
                    bydd.mo74035c();
                    bydd.f164950c = false;
                }
                bydf bydf5 = (bydf) bydd.f164949b;
                byde byde8 = (byde) da.mo74062i();
                byde8.getClass();
                bydf5.f165779i = byde8;
                bydf5.f165771a |= 64;
            } else if (atcv != null) {
                bydf bydf6 = (bydf) ((atdo) atcv).f90135a.f164949b;
                if ((bydf6.f165771a & 64) != 0) {
                    byde byde9 = bydf6.f165779i;
                    if (byde9 == null) {
                        byde9 = byde.f165759i;
                    }
                    if (bydd.f164950c) {
                        bydd.mo74035c();
                        bydd.f164950c = false;
                    }
                    bydf bydf7 = (bydf) bydd.f164949b;
                    byde9.getClass();
                    bydf7.f165779i = byde9;
                    bydf7.f165771a |= 64;
                }
            }
            if (cgwn.m147262l()) {
                bmtp bmtp16 = bmts.f130910a;
                if (bmtp16 == null) {
                    bmtp16 = bmtp.f130893f;
                }
                bmti bmti17 = bmtp16.f130898d;
                if (bmti17 == null) {
                    bmti17 = bmti.f130844c;
                }
                if (bmti17.f130846a == null) {
                    if (atcv != null) {
                        atdo atdo = (atdo) atcv;
                        bmts bmts4 = ((bydf) atdo.f90135a.f164949b).f165772b;
                        if (bmts4 == null) {
                            bmts4 = bmts.f130908c;
                        }
                        bmtp bmtp17 = bmts4.f130910a;
                        if (bmtp17 == null) {
                            bmtp17 = bmtp.f130893f;
                        }
                        bmti bmti18 = bmtp17.f130898d;
                        if (bmti18 == null) {
                            bmti18 = bmti.f130844c;
                        }
                        if (bmti18.f130846a != null) {
                            bydd bydd3 = atdo.f90135a;
                            int i5 = ((bydf) bydd3.f164949b).f165775e;
                            if (bydd.f164950c) {
                                bydd.mo74035c();
                                bydd.f164950c = false;
                            }
                            bydf bydf8 = (bydf) bydd.f164949b;
                            int i6 = bydf8.f165771a | 4;
                            bydf8.f165771a = i6;
                            bydf8.f165775e = i5;
                            bydf bydf9 = (bydf) bydd3.f164949b;
                            bxtx bxtx = bydf9.f165776f;
                            bxtx.getClass();
                            int i7 = i6 | 8;
                            bydf8.f165771a = i7;
                            bydf8.f165776f = bxtx;
                            long j2 = bydf9.f165778h;
                            bydf8.f165771a = i7 | 32;
                            bydf8.f165778h = j2;
                            bydd.mo74347a(Collections.unmodifiableList(bydf9.f165774d));
                        }
                    }
                    bmtp = ((bmts) bxvd.f164949b).f130910a;
                    if (bmtp != null) {
                        bmtp = bmtp.f130893f;
                    }
                    bxvd2 = (bxvd) bmtp.mo74142c(5);
                    bxvd2.mo73625a((bxvk) bmtp);
                    bmti = ((bmtp) bxvd2.f164949b).f130898d;
                    if (bmti != null) {
                        bmti = bmti.f130844c;
                    }
                    bxvd3 = (bxvd) bmti.mo74142c(5);
                    bxvd3.mo73625a((bxvk) bmti);
                    bmti2 = ((bmtp) bxvd2.f164949b).f130898d;
                    if (bmti2 != null) {
                        bmti2 = bmti.f130844c;
                    }
                    bmtg = bmti2.f130846a;
                    if (bmtg != null) {
                        bmtg = bmtg.f130832g;
                    }
                    bxvd4 = (bxvd) bmtg.mo74142c(5);
                    bxvd4.mo73625a((bxvk) bmtg);
                    if (!bxvd4.f164950c) {
                        bxvd4.mo74035c();
                        bxvd4.f164950c = false;
                    }
                    ((bmtg) bxvd4.f164949b).f130836c = bmtg.f130832g.f130836c;
                    if (!bxvd3.f164950c) {
                        bxvd3.mo74035c();
                        bxvd3.f164950c = false;
                    }
                    bmtg bmtg5 = (bmtg) bxvd4.mo74062i();
                    bmtg5.getClass();
                    ((bmti) bxvd3.f164949b).f130846a = bmtg5;
                    if (!bxvd2.f164950c) {
                        bxvd2.mo74035c();
                        bxvd2.f164950c = false;
                    }
                    bmti bmti19 = (bmti) bxvd3.mo74062i();
                    bmti19.getClass();
                    ((bmtp) bxvd2.f164949b).f130898d = bmti19;
                    if (!bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    bmtp bmtp18 = (bmtp) bxvd2.mo74062i();
                    bmtp18.getClass();
                    ((bmts) bxvd.f164949b).f130910a = bmtp18;
                    bmtk = ((bmts) bxvd.f164949b).f130911b;
                    if (bmtk != null) {
                        bxvd bxvd17 = (bxvd) bmtk.mo74142c(5);
                        bxvd17.mo73625a((bxvk) bmtk);
                        if (bxvd17.f164950c) {
                            bxvd17.mo74035c();
                            bxvd17.f164950c = false;
                        }
                        ((bmtk) bxvd17.f164949b).f130857d = bmtk.f130852g.f130857d;
                        if (bxvd.f164950c) {
                            bxvd.mo74035c();
                            bxvd.f164950c = false;
                        }
                        bmtk bmtk8 = (bmtk) bxvd17.mo74062i();
                        bmtk8.getClass();
                        ((bmts) bxvd.f164949b).f130911b = bmtk8;
                    }
                    if (!bydd.f164950c) {
                        bydd.mo74035c();
                        bydd.f164950c = false;
                    }
                    bydf bydf10 = (bydf) bydd.f164949b;
                    bmts bmts5 = (bmts) bxvd.mo74062i();
                    bmts5.getClass();
                    bydf10.f165772b = bmts5;
                    bydf10.f165771a |= 1;
                    return new atdo((bydf) bydd.mo74062i(), this.f90146c);
                }
            }
            if (bydd.f164950c) {
                bydd.mo74035c();
                bydd.f164950c = false;
            }
            bydf bydf11 = (bydf) bydd.f164949b;
            bydf11.f165771a |= 4;
            bydf11.f165775e = 0;
            atdp atdp3 = this.f90145b;
            bmtp bmtp19 = bmts.f130910a;
            if (bmtp19 == null) {
                bmtp19 = bmtp.f130893f;
            }
            bmti bmti20 = bmtp19.f130898d;
            if (bmti20 == null) {
                bmti20 = bmti.f130844c;
            }
            bmtg bmtg6 = bmti20.f130846a;
            if (bmtg6 == null) {
                bmtg6 = bmtg.f130832g;
            }
            bxtx a9 = bxtx.m123261a(atdp3.mo49840a(bArr2, bmtg6.f130836c, askf2));
            if (bydd.f164950c) {
                bydd.mo74035c();
                bydd.f164950c = false;
            }
            bydf bydf12 = (bydf) bydd.f164949b;
            a9.getClass();
            bydf12.f165771a |= 8;
            bydf12.f165776f = a9;
            bmtp bmtp20 = bmts.f130910a;
            if (bmtp20 == null) {
                bmtp20 = bmtp.f130893f;
            }
            bmti bmti21 = bmtp20.f130898d;
            if (bmti21 == null) {
                bmti21 = bmti.f130844c;
            }
            bmtg bmtg7 = bmti21.f130846a;
            if (bmtg7 == null) {
                bmtg7 = bmtg.f130832g;
            }
            long j3 = bmtg7.f130838e;
            long millis = TimeUnit.SECONDS.toMillis(j3) - j;
            if (millis < cgxi.m147449b()) {
                TimeUnit.SECONDS.toMillis(j3);
                System.currentTimeMillis();
                millis = cgxi.m147449b();
            }
            long currentTimeMillis = System.currentTimeMillis() + millis;
            if (bydd.f164950c) {
                bydd.mo74035c();
                bydd.f164950c = false;
            }
            bydf bydf13 = (bydf) bydd.f164949b;
            bydf13.f165771a |= 32;
            bydf13.f165778h = currentTimeMillis;
            bmtp = ((bmts) bxvd.f164949b).f130910a;
            if (bmtp != null) {
            }
            bxvd2 = (bxvd) bmtp.mo74142c(5);
            bxvd2.mo73625a((bxvk) bmtp);
            bmti = ((bmtp) bxvd2.f164949b).f130898d;
            if (bmti != null) {
            }
            bxvd3 = (bxvd) bmti.mo74142c(5);
            bxvd3.mo73625a((bxvk) bmti);
            bmti2 = ((bmtp) bxvd2.f164949b).f130898d;
            if (bmti2 != null) {
            }
            bmtg = bmti2.f130846a;
            if (bmtg != null) {
            }
            bxvd4 = (bxvd) bmtg.mo74142c(5);
            bxvd4.mo73625a((bxvk) bmtg);
            if (!bxvd4.f164950c) {
            }
            ((bmtg) bxvd4.f164949b).f130836c = bmtg.f130832g.f130836c;
            if (!bxvd3.f164950c) {
            }
            bmtg bmtg52 = (bmtg) bxvd4.mo74062i();
            bmtg52.getClass();
            ((bmti) bxvd3.f164949b).f130846a = bmtg52;
            if (!bxvd2.f164950c) {
            }
            bmti bmti192 = (bmti) bxvd3.mo74062i();
            bmti192.getClass();
            ((bmtp) bxvd2.f164949b).f130898d = bmti192;
            if (!bxvd.f164950c) {
            }
            bmtp bmtp182 = (bmtp) bxvd2.mo74062i();
            bmtp182.getClass();
            ((bmts) bxvd.f164949b).f130910a = bmtp182;
            bmtk = ((bmts) bxvd.f164949b).f130911b;
            if (bmtk != null) {
            }
            if (!bydd.f164950c) {
            }
            bydf bydf102 = (bydf) bydd.f164949b;
            bmts bmts52 = (bmts) bxvd.mo74062i();
            bmts52.getClass();
            bydf102.f165772b = bmts52;
            bydf102.f165771a |= 1;
            return new atdo((bydf) bydd.mo74062i(), this.f90146c);
        } catch (UnsupportedEncodingException | GeneralSecurityException | JSONException e) {
            bnsl bnsl = (bnsl) f90144a.mo68388c();
            bnsl.mo68432a("atdq", "b", 227, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Bundle decryption failed");
            throw new RuntimeException(e);
        }
    }
}
