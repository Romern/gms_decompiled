package p000;

import android.content.Context;
import android.os.Bundle;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.update.ConfigUpdateOptions;
import java.util.concurrent.ExecutionException;

/* renamed from: avln */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avln extends aaab {

    /* renamed from: a */
    private static final Logger f93317a = avpq.m79015b("CheckForConfigUpdateOperation");

    /* renamed from: b */
    private final rnt f93318b;

    /* renamed from: c */
    private final ConfigUpdateOptions f93319c;

    public avln(rnt rnt, ConfigUpdateOptions configUpdateOptions) {
        super(MfiClientException.TYPE_CARD_NOT_CACHED, "CheckForConfigUpdate");
        this.f93318b = rnt;
        this.f93319c = configUpdateOptions;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        chuv chuv;
        if (!cfrx.m142746b()) {
            qco a = qco.m31854a(context);
            qcw qcw = new qcw(context, this);
            qcw.mo23921b();
            Bundle a2 = qcw.mo23920a();
            a2.putBoolean("com.google.android.gms.checkin.FETCH_SYSTEM_UPDATES", this.f93319c.f109445a);
            aucb a3 = a.mo23912a(a2);
            try {
                aucu.m76782a(a3);
            } catch (InterruptedException | ExecutionException e) {
                f93317a.mo25417e("Failed to checkin.", e, new Object[0]);
            }
            bmxv c = bmxv.m108567c((Integer) a3.mo50386d());
            f93317a.mo25414c("Checkin request finished with code %s.", c);
            if (!c.mo66813a() || ((Integer) c.mo66814b()).intValue() != 21021) {
                this.f93318b.mo11797a(Status.f30109c);
            } else {
                this.f93318b.mo11797a(Status.f30107a);
            }
        } else {
            if (!this.f93319c.f109445a) {
                chuv = ((avmn) avmn.f93396b.mo51589b()).mo51383a();
            } else {
                avmn avmn = (avmn) avmn.f93396b.mo51589b();
                chuv = avmn.mo51384a(avmn.mo51382a(true));
            }
            if (chuv.mo85689a()) {
                this.f93318b.mo11797a(Status.f30107a);
            } else {
                this.f93318b.mo11797a(Status.f30109c);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f93318b.mo11797a(status);
    }
}
