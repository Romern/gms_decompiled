package p000;

import android.app.PendingIntent;
import android.content.Intent;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.nearby.sharing.ModuleInitializer;
import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: ajjg */
final /* synthetic */ class ajjg implements Runnable {

    /* renamed from: a */
    private final NearbySharingChimeraService f70744a;

    /* renamed from: b */
    private final int f70745b;

    /* renamed from: c */
    private final int f70746c;

    /* renamed from: d */
    private final ajwm f70747d;

    public ajjg(NearbySharingChimeraService nearbySharingChimeraService, int i, int i2, ajwm ajwm) {
        this.f70744a = nearbySharingChimeraService;
        this.f70745b = i;
        this.f70746c = i2;
        this.f70747d = ajwm;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.Intent.putExtra(java.lang.String, int):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, int[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Bundle):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.io.Serializable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent} */
    public final void run() {
        NearbySharingChimeraService nearbySharingChimeraService = this.f70744a;
        int i = this.f70745b;
        int i2 = this.f70746c;
        ajwm ajwm = this.f70747d;
        if (i == 0 && nearbySharingChimeraService.mo44456u()) {
            srn srn = ajvp.f71371a;
            boolean z = false;
            if (!ajwm.CLOSE.equals(ajwm) || i2 != 0) {
                nearbySharingChimeraService.f80904p.mo38809a();
            } else if (!cfov.f185185a.mo6606a().mo82275K() || !ModuleInitializer.m67469b(nearbySharingChimeraService)) {
                ajna ajna = nearbySharingChimeraService.f80904p;
                boolean j = nearbySharingChimeraService.mo44445j();
                boolean k = nearbySharingChimeraService.mo44446k();
                if (cfov.f185185a.mo6606a().mo82319ab()) {
                    ajwp ajwp = ajna.f70954c;
                    if (ajwp.f71451a.mo20505a() - ajwp.mo39010c().getLong("most_recent_notification_dismissed_timestamp", 0) < cfov.m142072y()) {
                        bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
                        bnsl.mo68432a("ajwp", "a", 45, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl.mo68405a("Not showing fast init notifications: the user recently dismissed the notification.");
                    } else if (j ? k : !ajwp.mo39010c().getBoolean("dont_show_notification_again", false)) {
                        ahgl ahgl = new ahgl(ajna.f70952a, "nearby_sharing_alert");
                        ahgl.mo36442i();
                        ahgl.mo36429b(akia.m59783b(C1133kh.m17836a(ajna.f70952a, (int) C0126R.C0127drawable.sharing_ic_launcher)));
                        ahgl.mo36440g(ajna.f70952a.getString(C0126R.string.sharing_notification_onboarding_title));
                        ahgl.mo36438f(ajna.f70952a.getText(C0126R.string.sharing_notification_onboarding_description));
                        Intent addFlags = new Intent().setClassName(ajna.f70952a, "com.google.android.gms.nearby.sharing.InternalReceiveSurfaceActivity").addFlags(268435456).addFlags(AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT);
                        addFlags.putExtra("is_from_fast_init", true);
                        ahgl.f22254f = PendingIntent.getActivity(ajna.f70952a, 1001, addFlags, 134217728);
                        ahgl.mo36439g();
                        ahgl.f22258j = 2;
                        ahgl.f22269u = "msg";
                        ahgl.mo36434d(PendingIntent.getBroadcast(ajna.f70952a, 1006, new Intent("com.google.android.gms.nearby.sharing.ACTION_DISMISS").setPackage(ajna.f70952a.getPackageName()).putExtra("channel_id", "nearby_sharing_alert"), 134217728));
                        ahgl.f22259k = false;
                        ahgl.mo36437f();
                        ahgl.mo36435d(true);
                        ahgl.f22271w = akim.m59827a(ajna.f70952a);
                        ahgl.f22266r = "nearby_sharing";
                        ahgl.mo36427a(ajna.f70952a.getString(C0126R.string.sharing_product_name));
                        ajna.mo38810a(ahgl);
                        ajna.mo38814a("nearby_sharing", 3, ahgl.mo13629b());
                    }
                    ((bnsl) ajvp.f71371a.mo68390d()).mo68405a("Not showing heads up notification: notifications are currently blacklisted by the user.");
                }
                ajvg ajvg = nearbySharingChimeraService.f80906r;
                bxvd d = ajvh.m59107d(11);
                bvfo bvfo = bvfo.f155896a;
                if (d.f164950c) {
                    d.mo74035c();
                    d.f164950c = false;
                }
                bvgd bvgd = (bvgd) d.f164949b;
                bvgd bvgd2 = bvgd.f155960B;
                bvfo.getClass();
                bvgd.f155975l = bvfo;
                bvgd.f155964a |= 2048;
                ajvg.mo38956a(new ajuz((bvgd) d.mo74062i()));
            }
            if (ajwm.CLOSE == ajwm || ajwm.FAR == ajwm) {
                z = true;
            }
            nearbySharingChimeraService.f80902n = z;
            nearbySharingChimeraService.mo44444i();
        }
    }
}
