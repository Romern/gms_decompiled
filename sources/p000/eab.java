package p000;

import android.app.usage.UsageEvents;
import android.app.usage.UsageStatsManager;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.contextmanager.ContextData;
import com.google.android.gms.contextmanager.internal.WriteBatchImpl;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.HashMap;

/* renamed from: eab */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class eab extends dye {

    /* renamed from: b */
    public static final dxr f14531b = new dxr(new eaa(), "RunningAppsProducer", new int[]{20}, new int[]{7});

    /* renamed from: k */
    private long f14532k;

    /* renamed from: l */
    private final HashMap f14533l;

    /* renamed from: m */
    private int f14534m;

    public eab(Context context, doh doh, String str, dqb dqb) {
        super(context, doh, f14531b, str, dqb);
        this.f14534m = 1;
        this.f14532k = dwq.m9665i().mo20505a();
        this.f14534m = 1;
        this.f14533l = new HashMap();
        mo9851a(20);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo9845a() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo9848b() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final long mo9865k() {
        long j;
        if (this.f14532k == 0) {
            return 0;
        }
        if (this.f14534m == 3) {
            j = cdgp.f180782a.mo6606a().mo77550aO();
        } else {
            j = cdgp.f180782a.mo6606a().mo77580ay();
        }
        long a = (this.f14532k + j) - dwq.m9665i().mo20505a();
        if (a >= 0) {
            return a;
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo9902a(String str, String str2, long j, WriteBatchImpl writeBatchImpl) {
        ContextData contextData = (ContextData) this.f14533l.remove(str);
        if (contextData == null) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
            bnsl.mo68432a("eab", "a", (int) PSKKeyManager.MAX_KEY_LENGTH_BYTES, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("[RunningAppsProducer] onGoingContext for %s should not be null", str);
            return;
        }
        bxvd da = bxmw.f163990f.mo74144da();
        if (!TextUtils.isEmpty(str)) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bxmw bxmw = (bxmw) da.f164949b;
            str.getClass();
            bxmw.f163993a |= 1;
            bxmw.f163994b = str;
        }
        if (!TextUtils.isEmpty(str2)) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bxmw bxmw2 = (bxmw) da.f164949b;
            str2.getClass();
            bxmw2.f163993a |= 2;
            bxmw2.f163995c = str2;
        }
        tip tip = new tip(contextData);
        tip.mo26571a(j);
        writeBatchImpl.mo18101a(tip.mo26570a());
        new Object[1][0] = da.toString();
    }

    /* renamed from: b */
    public final void mo9500b(ContextData contextData) {
        int i = 1;
        new Object[1][0] = contextData;
        if (contextData.mo18018g() != 7) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
            bnsl.mo68432a("eab", "b", 88, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("[RunningAppsProducer] Should not be receiving context: %s", Integer.toString(contextData.mo18018g()));
            return;
        }
        bxmz bxmz = (bxmz) contextData.mo18009a(bxmz.f164000d);
        if (bxmz == null) {
            bnsl bnsl2 = (bnsl) dss.f13961a.mo68387b();
            bnsl2.mo68432a("eab", "b", 97, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("[RunningAppsProducer] Could not get Screen proto in Running app producer.");
            return;
        }
        int i2 = this.f14534m;
        int a = bxmy.m122885a(bxmz.f164003b);
        if (a == 0) {
            a = 1;
        }
        if (i2 != a) {
            int a2 = bxmy.m122885a(bxmz.f164003b);
            if (a2 != 0) {
                i = a2;
            }
            this.f14534m = i;
            mo9864j();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo9864j() {
        String str;
        long a = dwq.m9665i().mo20505a();
        int i = Build.VERSION.SDK_INT;
        WriteBatchImpl b = tjj.m37080b();
        UsageEvents queryEvents = ((UsageStatsManager) this.f14388d.getSystemService("usagestats")).queryEvents(this.f14532k, a);
        while (queryEvents.hasNextEvent()) {
            UsageEvents.Event event = new UsageEvents.Event();
            queryEvents.getNextEvent(event);
            int eventType = event.getEventType();
            if (eventType == 1 || eventType == 8) {
                if (eventType == 8) {
                    int i2 = Build.VERSION.SDK_INT;
                    str = event.getShortcutId();
                } else {
                    str = null;
                }
                String packageName = event.getPackageName();
                String className = event.getClassName();
                long timeStamp = event.getTimeStamp();
                bxvd da = bxmw.f163990f.mo74144da();
                if (!TextUtils.isEmpty(packageName)) {
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bxmw bxmw = (bxmw) da.f164949b;
                    packageName.getClass();
                    bxmw.f163993a |= 1;
                    bxmw.f163994b = packageName;
                }
                if (!TextUtils.isEmpty(className)) {
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bxmw bxmw2 = (bxmw) da.f164949b;
                    className.getClass();
                    bxmw2.f163993a |= 2;
                    bxmw2.f163995c = className;
                }
                if (!TextUtils.isEmpty(str)) {
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bxmw bxmw3 = (bxmw) da.f164949b;
                    str.getClass();
                    bxmw3.f163993a |= 8;
                    bxmw3.f163997e = str;
                }
                int i3 = eventType != 1 ? 3 : 2;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bxmw bxmw4 = (bxmw) da.f164949b;
                bxmw4.f163996d = i3 - 1;
                bxmw4.f163993a |= 4;
                tip tip = new tip(1, 20, 1);
                tip.mo26574a(eventType == 1 ? tka.m37119b(timeStamp) : tka.m37117a(timeStamp));
                tip.mo26572a(bxmw.f163991g, (bxmw) da.mo74062i());
                ContextData a2 = tip.mo26570a();
                b.mo18101a(a2);
                if (eventType == 1) {
                    this.f14533l.put(packageName, a2);
                }
            } else if (eventType == 2) {
                String packageName2 = event.getPackageName();
                String className2 = event.getClassName();
                long timeStamp2 = event.getTimeStamp();
                ContextData contextData = (ContextData) this.f14533l.remove(packageName2);
                if (contextData == null) {
                    bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
                    bnsl.mo68432a("eab", "a", (int) PSKKeyManager.MAX_KEY_LENGTH_BYTES, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68420a("[RunningAppsProducer] onGoingContext for %s should not be null", packageName2);
                } else {
                    bxvd da2 = bxmw.f163990f.mo74144da();
                    if (!TextUtils.isEmpty(packageName2)) {
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        bxmw bxmw5 = (bxmw) da2.f164949b;
                        packageName2.getClass();
                        bxmw5.f163993a |= 1;
                        bxmw5.f163994b = packageName2;
                    }
                    if (!TextUtils.isEmpty(className2)) {
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        bxmw bxmw6 = (bxmw) da2.f164949b;
                        className2.getClass();
                        bxmw6.f163993a = 2 | bxmw6.f163993a;
                        bxmw6.f163995c = className2;
                    }
                    tip tip2 = new tip(contextData);
                    tip2.mo26571a(timeStamp2);
                    b.mo18101a(tip2.mo26570a());
                    new Object[1][0] = da2.toString();
                }
            }
        }
        if (b.mo18102a()) {
            mo9852a(b);
        }
        this.f14532k = a;
    }
}
