package p000;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: shc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class shc {

    /* renamed from: a */
    private final ArrayList f44462a = new ArrayList();

    public shc() {
        new HashMap();
    }

    /* renamed from: a */
    public final void mo25530a(String str) {
        this.f44462a.add(str);
    }

    /* renamed from: a */
    public final void mo25531a(StringBuilder sb) {
        shd.m35269a(sb, "prettyPrint", String.valueOf(!sre.m36079a()));
        if (!this.f44462a.isEmpty()) {
            shd.m35269a(sb, "fields", TextUtils.join(",", this.f44462a.toArray()));
        }
    }
}
