package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.fitness.data.Session;
import com.google.android.gms.fitness.data.SessionDataSet;
import com.google.android.gms.fitness.request.SessionReadRequest;
import com.google.android.gms.fitness.request.SessionStartRequest;
import com.google.android.gms.fitness.request.SessionStopRequest;
import com.google.android.gms.fitness.result.SessionReadResult;
import com.google.android.gms.fitness.result.SessionStopResult;
import com.google.android.gms.fitness.service.sessions.FitSessionsChimeraBroker;
import com.google.android.gms.fitness.sessions.registration.SessionRegistration;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: zor */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zor extends zmd {

    /* renamed from: d */
    public static final srn f55620d = zvt.m46581a();

    /* renamed from: e */
    public final zpe f55621e;

    /* renamed from: f */
    public final zre f55622f;

    /* renamed from: g */
    public final ysl f55623g;

    /* renamed from: h */
    public final zqx f55624h;

    /* renamed from: i */
    public final zos f55625i = new zos(this.f55622f, zvn.m46574a(this.f55428a), this.f55623g);

    /* renamed from: j */
    public final ytp f55626j;

    public zor(FitSessionsChimeraBroker fitSessionsChimeraBroker, String str, zpe zpe, yzs yzs) {
        super(fitSessionsChimeraBroker, str, yzs);
        this.f55621e = zpe;
        this.f55622f = yzs.mo30877c(this.f55429b);
        this.f55623g = yzs.mo30874b().mo30741b(this.f55429b);
        this.f55624h = yzs.mo30890j(this.f55429b);
        this.f55626j = yzs.mo30887i();
    }

    /* renamed from: a */
    private final SessionReadResult m45897a(SessionReadRequest sessionReadRequest, String str) {
        String str2;
        SessionReadRequest sessionReadRequest2 = sessionReadRequest;
        String str3 = str;
        if (cdyr.m135341c()) {
            Status c = this.f55623g.mo30730c(str3, stc.m36282a("https://www.googleapis.com/auth/fitness.activity.read"));
            if (!c.mo17710c()) {
                return SessionReadResult.m23728a(c);
            }
        }
        zqx zqx = this.f55624h;
        bngx a = yvx.m44924a(sessionReadRequest2.f32297f);
        bngx a2 = ywb.m44928a(sessionReadRequest2.f32296e);
        bngs b = bngx.m109371b(a.size() + a2.size());
        int size = a.size();
        for (int i = 0; i < size; i++) {
            b.mo67668c(zqx.mo30458a((caae) a.get(i), str3));
        }
        int size2 = a2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            b.mo67668c(zqx.mo30459a((caah) a2.get(i2)));
        }
        bngx a3 = b.mo67664a();
        Status a4 = this.f55623g.mo30717a(str3, bnic.m109495a((Collection) a3), 1);
        if (a4.mo17710c()) {
            if (!sessionReadRequest2.f32298g) {
                str2 = str3;
            } else {
                str2 = null;
            }
            ArrayList arrayList = new ArrayList();
            bnre i3 = this.f55622f.mo31392a(str2, sessionReadRequest2.f32292a, sessionReadRequest2.f32293b, TimeUnit.MILLISECONDS.convert(sessionReadRequest2.f32294c, TimeUnit.MILLISECONDS), TimeUnit.MILLISECONDS.convert(sessionReadRequest2.f32295d, TimeUnit.MILLISECONDS)).listIterator();
            while (i3.hasNext()) {
                cadz cadz = (cadz) i3.next();
                if (!sessionReadRequest2.f32300i.contains(yym.m45036a(cadz))) {
                    arrayList.add(cadz);
                }
            }
            bngx a5 = ywf.m44940a(arrayList);
            boolean z = sessionReadRequest2.f32299h;
            bngs b2 = bngx.m109371b(a5.size() * a3.size());
            bnre i4 = a5.listIterator();
            while (i4.hasNext()) {
                Session session = (Session) i4.next();
                zqx zqx2 = this.f55624h;
                long nanos = TimeUnit.MILLISECONDS.toNanos(session.f32166a);
                long nanos2 = TimeUnit.MILLISECONDS.toNanos(session.f32167b);
                ygb a6 = ygc.m44027a(str);
                a6.f53748b = z;
                bnre i5 = zqx2.mo30457a(a3, nanos, nanos2, -1, a6.mo30460a()).listIterator();
                while (i5.hasNext()) {
                    b2.mo67668c(new SessionDataSet(session, ywe.m44939a((cadp) i5.next(), str3)));
                }
            }
            return new SessionReadResult(a5, b2.mo67664a(), Status.f30107a);
        }
        bnsl bnsl = (bnsl) f55620d.mo68388c();
        bnsl.mo68432a("zor", "a", 415, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68424a("App %s does not have access to dataSources: %s", str3, yyd.m44991b(a3));
        return SessionReadResult.m23728a(a4);
    }

    /* renamed from: b */
    public final void mo31242b(String str) {
        this.f55621e.mo31305a(str);
    }

    /* renamed from: d */
    public final boolean mo31245d() {
        return this.f55621e.mo31308a();
    }

    /* renamed from: g */
    public final void mo31248g() {
        this.f55621e.f55649a.mo67270d();
    }

    /* renamed from: b */
    public final boolean mo31243b() {
        zpe zpe = this.f55621e;
        for (SessionRegistration sessionRegistration : zpe.f55651c.mo30751b()) {
            if (sessionRegistration.f32438a.equals(zpe.f55650b)) {
                String str = sessionRegistration.f32439b;
                zpe.mo31307a(str, sessionRegistration.f32441d, new ClientIdentity(sessionRegistration.f32440c, str), false);
            }
        }
        return mo31245d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Binder mo31233a(ytu ytu) {
        return new zcb(this.f55428a, ytu);
    }

    /* renamed from: a */
    public final Status mo31298a(SessionStartRequest sessionStartRequest, String str) {
        Status c = this.f55623g.mo30730c(str, stc.m36282a("https://www.googleapis.com/auth/fitness.activity.write"));
        if (!c.mo17710c()) {
            return c;
        }
        cadz a = ywf.m44941a(sessionStartRequest.f32304a);
        bzzy bzzy = (bzzy) bzzz.f172298f.mo74144da();
        if (bzzy.f164950c) {
            bzzy.mo74035c();
            bzzy.f164950c = false;
        }
        bzzz bzzz = (bzzz) bzzy.f164949b;
        str.getClass();
        bzzz.f172300a |= 1;
        bzzz.f172301b = str;
        cadz a2 = yym.m45034a(a, (bzzz) bzzy.mo74062i());
        cadz a3 = zpc.m45934a(a2, this.f55622f, str);
        if (a3 == null) {
            this.f55622f.mo31394b(a2, 0);
            Context context = this.f55428a;
            long j = a2.f172779e;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            yud.m44847a(context).edit().putLong("session_start", timeUnit.toMillis(j)).apply();
            if (!this.f55621e.mo31308a()) {
                return Status.f30107a;
            }
            Intent intent = new Intent();
            intent.setType(bzzh.m126349b(yym.m45039c(a2)));
            sef.m35071a(ywf.m44942a(a2), intent, "vnd.google.fitness.session");
            intent.putExtra("vnd.google.fitness.start_time", a2.f172779e);
            for (Map.Entry entry : this.f55621e.mo31309b().entrySet()) {
                if (!this.f55623g.mo30730c((String) entry.getKey(), stc.m36282a("https://www.googleapis.com/auth/fitness.activity.read")).mo17710c()) {
                    this.f55621e.mo31305a((String) entry.getKey());
                } else {
                    for (PendingIntent pendingIntent : (Collection) entry.getValue()) {
                        try {
                            pendingIntent.send(this.f55428a, 0, intent);
                        } catch (PendingIntent.CanceledException e) {
                            bnsl bnsl = (bnsl) f55620d.mo68390d();
                            bnsl.mo68432a("zor", "a", (int) BaseMfiEventCallback.TYPE_CARD_NOT_UNIQUE, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl.mo68420a("Found dead intent listener %s, removing.", pendingIntent);
                            this.f55621e.mo31306a((String) entry.getKey(), pendingIntent);
                        }
                    }
                }
            }
            if (!mo31245d()) {
                mo31247f();
            }
            return Status.f30107a;
        } else if (!yym.m45037b(a3)) {
            return new Status(5009);
        } else {
            this.f55622f.mo31395c(yym.m45035a(a3, a2), 0);
            return Status.f30107a;
        }
    }

    /* renamed from: a */
    public final SessionStopResult mo31299a(SessionStopRequest sessionStopRequest, String str) {
        String str2;
        int i;
        cadz cadz;
        SessionStopRequest sessionStopRequest2 = sessionStopRequest;
        String str3 = str;
        int i2 = 1;
        boolean z = false;
        Status c = this.f55623g.mo30730c(str3, stc.m36282a("https://www.googleapis.com/auth/fitness.activity.write"));
        if (!c.mo17710c()) {
            return SessionStopResult.m23730a(c);
        }
        List a = zpc.m45936a(this.f55622f, str3, sessionStopRequest2.f32306a, sessionStopRequest2.f32307b);
        long currentTimeMillis = System.currentTimeMillis();
        int size = a.size();
        int i3 = 0;
        do {
            str2 = ":com.google.android.gms@201515033@20.15.15 (120300-306758586)";
            if (i3 < size) {
                cadz = (cadz) a.get(i3);
                i3++;
            } else {
                ArrayList arrayList = new ArrayList(a.size());
                int size2 = a.size();
                int i4 = 0;
                while (i4 < size2) {
                    cadz cadz2 = (cadz) a.get(i4);
                    bmxy.m108596a(yym.m45037b(cadz2), "Session is not active: %s", cadz2);
                    bxvd bxvd = (bxvd) cadz2.mo74142c(5);
                    bxvd.mo73625a((bxvk) cadz2);
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = z;
                    }
                    cadz cadz3 = (cadz) bxvd.f164949b;
                    cadz cadz4 = cadz.f172773j;
                    cadz3.f172775a |= 16;
                    cadz3.f172780f = currentTimeMillis;
                    cadz cadz5 = (cadz) bxvd.mo74062i();
                    this.f55622f.mo31395c(cadz5, 17);
                    String str4 = str2;
                    this.f55625i.mo31300a(cadz5.f172779e, cadz5.f172780f);
                    zpc.m45939a(this.f55622f, cadz5, zvn.m46574a(this.f55428a));
                    arrayList.add(cadz5);
                    Intent intent = new Intent();
                    intent.setType(bzzh.m126349b(yym.m45039c(cadz5)));
                    sef.m35071a(ywf.m44942a(cadz5), intent, "vnd.google.fitness.session");
                    intent.putExtra("vnd.google.fitness.start_time", cadz5.f172779e);
                    intent.putExtra("vnd.google.fitness.end_time", cadz5.f172780f);
                    Iterator it = this.f55621e.mo31309b().entrySet().iterator();
                    while (true) {
                        i = i4 + 1;
                        if (!it.hasNext()) {
                            break;
                        }
                        Map.Entry entry = (Map.Entry) it.next();
                        String[] strArr = new String[i2];
                        strArr[0] = "https://www.googleapis.com/auth/fitness.activity.read";
                        if (!this.f55623g.mo30730c((String) entry.getKey(), stc.m36282a(strArr)).mo17710c()) {
                            this.f55621e.mo31305a((String) entry.getKey());
                        } else {
                            for (PendingIntent pendingIntent : (Collection) entry.getValue()) {
                                try {
                                    try {
                                        pendingIntent.send(this.f55428a, 0, intent);
                                    } catch (PendingIntent.CanceledException e) {
                                        bnsl bnsl = (bnsl) f55620d.mo68390d();
                                        bnsl.mo68432a("zor", "a", 305, str4);
                                        bnsl.mo68420a("Found dead intent listener %s, removing.", pendingIntent);
                                        this.f55621e.mo31306a((String) entry.getKey(), pendingIntent);
                                        a = a;
                                    }
                                } catch (PendingIntent.CanceledException e2) {
                                    bnsl bnsl2 = (bnsl) f55620d.mo68390d();
                                    bnsl2.mo68432a("zor", "a", 305, str4);
                                    bnsl2.mo68420a("Found dead intent listener %s, removing.", pendingIntent);
                                    this.f55621e.mo31306a((String) entry.getKey(), pendingIntent);
                                    a = a;
                                }
                            }
                            i2 = 1;
                            a = a;
                        }
                    }
                    i4 = i;
                    str2 = str4;
                    i2 = 1;
                    z = false;
                    a = a;
                }
                if (!mo31245d()) {
                    mo31247f();
                }
                yud.m44847a(this.f55428a).edit().clear().apply();
                return new SessionStopResult(Status.f30107a, ywf.m44940a(arrayList));
            }
        } while (cadz.f172779e <= currentTimeMillis);
        bnsl bnsl3 = (bnsl) f55620d.mo68388c();
        bnsl3.mo68432a("zor", "a", 265, str2);
        bnsl3.mo68423a("Found a live session %s with start time later than end time: %d.", yym.m45040d(cadz), currentTimeMillis);
        return SessionStopResult.m23730a(new Status(5020));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final ytv mo31234a() {
        return new zoq(this);
    }

    /* renamed from: a */
    public final void mo31235a(PrintWriter printWriter) {
        printWriter.append((CharSequence) "SessionRecordingManager:\n").append((CharSequence) "  explicit sessions: ").append((CharSequence) this.f55621e.f55649a.toString()).append((CharSequence) "\n");
    }

    /* renamed from: a */
    public final void mo31236a(String str) {
        this.f55621e.mo31305a(str);
    }
}
