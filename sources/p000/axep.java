package p000;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.walletp2p.internal.zeroparty.ErrorDetails;

/* renamed from: axep */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axep {
    /* renamed from: a */
    public static ErrorDetails m82424a(Context context, bzvu bzvu) {
        String str;
        String str2;
        String str3;
        String str4;
        Uri uri;
        String str5;
        bmxy.m108581a(bzvu);
        if (bzvu.f171557d.size() > 0) {
            str = ((bzvt) bzvu.f171557d.get(0)).f171549a;
        } else {
            str = null;
        }
        if (bzvu.f171557d.size() > 0) {
            str2 = ((bzvt) bzvu.f171557d.get(0)).f171550b;
        } else {
            str2 = null;
        }
        if (TextUtils.isEmpty(bzvu.f171554a)) {
            str3 = context.getResources().getString(C0126R.string.common_something_went_wrong);
        } else {
            str3 = bzvu.f171554a;
        }
        if (!TextUtils.isEmpty(bzvu.f171555b)) {
            str4 = bzvu.f171555b;
        } else {
            str4 = context.getResources().getString(C0126R.string.walletp2p_try_again_soon);
        }
        if (TextUtils.isEmpty(str)) {
            str5 = null;
            uri = null;
        } else if (!TextUtils.isEmpty(str2)) {
            str5 = str;
            uri = Uri.parse(str2);
        } else {
            str5 = null;
            uri = null;
        }
        return new ErrorDetails(str3, str4, str5, uri, bzvu.f171558e.mo73780k(), bzvu.f171559f.mo73780k(), bzvu.f171556c == 7);
    }
}
