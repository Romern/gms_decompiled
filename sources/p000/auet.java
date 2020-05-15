package p000;

import com.google.android.gms.telephonyspam.CallSpamOptions;
import com.google.android.gms.telephonyspam.LookupSpamSettingsOptions;
import com.google.android.gms.telephonyspam.LookupSpamStatusOptions;
import com.google.android.gms.telephonyspam.MessageContent;
import com.google.android.gms.telephonyspam.MessageSpamOptions;
import com.google.android.gms.telephonyspam.ReportAsNotSpamOptions;
import com.google.android.gms.telephonyspam.ReportAsSpamOptions;
import com.google.android.gms.telephonyspam.UpdateSpamSettingsOptions;
import com.google.android.gms.telephonyspam.service.TelephonySpamApiChimeraService;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: auet */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auet extends audn implements aaai {

    /* renamed from: a */
    private final TelephonySpamApiChimeraService f91581a;

    /* renamed from: b */
    private final aaag f91582b;

    /* renamed from: c */
    private final String f91583c;

    static {
        audg.m76790a("TelephonySpamApiStub");
    }

    public auet(TelephonySpamApiChimeraService telephonySpamApiChimeraService, aaag aaag, String str) {
        this.f91581a = telephonySpamApiChimeraService;
        this.f91582b = aaag;
        this.f91583c = str;
    }

    /* renamed from: a */
    private static final int m76934a(int i) {
        if (i == 1) {
            return 1;
        }
        int i2 = 3;
        if (i == 3) {
            return 2;
        }
        if (i != 4) {
            i2 = 5;
            if (i != 5) {
                if (i != 6) {
                    return i != 7 ? 7 : 6;
                }
                return 4;
            }
        }
        return i2;
    }

    /* renamed from: b */
    public final void mo50443b(rnt rnt, String str, int i) {
        String valueOf = String.valueOf(str);
        if (valueOf.length() == 0) {
            new String("reportNotSpam Request received: ");
        } else {
            "reportNotSpam Request received: ".concat(valueOf);
        }
        this.f91582b.mo16659a(this.f91581a, new auew(rnt, str, false, this.f91583c, i, 0, 7, 0, new bqic[0], bows.UNKNOWN_SPAMTYPE, 1));
    }

    /* renamed from: a */
    public final void mo50432a(audm audm, int i) {
        new Object[1][0] = Integer.valueOf(i);
        this.f91582b.mo16659a(this.f91581a, new aueu(audm, this.f91583c, i));
    }

    /* renamed from: a */
    public final void mo50433a(audm audm, int i, LookupSpamSettingsOptions lookupSpamSettingsOptions) {
        String str = lookupSpamSettingsOptions.f109015b;
        Object[] objArr = {str, Integer.valueOf(i)};
        this.f91582b.mo16659a(this.f91581a, new aueu(audm, str, i));
    }

    /* renamed from: a */
    public final void mo50434a(audm audm, String str, int i) {
        String valueOf = String.valueOf(str);
        if (valueOf.length() == 0) {
            new String("getSpamStatus Request received: ");
        } else {
            "getSpamStatus Request received: ".concat(valueOf);
        }
        this.f91582b.mo16659a(this.f91581a, new auev(audm, str, this.f91583c, i, "", false));
    }

    /* renamed from: a */
    public final void mo50435a(audm audm, String str, int i, LookupSpamStatusOptions lookupSpamStatusOptions) {
        String str2 = lookupSpamStatusOptions.f109017b;
        Object[] objArr = {str2, str};
        this.f91582b.mo16659a(this.f91581a, new auev(audm, str, str2, i, lookupSpamStatusOptions.f109020e, lookupSpamStatusOptions.f109021f));
    }

    /* renamed from: a */
    public final void mo50436a(rnt rnt, int i, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Boolean.valueOf(z)};
        this.f91582b.mo16659a(this.f91581a, new auex(rnt, this.f91583c, i, z));
    }

    /* renamed from: a */
    public final void mo50437a(rnt rnt, int i, boolean z, UpdateSpamSettingsOptions updateSpamSettingsOptions) {
        String str = updateSpamSettingsOptions.f109043b;
        Object[] objArr = {str, Integer.valueOf(i), Boolean.valueOf(z)};
        this.f91582b.mo16659a(this.f91581a, new auex(rnt, str, i, z));
    }

    /* renamed from: a */
    public final void mo50438a(rnt rnt, String str, int i) {
        String valueOf = String.valueOf(str);
        if (valueOf.length() == 0) {
            new String("reportSpam Request received: ");
        } else {
            "reportSpam Request received: ".concat(valueOf);
        }
        this.f91582b.mo16659a(this.f91581a, new auew(rnt, str, true, this.f91583c, i, 0, 7, 0, new bqic[0], bows.UNKNOWN_SPAMTYPE, 1));
    }

    /* renamed from: a */
    public final void mo50439a(rnt rnt, String str, int i, ReportAsNotSpamOptions reportAsNotSpamOptions) {
        ReportAsNotSpamOptions reportAsNotSpamOptions2 = reportAsNotSpamOptions;
        String str2 = !reportAsNotSpamOptions2.f109031b.isEmpty() ? reportAsNotSpamOptions2.f109031b : this.f91583c;
        Object[] objArr = {str2, str};
        this.f91582b.mo16659a(this.f91581a, new auew(rnt, str, false, str2, i, 0, 7, 0, new bqic[0], bows.UNKNOWN_SPAMTYPE, 1));
    }

    /* renamed from: a */
    public final void mo50440a(rnt rnt, String str, int i, ReportAsSpamOptions reportAsSpamOptions) {
        ReportAsSpamOptions reportAsSpamOptions2 = reportAsSpamOptions;
        String str2 = !reportAsSpamOptions2.f109033b.isEmpty() ? reportAsSpamOptions2.f109033b : this.f91583c;
        Object[] objArr = {str2, str};
        this.f91582b.mo16659a(this.f91581a, new auew(rnt, str, true, str2, i, 0, 7, 0, new bqic[0], bows.UNKNOWN_SPAMTYPE, 1));
    }

    /* renamed from: a */
    public final void mo50441a(rnt rnt, String str, boolean z, CallSpamOptions callSpamOptions) {
        bows bows;
        CallSpamOptions callSpamOptions2 = callSpamOptions;
        String str2 = callSpamOptions2.f109010b;
        new Object[1][0] = str2;
        aaag aaag = this.f91582b;
        TelephonySpamApiChimeraService telephonySpamApiChimeraService = this.f91581a;
        long j = callSpamOptions2.f109011c;
        int a = m76934a(callSpamOptions2.f109012d);
        long j2 = callSpamOptions2.f109013e;
        bqic[] bqicArr = new bqic[0];
        if (callSpamOptions2.f109011c > j2) {
            int a2 = m76934a(callSpamOptions2.f109012d) - 1;
            if (a2 == 0) {
                bows = bows.INCOMING_CALL_ANSWERED;
            } else if (a2 == 1) {
                bows = bows.MISSED_CALL;
            } else if (a2 == 2) {
                bows = bows.VOICEMAIL;
            } else if (a2 == 3) {
                bows = bows.BLOCKED_CALL;
            } else if (a2 == 4) {
                bows = bows.REJECTED_CALL;
            } else if (a2 != 5) {
                bows = bows.UNKNOWN_SPAMTYPE;
            } else {
                bows = bows.ANSWERED_EXTERNALLY;
            }
        } else {
            bows = bows.OUTGOING_CALL;
        }
        aaag.mo16659a(telephonySpamApiChimeraService, new auew(rnt, str, z, str2, 1, j, a, j2, bqicArr, bows, 1));
    }

    /* renamed from: a */
    public final void mo50442a(rnt rnt, String str, boolean z, MessageSpamOptions messageSpamOptions) {
        int i;
        long j;
        int i2;
        int i3;
        MessageSpamOptions messageSpamOptions2 = messageSpamOptions;
        new Object[1][0] = messageSpamOptions2.f109027b;
        List list = messageSpamOptions2.f109029d;
        if (list.size() > 0) {
            long j2 = ((MessageContent) list.get(list.size() - 1)).f109025d;
            i2 = ((MessageContent) list.get(list.size() - 1)).f109024c;
            j = j2;
            i = 1;
        } else {
            j = 0;
            i2 = 0;
            i = 7;
        }
        bqic[] bqicArr = new bqic[list.size()];
        for (int i4 = 0; i4 < list.size(); i4++) {
            bxvd da = bqic.f140767c.mo74144da();
            long millis = TimeUnit.HOURS.toMillis(TimeUnit.MILLISECONDS.toHours(((MessageContent) list.get(i4)).f109025d));
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((bqic) da.f164949b).f140769a = millis;
            String str2 = ((MessageContent) list.get(i4)).f109023b;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            str2.getClass();
            ((bqic) da.f164949b).f140770b = str2;
            bqicArr[i4] = (bqic) da.mo74062i();
        }
        aaag aaag = this.f91582b;
        TelephonySpamApiChimeraService telephonySpamApiChimeraService = this.f91581a;
        String str3 = messageSpamOptions2.f109027b;
        long j3 = messageSpamOptions2.f109028c;
        bows bows = j > j3 ? bows.INCOMING_MESSAGE : bows.OUTGOING_MESSAGE;
        if (bowo.m111615a(i2) != 0) {
            i3 = bowo.m111615a(i2);
        } else {
            i3 = 1;
        }
        aaag.mo16659a(telephonySpamApiChimeraService, new auew(rnt, str, z, str3, 2, j, i, j3, bqicArr, bows, i3));
    }
}
