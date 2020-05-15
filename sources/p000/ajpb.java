package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.TransferMetadata;

/* renamed from: ajpb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajpb implements ajud, ajsn {

    /* renamed from: a */
    private final ajna f71082a;

    public ajpb(ajna ajna) {
        this.f71082a = ajna;
    }

    /* renamed from: a */
    public final void mo38707a(ShareTarget shareTarget) {
    }

    /* renamed from: a */
    public final void mo38708a(ShareTarget shareTarget, int i) {
    }

    /* renamed from: b */
    public final void mo38709b(ShareTarget shareTarget) {
    }

    /* renamed from: a */
    public final void mo38711a(ShareTarget shareTarget, TransferMetadata transferMetadata) {
        ShareTarget shareTarget2 = shareTarget;
        TransferMetadata transferMetadata2 = transferMetadata;
        switch (transferMetadata2.f81052a) {
            case 1:
                ajna ajna = this.f71082a;
                int a = ajna.m58859a(2, shareTarget2);
                ahgl ahgl = new ahgl(ajna.f70952a, "nearby_sharing_file");
                ahgl.mo36442i();
                ahgl.mo36429b(akia.m59783b(new ajwv(ajna.f70952a, shareTarget2)));
                ahgl.mo36440g(shareTarget2.f81029b);
                ahgl.mo36438f(ajna.f70952a.getText(C0126R.string.sharing_notification_outgoing_connecting_description));
                ahgl.f22254f = ajna.mo38819c(shareTarget2, transferMetadata2);
                ahgl.mo36439g();
                ahgl.f22258j = 2;
                ahgl.f22269u = "msg";
                ahgl.mo36441h();
                ahgl.mo13618a(C0126R.C0127drawable.quantum_gm_ic_clear_vd_theme_24, ajna.f70952a.getText(C0126R.string.sharing_action_cancel), PendingIntent.getBroadcast(ajna.f70952a, ajna.m58859a(1007, shareTarget2), new Intent("com.google.android.gms.nearby.sharing.ACTION_CANCEL").setPackage(ajna.f70952a.getPackageName()).putExtra("share_target_bytes", sef.m35074a(shareTarget)).putExtra("notification_id", a), 134217728));
                ahgl.f22271w = akim.m59827a(ajna.f70952a);
                ahgl.f22266r = "nearby_sharing";
                ahgl.mo36427a(ajna.f70952a.getString(C0126R.string.sharing_product_name));
                ajna.mo38820c(shareTarget2);
                ahgl.mo36436e();
                ajna.mo38810a(ahgl);
                ajna.mo38814a("nearby_sharing", a, ahgl.mo13629b());
                return;
            case 2:
                ajna ajna2 = this.f71082a;
                int a2 = ajna.m58859a(2, shareTarget2);
                ahgl ahgl2 = new ahgl(ajna2.f70952a, "nearby_sharing_file");
                ahgl2.mo36431b(new C1101jd());
                ahgl2.mo36442i();
                ahgl2.mo36429b(akia.m59783b(new ajwv(ajna2.f70952a, shareTarget2)));
                ahgl2.mo36440g(shareTarget2.f81029b);
                ahgl2.f22254f = ajna2.mo38819c(shareTarget2, transferMetadata2);
                ahgl2.mo36438f(akip.m59839a(ajna2.f70952a, transferMetadata2.f81054c));
                ahgl2.mo36439g();
                ahgl2.f22258j = 2;
                ahgl2.f22269u = "msg";
                ahgl2.mo36441h();
                ahgl2.mo36435d(true);
                ahgl2.mo13618a(C0126R.C0127drawable.quantum_gm_ic_clear_vd_theme_24, ajna2.f70952a.getText(C0126R.string.sharing_action_cancel), PendingIntent.getBroadcast(ajna2.f70952a, ajna.m58859a(1007, shareTarget2), new Intent("com.google.android.gms.nearby.sharing.ACTION_CANCEL").setPackage(ajna2.f70952a.getPackageName()).putExtra("share_target_bytes", sef.m35074a(shareTarget)).putExtra("notification_id", a2), 134217728));
                if (!bmxx.m108577a(transferMetadata2.f81054c)) {
                    ahgl2.mo13618a(C0126R.C0127drawable.quantum_gm_ic_done_vd_theme_24, ajna2.f70952a.getText(C0126R.string.sharing_action_send), PendingIntent.getBroadcast(ajna2.f70952a, ajna.m58859a(1002, shareTarget2), new Intent("com.google.android.gms.nearby.sharing.ACTION_ACCEPT").setPackage(ajna2.f70952a.getPackageName()).putExtra("share_target_bytes", sef.m35074a(shareTarget)).putExtra("notification_id", a2), 134217728));
                }
                ahgl2.f22271w = akim.m59827a(ajna2.f70952a);
                ahgl2.f22266r = "nearby_sharing";
                ahgl2.mo36427a(ajna2.f70952a.getString(C0126R.string.sharing_product_name));
                ajna2.mo38820c(shareTarget2);
                ahgl2.mo36436e();
                ajna2.mo38810a(ahgl2);
                ajna2.mo38814a("nearby_sharing", a2, ahgl2.mo13629b());
                return;
            case 3:
                ajna ajna3 = this.f71082a;
                int a3 = ajna.m58859a(2, shareTarget2);
                ahgl ahgl3 = new ahgl(ajna3.f70952a, "nearby_sharing_file");
                ahgl3.mo36431b(new C1101jd());
                ahgl3.mo36442i();
                ahgl3.mo36429b(akia.m59783b(new ajwv(ajna3.f70952a, shareTarget2)));
                ahgl3.mo36440g(shareTarget2.f81029b);
                ahgl3.f22254f = ajna3.mo38819c(shareTarget2, transferMetadata2);
                ahgl3.mo36438f(akip.m59839a(ajna3.f70952a, transferMetadata2.f81054c));
                ahgl3.mo36439g();
                ahgl3.f22258j = 2;
                ahgl3.f22269u = "msg";
                ahgl3.mo36441h();
                ahgl3.mo36435d(true);
                ahgl3.mo13618a(C0126R.C0127drawable.quantum_gm_ic_clear_vd_theme_24, ajna3.f70952a.getText(C0126R.string.sharing_action_cancel), PendingIntent.getBroadcast(ajna3.f70952a, ajna.m58859a(1007, shareTarget2), new Intent("com.google.android.gms.nearby.sharing.ACTION_CANCEL").setPackage(ajna3.f70952a.getPackageName()).putExtra("share_target_bytes", sef.m35074a(shareTarget)).putExtra("notification_id", a3), 134217728));
                ahgl3.f22271w = akim.m59827a(ajna3.f70952a);
                ahgl3.f22266r = "nearby_sharing";
                ahgl3.mo36427a(ajna3.f70952a.getString(C0126R.string.sharing_product_name));
                ajna3.mo38820c(shareTarget2);
                ahgl3.mo36436e();
                ajna3.mo38810a(ahgl3);
                ajna3.mo38814a("nearby_sharing", a3, ahgl3.mo13629b());
                return;
            case 4:
            case 8:
            case 9:
            case 15:
                this.f71082a.mo38818b(shareTarget2);
                return;
            case 5:
                ajna ajna4 = this.f71082a;
                int a4 = ajna.m58859a(2, shareTarget2);
                ahgl ahgl4 = new ahgl(ajna4.f70952a, "nearby_sharing_file");
                ahgl4.mo36442i();
                ahgl4.mo36429b(akia.m59783b(new ajwv(ajna4.f70952a, shareTarget2)));
                ahgl4.mo36440g(shareTarget2.f81029b);
                Context context = ajna4.f70952a;
                int a5 = akip.m59836a(shareTarget);
                int size = shareTarget.mo44499b().size();
                C1416ut utVar = (C1416ut) context;
                String quantityString = utVar.mo16091a().getQuantityString(a5, size);
                ahgl4.mo36438f(utVar.mo16091a().getString(C0126R.string.sharing_notification_outgoing_in_progress_file, Integer.valueOf(size), quantityString));
                ahgl4.f22254f = ajna4.mo38819c(shareTarget2, transferMetadata2);
                ahgl4.mo36434d(PendingIntent.getBroadcast(ajna4.f70952a, ajna.m58859a(1006, shareTarget2), new Intent("com.google.android.gms.nearby.sharing.ACTION_DISMISS").setPackage(ajna4.f70952a.getPackageName()).putExtra("share_target_bytes", sef.m35074a(shareTarget)).putExtra("notification_id", a4), 134217728));
                ahgl4.mo36439g();
                ahgl4.f22258j = 2;
                ahgl4.f22269u = "msg";
                ahgl4.mo13618a(C0126R.C0127drawable.quantum_gm_ic_clear_vd_theme_24, ajna4.f70952a.getText(C0126R.string.sharing_action_cancel), PendingIntent.getBroadcast(ajna4.f70952a, ajna.m58859a(1007, shareTarget2), new Intent("com.google.android.gms.nearby.sharing.ACTION_CANCEL").setPackage(ajna4.f70952a.getPackageName()).putExtra("share_target_bytes", sef.m35074a(shareTarget)).putExtra("notification_id", a4), 134217728));
                ahgl4.f22271w = akim.m59827a(ajna4.f70952a);
                ahgl4.mo36433c((int) (transferMetadata2.f81053b * 100.0f));
                ahgl4.mo36441h();
                ahgl4.mo36435d(true);
                ahgl4.f22266r = "nearby_sharing";
                ahgl4.mo36427a(ajna4.f70952a.getString(C0126R.string.sharing_product_name));
                ajna4.mo38820c(shareTarget2);
                ahgl4.mo36436e();
                ajna4.mo38810a(ahgl4);
                ajna4.mo38814a("nearby_sharing", a4, ahgl4.mo13629b());
                return;
            case 6:
                ajna ajna5 = this.f71082a;
                int a6 = ajna.m58859a(2, shareTarget2);
                ahgl ahgl5 = new ahgl(ajna5.f70952a, "nearby_sharing_file");
                ahgl5.mo36442i();
                ahgl5.mo36429b(akia.m59783b(new ajwv(ajna5.f70952a, shareTarget2)));
                ahgl5.mo36440g(shareTarget2.f81029b);
                Context context2 = ajna5.f70952a;
                int a7 = akip.m59836a(shareTarget);
                int size2 = shareTarget.mo44499b().size();
                C1416ut utVar2 = (C1416ut) context2;
                String quantityString2 = utVar2.mo16091a().getQuantityString(a7, size2);
                ahgl5.mo36438f(utVar2.mo16091a().getString(C0126R.string.sharing_notification_outgoing_complete_file, Integer.valueOf(size2), quantityString2));
                ahgl5.f22254f = ajna5.mo38819c(shareTarget2, transferMetadata2);
                ahgl5.mo36439g();
                ahgl5.f22258j = 2;
                ahgl5.f22269u = "msg";
                ahgl5.f22271w = akim.m59827a(ajna5.f70952a);
                ahgl5.mo36435d(true);
                ahgl5.f22266r = "nearby_sharing";
                ahgl5.mo36427a(ajna5.f70952a.getString(C0126R.string.sharing_product_name));
                ajna5.mo38820c(shareTarget2);
                ahgl5.mo36436e();
                ajna5.mo38810a(ahgl5);
                ajna5.mo38814a("nearby_sharing", a6, ahgl5.mo13629b());
                ajna5.mo38817b(a6, shareTarget2);
                return;
            case 7:
            case 10:
            case 13:
            case 14:
                ajna ajna6 = this.f71082a;
                int a8 = ajna.m58859a(2, shareTarget2);
                ahgl ahgl6 = new ahgl(ajna6.f70952a, "nearby_sharing_file");
                ahgl6.mo36442i();
                ahgl6.mo36429b(akia.m59783b(new ajwv(ajna6.f70952a, shareTarget2)));
                ahgl6.mo36440g(shareTarget2.f81029b);
                ahgl6.mo36438f(ajna6.f70952a.getString(C0126R.string.sharing_notification_outgoing_failed_description));
                ahgl6.f22254f = ajna6.mo38819c(shareTarget2, transferMetadata2);
                ahgl6.mo36434d(PendingIntent.getBroadcast(ajna6.f70952a, ajna.m58859a(1006, shareTarget2), new Intent("com.google.android.gms.nearby.sharing.ACTION_DISMISS").setPackage(ajna6.f70952a.getPackageName()).putExtra("share_target_bytes", sef.m35074a(shareTarget)).putExtra("notification_id", a8), 134217728));
                ahgl6.mo36439g();
                ahgl6.f22258j = 2;
                ahgl6.f22269u = "msg";
                ahgl6.f22271w = akim.m59827a(ajna6.f70952a);
                ahgl6.mo36435d(true);
                ahgl6.f22266r = "nearby_sharing";
                ahgl6.mo36427a(ajna6.f70952a.getString(C0126R.string.sharing_product_name));
                ajna6.mo38820c(shareTarget2);
                ahgl6.mo36436e();
                ajna6.mo38810a(ahgl6);
                ajna6.mo38814a("nearby_sharing", a8, ahgl6.mo13629b());
                ajna6.mo38817b(a8, shareTarget2);
                return;
            case 11:
            case 12:
            default:
                if (cfov.m142056i() && transferMetadata2.f81056e) {
                    this.f71082a.mo38812a(shareTarget2, transferMetadata2);
                    return;
                }
                return;
        }
    }
}
