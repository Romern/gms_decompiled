package p000;

import android.text.TextUtils;

/* renamed from: gqa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class gqa extends gqk {
    public gqa(String str) {
        super(str);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo12086a(String str) {
        return TextUtils.split(str, ",");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ String mo12088a(Object obj) {
        return TextUtils.join(",", (String[]) obj);
    }
}
