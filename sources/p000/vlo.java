package p000;

import android.view.View;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.drive.p039ui.select.SelectFileChimeraActivity;

/* renamed from: vlo */
final /* synthetic */ class vlo implements View.OnClickListener {

    /* renamed from: a */
    private final vlr f49454a;

    public vlo(vlr vlr) {
        this.f49454a = vlr;
    }

    public void onClick(View view) {
        vlr vlr = this.f49454a;
        vml a = SelectFileChimeraActivity.m23085a(vlr.getActivity(), vlr.f49462f, vlr.f49463g, vlr.f49464h);
        a.mo28639a(vfu.m40352a(vgc.f49218b, "application/vnd.google-apps.folder"));
        a.mo28638a(vlr.f49458b);
        a.mo28640a(vlr.getString(C0126R.string.drive_create_file_pick_folder_dialog_title));
        a.mo28641a(false);
        vlr.startActivityForResult(a.f49526a, 0);
    }
}
