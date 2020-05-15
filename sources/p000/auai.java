package p000;

import android.accounts.Account;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import com.google.android.gms.tapandpay.firstparty.BadgeInfo;
import com.google.android.gms.tapandpay.firstparty.CardInfo;
import com.google.android.gms.tapandpay.firstparty.IssuerInfo;
import com.google.android.gms.tapandpay.firstparty.TokenReference;
import com.google.android.gms.tapandpay.firstparty.TokenStatus;
import com.google.android.gms.tapandpay.firstparty.TransactionInfo;
import com.google.android.gms.wallet.firstparty.WalletCustomTheme;
import com.google.android.gms.wallet.shared.ApplicationParameters;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.gms.wearable.internal.MessageEventParcelable;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterOutputStream;

/* renamed from: auai */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auai {

    /* renamed from: a */
    private static final srn f91321a = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: a */
    private static Account m76638a(atyk atyk) {
        if (!atyk.f91112c.equals(atyk)) {
            return new Account(atyk.f91114a, atyk.f91115b);
        }
        return null;
    }

    /* renamed from: b */
    public static atyp m76651b(Bundle bundle) {
        bxvd da = atyp.f91140b.mo74144da();
        for (String str : bundle.keySet()) {
            try {
                atzo a = m76646a(bundle.get(str));
                str.getClass();
                a.getClass();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                atyp atyp = (atyp) da.f164949b;
                bxww bxww = atyp.f91142a;
                if (!bxww.f165014a) {
                    atyp.f91142a = bxww.mo74203a();
                }
                atyp.f91142a.put(str, a);
            } catch (Exception e) {
                throw new RuntimeException("Error converting bundle", e);
            }
        }
        return (atyp) da.mo74062i();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnkn.a(java.util.List, bmxj):java.util.List
     arg types: [bxwc, bmxj]
     candidates:
      bnkn.a(java.util.List, int):java.util.List
      bnkn.a(java.util.List, java.lang.Object):boolean
      bnkn.a(java.util.List, bmxj):java.util.List */
    /* renamed from: a */
    private static Bundle m76639a(atyp atyp) {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : Collections.unmodifiableMap(atyp.f91142a).entrySet()) {
            String str = (String) entry.getKey();
            atzo atzo = (atzo) entry.getValue();
            atzn atzn = atzn.VALUE_TYPE_UNKNOWN;
            atzn a = atzn.m76605a(atzo.f91269a);
            if (a == null) {
                a = atzn.UNRECOGNIZED;
            }
            ApplicationParameters applicationParameters = null;
            AccountInfo accountInfo = null;
            WalletCustomTheme walletCustomTheme = null;
            switch (a.ordinal()) {
                case 0:
                    bundle.putParcelable(str, null);
                    break;
                case 1:
                    bundle.putParcelableArrayList(str, new ArrayList());
                    break;
                case 2:
                    bundle.putBoolean(str, atzo.f91270b);
                    break;
                case 3:
                    bundle.putInt(str, atzo.f91271c);
                    break;
                case 4:
                    bundle.putLong(str, atzo.f91272d);
                    break;
                case 5:
                    bundle.putString(str, atzo.f91273e);
                    break;
                case 6:
                    bundle.putByteArray(str, atzo.f91274f.getKey());
                    break;
                case 7:
                    atyp atyp2 = atzo.f91275g;
                    if (atyp2 == null) {
                        atyp2 = atyp.f91140b;
                    }
                    bundle.putParcelable(str, m76639a(atyp2));
                    break;
                case 8:
                    atyr atyr = atzo.f91276h;
                    if (atyr == null) {
                        atyr = atyr.f91150x;
                    }
                    bundle.putParcelable(str, m76647a(atyr));
                    break;
                case 9:
                    bundle.putParcelableArrayList(str, bnkn.m109663a((Iterable) bnkn.m109668a((List) atzo.f91277i, auaf.f91318a)));
                    break;
                case 10:
                    atyq atyq = atzo.f91278j;
                    if (atyq == null) {
                        atyq = atyq.f91143f;
                    }
                    awyb a2 = BuyFlowConfig.m94175a();
                    a2.mo52753d(atyq.f91145a);
                    atym atym = atyq.f91146b;
                    if (atym == null) {
                        atym = atym.f91120j;
                    }
                    if (!atym.f91120j.equals(atym)) {
                        awxz a3 = ApplicationParameters.m94173a();
                        a3.mo52744b(atym.f91122a);
                        atyk atyk = atym.f91123b;
                        if (atyk == null) {
                            atyk = atyk.f91112c;
                        }
                        a3.mo52739a(m76638a(atyk));
                        a3.mo52742a(atym.f91125d);
                        a3.mo52745c(atym.f91126e);
                        a3.mo52738a(atym.f91128g);
                        atyp atyp3 = atym.f91124c;
                        if (atyp3 == null) {
                            atyp3 = atyp.f91140b;
                        }
                        a3.mo52740a(m76639a(atyp3));
                        atzs atzs = atym.f91127f;
                        if (atzs == null) {
                            atzs = atzs.f91294d;
                        }
                        if (!atzs.f91294d.equals(atzs)) {
                            walletCustomTheme = new WalletCustomTheme();
                            walletCustomTheme.f110168a = atzs.f91296a;
                            Bundle bundle2 = walletCustomTheme.f110169b;
                            atyp atyp4 = atzs.f91297b;
                            if (atyp4 == null) {
                                atyp4 = atyp.f91140b;
                            }
                            bundle2.putAll(m76639a(atyp4));
                            walletCustomTheme.f110170c = atzs.f91298c;
                        }
                        a3.mo52741a(walletCustomTheme);
                        a3.mo52743b(atym.f91129h);
                        a3.mo52737a(atym.f91130i);
                        applicationParameters = a3.f95270a;
                    }
                    a2.mo52749a(applicationParameters);
                    a2.mo52751b(atyq.f91147c);
                    a2.mo52752c(atyq.f91148d);
                    a2.mo52750a(atyq.f91149e);
                    bundle.putParcelable(str, a2.mo52748a());
                    break;
                case 11:
                    atyk atyk2 = atzo.f91279k;
                    if (atyk2 == null) {
                        atyk2 = atyk.f91112c;
                    }
                    bundle.putParcelable(str, m76638a(atyk2));
                    break;
                case 12:
                    atyl atyl = atzo.f91280l;
                    if (atyl == null) {
                        atyl = atyl.f91116c;
                    }
                    if (!atyl.f91116c.equals(atyl)) {
                        accountInfo = new AccountInfo(atyl.f91118a, atyl.f91119b);
                    }
                    bundle.putParcelable(str, accountInfo);
                    break;
                case 13:
                default:
                    bnsl bnsl = (bnsl) f91321a.mo68387b();
                    bnsl.mo68432a("auai", "a", 170, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    atzn a4 = atzn.m76605a(atzo.f91269a);
                    if (a4 == null) {
                        a4 = atzn.UNRECOGNIZED;
                    }
                    bnsl.mo68424a("Unknown value type %s for key %s", a4, str);
                    break;
                case 14:
                    bundle.putSerializable(str, bnkn.m109663a((Iterable) bnkn.m109668a((List) atzo.f91282n, auae.f91317a)));
                    break;
            }
        }
        return bundle;
    }

    /* renamed from: b */
    private static ByteString m76652b(byte[] bArr) {
        if (bArr != null) {
            return ByteString.m123261a(bArr);
        }
        return null;
    }

    /* renamed from: b */
    private static String m76653b(Object obj) {
        if (obj != null) {
            return obj.toString();
        }
        return null;
    }

    /* renamed from: a */
    public static Bundle m76640a(MessageEventParcelable messageEventParcelable) {
        Bundle a = m76641a(messageEventParcelable.f110948c);
        a.putString("nodeId", messageEventParcelable.f110949d);
        return a;
    }

    /* renamed from: a */
    public static Bundle m76641a(byte[] bArr) {
        try {
            return m76639a((atyp) GeneratedMessageLite.m124016a(atyp.f91140b, bArr, bxus.m123744c()));
        } catch (bxwf e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    private static atyk m76642a(Account account) {
        if (account == null) {
            return null;
        }
        bxvd da = atyk.f91112c.mo74144da();
        if (account.name != null) {
            String str = account.name;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            str.getClass();
            ((atyk) da.f164949b).f91114a = str;
        }
        if (account.type != null) {
            String str2 = account.type;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            str2.getClass();
            ((atyk) da.f164949b).f91115b = str2;
        }
        return (atyk) da.mo74062i();
    }

    /* renamed from: a */
    public static atyr m76643a(CardInfo cardInfo) {
        atzd atzd;
        atyn atyn;
        if (cardInfo == null) {
            return null;
        }
        bxvd da = atyr.f91150x.mo74144da();
        String str = cardInfo.f108340a;
        if (str != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            str.getClass();
            ((atyr) da.f164949b).f91152a = str;
        }
        String str2 = cardInfo.f108340a;
        if (str2 != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            str2.getClass();
            ((atyr) da.f164949b).f91152a = str2;
        }
        ByteString b = m76652b(cardInfo.f108341b);
        if (b != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            b.getClass();
            ((atyr) da.f164949b).f91153b = b;
        }
        String b2 = m76653b(cardInfo.f108342c);
        if (b2 != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            b2.getClass();
            ((atyr) da.f164949b).f91154c = b2;
        }
        String b3 = m76653b(cardInfo.f108343d);
        if (b3 != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            b3.getClass();
            ((atyr) da.f164949b).f91155d = b3;
        }
        int i = cardInfo.f108344e;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((atyr) da.f164949b).f91156e = i;
        atzl a = m76644a(cardInfo.f108345f);
        if (a != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            a.getClass();
            ((atyr) da.f164949b).f91157f = a;
        }
        String str3 = cardInfo.f108346g;
        if (str3 != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            str3.getClass();
            ((atyr) da.f164949b).f91158g = str3;
        }
        String b4 = m76653b(cardInfo.f108347h);
        if (b4 != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            b4.getClass();
            ((atyr) da.f164949b).f91159h = b4;
        }
        int i2 = cardInfo.f108348i;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        atyr atyr = (atyr) da.f164949b;
        atyr.f91160i = i2;
        atyr.f91161j = cardInfo.f108349j;
        IssuerInfo issuerInfo = cardInfo.f108350k;
        if (issuerInfo != null) {
            bxvd da2 = atzd.f91193v.mo74144da();
            String str4 = issuerInfo.f108388a;
            if (str4 != null) {
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                str4.getClass();
                ((atzd) da2.f164949b).f91195a = str4;
            }
            String str5 = issuerInfo.f108389b;
            if (str5 != null) {
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                str5.getClass();
                ((atzd) da2.f164949b).f91196b = str5;
            }
            String str6 = issuerInfo.f108390c;
            if (str6 != null) {
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                str6.getClass();
                ((atzd) da2.f164949b).f91197c = str6;
            }
            String str7 = issuerInfo.f108391d;
            if (str7 != null) {
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                str7.getClass();
                ((atzd) da2.f164949b).f91198d = str7;
            }
            String str8 = issuerInfo.f108392e;
            if (str8 != null) {
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                str8.getClass();
                ((atzd) da2.f164949b).f91199e = str8;
            }
            String str9 = issuerInfo.f108393f;
            if (str9 != null) {
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                str9.getClass();
                ((atzd) da2.f164949b).f91200f = str9;
            }
            String str10 = issuerInfo.f108394g;
            if (str10 != null) {
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                str10.getClass();
                ((atzd) da2.f164949b).f91201g = str10;
            }
            String str11 = issuerInfo.f108395h;
            if (str11 != null) {
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                str11.getClass();
                ((atzd) da2.f164949b).f91202h = str11;
            }
            String str12 = issuerInfo.f108396i;
            if (str12 != null) {
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                str12.getClass();
                ((atzd) da2.f164949b).f91203i = str12;
            }
            String str13 = issuerInfo.f108397j;
            if (str13 != null) {
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                str13.getClass();
                ((atzd) da2.f164949b).f91204j = str13;
            }
            String str14 = issuerInfo.f108398k;
            if (str14 != null) {
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                str14.getClass();
                ((atzd) da2.f164949b).f91205k = str14;
            }
            String str15 = issuerInfo.f108399l;
            if (str15 != null) {
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                str15.getClass();
                ((atzd) da2.f164949b).f91206l = str15;
            }
            String str16 = issuerInfo.f108400m;
            if (str16 != null) {
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                str16.getClass();
                ((atzd) da2.f164949b).f91207m = str16;
            }
            long j = issuerInfo.f108401n;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            atzd atzd2 = (atzd) da2.f164949b;
            atzd2.f91208n = j;
            String str17 = issuerInfo.f108402o;
            if (str17 != null) {
                str17.getClass();
                atzd2.f91209o = str17;
            }
            String str18 = issuerInfo.f108403p;
            if (str18 != null) {
                str18.getClass();
                atzd2.f91210p = str18;
            }
            String str19 = issuerInfo.f108404q;
            if (str19 != null) {
                str19.getClass();
                atzd2.f91211q = str19;
            }
            String str20 = issuerInfo.f108405r;
            if (str20 != null) {
                str20.getClass();
                atzd2.f91212r = str20;
            }
            String str21 = issuerInfo.f108406s;
            if (str21 != null) {
                str21.getClass();
                atzd2.f91213s = str21;
            }
            String str22 = issuerInfo.f108407t;
            if (str22 != null) {
                str22.getClass();
                atzd2.f91214t = str22;
            }
            String str23 = issuerInfo.f108408u;
            if (str23 != null) {
                str23.getClass();
                atzd2.f91214t = str23;
            }
            atzd2.f91215u = issuerInfo.f108409v;
            atzd = (atzd) da2.mo74062i();
        } else {
            atzd = null;
        }
        if (atzd != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            atzd.getClass();
            ((atyr) da.f164949b).f91162k = atzd;
        }
        String str24 = cardInfo.f108351l;
        if (str24 != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            str24.getClass();
            ((atyr) da.f164949b).f91163l = str24;
        }
        atzm a2 = m76645a(cardInfo.f108352m);
        if (a2 != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            a2.getClass();
            ((atyr) da.f164949b).f91164m = a2;
        }
        String str25 = cardInfo.f108353n;
        if (str25 != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            str25.getClass();
            ((atyr) da.f164949b).f91165n = str25;
        }
        ByteString b5 = m76652b(cardInfo.f108354o);
        if (b5 != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            b5.getClass();
            ((atyr) da.f164949b).f91166o = b5;
        }
        int i3 = cardInfo.f108355p;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        atyr atyr2 = (atyr) da.f164949b;
        atyr2.f91167p = i3;
        atyr2.f91168q = cardInfo.f108362w;
        List list = cardInfo.f108363x;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            BadgeInfo badgeInfo = (BadgeInfo) list.get(i4);
            if (badgeInfo != null) {
                bxvd da3 = atyn.f91131g.mo74144da();
                String str26 = badgeInfo.f108327a;
                if (str26 != null) {
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    str26.getClass();
                    ((atyn) da3.f164949b).f91133a = str26;
                }
                byte[] bArr = badgeInfo.f108328b;
                if (bArr != null) {
                    ByteString a3 = ByteString.m123261a(bArr);
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    a3.getClass();
                    ((atyn) da3.f164949b).f91134b = a3;
                }
                int i5 = badgeInfo.f108329c;
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                ((atyn) da3.f164949b).f91135c = i5;
                atzl a4 = m76644a(badgeInfo.f108330d);
                if (a4 != null) {
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    a4.getClass();
                    ((atyn) da3.f164949b).f91136d = a4;
                }
                String str27 = badgeInfo.f108331e;
                if (str27 != null) {
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    str27.getClass();
                    ((atyn) da3.f164949b).f91137e = str27;
                }
                atzm a5 = m76645a(badgeInfo.f108332f);
                if (a5 != null) {
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    a5.getClass();
                    ((atyn) da3.f164949b).f91138f = a5;
                }
                atyn = (atyn) da3.mo74062i();
            } else {
                atyn = null;
            }
            arrayList.add(atyn);
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        atyr atyr3 = (atyr) da.f164949b;
        if (!atyr3.f91169r.mo73666a()) {
            atyr3.f91169r = GeneratedMessageLite.m124021a(atyr3.f91169r);
        }
        bxsy.m123078a(arrayList, atyr3.f91169r);
        boolean z = cardInfo.f108364y;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        atyr atyr4 = (atyr) da.f164949b;
        atyr4.f91170s = z;
        atyr4.f91171t = cardInfo.f108365z;
        atyr4.f91172u = cardInfo.f108334A;
        atyr4.f91173v = cardInfo.f108336C;
        atyr4.f91174w = cardInfo.f108337D;
        return (atyr) da.mo74062i();
    }

    /* renamed from: a */
    private static atzl m76644a(TokenStatus tokenStatus) {
        atzk atzk = null;
        if (tokenStatus == null) {
            return null;
        }
        bxvd da = atzl.f91238d.mo74144da();
        TokenReference tokenReference = tokenStatus.f108458a;
        if (tokenReference != null) {
            bxvd da2 = atzk.f91234c.mo74144da();
            String str = tokenReference.f108456a;
            if (str != null) {
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                str.getClass();
                ((atzk) da2.f164949b).f91236a = str;
            }
            int i = tokenReference.f108457b;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            ((atzk) da2.f164949b).f91237b = i;
            atzk = (atzk) da2.mo74062i();
        }
        if (atzk != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            atzk.getClass();
            ((atzl) da.f164949b).f91240a = atzk;
        }
        int i2 = tokenStatus.f108459b;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        atzl atzl = (atzl) da.f164949b;
        atzl.f91241b = i2;
        atzl.f91242c = tokenStatus.f108460c;
        return (atzl) da.mo74062i();
    }

    /* renamed from: a */
    private static atzm m76645a(TransactionInfo transactionInfo) {
        if (transactionInfo == null) {
            return null;
        }
        bxvd da = atzm.f91243e.mo74144da();
        int i = transactionInfo.f108468a;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        atzm atzm = (atzm) da.f164949b;
        atzm.f91245a = i;
        atzm.f91246b = transactionInfo.f108469b;
        return (atzm) da.mo74062i();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnkn.a(java.util.List, bmxj):java.util.List
     arg types: [java.util.ArrayList, bmxj]
     candidates:
      bnkn.a(java.util.List, int):java.util.List
      bnkn.a(java.util.List, java.lang.Object):boolean
      bnkn.a(java.util.List, bmxj):java.util.List */
    /* renamed from: a */
    private static atzo m76646a(Object obj) {
        bxvd da = atzo.f91267o.mo74144da();
        if (obj != null) {
            boolean z = obj instanceof List;
            if (z && ((List) obj).isEmpty()) {
                atzn atzn = atzn.VALUE_TYPE_UNKNOWN_LIST;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                ((atzo) da.f164949b).f91269a = atzn.mo3214a();
            } else if (obj instanceof Boolean) {
                atzn atzn2 = atzn.VALUE_TYPE_BOOLEAN;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                ((atzo) da.f164949b).f91269a = atzn2.mo3214a();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                ((atzo) da.f164949b).f91270b = booleanValue;
            } else if (obj instanceof Integer) {
                atzn atzn3 = atzn.VALUE_TYPE_INT;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                ((atzo) da.f164949b).f91269a = atzn3.mo3214a();
                int intValue = ((Integer) obj).intValue();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                ((atzo) da.f164949b).f91271c = intValue;
            } else if (obj instanceof Long) {
                atzn atzn4 = atzn.VALUE_TYPE_LONG;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                ((atzo) da.f164949b).f91269a = atzn4.mo3214a();
                long longValue = ((Long) obj).longValue();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                ((atzo) da.f164949b).f91272d = longValue;
            } else if (obj instanceof String) {
                atzn atzn5 = atzn.VALUE_TYPE_STRING;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                ((atzo) da.f164949b).f91269a = atzn5.mo3214a();
                String str = (String) obj;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                str.getClass();
                ((atzo) da.f164949b).f91273e = str;
            } else if (obj instanceof byte[]) {
                atzn atzn6 = atzn.VALUE_TYPE_BYTES;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                ((atzo) da.f164949b).f91269a = atzn6.mo3214a();
                ByteString a = ByteString.m123261a((byte[]) obj);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                a.getClass();
                ((atzo) da.f164949b).f91274f = a;
            } else if (obj instanceof CardInfo) {
                atzn atzn7 = atzn.VALUE_TYPE_CARD_INFO;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                ((atzo) da.f164949b).f91269a = atzn7.mo3214a();
                atyr a2 = m76643a((CardInfo) obj);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                a2.getClass();
                ((atzo) da.f164949b).f91276h = a2;
            } else if (obj instanceof CardInfo[]) {
                atzn atzn8 = atzn.VALUE_TYPE_CARD_INFOS;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                ((atzo) da.f164949b).f91269a = atzn8.mo3214a();
                List a3 = bnkn.m109668a(Arrays.asList((CardInfo[]) obj), auah.f91320a);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                atzo atzo = (atzo) da.f164949b;
                if (!atzo.f91277i.mo73666a()) {
                    atzo.f91277i = GeneratedMessageLite.m124021a(atzo.f91277i);
                }
                bxsy.m123078a(a3, atzo.f91277i);
            } else {
                if (z) {
                    List list = (List) obj;
                    if (list.get(0) instanceof CardInfo) {
                        return m76646a((CardInfo[]) list.toArray(new CardInfo[0]));
                    }
                }
                if (obj instanceof Bundle) {
                    atzn atzn9 = atzn.VALUE_TYPE_BUNDLE;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    ((atzo) da.f164949b).f91269a = atzn9.mo3214a();
                    atyp b = m76651b((Bundle) obj);
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    b.getClass();
                    ((atzo) da.f164949b).f91275g = b;
                } else if (obj instanceof BuyFlowConfig) {
                    atzn atzn10 = atzn.VALUE_TYPE_BUY_FLOW_CONFIG;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    ((atzo) da.f164949b).f91269a = atzn10.mo3214a();
                    BuyFlowConfig buyFlowConfig = (BuyFlowConfig) obj;
                    bxvd da2 = atyq.f91143f.mo74144da();
                    String str2 = buyFlowConfig.f110417a;
                    if (str2 != null) {
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        str2.getClass();
                        ((atyq) da2.f164949b).f91145a = str2;
                    }
                    String str3 = buyFlowConfig.f110419c;
                    if (str3 != null) {
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        str3.getClass();
                        ((atyq) da2.f164949b).f91147c = str3;
                    }
                    ApplicationParameters applicationParameters = buyFlowConfig.f110418b;
                    atym atym = null;
                    atzs atzs = null;
                    if (applicationParameters != null) {
                        bxvd da3 = atym.f91120j.mo74144da();
                        int i = applicationParameters.f110406a;
                        if (da3.f164950c) {
                            da3.mo74035c();
                            da3.f164950c = false;
                        }
                        ((atym) da3.f164949b).f91122a = i;
                        atyk a4 = m76642a(applicationParameters.f110407b);
                        if (a4 != null) {
                            if (da3.f164950c) {
                                da3.mo74035c();
                                da3.f164950c = false;
                            }
                            a4.getClass();
                            ((atym) da3.f164949b).f91123b = a4;
                        }
                        atyp b2 = m76651b(applicationParameters.f110408c);
                        if (b2 != null) {
                            if (da3.f164950c) {
                                da3.mo74035c();
                                da3.f164950c = false;
                            }
                            b2.getClass();
                            ((atym) da3.f164949b).f91124c = b2;
                        }
                        boolean z2 = applicationParameters.f110409d;
                        if (da3.f164950c) {
                            da3.mo74035c();
                            da3.f164950c = false;
                        }
                        atym atym2 = (atym) da3.f164949b;
                        atym2.f91125d = z2;
                        atym2.f91126e = applicationParameters.f110410e;
                        WalletCustomTheme walletCustomTheme = applicationParameters.f110411f;
                        if (walletCustomTheme != null) {
                            bxvd da4 = atzs.f91294d.mo74144da();
                            int i2 = walletCustomTheme.f110168a;
                            if (da4.f164950c) {
                                da4.mo74035c();
                                da4.f164950c = false;
                            }
                            ((atzs) da4.f164949b).f91296a = i2;
                            atyp b3 = m76651b(walletCustomTheme.f110169b);
                            if (b3 != null) {
                                if (da4.f164950c) {
                                    da4.mo74035c();
                                    da4.f164950c = false;
                                }
                                b3.getClass();
                                ((atzs) da4.f164949b).f91297b = b3;
                            }
                            String str4 = walletCustomTheme.f110170c;
                            if (str4 != null) {
                                if (da4.f164950c) {
                                    da4.mo74035c();
                                    da4.f164950c = false;
                                }
                                str4.getClass();
                                ((atzs) da4.f164949b).f91298c = str4;
                            }
                            atzs = (atzs) da4.mo74062i();
                        }
                        if (atzs != null) {
                            if (da3.f164950c) {
                                da3.mo74035c();
                                da3.f164950c = false;
                            }
                            atzs.getClass();
                            ((atym) da3.f164949b).f91127f = atzs;
                        }
                        int i3 = applicationParameters.f110412g;
                        if (da3.f164950c) {
                            da3.mo74035c();
                            da3.f164950c = false;
                        }
                        atym atym3 = (atym) da3.f164949b;
                        atym3.f91128g = i3;
                        atym3.f91129h = applicationParameters.f110413h;
                        atym3.f91130i = applicationParameters.f110414i;
                        atym = (atym) da3.mo74062i();
                    }
                    if (atym != null) {
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        atym.getClass();
                        ((atyq) da2.f164949b).f91146b = atym;
                    }
                    if (buyFlowConfig.mo60046b() != null) {
                        String b4 = buyFlowConfig.mo60046b();
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        b4.getClass();
                        ((atyq) da2.f164949b).f91149e = b4;
                    }
                    String str5 = buyFlowConfig.f110420d;
                    if (str5 != null) {
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        str5.getClass();
                        ((atyq) da2.f164949b).f91148d = str5;
                    }
                    atyq atyq = (atyq) da2.mo74062i();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    atyq.getClass();
                    ((atzo) da.f164949b).f91278j = atyq;
                } else if (obj instanceof Account) {
                    atzn atzn11 = atzn.VALUE_TYPE_ACCOUNT;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    ((atzo) da.f164949b).f91269a = atzn11.mo3214a();
                    atyk a5 = m76642a((Account) obj);
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    a5.getClass();
                    ((atzo) da.f164949b).f91279k = a5;
                } else if (obj instanceof AccountInfo) {
                    atzn atzn12 = atzn.VALUE_TYPE_ACCOUNT_INFO;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    ((atzo) da.f164949b).f91269a = atzn12.mo3214a();
                    AccountInfo accountInfo = (AccountInfo) obj;
                    bxvd da5 = atyl.f91116c.mo74144da();
                    String str6 = accountInfo.f108325a;
                    if (str6 != null) {
                        if (da5.f164950c) {
                            da5.mo74035c();
                            da5.f164950c = false;
                        }
                        str6.getClass();
                        ((atyl) da5.f164949b).f91118a = str6;
                    }
                    String str7 = accountInfo.f108326b;
                    if (str7 != null) {
                        if (da5.f164950c) {
                            da5.mo74035c();
                            da5.f164950c = false;
                        }
                        str7.getClass();
                        ((atyl) da5.f164949b).f91119b = str7;
                    }
                    atyl atyl = (atyl) da5.mo74062i();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    atyl.getClass();
                    ((atzo) da.f164949b).f91280l = atyl;
                } else if (obj instanceof TokenStatus) {
                    atzn atzn13 = atzn.VALUE_TYPE_TOKEN_STATUS;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    ((atzo) da.f164949b).f91269a = atzn13.mo3214a();
                    atzl a6 = m76644a((TokenStatus) obj);
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    a6.getClass();
                    ((atzo) da.f164949b).f91281m = a6;
                } else {
                    if (obj instanceof ArrayList) {
                        ArrayList arrayList = (ArrayList) obj;
                        if (arrayList.get(0) instanceof byte[]) {
                            atzn atzn14 = atzn.VALUE_TYPE_LIST_OF_BYTES;
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            ((atzo) da.f164949b).f91269a = atzn14.mo3214a();
                            List a7 = bnkn.m109668a((List) arrayList, auag.f91319a);
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            atzo atzo2 = (atzo) da.f164949b;
                            if (!atzo2.f91282n.mo73666a()) {
                                atzo2.f91282n = GeneratedMessageLite.m124021a(atzo2.f91282n);
                            }
                            bxsy.m123078a(a7, atzo2.f91282n);
                        }
                    }
                    throw new RuntimeException(String.format("Cannot convert value type %s", obj.getClass()));
                }
            }
        } else {
            atzn atzn15 = atzn.VALUE_TYPE_UNKNOWN;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((atzo) da.f164949b).f91269a = atzn15.mo3214a();
        }
        return (atzo) da.mo74062i();
    }

    /* renamed from: a */
    public static CardInfo m76647a(atyr atyr) {
        TokenStatus tokenStatus;
        IssuerInfo issuerInfo;
        TokenReference tokenReference;
        TransactionInfo transactionInfo = null;
        if (atyr.f91150x.equals(atyr)) {
            return null;
        }
        asmg asmg = new asmg();
        asmg.f89223a = stm.m36300b(atyr.f91152a);
        asmg.f89224b = m76650a(atyr.f91153b);
        asmg.f89225c = stm.m36300b(atyr.f91154c);
        asmg.f89226d = stm.m36300b(atyr.f91155d);
        asmg.f89227e = atyr.f91156e;
        atzl atzl = atyr.f91157f;
        if (atzl == null) {
            atzl = atzl.f91238d;
        }
        if (!atzl.f91238d.equals(atzl)) {
            asoz asoz = new asoz();
            atzk atzk = atzl.f91240a;
            if (atzk == null) {
                atzk = atzk.f91234c;
            }
            if (!atzk.f91234c.equals(atzk)) {
                asox asox = new asox();
                asox.f89329a = stm.m36300b(atzk.f91236a);
                asox.f89330b = atzk.f91237b;
                tokenReference = asox.mo49311a();
            } else {
                tokenReference = null;
            }
            asoz.f89331a = tokenReference;
            asoz.f89332b = atzl.f91241b;
            asoz.f89333c = atzl.f91242c;
            tokenStatus = asoz.mo49314a();
        } else {
            tokenStatus = null;
        }
        asmg.f89228f = tokenStatus;
        asmg.f89229g = stm.m36300b(atyr.f91158g);
        String str = atyr.f91159h;
        asmg.f89230h = !stm.m36302d(str) ? Uri.parse(str) : null;
        asmg.f89231i = atyr.f91160i;
        asmg.f89232j = atyr.f91161j;
        atzd atzd = atyr.f91162k;
        if (atzd == null) {
            atzd = atzd.f91193v;
        }
        if (!atzd.f91193v.equals(atzd)) {
            asoc asoc = new asoc();
            asoc.f89286a = stm.m36300b(atzd.f91195a);
            asoc.f89287b = stm.m36300b(atzd.f91196b);
            asoc.f89288c = stm.m36300b(atzd.f91197c);
            asoc.f89289d = stm.m36300b(atzd.f91198d);
            asoc.f89290e = stm.m36300b(atzd.f91199e);
            asoc.f89291f = stm.m36300b(atzd.f91200f);
            asoc.f89292g = stm.m36300b(atzd.f91201g);
            asoc.f89293h = stm.m36300b(atzd.f91202h);
            asoc.f89294i = stm.m36300b(atzd.f91203i);
            asoc.f89295j = stm.m36300b(atzd.f91204j);
            asoc.f89296k = stm.m36300b(atzd.f91205k);
            asoc.f89297l = stm.m36300b(atzd.f91206l);
            asoc.f89298m = stm.m36300b(atzd.f91207m);
            asoc.f89299n = atzd.f91208n;
            asoc.f89300o = stm.m36300b(atzd.f91209o);
            asoc.f89301p = stm.m36300b(atzd.f91210p);
            asoc.f89302q = stm.m36300b(atzd.f91211q);
            asoc.f89303r = stm.m36300b(atzd.f91212r);
            asoc.f89304s = stm.m36300b(atzd.f91213s);
            asoc.f89305t = stm.m36300b(atzd.f91212r);
            asoc.f89306u = stm.m36300b(atzd.f91213s);
            asoc.f89307v = atzd.f91215u;
            issuerInfo = asoc.mo49277a();
        } else {
            issuerInfo = null;
        }
        asmg.f89233k = issuerInfo;
        asmg.f89234l = stm.m36300b(atyr.f91163l);
        atzm atzm = atyr.f91164m;
        if (atzm == null) {
            atzm = atzm.f91243e;
        }
        if (!atzm.f91243e.equals(atzm)) {
            aspd aspd = new aspd();
            aspd.f89340a = atzm.f91245a;
            aspd.f89341b = atzm.f91246b;
            aspd.f89342c = atzm.f91247c;
            aspd.f89343d = atzm.f91248d;
            transactionInfo = aspd.mo49320a();
        }
        asmg.f89235m = transactionInfo;
        asmg.f89236n = stm.m36300b(atyr.f91165n);
        asmg.f89237o = m76650a(atyr.f91166o);
        asmg.f89238p = atyr.f91167p;
        asmg.f89244v = atyr.f91171t;
        asmg.f89245w = atyr.f91172u;
        asmg.f89247y = atyr.f91173v;
        asmg.f89248z = atyr.f91174w;
        return asmg.mo49237a();
    }

    /* renamed from: a */
    public static void m76648a(Bundle bundle) {
        Bundle bundle2;
        byte[] byteArray = bundle.getByteArray("compressedData");
        if (byteArray != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                InflaterOutputStream inflaterOutputStream = new InflaterOutputStream(byteArrayOutputStream);
                inflaterOutputStream.write(byteArray);
                inflaterOutputStream.close();
                bundle2 = m76641a(byteArrayOutputStream.toByteArray());
            } catch (IOException e) {
                bundle2 = null;
            }
            if (bundle2 != null) {
                bundle.putBundle("data", bundle2);
                bundle.remove("compressedData");
            }
        }
    }

    /* renamed from: a */
    public static byte[] m76649a(Bundle bundle, boolean z) {
        byte[] bArr;
        Bundle bundle2 = bundle.getBundle("data");
        if (z && bundle2 != null) {
            byte[] a = m76649a(bundle2, false);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream);
                deflaterOutputStream.write(a);
                deflaterOutputStream.close();
                bArr = byteArrayOutputStream.toByteArray();
            } catch (IOException e) {
                bArr = null;
            }
            if (bArr != null) {
                bundle.putByteArray("compressedData", bArr);
                bundle.remove("data");
            }
        }
        return m76651b(bundle).serializeToBytes();
    }

    /* renamed from: a */
    private static byte[] m76650a(ByteString bxtx) {
        if (bxtx == null || bxtx.mo73779j()) {
            return null;
        }
        return bxtx.getKey();
    }
}
