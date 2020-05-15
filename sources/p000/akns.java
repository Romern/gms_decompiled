package p000;

import android.text.Html;
import com.google.android.gms.constellation.PhoneNumberInfo;
import com.google.android.gms.notifications.GunsBrowserChimeraActivity;
import java.util.List;

/* renamed from: akns */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class akns implements aubw {

    /* renamed from: a */
    final /* synthetic */ GunsBrowserChimeraActivity f72317a;

    public akns(GunsBrowserChimeraActivity gunsBrowserChimeraActivity) {
        this.f72317a = gunsBrowserChimeraActivity;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo10462a(Object obj) {
        StringBuilder sb = new StringBuilder("var phoneNumberInfos = [];");
        for (PhoneNumberInfo phoneNumberInfo : (List) obj) {
            sb.append("phoneNumberInfos.push({number: \"");
            sb.append(Html.escapeHtml(phoneNumberInfo.f30475b));
            sb.append("\", verificationTime: ");
            sb.append(phoneNumberInfo.f30476c);
            sb.append(", data: {");
            String str = "";
            for (String str2 : phoneNumberInfo.f30477d.keySet()) {
                sb.append(str);
                sb.append(str2);
                sb.append(": \"");
                sb.append(Html.escapeHtml(phoneNumberInfo.f30477d.getString(str2)));
                sb.append("\"");
                str = ", ";
            }
            sb.append("}});");
        }
        sb.append("window.onFetchPhoneNumberInfo(0, phoneNumberInfos);");
        this.f72317a.mo44697c(sb.toString());
    }
}
