package p000;

import android.view.View;

/* renamed from: abfp */
final /* synthetic */ class abfp implements View.OnClickListener {

    /* renamed from: a */
    private final abfu f57355a;

    /* renamed from: b */
    private final int f57356b;

    /* renamed from: c */
    private final String f57357c;

    /* renamed from: d */
    private final abfo f57358d;

    public abfp(abfu abfu, int i, String str, abfo abfo) {
        this.f57355a = abfu;
        this.f57356b = i;
        this.f57357c = str;
        this.f57358d = abfo;
    }

    public void onClick(View view) {
        abfu abfu = this.f57355a;
        int i = this.f57356b;
        String str = this.f57357c;
        abfo abfo = this.f57358d;
        abfu.f57368a.f78973t.f111270i.clearFocus();
        aatj.m46979a(view);
        abgx.m47704a(abfu.f57368a, aasm.m46882a(str, aasw.m46952a(), abfu.f57368a.f56986y), 32, i);
        abfu.mo32069a(abfu.f57369d, abfo);
    }
}
