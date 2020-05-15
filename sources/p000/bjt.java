package p000;

import java.util.Arrays;

/* renamed from: bjt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjt {

    /* renamed from: a */
    private final bju f3405a = new bju();

    /* renamed from: a */
    public final bju mo3203a() {
        String[] strArr = new String[this.f3405a.size()];
        this.f3405a.keySet().toArray(strArr);
        Arrays.sort(strArr);
        return this.f3405a;
    }

    /* renamed from: a */
    public final void mo3204a(String str, String str2) {
        bju bju = this.f3405a;
        StringBuilder sb = new StringBuilder(str2.length() + 4 + str.length());
        sb.append(str2);
        sb.append(" AS ");
        sb.append(str);
        bju.mo3206a(str, sb.toString());
    }

    /* renamed from: a */
    public final void mo3205a(String[] strArr) {
        for (String str : strArr) {
            this.f3405a.mo3206a(str, str);
        }
    }
}
