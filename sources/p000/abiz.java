package p000;

import android.accounts.Account;
import java.util.concurrent.Callable;

/* renamed from: abiz */
final /* synthetic */ class abiz implements Callable {

    /* renamed from: a */
    private final abjd f57566a;

    /* renamed from: b */
    private final bsly f57567b;

    /* renamed from: c */
    private final String f57568c;

    public abiz(abjd abjd, bsly bsly, String str) {
        this.f57566a = abjd;
        this.f57567b = bsly;
        this.f57568c = str;
    }

    public final Object call() {
        abjd abjd = this.f57566a;
        bsly bsly = this.f57567b;
        String str = this.f57568c;
        Account[] a = adyd.m51363a(abjd.f57571a).mo33916a("com.google.android.apps.tachyon");
        int length = a.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i < length) {
                if ("Duo".equals(a[i].name)) {
                    z = true;
                    break;
                }
                i++;
            } else {
                break;
            }
        }
        return z == bsly.f144982a ? abjc.m47783c() : abjc.m47781a(str);
    }
}
