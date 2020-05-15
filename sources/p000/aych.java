package p000;

import android.os.Message;
import android.text.TextUtils;
import java.util.Calendar;
import java.util.Locale;

/* renamed from: aych */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aych {

    /* renamed from: a */
    private aycl f97118a;

    /* renamed from: b */
    private long f97119b;

    /* renamed from: c */
    private int f97120c;

    /* renamed from: d */
    private String f97121d;

    /* renamed from: e */
    private aycg f97122e;

    /* renamed from: f */
    private aycg f97123f;

    public aych(aycl aycl, Message message, String str, aycg aycg, aycg aycg2) {
        mo53881a(aycl, message, str, aycg, aycg2);
    }

    /* renamed from: a */
    public final void mo53881a(aycl aycl, Message message, String str, aycg aycg, aycg aycg2) {
        this.f97118a = aycl;
        this.f97119b = System.currentTimeMillis();
        this.f97120c = message != null ? message.what : 0;
        this.f97121d = str;
        this.f97122e = aycg;
        this.f97123f = aycg2;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append("time=");
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(this.f97119b);
        sb.append(String.format(Locale.US, "%tm-%td %tH:%tM:%tS.%tL", instance, instance, instance, instance, instance, instance));
        sb.append(" processed=");
        aycg aycg = this.f97122e;
        String str3 = "<null>";
        if (aycg != null) {
            str = aycg.mo53863c();
        } else {
            str = str3;
        }
        sb.append(str);
        sb.append(" dest=");
        aycg aycg2 = this.f97123f;
        if (aycg2 != null) {
            str3 = aycg2.mo53863c();
        }
        sb.append(str3);
        sb.append(" what=");
        aycl aycl = this.f97118a;
        if (aycl != null) {
            str2 = aycl.mo53864a(this.f97120c);
        } else {
            str2 = "";
        }
        if (TextUtils.isEmpty(str2)) {
            sb.append(this.f97120c);
            sb.append("(0x");
            sb.append(Integer.toHexString(this.f97120c));
            sb.append(")");
        } else {
            sb.append(str2);
        }
        if (!TextUtils.isEmpty(this.f97121d)) {
            sb.append(" ");
            sb.append(this.f97121d);
        }
        return sb.toString();
    }
}
