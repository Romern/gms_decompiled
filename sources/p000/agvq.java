package p000;

import android.app.AlertDialog;
import android.content.Context;
import android.os.Build;
import android.support.p002v7.widget.RecyclerView;
import android.text.SpannableString;
import android.view.View;
import com.felicanetworks.mfc.C0126R;

/* renamed from: agvq */
public final /* synthetic */ class agvq implements View.OnClickListener {

    /* renamed from: a */
    private final agvu f66666a;

    public agvq(agvu agvu) {
        this.f66666a = agvu;
    }

    public void onClick(View view) {
        agvu agvu = this.f66666a;
        agrl.m54942a().mo35987a(27, (String) null, agvn.m55186b(view), bygd.CLICK_WALLET_BALANCE, System.currentTimeMillis(), agvh.m55172b());
        if (cfnm.m140631b()) {
            RecyclerView recyclerView = new RecyclerView(agvu.f66672s);
            Context context = agvu.f66672s;
            recyclerView.setLayoutManager(new aah());
            agug agug = new agug();
            recyclerView.setAdapter(agug);
            agug.mo36116a(new agxu(agvu.f66678y, agvu.f66676w, agvu.mo36143a(agvu.f66678y)));
            if (cfnm.m140639j()) {
                int i = Build.VERSION.SDK_INT;
                new AlertDialog.Builder(agvu.f66672s, C0126R.style.MdpDialogDefault).setView(recyclerView).setPositiveButton((int) C0126R.string.dialog_ok, agvr.f66667a).create().show();
                return;
            }
            new AlertDialog.Builder(agvu.f66672s).setView(recyclerView).setPositiveButton((int) C0126R.string.dialog_ok, agvs.f66668a).create().show();
            return;
        }
        RecyclerView recyclerView2 = new RecyclerView(agvu.f66672s);
        Context context2 = agvu.f66672s;
        recyclerView2.setLayoutManager(new aah());
        agug agug2 = new agug();
        recyclerView2.setAdapter(agug2);
        long j = agvu.f66678y.f80243a;
        agug2.mo36116a(new agye(agvu.f66672s.getString(C0126R.string.account_balance_viewholder_description), agvu.f66676w, j <= 0 ? j < 0 ? C0126R.color.material_orange_800 : C0126R.color.material_grey_600 : C0126R.color.material_google_green_500));
        agug2.mo36116a(new agyd(agvu.mo36143a(agvu.f66678y), new SpannableString("")));
        new AlertDialog.Builder(agvu.f66672s).setView(recyclerView2).setPositiveButton((int) C0126R.string.dialog_ok, agvt.f66669a).create().show();
    }
}
