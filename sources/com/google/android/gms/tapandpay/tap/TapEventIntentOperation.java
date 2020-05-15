package com.google.android.gms.tapandpay.tap;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import com.google.android.gms.tapandpay.firstparty.CardInfo;
import com.google.android.gms.tapandpay.firstparty.ValuableInfo;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.regex.Pattern;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class TapEventIntentOperation extends asjx {

    /* renamed from: a */
    private static final srn f108683a = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: a */
    private final Intent m93137a(Intent intent, AccountInfo accountInfo) {
        return new Intent(intent).setClassName(this, "com.google.android.gms.tapandpay.tap.TapUiActivity").putExtra("accountInfo", accountInfo).setFlags(268697600);
    }

    /* renamed from: a */
    private final Intent m93138a(AccountInfo accountInfo) {
        if (!cgwn.f187872a.mo6606a().mo84611Z() || !alfj.m60866b(getApplicationContext())) {
            return new Intent().setClassName(this, "com.google.android.gms.tapandpay.ui.PromptSetupActivity").putExtra("accountInfo", accountInfo).setFlags(335544320);
        }
        return new alhu().mo40351a().setFlags(335544320);
    }

    /* renamed from: a */
    private final CardInfo m93139a(Intent intent, AccountInfo accountInfo, String str) {
        CardInfo cardInfo = (CardInfo) intent.getParcelableExtra("paymentCardInfo");
        if (cardInfo != null) {
            return cardInfo;
        }
        CardInfo b = atds.m75666a(new askf(accountInfo, str, this)).mo49852b();
        if (b != null) {
            return b;
        }
        return null;
    }

    /* renamed from: a */
    private static final String m93140a(Intent intent, String str, int i, String str2) {
        String[] stringArrayExtra = intent.getStringArrayExtra(str);
        return (stringArrayExtra == null || i < 0 || i >= stringArrayExtra.length) ? str2 : stringArrayExtra[i];
    }

    /* renamed from: a */
    private final void m93141a(Intent intent, Intent intent2) {
        String stringExtra = intent2.getStringExtra("tapDoodleId");
        if (stringExtra != null) {
            try {
                for (btpn btpn : aska.m74264a(this)) {
                    Iterator it = btpn.f149869b.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            btpm btpm = (btpm) it.next();
                            if (btpm.f149862a.equals(stringExtra)) {
                                intent.putExtra("tapDoodle", btpm.mo73642k());
                                return;
                            }
                        }
                    }
                }
            } catch (asks e) {
                bnsl bnsl = (bnsl) f108683a.mo68388c();
                bnsl.mo68437a(e);
                bnsl.mo68432a("com.google.android.gms.tapandpay.tap.TapEventIntentOperation", "a", 305, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Error getting tap doodle groups");
            }
        }
    }

    /* renamed from: a */
    private final void m93142a(Intent intent, String str) {
        btpn btpn;
        Intent intent2 = intent;
        String str2 = str;
        int i = 0;
        int intExtra = intent2.getIntExtra("eventType", 0);
        AccountInfo b = asix.m74201b(this, str2);
        btpm btpm = null;
        if (b == null) {
            sre.m36089i(this);
            startActivity(m93138a((AccountInfo) null));
            return;
        }
        Intent a = m93137a(intent2, b);
        CardInfo a2 = m93139a(intent2, b, str2);
        switch (intExtra) {
            case 2:
            case 7:
                if (a2 != null) {
                    a.putExtra("paymentCardInfo", a2);
                    break;
                } else {
                    sre.m36089i(this);
                    startActivity(m93138a(b));
                    return;
                }
            case 3:
            case 5:
            case 8:
                break;
            case 4:
            case 6:
                String str3 = a2 != null ? a2.f108340a : null;
                String stringExtra = intent2.getStringExtra("merchantName");
                String str4 = b.f108325a;
                if (!a.hasExtra("debugTapEvent") || !a.hasExtra("tapDoodle")) {
                    try {
                        List a3 = aska.m74265a(str4, this, str2);
                        Random random = asjo.f89077a;
                        Iterator it = a3.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                btpn = (btpn) it.next();
                                btpp btpp = btpn.f149870c;
                                if (btpp == null) {
                                    btpp = btpp.f149872f;
                                }
                                if (btpp != null) {
                                    long currentTimeMillis = System.currentTimeMillis();
                                    long j = btpp.f149874a;
                                    if (j == 0 || currentTimeMillis >= j) {
                                        long j2 = btpp.f149875b;
                                        if ((j2 == 0 || j2 >= currentTimeMillis) && (btpp.f149876c.size() <= 0 || (!TextUtils.isEmpty(str3) && btpp.f149876c.contains(str3)))) {
                                            if (btpp.f149877d.isEmpty() || (!TextUtils.isEmpty(stringExtra) && Pattern.matches(btpp.f149877d, stringExtra))) {
                                                int a4 = btpo.m117016a(btpp.f149878e);
                                                if (a4 != 0 && a4 == 3) {
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                btpn = null;
                            }
                        }
                        if (btpn != null) {
                            float f = btpn.f149871d;
                            if ((f == 0.0f || f >= asjo.f89077a.nextFloat()) && !btpn.f149869b.isEmpty()) {
                                int i2 = 0;
                                for (int i3 = 0; i3 < btpn.f149869b.size(); i3++) {
                                    i2 += ((btpm) btpn.f149869b.get(i3)).f149863b;
                                }
                                if (i2 == 0) {
                                    btpm = asjo.m74244a(this, (btpm) btpn.f149869b.get(asjo.f89077a.nextInt(btpn.f149869b.size())));
                                } else {
                                    int nextInt = asjo.f89077a.nextInt(i2);
                                    int i4 = 0;
                                    while (i < btpn.f149869b.size()) {
                                        i4 += ((btpm) btpn.f149869b.get(i)).f149863b;
                                        if (i4 > nextInt) {
                                            btpm = asjo.m74244a(this, (btpm) btpn.f149869b.get(i));
                                        } else {
                                            i++;
                                        }
                                    }
                                    throw new IllegalStateException("weightRand >= weightSum");
                                }
                            }
                        }
                        if (btpm != null) {
                            a.putExtra("tapDoodle", btpm.mo73642k());
                            break;
                        }
                    } catch (asks e) {
                        bnsl bnsl = (bnsl) f108683a.mo68388c();
                        bnsl.mo68437a(e);
                        bnsl.mo68432a("com.google.android.gms.tapandpay.tap.TapEventIntentOperation", "a", 346, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl.mo68405a("Error adding tap doodle");
                        break;
                    }
                }
                break;
            default:
                bnsl bnsl2 = (bnsl) f108683a.mo68387b();
                bnsl2.mo68432a("com.google.android.gms.tapandpay.tap.TapEventIntentOperation", "a", 132, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68409a("Unknown tap action: %d", intExtra);
                return;
        }
        startActivity(a);
    }

    /* renamed from: a */
    private final void m93143a(Intent intent, String str, String str2, String str3, String str4) {
        btpm btpm;
        btpn btpn;
        if (!intent.hasExtra("debugTapEvent") || !intent.hasExtra("tapDoodle")) {
            try {
                List a = aska.m74265a(str, this, str2);
                Random random = asjo.f89077a;
                Iterator it = a.iterator();
                while (true) {
                    btpm = null;
                    if (!it.hasNext()) {
                        btpn = null;
                        break;
                    }
                    btpn = (btpn) it.next();
                    btpp btpp = btpn.f149870c;
                    if (btpp == null) {
                        btpp = btpp.f149872f;
                    }
                    if (btpp == null) {
                        break;
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    long j = btpp.f149874a;
                    if (j == 0 || currentTimeMillis >= j) {
                        long j2 = btpp.f149875b;
                        if ((j2 == 0 || j2 >= currentTimeMillis) && (btpp.f149876c.size() <= 0 || (!TextUtils.isEmpty(str3) && btpp.f149876c.contains(str3)))) {
                            if (btpp.f149877d.isEmpty() || (!TextUtils.isEmpty(str4) && Pattern.matches(btpp.f149877d, str4))) {
                                int a2 = btpo.m117016a(btpp.f149878e);
                                if (a2 == 0 || a2 != 3) {
                                    break;
                                }
                            }
                        }
                    }
                }
                if (btpn != null) {
                    float f = btpn.f149871d;
                    if ((f == 0.0f || f >= asjo.f89077a.nextFloat()) && !btpn.f149869b.isEmpty()) {
                        int i = 0;
                        int i2 = 0;
                        for (int i3 = 0; i3 < btpn.f149869b.size(); i3++) {
                            i2 += ((btpm) btpn.f149869b.get(i3)).f149863b;
                        }
                        if (i2 == 0) {
                            btpm = asjo.m74244a(this, (btpm) btpn.f149869b.get(asjo.f89077a.nextInt(btpn.f149869b.size())));
                        } else {
                            int nextInt = asjo.f89077a.nextInt(i2);
                            int i4 = 0;
                            while (i < btpn.f149869b.size()) {
                                i4 += ((btpm) btpn.f149869b.get(i)).f149863b;
                                if (i4 > nextInt) {
                                    btpm = asjo.m74244a(this, (btpm) btpn.f149869b.get(i));
                                } else {
                                    i++;
                                }
                            }
                            throw new IllegalStateException("weightRand >= weightSum");
                        }
                    }
                }
                if (btpm != null) {
                    intent.putExtra("tapDoodle", btpm.mo73642k());
                }
            } catch (asks e) {
                bnsl bnsl = (bnsl) f108683a.mo68388c();
                bnsl.mo68437a(e);
                bnsl.mo68432a("com.google.android.gms.tapandpay.tap.TapEventIntentOperation", "a", 346, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Error adding tap doodle");
            }
        }
    }

    /* renamed from: a */
    public final void mo49205a(Intent intent) {
        Intent intent2 = intent;
        String str = "customGoogleAnalytics";
        String str2 = "customButtonAction";
        String str3 = "customButtonLabel";
        String str4 = "customError";
        String b = askc.m74272b();
        try {
            if (intent2.hasExtra("debugTapEvent")) {
                int i = 0;
                int intExtra = intent2.getIntExtra("numValuables", 0);
                AccountInfo b2 = asix.m74201b(this, b);
                Intent a = m93137a(intent2, b2);
                int i2 = -1;
                if (intExtra != 0) {
                    ValuableInfo[] valuableInfoArr = new ValuableInfo[intExtra];
                    while (i < intExtra) {
                        asph asph = new asph();
                        String str5 = str;
                        asph.f89350g = 1;
                        String str6 = str2;
                        asph.f89344a = m93140a(intent2, "title", i, "Balance Rewards");
                        asph.f89345b = m93140a(intent2, "subtitle", i, "Walgreens");
                        String str7 = str3;
                        String str8 = str4;
                        asph.f89346c = m93140a(intent2, "detailTitle", i, String.format(Locale.US, "%d", Integer.valueOf((int) Math.round(Math.random() * 10000.0d))));
                        asph.f89352i = m93140a(intent2, "detailSubtitle", i, "Points");
                        asph.f89353j = m93140a(intent2, "footer", i, "1234 5678 9012 3456");
                        asph.f89348e = Color.parseColor(m93140a(intent2, "backgroundColor", i, "#2498D4"));
                        asph.f89349f = Color.parseColor(m93140a(intent2, "textColor", i, "#FFFFFF"));
                        asph.f89347d = Uri.parse(m93140a(intent2, "logoUri", i, "android.resource://android/17301515"));
                        String a2 = m93140a(intent2, "heroImageUri", i, "");
                        if (!TextUtils.isEmpty(a2)) {
                            asph.f89351h = Uri.parse(a2);
                        }
                        valuableInfoArr[i] = asph.mo49327a();
                        i++;
                        str = str5;
                        str4 = str8;
                        str2 = str6;
                        str3 = str7;
                        i2 = -1;
                    }
                    m93142a(new Intent(a).putExtra("eventType", 3).putExtra("valuables", valuableInfoArr), b);
                    int intExtra2 = intent2.getIntExtra("valuablesFailureType", i2);
                    if (intExtra2 != i2) {
                        Intent putExtra = new Intent(a).putExtra("eventType", 5).putExtra("failedReason", intExtra2);
                        if (intent2.hasExtra(str4) && intent2.hasExtra(str3) && intent2.hasExtra(str2) && intent2.hasExtra(str)) {
                            asot asot = new asot();
                            asot.f89316a = intent2.getStringExtra(str4);
                            asot.f89317b = intent2.getStringExtra(str3);
                            asot.f89318c = intent2.getStringExtra(str2);
                            asot.f89319d = intent2.getStringExtra(str);
                            sef.m35071a(asot.mo49306a(), putExtra, "failedUiInfo");
                        }
                        m93142a(putExtra, b);
                    } else if (intent2.getBooleanExtra("finish", false)) {
                        Intent putExtra2 = new Intent(a).putExtra("eventType", 4);
                        m93141a(putExtra2, intent2);
                        m93142a(putExtra2, b);
                    }
                }
                if (intent2.getBooleanExtra("payment", false)) {
                    m93142a(new Intent(a).putExtra("eventType", intent2.getIntExtra("paymentEventType", 2)).putExtra("paymentCardInfo", m93139a(intent2, b2, b)), b);
                }
                int intExtra3 = intent2.getIntExtra("paymentFailureType", i2);
                if (intExtra3 != i2) {
                    m93142a(new Intent(a).putExtra("eventType", 7).putExtra("failedReason", intExtra3), b);
                } else if (intent2.getBooleanExtra("finish", false)) {
                    Intent putExtra3 = new Intent(a).putExtra("eventType", 6);
                    m93141a(putExtra3, intent2);
                    m93142a(putExtra3, b);
                }
            } else {
                m93142a(intent2, b);
            }
        } catch (asks | RuntimeException e) {
            bnsl bnsl = (bnsl) f108683a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("com.google.android.gms.tapandpay.tap.TapEventIntentOperation", "a", 84, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Error handling intent");
        }
    }
}
