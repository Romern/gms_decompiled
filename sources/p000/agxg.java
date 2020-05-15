package p000;

import android.app.AlertDialog;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.mobiledataplan.MdpDataPlanStatus;

/* renamed from: agxg */
final /* synthetic */ class agxg implements View.OnClickListener {

    /* renamed from: a */
    private final agxl f66772a;

    /* renamed from: b */
    private final MdpDataPlanStatus f66773b;

    public agxg(agxl agxl, MdpDataPlanStatus mdpDataPlanStatus) {
        this.f66772a = agxl;
        this.f66773b = mdpDataPlanStatus;
    }

    public void onClick(View view) {
        agxl agxl = this.f66772a;
        agrl.m54942a().mo35987a(3, this.f66773b.f80170i, agvn.m55186b(view), bygd.VIEW_PLAN_DETAILS, System.currentTimeMillis(), agvh.m55172b());
        String charSequence = agxl.f66783s.getText().toString();
        String str = agxl.f66785u;
        Context context = view.getContext();
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(agxl.f66786v.f80179r)) {
            agxl.m55215a(sb, agxl.f66786v.f80179r);
        }
        if (sb.toString().isEmpty() && !TextUtils.isEmpty(str)) {
            agxl.m55215a(sb, context.getString(C0126R.string.generic_desc, str));
        }
        if (cfnm.m140639j()) {
            int i = Build.VERSION.SDK_INT;
            AlertDialog create = new AlertDialog.Builder(context, C0126R.style.MdpDialogDefault).setTitle(charSequence).setMessage(sb.toString()).setPositiveButton((int) C0126R.string.dialog_got_it, agxh.f66774a).create();
            create.setOnShowListener(new agxi(create, context));
            create.show();
            return;
        }
        AlertDialog create2 = new AlertDialog.Builder(context).setTitle(charSequence).setMessage(sb.toString()).setPositiveButton((int) C0126R.string.dialog_got_it, agxj.f66777a).create();
        create2.setOnShowListener(new agxk(create2, context));
        create2.show();
    }
}
