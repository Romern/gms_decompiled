package p000;

import android.content.Context;
import javax.net.SocketFactory;

/* renamed from: afoo */
final /* synthetic */ class afoo implements bmzi {

    /* renamed from: a */
    private final int f64448a;

    /* renamed from: b */
    private final Context f64449b;

    /* renamed from: c */
    private final befa f64450c;

    public afoo(int i, Context context, befa befa) {
        this.f64448a = i;
        this.f64449b = context;
        this.f64450c = befa;
    }

    /* renamed from: a */
    public final Object mo6606a() {
        int i = this.f64448a;
        Context context = this.f64449b;
        befa befa = this.f64450c;
        cauf cauf = new cauf();
        cauf.f176006h = new baxq(SocketFactory.getDefault(), i);
        return new baxn(context, new bdce(new bdcg(cauf), context, sne.m35694a((int) cenf.m137500b(), 10)), befa, null);
    }
}
