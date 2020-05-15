package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.udc.UdcSettingsListActivityRequest;
import java.io.IOException;

/* renamed from: avbo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avbo extends avav {

    /* renamed from: a */
    private final UdcSettingsListActivityRequest f92918a;

    public avbo(Context context, avdl avdl, ClientContext clientContext, String str, UdcSettingsListActivityRequest udcSettingsListActivityRequest) {
        super(context, avdl, clientContext, str, "GetSettingsListActivityIntentOperation");
        this.f92918a = udcSettingsListActivityRequest;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        Intent intent;
        super.mo6502a(context);
        if (chbo.m148123b()) {
            avet.m78388a().mo51185a();
        }
        mo51133b();
        if (!TextUtils.isEmpty(this.f92885f)) {
            try {
                if (this.f92918a.mo59632a()) {
                    if (avjb.m78604a(this.f92918a.f109357a, mo51134c())) {
                        intent = avjm.m78615a(this.f92882c, this.f92885f, this.f92918a.f109357a);
                        PendingIntent a = spn.m35844a(this.f92882c, intent, 134217728);
                        mo51131a(0);
                        this.f92883d.mo51155a(Status.f30107a, a);
                    }
                }
                intent = avjm.m78616a(this.f92885f);
                PendingIntent a2 = spn.m35844a(this.f92882c, intent, 134217728);
                mo51131a(0);
                this.f92883d.mo51155a(Status.f30107a, a2);
            } catch (gid e) {
                throw new aaaj(4504, null);
            } catch (IOException e2) {
                throw new aaaj(4505, null);
            }
        } else {
            throw new aaaj(5, null);
        }
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        mo51131a(status.f30115i);
        this.f92883d.mo51155a(status, (PendingIntent) null);
    }
}
