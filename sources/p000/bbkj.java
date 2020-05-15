package p000;

import android.net.Uri;
import java.util.concurrent.Executor;

/* renamed from: bbkj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbkj {

    /* renamed from: a */
    public final befa f102815a;

    /* renamed from: b */
    private final Executor f102816b;

    public bbkj(Executor executor, befa befa) {
        this.f102816b = executor;
        this.f102815a = befa;
    }

    /* renamed from: a */
    public final bqgg mo56178a(bbjs bbjs, int i) {
        Uri uri;
        if (i == 0) {
            uri = Uri.parse(bbjs.f102779b);
        } else if (i == 1) {
            uri = Uri.parse(bbjs.f102780c);
        } else if (i == 2) {
            uri = Uri.parse(bbjs.f102781d);
        } else if (i != 3) {
            uri = Uri.parse(bbjs.f102783f);
        } else {
            uri = Uri.parse(bbjs.f102782e);
        }
        return bqga.m112771a(new bbki(this, uri), this.f102816b);
    }
}
