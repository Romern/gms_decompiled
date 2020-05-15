package p000;

import android.text.TextUtils;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
import com.google.android.gms.wallet.wobs.LabelValue;
import com.google.android.gms.wallet.wobs.LabelValueRow;
import com.google.android.gms.wallet.wobs.TextModuleData;
import com.google.android.gms.wallet.wobs.TimeInterval;
import com.google.android.gms.wallet.wobs.UriData;
import com.google.android.gms.wallet.wobs.WalletObjectMessage;
import java.util.ArrayList;

/* renamed from: awxk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awxk {
    /* renamed from: a */
    static bmvh m81406a(String str, long j) {
        bxvd da = bmvh.f131044d.mo74144da();
        if (j != 0) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmvh bmvh = (bmvh) da.f164949b;
            bmvh.f131046a |= 1;
            bmvh.f131047b = j;
        }
        if (!TextUtils.isEmpty(str)) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmvh bmvh2 = (bmvh) da.f164949b;
            str.getClass();
            bmvh2.f131046a |= 2;
            bmvh2.f131048c = str;
        }
        return (bmvh) da.mo74062i();
    }

    /* renamed from: a */
    static bmvp m81407a(TimeInterval timeInterval) {
        bxvd da = bmvp.f131078d.mo74144da();
        bxvd da2 = bmva.f131007c.mo74144da();
        long j = timeInterval.f110633a;
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bmva bmva = (bmva) da2.f164949b;
        bmva.f131009a |= 1;
        bmva.f131010b = j;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bmvp bmvp = (bmvp) da.f164949b;
        bmva bmva2 = (bmva) da2.mo74062i();
        bmva2.getClass();
        bmvp.f131081b = bmva2;
        bmvp.f131080a |= 1;
        bxvd da3 = bmva.f131007c.mo74144da();
        long j2 = timeInterval.f110634b;
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        bmva bmva3 = (bmva) da3.f164949b;
        bmva3.f131009a |= 1;
        bmva3.f131010b = j2;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bmvp bmvp2 = (bmvp) da.f164949b;
        bmva bmva4 = (bmva) da3.mo74062i();
        bmva4.getClass();
        bmvp2.f131082c = bmva4;
        bmvp2.f131080a |= 2;
        return (bmvp) da.mo74062i();
    }

    /* renamed from: a */
    static bmvt m81408a(CommonWalletObject commonWalletObject) {
        bmuy bmuy;
        bmvk bmvk;
        bmvn bmvn;
        int i;
        CommonWalletObject commonWalletObject2 = commonWalletObject;
        bxvd da = bmvt.f131089n.mo74144da();
        boolean z = false;
        if (!TextUtils.isEmpty(commonWalletObject2.f110598a)) {
            String str = commonWalletObject2.f110598a;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmvt bmvt = (bmvt) da.f164949b;
            str.getClass();
            bmvt.f131091a |= 1;
            bmvt.f131092b = str;
        }
        if (!TextUtils.isEmpty(commonWalletObject2.f110599b)) {
            String str2 = commonWalletObject2.f110599b;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmvt bmvt2 = (bmvt) da.f164949b;
            str2.getClass();
            bmvt2.f131091a |= 2;
            bmvt2.f131093c = str2;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bmvt bmvt3 = (bmvt) da.f164949b;
        bmvt3.f131091a |= 4;
        bmvt3.f131094d = 1;
        int a = bmvs.m108427a(commonWalletObject2.f110606i);
        if (a != 0) {
            if (a != 1) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bmvt bmvt4 = (bmvt) da.f164949b;
                bmvt4.f131095e = a - 1;
                bmvt4.f131091a |= 8;
            }
            if (!TextUtils.isEmpty(commonWalletObject2.f110604g)) {
                bxvd da2 = bmuy.f131000e.mo74144da();
                if (TextUtils.isEmpty(commonWalletObject2.f110603f)) {
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bmuy bmuy2 = (bmuy) da2.f164949b;
                    bmuy2.f131003b = 19;
                    bmuy2.f131002a |= 1;
                } else {
                    String str3 = commonWalletObject2.f110603f;
                    if (!"aztec".equals(str3)) {
                        i = !"code39".equals(str3) ? !"code128".equals(str3) ? !"codabar".equals(str3) ? !"dataMatrix".equals(str3) ? !"ean8".equals(str3) ? !"ean13".equals(str3) ? !"itf14".equals(str3) ? !"pdf417".equals(str3) ? !"qrCode".equals(str3) ? !"upcA".equals(str3) ? 20 : 16 : 15 : 12 : 11 : 10 : 9 : 8 : 7 : 6 : 4;
                    } else {
                        i = 3;
                    }
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bmuy bmuy3 = (bmuy) da2.f164949b;
                    bmuy3.f131003b = i - 1;
                    bmuy3.f131002a |= 1;
                }
                String str4 = commonWalletObject2.f110604g;
                bmuy bmuy4 = (bmuy) da2.f164949b;
                str4.getClass();
                bmuy4.f131002a |= 4;
                bmuy4.f131004c = str4;
                if (!TextUtils.isEmpty(commonWalletObject2.f110602e)) {
                    String str5 = commonWalletObject2.f110602e;
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bmuy bmuy5 = (bmuy) da2.f164949b;
                    str5.getClass();
                    bmuy5.f131002a = 8 | bmuy5.f131002a;
                    bmuy5.f131005d = str5;
                }
                bmuy = (bmuy) da2.mo74062i();
            } else {
                bmuy = null;
            }
            if (bmuy != null) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bmvt bmvt5 = (bmvt) da.f164949b;
                bmuy.getClass();
                bmvt5.f131096f = bmuy;
                bmvt5.f131091a |= 16;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = commonWalletObject2.f110607j;
            int size = arrayList2.size();
            for (int i2 = 0; i2 < size; i2++) {
                WalletObjectMessage walletObjectMessage = (WalletObjectMessage) arrayList2.get(i2);
                bxvd da3 = bmvv.f131113e.mo74144da();
                if (!TextUtils.isEmpty(walletObjectMessage.f110637a)) {
                    String str6 = walletObjectMessage.f110637a;
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    bmvv bmvv = (bmvv) da3.f164949b;
                    str6.getClass();
                    bmvv.f131115a |= 1;
                    bmvv.f131116b = str6;
                }
                if (!TextUtils.isEmpty(walletObjectMessage.f110638b)) {
                    String str7 = walletObjectMessage.f110638b;
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    bmvv bmvv2 = (bmvv) da3.f164949b;
                    str7.getClass();
                    bmvv2.f131115a |= 4;
                    bmvv2.f131117c = str7;
                }
                TimeInterval timeInterval = walletObjectMessage.f110639c;
                if (timeInterval != null) {
                    bmvp a2 = m81407a(timeInterval);
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    bmvv bmvv3 = (bmvv) da3.f164949b;
                    a2.getClass();
                    bmvv3.f131118d = a2;
                    bmvv3.f131115a |= 16;
                }
                arrayList.add((bmvv) da3.mo74062i());
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmvt bmvt6 = (bmvt) da.f164949b;
            if (!bmvt6.f131097g.mo73666a()) {
                bmvt6.f131097g = bxvk.m124021a(bmvt6.f131097g);
            }
            bxsy.m123078a(arrayList, bmvt6.f131097g);
            TimeInterval timeInterval2 = commonWalletObject2.f110608k;
            if (timeInterval2 != null) {
                bmvp a3 = m81407a(timeInterval2);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bmvt bmvt7 = (bmvt) da.f164949b;
                a3.getClass();
                bmvt7.f131098h = a3;
                bmvt7.f131091a |= 32;
            }
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = commonWalletObject2.f110609l;
            int size2 = arrayList4.size();
            for (int i3 = 0; i3 < size2; i3++) {
                LatLng latLng = (LatLng) arrayList4.get(i3);
                bxvd da4 = bmvb.f131011d.mo74144da();
                double d = latLng.f79894a;
                if (da4.f164950c) {
                    da4.mo74035c();
                    da4.f164950c = false;
                }
                bmvb bmvb = (bmvb) da4.f164949b;
                int i4 = bmvb.f131013a | 1;
                bmvb.f131013a = i4;
                bmvb.f131014b = d;
                double d2 = latLng.f79895b;
                bmvb.f131013a = i4 | 2;
                bmvb.f131015c = d2;
                arrayList3.add((bmvb) da4.mo74062i());
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmvt bmvt8 = (bmvt) da.f164949b;
            if (!bmvt8.f131099i.mo73666a()) {
                bmvt8.f131099i = bxvk.m124021a(bmvt8.f131099i);
            }
            bxsy.m123078a(arrayList3, bmvt8.f131099i);
            if (commonWalletObject2.f110612o.isEmpty() && !commonWalletObject2.f110613p) {
                bmvk = null;
            } else {
                bxvd da5 = bmvk.f131057d.mo74144da();
                ArrayList arrayList5 = commonWalletObject2.f110612o;
                int size3 = arrayList5.size();
                int i5 = 0;
                while (i5 < size3) {
                    bxvd da6 = bmvm.f131067b.mo74144da();
                    ArrayList arrayList6 = ((LabelValueRow) arrayList5.get(i5)).f110621c;
                    int size4 = arrayList6.size();
                    int i6 = 0;
                    while (i6 < size4) {
                        LabelValue labelValue = (LabelValue) arrayList6.get(i6);
                        bxvd da7 = bmvl.f131062d.mo74144da();
                        if (!TextUtils.isEmpty(labelValue.f110617a)) {
                            String str8 = labelValue.f110617a;
                            if (da7.f164950c) {
                                da7.mo74035c();
                                da7.f164950c = z;
                            }
                            bmvl bmvl = (bmvl) da7.f164949b;
                            str8.getClass();
                            bmvl.f131064a |= 1;
                            bmvl.f131065b = str8;
                        }
                        if (!TextUtils.isEmpty(labelValue.f110618b)) {
                            String str9 = labelValue.f110618b;
                            if (da7.f164950c) {
                                da7.mo74035c();
                                da7.f164950c = false;
                            }
                            bmvl bmvl2 = (bmvl) da7.f164949b;
                            str9.getClass();
                            bmvl2.f131064a |= 4;
                            bmvl2.f131066c = str9;
                        }
                        bmvl bmvl3 = (bmvl) da7.mo74062i();
                        if (da6.f164950c) {
                            da6.mo74035c();
                            da6.f164950c = false;
                        }
                        bmvm bmvm = (bmvm) da6.f164949b;
                        bmvl3.getClass();
                        if (!bmvm.f131069a.mo73666a()) {
                            bmvm.f131069a = bxvk.m124021a(bmvm.f131069a);
                        }
                        bmvm.f131069a.add(bmvl3);
                        i6++;
                        z = false;
                    }
                    bmvm bmvm2 = (bmvm) da6.mo74062i();
                    if (da5.f164950c) {
                        da5.mo74035c();
                        da5.f164950c = false;
                    }
                    bmvk bmvk2 = (bmvk) da5.f164949b;
                    bmvm2.getClass();
                    if (!bmvk2.f131060b.mo73666a()) {
                        bmvk2.f131060b = bxvk.m124021a(bmvk2.f131060b);
                    }
                    bmvk2.f131060b.add(bmvm2);
                    i5++;
                    z = false;
                }
                boolean z2 = commonWalletObject2.f110613p;
                if (da5.f164950c) {
                    da5.mo74035c();
                    da5.f164950c = false;
                }
                bmvk bmvk3 = (bmvk) da5.f164949b;
                bmvk3.f131059a |= 1;
                bmvk3.f131061c = z2;
                bmvk = (bmvk) da5.mo74062i();
            }
            if (bmvk != null) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bmvt bmvt9 = (bmvt) da.f164949b;
                bmvk.getClass();
                bmvt9.f131100j = bmvk;
                bmvt9.f131091a |= 4096;
            }
            ArrayList arrayList7 = new ArrayList();
            ArrayList arrayList8 = commonWalletObject2.f110614q;
            int size5 = arrayList8.size();
            for (int i7 = 0; i7 < size5; i7++) {
                UriData uriData = (UriData) arrayList8.get(i7);
                bxvd da8 = bmvj.f131053c.mo74144da();
                bxvd da9 = bmvc.f131016c.mo74144da();
                bxvd da10 = bmvd.f131020d.mo74144da();
                if (!TextUtils.isEmpty(uriData.f110635a)) {
                    String str10 = uriData.f110635a;
                    if (da10.f164950c) {
                        da10.mo74035c();
                        da10.f164950c = false;
                    }
                    bmvd bmvd = (bmvd) da10.f164949b;
                    str10.getClass();
                    bmvd.f131022a |= 1;
                    bmvd.f131023b = str10;
                }
                if (!TextUtils.isEmpty(uriData.f110636b)) {
                    String str11 = uriData.f110636b;
                    if (da10.f164950c) {
                        da10.mo74035c();
                        da10.f164950c = false;
                    }
                    bmvd bmvd2 = (bmvd) da10.f164949b;
                    str11.getClass();
                    bmvd2.f131022a |= 2;
                    bmvd2.f131024c = str11;
                }
                bmvd bmvd3 = (bmvd) da10.mo74062i();
                if (da9.f164950c) {
                    da9.mo74035c();
                    da9.f164950c = false;
                }
                bmvc bmvc = (bmvc) da9.f164949b;
                bmvd3.getClass();
                bmvc.f131019b = bmvd3;
                bmvc.f131018a |= 1;
                bmvc bmvc2 = (bmvc) da9.mo74062i();
                if (da8.f164950c) {
                    da8.mo74035c();
                    da8.f164950c = false;
                }
                bmvj bmvj = (bmvj) da8.f164949b;
                bmvc2.getClass();
                bmvj.f131056b = bmvc2;
                bmvj.f131055a |= 1;
                arrayList7.add((bmvj) da8.mo74062i());
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmvt bmvt10 = (bmvt) da.f164949b;
            if (!bmvt10.f131101k.mo73666a()) {
                bmvt10.f131101k = bxvk.m124021a(bmvt10.f131101k);
            }
            bxsy.m123078a(arrayList7, bmvt10.f131101k);
            ArrayList arrayList9 = new ArrayList();
            ArrayList arrayList10 = commonWalletObject2.f110615r;
            int size6 = arrayList10.size();
            for (int i8 = 0; i8 < size6; i8++) {
                TextModuleData textModuleData = (TextModuleData) arrayList10.get(i8);
                bxvd da11 = bmvo.f131073d.mo74144da();
                if (!TextUtils.isEmpty(textModuleData.f110631a)) {
                    String str12 = textModuleData.f110631a;
                    if (da11.f164950c) {
                        da11.mo74035c();
                        da11.f164950c = false;
                    }
                    bmvo bmvo = (bmvo) da11.f164949b;
                    str12.getClass();
                    bmvo.f131075a |= 1;
                    bmvo.f131076b = str12;
                }
                if (!TextUtils.isEmpty(textModuleData.f110632b)) {
                    String str13 = textModuleData.f110632b;
                    if (da11.f164950c) {
                        da11.mo74035c();
                        da11.f164950c = false;
                    }
                    bmvo bmvo2 = (bmvo) da11.f164949b;
                    str13.getClass();
                    bmvo2.f131075a |= 2;
                    bmvo2.f131077c = str13;
                }
                arrayList9.add((bmvo) da11.mo74062i());
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmvt bmvt11 = (bmvt) da.f164949b;
            if (!bmvt11.f131102l.mo73666a()) {
                bmvt11.f131102l = bxvk.m124021a(bmvt11.f131102l);
            }
            bxsy.m123078a(arrayList9, bmvt11.f131102l);
            ArrayList arrayList11 = commonWalletObject2.f110616s;
            if (!arrayList11.isEmpty()) {
                bxvd da12 = bmvn.f131070b.mo74144da();
                int size7 = arrayList11.size();
                for (int i9 = 0; i9 < size7; i9++) {
                    UriData uriData2 = (UriData) arrayList11.get(i9);
                    bxvd da13 = bmvq.f131083d.mo74144da();
                    if (!TextUtils.isEmpty(uriData2.f110635a)) {
                        String str14 = uriData2.f110635a;
                        if (da13.f164950c) {
                            da13.mo74035c();
                            da13.f164950c = false;
                        }
                        bmvq bmvq = (bmvq) da13.f164949b;
                        str14.getClass();
                        bmvq.f131085a |= 1;
                        bmvq.f131086b = str14;
                    }
                    if (!TextUtils.isEmpty(uriData2.f110636b)) {
                        String str15 = uriData2.f110636b;
                        if (da13.f164950c) {
                            da13.mo74035c();
                            da13.f164950c = false;
                        }
                        bmvq bmvq2 = (bmvq) da13.f164949b;
                        str15.getClass();
                        bmvq2.f131085a |= 2;
                        bmvq2.f131087c = str15;
                    }
                    bmvq bmvq3 = (bmvq) da13.mo74062i();
                    if (da12.f164950c) {
                        da12.mo74035c();
                        da12.f164950c = false;
                    }
                    bmvn bmvn2 = (bmvn) da12.f164949b;
                    bmvq3.getClass();
                    if (!bmvn2.f131072a.mo73666a()) {
                        bmvn2.f131072a = bxvk.m124021a(bmvn2.f131072a);
                    }
                    bmvn2.f131072a.add(bmvq3);
                }
                bmvn = (bmvn) da12.mo74062i();
            } else {
                bmvn = null;
            }
            if (bmvn != null) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bmvt bmvt12 = (bmvt) da.f164949b;
                bmvn.getClass();
                bmvt12.f131103m = bmvn;
                bmvt12.f131091a |= 8192;
            }
            return (bmvt) da.mo74062i();
        }
        throw null;
    }
}
