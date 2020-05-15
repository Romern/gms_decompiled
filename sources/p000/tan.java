package p000;

import android.text.Html;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.constellation.p038ui.ConstellationSettingsChimeraActivity;
import java.util.ArrayList;

/* renamed from: tan */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class tan implements suh {

    /* renamed from: a */
    final /* synthetic */ ConstellationSettingsChimeraActivity f45577a;

    public tan(ConstellationSettingsChimeraActivity constellationSettingsChimeraActivity) {
        this.f45577a = constellationSettingsChimeraActivity;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, ?[OBJECT, ARRAY], int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final void mo7099a(View view, sui sui) {
        ConstellationSettingsChimeraActivity constellationSettingsChimeraActivity = this.f45577a;
        if (constellationSettingsChimeraActivity.f30561u == null) {
            ArrayList arrayList = new ArrayList();
            cbqd cbqd = constellationSettingsChimeraActivity.f30563w.f177995h;
            if (cbqd == null) {
                cbqd = cbqd.f178006c;
            }
            String str = cbqd.f178008a;
            cbqd cbqd2 = constellationSettingsChimeraActivity.f30563w.f177995h;
            if (cbqd2 == null) {
                cbqd2 = cbqd.f178006c;
            }
            arrayList.add(new Pair(str, cbqd2.f178009b));
            cbqd cbqd3 = constellationSettingsChimeraActivity.f30563w.f177996i;
            if (cbqd3 == null) {
                cbqd3 = cbqd.f178006c;
            }
            String str2 = cbqd3.f178008a;
            cbqd cbqd4 = constellationSettingsChimeraActivity.f30563w.f177996i;
            if (cbqd4 == null) {
                cbqd4 = cbqd.f178006c;
            }
            arrayList.add(new Pair(str2, cbqd4.f178009b));
            cbqd cbqd5 = constellationSettingsChimeraActivity.f30563w.f177997j;
            if (cbqd5 == null) {
                cbqd5 = cbqd.f178006c;
            }
            String str3 = cbqd5.f178008a;
            cbqd cbqd6 = constellationSettingsChimeraActivity.f30563w.f177997j;
            if (cbqd6 == null) {
                cbqd6 = cbqd.f178006c;
            }
            arrayList.add(new Pair(str3, cbqd6.f178009b));
            C1349sg sgVar = new C1349sg(constellationSettingsChimeraActivity);
            sgVar.mo15898a(new tau(constellationSettingsChimeraActivity, constellationSettingsChimeraActivity, arrayList), constellationSettingsChimeraActivity.f30553m, new C1593tap(constellationSettingsChimeraActivity));
            sgVar.mo15906b((int) C0126R.string.common_save, new taq(constellationSettingsChimeraActivity));
            sgVar.mo15894a(new tar(constellationSettingsChimeraActivity));
            constellationSettingsChimeraActivity.f30561u = sgVar.mo15904b();
            TextView textView = (TextView) LayoutInflater.from(constellationSettingsChimeraActivity).inflate((int) C0126R.C0128layout.c11n_dialog_title_view, (ViewGroup) null, false);
            textView.setClickable(true);
            textView.setText(Html.fromHtml(constellationSettingsChimeraActivity.f30563w.f177993f));
            if (!constellationSettingsChimeraActivity.f30563w.f177994g.isEmpty()) {
                textView.setOnClickListener(new tas(constellationSettingsChimeraActivity));
            }
            constellationSettingsChimeraActivity.f30561u.f27024a.f27020y = textView;
        }
        this.f45577a.f30561u.show();
    }
}
