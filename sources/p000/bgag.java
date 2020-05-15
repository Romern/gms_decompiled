package p000;

import android.os.Message;
import android.text.TextUtils;
import java.util.Calendar;
import java.util.Locale;

/* renamed from: bgag */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgag {

    /* renamed from: a */
    private bgan f115867a;

    /* renamed from: b */
    private long f115868b;

    /* renamed from: c */
    private int f115869c;

    /* renamed from: d */
    private String f115870d;

    /* renamed from: e */
    private bgaf f115871e;

    /* renamed from: f */
    private bgaf f115872f;

    /* renamed from: g */
    private bgaf f115873g;

    public bgag(bgan bgan, Message message, String str, bgaf bgaf, bgaf bgaf2, bgaf bgaf3) {
        mo62529a(bgan, message, str, bgaf, bgaf2, bgaf3);
    }

    /* renamed from: a */
    public final void mo62529a(bgan bgan, Message message, String str, bgaf bgaf, bgaf bgaf2, bgaf bgaf3) {
        this.f115867a = bgan;
        this.f115868b = System.currentTimeMillis();
        this.f115869c = message != null ? message.what : 0;
        this.f115870d = str;
        this.f115871e = bgaf;
        this.f115872f = bgaf2;
        this.f115873g = bgaf3;
    }

    public final String toString() {
        String str;
        String str2;
        String str3;
        StringBuilder sb = new StringBuilder();
        sb.append("time=");
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(this.f115868b);
        sb.append(String.format(Locale.US, "%tm-%td %tH:%tM:%tS.%tL", instance, instance, instance, instance, instance, instance));
        sb.append(" processed=");
        bgaf bgaf = this.f115871e;
        String str4 = "<null>";
        if (bgaf != null) {
            str = bgaf.mo62478g();
        } else {
            str = str4;
        }
        sb.append(str);
        sb.append(" org=");
        bgaf bgaf2 = this.f115872f;
        if (bgaf2 != null) {
            str2 = bgaf2.mo62478g();
        } else {
            str2 = str4;
        }
        sb.append(str2);
        sb.append(" dest=");
        bgaf bgaf3 = this.f115873g;
        if (bgaf3 != null) {
            str4 = bgaf3.mo62478g();
        }
        sb.append(str4);
        sb.append(" what=");
        bgan bgan = this.f115867a;
        if (bgan != null) {
            str3 = bgan.mo62506a(this.f115869c);
        } else {
            str3 = "";
        }
        if (TextUtils.isEmpty(str3)) {
            sb.append(this.f115869c);
            sb.append("(0x");
            sb.append(Integer.toHexString(this.f115869c));
            sb.append(")");
        } else {
            sb.append(str3);
        }
        if (!TextUtils.isEmpty(this.f115870d)) {
            sb.append(" ");
            sb.append(this.f115870d);
        }
        return sb.toString();
    }
}
