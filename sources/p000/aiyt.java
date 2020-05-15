package p000;

import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.felicanetworks.sdu.ErrorInfo;

/* renamed from: aiyt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aiyt {

    /* renamed from: a */
    public ajaw f70103a;

    /* renamed from: b */
    private final aixs f70104b;

    public aiyt(aixs aixs) {
        this.f70104b = aixs;
    }

    /* renamed from: a */
    public final void mo38307a(bzbu bzbu) {
        srn srn = ahfq.f67120a;
        ajgs.m58685a(bzbu);
        this.f70104b.mo38229a(bzbu);
    }

    /* renamed from: a */
    public final void mo38308a(bzbu bzbu, ajgm ajgm) {
        ajgo ajgo;
        aixs aixs = this.f70104b;
        aiys aiys = new aiys(this, bzbu, ajgm);
        aixs.f70018e.mo72984b();
        ajgo ajgo2 = (ajgo) aixs.f70015b.get(bzbu.f169275k);
        if (ajgo2 != null) {
            if (ajgo2.mo38215a(ajgm)) {
                srn srn = ahfq.f67120a;
                ajgm.mo38614a();
                ajgs.m58685a(bzbu);
                aiys.run();
                return;
            }
            aixs.mo38229a(bzbu);
        }
        buye a = aixs.mo38225a();
        if (a == null) {
            bnsl bnsl = (bnsl) ahfq.f67120a.mo68387b();
            bnsl.mo68432a("aixs", "a", (int) MfiClientException.TYPE_ILLEGAL_LINKAGE_DATA, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Unable to start advertising without live NearbyDirect");
            return;
        }
        bvac bvac = bvac.OPERATION_STATUS_UNKNOWN;
        bzbu bzbu2 = bzbu.TOKEN_MEDIUM_UNKNOWN;
        int ordinal = bzbu.ordinal();
        if (ordinal == 1) {
            ajgo = aixs.f70019f.f70127c;
        } else if (ordinal == 2 || ordinal == 3) {
            ajgo = new aixn(aixs, aixs.f70017d, a, bzbu, aiys);
        } else if (ordinal != 8) {
            String a2 = ajgs.m58685a(bzbu);
            throw new IllegalStateException(a2.length() == 0 ? new String("Unknown Medium requested: ") : "Unknown Medium requested: ".concat(a2));
        } else {
            ajgo = aixs.f70019f.f70125a;
        }
        if (!ajgo.mo38214a()) {
            srn srn2 = ahfq.f67120a;
            String a3 = ajgs.m58685a(bzbu);
            String valueOf = String.valueOf(ajgo);
            String valueOf2 = String.valueOf(Boolean.valueOf(ajgo.mo38214a()));
            StringBuilder sb = new StringBuilder(a3.length() + 29 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
            sb.append(a3);
            sb.append(" advertiser: ");
            sb.append(valueOf);
            sb.append(" can advertise: ");
            sb.append(valueOf2);
            sb.toString();
            return;
        }
        aixs.f70018e.mo72984b();
        if (!ajgo.mo38214a()) {
            bnsl bnsl2 = (bnsl) ahfq.f67120a.mo68387b();
            bnsl2.mo68432a("aixs", "a", (int) ErrorInfo.TYPE_ACTIVATE_FELICA_HTTP_ERROR, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68420a("%s is not supported to advertise", ajgs.m58685a(bzbu));
        } else {
            aixs.f70015b.put(bzbu.f169275k, ajgo);
            try {
                srn srn3 = ahfq.f67120a;
                ajgm.f70586a.mo36407a();
                ajgs.m58685a(bzbu);
                ajgo.mo38217b(ajgm);
            } catch (ajgn e) {
                bnsl bnsl3 = (bnsl) ahfq.f67120a.mo68387b();
                bnsl3.mo68437a(e);
                bnsl3.mo68432a("aixs", "a", (int) BaseMfiEventCallback.TYPE_ISSUE_LIMIT_EXCEEDED, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl3.mo68420a("Fail to start advertising: %s", ajgs.m58685a(bzbu));
            }
        }
        if (bzbu == bzbu.AUDIO_ULTRASOUND_PASSBAND || bzbu == bzbu.AUDIO_AUDIBLE_DTMF) {
            aiys.run();
        }
    }
}
