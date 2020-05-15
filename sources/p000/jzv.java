package p000;

import android.text.Html;
import com.google.android.gms.constellation.PhoneNumberInfo;
import java.util.List;

/* renamed from: jzv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class jzv implements aubw {

    /* renamed from: a */
    final /* synthetic */ kaa f23590a;

    public jzv(kaa kaa) {
        this.f23590a = kaa;
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
        this.f23590a.mo14280f(sb.toString());
    }
}
