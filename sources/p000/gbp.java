package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.common.api.Status;
import java.util.UUID;

/* renamed from: gbp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gbp implements aubq {

    /* renamed from: a */
    final /* synthetic */ gbq f17847a;

    /* renamed from: b */
    private final Context f17848b;

    /* renamed from: c */
    private final cbnw f17849c;

    /* renamed from: d */
    private final boolean f17850d;

    /* renamed from: e */
    private final Bundle f17851e;

    /* renamed from: f */
    private final tdl f17852f;

    /* renamed from: g */
    private final tds f17853g;

    public gbp(gbq gbq, Context context, tds tds, cbnw cbnw, boolean z, Bundle bundle, tdl tdl) {
        this.f17847a = gbq;
        this.f17848b = context;
        this.f17853g = tds;
        this.f17849c = cbnw;
        this.f17850d = z;
        this.f17851e = bundle;
        this.f17852f = tdl;
    }

    /* renamed from: a */
    public final void mo6378a(aucb aucb) {
        if (!aucb.mo50384b()) {
            this.f17853g.mo26403a(this.f17847a.f17860g, 56, 68, aucb.mo50387e().getMessage());
            try {
                this.f17847a.mo6503a(new Status(34503));
            } catch (RemoteException e) {
                gbq.f17854a.mo25415d("Remote exception:", e, new Object[0]);
            }
        } else {
            this.f17853g.mo26402a(this.f17847a.f17860g, 56, 5);
            sxt.m36563a();
            Context context = this.f17848b;
            gbq gbq = this.f17847a;
            UUID uuid = gbq.f17860g;
            cbnw cbnw = this.f17849c;
            boolean z = this.f17850d;
            Bundle bundle = this.f17851e;
            byte[] bArr = gbq.f17861h;
            tdl tdl = this.f17852f;
            Intent startIntent = IntentOperation.getStartIntent(context, "com.google.android.gms.constellation.EventManager", "com.google.android.gms.constellation.eventmanager.SET_ASTERISM_CONSENT");
            startIntent.putExtra("eventmanager.session_id", uuid.toString());
            startIntent.putExtra("eventmanager.trigger_type", 7);
            startIntent.putExtra("eventmanager.consent_value", z);
            startIntent.putExtra("eventmanager.aster_client", cbnw.mo3214a());
            startIntent.putExtra("eventmanager.extra_param", bundle);
            startIntent.putExtra("eventmanager.audit_token", bArr);
            startIntent.putExtra("eventmanager.on_sync_complete_callback_key", tdl.f45700e);
            context.startService(startIntent);
        }
    }
}
