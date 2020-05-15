package p000;

import android.util.Log;
import android.view.View;
import org.json.JSONException;

/* renamed from: abfq */
final /* synthetic */ class abfq implements View.OnClickListener {

    /* renamed from: a */
    private final abfu f57359a;

    /* renamed from: b */
    private final String f57360b;

    /* renamed from: c */
    private final String f57361c;

    /* renamed from: d */
    private final int f57362d;

    /* renamed from: e */
    private final abfo f57363e;

    public abfq(abfu abfu, String str, String str2, int i, abfo abfo) {
        this.f57359a = abfu;
        this.f57360b = str;
        this.f57361c = str2;
        this.f57362d = i;
        this.f57363e = abfo;
    }

    public void onClick(View view) {
        abfu abfu = this.f57359a;
        String str = this.f57360b;
        String str2 = this.f57361c;
        int i = this.f57362d;
        abfo abfo = this.f57363e;
        try {
            abfu.f57368a.f78973t.f111270i.clearFocus();
            aatj.m46979a(view);
            aasm b = aasm.m46897b(str, str2);
            if (b.mo31732o()) {
                aaso.m46933a(b, abfu.f57368a);
            } else if (b.mo31731n()) {
                aaso.m46935a(new aazy(), b, abfu.f57368a);
            } else if (b.mo31730m()) {
                aaso.m46934a(new aass(abfu.f57368a), b, i, 32, b.f56496f);
            }
        } catch (JSONException e) {
            Log.e("AutoCompleteSgstAdapter", "Opening help action failed:", e);
        }
        abfu.mo32069a(abfu.f57369d, abfo);
    }
}
