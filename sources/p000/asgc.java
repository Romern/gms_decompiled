package p000;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: asgc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asgc extends asgb {

    /* renamed from: c */
    protected Map f88891c = null;

    public asgc(String str) {
        super(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo49143a(String str) {
        this.f88890b = Pattern.compile(asgd.f88895p.matcher(this.f88889a).replaceAll("")).matcher(str);
        String str2 = this.f88889a;
        C1223np npVar = new C1223np();
        Matcher matcher = asgd.f88895p.matcher(str2);
        int i = 1;
        while (matcher.find()) {
            npVar.put(matcher.group(1), Integer.valueOf(i));
            i++;
        }
        this.f88891c = npVar;
    }

    /* renamed from: b */
    public final String mo49145b(String str) {
        if (this.f88891c.containsKey(str)) {
            return this.f88890b.group(((Integer) this.f88891c.get(str)).intValue());
        }
        throw new IllegalArgumentException(str.length() == 0 ? new String("Unknown group ") : "Unknown group ".concat(str));
    }
}
