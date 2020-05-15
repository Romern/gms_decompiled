package p000;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import com.felicanetworks.mfc.C0126R;

/* renamed from: abfs */
final /* synthetic */ class abfs implements View.OnClickListener {

    /* renamed from: a */
    private final abfu f57365a;

    /* renamed from: b */
    private final abfo f57366b;

    public abfs(abfu abfu, abfo abfo) {
        this.f57365a = abfu;
        this.f57366b = abfo;
    }

    public void onClick(View view) {
        abfu abfu = this.f57365a;
        abfo abfo = this.f57366b;
        String str = abfo.f57352c;
        if (!TextUtils.isEmpty(str)) {
            EditText editText = abfu.f57368a.f78973t.f111270i;
            editText.clearFocus();
            editText.setText(str);
            aatj.m46979a(view);
            abfu.f57368a.f78964k.mo32074a();
            abfu.f57368a.findViewById(C0126R.C0129id.gh_open_search_view_progress_bar).setVisibility(0);
            abfu.f57368a.mo43349e(str);
            new abhe(abfu.f57368a.f78966m, new abfo(str)).start();
        }
        abfu.mo32069a(abfu.f57369d, abfo);
    }
}
