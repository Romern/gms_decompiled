package p000;

import android.accounts.Account;
import android.content.Context;
import android.provider.Settings;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: asbl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class asbl implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f88669a;

    /* renamed from: b */
    final /* synthetic */ asbm f88670b;

    /* renamed from: c */
    final /* synthetic */ asbn f88671c;

    public asbl(asbn asbn, String str, asbm asbm) {
        this.f88671c = asbn;
        this.f88669a = str;
        this.f88670b = asbm;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0102, code lost:
        if (r5 == 6) goto L_0x0104;
     */
    public final void run() {
        Account account;
        asbp asbp;
        try {
            asbn asbn = this.f88671c;
            String str = this.f88669a;
            long a = spn.m35843a(asbn.f88673b);
            Context context = asbn.f88673b;
            sdo.m34959a(context);
            String str2 = null;
            if (Settings.Secure.getInt(context.getContentResolver(), "backup_enabled", 0) != 0) {
                account = new lsp(context).mo19591a();
            } else {
                account = null;
            }
            String str3 = "";
            if (account == null) {
                asbn.f88672a.mo25418e("Backups are disabled or backup account does not exist", new Object[0]);
            } else {
                bxvd da = lth.f32914q.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                lth lth = (lth) da.f164949b;
                lth.f32916a |= 1;
                lth.f32917b = a;
                bxvd da2 = lsz.f32870k.mo74144da();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                lsz lsz = (lsz) da2.f164949b;
                "com.android.providers.settings".getClass();
                lsz.f32872a |= 1;
                lsz.f32873b = "com.android.providers.settings";
                bxvd da3 = lsx.f32860c.mo74144da();
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                lsx lsx = (lsx) da3.f164949b;
                "￭WIFI".getClass();
                lsx.f32862a |= 1;
                lsx.f32863b = "￭WIFI";
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                lsz lsz2 = (lsz) da2.f164949b;
                lsx lsx2 = (lsx) da3.mo74062i();
                lsx2.getClass();
                lsz2.f32875d = lsx2;
                lsz2.f32872a |= 4;
                da.mo74015a((lsz) da2.mo74062i());
                String a2 = asbn.m73754a(asbn.f88673b, account);
                if (a2 != null) {
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    lth lth2 = (lth) da.f164949b;
                    a2.getClass();
                    lth2.f32916a |= 16;
                    lth2.f32920e = a2;
                    ltq a3 = asbn.mo49031a((lth) da.mo74062i());
                    if (a3 != null) {
                        int a4 = ltp.m24383a(a3.f32974b);
                        if (a4 != 0) {
                            if (a4 == 5) {
                                asbs.m73758a(asbn.f88673b).mo33921b("com.google", ((lth) da.f164949b).f32920e);
                                String a5 = asbn.m73754a(asbn.f88673b, account);
                                if (a5 != null) {
                                    if (da.f164950c) {
                                        da.mo74035c();
                                        da.f164950c = false;
                                    }
                                    lth lth3 = (lth) da.f164949b;
                                    a5.getClass();
                                    lth3.f32916a |= 16;
                                    lth3.f32920e = a5;
                                    a3 = asbn.mo49031a((lth) da.mo74062i());
                                }
                            }
                        }
                        int a6 = ltp.m24383a(a3.f32974b);
                        if (a6 != 0) {
                        }
                    }
                    if (a3 != null) {
                        Iterator it = a3.f32977e.iterator();
                        loop0:
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Iterator it2 = ((ltk) it.next()).f32952d.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    ltr ltr = (ltr) it2.next();
                                    if (ltr.f32985b.equals("￭WIFI")) {
                                        str3 = ltr.f32986c.mo73781l();
                                        break loop0;
                                    }
                                }
                            }
                        }
                    } else {
                        asbn.f88672a.mo25418e("backupResponse was null", new Object[0]);
                    }
                }
            }
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(str3.getBytes())));
            ArrayList arrayList = new ArrayList();
            asbo asbo = null;
            while (true) {
                try {
                    if (!bufferedReader.ready()) {
                        break;
                    }
                    String trim = bufferedReader.readLine().trim();
                    if (!trim.startsWith("network={")) {
                        if (trim.startsWith("}")) {
                            if (asbo == null) {
                                break;
                            }
                            String str4 = asbo.f88675a;
                            if (str4 != null) {
                                asbp = new asbp(str4, asbo.f88676b);
                            } else {
                                asbp = null;
                            }
                            if (asbp != null) {
                                arrayList.add(asbp);
                            }
                            asbo = null;
                        } else {
                            int indexOf = trim.indexOf("=");
                            if (indexOf > 0) {
                                if (indexOf < trim.length() - 1) {
                                    if (asbo == null) {
                                        break;
                                    }
                                    String substring = trim.substring(0, indexOf);
                                    String substring2 = trim.substring(indexOf + 1);
                                    if (substring.equals("ssid")) {
                                        asbo.f88675a = ascr.m73791b(substring2);
                                    }
                                    asbo.f88676b.put(substring, substring2);
                                }
                            }
                            sek sek = asbq.f88679a;
                            String valueOf = String.valueOf(trim);
                            sek.mo25412b(valueOf.length() == 0 ? new String("unexpected string in WPA Supplicant file: ") : "unexpected string in WPA Supplicant file: ".concat(valueOf), new Object[0]);
                        }
                    } else {
                        asbo = new asbo();
                    }
                } catch (IOException e) {
                    asbq.f88679a.mo25417e("IOException encountered", e, new Object[0]);
                    arrayList = new ArrayList();
                } catch (NullPointerException e2) {
                    asbq.f88679a.mo25417e("NullPointerException encountered", e2, new Object[0]);
                    arrayList = new ArrayList();
                }
            }
            Iterator it3 = arrayList.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                asbp asbp2 = (asbp) it3.next();
                if (asbp2.f88677a.equals(str)) {
                    str2 = (String) asbp2.f88678b.get("preSharedKey");
                    break;
                }
            }
            this.f88670b.mo48991a(ascr.m73791b(str2));
        } catch (Exception e3) {
            this.f88670b.mo48990a(e3);
        }
    }
}
