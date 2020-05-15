package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.TransferMetadata;

/* renamed from: ajpa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajpa implements ajud {

    /* renamed from: a */
    private final ajna f71081a;

    public ajpa(ajna ajna) {
        this.f71081a = ajna;
    }

    /* renamed from: a */
    public final void mo38711a(ShareTarget shareTarget, TransferMetadata transferMetadata) {
        CharSequence charSequence;
        ShareTarget shareTarget2 = shareTarget;
        TransferMetadata transferMetadata2 = transferMetadata;
        switch (transferMetadata2.f81052a) {
            case 2:
                this.f71081a.mo38813a(shareTarget2, transferMetadata2, transferMetadata2.f81055d);
                return;
            case 3:
                ajna ajna = this.f71081a;
                if (TextUtils.isEmpty(transferMetadata2.f81054c)) {
                    charSequence = akip.m59837a(ajna.f70952a, shareTarget2);
                } else {
                    charSequence = akip.m59838a(ajna.f70952a, shareTarget2, transferMetadata2.f81054c);
                }
                int a = ajna.m58859a(1, shareTarget2);
                ahgl ahgl = new ahgl(ajna.f70952a, "nearby_sharing_file");
                ahgl.mo36431b(new C1101jd());
                ahgl.mo36442i();
                ahgl.mo36429b(akia.m59783b(new ajwv(ajna.f70952a, shareTarget2)));
                ahgl.mo36440g(shareTarget2.f81029b);
                ahgl.mo36438f(charSequence);
                ahgl.f22254f = ajna.mo38815b(shareTarget2, transferMetadata2);
                ahgl.mo36434d(PendingIntent.getBroadcast(ajna.f70952a, ajna.m58859a(1006, shareTarget2), new Intent("com.google.android.gms.nearby.sharing.ACTION_DISMISS").setPackage(ajna.f70952a.getPackageName()).putExtra("share_target_bytes", sef.m35074a(shareTarget)).putExtra("notification_id", a), 134217728));
                ahgl.mo36439g();
                ahgl.f22258j = 2;
                ahgl.f22269u = "msg";
                ahgl.mo36441h();
                ahgl.mo36435d(true);
                ahgl.mo13618a(C0126R.C0127drawable.quantum_gm_ic_clear_vd_theme_24, ajna.f70952a.getText(C0126R.string.sharing_action_reject), PendingIntent.getBroadcast(ajna.f70952a, ajna.m58859a(1003, shareTarget2), new Intent("com.google.android.gms.nearby.sharing.ACTION_REJECT").setPackage(ajna.f70952a.getPackageName()).putExtra("share_target_bytes", sef.m35074a(shareTarget)).putExtra("notification_id", a), 134217728));
                ahgl.f22271w = akim.m59827a(ajna.f70952a);
                ahgl.f22266r = "nearby_sharing";
                ahgl.mo36427a(ajna.f70952a.getString(C0126R.string.sharing_product_name));
                ajna.mo38820c(shareTarget2);
                ahgl.mo36436e();
                ajna.mo38810a(ahgl);
                ajna.mo38814a("nearby_sharing", a, ahgl.mo13629b());
                return;
            case 4:
            case 8:
            case 9:
            case 15:
                this.f71081a.mo38811a(shareTarget2);
                return;
            case 5:
                ajna ajna2 = this.f71081a;
                int a2 = ajna.m58859a(1, shareTarget2);
                ahgl ahgl2 = new ahgl(ajna2.f70952a, "nearby_sharing_file");
                ahgl2.mo36442i();
                ahgl2.mo36429b(akia.m59783b(new ajwv(ajna2.f70952a, shareTarget2)));
                ahgl2.mo36440g(shareTarget2.f81029b);
                ahgl2.mo36438f(akip.m59837a(ajna2.f70952a, shareTarget2));
                ahgl2.f22254f = ajna2.mo38815b(shareTarget2, transferMetadata2);
                ahgl2.mo36434d(PendingIntent.getBroadcast(ajna2.f70952a, ajna.m58859a(1006, shareTarget2), new Intent("com.google.android.gms.nearby.sharing.ACTION_DISMISS").setPackage(ajna2.f70952a.getPackageName()).putExtra("share_target_bytes", sef.m35074a(shareTarget)).putExtra("notification_id", a2), 134217728));
                ahgl2.mo36439g();
                ahgl2.f22258j = 2;
                ahgl2.f22269u = "msg";
                ahgl2.mo13618a(C0126R.C0127drawable.quantum_gm_ic_clear_vd_theme_24, ajna2.f70952a.getText(C0126R.string.sharing_action_cancel), PendingIntent.getBroadcast(ajna2.f70952a, ajna.m58859a(1004, shareTarget2), new Intent("com.google.android.gms.nearby.sharing.ACTION_CANCEL").setPackage(ajna2.f70952a.getPackageName()).putExtra("share_target_bytes", sef.m35074a(shareTarget)).putExtra("notification_id", a2), 134217728));
                ahgl2.f22271w = akim.m59827a(ajna2.f70952a);
                ahgl2.mo36433c((int) (transferMetadata2.f81053b * 100.0f));
                ahgl2.mo36441h();
                ahgl2.mo36435d(true);
                ahgl2.f22266r = "nearby_sharing";
                ahgl2.mo36427a(ajna2.f70952a.getString(C0126R.string.sharing_product_name));
                ajna2.mo38820c(shareTarget2);
                ahgl2.mo36436e();
                ajna2.mo38810a(ahgl2);
                ajna2.mo38814a("nearby_sharing", a2, ahgl2.mo13629b());
                return;
            case 6:
                ajna ajna3 = this.f71081a;
                int a3 = ajna.m58859a(1, shareTarget2);
                ahgl ahgl3 = new ahgl(ajna3.f70952a, "nearby_sharing_file");
                ahgl3.mo36442i();
                ahgl3.mo36429b(akia.m59783b(new ajwv(ajna3.f70952a, shareTarget2)));
                ahgl3.mo36440g(shareTarget2.f81029b);
                Context context = ajna3.f70952a;
                int a4 = akip.m59836a(shareTarget);
                int size = shareTarget.mo44499b().size();
                C1416ut utVar = (C1416ut) context;
                String quantityString = utVar.mo16091a().getQuantityString(a4, size);
                ahgl3.mo36438f(utVar.mo16091a().getString(C0126R.string.sharing_notification_incoming_complete_file, Integer.valueOf(size), quantityString));
                ahgl3.f22254f = PendingIntent.getBroadcast(ajna3.f70952a, ajna.m58859a(1005, shareTarget2), new Intent("com.google.android.gms.nearby.sharing.ACTION_OPEN").setPackage(ajna3.f70952a.getPackageName()).putExtra("share_target_bytes", sef.m35074a(shareTarget)).putExtra("notification_id", a3), 134217728);
                ahgl3.mo36434d(PendingIntent.getBroadcast(ajna3.f70952a, ajna.m58859a(1006, shareTarget2), new Intent("com.google.android.gms.nearby.sharing.ACTION_DISMISS").setPackage(ajna3.f70952a.getPackageName()).putExtra("share_target_bytes", sef.m35074a(shareTarget)).putExtra("notification_id", a3), 134217728));
                ahgl3.mo36439g();
                ahgl3.f22258j = 2;
                ahgl3.f22269u = "msg";
                ahgl3.f22271w = akim.m59827a(ajna3.f70952a);
                ahgl3.mo36435d(false);
                ahgl3.f22266r = "nearby_sharing";
                ahgl3.mo36427a(ajna3.f70952a.getString(C0126R.string.sharing_product_name));
                ajna3.mo38820c(shareTarget2);
                ahgl3.mo36436e();
                ajna3.mo38810a(ahgl3);
                ajna3.mo38814a("nearby_sharing", a3, ahgl3.mo13629b());
                return;
            case 7:
            case 10:
            case 13:
            case 14:
                this.f71081a.mo38812a(shareTarget2, transferMetadata2);
                return;
            case 11:
            case 12:
            default:
                if (cfov.m142056i() && transferMetadata2.f81056e) {
                    this.f71081a.mo38812a(shareTarget2, transferMetadata2);
                    return;
                }
                return;
        }
    }
}
