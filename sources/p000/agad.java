package p000;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: agad */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agad {

    /* renamed from: a */
    public static final Map f65053a = new ConcurrentHashMap();

    /* renamed from: b */
    public final String f65054b;

    /* renamed from: c */
    public String f65055c;

    /* renamed from: d */
    public long f65056d;

    /* renamed from: e */
    public long f65057e;

    public agad(String str, String str2, long j) {
        this.f65054b = str;
        this.f65055c = str2;
        this.f65056d = j;
        this.f65057e = j;
    }

    /* renamed from: a */
    public static List m53795a(Context context, long j) {
        ArrayList arrayList = new ArrayList();
        if (cgkt.m145937i() && new apgy(context).mo47201a()) {
            for (agad agad : f65053a.values()) {
                if (agad.f65056d - cgkt.m145933e() <= j && j <= agad.f65057e + cgkt.m145933e()) {
                    arrayList.add(agad);
                }
            }
        }
        return arrayList;
    }
}
