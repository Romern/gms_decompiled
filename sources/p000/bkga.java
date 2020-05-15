package p000;

import android.os.Bundle;
import android.text.TextUtils;

/* renamed from: bkga */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkga {

    /* renamed from: a */
    public String f124182a;

    /* renamed from: b */
    public String f124183b;

    /* renamed from: c */
    public String f124184c;

    /* renamed from: d */
    public int f124185d;

    /* renamed from: a */
    public final bkgc mo65976a() {
        String str = this.f124182a;
        String str2 = this.f124183b;
        String str3 = this.f124184c;
        int i = this.f124185d;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException(String.format("Title, message, and positive button text are required. Received values: title: %s  message: %s infoMessage: %s posButtonText: %s", str, str2, null, str3));
        }
        TextUtils.isEmpty(str2);
        Bundle a = bkbq.m105268a(i);
        a.putString("title", str);
        bxvd da = bmnr.f130153o.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bmnr bmnr = (bmnr) da.f164949b;
        str2.getClass();
        bmnr.f130155a |= 4;
        bmnr.f130159e = str2;
        bjvp.m104736a(a, "infoMessage", da.mo74062i());
        if (!TextUtils.isEmpty(null)) {
            a.putString("details", null);
        }
        a.putString("positiveButtonText", str3);
        if (!TextUtils.isEmpty(null)) {
            a.putString("negativeButtonText", null);
        }
        a.putBoolean("linkifyMessage", true);
        bkgc bkgc = new bkgc();
        bkgc.setArguments(a);
        return bkgc;
    }
}
