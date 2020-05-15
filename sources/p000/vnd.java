package p000;

import android.content.DialogInterface;

/* renamed from: vnd */
final /* synthetic */ class vnd implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final vnf f49572a;

    public vnd(vnf vnf) {
        this.f49572a = vnf;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        vnf vnf = this.f49572a;
        ((vne) vnf.getActivity()).mo18326a(vnf.f49573a, vnf.f49574b[i]);
        dialogInterface.dismiss();
    }
}
