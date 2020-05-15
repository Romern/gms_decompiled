package com.google.android.gms.feedback;

import android.accounts.Account;
import android.content.Context;
import android.util.Log;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.common.HelpConfig;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class OfflineReportSendTaskChimeraService extends aeah {

    /* renamed from: a */
    private bqgj f31616a;

    /* renamed from: a */
    public static void m23397a(Context context) {
        aebi aebi = new aebi();
        aebi.f63097i = "com.google.android.gms.feedback.OfflineReportSendTaskService";
        aebi.mo34004a(0, TimeUnit.DAYS.toSeconds(cdtr.f181715a.mo6606a().mo78320s()));
        int i = 1;
        aebi.f63102n = true;
        boolean j = cdtr.m134948j();
        if (!cdny.m134338c() && !cdtr.m134948j()) {
            i = 0;
        }
        aebi.mo34024a(j ? 1 : 0, i);
        aebi.f63099k = "gF_OfflineUpload";
        aebi.mo34023a(0);
        aeat.m51532a(context).mo33984a(aebi.mo33974b());
    }

    /* renamed from: a */
    public final int mo6269a(aecc aecc) {
        wzh wzh;
        if (aaya.m47229b(cdup.m135069b())) {
            wzh wzh2 = new wzh();
            wzh2.mo29584c();
            wzh = wzh2;
        } else {
            wzh = null;
        }
        File[] listFiles = new File(getFilesDir(), "reports").listFiles();
        if (listFiles == null) {
            return 2;
        }
        for (File file : listFiles) {
            if (file.getName().endsWith(".proto.gz")) {
                if (aaya.m47229b(cdup.m135069b()) && wzh != null && TimeUnit.MILLISECONDS.toSeconds(wzh.mo29582a()) >= cdtr.f181715a.mo6606a().mo78322u()) {
                    return 1;
                }
                try {
                    bxvd da = bylq.f166910e.mo74144da();
                    byll byll = byll.f166869h;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bylq bylq = (bylq) da.f164949b;
                    byll.getClass();
                    bylq.f166913b = byll;
                    bylq.f166912a |= 1;
                    bxvd da2 = bylr.f166917p.mo74144da();
                    bxvd da3 = byma.f166976j.mo74144da();
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    byma byma = (byma) da3.f164949b;
                    byma.f166978a |= 1;
                    byma.f166979b = 1;
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bylr bylr = (bylr) da2.f164949b;
                    byma byma2 = (byma) da3.mo74062i();
                    byma2.getClass();
                    bylr.f166920b = byma2;
                    bylr.f166919a |= 1;
                    bxvd da4 = bylk.f166853n.mo74144da();
                    if (da4.f164950c) {
                        da4.mo74035c();
                        da4.f164950c = false;
                    }
                    bylk bylk = (bylk) da4.f164949b;
                    "".getClass();
                    int i = bylk.f166855a | 1;
                    bylk.f166855a = i;
                    bylk.f166856b = "";
                    "".getClass();
                    int i2 = i | 2;
                    bylk.f166855a = i2;
                    bylk.f166857c = "";
                    "".getClass();
                    int i3 = i2 | 4;
                    bylk.f166855a = i3;
                    bylk.f166858d = "";
                    "".getClass();
                    int i4 = i3 | 8;
                    bylk.f166855a = i4;
                    bylk.f166859e = "";
                    "".getClass();
                    bylk.f166855a = i4 | 16;
                    bylk.f166860f = "";
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bylr bylr2 = (bylr) da2.f164949b;
                    bylk bylk2 = (bylk) da4.mo74062i();
                    bylk2.getClass();
                    bylr2.f166922d = bylk2;
                    bylr2.f166919a |= 4;
                    bxvd da5 = byls.f166935i.mo74144da();
                    if (da5.f164950c) {
                        da5.mo74035c();
                        da5.f164950c = false;
                    }
                    byls byls = (byls) da5.f164949b;
                    "".getClass();
                    int i5 = byls.f166937a | 2;
                    byls.f166937a = i5;
                    byls.f166939c = "";
                    "".getClass();
                    int i6 = i5 | 4;
                    byls.f166937a = i6;
                    byls.f166940d = "";
                    "".getClass();
                    int i7 = i6 | 64;
                    byls.f166937a = i7;
                    byls.f166944h = "";
                    "".getClass();
                    byls.f166937a = i7 | 1;
                    byls.f166938b = "";
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bylr bylr3 = (bylr) da2.f164949b;
                    byls byls2 = (byls) da5.mo74062i();
                    byls2.getClass();
                    bylr3.f166921c = byls2;
                    bylr3.f166919a |= 2;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bylq bylq2 = (bylq) da.f164949b;
                    bylr bylr4 = (bylr) da2.mo74062i();
                    bylr4.getClass();
                    bylq2.f166914c = bylr4;
                    bylq2.f166912a |= 2;
                    bylq bylq3 = (bylq) aatb.m46962a(file, (bylq) da.mo74062i());
                    if (bylq3 != null) {
                        wxg wxg = new wxg(this);
                        bylr bylr5 = bylq3.f166914c;
                        if (bylr5 == null) {
                            bylr5 = bylr.f166917p;
                        }
                        String a = wxg.m42445a(bylr5);
                        bylr bylr6 = bylq3.f166914c;
                        if (bylr6 == null) {
                            bylr6 = bylr.f166917p;
                        }
                        if (!wxg.mo29533a(a, wxg.m42447b(bylr6))) {
                            GoogleHelp googleHelp = new GoogleHelp("gms:feedback:suggestions");
                            byll byll2 = bylq3.f166913b;
                            if (byll2 == null) {
                                byll2 = byll.f166869h;
                            }
                            if (!byll2.f166874d.isEmpty()) {
                                byll byll3 = bylq3.f166913b;
                                if (byll3 == null) {
                                    byll3 = byll.f166869h;
                                }
                                googleHelp.f78760c = new Account(byll3.f166874d, "com.google");
                            }
                            byll byll4 = bylq3.f166913b;
                            if (byll4 == null) {
                                byll4 = byll.f166869h;
                            }
                            if (!byll4.f166877g.isEmpty()) {
                                aare aare = new aare(googleHelp);
                                byll byll5 = bylq3.f166913b;
                                if (byll5 == null) {
                                    byll5 = byll.f166869h;
                                }
                                aare.mo31634a(byll5.f166877g);
                            }
                            HelpConfig a2 = HelpConfig.m66350a(googleHelp, this);
                            bylr bylr7 = bylq3.f166914c;
                            if (bylr7 == null) {
                                bylr7 = bylr.f166917p;
                            }
                            if ((bylr7.f166919a & 2) != 0) {
                                bylr bylr8 = bylq3.f166914c;
                                if (bylr8 == null) {
                                    bylr8 = bylr.f166917p;
                                }
                                byls byls3 = bylr8.f166921c;
                                if (byls3 == null) {
                                    byls3 = byls.f166935i;
                                }
                                if (!byls3.f166944h.isEmpty()) {
                                    bylr bylr9 = bylq3.f166914c;
                                    if (bylr9 == null) {
                                        bylr9 = bylr.f166917p;
                                    }
                                    byls byls4 = bylr9.f166921c;
                                    if (byls4 == null) {
                                        byls4 = byls.f166935i;
                                    }
                                    a2.f78827b = byls4.f166944h;
                                } else {
                                    bylr bylr10 = bylq3.f166914c;
                                    if (bylr10 == null) {
                                        bylr10 = bylr.f166917p;
                                    }
                                    byls byls5 = bylr10.f166921c;
                                    if (byls5 == null) {
                                        byls5 = byls.f166935i;
                                    }
                                    if (!byls5.f166938b.isEmpty()) {
                                        bylr bylr11 = bylq3.f166914c;
                                        if (bylr11 == null) {
                                            bylr11 = bylr.f166917p;
                                        }
                                        byls byls6 = bylr11.f166921c;
                                        if (byls6 == null) {
                                            byls6 = byls.f166935i;
                                        }
                                        a2.f78827b = byls6.f166938b;
                                    }
                                }
                            }
                            if (this.f31616a == null) {
                                this.f31616a = snp.m35702a(10);
                            }
                            bqgj bqgj = this.f31616a;
                            sdo.m34973b("Must be called from a worker thread.");
                            bylr bylr12 = bylq3.f166914c;
                            if (bylr12 == null) {
                                bylr12 = bylr.f166917p;
                            }
                            if (wwz.m42432a(wwz.m42431a(this, a2, bqgj, wxg.m42446a(bylr12.f166928j, bylq3.f166915d, wxg.m42445a(bylr12), wxg.m42447b(bylr12)), wxf.m42444a(file), false))) {
                            }
                        } else {
                            Log.w("gF_SendGcmTask", "Dropped report.");
                        }
                    } else {
                        Log.w("gF_SendGcmTask", "Can't parse the report.");
                    }
                    file.delete();
                } catch (IOException e) {
                    return 1;
                }
            }
        }
        return 0;
    }
}
