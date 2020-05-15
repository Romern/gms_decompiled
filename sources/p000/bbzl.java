package p000;

import android.content.ContentValues;
import android.net.Uri;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: bbzl */
final /* synthetic */ class bbzl implements Callable {

    /* renamed from: a */
    private final bcas f103804a;

    /* renamed from: b */
    private final ContentValues f103805b;

    /* renamed from: c */
    private final List f103806c;

    /* renamed from: d */
    private final String[] f103807d;

    public bbzl(bcas bcas, ContentValues contentValues, List list, String[] strArr) {
        this.f103804a = bcas;
        this.f103805b = contentValues;
        this.f103806c = list;
        this.f103807d = strArr;
    }

    public final Object call() {
        bcas bcas = this.f103804a;
        ContentValues contentValues = this.f103805b;
        List list = this.f103806c;
        String[] strArr = this.f103807d;
        bdae bdae = bcas.f103908c;
        Uri d = bcas.mo56655d("messages");
        String a = bcbc.m88744a(list.size());
        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 39);
        sb.append("message_id IN (");
        sb.append(a);
        sb.append(") AND message_status = ?");
        return Integer.valueOf(bdae.mo54674a(d, contentValues, sb.toString(), strArr));
    }
}
