package p000;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import com.felicanetworks.mfc.C0126R;

/* renamed from: vls */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class vls implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ vlx f49472a;

    public vls(vlx vlx) {
        this.f49472a = vlx;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.Object, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.Object, java.lang.Object):void */
    public final void onClick(DialogInterface dialogInterface, int i) {
        usx usx;
        vlx vlx = this.f49472a;
        vlx.f49480d = true;
        String obj = vlx.f49478b.getText().toString();
        ProgressDialog show = ProgressDialog.show(vlk.m40825a(vlx.getActivity()), "", vlx.getString(C0126R.string.drive_creating_folder), true);
        txc txc = new txc();
        sdo.checkIfNull((Object) obj, (Object) "Title cannot be null.");
        txc.f46904a.mo18273b(uzm.f48741Q, obj);
        sdo.m34959a((Object) "application/vnd.google-apps.folder");
        txc.f46904a.mo18273b(uzm.f48738N, "application/vnd.google-apps.folder");
        txd txd = new txd(txc.f46904a);
        rkb rkb = ((vlf) vlx.getActivity()).f49436b;
        if (!rkb.mo24805i()) {
            vlx.f49477a.mo25377c("CreateFolderDialogFragm", "Client is not in connected state");
            vlx.mo9306a();
            show.dismiss();
            vlw vlw = vlx.f49479c;
            if (vlw != null) {
                vlw.mo18325a(3, null);
                return;
            }
            return;
        }
        if (vlx.f49481e != null) {
            usx = twn.f46759e.mo26843a(rkb, vlx.f49481e);
        } else {
            usx = twn.f46759e.mo26842a(rkb);
        }
        if (txd.mo26863a() == null || txd.mo26863a().equals("application/vnd.google-apps.folder")) {
            rkb.mo24795b(new usr(usx, rkb, txd)).mo9458a((rkl) new vlv(vlx, show));
            return;
        }
        throw new IllegalArgumentException("The mimetype must be of type application/vnd.google-apps.folder");
    }
}
