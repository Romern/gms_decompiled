package p000;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.libraries.matchstick.net.MessagingService;
import com.google.android.libraries.matchstick.task.ScheduledTaskService;
import java.util.concurrent.TimeUnit;

/* renamed from: azhm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azhm extends azhc {

    /* renamed from: b */
    private final cipc f99390b;

    public azhm(Context context, azfx azfx, cipc cipc) {
        super(context, azfx, "clientStatusReport");
        this.f99390b = cipc;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo54920a(Object obj) {
        cbia cbia;
        cipc cipc = (cipc) obj;
        azph.m85998a(this.f99339a).mo55125a(1673);
        if (cffd.f183922a.mo6606a().mo81111b()) {
            afix afix = (afix) azht.m85748a(this.f99339a).mo54933a(64);
            ClientContext b = azht.m85748a(this.f99339a).mo54935b(64);
            if (afix.f64261c == null) {
                afix.f64261c = chtv.m149566a(chtu.UNARY, "media.webrtc.server.matchstickv2.proto.ClientStatusService/ReportClientStatus", ciie.m150370a(cipc.f191180e), ciie.m150370a(cipd.f191186c));
            }
            return (cipd) afix.f64262a.mo25553a(afix.f64261c, b, cipc, (long) afix.f64260b, TimeUnit.MILLISECONDS);
        }
        try {
            cbia = (cbia) bxvk.m124014a(cbia.f177224a, cipc.mo73642k());
        } catch (bxwf e) {
            bqye.m113758a(e);
            cbia = null;
        }
        afja afja = (afja) azht.m85748a(this.f99339a).mo54933a(4);
        ClientContext b2 = azht.m85748a(this.f99339a).mo54935b(4);
        if (afja.f64281e == null) {
            afja.f64281e = chtv.m149566a(chtu.UNARY, "google.internal.communications.instantmessaging.v1.Matchstick/ReportClientStatus", ciie.m150370a(cbia.f177224a), ciie.m150370a(cbib.f177226a));
        }
        cbib cbib = (cbib) afja.f64284a.mo25553a(afja.f64281e, b2, cbia, (long) afja.f64278b, TimeUnit.MILLISECONDS);
        if (cbib == null) {
            return (cipd) cipd.f191186c.mo74144da().mo74057h();
        }
        try {
            return (cipd) bxvk.m124014a(cipd.f191186c, cbib.mo73642k());
        } catch (bxwf e2) {
            bqye.m113758a(e2);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo54924b() {
        Object[] objArr = new Object[1];
        ciov ciov = this.f99390b.f191183b;
        if (ciov == null) {
            ciov = ciov.f191144i;
        }
        objArr[0] = ciov;
        Object[] objArr2 = new Object[1];
        cipe cipe = this.f99390b.f191184c;
        if (cipe == null) {
            cipe = cipe.f191190d;
        }
        objArr2[0] = cipe;
        Object[] objArr3 = new Object[1];
        cioy cioy = this.f99390b.f191185d;
        if (cioy == null) {
            cioy = cioy.f191163c;
        }
        objArr3[0] = cioy;
        return this.f99390b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo54922a(Object obj, Exception exc) {
        cipc cipc = (cipc) obj;
        new Object[1][0] = exc;
        azph.m85998a(this.f99339a).mo55154a(1675, exc);
        ScheduledTaskService.m94664b(this.f99339a, "gms:matchstick:clientStatusReport", TimeUnit.MILLISECONDS.toSeconds(cfeo.m138884o()), TimeUnit.DAYS.toSeconds(7));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo54923a(Object obj, Object obj2) {
        long j;
        ciox ciox;
        cipc cipc = (cipc) obj;
        cipd cipd = (cipd) obj2;
        if (cipd == null || cipd.f191188a == 0) {
            new Object[1][0] = cipd;
            j = TimeUnit.MILLISECONDS.toSeconds(cfeo.m138884o());
        } else {
            j = TimeUnit.MILLISECONDS.toSeconds(cipd.f191188a - System.currentTimeMillis());
        }
        azph.m85998a(this.f99339a).mo55125a(1674);
        if (cffd.m139295b()) {
            ScheduledTaskService.m94664b(this.f99339a, "gms:matchstick:clientStatusReport", j, TimeUnit.DAYS.toSeconds(7));
        }
        if (cipd != null && (ciox = cipd.f191189b) != null) {
            int i = ciox.f191162a;
            if (i == 1) {
                Intent intent = new Intent("com.google.android.apps.libraries.matchstick.action.tickle_handle_action");
                intent.putExtra("command_type", "report_status");
                MessagingService.m94557b(intent, this.f99339a);
            } else if (i != 2) {
                azph.m85998a(this.f99339a).mo55125a(1676);
                azoj.m85933c("ReportCSRpcHandler", "Unknown command type received from server", new Object[0]);
            } else {
                Intent intent2 = new Intent("com.google.android.apps.libraries.matchstick.action.tickle_handle_action");
                intent2.putExtra("command_type", "reset");
                MessagingService.m94557b(intent2, this.f99339a);
            }
        }
    }
}
