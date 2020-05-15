package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: bymt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bymt {

    /* renamed from: a */
    public final String f167073a;

    /* renamed from: b */
    public final bngx f167074b;

    public bymt() {
        this(" -_", Arrays.asList("Sony", "HTC", "Samsung", "sonyericsson", "MICROMAX", "huawei", "nook", "ZTE"));
    }

    /* renamed from: a */
    public static final String m124967a(String str, String str2) {
        return str2 != null ? !str2.isEmpty() ? str2 : str : "";
    }

    public bymt(String str, List list) {
        this.f167073a = str;
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((String) it.next()).toLowerCase());
        }
        Collections.reverse(arrayList);
        this.f167074b = bngx.m109368a((Collection) arrayList);
    }
}
