package p000;

import com.felicanetworks.mfc.mfi.Card;
import java.util.concurrent.CountDownLatch;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: cijp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cijp extends Thread {

    /* renamed from: a */
    final /* synthetic */ brep f190445a;

    /* renamed from: b */
    final /* synthetic */ JSONObject f190446b;

    /* renamed from: c */
    final /* synthetic */ boolean f190447c;

    /* renamed from: d */
    final /* synthetic */ cijs f190448d;

    /* renamed from: e */
    final /* synthetic */ String f190449e;

    /* renamed from: f */
    final /* synthetic */ String f190450f;

    /* renamed from: g */
    final /* synthetic */ cijs f190451g;

    public cijp(cijs cijs, brep brep, JSONObject jSONObject, boolean z, cijs cijs2, String str, String str2) {
        this.f190451g = cijs;
        this.f190445a = brep;
        this.f190446b = jSONObject;
        this.f190447c = z;
        this.f190448d = cijs2;
        this.f190449e = str;
        this.f190450f = str2;
    }

    public final void run() {
        Integer num = cijs.f190456a;
        try {
            srn srn = atgf.f90279a;
            cikh cikh = new cikh();
            Boolean bool = false;
            JSONObject jSONObject = (JSONObject) this.f190446b.get("dynamicCardData");
            if (this.f190447c) {
                cijx a = cikh.mo86213a(this.f190448d);
                bres bres = a.f190484a;
                if (bres == null || bres.f142689a.mo49933a().equals(cijw.QUICPAY_UNFORMATTED_ERROR.name())) {
                    cijt cijt = (cijt) a.f190485b;
                    if (cijt != null) {
                        if (bres == null) {
                            if (cijt.f190459a == cijs.f190456a.intValue()) {
                                bool = true;
                            } else if (cijt.f190459a == cijs.f190457b.intValue()) {
                                if (!cijt.f190460b) {
                                    cijw cijw = cijw.QUICPAY_DELETE_ERROR;
                                    cijw.f190481g = "canOverride is false";
                                    String valueOf = String.valueOf(cijw);
                                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 67);
                                    sb.append("provisionFelica executeOnlineFelicaOperation#onError called(error:");
                                    sb.append(valueOf);
                                    sb.append(")");
                                    sb.toString();
                                    this.f190445a.mo49931a(new bres(cijw));
                                    return;
                                }
                                String str = this.f190449e;
                                if (str == null) {
                                    cijw cijw2 = cijw.QUICPAY_DELETE_URL_ARGUMENT_ERROR;
                                    cijw2.f190481g = "oneTimeDeleteUrl is null";
                                    String valueOf2 = String.valueOf(cijw2);
                                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 67);
                                    sb2.append("provisionFelica executeOnlineFelicaOperation#onError called(error:");
                                    sb2.append(valueOf2);
                                    sb2.append(")");
                                    sb2.toString();
                                    this.f190445a.mo49931a(new bres(cijw2));
                                    return;
                                }
                                brgl brgl = this.f190451g.f142751d;
                                cikh.f190513b = new cijx();
                                CountDownLatch countDownLatch = new CountDownLatch(1);
                                brgl.mo69519a(str, new cika(cikh, countDownLatch));
                                try {
                                    countDownLatch.await();
                                } catch (InterruptedException e) {
                                    cikh.f190513b.f190484a = new bres(cijw.QUICPAY_UNKNOWN_ERROR);
                                }
                                cijx cijx = cikh.f190513b;
                                bres bres2 = cijx.f190484a;
                                if (bres2 == null) {
                                    brgl brgl2 = this.f190451g.f142751d;
                                    cikh.f190514c = new cijx();
                                    CountDownLatch countDownLatch2 = new CountDownLatch(1);
                                    brgl2.mo69516a(new cikb(cikh, countDownLatch2));
                                    try {
                                        countDownLatch2.await();
                                    } catch (InterruptedException e2) {
                                        cikh.f190514c.f190484a = new bres(cijw.QUICPAY_UNKNOWN_ERROR);
                                    }
                                    cijx cijx2 = cikh.f190514c;
                                    bres bres3 = cijx2.f190484a;
                                    if (bres3 != null) {
                                        String valueOf3 = String.valueOf(bres3.f142689a);
                                        StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 68);
                                        sb3.append("provisionFelica executeOfflineFelicaOperation#onError called(error:");
                                        sb3.append(valueOf3);
                                        sb3.append(")");
                                        sb3.toString();
                                        this.f190445a.mo49931a(cijx2.f190484a);
                                        return;
                                    } else if (!((Boolean) cijx2.f190485b).booleanValue()) {
                                        cijw cijw3 = cijw.QUICPAY_DELETE_ERROR;
                                        cijw3.f190481g = "delete old card failed.";
                                        String valueOf4 = String.valueOf(cijw3);
                                        StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf4).length() + 67);
                                        sb4.append("provisionFelica executeOnlineFelicaOperation#onError called(error:");
                                        sb4.append(valueOf4);
                                        sb4.append(")");
                                        sb4.toString();
                                        this.f190445a.mo49931a(new bres(cijw3));
                                        return;
                                    }
                                } else {
                                    String valueOf5 = String.valueOf(bres2.f142689a);
                                    StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf5).length() + 67);
                                    sb5.append("provisionFelica executeOnlineFelicaOperation#onError called(error:");
                                    sb5.append(valueOf5);
                                    sb5.append(")");
                                    sb5.toString();
                                    this.f190445a.mo49931a(cijx.f190484a);
                                    return;
                                }
                            }
                        }
                    }
                    String valueOf6 = String.valueOf(cijt);
                    String valueOf7 = String.valueOf(bres);
                    StringBuilder sb6 = new StringBuilder(String.valueOf(valueOf6).length() + 53 + String.valueOf(valueOf7).length());
                    sb6.append("provisionFelica#run quicPayCard:");
                    sb6.append(valueOf6);
                    sb6.append(", resultSdkException:");
                    sb6.append(valueOf7);
                    sb6.toString();
                } else {
                    String valueOf8 = String.valueOf(a.f190484a.f142689a);
                    StringBuilder sb7 = new StringBuilder(String.valueOf(valueOf8).length() + 58);
                    sb7.append("provisionFelica readDefaultCardData#onError called(error:");
                    sb7.append(valueOf8);
                    sb7.append(")");
                    sb7.toString();
                    this.f190445a.mo49931a(a.f190484a);
                    return;
                }
            }
            String str2 = this.f190450f;
            brgl brgl3 = this.f190451g.f142751d;
            cikh.f190515d = new cijx();
            CountDownLatch countDownLatch3 = new CountDownLatch(1);
            brgl3.mo69517a(str2, new cikd(cikh, jSONObject, countDownLatch3));
            try {
                countDownLatch3.await();
            } catch (InterruptedException e3) {
                cikh.f190515d.f190484a = new bres(cijw.QUICPAY_UNKNOWN_ERROR);
            }
            cijx cijx3 = cikh.f190515d;
            bres bres4 = cijx3.f190484a;
            if (bres4 != null) {
                String valueOf9 = String.valueOf(bres4.f142689a);
                StringBuilder sb8 = new StringBuilder(String.valueOf(valueOf9).length() + 59);
                sb8.append("provisionFelica executeUserOperation#onError called(error:");
                sb8.append(valueOf9);
                sb8.append(")");
                sb8.toString();
                this.f190445a.mo49931a(cijx3.f190484a);
                return;
            }
            if (bool.booleanValue()) {
                String str3 = this.f190450f;
                brgl brgl4 = this.f190451g.f142751d;
                cikh.f190516e = new cijx();
                CountDownLatch countDownLatch4 = new CountDownLatch(1);
                brgl4.mo69517a(str3, new cikf(cikh, (Card) cijx3.f190485b, countDownLatch4));
                try {
                    countDownLatch4.await();
                } catch (InterruptedException e4) {
                    cikh.f190516e.f190484a = new bres(cijw.QUICPAY_UNKNOWN_ERROR);
                }
                cijx cijx4 = cikh.f190516e;
                if (cijx4.f190484a != null) {
                    cijw cijw4 = cijw.QUICPAY_ENABLE_ERROR;
                    cijw4.f190482h = cijx4.f190484a.f142689a;
                    cijw4.f190483i = ((Card) cijx3.f190485b).getCardInfo().getCid();
                    String valueOf10 = String.valueOf(cijw4);
                    StringBuilder sb9 = new StringBuilder(String.valueOf(valueOf10).length() + 56);
                    sb9.append("provisionFelica executeEnableCard#onError called(error:");
                    sb9.append(valueOf10);
                    sb9.append(")");
                    sb9.toString();
                    this.f190445a.mo49931a(new bres(cijw4));
                    return;
                }
            }
            this.f190445a.mo49932a(((Card) cijx3.f190485b).getCardInfo().getCid());
        } catch (JSONException e5) {
            String valueOf11 = String.valueOf(e5.toString());
            if (valueOf11.length() == 0) {
                new String("JSON error occurred ");
            } else {
                "JSON error occurred ".concat(valueOf11);
            }
            this.f190445a.mo49931a(new bres(cijw.QUICPAY_JSON_ERROR));
        }
    }
}
