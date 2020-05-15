package p000;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: bayg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bayg {

    /* renamed from: a */
    public final Context f102086a;

    /* renamed from: b */
    public final bbaz f102087b;

    /* renamed from: c */
    public final bbda f102088c;

    /* renamed from: d */
    public final bbdd f102089d;

    /* renamed from: e */
    public final bbep f102090e;

    /* renamed from: f */
    public final ayte f102091f;

    /* renamed from: g */
    public final bmxv f102092g;

    /* renamed from: h */
    public final bawt f102093h;

    /* renamed from: i */
    public final Executor f102094i;

    /* renamed from: j */
    private final befa f102095j;

    public bayg(Context context, bbaz bbaz, bbda bbda, bbdd bbdd, bbep bbep, ayte ayte, befa befa, bmxv bmxv, bawt bawt, Executor executor) {
        this.f102086a = context;
        this.f102087b = bbaz;
        this.f102088c = bbda;
        this.f102089d = bbdd;
        this.f102090e = bbep;
        this.f102091f = ayte;
        this.f102095j = befa;
        this.f102092g = bmxv;
        this.f102093h = bawt;
        this.f102094i = executor;
    }

    /* renamed from: a */
    public final int mo56033a(Uri uri, List list) {
        int i;
        try {
            if (!this.f102095j.mo60647c(uri)) {
                return 0;
            }
            i = 0;
            for (Uri uri2 : this.f102095j.mo60650f(uri)) {
                try {
                    try {
                        if (!list.contains(uri2)) {
                            Iterator it = list.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (uri2.toString().startsWith(((Uri) it.next()).toString())) {
                                        break;
                                    }
                                } else if (!this.f102095j.mo60648d(uri2)) {
                                    uri2.getPath();
                                    this.f102095j.mo60644a(uri2);
                                    i++;
                                } else {
                                    i += mo56033a(uri2, list);
                                }
                            }
                        }
                    } catch (IOException e) {
                        this.f102090e.mo34988b(1059);
                        bbev.m87908a(e, "%s: Failed to delete unaccounted file!", "ExpirationHandler");
                    }
                } catch (IOException e2) {
                    e = e2;
                }
            }
            return i;
        } catch (IOException e3) {
            e = e3;
            i = 0;
            this.f102090e.mo34988b(1059);
            bbev.m87908a(e, "%s: Failed to delete unaccounted file!", "ExpirationHandler");
            return i;
        }
    }
}
