package p000;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.EventParams;
import java.util.Iterator;

/* renamed from: agdq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agdq {

    /* renamed from: a */
    final String f65324a;

    /* renamed from: b */
    final String f65325b;

    /* renamed from: c */
    final String f65326c;

    /* renamed from: d */
    final long f65327d;

    /* renamed from: e */
    final long f65328e;

    /* renamed from: f */
    final EventParams f65329f;

    public agdq(agje agje, String str, String str2, String str3, long j, long j2, Bundle bundle) {
        EventParams eventParams;
        sdo.m34977c(str2);
        sdo.m34977c(str3);
        this.f65324a = str2;
        this.f65325b = str3;
        this.f65326c = TextUtils.isEmpty(str) ? null : str;
        this.f65327d = j;
        this.f65328e = j2;
        if (j2 != 0 && j2 > j) {
            agje.mo35497E().f65567f.mo35436a("Event created with reverse previous/current timestamps. appId", agid.m54288a(str2));
        }
        if (!bundle.isEmpty()) {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    agje.mo35497E().f65564c.mo35435a("Param name can't be null");
                    it.remove();
                } else {
                    Object a = agje.mo35502f().mo35726a(next, bundle2.get(next));
                    if (a == null) {
                        agje.mo35497E().f65567f.mo35436a("Param value can't be null", agje.mo35503g().mo35424b(next));
                        it.remove();
                    } else {
                        agje.mo35502f().mo35731a(bundle2, next, a);
                    }
                }
            }
            eventParams = new EventParams(bundle2);
        } else {
            eventParams = new EventParams(new Bundle());
        }
        this.f65329f = eventParams;
    }

    public final String toString() {
        String str = this.f65324a;
        String str2 = this.f65325b;
        String valueOf = String.valueOf(this.f65329f);
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 33 + String.valueOf(str2).length() + String.valueOf(valueOf).length());
        sb.append("Event{appId='");
        sb.append(str);
        sb.append("', name='");
        sb.append(str2);
        sb.append("', params=");
        sb.append(valueOf);
        sb.append('}');
        return sb.toString();
    }

    public agdq(agje agje, String str, String str2, String str3, long j, long j2, EventParams eventParams) {
        sdo.m34977c(str2);
        sdo.m34977c(str3);
        sdo.m34959a(eventParams);
        this.f65324a = str2;
        this.f65325b = str3;
        this.f65326c = TextUtils.isEmpty(str) ? null : str;
        this.f65327d = j;
        this.f65328e = j2;
        if (j2 != 0 && j2 > j) {
            agje.mo35497E().f65567f.mo35437a("Event created with reverse previous/current timestamps. appId, name", agid.m54288a(str2), agid.m54288a(str3));
        }
        this.f65329f = eventParams;
    }
}
