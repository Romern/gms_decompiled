package p000;

import android.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;

/* renamed from: aguo */
final /* synthetic */ class aguo implements View.OnClickListener {

    /* renamed from: a */
    private final agup f66585a;

    /* renamed from: b */
    private final AlertDialog f66586b;

    public aguo(agup agup, AlertDialog alertDialog) {
        this.f66585a = agup;
        this.f66586b = alertDialog;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, ?[OBJECT, ARRAY], int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public void onClick(View view) {
        agup agup = this.f66585a;
        AlertDialog alertDialog = this.f66586b;
        agup.f66589a.onClick(view);
        alertDialog.setCancelable(false);
        try {
            alertDialog.getWindow().setLayout(alertDialog.getWindow().getDecorView().getWidth(), alertDialog.getWindow().getDecorView().getHeight());
        } catch (NullPointerException e) {
            bnsl bnsl = (bnsl) agup.f66588j.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68405a("Couldn't set loading dialog size");
        }
        alertDialog.setContentView(LayoutInflater.from(agup.getContext()).inflate((int) C0126R.C0128layout.progress_spinner_view, (ViewGroup) null, false));
    }
}
