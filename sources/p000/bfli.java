package p000;

import android.util.Log;

/* renamed from: bfli */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bfli implements bugo {

    /* renamed from: a */
    final /* synthetic */ bfll f114341a;

    public bfli(bfll bfll) {
        this.f114341a = bfll;
    }

    /* renamed from: a */
    public final void mo61878a(bugn bugn, bugr bugr, buhd buhd) {
        if (bugr.mo72639a() == this.f114341a.f114344b && buhd.f153831a == 48) {
            bugd bugd = (bugd) buhd.mo72661a((bxxk) bugd.f153768c.mo74142c(7));
            int i = 1;
            if (bugd == null) {
                int i2 = buhd.f153831a;
                int i3 = buhd.f153832b;
                StringBuilder sb = new StringBuilder(68);
                sb.append("Unable to deserialize message from nanoapp: ");
                sb.append(i2);
                sb.append(", ");
                sb.append(i3);
                Log.e("SettingsHelperNyc", sb.toString());
                bxvd da = bugd.f153768c.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bugd bugd2 = (bugd) da.f164949b;
                bugd2.f153771b = 0;
                bugd2.f153770a |= 1;
                bugd = (bugd) da.mo74062i();
            }
            int a = bugc.m119426a(bugd.f153771b);
            if (a != 0) {
                i = a;
            }
            if (i - 1 != 0) {
                this.f114341a.mo61885c();
                bfll bfll = this.f114341a;
                bfll.mo61882a(bfll.f114348f);
                bfll bfll2 = this.f114341a;
                bfll2.mo61881a(3, bfll2.f114348f);
                return;
            }
            this.f114341a.mo61887d();
        }
    }
}
