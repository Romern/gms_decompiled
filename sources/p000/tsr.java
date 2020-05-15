package p000;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import com.google.android.gms.chromesync.ChromeSyncState;

/* renamed from: tsr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tsr extends adcf {

    /* renamed from: a */
    public tsb f46603a;

    /* renamed from: b */
    public final C0034at f46604b = new C0034at();

    /* renamed from: a */
    public final void mo26774a(tql tql) {
        if (tql.mo26737c() == 3) {
            this.f46604b.mo2450b((Object) false);
        } else if (tql.mo26737c() != 2) {
            PendingIntent pendingIntent = ((ChromeSyncState) tql.mo26735a()).f30012c;
            if (pendingIntent == null || pendingIntent.getIntentSender() == null) {
                this.f46604b.mo2450b((Object) true);
                return;
            }
            try {
                startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0, null);
            } catch (IntentSender.SendIntentException e) {
                this.f46604b.mo2450b((Object) false);
            }
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        boolean z = true;
        if (i == 1) {
            C0034at atVar = this.f46604b;
            if (i2 != -1) {
                z = false;
            }
            atVar.mo2450b(Boolean.valueOf(z));
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        tsb tsb = (tsb) adcj.m50162a(getActivity(), tsi.m37432a(getActivity(), getArguments().getString("pwm.DataFieldNames.accountName"))).mo3444a(tsb.class);
        this.f46603a = tsb;
        tsb.mo26753a().mo2445a(this, new tsq(this));
    }
}
