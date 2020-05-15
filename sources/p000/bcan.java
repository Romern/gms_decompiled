package p000;

import android.content.Context;
import android.net.Uri;

/* renamed from: bcan */
final /* synthetic */ class bcan implements bmxj {

    /* renamed from: a */
    private final bcas f103887a;

    /* renamed from: b */
    private final Context f103888b;

    /* renamed from: c */
    private final bmxj f103889c;

    /* renamed from: d */
    private final Uri f103890d;

    /* renamed from: e */
    private final bcdo f103891e;

    public bcan(bcas bcas, Context context, bmxj bmxj, Uri uri, bcdo bcdo) {
        this.f103887a = bcas;
        this.f103888b = context;
        this.f103889c = bmxj;
        this.f103890d = uri;
        this.f103891e = bcdo;
    }

    public final Object apply(Object obj) {
        bcas bcas = this.f103887a;
        Context context = this.f103888b;
        bmxj bmxj = this.f103889c;
        Uri uri = this.f103890d;
        bcdo bcdo = this.f103891e;
        return ((Boolean) obj).booleanValue() ? new bcdl(context, bmxj, bcas.f103908c, uri, bcdo) : new bcdf(context, bmxj, bcas.f103908c, uri, bcdo);
    }
}
