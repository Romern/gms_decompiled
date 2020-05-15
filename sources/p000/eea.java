package p000;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: eea */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class eea {

    /* renamed from: a */
    private final Context f14762a;

    /* renamed from: b */
    private final HashMap f14763b = new HashMap();

    public eea(Context context) {
        this.f14762a = context;
    }

    /* renamed from: b */
    public static String m10203b(int i, String str) {
        if (i != 1) {
            String valueOf = String.valueOf(str);
            return valueOf.length() == 0 ? new String("f:") : "f:".concat(valueOf);
        }
        String valueOf2 = String.valueOf(str);
        return valueOf2.length() == 0 ? new String("c:") : "c:".concat(valueOf2);
    }

    /* renamed from: c */
    public static String m10204c(int i, String str) {
        String replaceAll = str.replaceAll("[^a-zA-Z0-9.-]", "_");
        if (i != 1) {
            StringBuilder sb = new StringBuilder(String.valueOf(replaceAll).length() + 19);
            sb.append("context_feature_");
            sb.append(replaceAll);
            sb.append(".db");
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(replaceAll).length() + 11);
        sb2.append("context_");
        sb2.append(replaceAll);
        sb2.append(".db");
        return sb2.toString();
    }

    /* renamed from: a */
    public final srp mo10023a(int i, String str) {
        srp srp;
        String b = m10203b(i, str);
        eec eec = (eec) this.f14763b.get(b);
        if (eec == null) {
            Context context = this.f14762a;
            String c = m10204c(i, str);
            if (i != 1) {
                srp = new eeb(context, c);
            } else {
                srp = new edz(context, c);
            }
            eec = new eec(srp);
            this.f14763b.put(b, eec);
        }
        return eec.mo10031a();
    }

    /* renamed from: a */
    public final srp mo10024a(doh doh) {
        srp a = mo10023a(1, doh.f13690b);
        mo10025a();
        return a;
    }

    /* renamed from: a */
    public final void mo10025a() {
        ArrayList arrayList = null;
        for (Map.Entry entry : this.f14763b.entrySet()) {
            String str = (String) entry.getKey();
            if (dwq.m9665i().mo20505a() - ((eec) entry.getValue()).f14766a > 300000) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(str);
            }
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                String str2 = (String) arrayList.get(i);
                new Object[1][0] = str2;
                mo10026a(str2);
            }
        }
    }

    /* renamed from: a */
    public final void mo10026a(String str) {
        eec eec = (eec) this.f14763b.remove(str);
        if (eec != null) {
            eec.mo10031a().close();
        }
    }
}
