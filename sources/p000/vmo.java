package p000;

import android.view.View;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.DriveId;

/* renamed from: vmo */
final /* synthetic */ class vmo implements View.OnClickListener {

    /* renamed from: a */
    private final vmy f49529a;

    public vmo(vmy vmy) {
        this.f49529a = vmy;
    }

    public void onClick(View view) {
        vmy vmy = this.f49529a;
        int id = view.getId();
        boolean z = true;
        if (id == C0126R.C0129id.drive_button_bar_button_right) {
            DriveId driveId = vmy.f49553i.f31200c;
            if (driveId == null) {
                z = false;
            }
            sdo.m34970a(z);
            if (vmy.f49550f) {
                try {
                    Long valueOf = Long.valueOf(Long.parseLong(vmy.f49549e));
                    Scope scope = twn.f46755a;
                    rkb rkb = vmy.f49551g;
                    long longValue = valueOf.longValue();
                    if (longValue == 0) {
                        throw new IllegalArgumentException("projectNumber must be provided and nonzero.");
                    } else if (driveId != null) {
                        rkb.mo24795b(new uso(rkb, longValue, driveId)).mo9458a(vmy.f49548d);
                    } else {
                        throw new IllegalArgumentException("driveId must be provided.");
                    }
                } catch (NumberFormatException e) {
                    vmy.f49548d.mo9454a(new Status(8, "Unable to authorize the app with non-numeric sdkAppId."));
                }
            } else {
                vmy.mo28651a(driveId);
            }
        } else if (id != C0126R.C0129id.drive_button_bar_button_left) {
            vmy.f49539a.mo25374b("SelectFileFragment", "Unknown view clicked: %s, %s.", Integer.valueOf(view.getId()), view);
        } else {
            vmy.getActivity().setResult(0);
            vmy.getActivity().finish();
            vmy.mo28650a(1);
        }
    }
}
