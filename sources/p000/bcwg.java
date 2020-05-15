package p000;

import android.content.Context;

/* renamed from: bcwg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcwg {

    /* renamed from: a */
    public final bqgj f105051a = bboz.m88304a().f103024a;

    /* renamed from: b */
    public final bbqt f105052b;

    /* renamed from: c */
    public final String f105053c;

    /* renamed from: d */
    public final bzsy f105054d;

    public bcwg(Context context, String str) {
        this.f105052b = bbqt.m88417a(context);
        this.f105053c = str;
        this.f105054d = bzsy.m126181a(new bzse()).mo74580a();
    }

    /* renamed from: a */
    public static final chux m90141a(String str, String str2, chuv chuv) {
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 29 + String.valueOf(str).length());
        sb.append("Got Scotty Error: ");
        sb.append(str2);
        sb.append(" requestId=");
        sb.append(str);
        bbos.m88294d("ScottyStub", sb.toString());
        return new chux(chuv.mo85692c(new bcwb(str2)));
    }

    /* renamed from: a */
    public static final chux m90142a(String str, String str2, chuv chuv, Throwable th) {
        StringBuilder sb = new StringBuilder(str2.length() + 29 + String.valueOf(str).length());
        sb.append("Got Scotty Error: ");
        sb.append(str2);
        sb.append(" requestId=");
        sb.append(str);
        bbos.m88292b("ScottyStub", sb.toString(), th);
        return new chux(chuv.mo85692c(new bcwb(str2, th)));
    }
}
