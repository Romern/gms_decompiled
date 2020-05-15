package p000;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* renamed from: gqh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class gqh extends gqk {
    public gqh(String str) {
        super(str);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo12086a(String str) {
        return new HashSet(Arrays.asList(TextUtils.split(str, ",")));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ String mo12088a(Object obj) {
        return TextUtils.join(",", (Set) obj);
    }
}
