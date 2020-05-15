package p000;

import android.telephony.SmsMessage;

/* renamed from: ibi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ibi {

    /* renamed from: a */
    private static final srn f20673a = srn.m36124a();

    /* renamed from: a */
    public static String m15196a(bngx bngx) {
        sdo.m34959a(bngx);
        ((bnsl) f20673a.mo68390d()).mo68409a("getCompleteSmsMessageBody, array length is %d", bngx.size());
        if (bngx.isEmpty()) {
            return "";
        }
        if (bngx.size() == 1) {
            return ((SmsMessage) bnjd.m109587b(bngx)).getDisplayMessageBody();
        }
        StringBuilder sb = new StringBuilder();
        bnre i = bngx.listIterator();
        while (i.hasNext()) {
            sb.append(((SmsMessage) i.next()).getDisplayMessageBody());
        }
        return sb.toString();
    }
}
