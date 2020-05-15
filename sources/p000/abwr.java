package p000;

import android.os.Parcel;
import com.google.firebase.appindexing.internal.Thing;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: abwr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abwr {
    /* renamed from: a */
    public static void m48408a(Map map) {
        String str;
        HashMap hashMap = new HashMap();
        for (List list : map.values()) {
            for (int i = 0; i < list.size(); i++) {
                Thing thing = (Thing) list.get(i);
                String str2 = thing.f152371c.f152376c;
                if (!str2.isEmpty()) {
                    Parcel obtain = Parcel.obtain();
                    brjf.m114100a(thing, obtain, 0);
                    obtain.setDataPosition(0);
                    Thing thing2 = (Thing) Thing.CREATOR.createFromParcel(obtain);
                    list.set(i, thing2);
                    if (hashMap.get(str2) != null) {
                        str = (String) hashMap.get(str2);
                    } else {
                        String a = boan.f132470d.mo68794a(aptf.f84845a.mo68721a(str2, bmwy.f131158c).mo68740b());
                        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 6);
                        sb.append("__a_");
                        sb.append(a);
                        sb.append("__");
                        String sb2 = sb.toString();
                        hashMap.put(str2, sb2);
                        str = sb2;
                    }
                    bngs j = bngx.m109377j();
                    String[] b = thing2.mo72351b("keywords");
                    if (b != null) {
                        j.mo67667b((Object[]) b);
                    }
                    j.mo67668c(str);
                    thing2.f152370b.putStringArray("keywords", (String[]) j.mo67664a().toArray(new String[0]));
                }
            }
        }
    }
}
