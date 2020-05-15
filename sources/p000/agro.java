package p000;

import android.content.SharedPreferences;

/* renamed from: agro */
final /* synthetic */ class agro implements Runnable {

    /* renamed from: a */
    private final agrq f66315a;

    /* renamed from: b */
    private final String f66316b;

    /* renamed from: c */
    private final String f66317c;

    /* renamed from: d */
    private final String f66318d;

    public agro(agrq agrq, String str, String str2, String str3) {
        this.f66315a = agrq;
        this.f66316b = str;
        this.f66317c = str2;
        this.f66318d = str3;
    }

    public final void run() {
        int i;
        agrq agrq = this.f66315a;
        String str = this.f66316b;
        String str2 = this.f66317c;
        String str3 = this.f66318d;
        bxvd da = bwby.f158793d.mo74144da();
        bxvd da2 = bwbt.f158758k.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bwbt bwbt = (bwbt) da2.f164949b;
        str.getClass();
        bwbt.f158760a = str;
        str2.getClass();
        bwbt.f158761b = str2;
        str3.getClass();
        bwbt.f158765f = str3;
        bwbt.f158766g = bwcc.m121741a(4);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bwbt bwbt2 = (bwbt) da2.mo74062i();
        bwbt2.getClass();
        ((bwby) da.f164949b).f158797c = bwbt2;
        bwby bwby = (bwby) da.mo74062i();
        bxvd da3 = bwbv.f158777g.mo74144da();
        agza agza = agrq.f66325e;
        synchronized (agza.f66896a) {
            int i2 = -1;
            i = agza.f66897b.getInt("local_notification_id", -1);
            SharedPreferences.Editor edit = agza.f66897b.edit();
            if (i >= 0) {
                i = -1;
            }
            if (i != Integer.MIN_VALUE) {
                i2 = i - 1;
            }
            edit.putInt("local_notification_id", i2);
            edit.commit();
        }
        long j = (long) i;
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        bwbv bwbv = (bwbv) da3.f164949b;
        bwbv.f158781c = j;
        bwby.getClass();
        bwbv.f158780b = bwby;
        bwbv.f158779a = 2;
        bszx bszx = bszx.GCORE_MSG_TYPE_PURCHASE;
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        ((bwbv) da3.f164949b).f158782d = bszx.mo3214a();
        agrq.mo36030b((bwbv) da3.mo74062i());
    }
}
