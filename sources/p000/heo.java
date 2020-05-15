package p000;

import android.text.TextUtils;
import com.android.volley.toolbox.ImageLoader;

/* renamed from: heo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class heo implements bdci, bdeq {

    /* renamed from: a */
    private static volatile ImageLoader f19610a;

    /* renamed from: b */
    private final String f19611b;

    public heo(String str) {
        this.f19611b = str;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ String mo12343a(Object obj) {
        String str = this.f19611b;
        int hashCode = ((hek) obj).hashCode();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11);
        sb.append(str);
        sb.append(hashCode);
        return sb.toString();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ CharSequence mo12345b(Object obj) {
        return ((hek) obj).f19603c;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ CharSequence mo12346c(Object obj) {
        return ((hek) obj).f19604d;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo12344a(Object obj, int i, bdep bdep) {
        ImageLoader imageLoader;
        hek hek = (hek) obj;
        if (hek.f19605e != null || TextUtils.isEmpty(hek.f19606f)) {
            bdep.mo57931a(hek.f19605e);
            return;
        }
        if (f19610a == null) {
            synchronized (heo.class) {
                if (f19610a != null) {
                    imageLoader = f19610a;
                } else {
                    f19610a = new ImageLoader(rpr.m34216b().getRequestQueue(), new ryw());
                }
            }
            f19610a = imageLoader;
            f19610a.get(hek.f19606f, new hen(bdep));
        }
        imageLoader = f19610a;
        f19610a = imageLoader;
        f19610a.get(hek.f19606f, new hen(bdep));
    }
}
