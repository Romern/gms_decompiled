package p000;

import android.app.Notification;
import android.content.Context;
import android.content.res.Resources;
import android.widget.LinearLayout;
import android.widget.RemoteViews;
import com.felicanetworks.mfc.C0126R;
import com.google.android.libraries.bluetooth.fastpair.HeadsetPiece;
import com.google.android.libraries.bluetooth.fastpair.TrueWirelessHeadset;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: ahwt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahwt extends aicx {

    /* renamed from: G */
    public final RemoteViews f68257G;

    /* renamed from: H */
    public final Context f68258H;

    public ahwt(Context context) {
        super(context);
        this.f68258H = context;
        this.f68257G = ahvk.m56726a(context, (int) C0126R.C0128layout.fast_pair_battery_notification);
    }

    /* renamed from: a */
    public static String m56805a(Context context, TrueWirelessHeadset trueWirelessHeadset) {
        return busl.m120387a(trueWirelessHeadset, new ahwo(context, trueWirelessHeadset), new ahwp(context, trueWirelessHeadset), new ahwq(context, trueWirelessHeadset));
    }

    /* renamed from: b */
    public final Notification mo13629b() {
        boolean z = true;
        if (cfoj.m141558h()) {
            try {
                RemoteViews remoteViews = this.f68257G;
                Context context = this.f68258H;
                remoteViews.apply(context, new LinearLayout(context));
            } catch (Resources.NotFoundException e) {
                bnsl bnsl = (bnsl) ahsd.f67925a.mo68388c();
                bnsl.mo68437a(e);
                bnsl.mo68405a("Failed to build notification, not setting custom view.");
                z = false;
            }
        }
        RemoteViews remoteViews2 = this.f68257G;
        if (remoteViews2 != null && z) {
            this.f22274z = remoteViews2;
        }
        return super.mo13629b();
    }

    /* renamed from: a */
    public final void mo37243a(HeadsetPiece headsetPiece, AtomicInteger atomicInteger, ahwl ahwl) {
        RemoteViews a = ahvk.m56726a(this.f68258H, (int) C0126R.C0128layout.fast_pair_battery_notification_child_value);
        if (this.f68257G == null) {
            srn srn = ahsd.f67925a;
            mo37244a(atomicInteger, ahwl);
        } else if (a == null) {
            srn srn2 = ahsd.f67925a;
            mo37244a(atomicInteger, ahwl);
        } else if (headsetPiece.mo60341b() == -1) {
            srn srn3 = ahsd.f67925a;
            mo37244a(atomicInteger, ahwl);
        } else {
            int b = headsetPiece.mo60341b();
            StringBuilder sb = new StringBuilder(12);
            sb.append(b);
            sb.append("%");
            a.setTextViewText(16908290, sb.toString());
            a.setInt(16908295, "setColorFilter", this.f68258H.getResources().getColor(!headsetPiece.mo60359g() ? C0126R.color.fast_pair_battery_level_normal : C0126R.color.fast_pair_battery_level_low));
            a.setImageViewResource(16908295, headsetPiece.mo60343d() ? headsetPiece.mo60341b() > 20 ? headsetPiece.mo60341b() > 40 ? headsetPiece.mo60341b() > 60 ? headsetPiece.mo60341b() >= 100 ? C0126R.C0127drawable.quantum_ic_battery_charging_full_vd_theme_24 : C0126R.C0127drawable.quantum_ic_battery_charging_80_vd_theme_24 : C0126R.C0127drawable.quantum_ic_battery_charging_60_vd_theme_24 : C0126R.C0127drawable.quantum_ic_battery_charging_30_vd_theme_24 : C0126R.C0127drawable.quantum_ic_battery_charging_20_vd_theme_24 : headsetPiece.mo60341b() > headsetPiece.mo60340a() ? headsetPiece.mo60341b() > 20 ? headsetPiece.mo60341b() > 40 ? headsetPiece.mo60341b() > 60 ? headsetPiece.mo60341b() >= 100 ? C0126R.C0127drawable.quantum_ic_battery_full_vd_theme_24 : C0126R.C0127drawable.quantum_ic_battery_80_vd_theme_24 : C0126R.C0127drawable.quantum_ic_battery_60_vd_theme_24 : C0126R.C0127drawable.quantum_ic_battery_30_vd_theme_24 : C0126R.C0127drawable.quantum_ic_battery_20_vd_theme_24 : C0126R.C0127drawable.quantum_ic_battery_alert_vd_theme_24);
            this.f68257G.addView(16908290, a);
            ((bnsl) ahsd.f67925a.mo68390d()).mo68420a("start to download the image of battery notification.Latch count %s", "invalid");
            snp.m35704b(9).execute(new ahwr(this, headsetPiece, a, atomicInteger, ahwl));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a5, code lost:
        return;
     */
    /* renamed from: a */
    public final void mo37244a(AtomicInteger atomicInteger, ahwl ahwl) {
        long j;
        long j2;
        if (atomicInteger.decrementAndGet() == 0) {
            srn srn = ahsd.f67925a;
            ahwm ahwm = ahwl.f68234a;
            TrueWirelessHeadset trueWirelessHeadset = ahwl.f68235b;
            synchronized (ahwm) {
                if (ahwm.f68242f != null) {
                    ((ahgp) ahgz.m55754a(ahwm.f68238b, ahgp.class)).mo36450a(ahwm.f68236a, mo13629b());
                    if (cfom.m141867b()) {
                        ahsi ahsi = ahwm.f68239c;
                        bvin bvin = (trueWirelessHeadset.mo60347b().mo60359g() || trueWirelessHeadset.mo60348c().mo60359g() || trueWirelessHeadset.mo60349d().mo60359g()) ? bvin.FAST_PAIR_LOW_BATTERY_NOTIFICATION_SHOWN : bvin.FAST_PAIR_BATTERY_NOTIFICATION_SHOWN;
                        String f = trueWirelessHeadset.mo60351f();
                        String str = ahwm.f68242f;
                        if (trueWirelessHeadset.mo60352g() != -1) {
                            j2 = ahwm.f68240d.mo20505a() - trueWirelessHeadset.mo60352g();
                        } else {
                            j2 = -1;
                        }
                        ahsi.mo37020a(bvin, f, str, j2, trueWirelessHeadset.mo60365j());
                    } else {
                        ahsi ahsi2 = ahwm.f68239c;
                        bvin bvin2 = bvin.FAST_PAIR_BATTERY_NOTIFICATION_SHOWN;
                        String f2 = trueWirelessHeadset.mo60351f();
                        String str2 = ahwm.f68242f;
                        if (trueWirelessHeadset.mo60352g() != -1) {
                            j = ahwm.f68240d.mo20505a() - trueWirelessHeadset.mo60352g();
                        } else {
                            j = -1;
                        }
                        ahsi2.mo37020a(bvin2, f2, str2, j, trueWirelessHeadset.mo60365j());
                    }
                }
            }
        } else {
            srn srn2 = ahsd.f67925a;
            atomicInteger.get();
        }
    }
}
