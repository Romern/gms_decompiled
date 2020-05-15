package p000;

import android.text.TextUtils;
import com.google.android.gms.romanesco.restoresettings.ContactsRestoreSettingsChimeraActivity;
import java.util.Map;

/* renamed from: aped */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aped implements aubw {

    /* renamed from: a */
    final /* synthetic */ String f84202a;

    /* renamed from: b */
    final /* synthetic */ String f84203b;

    /* renamed from: c */
    final /* synthetic */ apeh f84204c;

    public aped(apeh apeh, String str, String str2) {
        this.f84204c = apeh;
        this.f84202a = str;
        this.f84203b = str2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo10462a(Object obj) {
        apej apej;
        String str;
        Void voidR = (Void) obj;
        apeh apeh = this.f84204c;
        String str2 = this.f84202a;
        String str3 = this.f84203b;
        aoyj.m69819a().mo46988a(3);
        long currentTimeMillis = System.currentTimeMillis();
        Map map = (Map) apeh.f84212b.f84188c.get(str2);
        apej apej2 = null;
        if (map != null) {
            apej = (apej) map.get(str3);
        } else {
            apej = null;
        }
        if (apej != null) {
            apej.f84241m = currentTimeMillis;
            apej2 = apej;
        }
        if (apej2 != null) {
            apdh apdh = apeh.f84211a.f107291c;
            if (TextUtils.equals(apdh.f84164d, str2)) {
                int i = 0;
                while (i < apdh.f84166f.size()) {
                    apej apej3 = (apej) apdh.f84166f.get(i);
                    if (cgkf.m145856c()) {
                        str = apel.m70098a(apej3);
                    } else {
                        str = apej3.f84229a;
                    }
                    if (!TextUtils.equals(str, str3)) {
                        i++;
                    } else {
                        if (apej2.mo47137a() || cgkf.m145858e()) {
                            long j = apej2.f84241m;
                            ContactsRestoreSettingsChimeraActivity contactsRestoreSettingsChimeraActivity = apdh.f84163a;
                            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 14 + String.valueOf(str).length());
                            sb.append("restore_time__");
                            sb.append(str2);
                            sb.append(str);
                            aucu.m76780a(snp.m35704b(9), new apdn(contactsRestoreSettingsChimeraActivity, sb.toString(), Long.valueOf(j)));
                        }
                        apej3.f84241m = apej2.f84241m;
                        apdh.mo158M(i + 4);
                        return;
                    }
                }
            }
        }
    }
}
