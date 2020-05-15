package p000;

import android.content.Context;
import android.net.Uri;
import java.util.concurrent.Callable;

/* renamed from: bcam */
final /* synthetic */ class bcam implements Callable {

    /* renamed from: a */
    private final bcas f103882a;

    /* renamed from: b */
    private final Context f103883b;

    /* renamed from: c */
    private final bmxj f103884c;

    /* renamed from: d */
    private final Uri f103885d;

    /* renamed from: e */
    private final bcdo f103886e;

    public bcam(bcas bcas, Context context, bmxj bmxj, Uri uri, bcdo bcdo) {
        this.f103882a = bcas;
        this.f103883b = context;
        this.f103884c = bmxj;
        this.f103885d = uri;
        this.f103886e = bcdo;
    }

    public final Object call() {
        bcas bcas = this.f103882a;
        return new bdah(bbqt.m88418a(bbqt.m88417a(bcas.f103906a).f103176r, bcas.f103911f), new bcan(bcas, this.f103883b, this.f103884c, this.f103885d, this.f103886e), bcas.f103911f);
    }
}
