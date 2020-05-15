package p000;

import android.os.IInterface;
import com.google.android.gms.telephonyspam.CallSpamOptions;
import com.google.android.gms.telephonyspam.LookupSpamSettingsOptions;
import com.google.android.gms.telephonyspam.LookupSpamStatusOptions;
import com.google.android.gms.telephonyspam.MessageSpamOptions;
import com.google.android.gms.telephonyspam.ReportAsNotSpamOptions;
import com.google.android.gms.telephonyspam.ReportAsSpamOptions;
import com.google.android.gms.telephonyspam.UpdateSpamSettingsOptions;

/* renamed from: audo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface audo extends IInterface {
    /* renamed from: a */
    void mo50432a(audm audm, int i);

    /* renamed from: a */
    void mo50433a(audm audm, int i, LookupSpamSettingsOptions lookupSpamSettingsOptions);

    /* renamed from: a */
    void mo50434a(audm audm, String str, int i);

    /* renamed from: a */
    void mo50435a(audm audm, String str, int i, LookupSpamStatusOptions lookupSpamStatusOptions);

    /* renamed from: a */
    void mo50436a(rnt rnt, int i, boolean z);

    /* renamed from: a */
    void mo50437a(rnt rnt, int i, boolean z, UpdateSpamSettingsOptions updateSpamSettingsOptions);

    /* renamed from: a */
    void mo50438a(rnt rnt, String str, int i);

    /* renamed from: a */
    void mo50439a(rnt rnt, String str, int i, ReportAsNotSpamOptions reportAsNotSpamOptions);

    /* renamed from: a */
    void mo50440a(rnt rnt, String str, int i, ReportAsSpamOptions reportAsSpamOptions);

    /* renamed from: a */
    void mo50441a(rnt rnt, String str, boolean z, CallSpamOptions callSpamOptions);

    /* renamed from: a */
    void mo50442a(rnt rnt, String str, boolean z, MessageSpamOptions messageSpamOptions);

    /* renamed from: b */
    void mo50443b(rnt rnt, String str, int i);
}
