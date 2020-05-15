package p000;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import java.util.TimeZone;

/* renamed from: eaw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class eaw extends dyg {

    /* renamed from: b */
    public static final dxr f14579b = new dxr(new eav(), "TimePropertyProducer", new int[]{45}, null);

    /* renamed from: k */
    private bxnk f14580k;

    public eaw(Context context, doh doh, String str, dqb dqb) {
        super(context, doh, f14579b, str, dqb);
    }

    /* renamed from: a */
    private final void m10014a(String str, long j) {
        bxvd da = bxnk.f164044c.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxnk bxnk = (bxnk) da.f164949b;
        str.getClass();
        bxnk.f164047a |= 1;
        bxnk.f164048b = str;
        this.f14580k = (bxnk) da.mo74062i();
        tip tip = new tip(10, 45, 1);
        tip.mo26574a(tka.m37119b(j));
        tip.mo26572a(bxnk.f164045d, this.f14580k);
        mo9857d(tip.mo26570a());
    }

    /* renamed from: j */
    static final String m10015j() {
        return TimeZone.getDefault().getID();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final IntentFilter mo9849c() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
        return intentFilter;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo9848b() {
        mo9846a(dwq.m9665i().mo20505a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo9845a() {
        m10014a(m10015j(), dwq.m9665i().mo20505a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo9846a(long j) {
        super.mo9846a(j);
        this.f14580k = null;
    }

    /* renamed from: a */
    public final void mo9847a(Context context, Intent intent) {
        if (TextUtils.equals(intent.getAction(), "android.intent.action.TIMEZONE_CHANGED")) {
            String j = m10015j();
            if (!mo9861g()) {
                bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
                bnsl.mo68432a("eaw", "a", 85, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68420a("[TimePropertyProducer] No ongoing data (timeZoneId=%s)", j);
                m10014a(j, dwq.m9665i().mo20505a());
            } else if (TextUtils.equals(this.f14580k.f164048b, j)) {
                bnsl bnsl2 = (bnsl) dss.f13961a.mo68388c();
                bnsl2.mo68432a("eaw", "a", 93, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68420a("[TimePropertyProducer] Got same value as before for time zone=%s", j);
            } else {
                long a = dwq.m9665i().mo20505a();
                mo9846a(a);
                m10014a(j, a + 1);
            }
        }
    }
}
