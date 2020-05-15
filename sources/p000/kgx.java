package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.hardware.biometrics.BiometricManager;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.autofill.datasource.chromesync.wallet.PurchaseManagerResultTransformer;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* renamed from: kgx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kgx extends cazu {

    /* renamed from: b */
    private final cazn f24108b;

    /* renamed from: c */
    private final cazn f24109c;

    /* renamed from: d */
    private final cazn f24110d;

    /* renamed from: e */
    private final cazn f24111e;

    /* renamed from: f */
    private final cazn f24112f;

    /* renamed from: g */
    private final cazn f24113g;

    /* renamed from: h */
    private final cazn f24114h;

    /* renamed from: i */
    private final cazn f24115i;

    public kgx(cijl cijl, cijl cijl2, cazn cazn, cazn cazn2, cazn cazn3, cazn cazn4, cazn cazn5, cazn cazn6, cazn cazn7, cazn cazn8) {
        super(cijl2, cbag.m127657a(kgx.class), cijl);
        this.f24108b = cbac.m127643a(cazn);
        this.f24109c = cbac.m127643a(cazn2);
        this.f24110d = cbac.m127643a(cazn3);
        this.f24111e = cbac.m127643a(cazn4);
        this.f24112f = cbac.m127643a(cazn5);
        this.f24113g = cbac.m127643a(cazn6);
        this.f24114h = cbac.m127643a(cazn7);
        this.f24115i = cbac.m127643a(cazn8);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bqgg mo14448a() {
        return bqga.m112779a(this.f24108b.mo75201b(), this.f24109c.mo75201b(), this.f24110d.mo75201b(), this.f24111e.mo75201b(), this.f24112f.mo75201b(), this.f24113g.mo75201b(), this.f24114h.mo75201b(), this.f24115i.mo75201b());
    }

    /* JADX WARNING: Removed duplicated region for block: B:76:0x0218  */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bqgg mo14449b(Object obj) {
        HashSet hashSet;
        boolean z;
        int i;
        bmxv bmxv;
        int i2;
        ArrayList arrayList;
        int i3;
        bmxv bmxv2;
        bmxv bmxv3;
        String str;
        kdg kdg;
        int i4;
        bmvz bmvz;
        boolean z2;
        boolean z3;
        List list = (List) obj;
        Context context = (Context) list.get(1);
        bmxv bmxv4 = (bmxv) list.get(2);
        int intValue = ((Integer) list.get(3)).intValue();
        Account account = (Account) list.get(4);
        bmxv bmxv5 = (bmxv) list.get(5);
        bmxv bmxv6 = (bmxv) list.get(6);
        boolean booleanValue = ((Boolean) list.get(7)).booleanValue();
        ArrayList arrayList2 = new ArrayList();
        HashMap hashMap = new HashMap();
        bnre i5 = ((bngx) list.get(0)).listIterator();
        while (i5.hasNext()) {
            quh quh = (quh) i5.next();
            int a = qug.m32916a(quh.f42139b);
            if (a == 0 || a != 2) {
                int a2 = qug.m32916a(quh.f42139b);
                if (a2 != 0 && a2 == 3 && (quh.f42138a & 4) != 0) {
                    qut qut = quh.f42141d;
                    if (qut == null) {
                        qut = qut.f42198h;
                    }
                    if (!qut.f42201b.isEmpty()) {
                        qut qut2 = quh.f42141d;
                        if (qut2 == null) {
                            qut2 = qut.f42198h;
                        }
                        String str2 = qut2.f42201b;
                        qut qut3 = quh.f42141d;
                        if (qut3 == null) {
                            qut3 = qut.f42198h;
                        }
                        hashMap.put(str2, qut3);
                    }
                }
            } else if ((quh.f42138a & 2) != 0) {
                qus qus = quh.f42140c;
                if (qus == null) {
                    qus = qus.f42187j;
                }
                arrayList2.add(qus);
            }
        }
        HashSet hashSet2 = new HashSet();
        bnia j = bnic.m109500j();
        int size = arrayList2.size();
        int i6 = 0;
        while (i6 < size) {
            qus qus2 = (qus) arrayList2.get(i6);
            String str3 = qus2.f42190b;
            String str4 = qus2.f42193e;
            if (TextUtils.isEmpty(str3)) {
                z = booleanValue;
                hashSet = hashSet2;
                bmxv = bmxv4;
                i2 = i6;
                i = intValue;
                bmxv3 = bmxv5;
                bmxv2 = bmxv6;
                i3 = size;
                arrayList = arrayList2;
            } else if (!TextUtils.isEmpty(str4)) {
                bmxv3 = bmxv5;
                String str5 = (String) bmxv5.mo66815c();
                if (bmxv6.mo66813a()) {
                    bmxv2 = bmxv6;
                    str = ((kdl) bmxv6.mo66814b()).f23841b;
                } else {
                    bmxv2 = bmxv6;
                    str = null;
                }
                i3 = size;
                bmvz bmvz2 = bmvz.f131120a;
                arrayList = arrayList2;
                bxvd da = bwen.f159007i.mo74144da();
                i2 = i6;
                bmxv = bmxv4;
                bweh a3 = lra.m19563a(((Long) bmxv4.mo66812a((Object) 0L)).longValue(), intValue);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bwen bwen = (bwen) da.f164949b;
                a3.getClass();
                bwen.f159010b = a3;
                int i7 = bwen.f159009a | 1;
                bwen.f159009a = i7;
                i = intValue;
                bwen.f159011c = 7;
                int i8 = i7 | 2;
                bwen.f159009a = i8;
                str3.getClass();
                bwen.f159009a = i8 | 4;
                bwen.f159012d = str3;
                bxvd da2 = bwej.f158992b.mo74144da();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bwej bwej = (bwej) da2.f164949b;
                if (!bwej.f158994a.mo73666a()) {
                    bwej.f158994a = GeneratedMessageLite.m124019a(bwej.f158994a);
                }
                bwej.f158994a.mo74153d(1);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bwen bwen2 = (bwen) da.f164949b;
                bwej bwej2 = (bwej) da2.mo74062i();
                bwej2.getClass();
                bwen2.f159015g = bwej2;
                bwen2.f159009a |= 32;
                if (ccit.m129946c()) {
                    if (booleanValue) {
                        int i9 = Build.VERSION.SDK_INT;
                        if (((BiometricManager) context.getSystemService(BiometricManager.class)).canAuthenticate() != 0) {
                            int i10 = Build.VERSION.SDK_INT;
                            FingerprintManager fingerprintManager = (FingerprintManager) context.getSystemService("fingerprint");
                            bmvz2.mo66812a(fingerprintManager);
                            if (fingerprintManager.isHardwareDetected()) {
                                if (!fingerprintManager.hasEnrolledFingerprints()) {
                                    z2 = false;
                                    if (da.f164950c) {
                                        da.mo74035c();
                                        da.f164950c = false;
                                    }
                                    bwen bwen3 = (bwen) da.f164949b;
                                    bwen3.f159009a |= 64;
                                    bwen3.f159016h = z2;
                                }
                            }
                        }
                        z2 = true;
                        if (da.f164950c) {
                        }
                        bwen bwen32 = (bwen) da.f164949b;
                        bwen32.f159009a |= 64;
                        bwen32.f159016h = z2;
                    }
                    z2 = false;
                    if (da.f164950c) {
                    }
                    bwen bwen322 = (bwen) da.f164949b;
                    bwen322.f159009a |= 64;
                    bwen322.f159016h = z2;
                } else if (cciw.f179109a.mo6606a().mo76077j()) {
                    if (!da.f164950c) {
                        z3 = false;
                    } else {
                        da.mo74035c();
                        z3 = false;
                        da.f164950c = false;
                    }
                    bwen bwen4 = (bwen) da.f164949b;
                    bwen4.f159009a |= 64;
                    bwen4.f159016h = z3;
                }
                if (str5 != null) {
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bwen bwen5 = (bwen) da.f164949b;
                    str5.getClass();
                    bwen5.f159009a |= 8;
                    bwen5.f159013e = str5;
                }
                if (str != null) {
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bwen bwen6 = (bwen) da.f164949b;
                    str.getClass();
                    bwen6.f159009a |= 16;
                    bwen6.f159014f = str;
                }
                awlh awlh = new awlh(context);
                awlh.mo52187a(lra.m19561a());
                awlh.mo52188a(account);
                awlh.f94574a.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_UNENCRYPTED_PARAMS", ((bwen) da.mo74062i()).serializeToBytes());
                lra.m19565a(awlh);
                Intent a4 = awlh.mo52186a();
                if (a4 == null) {
                    z = booleanValue;
                    hashSet = hashSet2;
                } else if (hashSet2.add(str3)) {
                    String str6 = qus2.f42191c;
                    YearMonth a5 = kgv.m17827a(qus2);
                    qut qut4 = (qut) hashMap.get(qus2.f42196h);
                    if (qut4 == null) {
                        kdg = kdg.f23871j;
                        z = booleanValue;
                        hashSet = hashSet2;
                    } else {
                        bxvd da3 = kdg.f23871j.mo74144da();
                        bxwc bxwc = qut4.f42202c;
                        int size2 = bxwc.size();
                        z = booleanValue;
                        int i11 = 0;
                        while (i11 < size2) {
                            da3.mo74043d((String) bxwc.get(i11));
                            i11++;
                            hashSet2 = hashSet2;
                        }
                        hashSet = hashSet2;
                        if ((qut4.f42200a & 16) != 0) {
                            String str7 = qut4.f42204e;
                            if (da3.f164950c) {
                                da3.mo74035c();
                                da3.f164950c = false;
                            }
                            kdg kdg2 = (kdg) da3.f164949b;
                            str7.getClass();
                            kdg2.f23873a |= 32;
                            kdg2.f23879g = str7;
                        }
                        if ((qut4.f42200a & 8) != 0) {
                            String str8 = qut4.f42203d;
                            if (da3.f164950c) {
                                da3.mo74035c();
                                da3.f164950c = false;
                            }
                            kdg kdg3 = (kdg) da3.f164949b;
                            str8.getClass();
                            kdg3.f23873a |= 16;
                            kdg3.f23878f = str8;
                        }
                        if ((qut4.f42200a & 128) != 0) {
                            String str9 = qut4.f42205f;
                            if (da3.f164950c) {
                                da3.mo74035c();
                                da3.f164950c = false;
                            }
                            kdg kdg4 = (kdg) da3.f164949b;
                            str9.getClass();
                            kdg4.f23873a |= 4;
                            kdg4.f23876d = str9;
                        }
                        if ((qut4.f42200a & 512) != 0) {
                            String str10 = qut4.f42206g;
                            if (da3.f164950c) {
                                da3.mo74035c();
                                da3.f164950c = false;
                            }
                            kdg kdg5 = (kdg) da3.f164949b;
                            str10.getClass();
                            kdg5.f23873a |= 2;
                            kdg5.f23875c = str10;
                        }
                        kdg = (kdg) da3.mo74062i();
                    }
                    int a6 = qur.m32927a(qus2.f42192d);
                    if (a6 == 0) {
                        a6 = 1;
                    }
                    switch (a6 - 1) {
                        case 1:
                            i4 = 1;
                            break;
                        case 2:
                            i4 = 3;
                            break;
                        case 3:
                            i4 = 4;
                            break;
                        case 4:
                            i4 = 13;
                            break;
                        case 5:
                            i4 = 5;
                            break;
                        case 6:
                            i4 = 7;
                            break;
                        case 7:
                        default:
                            i4 = 0;
                            break;
                        case 8:
                            i4 = 8;
                            break;
                        case 9:
                            i4 = 14;
                            break;
                    }
                    kcs a7 = kcs.m17644a("chromesync_wallet", str3);
                    kcu a8 = kcu.m17653a(account, a7, a4, new PurchaseManagerResultTransformer(str6, a5, kdg, i4));
                    if (!qus2.f42197i.isEmpty()) {
                        bmvz = bmxv.m108566b(qus2.f42197i);
                    } else {
                        bmvz = bmvz.f131120a;
                    }
                    j.mo67629b(kct.m17647a(new kdb(a8, str4, i4, a5, bmvz), a7));
                } else {
                    z = booleanValue;
                    hashSet = hashSet2;
                }
            } else {
                z = booleanValue;
                hashSet = hashSet2;
                bmxv = bmxv4;
                i2 = i6;
                i = intValue;
                bmxv3 = bmxv5;
                bmxv2 = bmxv6;
                i3 = size;
                arrayList = arrayList2;
            }
            i6 = i2 + 1;
            bmxv5 = bmxv3;
            bmxv6 = bmxv2;
            size = i3;
            arrayList2 = arrayList;
            bmxv4 = bmxv;
            intValue = i;
            booleanValue = z;
            hashSet2 = hashSet;
        }
        return bqga.m112775a((Object) j.mo67751a());
    }
}
