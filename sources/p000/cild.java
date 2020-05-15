package p000;

import android.os.Handler;
import java.util.HashMap;
import java.util.Map;

/* renamed from: cild */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cild extends cilb {

    /* renamed from: a */
    private final Handler f190591a;

    /* renamed from: b */
    private final Runnable f190592b;

    /* renamed from: c */
    private final brep f190593c;

    /* renamed from: d */
    private final brgl f190594d;

    public cild(brgl brgl, brep brep, Handler handler, Runnable runnable) {
        super(brep);
        this.f190594d = brgl;
        this.f190593c = brep;
        this.f190591a = handler;
        this.f190592b = runnable;
    }

    /* renamed from: a */
    private static final String m150542a(Map map, String str) {
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        String valueOf = String.valueOf((String) map.get(str));
        if (valueOf.length() == 0) {
            new String("setResponseParam Exit:");
        } else {
            "setResponseParam Exit:".concat(valueOf);
        }
        return (String) map.get(str);
    }

    /* renamed from: a */
    public final void mo69527a(brgs brgs) {
        HashMap hashMap;
        String str = brgs.f142833a;
        if (str != null) {
            hashMap = new HashMap();
            for (String str2 : str.split("\r\n")) {
                String[] split = str2.split("=");
                if (split.length >= 2) {
                    StringBuilder sb = new StringBuilder();
                    for (int i = 1; i < split.length; i++) {
                        if (i > 1) {
                            sb.append("=");
                        }
                        sb.append(split[i]);
                    }
                    hashMap.put(split[0], sb.toString());
                }
            }
        } else {
            hashMap = null;
        }
        String a = m150542a(hashMap, "ret");
        String replace = m150542a(hashMap, "url").replace("\"", "");
        if (a == null || !a.equals("200") || replace == null || replace.isEmpty()) {
            brep brep = this.f190593c;
            ciki ciki = ciki.SERVER_ERROR;
            ciki.m150513a(ciki);
            brep.mo49931a(new bres(ciki));
            return;
        }
        this.f190591a.post(new cilk(replace, this.f190594d, this.f190593c, this.f190591a, this.f190592b));
    }
}
