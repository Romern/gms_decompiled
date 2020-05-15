package p000;

import android.content.ComponentName;
import android.text.TextUtils;
import android.util.Log;
import java.util.Collection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: aecm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aecm implements bmxz {

    /* renamed from: a */
    private String f63148a;

    /* renamed from: b */
    private bngx f63149b;

    /* renamed from: c */
    private bngx f63150c;

    /* renamed from: d */
    private final bmzi f63151d;

    /* renamed from: e */
    private final String f63152e;

    public aecm(bmzi bmzi) {
        this(bmzi, "");
    }

    /* renamed from: a */
    private final synchronized void m51630a(String str) {
        bngs j = bngx.m109377j();
        bngs j2 = bngx.m109377j();
        Pattern compile = Pattern.compile("^([-+])([^/]+)/([^:]+):(.+)$");
        for (String str2 : bmyx.m108640a(',').mo66918a((CharSequence) str)) {
            Matcher matcher = compile.matcher(str2);
            if (!matcher.matches()) {
                String valueOf = String.valueOf(str2);
                Log.w("NetworkScheduler.Filter", valueOf.length() == 0 ? new String("Ignored malformed rule: ") : "Ignored malformed rule: ".concat(valueOf));
            } else {
                boolean equals = matcher.group(1).equals("-");
                String group = matcher.group(2);
                String group2 = matcher.group(3);
                String group3 = matcher.group(4);
                aecn aecn = new aecn();
                boolean z = !"*".equals(group);
                boolean z2 = !"*".equals(group2);
                boolean z3 = !"*".equals(group3);
                if (z && z2) {
                    StringBuilder sb = new StringBuilder(String.valueOf(group).length() + 1 + String.valueOf(group2).length());
                    sb.append(group);
                    sb.append("/");
                    sb.append(group2);
                    ComponentName unflattenFromString = ComponentName.unflattenFromString(sb.toString());
                    if (unflattenFromString != null) {
                        aecn.mo34041b(unflattenFromString.getPackageName());
                        aecn.mo34040a(unflattenFromString.getClassName());
                    }
                } else if (z) {
                    aecn.mo34041b(group);
                } else if (z2) {
                    aecn.mo34040a(group2);
                }
                if (z3) {
                    aecn.mo34042c(group3);
                }
                if (!equals) {
                    j2.mo67668c(aecn.mo34038a());
                } else {
                    j.mo67668c(aecn.mo34038a());
                }
            }
        }
        this.f63148a = str;
        this.f63149b = j2.mo67664a();
        this.f63150c = j.mo67664a();
    }

    public aecm(bmzi bmzi, String str) {
        this.f63148a = "";
        this.f63149b = bngx.m109376e();
        this.f63150c = bngx.m109376e();
        this.f63151d = bmzi;
        this.f63152e = str;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List, java.util.Collection], assign insn: null */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    private static boolean m51631a(Collection r4, aecl aecl) {
        int size = r4.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            if (((bmxz) r4.get(i)).mo6527a(aecl)) {
                return true;
            }
            i = i2;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0069, code lost:
        return true;
     */
    /* renamed from: a */
    public final synchronized boolean mo6527a(aecl aecl) {
        String str = this.f63152e;
        String str2 = (String) this.f63151d.mo6606a();
        if (!TextUtils.isEmpty(str2)) {
            if (!TextUtils.isEmpty(str)) {
                String valueOf = String.valueOf(str);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(str2).length());
                sb.append(valueOf);
                sb.append(",");
                sb.append(str2);
                str = sb.toString();
            } else {
                str = str2;
            }
        }
        if (!TextUtils.isEmpty(str)) {
            if (!this.f63148a.equals(str)) {
                m51630a(str);
            }
            if (m51631a(this.f63150c, aecl) && !m51631a(this.f63149b, aecl)) {
                return false;
            }
        }
    }
}
