package p000;

import android.content.Context;
import android.os.Binder;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: aaoo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aaoo {

    /* renamed from: a */
    public static final Pattern f28705a = Pattern.compile(" +");

    /* renamed from: d */
    private static final Pattern f28706d = Pattern.compile("\\W");

    /* renamed from: e */
    private static aaoo f28707e = new aaoo(new aaom[0]);

    /* renamed from: f */
    private static Object f28708f;

    /* renamed from: b */
    public final aaom[] f28709b;

    /* renamed from: c */
    public final Pattern f28710c;

    public aaoo(aaom[] aaomArr) {
        Arrays.sort(aaomArr);
        StringBuilder sb = new StringBuilder("(");
        for (int i = 0; i < aaomArr.length; i++) {
            if (i > 0) {
                sb.append(")|(");
            }
            sb.append(f28706d.matcher(aaomArr[i].f28702a).replaceAll("\\\\$0"));
        }
        sb.append(")");
        this.f28710c = Pattern.compile(sb.toString());
        this.f28709b = aaomArr;
    }

    /* renamed from: a */
    public static synchronized aaoo m21765a(Context context) {
        aaoo aaoo;
        long clearCallingIdentity;
        synchronized (aaoo.class) {
            long clearCallingIdentity2 = Binder.clearCallingIdentity();
            try {
                Object a = aymn.m84262a(context.getContentResolver());
                Binder.restoreCallingIdentity(clearCallingIdentity2);
                if (a != f28708f) {
                    clearCallingIdentity = Binder.clearCallingIdentity();
                    Map a2 = aymn.m84266a(context.getContentResolver(), "url:");
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                    ArrayList arrayList = new ArrayList();
                    for (Map.Entry entry : a2.entrySet()) {
                        ((String) entry.getKey()).substring(4);
                        String str = (String) entry.getValue();
                        if (!(str == null || str.length() == 0)) {
                            arrayList.add(new aaom(str));
                        }
                    }
                    aaoo = new aaoo((aaom[]) arrayList.toArray(new aaom[arrayList.size()]));
                    f28707e = aaoo;
                    f28708f = a;
                } else {
                    aaoo = f28707e;
                }
            } catch (aaon e) {
                Log.e("UrlRules", "Invalid rule from Gservices", e);
            } catch (Throwable th) {
                Binder.restoreCallingIdentity(clearCallingIdentity);
                throw th;
            }
        }
        return aaoo;
    }
}
