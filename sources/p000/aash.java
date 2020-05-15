package p000;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.Arrays;
import java.util.List;

/* renamed from: aash */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aash {

    /* renamed from: a */
    public Context f56436a;

    /* renamed from: b */
    public HelpConfig f56437b;

    /* renamed from: c */
    public String f56438c;

    /* renamed from: d */
    public String f56439d;

    /* renamed from: e */
    public List f56440e;

    /* renamed from: f */
    public String f56441f;

    /* renamed from: g */
    public String f56442g;

    /* renamed from: h */
    public abep[] f56443h;

    /* renamed from: i */
    public String f56444i;

    /* renamed from: j */
    public String f56445j;

    /* renamed from: k */
    public String f56446k;

    /* renamed from: l */
    public abem f56447l;

    /* renamed from: m */
    public String f56448m;

    /* renamed from: n */
    public String f56449n;

    /* renamed from: o */
    public String f56450o;

    /* renamed from: p */
    public Long f56451p;

    /* renamed from: q */
    public boolean f56452q;

    /* renamed from: r */
    public abdy f56453r;

    /* renamed from: s */
    public abdu f56454s;

    /* renamed from: t */
    public abdn f56455t;

    /* renamed from: u */
    public String f56456u;

    /* renamed from: v */
    public List f56457v;

    /* renamed from: a */
    public static aash m46863a() {
        return new aash();
    }

    /* renamed from: b */
    public final abeo mo31708b() {
        String str;
        String str2;
        if (this.f56436a != null) {
            HelpConfig helpConfig = this.f56437b;
            if (helpConfig == null) {
                throw new IllegalStateException("The HelpConfig is null, but must be set.");
            } else if (!TextUtils.isEmpty(helpConfig.f78827b)) {
                bxvd da = abeo.f57262h.mo74144da();
                String l = !TextUtils.isEmpty(this.f56439d) ? this.f56439d : ceeg.m136407l();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                abeo abeo = (abeo) da.f164949b;
                l.getClass();
                abeo.f57264a |= 8;
                abeo.f57268e = l;
                HelpConfig helpConfig2 = this.f56437b;
                String str3 = helpConfig2.f78827b;
                if (!TextUtils.isEmpty(helpConfig2.f78812L)) {
                    str3 = this.f56437b.f78812L;
                }
                bxvd da2 = abep.f57271d.mo74144da();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                abep abep = (abep) da2.f164949b;
                str3.getClass();
                abep.f57273a |= 1;
                abep.f57274b = str3;
                try {
                    PackageInfo packageInfo = this.f56436a.getPackageManager().getPackageInfo(str3, 0);
                    if (TextUtils.isEmpty(packageInfo.versionName)) {
                        str2 = Integer.toString(packageInfo.versionCode);
                    } else {
                        str2 = packageInfo.versionName;
                    }
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    abep abep2 = (abep) da2.f164949b;
                    str2.getClass();
                    abep2.f57273a |= 2;
                    abep2.f57275c = str2;
                } catch (PackageManager.NameNotFoundException e) {
                    String name = e.getClass().getName();
                    StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 22 + String.valueOf(str3).length());
                    sb.append(name);
                    sb.append(": ");
                    sb.append(str3);
                    sb.append(" is not a valid pkg.");
                    Log.e("gH_HelpMobileReqBuilder", sb.toString());
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    abep abep3 = (abep) da2.f164949b;
                    "UNKNOWN".getClass();
                    abep3.f57273a |= 2;
                    abep3.f57275c = "UNKNOWN";
                }
                abep abep4 = (abep) da2.mo74062i();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                abeo abeo2 = (abeo) da.f164949b;
                abep4.getClass();
                abeo2.f57265b = abep4;
                abeo2.f57264a |= 1;
                bxvd da3 = abeq.f57276g.mo74144da();
                String networkOperatorName = ((TelephonyManager) this.f56436a.getSystemService("phone")).getNetworkOperatorName();
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                abeq abeq = (abeq) da3.f164949b;
                networkOperatorName.getClass();
                abeq.f57278a |= 8;
                abeq.f57282e = networkOperatorName;
                String str4 = Build.MODEL;
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                abeq abeq2 = (abeq) da3.f164949b;
                str4.getClass();
                abeq2.f57278a |= 2;
                abeq2.f57280c = str4;
                String str5 = Build.DEVICE;
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                abeq abeq3 = (abeq) da3.f164949b;
                str5.getClass();
                abeq3.f57278a |= 64;
                abeq3.f57283f = str5;
                String a = aasw.m46952a();
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                abeq abeq4 = (abeq) da3.f164949b;
                a.getClass();
                abeq4.f57278a |= 1;
                abeq4.f57279b = a;
                String str6 = Build.VERSION.RELEASE;
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                abeq abeq5 = (abeq) da3.f164949b;
                str6.getClass();
                abeq5.f57278a |= 4;
                abeq5.f57281d = str6;
                abeq abeq6 = (abeq) da3.mo74062i();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                abeo abeo3 = (abeo) da.f164949b;
                abeq6.getClass();
                abeo3.f57266c = abeq6;
                abeo3.f57264a |= 2;
                bxvd da4 = abet.f57292q.mo74144da();
                if (this.f56437b.mo43228d() && (str = this.f56437b.f78828c) != null) {
                    if (da4.f164950c) {
                        da4.mo74035c();
                        da4.f164950c = false;
                    }
                    abet abet = (abet) da4.f164949b;
                    str.getClass();
                    abet.f57294a |= 4;
                    abet.f57296c = str;
                }
                if (!TextUtils.isEmpty(this.f56437b.f78830e)) {
                    String str7 = this.f56437b.f78830e;
                    if (da4.f164950c) {
                        da4.mo74035c();
                        da4.f164950c = false;
                    }
                    abet abet2 = (abet) da4.f164949b;
                    str7.getClass();
                    abet2.f57294a |= 8;
                    abet2.f57297d = str7;
                }
                List a2 = this.f56437b.mo43217a(this.f56436a);
                if (a2 != null) {
                    if (da4.f164950c) {
                        da4.mo74035c();
                        da4.f164950c = false;
                    }
                    abet abet3 = (abet) da4.f164949b;
                    if (!abet3.f57298e.mo73666a()) {
                        abet3.f57298e = GeneratedMessageLite.m124021a(abet3.f57298e);
                    }
                    bxsy.m123078a(a2, abet3.f57298e);
                }
                if (!TextUtils.isEmpty(this.f56438c)) {
                    String trim = this.f56438c.trim();
                    if (da4.f164950c) {
                        da4.mo74035c();
                        da4.f164950c = false;
                    }
                    abet abet4 = (abet) da4.f164949b;
                    trim.getClass();
                    abet4.f57294a |= 1;
                    abet4.f57295b = trim;
                }
                if (this.f56440e != null) {
                    bxvd da5 = aben.f57259b.mo74144da();
                    List list = this.f56440e;
                    if (da5.f164950c) {
                        da5.mo74035c();
                        da5.f164950c = false;
                    }
                    aben aben = (aben) da5.f164949b;
                    if (!aben.f57261a.mo73666a()) {
                        aben.f57261a = GeneratedMessageLite.m124021a(aben.f57261a);
                    }
                    bxsy.m123078a(list, aben.f57261a);
                    if (da4.f164950c) {
                        da4.mo74035c();
                        da4.f164950c = false;
                    }
                    abet abet5 = (abet) da4.f164949b;
                    aben aben2 = (aben) da5.mo74062i();
                    aben2.getClass();
                    abet5.f57299f = aben2;
                    abet5.f57294a |= 16;
                }
                if (!TextUtils.isEmpty(this.f56445j)) {
                    bxvd da6 = abel.f57249e.mo74144da();
                    String str8 = this.f56445j;
                    if (da6.f164950c) {
                        da6.mo74035c();
                        da6.f164950c = false;
                    }
                    abel abel = (abel) da6.f164949b;
                    str8.getClass();
                    abel.f57251a |= 2;
                    abel.f57253c = str8;
                    if (!TextUtils.isEmpty(this.f56444i)) {
                        String str9 = this.f56444i;
                        if (da6.f164950c) {
                            da6.mo74035c();
                            da6.f164950c = false;
                        }
                        abel abel2 = (abel) da6.f164949b;
                        str9.getClass();
                        abel2.f57251a |= 1;
                        abel2.f57252b = str9;
                    }
                    if (!TextUtils.isEmpty(this.f56446k)) {
                        String str10 = this.f56446k;
                        if (da6.f164950c) {
                            da6.mo74035c();
                            da6.f164950c = false;
                        }
                        abel abel3 = (abel) da6.f164949b;
                        str10.getClass();
                        abel3.f57251a |= 4;
                        abel3.f57254d = str10;
                    }
                    if (da4.f164950c) {
                        da4.mo74035c();
                        da4.f164950c = false;
                    }
                    abet abet6 = (abet) da4.f164949b;
                    abel abel4 = (abel) da6.mo74062i();
                    abel4.getClass();
                    abet6.f57300g = abel4;
                    abet6.f57294a |= 32;
                }
                if (this.f56449n != null) {
                    bxvd da7 = abek.f57241g.mo74144da();
                    String str11 = this.f56449n;
                    if (da7.f164950c) {
                        da7.mo74035c();
                        da7.f164950c = false;
                    }
                    abek abek = (abek) da7.f164949b;
                    str11.getClass();
                    abek.f57243a |= 1;
                    abek.f57244b = str11;
                    if (!TextUtils.isEmpty(this.f56450o)) {
                        String str12 = this.f56450o;
                        if (da7.f164950c) {
                            da7.mo74035c();
                            da7.f164950c = false;
                        }
                        abek abek2 = (abek) da7.f164949b;
                        str12.getClass();
                        abek2.f57243a |= 8;
                        abek2.f57247e = str12;
                    }
                    Long l2 = this.f56451p;
                    if (l2 != null) {
                        long longValue = l2.longValue();
                        if (da7.f164950c) {
                            da7.mo74035c();
                            da7.f164950c = false;
                        }
                        abek abek3 = (abek) da7.f164949b;
                        abek3.f57243a |= 2;
                        abek3.f57245c = longValue;
                    }
                    if (this.f56452q) {
                        if (da7.f164950c) {
                            da7.mo74035c();
                            da7.f164950c = false;
                        }
                        abek abek4 = (abek) da7.f164949b;
                        abek4.f57243a |= 4;
                        abek4.f57246d = true;
                    }
                    if (!TextUtils.isEmpty(this.f56448m)) {
                        String str13 = this.f56448m;
                        if (da7.f164950c) {
                            da7.mo74035c();
                            da7.f164950c = false;
                        }
                        abek abek5 = (abek) da7.f164949b;
                        str13.getClass();
                        abek5.f57243a |= 16;
                        abek5.f57248f = str13;
                    }
                    if (da4.f164950c) {
                        da4.mo74035c();
                        da4.f164950c = false;
                    }
                    abet abet7 = (abet) da4.f164949b;
                    abek abek6 = (abek) da7.mo74062i();
                    abek6.getClass();
                    abet7.f57301h = abek6;
                    abet7.f57294a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                }
                if (!TextUtils.isEmpty(this.f56456u)) {
                    String str14 = this.f56456u;
                    if (da4.f164950c) {
                        da4.mo74035c();
                        da4.f164950c = false;
                    }
                    abet abet8 = (abet) da4.f164949b;
                    str14.getClass();
                    abet8.f57294a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS;
                    abet8.f57308o = str14;
                }
                if (!TextUtils.isEmpty(this.f56441f)) {
                    String str15 = this.f56441f;
                    if (da4.f164950c) {
                        da4.mo74035c();
                        da4.f164950c = false;
                    }
                    abet abet9 = (abet) da4.f164949b;
                    str15.getClass();
                    abet9.f57294a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
                    abet9.f57307n = str15;
                }
                if (TextUtils.isEmpty(null)) {
                    if (!TextUtils.isEmpty(this.f56442g)) {
                        String str16 = this.f56442g;
                        if (da4.f164950c) {
                            da4.mo74035c();
                            da4.f164950c = false;
                        }
                        abet abet10 = (abet) da4.f164949b;
                        str16.getClass();
                        abet10.f57294a |= 1048576;
                        abet10.f57309p = str16;
                    }
                    if (this.f56453r != null) {
                        bxvd da8 = abej.f57235e.mo74144da();
                        abdy abdy = this.f56453r;
                        if (da8.f164950c) {
                            da8.mo74035c();
                            da8.f164950c = false;
                        }
                        abej abej = (abej) da8.f164949b;
                        abdy.getClass();
                        abej.f57240d = abdy;
                        abej.f57237a |= 4;
                        if (da4.f164950c) {
                            da4.mo74035c();
                            da4.f164950c = false;
                        }
                        abet abet11 = (abet) da4.f164949b;
                        abej abej2 = (abej) da8.mo74062i();
                        abej2.getClass();
                        abet11.f57306m = abej2;
                        abet11.f57294a |= 8192;
                    } else if (this.f56454s != null) {
                        bxvd da9 = abej.f57235e.mo74144da();
                        abdu abdu = this.f56454s;
                        if (da9.f164950c) {
                            da9.mo74035c();
                            da9.f164950c = false;
                        }
                        abej abej3 = (abej) da9.f164949b;
                        abdu.getClass();
                        abej3.f57238b = abdu;
                        abej3.f57237a |= 1;
                        if (da4.f164950c) {
                            da4.mo74035c();
                            da4.f164950c = false;
                        }
                        abet abet12 = (abet) da4.f164949b;
                        abej abej4 = (abej) da9.mo74062i();
                        abej4.getClass();
                        abet12.f57306m = abej4;
                        abet12.f57294a |= 8192;
                    } else if (this.f56455t != null) {
                        bxvd da10 = abej.f57235e.mo74144da();
                        abdn abdn = this.f56455t;
                        if (da10.f164950c) {
                            da10.mo74035c();
                            da10.f164950c = false;
                        }
                        abej abej5 = (abej) da10.f164949b;
                        abdn.getClass();
                        abej5.f57239c = abdn;
                        abej5.f57237a |= 2;
                        if (da4.f164950c) {
                            da4.mo74035c();
                            da4.f164950c = false;
                        }
                        abet abet13 = (abet) da4.f164949b;
                        abej abej6 = (abej) da10.mo74062i();
                        abej6.getClass();
                        abet13.f57306m = abej6;
                        abet13.f57294a |= 8192;
                    }
                    abem abem = this.f56447l;
                    if (abem != null) {
                        if (da4.f164950c) {
                            da4.mo74035c();
                            da4.f164950c = false;
                        }
                        abet abet14 = (abet) da4.f164949b;
                        abem.getClass();
                        abet14.f57302i = abem;
                        abet14.f57294a |= 512;
                    }
                    if (this.f56457v != null) {
                        bxvd da11 = abei.f57232b.mo74144da();
                        List list2 = this.f56457v;
                        if (da11.f164950c) {
                            da11.mo74035c();
                            da11.f164950c = false;
                        }
                        abei abei = (abei) da11.f164949b;
                        if (!abei.f57234a.mo73666a()) {
                            abei.f57234a = GeneratedMessageLite.m124021a(abei.f57234a);
                        }
                        bxsy.m123078a(list2, abei.f57234a);
                        if (da4.f164950c) {
                            da4.mo74035c();
                            da4.f164950c = false;
                        }
                        abet abet15 = (abet) da4.f164949b;
                        abei abei2 = (abei) da11.mo74062i();
                        abei2.getClass();
                        abet15.f57305l = abei2;
                        abet15.f57294a |= 4096;
                    }
                    if (da4.f164950c) {
                        da4.mo74035c();
                        da4.f164950c = false;
                    }
                    abet abet16 = (abet) da4.f164949b;
                    int i = abet16.f57294a | 1024;
                    abet16.f57294a = i;
                    abet16.f57303j = 201515033;
                    "20.15.15 (120300-{{cl}})".getClass();
                    abet16.f57294a = i | 2048;
                    abet16.f57304k = "20.15.15 (120300-{{cl}})";
                    abet abet17 = (abet) da4.mo74062i();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    abeo abeo4 = (abeo) da.f164949b;
                    abet17.getClass();
                    abeo4.f57267d = abet17;
                    abeo4.f57264a |= 4;
                    bxvd da12 = aber.f57284b.mo74144da();
                    abep[] abepArr = this.f56443h;
                    if (abepArr != null) {
                        List asList = Arrays.asList(abepArr);
                        if (da12.f164950c) {
                            da12.mo74035c();
                            da12.f164950c = false;
                        }
                        aber aber = (aber) da12.f164949b;
                        if (!aber.f57286a.mo73666a()) {
                            aber.f57286a = GeneratedMessageLite.m124021a(aber.f57286a);
                        }
                        bxsy.m123078a(asList, aber.f57286a);
                    }
                    aber aber2 = (aber) da12.mo74062i();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    abeo abeo5 = (abeo) da.f164949b;
                    aber2.getClass();
                    abeo5.f57269f = aber2;
                    abeo5.f57264a |= 16;
                    if (cehy.m136890b()) {
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        abeo abeo6 = (abeo) da.f164949b;
                        abeo6.f57270g = 6;
                        abeo6.f57264a |= 32;
                    }
                    return (abeo) da.mo74062i();
                }
                if (da4.f164950c) {
                    da4.mo74035c();
                    da4.f164950c = false;
                }
                abet abet18 = (abet) da4.f164949b;
                throw null;
            } else {
                throw new IllegalStateException("The app package name is empty, but must be set.");
            }
        } else {
            throw new IllegalStateException("The context is null, but must be set.");
        }
    }
}
