package p000;

import android.content.Context;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: uci */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class uci extends uch {

    /* renamed from: f */
    private final List f47242f;

    protected uci(String str, ubk ubk, uto uto, String str2) {
        super(str, ubk, uto);
        this.f47242f = m38115a(str2);
    }

    /* renamed from: a */
    private static List m38115a(String str) {
        if (str != null) {
            return Arrays.asList(str.split("\\s*,\\s*"));
        }
        return Collections.EMPTY_LIST;
    }

    /* renamed from: c */
    public abstract void mo27231c(Context context);

    /* renamed from: d */
    public final void mo27234d(Context context) {
        if (this.f47242f.contains(this.f47241e.f47395b) || this.f47237a.mo27099g()) {
            mo27231c(context);
            return;
        }
        throw new aaaj(10, "App is not whitelisted to make this request.");
    }

    protected uci(String str, ubk ubk, uto uto, String str2, int i) {
        super(str, ubk, uto, i);
        this.f47242f = m38115a(str2);
    }
}
