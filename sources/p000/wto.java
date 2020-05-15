package p000;

import android.content.DialogInterface;
import android.widget.Button;
import android.widget.EditText;

/* renamed from: wto */
final /* synthetic */ class wto implements DialogInterface.OnShowListener {

    /* renamed from: a */
    private final wts f51307a;

    /* renamed from: b */
    private final C1350sh f51308b;

    /* renamed from: c */
    private final EditText f51309c;

    public wto(wts wts, C1350sh shVar, EditText editText) {
        this.f51307a = wts;
        this.f51308b = shVar;
        this.f51309c = editText;
    }

    public final void onShow(DialogInterface dialogInterface) {
        wts wts = this.f51307a;
        C1350sh shVar = this.f51308b;
        EditText editText = this.f51309c;
        Button a = shVar.mo15913a(-1);
        a.setEnabled(false);
        bnsl bnsl = (bnsl) wtw.f51331a.mo68390d();
        bnsl.mo68432a("wts", "a", 444, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68420a("DeviceDetail: show RenameDialog for device %s", wts.f51316c);
        editText.addTextChangedListener(new wtr(wts, a));
    }
}
