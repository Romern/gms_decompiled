package p000;

import android.content.Context;
import android.net.Uri;
import com.android.volley.NetworkResponse;
import com.android.volley.VolleyError;

/* renamed from: almy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class almy {

    /* renamed from: c */
    private static almy f73812c;

    /* renamed from: a */
    public final Context f73813a;

    /* renamed from: b */
    public final shj f73814b;

    /* renamed from: d */
    private final sqv f73815d;

    static {
        almy.class.getName();
    }

    public almy(Context context, shj shj) {
        Context applicationContext = context.getApplicationContext();
        this.f73813a = applicationContext;
        this.f73815d = ancm.m64005a(applicationContext);
        this.f73814b = shj;
        shj.f44447g = 5402;
    }

    /* renamed from: a */
    public static synchronized almy m61373a(Context context) {
        almy almy;
        synchronized (almy.class) {
            if (f73812c == null) {
                f73812c = new almy(context, new shj(context, null, null, cgbe.f186279a.mo6606a().mo83452f(), true, null, null, 5376));
            }
            almy = f73812c;
        }
        return almy;
    }

    /* renamed from: a */
    public final byte[] mo40600a(String str) {
        byte[] a = this.f73814b.mo25542a(this.f73813a, (Uri) null, str);
        if (a != null) {
            alsj.m61651a(this.f73813a).mo40678a(0);
            alsj.m61651a(this.f73813a).mo40679a(0L);
        }
        return a;
    }

    /* renamed from: a */
    public final byte[] mo40601a(String str, boolean z) {
        String str2;
        try {
            if (this.f73815d.mo20505a() / 1000 >= alsj.m61651a(this.f73813a).mo40687b()) {
                return mo40600a(str);
            }
            throw new VolleyError("No request was sent, since we are currently backing off. A request at this time would likely fail.");
        } catch (VolleyError e) {
            if (ancc.m63974b(e)) {
                alsj a = alsj.m61651a(this.f73813a);
                alsj a2 = alsj.m61651a(this.f73813a);
                int i = a2.f74200a.getInt("avatar_fetch_backoff_sec", 0);
                boolean V = cgbe.f186279a.mo6606a().mo83265V();
                int W = (int) cgbe.f186279a.mo6606a().mo83266W();
                if (i > 0) {
                    W = Math.max(W, i);
                    if (V) {
                        W += W;
                    }
                }
                int min = Math.min((int) cgbe.f186279a.mo6606a().mo83267X(), W);
                a2.mo40678a(min);
                if (min > 0) {
                    long max = Math.max(a.mo40687b(), (this.f73815d.mo20505a() / 1000) + ((long) min));
                    a.mo40679a(max);
                    Context context = this.f73813a;
                    StringBuilder sb = new StringBuilder(59);
                    sb.append("avatar backoff=");
                    sb.append(min);
                    sb.append(" delay until=");
                    sb.append(max);
                    aluj.m61898a(context, "PeopleIS", sb.toString());
                }
            } else if (z && ancc.m63972a(e)) {
                return alot.f73983c;
            }
            Object[] objArr = new Object[3];
            objArr[0] = str;
            objArr[1] = e.getMessage();
            NetworkResponse networkResponse = e.networkResponse;
            if (networkResponse != null) {
                str2 = String.valueOf(networkResponse.statusCode);
            } else {
                str2 = "none";
            }
            objArr[2] = str2;
            amdk.m62659b("PeopleIS", "Error retrieving image at URL %s: %s [%s]", objArr);
            return alot.f73984d;
        }
    }
}
