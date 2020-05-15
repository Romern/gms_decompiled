package p000;

import android.content.Context;
import android.os.Handler;
import android.os.WorkSource;

/* renamed from: spj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
class spj extends spf {

    /* renamed from: e */
    private static int f44929e = 0;

    public spj(Context context, skc skc) {
        super(context, skc);
    }

    /* renamed from: a */
    public static synchronized String m35833a(String str) {
        String sb;
        synchronized (spj.class) {
            int i = f44929e + 1;
            f44929e = i;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 18);
            sb2.append(str);
            sb2.append("_ALARM_");
            sb2.append(i);
            sb = sb2.toString();
        }
        return sb;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ spe mo25929a(spb spb, String str, int i) {
        return new sph(this, spb, str, i);
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo25931a(String str, int i, long j, spe spe, Handler handler, WorkSource workSource) {
        mo25936a(str, i, j, (sph) spe, workSource);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo25936a(String str, int i, long j, sph sph, WorkSource workSource) {
        this.f44922c.mo25674a(str, i, j, sph.f44926f, workSource);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo25934a(spe spe) {
        this.f44922c.mo25668a(((sph) spe).f44926f);
    }
}
