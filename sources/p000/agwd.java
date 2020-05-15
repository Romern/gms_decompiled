package p000;

import android.app.AlertDialog;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import com.felicanetworks.mfc.C0126R;

/* renamed from: agwd */
final /* synthetic */ class agwd implements View.OnClickListener {

    /* renamed from: a */
    private final agwi f66701a;

    /* renamed from: b */
    private final String f66702b;

    public agwd(agwi agwi, String str) {
        this.f66701a = agwi;
        this.f66702b = str;
    }

    public void onClick(View view) {
        agwi agwi = this.f66701a;
        String str = this.f66702b;
        agrl.m54942a().mo35987a(5, String.format("%s flexwin {%s, %s}", str, agwi.f66711s.getText(), agwi.f66712t.getText()), agvn.m55186b(view), bygd.VIEW_FLEX_WIN_DETAILS, System.currentTimeMillis(), agvh.m55172b());
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(10);
            if (str.toLowerCase().endsWith(agwi.f66713u.getString(C0126R.string.plan).toLowerCase())) {
                sb.append(agwi.f66713u.getString(C0126R.string.applies_to_no_plan, str));
            } else {
                sb.append(agwi.f66713u.getString(C0126R.string.applies_to, str));
            }
            sb.append(10);
        }
        sb.append(10);
        sb.append(agwi.f66712t.getText());
        sb.append(10);
        if (cfnm.m140639j()) {
            int i = Build.VERSION.SDK_INT;
            AlertDialog create = new AlertDialog.Builder(agwi.f66713u, C0126R.style.MdpDialogDefault).setTitle(agwi.f66711s.getText().toString()).setMessage(sb.toString()).setPositiveButton(agwi.f66713u.getString(C0126R.string.dialog_got_it), agwe.f66703a).create();
            create.setOnShowListener(new agwf(agwi, create));
            create.show();
            return;
        }
        AlertDialog create2 = new AlertDialog.Builder(agwi.f66713u).setTitle(agwi.f66711s.getText().toString()).setMessage(sb.toString()).setPositiveButton(agwi.f66713u.getString(C0126R.string.dialog_got_it), agwg.f66706a).create();
        create2.setOnShowListener(new agwh(agwi, create2));
        create2.show();
    }
}
