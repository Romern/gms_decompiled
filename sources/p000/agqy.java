package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Base64;
import com.google.android.gms.mobiledataplan.MdpDataPlanStatusResponse;
import com.google.android.gms.mobiledataplan.MdpUpsellOfferResponse;
import com.google.android.gms.mobiledataplan.gcm.GcmChimeraBroadcastReceiver;
import java.util.Set;

/* renamed from: agqy */
public final /* synthetic */ class agqy implements Runnable {

    /* renamed from: a */
    private final Intent f66301a;

    /* renamed from: b */
    private final Context f66302b;

    public agqy(Intent intent, Context context) {
        this.f66301a = intent;
        this.f66302b = context;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:159:0x02d0, code lost:
        if (r6 != p000.bygb.OPT_IN) goto L_0x02d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x02d3, code lost:
        if (r7 != false) goto L_0x02d5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x02c2 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x035c  */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x0427  */
    public final void run() {
        bwbt bwbt;
        bwbz bwbz;
        bwby bwby;
        bxzx bxzx;
        boolean z;
        bwby bwby2;
        bwbz bwbz2;
        bwbw bwbw;
        Intent intent = this.f66301a;
        Context context = this.f66302b;
        int i = GcmChimeraBroadcastReceiver.f80292c;
        agqz a = agqz.m54893a();
        agrl a2 = agrl.m54943a(context);
        agrn agrn = null;
        if (intent == null || !intent.hasExtra("event_gtaf")) {
            ((bnsl) agqz.f66303d.mo68388c()).mo68420a("GCM message is null or does not have the key %s.", "event_gtaf");
            a2.mo35998a((bwbv) null, boox.GCM_MESSAGE_ERROR_RECV_EMPTY, "MDP_Notification", bygd.GCM_MESSAGE_ERROR_RECV_EMPTY);
            return;
        }
        String stringExtra = intent.getStringExtra("event_gtaf");
        if (stringExtra == null || stringExtra.isEmpty()) {
            ((bnsl) agqz.f66303d.mo68388c()).mo68405a("GCM message does not have the payload.");
            a2.mo35998a((bwbv) null, boox.GCM_MESSAGE_ERROR_RECV_EMPTY, "MDP_Notification", bygd.GCM_MESSAGE_ERROR_RECV_EMPTY);
            return;
        }
        try {
            try {
                bwbv bwbv = (bwbv) bxvk.m124014a(bwbv.f158777g, Base64.decode(stringExtra, 0));
                if (a.f66305a == null) {
                    a.f66305a = new agrq();
                }
                if (a.f66306b == null) {
                    a.f66306b = new agqu();
                }
                if (bwbu.m121732a(bwbv.f158779a) == bwbu.MSG_PLAN_STATUS_UPDATE) {
                    if (bwbv.f158779a == 2) {
                        bwby2 = (bwby) bwbv.f158780b;
                    } else {
                        bwby2 = bwby.f158793d;
                    }
                    bwbt = bwby2.f158797c;
                    if (bwbt == null) {
                        bwbt = bwbt.f158758k;
                    }
                } else if (bwbu.m121732a(bwbv.f158779a) == bwbu.MSG_UPSELL_OFFER) {
                    if (bwbv.f158779a == 3) {
                        bwbz2 = (bwbz) bwbv.f158780b;
                    } else {
                        bwbz2 = bwbz.f158798d;
                    }
                    bwbt = bwbz2.f158802c;
                    if (bwbt == null) {
                        bwbt = bwbt.f158758k;
                    }
                } else if (bwbu.m121732a(bwbv.f158779a) == bwbu.ACCOUNT_ALERT) {
                    if (bwbv.f158779a == 4) {
                        bwbw = (bwbw) bwbv.f158780b;
                    } else {
                        bwbw = bwbw.f158785c;
                    }
                    bwbt = bwbw.f158788b;
                    if (bwbt == null) {
                        bwbt = bwbt.f158758k;
                    }
                } else if (agqz.m54894a(bwbv)) {
                    bwbt = null;
                } else {
                    ((bnsl) agqz.f66303d.mo68388c()).mo68405a("Received a notification without a message body");
                    a2.mo35998a(agqz.m54895b(bwbv), boox.GCM_MESSAGE_EMPTY_BODY, "MDP_Notification", bygd.GCM_MESSAGE_EMPTY_BODY);
                    return;
                }
                if (agqz.m54894a(bwbv)) {
                    bnre i2 = bngx.m109356a(new agrm()).listIterator();
                    while (true) {
                        if (!i2.hasNext()) {
                            break;
                        }
                        agrn agrn2 = (agrn) i2.next();
                        if (agrn2.mo36018a(bwbv)) {
                            agrn = agrn2;
                            break;
                        }
                    }
                    if (agrn == null) {
                        a2.mo35998a(agqz.m54895b(bwbv), boox.GCM_MESSAGE_ERROR_NO_HANDLER_FOR_HIDDEN_NOTIFICATION, "MDP_Notification", bygd.GCM_MESSAGE_ERROR_NO_HANDLER_FOR_HIDDEN_NOTIFICATION);
                    }
                    if (agrn == null) {
                        return;
                    }
                }
                String i3 = agyq.m55288i(context);
                if (cfnf.m140502c() || cfnf.m140501b()) {
                    if (bwbv.f158783e == 0) {
                        a2.mo35998a(agqz.m54895b(bwbv), boox.GCM_MESSAGE_WARN_NO_SIM_ID, "MDP_Notification", bygd.GCM_MESSAGE_WARN_NO_SIM_ID);
                    }
                    if (cfnf.m140502c() && context != null && agyq.m55287h(context) == null) {
                        a2.mo35998a(agqz.m54895b(bwbv), boox.GCM_MESSAGE_BLOCKED_NO_SUPPORTED_SIM, "MDP_Notification", bygd.GCM_MESSAGE_BLOCKED_NO_SUPPORTED_SIM);
                        return;
                    } else if (!(bwbv.f158783e == 0 || agyq.m55279b(i3) == bwbv.f158783e)) {
                        a2.mo35998a(agqz.m54895b(bwbv), boox.GCM_MESSAGE_WARN_UNMATCHED_SIM_ID, "MDP_Notification", bygd.GCM_MESSAGE_WARN_UNMATCHED_SIM_ID);
                        if (cfnf.m140501b()) {
                            a2.mo35998a(agqz.m54895b(bwbv), boox.GCM_MESSAGE_BLOCKED_UNMATCHED_SIM_ID, "MDP_Notification", bygd.GCM_MESSAGE_BLOCKED_UNMATCHED_SIM_ID);
                            return;
                        }
                    }
                }
                if ((agrn == null || agrn.mo36019b()) && bwbt != null && bwbt.f158762c == 0) {
                    ((bnsl) agqz.f66303d.mo68388c()).mo68405a("Received a notification without a valid carrier ID");
                    a2.mo35998a(agqz.m54895b(bwbv), boox.GCM_MESSAGE_NO_CARRIER_ID, "MDP_Notification", bygd.GCM_MESSAGE_NO_CARRIER_ID);
                    return;
                }
                if (agqg.m54857l().booleanValue() && !agqg.m54845L().booleanValue()) {
                    if (i3 == null) {
                        ((bnsl) agqz.f66303d.mo68387b()).mo68405a("Couldn't get SIM serial number");
                        a2.mo35998a(agqz.m54895b(bwbv), boox.UNKNOWN, "MDP_Notification", bygd.GCM_MESSAGE_ERROR_NO_ICCID);
                        return;
                    }
                    Long b = agpk.m54726a().mo35839b(i3);
                    if ((agrn == null || agrn.mo36019b()) && bwbt != null && (b == null || !b.equals(Long.valueOf(bwbt.f158762c)))) {
                        ((bnsl) agqz.f66303d.mo68388c()).mo68405a("Received a notification that doesn't match the current carrier");
                        a2.mo35998a(agqz.m54895b(bwbv), boox.GCM_MESSAGE_ERROR_UNMATCHED_CARRIER, "MDP_Notification", bygd.GCM_MESSAGE_ERROR_UNMATCHED_CARRIER);
                        return;
                    }
                }
                if (cfnf.f184517a.mo6606a().mo81627O() && (cfmv.m140309h() || agqz.m54896b())) {
                    bszx a3 = bszx.m116352a(bwbv.f158782d);
                    if (a3 == null) {
                        a3 = bszx.UNRECOGNIZED;
                    }
                    if (a3 != bszx.GCORE_MSG_TYPE_ACCOUNT_ALERT && ((agrn == null || agrn.mo36020c()) && bwbt != null)) {
                        bxwc bxwc = cfnf.f184517a.mo6606a().mo81623K().f165797a;
                        bszx a4 = bszx.m116352a(bwbv.f158782d);
                        if (a4 == null) {
                            a4 = bszx.UNRECOGNIZED;
                        }
                        if (!bxwc.contains(a4.name())) {
                            agpk a5 = agpk.m54726a();
                            if (agqz.m54896b()) {
                                bxzx = a5.mo35843c();
                            } else {
                                bxzx = a5.mo35837b(Long.valueOf(bwbt.f158762c), agpk.m54726a().mo35845e(i3));
                            }
                            if (bxzx != null) {
                                bygb a6 = bygb.m124774a(bxzx.f165204f);
                                if (a6 == null) {
                                    a6 = bygb.UNRECOGNIZED;
                                }
                                if (a6 != bygb.DECLINED) {
                                    bygb a7 = bygb.m124774a(bxzx.f165204f);
                                    if (a7 == null) {
                                        a7 = bygb.UNRECOGNIZED;
                                    }
                                    if (a7 != bygb.REVOKED) {
                                        bygb a8 = bygb.m124774a(bxzx.f165204f);
                                        if (a8 == null) {
                                            a8 = bygb.UNRECOGNIZED;
                                        }
                                        if (a8 == bygb.NOT_ASKED) {
                                            z = true;
                                            if (!cfmj.m140161j() && bxzx != null) {
                                                bygb a9 = bygb.m124774a(bxzx.f165204f);
                                                if (a9 == null) {
                                                    a9 = bygb.UNRECOGNIZED;
                                                }
                                            }
                                            ((bnsl) agqz.f66303d.mo68390d()).mo68405a("Received a notification while consent is revoked or declined");
                                            a2.mo35998a(agqz.m54895b(bwbv), boox.GCM_MESSAGE_NOT_CONSENTED, "MDP_Notification", bygd.GCM_MESSAGE_NOT_CONSENTED);
                                            return;
                                        }
                                    }
                                }
                                z = true;
                                if (!cfmj.m140161j()) {
                                }
                            }
                            z = false;
                            if (!cfmj.m140161j()) {
                            }
                        }
                    }
                }
                if (cfmd.f184339a.mo6606a().mo81456h()) {
                    bszx a10 = bszx.m116352a(bwbv.f158782d);
                    if (a10 == null) {
                        a10 = bszx.UNRECOGNIZED;
                    }
                    if (a10 == bszx.GCORE_MSG_TYPE_HIDDEN) {
                        agqz.f66303d.mo26019b(agyt.m55307c()).mo68405a("Received a GCM message with type HIDDEN.");
                        a2.mo35998a(bwbv, boox.GCM_MESSAGE_HIDDEN, "MDP_Notification", bygd.GCM_MESSAGE_HIDDEN);
                        if (cfmj.m140157f() && agrn != null) {
                            if (agrn.mo36017a()) {
                                a2.mo35998a(agqz.m54895b(bwbv), boox.GCM_MESSAGE_HIDDEN_NOTIFICATION_HANDLED_SUCCESSFULLY, "MDP_Notification", bygd.GCM_MESSAGE_HIDDEN_NOTIFICATION_HANDLED_SUCCESSFULLY);
                                return;
                            } else {
                                a2.mo35998a(agqz.m54895b(bwbv), boox.GCM_MESSAGE_ERROR_HANDLING_HIDDEN_NOTIFICATION, "MDP_Notification", bygd.GCM_MESSAGE_ERROR_HANDLING_HIDDEN_NOTIFICATION);
                                return;
                            }
                        }
                        if (bwbu.m121732a(bwbv.f158779a) != bwbu.MSG_UPSELL_OFFER) {
                            if (bwbv.f158779a == 3) {
                                bwbz = (bwbz) bwbv.f158780b;
                            } else {
                                bwbz = bwbz.f158798d;
                            }
                            agqu agqu = a.f66306b;
                            btbm btbm = bwbz.f158800a;
                            if (btbm == null) {
                                btbm = btbm.f148158h;
                            }
                            MdpUpsellOfferResponse a11 = agsc.m55040a(btbm);
                            if (agqg.m54834A().booleanValue()) {
                                synchronized (agqu.f66286a) {
                                    agqu.mo35955a();
                                    for (String str : (Set) agqu.f66288b.get(agnt.m54672a(2))) {
                                        agqt agqt = agqu.f66290e;
                                        agqt.m54882a(agqu.f66289c, str).mo35960a(a11);
                                    }
                                }
                                return;
                            }
                            return;
                        } else if (bwbu.m121732a(bwbv.f158779a) == bwbu.MSG_PLAN_STATUS_UPDATE) {
                            if (bwbv.f158779a == 2) {
                                bwby = (bwby) bwbv.f158780b;
                            } else {
                                bwby = bwby.f158793d;
                            }
                            btag btag = bwby.f158795a;
                            if (btag == null) {
                                btag = btag.f147963j;
                            }
                            if (btag.f147966b.size() != 0) {
                                MdpDataPlanStatusResponse a12 = agsc.m55039a(btag, agqe.m54828a().mo35931a(btag.f147965a, "AIzaSyAxmTFlJLw9-uEJ1pFJUzw8LX7veGxGUoI"), new Bundle());
                                if (cfmd.f184339a.mo6606a().mo81450b()) {
                                    btag btag2 = bwby.f158795a;
                                    if (btag2 == null) {
                                        btag2 = btag.f147963j;
                                    }
                                    int i4 = btag2.f147973i;
                                    char c = i4 != 0 ? i4 != 1 ? i4 != 2 ? (char) 0 : 4 : 3 : 2;
                                    if (c == 0 || c != 4) {
                                        if (bwby.f158796b != null) {
                                            agor agor = new agor(a12);
                                            bxyk bxyk = bwby.f158796b;
                                            if (bxyk == null) {
                                                bxyk = bxyk.f165095c;
                                            }
                                            agor.mo35801a(bxyk);
                                            a12 = agor.mo35800a();
                                        }
                                        agpk.m54726a().mo35834a(btag.f147965a, a12);
                                    }
                                }
                                agqu agqu2 = a.f66306b;
                                if (agqg.m54834A().booleanValue()) {
                                    synchronized (agqu.f66286a) {
                                        agqu2.mo35955a();
                                        for (String str2 : (Set) agqu2.f66288b.get(agnt.m54672a(1))) {
                                            agqt agqt2 = agqu2.f66290e;
                                            agqt.m54882a(agqu2.f66289c, str2).mo35959a(a12);
                                        }
                                    }
                                }
                                a.f66307c.mo36192a(a12);
                                return;
                            }
                            return;
                        } else {
                            return;
                        }
                    }
                }
                a.f66305a.mo36030b(bwbv);
                if (bwbu.m121732a(bwbv.f158779a) != bwbu.MSG_UPSELL_OFFER) {
                }
            } catch (bxwf e) {
                bnsl bnsl = (bnsl) agqz.f66303d.mo68388c();
                bnsl.mo68437a(e);
                bnsl.mo68405a("Cannot parse GTAF's GCM message from proto.");
                a2.mo35998a((bwbv) null, boox.GCM_MESSAGE_PARSE_ERROR, "MDP_Notification", bygd.GCM_MESSAGE_ERROR_PARSE);
            }
        } catch (IllegalArgumentException e2) {
            bnsl bnsl2 = (bnsl) agqz.f66303d.mo68388c();
            bnsl2.mo68437a(e2);
            bnsl2.mo68405a("Cannot parse GTAF's GCM message from raw.");
            a2.mo35998a((bwbv) null, boox.GCM_MESSAGE_PARSE_ERROR, "MDP_Notification", bygd.GCM_MESSAGE_ERROR_PARSE);
        }
    }
}
