package p000;

import android.content.Intent;
import android.os.Bundle;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.gms.nearby.messages.service.NearbyMessagesChimeraService;

/* renamed from: ajfl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajfl extends buqn {

    /* renamed from: a */
    final /* synthetic */ Intent f70523a;

    /* renamed from: b */
    final /* synthetic */ NearbyMessagesChimeraService f70524b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ajfl(NearbyMessagesChimeraService nearbyMessagesChimeraService, String str, Intent intent) {
        super(str);
        this.f70524b = nearbyMessagesChimeraService;
        this.f70523a = intent;
    }

    public final void run() {
        ajee ajee = new ajee(this.f70524b);
        Intent intent = this.f70523a;
        NearbyMessagesChimeraService nearbyMessagesChimeraService = this.f70524b;
        try {
            ((buqh) ahgz.m55754a(nearbyMessagesChimeraService, buqh.class)).mo72984b();
            Bundle extras = intent.getExtras();
            if (extras != null) {
                srn srn = ahfq.f67120a;
                String a = aakz.m21424a(nearbyMessagesChimeraService).mo16960a(intent);
                if (!extras.isEmpty() && "gcm".equals(a)) {
                    String string = extras.getString("PUSH_MESSAGE");
                    bzbz bzbz = null;
                    if (string != null) {
                        bzbz = (bzbz) GeneratedMessageLite.m124014a(bzbz.f169283c, sqd.m35971c(string));
                    }
                    if (ajee.f70418b.mo38177c()) {
                        bxvd da = bvhi.f156070c.mo74144da();
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bvhi bvhi = (bvhi) da.f164949b;
                        bzbz.getClass();
                        bvhi.f156073b = bzbz;
                        bvhi.f156072a |= 1;
                        ajee.f70418b.mo38172a((bvhi) da.mo74062i());
                    }
                    if (bzbz != null) {
                        if ((bzbz.f169285a & 4) == 0) {
                            bnsl bnsl = (bnsl) ahfq.f67120a.mo68388c();
                            bnsl.mo68432a("ajee", "a", 92, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl.mo68405a("Ignoring empty push message");
                        } else {
                            bzca bzca = bzbz.f169286b;
                            if (bzca == null) {
                                bzca = bzca.f169288c;
                            }
                            int size = bzca.f169291b.size();
                            bzca.f169290a.size();
                            if (size > 0) {
                                for (int i = 0; i < bzca.f169291b.size(); i++) {
                                    ajbn ajbn = ajee.f70417a;
                                    byzr byzr = (byzr) bzca.f169291b.get(i);
                                    bxvd bxvd = (bxvd) byzr.mo74142c(5);
                                    bxvd.mo73625a((GeneratedMessageLite) byzr);
                                    ajbn.mo38449a((bxvf) bxvd);
                                }
                            }
                        }
                    }
                }
            }
        } catch (bxwf e) {
            bnsl bnsl2 = (bnsl) ahfq.f67120a.mo68387b();
            bnsl2.mo68437a(e);
            bnsl2.mo68432a("ajee", "a", (int) ErrorInfo.TYPE_SDU_FAILED, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68420a("%s", "GcmHandler: ");
        } catch (Throwable th) {
            asfd.m73946a(nearbyMessagesChimeraService, intent);
            throw th;
        }
        asfd.m73946a(nearbyMessagesChimeraService, intent);
    }
}
