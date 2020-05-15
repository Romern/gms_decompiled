package p000;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/* renamed from: aseg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aseg {

    /* renamed from: a */
    public final bqyh f88756a;

    /* renamed from: b */
    public final List f88757b;

    /* renamed from: c */
    public final asek f88758c;

    /* renamed from: d */
    public final Context f88759d;

    /* renamed from: e */
    public final asei f88760e;

    /* renamed from: f */
    public final CountDownLatch f88761f = new CountDownLatch(this.f88757b.size());

    public aseg(bqyh bqyh, List list, asek asek, Context context) {
        this.f88756a = bqyh;
        this.f88757b = new ArrayList(list);
        this.f88758c = asek;
        this.f88759d = context;
        String valueOf = String.valueOf(this.f88756a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 6);
        sb.append("host: ");
        sb.append(valueOf);
        this.f88760e = new asei(sb.toString());
    }
}
