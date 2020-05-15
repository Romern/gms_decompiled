package p000;

import android.text.TextUtils;

/* renamed from: gmr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class gmr implements gmt {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo12048a(gmg gmg) {
        String str = (String) ((gmu) gmg).f18627r.get(mo12066a());
        if (!TextUtils.isEmpty(str)) {
            return mo12065a(sqd.m35971c(str));
        }
        return null;
    }

    /* renamed from: a */
    public abstract Object mo12065a(byte[] bArr);

    /* renamed from: a */
    public abstract String mo12066a();
}
